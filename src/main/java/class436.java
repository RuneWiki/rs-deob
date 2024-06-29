import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class436 {
   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "I"
   )
   public int field6656;
   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6660 = new String[]{method3310(method3309("tO\u007f/PIU#2Q}\t")), method3310(method3309("tO\u007f\u001a\u0017")), method3310(method3309("a\u000f\u007fuB")), method3310(method3309("iD%/VtF\"f")), method3310(method3309("!\u0001\u001c:G7`6>\u0002")), method3310(method3309("tT=7")), method3310(method3309("yN>0V\u007fI>(K")), method3310(method3309("!\u0001'>MiH>5\u0002+\u001aq+^nIlt\u0004:E>6^sOl")), method3310(method3309("!\u0001\u0014#OsS4(\u0002NI$w\u001f*\u0010|\u0011^t\f`b\b*\u0001ak\u0005*\u0011kk\u000f:f\u001c\u000f\u0004:l0#\u0012[F4f\u000f")), method3310(method3309("~N2.R\u007fO%u\\uN:2Z'\u0003")), method3310(method3309("yN>0V\u007fQ#>YsY")), method3310(method3309("!\u0001\u0014#OsS4(\u0002")), method3310(method3309("tO\u007fgVtH%e\u0017")), method3310(method3309("tO\u007f\u0018\u0017")), method3310(method3309("tO\u007f\u0019\u0017"))};
   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "Lvh;"
   )
   public static class378 field6657 = new class378();
   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "I"
   )
   public static int field6654;
   @OriginalMember(
      owner = "client!nn",
      name = "d",
      descriptor = "I"
   )
   public static int field6655;
   @OriginalMember(
      owner = "client!nn",
      name = "f",
      descriptor = "I"
   )
   public static int field6658;
   @OriginalMember(
      owner = "client!nn",
      name = "e",
      descriptor = "I"
   )
   public static int field6659;

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method3306(int arg0, int arg1, int arg2) {
      try {
         int var3 = 117 / ((arg1 - -64) / 40);
         ++field6658;
         return ~(256 & arg0) != -1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6660[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 15
   )
   public final String toString() {
      try {
         ++field6654;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6660[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(I)V",
      line = 30
   )
   public static void method3307(int arg0) {
      try {
         field6657 = null;
         if (arg0 != 0) {
            method3307(59);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6660[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(BLjava/lang/String;)V",
      line = 43
   )
   public static final void method3308(byte arg0, String arg1) {
      try {
         class37.field401 = arg1;
         ++field6655;
         if (class238.field3003 != null) {
            if (arg0 >= -45) {
               field6659 = 70;
            }

            try {
               String var4;
               label29: {
                  String var2 = class238.field3003.getParameter(field6660[10]);
                  String var3 = class238.field3003.getParameter(field6660[6]);
                  var4 = var2 + field6660[3] + arg1 + field6660[7] + var3;
                  if (arg1.length() != 0) {
                     var4 = var4 + field6660[11] + class144.method1196(94608000000L + class188.method1462(true), (byte)13) + field6660[4] + 94608000L;
                     if (client.field4530 == 0) {
                        break label29;
                     }
                  }

                  var4 = var4 + field6660[8];
               }

               class359.method2805(class238.field3003, -21847, field6660[9] + var4 + "\"");
            } catch (Throwable var6) {
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6660[1] + arg0 + ',' + (arg1 != null ? field6660[2] : field6660[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      line = 81
   )
   public class436(String arg0, String arg1, String arg2, int arg3) {
      try {
         this.field6656 = arg3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6660[12] + (arg0 != null ? field6660[2] : field6660[5]) + ',' + (arg1 != null ? field6660[2] : field6660[5]) + ',' + (arg2 != null ? field6660[2] : field6660[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3309(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3310(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
