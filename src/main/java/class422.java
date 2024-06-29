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

@OriginalClass("client!at")
public class class422 implements IEnumModesCallback {
   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "Lcom/ms/directX/DirectDraw;"
   )
   private DirectDraw field6509 = new DirectDraw();
   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "I"
   )
   private static int field6510;
   @OriginalMember(
      owner = "client!at",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field6508;

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(BLjava/awt/Frame;)V",
      line = 3
   )
   public final void method3350(byte arg0, Frame arg1) {
      this.field6509.restoreDisplayMode();
      int var3 = 36 % ((arg0 - -62) / 60);
      this.field6509.setCooperativeLevel(arg1, 8);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(B)[I",
      line = 14
   )
   public final int[] method3351(byte arg0) {
      if (arg0 != 26) {
         this.method3350((byte)79, (Frame)null);
      }

      this.field6509.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      field6508 = new int[field6510];
      field6510 = 0;
      this.field6509.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var2 = field6508;
      field6510 = 0;
      field6508 = null;
      return var2;
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IIIIILjava/awt/Frame;)V",
      line = 32
   )
   public final void method3352(int arg0, int arg1, int arg2, int arg3, int arg4, Frame arg5) {
      arg5.setVisible(true);
      if (arg1 != -8745) {
         this.method3351((byte)46);
      }

      WComponentPeer var7 = (WComponentPeer)arg5.getPeer();
      int var8 = var7.getHwnd();
      User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var8, -20, 8);
      this.field6509.setCooperativeLevel(arg5, 17);
      this.field6509.setDisplayMode(arg3, arg2, arg0, arg4, 0);
      arg5.setBounds(0, 0, arg3, arg2);
      arg5.toFront();
      arg5.requestFocus();
   }

   @OriginalMember(
      owner = "client!at",
      name = "callbackEnumModes",
      descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V",
      line = 54
   )
   public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
      if (field6508 == null) {
         field6510 += 4;
      } else {
         field6508[field6510++] = arg0.width;
         field6508[field6510++] = arg0.height;
         field6508[field6510++] = arg0.rgbBitCount;
         field6508[field6510++] = arg0.refreshRate;
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "<init>",
      descriptor = "()V",
      line = 69
   )
   public class422() {
      this.field6509.initialize((_Guid)null);
   }
}
