import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class253 extends class546 {
   @OriginalMember(
      owner = "client!dt",
      name = "t",
      descriptor = "Z"
   )
   public boolean field3207 = true;
   @OriginalMember(
      owner = "client!dt",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3225 = new String[]{method1930(method1929("'\\c0")), method1930(method1929("2\u0007!r\u0014")), method1930(method1929("-]!\u001fA")), method1930(method1929("-]!\rA")), method1930(method1929("-]!\fA")), method1930(method1929("-]!\u0018A")), method1930(method1929("-]!\u0019A")), method1930(method1929("-]!\u001bA")), method1930(method1929("-]!\u001aA")), method1930(method1929("g\u0007!")), method1930(method1929("-]!\u001eA")), method1930(method1929("-]!\u0015A")), method1930(method1929("-]!\u0014A")), method1930(method1929("-]!\u001dA"))};
   @OriginalMember(
      owner = "client!dt",
      name = "x",
      descriptor = "Z"
   )
   public static boolean field3208 = false;
   @OriginalMember(
      owner = "client!dt",
      name = "F",
      descriptor = "I"
   )
   public static int field3211 = 0;
   @OriginalMember(
      owner = "client!dt",
      name = "J",
      descriptor = "Lbga;"
   )
   public static class378 field3217 = new class378(129, 2);
   @OriginalMember(
      owner = "client!dt",
      name = "C",
      descriptor = "I"
   )
   public static int field3206;
   @OriginalMember(
      owner = "client!dt",
      name = "B",
      descriptor = "I"
   )
   public static int field3213;
   @OriginalMember(
      owner = "client!dt",
      name = "H",
      descriptor = "I"
   )
   public static int field3214;
   @OriginalMember(
      owner = "client!dt",
      name = "I",
      descriptor = "I"
   )
   public static int field3215;
   @OriginalMember(
      owner = "client!dt",
      name = "L",
      descriptor = "I"
   )
   public static int field3218;
   @OriginalMember(
      owner = "client!dt",
      name = "A",
      descriptor = "I"
   )
   public static int field3219;
   @OriginalMember(
      owner = "client!dt",
      name = "u",
      descriptor = "I"
   )
   public static int field3220;
   @OriginalMember(
      owner = "client!dt",
      name = "w",
      descriptor = "I"
   )
   public static int field3221;
   @OriginalMember(
      owner = "client!dt",
      name = "G",
      descriptor = "I"
   )
   public static int field3223;
   @OriginalMember(
      owner = "client!dt",
      name = "y",
      descriptor = "I"
   )
   public static int field3224;
   @OriginalMember(
      owner = "client!dt",
      name = "K",
      descriptor = "Lpg;"
   )
   public class766 field3216;
   @OriginalMember(
      owner = "client!dt",
      name = "D",
      descriptor = "[I"
   )
   private int[] field3209;
   @OriginalMember(
      owner = "client!dt",
      name = "E",
      descriptor = "[I"
   )
   public int[] field3212;
   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field3210;
   @OriginalMember(
      owner = "client!dt",
      name = "v",
      descriptor = "[[I"
   )
   private int[][] field3222;

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method1918(int arg0, int arg1, int arg2) {
      try {
         ++field3206;
         int var4 = 28 % ((60 - arg0) / 32);
         if (this.field3209 != null && ~arg1 <= -1 && arg1 <= this.field3209.length) {
            return this.field3222[arg1] != null && ~arg2 <= -1 && arg2 <= this.field3222[arg1].length ? this.field3222[arg1][arg2] : -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3225[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "e",
      descriptor = "(I)Z"
   )
   public static final boolean method1919(int arg0) {
      try {
         ++field3224;
         if (arg0 != 21583) {
            field3217 = null;
         }

         return ~class445.field6162 <= -2;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3225[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(Lwm;[II)V"
   )
   public final void method1920(class594 arg0, int[] arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field3220;
         if (arg2 >= 76) {
            if (this.field3209 != null) {
               int var5 = 0;
               if (!var4) {
                  if (var5 >= this.field3209.length) {
                     return;
                  }

                  if (arg1.length <= var5) {
                     return;
                  }
               }

               do {
                  int var6 = this.method1927(var5, -91).field10735;
                  if (var6 > 0) {
                     arg0.method4273(var6, (long)arg1[var5], 0);
                  }

                  ++var5;
                  if (var5 >= this.field3209.length) {
                     return;
                  }
               } while(arg1.length > var5);

            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3225[2] + (arg0 != null ? field3225[1] : field3225[0]) + ',' + (arg1 != null ? field3225[1] : field3225[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   public final void method1921(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field3215;
         if (arg1 != -1) {
            this.field3216 = null;
         }

         do {
            int var4 = arg0.method4288((byte)73);
            if (~var4 == -1) {
               break;
            }

            this.method1928(arg0, -119, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3225[4] + (arg0 != null ? field3225[1] : field3225[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "c",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method1922(byte arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 >= -37) {
            return null;
         } else {
            ++field3221;
            StringBuffer var3 = new StringBuffer(80);
            if (this.field3210 == null) {
               return "";
            } else {
               var3.append(this.field3210[0]);
               int var4 = 1;
               if (var2) {
                  var3.append(field3225[9]);
                  var3.append(this.field3210[var4]);
                  ++var4;
               }

               while(true) {
                  while(var4 < this.field3210.length) {
                     var3.append(field3225[9]);
                     var3.append(this.field3210[var4]);
                     ++var4;
                  }

                  if (!var2) {
                     return var3.toString();
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3225[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "b",
      descriptor = "(Lwm;I)Ljava/lang/String;"
   )
   public final String method1923(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field3213;
         StringBuffer var4 = new StringBuffer(80);
         if (this.field3209 != null) {
            int var5 = 0;
            if (var3 || this.field3209.length > var5) {
               do {
                  var4.append(this.field3210[var5]);
                  var4.append(this.field3216.method5494(-72, arg0.method4312(-65, class501.method3617(false, this.field3209[var5]).field10743), this.field3222[var5], this.method1927(var5, arg1 + -32861)));
                  ++var5;
               } while(this.field3209.length > var5);
            }
         }

         var4.append(this.field3210[this.field3210.length - 1]);
         if (arg1 != 32768) {
            this.method1927(-6, 4);
         }

         return var4.toString();
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3225[5] + (arg0 != null ? field3225[1] : field3225[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1924(int arg0) {
      try {
         if (arg0 <= -43) {
            field3217 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3225[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1925(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dt",
      name = "c",
      descriptor = "(Z)I"
   )
   public final int method1926(boolean arg0) {
      try {
         ++field3214;
         if (this.field3209 == null) {
            return 0;
         } else {
            return !arg0 ? 2 : this.field3209.length;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3225[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "b",
      descriptor = "(II)Ldd;"
   )
   public final class735 method1927(int arg0, int arg1) {
      try {
         int var3 = -40 / ((-22 - arg1) / 55);
         ++field3219;
         return this.field3209 != null && ~arg0 <= -1 && ~arg0 >= ~this.field3209.length ? class501.method3617(false, this.field3209[arg0]) : null;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3225[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method1928(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field3223;
         if (arg1 > -13) {
            this.field3210 = null;
         }

         if (arg2 != 1) {
            if (~arg2 == -3) {
               int var5 = arg0.method4288((byte)61);
               this.field3212 = new int[var5];
               int var6 = 0;
               if (var4) {
                  this.field3212[var6] = arg0.method4280(-19104);
                  ++var6;
               }

               while(true) {
                  while(~var5 < ~var6) {
                     this.field3212[var6] = arg0.method4280(-19104);
                     ++var6;
                  }

                  if (!var4) {
                     return;
                  }

                  ++var6;
               }
            }

            if (~arg2 == -4) {
               int var7 = arg0.method4288((byte)89);
               this.field3209 = new int[var7];
               this.field3222 = new int[var7][];
               int var8 = 0;
               if (!var4 && var8 >= var7) {
                  return;
               }

               do {
                  int var9 = arg0.method4280(-19104);
                  class735 var10 = class501.method3617(false, var9);
                  if (var10 == null) {
                     ++var8;
                  } else {
                     this.field3209[var8] = var9;
                     this.field3222[var8] = new int[var10.field10739];
                     int var11 = 0;
                     if (!var4 && ~var10.field10739 >= ~var11) {
                        ++var8;
                     } else {
                        do {
                           this.field3222[var8][var11] = arg0.method4280(-19104);
                           ++var11;
                        } while(~var10.field10739 < ~var11);

                        ++var8;
                     }
                  }
               } while(var8 < var7);

               return;
            }

            if (arg2 == 4) {
               this.field3207 = false;
               return;
            }
         } else {
            this.field3210 = class249.method1870('<', arg0.method4291(-58), false);
         }

      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field3225[12] + (arg0 != null ? field3225[1] : field3225[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1929(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1930(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
