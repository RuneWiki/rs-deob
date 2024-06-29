import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class193 {
   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "Liw;"
   )
   private class107 field2803 = new class107(64);
   @OriginalMember(
      owner = "client!ew",
      name = "i",
      descriptor = "Lsa;"
   )
   private class39 field2810;
   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2811 = new String[]{method1707(method1706("_\bd!2")), method1707(method1706("_\bd&2")), method1707(method1706("AQdMg")), method1707(method1706("T\n&\u000f")), method1707(method1706("_\bd_sT\u0016>]2")), method1707(method1706("_\bd'2")), method1707(method1706("_\bd 2")), method1707(method1706("_\bd\"2"))};
   @OriginalMember(
      owner = "client!ew",
      name = "h",
      descriptor = "S"
   )
   public static short field2809 = 32767;
   @OriginalMember(
      owner = "client!ew",
      name = "d",
      descriptor = "I"
   )
   public static int field2804 = -1;
   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "I"
   )
   public static int field2805;
   @OriginalMember(
      owner = "client!ew",
      name = "g",
      descriptor = "I"
   )
   public static int field2806;
   @OriginalMember(
      owner = "client!ew",
      name = "e",
      descriptor = "I"
   )
   public static int field2807;
   @OriginalMember(
      owner = "client!ew",
      name = "f",
      descriptor = "I"
   )
   public static int field2808;
   @OriginalMember(
      owner = "client!ew",
      name = "c",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field2802;

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1701(int arg0) {
      try {
         int var1 = -51 % ((arg0 - 40) / 35);
         field2802 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2811[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(IZ)Lnm;"
   )
   public final class361 method1702(int arg0, boolean arg1) {
      try {
         ++field2806;
         class107 var3 = this.field2803;
         class361 var4;
         synchronized(this.field2803) {
            var4 = (class361)this.field2803.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field2810;
            byte[] var6;
            synchronized(this.field2810) {
               var6 = this.field2810.method460((byte)-11, arg0, 54);
            }

            class361 var7 = new class361();
            if (var6 != null) {
               var7.method2840(new class65(var6), (byte)-126);
            }

            class107 var8 = this.field2803;
            synchronized(this.field2803) {
               this.field2803.method1050(-71, var7, (long)arg0);
            }

            return arg1 ? null : var7;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field2811[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1703(int arg0) {
      try {
         class107 var2 = this.field2803;
         synchronized(this.field2803) {
            this.field2803.method1052(true);
         }

         if (arg0 == -18991) {
            ++field2805;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2811[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1704(int arg0) {
      try {
         class107 var2 = this.field2803;
         synchronized(this.field2803) {
            this.field2803.method1045(3);
         }

         ++field2808;
         int var3 = 30 % ((arg0 - 43) / 61);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2811[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method1705(int arg0, byte arg1) {
      try {
         ++field2807;
         class107 var3 = this.field2803;
         synchronized(this.field2803) {
            this.field2803.method1048(arg0, arg1 + -8467);
            if (arg1 != -76) {
               this.method1705(-72, (byte)33);
            }

         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2811[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class193(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field2810 = arg2;
         if (this.field2810 != null) {
            this.field2810.method434((byte)-106, 54);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2811[4] + (arg0 != null ? field2811[2] : field2811[3]) + ',' + arg1 + ',' + (arg2 != null ? field2811[2] : field2811[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1706(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1707(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
