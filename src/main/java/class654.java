import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class654 implements class751 {
   @OriginalMember(
      owner = "client!sk",
      name = "d",
      descriptor = "[F"
   )
   public float[] field9150;
   @OriginalMember(
      owner = "client!sk",
      name = "b",
      descriptor = "I"
   )
   public int field9149;
   @OriginalMember(
      owner = "client!sk",
      name = "e",
      descriptor = "I"
   )
   public int field9147;
   @OriginalMember(
      owner = "client!sk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9152 = new String[]{method4728(method4727("<_V\b#!]\f\nb")), method4728(method4727("<_Vub"))};
   @OriginalMember(
      owner = "client!sk",
      name = "c",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field9148 = new BigInteger(method4728(method4727("~\u0004H\u0004{")), 16);
   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "I"
   )
   public static int field9151 = -2;

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4726(int arg0) {
      try {
         field9148 = null;
         if (arg0 != 16) {
            method4726(-43);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9152[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class654(int arg0, int arg1) {
      try {
         this.field9150 = new float[arg0 * arg1];
         this.field9149 = arg0;
         this.field9147 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9152[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4727(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4728(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
