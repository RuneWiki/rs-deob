import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class175 extends class454 {
   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2269 = new String[]{method1503(method1502(",}u`|")), method1503(method1502(",x7\\")), method1503(method1502("9#u\u001e)")), method1503(method1502(",}us|")), method1503(method1502(",}u\u007f|")), method1503(method1502(",}ux|")), method1503(method1502(",}ut|")), method1503(method1502(",}ur|")), method1503(method1502(",}uu|")), method1503(method1502(",}u~|")), method1503(method1502(",}uq|")), method1503(method1502(",}uw|")), method1503(method1502(",}uv|"))};
   @OriginalMember(
      owner = "client!np",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field2259 = new int[200];
   @OriginalMember(
      owner = "client!np",
      name = "l",
      descriptor = "Laka;"
   )
   public static class418 field2260 = new class418(17, 6);
   @OriginalMember(
      owner = "client!np",
      name = "m",
      descriptor = "I"
   )
   public static int field2253;
   @OriginalMember(
      owner = "client!np",
      name = "v",
      descriptor = "I"
   )
   public static int field2254;
   @OriginalMember(
      owner = "client!np",
      name = "q",
      descriptor = "I"
   )
   public static int field2256;
   @OriginalMember(
      owner = "client!np",
      name = "k",
      descriptor = "I"
   )
   public static int field2257;
   @OriginalMember(
      owner = "client!np",
      name = "x",
      descriptor = "I"
   )
   public static int field2258;
   @OriginalMember(
      owner = "client!np",
      name = "u",
      descriptor = "I"
   )
   public static int field2261;
   @OriginalMember(
      owner = "client!np",
      name = "s",
      descriptor = "I"
   )
   public static int field2262;
   @OriginalMember(
      owner = "client!np",
      name = "t",
      descriptor = "I"
   )
   public static int field2263;
   @OriginalMember(
      owner = "client!np",
      name = "n",
      descriptor = "I"
   )
   public static int field2264;
   @OriginalMember(
      owner = "client!np",
      name = "j",
      descriptor = "I"
   )
   public static int field2265;
   @OriginalMember(
      owner = "client!np",
      name = "w",
      descriptor = "I"
   )
   public static int field2267;
   @OriginalMember(
      owner = "client!np",
      name = "r",
      descriptor = "I"
   )
   public static int field2268;
   @OriginalMember(
      owner = "client!np",
      name = "i",
      descriptor = "Lvca;"
   )
   public static class763 field2266;
   @OriginalMember(
      owner = "client!np",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field2255;

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field2257;
         if (arg0 > -46) {
            field2255 = null;
         }

         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2269[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            method1499(-108, 89, -48, -60, 40, -68);
         }

         ++field2265;
         return 1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2269[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(ILoca;)V"
   )
   public static final void method1495(int arg0, class642 arg1) {
      try {
         ++field2267;
         class642 var2 = class688.method5030(0, arg1);
         if (arg0 == 1) {
            int var3;
            int var4;
            label25: {
               if (var2 == null) {
                  var3 = class91.field1242;
                  var4 = class204.field2605;
                  if (!client.field1481) {
                     break label25;
                  }
               }

               var3 = var2.field9572;
               var4 = var2.field9629;
            }

            class259.method2087(var4, false, var3, arg1, (byte)-127);
            class693.method5054(var3, arg1, var4, arg0 + -6);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2269[0] + arg0 + ',' + (arg1 != null ? field2269[2] : field2269[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field2256;
         if (arg1) {
            method1497(-77);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2269[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1496(int arg0) {
      try {
         if (arg0 != -18033) {
            this.method24(-55, false);
         }

         ++field2262;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2269[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1497(int arg0) {
      try {
         ++class353.field4941;
         if (arg0 != 0) {
            method1497(-114);
         }

         ++field2254;
         class702 var1 = class19.method142(class387.field5365.field8765, class8.field105, (byte)-84);
         var1.field10264.method649((byte)-124, class657.field9800);
         class387.field5365.method4423(var1, (byte)109);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2269[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "(BI)Z"
   )
   public static final boolean method1498(byte arg0, int arg1) {
      try {
         if (arg0 != 8) {
            field2259 = null;
         }

         ++field2253;
         return arg1 == 7 || ~arg1 == -10;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2269[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class175(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method1499(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1500(byte arg0) {
      try {
         field2266 = null;
         field2260 = null;
         field2255 = null;
         field2259 = null;
         if (arg0 != 73) {
            method1498((byte)-98, -110);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2269[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1501(int arg0) {
      try {
         ++field2261;
         class789.method5679(-4043, 2, 22050, ~class757.field11093.field10995.method4238(-18033) == -2);
         class737.field10797 = class230.method1828(class590.field8691, 0, 22050, class366.field5092, false);
         class198.method1646(-71, class777.method5614((class706)null, 9), true);
         class785.field11467 = class230.method1828(class590.field8691, 1, 2048, class366.field5092, false);
         class674.field9978 = new class360();
         class785.field11467.method4405(class674.field9978, 32);
         class32.field476 = new class491(22050, class36.field514);
         if (arg0 > -102) {
            method1498((byte)56, -10);
         }

         class318.method2514(116);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2269[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (super.field6263 != 1 && super.field6263 != 0) {
            super.field6263 = this.method23(1);
         }

         if (arg0) {
            ++field2268;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2269[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class175(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1502(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1503(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
