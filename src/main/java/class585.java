import jaggl.OpenGL;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class585 extends class567 {
   @OriginalMember(
      owner = "client!fs",
      name = "p",
      descriptor = "Z"
   )
   private boolean field8018 = false;
   @OriginalMember(
      owner = "client!fs",
      name = "u",
      descriptor = "[F"
   )
   private float[] field8034 = new float[4];
   @OriginalMember(
      owner = "client!fs",
      name = "v",
      descriptor = "Z"
   )
   private boolean field8022;
   @OriginalMember(
      owner = "client!fs",
      name = "K",
      descriptor = "Llb;"
   )
   private class572 field8024;
   @OriginalMember(
      owner = "client!fs",
      name = "F",
      descriptor = "Llb;"
   )
   private class572 field8028;
   @OriginalMember(
      owner = "client!fs",
      name = "s",
      descriptor = "Llb;"
   )
   private class572 field8016;
   @OriginalMember(
      owner = "client!fs",
      name = "M",
      descriptor = "Llb;"
   )
   private class572 field8027;
   @OriginalMember(
      owner = "client!fs",
      name = "H",
      descriptor = "Lgu;"
   )
   private class610 field8025;
   @OriginalMember(
      owner = "client!fs",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8041 = new String[]{method4203(method4202("\nc'%D")), method4203(method4202("\u0002ee\u000e")), method4203(method4202("\nc' D")), method4203(method4202("\u0017>'L\u0011")), method4203(method4202("\nc'*D")), method4203(method4202("\u0019gV\u0005\u001e\u0003eg\u00063\u0019~e\u000b\u0018")), method4203(method4202("\u0019gV\u000f\u0003\bue=\u0000\u0005d")), method4203(method4202("\nc'^\u0005\u0002y}\\D")), method4203(method4202("\u0019gV\u0005\u001e\u0003eg\u00063\u0000y}")), method4203(method4202("\u0019gV\u000f\u0003\bue=\u0019\u0002|`\u0016")), method4203(method4202("\u000b|")), method4203(method4202("\nc'-D")), method4203(method4202("\nc'(D")), method4203(method4202("\nc''D")), method4203(method4202("\nc')D")), method4203(method4202("\nc'!D")), method4203(method4202("\nc'+D")), method4203(method4202("\nc'#D")), method4203(method4202("\nc'$D")), method4203(method4202("\nc'&D"))};
   @OriginalMember(
      owner = "client!fs",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field8019 = new int[8];
   @OriginalMember(
      owner = "client!fs",
      name = "N",
      descriptor = "Luk;"
   )
   public static class273 field8030 = new class273();
   @OriginalMember(
      owner = "client!fs",
      name = "A",
      descriptor = "Lbga;"
   )
   public static class378 field8039 = new class378(63, -1);
   @OriginalMember(
      owner = "client!fs",
      name = "B",
      descriptor = "I"
   )
   public static int field8017;
   @OriginalMember(
      owner = "client!fs",
      name = "o",
      descriptor = "I"
   )
   public static int field8020;
   @OriginalMember(
      owner = "client!fs",
      name = "q",
      descriptor = "I"
   )
   public static int field8021;
   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "I"
   )
   public static int field8023;
   @OriginalMember(
      owner = "client!fs",
      name = "r",
      descriptor = "I"
   )
   public static int field8026;
   @OriginalMember(
      owner = "client!fs",
      name = "x",
      descriptor = "I"
   )
   public static int field8029;
   @OriginalMember(
      owner = "client!fs",
      name = "G",
      descriptor = "I"
   )
   public static int field8031;
   @OriginalMember(
      owner = "client!fs",
      name = "E",
      descriptor = "I"
   )
   public static int field8035;
   @OriginalMember(
      owner = "client!fs",
      name = "C",
      descriptor = "I"
   )
   public static int field8036;
   @OriginalMember(
      owner = "client!fs",
      name = "y",
      descriptor = "I"
   )
   public static int field8037;
   @OriginalMember(
      owner = "client!fs",
      name = "w",
      descriptor = "I"
   )
   public static int field8038;
   @OriginalMember(
      owner = "client!fs",
      name = "L",
      descriptor = "Z"
   )
   private boolean field8032;
   @OriginalMember(
      owner = "client!fs",
      name = "D",
      descriptor = "Z"
   )
   private boolean field8033;
   @OriginalMember(
      owner = "client!fs",
      name = "t",
      descriptor = "[[Llia;"
   )
   public static class507[][] field8040;

   @OriginalMember(
      owner = "client!fs",
      name = "<init>",
      descriptor = "(Lkfa;Lqh;)V"
   )
   public class585(class632 arg0, class74 arg1) {
      super(arg0);

      try {
         if (arg1 != null && arg0.field8949) {
            this.field8024 = class294.method2217(arg1.method720(false, field8041[5], field8041[10]), arg0, 34336, 0);
            this.field8028 = class294.method2217(arg1.method720(false, field8041[8], field8041[10]), arg0, 34336, 0);
            this.field8016 = class294.method2217(arg1.method720(false, field8041[9], field8041[10]), arg0, 34336, 0);
            this.field8027 = class294.method2217(arg1.method720(false, field8041[6], field8041[10]), arg0, 34336, 0);
            if (!(this.field8016 != null & this.field8028 != null & this.field8024 != null & this.field8027 != null)) {
               this.field8022 = false;
            } else {
               this.field8025 = super.field7728.method2484(new int[]{0, -1}, false, 2, 1, (byte)2);
               this.field8025.method36(10251, false, false);
               this.field8022 = true;
            }
         } else {
            this.field8022 = false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8041[7] + (arg0 != null ? field8041[3] : field8041[1]) + ',' + (arg1 != null ? field8041[3] : field8041[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      try {
         if (arg1 != 10286) {
            this.field8033 = false;
         }

         this.field8033 = arg0;
         ++field8029;
         super.field7728.method2506(1, arg1 ^ 10327);
         super.field7728.method2581(this.field8025, 95);
         super.field7728.method2587(class535.field7314, -91, class581.field7982);
         super.field7728.method2547(0, class206.field2525, arg1 + -10286);
         super.field7728.method2517(class550.field7513, -1, 2, true, false);
         super.field7728.method2592(0, class529.field7261, 0);
         super.field7728.method2506(0, arg1 ^ 10332);
         this.method467((byte)-87);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8041[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         if (arg0 != -1309) {
            this.field8032 = true;
         }

         ++field8037;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8041[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ZIIIII)V"
   )
   public static final void method4198(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field8035;
         if (arg0) {
            field8040 = null;
         }

         int var7 = 0;
         int var8 = arg3;
         int var9 = arg2 * arg2;
         int var10 = arg3 * arg3;
         int var11 = var10 << 1;
         int var12 = var9 << 1;
         int var13 = arg3 << 1;
         int var14 = (-var13 + 1) * var9 - -var11;
         int var15 = -((var13 + -1) * var12) + var10;
         int var16 = var9 << 2;
         int var17 = var10 << 2;
         int var18 = ((var7 << 1) + 3) * var11;
         int var19 = ((arg3 << 1) + -3) * var12;
         int var20 = (var7 + 1) * var17;
         int var21 = (arg3 + -1) * var16;
         if (~arg4 <= ~class478.field6604) {
            if (class313.field4171 >= arg4) {
               int var22 = class138.method1159(arg1 + arg2, class663.field9442, (byte)-44, class265.field3451);
               int var23 = class138.method1159(-arg2 + arg1, class663.field9442, (byte)-44, class265.field3451);
               class125.method1046(-23355, var22, class17.field236[arg4], arg5, var23);
               if (!var6 && ~arg3 >= -1) {
                  return;
               }
            } else if (~arg3 >= -1) {
               return;
            }
         } else if (~arg3 >= -1) {
            return;
         }

         do {
            int var10000;
            byte var10001;
            label91: {
               if (var14 < 0) {
                  if (var6) {
                     var15 += var20;
                     var14 += var18;
                     ++var7;
                     var20 += var17;
                     var18 += var17;
                  }
               } else {
                  var10000 = ~var15;
                  var10001 = -1;
                  if (!var6) {
                     break label91;
                  }

                  var18 = var10000 + -1;
               }

               while(true) {
                  while(var14 < 0) {
                     var15 += var20;
                     var14 += var18;
                     ++var7;
                     var20 += var17;
                     var18 += var17;
                  }

                  var10000 = ~var15;
                  var10001 = -1;
                  if (!var6) {
                     break;
                  }

                  var18 = var10000 + -1;
               }
            }

            if (var10000 > var10001) {
               var14 += var18;
               var15 += var20;
               ++var7;
               var18 += var17;
               var20 += var17;
            }

            while(true) {
               var15 += -var19;
               var14 += -var21;
               var19 -= var16;
               --var8;
               var21 -= var16;
               int var24 = -var8 + arg4;
               int var25 = arg4 + var8;
               if (~class478.field6604 < ~var25) {
                  break;
               }

               int var30 = class313.field4171;
               if (!var6) {
                  if (var24 <= var30) {
                     int var26 = class138.method1159(arg1 + var7, class663.field9442, (byte)-44, class265.field3451);
                     int var27 = class138.method1159(-var7 + arg1, class663.field9442, (byte)-44, class265.field3451);
                     if (~class478.field6604 >= ~var24) {
                        class125.method1046(-23355, var26, class17.field236[var24], arg5, var27);
                     }

                     if (var25 <= class313.field4171) {
                        class125.method1046(-23355, var26, class17.field236[var25], arg5, var27);
                     }
                  }
                  break;
               }

               if (var24 > var30) {
                  var14 += var18;
                  var15 += var20;
                  ++var7;
                  var18 += var17;
                  var20 += var17;
               }
            }
         } while(~var8 < -1);

      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field8041[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(B[B)Lbo;"
   )
   public static final class763 method4199(byte arg0, byte[] arg1) {
      try {
         ++field8017;
         if (arg0 > -79) {
            return null;
         } else if (arg1 == null) {
            throw new RuntimeException("");
         } else {
            while(true) {
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                  MediaTracker var3 = new MediaTracker(class15.field197);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class15.field197);
                  int var5 = var2.getHeight(class15.field197);
                  if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                     int[] var6 = new int[var4 * var5];
                     PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                     var7.grabPixels();
                     return class338.field4832.method525(var4, var6, var5, var4, 0, 0);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field8041[16] + arg0 + ',' + (arg1 != null ? field8041[3] : field8041[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method467(byte arg0) {
      try {
         ++field8021;
         int var2 = super.field7728.method2534((byte)-49);
         if (arg0 <= -44) {
            class251 var3;
            label35: {
               var3 = super.field7728.method2494(-129);
               if (this.field8033) {
                  OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field8027.field7870 : this.field8028.field7870);
                  if (!client.field4273) {
                     break label35;
                  }
               }

               OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field8024.field7870 : this.field8016.field7870);
            }

            OpenGL.glEnable(34336);
            this.field8032 = true;
            var3.method1894(0.0F, true, (float)var2, 0.0F, this.field8034, -1.0F);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field8034[0], this.field8034[1], this.field8034[2], this.field8034[3]);
            this.method4(109);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8041[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4200(boolean arg0) {
      try {
         field8030 = null;
         field8040 = null;
         field8019 = null;
         if (!arg0) {
            field8040 = null;
         }

         field8039 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8041[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         ++field8026;
         return arg0 > -64 ? true : this.field8022;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8041[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method4201(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         int var6 = 0;
         if (!var5 && class739.field10765 <= var6) {
            ++field8038;
            if (arg0 != -2) {
               method4198(true, -57, -87, -14, 124, 29);
            }

            class534.method3842(0, arg1 + arg4, arg2 - -arg3, arg2, arg1);
         } else {
            do {
               Rectangle var7 = class224.field2809[var6];
               if (var7.x + var7.width > arg1 && ~(arg1 - -arg4) < ~var7.x && var7.y - -var7.height > arg2 && ~var7.y > ~(arg2 + arg3)) {
                  class294.field3861[var6] = true;
               }

               ++var6;
            } while(class739.field10765 > var6);

            ++field8038;
            if (arg0 != -2) {
               method4198(true, -57, -87, -14, 124, 29);
            }

            class534.method3842(0, arg1 + arg4, arg2 - -arg3, arg2, arg1);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8041[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      try {
         int var4 = -56 % ((arg1 - 63) / 58);
         ++field8020;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8041[18] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         label34: {
            if (arg1 != null) {
               if (this.field8018) {
                  super.field7728.method2547(0, class550.field7513, 0);
                  super.field7728.method2592(0, class550.field7513, 0);
                  this.field8018 = false;
               }

               super.field7728.method2581(arg1, -61);
               super.field7728.method2593(0, arg2);
               if (!client.field4273) {
                  break label34;
               }
            }

            if (!this.field8018) {
               super.field7728.method2581(super.field7728.field4660, 15);
               super.field7728.method2593(0, 1);
               super.field7728.method2547(0, class529.field7261, 0);
               super.field7728.method2592(0, class529.field7261, 0);
               this.field8018 = true;
            }
         }

         if (!arg0) {
            this.field8025 = null;
         }

         ++field8036;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8041[2] + arg0 + ',' + (arg1 != null ? field8041[3] : field8041[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         super.field7728.method2506(1, 91);
         ++field8031;
         super.field7728.method2581((class159)null, 120);
         super.field7728.method2587(class449.field6203, arg0 + 60, class449.field6203);
         super.field7728.method2547(0, class550.field7513, 0);
         super.field7728.method2547(2, class206.field2525, arg0);
         super.field7728.method2592(0, class550.field7513, 0);
         super.field7728.method2506(arg0, 99);
         if (this.field8018) {
            super.field7728.method2547(0, class550.field7513, 0);
            super.field7728.method2592(0, class550.field7513, 0);
            this.field8018 = false;
         }

         if (this.field8032) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8032 = false;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8041[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4(int arg0) {
      try {
         if (this.field8032) {
            int var2 = super.field7728.method578();
            int var3 = super.field7728.method567();
            float var4 = (float)var2 + -((float)(-var3 + var2) * 0.125F);
            float var5 = (float)var2 - (float)(-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field7728.method2565(-27805), (float)super.field7728.method2473((byte)-45) / 255.0F);
            super.field7728.method2506(1, -110);
            super.field7728.method2552(super.field7728.method2528(false), true);
            super.field7728.method2506(0, -90);
         }

         ++field8023;
         int var6 = -50 % ((arg0 - 62) / 45);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8041[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
