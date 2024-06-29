import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class214 {
   @OriginalMember(
      owner = "client!ph",
      name = "b",
      descriptor = "Liw;"
   )
   public class107 field3062 = new class107(20);
   @OriginalMember(
      owner = "client!ph",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field3065 = new class107(64);
   @OriginalMember(
      owner = "client!ph",
      name = "g",
      descriptor = "Lsa;"
   )
   public class39 field3063;
   @OriginalMember(
      owner = "client!ph",
      name = "c",
      descriptor = "Lsa;"
   )
   private class39 field3059;
   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3066 = new String[]{method1851(method1850("\r:)$")), method1851(method1850("\u0018akf2")), method1851(method1850("\u0013'kt&\r&1vg")), method1851(method1850("\u0013'k\fg")), method1851(method1850("\u0013'k\ng")), method1851(method1850("\u0013'k\tg")), method1851(method1850("\u0013'k\rg")), method1851(method1850("\u0013'k\u000bg"))};
   @OriginalMember(
      owner = "client!ph",
      name = "h",
      descriptor = "I"
   )
   public static int field3057;
   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "I"
   )
   public static int field3058;
   @OriginalMember(
      owner = "client!ph",
      name = "f",
      descriptor = "I"
   )
   public static int field3060;
   @OriginalMember(
      owner = "client!ph",
      name = "i",
      descriptor = "I"
   )
   public static int field3061;
   @OriginalMember(
      owner = "client!ph",
      name = "d",
      descriptor = "I"
   )
   public static int field3064;

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1845(int arg0) {
      try {
         if (arg0 != 46) {
            this.field3063 = null;
         }

         class107 var2 = this.field3065;
         synchronized(this.field3065) {
            this.field3065.method1052(true);
         }

         ++field3064;
         class107 var3 = this.field3062;
         synchronized(this.field3062) {
            this.field3062.method1052(true);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3066[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1846(int arg0, int arg1) {
      try {
         ++field3057;
         class107 var3 = this.field3065;
         synchronized(this.field3065) {
            this.field3065.method1048(arg1, arg0 + -8540);
         }

         class107 var4 = this.field3062;
         synchronized(this.field3062) {
            this.field3062.method1048(arg1, -8543);
            if (arg0 != -3) {
               this.method1845(-41);
            }

         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3066[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1847(byte arg0) {
      try {
         ++field3058;
         class107 var2 = this.field3065;
         synchronized(this.field3065) {
            this.field3065.method1045(3);
         }

         class107 var3 = this.field3062;
         synchronized(this.field3062) {
            this.field3062.method1045(3);
            if (arg0 != 43) {
               this.field3059 = null;
            }

         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3066[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(IB)Lhia;"
   )
   public final class197 method1848(int arg0, byte arg1) {
      try {
         ++field3061;
         class107 var3 = this.field3065;
         class197 var4;
         synchronized(this.field3065) {
            var4 = (class197)this.field3065.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field3059;
            byte[] var6;
            synchronized(this.field3059) {
               var6 = this.field3059.method460((byte)-11, arg0, 46);
            }

            class197 var7 = new class197();
            var7.field2856 = this;
            if (arg1 != -26) {
               return null;
            } else {
               if (var6 != null) {
                  var7.method1727(-7, new class65(var6));
               }

               class107 var8 = this.field3065;
               synchronized(this.field3065) {
                  this.field3065.method1050(arg1 ^ 80, var7, (long)arg0);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field3066[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1849(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg3 & arg1;
         ++field3060;
         if (~var6 == -1) {
            return arg0;
         } else if (~var6 == -2) {
            return arg2;
         } else {
            return ~var6 == -3 ? -arg0 + 4095 : -arg2 + 4095;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3066[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lsa;)V"
   )
   public class214(class392 arg0, int arg1, class39 arg2, class39 arg3) {
      try {
         this.field3063 = arg3;
         this.field3059 = arg2;
         this.field3059.method434((byte)-106, 46);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3066[2] + (arg0 != null ? field3066[1] : field3066[0]) + ',' + arg1 + ',' + (arg2 != null ? field3066[1] : field3066[0]) + ',' + (arg3 != null ? field3066[1] : field3066[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1850(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1851(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
