import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class279 extends class31 {
   @OriginalMember(
      owner = "client!wja",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3893 = new String[]{method2145(method2144("/Z\u0016X0p")), method2145(method2144("/Z\u0016X1p")), method2145(method2144("/Z\u0016X7p")), method2145(method2144("/Z\u0016X2p"))};
   @OriginalMember(
      owner = "client!wja",
      name = "K",
      descriptor = "Lcha;"
   )
   public static class227 field3890 = new class227();
   @OriginalMember(
      owner = "client!wja",
      name = "J",
      descriptor = "I"
   )
   public static int field3887;
   @OriginalMember(
      owner = "client!wja",
      name = "I",
      descriptor = "I"
   )
   public int field3888;
   @OriginalMember(
      owner = "client!wja",
      name = "M",
      descriptor = "I"
   )
   public static int field3891;
   @OriginalMember(
      owner = "client!wja",
      name = "G",
      descriptor = "I"
   )
   public static int field3892;
   @OriginalMember(
      owner = "client!wja",
      name = "H",
      descriptor = "Liw;"
   )
   public class332 field3889;
   @OriginalMember(
      owner = "client!wja",
      name = "L",
      descriptor = "[B"
   )
   public byte[] field3886;

   @OriginalMember(
      owner = "client!wja",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method2142(int arg0, int arg1) {
      try {
         if (arg1 >= -37) {
            method2142(-97, 66);
         }

         ++field3891;
         return arg0 == 0 || ~arg0 == -2 || arg0 == 2;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3893[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "b",
      descriptor = "(Z)[B"
   )
   public final byte[] method222(boolean arg0) {
      try {
         ++field3887;
         if (super.field341) {
            throw new RuntimeException();
         } else {
            if (!arg0) {
               method2142(-100, 62);
            }

            return this.field3886;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3893[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method220(boolean arg0) {
      try {
         ++field3892;
         if (!arg0) {
            return -80;
         } else {
            return super.field341 ? 0 : 100;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3893[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method2143(boolean arg0) {
      try {
         field3890 = null;
         if (arg0) {
            field3890 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3893[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2144(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2145(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
