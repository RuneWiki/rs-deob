import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class132 extends class148 {
   @OriginalMember(
      owner = "client!dha",
      name = "C",
      descriptor = "I"
   )
   private int field2134 = 0;
   @OriginalMember(
      owner = "client!dha",
      name = "D",
      descriptor = "I"
   )
   private int field2148 = 0;
   @OriginalMember(
      owner = "client!dha",
      name = "s",
      descriptor = "I"
   )
   private int field2149 = 0;
   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "Z"
   )
   private boolean field2152 = false;
   @OriginalMember(
      owner = "client!dha",
      name = "f",
      descriptor = "I"
   )
   private int field2159 = 0;
   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "I"
   )
   private int field2153 = 0;
   @OriginalMember(
      owner = "client!dha",
      name = "v",
      descriptor = "Laea;"
   )
   private class678 field2145;
   @OriginalMember(
      owner = "client!dha",
      name = "A",
      descriptor = "Lefa;"
   )
   private class436 field2138;
   @OriginalMember(
      owner = "client!dha",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2161 = new String[]{method1364(method1363("X4\u000be\u0017\u0014")), method1364(method1363("X4\u000be\u0015}t")), method1364(method1363("X4\u000be\u001f\u0014")), method1364(method1363("X4\u000be\u001a\u0014")), method1364(method1363("X4\u000be\u0007\u0014")), method1364(method1363("X4\u000be\u0000\u0014")), method1364(method1363("R)\u0006'")), method1364(method1363("GrDe,")), method1364(method1363("X4\u000be\u0002\u0014")), method1364(method1363("X4\u000be\u0018\u0014")), method1364(method1363("X4\u000be\u001d\u0014")), method1364(method1363("X4\u000bemU2\u0003?o\u0014")), method1364(method1363("X4\u000be\u0012\u0014")), method1364(method1363("X4\u000be\u0001\u0014")), method1364(method1363("X4\u000be\u0010\u0014")), method1364(method1363("U:[")), method1364(method1363("X4\u000be\u001b\u0014")), method1364(method1363("X4\u000be\u001c\u0014")), method1364(method1363("X4\u000be\u0013}t")), method1364(method1363("X4\u000be\u0018}t")), method1364(method1363("X4\u000be\u0003\u0014")), method1364(method1363("X4\u000be\u001c}t")), method1364(method1363("X4\u000be\u0019\u0014")), method1364(method1363("X4\u000be\u001a}t")), method1364(method1363("X4\u000be\u0005\u0014"))};
   @OriginalMember(
      owner = "client!dha",
      name = "g",
      descriptor = "Lhha;"
   )
   public static class724 field2158 = new class724(12, 7);
   @OriginalMember(
      owner = "client!dha",
      name = "d",
      descriptor = "I"
   )
   public static int field2131;
   @OriginalMember(
      owner = "client!dha",
      name = "w",
      descriptor = "I"
   )
   public static int field2132;
   @OriginalMember(
      owner = "client!dha",
      name = "u",
      descriptor = "I"
   )
   public static int field2133;
   @OriginalMember(
      owner = "client!dha",
      name = "h",
      descriptor = "I"
   )
   public static int field2135;
   @OriginalMember(
      owner = "client!dha",
      name = "o",
      descriptor = "I"
   )
   public static int field2136;
   @OriginalMember(
      owner = "client!dha",
      name = "n",
      descriptor = "I"
   )
   public static int field2137;
   @OriginalMember(
      owner = "client!dha",
      name = "m",
      descriptor = "I"
   )
   public static int field2139;
   @OriginalMember(
      owner = "client!dha",
      name = "i",
      descriptor = "I"
   )
   public static int field2140;
   @OriginalMember(
      owner = "client!dha",
      name = "k",
      descriptor = "I"
   )
   public static int field2141;
   @OriginalMember(
      owner = "client!dha",
      name = "y",
      descriptor = "I"
   )
   public static int field2142;
   @OriginalMember(
      owner = "client!dha",
      name = "q",
      descriptor = "I"
   )
   public static int field2143;
   @OriginalMember(
      owner = "client!dha",
      name = "e",
      descriptor = "I"
   )
   public static int field2144;
   @OriginalMember(
      owner = "client!dha",
      name = "j",
      descriptor = "I"
   )
   public static int field2146;
   @OriginalMember(
      owner = "client!dha",
      name = "B",
      descriptor = "I"
   )
   public static int field2147;
   @OriginalMember(
      owner = "client!dha",
      name = "r",
      descriptor = "I"
   )
   public static int field2150;
   @OriginalMember(
      owner = "client!dha",
      name = "t",
      descriptor = "I"
   )
   public static int field2151;
   @OriginalMember(
      owner = "client!dha",
      name = "c",
      descriptor = "I"
   )
   public static int field2155;
   @OriginalMember(
      owner = "client!dha",
      name = "p",
      descriptor = "I"
   )
   public static int field2156;
   @OriginalMember(
      owner = "client!dha",
      name = "x",
      descriptor = "I"
   )
   public static int field2157;
   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "I"
   )
   public static int field2160;
   @OriginalMember(
      owner = "client!dha",
      name = "l",
      descriptor = "Lefa;"
   )
   private class436 field2154;

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method1342(int arg0) {
      try {
         ++field2140;
         this.field2145.method4958(1, false);
         this.field2145.method4906(-2, (class719)null);
         this.field2145.method4931(8448, 8448, 0);
         this.field2145.method4909(34168, 768, 1, (byte)-115);
         this.field2145.method4933(770, 5890, 0, true);
         this.field2145.method4958(0, false);
         this.field2145.method4909(34168, 768, 1, (byte)-107);
         if (arg0 <= 29) {
            this.method1359(-12, -32, 114, -89, 26, 101, 38, 59);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2161[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method1343(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field2159 = arg3;
         this.field2148 = arg1;
         ++field2131;
         this.field2149 = arg0;
         this.field2134 = arg2;
         this.field2152 = this.field2149 != 0 || ~this.field2148 != -1 || ~this.field2134 != -1 || this.field2159 != 0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2161[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method1344(int[] arg0) {
      try {
         arg0[3] = this.field2159;
         ++field2142;
         arg0[1] = this.field2148;
         arg0[2] = this.field2134;
         arg0[0] = this.field2149;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2161[19] + (arg0 != null ? field2161[7] : field2161[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method1345(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2139;
         if (class14.field203[arg1]) {
            return true;
         } else if (!class558.field7924.method433(0, arg1)) {
            return false;
         } else {
            int var3 = class558.field7924.method434((byte)-106, arg1);
            if (~var3 == -1) {
               class14.field203[arg1] = true;
               return true;
            } else {
               if (class315.field4719[arg1] == null) {
                  class315.field4719[arg1] = new class91[var3];
               }

               int var4 = 0;
               byte[] var5;
               class91 var6;
               if (var2) {
                  if (class315.field4719[arg1][var4] == null) {
                     var5 = class558.field7924.method460((byte)-11, var4, arg1);
                     if (var5 != null) {
                        var6 = class315.field4719[arg1][var4] = new class91();
                        var6.field1356 = (arg1 << 16) + var4;
                        if (~var5[0] != 0) {
                           throw new IllegalStateException(field2161[15]);
                        }

                        var6.method929((byte)106, new class65(var5));
                        if (var2) {
                           throw new IllegalStateException(field2161[15]);
                        }
                     }
                  }

                  ++var4;
               }

               while(true) {
                  while(var3 > var4) {
                     if (class315.field4719[arg1][var4] == null) {
                        var5 = class558.field7924.method460((byte)-11, var4, arg1);
                        if (var5 != null) {
                           var6 = class315.field4719[arg1][var4] = new class91();
                           var6.field1356 = (arg1 << 16) + var4;
                           if (~var5[0] != 0) {
                              throw new IllegalStateException(field2161[15]);
                           }

                           var6.method929((byte)106, new class65(var5));
                           if (var2) {
                              throw new IllegalStateException(field2161[15]);
                           }
                        }
                     }

                     ++var4;
                  }

                  class14.field203[arg1] = true;
                  int var7 = 72 / ((-42 - arg0) / 56);
                  if (!var2) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2161[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method1346(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         if (this.field2152) {
            float var11 = (float)this.method1351();
            float var12 = (float)this.method1356();
            float var13 = (-arg0 + arg2) / var11;
            float var14 = (-arg1 + arg3) / var11;
            float var15 = (-arg0 + arg4) / var12;
            float var16 = (-arg1 + arg5) / var12;
            float var17 = (float)this.field2148 * var15;
            float var18 = (float)this.field2148 * var16;
            float var19 = (float)this.field2149 * var13;
            float var20 = (float)this.field2149 * var14;
            float var21 = (float)this.field2134 * -var13;
            float var22 = (float)this.field2134 * -var14;
            float var23 = (float)this.field2159 * -var15;
            arg1 = arg1 + var20 + var18;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            float var24 = (float)this.field2159 * -var16;
            arg4 = arg4 + var19 + var23;
            arg0 = arg0 + var19 + var17;
            arg5 = arg5 + var20 + var24;
         }

         ++field2132;
         float var25 = -arg0 + arg2 + arg4;
         this.field2138.method5204(~(arg9 & 1) != -1, -1);
         float var26 = -arg1 + arg5 + arg3;
         this.field2145.method4914(-17734);
         this.field2145.method4906(-2, this.field2138);
         this.field2145.method4965(arg8, (byte)-86);
         this.field2145.method4947(false, arg6);
         OpenGL.glColor4ub((byte)(arg7 >> 16), (byte)(arg7 >> 8), (byte)arg7, (byte)(arg7 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
         OpenGL.glVertex2f(var25, var26);
         OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
      } catch (RuntimeException var28) {
         throw class612.method4503(var28, field2161[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method1347(int arg0, int arg1, class684 arg2, int arg3, int arg4) {
      try {
         ++field2133;
         class61 var6 = (class61)arg2;
         class436 var7 = var6.field869;
         this.field2138.method5204(false, -1);
         this.field2145.method4914(-17734);
         this.field2145.method4906(-2, this.field2138);
         this.field2145.method4947(false, 1);
         this.field2145.method4958(1, false);
         this.field2145.method4906(-2, var7);
         this.field2145.method4931(7681, 8448, 0);
         this.field2145.method4909(34168, 768, 0, (byte)12);
         this.field2145.method4965(1, (byte)-66);
         int var18 = this.field2149 + arg0;
         int var19 = this.field2148 + arg1;
         int var8 = this.field2138.field6383 + var18;
         int var9 = this.field2138.field6378 + var19;
         float var10 = var7.field6385 / (float)var7.field6383;
         float var11 = var7.field6386 / (float)var7.field6378;
         float var12 = (float)(var18 - arg3) * var10;
         float var13 = (float)(-arg3 + var8) * var10;
         float var14 = var7.field6386 - (float)(-arg4 + var19) * var11;
         float var15 = -((float)(-arg4 + var9) * var11) + var7.field6386;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2138.field6386);
         OpenGL.glMultiTexCoord2f(33985, var12, var14);
         OpenGL.glVertex2i(var18, var19);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var12, var15);
         OpenGL.glVertex2i(var18, this.field2138.field6378 + var19);
         OpenGL.glMultiTexCoord2f(33984, this.field2138.field6385, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var13, var15);
         OpenGL.glVertex2i(this.field2138.field6383 + var18, var19 - -this.field2138.field6378);
         OpenGL.glMultiTexCoord2f(33984, this.field2138.field6385, this.field2138.field6386);
         OpenGL.glMultiTexCoord2f(33985, var13, var14);
         OpenGL.glVertex2i(var18 - -this.field2138.field6383, var19);
         OpenGL.glEnd();
         this.field2145.method4909(5890, 768, 0, (byte)-14);
         this.field2145.method4947(false, 0);
         this.field2145.method4906(-2, (class719)null);
         this.field2145.method4958(0, false);
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field2161[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2161[7] : field2161[6]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1348(byte arg0) {
      try {
         field2158 = null;
         if (arg0 != 13) {
            field2158 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2161[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method1349(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class684 arg7, int arg8, int arg9) {
      try {
         ++field2157;
         class436 var11 = ((class61)arg7).field869;
         if (this.field2152) {
            float var12 = (float)this.method1351();
            float var13 = (float)this.method1356();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (-arg0 + arg4) / var13;
            float var17 = (-arg1 + arg5) / var13;
            float var18 = (float)this.field2148 * var16;
            float var19 = (float)this.field2148 * var17;
            float var20 = (float)this.field2149 * var14;
            float var21 = (float)this.field2149 * var15;
            float var22 = (float)this.field2134 * -var14;
            float var23 = (float)this.field2134 * -var15;
            float var24 = (float)this.field2159 * -var16;
            arg4 = arg4 + var20 + var24;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            float var25 = (float)this.field2159 * -var17;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
         }

         float var26 = arg2 - arg0 + arg4;
         float var27 = arg5 - arg1 + arg3;
         this.field2138.method5204((1 & arg6) != 0, -1);
         this.field2145.method4914(-17734);
         this.field2145.method4906(-2, this.field2138);
         this.field2145.method4947(false, 1);
         this.field2145.method4958(1, false);
         this.field2145.method4906(-2, var11);
         this.field2145.method4931(7681, 8448, 0);
         this.field2145.method4909(34168, 768, 0, (byte)-121);
         this.field2145.method4965(1, (byte)-86);
         float var28 = var11.field6385 / (float)var11.field6383;
         float var29 = var11.field6386 / (float)var11.field6378;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field2138.field6386);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg0) * var28, -(((float)(-arg9) + arg1) * var29) + var11.field6386);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, (arg4 - (float)arg8) * var28, var11.field6386 - (arg5 - (float)arg9) * var29);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glMultiTexCoord2f(33984, this.field2138.field6385, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, (var26 - (float)arg8) * var28, -((var27 - (float)arg9) * var29) + var11.field6386);
         OpenGL.glVertex2f(var26, var27);
         OpenGL.glMultiTexCoord2f(33984, this.field2138.field6385, this.field2138.field6386);
         OpenGL.glMultiTexCoord2f(33985, (arg2 - (float)arg8) * var28, var11.field6386 - ((float)(-arg9) + arg3) * var29);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
         this.field2145.method4909(5890, 768, 0, (byte)-117);
         this.field2145.method4947(false, 0);
         this.field2145.method4906(-2, (class719)null);
         this.field2145.method4958(0, false);
      } catch (RuntimeException var31) {
         throw class612.method4503(var31, field2161[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2161[7] : field2161[6]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "c",
      descriptor = "()I"
   )
   public final int method1350() {
      try {
         ++field2150;
         return this.field2138.field6383;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2161[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "()I"
   )
   public final int method1351() {
      try {
         ++field2146;
         return this.field2138.field6383 + this.field2149 + this.field2134;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2161[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field2138.method5204(false, -1);
         ++field2137;
         this.field2145.method4914(-17734);
         this.field2145.method4965(arg4, (byte)-88);
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         int var8 = this.field2149 + arg0;
         int var9 = this.field2148 + arg1;
         if (this.field2154 == null) {
            this.field2145.method4906(-2, this.field2138);
            this.field2145.method4947(false, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, this.field2138.field6378 + var9);
            OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
            OpenGL.glVertex2i(this.field2138.field6383 + var8, this.field2138.field6378 + var9);
            OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
            OpenGL.glVertex2i(this.field2138.field6383 + var8, var9);
            OpenGL.glEnd();
         } else {
            this.method1357(16674, arg2);
            this.field2154.method5204(false, -1);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2138.field6386);
            OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, var9 - -this.field2138.field6378);
            OpenGL.glMultiTexCoord2f(33985, this.field2138.field6385, 0.0F);
            OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
            OpenGL.glVertex2i(var8 - -this.field2138.field6383, this.field2138.field6378 + var9);
            OpenGL.glMultiTexCoord2f(33985, this.field2138.field6385, this.field2138.field6386);
            OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
            OpenGL.glVertex2i(var8 - -this.field2138.field6383, var9);
            OpenGL.glEnd();
            this.method1342(85);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2161[22] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         ++field2136;
         int var9 = arg0 - -arg2;
         this.field2138.method5204(false, -1);
         int var10 = arg1 + arg3;
         this.field2145.method4914(-17734);
         this.field2145.method4906(-2, this.field2138);
         this.field2145.method4965(arg6, (byte)-105);
         this.field2145.method4947(false, arg4);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (this.field2138.field6388 && !this.field2152) {
            float var11 = (float)arg3 * this.field2138.field6386 / (float)this.field2138.field6378;
            float var12 = (float)arg2 * this.field2138.field6385 / (float)this.field2138.field6383;
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
            OpenGL.glTranslatef((float)this.field2149, (float)this.field2148, 0.0F);
            int var13 = this.method1351();
            int var14 = this.method1356();
            int var15 = arg1 - -this.field2138.field6378;
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
               var17 = arg0 - -this.field2138.field6383;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                  OpenGL.glVertex2i(var17, arg1);
                  var18 = var13 + arg0;
                  var17 += var13;
               }
            } else {
               if (var10 < var15) {
                  var10000 = ~var10;
                  var10001 = ~arg1;
                  if (!var8) {
                     if (var10000 < var10001) {
                        var20 = (float)(this.field2138.field6378 + arg1 + -var10) * this.field2138.field6386 / (float)this.field2138.field6378;
                        var21 = this.field2138.field6383 + arg0;
                        var22 = arg0;
                        if (var8) {
                           OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                           OpenGL.glVertex2i(arg0, arg1);
                           OpenGL.glTexCoord2f(0.0F, var20);
                           OpenGL.glVertex2i(arg0, var10);
                           OpenGL.glTexCoord2f(this.field2138.field6385, var20);
                           OpenGL.glVertex2i(var21, var10);
                           OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                           OpenGL.glVertex2i(var21, arg1);
                           var21 += var13;
                           var22 = arg0 + var13;
                        }

                        while(true) {
                           while(var9 >= var21) {
                              OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                              OpenGL.glVertex2i(var22, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(var22, var10);
                              OpenGL.glTexCoord2f(this.field2138.field6385, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                              OpenGL.glVertex2i(var21, var16);
                              var21 += var13;
                              var22 += var13;
                           }

                           if (!var8) {
                              if (var22 < var9) {
                                 var23 = (float)(-var22 + var9) * this.field2138.field6385 / (float)this.field2138.field6383;
                                 OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(var23, var20);
                                 OpenGL.glVertex2i(var9, var10);
                                 OpenGL.glTexCoord2f(var23, this.field2138.field6386);
                                 OpenGL.glVertex2i(var9, var16);
                              }
                              break;
                           }

                           var22 += var9;
                        }
                     }

                     OpenGL.glEnd();
                     OpenGL.glPopMatrix();
                     return;
                  }
               } else {
                  var10000 = arg0;
                  var10001 = -this.field2138.field6383;
               }

               var17 = var10000 - var10001;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                  OpenGL.glVertex2i(var17, arg1);
                  var18 = var13 + arg0;
                  var17 += var13;
               }
            }

            while(true) {
               while(var9 >= var17) {
                  OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                  OpenGL.glVertex2i(var18, var16);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(var18, var15);
                  OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                  OpenGL.glVertex2i(var17, var16);
                  var18 += var13;
                  var17 += var13;
               }

               if (!var8) {
                  if (var18 < var9) {
                     float var19 = (float)(-var18 + var9) * this.field2138.field6385 / (float)this.field2138.field6383;
                     OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                     OpenGL.glVertex2i(var18, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(var18, var15);
                     OpenGL.glTexCoord2f(var19, 0.0F);
                     OpenGL.glVertex2i(var9, var15);
                     OpenGL.glTexCoord2f(var19, this.field2138.field6386);
                     OpenGL.glVertex2i(var9, var16);
                  }

                  var16 += var14;
                  var15 += var14;
                  if (var10 < var15) {
                     var10000 = ~var10;
                     var10001 = ~var16;
                     if (!var8) {
                        if (var10000 < var10001) {
                           var20 = (float)(this.field2138.field6378 + var16 + -var10) * this.field2138.field6386 / (float)this.field2138.field6378;
                           var21 = this.field2138.field6383 + arg0;
                           var22 = arg0;
                           if (var8) {
                              OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                              OpenGL.glVertex2i(arg0, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(arg0, var10);
                              OpenGL.glTexCoord2f(this.field2138.field6385, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                              OpenGL.glVertex2i(var21, var16);
                              var21 += var13;
                              var22 = arg0 + var13;
                           }

                           while(true) {
                              while(var9 >= var21) {
                                 OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(this.field2138.field6385, var20);
                                 OpenGL.glVertex2i(var21, var10);
                                 OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                                 OpenGL.glVertex2i(var21, var16);
                                 var21 += var13;
                                 var22 += var13;
                              }

                              if (!var8) {
                                 if (var22 < var9) {
                                    var23 = (float)(-var22 + var9) * this.field2138.field6385 / (float)this.field2138.field6383;
                                    OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                                    OpenGL.glVertex2i(var22, var16);
                                    OpenGL.glTexCoord2f(0.0F, var20);
                                    OpenGL.glVertex2i(var22, var10);
                                    OpenGL.glTexCoord2f(var23, var20);
                                    OpenGL.glVertex2i(var9, var10);
                                    OpenGL.glTexCoord2f(var23, this.field2138.field6386);
                                    OpenGL.glVertex2i(var9, var16);
                                 }
                                 break;
                              }

                              var22 += var9;
                           }
                        }

                        OpenGL.glEnd();
                        OpenGL.glPopMatrix();
                        return;
                     }
                  } else {
                     var10000 = arg0;
                     var10001 = -this.field2138.field6383;
                  }

                  var17 = var10000 - var10001;
                  var18 = arg0;
                  if (var8) {
                     OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
                     OpenGL.glVertex2i(arg0, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(arg0, var15);
                     OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
                     OpenGL.glVertex2i(var17, var15);
                     OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
                     OpenGL.glVertex2i(var17, var16);
                     var18 = var13 + arg0;
                     var17 += var13;
                  }
               } else {
                  var17 = var18 + var9;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field2161[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "()I"
   )
   public final int method1354() {
      try {
         ++field2160;
         return this.field2138.field6378;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2161[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Llw;B)V"
   )
   public static final void method1355(class408 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dha",
      name = "d",
      descriptor = "()I"
   )
   public final int method1356() {
      try {
         ++field2156;
         return this.field2138.field6378 + this.field2148 + this.field2159;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2161[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "c",
      descriptor = "(II)V"
   )
   private final void method1357(int arg0, int arg1) {
      try {
         this.field2145.method4958(1, false);
         ++field2135;
         this.field2145.method4906(-2, this.field2138);
         this.field2145.method4931(this.field2145.method4938(117, arg1), 7681, arg0 + -16674);
         this.field2145.method4909(34167, 768, 1, (byte)91);
         this.field2145.method4933(770, 34168, 0, true);
         this.field2145.method4958(0, false);
         this.field2145.method4906(-2, this.field2154);
         if (arg0 != 16674) {
            this.method1356();
         }

         this.field2145.method4931(34479, 7681, 0);
         this.field2145.method4909(34166, 768, 1, (byte)101);
         if (~this.field2153 == -1) {
            this.field2145.method4921(1.0F, 0.5F, (byte)61, 0.5F, 0.0F);
         } else if (this.field2153 == 1) {
            this.field2145.method4921(0.5F, 0.5F, (byte)44, 1.0F, 0.0F);
         } else if (this.field2153 == 2) {
            this.field2145.method4921(0.5F, 1.0F, (byte)18, 0.5F, 0.0F);
         } else if (~this.field2153 == -4) {
            this.field2145.method4921(128.5F, 128.5F, (byte)92, 128.5F, 0.0F);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2161[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1358(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         this.field2138.method5204((1 & arg7) != 0, -1);
         ++field2147;
         this.field2145.method4914(-17734);
         this.field2145.method4965(arg6, (byte)-109);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (!this.field2152) {
            if (this.field2154 == null) {
               this.field2145.method4906(-2, this.field2138);
               this.field2145.method4947(false, arg4);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
               OpenGL.glVertex2i(arg0, arg1);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(arg0, arg1 + arg3);
               OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
               OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
               OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
               OpenGL.glVertex2i(arg0 + arg2, arg1);
               OpenGL.glEnd();
            } else {
               this.method1357(16674, arg4);
               this.field2154.method5204(true, -1);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2138.field6386);
               OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
               OpenGL.glVertex2i(arg0, arg1);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(arg0, arg1 + arg3);
               OpenGL.glMultiTexCoord2f(33985, this.field2138.field6385, 0.0F);
               OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
               OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
               OpenGL.glMultiTexCoord2f(33985, this.field2138.field6385, this.field2138.field6386);
               OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
               OpenGL.glVertex2i(arg0 + arg2, arg1);
               OpenGL.glEnd();
               this.method1342(107);
            }
         } else {
            float var9 = (float)arg2 / (float)this.method1351();
            float var10 = (float)arg3 / (float)this.method1356();
            float var11 = (float)this.field2149 * var9 + (float)arg0;
            float var12 = (float)this.field2148 * var10 + (float)arg1;
            float var13 = (float)this.field2138.field6383 * var9 + var11;
            float var14 = (float)this.field2138.field6378 * var10 + var12;
            if (this.field2154 != null) {
               this.method1357(16674, arg4);
               this.field2154.method5204(true, -1);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field2138.field6386);
               OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field2138.field6385, 0.0F);
               OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field2138.field6385, this.field2138.field6386);
               OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
               this.method1342(48);
            } else {
               this.field2145.method4906(-2, this.field2138);
               this.field2145.method4947(false, arg4);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field2138.field6386);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glTexCoord2f(this.field2138.field6385, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glTexCoord2f(this.field2138.field6385, this.field2138.field6386);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field2161[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1360(int arg0, int arg1, int arg2) {
      try {
         ++field2143;
         OpenGL.glPixelTransferf(3348, 0.5F);
         OpenGL.glPixelTransferf(3349, 0.499F);
         OpenGL.glPixelTransferf(3352, 0.5F);
         OpenGL.glPixelTransferf(3353, 0.499F);
         OpenGL.glPixelTransferf(3354, 0.5F);
         OpenGL.glPixelTransferf(3355, 0.499F);
         this.field2154 = class482.method3681(true, arg1, this.field2145, this.field2138.field6378, arg0, this.field2138.field6383);
         this.field2153 = arg2;
         OpenGL.glPixelTransferf(3348, 1.0F);
         OpenGL.glPixelTransferf(3349, 0.0F);
         OpenGL.glPixelTransferf(3352, 1.0F);
         OpenGL.glPixelTransferf(3353, 0.0F);
         OpenGL.glPixelTransferf(3354, 1.0F);
         OpenGL.glPixelTransferf(3355, 0.0F);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2161[21] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         label45: {
            if (!this.field2145.field9769) {
               this.field2138.method66(arg2, arg3, arg5, -1, arg4, arg1, arg0);
               if (!var7) {
                  break label45;
               }
            }

            int[] var8 = this.field2145.method202(arg4, arg5, arg2, arg3);
            if (var8 != null) {
               int var9 = 0;
               if (var7) {
                  var8[var9] = class91.method932(var8[var9], -16777216);
                  ++var9;
               }

               while(true) {
                  while(var9 < var8.length) {
                     var8[var9] = class91.method932(var8[var9], -16777216);
                     ++var9;
                  }

                  if (!var7) {
                     this.method1362(arg0, arg1, arg2, arg3, var8, 0, arg2);
                     break;
                  }

                  ++var9;
               }
            }
         }

         ++field2155;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field2161[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   private final void method1362(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      try {
         ++field2151;
         this.field2138.method64(arg5, arg6, arg4, arg1, arg3, -104, arg0, true, arg2);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2161[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2161[7] : field2161[6]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "(Laea;IIZ)V"
   )
   public class132(class678 arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field2145 = arg0;
         this.field2138 = class4.method23(arg1, arg2, (byte)-122, arg0, arg3 ? 6408 : 6407);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2161[11] + (arg0 != null ? field2161[7] : field2161[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "(Laea;IIII)V"
   )
   public class132(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field2145 = arg0;
         this.field2138 = class482.method3681(true, arg2, arg0, arg4, arg1, arg3);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2161[11] + (arg0 != null ? field2161[7] : field2161[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "(Laea;II[III)V"
   )
   public class132(class678 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      try {
         this.field2145 = arg0;
         this.field2138 = class536.method3998(arg3, arg1, false, arg2, arg5, arg0, arg4, (byte)-109);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field2161[11] + (arg0 != null ? field2161[7] : field2161[6]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2161[7] : field2161[6]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1363(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1364(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
