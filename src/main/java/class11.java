import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 {
   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field129 = new String[]{method64(method63("Ox7yZ\u0014")), method64(method63("Ox7y^\u0014")), method64(method63("G<xyb")), method64(method63("Rg:;")), method64(method63("Ox7y]\u0014")), method64(method63("Ox7y\\\u0014")), method64(method63("Ox7y[\u0014"))};
   @OriginalMember(
      owner = "client!sja",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field123 = false;
   @OriginalMember(
      owner = "client!sja",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field128 = false;
   @OriginalMember(
      owner = "client!sja",
      name = "c",
      descriptor = "I"
   )
   public static int field122;
   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "I"
   )
   public static int field124;
   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "I"
   )
   public static int field125;
   @OriginalMember(
      owner = "client!sja",
      name = "h",
      descriptor = "I"
   )
   public static int field126;
   @OriginalMember(
      owner = "client!sja",
      name = "g",
      descriptor = "I"
   )
   public static int field127;
   @OriginalMember(
      owner = "client!sja",
      name = "d",
      descriptor = "Lgt;"
   )
   public static class483 field121;

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(III)Z",
      line = 7
   )
   public static final boolean method58(int arg0, int arg1, int arg2) {
      try {
         ++field125;
         if (arg1 != -10302) {
            field128 = true;
         }

         return (458752 & arg0) != 0 | class400.method3026(arg0, arg2, true) || class197.method1553(arg2, 0, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field129[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "(Z)V",
      line = 19
   )
   public static final void method59(boolean arg0) {
      try {
         ++field124;
         if (!arg0) {
            method58(1, 21, 2);
         }

         if (class683.field10050 > 1) {
            class300.field4107.method3301(25349, class300.field4107.field6445, 4);
         } else {
            class300.field4107.method3301(25349, class300.field4107.field6445, 2);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field129[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(Z)V",
      line = 50
   )
   public static final void method60(boolean arg0) {
      boolean var1 = client.field4360;

      RuntimeException var10000;
      label63: {
         boolean var10001;
         class460 var3;
         try {
            class460 var2 = (class460)class522.field7503.method2933(2);
            if (var1) {
               if (var2.field6612) {
                  var2.method3350(0);
               }

               var2 = (class460)class522.field7503.method2940(false);
            }

            while(true) {
               boolean var8;
               if (var2 == null) {
                  ++field126;
                  var3 = (class460)class119.field1488.method2933(2);
                  var8 = arg0;
                  if (!var1) {
                     if (arg0) {
                        return;
                     }
                     break;
                  }
               } else {
                  var8 = var2.field6612;
               }

               if (var8) {
                  var2.method3350(0);
               }

               var2 = (class460)class522.field7503.method2940(false);
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label63;
         }

         while(true) {
            label58: {
               try {
                  if (var3 != null) {
                     if (var3.field6612) {
                        var3.method3350(0);
                     }
                     break label58;
                  }
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var1) {
                  return;
               }
            }

            try {
               var3 = (class460)class119.field1488.method2940(false);
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class237.method1823(var4, field129[4] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(I)V",
      line = 92
   )
   public static void method61(int arg0) {
      try {
         if (arg0 == 24902) {
            field121 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field129[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(ILbda;)V",
      line = 103
   )
   public static final void method62(int arg0, class534 arg1) {
      try {
         ++field122;
         arg1.method1160(arg0 + -7900, class536.field7672.method2055(false));
         arg1.method1160(arg0 + -7880, class267.field3710.method2055(false));
         arg1.method1160(arg0 + -7890, class418.field6003.method2055(false));
         arg1.method1160(80, class49.field653.method2055(false));
         arg1.method1160(81, class146.field1852.method2055(false));
         arg1.method1160(89, class515.field7437.method2055(false));
         arg1.method1160(127, class707.field10327.method2055(false));
         arg1.method1160(arg0 + -7897, class699.field10238.method2055(false));
         arg1.method1160(arg0 + -7889, class281.field3904.method2055(false));
         arg1.method1160(arg0 ^ 8038, class552.field7921.method2055(false));
         arg1.method1160(118, class342.field4638.method2055(false));
         arg1.method1160(arg0 + -7879, class598.field8789.method2055(false));
         arg1.method1160(91, class595.field8745.method2055(false));
         if (arg0 == 7984) {
            arg1.method1160(arg0 ^ 8032, class487.field6954.method2055(false));
            arg1.method1160(94, class525.field7531.method2055(false));
            arg1.method1160(arg0 + -7886, class213.field3038.method2055(false));
            arg1.method1160(arg0 + -7904, class617.field9088.method2055(false));
            arg1.method1160(arg0 ^ 8031, class249.field3427.method2055(false));
            arg1.method1160(arg0 + -7888, class666.field9672.method2055(false));
            arg1.method1160(110, class612.field8985.method2055(false));
            arg1.method1160(102, class80.field1051.method2055(false));
            arg1.method1160(79, class170.field2370.method2055(false));
            arg1.method1160(arg0 ^ 8006, class778.field11397.method2055(false));
            arg1.method1160(118, class77.field960.method2055(false));
            arg1.method1160(124, class86.field1135.method2055(false));
            arg1.method1160(112, class446.field6347.method2055(false));
            arg1.method1160(arg0 + -7876, class252.field3436.method2055(false));
            arg1.method1160(111, class259.field3556.method2055(false));
            arg1.method1160(94, class223.field3171.method2055(false));
            arg1.method1160(arg0 ^ 8016, class635.field9288.method2055(false));
            arg1.method1160(arg0 + -7864, class399.field5754.method2055(false));
            arg1.method1160(113, class387.field5601.method2055(false));
            arg1.method1160(98, class743.method5382(arg0 + -7792));
            arg1.method1160(arg0 ^ 8033, class321.method2374(1));
            arg1.method1160(106, class742.field10816.method2055(false));
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field129[1] + arg0 + ',' + (arg1 != null ? field129[2] : field129[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method63(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method64(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
