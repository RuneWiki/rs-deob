import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class84 extends class207 {
   @OriginalMember(
      owner = "client!dha",
      name = "q",
      descriptor = "J"
   )
   private long field1036 = -1L;
   @OriginalMember(
      owner = "client!dha",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   private String field1035 = null;
   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1038 = new String[]{method795(method794("+$\"]?g")), method795(method794("+$\"]=g")), method795(method794("4bm]\u0001")), method795(method794("!9/\u001f")), method795(method794("+$\"]>g"))};
   @OriginalMember(
      owner = "client!dha",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1033 = null;
   @OriginalMember(
      owner = "client!dha",
      name = "r",
      descriptor = "Lsda;"
   )
   public static class269 field1032 = new class269(80, 4);
   @OriginalMember(
      owner = "client!dha",
      name = "p",
      descriptor = "I"
   )
   public static int field1034;
   @OriginalMember(
      owner = "client!dha",
      name = "n",
      descriptor = "I"
   )
   public static int field1037;

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Lfa;Z)V",
      line = 7
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         if (!arg1) {
            field1033 = null;
         }

         ++field1037;
         arg0.method1822(this.field1035, arg1, this.field1036);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1038[4] + (arg0 != null ? field1038[2] : field1038[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(B)V",
      line = 19
   )
   public static void method792(byte arg0) {
      try {
         field1033 = null;
         if (arg0 < 34) {
            field1032 = null;
         }

         field1032 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1038[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Ljj;Z)V",
      line = 31
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         if (arg0.method1104(255) != 255) {
            --arg0.field1590;
            this.field1036 = arg0.method1063(111);
         }

         ++field1034;
         this.field1035 = arg0.method1056(-20330);
         if (!arg1) {
            this.field1035 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1038[1] + (arg0 != null ? field1038[2] : field1038[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method794(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method795(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
