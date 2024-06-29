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

@OriginalClass("client!np")
public class class516 implements IEnumModesCallback {
   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "Lcom/ms/directX/DirectDraw;"
   )
   private DirectDraw field7542 = new DirectDraw();
   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "I"
   )
   private static int field7541;
   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "[I"
   )
   private static int[] field7543;

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method3818(int arg0) {
      this.field7542.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      field7543 = new int[field7541];
      field7541 = 0;
      this.field7542.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      if (arg0 != -31073) {
         field7541 = -45;
      }

      int[] var2 = field7543;
      field7541 = 0;
      field7543 = null;
      return var2;
   }

   @OriginalMember(
      owner = "client!np",
      name = "<init>",
      descriptor = "()V"
   )
   public class516() {
      this.field7542.initialize((_Guid)null);
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(Ljava/awt/Frame;I)V"
   )
   public final void method3819(Frame arg0, int arg1) {
      this.field7542.restoreDisplayMode();
      this.field7542.setCooperativeLevel(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!np",
      name = "callbackEnumModes",
      descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V"
   )
   public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
      if (field7543 != null) {
         field7543[field7541++] = arg0.width;
         field7543[field7541++] = arg0.height;
         field7543[field7541++] = arg0.rgbBitCount;
         field7543[field7541++] = arg0.refreshRate;
      } else {
         field7541 += 4;
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(IIIILjava/awt/Frame;B)V"
   )
   public final void method3820(int arg0, int arg1, int arg2, int arg3, Frame arg4, byte arg5) {
      int var7 = -5 / ((74 - arg5) / 38);
      arg4.setVisible(true);
      WComponentPeer var8 = (WComponentPeer)arg4.getPeer();
      int var9 = var8.getHwnd();
      User32.SetWindowLong(var9, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var9, -20, 8);
      this.field7542.setCooperativeLevel(arg4, 17);
      this.field7542.setDisplayMode(arg0, arg2, arg1, arg3, 0);
      arg4.setBounds(0, 0, arg0, arg2);
      arg4.toFront();
      arg4.requestFocus();
   }
}
