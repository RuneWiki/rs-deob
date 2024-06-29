import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class597 extends class606 {
   @OriginalMember(
      owner = "client!hc",
      name = "L",
      descriptor = "I"
   )
   private int field8406 = 32768;
   @OriginalMember(
      owner = "client!hc",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8410 = new String[]{method4378(method4377("xh>c9")), method4378(method4377("xh>`9")), method4378(method4377("xh>j9")), method4378(method4377("xh>k9")), method4378(method4377("xh>i9")), method4378(method4377("~~|D")), method4378(method4377("k%>\u0006l")), method4378(method4377("xh>m9")), method4378(method4377("xh>o9"))};
   @OriginalMember(
      owner = "client!hc",
      name = "D",
      descriptor = "I"
   )
   public static int field8402 = -1;
   @OriginalMember(
      owner = "client!hc",
      name = "K",
      descriptor = "Lhha;"
   )
   public static class724 field8409 = new class724(3, -2);
   @OriginalMember(
      owner = "client!hc",
      name = "J",
      descriptor = "I"
   )
   public static int field8401;
   @OriginalMember(
      owner = "client!hc",
      name = "G",
      descriptor = "I"
   )
   public static int field8403;
   @OriginalMember(
      owner = "client!hc",
      name = "H",
      descriptor = "I"
   )
   public static int field8404;
   @OriginalMember(
      owner = "client!hc",
      name = "F",
      descriptor = "I"
   )
   public static int field8405;
   @OriginalMember(
      owner = "client!hc",
      name = "M",
      descriptor = "I"
   )
   public static int field8407;
   @OriginalMember(
      owner = "client!hc",
      name = "E",
      descriptor = "I"
   )
   public static int field8408;
   @OriginalMember(
      owner = "client!hc",
      name = "I",
      descriptor = "[[Z"
   )
   public static boolean[][] field8400;

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label48: {
            label42: {
               if (~arg1 != -1) {
                  if (~arg1 != -2) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field8406 = arg0.method685(-2) << 4;
               if (!var4) {
                  break label48;
               }
            }

            super.field8641 = ~arg0.method665(false) == -2;
         }

         if (arg2 >= -6) {
            field8400 = null;
         }

         ++field8401;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8410[4] + (arg0 != null ? field8410[6] : field8410[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method4374(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field8407;
         if (arg0 == arg2) {
            return arg0;
         } else {
            if (arg1 != 62) {
               method4374(122, (byte)-108, -30, -21);
            }

            int var4 = -arg3 + 128;
            int var5 = (127 & arg0) * var4 + (arg2 & 127) * arg3 >> 7;
            int var6 = (896 & arg0) * var4 + (arg2 & 896) * arg3 >> 7;
            int var7 = (arg0 & 64512) * var4 + (64512 & arg2) * arg3 >> 7;
            return var7 & 64512 | var6 & 896 | var5 & 127;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8410[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 373) {
            return null;
         } else {
            ++field8408;
            int[][] var4 = super.field8649.method5536(23870, arg1);
            if (super.field8649.field11043) {
               int[] var5 = this.method4463(arg1, 13064, 1);
               int[] var6 = this.method4463(arg1, 13064, 2);
               int[] var7 = var4[0];
               int[] var8 = var4[1];
               int[] var9 = var4[2];
               int var10 = 0;
               if (var3 || var10 < class563.field8014) {
                  do {
                     int var11 = (var5[var10] * 255 & 1047705) >> 12;
                     int var12 = var6[var10] * this.field8406 >> 12;
                     int var13 = class458.field6687[var11] * var12 >> 12;
                     int var14 = class608.field8660[var11] * var12 >> 12;
                     int var15 = class358.field5293 & (var13 >> 12) + var10;
                     int var16 = arg1 - -(var14 >> 12) & class801.field11660;
                     int[][] var17 = this.method4467(0, var16, (byte)100);
                     var7[var10] = var17[0][var15];
                     var8[var10] = var17[1][var15];
                     var9[var10] = var17[2][var15];
                     ++var10;
                  } while(var10 < class563.field8014);
               }
            }

            return var4;
         }
      } catch (RuntimeException var19) {
         throw class612.method4503(var19, field8410[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4375(int arg0) {
      try {
         field8409 = null;
         field8400 = null;
         if (arg0 != -12578) {
            method4375(-20);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8410[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "<init>",
      descriptor = "()V"
   )
   public class597() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field8405;
         if (arg0 != 0) {
            method4376(-80, -29);
         }

         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1, 13064, 1);
            int[] var6 = this.method4463(arg1, 13064, 2);
            int var7 = 0;
            if (var3 || var7 < class563.field8014) {
               do {
                  int var8 = 255 & var5[var7] >> 4;
                  int var9 = var6[var7] * this.field8406 >> 12;
                  int var10 = class458.field6687[var8] * var9 >> 12;
                  int var11 = class608.field8660[var8] * var9 >> 12;
                  int var12 = (var10 >> 12) + var7 & class358.field5293;
                  int var13 = (var11 >> 12) + arg1 & class801.field11660;
                  int[] var14 = this.method4463(var13, 13064, 0);
                  var4[var7] = var14[var12];
                  ++var7;
               } while(var7 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field8410[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "(II)[B"
   )
   public static final byte[] method4376(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         if (arg0 != 28805) {
            return null;
         } else {
            ++field8403;
            class321 var3 = (class321)class177.field2615.method78(arg0 + -28805, (long)arg1);
            if (var3 == null) {
               byte[] var4 = new byte[512];
               Random var5 = new Random((long)arg1);
               int var6 = 0;
               if (var2) {
                  var4[var6] = (byte)var6;
                  ++var6;
               }

               while(true) {
                  while(~var6 > -256) {
                     var4[var6] = (byte)var6;
                     ++var6;
                  }

                  int var7 = 0;
                  if (!var2) {
                     if (var2 || var7 < 255) {
                        do {
                           int var8 = -var7 + 255;
                           int var9 = class633.method4632(arg0 + -28793, var5, var8);
                           byte var10 = var4[var9];
                           var4[var9] = var4[var8];
                           var4[var8] = var4[-var7 + 511] = var10;
                           ++var7;
                        } while(var7 < 255);
                     }

                     var3 = new class321(var4);
                     class177.field2615.method73((byte)108, (long)arg1, var3);
                     break;
                  }

                  ++var6;
               }
            }

            return var3.field4795;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field8410[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         ++field8404;
         if (arg0 >= 118) {
            class22.method299(4096);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8410[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4377(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4378(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
