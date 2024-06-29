import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class243 {
   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "[I"
   )
   public int[] field3505;
   @OriginalMember(
      owner = "client!dia",
      name = "e",
      descriptor = "[[F"
   )
   public float[][] field3502;
   @OriginalMember(
      owner = "client!dia",
      name = "f",
      descriptor = "[I"
   )
   public int[] field3503;
   @OriginalMember(
      owner = "client!dia",
      name = "g",
      descriptor = "[I"
   )
   public int[] field3506;
   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3507 = new String[]{method1981(method1980("\u0010Y\u001bb\u001b")), method1981(method1980("\u000f\u001eTbZ\u0002\u0019\\8XC")), method1981(method1980("\u0005\u0002Y ")), method1981(method1980("\u000f\u001eTb%C")), method1981(method1980("\u000f\u001eTb$C"))};
   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "I"
   )
   public static int field3500;
   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "I"
   )
   public static int field3501;
   @OriginalMember(
      owner = "client!dia",
      name = "d",
      descriptor = "I"
   )
   public static int field3504;

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Lda;)V"
   )
   public static final void method1976(class66 arg0) {
      class543.field7869 = arg0;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(III)Lkfa;"
   )
   public static final class626 method1977(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      if (var3 == null) {
         return null;
      } else {
         class626 var4 = var3.field8657;
         var3.field8657 = null;
         class428.method3232(var4);
         return var4;
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1978(int arg0, int arg1) {
      try {
         class397.field5827 = arg1;
         ++field3501;
         class23.field355.method1589((byte)100);
         if (arg0 != 57) {
            field3500 = 22;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3507[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(CI)Z"
   )
   public static final boolean method1979(char arg0, int arg1) {
      try {
         if (arg1 != 122) {
            method1976((class66)null);
         }

         ++field3504;
         return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3507[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "<init>",
      descriptor = "([I[I[I[[F)V"
   )
   public class243(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
      try {
         this.field3505 = arg2;
         this.field3502 = arg3;
         this.field3503 = arg1;
         this.field3506 = arg0;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3507[1] + (arg0 != null ? field3507[0] : field3507[2]) + ',' + (arg1 != null ? field3507[0] : field3507[2]) + ',' + (arg2 != null ? field3507[0] : field3507[2]) + ',' + (arg3 != null ? field3507[0] : field3507[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1980(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1981(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
