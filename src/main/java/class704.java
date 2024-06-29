import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rka")
public class class704 {
   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "I"
   )
   private int field10126 = 0;
   @OriginalMember(
      owner = "client!rka",
      name = "h",
      descriptor = "Lbga;"
   )
   private class398 field10132;
   @OriginalMember(
      owner = "client!rka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10136 = new String[]{method5140(method5139("\u001bw\u0007y+A")), method5140(method5139("\u001bw\u0007y(A")), method5140(method5139("\u00122Hy\u0017")), method5140(method5139("\u0007i\n;")), method5140(method5139("\u001bw\u0007y)A")), method5140(method5139("\u001bw\u0007y.A")), method5140(method5139("\u001bw\u0007yV\u0000r\u000f#TA"))};
   @OriginalMember(
      owner = "client!rka",
      name = "b",
      descriptor = "I"
   )
   public static int field10131 = 0;
   @OriginalMember(
      owner = "client!rka",
      name = "i",
      descriptor = "Lbga;"
   )
   public static class398 field10127 = new class398(4);
   @OriginalMember(
      owner = "client!rka",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10134 = "";
   @OriginalMember(
      owner = "client!rka",
      name = "d",
      descriptor = "I"
   )
   public static int field10135 = -1;
   @OriginalMember(
      owner = "client!rka",
      name = "c",
      descriptor = "I"
   )
   public static int field10128;
   @OriginalMember(
      owner = "client!rka",
      name = "f",
      descriptor = "I"
   )
   public static int field10129;
   @OriginalMember(
      owner = "client!rka",
      name = "j",
      descriptor = "I"
   )
   public static int field10130;
   @OriginalMember(
      owner = "client!rka",
      name = "e",
      descriptor = "Llba;"
   )
   private class247 field10133;

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(ILbt;)V"
   )
   public static final void method5135(int arg0, class395 arg1) {
      try {
         ++field10129;
         if (arg0 == -15933) {
            int var2 = -class51.field770 + arg1.field5837;
            int var3 = arg1.field5849 * 512 + arg1.method1507(-105) * 256;
            int var4 = arg1.field5848 * 512 + 256 * arg1.method1507(-92);
            arg1.field6832 += (var3 - arg1.field6832) / var2;
            arg1.field6833 += (-arg1.field6833 + var4) / var2;
            arg1.field5855 = 0;
            if (~arg1.field5850 == -1) {
               arg1.method3071(8192, 16384);
            }

            if (~arg1.field5850 == -2) {
               arg1.method3071(12288, 16384);
            }

            if (arg1.field5850 == 2) {
               arg1.method3071(0, arg0 + 32317);
            }

            if (arg1.field5850 == 3) {
               arg1.method3071(4096, arg0 + 32317);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10136[4] + arg0 + ',' + (arg1 != null ? field10136[2] : field10136[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(I)Llba;"
   )
   public final class247 method5136(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field10130;
         if (arg0 < 121) {
            field10134 = null;
         }

         if (this.field10126 > 0 && this.field10132.field5896[this.field10126 + -1] != this.field10133) {
            class247 var3 = this.field10133;
            this.field10133 = var3.field3781;
            return var3;
         } else {
            while(~this.field10126 > ~this.field10132.field5894) {
               class247 var4 = this.field10132.field5896[this.field10126++].field3781;
               class247 var10000 = this.field10132.field5896[this.field10126 - 1];

               while(var10000 != var4) {
                  this.field10133 = var4.field3781;
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10136[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5137(boolean arg0) {
      try {
         if (!arg0) {
            method5135(-16, (class395)null);
         }

         field10134 = null;
         field10127 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10136[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "b",
      descriptor = "(I)Llba;"
   )
   public final class247 method5138(int arg0) {
      try {
         if (arg0 <= 106) {
            return null;
         } else {
            ++field10128;
            this.field10126 = 0;
            return this.method5136(126);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10136[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "<init>",
      descriptor = "()V"
   )
   public class704() {
   }

   @OriginalMember(
      owner = "client!rka",
      name = "<init>",
      descriptor = "(Lbga;)V"
   )
   public class704(class398 arg0) {
      try {
         this.field10132 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10136[6] + (arg0 != null ? field10136[2] : field10136[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5139(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5140(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
