import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class686 {
   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "Lda;"
   )
   public class66 field10065 = null;
   @OriginalMember(
      owner = "client!fj",
      name = "f",
      descriptor = "Ljk;"
   )
   public class663 field10068 = null;
   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10071 = new String[]{method5013(method5012("L\u007fk\u0013\u0016")), method5013(method5012("L\u007fknWD|1l\u0016")), method5013(method5012("Q;k|C")), method5013(method5012("D`)>"))};
   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "I"
   )
   public static int field10070 = 0;
   @OriginalMember(
      owner = "client!fj",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field10066 = new class378(107, 2);
   @OriginalMember(
      owner = "client!fj",
      name = "d",
      descriptor = "I"
   )
   public static int field10067;
   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "I"
   )
   public static int field10069;

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "(Lda;)V"
   )
   public class686(class66 arg0) {
      try {
         this.field10065 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10071[1] + (arg0 != null ? field10071[2] : field10071[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5011(byte arg0) {
      try {
         if (arg0 == -82) {
            field10066 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10071[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "(Lda;Ljk;)V"
   )
   public class686(class66 arg0, class663 arg1) {
      try {
         this.field10068 = arg1;
         this.field10065 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10071[1] + (arg0 != null ? field10071[2] : field10071[3]) + ',' + (arg1 != null ? field10071[2] : field10071[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5012(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5013(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
