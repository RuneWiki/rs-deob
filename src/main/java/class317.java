import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class317 {
   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4330 = new String[]{method2327(method2326("\u0011~G;")), method2327(method2326("\u0011~D;"))};
   @OriginalMember(
      owner = "client!w",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field4325 = new int[200];
   @OriginalMember(
      owner = "client!w",
      name = "l",
      descriptor = "B"
   )
   public byte field4308;
   @OriginalMember(
      owner = "client!w",
      name = "p",
      descriptor = "B"
   )
   public byte field4316;
   @OriginalMember(
      owner = "client!w",
      name = "q",
      descriptor = "B"
   )
   public byte field4321;
   @OriginalMember(
      owner = "client!w",
      name = "s",
      descriptor = "B"
   )
   public byte field4322;
   @OriginalMember(
      owner = "client!w",
      name = "h",
      descriptor = "B"
   )
   public byte field4324;
   @OriginalMember(
      owner = "client!w",
      name = "t",
      descriptor = "B"
   )
   public byte field4326;
   @OriginalMember(
      owner = "client!w",
      name = "k",
      descriptor = "B"
   )
   public byte field4327;
   @OriginalMember(
      owner = "client!w",
      name = "r",
      descriptor = "I"
   )
   public static int field4311;
   @OriginalMember(
      owner = "client!w",
      name = "u",
      descriptor = "I"
   )
   public int field4317;
   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "I"
   )
   public int field4319;
   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "I"
   )
   public int field4329;
   @OriginalMember(
      owner = "client!w",
      name = "e",
      descriptor = "Lkf;"
   )
   public static class266 field4323;
   @OriginalMember(
      owner = "client!w",
      name = "f",
      descriptor = "S"
   )
   public short field4314;
   @OriginalMember(
      owner = "client!w",
      name = "n",
      descriptor = "Z"
   )
   public boolean field4309;
   @OriginalMember(
      owner = "client!w",
      name = "d",
      descriptor = "Z"
   )
   public boolean field4310;
   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "Z"
   )
   public boolean field4312;
   @OriginalMember(
      owner = "client!w",
      name = "m",
      descriptor = "Z"
   )
   public boolean field4313;
   @OriginalMember(
      owner = "client!w",
      name = "o",
      descriptor = "Z"
   )
   public boolean field4315;
   @OriginalMember(
      owner = "client!w",
      name = "j",
      descriptor = "Z"
   )
   public boolean field4318;
   @OriginalMember(
      owner = "client!w",
      name = "g",
      descriptor = "Z"
   )
   public boolean field4320;
   @OriginalMember(
      owner = "client!w",
      name = "i",
      descriptor = "Z"
   )
   public boolean field4328;

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2324(byte arg0) {
      try {
         field4325 = null;
         field4323 = null;
         int var1 = 34 / ((arg0 - 30) / 63);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4330[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(JII)Lwn;"
   )
   public static final class755 method2325(long arg0, int arg1, int arg2) {
      try {
         ++field4311;
         if (arg1 <= 91) {
            field4325 = null;
         }

         class755 var4 = (class755)class416.field5993.method329((byte)124, (long)arg2 << 56 | arg0);
         if (var4 == null) {
            var4 = new class755(arg2, arg0);
            class416.field5993.method336(-1, var4.field6137, var4);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4330[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
