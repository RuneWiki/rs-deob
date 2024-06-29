import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class760 {
   @OriginalMember(
      owner = "client!sha",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field11236;
   @OriginalMember(
      owner = "client!sha",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field11235;
   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field11237;
   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11240 = new String[]{method5517(method5516(".MUn\u0017u")), method5517(method5516(".MUn\u0010u")), method5517(method5516(".MUn\u0011u")), method5517(method5516("!\u0005")), method5517(method5516("sOU62g")), method5517(method5516("}Y\u0014")), method5517(method5516("3PX,")), method5517(method5516(".MUno4K]4mu")), method5517(method5516("&\u000b\u001an."))};
   @OriginalMember(
      owner = "client!sha",
      name = "c",
      descriptor = "I"
   )
   public static int field11239 = 0;
   @OriginalMember(
      owner = "client!sha",
      name = "d",
      descriptor = "Leg;"
   )
   public static class118 field11233 = new class118(31, 12);
   @OriginalMember(
      owner = "client!sha",
      name = "h",
      descriptor = "I"
   )
   public static int field11232;
   @OriginalMember(
      owner = "client!sha",
      name = "b",
      descriptor = "I"
   )
   public static int field11234;
   @OriginalMember(
      owner = "client!sha",
      name = "e",
      descriptor = "I"
   )
   public static int field11238;

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(Z)V",
      line = 8
   )
   public static void method5512(boolean arg0) {
      try {
         if (arg0) {
            method5514(-115, 104, 9);
         }

         field11233 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11240[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;",
      line = 20
   )
   public static final String method5513(byte arg0, Throwable arg1) throws IOException {
      boolean var2;
      String var4;
      label45: {
         var2 = client.field4360;
         ++field11238;
         if (arg1 instanceof class509) {
            class509 var3 = (class509)arg1;
            var4 = var3.field7412 + field11240[5];
            arg1 = var3.field7410;
            if (!var2) {
               break label45;
            }
         }

         var4 = "";
      }

      StringWriter var5 = new StringWriter();
      PrintWriter var6 = new PrintWriter(var5);
      arg1.printStackTrace(var6);
      if (arg0 > -24) {
         method5514(-38, 67, 81);
      }

      var6.close();
      String var7 = var5.toString();
      BufferedReader var8 = new BufferedReader(new StringReader(var7));
      String var9 = var8.readLine();

      while(true) {
         String var10 = var8.readLine();
         if (var10 != null) {
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 - -1);
            if (var2) {
               break;
            }

            String var13;
            label34: {
               if (var11 != -1) {
                  var13 = var10.substring(0, var11);
                  if (!var2) {
                     break label34;
                  }
               }

               var13 = var10;
            }

            String var14 = var13.trim();
            String var15 = var14.substring(1 + var14.lastIndexOf(32));
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var4 + var16;
            if (var11 != -1 && var12 != -1) {
               int var18 = var10.indexOf(field11240[4], var11);
               if (~var18 <= -1) {
                  var17 = var17 + var10.substring(var18 + 5, var12);
               }
            }

            var4 = var17 + ' ';
            if (!var2) {
               continue;
            }
         }

         var4 = var4 + field11240[3] + var9;
         break;
      }

      return var4;
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(III)Z",
      line = 92
   )
   public static final boolean method5514(int arg0, int arg1, int arg2) {
      try {
         ++field11232;
         if (arg2 != -1) {
            method5514(-5, -104, 12);
         }

         return ~(34 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11240[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
      line = 105
   )
   public class760(String arg0, String arg1, String arg2) {
      try {
         this.field11236 = arg0;
         this.field11235 = arg1;
         this.field11237 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11240[7] + (arg0 != null ? field11240[8] : field11240[6]) + ',' + (arg1 != null ? field11240[8] : field11240[6]) + ',' + (arg2 != null ? field11240[8] : field11240[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(II)V",
      line = 117
   )
   public static final void method5515(int arg0, int arg1) {
      try {
         if (arg0 == -1) {
            ++field11234;
            class755 var2 = class317.method2325((long)arg1, 118, 9);
            var2.method5481(arg0 ^ 100);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11240[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5516(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5517(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
