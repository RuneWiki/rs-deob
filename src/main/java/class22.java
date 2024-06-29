import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 {
   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field257 = new String[]{method138(method137("\tnG#\u0002")), method138(method137("\u0007\"GNW")), method138(method137("\tnG$\u0002")), method138(method137("\u0012y\u0005\f")), method138(method137("\tnG\"\u0002")), method138(method137("\tnG!\u0002"))};
   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "I"
   )
   public static int field255 = 0;
   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "I"
   )
   public static int field256 = -1;
   @OriginalMember(
      owner = "client!ub",
      name = "f",
      descriptor = "I"
   )
   public static int field251;
   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "I"
   )
   public static int field253;
   @OriginalMember(
      owner = "client!ub",
      name = "d",
      descriptor = "I"
   )
   public static int field254;
   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "Lbj;"
   )
   public static class256 field252;

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(B)V",
      line = 11
   )
   public static void method133(byte arg0) {
      try {
         if (arg0 <= 6) {
            method135((byte)-96);
         }

         field252 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field257[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 21
   )
   public static final int method134(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field253;
         int var3 = arg1.length();
         int var4 = 0;
         if (arg0 != -13) {
            field256 = 5;
         }

         int var5 = 0;
         if (var2) {
            var4 = arg1.charAt(var5) + ((var4 << 5) - var4);
            ++var5;
         }

         while(true) {
            while(var3 > var5) {
               var4 = arg1.charAt(var5) + ((var4 << 5) - var4);
               ++var5;
            }

            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field257[2] + arg0 + ',' + (arg1 != null ? field257[1] : field257[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "(B)V",
      line = 44
   )
   public static final void method135(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IB)I",
      line = 441
   )
   public static final int method136(int arg0, byte arg1) {
      try {
         if (arg1 != 48) {
            field252 = null;
         }

         ++field254;
         int var2 = arg0 >>> 1;
         int var3 = var2 | var2 >>> 1;
         int var4 = var3 | var3 >>> 2;
         int var5 = var4 | var4 >>> 4;
         int var6 = var5 | var5 >>> 8;
         int var7 = var6 | var6 >>> 16;
         return ~var7 & arg0;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field257[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method137(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method138(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
