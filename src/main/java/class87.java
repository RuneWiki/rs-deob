import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class87 {
   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1144 = new String[]{method773(method772("N*r8\r")), method773(method772("N*r;\r"))};
   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "I"
   )
   public static int field1142 = 765;
   @OriginalMember(
      owner = "client!kl",
      name = "d",
      descriptor = "I"
   )
   public static int field1140;
   @OriginalMember(
      owner = "client!kl",
      name = "e",
      descriptor = "Lkf;"
   )
   public static class266 field1138;
   @OriginalMember(
      owner = "client!kl",
      name = "b",
      descriptor = "[B"
   )
   public byte[] field1143;
   @OriginalMember(
      owner = "client!kl",
      name = "f",
      descriptor = "[S"
   )
   public short[] field1137;
   @OriginalMember(
      owner = "client!kl",
      name = "g",
      descriptor = "[S"
   )
   public short[] field1139;
   @OriginalMember(
      owner = "client!kl",
      name = "c",
      descriptor = "[S"
   )
   public short[] field1141;

   @OriginalMember(
      owner = "client!kl",
      name = "b",
      descriptor = "(B)V",
      line = 5
   )
   public static final void method770(byte arg0) {
      try {
         ++field1140;
         class541.field7769.method731(0);
         if (arg0 <= 71) {
            method771((byte)87);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1144[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(B)V",
      line = 17
   )
   public static void method771(byte arg0) {
      try {
         if (arg0 >= -81) {
            method770((byte)73);
         }

         field1138 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1144[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method772(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method773(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
