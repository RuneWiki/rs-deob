import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class504 extends class191 {
   @OriginalMember(
      owner = "client!er",
      name = "q",
      descriptor = "I"
   )
   private int field7179 = -1;
   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7183 = new String[]{method3807(method3806("(\u001c\u000b)")), method3807(method3806("#\u001bI\u0007N")), method3807(method3806("=GIk\u001b")), method3807(method3806("#\u001bI\u0000N")), method3807(method3806("#\u001bI\u0001N")), method3807(method3806("#\u001bI\u0006N"))};
   @OriginalMember(
      owner = "client!er",
      name = "p",
      descriptor = "Lgq;"
   )
   public static class200 field7180 = new class200();
   @OriginalMember(
      owner = "client!er",
      name = "l",
      descriptor = "Lub;"
   )
   public static class306 field7181 = class599.method4396((byte)-118);
   @OriginalMember(
      owner = "client!er",
      name = "r",
      descriptor = "I"
   )
   public static int field7182 = 0;
   @OriginalMember(
      owner = "client!er",
      name = "m",
      descriptor = "I"
   )
   public static int field7176;
   @OriginalMember(
      owner = "client!er",
      name = "o",
      descriptor = "I"
   )
   public static int field7177;
   @OriginalMember(
      owner = "client!er",
      name = "n",
      descriptor = "I"
   )
   public static int field7178;

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(IZILsa;IB)V"
   )
   public static final void method3804(int arg0, boolean arg1, int arg2, class39 arg3, int arg4, byte arg5) {
      try {
         ++field7177;
         class234.method2074(arg1, arg2, arg3, 0L, arg0, (byte)-80, arg4);
         int var6 = 60 / ((-28 - arg5) / 56);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7183[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7183[2] : field7183[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         ++field7176;
         if (arg0 > -106) {
            this.method346((class65)null, -40);
         }

         arg1.method3527(this.field7179, 0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7183[1] + arg0 + ',' + (arg1 != null ? field7183[2] : field7183[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         ++field7178;
         if (arg1 <= -97) {
            this.field7179 = arg0.method685(-2);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7183[5] + (arg0 != null ? field7183[2] : field7183[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3805(byte arg0) {
      try {
         field7181 = null;
         field7180 = null;
         int var1 = -106 % ((arg0 - 41) / 51);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7183[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3806(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3807(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
