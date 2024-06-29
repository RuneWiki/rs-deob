import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class68 extends class757 {
   @OriginalMember(
      owner = "client!aq",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field977 = new String[]{method716(method715("eHi\u001bs")), method716(method715("eHi\u0019s")), method716(method715("eHi\u001cs")), method716(method715("eHi\u001as"))};
   @OriginalMember(
      owner = "client!aq",
      name = "A",
      descriptor = "[[I"
   )
   public static int[][] field974 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!aq",
      name = "C",
      descriptor = "I"
   )
   public static int field973;
   @OriginalMember(
      owner = "client!aq",
      name = "E",
      descriptor = "I"
   )
   public static int field975;
   @OriginalMember(
      owner = "client!aq",
      name = "D",
      descriptor = "I"
   )
   public static int field976;

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method120(int arg0, int arg1, int arg2, int arg3) {
      try {
         super.field10820 = arg2;
         int var5 = 51 / ((17 - arg3) / 49);
         super.field10819 = arg0;
         ++field976;
         super.field10822 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field977[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class68(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!aq",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method713(int arg0) {
      try {
         field974 = null;
         if (arg0 != 4) {
            field974 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field977[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method115(float arg0, byte arg1) {
      try {
         ++field975;
         super.field10818 = arg0;
         if (arg1 <= 39) {
            this.method115(1.7712088F, (byte)-88);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field977[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method714(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 19090) {
            return false;
         } else {
            ++field973;
            return (arg2 & 2048) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field977[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method715(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method716(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
