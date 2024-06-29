import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class609 extends class300 implements class604 {
   @OriginalMember(
      owner = "client!pf",
      name = "O",
      descriptor = "Z"
   )
   private boolean field8932 = false;
   @OriginalMember(
      owner = "client!pf",
      name = "R",
      descriptor = "Lwk;"
   )
   public class154 field8929;
   @OriginalMember(
      owner = "client!pf",
      name = "V",
      descriptor = "Z"
   )
   private boolean field8928;
   @OriginalMember(
      owner = "client!pf",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8947 = new String[]{method4437(method4436("b\u0017gH-:")), method4437(method4436("|\u0004%c")), method4437(method4436("i_g!\u0011")), method4437(method4436("b\u0017gKD")), method4437(method4436("b\u0017gCD")), method4437(method4436("b\u0017gK-:")), method4437(method4436("b\u0017g]D")), method4437(method4436("b\u0017g[D")), method4437(method4436("b\u0017gMD")), method4437(method4436("b\u0017gN-:")), method4437(method4436("b\u0017gM-:")), method4437(method4436("b\u0017gI-:")), method4437(method4436("b\u0017gFD")), method4437(method4436("b\u0017gED")), method4437(method4436("b\u0017gYD")), method4437(method4436("b\u0017g\\D")), method4437(method4436("b\u0017gBD")), method4437(method4436("b\u0017g3\u0005|\u0018=1D")), method4437(method4436("b\u0017gL-:")), method4437(method4436("b\u0017gJ-:")), method4437(method4436("b\u0017gND"))};
   @OriginalMember(
      owner = "client!pf",
      name = "P",
      descriptor = "Leg;"
   )
   public static class118 field8925 = new class118(102, -1);
   @OriginalMember(
      owner = "client!pf",
      name = "M",
      descriptor = "J"
   )
   public static long field8945 = 0L;
   @OriginalMember(
      owner = "client!pf",
      name = "N",
      descriptor = "I"
   )
   public static int field8924;
   @OriginalMember(
      owner = "client!pf",
      name = "S",
      descriptor = "I"
   )
   public static int field8926;
   @OriginalMember(
      owner = "client!pf",
      name = "gb",
      descriptor = "I"
   )
   public static int field8927;
   @OriginalMember(
      owner = "client!pf",
      name = "T",
      descriptor = "I"
   )
   public static int field8930;
   @OriginalMember(
      owner = "client!pf",
      name = "cb",
      descriptor = "I"
   )
   public static int field8933;
   @OriginalMember(
      owner = "client!pf",
      name = "hb",
      descriptor = "I"
   )
   public static int field8934;
   @OriginalMember(
      owner = "client!pf",
      name = "db",
      descriptor = "I"
   )
   public static int field8935;
   @OriginalMember(
      owner = "client!pf",
      name = "Q",
      descriptor = "I"
   )
   public static int field8936;
   @OriginalMember(
      owner = "client!pf",
      name = "eb",
      descriptor = "I"
   )
   public static int field8937;
   @OriginalMember(
      owner = "client!pf",
      name = "X",
      descriptor = "I"
   )
   public static int field8938;
   @OriginalMember(
      owner = "client!pf",
      name = "ab",
      descriptor = "I"
   )
   public static int field8939;
   @OriginalMember(
      owner = "client!pf",
      name = "fb",
      descriptor = "I"
   )
   public static int field8940;
   @OriginalMember(
      owner = "client!pf",
      name = "ib",
      descriptor = "I"
   )
   public static int field8941;
   @OriginalMember(
      owner = "client!pf",
      name = "Z",
      descriptor = "I"
   )
   public static int field8942;
   @OriginalMember(
      owner = "client!pf",
      name = "jb",
      descriptor = "I"
   )
   public static int field8943;
   @OriginalMember(
      owner = "client!pf",
      name = "U",
      descriptor = "I"
   )
   public static int field8944;
   @OriginalMember(
      owner = "client!pf",
      name = "bb",
      descriptor = "I"
   )
   public static int field8946;
   @OriginalMember(
      owner = "client!pf",
      name = "Y",
      descriptor = "Lmk;"
   )
   private class62 field8931;

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public final void method240(int arg0, class66 arg1) {
      try {
         this.field8929.method1294(-10, arg1);
         ++field8941;
         if (arg0 >= -23) {
            this.field8932 = false;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8947[13] + arg0 + ',' + (arg1 != null ? field8947[2] : field8947[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "c",
      descriptor = "(ILha;)Lth;"
   )
   public final class623 method242(int arg0, class66 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 <= 94) {
            return null;
         } else {
            ++field8944;
            class500 var4 = this.field8929.method1297((byte)-22, 2048, false, true, arg1);
            if (var4 == null) {
               return null;
            } else {
               class623 var6;
               label58: {
                  class521 var5 = arg1.method598();
                  var5.method1217(super.field10694 - -super.field4100, super.field10697, super.field10693 - -super.field4105);
                  var6 = class403.method3038(1, this.field8928, true);
                  int var7 = super.field10694 >> 9;
                  int var8 = super.field10693 >> 9;
                  this.field8929.method1302(var8, true, arg1, var5, var7, var7, var4, var8, -22340);
                  if (!class183.field2581) {
                     var4.method192(var5, var6.field9164[0], 0);
                     if (!var3) {
                        break label58;
                     }
                  }

                  var4.method182(var5, var6.field9164[0], class298.field4088, 0);
               }

               if (this.field8929.field2199 != null) {
                  label52: {
                     class234 var9 = this.field8929.field2199.method4196();
                     if (class183.field2581) {
                        arg1.method535(var9, class298.field4088);
                        if (!var3) {
                           break label52;
                        }
                     }

                     arg1.method562(var9);
                  }
               }

               this.field8932 = var4.method222() || this.field8929.field2199 != null;
               if (this.field8931 == null) {
                  this.field8931 = class487.method3534(var4, super.field10694, -1, super.field10697, super.field10693);
                  if (!var3) {
                     return var6;
                  }
               }

               class423.method3129(super.field10697, this.field8931, -99, super.field10693, var4, super.field10694);
               return var6;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field8947[11] + arg0 + ',' + (arg1 != null ? field8947[2] : field8947[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method232(int arg0) {
      try {
         if (arg0 >= -88) {
            this.method252((byte)-128);
         }

         ++field8937;
         return this.field8929.method1292((byte)90);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8947[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(IILha;I)Z"
   )
   public final boolean method251(int arg0, int arg1, class66 arg2, int arg3) {
      try {
         ++field8940;
         class500 var5 = this.field8929.method1297((byte)-22, 131072, false, false, arg2);
         if (var5 == null) {
            return false;
         } else {
            if (arg3 != -1) {
               method4434(-89);
            }

            class521 var6 = arg2.method598();
            var6.method1217(super.field4100 + super.field10694, super.field10697, super.field4105 + super.field10693);
            return class183.field2581 ? var5.method206(arg1, arg0, var6, false, 0, class298.field4088) : var5.method183(arg1, arg0, var6, false, 0);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8947[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8947[2] : field8947[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method237(int arg0) {
      try {
         ++field8946;
         int var2 = -108 % ((arg0 - 27) / 63);
         return this.field8929.field2183;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8947[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method243(int arg0) {
      try {
         if (arg0 != -29381) {
            method4434(39);
         }

         ++field8935;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8947[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method252(byte arg0) {
      try {
         if (arg0 != 6) {
            return 74;
         } else {
            ++field8942;
            return this.field8929.field2205;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8947[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "h",
      descriptor = "(B)Z"
   )
   public final boolean method253(byte arg0) {
      try {
         ++field8924;
         int var2 = 13 / ((-84 - arg0) / 38);
         return false;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8947[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method238(byte arg0) {
      try {
         if (arg0 < 73) {
            return false;
         } else {
            ++field8939;
            return this.field8932;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8947[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(Lha;I)Lmk;"
   )
   public final class62 method244(class66 arg0, int arg1) {
      try {
         ++field8926;
         if (arg1 != 92160000) {
            method4433(59, 44);
         }

         return this.field8931;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8947[16] + (arg0 != null ? field8947[2] : field8947[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method247(int arg0) {
      try {
         ++field8927;
         if (arg0 != -6091) {
            field8945 = -19L;
         }

         return this.field8929.method1295(-127);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8947[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4433(int arg0, int arg1) {
      try {
         ++field8943;
         class525.field7528 = arg0;
         class80 var2 = class551.field7898;
         synchronized(class551.field7898) {
            class551.field7898.method731(arg1 + arg1);
         }

         class80 var3 = class108.field1346;
         synchronized(class108.field1346) {
            class108.field1346.method731(0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8947[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "(ILha;)V"
   )
   public final void method249(int arg0, class66 arg1) {
      try {
         if (arg0 >= -95) {
            this.method243(118);
         }

         this.field8929.method1293(-2006, arg1);
         ++field8938;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8947[6] + arg0 + ',' + (arg1 != null ? field8947[2] : field8947[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method4434(int arg0) {
      try {
         if (arg0 == -17888) {
            field8925 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8947[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public final void method245(class66 arg0, boolean arg1) {
      try {
         ++field8936;
         class500 var3 = this.field8929.method1297((byte)-22, 262144, arg1, true, arg0);
         if (var3 != null) {
            int var4 = super.field10694 >> 9;
            int var5 = super.field10693 >> 9;
            class521 var6 = arg0.method598();
            var6.method1217(super.field10694, super.field10697, super.field10693);
            this.field8929.method1302(var5, false, arg0, var6, var4, var4, var3, var5, -22340);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8947[0] + (arg0 != null ? field8947[2] : field8947[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method248(int arg0) {
      try {
         if (arg0 != -1) {
            this.method243(117);
         }

         ++field8934;
         return this.field8929.method1298(90);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8947[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(Lud;B)V"
   )
   public final void method4435(class39 arg0, byte arg1) {
      try {
         if (arg1 != -46) {
            this.field8929 = null;
         }

         this.field8929.method1300(arg0, (byte)-24);
         ++field8933;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8947[20] + (arg0 != null ? field8947[2] : field8947[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method236(int arg0) {
      try {
         if (arg0 != 28154) {
            this.field8928 = true;
         }

         ++field8930;
         return this.field8929.field2201;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8947[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "<init>",
      descriptor = "(Lha;Ldea;IIIIIZIIIII)V"
   )
   public class609(class66 arg0, class259 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);

      try {
         this.field8929 = new class154(arg0, arg1, arg10, arg11, super.field10701, arg3, this, arg7, arg12);
         this.field8928 = ~arg1.field3587 != -1 && !arg7;
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field8947[17] + (arg0 != null ? field8947[2] : field8947[1]) + ',' + (arg1 != null ? field8947[2] : field8947[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4436(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4437(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
