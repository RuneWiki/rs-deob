import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class246 {
   @OriginalMember(
      owner = "client!ida",
      name = "e",
      descriptor = "[I"
   )
   public int[] field3169;
   @OriginalMember(
      owner = "client!ida",
      name = "j",
      descriptor = "B"
   )
   public byte field3179;
   @OriginalMember(
      owner = "client!ida",
      name = "m",
      descriptor = "B"
   )
   public byte field3165;
   @OriginalMember(
      owner = "client!ida",
      name = "c",
      descriptor = "[I"
   )
   public int[] field3180;
   @OriginalMember(
      owner = "client!ida",
      name = "f",
      descriptor = "[I"
   )
   public int[] field3177;
   @OriginalMember(
      owner = "client!ida",
      name = "n",
      descriptor = "S"
   )
   public short field3170;
   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "S"
   )
   public short field3171;
   @OriginalMember(
      owner = "client!ida",
      name = "h",
      descriptor = "S"
   )
   public short field3173;
   @OriginalMember(
      owner = "client!ida",
      name = "g",
      descriptor = "[S"
   )
   public short[] field3174;
   @OriginalMember(
      owner = "client!ida",
      name = "o",
      descriptor = "[S"
   )
   public short[] field3168;
   @OriginalMember(
      owner = "client!ida",
      name = "p",
      descriptor = "[S"
   )
   public short[] field3172;
   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "S"
   )
   public short field3175;
   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3182 = new String[]{method1845(method1844("Ji&?\u0019Jc.e\u001b\u000b")), method1845(method1844("Mx+}")), method1845(method1844("X#i?X")), method1845(method1844("Ji&?f\u000b")), method1845(method1844("Ji&?a\u000b")), method1845(method1844("Ji&?d\u000b")), method1845(method1844("Ji&?`\u000b")), method1845(method1844("Ji&?g\u000b"))};
   @OriginalMember(
      owner = "client!ida",
      name = "q",
      descriptor = "Lnda;"
   )
   public static class583 field3166 = new class583();
   @OriginalMember(
      owner = "client!ida",
      name = "l",
      descriptor = "I"
   )
   public static int field3167;
   @OriginalMember(
      owner = "client!ida",
      name = "i",
      descriptor = "I"
   )
   public static int field3176;
   @OriginalMember(
      owner = "client!ida",
      name = "k",
      descriptor = "I"
   )
   public static int field3178;
   @OriginalMember(
      owner = "client!ida",
      name = "d",
      descriptor = "I"
   )
   public static int field3181;

   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public static void method1839(int arg0) {
      try {
         if (arg0 > 40) {
            field3166 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3182[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(ZI[BI)[B",
      line = 21
   )
   public static final byte[] method1840(boolean arg0, int arg1, byte[] arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field3176;
         if (!arg0) {
            method1840(false, 58, (byte[])null, 59);
         }

         byte[] var5;
         label42: {
            if (~arg3 >= -1) {
               var5 = arg2;
               if (var4 == 0) {
                  break label42;
               }
            }

            var5 = new byte[arg1];
            int var6 = 0;
            if (var4 != 0 || ~arg1 < ~var6) {
               do {
                  var5[var6] = arg2[arg3 + var6];
                  ++var6;
               } while(~arg1 < ~var6);
            }
         }

         class385 var7 = new class385();
         var7.method2959(-8093);
         var7.method2956((long)(arg1 * 8), var5, (byte)20);
         byte[] var8 = new byte[64];
         var7.method2960(19440, var8, 0);
         return var8;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3182[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3182[2] : field3182[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(BII)V",
      line = 56
   )
   public static final void method1841(byte arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         label145: {
            if (class329.field4680 > class329.field4678) {
               class329.field4678 = (float)((double)class329.field4678 / 30.0D + (double)class329.field4678);
               if (class329.field4680 < class329.field4678) {
                  class329.field4678 = class329.field4680;
               }

               class351.method2743(-1);
               class329.field4675 = (int)class329.field4678 >> 1;
               class329.field4684 = class405.method3106(class329.field4675, 3);
               if (var3 == 0) {
                  break label145;
               }
            }

            if (class329.field4680 < class329.field4678) {
               class329.field4678 = (float)((double)class329.field4678 - (double)class329.field4678 / 30.0D);
               if (class329.field4678 < class329.field4680) {
                  class329.field4678 = class329.field4680;
               }

               class351.method2743(-1);
               class329.field4675 = (int)class329.field4678 >> 1;
               class329.field4684 = class405.method3106(class329.field4675, 3);
            }
         }

         ++field3178;
         if (class303.field4325 != -1 && class82.field999 != -1) {
            int var4 = -class729.field10834 + class303.field4325;
            if (~var4 > -3 || ~var4 < -3) {
               var4 /= 8;
            }

            int var5 = class82.field999 - class670.field10075;
            class729.field10834 += var4;
            if (var5 < 2 || var5 > 2) {
               var5 /= 8;
            }

            if (var4 == 0 && ~var5 == -1) {
               class82.field999 = -1;
               class303.field4325 = -1;
            }

            class670.field10075 += var5;
            class351.method2743(-1);
         }

         label126: {
            if (class705.field10553 > 0) {
               --class283.field3936;
               if (class283.field3936 != 0) {
                  break label126;
               }

               class283.field3936 = 100;
               --class705.field10553;
               if (var3 == 0) {
                  break label126;
               }
            }

            class379.field5799 = -1;
            class606.field8893 = -1;
         }

         if (arg0 != 34) {
            field3166 = null;
         }

         if (class247.field3250 && class100.field1216 != null) {
            class476 var6 = (class476)class100.field1216.method4071((byte)127);
            if (var3 != 0 || var6 != null) {
               do {
                  label153: {
                     class426 var7 = class329.field4666.method3293(27767, var6.field7078.field6786);
                     if (!var6.method3532((byte)38, arg1, arg2)) {
                        if (!var6.field7078.field6779) {
                           break label153;
                        }

                        var6.field7078.field6779 = false;
                        class265.method2025(class225.field2893, var6.field7078.field6786, var7.field6481);
                        if (var3 == 0) {
                           break label153;
                        }
                     }

                     if (var7.field6516 != null) {
                        if (var7.field6516[4] != null) {
                           class466.method3485(var7.field6516[4], 1004, 0, true, -1, false, var7.field6501, false, true, -1, (long)var6.field7078.field6786, (long)var6.field7078.field6786, var7.field6481);
                        }

                        if (var7.field6516[3] != null) {
                           class466.method3485(var7.field6516[3], 1002, 0, true, -1, false, var7.field6501, false, true, -1, (long)var6.field7078.field6786, (long)var6.field7078.field6786, var7.field6481);
                        }

                        if (var7.field6516[2] != null) {
                           class466.method3485(var7.field6516[2], 1008, 0, true, -1, false, var7.field6501, false, true, -1, (long)var6.field7078.field6786, (long)var6.field7078.field6786, var7.field6481);
                        }

                        if (var7.field6516[1] != null) {
                           class466.method3485(var7.field6516[1], 1012, 0, true, -1, false, var7.field6501, false, true, -1, (long)var6.field7078.field6786, (long)var6.field7078.field6786, var7.field6481);
                        }

                        if (var7.field6516[0] != null) {
                           class466.method3485(var7.field6516[0], 1006, 0, true, -1, false, var7.field6501, false, true, -1, (long)var6.field7078.field6786, (long)var6.field7078.field6786, var7.field6481);
                        }
                     }

                     if (!var6.field7078.field6779) {
                        var6.field7078.field6779 = true;
                        class265.method2025(class472.field7056, var6.field7078.field6786, var7.field6481);
                     }

                     if (var6.field7078.field6779) {
                        class265.method2025(class554.field8213, var6.field7078.field6786, var7.field6481);
                     }
                  }

                  var6 = (class476)class100.field1216.method4059((byte)126);
               } while(var6 != null);

            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field3182[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(Ljj;B)Lq;",
      line = 193
   )
   public static final class450 method1842(class128 arg0, byte arg1) {
      try {
         ++field3181;
         int var2 = arg0.method1038((byte)-107);
         class590 var3 = class721.method5223(-103)[arg0.method1104(255)];
         if (arg1 >= -96) {
            method1840(true, 58, (byte[])null, -54);
         }

         class378 var4 = class168.method1358(0)[arg0.method1104(255)];
         int var5 = arg0.method1066(32767);
         int var6 = arg0.method1066(32767);
         return new class450(var2, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3182[6] + (arg0 != null ? field3182[2] : field3182[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(I)V",
      line = 222
   )
   public static final void method1843(int arg0) {
      try {
         ++field3167;
         class639.field9316 = -1;
         class134.field1686 = arg0;
         class637.field9260 = -1;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3182[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIIII)V",
      line = 231
   )
   public class246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      try {
         this.field3169 = new int[4];
         this.field3179 = (byte)arg0;
         this.field3165 = (byte)arg1;
         this.field3180 = new int[4];
         this.field3177 = new int[4];
         this.field3177[3] = arg5;
         this.field3177[1] = arg3;
         this.field3177[0] = arg2;
         this.field3177[2] = arg4;
         this.field3169[0] = arg6;
         this.field3169[3] = arg9;
         this.field3169[2] = arg8;
         this.field3169[1] = arg7;
         this.field3180[0] = arg10;
         this.field3170 = (short)(arg2 >> class459.field6950);
         this.field3180[3] = arg13;
         this.field3180[2] = arg12;
         this.field3180[1] = arg11;
         this.field3171 = (short)(arg4 >> class459.field6950);
         this.field3173 = (short)(arg10 >> class459.field6950);
         this.field3174 = new short[4];
         this.field3168 = new short[4];
         this.field3172 = new short[4];
         this.field3175 = (short)(arg12 >> class459.field6950);
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field3182[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1844(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1845(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
