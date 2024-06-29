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

@OriginalClass("client!la")
public class class443 implements IEnumModesCallback {
   @OriginalMember(
      owner = "client!la",
      name = "b",
      descriptor = "Lcom/ms/directX/DirectDraw;"
   )
   private DirectDraw field6012 = new DirectDraw();
   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "I"
   )
   private static int field6014;
   @OriginalMember(
      owner = "client!la",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field6013;

   @OriginalMember(
      owner = "client!la",
      name = "<init>",
      descriptor = "()V"
   )
   public class443() {
      this.field6012.initialize((_Guid)null);
   }

   @OriginalMember(
      owner = "client!la",
      name = "callbackEnumModes",
      descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V"
   )
   public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
      if (field6013 != null) {
         field6013[field6014++] = arg0.width;
         field6013[field6014++] = arg0.height;
         field6013[field6014++] = arg0.rgbBitCount;
         field6013[field6014++] = arg0.refreshRate;
      } else {
         field6014 += 4;
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method3408(int arg0) {
      this.field6012.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      field6013 = new int[field6014];
      if (arg0 != 8) {
         this.callbackEnumModes((DDSurfaceDesc)null, (IUnknown)null);
      }

      field6014 = 0;
      this.field6012.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var2 = field6013;
      field6013 = null;
      field6014 = 0;
      return var2;
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(IIIILjava/awt/Frame;I)V"
   )
   public final void method3409(int arg0, int arg1, int arg2, int arg3, Frame arg4, int arg5) {
      arg4.setVisible(true);
      WComponentPeer var7 = (WComponentPeer)arg4.getPeer();
      int var8 = var7.getHwnd();
      User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var8, -20, 8);
      this.field6012.setCooperativeLevel(arg4, 17);
      this.field6012.setDisplayMode(arg2, arg3, arg1, arg0, 0);
      arg4.setBounds(0, arg5, arg2, arg3);
      arg4.toFront();
      arg4.requestFocus();
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(Ljava/awt/Frame;I)V"
   )
   public final void method3410(Frame arg0, int arg1) {
      this.field6012.restoreDisplayMode();
      if (arg1 != 17) {
         this.method3408(104);
      }

      this.field6012.setCooperativeLevel(arg0, 8);
   }
}
