import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class763 {
   @OriginalMember(
      owner = "client!eja",
      name = "b",
      descriptor = "[[Lfia;"
   )
   private class599[][] field11046;
   @OriginalMember(
      owner = "client!eja",
      name = "D",
      descriptor = "[[Lfia;"
   )
   private class599[][] field11050;
   @OriginalMember(
      owner = "client!eja",
      name = "j",
      descriptor = "[I"
   )
   private int[] field11054;
   @OriginalMember(
      owner = "client!eja",
      name = "g",
      descriptor = "I"
   )
   private int field11063;
   @OriginalMember(
      owner = "client!eja",
      name = "A",
      descriptor = "[I"
   )
   private int[] field11061;
   @OriginalMember(
      owner = "client!eja",
      name = "s",
      descriptor = "[I"
   )
   private int[] field11065;
   @OriginalMember(
      owner = "client!eja",
      name = "d",
      descriptor = "Luj;"
   )
   private class401 field11059;
   @OriginalMember(
      owner = "client!eja",
      name = "p",
      descriptor = "Lsd;"
   )
   private class102 field11047;
   @OriginalMember(
      owner = "client!eja",
      name = "m",
      descriptor = "Lsd;"
   )
   private class102 field11072;
   @OriginalMember(
      owner = "client!eja",
      name = "w",
      descriptor = "Lrn;"
   )
   private class280 field11070;
   @OriginalMember(
      owner = "client!eja",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11076 = new String[]{method5524(method5523("8.]`")), method5524(method5523("31P\"2~")), method5524(method5523("-u\u001f\"\u0007")), method5524(method5523("31P\"0~")), method5524(method5523("31P\"8~")), method5524(method5523("31P\";~")), method5524(method5523("31P\"1~")), method5524(method5523("99")), method5524(method5523(">+")), method5524(method5523("31P\"<~")), method5524(method5523("31P\"6~")), method5524(method5523("31P\"7~")), method5524(method5523("31P\">~")), method5524(method5523("31P\"?~")), method5524(method5523("31P\"=~")), method5524(method5523("31P\"9~")), method5524(method5523("31P\"F?5XxD~"))};
   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field11057 = new short[]{967, 20428, -21577, 11219, -10290};
   @OriginalMember(
      owner = "client!eja",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field11056 = new int[50];
   @OriginalMember(
      owner = "client!eja",
      name = "x",
      descriptor = "[S"
   )
   private static short[] field11051 = new short[]{962, 20423, -21582, 11214, -10295};
   @OriginalMember(
      owner = "client!eja",
      name = "q",
      descriptor = "[S"
   )
   private static short[] field11058 = new short[]{957, 20418, -21587, 11209, -10300};
   @OriginalMember(
      owner = "client!eja",
      name = "y",
      descriptor = "[S"
   )
   private static short[] field11071 = new short[]{952, 20413, -21592, 11204, -10305};
   @OriginalMember(
      owner = "client!eja",
      name = "v",
      descriptor = "[[S"
   )
   public static short[][] field11064 = new short[][]{field11057, field11051, field11058, field11071};
   @OriginalMember(
      owner = "client!eja",
      name = "i",
      descriptor = "I"
   )
   public static int field11048;
   @OriginalMember(
      owner = "client!eja",
      name = "B",
      descriptor = "I"
   )
   public static int field11049;
   @OriginalMember(
      owner = "client!eja",
      name = "r",
      descriptor = "I"
   )
   public static int field11052;
   @OriginalMember(
      owner = "client!eja",
      name = "e",
      descriptor = "I"
   )
   public static int field11053;
   @OriginalMember(
      owner = "client!eja",
      name = "u",
      descriptor = "I"
   )
   public static int field11055;
   @OriginalMember(
      owner = "client!eja",
      name = "k",
      descriptor = "I"
   )
   public static int field11060;
   @OriginalMember(
      owner = "client!eja",
      name = "n",
      descriptor = "I"
   )
   public static int field11062;
   @OriginalMember(
      owner = "client!eja",
      name = "h",
      descriptor = "I"
   )
   public static int field11066;
   @OriginalMember(
      owner = "client!eja",
      name = "c",
      descriptor = "I"
   )
   public static int field11067;
   @OriginalMember(
      owner = "client!eja",
      name = "f",
      descriptor = "I"
   )
   public static int field11068;
   @OriginalMember(
      owner = "client!eja",
      name = "l",
      descriptor = "I"
   )
   public static int field11069;
   @OriginalMember(
      owner = "client!eja",
      name = "C",
      descriptor = "I"
   )
   public static int field11073;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11074;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!eja",
      name = "t",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11075;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method5522(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(IIIZI)V",
      line = 3
   )
   public static final void method5509(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field11066;
         if (class28.method199(0, arg1)) {
            if (arg2 <= 9) {
               method5510(20);
            }

            class641.method4692(class253.field3608[arg1], -1, arg3, arg4, false, arg0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11076[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "b",
      descriptor = "(I)V",
      line = 24
   )
   public static final void method5510(int arg0) {
      try {
         ++field11062;
         class431.field6248 = 200;
         class670.field9752 = (int)((double)class209.field3112 * 34.46D);
         if (arg0 == -25909) {
            class670.field9752 <<= 2;
            if (class444.field6473.method411()) {
               class670.field9752 += 512;
            }

            class284.method2212(arg0 + 38548, false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11076[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(ILcs;)V",
      line = 42
   )
   private final void method5511(int arg0, class357 arg1) {
      try {
         class29.field457 = arg1.field5270;
         ++field11068;
         if (arg0 != 0) {
            method5520(20);
         }

         arg1.method2742(82);
         arg1.method2769(124, false);
         arg1.method2731((byte)118, false);
         arg1.method2747((byte)93);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11076[1] + arg0 + ',' + (arg1 != null ? field11076[2] : field11076[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(Lcs;Z)V",
      line = 60
   )
   public final void method5512(class357 arg0, boolean arg1) {
      try {
         this.field11047.method568(22407, 24, 786336);
         ++field11053;
         if (arg1) {
            this.method5515((byte)126, (class357)null, -32);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11076[9] + (arg0 != null ? field11076[2] : field11076[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "<init>",
      descriptor = "(Lcs;)V",
      line = 816
   )
   public class763(class357 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eja",
      name = "d",
      descriptor = "(I)V",
      line = 75
   )
   public static final void method5513(int arg0) {
      boolean var1 = client.field4564;

      try {
         class589.method4358(class444.field6473, (long)class29.field458, 119);
         ++field11048;
         if (class277.field3907 != -1) {
            class516.method3900(class277.field3907, -1);
         }

         int var2 = 0;
         if (var1) {
            if (class178.field2749[var2]) {
               class36.field892[var2] = true;
            }

            class114.field1851[var2] = class178.field2749[var2];
            class178.field2749[var2] = false;
            ++var2;
         }

         while(true) {
            int var10000;
            if (class656.field9577 <= var2) {
               class133.field2195 = class29.field458;
               var10000 = ~class277.field3907;
               if (!var1) {
                  if (var10000 != 0) {
                     class656.field9577 = 0;
                     class738.method5309(-4913);
                  }

                  class444.field6473.method349();
                  class625.method4574(class444.field6473, -16711936);
                  int var3 = class112.method1063((byte)100);
                  if (~var3 == 0) {
                     var3 = class135.field2225;
                  }

                  if (arg0 == var3) {
                     var3 = class396.field5817;
                  }

                  class250.method2027(var3, 0);
                  class697.field10217 = 0;
                  return;
               }
            } else {
               var10000 = class178.field2749[var2];
            }

            if (var10000 != 0) {
               class36.field892[var2] = true;
            }

            class114.field1851[var2] = class178.field2749[var2];
            class178.field2749[var2] = false;
            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11076[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(BLvm;Lcs;I)V",
      line = 119
   )
   public final void method5514(byte param1, class713 param2, class357 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(BLcs;I)V",
      line = 276
   )
   private final void method5515(byte param1, class357 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(B)V",
      line = 665
   )
   public final void method5516(byte arg0) {
      try {
         if (arg0 != -69) {
            method5510(100);
         }

         ++field11069;
         this.field11047.method574(29079);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11076[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(Lcs;II)V",
      line = 685
   )
   private final void method5517(class357 arg0, int arg1, int arg2) {
      try {
         if (arg2 == -1) {
            class29.field457 = arg0.field5270;
            ++field11073;
            arg0.method2751((byte)71, (float)arg1);
            arg0.method2799(arg2 ^ 115);
            arg0.method2769(117, false);
            arg0.method2731((byte)83, false);
            arg0.method2747((byte)93);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11076[5] + (arg0 != null ? field11076[2] : field11076[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "c",
      descriptor = "(I)I",
      line = 701
   )
   public static final int method5518(int arg0) {
      boolean var1 = client.field4564;

      try {
         if (arg0 != -1) {
            field11071 = null;
         }

         ++field11060;
         int var2 = 0;
         Field[] var3 = (field11074 != null ? field11074 : (field11074 = method5522(field11076[7]))).getDeclaredFields();
         Field[] var4 = var3;
         int var5 = 0;
         if (!var1 && ~var5 <= ~var3.length) {
            return var2 + 1;
         } else {
            do {
               Field var6 = var4[var5];
               if ((field11075 != null ? field11075 : (field11075 = method5522(field11076[8]))).isAssignableFrom(var6.getType())) {
                  ++var2;
               }

               ++var5;
            } while(~var5 > ~var4.length);

            return var2 + 1;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field11076[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "b",
      descriptor = "(Lcs;Z)V",
      line = 754
   )
   private final void method5519(class357 arg0, boolean arg1) {
      try {
         if (arg1) {
            this.method5512((class357)null, false);
         }

         ++field11055;
         arg0.method2731((byte)105, true);
         arg0.method2769(117, true);
         if (class29.field457 != arg0.field5270) {
            arg0.method297(class29.field457);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11076[10] + (arg0 != null ? field11076[2] : field11076[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(I)V",
      line = 769
   )
   public static void method5520(int arg0) {
      try {
         int var1 = 19 / ((arg0 - 44) / 49);
         field11071 = null;
         field11056 = null;
         field11057 = null;
         field11064 = null;
         field11051 = null;
         field11058 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11076[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(III)V",
      line = 784
   )
   public static final void method5521(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      if (var3 != null) {
         class428.method3232(var3.field8659);
         class428.method3232(var3.field8661);
         if (var3.field8659 != null) {
            var3.field8659 = null;
         }

         if (var3.field8661 != null) {
            var3.field8661 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
