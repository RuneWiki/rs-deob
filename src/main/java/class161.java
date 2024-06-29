import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class161 extends class213 {
   @OriginalMember(
      owner = "client!ho",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2308 = new String[]{method1349(method1348("o\u001511O")), method1349(method1348("|T1Y\u001a")), method1349(method1348("o\u001515O")), method1349(method1348("i\u000fs\u001b")), method1349(method1348("o\u001513O")), method1349(method1348("o\u001514O")), method1349(method1348("o\u001512O")), method1349(method1348("o\u001516O"))};
   @OriginalMember(
      owner = "client!ho",
      name = "B",
      descriptor = "I"
   )
   public static int field2295 = 0;
   @OriginalMember(
      owner = "client!ho",
      name = "I",
      descriptor = "Lkda;"
   )
   public static class412 field2298 = new class412(method1349(method1348("P.M4")), method1349(method1348("h\u001cy\u001e\u0004b")), method1349(method1348("X\b|")), 1);
   @OriginalMember(
      owner = "client!ho",
      name = "G",
      descriptor = "I"
   )
   public static int field2304 = 50;
   @OriginalMember(
      owner = "client!ho",
      name = "u",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2299 = new String[field2304];
   @OriginalMember(
      owner = "client!ho",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field2305 = new int[field2304];
   @OriginalMember(
      owner = "client!ho",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field2301 = new int[field2304];
   @OriginalMember(
      owner = "client!ho",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field2303 = new int[field2304];
   @OriginalMember(
      owner = "client!ho",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field2307 = new int[field2304];
   @OriginalMember(
      owner = "client!ho",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field2306 = new int[field2304];
   @OriginalMember(
      owner = "client!ho",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field2302 = new int[field2304];
   @OriginalMember(
      owner = "client!ho",
      name = "D",
      descriptor = "I"
   )
   public static int field2288;
   @OriginalMember(
      owner = "client!ho",
      name = "v",
      descriptor = "I"
   )
   private int field2289;
   @OriginalMember(
      owner = "client!ho",
      name = "K",
      descriptor = "I"
   )
   public static int field2290;
   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "I"
   )
   public static int field2291;
   @OriginalMember(
      owner = "client!ho",
      name = "t",
      descriptor = "I"
   )
   private int field2292;
   @OriginalMember(
      owner = "client!ho",
      name = "E",
      descriptor = "I"
   )
   public static int field2293;
   @OriginalMember(
      owner = "client!ho",
      name = "H",
      descriptor = "I"
   )
   private int field2294;
   @OriginalMember(
      owner = "client!ho",
      name = "J",
      descriptor = "I"
   )
   public static int field2296;
   @OriginalMember(
      owner = "client!ho",
      name = "x",
      descriptor = "I"
   )
   private int field2297;
   @OriginalMember(
      owner = "client!ho",
      name = "y",
      descriptor = "Lkf;"
   )
   public static class266 field2300;

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Lbl;ZLbl;)V",
      line = 4
   )
   public static final void method1342(class678 arg0, boolean arg1, class678 arg2) {
      try {
         ++class481.field6890;
         ++field2288;
         class447 var3 = class40.method350(class535.field7665, class430.field6150.field106, true);
         var3.field6359.method1160(110, arg0.field9854);
         var3.field6359.method1190(-9720, arg0.field9965);
         if (!arg1) {
            var3.field6359.method1155(arg2.field9965, (byte)41);
            var3.field6359.method1160(80, arg2.field9854);
            var3.field6359.method1163((byte)-98, arg2.field9912);
            var3.field6359.method1185(arg0.field9912, true);
            class430.field6150.method55(13256, var3);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2308[4] + (arg0 != null ? field2308[1] : field2308[3]) + ',' + arg1 + ',' + (arg2 != null ? field2308[1] : field2308[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Lqv;Z)V",
      line = 25
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method1347((class147)null, (byte)-15);
         }

         arg0.method3430(this.field2292, this.field2289, this.field2297, this.field2294, -1);
         ++field2296;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2308[7] + (arg0 != null ? field2308[1] : field2308[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(B)V",
      line = 44
   )
   public static void method1344(byte arg0) {
      try {
         field2306 = null;
         field2298 = null;
         field2307 = null;
         field2303 = null;
         field2299 = null;
         field2301 = null;
         int var1 = -42 / ((-70 - arg0) / 53);
         field2300 = null;
         field2302 = null;
         field2305 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2308[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(IILjava/lang/String;Lha;IBII)V",
      line = 61
   )
   public static final void method1345(int arg0, int arg1, String arg2, class66 arg3, int arg4, byte arg5, int arg6, int arg7) {
      boolean var8 = client.field4360;

      try {
         ++field2291;
         if (class82.field1070 == null || class783.field11472 == null) {
            label96: {
               if (!class281.field3904.method2051(class128.field1642, (byte)60) || !class281.field3904.method2051(class121.field1529, (byte)60)) {
                  arg3.method496(arg0, arg7, arg4, arg6, class30.field435 | 255 - class582.field8615 << 24, 1);
                  if (!var8) {
                     break label96;
                  }
               }

               class82.field1070 = arg3.method500(class439.method3239(class281.field3904, class128.field1642, 0), true);
               class439 var9 = class439.method3239(class281.field3904, class121.field1529, 0);
               class783.field11472 = arg3.method500(var9, true);
               var9.method3231();
               class463.field6651 = arg3.method500(var9, true);
            }
         }

         if (class82.field1070 != null && class783.field11472 != null) {
            int var10 = (arg4 + -(2 * class783.field11472.method958())) / class82.field1070.method958();
            int var11 = 0;
            if (var8) {
               class82.field1070.method3575(arg0 - (-class783.field11472.method958() - var11 * class82.field1070.method958()), arg7);
               ++var11;
            }

            while(true) {
               while(~var11 > ~var10) {
                  class82.field1070.method3575(arg0 - (-class783.field11472.method958() - var11 * class82.field1070.method958()), arg7);
                  ++var11;
               }

               class783.field11472.method3575(arg0, arg7);
               class492 var10000 = class463.field6651;
               int var10001 = -class463.field6651.method958() + arg4 + arg0;
               if (!var8) {
                  var10000.method3575(var10001, arg7);
                  break;
               }

               var10000.method3575(var10001, arg7);
               ++var11;
            }
         }

         class455.field6465.method620(0, arg0 + 3, -1, arg7 + 14, -16777216 | class139.field1770, arg2);
         arg3.method496(arg0, arg7 - -arg6, arg4, arg1 - arg6, class30.field435 | -class582.field8615 + 255 << 24, 1);
         if (arg5 < 17) {
            method1345(-104, -63, (String)null, (class66)null, -40, (byte)123, -108, 38);
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field2308[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2308[1] : field2308[3]) + ',' + (arg3 != null ? field2308[1] : field2308[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "b",
      descriptor = "(I)I",
      line = 107
   )
   public static final int method1346(int arg0) {
      try {
         ++field2293;
         if (class131.field1677) {
            return 6;
         } else if (class521.field7496 == null) {
            return 0;
         } else {
            int var1 = class521.field7496.field458;
            if (class58.method455(var1, 2897)) {
               return 1;
            } else if (class743.method5383(arg0, var1)) {
               return 2;
            } else if (class288.method2178(var1, -1010)) {
               return 3;
            } else {
               return class606.method4408(var1, 256) ? 4 : 5;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2308[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 141
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         ++field2290;
         this.field2289 = arg0.method1164(19693);
         if (arg1 >= -38) {
            this.field2289 = 93;
         }

         this.field2297 = arg0.method1164(19693);
         this.field2294 = arg0.method1143(-15465);
         this.field2292 = arg0.method1143(-15465);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2308[5] + (arg0 != null ? field2308[1] : field2308[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1348(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1349(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
