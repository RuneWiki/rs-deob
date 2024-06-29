import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class704 extends class428 {
   @OriginalMember(
      owner = "client!fb",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   public String field10279;
   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10282 = new String[]{method5129(method5128("23\u0002PH")), method5129(method5128("23\u0002SH")), method5129(method5128("/\u007f\u0002?\u001d")), method5129(method5128("23\u0002-\t:8X/H")), method5129(method5128(":$@}"))};
   @OriginalMember(
      owner = "client!fb",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field10277 = false;
   @OriginalMember(
      owner = "client!fb",
      name = "o",
      descriptor = "I"
   )
   public static int field10281 = 100;
   @OriginalMember(
      owner = "client!fb",
      name = "n",
      descriptor = "I"
   )
   public static int field10278;
   @OriginalMember(
      owner = "client!fb",
      name = "p",
      descriptor = "I"
   )
   public static int field10280;

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Z)V",
      line = 13
   )
   public static final void method5126(boolean arg0) {
      try {
         ++field10280;
         class767.method5551(13522);
         class131.field1677 = arg0;
         class525.method3800((byte)-122, class357.field4796, class185.field2624, class305.field4177, class285.field3949);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10282[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "<init>",
      descriptor = "()V",
      line = 22
   )
   public class704() {
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(I)[Lkda;",
      line = 29
   )
   public static final class412[] method5127(int arg0) {
      try {
         int var1 = 45 % ((49 - arg0) / 58);
         ++field10278;
         return new class412[]{class435.field6230, class161.field2298, class408.field5903, class644.field9405, class716.field10409, class657.field9600, class282.field3914};
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10282[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 41
   )
   public class704(String arg0, int arg1) {
      try {
         this.field10279 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10282[3] + (arg0 != null ? field10282[2] : field10282[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
