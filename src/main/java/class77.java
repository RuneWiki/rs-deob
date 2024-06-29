import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class77 extends class405 {
   @OriginalMember(
      owner = "client!hka",
      name = "bb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1026 = new String[]{method740(method739("FZzPe\u0006")), method740(method739("FZzPd\u0006")), method740(method739("FZzPm\u0006"))};
   @OriginalMember(
      owner = "client!hka",
      name = "V",
      descriptor = "[I"
   )
   public static int[] field1021 = new int[3];
   @OriginalMember(
      owner = "client!hka",
      name = "Y",
      descriptor = "Lfea;"
   )
   public static class681 field1025 = new class681(10, 2, 2, 0);
   @OriginalMember(
      owner = "client!hka",
      name = "ab",
      descriptor = "I"
   )
   public static int field1019;
   @OriginalMember(
      owner = "client!hka",
      name = "Z",
      descriptor = "I"
   )
   public static int field1020;
   @OriginalMember(
      owner = "client!hka",
      name = "U",
      descriptor = "I"
   )
   public static int field1023;
   @OriginalMember(
      owner = "client!hka",
      name = "W",
      descriptor = "I"
   )
   public static int field1024;
   @OriginalMember(
      owner = "client!hka",
      name = "X",
      descriptor = "[[[B"
   )
   public static byte[][][] field1022;

   @OriginalMember(
      owner = "client!hka",
      name = "e",
      descriptor = "(III)Loca;"
   )
   public static final class642 method737(int arg0, int arg1, int arg2) {
      try {
         ++field1024;
         if (arg0 != -16985) {
            field1021 = null;
         }

         class642 var3 = class82.method795(arg1, -26545);
         if (~arg2 == 0) {
            return var3;
         } else {
            return var3 != null && var3.field9638 != null && var3.field9638.length > arg2 ? var3.field9638[arg2] : null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1026[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1019;
         if (arg0 != -6752) {
            field1025 = null;
         }

         int[][] var4 = super.field926.method2860(0, arg1);
         if (super.field926.field5048 && this.method3173(0)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg1 % super.field5554 * super.field5554;
            int var9 = 0;
            if (var3 || var9 < class262.field3328) {
               do {
                  int var10 = super.field5553[var8 - -(var9 % super.field5557)];
                  var7[var9] = class109.method974(255, var10) << 4;
                  var6[var9] = class109.method974(var10 >> 4, 4080);
                  var5[var9] = class109.method974(4080, var10 >> 12);
                  ++var9;
               } while(var9 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field1026[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method738(byte arg0) {
      try {
         field1022 = null;
         field1025 = null;
         field1021 = null;
         if (arg0 != -18) {
            method738((byte)94);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1026[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method739(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method740(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
