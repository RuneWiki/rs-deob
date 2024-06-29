import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class401 implements class609 {
   @OriginalMember(
      owner = "client!ln",
      name = "h",
      descriptor = "Ldia;"
   )
   private class245 field5624 = new class245(128);
   @OriginalMember(
      owner = "client!ln",
      name = "c",
      descriptor = "[I"
   )
   public int[] field5636;
   @OriginalMember(
      owner = "client!ln",
      name = "e",
      descriptor = "[I"
   )
   private int[] field5634;
   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5637 = new String[]{method3042(method3041("Xtu4\u001b")), method3042(method3041("Xtu9\u001b")), method3042(method3041("Xtu1\u001b")), method3042(method3041("Xtu5\u001b")), method3042(method3041("Xtu7\u001b")), method3042(method3041("Xtu>\u001b")), method3042(method3041("Xtu?\u001b")), method3042(method3041("Xtu:\u001b")), method3042(method3041("Xtu@ZZs/B\u001b")), method3042(method3041("Zo7\u0010")), method3042(method3041("Xtu0\u001b")), method3042(method3041("O4uRN")), method3042(method3041("Xtu;\u001b")), method3042(method3041("Xtu=\u001b")), method3042(method3041("Xtu8\u001b"))};
   @OriginalMember(
      owner = "client!ln",
      name = "d",
      descriptor = "[C"
   )
   private static char[] field5630 = new char[64];
   @OriginalMember(
      owner = "client!ln",
      name = "g",
      descriptor = "I"
   )
   public static int field5622;
   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "I"
   )
   public static int field5623;
   @OriginalMember(
      owner = "client!ln",
      name = "i",
      descriptor = "I"
   )
   public static int field5625;
   @OriginalMember(
      owner = "client!ln",
      name = "l",
      descriptor = "I"
   )
   public static int field5626;
   @OriginalMember(
      owner = "client!ln",
      name = "o",
      descriptor = "I"
   )
   public static int field5627;
   @OriginalMember(
      owner = "client!ln",
      name = "f",
      descriptor = "I"
   )
   public static int field5628;
   @OriginalMember(
      owner = "client!ln",
      name = "j",
      descriptor = "I"
   )
   public static int field5629;
   @OriginalMember(
      owner = "client!ln",
      name = "m",
      descriptor = "I"
   )
   public static int field5631;
   @OriginalMember(
      owner = "client!ln",
      name = "k",
      descriptor = "I"
   )
   public static int field5632;
   @OriginalMember(
      owner = "client!ln",
      name = "n",
      descriptor = "I"
   )
   public static int field5633;
   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "I"
   )
   public static int field5635;

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         label35: {
            ++field5632;
            if (class265.field3451 > arg1 || class663.field9442 < arg2 || ~class478.field6604 < ~arg5 || class313.field4171 < arg0) {
               class470.method3449(arg2, (byte)45, arg1, arg4, arg0, arg5);
               if (!client.field4273) {
                  break label35;
               }
            }

            class80.method777(arg2, arg4, arg5, arg0, -112, arg1);
         }

         if (arg3 != -1) {
            field5630 = null;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5637[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method3029(int arg0, byte arg1, int arg2) {
      try {
         ++field5626;
         class305 var4 = class402.field5645.method2784(arg2, (byte)65);
         int var5 = var4.field4049;
         int var6 = var4.field4044;
         int var7 = var4.field4047;
         int var8 = class225.field2817[var7 - var6];
         if (arg0 < 0 || ~var8 > ~arg0) {
            arg0 = 0;
         }

         if (arg1 >= -70) {
            this.field5624 = null;
         }

         int var9 = var8 << var6;
         this.method3030((byte)125, var5, this.field5636[var5] & ~var9 | var9 & arg0 << var6);
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field5637[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method3030(byte arg0, int arg1, int arg2) {
      try {
         label20: {
            ++field5629;
            this.field5636[arg1] = arg2;
            class366 var4 = (class366)this.field5624.method1839(15, (long)arg1);
            if (var4 != null) {
               var4.field5159 = 500L + class792.method5708(-25005);
               if (!client.field4273) {
                  break label20;
               }
            }

            class366 var5 = new class366(class792.method5708(-25005) - -500L);
            this.field5624.method1841((long)arg1, true, var5);
         }

         if (arg0 <= 124) {
            this.method3032(-14, -97);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5637[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method3031(class65 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method3032(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            return -25;
         } else {
            ++field5625;
            return this.field5636[arg0];
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5637[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(III)Liia;"
   )
   public static final class95 method3033(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      return var3 == null ? null : var3.field2824;
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method3034(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            method3031((class65)null, (byte)65);
         }

         ++field5627;
         class305 var4 = class402.field5645.method2784(arg2, (byte)65);
         int var5 = var4.field4049;
         int var6 = var4.field4044;
         int var7 = var4.field4047;
         int var8 = class225.field2817[-var6 + var7];
         if (~arg0 > -1 || var8 < arg0) {
            arg0 = 0;
         }

         int var9 = var8 << var6;
         this.method3036((byte)69, var5, this.field5634[var5] & ~var9 | var9 & arg0 << var6);
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field5637[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(ZB)V"
   )
   public static final void method3035(boolean arg0, byte arg1) {
      try {
         class674.field9907.method4407(class674.field9907.field8444, -2160, 0);
         ++field5622;
         class674.field9907.method4407(class674.field9907.field8458, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8427, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8421, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8424, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8436, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8461, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8423, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8445, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8443, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8448, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8447, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8457, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8450, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8468, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8429, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8430, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8435, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8469, -2160, 0);
         class721.method5244(11336);
         class674.field9907.method4407(class674.field9907.field8437, -2160, 2);
         class674.field9907.method4407(class674.field9907.field8440, -2160, 1);
         class493.method3579((byte)115);
         class300.method2261(15966);
         class343.field4915 = true;
         if (arg1 <= 62) {
            method3035(true, (byte)16);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5637[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(BII)V"
   )
   public final void method3036(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 >= 55) {
            ++field5623;
            this.field5634[arg1] = arg2;
            class366 var4 = (class366)this.field5624.method1839(107, (long)arg1);
            if (var4 != null) {
               if (~var4.field5159 != -4611686018427387906L) {
                  var4.field5159 = 4611686018427387904L | class792.method5708(-25005) - -500L;
                  return;
               }
            } else {
               class366 var5 = new class366(4611686018427387905L);
               this.field5624.method1841((long)arg1, true, var5);
            }

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5637[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method3037(int arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5628;
         long var4 = class792.method5708(arg0 + -34719);
         class366 var6 = arg1 ? (class366)this.field5624.method1850(0) : (class366)this.field5624.method1847(123);
         int var10000;
         if (var3) {
            long var10;
            var10000 = (var10 = var4 - (4611686018427387903L & var6.field5159)) == 0L ? 0 : (var10 < 0L ? -1 : 1);
         } else if (var6 == null) {
            var10000 = arg0;
            if (!var3) {
               if (arg0 != 9714) {
                  this.method3034(21, true, -36);
               }

               return -1;
            }
         } else {
            long var11;
            var10000 = (var11 = var4 - (4611686018427387903L & var6.field5159)) == 0L ? 0 : (var11 < 0L ? -1 : 1);
         }

         while(true) {
            if (var10000 > 0) {
               if (~(4611686018427387904L & var6.field5159) != -1L) {
                  int var7 = (int)var6.field6862;
                  this.field5636[var7] = this.field5634[var7];
                  var6.method3609(arg0 + -9592);
                  return var7;
               }

               var6.method3609(arg0 ^ 9625);
            }

            var6 = (class366)this.field5624.method1847(119);
            if (var6 == null) {
               var10000 = arg0;
               if (!var3) {
                  if (arg0 != 9714) {
                     this.method3034(21, true, -36);
                  }

                  return -1;
               }
            } else {
               long var12;
               var10000 = (var12 = var4 - (4611686018427387903L & var6.field5159)) == 0L ? 0 : (var12 < 0L ? -1 : 1);
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5637[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3038(boolean arg0) {
      try {
         field5630 = null;
         if (arg0) {
            field5630 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5637[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3039(byte arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 < -90) {
            int var3 = 0;
            if (!var2 && var3 >= class517.field7093.field6110) {
               ++field5631;
               this.field5624 = new class245(128);
            } else {
               do {
                  class682 var4 = class517.field7093.method3268(8, var3);
                  if (var4 != null && ~var4.field10005 == -1) {
                     this.field5634[var3] = 0;
                     this.field5636[var3] = 0;
                  }

                  ++var3;
               } while(var3 < class517.field7093.field6110);

               ++field5631;
               this.field5624 = new class245(128);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5637[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method3040(int arg0, int arg1) {
      try {
         ++field5635;
         class305 var3 = class402.field5645.method2784(arg0, (byte)65);
         int var4 = var3.field4049;
         if (arg1 != 0) {
            method3028(26, 5, 93, -103, -59, -127);
         }

         int var5 = var3.field4044;
         int var6 = var3.field4047;
         int var7 = class225.field2817[var6 - var5];
         return var7 & this.field5636[var4] >> var5;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5637[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "<init>",
      descriptor = "()V"
   )
   public class401() {
      try {
         this.field5636 = new int[class517.field7093.field6110];
         this.field5634 = new int[class517.field7093.field6110];
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5637[8] + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -27; ++var0) {
         field5630[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; ~var1 > -53; ++var1) {
         field5630[var1] = (char)(var1 + 97 + -26);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field5630[var2] = (char)(var2 + 48 + -52);
      }

      field5630[62] = '+';
      field5630[63] = '/';
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3041(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3042(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
