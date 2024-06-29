import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class498 {
   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "I"
   )
   public int field7582;
   @OriginalMember(
      owner = "client!uk",
      name = "e",
      descriptor = "I"
   )
   private int field7580;
   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7583 = new String[]{method3871(method3870("wgizzle3x;")), method3871(method3870("wgi\u0004;")), method3871(method3870("wgi\u0007;")), method3871(method3870("wgi\u0005;")), method3871(method3870("wgi2|Qx5/}e$"))};
   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field7576 = new class113(38, 7);
   @OriginalMember(
      owner = "client!uk",
      name = "d",
      descriptor = "I"
   )
   public static int field7577;
   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "I"
   )
   public static int field7579;
   @OriginalMember(
      owner = "client!uk",
      name = "g",
      descriptor = "I"
   )
   public static int field7581;
   @OriginalMember(
      owner = "client!uk",
      name = "f",
      descriptor = "Lsu;"
   )
   public static class289 field7578;

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(BZ)V",
      line = 12
   )
   public static final void method3867(byte param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uk",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 78
   )
   public final String toString() {
      try {
         ++field7577;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7583[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(Z)V",
      line = 87
   )
   public static void method3868(boolean arg0) {
      try {
         field7576 = null;
         if (!arg0) {
            field7576 = null;
         }

         field7578 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7583[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(B)I",
      line = 99
   )
   public final int method3869(byte arg0) {
      try {
         ++field7581;
         int var2 = -11 % ((55 - arg0) / 44);
         return this.field7580;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7583[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "<init>",
      descriptor = "(II)V",
      line = 109
   )
   public class498(int arg0, int arg1) {
      try {
         this.field7582 = arg1;
         this.field7580 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7583[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3870(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3871(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
