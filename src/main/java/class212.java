import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class212 implements Runnable {
   @OriginalMember(
      owner = "client!dd",
      name = "r",
      descriptor = "Lqda;"
   )
   private class677 field3037 = new class112();
   @OriginalMember(
      owner = "client!dd",
      name = "n",
      descriptor = "Lqda;"
   )
   private class677 field3041 = null;
   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3050 = new String[]{method1843(method1842("\u0017\u0019F\u001fW")), method1843(method1842("\bSFs\u0002")), method1843(method1842("\u001d\b\u00041")), method1843(method1842("\u0017\u0019F\u0017W")), method1843(method1842("\u0017\u0019F\u0016W")), method1843(method1842("\u0017\u0019F/\n\u001dU")), method1843(method1842("SU:8\u001c\u001c\u000b\r/\u001a\u0017TH")), method1843(method1842("\u0017\u0019F\u001aW")), method1843(method1842("\u0017\u0019F\u0019W")), method1843(method1842("\u0017\u0019F\u0011W")), method1843(method1842("\u0017\u0019F\u0010W")), method1843(method1842("\u0017\u0019F\u001eW")), method1843(method1842("\u0017\u0019F\u001cW")), method1843(method1842("\u0017\u0019F\u0018W")), method1843(method1842("\u0003\u001c\u001d.\u001a")), method1843(method1842("#\u001c\u001d.\u0016\u001d\u001aH;\u0010\u0001]")), method1843(method1842("\u0017\u0019F\u001bW")), method1843(method1842("S\u000e\r>\u0010\u001d\u0019\u001bsQ]")), method1843(method1842("\u0017\u0019F\u0014W")), method1843(method1842("\u0017\u0019F\u0015W"))};
   @OriginalMember(
      owner = "client!dd",
      name = "c",
      descriptor = "I"
   )
   public static int field3025 = 0;
   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field3027 = new class724(101, 1);
   @OriginalMember(
      owner = "client!dd",
      name = "p",
      descriptor = "I"
   )
   public static int field3026;
   @OriginalMember(
      owner = "client!dd",
      name = "q",
      descriptor = "I"
   )
   public static int field3028;
   @OriginalMember(
      owner = "client!dd",
      name = "i",
      descriptor = "I"
   )
   public static int field3029;
   @OriginalMember(
      owner = "client!dd",
      name = "l",
      descriptor = "I"
   )
   public static int field3030;
   @OriginalMember(
      owner = "client!dd",
      name = "v",
      descriptor = "I"
   )
   public static int field3031;
   @OriginalMember(
      owner = "client!dd",
      name = "y",
      descriptor = "I"
   )
   public static int field3032;
   @OriginalMember(
      owner = "client!dd",
      name = "k",
      descriptor = "I"
   )
   public static int field3035;
   @OriginalMember(
      owner = "client!dd",
      name = "o",
      descriptor = "I"
   )
   public static int field3036;
   @OriginalMember(
      owner = "client!dd",
      name = "u",
      descriptor = "I"
   )
   public static int field3039;
   @OriginalMember(
      owner = "client!dd",
      name = "w",
      descriptor = "I"
   )
   private int field3040;
   @OriginalMember(
      owner = "client!dd",
      name = "e",
      descriptor = "I"
   )
   public static int field3042;
   @OriginalMember(
      owner = "client!dd",
      name = "m",
      descriptor = "I"
   )
   public static int field3044;
   @OriginalMember(
      owner = "client!dd",
      name = "d",
      descriptor = "I"
   )
   public static int field3045;
   @OriginalMember(
      owner = "client!dd",
      name = "f",
      descriptor = "I"
   )
   private int field3047;
   @OriginalMember(
      owner = "client!dd",
      name = "t",
      descriptor = "I"
   )
   public static int field3049;
   @OriginalMember(
      owner = "client!dd",
      name = "s",
      descriptor = "J"
   )
   private long field3038;
   @OriginalMember(
      owner = "client!dd",
      name = "g",
      descriptor = "J"
   )
   private long field3046;
   @OriginalMember(
      owner = "client!dd",
      name = "x",
      descriptor = "Leba;"
   )
   private class489 field3048;
   @OriginalMember(
      owner = "client!dd",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   private String field3043;
   @OriginalMember(
      owner = "client!dd",
      name = "h",
      descriptor = "Z"
   )
   private volatile boolean field3033;
   @OriginalMember(
      owner = "client!dd",
      name = "j",
      descriptor = "Z"
   )
   private boolean field3034;

   @OriginalMember(
      owner = "client!dd",
      name = "g",
      descriptor = "(I)I"
   )
   public final int method1829(int arg0) {
      try {
         ++field3039;
         if (arg0 != 255) {
            field3027 = null;
         }

         return this.field3047;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3050[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1830(int arg0) {
      try {
         ++field3030;
         if (this.field3048 == null) {
            return 0;
         } else {
            int var2 = this.field3048.method3720((byte)-19);
            if (this.field3048.field6972 && this.field3048.field6976 > this.field3040) {
               return this.field3040 - -1;
            } else if (~var2 <= -1 && ~var2 > ~(class653.field9254.length + -1)) {
               if (arg0 > -57) {
                  this.method1835(0);
               }

               return ~this.field3048.field6979 == ~this.field3040 ? this.field3048.field6976 : this.field3048.field6979;
            } else {
               return 100;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3050[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(Lqda;B)V"
   )
   public final synchronized void method1831(class677 arg0, byte arg1) {
      try {
         ++field3036;
         this.field3041 = this.field3037;
         this.field3037 = arg0;
         int var3 = 5 / ((-48 - arg1) / 56);
         this.field3038 = class604.method4452(29);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3050[3] + (arg0 != null ? field3050[1] : field3050[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method1832(boolean arg0) {
      try {
         this.field3034 = true;
         ++field3029;
         if (arg0) {
            this.field3041 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3050[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method1833(int arg0) {
      try {
         field3027 = null;
         if (arg0 != 11755) {
            field3027 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3050[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method1834(int arg0) {
      try {
         if (arg0 != 31297) {
            this.field3043 = null;
         }

         ++field3042;
         return this.field3040;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3050[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "d",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method1835(int arg0) {
      try {
         ++field3035;
         return arg0 != -1029 ? null : this.field3043;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3050[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1836(byte arg0) {
      try {
         ++field3028;
         int var2 = 86 / ((arg0 - -41) / 50);
         this.field3033 = true;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3050[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(Leba;JILjava/lang/String;B)V"
   )
   public final synchronized void method1837(class489 arg0, long arg1, int arg2, String arg3, byte arg4) {
      try {
         ++field3032;
         this.field3040 = arg2;
         this.field3048 = arg0;
         this.field3046 = arg1;
         this.field3043 = arg3;
         if (arg4 != -67) {
            this.method1836((byte)127);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3050[7] + (arg0 != null ? field3050[1] : field3050[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3050[1] : field3050[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(I)Leba;"
   )
   public final class489 method1838(int arg0) {
      try {
         ++field3044;
         if (arg0 != 100) {
            this.method1830(103);
         }

         return this.field3048;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3050[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "([Ljava/lang/String;B)V"
   )
   public static final void method1839(String[] arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         if (arg1 != 123) {
            field3027 = null;
         }

         ++field3049;
         if (arg0.length <= 1) {
            class772.field11182 = class772.field11182 + arg0[0];
            class454.field6601 += arg0[0].length();
         } else {
            int var3 = 0;
            int var4;
            if (var2) {
               if (arg0[var3].startsWith(field3050[14])) {
                  var4 = 5;

                  try {
                     var4 = Integer.parseInt(arg0[var3].substring(6));
                  } catch (Exception var7) {
                  }

                  class137.method1389(-127, field3050[15] + var4 + field3050[17]);
                  class59.field849 = arg0;
                  class65.field944 = var3 + 1;
                  class522.field7390 = class604.method4452(-112) - -((long)(var4 * 1000));
                  return;
               }

               class772.field11182 = arg0[var3];
               class133.method1367(false, 0);
               ++var3;
            }

            while(true) {
               while(var3 < arg0.length) {
                  if (arg0[var3].startsWith(field3050[14])) {
                     var4 = 5;

                     try {
                        var4 = Integer.parseInt(arg0[var3].substring(6));
                     } catch (Exception var6) {
                     }

                     class137.method1389(-127, field3050[15] + var4 + field3050[17]);
                     class59.field849 = arg0;
                     class65.field944 = var3 + 1;
                     class522.field7390 = class604.method4452(-112) - -((long)(var4 * 1000));
                     return;
                  }

                  class772.field11182 = arg0[var3];
                  class133.method1367(false, 0);
                  ++var3;
               }

               if (!var2) {
                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3050[16] + (arg0 != null ? field3050[1] : field3050[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "e",
      descriptor = "(I)Z"
   )
   public final synchronized boolean method1840(int arg0) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field3031;
            return this.field3037.method1096(true, this.field3038);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3050[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dd",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method1841(int arg0) {
      try {
         if (arg0 < 64) {
            method1833(80);
         }

         ++field3045;
         return this.field3046;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3050[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1842(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1843(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
