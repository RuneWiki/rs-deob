import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class316 {
   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "Lrk;"
   )
   public class35 field4567;
   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4568 = new String[]{method2478(method2477("S]czL")), method2478(method2477("SJ!\\")), method2478(method2477("F\u0011c\u001e\u0019")), method2478(method2477("S]c\f\rSV9\u000eL"))};
   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "I"
   )
   public static int field4566;

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(IILufa;)V"
   )
   public abstract void method804(int arg0, int arg1, class707 arg2);

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(BZ)V"
   )
   public abstract void method811(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method805(int arg0);

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method807(int arg0);

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Luda;ILjava/lang/String;)I"
   )
   public static final int method2476(class473 arg0, int arg1, String arg2) {
      try {
         ++field4566;
         int var3 = arg0.field6907;
         byte[] var4 = class335.method2603(-1129, arg2);
         arg0.method3584(var4.length, (byte)116);
         arg0.field6907 += class206.field3081.method3082(var4, var4.length, arg1, arg0.field6907, -428020381, arg0.field6889);
         return -var3 + arg0.field6907;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4568[0] + (arg0 != null ? field4568[2] : field4568[1]) + ',' + arg1 + ',' + (arg2 != null ? field4568[2] : field4568[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(BZ)V"
   )
   public abstract void method806(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method810(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!nb",
      name = "<init>",
      descriptor = "(Lrk;)V"
   )
   public class316(class35 arg0) {
      try {
         this.field4567 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4568[3] + (arg0 != null ? field4568[2] : field4568[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
