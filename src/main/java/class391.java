import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class391 extends class347 {
   @OriginalMember(
      owner = "client!wu",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field5951;
   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5952 = new String[]{method2993(method2992("{=\u001aBc")), method2993(method2992("{=\u001a?\"b!@=c")), method2993(method2992("wf\u001a-6")), method2993(method2992("b=Xo"))};
   @OriginalMember(
      owner = "client!wu",
      name = "j",
      descriptor = "I"
   )
   public static int field5949;
   @OriginalMember(
      owner = "client!wu",
      name = "i",
      descriptor = "I"
   )
   public static int field5950;

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2991(boolean arg0) {
      try {
         if (!arg0) {
            method2991(false);
         }

         class32.field349.method5451(-117);
         ++field5949;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5952[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "<init>",
      descriptor = "()V"
   )
   public class391() {
   }

   @OriginalMember(
      owner = "client!wu",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class391(String arg0) {
      try {
         this.field5951 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5952[1] + (arg0 != null ? field5952[2] : field5952[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2992(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2993(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
