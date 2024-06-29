import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class783 {
   @OriginalMember(
      owner = "client!bda",
      name = "c",
      descriptor = "I"
   )
   public int field11502;
   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11505 = new String[]{method5695(method5694("v]9\u0000R}W1ZP<")), method5695(method5694("v]9\u0000/<")), method5695(method5694("v]9\u0000\u001a{j,\\\u0007z^p")), method5695(method5694("v]9\u0000,<"))};
   @OriginalMember(
      owner = "client!bda",
      name = "e",
      descriptor = "Lnaa;"
   )
   public static class113 field11501 = new class113(40, 3);
   @OriginalMember(
      owner = "client!bda",
      name = "f",
      descriptor = "Ldha;"
   )
   public static class642 field11503 = new class642("", 12);
   @OriginalMember(
      owner = "client!bda",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field11504 = new class498(87, 8);
   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "I"
   )
   public static int field11499;
   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "I"
   )
   public static int field11500;

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(BI)I",
      line = 6
   )
   public static final int method5692(byte arg0, int arg1) {
      try {
         ++field11499;
         if (arg0 != -58) {
            method5692((byte)55, 31);
         }

         return arg1 & 127;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11505[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(I)V",
      line = 22
   )
   public static void method5693(int arg0) {
      try {
         field11504 = null;
         if (arg0 >= -67) {
            field11501 = null;
         }

         field11501 = null;
         field11503 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11505[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 40
   )
   public final String toString() {
      try {
         ++field11500;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11505[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(II)V",
      line = 47
   )
   public class783(int arg0, int arg1) {
      try {
         this.field11502 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11505[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5694(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5695(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
