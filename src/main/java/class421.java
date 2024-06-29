import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class421 extends class605 {
   @OriginalMember(
      owner = "client!iea",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6135 = new String[]{method3286(method3285("e\u0006Be?$")), method3286(method3285("e\u0006Be=$")), method3286(method3285("e\u0006Be0$"))};
   @OriginalMember(
      owner = "client!iea",
      name = "B",
      descriptor = "I"
   )
   public static int field6134 = 0;
   @OriginalMember(
      owner = "client!iea",
      name = "C",
      descriptor = "Lvf;"
   )
   public static class73 field6133 = new class73();
   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "I"
   )
   public static int field6130;
   @OriginalMember(
      owner = "client!iea",
      name = "A",
      descriptor = "I"
   )
   public static int field6132;
   @OriginalMember(
      owner = "client!iea",
      name = "y",
      descriptor = "[B"
   )
   private byte[] field6131;

   @OriginalMember(
      owner = "client!iea",
      name = "<init>",
      descriptor = "()V"
   )
   public class421() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(IIIB)[B"
   )
   public final byte[] method3282(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field6132;
         this.field6131 = new byte[arg0 * arg1 * arg2 * 2];
         if (arg3 <= 59) {
            this.method3282(-15, -128, -91, (byte)71);
         }

         this.method1522(arg2, arg0, arg1, -119);
         return this.field6131;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6135[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "e",
      descriptor = "(Z)V"
   )
   public static void method3283(boolean arg0) {
      try {
         if (arg0) {
            method3284(-42, -72, -63);
         }

         field6133 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6135[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(III)Ljf;"
   )
   public static final class565 method3284(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      return var3 == null ? null : var3.field4688;
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method957(byte arg0, int arg1, int arg2) {
      try {
         if (arg1 == 255) {
            ++field6130;
            int var4 = arg2 * 2;
            byte var7 = (byte)((127 & arg0 >> 1) + 127);
            int var10001 = var4;
            int var8 = var4 + 1;
            this.field6131[var10001] = var7;
            this.field6131[var8] = var7;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6135[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3285(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3286(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
