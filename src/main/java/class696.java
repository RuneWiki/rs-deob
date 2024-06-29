import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class696 {
   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10172 = new String[]{method5064(method5063(")\u0002}\u0006\u0015")), method5064(method5063(")\u0002}\u0004\u0015")), method5064(method5063(")\u0002}\u0005\u0015")), method5064(method5063("2\u0016?+")), method5064(method5063("'M}i@"))};
   @OriginalMember(
      owner = "client!ua",
      name = "e",
      descriptor = "I"
   )
   public static int field10167 = -1;
   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "I"
   )
   public static int field10168 = -1;
   @OriginalMember(
      owner = "client!ua",
      name = "g",
      descriptor = "B"
   )
   public byte field10170;
   @OriginalMember(
      owner = "client!ua",
      name = "d",
      descriptor = "I"
   )
   public int field10165;
   @OriginalMember(
      owner = "client!ua",
      name = "c",
      descriptor = "I"
   )
   public static int field10166;
   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "I"
   )
   public static int field10169;
   @OriginalMember(
      owner = "client!ua",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field10164;
   @OriginalMember(
      owner = "client!ua",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10171;

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(IIIIIZ)V"
   )
   public static final void method5060(int param0, int param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5061(boolean arg0) {
      try {
         if (!arg0) {
            field10168 = -98;
         }

         field10171 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10172[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "([[II)V"
   )
   public static final void method5062(int[][] arg0, int arg1) {
      try {
         class17.field236 = arg0;
         ++field10166;
         if (arg1 != -1) {
            field10171 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10172[2] + (arg0 != null ? field10172[4] : field10172[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5063(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5064(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
