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

@OriginalClass("client!ta")
public class class222 implements IEnumModesCallback {
   @OriginalMember(
      owner = "client!ta",
      name = "b",
      descriptor = "Lcom/ms/directX/DirectDraw;"
   )
   private DirectDraw field3322 = new DirectDraw();
   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "I"
   )
   private static int field3321;
   @OriginalMember(
      owner = "client!ta",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field3323;

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(ILjava/awt/Frame;IIII)V"
   )
   public final void method1866(int arg0, Frame arg1, int arg2, int arg3, int arg4, int arg5) {
      arg1.setVisible(true);
      WComponentPeer var7 = (WComponentPeer)arg1.getPeer();
      int var8 = -66 % ((arg5 - -64) / 36);
      int var9 = var7.getHwnd();
      User32.SetWindowLong(var9, -16, Integer.MIN_VALUE);
      User32.SetWindowLong(var9, -20, 8);
      this.field3322.setCooperativeLevel(arg1, 17);
      this.field3322.setDisplayMode(arg2, arg3, arg0, arg4, 0);
      arg1.setBounds(0, 0, arg2, arg3);
      arg1.toFront();
      arg1.requestFocus();
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(ZLjava/awt/Frame;)V"
   )
   public final void method1867(boolean arg0, Frame arg1) {
      this.field3322.restoreDisplayMode();
      if (arg0) {
         this.field3322.setCooperativeLevel(arg1, 8);
      }
   }

   @OriginalMember(
      owner = "client!ta",
      name = "<init>",
      descriptor = "()V"
   )
   public class222() {
      this.field3322.initialize((_Guid)null);
   }

   @OriginalMember(
      owner = "client!ta",
      name = "a",
      descriptor = "(I)[I"
   )
   public final int[] method1868(int arg0) {
      int var2 = -13 % ((8 - arg0) / 39);
      this.field3322.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      field3323 = new int[field3321];
      field3321 = 0;
      this.field3322.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, this);
      int[] var3 = field3323;
      field3321 = 0;
      field3323 = null;
      return var3;
   }

   @OriginalMember(
      owner = "client!ta",
      name = "callbackEnumModes",
      descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V"
   )
   public final void callbackEnumModes(DDSurfaceDesc arg0, IUnknown arg1) {
      if (field3323 != null) {
         field3323[field3321++] = arg0.width;
         field3323[field3321++] = arg0.height;
         field3323[field3321++] = arg0.rgbBitCount;
         field3323[field3321++] = arg0.refreshRate;
      } else {
         field3321 += 4;
      }
   }
}
