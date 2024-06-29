import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public abstract class class675 {
   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9914 = new String[]{method4950(method4949("x;8MV>")), method4950(method4949("m|wMi")), method4950(method4949("x'5\u000f")), method4950(method4949("x;8MW>"))};
   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field9910 = new int[25];
   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "I"
   )
   public static int field9911;
   @OriginalMember(
      owner = "client!nia",
      name = "c",
      descriptor = "I"
   )
   public static int field9912;
   @OriginalMember(
      owner = "client!nia",
      name = "d",
      descriptor = "I"
   )
   public static int field9913;

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4946(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      if (var3 != null) {
         class726.method5282(var3.field2831);
         class726.method5282(var3.field2830);
         if (var3.field2831 != null) {
            var3.field2831 = null;
         }

         if (var3.field2830 != null) {
            var3.field2830 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4947(byte arg0) {
      try {
         field9910 = null;
         if (arg0 != 82) {
            method4948((String)null, -76);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9914[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(I)J"
   )
   public abstract long method978(int arg0);

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method4948(String arg0, int arg1) {
      try {
         int var2 = -104 / ((arg1 - -12) / 52);
         ++field9912;
         return class307.field4083.containsKey(arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9914[3] + (arg0 != null ? field9914[1] : field9914[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4949(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4950(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
