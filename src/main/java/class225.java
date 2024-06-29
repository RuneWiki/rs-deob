import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class225 {
   @OriginalMember(
      owner = "client!cea",
      name = "f",
      descriptor = "B"
   )
   public byte field2825;
   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2833 = new String[]{method1725(method1724("$MlW\u000eo")), method1725(method1724("$MlWs.Fd\rqo")), method1725(method1724("$MlW\ro"))};
   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2817 = new int[32];
   @OriginalMember(
      owner = "client!cea",
      name = "e",
      descriptor = "I"
   )
   public static int field2818;
   @OriginalMember(
      owner = "client!cea",
      name = "h",
      descriptor = "I"
   )
   public static int field2829;
   @OriginalMember(
      owner = "client!cea",
      name = "k",
      descriptor = "Lcea;"
   )
   public class225 field2828;
   @OriginalMember(
      owner = "client!cea",
      name = "m",
      descriptor = "Lec;"
   )
   public class247 field2826;
   @OriginalMember(
      owner = "client!cea",
      name = "n",
      descriptor = "Lmi;"
   )
   public class525 field2820;
   @OriginalMember(
      owner = "client!cea",
      name = "l",
      descriptor = "Lbs;"
   )
   public class718 field2830;
   @OriginalMember(
      owner = "client!cea",
      name = "d",
      descriptor = "Lbs;"
   )
   public class718 field2831;
   @OriginalMember(
      owner = "client!cea",
      name = "p",
      descriptor = "Ljn;"
   )
   public class752 field2821;
   @OriginalMember(
      owner = "client!cea",
      name = "j",
      descriptor = "Liia;"
   )
   public class95 field2822;
   @OriginalMember(
      owner = "client!cea",
      name = "g",
      descriptor = "Liia;"
   )
   public class95 field2824;
   @OriginalMember(
      owner = "client!cea",
      name = "i",
      descriptor = "S"
   )
   public short field2819;
   @OriginalMember(
      owner = "client!cea",
      name = "o",
      descriptor = "S"
   )
   public short field2823;
   @OriginalMember(
      owner = "client!cea",
      name = "b",
      descriptor = "S"
   )
   public short field2827;
   @OriginalMember(
      owner = "client!cea",
      name = "c",
      descriptor = "S"
   )
   public short field2832;

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1722(byte arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 <= 83) {
            this.method1722((byte)-120);
         }

         ++field2829;
         if (var2 || this.field2821 != null) {
            do {
               class752 var3 = this.field2821.field10923;
               this.field2821.method5428(500);
               this.field2821 = var3;
            } while(this.field2821 != null);

         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2833[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1723(int arg0) {
      try {
         if (arg0 != 32) {
            field2817 = null;
         }

         field2817 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2833[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cea",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class225(int arg0) {
      try {
         this.field2825 = (byte)arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2833[1] + arg0 + ')');
      }
   }

   static {
      int var0 = 2;

      for(int var1 = 0; ~var1 > -33; ++var1) {
         field2817[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1724(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1725(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
