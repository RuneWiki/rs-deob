import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class309 {
   @OriginalMember(
      owner = "client!tf",
      name = "o",
      descriptor = "I"
   )
   private int field4446;
   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "I"
   )
   public int field4455;
   @OriginalMember(
      owner = "client!tf",
      name = "n",
      descriptor = "B"
   )
   public byte field4460;
   @OriginalMember(
      owner = "client!tf",
      name = "j",
      descriptor = "I"
   )
   public int field4459;
   @OriginalMember(
      owner = "client!tf",
      name = "m",
      descriptor = "I"
   )
   public int field4451;
   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4462 = new String[]{method2414(method2413("$rKM\u0015")), method2414(method2413("$rKO\u0015")), method2414(method2413("$rKN\u0015")), method2414(method2413(">a\t`")), method2414(method2413("+:K\"@")), method2414(method2413("$rKH\u0015")), method2414(method2413("$rK0T>}\u00112\u0015"))};
   @OriginalMember(
      owner = "client!tf",
      name = "g",
      descriptor = "[F"
   )
   public static float[] field4445 = new float[4];
   @OriginalMember(
      owner = "client!tf",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field4456 = new int[1];
   @OriginalMember(
      owner = "client!tf",
      name = "q",
      descriptor = "I"
   )
   public static int field4441;
   @OriginalMember(
      owner = "client!tf",
      name = "e",
      descriptor = "I"
   )
   public int field4442;
   @OriginalMember(
      owner = "client!tf",
      name = "l",
      descriptor = "I"
   )
   public int field4444;
   @OriginalMember(
      owner = "client!tf",
      name = "r",
      descriptor = "I"
   )
   public int field4447;
   @OriginalMember(
      owner = "client!tf",
      name = "p",
      descriptor = "I"
   )
   public static int field4448;
   @OriginalMember(
      owner = "client!tf",
      name = "b",
      descriptor = "I"
   )
   public int field4449;
   @OriginalMember(
      owner = "client!tf",
      name = "c",
      descriptor = "I"
   )
   public int field4450;
   @OriginalMember(
      owner = "client!tf",
      name = "k",
      descriptor = "I"
   )
   public int field4452;
   @OriginalMember(
      owner = "client!tf",
      name = "s",
      descriptor = "I"
   )
   public int field4453;
   @OriginalMember(
      owner = "client!tf",
      name = "d",
      descriptor = "I"
   )
   public int field4454;
   @OriginalMember(
      owner = "client!tf",
      name = "t",
      descriptor = "I"
   )
   public static int field4457;
   @OriginalMember(
      owner = "client!tf",
      name = "u",
      descriptor = "I"
   )
   public int field4458;
   @OriginalMember(
      owner = "client!tf",
      name = "h",
      descriptor = "I"
   )
   public static int field4461;
   @OriginalMember(
      owner = "client!tf",
      name = "i",
      descriptor = "Ltf;"
   )
   public class309 field4443;

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(Luda;I)Lib;"
   )
   public static final class162 method2409(class473 arg0, int arg1) {
      try {
         ++field4448;
         if (arg1 >= -2) {
            return null;
         } else {
            class162 var2 = new class162();
            var2.field2580 = arg0.method3565(true);
            var2.field2581 = class32.field482.method2633(var2.field2580, 1);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4462[2] + (arg0 != null ? field4462[4] : field4462[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IIII)Ltf;"
   )
   public final class309 method2410(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 != 1) {
            method2411((byte)21);
         }

         ++field4457;
         return new class309(this.field4446, arg2, arg3, arg0, this.field4460);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4462[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2411(byte arg0) {
      try {
         field4456 = null;
         field4445 = null;
         if (arg0 < 25) {
            field4445 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4462[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(I)Lbia;"
   )
   public final class522 method2412(int arg0) {
      try {
         ++field4441;
         if (arg0 > -68) {
            this.field4451 = -4;
         }

         return class431.method3248(121, this.field4446);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4462[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "<init>",
      descriptor = "(IIIIB)V"
   )
   public class309(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field4446 = arg0;
         this.field4455 = arg3;
         this.field4460 = arg4;
         this.field4459 = arg1;
         this.field4451 = arg2;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4462[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2413(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2414(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
