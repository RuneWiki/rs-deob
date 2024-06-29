import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class540 {
   @OriginalMember(
      owner = "client!jq",
      name = "l",
      descriptor = "I"
   )
   private int field7716 = -1;
   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "Z"
   )
   private boolean field7722 = true;
   @OriginalMember(
      owner = "client!jq",
      name = "e",
      descriptor = "I"
   )
   private int field7718;
   @OriginalMember(
      owner = "client!jq",
      name = "g",
      descriptor = "[Ldc;"
   )
   private class5[] field7724;
   @OriginalMember(
      owner = "client!jq",
      name = "d",
      descriptor = "I"
   )
   private int field7719;
   @OriginalMember(
      owner = "client!jq",
      name = "m",
      descriptor = "I"
   )
   private int field7715;
   @OriginalMember(
      owner = "client!jq",
      name = "k",
      descriptor = "I"
   )
   private int field7725;
   @OriginalMember(
      owner = "client!jq",
      name = "q",
      descriptor = "[Ldc;"
   )
   private class5[] field7713;
   @OriginalMember(
      owner = "client!jq",
      name = "s",
      descriptor = "Ldc;"
   )
   private class5 field7723;
   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7733 = new String[]{method3893(method3892("<7u\u0017f")), method3893(method3892("837>")), method3893(method3892("<7u\u0015f")), method3893(method3892("-hu|3")), method3893(method3892("<7u\u0016f")), method3893(method3892("<7u\u0013f")), method3893(method3892("<7u\u0011f")), method3893(method3892("<7un'8//lf")), method3893(method3892("<7u\u0010f")), method3893(method3892("<7u\u0014f"))};
   @OriginalMember(
      owner = "client!jq",
      name = "j",
      descriptor = "B"
   )
   public static byte field7720 = -6;
   @OriginalMember(
      owner = "client!jq",
      name = "t",
      descriptor = "I"
   )
   public static int field7714;
   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "I"
   )
   public static int field7717;
   @OriginalMember(
      owner = "client!jq",
      name = "p",
      descriptor = "I"
   )
   public static int field7721;
   @OriginalMember(
      owner = "client!jq",
      name = "f",
      descriptor = "I"
   )
   public static int field7726;
   @OriginalMember(
      owner = "client!jq",
      name = "i",
      descriptor = "I"
   )
   public static int field7727;
   @OriginalMember(
      owner = "client!jq",
      name = "r",
      descriptor = "I"
   )
   private int field7728;
   @OriginalMember(
      owner = "client!jq",
      name = "c",
      descriptor = "I"
   )
   public static int field7729;
   @OriginalMember(
      owner = "client!jq",
      name = "n",
      descriptor = "I"
   )
   public static int field7730;
   @OriginalMember(
      owner = "client!jq",
      name = "h",
      descriptor = "I"
   )
   private int field7731;
   @OriginalMember(
      owner = "client!jq",
      name = "o",
      descriptor = "Lbg;"
   )
   private class492 field7732;

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(Lha;II)Z"
   )
   public final boolean method3885(class66 arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field7729;
         if (this.field7716 != arg2) {
            this.field7716 = arg2;
            int var5 = class22.method136(arg2, (byte)48);
            if (~var5 < -513) {
               var5 = 512;
            }

            if (~var5 >= -1) {
               var5 = 1;
            }

            if (~this.field7728 != ~var5) {
               this.field7728 = var5;
               this.field7732 = null;
            }

            if (this.field7724 != null) {
               this.field7731 = 0;
               int[] var6 = new int[this.field7724.length];
               int var7 = 0;
               if (!var4 && ~this.field7724.length >= ~var7) {
                  class515.method3745(0, this.field7713, 32165, this.field7731 + -1, var6);
               } else {
                  while(true) {
                     class5 var8 = this.field7724[var7];
                     if (var8.method28(this.field7715, this.field7719, this.field7725, this.field7716)) {
                        var6[this.field7731] = var8.field54;
                        this.field7713[this.field7731++] = var8;
                     }

                     ++var7;
                     if (~this.field7724.length >= ~var7) {
                        class515.method3745(0, this.field7713, 32165, this.field7731 + -1, var6);
                        break;
                     }
                  }
               }
            }

            this.field7722 = true;
         }

         if (arg1 != -25909) {
            method3888(30, -88, -16, (byte[])null, -81, (byte[])null, 86, 8, (byte)-80);
         }

         boolean var9 = false;
         if (this.field7722) {
            this.field7722 = false;
            int var10 = this.field7731 - 1;
            if (var4 || ~var10 <= -1) {
               do {
                  boolean var11 = this.field7713[var10].method25(arg0, this.field7723);
                  var9 |= var11;
                  this.field7722 |= !var11;
                  --var10;
               } while(~var10 <= -1);
            }
         }

         return var9;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field7733[5] + (arg0 != null ? field7733[3] : field7733[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3886(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         if (!arg0) {
            ++field7730;
            if (this.field7724 != null) {
               int var3 = 0;
               if (var2) {
                  this.field7724[var3].method30();
                  ++var3;
               }

               while(~var3 > ~this.field7724.length) {
                  this.field7724[var3].method30();
                  ++var3;
               }
            }

            this.field7732 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7733[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method3887(int arg0, int arg1, boolean arg2) {
      try {
         ++field7727;
         boolean var3 = ~(arg0 & 55) != -1 ? class329.method2434((byte)-127, arg1, arg0) : class387.method2929(arg0, 0, arg1);
         if (!arg2) {
            field7720 = -77;
         }

         return var3 | (arg1 & 65536) != 0 | class172.method1400(arg1, 21923, arg0);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7733[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(III[BI[BIIB)V"
   )
   public static final void method3888(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, byte arg8) {
      boolean var9 = client.field4360;

      try {
         ++field7714;
         int var10 = -(arg4 >> 2);
         int var16 = -(arg4 & 3);
         if (arg8 == -44) {
            int var11 = -arg0;
            if (var9 || var11 < 0) {
               label88:
               do {
                  int var12 = var10;
                  int var10001;
                  if (var9) {
                     var10001 = arg7++;
                     arg3[var10001] = (byte)(arg3[var10001] + -arg5[arg2++]);
                     int var17 = arg7++;
                     arg3[var17] = (byte)(arg3[var17] + -arg5[arg2++]);
                     int var18 = arg7++;
                     arg3[var18] = (byte)(arg3[var18] + -arg5[arg2++]);
                     int var19 = arg7++;
                     arg3[var19] = (byte)(arg3[var19] + -arg5[arg2++]);
                     var12 = var10 + 1;
                  }

                  while(true) {
                     while(~var12 > -1) {
                        var10001 = arg7++;
                        arg3[var10001] = (byte)(arg3[var10001] + -arg5[arg2++]);
                        var10001 = arg7++;
                        arg3[var10001] = (byte)(arg3[var10001] + -arg5[arg2++]);
                        var10001 = arg7++;
                        arg3[var10001] = (byte)(arg3[var10001] + -arg5[arg2++]);
                        var10001 = arg7++;
                        arg3[var10001] = (byte)(arg3[var10001] + -arg5[arg2++]);
                        ++var12;
                     }

                     int var13 = var16;
                     if (!var9) {
                        if (var9) {
                           var10001 = arg7++;
                           arg3[var10001] = (byte)(arg3[var10001] + -arg5[arg2++]);
                           var13 = var16 + 1;
                        }

                        while(true) {
                           while(~var13 > -1) {
                              var10001 = arg7++;
                              arg3[var10001] = (byte)(arg3[var10001] + -arg5[arg2++]);
                              ++var13;
                           }

                           arg7 += arg6;
                           arg2 += arg1;
                           if (!var9) {
                              ++var11;
                              continue label88;
                           }

                           ++var13;
                        }
                     }

                     ++var12;
                  }
               } while(var11 < 0);

            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field7733[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7733[3] : field7733[1]) + ',' + arg4 + ',' + (arg5 != null ? field7733[3] : field7733[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3889(byte arg0) {
      try {
         class300.field4107.method3301(25349, class300.field4107.field6424, 1);
         ++field7717;
         class300.field4107.method3301(25349, class300.field4107.field6412, 1);
         class300.field4107.method3301(25349, class300.field4107.field6408, 2);
         class300.field4107.method3301(25349, class300.field4107.field6413, 2);
         class300.field4107.method3301(25349, class300.field4107.field6448, 1);
         class300.field4107.method3301(25349, class300.field4107.field6449, 1);
         class300.field4107.method3301(25349, class300.field4107.field6437, 1);
         class300.field4107.method3301(25349, class300.field4107.field6411, 1);
         class300.field4107.method3301(25349, class300.field4107.field6427, 1);
         class300.field4107.method3301(25349, class300.field4107.field6434, 1);
         class300.field4107.method3301(25349, class300.field4107.field6423, 2);
         class300.field4107.method3301(25349, class300.field4107.field6431, 1);
         class300.field4107.method3301(25349, class300.field4107.field6407, 2);
         class300.field4107.method3301(25349, class300.field4107.field6455, 1);
         class300.field4107.method3301(25349, class300.field4107.field6453, 0);
         int var1 = 78 % ((-7 - arg0) / 52);
         class300.field4107.method3301(25349, class300.field4107.field6421, 0);
         class300.field4107.method3301(25349, class300.field4107.field6436, 2);
         class300.field4107.method3301(25349, class300.field4107.field6429, 0);
         class300.field4107.method3301(25349, class300.field4107.field6450, 0);
         class11.method59(true);
         class300.field4107.method3301(25349, class300.field4107.field6444, 0);
         class300.field4107.method3301(25349, class300.field4107.field6432, 4);
         class793.method5717(5539);
         class85.method760(0);
         class101.field1292 = true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7733[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIIIIIIILha;I)V"
   )
   public final void method3890(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, class66 param9, int param10) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(II)Lkda;"
   )
   public static final class412 method3891(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field7726;
         class412[] var3 = class704.method5127(arg0 + 127);
         int var4 = arg0;
         if (!var2 && ~var3.length >= ~arg0) {
            return null;
         } else {
            do {
               class412 var5 = var3[var4];
               if (var5.field5947 == arg1) {
                  return var5;
               }

               ++var4;
            } while(~var3.length < ~var4);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7733[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "<init>",
      descriptor = "(I[Ldc;IIII)V"
   )
   public class540(int arg0, class5[] arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field7718 = arg0;
         this.field7724 = arg1;
         this.field7719 = arg4;
         this.field7715 = arg3;
         this.field7725 = arg5;
         if (arg1 == null) {
            this.field7713 = null;
            this.field7723 = null;
         } else {
            this.field7713 = new class5[arg1.length];
            this.field7723 = arg2 < 0 ? null : arg1[arg2];
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7733[7] + arg0 + ',' + (arg1 != null ? field7733[3] : field7733[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3892(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3893(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
