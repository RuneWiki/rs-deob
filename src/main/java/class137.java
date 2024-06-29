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

@OriginalClass("client!qea")
public class class137 implements IEnumModesCallback {
   @OriginalMember(
      owner = "client!qea",
      name = "b",
      descriptor = "Lcom/ms/directX/DirectDraw;"
   )
   private DirectDraw field1781 = new DirectDraw();
   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "I"
   )
   private static int field1782;
   @OriginalMember(
      owner = "client!qea",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field1780;

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(ILjava/awt/Frame;IIII)V"
   )
   public final void method1145(int arg0, Frame arg1, int arg2, int arg3, int arg4, int arg5) {
      arg1.setVisible(true);
      WComponentPeer var7 = (WComponentPeer)arg1.getPeer();
      int var8 = var7.getHwnd();
      User32.SetWindowLong(var8, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var8, -20, 8);
      this.field1781.setCooperativeLevel(arg1, 17);
      if (arg4 < 53) {
         field1782 = -2;
      }

      this.field1781.setDisplayMode(arg0, arg3, arg2, arg5, 0);
      arg1.setBounds(0, 0, arg0, arg3);
      arg1.toFront();
      arg1.requestFocus();
   }

   @OriginalMember(
      owner = "client!qea",
      name = "callbackEnumModes",
      descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V"
   )
   public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
      if (field1780 == null) {
         field1782 += 4;
      } else {
         field1780[field1782++] = arg0.width;
         field1780[field1782++] = arg0.height;
         field1780[field1782++] = arg0.rgbBitCount;
         field1780[field1782++] = arg0.refreshRate;
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method1146(int arg0) {
      this.field1781.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      field1780 = new int[field1782];
      field1782 = 0;
      this.field1781.enumDisplayModes(arg0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var2 = field1780;
      field1780 = null;
      field1782 = 0;
      return var2;
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(ILjava/awt/Frame;)V"
   )
   public final void method1147(int arg0, Frame arg1) {
      this.field1781.restoreDisplayMode();
      int var3 = 100 % ((arg0 - 19) / 55);
      this.field1781.setCooperativeLevel(arg1, 8);
   }

   @OriginalMember(
      owner = "client!qea",
      name = "<init>",
      descriptor = "()V"
   )
   public class137() {
      this.field1781.initialize((_Guid)null);
   }
}
