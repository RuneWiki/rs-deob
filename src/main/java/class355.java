import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class355 extends class672 {
   @OriginalMember(
      owner = "client!aia",
      name = "p",
      descriptor = "I"
   )
   private int field5442 = 0;
   @OriginalMember(
      owner = "client!aia",
      name = "i",
      descriptor = "Z"
   )
   private boolean field5454 = false;
   @OriginalMember(
      owner = "client!aia",
      name = "l",
      descriptor = "I"
   )
   private int field5463 = 0;
   @OriginalMember(
      owner = "client!aia",
      name = "B",
      descriptor = "I"
   )
   private int field5458 = 0;
   @OriginalMember(
      owner = "client!aia",
      name = "r",
      descriptor = "I"
   )
   private int field5452 = 0;
   @OriginalMember(
      owner = "client!aia",
      name = "f",
      descriptor = "I"
   )
   private int field5469 = 0;
   @OriginalMember(
      owner = "client!aia",
      name = "t",
      descriptor = "Lc;"
   )
   private class652 field5464;
   @OriginalMember(
      owner = "client!aia",
      name = "s",
      descriptor = "Lqk;"
   )
   private class419 field5472;
   @OriginalMember(
      owner = "client!aia",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5474 = new String[]{method2911(method2910("Ro\u0003a\br.")), method2911(method2910("]s\u000e#")), method2911(method2910("Ro\u0003a\u000b\u001b")), method2911(method2910("H(La1")), method2911(method2910("Ro\u0003a\u0007\u001b")), method2911(method2910("Ro\u0003a\u001d\u001b")), method2911(method2910("Ro\u0003a\u0006\u001b")), method2911(method2910("Ro\u0003a\u0003\u001b")), method2911(method2910("Ro\u0003apZh\u000b;r\u001b")), method2911(method2910("Ro\u0003a\u000er.")), method2911(method2910("Ro\u0003a\u001f\u001b")), method2911(method2910("Ro\u0003a\u0019\u001b")), method2911(method2910("Ro\u0003a\t\u001b")), method2911(method2910("Ro\u0003a\u0000\u001b")), method2911(method2910("Ro\u0003a\b\u001b")), method2911(method2910("Ro\u0003a\u000e\u001b")), method2911(method2910("Ro\u0003a\u000f\u001b")), method2911(method2910("Ro\u0003a\r\u001b")), method2911(method2910("Ro\u0003a\rr.")), method2911(method2910("Ro\u0003a\u0018\u001b")), method2911(method2910("Ro\u0003a\u0004\u001b")), method2911(method2910("Ro\u0003a\u0005\u001b")), method2911(method2910("Ro\u0003a\n\u001b"))};
   @OriginalMember(
      owner = "client!aia",
      name = "e",
      descriptor = "Llj;"
   )
   public static class304 field5443 = new class304(8);
   @OriginalMember(
      owner = "client!aia",
      name = "F",
      descriptor = "S"
   )
   public static short field5465 = 1;
   @OriginalMember(
      owner = "client!aia",
      name = "G",
      descriptor = "I"
   )
   public static int field5470 = -1;
   @OriginalMember(
      owner = "client!aia",
      name = "u",
      descriptor = "I"
   )
   public static int field5441;
   @OriginalMember(
      owner = "client!aia",
      name = "d",
      descriptor = "I"
   )
   public static int field5444;
   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "I"
   )
   public static int field5445;
   @OriginalMember(
      owner = "client!aia",
      name = "q",
      descriptor = "I"
   )
   public static int field5446;
   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "I"
   )
   public static int field5447;
   @OriginalMember(
      owner = "client!aia",
      name = "w",
      descriptor = "I"
   )
   public static int field5448;
   @OriginalMember(
      owner = "client!aia",
      name = "g",
      descriptor = "I"
   )
   public static int field5449;
   @OriginalMember(
      owner = "client!aia",
      name = "A",
      descriptor = "I"
   )
   public static int field5450;
   @OriginalMember(
      owner = "client!aia",
      name = "n",
      descriptor = "I"
   )
   public static int field5453;
   @OriginalMember(
      owner = "client!aia",
      name = "C",
      descriptor = "I"
   )
   public static int field5455;
   @OriginalMember(
      owner = "client!aia",
      name = "j",
      descriptor = "I"
   )
   public static int field5456;
   @OriginalMember(
      owner = "client!aia",
      name = "x",
      descriptor = "I"
   )
   public static int field5459;
   @OriginalMember(
      owner = "client!aia",
      name = "y",
      descriptor = "I"
   )
   public static int field5460;
   @OriginalMember(
      owner = "client!aia",
      name = "E",
      descriptor = "I"
   )
   public static int field5461;
   @OriginalMember(
      owner = "client!aia",
      name = "h",
      descriptor = "I"
   )
   public static int field5462;
   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "I"
   )
   public static int field5466;
   @OriginalMember(
      owner = "client!aia",
      name = "D",
      descriptor = "I"
   )
   public static int field5467;
   @OriginalMember(
      owner = "client!aia",
      name = "v",
      descriptor = "I"
   )
   public static int field5468;
   @OriginalMember(
      owner = "client!aia",
      name = "m",
      descriptor = "I"
   )
   public static int field5471;
   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "Lqk;"
   )
   private class419 field5451;
   @OriginalMember(
      owner = "client!aia",
      name = "k",
      descriptor = "Lrr;"
   )
   public static class678 field5473;
   @OriginalMember(
      owner = "client!aia",
      name = "o",
      descriptor = "Lqda;"
   )
   public static class697 field5457;

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "()I",
      line = 3
   )
   public final int method2108() {
      try {
         ++field5460;
         return this.field5472.field6482 - (-this.field5458 - this.field5442);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5474[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "()I",
      line = 12
   )
   public final int method2095() {
      try {
         ++field5462;
         return this.field5472.field6482;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5474[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IILaa;II)V",
      line = 20
   )
   public final void method939(int arg0, int arg1, class96 arg2, int arg3, int arg4) {
      try {
         ++field5461;
         class639 var6 = (class639)arg2;
         class419 var7 = var6.field9251;
         this.field5472.method5760(false, (byte)-107);
         this.field5464.method4802(false);
         this.field5464.method4792(-26367, this.field5472);
         this.field5464.method4765(1, (byte)-3);
         this.field5464.method4787(-126, 1);
         this.field5464.method4792(-26367, var7);
         this.field5464.method4803(7681, 8448, true);
         this.field5464.method4809(768, (byte)-128, 34168, 0);
         this.field5464.method4783(3008, 1);
         int var18 = this.field5452 + arg0;
         int var19 = this.field5458 + arg1;
         int var8 = var18 - -this.field5472.field6485;
         int var9 = this.field5472.field6482 + var19;
         float var10 = var7.field6488 / (float)var7.field6485;
         float var11 = var7.field6487 / (float)var7.field6482;
         float var12 = (float)(-arg3 + var18) * var10;
         float var13 = (float)(-arg3 + var8) * var10;
         float var14 = var7.field6487 - (float)(-arg4 + var19) * var11;
         float var15 = -((float)(-arg4 + var9) * var11) + var7.field6487;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5472.field6487);
         OpenGL.glMultiTexCoord2f(33985, var12, var14);
         OpenGL.glVertex2i(var18, var19);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var12, var15);
         OpenGL.glVertex2i(var18, this.field5472.field6482 + var19);
         OpenGL.glMultiTexCoord2f(33984, this.field5472.field6488, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var13, var15);
         OpenGL.glVertex2i(var18 - -this.field5472.field6485, var19 - -this.field5472.field6482);
         OpenGL.glMultiTexCoord2f(33984, this.field5472.field6488, this.field5472.field6487);
         OpenGL.glMultiTexCoord2f(33985, var13, var14);
         OpenGL.glVertex2i(this.field5472.field6485 + var18, var19);
         OpenGL.glEnd();
         this.field5464.method4809(768, (byte)-128, 5890, 0);
         this.field5464.method4765(0, (byte)-3);
         this.field5464.method4792(-26367, (class799)null);
         this.field5464.method4787(-95, 0);
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field5474[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5474[3] : field5474[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "d",
      descriptor = "()I",
      line = 79
   )
   public final int method2106() {
      try {
         ++field5446;
         return this.field5452 - -this.field5469 + this.field5472.field6485;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5474[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V",
      line = 87
   )
   public final void method2097(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class96 arg7, int arg8, int arg9) {
      try {
         ++field5445;
         class419 var11 = ((class639)arg7).field9251;
         if (this.field5454) {
            float var12 = (float)this.method2106();
            float var13 = (float)this.method2108();
            float var14 = (-arg0 + arg2) / var12;
            float var15 = (-arg1 + arg3) / var12;
            float var16 = (-arg0 + arg4) / var13;
            float var17 = (-arg1 + arg5) / var13;
            float var18 = (float)this.field5458 * var16;
            float var19 = (float)this.field5458 * var17;
            float var20 = (float)this.field5452 * var14;
            float var21 = (float)this.field5452 * var15;
            float var22 = (float)this.field5469 * -var14;
            float var23 = (float)this.field5469 * -var15;
            float var24 = (float)this.field5442 * -var16;
            arg0 = arg0 + var20 + var18;
            float var25 = (float)this.field5442 * -var17;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg5 = arg5 + var21 + var25;
         }

         float var26 = arg2 - arg0 + arg4;
         float var27 = -arg1 + arg5 + arg3;
         this.field5472.method5760(~(arg6 & 1) != -1, (byte)-107);
         this.field5464.method4802(false);
         this.field5464.method4792(-26367, this.field5472);
         this.field5464.method4765(1, (byte)-3);
         this.field5464.method4787(-90, 1);
         this.field5464.method4792(-26367, var11);
         this.field5464.method4803(7681, 8448, true);
         this.field5464.method4809(768, (byte)-128, 34168, 0);
         this.field5464.method4783(3008, 1);
         float var28 = var11.field6488 / (float)var11.field6485;
         float var29 = var11.field6487 / (float)var11.field6482;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field5472.field6487);
         OpenGL.glMultiTexCoord2f(33985, (arg0 - (float)arg8) * var28, -(((float)(-arg9) + arg1) * var29) + var11.field6487);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, (arg4 - (float)arg8) * var28, var11.field6487 - ((float)(-arg9) + arg5) * var29);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glMultiTexCoord2f(33984, this.field5472.field6488, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, (var26 - (float)arg8) * var28, -((var27 - (float)arg9) * var29) + var11.field6487);
         OpenGL.glVertex2f(var26, var27);
         OpenGL.glMultiTexCoord2f(33984, this.field5472.field6488, this.field5472.field6487);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg2) * var28, var11.field6487 - (arg3 - (float)arg9) * var29);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
         this.field5464.method4809(768, (byte)-128, 5890, 0);
         this.field5464.method4765(0, (byte)-3);
         this.field5464.method4792(-26367, (class799)null);
         this.field5464.method4787(-120, 0);
      } catch (RuntimeException var31) {
         throw class482.method3757(var31, field5474[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field5474[3] : field5474[1]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(I)V",
      line = 175
   )
   public static void method2904(int arg0) {
      try {
         field5443 = null;
         if (arg0 >= 70) {
            field5473 = null;
            field5457 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5474[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "(IIII)V",
      line = 187
   )
   public final void method2107(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5469 = arg2;
         ++field5466;
         this.field5442 = arg3;
         this.field5458 = arg1;
         this.field5452 = arg0;
         this.field5454 = this.field5452 != 0 || ~this.field5458 != -1 || this.field5469 != 0 || ~this.field5442 != -1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5474[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(III)V",
      line = 204
   )
   public final void method935(int arg0, int arg1, int arg2) {
      try {
         OpenGL.glPixelTransferf(3348, 0.5F);
         ++field5450;
         OpenGL.glPixelTransferf(3349, 0.499F);
         OpenGL.glPixelTransferf(3352, 0.5F);
         OpenGL.glPixelTransferf(3353, 0.499F);
         OpenGL.glPixelTransferf(3354, 0.5F);
         OpenGL.glPixelTransferf(3355, 0.499F);
         this.field5451 = class723.method5342(this.field5472.field6485, arg1, -97, arg0, this.field5472.field6482, this.field5464);
         this.field5463 = arg2;
         OpenGL.glPixelTransferf(3348, 1.0F);
         OpenGL.glPixelTransferf(3349, 0.0F);
         OpenGL.glPixelTransferf(3352, 1.0F);
         OpenGL.glPixelTransferf(3353, 0.0F);
         OpenGL.glPixelTransferf(3354, 1.0F);
         OpenGL.glPixelTransferf(3355, 0.0F);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5474[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(Lc;IIZ)V",
      line = 817
   )
   public class355(class652 arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field5464 = arg0;
         this.field5472 = class52.method352(arg0, 65280, arg1, !arg3 ? 6407 : 6408, arg2);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5474[8] + (arg0 != null ? field5474[3] : field5474[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(Lc;IIII)V",
      line = 827
   )
   public class355(class652 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field5464 = arg0;
         this.field5472 = class723.method5342(arg3, arg2, -98, arg1, arg4, arg0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5474[8] + (arg0 != null ? field5474[3] : field5474[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(Lc;II[III)V",
      line = 837
   )
   public class355(class652 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      try {
         this.field5464 = arg0;
         this.field5472 = class331.method2697(arg4, false, arg3, arg1, -26853, arg5, arg0, arg2);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5474[8] + (arg0 != null ? field5474[3] : field5474[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5474[3] : field5474[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IIIII)V",
      line = 235
   )
   public final void method938(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field5472.method5760(false, (byte)-107);
         ++field5449;
         this.field5464.method4802(false);
         this.field5464.method4783(3008, arg4);
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         int var9 = this.field5458 + arg1;
         int var8 = this.field5452 + arg0;
         if (this.field5451 != null) {
            this.method2908(34167, arg2);
            this.field5451.method5760(false, (byte)-107);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5472.field6487);
            OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, this.field5472.field6482 + var9);
            OpenGL.glMultiTexCoord2f(33985, this.field5472.field6488, 0.0F);
            OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
            OpenGL.glVertex2i(var8 - -this.field5472.field6485, this.field5472.field6482 + var9);
            OpenGL.glMultiTexCoord2f(33985, this.field5472.field6488, this.field5472.field6487);
            OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
            OpenGL.glVertex2i(this.field5472.field6485 + var8, var9);
            OpenGL.glEnd();
            this.method2905(-2920);
         } else {
            this.field5464.method4792(-26367, this.field5472);
            this.field5464.method4765(arg2, (byte)-3);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, this.field5472.field6482 + var9);
            OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
            OpenGL.glVertex2i(this.field5472.field6485 + var8, this.field5472.field6482 + var9);
            OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
            OpenGL.glVertex2i(this.field5472.field6485 + var8, var9);
            OpenGL.glEnd();
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5474[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(I)V",
      line = 289
   )
   private final void method2905(int arg0) {
      try {
         this.field5464.method4787(-72, 1);
         ++field5459;
         this.field5464.method4792(-26367, (class799)null);
         this.field5464.method4803(8448, 8448, true);
         if (arg0 != -2920) {
            this.method938(-95, 104, -75, 17, -127);
         }

         this.field5464.method4809(768, (byte)-128, 34168, 1);
         this.field5464.method4737(115, 0, 770, 5890);
         this.field5464.method4787(-87, 0);
         this.field5464.method4809(768, (byte)-128, 34168, 1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5474[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IIIBIIII)V",
      line = 307
   )
   public static final void method2906(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         int var8;
         label30: {
            ++field5471;
            var8 = arg1 + -334;
            if (~var8 > -1) {
               var8 = 0;
               if (!client.field1786) {
                  break label30;
               }
            }

            if (~var8 < -101) {
               var8 = 100;
            }
         }

         int var9 = (-class53.field658 + class512.field7822) * var8 / 100 + class53.field658;
         if (arg3 != 96) {
            method2904(-22);
         }

         class591.field8709 = class591.field8708 * var9 >> 8;
         int var17 = arg2 * var9 >> 8;
         int var10 = 16384 - arg7 & 16383;
         int var11 = 16383 & -arg0 + 16384;
         int var12 = 0;
         int var13 = 0;
         int var14 = var17;
         if (var10 != 0) {
            var13 = class83.field1196[var10] * -var17 >> 14;
            var14 = class83.field1194[var10] * var17 >> 14;
         }

         if (var11 != 0) {
            var12 = class83.field1196[var11] * var14 >> 14;
            var14 = class83.field1194[var11] * var14 >> 14;
         }

         class653.field9780 = arg6 - var13;
         class674.field10029 = 0;
         class317.field4895 = arg0;
         class703.field10589 = arg7;
         class691.field10259 = -var14 + arg4;
         class401.field6288 = -var12 + arg5;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field5474[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 361
   )
   public final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         this.field5472.method5760(~(arg7 & 1) != -1, (byte)-107);
         ++field5455;
         this.field5464.method4802(false);
         this.field5464.method4783(3008, arg6);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (!this.field5454) {
            if (this.field5451 != null) {
               this.method2908(34167, arg4);
               this.field5451.method5760(true, (byte)-107);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5472.field6487);
               OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
               OpenGL.glVertex2i(arg0, arg1);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(arg0, arg1 + arg3);
               OpenGL.glMultiTexCoord2f(33985, this.field5472.field6488, 0.0F);
               OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
               OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
               OpenGL.glMultiTexCoord2f(33985, this.field5472.field6488, this.field5472.field6487);
               OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
               OpenGL.glVertex2i(arg0 + arg2, arg1);
               OpenGL.glEnd();
               this.method2905(-2920);
            } else {
               this.field5464.method4792(-26367, this.field5472);
               this.field5464.method4765(arg4, (byte)-3);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
               OpenGL.glVertex2i(arg0, arg1);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(arg0, arg1 + arg3);
               OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
               OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
               OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
               OpenGL.glVertex2i(arg0 + arg2, arg1);
               OpenGL.glEnd();
            }
         } else {
            float var9 = (float)arg2 / (float)this.method2106();
            float var10 = (float)arg3 / (float)this.method2108();
            float var11 = (float)this.field5452 * var9 + (float)arg0;
            float var12 = (float)this.field5458 * var10 + (float)arg1;
            float var13 = (float)this.field5472.field6485 * var9 + var11;
            float var14 = (float)this.field5472.field6482 * var10 + var12;
            if (this.field5451 != null) {
               this.method2908(34167, arg4);
               this.field5451.method5760(true, (byte)-107);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field5472.field6487);
               OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field5472.field6488, 0.0F);
               OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field5472.field6488, this.field5472.field6487);
               OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
               this.method2905(-2920);
            } else {
               this.field5464.method4792(-26367, this.field5472);
               this.field5464.method4765(arg4, (byte)-3);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field5474[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(IIIIIII)V",
      line = 465
   )
   public final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field5444;
         int var9 = arg0 + arg2;
         int var10 = arg1 + arg3;
         this.field5472.method5760(false, (byte)-107);
         this.field5464.method4802(false);
         this.field5464.method4792(-26367, this.field5472);
         this.field5464.method4783(3008, arg6);
         this.field5464.method4765(arg4, (byte)-3);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (this.field5472.field6490 && !this.field5454) {
            float var11 = (float)arg3 * this.field5472.field6487 / (float)this.field5472.field6482;
            float var12 = (float)arg2 * this.field5472.field6488 / (float)this.field5472.field6485;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var11);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var10);
            OpenGL.glTexCoord2f(var12, 0.0F);
            OpenGL.glVertex2i(var9, var10);
            OpenGL.glTexCoord2f(var12, var11);
            OpenGL.glVertex2i(var9, arg1);
            OpenGL.glEnd();
         } else {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef((float)this.field5452, (float)this.field5458, 0.0F);
            int var13 = this.method2106();
            int var14 = this.method2108();
            int var15 = arg1 - -this.field5472.field6482;
            OpenGL.glBegin(7);
            int var16 = arg1;
            int var10000;
            int var17;
            int var10001;
            int var18;
            float var20;
            int var21;
            int var22;
            float var23;
            if (var8) {
               var17 = this.field5472.field6485 + arg0;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                  OpenGL.glVertex2i(var17, arg1);
                  var17 += var13;
                  var18 = arg0 + var13;
               }
            } else {
               if (~var15 < ~var10) {
                  var10000 = arg1;
                  var10001 = var10;
                  if (!var8) {
                     if (arg1 < var10) {
                        var20 = (float)(-var10 + arg1 + this.field5472.field6482) * this.field5472.field6487 / (float)this.field5472.field6482;
                        var21 = this.field5472.field6485 + arg0;
                        var22 = arg0;
                        if (var8) {
                           OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                           OpenGL.glVertex2i(arg0, arg1);
                           OpenGL.glTexCoord2f(0.0F, var20);
                           OpenGL.glVertex2i(arg0, var10);
                           OpenGL.glTexCoord2f(this.field5472.field6488, var20);
                           OpenGL.glVertex2i(var21, var10);
                           OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                           OpenGL.glVertex2i(var21, arg1);
                           var21 += var13;
                           var22 = arg0 + var13;
                        }

                        while(true) {
                           while(var9 >= var21) {
                              OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                              OpenGL.glVertex2i(var22, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(var22, var10);
                              OpenGL.glTexCoord2f(this.field5472.field6488, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                              OpenGL.glVertex2i(var21, var16);
                              var21 += var13;
                              var22 += var13;
                           }

                           var10000 = ~var22;
                           var10001 = ~var9;
                           if (!var8) {
                              if (var10000 > var10001) {
                                 var23 = (float)(-var22 + var9) * this.field5472.field6488 / (float)this.field5472.field6485;
                                 OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(var23, var20);
                                 OpenGL.glVertex2i(var9, var10);
                                 OpenGL.glTexCoord2f(var23, this.field5472.field6487);
                                 OpenGL.glVertex2i(var9, var16);
                              }
                              break;
                           }

                           var22 = var10000 + var10001;
                        }
                     }

                     OpenGL.glEnd();
                     OpenGL.glPopMatrix();
                     return;
                  }
               } else {
                  var10000 = this.field5472.field6485;
                  var10001 = arg0;
               }

               var17 = var10000 + var10001;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                  OpenGL.glVertex2i(var17, arg1);
                  var17 += var13;
                  var18 = arg0 + var13;
               }
            }

            while(true) {
               while(~var9 <= ~var17) {
                  OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                  OpenGL.glVertex2i(var18, var16);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(var18, var15);
                  OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                  OpenGL.glVertex2i(var17, var16);
                  var17 += var13;
                  var18 += var13;
               }

               var10000 = ~var9;
               var10001 = ~var18;
               if (!var8) {
                  if (var10000 < var10001) {
                     float var19 = (float)(var9 - var18) * this.field5472.field6488 / (float)this.field5472.field6485;
                     OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                     OpenGL.glVertex2i(var18, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(var18, var15);
                     OpenGL.glTexCoord2f(var19, 0.0F);
                     OpenGL.glVertex2i(var9, var15);
                     OpenGL.glTexCoord2f(var19, this.field5472.field6487);
                     OpenGL.glVertex2i(var9, var16);
                  }

                  var16 += var14;
                  var15 += var14;
                  if (~var15 < ~var10) {
                     var10000 = var16;
                     var10001 = var10;
                     if (!var8) {
                        if (var16 < var10) {
                           var20 = (float)(-var10 + var16 + this.field5472.field6482) * this.field5472.field6487 / (float)this.field5472.field6482;
                           var21 = this.field5472.field6485 + arg0;
                           var22 = arg0;
                           if (var8) {
                              OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                              OpenGL.glVertex2i(arg0, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(arg0, var10);
                              OpenGL.glTexCoord2f(this.field5472.field6488, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                              OpenGL.glVertex2i(var21, var16);
                              var21 += var13;
                              var22 = arg0 + var13;
                           }

                           while(true) {
                              while(var9 >= var21) {
                                 OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(this.field5472.field6488, var20);
                                 OpenGL.glVertex2i(var21, var10);
                                 OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                                 OpenGL.glVertex2i(var21, var16);
                                 var21 += var13;
                                 var22 += var13;
                              }

                              var10000 = ~var22;
                              var10001 = ~var9;
                              if (!var8) {
                                 if (var10000 > var10001) {
                                    var23 = (float)(-var22 + var9) * this.field5472.field6488 / (float)this.field5472.field6485;
                                    OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                                    OpenGL.glVertex2i(var22, var16);
                                    OpenGL.glTexCoord2f(0.0F, var20);
                                    OpenGL.glVertex2i(var22, var10);
                                    OpenGL.glTexCoord2f(var23, var20);
                                    OpenGL.glVertex2i(var9, var10);
                                    OpenGL.glTexCoord2f(var23, this.field5472.field6487);
                                    OpenGL.glVertex2i(var9, var16);
                                 }
                                 break;
                              }

                              var22 = var10000 + var10001;
                           }
                        }

                        OpenGL.glEnd();
                        OpenGL.glPopMatrix();
                        return;
                     }
                  } else {
                     var10000 = this.field5472.field6485;
                     var10001 = arg0;
                  }

                  var17 = var10000 + var10001;
                  var18 = arg0;
                  if (var8) {
                     OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
                     OpenGL.glVertex2i(arg0, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(arg0, var15);
                     OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
                     OpenGL.glVertex2i(var17, var15);
                     OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
                     OpenGL.glVertex2i(var17, var16);
                     var17 += var13;
                     var18 = arg0 + var13;
                  }
               } else {
                  var18 = var10000 + var10001;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class482.method3757(var25, field5474[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 608
   )
   public final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         label45: {
            if (!this.field5464.field9657) {
               this.field5472.method3190(arg0, arg1, arg5, arg2, (byte)123, arg4, arg3);
               if (!var7) {
                  break label45;
               }
            }

            int[] var8 = this.field5464.method642(arg4, arg5, arg2, arg3);
            if (var8 != null) {
               int var9 = 0;
               if (var7) {
                  var8[var9] = class119.method1087(var8[var9], -16777216);
                  ++var9;
               }

               while(true) {
                  while(var8.length > var9) {
                     var8[var9] = class119.method1087(var8[var9], -16777216);
                     ++var9;
                  }

                  if (!var7) {
                     this.method2907(arg0, arg1, arg2, arg3, var8, 0, arg2);
                     break;
                  }

                  ++var9;
               }
            }
         }

         ++field5456;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field5474[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IIII[III)V",
      line = 638
   )
   private final void method2907(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      try {
         ++field5453;
         this.field5472.method3198(91, arg1, arg2, arg6, arg3, true, arg5, arg0, arg4);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5474[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5474[3] : field5474[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(II)V",
      line = 654
   )
   private final void method2908(int arg0, int arg1) {
      try {
         this.field5464.method4787(-128, 1);
         ++field5448;
         this.field5464.method4792(arg0 ^ -58250, this.field5472);
         this.field5464.method4803(this.field5464.method4743((byte)88, arg1), 7681, true);
         this.field5464.method4809(768, (byte)-128, arg0, 1);
         this.field5464.method4737(108, 0, 770, 34168);
         this.field5464.method4787(arg0 + -34218, 0);
         this.field5464.method4792(-26367, this.field5451);
         this.field5464.method4803(34479, 7681, true);
         this.field5464.method4809(768, (byte)-128, 34166, 1);
         if (this.field5463 == 0) {
            this.field5464.method4775(0.5F, 0.0F, 1.0F, (byte)108, 0.5F);
         } else {
            if (~this.field5463 != -2) {
               if (this.field5463 == 2) {
                  this.field5464.method4775(1.0F, 0.0F, 0.5F, (byte)106, 0.5F);
                  return;
               }

               if (~this.field5463 == -4) {
                  this.field5464.method4775(128.5F, 0.0F, 128.5F, (byte)-61, 128.5F);
                  return;
               }
            } else {
               this.field5464.method4775(0.5F, 0.0F, 0.5F, (byte)116, 1.0F);
            }

         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5474[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "()I",
      line = 688
   )
   public final int method2104() {
      try {
         ++field5468;
         return this.field5472.field6485;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5474[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(FFFFFFIIII)V",
      line = 697
   )
   public final void method2096(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field5441;
         if (this.field5454) {
            float var11 = (float)this.method2106();
            float var12 = (float)this.method2108();
            float var13 = (-arg0 + arg2) / var11;
            float var14 = (-arg1 + arg3) / var11;
            float var15 = (-arg0 + arg4) / var12;
            float var16 = (-arg1 + arg5) / var12;
            float var17 = (float)this.field5458 * var15;
            float var18 = (float)this.field5458 * var16;
            float var19 = (float)this.field5452 * var13;
            float var20 = (float)this.field5452 * var14;
            float var21 = (float)this.field5469 * -var13;
            float var22 = (float)this.field5469 * -var14;
            float var23 = (float)this.field5442 * -var15;
            float var24 = (float)this.field5442 * -var16;
            arg0 = arg0 + var19 + var17;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg1 = arg1 + var20 + var18;
            arg5 = arg5 + var20 + var24;
         }

         float var25 = arg2 - arg0 + arg4;
         float var26 = -arg1 + arg5 + arg3;
         this.field5472.method5760((arg9 & 1) != 0, (byte)-107);
         this.field5464.method4802(false);
         this.field5464.method4792(-26367, this.field5472);
         this.field5464.method4783(3008, arg8);
         this.field5464.method4765(arg6, (byte)-3);
         OpenGL.glColor4ub((byte)(arg7 >> 16), (byte)(arg7 >> 8), (byte)arg7, (byte)(arg7 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field5472.field6487);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glTexCoord2f(this.field5472.field6488, 0.0F);
         OpenGL.glVertex2f(var25, var26);
         OpenGL.glTexCoord2f(this.field5472.field6488, this.field5472.field6487);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
      } catch (RuntimeException var28) {
         throw class482.method3757(var28, field5474[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IIIIIIIIII)Z",
      line = 766
   )
   public static final boolean method2909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field5467;
         if (!class407.method3267(arg0, arg6, arg8, 29310)) {
            return false;
         } else {
            int var12 = class481.field7319[1];
            int var20 = class481.field7319[0];
            int var18 = class481.field7319[2];
            if (!class407.method3267(arg1, arg5, arg7, 29310)) {
               return false;
            } else {
               int var17 = class481.field7319[2];
               int var13 = class481.field7319[1];
               int var19 = class481.field7319[0];
               if (!class407.method3267(arg2, arg4, arg3, 29310)) {
                  return false;
               } else {
                  int var14 = class481.field7319[1];
                  int var15 = class481.field7319[arg9];
                  int var16 = class481.field7319[2];
                  return class230.method1982(var13, var12, arg9 ^ 115, var19, var17, var16, var15, var20, var14, var18);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field5474[22] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "([I)V",
      line = 848
   )
   public final void method2102(int[] arg0) {
      try {
         arg0[2] = this.field5469;
         arg0[3] = this.field5442;
         ++field5447;
         arg0[1] = this.field5458;
         arg0[0] = this.field5452;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5474[7] + (arg0 != null ? field5474[3] : field5474[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2910(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2911(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
