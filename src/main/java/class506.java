import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class506 {
   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7199 = new String[]{method3816(method3815("UKe\u001f\u007fgZ9\u0002~S\u0006")), method3816(method3815("UKe)8")), method3816(method3815("UKe(8")), method3816(method3815("UKe*8"))};
   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "I"
   )
   public static int field7194 = 0;
   @OriginalMember(
      owner = "client!ae",
      name = "f",
      descriptor = "I"
   )
   public static int field7197 = 0;
   @OriginalMember(
      owner = "client!ae",
      name = "c",
      descriptor = "I"
   )
   public static int field7193;
   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "I"
   )
   public static int field7195;
   @OriginalMember(
      owner = "client!ae",
      name = "d",
      descriptor = "I"
   )
   public static int field7198;
   @OriginalMember(
      owner = "client!ae",
      name = "e",
      descriptor = "[[[Lhs;"
   )
   public static class312[][][] field7196;

   @OriginalMember(
      owner = "client!ae",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field7193;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7199[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3812(byte arg0) {
      try {
         int var2 = -125 % ((-9 - arg0) / 35);
         ++field7198;
         return class231.field3595 == this | class559.field7935 == this;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7199[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3813(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7195;
         if (arg3 > -38) {
            field7197 = 2;
         }

         class111 var5 = class796.method5734(19, (long)arg0 << 32 | (long)arg2, (byte)-111);
         var5.method1087(0);
         var5.field1740 = arg4;
         var5.field1739 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7199[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3814(byte arg0) {
      try {
         field7196 = null;
         int var1 = 51 % ((20 - arg0) / 55);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7199[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3815(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3816(char[] arg0) {
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
            var10005 = 46;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
