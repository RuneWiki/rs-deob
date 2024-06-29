import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class159 extends class347 {
   @OriginalMember(
      owner = "client!ho",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   public String field2020;
   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2026 = new String[]{method1322(method1321("1[-S")), method1322(method1321("$\u0000o\u0011E")), method1322(method1321("7Aoz\u0010")), method1322(method1321("7Ao|\u0010")), method1322(method1321("7Ao~\u0010")), method1322(method1321("7Ao\u0003Q1G5\u0001\u0010")), method1322(method1321("7Ao}\u0010"))};
   @OriginalMember(
      owner = "client!ho",
      name = "n",
      descriptor = "I"
   )
   public static int field2021 = 0;
   @OriginalMember(
      owner = "client!ho",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field2024 = new int[1000];
   @OriginalMember(
      owner = "client!ho",
      name = "i",
      descriptor = "I"
   )
   public static int field2018;
   @OriginalMember(
      owner = "client!ho",
      name = "k",
      descriptor = "I"
   )
   public static int field2019;
   @OriginalMember(
      owner = "client!ho",
      name = "l",
      descriptor = "I"
   )
   public static int field2022;
   @OriginalMember(
      owner = "client!ho",
      name = "j",
      descriptor = "I"
   )
   public static int field2023;
   @OriginalMember(
      owner = "client!ho",
      name = "o",
      descriptor = "I"
   )
   public static int field2025;
   @OriginalMember(
      owner = "client!ho",
      name = "p",
      descriptor = "Luaa;"
   )
   public static class126 field2017;
   @OriginalMember(
      owner = "client!ho",
      name = "m",
      descriptor = "[Lat;"
   )
   public static class396[] field2016;

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Ljj;I)Lkq;",
      line = 5
   )
   public static final class618 method1316(class128 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            return null;
         } else {
            ++field2019;
            return new class618(arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(arg1 ^ 32767), arg0.method1077(arg1 + -33), arg0.method1077(arg1 ^ -33), arg0.method1104(255));
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2026[4] + (arg0 != null ? field2026[1] : field2026[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(B)V",
      line = 26
   )
   public static void method1317(byte arg0) {
      try {
         field2017 = null;
         field2016 = null;
         field2024 = null;
         if (arg0 != 3) {
            field2017 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2026[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(II)Z",
      line = 38
   )
   public static final boolean method1318(int arg0, int arg1) {
      try {
         ++field2022;
         if (arg0 != -9) {
            field2016 = null;
         }

         return ~arg1 <= -5 && ~arg1 >= -9;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2026[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Lck;ZIBIII[I)Lfe;",
      line = 49
   )
   public static final class596 method1319(class667 arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int[] arg7) {
      try {
         if (arg3 > -115) {
            return null;
         } else {
            ++field2025;
            if (!arg0.field10032 && (!class766.method5547(1008, arg5) || !class766.method5547(1008, arg2))) {
               return !arg0.field9950 ? new class596(arg0, arg5, arg2, class7.method63(arg5, false), class7.method63(arg2, false), arg7) : new class596(arg0, 34037, arg5, arg2, arg1, arg7, arg4, arg6);
            } else {
               return new class596(arg0, 3553, arg5, arg2, arg1, arg7, arg4, arg6);
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2026[2] + (arg0 != null ? field2026[1] : field2026[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2026[1] : field2026[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(IIILlp;Llp;)V",
      line = 70
   )
   public static final void method1320(int arg0, int arg1, int arg2, class411 arg3, class411 arg4) {
      class72 var5 = class349.method2732(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field907 = arg3;
         var5.field915 = arg4;
         int var6 = class650.field9484 == class377.field5711 ? 1 : 0;
         if (arg3.method2(-7577)) {
            if (arg3.method5(-26787)) {
               arg3.field8996 = class197.field2449[var6];
               class197.field2449[var6] = arg3;
            } else {
               arg3.field8996 = class764.field11222[var6];
               class764.field11222[var6] = arg3;
               class321.field4583 = true;
            }
         } else {
            arg3.field8996 = class535.field7803[var6];
            class535.field7803[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method2(-7577)) {
               if (arg4.method5(-26787)) {
                  arg4.field8996 = class197.field2449[var6];
                  class197.field2449[var6] = arg4;
                  return;
               }

               arg4.field8996 = class764.field11222[var6];
               class764.field11222[var6] = arg4;
               class321.field4583 = true;
               return;
            }

            arg4.field8996 = class535.field7803[var6];
            class535.field7803[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!ho",
      name = "<init>",
      descriptor = "()V",
      line = 132
   )
   public class159() {
   }

   @OriginalMember(
      owner = "client!ho",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 134
   )
   public class159(String arg0, int arg1) {
      try {
         this.field2020 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2026[5] + (arg0 != null ? field2026[1] : field2026[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1321(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1322(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
