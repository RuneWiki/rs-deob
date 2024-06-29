import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class624 extends class294 {
   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9062 = new String[]{method4583(method4582("\u001a \u000b\u001cc")), method4583(method4582("\u000f{I^")), method4583(method4582("\u001bo\u000bz6")), method4583(method4582("\u001bo\u000b{6")), method4583(method4582("\u001bo\u000bu6")), method4583(method4582("\u00196\u0013\u001d")), method4583(method4582("\rgKGf")), method4583(method4582("\rgKGfN")), method4583(method4582("\u00196\u0013m(U")), method4583(method4582("\foF")), method4583(method4582("\u0000cA\u0004*")), method4583(method4582("\foF]mN")), method4583(method4582("\u0011~F")), method4583(method4582("\b=\u001d\u0004")), method4583(method4582("\u0016gKVq\u0016}\n")), method4583(method4582("\u0014`LD{\u0013}D^1")), method4583(method4582("\u0011~F\u001d")), method4583(method4582("\u00196\u0013m(U!")), method4583(method4582("\u0016gK")), method4583(method4582("\b;\u001d\u0004")), method4583(method4582("\f}OSh\u0000!")), method4583(method4582("\b:\u001d\u0004")), method4583(method4582("\u001bo\u000bx6")), method4583(method4582("\u00196\u0013")), method4583(method4582("\u001bo\u000b~6")), method4583(method4582("\u001bo\u000by6"))};
   @OriginalMember(
      owner = "client!za",
      name = "n",
      descriptor = "Luk;"
   )
   public static class498 field9059 = new class498(4, 10);
   @OriginalMember(
      owner = "client!za",
      name = "o",
      descriptor = "I"
   )
   public static int field9055;
   @OriginalMember(
      owner = "client!za",
      name = "m",
      descriptor = "I"
   )
   public static int field9057;
   @OriginalMember(
      owner = "client!za",
      name = "r",
      descriptor = "I"
   )
   public static int field9058;
   @OriginalMember(
      owner = "client!za",
      name = "s",
      descriptor = "I"
   )
   public static int field9060;
   @OriginalMember(
      owner = "client!za",
      name = "p",
      descriptor = "I"
   )
   public static int field9061;
   @OriginalMember(
      owner = "client!za",
      name = "q",
      descriptor = "Lrr;"
   )
   public static class678 field9056;

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(ILica;)Lrv;",
      line = 4
   )
   public static final class214 method4576(int arg0, class354 arg1) {
      try {
         ++field9057;
         class214 var2 = new class214();
         var2.field3251 = arg1.method2848(arg0 + -124);
         if (arg0 != 0) {
            method4576(99, (class354)null);
         }

         var2.field3244 = class557.field8302.method4129(var2.field3251, true);
         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9062[2] + arg0 + ',' + (arg1 != null ? field9062[0] : field9062[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(IZ)Ltm;",
      line = 19
   )
   public static final class406 method4577(int arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         ++field9058;
         class406[] var3 = class320.method2632(0);
         int var4 = 0;
         class406 var5;
         if (var2) {
            var5 = var3[var4];
            if (var5.field6325 == arg0) {
               return var5;
            }

            ++var4;
         }

         while(var4 < var3.length) {
            var5 = var3[var4];
            if (var5.field6325 == arg0) {
               return var5;
            }

            ++var4;
         }

         if (arg1) {
            field9056 = null;
         }

         return null;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9062[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(II)V",
      line = 49
   )
   public static final void method4578(int arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field9060;
         if (client.method1170(arg1, (byte)-119)) {
            class374[] var3 = class296.field4672[arg1];
            int var4 = 0;
            if (!var2 && var4 >= var3.length) {
               if (arg0 <= 82) {
                  method4577(-98, true);
               }
            } else {
               do {
                  class374 var5 = var3[var4];
                  if (var5 != null && var5.field5937 != null) {
                     var5.field5937.method2974(1);
                  }

                  ++var4;
               } while(var4 < var3.length);

               if (arg0 <= 82) {
                  method4577(-98, true);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9062[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(I)V",
      line = 85
   )
   public static void method4579(int arg0) {
      try {
         field9059 = null;
         int var1 = -78 / ((73 - arg0) / 49);
         field9056 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9062[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "b",
      descriptor = "(I)I",
      line = 99
   )
   public static final int method4580(int arg0) {
      try {
         ++field9055;
         return arg0 <= 91 ? -17 : class665.method4915(false, 0);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9062[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(Lsu;ZLrr;)V",
      line = 113
   )
   public static final void method4581(class289 arg0, boolean arg1, class678 arg2) {
      boolean var3 = client.field1786;

      try {
         label72: {
            class355.field5473 = arg2;
            class363.field5622 = "";
            ++field9061;
            class357.field5519 = arg0;
            if (!class581.field8576.startsWith(field9062[18])) {
               if (!class581.field8576.startsWith(field9062[6])) {
                  if (!class581.field8576.startsWith(field9062[9])) {
                     break label72;
                  }

                  class363.field5622 = class363.field5622 + field9062[11];
                  if (!var3) {
                     break label72;
                  }
               }

               class363.field5622 = class363.field5622 + field9062[7];
               if (!var3) {
                  break label72;
               }
            }

            class363.field5622 = class363.field5622 + field9062[14];
         }

         if (arg1) {
            field9056 = null;
         }

         if (class357.field5519.field4542) {
            class363.field5622 = class363.field5622 + field9062[20];
         } else if (!class581.field8575.startsWith(field9062[10]) && !class581.field8575.startsWith(field9062[8])) {
            if (!class581.field8575.startsWith(field9062[13]) && !class581.field8575.startsWith(field9062[21]) && !class581.field8575.startsWith(field9062[19]) && !class581.field8575.startsWith(field9062[23])) {
               if (!class581.field8575.startsWith(field9062[12])) {
                  class363.field5622 = class363.field5622 + field9062[15];
               } else {
                  class363.field5622 = class363.field5622 + field9062[16];
               }
            } else {
               class363.field5622 = class363.field5622 + field9062[5];
            }
         } else {
            class363.field5622 = class363.field5622 + field9062[17];
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9062[22] + (arg0 != null ? field9062[0] : field9062[1]) + ',' + arg1 + ',' + (arg2 != null ? field9062[0] : field9062[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4582(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4583(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
