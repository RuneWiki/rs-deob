import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.com._Guid;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class281 implements IEnumModesCallback {
   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "Lcom/ms/directX/DirectDraw;"
   )
   private DirectDraw field4243 = new DirectDraw();
   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "I"
   )
   private static int field4244;
   @OriginalMember(
      owner = "client!te",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field4245;

   @OriginalMember(
      owner = "client!te",
      name = "<init>",
      descriptor = "()V"
   )
   public class281() {
      this.field4243.initialize((_Guid)null);
   }

   @OriginalMember(
      owner = "client!te",
      name = "callbackEnumModes",
      descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V"
   )
   public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
      if (field4245 == null) {
         field4244 += 4;
      } else {
         field4245[field4244++] = arg0.width;
         field4245[field4244++] = arg0.height;
         field4245[field4244++] = arg0.rgbBitCount;
         field4245[field4244++] = arg0.refreshRate;
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method2354(int arg0) {
      this.field4243.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      field4245 = new int[field4244];
      field4244 = 0;
      this.field4243.enumDisplayModes(arg0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var2 = field4245;
      field4245 = null;
      field4244 = 0;
      return var2;
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(Ljava/awt/Frame;I)V"
   )
   public final void method2355(Frame arg0, int arg1) {
      if (arg1 <= -126) {
         this.field4243.restoreDisplayMode();
         this.field4243.setCooperativeLevel(arg0, 8);
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(Ljava/awt/Frame;IBIII)V"
   )
   public final void method2356(Frame arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
      arg0.setVisible(true);
      WComponentPeer var7 = (WComponentPeer)arg0.getPeer();
      int var8 = -114 % ((63 - arg2) / 47);
      int var9 = var7.getHwnd();
      User32.SetWindowLong(var9, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var9, -20, 8);
      this.field4243.setCooperativeLevel(arg0, 17);
      this.field4243.setDisplayMode(arg3, arg5, arg1, arg4, 0);
      arg0.setBounds(0, 0, arg3, arg5);
      arg0.toFront();
      arg0.requestFocus();
   }
}
