import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class629 {
   @OriginalMember(
      owner = "client!ie",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field65 = new String[]{method48(method47("\\\u001d\u001e\u000b5")), method48(method47("\\\u001d\u001e\u000f5")), method48(method47("\\\u001d\u001e\f5"))};
   @OriginalMember(
      owner = "client!ie",
      name = "G",
      descriptor = "I"
   )
   public static int field60 = 0;
   @OriginalMember(
      owner = "client!ie",
      name = "E",
      descriptor = "Lgh;"
   )
   public static class572 field62 = new class572(77, 7);
   @OriginalMember(
      owner = "client!ie",
      name = "D",
      descriptor = "Lfd;"
   )
   public static class551 field63 = new class551();
   @OriginalMember(
      owner = "client!ie",
      name = "I",
      descriptor = "Luw;"
   )
   public static class435 field64 = new class435(7, -1);
   @OriginalMember(
      owner = "client!ie",
      name = "H",
      descriptor = "I"
   )
   public static int field59;
   @OriginalMember(
      owner = "client!ie",
      name = "F",
      descriptor = "I"
   )
   public static int field61;

   @OriginalMember(
      owner = "client!ie",
      name = "c",
      descriptor = "(III)I"
   )
   private final int method44(int arg0, int arg1, int arg2) {
      try {
         ++field61;
         if (arg0 != -1610) {
            method46(94);
         }

         int var4 = arg1 - -(arg2 * 57);
         int var5 = var4 ^ var4 << 1;
         return -(((var5 * 15731 * var5 - -789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field65[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "<init>",
      descriptor = "()V"
   )
   public class6() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ie",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field59;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            field63 = null;
         }

         if (super.field9161.field7474) {
            int var5 = class442.field6448[arg0];
            int var6 = 0;
            if (var3 || ~var6 > ~class66.field1214) {
               do {
                  var4[var6] = this.method44(-1610, class429.field6201[var6], var5) % 4096;
                  ++var6;
               } while(~var6 > ~class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field65[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method46(int arg0) {
      try {
         field62 = null;
         field63 = null;
         if (arg0 == 4096) {
            field64 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field65[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method47(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method48(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
