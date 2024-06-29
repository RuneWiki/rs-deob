import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class391 {
   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5695 = new String[]{method3040(method3039("1*z;\u0003")), method3040(method3039("8tzPV")), method3040(method3039("$q8y")), method3040(method3039("8tzQV")), method3040(method3039("6$")), method3040(method3039("jxt")), method3040(method3039("dn5c\u001fp")), method3040(method3039("8tzTV")), method3040(method3039("8tzWV"))};
   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "Lmb;"
   )
   public static class359 field5689 = new class359();
   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "Lhf;"
   )
   public static class198 field5693 = new class198("", 19);
   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "I"
   )
   public static int field5690;
   @OriginalMember(
      owner = "client!rp",
      name = "d",
      descriptor = "I"
   )
   public static int field5691;
   @OriginalMember(
      owner = "client!rp",
      name = "e",
      descriptor = "I"
   )
   public static int field5692;
   @OriginalMember(
      owner = "client!rp",
      name = "f",
      descriptor = "I"
   )
   public static int field5694;

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Lha;IBI)V"
   )
   public static final void method3034(class17 arg0, int arg1, byte arg2, int arg3) {
      try {
         if (arg2 == -88) {
            class513.field7285 = arg0;
            ++field5692;
            class341.field5025 = new class437[arg3][arg1];
            if (class720.field10319 != null) {
               class701.field10096 = class700.method5115(class720.field10319[5], class720.field10319[0], class720.field10319[2], class720.field10319[3], (byte)-117, class720.field10319[1], class720.field10319[4]);
            }

            class689.field9928 = null;
            class418.field6116 = new class437();
            class372.method2917((byte)79);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5695[1] + (arg0 != null ? field5695[0] : field5695[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;"
   )
   public static final String method3035(int arg0, Throwable arg1) throws IOException {
      boolean var2;
      String var4;
      label41: {
         var2 = client.field10022;
         ++field5694;
         if (arg1 instanceof class300) {
            class300 var3 = (class300)arg1;
            var4 = var3.field4486 + field5695[5];
            arg1 = var3.field4489;
            if (!var2) {
               break label41;
            }
         }

         var4 = "";
      }

      int var5 = 8 % ((arg0 - 35) / 57);
      StringWriter var6 = new StringWriter();
      PrintWriter var7 = new PrintWriter(var6);
      arg1.printStackTrace(var7);
      var7.close();
      String var8 = var6.toString();
      BufferedReader var9 = new BufferedReader(new StringReader(var8));
      String var10 = var9.readLine();

      while(true) {
         String var11 = var9.readLine();
         if (var11 != null) {
            int var12 = var11.indexOf(40);
            int var13 = var11.indexOf(41, var12 + 1);
            if (var2) {
               break;
            }

            String var14;
            label30: {
               if (~var12 != 0) {
                  var14 = var11.substring(0, var12);
                  if (!var2) {
                     break label30;
                  }
               }

               var14 = var11;
            }

            String var15 = var14.trim();
            String var16 = var15.substring(var15.lastIndexOf(32) + 1);
            String var17 = var16.substring(1 + var16.lastIndexOf(9));
            String var18 = var4 + var17;
            if (~var12 != 0 && var13 != -1) {
               int var19 = var11.indexOf(field5695[6], var12);
               if (var19 >= 0) {
                  var18 = var18 + var11.substring(var19 - -5, var13);
               }
            }

            var4 = var18 + ' ';
            if (!var2) {
               continue;
            }
         }

         var4 = var4 + field5695[4] + var10;
         break;
      }

      return var4;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3036(int arg0) {
      try {
         field5693 = null;
         field5689 = null;
         if (arg0 != 4) {
            field5693 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5695[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3037(int arg0, int arg1, int arg2) {
      try {
         ++field5691;
         int var3 = -117 / ((-3 - arg0) / 63);
         return class426.method3325(arg2, arg1, 33) | (arg1 & 458752) != 0 || class201.method1749(arg2, arg1, 200);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5695[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3038(int arg0, int arg1) {
      try {
         ++field5690;
         if (arg0 <= 94) {
            return false;
         } else {
            return arg1 == 4 || arg1 == 8 || ~arg1 == -13 || arg1 == 10;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5695[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3039(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3040(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
