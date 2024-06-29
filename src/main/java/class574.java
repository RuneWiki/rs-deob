import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class574 {
   @OriginalMember(
      owner = "client!gl",
      name = "f",
      descriptor = "I"
   )
   public int field8503;
   @OriginalMember(
      owner = "client!gl",
      name = "m",
      descriptor = "I"
   )
   private int field8513;
   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "I"
   )
   public int field8514;
   @OriginalMember(
      owner = "client!gl",
      name = "o",
      descriptor = "I"
   )
   public int field8507;
   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "B"
   )
   public byte field8511;
   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8515 = new String[]{method4317(method4316(")Y\u000ba+")), method4317(method4316(")Y\u000bb+")), method4317(method4316(")Y\u000b\u001fj \\Q\u001d+"))};
   @OriginalMember(
      owner = "client!gl",
      name = "e",
      descriptor = "I"
   )
   public int field8498;
   @OriginalMember(
      owner = "client!gl",
      name = "j",
      descriptor = "I"
   )
   public int field8500;
   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "I"
   )
   public static int field8501;
   @OriginalMember(
      owner = "client!gl",
      name = "h",
      descriptor = "I"
   )
   public int field8502;
   @OriginalMember(
      owner = "client!gl",
      name = "k",
      descriptor = "I"
   )
   public int field8504;
   @OriginalMember(
      owner = "client!gl",
      name = "g",
      descriptor = "I"
   )
   public int field8505;
   @OriginalMember(
      owner = "client!gl",
      name = "n",
      descriptor = "I"
   )
   public int field8506;
   @OriginalMember(
      owner = "client!gl",
      name = "q",
      descriptor = "I"
   )
   public int field8508;
   @OriginalMember(
      owner = "client!gl",
      name = "p",
      descriptor = "I"
   )
   public static int field8509;
   @OriginalMember(
      owner = "client!gl",
      name = "i",
      descriptor = "I"
   )
   public int field8510;
   @OriginalMember(
      owner = "client!gl",
      name = "l",
      descriptor = "I"
   )
   public int field8512;
   @OriginalMember(
      owner = "client!gl",
      name = "d",
      descriptor = "Lgl;"
   )
   public class574 field8499;

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(B)Lnca;",
      line = 4
   )
   public final class257 method4314(byte arg0) {
      try {
         ++field8501;
         int var2 = -51 % ((86 - arg0) / 33);
         return class271.method2311(-96, this.field8513);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8515[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "<init>",
      descriptor = "(IIIIB)V",
      line = 31
   )
   public class574(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field8503 = arg2;
         this.field8513 = arg0;
         this.field8514 = arg1;
         this.field8507 = arg3;
         this.field8511 = arg4;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8515[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(IIII)Lgl;",
      line = 43
   )
   public final class574 method4315(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8509;
         if (arg1 > -27) {
            this.field8513 = -29;
         }

         return new class574(this.field8513, arg3, arg0, arg2, this.field8511);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8515[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4317(char[] arg0) {
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
            var10005 = 53;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
