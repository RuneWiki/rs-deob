import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class590 {
   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8703 = new String[]{method4295(method4294("\u0012T\"\n_L")), method4295(method4294("\fI7T$K\u0012")), method4295(method4294("\u0013J4\ti\u0010J*T")), method4295(method4294("\u0013J4\ti\u0010O ")), method4295(method4294("J^,I1\b\u0000")), method4295(method4294("\u0013J4")), method4295(method4294("\u0013J4\ti\u0010L\"")), method4295(method4294("K\\~")), method4295(method4294("KM~")), method4295(method4294("\u0012T\"\n]L")), method4295(method4294("\u0012T\"\n\\L"))};
   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8700;
   @OriginalMember(
      owner = "client!via",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8698;
   @OriginalMember(
      owner = "client!via",
      name = "e",
      descriptor = "I"
   )
   public static int field8701;
   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "Lek;"
   )
   public static class536 field8702;
   @OriginalMember(
      owner = "client!via",
      name = "c",
      descriptor = "I"
   )
   public static int field8696;
   @OriginalMember(
      owner = "client!via",
      name = "f",
      descriptor = "I"
   )
   public static int field8697;
   @OriginalMember(
      owner = "client!via",
      name = "g",
      descriptor = "I"
   )
   public static int field8699;

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4291(byte arg0) {
      try {
         field8700 = null;
         if (arg0 == -21) {
            field8702 = null;
            field8698 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8703[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method4292(int arg0, boolean arg1) {
      try {
         class697.field10218 = 100;
         class504.field7317 = arg0;
         ++field8696;
         if (!arg1) {
            class592.field8717 = 3;
            class612.field8977 = -1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8703[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method4293(int arg0) {
      boolean var1 = client.field4360;

      try {
         String var2;
         label38: {
            ++field8697;
            var2 = field8703[5];
            if (class290.field4016 == class161.field2298) {
               var2 = field8703[3];
               if (!var1) {
                  break label38;
               }
            }

            if (class408.field5903 == class290.field4016) {
               var2 = field8703[6];
               if (!var1) {
                  break label38;
               }
            }

            if (class644.field9405 == class290.field4016) {
               var2 = field8703[2];
            }
         }

         String var3 = "";
         if (arg0 != 100) {
            return null;
         } else {
            if (class612.field8975 != null) {
               var3 = field8703[8] + class612.field8975;
            }

            return field8703[1] + var2 + "." + class134.field1715.field10709 + field8703[4] + class608.field8920 + field8703[7] + class564.field8049 + var3 + "/";
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8703[0] + arg0 + ')');
      }
   }

   static {
      String var0 = method4295(method4294("1S(Jq\u0013S"));

      try {
         var0 = System.getProperty(method4295(method4294("\u000e\\5E0\u0012X-@q\u0016"))).toLowerCase();
      } catch (Exception var11) {
      }

      var0.toLowerCase();
      String var1 = method4295(method4294("1S(Jq\u0013S"));

      try {
         var1 = System.getProperty(method4295(method4294("\u000e\\5E0\u0012X1Ww\u000bS"))).toLowerCase();
      } catch (Exception var10) {
      }

      var1.toLowerCase();
      String var2 = method4295(method4294("1S(Jq\u0013S"));

      try {
         var2 = System.getProperty(method4295(method4294("\u000bNmJ\u007f\tX"))).toLowerCase();
      } catch (Exception var9) {
      }

      field8700 = var2.toLowerCase();
      String var3 = method4295(method4294("1S(Jq\u0013S"));

      try {
         var3 = System.getProperty(method4295(method4294("\u000bNmEl\u0007U"))).toLowerCase();
      } catch (Exception var8) {
      }

      field8698 = var3.toLowerCase();
      String var4 = method4295(method4294("1S(Jq\u0013S"));

      try {
         var4 = System.getProperty(method4295(method4294("\u000bNmR{\u0016N*Kp"))).toLowerCase();
      } catch (Exception var7) {
      }

      var4.toLowerCase();
      String var5 = method4295(method4294("\u001a\u0012"));

      try {
         var5 = System.getProperty(method4295(method4294("\u0011N&V0\fR.A"))).toLowerCase();
      } catch (Exception var6) {
      }

      new File(var5);
      field8701 = -1;
      field8702 = new class536(5, 8);
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4294(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4295(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
