import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class436 {
   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "Lli;"
   )
   public class112 field6682;
   @OriginalMember(
      owner = "client!gs",
      name = "e",
      descriptor = "B"
   )
   public byte field6684;
   @OriginalMember(
      owner = "client!gs",
      name = "d",
      descriptor = "S"
   )
   public short field6681;
   @OriginalMember(
      owner = "client!gs",
      name = "f",
      descriptor = "B"
   )
   public byte field6685;
   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6686 = new String[]{method3433(method3432("4\u0001K\u001c")), method3433(method3432("=\u0007\tL-4\u001dSNl")), method3433(method3432("!Z\t^9")), method3433(method3432("=\u0007\t1l"))};
   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "I"
   )
   public static int field6683 = -1;
   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "I"
   )
   public static int field6680;

   @OriginalMember(
      owner = "client!gs",
      name = "<init>",
      descriptor = "(Lli;III)V",
      line = 13
   )
   public class436(class112 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field6682 = arg0;
         this.field6684 = (byte)arg3;
         this.field6681 = (short)arg1;
         this.field6685 = (byte)arg2;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6686[1] + (arg0 != null ? field6686[2] : field6686[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IIILd;Ljava/awt/Canvas;)Lha;",
      line = 27
   )
   public static final class610 method3431(int arg0, int arg1, int arg2, class150 arg3, Canvas arg4) {
      try {
         if (arg0 != 6479) {
            return null;
         } else {
            ++field6680;
            return new class74(arg4, arg3, arg2, arg1);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6686[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6686[2] : field6686[0]) + ',' + (arg4 != null ? field6686[2] : field6686[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3432(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3433(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
