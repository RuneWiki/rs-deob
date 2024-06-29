import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class359 {
   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5120 = new String[]{method2809(method2808("\u000bZK]w")), method2809(method2808("\u000bZK^w"))};
   @OriginalMember(
      owner = "client!jg",
      name = "i",
      descriptor = "Leka;"
   )
   public static class494 field5109 = new class494();
   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5118 = false;
   @OriginalMember(
      owner = "client!jg",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field5117 = false;
   @OriginalMember(
      owner = "client!jg",
      name = "l",
      descriptor = "B"
   )
   public byte field5101;
   @OriginalMember(
      owner = "client!jg",
      name = "u",
      descriptor = "B"
   )
   public byte field5103;
   @OriginalMember(
      owner = "client!jg",
      name = "f",
      descriptor = "B"
   )
   public byte field5104;
   @OriginalMember(
      owner = "client!jg",
      name = "j",
      descriptor = "B"
   )
   public byte field5105;
   @OriginalMember(
      owner = "client!jg",
      name = "q",
      descriptor = "B"
   )
   public byte field5106;
   @OriginalMember(
      owner = "client!jg",
      name = "n",
      descriptor = "B"
   )
   public byte field5111;
   @OriginalMember(
      owner = "client!jg",
      name = "r",
      descriptor = "B"
   )
   public byte field5114;
   @OriginalMember(
      owner = "client!jg",
      name = "c",
      descriptor = "I"
   )
   public static int field5096;
   @OriginalMember(
      owner = "client!jg",
      name = "m",
      descriptor = "I"
   )
   public int field5098;
   @OriginalMember(
      owner = "client!jg",
      name = "d",
      descriptor = "I"
   )
   public int field5100;
   @OriginalMember(
      owner = "client!jg",
      name = "k",
      descriptor = "I"
   )
   public int field5113;
   @OriginalMember(
      owner = "client!jg",
      name = "e",
      descriptor = "S"
   )
   public short field5112;
   @OriginalMember(
      owner = "client!jg",
      name = "g",
      descriptor = "Z"
   )
   public boolean field5097;
   @OriginalMember(
      owner = "client!jg",
      name = "h",
      descriptor = "Z"
   )
   public boolean field5099;
   @OriginalMember(
      owner = "client!jg",
      name = "v",
      descriptor = "Z"
   )
   public boolean field5102;
   @OriginalMember(
      owner = "client!jg",
      name = "t",
      descriptor = "Z"
   )
   public boolean field5107;
   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "Z"
   )
   public boolean field5108;
   @OriginalMember(
      owner = "client!jg",
      name = "x",
      descriptor = "Z"
   )
   public boolean field5110;
   @OriginalMember(
      owner = "client!jg",
      name = "w",
      descriptor = "Z"
   )
   public boolean field5115;
   @OriginalMember(
      owner = "client!jg",
      name = "s",
      descriptor = "Z"
   )
   public boolean field5116;
   @OriginalMember(
      owner = "client!jg",
      name = "o",
      descriptor = "[B"
   )
   public static byte[] field5119;

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(BIII)I"
   )
   public static final int method2806(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5096;
         if (arg0 != 96) {
            method2806((byte)19, 85, -63, -12);
         }

         if (arg1 == arg3) {
            return arg3;
         } else {
            int var4 = 128 - arg2;
            int var5 = (arg1 & 127) * arg2 + (arg3 & 127) * var4 >> 7;
            int var6 = (896 & arg1) * arg2 + (arg3 & 896) * var4 >> 7;
            int var7 = (arg1 & 64512) * arg2 + (64512 & arg3) * var4 >> 7;
            return 127 & var5 | var7 & 64512 | var6 & 896;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5120[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2807(int arg0) {
      try {
         field5119 = null;
         if (arg0 != 896) {
            field5117 = true;
         }

         field5109 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5120[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2808(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2809(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
