import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class600 {
   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8795 = new String[]{method4446(method4445("\rGN\u001dN")), method4446(method4445("\rGN\u001cN")), method4446(method4445("\u0001P\f5")), method4446(method4445("\u0014\u000bNw\u001b")), method4446(method4445("\rGN\u0018N")), method4446(method4445("\rGN\u001bN")), method4446(method4445("\rGN\u001aN"))};
   @OriginalMember(
      owner = "client!bb",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field8791 = new int[13];
   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "I"
   )
   public static int field8790 = -1;
   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "I"
   )
   public static int field8789;
   @OriginalMember(
      owner = "client!bb",
      name = "d",
      descriptor = "I"
   )
   public static int field8792;
   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "I"
   )
   public static int field8793;
   @OriginalMember(
      owner = "client!bb",
      name = "f",
      descriptor = "I"
   )
   public static int field8794;

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(B[FI)[F"
   )
   public static final float[] method4440(byte arg0, float[] arg1, int arg2) {
      try {
         ++field8793;
         float[] var3 = new float[arg2];
         class107.method1023(arg1, 0, var3, 0, arg2);
         if (arg0 != 110) {
            method4440((byte)-115, (float[])null, 71);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8795[6] + arg0 + ',' + (arg1 != null ? field8795[3] : field8795[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(IILff;III)V"
   )
   public static final void method4441(int arg0, int arg1, class752 arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field8794;
         class455 var7 = null;
         class455 var8 = (class455)class91.field1317.method4972((byte)-84);
         if (var6 || var8 != null) {
            do {
               if (var8.field6956 == arg1 && ~var8.field6970 == ~arg3 && var8.field6959 == arg0 && ~var8.field6951 == ~arg5) {
                  var7 = var8;
                  break;
               }

               var8 = (class455)class91.field1317.method4975((byte)97);
            } while(var8 != null);
         }

         while(var6) {
         }

         if (var7 == null) {
            var7 = new class455();
            var7.field6956 = arg1;
            var7.field6970 = arg3;
            var7.field6951 = arg5;
            var7.field6959 = arg0;
            class91.field1317.method4980(var7, 0);
         }

         var7.field6968 = false;
         var7.field6969 = arg2;
         if (arg4 == 0) {
            var7.field6958 = true;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8795[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8795[3] : field8795[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4442(int arg0) {
      boolean var1 = client.field1786;

      try {
         class429.field6629.method5388(arg0 + 27205);
         ++field8792;
         class29.field347.method5488(arg0 ^ -27037);
         class738.field10964.method3779(0);
         class102.field1434.method1418(30);
         class412.field6401.method787((byte)97);
         class247.field3763.method2052((byte)99);
         class314.field4861.method4843(false);
         class317.field4896.method1646(0);
         class228.field3467.method1032(0);
         class479.field7291.method504((byte)-120);
         class750.field11119.method3163(47);
         class750.field11116.method3447((byte)108);
         class252.field3808.method105(246);
         class230.field3520.method4014(1);
         class508.field7776.method135(-58);
         class293.field4644.method978(-29569);
         class610.field8879.method175((byte)35);
         class739.field10975.method3599(1);
         class88.field1274.method2034((byte)95);
         class342.field5201.method1143((byte)-57);
         class581.field8578.method5196(arg0 + 27145);
         class649.field9349.method5139(-31394);
         class523.field7971.method1783((byte)-36);
         class399.method3218((byte)86);
         class744.method5466(-1);
         class589.method4395((byte)-120);
         class693.method5100((byte)88);
         if (class657.field9823 != class129.field1852) {
            int var2 = 0;
            if (var1) {
               class129.field1848[var2] = null;
               ++var2;
            }

            while(true) {
               while(~var2 > ~class129.field1848.length) {
                  class129.field1848[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class198.field3058 = 0;
                  break;
               }

               ++var2;
            }
         }

         class684.method5054((byte)-128);
         if (arg0 == -27112) {
            class664.method4908(121);
            class191.method1705(-59);
            class410.method3284(16288);
            class357.method2919(false);
            class469.field7131.method2551(true);
            class351.field5356.method705();
            class66.method510(20019);
            class203.method1771(false);
            class426.field6578.method5027(-108);
            class8.field62.method5027(arg0 + 26993);
            class542.field8173.method5027(-71);
            class135.field1904.method5027(-28);
            class633.field9157.method5027(-29);
            class742.field11031.method5027(-101);
            class690.field10251.method5027(-51);
            class467.field7107.method5027(-12);
            class316.field4879.method5027(arg0 + 27044);
            class364.field5630.method5027(arg0 ^ 27035);
            class761.field11251.method5027(-12);
            class455.field6954.method5027(arg0 + 27065);
            class357.field5518.method5027(-117);
            class27.field324.method5027(-97);
            class450.field6891.method5027(-15);
            class329.field4989.method5027(arg0 + 27080);
            class32.field407.method5027(-121);
            class391.field6141.method5027(-86);
            class734.field10945.method5027(-90);
            class208.field3175.method5027(-61);
            class356.field5481.method5027(-49);
            class201.field3081.method5027(arg0 + 27043);
            class500.field7657.method5027(-73);
            class293.field4641.method5027(-87);
            class126.field1809.method5027(arg0 ^ 27051);
            class449.field6884.method5027(-118);
            class499.field7653.method5027(-38);
            class758.field11219.method5027(-97);
            class219.field3322.method5027(-28);
            class633.field9156.method5027(arg0 ^ 27026);
            class331.field5020.method5027(arg0 ^ 27070);
            class385.field6069.method5027(-66);
            class609.field8868.method5027(-69);
            class86.field1261.method2551(true);
            class97.field1358.method2551(true);
            class384.field6050.method2551(true);
            class355.field5443.method2551(true);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8795[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method4443(int arg0) {
      try {
         if (arg0 != 0) {
            return -125;
         } else {
            ++field8789;
            return class67.field883 == 1 ? class656.field9793 : 0;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8795[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4444(byte arg0) {
      try {
         if (arg0 == -95) {
            field8791 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8795[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4445(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4446(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
