import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class626 extends class270 {
   @OriginalMember(
      owner = "client!ai",
      name = "t",
      descriptor = "I"
   )
   public int field9197;
   @OriginalMember(
      owner = "client!ai",
      name = "q",
      descriptor = "I"
   )
   public int field9200;
   @OriginalMember(
      owner = "client!ai",
      name = "p",
      descriptor = "I"
   )
   public int field9195;
   @OriginalMember(
      owner = "client!ai",
      name = "w",
      descriptor = "I"
   )
   public int field9194;
   @OriginalMember(
      owner = "client!ai",
      name = "x",
      descriptor = "I"
   )
   public int field9196;
   @OriginalMember(
      owner = "client!ai",
      name = "r",
      descriptor = "I"
   )
   public int field9198;
   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9202 = new String[]{method4548(method4547(")Wq47")), method4548(method4547(")WqJv&W+H7")), method4548(method4547("&K3\u001a")), method4548(method4547("3\u0010qXb")), method4548(method4547(")Wq57")), method4548(method4547(")Wq77"))};
   @OriginalMember(
      owner = "client!ai",
      name = "v",
      descriptor = "Lak;"
   )
   public static class371 field9193 = new class371(1);
   @OriginalMember(
      owner = "client!ai",
      name = "s",
      descriptor = "I"
   )
   public static int field9199;
   @OriginalMember(
      owner = "client!ai",
      name = "u",
      descriptor = "I"
   )
   public static int field9201;

   @OriginalMember(
      owner = "client!ai",
      name = "<init>",
      descriptor = "(Lkt;Lada;IIIIIIIIIIIII)V"
   )
   public class626(class169 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field9197 = arg11;
         this.field9200 = arg9;
         this.field9195 = arg10;
         this.field9194 = arg14;
         this.field9196 = arg12;
         this.field9198 = arg13;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field9202[1] + (arg0 != null ? field9202[3] : field9202[2]) + ',' + (arg1 != null ? field9202[3] : field9202[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(B)Lqca;"
   )
   public class127 method993(byte arg0) {
      try {
         ++field9201;
         return arg0 != -48 ? null : class291.field4020;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9202[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(Lha;ZLru;ILjava/lang/String;Lda;)V"
   )
   public static final void method4545(class66 arg0, boolean arg1, class206 arg2, int arg3, String arg4, class67 arg5) {
      try {
         if (arg3 != 2) {
            method4545((class66)null, false, (class206)null, -27, (String)null, (class67)null);
         }

         ++field9199;
         boolean var6 = !class216.field3091 || class240.method1840((byte)-28);
         if (var6) {
            label102: {
               if (!class216.field3091 || !var6) {
                  int var7 = arg2.method1630((byte)-84, arg4, 250, (class492[])null);
                  int var8 = 13 * arg2.method1634(250, -18886, (class492[])null, arg4);
                  byte var9 = 4;
                  int var10 = var9 + 6;
                  int var11 = 6 - -var9;
                  arg0.method496(var10 - var9, var11 - var9, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
                  arg0.method608(-var9 + var10, -var9 + var11, var7 + var9 + var9, var8 - (-var9 + -var9), -1, 0);
                  arg5.method626(0, var11, var7, var8, 0, (class515)null, 1, (int[])null, -1, var10, 0, -1, 0, 1, (class492[])null, arg4);
                  class525.method3800((byte)-122, var8 + var9 - -var9, -var9 + var10, -var9 + var11, var9 + var9 + var7);
                  if (!client.field4360) {
                     break label102;
                  }
               }

               class206 var23 = class25.field385;
               class67 var24 = arg0.method502(var23, class235.field3278, true);
               int var12 = var23.method1630((byte)-84, arg4, 250, (class492[])null);
               int var13 = var23.method1637(arg4, -1, var23.field2950, 250, (class492[])null);
               int var14 = class655.field9584.field6269;
               int var15 = var14 + 4;
               int var16 = var15 * 2 + var12;
               int var17 = var15 * 2 + var13;
               if (~var16 > ~class116.field1451) {
                  var16 = class116.field1451;
               }

               if (~var17 > ~class488.field6981) {
                  var17 = class488.field6981;
               }

               int var18 = class592.field8713.method1384(var16, (byte)-118, class87.field1142) - -class157.field2241;
               int var19 = class653.field9566.method1414(var17, 111, class60.field743) - -class602.field8847;
               if (class681.field10034) {
                  var18 += class85.method755((byte)-119);
                  var19 += class592.method4305((byte)117);
               }

               arg0.method500(class25.field393, false).method966(class595.field8750.field6269 + var18, class595.field8750.field6267 + var19, -(class595.field8750.field6269 * 2) + var16, var17 - class595.field8750.field6267 * 2, 1, 0, 0);
               arg0.method500(class595.field8750, true).method3575(var18, var19);
               class595.field8750.method3231();
               arg0.method500(class595.field8750, true).method3575(var16 + var18 + -var14, var19);
               class595.field8750.method3238();
               arg0.method500(class595.field8750, true).method3575(-var14 + var18 - -var16, var17 + var19 + -var14);
               class595.field8750.method3231();
               arg0.method500(class595.field8750, true).method3575(var18, var17 + var19 + -var14);
               class595.field8750.method3238();
               arg0.method500(class655.field9584, true).method3569(var18, class595.field8750.field6267 + var19, var14, var17 - class595.field8750.field6267 * 2);
               class655.field9584.method3243();
               arg0.method500(class655.field9584, true).method3569(class595.field8750.field6269 + var18, var19, var16 - class595.field8750.field6269 * 2, var14);
               class655.field9584.method3243();
               arg0.method500(class655.field9584, true).method3569(-var14 + var16 + var18, class595.field8750.field6267 + var19, var14, -(class595.field8750.field6267 * 2) + var17);
               class655.field9584.method3243();
               arg0.method500(class655.field9584, true).method3569(class595.field8750.field6269 + var18, -var14 + var17 + var19, -(class595.field8750.field6269 * 2) + var16, var14);
               class655.field9584.method3243();
               var24.method626(0, var15 + var19, -(var15 * 2) + var16, -(var15 * 2) + var17, 0, (class515)null, 1, (int[])null, -1, var18 - -var15, 0, class163.field2318 | -16777216, 0, 1, (class492[])null, arg4);
               class525.method3800((byte)-122, var17, var18, var19, var16);
            }

            if (arg1) {
               try {
                  if (!class681.field10034) {
                     arg0.method497(-27);
                  } else {
                     class517.method3762(0);
                  }
               } catch (class525 var21) {
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field9202[4] + (arg0 != null ? field9202[3] : field9202[2]) + ',' + arg1 + ',' + (arg2 != null ? field9202[3] : field9202[2]) + ',' + arg3 + ',' + (arg4 != null ? field9202[3] : field9202[2]) + ',' + (arg5 != null ? field9202[3] : field9202[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4546(int arg0) {
      try {
         if (arg0 == 0) {
            field9193 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9202[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4547(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4548(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
