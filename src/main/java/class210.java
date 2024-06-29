import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class210 extends class557 {
   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3006 = new String[]{method1820(method1819("\u007f\u001c!TN")), method1820(method1819("\u007f\u001c!]N")), method1820(method1819("\u007f\u001c!VN")), method1820(method1819("\u007f\u001c!XN")), method1820(method1819("\u007f\u001c![N")), method1820(method1819("\u007f\u001c!ZN")), method1820(method1819("\u007f\u001c!UN")), method1820(method1819("m@!2\u001b")), method1820(method1819("\u007f\u001c! \u000fx\u0007{\"N")), method1820(method1819("x\u001bcp")), method1820(method1819("\u007f\u001c!WN")), method1820(method1819("\u007f\u001c!YN")), method1820(method1819("\u007f\u001c!^N")), method1820(method1819("\u007f\u001c!_N"))};
   @OriginalMember(
      owner = "client!ir",
      name = "s",
      descriptor = "Lhha;"
   )
   public static class724 field2998 = new class724(122, -2);
   @OriginalMember(
      owner = "client!ir",
      name = "k",
      descriptor = "I"
   )
   public static int field2993;
   @OriginalMember(
      owner = "client!ir",
      name = "m",
      descriptor = "I"
   )
   public static int field2994;
   @OriginalMember(
      owner = "client!ir",
      name = "i",
      descriptor = "I"
   )
   public static int field2995;
   @OriginalMember(
      owner = "client!ir",
      name = "o",
      descriptor = "I"
   )
   public static int field2997;
   @OriginalMember(
      owner = "client!ir",
      name = "l",
      descriptor = "I"
   )
   public static int field2999;
   @OriginalMember(
      owner = "client!ir",
      name = "n",
      descriptor = "I"
   )
   public static int field3000;
   @OriginalMember(
      owner = "client!ir",
      name = "p",
      descriptor = "I"
   )
   public static int field3001;
   @OriginalMember(
      owner = "client!ir",
      name = "t",
      descriptor = "I"
   )
   public static int field3002;
   @OriginalMember(
      owner = "client!ir",
      name = "j",
      descriptor = "I"
   )
   public static int field3003;
   @OriginalMember(
      owner = "client!ir",
      name = "q",
      descriptor = "I"
   )
   public static int field3004;
   @OriginalMember(
      owner = "client!ir",
      name = "h",
      descriptor = "I"
   )
   public static int field3005;
   @OriginalMember(
      owner = "client!ir",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field2996;

   @OriginalMember(
      owner = "client!ir",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class210(int arg0, class647 arg1) {
      super(arg0, arg1);

      try {
         class480.method3670(super.field7905, 2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3006[8] + arg0 + ',' + (arg1 != null ? field3006[7] : field3006[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1812(int arg0, int arg1, int arg2) {
      try {
         ++field3004;
         if (arg1 >= -33) {
            field2998 = null;
         }

         arg0 = (127 & arg2) * arg0 >> 7;
         if (~arg0 <= -3) {
            if (~arg0 >= -127) {
               return (65408 & arg2) + arg0;
            }

            arg0 = 126;
            if (!client.field10022) {
               return (65408 & arg2) + arg0;
            }
         }

         arg0 = 2;
         return (65408 & arg2) + arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3006[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field2994;
         super.field7905 = arg0;
         class480.method3670(super.field7905, 2);
         if (!arg1) {
            field2996 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3006[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            field2996 = null;
         }

         ++field3005;
         return ~super.field7906.method4714((byte)-40).method5258((byte)100) > -97 ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3006[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field2999;
         if (super.field7906.method4714((byte)-40).method5258((byte)120) < 96) {
            super.field7905 = 0;
         }

         if (arg0 != -22) {
            method1815((byte)87);
         }

         if (super.field7905 < 0 || ~super.field7905 < -3) {
            super.field7905 = this.method97(0);
         }

      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3006[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method1813(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field3000;
         class152.method1473((long)class51.field770, class54.field794, arg0 + -124);
         if (class7.field130 != -1) {
            class550.method4126(class7.field130, true);
         }

         if (arg0 != -4) {
            field2998 = null;
         }

         int var2 = 0;
         if (var1) {
            if (class417.field6107[var2]) {
               class55.field798[var2] = true;
            }

            class15.field210[var2] = class417.field6107[var2];
            class417.field6107[var2] = false;
            ++var2;
         }

         while(true) {
            int var10000;
            if (~class766.field10999 >= ~var2) {
               class70.field1024 = class51.field770;
               var10000 = class7.field130;
               if (!var1) {
                  if (var10000 != -1) {
                     class766.field10999 = 0;
                     class388.method3026((byte)-2);
                  }

                  class54.field794.method231();
                  class744.method5358(class54.field794, (byte)95);
                  int var3 = class207.method1783((byte)-114);
                  if (var3 == -1) {
                     var3 = class357.field5276;
                  }

                  if (var3 == -1) {
                     var3 = class316.field4726;
                  }

                  class798.method5750(var3, 0);
                  class327.field4859 = 0;
                  return;
               }
            } else {
               var10000 = class417.field6107[var2];
            }

            if (var10000 != 0) {
               class55.field798[var2] = true;
            }

            class15.field210[var2] = class417.field6107[var2];
            class417.field6107[var2] = false;
            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3006[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1814(int arg0) {
      try {
         ++field2993;
         return arg0 >= -52 ? 39 : super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3006[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method1815(byte arg0) {
      try {
         int var1 = -85 % ((arg0 - -68) / 50);
         field2998 = null;
         field2996 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3006[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field2997;
         if (~super.field7906.method4714((byte)-40).method5258((byte)104) > -97) {
            return 3;
         } else {
            return arg0 != 1 ? 104 : 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3006[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class210(class647 arg0) {
      super(arg0);

      try {
         class480.method3670(super.field7905, 2);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3006[8] + (arg0 != null ? field3006[7] : field3006[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method1816(boolean arg0, int arg1) {
      try {
         if (arg0) {
            method1815((byte)-36);
         }

         ++field3001;
         return arg1 & 255;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3006[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IIIIZII)V"
   )
   public static final void method1817(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
      try {
         if (!arg4) {
            field2996 = null;
         }

         if (~class476.field6870.field9134.method3775(-59) != -1 && ~arg3 != -1 && ~class501.field7151 > -51 && arg1 != -1) {
            class24.field345[class501.field7151++] = new class180((byte)1, arg1, arg3, arg2, arg6, arg5, arg0, (class471)null);
         }

         ++field3002;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3006[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1818(byte arg0) {
      try {
         ++field3003;
         if (~super.field7906.method4714((byte)-40).method5258((byte)107) > -97) {
            return false;
         } else {
            return arg0 != 108 ? true : true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3006[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1819(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1820(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
