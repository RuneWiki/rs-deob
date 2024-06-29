import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class441 extends class690 {
   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6121 = new String[]{method3280(method3279("A\u0013<|b")), method3280(method3279("OJ<\u00117")), method3280(method3279("TH~>")), method3280(method3279("OJ<\u00167")), method3280(method3279("OJ<\u00137"))};
   @OriginalMember(
      owner = "client!uw",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field6116 = new int[2];
   @OriginalMember(
      owner = "client!uw",
      name = "r",
      descriptor = "I"
   )
   public static int field6115;
   @OriginalMember(
      owner = "client!uw",
      name = "q",
      descriptor = "I"
   )
   private int field6117;
   @OriginalMember(
      owner = "client!uw",
      name = "p",
      descriptor = "I"
   )
   public static int field6118;
   @OriginalMember(
      owner = "client!uw",
      name = "n",
      descriptor = "I"
   )
   public static int field6119;
   @OriginalMember(
      owner = "client!uw",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   private String field6120;

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         this.field6117 = arg0.method4302(true);
         if (arg1 <= -19) {
            ++field6115;
            this.field6120 = arg0.method4291(-10);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6121[3] + (arg0 != null ? field6121[0] : field6121[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         ++field6119;
         arg1.method1181((byte)-113, this.field6120, this.field6117);
         if (arg0) {
            field6116 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6121[1] + arg0 + ',' + (arg1 != null ? field6121[0] : field6121[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3278(byte arg0) {
      try {
         if (arg0 != 73) {
            field6118 = -117;
         }

         field6116 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6121[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3279(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3280(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
