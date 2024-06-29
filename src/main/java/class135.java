import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class135 extends class380 {
   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2229 = new String[]{method1286(method1285("~_\u00009\u0016")), method1286(method1285("~_\u0000>\u0016")), method1286(method1285("~_\u0000=\u0016")), method1286(method1285("~_\u0000?\u0016")), method1286(method1285("~_\u0000<\u0016")), method1286(method1285("~_\u00008\u0016")), method1286(method1285("~_\u0000:\u0016"))};
   @OriginalMember(
      owner = "client!ut",
      name = "x",
      descriptor = "I"
   )
   public static int field2214 = 0;
   @OriginalMember(
      owner = "client!ut",
      name = "q",
      descriptor = "I"
   )
   public static int field2225 = -1;
   @OriginalMember(
      owner = "client!ut",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field2224 = new int[1];
   @OriginalMember(
      owner = "client!ut",
      name = "k",
      descriptor = "I"
   )
   public static int field2215;
   @OriginalMember(
      owner = "client!ut",
      name = "p",
      descriptor = "I"
   )
   public static int field2216;
   @OriginalMember(
      owner = "client!ut",
      name = "o",
      descriptor = "I"
   )
   public static int field2217;
   @OriginalMember(
      owner = "client!ut",
      name = "l",
      descriptor = "I"
   )
   public int field2218;
   @OriginalMember(
      owner = "client!ut",
      name = "r",
      descriptor = "I"
   )
   public static int field2219;
   @OriginalMember(
      owner = "client!ut",
      name = "n",
      descriptor = "I"
   )
   public static int field2221;
   @OriginalMember(
      owner = "client!ut",
      name = "s",
      descriptor = "I"
   )
   public static int field2222;
   @OriginalMember(
      owner = "client!ut",
      name = "y",
      descriptor = "I"
   )
   public int field2223;
   @OriginalMember(
      owner = "client!ut",
      name = "u",
      descriptor = "I"
   )
   public static int field2226;
   @OriginalMember(
      owner = "client!ut",
      name = "t",
      descriptor = "I"
   )
   public int field2227;
   @OriginalMember(
      owner = "client!ut",
      name = "v",
      descriptor = "I"
   )
   public int field2228;
   @OriginalMember(
      owner = "client!ut",
      name = "m",
      descriptor = "J"
   )
   public long field2220;

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1278(int arg0) {
      try {
         ++field2222;
         if (arg0 != 2) {
            this.method1282(-58);
         }

         return this.field2227;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2229[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method1279(int arg0) {
      try {
         if (arg0 != 1) {
            method1279(-110);
         }

         field2224 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2229[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "g",
      descriptor = "(I)J"
   )
   public final long method1280(int arg0) {
      try {
         int var2 = -115 % ((arg0 - -75) / 35);
         ++field2215;
         return this.field2220;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2229[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method1281(int arg0) {
      try {
         ++field2216;
         return arg0 != 1 ? -29 : this.field2218;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2229[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1282(int arg0) {
      try {
         if (arg0 != 5) {
            this.field2227 = 123;
         }

         ++field2221;
         return this.field2223;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2229[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method1283(int arg0) {
      try {
         if (arg0 == 21850) {
            ++field2226;
            class728.method5259(43);
            class262.field3734 = false;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2229[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1284(byte arg0) {
      try {
         if (arg0 < 39) {
            return -17;
         } else {
            ++field2219;
            return this.field2228;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2229[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1285(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1286(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
