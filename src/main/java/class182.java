import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class182 extends class429 {
   @OriginalMember(
      owner = "client!hga",
      name = "r",
      descriptor = "I"
   )
   public int field2787;
   @OriginalMember(
      owner = "client!hga",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   public String field2788;
   @OriginalMember(
      owner = "client!hga",
      name = "t",
      descriptor = "S"
   )
   public short field2785;
   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2789 = new String[]{method1612(method1611("\u0002~Y[$B")), method1612(method1611("\u0002~Y[Y\u0003wQ\u0001[B")), method1612(method1611("\u0004lT\u0019")), method1612(method1611("\u00117\u0016[\u0018"))};
   @OriginalMember(
      owner = "client!hga",
      name = "s",
      descriptor = "I"
   )
   public static int field2786;

   @OriginalMember(
      owner = "client!hga",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1610(int arg0) {
      try {
         ++field2786;
         class528.method3957(-1, 255, 0);
         if (arg0 >= 28) {
            ;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2789[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class182(String arg0, int arg1) {
      try {
         this.field2787 = (int)(class57.method650(95) / 1000L);
         this.field2788 = arg0;
         this.field2785 = (short)arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2789[1] + (arg0 != null ? field2789[3] : field2789[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1611(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1612(char[] arg0) {
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
            var10005 = 25;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
