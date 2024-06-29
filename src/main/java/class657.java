import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class657 extends class70 {
   @OriginalMember(
      owner = "client!mh",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9542 = new String[]{method4730(method4729("=\f\r{B")), method4730(method4729("=\f\r\u007fB")), method4730(method4729("=\f\r|B")), method4730(method4729("+J\r\u001e\u0017")), method4730(method4729(">\u0011O\\")), method4730(method4729("=\f\rzB")), method4730(method4729("=\f\r}B")), method4730(method4729("=\f\r~B")), method4730(method4729("=\f\ryB")), method4730(method4729("=\f\r`B"))};
   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "I"
   )
   public static int field9533;
   @OriginalMember(
      owner = "client!mh",
      name = "E",
      descriptor = "I"
   )
   public static int field9534;
   @OriginalMember(
      owner = "client!mh",
      name = "C",
      descriptor = "I"
   )
   public static int field9535;
   @OriginalMember(
      owner = "client!mh",
      name = "F",
      descriptor = "I"
   )
   public static int field9536;
   @OriginalMember(
      owner = "client!mh",
      name = "A",
      descriptor = "I"
   )
   public static int field9537;
   @OriginalMember(
      owner = "client!mh",
      name = "D",
      descriptor = "I"
   )
   public static int field9538;
   @OriginalMember(
      owner = "client!mh",
      name = "x",
      descriptor = "I"
   )
   public static int field9539;
   @OriginalMember(
      owner = "client!mh",
      name = "B",
      descriptor = "I"
   )
   public static int field9541;
   @OriginalMember(
      owner = "client!mh",
      name = "y",
      descriptor = "Lwia;"
   )
   private class791 field9540;

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(JI)I"
   )
   public static final int method4721(long arg0, int arg1) {
      try {
         class500.method3735(arg0, (byte)-92);
         ++field9538;
         return arg1 != 1 ? -94 : class447.field6798.get(1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9542[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "(BI)V"
   )
   public static final void method4722(byte arg0, int arg1) {
      try {
         ++field9541;
         if (class163.method1333(3)) {
            int var2 = 20 / ((arg0 - 25) / 53);
            if (class752.field11122 != arg1) {
               class591.field8737 = "";
            }

            class752.field11122 = arg1;
            if (class429.field6546 != null) {
               class429.field6546.method812(2035738378);
               class429.field6546 = null;
            }

            class317.method2411(5, (byte)5);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9542[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Ljj;II)V"
   )
   private final void method4723(class128 arg0, int arg1, int arg2) {
      int var4 = client.field4530;

      try {
         if (arg1 == arg2) {
            int var5 = arg0.method1104(255);
            if (this.field9540 == null) {
               int var6 = class7.method63(var5, false);
               this.field9540 = new class791(var6);
            }

            int var7 = 0;
            if (var4 != 0 || ~var7 > ~var5) {
               do {
                  boolean var8 = ~arg0.method1104(255) == -2;
                  int var9 = arg0.method1077(-33);
                  class347 var10;
                  if (!var8) {
                     var10 = new class10(arg0.method1041(4758));
                     if (var4 != 0) {
                        var10 = new class391(arg0.method1083((byte)125));
                     }
                  } else {
                     var10 = new class391(arg0.method1083((byte)125));
                  }

                  this.field9540.method5682((long)var9, var10, (byte)7);
                  ++var7;
               } while(~var7 > ~var5);
            }
         }

         ++field9534;
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field9542[7] + (arg0 != null ? field9542[3] : field9542[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "(Ljj;II)V"
   )
   public static final void method4724(class128 arg0, int arg1, int arg2) {
      try {
         if (class561.field8395 != null) {
            try {
               class561.field8395.method3968(-100, 0L);
               class561.field8395.method3977(arg0.field1552, 24, (byte)-92, arg2);
            } catch (Exception var4) {
            }
         }

         if (arg1 == 1) {
            ++field9536;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9542[2] + (arg0 != null ? field9542[3] : field9542[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;"
   )
   public final String method4725(int arg0, String arg1, int arg2) {
      try {
         ++field9537;
         if (arg0 >= -62) {
            this.method4728((class128)null, 97);
         }

         if (this.field9540 == null) {
            return arg1;
         } else {
            class391 var4 = (class391)this.field9540.method5681((long)arg2, -1);
            return var4 == null ? arg1 : var4.field5951;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9542[8] + arg0 + ',' + (arg1 != null ? field9542[3] : field9542[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "c",
      descriptor = "(III)I"
   )
   public final int method4726(int arg0, int arg1, int arg2) {
      try {
         ++field9533;
         if (this.field9540 == null) {
            return arg2;
         } else {
            class10 var4 = (class10)this.field9540.method5681((long)arg0, -1);
            if (arg1 <= 86) {
               return -92;
            } else {
               return var4 == null ? arg2 : var4.field141;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9542[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method4727(byte arg0, int arg1) {
      try {
         if (arg0 >= -22) {
            return 36;
         } else {
            ++field9535;
            return 255 & arg1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9542[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Ljj;I)V"
   )
   public final void method4728(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 != -19903) {
            this.field9540 = null;
         }

         ++field9539;

         do {
            int var4 = arg0.method1104(arg1 ^ -19778);
            if (~var4 == -1) {
               break;
            }

            this.method4723(arg0, var4, arg1 ^ -19784);
         } while(var3 == 0);

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9542[5] + (arg0 != null ? field9542[3] : field9542[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4729(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4730(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
