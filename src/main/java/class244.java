import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class244 {
   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3371 = new String[]{method1864(method1863("*C1eR")), method1864(method1863("*C1bR")), method1864(method1863("%\n1\u000f\u0007")), method1864(method1863("0QsM")), method1864(method1863("p@sM")), method1864(method1863("3E|")), method1864(method1863("2MqT\u0002")), method1864(method1863("p@fM\u0013<")), method1864(method1863("2M}")), method1864(method1863("pWp")), method1864(method1863("*C1`R")), method1864(method1863(")Mq")), method1864(method1863("*C1cR")), method1864(method1863("*C1dR")), method1864(method1863("*C1gR"))};
   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "Lek;"
   )
   public static class536 field3366 = new class536(0, 0);
   @OriginalMember(
      owner = "client!tg",
      name = "e",
      descriptor = "I"
   )
   public static int field3365;
   @OriginalMember(
      owner = "client!tg",
      name = "f",
      descriptor = "I"
   )
   public static int field3367;
   @OriginalMember(
      owner = "client!tg",
      name = "c",
      descriptor = "I"
   )
   public static int field3368;
   @OriginalMember(
      owner = "client!tg",
      name = "b",
      descriptor = "I"
   )
   public static int field3369;
   @OriginalMember(
      owner = "client!tg",
      name = "d",
      descriptor = "I"
   )
   public static int field3370;

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(Lbl;IIIILha;)V"
   )
   public static final void method1857(class678 arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5) {
      boolean var6 = client.field4360;

      try {
         if (arg3 <= 3) {
            method1857((class678)null, 120, -23, -18, -4, (class66)null);
         }

         int var7 = 7;
         int var10000;
         if (var6) {
            var10000 = 127;
         } else if (~var7 > -1) {
            var10000 = field3367 + 1;
            if (!var6) {
               field3367 = var10000;
               return;
            }
         } else {
            var10000 = 127;
         }

         while(true) {
            label71: {
               int var8 = var10000;
               if (var6) {
                  class733.method5333(true, 127, false);
               } else if (var8 < 0) {
                  if (!var6) {
                     break label71;
                  }
               } else {
                  class733.method5333(true, 127, false);
               }

               while(true) {
                  int var9 = (63 & arg2) << 10 | (var7 & 7) << 7 | 127 & var8;
                  int var10 = class546.field7829[var9];
                  class165.method1365(-121, true, false);
                  arg5.method496((arg0.field9904 * var8 >> 7) + arg4, ((-var7 + 7) * arg0.field9980 >> 3) + arg1, (arg0.field9904 >> 7) + 1, (arg0.field9980 >> 3) + 1, var10, 0);
                  --var8;
                  if (var8 < 0) {
                     if (!var6) {
                        break;
                     }
                  } else {
                     class733.method5333(true, 127, false);
                  }
               }
            }

            --var7;
            if (~var7 > -1) {
               var10000 = field3367 + 1;
               if (!var6) {
                  field3367 = var10000;
                  return;
               }
            } else {
               var10000 = 127;
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field3371[1] + (arg0 != null ? field3371[2] : field3371[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3371[2] : field3371[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1858(int arg0, int arg1) {
      try {
         label23: {
            if (class235.field3273 == 1) {
               class394.field5701 = arg0;
               if (!client.field4360) {
                  break label23;
               }
            }

            if (class235.field3273 == 2) {
               class722.field10544 = arg0;
            }
         }

         ++field3370;
         if (arg1 != 0) {
            method1860((String)null, (byte)-8);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3371[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(B)[Leg;"
   )
   public static final class118[] method1859(byte arg0) {
      try {
         if (arg0 < 111) {
            method1857((class678)null, 36, 49, 44, -10, (class66)null);
         }

         ++field3365;
         return new class118[]{class480.field6886, class624.field9176, class316.field4301, class607.field8903, class452.field6395, class670.field9727, class119.field1480, class343.field4660, class635.field9287, class628.field9227, class786.field11534, class429.field6139, class407.field5879, class675.field9783, class777.field11395, class236.field3285, class183.field2576, class655.field9583, class234.field3267, class62.field764, class354.field4769, class270.field3735, class80.field1050, class761.field11248, class452.field6403, class662.field9640, class50.field656, class390.field5660, class758.field11223, class713.field10390, class397.field5735, class760.field11233, class94.field1219, class343.field4656, class491.field7030, class81.field1059, class675.field9774, class86.field1134, class277.field3780, class21.field245, class565.field8053, class634.field9268, class738.field10769, class366.field5016, class616.field9057, class472.field6789, class584.field8644, class64.field781, class791.field11601, class536.field7670, class157.field2232, class777.field11392, class711.field10377, class711.field10367, class77.field959, class569.field8119, class781.field11456, class714.field10399, class358.field4847, class594.field8736, class69.field845, class600.field8813, class763.field11274, class52.field671, class503.field7301, class208.field2971, class368.field5033, class125.field1620, class651.field9538, class506.field7347, class98.field1262, class90.field1174, class405.field5855, class301.field4122, class128.field1638, class442.field6303, class68.field841, class686.field10116, class618.field9106, class603.field8863, class572.field8132, class85.field1122, class525.field7523, class255.field3473, class793.field11616, class602.field8846, class395.field5707, class379.field5458, class81.field1057, class441.field6281, class330.field4492, class238.field3337, class218.field3122, class767.field11305, class191.field2712, class564.field8048, class347.field4687, class699.field10234, class555.field7971, class247.field3406, class772.field11353, class383.field5549, class609.field8925, class127.field1627, class767.field11307, class158.field2262, class183.field2568, class743.field10832, class50.field657, class594.field8737, class642.field9386, class160.field2279, class360.field4918, class291.field4024, class60.field742, class776.field11375, class117.field1461, class101.field1290, class292.field4028, class615.field9036, class475.field6832, class656.field9594, class194.field2751, class99.field1270, class276.field3772, class721.field10538, class437.field6253, class213.field3040, class128.field1639, class274.field3760, class403.field5820, class218.field3124, class418.field6008, class286.field3959, class564.field8042, class477.field6856, class441.field6278, class238.field3338, class288.field3986, class583.field8640, class495.field7181, class432.field6166, class300.field4102};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3371[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;"
   )
   public static final String method1860(String arg0, byte arg1) {
      try {
         if (arg1 <= 87) {
            method1861((byte)-10);
         }

         ++field3368;
         if (!class590.field8700.startsWith(field3371[11])) {
            if (class590.field8700.startsWith(field3371[6])) {
               return field3371[8] + arg0 + field3371[9];
            } else {
               return class590.field8700.startsWith(field3371[5]) ? field3371[8] + arg0 + field3371[7] : null;
            }
         } else {
            return arg0 + field3371[4];
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3371[10] + (arg0 != null ? field3371[2] : field3371[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1861(byte arg0) {
      try {
         ++field3369;
         class783.field11475 = true;
         int var1 = 40 % ((12 - arg0) / 48);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3371[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1862(int arg0) {
      try {
         int var1 = -124 % ((arg0 - -76) / 49);
         field3366 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3371[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1863(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1864(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
