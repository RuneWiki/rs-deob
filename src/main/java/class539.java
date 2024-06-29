import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class539 extends class297 {
   @OriginalMember(
      owner = "client!mk",
      name = "v",
      descriptor = "I"
   )
   public int field8128;
   @OriginalMember(
      owner = "client!mk",
      name = "x",
      descriptor = "Lic;"
   )
   public class51 field8130;
   @OriginalMember(
      owner = "client!mk",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8134 = new String[]{method4126(method4125("Y\u0000EPo")), method4126(method4125("OEE=:")), method4126(method4125("Y\u0000E/.Z\u0002\u001f-o")), method4126(method4125("Z\u001e\u0007\u007f"))};
   @OriginalMember(
      owner = "client!mk",
      name = "u",
      descriptor = "Lnaa;"
   )
   public static class113 field8129 = new class113(82, 6);
   @OriginalMember(
      owner = "client!mk",
      name = "y",
      descriptor = "Luk;"
   )
   public static class498 field8132 = new class498(96, -1);
   @OriginalMember(
      owner = "client!mk",
      name = "w",
      descriptor = "I"
   )
   public static int field8133 = 2;
   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "[Ljq;"
   )
   public static class672[] field8131;

   @OriginalMember(
      owner = "client!mk",
      name = "c",
      descriptor = "(I)V",
      line = 6
   )
   public static void method4122(int arg0) {
      try {
         field8131 = null;
         if (arg0 != -30921) {
            field8129 = null;
         }

         field8129 = null;
         field8132 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8134[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "<init>",
      descriptor = "(Lic;I)V",
      line = 22
   )
   public class539(class51 arg0, int arg1) {
      try {
         this.field8128 = arg1;
         this.field8130 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8134[2] + (arg0 != null ? field8134[1] : field8134[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "d",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public abstract Object method4123(byte arg0);

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method4124(byte arg0);

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4125(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4126(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
