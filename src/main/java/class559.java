import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class559 implements class160 {
   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "Ll;"
   )
   private class20 field7672;
   @OriginalMember(
      owner = "client!iba",
      name = "n",
      descriptor = "Lqh;"
   )
   private class74 field7667;
   @OriginalMember(
      owner = "client!iba",
      name = "k",
      descriptor = "Lqh;"
   )
   private class74 field7675;
   @OriginalMember(
      owner = "client!iba",
      name = "r",
      descriptor = "I"
   )
   private int field7671;
   @OriginalMember(
      owner = "client!iba",
      name = "p",
      descriptor = "[Ljg;"
   )
   private class359[] field7659;
   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7676 = new String[]{method4029(method4028("\"7e\u00043c")), method4029(method4028("\"7e\u00048c")), method4029(method4028("\"7e\u00042c")), method4029(method4028("\"7e\u0004<c")), method4029(method4028("\"7e\u00044c")), method4029(method4028("\"7e\u00045c")), method4029(method4028("\"7e\u00046c")), method4029(method4028("% hF")), method4029(method4028("0{*\u0004\r")), method4029(method4028("\"7e\u0004=c")), method4029(method4028("\"7e\u0004>c")), method4029(method4028("\"7e\u00047c")), method4029(method4028("\u001f\u0003>\n")), method4029(method4028("\"7e\u0004:c")), method4029(method4028("\"7e\u0004;c")), method4029(method4028("\"7e\u0004L\";m^Nc")), method4029(method4028("\"7e\u00049c")), method4029(method4028("\"7e\u00041c"))};
   @OriginalMember(
      owner = "client!iba",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field7673 = false;
   @OriginalMember(
      owner = "client!iba",
      name = "q",
      descriptor = "I"
   )
   public static int field7656;
   @OriginalMember(
      owner = "client!iba",
      name = "j",
      descriptor = "I"
   )
   public static int field7657;
   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "I"
   )
   public static int field7658;
   @OriginalMember(
      owner = "client!iba",
      name = "t",
      descriptor = "I"
   )
   public static int field7660;
   @OriginalMember(
      owner = "client!iba",
      name = "h",
      descriptor = "I"
   )
   public static int field7661;
   @OriginalMember(
      owner = "client!iba",
      name = "f",
      descriptor = "I"
   )
   public static int field7662;
   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "I"
   )
   public static int field7663;
   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "I"
   )
   public static int field7664;
   @OriginalMember(
      owner = "client!iba",
      name = "l",
      descriptor = "I"
   )
   public static int field7665;
   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "I"
   )
   public static int field7666;
   @OriginalMember(
      owner = "client!iba",
      name = "g",
      descriptor = "I"
   )
   public static int field7668;
   @OriginalMember(
      owner = "client!iba",
      name = "s",
      descriptor = "I"
   )
   public static int field7669;
   @OriginalMember(
      owner = "client!iba",
      name = "m",
      descriptor = "I"
   )
   public static int field7670;
   @OriginalMember(
      owner = "client!iba",
      name = "o",
      descriptor = "I"
   )
   public static int field7674;

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1294(int arg0) {
      try {
         ++field7674;
         if (arg0 != -13946) {
            this.method1292(77, false, (byte)106, -0.086411126F, -49, 56);
         }

         return this.field7671;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7676[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(II)Ljg;"
   )
   public final class359 method1293(int arg0, int arg1) {
      try {
         ++field7665;
         if (arg1 != -5150) {
            this.field7671 = -87;
         }

         return this.field7659[arg0];
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7676[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(II)Lim;"
   )
   private final class601 method4020(int arg0, int arg1) {
      try {
         ++field7666;
         class546 var3 = this.field7672.method176(false, (long)arg1);
         if (var3 != null) {
            return (class601)var3;
         } else if (arg0 > -53) {
            return null;
         } else {
            byte[] var4 = this.field7675.method733(arg1, (byte)-71);
            if (var4 == null) {
               return null;
            } else {
               class601 var5 = new class601(new class594(var4));
               this.field7672.method175(0, (long)arg1, var5);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7676[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(BI)Ljava/lang/String;"
   )
   public static final String method4021(byte arg0, int arg1) {
      try {
         ++field7664;
         if (arg0 != -27) {
            field7673 = false;
         }

         return (arg1 >> 24 & 255) + "." + (arg1 >> 16 & 255) + "." + ((65483 & arg1) >> 8) + "." + (arg1 & 255);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7676[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(IZIFIB)[I"
   )
   public final int[] method1291(int arg0, boolean arg1, int arg2, float arg3, int arg4, byte arg5) {
      try {
         if (arg5 != 63) {
            method4022((byte)-117);
         }

         ++field7670;
         return this.method4020(arg5 + -140, arg4).method4387(this.field7659[arg4].field5102, (byte)-128, (double)arg3, this.field7667, arg0, this, arg2);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7676[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4022(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Z)J"
   )
   public static final long method4023(boolean arg0) {
      try {
         if (arg0) {
            field7673 = false;
         }

         ++field7668;
         return class770.field11094.method1465(4096);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7676[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(FZIIII)[F"
   )
   public final float[] method1290(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg2 <= 44) {
            this.field7667 = null;
         }

         ++field7669;
         return this.method4020(-88, arg4).method4389(arg5, this, this.field7659[arg4].field5102, (byte)-94, arg3, this.field7667);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7676[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method4024(int arg0, int arg1) {
      try {
         if (arg1 == 0) {
            ++field7657;
            class446 var2 = class635.method4607(121, (long)arg0, 16);
            var2.method3312(-115);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7676[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(ZLjava/lang/String;)I"
   )
   public static final int method4025(boolean arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         if (!arg0) {
            return 39;
         } else {
            ++field7660;
            if (arg1 == null) {
               return -1;
            } else {
               int var3 = 0;
               if (var2) {
                  if (arg1.equalsIgnoreCase(class125.field1560[var3])) {
                     return var3;
                  }

                  ++var3;
               }

               while(true) {
                  while(class209.field2582 > var3) {
                     if (arg1.equalsIgnoreCase(class125.field1560[var3])) {
                        return var3;
                     }

                     ++var3;
                  }

                  if (!var2) {
                     return -1;
                  }

                  if (-1 != 0) {
                     return var3;
                  }

                  ++var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7676[9] + arg0 + ',' + (arg1 != null ? field7676[8] : field7676[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method4026(int arg0, int arg1, byte arg2) {
      boolean var3 = client.field4273;

      try {
         ++field7662;
         int var4 = 0;
         if (arg2 != 108) {
            method4021((byte)99, -3);
            if (var3) {
               var4 = var4 << 1 | 1 & arg1;
               arg1 >>>= 1;
               --arg0;
            }
         }

         while(true) {
            while(arg0 > 0) {
               var4 = var4 << 1 | 1 & arg1;
               arg1 >>>= 1;
               --arg0;
            }

            if (!var3) {
               return var4;
            }

            arg1 = var4;
            --arg0;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7676[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(BI)Z"
   )
   public final boolean method1289(byte arg0, int arg1) {
      try {
         ++field7658;
         if (arg0 >= -45) {
            this.field7659 = null;
         }

         class601 var3 = this.method4020(-110, arg1);
         return var3 != null && var3.method4385(this.field7667, this, (byte)65);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7676[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(IZBFII)[I"
   )
   public final int[] method1292(int arg0, boolean arg1, byte arg2, float arg3, int arg4, int arg5) {
      try {
         ++field7656;
         if (arg2 != 124) {
            method4026(27, -42, (byte)13);
         }

         return this.method4020(-70, arg5).method4386(this, this.field7667, arg1, 85, arg0, this.field7659[arg5].field5102, (double)arg3, arg4);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7676[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "([Leb;II)V"
   )
   public static final void method4027(class657[] param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iba",
      name = "<init>",
      descriptor = "(Lqh;Lqh;Lqh;)V"
   )
   public class559(class74 param1, class74 param2, class74 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4028(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4029(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
