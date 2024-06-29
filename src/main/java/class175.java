import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class175 {
   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2181 = new String[]{method1362(method1361("\u0015\f\u0012J")), method1362(method1361("\u0000WP\b\n")), method1362(method1361("\u001f\u001f\u001f\b4S")), method1362(method1361("\u001f\u001f\u001f\b3S")), method1362(method1361("\u001f\u001f\u001f\b6S")), method1362(method1361("\u001f\u001f\u001f\b5S"))};
   @OriginalMember(
      owner = "client!dfa",
      name = "e",
      descriptor = "I"
   )
   public static int field2176;
   @OriginalMember(
      owner = "client!dfa",
      name = "c",
      descriptor = "I"
   )
   public static int field2178;
   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "I"
   )
   public static int field2179;
   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "I"
   )
   public static int field2180;
   @OriginalMember(
      owner = "client!dfa",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field2177;

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1357(int arg0) {
      try {
         field2177 = null;
         if (arg0 != 27777) {
            field2177 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2181[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(IZLdl;)V"
   )
   public static final void method1358(int arg0, boolean arg1, class69 arg2) {
      try {
         class614.field8576.method61(44, arg2);
         if (arg0 != 48) {
            field2177 = null;
         }

         ++field2180;
         if (arg1) {
            class628.method4568(arg0 ^ 5936, arg2, class154.field1993, class237.field2935, class74.field943, class614.field8576);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2181[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2181[1] : field2181[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(IIIZZ)I"
   )
   public static final int method1359(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      boolean var5 = client.field4273;

      try {
         ++field2176;
         class784 var6 = class655.method4729(arg3, arg0, (byte)-116);
         if (var6 == null) {
            return 0;
         } else {
            int var7 = 0;
            int var8 = arg1;
            int var10000;
            if (var5) {
               var10000 = ~var6.field11463[arg1];
            } else if (~var6.field11463.length >= ~arg1) {
               var10000 = var7;
               if (!var5) {
                  return var7;
               }
            } else {
               var10000 = ~var6.field11463[arg1];
            }

            while(true) {
               if (var10000 <= -1) {
                  if (class645.field9054.field707 > var6.field11463[var8]) {
                     class261 var9 = class645.field9054.method485(0, var6.field11463[var8]);
                     int var10 = var9.method1995(-1, class717.field10511.method5460(arg2, 11).field11479, arg2);
                     if (!arg4) {
                        var7 += var10;
                        if (var5) {
                           var7 += var6.field11456[var8] * var10;
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        var7 += var6.field11456[var8] * var10;
                        ++var8;
                     }
                  } else {
                     ++var8;
                  }
               } else {
                  ++var8;
               }

               if (~var6.field11463.length >= ~var8) {
                  var10000 = var7;
                  if (!var5) {
                     return var7;
                  }
               } else {
                  var10000 = ~var6.field11463[var8];
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2181[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(Ljava/net/Socket;II)Lri;"
   )
   public static final class122 method1360(Socket arg0, int arg1, int arg2) throws IOException {
      try {
         if (arg2 != 10) {
            field2177 = null;
         }

         ++field2179;
         return new class524(arg0, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2181[4] + (arg0 != null ? field2181[1] : field2181[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1361(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1362(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
