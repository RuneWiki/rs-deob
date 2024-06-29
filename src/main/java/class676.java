import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class676 {
   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9798 = new String[]{method4917(method4916("\u007f+J\u0012O")), method4917(method4916("hfJt\u001a")), method4917(method4916("\u007f+J\u001dO")), method4917(method4916("}=\b6")), method4917(method4916("L<\u000b*")), method4917(method4916("L*\b;\tx")), method4917(method4916("\u007f'\u0003=\u0002w'\u0011.")), method4917(method4916("\u007f+J\u0013O")), method4917(method4916("\u007f+J\u001cO"))};
   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field9794 = false;
   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "I"
   )
   public static int field9796;
   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "I"
   )
   public static int field9797;
   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "Lgba;"
   )
   public static class697 field9795;

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method4912(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            ++field9796;
            class483 var3 = class342.field4643[arg2][arg1];
            if (var3 != null) {
               class721.field10540 = var3.field6903;
               class37.field537 = var3.field6907;
               class446.field6349 = var3.field6905;
            }

            class229.method1785((byte)46);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9798[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(ILjava/lang/String;BLnu;Ljava/lang/String;)Lvca;"
   )
   public static final class296 method4913(int arg0, String arg1, byte arg2, class619 arg3, String arg4) {
      try {
         ++field9797;
         if (arg0 == 0) {
            return arg3.method4492(arg1, 0);
         } else {
            if (arg2 > -52) {
               field9794 = false;
            }

            if (~arg0 == -2) {
               try {
                  Object var5 = class548.method3932(arg4, 1082, class216.field3093, new Object[]{(new URL(class216.field3093.getCodeBase(), arg1)).toString()});
                  if (var5 == null) {
                     throw new RuntimeException();
                  } else {
                     class296 var6 = new class296();
                     var6.field4078 = 1;
                     return var6;
                  }
               } catch (Throwable var13) {
                  class296 var7 = new class296();
                  var7.field4078 = 2;
                  return var7;
               }
            } else if (~arg0 == -3) {
               try {
                  class216.field3093.getAppletContext().showDocument(new URL(class216.field3093.getCodeBase(), arg1), field9798[5]);
                  class296 var8 = new class296();
                  var8.field4078 = 1;
                  return var8;
               } catch (Exception var14) {
                  class296 var9 = new class296();
                  var9.field4078 = 2;
                  return var9;
               }
            } else if (arg0 == 3) {
               try {
                  class548.method3934(class216.field3093, false, field9798[6]);
               } catch (Throwable var16) {
               }

               try {
                  class216.field3093.getAppletContext().showDocument(new URL(class216.field3093.getCodeBase(), arg1), field9798[4]);
                  class296 var10 = new class296();
                  var10.field4078 = 1;
                  return var10;
               } catch (Exception var15) {
                  class296 var11 = new class296();
                  var11.field4078 = 2;
                  return var11;
               }
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field9798[2] + arg0 + ',' + (arg1 != null ? field9798[1] : field9798[3]) + ',' + arg2 + ',' + (arg3 != null ? field9798[1] : field9798[3]) + ',' + (arg4 != null ? field9798[1] : field9798[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4914(int arg0) {
      try {
         field9795 = null;
         if (arg0 != -19702) {
            method4913(-98, (String)null, (byte)118, (class619)null, (String)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9798[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method4915(long arg0, long arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9798[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4916(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4917(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
