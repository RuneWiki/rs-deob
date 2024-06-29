import java.io.InputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class106 extends InputStream {
   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1292 = new String[]{method920(method919("?>Y{\u000b+9\\}")), method920(method919(" -T9")), method920(method919("\u0011:T4\u0017%")), method920(method919("?>Y{;f")), method920(method919("5v\u0016{\u0004")), method920(method919("\u0011,W%")), method920(method919("\"7_2\u001c*7M!")), method920(method919("?>Y{8f"))};
   @OriginalMember(
      owner = "client!qfa",
      name = "c",
      descriptor = "Lsd;"
   )
   public static class101 field1290 = new class101(117, -1);
   @OriginalMember(
      owner = "client!qfa",
      name = "b",
      descriptor = "I"
   )
   public static int field1289;
   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "I"
   )
   public static int field1291;

   @OriginalMember(
      owner = "client!qfa",
      name = "read",
      descriptor = "()I",
      line = 3
   )
   public final int read() {
      try {
         ++field1289;
         class89.method817(30000L, 2535);
         return -1;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1292[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(Ljava/lang/String;BLhg;ILjava/lang/String;)Ldaa;",
      line = 13
   )
   public static final class12 method917(String arg0, byte arg1, class719 arg2, int arg3, String arg4) {
      try {
         ++field1291;
         if (arg3 == 0) {
            return arg2.method5202(arg0, 0);
         } else if (arg3 == 1) {
            try {
               Object var5 = class359.method2804(class238.field3003, new Object[]{(new URL(class238.field3003.getCodeBase(), arg0)).toString()}, arg4, (byte)118);
               if (var5 == null) {
                  throw new RuntimeException();
               } else {
                  class12 var6 = new class12();
                  var6.field159 = 1;
                  return var6;
               }
            } catch (Throwable var13) {
               class12 var7 = new class12();
               var7.field159 = 2;
               return var7;
            }
         } else if (arg3 == 2) {
            try {
               class238.field3003.getAppletContext().showDocument(new URL(class238.field3003.getCodeBase(), arg0), field1292[2]);
               class12 var8 = new class12();
               var8.field159 = 1;
               return var8;
            } catch (Exception var14) {
               class12 var9 = new class12();
               var9.field159 = 2;
               return var9;
            }
         } else if (arg3 == 3) {
            try {
               class359.method2803(field1292[6], class238.field3003, (byte)-86);
            } catch (Throwable var16) {
            }

            try {
               class238.field3003.getAppletContext().showDocument(new URL(class238.field3003.getCodeBase(), arg0), field1292[5]);
               class12 var10 = new class12();
               var10.field159 = 1;
               return var10;
            } catch (Exception var15) {
               class12 var11 = new class12();
               var11.field159 = 2;
               return var11;
            }
         } else if (arg1 < 90) {
            return null;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field1292[3] + (arg0 != null ? field1292[4] : field1292[1]) + ',' + arg1 + ',' + (arg2 != null ? field1292[4] : field1292[1]) + ',' + arg3 + ',' + (arg4 != null ? field1292[4] : field1292[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(I)V",
      line = 98
   )
   public static void method918(int arg0) {
      try {
         if (arg0 <= 76) {
            method917((String)null, (byte)30, (class719)null, -28, (String)null);
         }

         field1290 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1292[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method919(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method920(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
