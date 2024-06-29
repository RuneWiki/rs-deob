import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class446 {
   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "I"
   )
   private int field6499;
   @OriginalMember(
      owner = "client!en",
      name = "f",
      descriptor = "J"
   )
   private long field6500;
   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6506 = new String[]{method3463(method3462("(o\u001c7M")), method3463(method3462("6/\u001c[\u0018")), method3463(method3462("#t^\u0019")), method3463(method3462("(o\u001cI\f#hFKM")), method3463(method3462("(o\u001c4M")), method3463(method3462("(o\u001c1M")), method3463(method3462("(o\u001c6M")), method3463(method3462("(o\u001c0M"))};
   @OriginalMember(
      owner = "client!en",
      name = "d",
      descriptor = "I"
   )
   public static int field6498 = 0;
   @OriginalMember(
      owner = "client!en",
      name = "e",
      descriptor = "I"
   )
   public static int field6501;
   @OriginalMember(
      owner = "client!en",
      name = "h",
      descriptor = "I"
   )
   public static int field6502;
   @OriginalMember(
      owner = "client!en",
      name = "b",
      descriptor = "I"
   )
   public static int field6503;
   @OriginalMember(
      owner = "client!en",
      name = "g",
      descriptor = "I"
   )
   public static int field6504;
   @OriginalMember(
      owner = "client!en",
      name = "c",
      descriptor = "I"
   )
   public static int field6505;

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method3457(int arg0, int arg1) {
      try {
         ++field6501;
         int var3 = -107 % ((6 - arg1) / 44);
         return (int)(this.field6500 >> class586.field8223 * arg0) & 15;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6506[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3458(int arg0) {
      try {
         if (arg0 != 29577) {
            this.method3457(-11, 79);
         }

         ++field6502;
         return this.field6499;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6506[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(BI)Llja;"
   )
   public final class586 method3459(byte arg0, int arg1) {
      try {
         if (arg0 != 73) {
            this.method3459((byte)-126, 11);
         }

         ++field6503;
         return class586.method4301(arg0 + 51, this.method3457(arg1, -122));
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6506[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "b",
      descriptor = "(I)[Lhha;"
   )
   public static final class724[] method3460(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field6505;
            return new class724[]{class744.field10590, class287.field4296, class121.field1952, class597.field8409, class126.field2029, class801.field11647, class606.field8650, class732.field10412, class303.field4577, class194.field2814, class510.field7240, class438.field6415, class132.field2158, class773.field11255, class622.field8885, class582.field8182, class603.field8588, class263.field4026, class46.field688, class333.field4945, class745.field10602, class184.field2713, class610.field8695, class615.field8752, class4.field51, class383.field5583, class26.field381, class143.field2278, class499.field7096, class762.field10869, class573.field8107, class639.field9016, class464.field6750, class776.field11333, class646.field9097, class126.field2021, class541.field7614, class144.field2291, class451.field6577, class633.field8977, class255.field3870, class177.field2617, class142.field2269, class560.field7960, class671.field9417, class515.field7308, class274.field4178, class7.field121, class734.field10426, class445.field6496, class318.field4760, class218.field3123, class545.field7764, class190.field2789, class156.field2384, class121.field1945, class375.field5482, class378.field5521, class513.field7287, class735.field10457, class558.field7926, class557.field7908, class610.field8682, class197.field2864, class238.field3678, class705.field10138, class280.field4237, class39.field558, class497.field7089, class615.field8756, class339.field4999, class69.field986, class91.field1480, class471.field6840, class499.field7109, class720.field10316, class249.field3813, class119.field1911, class428.field6275, class8.field148, class5.field58, class590.field8326, class216.field3100, class681.field9849, class631.field8970, class537.field7549, class468.field6784, class86.field1310, class722.field10337, class143.field2277, class488.field6959, class657.field9290, class365.field5413, class773.field11233, class25.field354, class142.field2266, class678.field9510, class311.field4667, class104.field1632, class797.field11585, class15.field212, class212.field3027, class7.field129, class555.field7890, class227.field3534, class631.field8972, class264.field4039, class727.field10367, class755.field10803, class203.field2900, class466.field6760, class166.field2503, class155.field2370, class5.field67, class365.field5411, class114.field1796, class364.field5375, class646.field9093, class180.field2643, class794.field11553, class328.field4869, class48.field739, class210.field2998, class272.field4150, class430.field6299, class248.field3803, class25.field353, class33.field491, class272.field4158, class690.field9932, class350.field5136, class455.field6608, class613.field8719, class693.field9992, class248.field3793, class463.field6741, class388.field5655, class330.field4923, class290.field4314, class71.field1159, class366.field5418, class444.field6483, class599.field8496};
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6506[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "<init>",
      descriptor = "(Llja;)V"
   )
   public class446(class586 arg0) {
      try {
         this.field6499 = 1;
         this.field6500 = (long)arg0.field8210;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6506[3] + (arg0 != null ? field6506[1] : field6506[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(Llja;B)V"
   )
   private final void method3461(class586 arg0, byte arg1) {
      try {
         if (arg1 < -24) {
            this.field6500 |= (long)(arg0.field8210 << this.field6499++ * class586.field8223);
            ++field6504;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6506[6] + (arg0 != null ? field6506[1] : field6506[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "<init>",
      descriptor = "([Llja;)V"
   )
   public class446(class586[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3462(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3463(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
