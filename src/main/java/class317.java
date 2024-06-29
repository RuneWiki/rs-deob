import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class317 {
   @OriginalMember(
      owner = "client!fi",
      name = "c",
      descriptor = "[S"
   )
   public short[] field4892;
   @OriginalMember(
      owner = "client!fi",
      name = "f",
      descriptor = "J"
   )
   public long field4890;
   @OriginalMember(
      owner = "client!fi",
      name = "g",
      descriptor = "[I"
   )
   public int[] field4893;
   @OriginalMember(
      owner = "client!fi",
      name = "d",
      descriptor = "[S"
   )
   public short[] field4891;
   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4898 = new String[]{method2626(method2625("\u0005I\u0004\u0004l")), method2626(method2625("\u0005I\u0004\u0007l")), method2626(method2625("\rUF*")), method2626(method2625("\u0018\u000e\u0004h9")), method2626(method2625("\u0005I\u0004z-\rI^xl"))};
   @OriginalMember(
      owner = "client!fi",
      name = "h",
      descriptor = "I"
   )
   public static int field4895;
   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "I"
   )
   public static int field4897;
   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "Lqc;"
   )
   public static class181 field4896;
   @OriginalMember(
      owner = "client!fi",
      name = "e",
      descriptor = "[Lln;"
   )
   public static class433[] field4894;

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method2623(byte arg0) {
      try {
         if (arg0 != 37) {
            field4894 = null;
         }

         ++field4897;
         return ~class558.field8307 < -1;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4898[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2624(int arg0) {
      try {
         field4896 = null;
         field4894 = null;
         if (arg0 != -1) {
            field4894 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4898[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class317(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field4892 = arg2;
         this.field4890 = arg0;
         this.field4893 = arg1;
         this.field4891 = arg3;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4898[4] + arg0 + ',' + (arg1 != null ? field4898[3] : field4898[2]) + ',' + (arg2 != null ? field4898[3] : field4898[2]) + ',' + (arg3 != null ? field4898[3] : field4898[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "<init>",
      descriptor = "()V"
   )
   protected class317() {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2625(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2626(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
