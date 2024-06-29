import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class617 extends class393 {
   @OriginalMember(
      owner = "client!pm",
      name = "n",
      descriptor = "Z"
   )
   private boolean field9087 = false;
   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9094 = new String[]{method4550(method4549("\u0004\u007f\u0015*)")), method4550(method4549("\u0004\u007f\u0015')")), method4550(method4549("\u0004\u007f\u0015-)")), method4550(method4549("\u0004\u007f\u0015+)")), method4550(method4549("\u0004\u007f\u0015 )")), method4550(method4549("\u0004\u007f\u0015%)")), method4550(method4549("\u000f<\u0015@|")), method4550(method4549("\u001agW\u0002")), method4550(method4549("\u0004\u007f\u0015$)")), method4550(method4549("\u0004\u007f\u0015))"))};
   @OriginalMember(
      owner = "client!pm",
      name = "k",
      descriptor = "Lmu;"
   )
   public static class314 field9088 = new class314();
   @OriginalMember(
      owner = "client!pm",
      name = "p",
      descriptor = "I"
   )
   public static int field9085;
   @OriginalMember(
      owner = "client!pm",
      name = "r",
      descriptor = "I"
   )
   public static int field9086;
   @OriginalMember(
      owner = "client!pm",
      name = "l",
      descriptor = "I"
   )
   public static int field9089;
   @OriginalMember(
      owner = "client!pm",
      name = "o",
      descriptor = "I"
   )
   public static int field9090;
   @OriginalMember(
      owner = "client!pm",
      name = "m",
      descriptor = "I"
   )
   public static int field9091;
   @OriginalMember(
      owner = "client!pm",
      name = "j",
      descriptor = "I"
   )
   public static int field9092;
   @OriginalMember(
      owner = "client!pm",
      name = "q",
      descriptor = "I"
   )
   public static int field9093;

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      try {
         ++field9090;
         class531 var3 = super.field5438.method2286(-63);
         if (arg1 != 32) {
            field9088 = null;
         }

         if (var3 != null && arg0) {
            super.field5438.method2238(arg1 ^ 41, 1);
            super.field5438.method2265(var3, (byte)-128);
            super.field5438.method1428(class354.field4945, (byte)109);
            super.field5438.method2238(9, 1);
            super.field5438.method2231(class749.field10941, class318.field4380, (byte)95);
            super.field5438.method1409(false, true, class48.field640, 2, -97);
            super.field5438.method2211((byte)-126, class733.field10690, 0);
            class620 var4 = super.field5438.method2264((byte)67);
            var4.method4595(super.field5438.method2254(-2), -96);
            super.field5438.method2223(false, class644.field9663);
            super.field5438.method2238(arg1 + -23, 0);
            this.field9087 = true;
         } else {
            super.field5438.method2211((byte)-2, class733.field10690, 0);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9094[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         if (arg0 != 29404) {
            this.field9087 = true;
         }

         super.field5438.method2231(class231.field2873, class318.field4380, (byte)76);
         ++field9091;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9094[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field9092;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9094[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4547(int arg0) {
      try {
         ++field9085;
         if (arg0 >= 82) {
            class505 var1 = (class505)class17.field291.method288(0);
            boolean var2 = class584.field8627 != null || class486.field6784 > 0;
            int var3 = var1.method1557(-1012);
            int var4 = var1.method1554((byte)111);
            if (var2) {
               class774.field11272 = 1;
            }

            if (var2) {
               class94.field1273 = class213.field2705;
            } else {
               class437.method3375(class213.field2705, var4, 1, var3);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9094[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method4548(byte arg0) {
      try {
         field9088 = null;
         if (arg0 < 35) {
            method4548((byte)-17);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9094[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      try {
         label16: {
            if (!this.field9087) {
               super.field5438.method2211((byte)-127, class363.field5039, 0);
               if (!client.field1481) {
                  break label16;
               }
            }

            super.field5438.method2238(9, 1);
            super.field5438.method1428(class628.field9271, (byte)68);
            super.field5438.method2231(class231.field2873, class231.field2873, (byte)-115);
            super.field5438.method2288((byte)-10, class354.field4947, 2);
            super.field5438.method2211((byte)96, class363.field5039, 0);
            super.field5438.method2282(false);
            super.field5438.method2265((class421)null, (byte)62);
            super.field5438.method2238(9, 0);
            this.field9087 = false;
         }

         int var2 = 124 / ((22 - arg0) / 63);
         ++field9093;
         super.field5438.method2231(class231.field2873, class231.field2873, (byte)74);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9094[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      try {
         ++field9089;
         if (arg1 != 7313) {
            this.method1461((class421)null, -91, 75);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9094[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         super.field5438.method2265(arg0, (byte)103);
         ++field9086;
         super.field5438.method2240(-4, arg2);
         if (arg1 <= 84) {
            this.field9087 = true;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9094[8] + (arg0 != null ? field9094[6] : field9094[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "<init>",
      descriptor = "(Lfm;)V"
   )
   public class617(class281 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4549(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4550(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
