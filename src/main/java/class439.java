import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class439 extends class500 {
   @OriginalMember(
      owner = "client!mha",
      name = "t",
      descriptor = "Lor;"
   )
   private class670 field6080;
   @OriginalMember(
      owner = "client!mha",
      name = "E",
      descriptor = "Loda;"
   )
   private class127 field6086;
   @OriginalMember(
      owner = "client!mha",
      name = "G",
      descriptor = "Lvj;"
   )
   private class469 field6091;
   @OriginalMember(
      owner = "client!mha",
      name = "u",
      descriptor = "I"
   )
   private int field6093;
   @OriginalMember(
      owner = "client!mha",
      name = "r",
      descriptor = "I"
   )
   private int field6085;
   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "I"
   )
   private int field6096;
   @OriginalMember(
      owner = "client!mha",
      name = "F",
      descriptor = "I"
   )
   private int field6088;
   @OriginalMember(
      owner = "client!mha",
      name = "j",
      descriptor = "[[F"
   )
   private float[][] field6084;
   @OriginalMember(
      owner = "client!mha",
      name = "D",
      descriptor = "[[F"
   )
   private float[][] field6081;
   @OriginalMember(
      owner = "client!mha",
      name = "s",
      descriptor = "[[F"
   )
   private float[][] field6074;
   @OriginalMember(
      owner = "client!mha",
      name = "o",
      descriptor = "I"
   )
   private int field6077;
   @OriginalMember(
      owner = "client!mha",
      name = "C",
      descriptor = "Lwq;"
   )
   private class178 field6090;
   @OriginalMember(
      owner = "client!mha",
      name = "I",
      descriptor = "Lei;"
   )
   private class189 field6095;
   @OriginalMember(
      owner = "client!mha",
      name = "w",
      descriptor = "Lgn;"
   )
   private class732 field6078;
   @OriginalMember(
      owner = "client!mha",
      name = "m",
      descriptor = "Lwq;"
   )
   private class178 field6087;
   @OriginalMember(
      owner = "client!mha",
      name = "J",
      descriptor = "Lwm;"
   )
   private class594 field6082;
   @OriginalMember(
      owner = "client!mha",
      name = "n",
      descriptor = "Liu;"
   )
   private class608 field6073;
   @OriginalMember(
      owner = "client!mha",
      name = "v",
      descriptor = "Ldia;"
   )
   private class245 field6072;
   @OriginalMember(
      owner = "client!mha",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6101 = new String[]{method3267(method3266(" >i\u001b")), method3267(method3266("##dYpf")), method3267(method3266("5e+YH")), method3267(method3266("##dYvf")), method3267(method3266("##dYwf")), method3267(method3266("##dYsf")), method3267(method3266("##dYqf")), method3267(method3266("##dY\t'%l\u0003\u000bf")), method3267(method3266("##dYtf"))};
   @OriginalMember(
      owner = "client!mha",
      name = "l",
      descriptor = "Lnw;"
   )
   public static class616 field6097 = new class616(72, 2);
   @OriginalMember(
      owner = "client!mha",
      name = "x",
      descriptor = "Lnw;"
   )
   public static class616 field6099 = new class616(64, 2);
   @OriginalMember(
      owner = "client!mha",
      name = "H",
      descriptor = "I"
   )
   public static int field6076;
   @OriginalMember(
      owner = "client!mha",
      name = "A",
      descriptor = "I"
   )
   public static int field6079;
   @OriginalMember(
      owner = "client!mha",
      name = "p",
      descriptor = "I"
   )
   public static int field6083;
   @OriginalMember(
      owner = "client!mha",
      name = "K",
      descriptor = "I"
   )
   public static int field6089;
   @OriginalMember(
      owner = "client!mha",
      name = "L",
      descriptor = "I"
   )
   private int field6092;
   @OriginalMember(
      owner = "client!mha",
      name = "q",
      descriptor = "I"
   )
   public static int field6094;
   @OriginalMember(
      owner = "client!mha",
      name = "B",
      descriptor = "I"
   )
   public static int field6100;
   @OriginalMember(
      owner = "client!mha",
      name = "k",
      descriptor = "Lqh;"
   )
   public static class74 field6075;
   @OriginalMember(
      owner = "client!mha",
      name = "y",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field6098;

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public static final boolean method3260(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6089;
         if (~(class100.field1295[0][arg2][arg0] & 2) != -1) {
            return true;
         } else if ((16 & class100.field1295[arg3][arg2][arg0]) != 0) {
            return false;
         } else {
            if (arg4 <= 126) {
               field6094 = 69;
            }

            return ~arg1 == ~class790.method5694(arg2, arg3, 95, arg0);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6101[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "([[ZIIII)V"
   )
   public final void method3261(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         ++field6076;
         if (arg1 == -1) {
            if (this.field6078 != null) {
               if (arg2 + arg4 >= this.field6093) {
                  if (arg4 - arg2 <= this.field6085) {
                     if (arg2 + arg3 >= this.field6096) {
                        if (arg3 - arg2 <= this.field6088) {
                           int var7 = this.field6096;
                           if (var6 || ~this.field6088 <= ~var7) {
                              do {
                                 int var8 = this.field6093;
                                 if (var6 || ~this.field6085 <= ~var8) {
                                    do {
                                       int var9 = -arg4 + var8;
                                       int var10 = -arg3 + var7;
                                       if (~(-arg2) > ~var9 && ~arg2 < ~var9 && -arg2 < var10 && arg2 > var10 && arg0[var9 - -arg2][arg2 + var10]) {
                                          this.field6080.method4876(-124, (int)(255.0F * this.field6086.method1070(-1)) << 24);
                                          this.field6080.method4874(this.field6087, (class178)null, 75, this.field6090, (class178)null);
                                          this.field6080.method4866(0, (byte)-54, this.field6078, 4, this.field6077);
                                          return;
                                       }

                                       ++var8;
                                    } while(~this.field6085 <= ~var8);
                                 }

                                 ++var7;
                              } while(~this.field6088 <= ~var7);

                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field6101[1] + (arg0 != null ? field6101[2] : field6101[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(SI)V"
   )
   private final void method3262(short arg0, int arg1) {
      try {
         label20: {
            ++field6100;
            if (this.field6080.field9773) {
               this.field6082.method4284(arg0, arg1 ^ 31428);
               if (!client.field4273) {
                  break label20;
               }
            }

            this.field6082.method4330(arg0, (byte)-117);
         }

         if (arg1 != -1) {
            method3260(10, -22, -64, -84, 13);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6101[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   private final void method3263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         ++field6083;
         long var9 = -1L;
         int var11 = (arg6 << this.field6091.field3874) + arg0;
         int var12 = arg5 - -(arg2 << this.field6091.field3874);
         int var13 = this.field6091.method2220(126, var11, var12);
         if ((127 & arg0) == 0 || (arg5 & 127) == 0) {
            var9 = (long)var12 << 16 & 65535L << 16 | (long)var11 & 65535L;
            class500 var14 = this.field6072.method1839(-119, var9);
            if (var14 != null) {
               this.method3262(((class355)var14).field5062, -1);
               return;
            }
         }

         short var15 = (short)(this.field6092++);
         if (~var9 != 0L) {
            this.field6072.method1841(var9, true, new class355(var15));
         }

         float var16;
         float var17;
         float var18;
         label117: {
            if (~arg0 != -1 || ~arg5 != -1) {
               if (~this.field6091.field3869 != ~arg0 || arg5 != 0) {
                  if (this.field6091.field3869 == arg0 && this.field6091.field3869 == arg5) {
                     var16 = this.field6081[arg3 + 1][arg4 + 1];
                     var17 = this.field6084[arg3 + 1][arg4 + 1];
                     var18 = this.field6074[arg3 + 1][arg4 - -1];
                     if (!var8) {
                        break label117;
                     }
                  }

                  if (~arg0 != -1 || this.field6091.field3869 != arg5) {
                     float var19 = (float)arg0 / (float)this.field6091.field3869;
                     float var20 = (float)arg5 / (float)this.field6091.field3869;
                     float var21 = this.field6081[arg3][arg4];
                     float var22 = this.field6074[arg3][arg4];
                     float var23 = this.field6084[arg3][arg4];
                     float var24 = this.field6081[arg3 + 1][arg4];
                     float var25 = this.field6074[arg3 - -1][arg4];
                     float var26 = (this.field6074[arg3][arg4 - -1] + -var22) * var19 + var22;
                     float var27 = (this.field6074[arg3 + 1][arg4 + 1] - var25) * var19 + var25;
                     float var28 = (this.field6081[arg3 + 1][arg4 + 1] - var24) * var19 + var24;
                     float var29 = this.field6084[arg3 + 1][arg4];
                     float var30 = (this.field6084[arg3][arg4 + 1] + -var23) * var19 + var23;
                     float var31 = (this.field6081[arg3][arg4 + 1] + -var21) * var19 + var21;
                     float var32 = (this.field6084[arg3 + 1][arg4 - -1] - var29) * var19 + var29;
                     var16 = (var28 - var31) * var20 + var31;
                     var18 = (var27 - var26) * var20 + var26;
                     var17 = (-var30 + var32) * var20 + var30;
                     if (!var8) {
                        break label117;
                     }
                  }

                  var17 = this.field6084[arg3][arg4 + 1];
                  var16 = this.field6081[arg3][arg4 - -1];
                  var18 = this.field6074[arg3][arg4 - -1];
                  if (!var8) {
                     break label117;
                  }
               }

               var17 = this.field6084[arg3 + 1][arg4];
               var18 = this.field6074[arg3 + 1][arg4];
               var16 = this.field6081[arg3 + 1][arg4];
               if (!var8) {
                  break label117;
               }
            }

            var18 = this.field6074[arg3][arg4];
            var17 = this.field6084[arg3][arg4];
            var16 = this.field6081[arg3][arg4];
         }

         float var33 = (float)(this.field6086.method1063(-1) - var11);
         float var34 = (float)(-var13 + this.field6086.method1065((byte)-105));
         float var35 = (float)(this.field6086.method1067(-1) - var12);
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var35 * var37;
         float var39 = var33 * var37;
         if (arg1 > 44) {
            float var40 = var34 * var37;
            float var41 = var36 / (float)this.field6086.method1066(-1);
            float var42 = 1.0F - var41 * var41;
            if (var42 < 0.0F) {
               var42 = 0.0F;
            }

            float var43 = var17 * var38 + var16 * var39 + var18 * var40;
            if (var43 < 0.0F) {
               var43 = 0.0F;
            }

            float var44 = var42 * var43 * 2.0F;
            if (var44 > 1.0F) {
               var44 = 1.0F;
            }

            int var45 = this.field6086.method1064(127);
            int var46 = (int)((float)(var45 >> 16 & 255) * var44);
            if (var46 > 255) {
               var46 = 255;
            }

            int var47 = (int)((float)(var45 >> 8 & 255) * var44);
            if (~var47 < -256) {
               var47 = 255;
            }

            int var48 = (int)((float)(var45 & 255) * var44);
            if (var48 > 255) {
               var48 = 255;
            }

            label64: {
               if (!this.field6080.field9773) {
                  this.field6073.method4439(-865887192, (float)var11);
                  this.field6073.method4439(-865887192, (float)var13);
                  this.field6073.method4439(-865887192, (float)var12);
                  if (!var8) {
                     break label64;
                  }
               }

               this.field6073.method4443(-114, (float)var11);
               this.field6073.method4443(-80, (float)var13);
               this.field6073.method4443(-103, (float)var12);
            }

            this.field6073.method4318(var46, 0);
            this.field6073.method4318(var47, 0);
            this.field6073.method4318(var48, 0);
            this.field6073.method4318(255, 0);
            this.method3262(var15, -1);
         }
      } catch (RuntimeException var50) {
         throw class534.method3846(var50, field6101[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method3264(boolean arg0) {
      try {
         field6098 = null;
         if (arg0) {
            method3264(false);
         }

         field6099 = null;
         field6097 = null;
         field6075 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6101[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "<init>",
      descriptor = "(Lor;Lvj;Loda;[I)V"
   )
   public class439(class670 param1, class469 param2, class127 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3265(byte arg0) {
      try {
         ++field6079;
         class127.field1601 = new class536();
         if (arg0 > -118) {
            method3265((byte)-21);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6101[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3266(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3267(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
