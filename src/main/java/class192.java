import java.awt.Rectangle;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class192 {
   @OriginalMember(
      owner = "client!sq",
      name = "l",
      descriptor = "[I"
   )
   public int[] field2725;
   @OriginalMember(
      owner = "client!sq",
      name = "c",
      descriptor = "[I"
   )
   public int[] field2724;
   @OriginalMember(
      owner = "client!sq",
      name = "g",
      descriptor = "[I"
   )
   public int[] field2733;
   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "[I"
   )
   public int[] field2730;
   @OriginalMember(
      owner = "client!sq",
      name = "e",
      descriptor = "[S"
   )
   public short[] field2723;
   @OriginalMember(
      owner = "client!sq",
      name = "k",
      descriptor = "[S"
   )
   public short[] field2721;
   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2734 = new String[]{method1518(method1517("(>uB4")), method1518(method1517("5:7k")), method1518(method1517(" au)a")), method1518(method1517("(>u;u5&/94")), method1518(method1517("(>uC4")), method1518(method1517("(>uF4")), method1518(method1517("(>uD4"))};
   @OriginalMember(
      owner = "client!sq",
      name = "i",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field2732 = new Rectangle[100];
   @OriginalMember(
      owner = "client!sq",
      name = "h",
      descriptor = "I"
   )
   public static int field2722;
   @OriginalMember(
      owner = "client!sq",
      name = "b",
      descriptor = "I"
   )
   public static int field2727;
   @OriginalMember(
      owner = "client!sq",
      name = "m",
      descriptor = "I"
   )
   public static int field2729;
   @OriginalMember(
      owner = "client!sq",
      name = "j",
      descriptor = "I"
   )
   public static int field2731;
   @OriginalMember(
      owner = "client!sq",
      name = "d",
      descriptor = "Lwe;"
   )
   public static class431 field2726;
   @OriginalMember(
      owner = "client!sq",
      name = "f",
      descriptor = "[J"
   )
   public static long[] field2728;

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method1512(byte arg0) {
      try {
         field2732 = null;
         field2728 = null;
         field2726 = null;
         if (arg0 < 90) {
            field2731 = 70;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2734[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(IIILnf;)J",
      line = 18
   )
   public static final long method1513(int arg0, int arg1, int arg2, class604 arg3) {
      try {
         ++field2722;
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         class259 var8 = class387.field5618.method3977(arg3.method236(arg2 + 28151), (byte)75);
         if (arg2 != 3) {
            return -49L;
         } else {
            long var9 = (long)(arg3.method237(arg2 ^ -110) << 14 | arg1 << 7 | arg0 | arg3.method252((byte)6) << 20 | 1073741824);
            if (~var8.field3587 == -1) {
               var9 |= var6;
            }

            if (~var8.field3555 == -2) {
               var9 |= var4;
            }

            return var9 | (long)arg3.method236(arg2 ^ 28153) << 32;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field2734[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2734[2] : field2734[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(IJZZ)Ljava/lang/String;",
      line = 45
   )
   public static final String method1514(int arg0, long arg1, boolean arg2, boolean arg3) {
      try {
         Calendar var5;
         label22: {
            ++field2729;
            if (arg2) {
               class559.method4007(arg1, false);
               var5 = class176.field2431;
               if (!client.field4360) {
                  break label22;
               }
            }

            class111.method907((byte)-78, arg1);
            var5 = class176.field2442;
         }

         int var6 = var5.get(5);
         int var7 = var5.get(2);
         int var8 = var5.get(1);
         if (!arg3) {
            field2731 = 81;
         }

         int var9 = var5.get(11);
         int var10 = var5.get(12);
         return arg0 == 3 ? class527.method3810(arg2, arg1, arg0, (byte)118) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class85.field1101[arg0][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field2734[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(IIBZLkf;I)V",
      line = 85
   )
   public static final void method1515(int arg0, int arg1, byte arg2, boolean arg3, class266 arg4, int arg5) {
      try {
         ++field2727;
         if (arg2 != -48) {
            field2728 = null;
         }

         class759.method5508(arg0, arg4, arg3, arg5, 0L, false, arg1);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2734[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2734[2] : field2734[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(I)V",
      line = 96
   )
   public static final void method1516(int arg0) {
      class503.field7307 = arg0;
   }

   @OriginalMember(
      owner = "client!sq",
      name = "<init>",
      descriptor = "(Lvu;)V",
      line = 110
   )
   public class192(class358 arg0) {
      try {
         this.field2725 = new int[3];
         this.field2724 = new int[2];
         this.field2733 = new int[2];
         this.field2730 = new int[3];
         this.field2730[2] = arg0.field4873;
         this.field2730[0] = arg0.field4815;
         this.field2730[1] = arg0.field4819;
         this.field2725[2] = arg0.field4883;
         this.field2725[1] = arg0.field4866;
         this.field2725[0] = arg0.field4827;
         this.field2733[1] = arg0.field4805;
         this.field2733[0] = arg0.field4872;
         this.field2724[0] = arg0.field4864;
         this.field2724[1] = arg0.field4858;
         if (arg0.field4886 != null) {
            this.field2723 = new short[arg0.field4886.length];
            class242.method1851(arg0.field4886, 0, this.field2723, 0, this.field2723.length);
         }

         if (arg0.field4857 != null) {
            this.field2721 = new short[arg0.field4857.length];
            class242.method1851(arg0.field4857, 0, this.field2721, 0, this.field2721.length);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2734[3] + (arg0 != null ? field2734[2] : field2734[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1517(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1518(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
