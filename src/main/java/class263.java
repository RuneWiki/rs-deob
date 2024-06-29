import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class263 extends class550 {
   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4329 = new String[]{method2286(method2285("7s;UC")), method2286(method2285("(9;2\u0016")), method2286(method2285("\"(y\u0017")), method2286(method2285("(9;9\u0016")), method2286(method2285("(9;4\u0016")), method2286(method2285("(9;:\u0016")), method2286(method2285("(9;=\u0016")), method2286(method2285("(9;7\u0016")), method2286(method2285("(9;>\u0016")), method2286(method2285("(9;5\u0016")), method2286(method2285("(9;8\u0016"))};
   @OriginalMember(
      owner = "client!dd",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field4319 = new int[2];
   @OriginalMember(
      owner = "client!dd",
      name = "o",
      descriptor = "Let;"
   )
   public static class389 field4321 = new class389(32);
   @OriginalMember(
      owner = "client!dd",
      name = "q",
      descriptor = "Ljava/util/zip/CRC32;"
   )
   public static CRC32 field4325 = new CRC32();
   @OriginalMember(
      owner = "client!dd",
      name = "u",
      descriptor = "Luk;"
   )
   public static class498 field4327 = new class498(55, -2);
   @OriginalMember(
      owner = "client!dd",
      name = "v",
      descriptor = "I"
   )
   public static int field4315;
   @OriginalMember(
      owner = "client!dd",
      name = "m",
      descriptor = "I"
   )
   public static int field4316;
   @OriginalMember(
      owner = "client!dd",
      name = "l",
      descriptor = "I"
   )
   public static int field4317;
   @OriginalMember(
      owner = "client!dd",
      name = "s",
      descriptor = "I"
   )
   public static int field4318;
   @OriginalMember(
      owner = "client!dd",
      name = "n",
      descriptor = "I"
   )
   public static int field4320;
   @OriginalMember(
      owner = "client!dd",
      name = "t",
      descriptor = "I"
   )
   public static int field4322;
   @OriginalMember(
      owner = "client!dd",
      name = "k",
      descriptor = "I"
   )
   public static int field4323;
   @OriginalMember(
      owner = "client!dd",
      name = "p",
      descriptor = "I"
   )
   public static int field4324;
   @OriginalMember(
      owner = "client!dd",
      name = "j",
      descriptor = "I"
   )
   public static int field4326;
   @OriginalMember(
      owner = "client!dd",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field4328;

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(BII)V",
      line = 3
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 == 90) {
            ++field4326;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4329[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "f",
      descriptor = "(B)Ldia;",
      line = 13
   )
   public static final class566 method2282(byte arg0) {
      boolean var1 = client.field1786;

      try {
         if (arg0 >= -47) {
            return null;
         } else {
            ++field4315;
            class566 var2 = (class566)class553.field8273.method3688(true);
            if (var2 != null) {
               var2.method2477(1976);
               var2.method2495(-24134);
               return var2;
            } else {
               label33:
               while(true) {
                  class566 var3 = (class566)class77.field1017.method3688(true);
                  if (var3 == null) {
                     return null;
                  }

                  class566 var10000 = var3;

                  do {
                     if (var10000.method4264((byte)90) > class162.method1442(14080)) {
                        return null;
                     }

                     var3.method2477(1976);
                     var3.method2495(-24134);
                     if ((var3.field4684 & Long.MIN_VALUE) == 0L) {
                        continue label33;
                     }

                     var10000 = var3;
                  } while(var1);

                  return var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4329[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "b",
      descriptor = "(I)V",
      line = 56
   )
   public final void method72(int arg0) {
      try {
         if (arg0 == -2) {
            ++field4316;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4329[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "g",
      descriptor = "(I)V",
      line = 67
   )
   public static void method2283(int arg0) {
      try {
         field4321 = null;
         field4319 = null;
         if (arg0 != 32) {
            field4328 = true;
         }

         field4327 = null;
         field4325 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4329[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(ZB)V",
      line = 80
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         ++field4323;
         if (arg1 >= -44) {
            this.method71(-55, (byte)-50, (class428)null);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4329[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "c",
      descriptor = "(B)Z",
      line = 91
   )
   public final boolean method69(byte arg0) {
      try {
         ++field4318;
         return arg0 != 120 ? false : false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4329[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(BZ)V",
      line = 110
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         ++field4320;
         if (arg0 <= 82) {
            this.method78((byte)-38, false);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4329[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "<init>",
      descriptor = "(Lmu;)V",
      line = 120
   )
   public class263(class258 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dd",
      name = "e",
      descriptor = "(B)V",
      line = 127
   )
   public static final void method2284(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field4317;
         class372 var2 = (class372)class777.field11405.method4972((byte)-84);
         if (arg0 <= 66) {
            method2284((byte)49);
            if (!var1 && var2 == null) {
               return;
            }
         } else if (var2 == null) {
            return;
         }

         do {
            label40: {
               class207 var3 = var2.field5760;
               var3.method1805(class359.field5557, 2048);
               if (!var3.method1809((byte)118)) {
                  if (!var3.method1807((byte)119)) {
                     break label40;
                  }

                  class363.method2960(var3, true);
                  if (!var1) {
                     break label40;
                  }
               }

               var2.method2477(1976);
               var3.method1803(0);
            }

            var2 = (class372)class777.field11405.method4975((byte)99);
         } while(var2 != null);

      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4329[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(IBLwm;)V",
      line = 166
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         super.field8234.method2193(arg2, (byte)-19);
         ++field4322;
         int var4 = -41 % ((18 - arg1) / 60);
         super.field8234.method2255(arg0, (byte)90);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4329[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4329[0] : field4329[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2285(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2286(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
