import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class637 extends class476 {
   @OriginalMember(
      owner = "client!cia",
      name = "l",
      descriptor = "I"
   )
   private int field9276 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "m",
      descriptor = "I"
   )
   private int field9278 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "d",
      descriptor = "I"
   )
   private int field9274 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "E",
      descriptor = "I"
   )
   private int field9279 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "D",
      descriptor = "I"
   )
   private int field9288 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "C",
      descriptor = "Z"
   )
   private boolean field9302 = false;
   @OriginalMember(
      owner = "client!cia",
      name = "q",
      descriptor = "Lrk;"
   )
   private class35 field9287;
   @OriginalMember(
      owner = "client!cia",
      name = "h",
      descriptor = "Lpe;"
   )
   private class633 field9296;
   @OriginalMember(
      owner = "client!cia",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9305 = new String[]{method4673(method4672("\r6\u0014)AF")), method4673(method4672("\r6\u0014)^F")), method4673(method4672("\u0000*\u0019k")), method4673(method4672("\u0015q[)w")), method4673(method4672("\r6\u0014)DF")), method4673(method4672("\r6\u0014)GF")), method4673(method4672("\r6\u0014)NF")), method4673(method4672("\r6\u0014)OF")), method4673(method4672("\r6\u0014)A/w")), method4673(method4672("\r6\u0014)CF")), method4673(method4672("\r6\u0014)6\u00071\u001cs4F")), method4673(method4672("\r6\u0014)L/w")), method4673(method4672("\r6\u0014)_F")), method4673(method4672("\r6\u0014)HF")), method4673(method4672("\r6\u0014)H/w")), method4673(method4672("\r6\u0014)IF")), method4673(method4672("\r6\u0014)ZF")), method4673(method4672("\r6\u0014)\\F")), method4673(method4672("\r6\u0014)KF")), method4673(method4672("\r6\u0014)FF")), method4673(method4672("\r6\u0014)K/w")), method4673(method4672("\r6\u0014)N/w")), method4673(method4672("\r6\u0014)XF")), method4673(method4672("\r6\u0014)LF"))};
   @OriginalMember(
      owner = "client!cia",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field9283 = new int[6];
   @OriginalMember(
      owner = "client!cia",
      name = "t",
      descriptor = "I"
   )
   public static int field9273;
   @OriginalMember(
      owner = "client!cia",
      name = "F",
      descriptor = "I"
   )
   public static int field9275;
   @OriginalMember(
      owner = "client!cia",
      name = "p",
      descriptor = "I"
   )
   public static int field9277;
   @OriginalMember(
      owner = "client!cia",
      name = "i",
      descriptor = "I"
   )
   public static int field9280;
   @OriginalMember(
      owner = "client!cia",
      name = "o",
      descriptor = "I"
   )
   public static int field9281;
   @OriginalMember(
      owner = "client!cia",
      name = "j",
      descriptor = "I"
   )
   public static int field9282;
   @OriginalMember(
      owner = "client!cia",
      name = "x",
      descriptor = "I"
   )
   public static int field9284;
   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "I"
   )
   public static int field9285;
   @OriginalMember(
      owner = "client!cia",
      name = "u",
      descriptor = "I"
   )
   public static int field9286;
   @OriginalMember(
      owner = "client!cia",
      name = "B",
      descriptor = "I"
   )
   public static int field9290;
   @OriginalMember(
      owner = "client!cia",
      name = "n",
      descriptor = "I"
   )
   public static int field9291;
   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "I"
   )
   public static int field9292;
   @OriginalMember(
      owner = "client!cia",
      name = "k",
      descriptor = "I"
   )
   public static int field9293;
   @OriginalMember(
      owner = "client!cia",
      name = "A",
      descriptor = "I"
   )
   public static int field9294;
   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "I"
   )
   public static int field9295;
   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "I"
   )
   public static int field9297;
   @OriginalMember(
      owner = "client!cia",
      name = "f",
      descriptor = "I"
   )
   public static int field9298;
   @OriginalMember(
      owner = "client!cia",
      name = "e",
      descriptor = "I"
   )
   public static int field9299;
   @OriginalMember(
      owner = "client!cia",
      name = "v",
      descriptor = "I"
   )
   public static int field9300;
   @OriginalMember(
      owner = "client!cia",
      name = "s",
      descriptor = "I"
   )
   public static int field9301;
   @OriginalMember(
      owner = "client!cia",
      name = "r",
      descriptor = "I"
   )
   public static int field9303;
   @OriginalMember(
      owner = "client!cia",
      name = "y",
      descriptor = "I"
   )
   public static int field9304;
   @OriginalMember(
      owner = "client!cia",
      name = "g",
      descriptor = "Lpe;"
   )
   private class633 field9289;

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(ILaf;)V",
      line = 6
   )
   public static final void method4665(int arg0, class457 arg1) {
      try {
         ++field9291;
         if (arg0 != 768) {
            field9283 = null;
         }

         class618 var2 = (class618)class638.field9308.method1572((long)arg1.field11306, -16289);
         if (var2 == null) {
            class132.method1261(arg1.field4090, arg1.field11322[0], false, arg1.field11313[0], (class451)null, arg1, 0, (class670)null);
         } else {
            var2.method4529(15781);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9305[16] + arg0 + ',' + (arg1 != null ? field9305[3] : field9305[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(I)V",
      line = 28
   )
   private final void method4666(int arg0) {
      try {
         ++field9273;
         this.field9287.method259(32, 1);
         this.field9287.method252((class707)null, (byte)-47);
         this.field9287.method314(8448, 5, 8448);
         this.field9287.method262(1, 768, 8960, 34168);
         this.field9287.method387(0, 34184, 5890, 770);
         if (arg0 >= 25) {
            this.field9287.method259(32, 0);
            this.field9287.method262(1, 768, 8960, 34168);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9305[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "()I",
      line = 45
   )
   public final int method3002() {
      try {
         ++field9295;
         return this.field9296.field9232;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9305[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IB)V",
      line = 53
   )
   public static final void method4667(int arg0, byte arg1) {
      try {
         ++field9284;
         class475.field6939 = arg0;
         class743.field10700 = 2;
         String var2 = null;
         if (class780.field11425 != null) {
            class473 var3 = new class473(class780.field11425);
            var2 = class166.method1512(true, var3.method3523(-127));
            class749.field10797 = var3.method3523(-104);
         }

         if (var2 == null) {
            class359.method2826((byte)-108, 35);
         } else {
            if (arg1 != 15) {
               field9275 = 87;
            }

            class672.method4915("", (byte)-113, false, true, var2);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9305[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(ZI[B)I",
      line = 83
   )
   public static final int method4668(boolean arg0, int arg1, byte[] arg2) {
      try {
         if (arg0) {
            return 122;
         } else {
            ++field9290;
            return class151.method1408(0, arg1, true, arg2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9305[17] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9305[3] : field9305[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "()I",
      line = 95
   )
   public final int method3000() {
      try {
         ++field9281;
         return this.field9278 + this.field9274 + this.field9296.field9235;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9305[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Lrk;IIZ)V",
      line = 731
   )
   public class637(class35 arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field9287 = arg0;
         this.field9296 = class366.method2860(!arg3 ? 6407 : 6408, arg2, arg0, 34037, arg1);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9305[10] + (arg0 != null ? field9305[3] : field9305[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Lrk;IIII)V",
      line = 741
   )
   public class637(class35 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field9287 = arg0;
         this.field9296 = class259.method2079(arg0, arg3, -24381, arg2, arg4, arg1);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9305[10] + (arg0 != null ? field9305[3] : field9305[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Lrk;II[III)V",
      line = 752
   )
   public class637(class35 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      try {
         this.field9287 = arg0;
         this.field9296 = class581.method4279(arg5, false, arg0, arg1, arg2, arg3, false, arg4);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9305[10] + (arg0 != null ? field9305[3] : field9305[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9305[3] : field9305[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIII[III)V",
      line = 109
   )
   private final void method4669(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      try {
         this.field9296.method2193(arg6, arg0, 0, arg3, true, arg4, arg2, arg5, arg1);
         ++field9286;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field9305[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9305[3] : field9305[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IILaa;II)V",
      line = 119
   )
   public final void method1059(int arg0, int arg1, class510 arg2, int arg3, int arg4) {
      try {
         ++field9299;
         class560 var6 = (class560)arg2;
         class633 var7 = var6.field8145;
         this.field9296.method5132(false, 0);
         this.field9287.method430(2);
         this.field9287.method252(this.field9296, (byte)-79);
         this.field9287.method322(-39, 1);
         this.field9287.method259(32, 1);
         this.field9287.method252(var7, (byte)-96);
         this.field9287.method314(7681, 123, 8448);
         this.field9287.method262(0, 768, 8960, 34168);
         this.field9287.method288(-3, 1);
         int var19 = this.field9274 + arg1;
         int var18 = this.field9279 + arg0;
         int var8 = this.field9296.field9232 + var18;
         int var9 = this.field9296.field9235 + var19;
         float var10 = var7.field9233 / (float)var7.field9232;
         float var11 = var7.field9234 / (float)var7.field9235;
         float var12 = (float)(var18 - arg3) * var10;
         float var13 = (float)(-arg3 + var8) * var10;
         float var14 = var7.field9234 - (float)(-arg4 + var19) * var11;
         float var15 = -((float)(-arg4 + var9) * var11) + var7.field9234;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9296.field9234);
         OpenGL.glMultiTexCoord2f(33985, var12, var14);
         OpenGL.glVertex2i(var18, var19);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var12, var15);
         OpenGL.glVertex2i(var18, this.field9296.field9235 + var19);
         OpenGL.glMultiTexCoord2f(33984, this.field9296.field9233, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var13, var15);
         OpenGL.glVertex2i(this.field9296.field9232 + var18, this.field9296.field9235 + var19);
         OpenGL.glMultiTexCoord2f(33984, this.field9296.field9233, this.field9296.field9234);
         OpenGL.glMultiTexCoord2f(33985, var13, var14);
         OpenGL.glVertex2i(this.field9296.field9232 + var18, var19);
         OpenGL.glEnd();
         this.field9287.method262(0, 768, 8960, 5890);
         this.field9287.method322(-57, 0);
         this.field9287.method252((class707)null, (byte)-106);
         this.field9287.method259(32, 0);
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field9305[21] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9305[3] : field9305[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 186
   )
   public final void method3007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field9297;
         int var9 = arg0 + arg2;
         this.field9296.method5132(false, 0);
         int var10 = arg1 + arg3;
         this.field9287.method430(2);
         this.field9287.method252(this.field9296, (byte)-34);
         this.field9287.method288(-3, arg6);
         this.field9287.method322(-51, arg4);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (this.field9296.field9230 && !this.field9302) {
            float var11 = (float)arg3 * this.field9296.field9234 / (float)this.field9296.field9235;
            float var12 = (float)arg2 * this.field9296.field9233 / (float)this.field9296.field9232;
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
            OpenGL.glTranslatef((float)this.field9279, (float)this.field9274, 0.0F);
            int var13 = this.method3009();
            int var14 = this.method3000();
            int var15 = arg1 - -this.field9296.field9235;
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
               var17 = arg0 + this.field9296.field9232;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                  OpenGL.glVertex2i(var17, arg1);
                  var17 += var13;
                  var18 = arg0 + var13;
               }
            } else {
               if (var15 > var10) {
                  var10000 = ~var10;
                  var10001 = ~arg1;
                  if (!var8) {
                     if (var10000 < var10001) {
                        var20 = (float)(this.field9296.field9235 + arg1 + -var10) * this.field9296.field9234 / (float)this.field9296.field9235;
                        var21 = this.field9296.field9232 + arg0;
                        var22 = arg0;
                        if (var8) {
                           OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                           OpenGL.glVertex2i(arg0, arg1);
                           OpenGL.glTexCoord2f(0.0F, var20);
                           OpenGL.glVertex2i(arg0, var10);
                           OpenGL.glTexCoord2f(this.field9296.field9233, var20);
                           OpenGL.glVertex2i(var21, var10);
                           OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                           OpenGL.glVertex2i(var21, arg1);
                           var22 = var13 + arg0;
                           var21 += var13;
                        }

                        while(true) {
                           while(~var21 >= ~var9) {
                              OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                              OpenGL.glVertex2i(var22, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(var22, var10);
                              OpenGL.glTexCoord2f(this.field9296.field9233, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                              OpenGL.glVertex2i(var21, var16);
                              var22 += var13;
                              var21 += var13;
                           }

                           var10000 = ~var22;
                           var10001 = ~var9;
                           if (!var8) {
                              if (var10000 > var10001) {
                                 var23 = (float)(-var22 + var9) * this.field9296.field9233 / (float)this.field9296.field9232;
                                 OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(var23, var20);
                                 OpenGL.glVertex2i(var9, var10);
                                 OpenGL.glTexCoord2f(var23, this.field9296.field9234);
                                 OpenGL.glVertex2i(var9, var16);
                              }
                              break;
                           }

                           var21 = var10000 + var10001;
                        }
                     }

                     OpenGL.glEnd();
                     OpenGL.glPopMatrix();
                     return;
                  }
               } else {
                  var10000 = arg0;
                  var10001 = this.field9296.field9232;
               }

               var17 = var10000 + var10001;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                  OpenGL.glVertex2i(var17, arg1);
                  var17 += var13;
                  var18 = arg0 + var13;
               }
            }

            while(true) {
               while(var9 >= var17) {
                  OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                  OpenGL.glVertex2i(var18, var16);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(var18, var15);
                  OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                  OpenGL.glVertex2i(var17, var16);
                  var17 += var13;
                  var18 += var13;
               }

               if (!var8) {
                  if (var18 < var9) {
                     float var19 = (float)(var9 - var18) * this.field9296.field9233 / (float)this.field9296.field9232;
                     OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                     OpenGL.glVertex2i(var18, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(var18, var15);
                     OpenGL.glTexCoord2f(var19, 0.0F);
                     OpenGL.glVertex2i(var9, var15);
                     OpenGL.glTexCoord2f(var19, this.field9296.field9234);
                     OpenGL.glVertex2i(var9, var16);
                  }

                  var16 += var14;
                  var15 += var14;
                  if (var15 > var10) {
                     var10000 = ~var10;
                     var10001 = ~var16;
                     if (!var8) {
                        if (var10000 < var10001) {
                           var20 = (float)(this.field9296.field9235 + var16 + -var10) * this.field9296.field9234 / (float)this.field9296.field9235;
                           var21 = this.field9296.field9232 + arg0;
                           var22 = arg0;
                           if (var8) {
                              OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                              OpenGL.glVertex2i(arg0, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(arg0, var10);
                              OpenGL.glTexCoord2f(this.field9296.field9233, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                              OpenGL.glVertex2i(var21, var16);
                              var22 = var13 + arg0;
                              var21 += var13;
                           }

                           while(true) {
                              while(~var21 >= ~var9) {
                                 OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(this.field9296.field9233, var20);
                                 OpenGL.glVertex2i(var21, var10);
                                 OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                                 OpenGL.glVertex2i(var21, var16);
                                 var22 += var13;
                                 var21 += var13;
                              }

                              var10000 = ~var22;
                              var10001 = ~var9;
                              if (!var8) {
                                 if (var10000 > var10001) {
                                    var23 = (float)(-var22 + var9) * this.field9296.field9233 / (float)this.field9296.field9232;
                                    OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                                    OpenGL.glVertex2i(var22, var16);
                                    OpenGL.glTexCoord2f(0.0F, var20);
                                    OpenGL.glVertex2i(var22, var10);
                                    OpenGL.glTexCoord2f(var23, var20);
                                    OpenGL.glVertex2i(var9, var10);
                                    OpenGL.glTexCoord2f(var23, this.field9296.field9234);
                                    OpenGL.glVertex2i(var9, var16);
                                 }
                                 break;
                              }

                              var21 = var10000 + var10001;
                           }
                        }

                        OpenGL.glEnd();
                        OpenGL.glPopMatrix();
                        return;
                     }
                  } else {
                     var10000 = arg0;
                     var10001 = this.field9296.field9232;
                  }

                  var17 = var10000 + var10001;
                  var18 = arg0;
                  if (var8) {
                     OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
                     OpenGL.glVertex2i(arg0, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(arg0, var15);
                     OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
                     OpenGL.glVertex2i(var17, var15);
                     OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
                     OpenGL.glVertex2i(var17, var16);
                     var17 += var13;
                     var18 = arg0 + var13;
                  }
               } else {
                  var18 += var9;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field9305[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(IIII)V",
      line = 328
   )
   public final void method3006(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9276 = arg2;
         ++field9277;
         this.field9279 = arg0;
         this.field9274 = arg1;
         this.field9278 = arg3;
         this.field9302 = this.field9279 != 0 || ~this.field9274 != -1 || ~this.field9276 != -1 || ~this.field9278 != -1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9305[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 343
   )
   public final void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;

      try {
         label45: {
            if (this.field9287.field857) {
               int[] var8 = this.field9287.method407(arg4, arg5, arg2, arg3);
               if (var8 == null) {
                  break label45;
               }

               int var9 = 0;
               if (var7) {
                  var8[var9] = class93.method899(var8[var9], -16777216);
                  ++var9;
               }

               while(true) {
                  while(var8.length > var9) {
                     var8[var9] = class93.method899(var8[var9], -16777216);
                     ++var9;
                  }

                  this.method4669(arg0, arg1, arg2, arg3, var8, 0, arg2);
                  if (!var7) {
                     if (!var7) {
                        break label45;
                     }
                     break;
                  }

                  ++var9;
               }
            }

            this.field9296.method2192(arg2, arg1, arg0, arg4, arg3, -99, arg5);
         }

         ++field9282;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field9305[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(I)V",
      line = 373
   )
   public static void method4670(int arg0) {
      try {
         if (arg0 != 3353) {
            field9275 = -94;
         }

         field9283 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9305[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 388
   )
   public final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field9303;
         this.field9296.method5132(~(1 & arg7) != -1, 0);
         this.field9287.method430(2);
         this.field9287.method288(-3, arg6);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (this.field9302) {
            float var9 = (float)arg2 / (float)this.method3009();
            float var10 = (float)arg3 / (float)this.method3000();
            float var11 = (float)this.field9279 * var9 + (float)arg0;
            float var12 = (float)this.field9274 * var10 + (float)arg1;
            float var13 = (float)this.field9296.field9232 * var9 + var11;
            float var14 = (float)this.field9296.field9235 * var10 + var12;
            if (this.field9289 != null) {
               this.method4671(arg4, 0);
               this.field9289.method5132(true, 0);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9296.field9234);
               OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field9296.field9233, 0.0F);
               OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field9296.field9233, this.field9296.field9234);
               OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
               this.method4666(51);
            } else {
               this.field9287.method252(this.field9296, (byte)-32);
               this.field9287.method322(-40, arg4);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
            }
         } else if (this.field9289 != null) {
            this.method4671(arg4, 0);
            this.field9289.method5132(true, 0);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9296.field9234);
            OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9296.field9233, 0.0F);
            OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field9296.field9233, this.field9296.field9234);
            OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
            OpenGL.glVertex2i(arg0 - -arg2, arg1);
            OpenGL.glEnd();
            this.method4666(109);
         } else {
            this.field9287.method252(this.field9296, (byte)-59);
            this.field9287.method322(-83, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
            OpenGL.glVertex2i(arg0 - -arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field9305[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V",
      line = 493
   )
   public final void method3008(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
      try {
         ++field9298;
         class633 var11 = ((class560)arg7).field8145;
         if (this.field9302) {
            float var12 = (float)this.method3009();
            float var13 = (float)this.method3000();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (-arg0 + arg4) / var13;
            float var17 = (-arg1 + arg5) / var13;
            float var18 = (float)this.field9274 * var16;
            float var19 = (float)this.field9274 * var17;
            float var20 = (float)this.field9279 * var14;
            float var21 = (float)this.field9279 * var15;
            float var22 = (float)this.field9276 * -var14;
            float var23 = (float)this.field9276 * -var15;
            float var24 = (float)this.field9278 * -var16;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            float var25 = (float)this.field9278 * -var17;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
         }

         float var26 = arg2 - arg0 + arg4;
         this.field9296.method5132((arg6 & 1) != 0, 0);
         float var27 = arg5 - arg1 + arg3;
         this.field9287.method430(2);
         this.field9287.method252(this.field9296, (byte)-111);
         this.field9287.method322(-128, 1);
         this.field9287.method259(32, 1);
         this.field9287.method252(var11, (byte)-42);
         this.field9287.method314(7681, -28, 8448);
         this.field9287.method262(0, 768, 8960, 34168);
         this.field9287.method288(-3, 1);
         float var28 = var11.field9233 / (float)var11.field9232;
         float var29 = var11.field9234 / (float)var11.field9235;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9296.field9234);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg0) * var28, var11.field9234 - (arg1 - (float)arg9) * var29);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg4) * var28, -(((float)(-arg9) + arg5) * var29) + var11.field9234);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glMultiTexCoord2f(33984, this.field9296.field9233, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, (var26 - (float)arg8) * var28, var11.field9234 - ((float)(-arg9) + var27) * var29);
         OpenGL.glVertex2f(var26, var27);
         OpenGL.glMultiTexCoord2f(33984, this.field9296.field9233, this.field9296.field9234);
         OpenGL.glMultiTexCoord2f(33985, (arg2 - (float)arg8) * var28, -(((float)(-arg9) + arg3) * var29) + var11.field9234);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
         this.field9287.method262(0, 768, 8960, 5890);
         this.field9287.method322(-80, 0);
         this.field9287.method252((class707)null, (byte)-128);
         this.field9287.method259(32, 0);
      } catch (RuntimeException var31) {
         throw class608.method4462(var31, field9305[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field9305[3] : field9305[2]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(III)V",
      line = 583
   )
   public final void method1056(int arg0, int arg1, int arg2) {
      try {
         OpenGL.glPixelTransferf(3348, 0.5F);
         ++field9280;
         OpenGL.glPixelTransferf(3349, 0.499F);
         OpenGL.glPixelTransferf(3352, 0.5F);
         OpenGL.glPixelTransferf(3353, 0.499F);
         OpenGL.glPixelTransferf(3354, 0.5F);
         OpenGL.glPixelTransferf(3355, 0.499F);
         this.field9289 = class259.method2079(this.field9287, this.field9296.field9232, -24381, arg1, this.field9296.field9235, arg0);
         this.field9288 = arg2;
         OpenGL.glPixelTransferf(3348, 1.0F);
         OpenGL.glPixelTransferf(3349, 0.0F);
         OpenGL.glPixelTransferf(3352, 1.0F);
         OpenGL.glPixelTransferf(3353, 0.0F);
         OpenGL.glPixelTransferf(3354, 1.0F);
         OpenGL.glPixelTransferf(3355, 0.0F);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9305[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(II)V",
      line = 609
   )
   private final void method4671(int arg0, int arg1) {
      try {
         ++field9294;
         this.field9287.method259(32, 1);
         this.field9287.method252(this.field9296, (byte)-98);
         this.field9287.method314(this.field9287.method377(7513, arg0), -114, 7681);
         this.field9287.method262(1, 768, 8960, 34167);
         this.field9287.method387(0, 34184, 34168, 770);
         this.field9287.method259(32, arg1);
         this.field9287.method252(this.field9289, (byte)-13);
         this.field9287.method314(34479, 92, 7681);
         this.field9287.method262(1, 768, arg1 + 8960, 34166);
         if (~this.field9288 == -1) {
            this.field9287.method311(0.0F, (byte)102, 0.5F, 0.5F, 1.0F);
         } else if (this.field9288 == 1) {
            this.field9287.method311(0.0F, (byte)98, 1.0F, 0.5F, 0.5F);
         } else {
            if (this.field9288 != 2) {
               if (this.field9288 == 3) {
                  this.field9287.method311(0.0F, (byte)80, 128.5F, 128.5F, 128.5F);
                  return;
               }
            } else {
               this.field9287.method311(0.0F, (byte)111, 0.5F, 1.0F, 0.5F);
            }

         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9305[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "()I",
      line = 640
   )
   public final int method3009() {
      try {
         ++field9285;
         return this.field9296.field9232 + this.field9279 + this.field9276;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9305[23] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIII)V",
      line = 648
   )
   public final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9304;
         this.field9296.method5132(false, 0);
         this.field9287.method430(2);
         this.field9287.method288(-3, arg4);
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         int var8 = this.field9279 + arg0;
         int var9 = this.field9274 + arg1;
         if (this.field9289 != null) {
            this.method4671(arg2, 0);
            this.field9289.method5132(false, 0);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9296.field9234);
            OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, this.field9296.field9235 + var9);
            OpenGL.glMultiTexCoord2f(33985, this.field9296.field9233, 0.0F);
            OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
            OpenGL.glVertex2i(this.field9296.field9232 + var8, this.field9296.field9235 + var9);
            OpenGL.glMultiTexCoord2f(33985, this.field9296.field9233, this.field9296.field9234);
            OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
            OpenGL.glVertex2i(this.field9296.field9232 + var8, var9);
            OpenGL.glEnd();
            this.method4666(77);
         } else {
            this.field9287.method252(this.field9296, (byte)-128);
            this.field9287.method322(-36, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, var9 - -this.field9296.field9235);
            OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
            OpenGL.glVertex2i(this.field9296.field9232 + var8, this.field9296.field9235 + var9);
            OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
            OpenGL.glVertex2i(this.field9296.field9232 + var8, var9);
            OpenGL.glEnd();
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9305[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "d",
      descriptor = "()I",
      line = 699
   )
   public final int method3005() {
      try {
         ++field9301;
         return this.field9296.field9235;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9305[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "([I)V",
      line = 715
   )
   public final void method3001(int[] arg0) {
      try {
         arg0[0] = this.field9279;
         arg0[1] = this.field9274;
         ++field9292;
         arg0[2] = this.field9276;
         arg0[3] = this.field9278;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9305[8] + (arg0 != null ? field9305[3] : field9305[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(FFFFFFIIII)V",
      line = 763
   )
   public final void method3003(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field9293;
         if (this.field9302) {
            float var11 = (float)this.method3009();
            float var12 = (float)this.method3000();
            float var13 = (-arg0 + arg2) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (-arg1 + arg5) / var12;
            float var17 = (float)this.field9274 * var15;
            float var18 = (float)this.field9274 * var16;
            float var19 = (float)this.field9279 * var13;
            float var20 = (float)this.field9279 * var14;
            float var21 = (float)this.field9276 * -var13;
            float var22 = (float)this.field9276 * -var14;
            float var23 = (float)this.field9278 * -var15;
            arg0 = arg0 + var19 + var17;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            float var24 = (float)this.field9278 * -var16;
            arg3 = arg3 + var22 + var18;
            arg2 = arg2 + var21 + var17;
            arg5 = arg5 + var20 + var24;
         }

         float var25 = arg2 - arg0 + arg4;
         this.field9296.method5132((arg9 & 1) != 0, 0);
         float var26 = -arg1 + arg5 + arg3;
         this.field9287.method430(2);
         this.field9287.method252(this.field9296, (byte)-115);
         this.field9287.method288(-3, arg8);
         this.field9287.method322(-73, arg6);
         OpenGL.glColor4ub((byte)(arg7 >> 16), (byte)(arg7 >> 8), (byte)arg7, (byte)(arg7 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field9296.field9234);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glTexCoord2f(this.field9296.field9233, 0.0F);
         OpenGL.glVertex2f(var25, var26);
         OpenGL.glTexCoord2f(this.field9296.field9233, this.field9296.field9234);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
      } catch (RuntimeException var28) {
         throw class608.method4462(var28, field9305[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4672(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4673(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
