import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 {
   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field352 = new String[]{method159(method158("+GZ\tB")), method159(method158("+GZ\nB")), method159(method158("+GZ\u001d+v")), method159(method158("+GZ\u000bB"))};
   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field349 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!ub",
      name = "f",
      descriptor = "I"
   )
   public static int field344;
   @OriginalMember(
      owner = "client!ub",
      name = "h",
      descriptor = "I"
   )
   public static int field345;
   @OriginalMember(
      owner = "client!ub",
      name = "d",
      descriptor = "I"
   )
   public static int field350;
   @OriginalMember(
      owner = "client!ub",
      name = "g",
      descriptor = "J"
   )
   public long field347;
   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "J"
   )
   public static long field351;
   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "Lub;"
   )
   public class22 field343;
   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "Lub;"
   )
   public class22 field346;
   @OriginalMember(
      owner = "client!ub",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field348;

   @OriginalMember(
      owner = "client!ub",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method154(int arg0) {
      try {
         ++field344;
         if (this.field343 != null) {
            this.field343.field346 = this.field346;
            this.field346.field343 = this.field343;
            this.field343 = null;
            this.field346 = null;
            int var2 = -18 % ((-54 - arg0) / 49);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field352[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method155(byte param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method156(boolean arg0) {
      try {
         ++field350;
         if (this.field343 == null) {
            return false;
         } else {
            if (arg0) {
               this.method156(false);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field352[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method157(int arg0) {
      try {
         field348 = null;
         if (arg0 == 5) {
            field349 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field352[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method158(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method159(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
