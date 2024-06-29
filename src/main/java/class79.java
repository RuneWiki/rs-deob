import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class79 {
   @OriginalMember(
      owner = "client!oi",
      name = "d",
      descriptor = "I"
   )
   public int field985;
   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field989 = new String[]{method753(method752(".L+n\u0014")), method753(method752(".L+[S\u0012QwFR&\r")), method753(method752(".L+\u0013U/Lq\u0011\u0014")), method753(method752(".L+l\u0014")), method753(method752(".L+m\u0014"))};
   @OriginalMember(
      owner = "client!oi",
      name = "c",
      descriptor = "Lsd;"
   )
   public static class101 field982 = new class101(48, 10);
   @OriginalMember(
      owner = "client!oi",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field983 = new int[25];
   @OriginalMember(
      owner = "client!oi",
      name = "e",
      descriptor = "[S"
   )
   public static short[] field986 = new short[256];
   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "I"
   )
   public static int field984;
   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "I"
   )
   public static int field987;
   @OriginalMember(
      owner = "client!oi",
      name = "f",
      descriptor = "I"
   )
   public static int field988;

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method749(byte arg0) {
      try {
         field986 = null;
         int var1 = 1 / ((arg0 - -16) / 50);
         field982 = null;
         field983 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field989[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "(B)[Lcj;"
   )
   public static final class721[] method750(byte arg0) {
      try {
         if (arg0 <= 101) {
            method749((byte)108);
         }

         ++field987;
         return new class721[]{class633.field9220, class762.field11198, class563.field8407, class408.field6229, class42.field454, class109.field1321, class104.field1258, class536.field7839, class690.field10395, class68.field858, class358.field5413, class344.field5230, class167.field2088, class532.field7768};
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field989[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method751(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != -6) {
            method749((byte)-101);
         }

         ++field988;
         return ~(arg0 & 16) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field989[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field984;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field989[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class79(int arg0, int arg1) {
      try {
         this.field985 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field989[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method752(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method753(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
