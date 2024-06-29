import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class669 {
   @OriginalMember(
      owner = "client!pw",
      name = "c",
      descriptor = "I"
   )
   public int field9395 = -1;
   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9401 = new String[]{method4855(method4854("TY[\u0010")), method4855(method4854("J[\u0019=.")), method4855(method4854("A\u0002\u0019R{"))};
   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "I"
   )
   public static int field9394;
   @OriginalMember(
      owner = "client!pw",
      name = "g",
      descriptor = "I"
   )
   public static int field9398;
   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "Lffa;"
   )
   public class248 field9397;
   @OriginalMember(
      owner = "client!pw",
      name = "d",
      descriptor = "[I"
   )
   public int[] field9399;
   @OriginalMember(
      owner = "client!pw",
      name = "e",
      descriptor = "[J"
   )
   public long[] field9400;
   @OriginalMember(
      owner = "client!pw",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field9396;

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(ILjca;)Z"
   )
   public static final boolean method4853(int arg0, class541 arg1) {
      try {
         ++field9398;
         if (arg1 == null) {
            return false;
         } else if (!arg1.field7629) {
            return false;
         } else if (!arg1.method4032(class651.field9208, (byte)-127)) {
            return false;
         } else if (class767.field11012.method3101(arg0, (long)arg1.field7623) != null) {
            return false;
         } else {
            return class410.field6010.method3101(arg0, (long)arg1.field7606) == null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9401[1] + arg0 + ',' + (arg1 != null ? field9401[2] : field9401[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4854(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4855(char[] arg0) {
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
            var10005 = 44;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
