import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class145 {
   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1824 = new String[]{method1181(method1180("\u0019\u000b\u0004Sy")), method1181(method1180("\u0019\u000b\u0004Vy")), method1181(method1180("\u0014\tF{")), method1181(method1180("\u0001R\u00049,")), method1181(method1180("\u0019\u000b\u0004Uy")), method1181(method1180("\u0019\u000b\u0004Ty"))};
   @OriginalMember(
      owner = "client!cw",
      name = "f",
      descriptor = "[J"
   )
   public static long[] field1817 = new long[32];
   @OriginalMember(
      owner = "client!cw",
      name = "d",
      descriptor = "I"
   )
   public static int field1816;
   @OriginalMember(
      owner = "client!cw",
      name = "h",
      descriptor = "I"
   )
   public int field1818;
   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "I"
   )
   public static int field1819;
   @OriginalMember(
      owner = "client!cw",
      name = "g",
      descriptor = "I"
   )
   public static int field1820;
   @OriginalMember(
      owner = "client!cw",
      name = "c",
      descriptor = "I"
   )
   public static int field1821;
   @OriginalMember(
      owner = "client!cw",
      name = "e",
      descriptor = "Lqm;"
   )
   public class490 field1823;
   @OriginalMember(
      owner = "client!cw",
      name = "b",
      descriptor = "[I"
   )
   public int[] field1822;

   @OriginalMember(
      owner = "client!cw",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1176(byte arg0) {
      try {
         if (arg0 >= 103) {
            field1817 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1824[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(B)Lum;"
   )
   public static final class594 method1177(byte arg0) {
      try {
         ++field1819;
         int var1 = -90 / ((arg0 - 43) / 50);
         return class385.method3048(class157.field2022, (byte)118) ? class387.field5363 : class387.field5365;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1824[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IILjava/util/Random;)I"
   )
   public static final int method1178(int arg0, int arg1, Random arg2) {
      boolean var3 = client.field1481;

      try {
         ++field1816;
         if (arg1 <= 0) {
            throw new IllegalArgumentException();
         } else if (class181.method1525((byte)-78, arg1)) {
            return (int)(((long)arg2.nextInt() & 4294967295L) * (long)arg1 >> 32);
         } else {
            if (arg0 != 5733) {
               field1817 = null;
            }

            int var4 = -((int)(4294967296L % (long)arg1)) + Integer.MIN_VALUE;

            while(true) {
               int var5 = arg2.nextInt();

               while(var4 > var5) {
                  if (!var3) {
                     return class684.method4985(arg0 ^ 5659, arg1, var5);
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1824[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1824[3] : field1824[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method1179(int arg0, byte arg1) {
      try {
         if (arg1 == -27) {
            ++field1820;
            class111.field1492 = 1000000000L / (long)arg0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1824[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1180(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1181(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
