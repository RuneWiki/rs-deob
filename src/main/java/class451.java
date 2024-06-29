import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class451 {
   @OriginalMember(
      owner = "client!wu",
      name = "m",
      descriptor = "B"
   )
   public byte field6569;
   @OriginalMember(
      owner = "client!wu",
      name = "j",
      descriptor = "B"
   )
   public byte field6575;
   @OriginalMember(
      owner = "client!wu",
      name = "b",
      descriptor = "Luba;"
   )
   public class516 field6574;
   @OriginalMember(
      owner = "client!wu",
      name = "i",
      descriptor = "S"
   )
   public short field6578;
   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6583 = new String[]{method3489(method3488("2~  ")), method3489(method3488("'%bb=")), method3489(method3488("+~bp)2b8rh")), method3489(method3488("+~b\u000eh")), method3489(method3488("+~b\rh"))};
   @OriginalMember(
      owner = "client!wu",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field6572 = false;
   @OriginalMember(
      owner = "client!wu",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field6576 = new int[8];
   @OriginalMember(
      owner = "client!wu",
      name = "l",
      descriptor = "Lhha;"
   )
   public static class724 field6577 = new class724(38, -1);
   @OriginalMember(
      owner = "client!wu",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field6579 = new int[128];
   @OriginalMember(
      owner = "client!wu",
      name = "c",
      descriptor = "I"
   )
   public static int field6582;
   @OriginalMember(
      owner = "client!wu",
      name = "d",
      descriptor = "Ljm;"
   )
   public static class483 field6581;
   @OriginalMember(
      owner = "client!wu",
      name = "g",
      descriptor = "I"
   )
   public static int field6570;
   @OriginalMember(
      owner = "client!wu",
      name = "n",
      descriptor = "I"
   )
   public static int field6573;
   @OriginalMember(
      owner = "client!wu",
      name = "e",
      descriptor = "I"
   )
   public static int field6580;
   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "Lwh;"
   )
   public static class350 field6571;

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(Z)[Llg;"
   )
   public static final class655[] method3486(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3487(int arg0) {
      try {
         field6581 = null;
         field6576 = null;
         field6577 = null;
         if (arg0 != 8) {
            method3486(false);
         }

         field6579 = null;
         field6571 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6583[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "<init>",
      descriptor = "(Luba;III)V"
   )
   public class451(class516 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field6569 = (byte)arg3;
         this.field6575 = (byte)arg2;
         this.field6574 = arg0;
         this.field6578 = (short)arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6583[2] + (arg0 != null ? field6583[1] : field6583[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < field6579.length; ++var0) {
         field6579[var0] = -1;
      }

      for(int var1 = 65; var1 <= 90; ++var1) {
         field6579[var1] = var1 - 65;
      }

      for(int var2 = 97; var2 <= 122; ++var2) {
         field6579[var2] = var2 + 26 + -97;
      }

      for(int var3 = 48; var3 <= 57; ++var3) {
         field6579[var3] = var3 + 4;
      }

      field6579[42] = field6579[43] = 62;
      field6579[45] = field6579[47] = 63;
      field6582 = -1;
      field6581 = new class483(2);
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3488(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3489(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
