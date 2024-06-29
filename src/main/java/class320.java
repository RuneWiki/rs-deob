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

@OriginalClass("client!caa")
public class class320 implements IEnumModesCallback {
   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "Lcom/ms/directX/DirectDraw;"
   )
   private DirectDraw field4378 = new DirectDraw();
   @OriginalMember(
      owner = "client!caa",
      name = "c",
      descriptor = "I"
   )
   private static int field4377;
   @OriginalMember(
      owner = "client!caa",
      name = "b",
      descriptor = "[I"
   )
   private static int[] field4379;

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(ILjava/awt/Frame;IIII)V"
   )
   public final void method2371(int arg0, Frame arg1, int arg2, int arg3, int arg4, int arg5) {
      arg1.setVisible(true);
      WComponentPeer var7 = (WComponentPeer)arg1.getPeer();
      int var8 = var7.getHwnd();
      User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var8, -20, 8);
      this.field4378.setCooperativeLevel(arg1, 17);
      this.field4378.setDisplayMode(arg4, arg5, arg2, arg0, 0);
      arg1.setBounds(arg3, 0, arg4, arg5);
      arg1.toFront();
      arg1.requestFocus();
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(Ljava/awt/Frame;B)V"
   )
   public final void method2372(Frame arg0, byte arg1) {
      int var3 = 24 / ((46 - arg1) / 57);
      this.field4378.restoreDisplayMode();
      this.field4378.setCooperativeLevel(arg0, 8);
   }

   @OriginalMember(
      owner = "client!caa",
      name = "callbackEnumModes",
      descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V"
   )
   public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
      if (field4379 != null) {
         field4379[field4377++] = arg0.width;
         field4379[field4377++] = arg0.height;
         field4379[field4377++] = arg0.rgbBitCount;
         field4379[field4377++] = arg0.refreshRate;
      } else {
         field4377 += 4;
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "<init>",
      descriptor = "()V"
   )
   public class320() {
      this.field4378.initialize((_Guid)null);
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(B)[I"
   )
   public final int[] method2373(byte arg0) {
      this.field4378.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      field4379 = new int[field4377];
      field4377 = 0;
      this.field4378.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var2 = field4379;
      if (arg0 != -1) {
         this.method2372((Frame)null, (byte)21);
      }

      field4377 = 0;
      field4379 = null;
      return var2;
   }
}
