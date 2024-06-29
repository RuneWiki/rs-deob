import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class594 implements class475 {
   @OriginalMember(
      owner = "client!cv",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private String field8753;
   @OriginalMember(
      owner = "client!cv",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field8760;
   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8761 = new String[]{method4363(method4362("/H7f\u001a")), method4363(method4362("7\u00107t\u000e:\u000fmvO")), method4363(method4362(":\u0013u$")), method4363(method4362("7\u00107\u000bO")), method4363(method4362("7\u00107\fO")), method4363(method4362("t\u0015|+\b:\u0002jfIz")), method4363(method4362("\u0004\u0007l;\u000e:\u00019.\b&F")), method4363(method4362("7\u00107\nO")), method4363(method4362("$\u0007l;\u0002")), method4363(method4362("7\u00107\tO"))};
   @OriginalMember(
      owner = "client!cv",
      name = "h",
      descriptor = "[Lsr;"
   )
   public static class263[] field8758 = new class263[8];
   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "[Lmba;"
   )
   public static class441[] field8756 = new class441[14];
   @OriginalMember(
      owner = "client!cv",
      name = "e",
      descriptor = "I"
   )
   public static int field8754;
   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "I"
   )
   public static int field8755;
   @OriginalMember(
      owner = "client!cv",
      name = "d",
      descriptor = "I"
   )
   public static int field8759;
   @OriginalMember(
      owner = "client!cv",
      name = "f",
      descriptor = "Lfc;"
   )
   public static class270 field8757;

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(I)Lam;",
      line = 3
   )
   public final class658 method1241(int arg0) {
      try {
         if (arg0 != -1321) {
            method4361((String[])null, false);
         }

         ++field8755;
         return class658.field9548;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8761[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(I)V",
      line = 15
   )
   public static void method4360(int arg0) {
      try {
         if (arg0 != 8) {
            field8756 = null;
         }

         field8758 = null;
         field8757 = null;
         field8756 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8761[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "([Ljava/lang/String;Z)V",
      line = 28
   )
   public static final void method4361(String[] arg0, boolean arg1) {
      int var2 = client.field4530;

      try {
         if (!arg1) {
            field8757 = null;
         }

         ++field8759;
         if (arg0.length <= 1) {
            class763.field11211 = class763.field11211 + arg0[0];
            class188.field2348 += arg0[0].length();
         } else {
            int var3 = 0;
            int var4;
            if (var2 != 0) {
               if (arg0[var3].startsWith(field8761[8])) {
                  var4 = 5;

                  try {
                     var4 = Integer.parseInt(arg0[var3].substring(6));
                  } catch (Exception var7) {
                  }

                  class335.method2539((byte)-110, field8761[6] + var4 + field8761[5]);
                  class192.field2388 = arg0;
                  class242.field3075 = var3 - -1;
                  class572.field8519 = class188.method1462(true) - -((long)(var4 * 1000));
                  return;
               }

               class763.field11211 = arg0[var3];
               class120.method1003(false, -21093);
               ++var3;
            }

            while(true) {
               while(var3 < arg0.length) {
                  if (arg0[var3].startsWith(field8761[8])) {
                     var4 = 5;

                     try {
                        var4 = Integer.parseInt(arg0[var3].substring(6));
                     } catch (Exception var6) {
                     }

                     class335.method2539((byte)-110, field8761[6] + var4 + field8761[5]);
                     class192.field2388 = arg0;
                     class242.field3075 = var3 - -1;
                     class572.field8519 = class188.method1462(true) - -((long)(var4 * 1000));
                     return;
                  }

                  class763.field11211 = arg0[var3];
                  class120.method1003(false, -21093);
                  ++var3;
               }

               if (var2 == 0) {
                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8761[7] + (arg0 != null ? field8761[0] : field8761[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(B)I",
      line = 80
   )
   public final int method1242(byte arg0) {
      try {
         int var2 = -128 % ((arg0 - 45) / 44);
         ++field8754;
         return this.field8760.method3886(119, this.field8753) ? 100 : this.field8760.method3900(true, this.field8753);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8761[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "<init>",
      descriptor = "(Leaa;Ljava/lang/String;)V",
      line = 102
   )
   public class594(class526 arg0, String arg1) {
      try {
         this.field8753 = arg1;
         this.field8760 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8761[1] + (arg0 != null ? field8761[0] : field8761[2]) + ',' + (arg1 != null ? field8761[0] : field8761[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4362(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4363(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
