import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class33 extends class486 implements class557 {
   @OriginalMember(
      owner = "client!bja",
      name = "F",
      descriptor = "I"
   )
   private int field388;
   @OriginalMember(
      owner = "client!bja",
      name = "A",
      descriptor = "I"
   )
   private int field387;
   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "I"
   )
   private int field386;
   @OriginalMember(
      owner = "client!bja",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field394 = new String[]{method267(method266("\u0004\u0007i%")), method267(method266("\u0011\\+g^")), method267(method266("\b\u0018dg\u001f\u0003\u001cl=\u001dB")), method267(method266("\b\u0018dgbB"))};
   @OriginalMember(
      owner = "client!bja",
      name = "H",
      descriptor = "Leka;"
   )
   public static class494 field385 = new class494();
   @OriginalMember(
      owner = "client!bja",
      name = "E",
      descriptor = "Lnw;"
   )
   public static class616 field389 = new class616(14, 8);
   @OriginalMember(
      owner = "client!bja",
      name = "G",
      descriptor = "I"
   )
   public static int field390 = 500;
   @OriginalMember(
      owner = "client!bja",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field392 = false;
   @OriginalMember(
      owner = "client!bja",
      name = "C",
      descriptor = "I"
   )
   public static int field393 = 1;
   @OriginalMember(
      owner = "client!bja",
      name = "B",
      descriptor = "Ldl;"
   )
   public static class69 field391;

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method265(int arg0) {
      try {
         field389 = null;
         int var1 = -58 % ((12 - arg0) / 46);
         field391 = null;
         field385 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field394[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "<init>",
      descriptor = "(Lkfa;Ltga;III[B)V"
   )
   public class33(class632 arg0, class63 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, 32879, arg1, class335.field4803, arg2 * arg3 * arg4, false);

      try {
         this.field388 = arg3;
         this.field387 = arg4;
         this.field386 = arg2;
         super.field6694.method2581(this, 109);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field6681, 0, this.method3537((byte)-78), this.field386, this.field388, this.field387, 0, class133.method1124(super.field6695, 217), 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field394[2] + (arg0 != null ? field394[1] : field394[0]) + ',' + (arg1 != null ? field394[1] : field394[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field394[1] : field394[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method266(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method267(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
