import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public abstract class class785 {
   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11472 = new String[]{method5658(method5657("\u001fU9\u001a/P")), method5658(method5657("\u001fU9\u001a.P")), method5658(method5657("\u001fU9\u001a,P"))};
   @OriginalMember(
      owner = "client!gfa",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field11467 = false;
   @OriginalMember(
      owner = "client!gfa",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field11469 = new float[16];
   @OriginalMember(
      owner = "client!gfa",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field11468 = false;
   @OriginalMember(
      owner = "client!gfa",
      name = "e",
      descriptor = "I"
   )
   public static int field11470;
   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "I"
   )
   public static int field11471;

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method1599(int arg0, int arg1);

   @OriginalMember(
      owner = "client!gfa",
      name = "b",
      descriptor = "(I)[Lbga;"
   )
   public static final class378[] method5654(int arg0) {
      try {
         ++field11471;
         return arg0 != 16 ? null : new class378[]{class65.field727, class163.field2092, class61.field666, class226.field2844, class172.field2149, class721.field10562, class239.field2970, class325.field4346, class698.field10186, class419.field5877, class238.field2951, class542.field7388, class748.field10858, class446.field6173, class380.field5321, class484.field6667, class682.field10010, class402.field5638, class543.field7406, class471.field6529, class404.field5706, class749.field10892, class126.field1591, class358.field5092, class490.field6750, class466.field6415, class192.field2339, class666.field9469, class73.field898, class493.field6778, class544.field7431, class637.field9005, class18.field244, class226.field2839, class628.field8816, class115.field1422, class706.field10250, class720.field10550, class322.field4295, class636.field8990, class76.field963, class237.field2936, class61.field655, class771.field11126, class658.field9389, class232.field2882, class794.field11598, class658.field9397, class584.field8008, class339.field4862, class621.field8675, class386.field5414, class234.field2904, class551.field7588, class502.field6888, class471.field6522, class501.field6880, class194.field2367, class381.field5327, class436.field6057, class762.field11023, class740.field10777, class503.field6896, class585.field8039, class277.field3696, class676.field9916, class462.field6332, class635.field8975, class157.field2023, class442.field6125, class356.field5077, class487.field6714, class367.field5173, class108.field1375, class423.field5946, class209.field2583, class235.field2916, class306.field4064, class507.field7034, class375.field5271, class355.field5067, class552.field7596, class109.field1384, class655.field9155, class698.field10189, class348.field4995, class749.field10901, class294.field3859, class390.field5450, class354.field5055, class556.field7641, class325.field4366, class192.field2338, class282.field3765, class73.field895, class402.field5644, class353.field5038, class387.field5426, class210.field2603, class374.field5263, class118.field1445, class81.field1013, class156.field2007, class9.field116, class628.field8806, class254.field3230, client.field4269, class686.field10066, class393.field5551, class722.field10582, class626.field8758, class155.field1997, class128.field1616, class336.field4812, class480.field6631, class516.field7087, class534.field7298, class174.field2172, class288.field3811, class657.field9378, class47.field543, class795.field11612, class524.field7171, class181.field2241, class317.field4235, class145.field1911, class611.field8542, class411.field5780, class244.field3055, class253.field3217, class25.field325, class537.field7345, class627.field8778, class701.field10208, class86.field1109, class126.field1585, class502.field6891, class685.field10062, class44.field504, class288.field3823, class605.field8472, class238.field2955};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11472[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "b",
      descriptor = "(II)I"
   )
   public abstract int method1594(int arg0, int arg1);

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5655(byte arg0) {
      try {
         if (arg0 <= 103) {
            field11468 = true;
         }

         field11469 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11472[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(IB)[B"
   )
   public abstract byte[] method1595(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!gfa",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method5656(int arg0) {
      try {
         ++field11470;
         if (arg0 != 16) {
            method5654(121);
         }

         return class784.field11465++;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11472[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(I)Lfk;"
   )
   public abstract class683 method1597(int arg0);

   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5657(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5658(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
