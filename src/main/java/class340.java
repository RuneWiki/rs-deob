import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class340 extends class546 {
   @OriginalMember(
      owner = "client!fda",
      name = "t",
      descriptor = "[B"
   )
   public byte[] field4871;
   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4872 = new String[]{method2698(method2697("u\u00055R\u0017z\u000f=\b\u0015;")), method2698(method2697("}\u00148\u0010")), method2698(method2697("hOzRV")), method2698(method2697("u\u00055Rj;")), method2698(method2697("u\u00055Ri;"))};
   @OriginalMember(
      owner = "client!fda",
      name = "v",
      descriptor = "[Lci;"
   )
   public static class477[] field4869 = new class477[14];
   @OriginalMember(
      owner = "client!fda",
      name = "u",
      descriptor = "I"
   )
   public static int field4870;

   @OriginalMember(
      owner = "client!fda",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2694(byte arg0) {
      try {
         field4869 = null;
         if (arg0 != 43) {
            field4869 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4872[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class340(byte[] arg0) {
      try {
         this.field4871 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4872[0] + (arg0 != null ? field4872[2] : field4872[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method2695(int arg0) {
      int var1 = -1;

      for(int var2 = 0; var2 < class756.field10968 - 1; ++var2) {
         if (arg0 < class530.field7271[var2] + class245.field3064[var2]) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = class756.field10968 - 1;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(IZIIZ)V"
   )
   public static final void method2696(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
      try {
         class368.method2843(arg2, arg1, 0, arg4, class182.field2252.length - 1, -32427, arg3);
         ++field4870;
         class71.field882 = 0;
         int var5 = 122 % ((73 - arg0) / 48);
         class706.field10252 = null;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4872[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2697(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2698(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
