import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class86 extends class546 {
   @OriginalMember(
      owner = "client!kl",
      name = "y",
      descriptor = "I"
   )
   public int field1110;
   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1114 = new String[]{method839(method838("}N*\u0017#")), method839(method838("}N*\u0010#")), method839(method838("}N*hbxKpj#"))};
   @OriginalMember(
      owner = "client!kl",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field1108 = new int[14];
   @OriginalMember(
      owner = "client!kl",
      name = "u",
      descriptor = "Lbga;"
   )
   public static class378 field1109 = new class378(134, -1);
   @OriginalMember(
      owner = "client!kl",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field1113 = new int[8];
   @OriginalMember(
      owner = "client!kl",
      name = "v",
      descriptor = "I"
   )
   public static int field1112 = 0;
   @OriginalMember(
      owner = "client!kl",
      name = "x",
      descriptor = "I"
   )
   public static int field1111;

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method836(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field1111;
         if (arg1 != 8779) {
            method837(-17);
         }

         class446 var5 = class635.method4607(113, (long)arg0, 8);
         var5.method3311(true);
         var5.field6175 = arg3;
         var5.field6177 = arg4;
         var5.field6167 = arg2;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1114[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "b",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public abstract Object method268(byte arg0);

   @OriginalMember(
      owner = "client!kl",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method837(int arg0) {
      try {
         field1109 = null;
         if (arg0 >= -7) {
            field1112 = -52;
         }

         field1113 = null;
         field1108 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1114[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class86(int arg0) {
      try {
         this.field1110 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1114[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method269(int arg0);

   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method838(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method839(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
