import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class522 extends class555 {
   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7154 = new String[]{method3781(method3780("\u0015\tz~Z")), method3781(method3780("\u000bPz\u0019\u000f")), method3781(method3780("\u0000R8<")), method3781(method3780("\u000bPz\u0014\u000f")), method3781(method3780("\u000bPz\u0012\u000f")), method3781(method3780("\u000bPz\u0011\u000f")), method3781(method3780("\u000bPz\u0015\u000f")), method3781(method3780("\u000bPz\u0013\u000f")), method3781(method3780("\u000bPz\u0017\u000f")), method3781(method3780("\u000bPz\u0016\u000f")), method3781(method3780("\u000bPz\u0018\u000f"))};
   @OriginalMember(
      owner = "client!ew",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field7147 = null;
   @OriginalMember(
      owner = "client!ew",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field7145 = new int[]{2047, 16383, 65535};
   @OriginalMember(
      owner = "client!ew",
      name = "j",
      descriptor = "I"
   )
   public static int field7142;
   @OriginalMember(
      owner = "client!ew",
      name = "q",
      descriptor = "I"
   )
   public static int field7143;
   @OriginalMember(
      owner = "client!ew",
      name = "n",
      descriptor = "I"
   )
   public static int field7144;
   @OriginalMember(
      owner = "client!ew",
      name = "f",
      descriptor = "I"
   )
   public static int field7148;
   @OriginalMember(
      owner = "client!ew",
      name = "i",
      descriptor = "I"
   )
   public static int field7149;
   @OriginalMember(
      owner = "client!ew",
      name = "g",
      descriptor = "I"
   )
   public static int field7150;
   @OriginalMember(
      owner = "client!ew",
      name = "p",
      descriptor = "I"
   )
   public static int field7151;
   @OriginalMember(
      owner = "client!ew",
      name = "m",
      descriptor = "I"
   )
   public static int field7152;
   @OriginalMember(
      owner = "client!ew",
      name = "o",
      descriptor = "I"
   )
   public static int field7153;
   @OriginalMember(
      owner = "client!ew",
      name = "l",
      descriptor = "Ldha;"
   )
   public static class84 field7146;

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(ILvi;)V"
   )
   public static final void method3775(int arg0, class569 arg1) {
      try {
         boolean var2;
         label69: {
            ++field7150;
            var2 = false;
            if (class369.field5205 == arg1.field7828 || ~arg1.field7842 == 0 || ~arg1.field7758 != -1) {
               var2 = true;
               if (!client.field4273) {
                  break label69;
               }
            }

            class61 var3 = class392.field5479.method1477(1, arg1.field7842);
            if (var3.field669 || var3.field661[arg1.field7837] < arg1.field7769 + 1) {
               var2 = true;
            }
         }

         if (var2) {
            int var4 = -arg1.field7816 + arg1.field7828;
            int var5 = -arg1.field7816 + class369.field5205;
            int var6 = arg1.field7792 * 512 - -(arg1.method3060((byte)38) * 256);
            int var7 = arg1.field7797 * 512 + arg1.method3060((byte)38) * 256;
            int var8 = arg1.field7756 * 512 - -(arg1.method3060((byte)38) * 256);
            int var9 = arg1.field7834 * 512 + arg1.method3060((byte)38) * 256;
            arg1.field999 = ((-var5 + var4) * var6 + var5 * var8) / var4;
            arg1.field1003 = ((-var5 + var4) * var7 + var5 * var9) / var4;
         }

         arg1.field7849 = 0;
         if (~arg1.field7827 == -1) {
            arg1.method4077(8192, 1, false);
         }

         if (arg0 != 512) {
            method3777(-21);
         }

         if (arg1.field7827 == 1) {
            arg1.method4077(12288, 1, false);
         }

         if (arg1.field7827 == 2) {
            arg1.method4077(0, 1, false);
         }

         if (~arg1.field7827 == -4) {
            arg1.method4077(4096, 1, false);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field7154[1] + arg0 + ',' + (arg1 != null ? field7154[0] : field7154[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 != -13712) {
            method3777(104);
         }

         if (super.field7632 != 1 && super.field7632 != 0) {
            super.field7632 = this.method635(126);
         }

         ++field7153;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7154[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method3776(byte arg0) {
      try {
         ++field7143;
         return arg0 > -61 ? 68 : super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7154[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field7142;
         int var3 = -80 / ((12 - arg1) / 47);
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7154[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class522(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ew",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3777(int arg0) {
      try {
         field7145 = null;
         field7147 = null;
         field7146 = null;
         if (arg0 > -64) {
            method3779(true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7154[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method3778(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ew",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class522(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field7151;
         if (arg1 <= 36) {
            field7145 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7154[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3779(boolean arg0) {
      try {
         ++field7148;
         if (arg0) {
            class347.field4992.method4245(arg0);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7154[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 <= 124) {
            method3779(true);
         }

         ++field7144;
         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7154[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3780(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3781(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
