import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class659 {
   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "I"
   )
   public int field9813 = 1;
   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9816 = new String[]{method4835(method4834("*\u000bR^\u0014")), method4835(method4834("?P\u0010\u001c")), method4835(method4834("\"D\u001d^+y")), method4835(method4834("\"D\u001d^-y")), method4835(method4834("\"D\u001d^*y")), method4835(method4834("\"D\u001d^(y"))};
   @OriginalMember(
      owner = "client!saa",
      name = "g",
      descriptor = "I"
   )
   public static int field9814 = 0;
   @OriginalMember(
      owner = "client!saa",
      name = "e",
      descriptor = "Laka;"
   )
   public static class418 field9811 = new class418(28, 10);
   @OriginalMember(
      owner = "client!saa",
      name = "c",
      descriptor = "C"
   )
   public char field9808;
   @OriginalMember(
      owner = "client!saa",
      name = "d",
      descriptor = "I"
   )
   public static int field9809;
   @OriginalMember(
      owner = "client!saa",
      name = "f",
      descriptor = "I"
   )
   public static int field9810;
   @OriginalMember(
      owner = "client!saa",
      name = "h",
      descriptor = "I"
   )
   public static int field9812;
   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "[Ls;"
   )
   public static class423[] field9815;

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4830(byte arg0) {
      try {
         if (arg0 == 58) {
            field9811 = null;
            field9815 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9816[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "([[IZ)V"
   )
   public static final void method4831(int[][] arg0, boolean arg1) {
      try {
         if (arg1) {
            ++field9809;
            class237.field3001 = arg0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9816[2] + (arg0 != null ? field9816[0] : field9816[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(IILgea;)V"
   )
   private final void method4832(int arg0, int arg1, class66 arg2) {
      try {
         label30: {
            if (~arg1 == -2) {
               this.field9808 = class123.method1076(arg2.method628((byte)-12), arg0 ^ 27305);
               if (!client.field1481) {
                  break label30;
               }
            }

            if (arg1 == 2) {
               this.field9813 = 0;
            }
         }

         if (arg0 == -2221) {
            ++field9810;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9816[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9816[0] : field9816[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(Lgea;I)V"
   )
   public final void method4833(class66 arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg0.method640(255);
            if (var4 != 0) {
               this.method4832(arg1 + 21575, var4, arg0);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field9812;
            break;
         }

         if (arg1 != -23796) {
            field9811 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9816[4] + (arg0 != null ? field9816[0] : field9816[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
