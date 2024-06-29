import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class387 extends class673 {
   @OriginalMember(
      owner = "client!jq",
      name = "A",
      descriptor = "I"
   )
   public int field5353 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "y",
      descriptor = "I"
   )
   public int field5349 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "u",
      descriptor = "I"
   )
   public int field5351 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "n",
      descriptor = "I"
   )
   public int field5361 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "l",
      descriptor = "I"
   )
   public int field5358 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "C",
      descriptor = "I"
   )
   public int field5352 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "w",
      descriptor = "I"
   )
   public int field5354 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "x",
      descriptor = "I"
   )
   public int field5364 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!jq",
      name = "p",
      descriptor = "Lija;"
   )
   public class160 field5362;
   @OriginalMember(
      owner = "client!jq",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5367 = new String[]{method3058(method3057("\u0002 7N\u001e")), method3058(method3057("\u0002 7O\u001e")), method3058(method3057("\u0013\u007f7#K")), method3058(method3057("\u0002 71_\u00068m3\u001e")), method3058(method3057("\u0006$ua")), method3058(method3057("\u0002 7L\u001e")), method3058(method3057("\u0002 7K\u001e")), method3058(method3057("\u0002 7H\u001e")), method3058(method3057("\u0002 7I\u001e"))};
   @OriginalMember(
      owner = "client!jq",
      name = "m",
      descriptor = "I"
   )
   public static int field5359 = -1;
   @OriginalMember(
      owner = "client!jq",
      name = "o",
      descriptor = "Lum;"
   )
   public static class594 field5363 = new class594();
   @OriginalMember(
      owner = "client!jq",
      name = "q",
      descriptor = "Lum;"
   )
   public static class594 field5365 = new class594();
   @OriginalMember(
      owner = "client!jq",
      name = "s",
      descriptor = "[Lum;"
   )
   public static class594[] field5366 = new class594[]{field5365, field5363};
   @OriginalMember(
      owner = "client!jq",
      name = "r",
      descriptor = "I"
   )
   public static int field5350;
   @OriginalMember(
      owner = "client!jq",
      name = "v",
      descriptor = "I"
   )
   public static int field5355;
   @OriginalMember(
      owner = "client!jq",
      name = "t",
      descriptor = "I"
   )
   public static int field5356;
   @OriginalMember(
      owner = "client!jq",
      name = "D",
      descriptor = "I"
   )
   public static int field5357;
   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "I"
   )
   public static int field5360;

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public static final void method3051(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg2) {
            ++class527.field7368;
            class109.method975((byte)-102);
         }

         int var3 = -39 % ((arg0 - 48) / 49);
         ++field5355;
         if (arg1) {
            ++class206.field2627;
            class127.method1090(3);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5367[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method3052(long arg0, long arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5367[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method3053(byte arg0, int arg1) {
      try {
         ++field5357;
         class487 var2 = class2.method12((long)arg1, 4, (byte)43);
         var2.method3696(-11118);
         if (arg0 >= -9) {
            field5363 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5367[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3054(int arg0, int arg1, int arg2) {
      try {
         ++field5360;
         if (arg1 != 31424) {
            return true;
         } else {
            return ~(2048 & arg0) != -1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5367[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3055(byte arg0) {
      try {
         field5363 = null;
         if (arg0 == -102) {
            field5366 = null;
            field5365 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5367[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method3056(int arg0, int arg1, int arg2) {
      try {
         ++field5350;
         if (this.field5361 <= arg1 && this.field5349 >= arg1 && ~arg2 <= ~this.field5352 && ~this.field5358 <= ~arg2) {
            return true;
         } else {
            if (arg0 != -1) {
               this.field5351 = 42;
            }

            return this.field5364 <= arg1 && this.field5354 >= arg1 && ~arg2 <= ~this.field5353 && ~this.field5351 <= ~arg2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5367[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "<init>",
      descriptor = "(Lija;)V"
   )
   public class387(class160 arg0) {
      try {
         this.field5362 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5367[3] + (arg0 != null ? field5367[2] : field5367[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3057(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3058(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
