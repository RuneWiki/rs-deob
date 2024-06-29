import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class170 {
   @OriginalMember(
      owner = "client!aq",
      name = "i",
      descriptor = "I"
   )
   private int field2112;
   @OriginalMember(
      owner = "client!aq",
      name = "d",
      descriptor = "[Ldl;"
   )
   private class70[] field2109;
   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2114 = new String[]{method1373(method1372("w%1n\t")), method1373(method1372("mz1\u0004\\")), method1373(method1372("x!sF")), method1373(method1372("w%1m\t")), method1373(method1372("w%1h\t")), method1373(method1372("w%1l\t")), method1373(method1372("w%1i\t")), method1373(method1372("w%1\u0016Hx=k\u0014\t")), method1373(method1372("w%1k\t"))};
   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "I"
   )
   public static int field2104;
   @OriginalMember(
      owner = "client!aq",
      name = "c",
      descriptor = "I"
   )
   public static int field2106;
   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "I"
   )
   public static int field2107;
   @OriginalMember(
      owner = "client!aq",
      name = "f",
      descriptor = "I"
   )
   public static int field2108;
   @OriginalMember(
      owner = "client!aq",
      name = "h",
      descriptor = "I"
   )
   public static int field2113;
   @OriginalMember(
      owner = "client!aq",
      name = "g",
      descriptor = "J"
   )
   private long field2111;
   @OriginalMember(
      owner = "client!aq",
      name = "j",
      descriptor = "Llda;"
   )
   public static class511 field2105;
   @OriginalMember(
      owner = "client!aq",
      name = "e",
      descriptor = "Ldl;"
   )
   private class70 field2110;

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(III)I",
      line = 6
   )
   public static final int method1365(int arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         if (arg0 != 4096) {
            method1367(122, true, -79, 47, -1.0500547F, 84, 78, -114);
         }

         if (~arg1 > ~arg2) {
            int var4 = arg1;
            arg1 = arg2;
            arg2 = var4;
         }

         ++field2113;
         int var5;
         if (var3 != 0) {
            var5 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var5;
         }

         while(true) {
            int var10000;
            if (~arg2 == -1) {
               var10000 = arg1;
               if (var3 == 0) {
                  return arg1;
               }
            } else {
               var10000 = arg1 % arg2;
            }

            var5 = var10000;
            arg1 = arg2;
            arg2 = var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2114[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(Lmca;)V",
      line = 35
   )
   public static final void method1366(class33 arg0) {
      if (class48.field579 < 65535) {
         class744 var1 = arg0.field356;
         class535.field7812[class48.field579] = arg0;
         class442.field6736[class48.field579] = false;
         ++class48.field579;
         int var2 = arg0.field371;
         if (arg0.field369) {
            var2 = 0;
         }

         int var3 = arg0.field371;
         if (arg0.field365) {
            var3 = class424.field6437 - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = var1.method5425((byte)-81) - var1.method5424(34065) + class572.field8520 >> class459.field6950;
            if (var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = var1.method5425((byte)-81) + var1.method5424(34065) - class572.field8520 >> class459.field6950;
            if (var7 >= class220.field2796) {
               var7 = class220.field2796 - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = arg0.field368[var5++];
               int var10 = (var1.method5420(true) - var1.method5424(34065) + class572.field8520 >> class459.field6950) + (var9 >>> 8);
               int var11 = (var9 & 255) + var10 - 1;
               if (var10 < 0) {
                  var10 = 0;
               }

               if (var11 >= class239.field3036) {
                  var11 = class239.field3036 - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = class544.field8093[var4][var12][var8];
                  if ((var13 & 65535L) == 0L) {
                     class544.field8093[var4][var12][var8] = var13 | (long)class48.field579;
                  } else if ((var13 & 4294901760L) == 0L) {
                     class544.field8093[var4][var12][var8] = var13 | (long)class48.field579 << 16;
                  } else if ((var13 & 281470681743360L) == 0L) {
                     class544.field8093[var4][var12][var8] = var13 | (long)class48.field579 << 32;
                  } else if ((var13 & -281474976710656L) == 0L) {
                     class544.field8093[var4][var12][var8] = var13 | (long)class48.field579 << 48;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(IZIIFIII)[I",
      line = 130
   )
   public static final int[] method1367(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
      try {
         ++field2107;
         int[] var8 = new int[arg0];
         class309 var9 = new class309();
         var9.field4393 = arg1;
         var9.field4387 = arg3;
         var9.field4400 = arg7;
         var9.field4392 = arg6;
         var9.field4386 = arg5;
         var9.field4384 = (int)(arg4 * 4096.0F);
         var9.method708((byte)-118);
         if (arg2 > -87) {
            return null;
         } else {
            class92.method845(1, -1115237556, arg0);
            var9.method2335(var8, (byte)81, 0);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field2114[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "b",
      descriptor = "(I)V",
      line = 158
   )
   public static void method1368(int arg0) {
      try {
         int var1 = -85 % ((arg0 - 15) / 33);
         field2105 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2114[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(ZLdl;J)V",
      line = 175
   )
   public final void method1369(boolean arg0, class70 arg1, long arg2) {
      try {
         ++field2108;
         if (arg0) {
            if (arg1.field878 != null) {
               arg1.method699(12);
            }

            class70 var5 = this.field2109[(int)(arg2 & (long)(this.field2112 + -1))];
            arg1.field881 = var5;
            arg1.field878 = var5.field878;
            arg1.field878.field881 = arg1;
            arg1.field882 = arg2;
            arg1.field881.field878 = arg1;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2114[0] + arg0 + ',' + (arg1 != null ? field2114[1] : field2114[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(JI)Ldl;",
      line = 202
   )
   public final class70 method1370(long arg0, int arg1) {
      int var4 = client.field4530;

      try {
         ++field2104;
         this.field2111 = arg0;
         if (arg1 != 0) {
            this.field2110 = null;
         }

         class70 var5 = this.field2109[(int)(arg0 & (long)(this.field2112 - 1))];
         this.field2110 = var5.field881;
         class70 var6;
         if (var4 != 0) {
            if (~this.field2110.field882 == ~arg0) {
               var6 = this.field2110;
               this.field2110 = this.field2110.field881;
               return var6;
            }

            this.field2110 = this.field2110.field881;
         }

         while(true) {
            while(this.field2110 != var5) {
               if (~this.field2110.field882 == ~arg0) {
                  var6 = this.field2110;
                  this.field2110 = this.field2110.field881;
                  return var6;
               }

               this.field2110 = this.field2110.field881;
            }

            this.field2110 = null;
            if (var4 == 0) {
               return null;
            }

            this.field2110 = this.field2110.field881;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2114[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "<init>",
      descriptor = "(I)V",
      line = 231
   )
   public class170(int arg0) {
      try {
         this.field2112 = arg0;
         this.field2109 = new class70[arg0];

         for(int var2 = 0; ~var2 > ~arg0; ++var2) {
            class70 var3 = this.field2109[var2] = new class70();
            var3.field878 = var3;
            var3.field881 = var3;
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2114[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(I)Ldl;",
      line = 259
   )
   public final class70 method1371(int arg0) {
      int var2 = client.field4530;

      try {
         ++field2106;
         if (arg0 != -15141) {
            return null;
         } else if (this.field2110 == null) {
            return null;
         } else {
            class70 var3 = this.field2109[(int)(this.field2111 & (long)(this.field2112 + -1))];
            class70 var4;
            if (var2 != 0) {
               if (this.field2110.field882 == this.field2111) {
                  var4 = this.field2110;
                  this.field2110 = this.field2110.field881;
                  return var4;
               }

               this.field2110 = this.field2110.field881;
            }

            while(true) {
               while(this.field2110 != var3) {
                  if (this.field2110.field882 == this.field2111) {
                     var4 = this.field2110;
                     this.field2110 = this.field2110.field881;
                     return var4;
                  }

                  this.field2110 = this.field2110.field881;
               }

               this.field2110 = null;
               if (var2 == 0) {
                  return null;
               }

               this.field2110 = this.field2110.field881;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2114[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
