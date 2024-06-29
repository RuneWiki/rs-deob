import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class650 {
   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9431 = new String[]{method4772(method4771("6]bm`")), method4772(method4771("6]b['\u0000K>F&4\u0017")), method4772(method4771("6]bl`")), method4772(method4771("(\u0011b\u00015")), method4772(method4771("6]bn`")), method4772(method4771("=J C"))};
   @OriginalMember(
      owner = "client!eb",
      name = "g",
      descriptor = "I"
   )
   public static int field9423 = 0;
   @OriginalMember(
      owner = "client!eb",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field9430 = true;
   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "I"
   )
   public static int field9424;
   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "I"
   )
   public static int field9425;
   @OriginalMember(
      owner = "client!eb",
      name = "f",
      descriptor = "I"
   )
   public static int field9427;
   @OriginalMember(
      owner = "client!eb",
      name = "d",
      descriptor = "I"
   )
   public static int field9429;
   @OriginalMember(
      owner = "client!eb",
      name = "e",
      descriptor = "Lhw;"
   )
   public static class141 field9426;
   @OriginalMember(
      owner = "client!eb",
      name = "h",
      descriptor = "[J"
   )
   public static long[] field9428;

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4768(boolean arg0) {
      try {
         if (!arg0) {
            field9423 = -21;
         }

         if (class218.field3294 >= 0) {
            long var1;
            label24: {
               var1 = class57.method650(98);
               class218.field3294 = (int)((long)class218.field3294 - (-class534.field7780 + var1));
               if (class218.field3294 > 0) {
                  int var3 = (class218.field3294 << 8) / class265.field3775;
                  int var4 = -var3 + 255;
                  float var5 = (float)var3 / 255.0F;
                  float var6 = 1.0F - var5;
                  class14.field199 = (16711680 & (class17.field298 & 65280) * var3 + (class787.field11521.field7731 & 65280) * var4) + (-16711936 & (16711935 & class17.field298) * var3 + (16711935 & class787.field11521.field7731) * var4) >>> 8;
                  class272.field3853 = class704.field10264 * var3 + class787.field11521.field7725 * var4 >> 8;
                  class597.field8617 = (class787.field11521.field7741 - class728.field10484) * var6 + class728.field10484;
                  class460.field6740 = (class787.field11521.field7737 - class153.field2446) * var6 + class153.field2446;
                  class753.field10845 = ((65280 & class402.field5934) * var3 + (class787.field11521.field7740 & 65280) * var4 & 16711680) + ((class402.field5934 & 16711935) * var3 + (16711935 & class787.field11521.field7740) * var4 & -16711936) >>> 8;
                  class119.field1937 = (-class434.field6274 + class787.field11521.field7724) * var6 + class434.field6274;
                  class527.field7685 = (class787.field11521.field7726 - class510.field7453) * var6 + class510.field7453;
                  class361.field5399 = (class787.field11521.field7735 - class632.field9220) * var6 + class632.field9220;
                  class202.field3028 = (-class40.field954 + class787.field11521.field7729) * var6 + class40.field954;
                  if (class419.field6121 == class787.field11521.field7734) {
                     break label24;
                  }

                  class749.field10810 = class625.field9095.method441(class419.field6121, class787.field11521.field7734, var6, class749.field10810);
                  if (!client.field4564) {
                     break label24;
                  }
               }

               class527.field7685 = class787.field11521.field7726;
               class460.field6740 = class787.field11521.field7737;
               class14.field199 = class787.field11521.field7731;
               class218.field3294 = -1;
               class272.field3853 = class787.field11521.field7725;
               class597.field8617 = class787.field11521.field7741;
               class361.field5399 = class787.field11521.field7735;
               class749.field10810 = class787.field11521.field7734;
               class119.field1937 = class787.field11521.field7724;
               class202.field3028 = class787.field11521.field7729;
               class753.field10845 = class787.field11521.field7740;
            }

            class534.field7780 = var1;
         }

         ++field9427;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9431[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4769(int arg0) {
      try {
         if (arg0 != 493155400) {
            method4769(-80);
         }

         field9428 = null;
         field9426 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9431[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9429;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9431[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILuda;)Lbr;"
   )
   public static final class411 method4770(int arg0, class473 arg1) {
      try {
         ++field9424;
         if (arg0 != 1995480456) {
            method4769(-4);
         }

         class449 var2 = class561.method4185((byte)10, arg1);
         int var3 = arg1.method3565(true);
         int var4 = arg1.method3565(true);
         int var5 = arg1.method3565(true);
         int var6 = arg1.method3565(true);
         int var7 = arg1.method3565(true);
         int var8 = arg1.method3565(true);
         return new class411(var2.field6556, var2.field6564, var2.field6561, var2.field6560, var2.field6555, var2.field6566, var2.field6551, var2.field6562, var2.field6554, var3, var4, var5, var6, var7, var8);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field9431[4] + arg0 + ',' + (arg1 != null ? field9431[3] : field9431[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class650(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4771(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4772(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
