import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class540 extends class684 {
   @OriginalMember(
      owner = "client!cq",
      name = "f",
      descriptor = "[I"
   )
   public int[] field7581;
   @OriginalMember(
      owner = "client!cq",
      name = "h",
      descriptor = "[I"
   )
   public int[] field7582;
   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7583 = new String[]{method4025(method4024("+\u001a\t!")), method4025(method4024(">AKc1")), method4025(method4024("&\u001eKq%+\u0006\u0011sd")), method4025(method4024("&\u001eK\u000fd")), method4025(method4024("&\u001eK\fd"))};
   @OriginalMember(
      owner = "client!cq",
      name = "e",
      descriptor = "I"
   )
   public static int field7580 = 1337;
   @OriginalMember(
      owner = "client!cq",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field7579 = new int[2];
   @OriginalMember(
      owner = "client!cq",
      name = "d",
      descriptor = "D"
   )
   public static double field7578;
   @OriginalMember(
      owner = "client!cq",
      name = "g",
      descriptor = "I"
   )
   public static int field7577;

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Z[Lma;)V"
   )
   public static final void method4022(boolean param0, class148[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4023(int arg0) {
      try {
         if (arg0 >= -82) {
            method4023(-51);
         }

         field7579 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7583[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "<init>",
      descriptor = "(II[I[I)V"
   )
   public class540(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         this.field7581 = arg3;
         this.field7582 = arg2;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7583[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7583[1] : field7583[0]) + ',' + (arg3 != null ? field7583[1] : field7583[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4024(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4025(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
