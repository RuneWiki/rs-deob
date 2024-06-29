import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class327 extends class161 {
   @OriginalMember(
      owner = "client!lk",
      name = "q",
      descriptor = "I"
   )
   private int field4852;
   @OriginalMember(
      owner = "client!lk",
      name = "D",
      descriptor = "I"
   )
   private int field4851;
   @OriginalMember(
      owner = "client!lk",
      name = "G",
      descriptor = "I"
   )
   private int field4862;
   @OriginalMember(
      owner = "client!lk",
      name = "B",
      descriptor = "I"
   )
   private int field4865;
   @OriginalMember(
      owner = "client!lk",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4868 = new String[]{method2628(method2627("wA<E;")), method2628(method2627("hIs\u007fv;Gsf}")), method2628(method2627("s_ti~zD")), method2628(method2627("wA<F;")), method2628(method2627("wA<I;")), method2628(method2627("wA<G;")), method2628(method2627("`\u0004<!n")), method2628(method2627("u_~c")), method2628(method2627("wA<N;")), method2628(method2627("wA<3zuCf1;")), method2628(method2627("wA<M;")), method2628(method2627("wA<L;")), method2628(method2627("wA<J;")), method2628(method2627("wA<K;")), method2628(method2627("wA<H;"))};
   @OriginalMember(
      owner = "client!lk",
      name = "F",
      descriptor = "I"
   )
   public static int field4859 = 0;
   @OriginalMember(
      owner = "client!lk",
      name = "A",
      descriptor = "Lbba;"
   )
   public static class801 field4856 = new class801();
   @OriginalMember(
      owner = "client!lk",
      name = "p",
      descriptor = "I"
   )
   private int field4847;
   @OriginalMember(
      owner = "client!lk",
      name = "u",
      descriptor = "I"
   )
   public static int field4848;
   @OriginalMember(
      owner = "client!lk",
      name = "v",
      descriptor = "I"
   )
   public static int field4849;
   @OriginalMember(
      owner = "client!lk",
      name = "E",
      descriptor = "I"
   )
   public static int field4850;
   @OriginalMember(
      owner = "client!lk",
      name = "s",
      descriptor = "I"
   )
   public static int field4853;
   @OriginalMember(
      owner = "client!lk",
      name = "r",
      descriptor = "I"
   )
   public static int field4854;
   @OriginalMember(
      owner = "client!lk",
      name = "t",
      descriptor = "I"
   )
   private int field4858;
   @OriginalMember(
      owner = "client!lk",
      name = "C",
      descriptor = "I"
   )
   private int field4860;
   @OriginalMember(
      owner = "client!lk",
      name = "w",
      descriptor = "I"
   )
   public static int field4861;
   @OriginalMember(
      owner = "client!lk",
      name = "y",
      descriptor = "I"
   )
   public static int field4863;
   @OriginalMember(
      owner = "client!lk",
      name = "x",
      descriptor = "I"
   )
   public static int field4864;
   @OriginalMember(
      owner = "client!lk",
      name = "n",
      descriptor = "I"
   )
   public static int field4866;
   @OriginalMember(
      owner = "client!lk",
      name = "o",
      descriptor = "I"
   )
   private int field4867;
   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "Lsa;"
   )
   public static class39 field4855;
   @OriginalMember(
      owner = "client!lk",
      name = "m",
      descriptor = "[B"
   )
   private byte[] field4857;

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2621(byte arg0) {
      try {
         field4856 = null;
         field4855 = null;
         int var1 = -56 / ((-30 - arg0) / 49);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4868[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ILtea;)Ljava/lang/String;"
   )
   public static final String method2622(int arg0, class272 arg1) {
      try {
         ++field4848;
         if (arg0 != -8744) {
            method2625(-86);
         }

         if (arg1.field4154 != null && arg1.field4154.length() != 0) {
            return arg1.field4152 != null && arg1.field4152.length() > 0 ? arg1.field4162 + class765.field10935.method5512(-2, class777.field11340) + arg1.field4152 + class765.field10935.method5512(arg0 ^ 8742, class777.field11340) + arg1.field4154 : arg1.field4162 + class765.field10935.method5512(-2, class777.field11340) + arg1.field4154;
         } else {
            return arg1.field4152 != null && arg1.field4152.length() > 0 ? arg1.field4162 + class765.field10935.method5512(-2, class777.field11340) + arg1.field4152 : arg1.field4162;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4868[5] + arg0 + ',' + (arg1 != null ? field4868[6] : field4868[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1520(boolean arg0) {
      try {
         if (arg0) {
            this.field4847 = 32;
         }

         this.field4867 = 0;
         this.field4858 = 0;
         ++field4854;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4868[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2623(int arg0) {
      try {
         ++class459.field6693;
         ++field4850;
         class381 var1 = class801.method5775(class325.field4832, 0, class745.field10605.field3718);
         var1.field5570.method656((byte)-117, class40.method477(false));
         var1.field5570.method653(class557.field7909, -63);
         var1.field5570.method653(class140.field2243, -86);
         var1.field5570.method656((byte)-126, class476.field6870.field9146.method4480(-92));
         if (arg0 != 2) {
            method2621((byte)13);
         }

         class745.field10605.method2111(14024, var1);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4868[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2624(int arg0, int arg1, int arg2) {
      try {
         ++field4853;
         class111 var3 = class796.method5734(1, (long)arg2, (byte)-121);
         var3.method1087(0);
         var3.field1740 = arg1;
         if (arg0 != 8712) {
            method2622(89, (class272)null);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4868[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method2625(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method1519(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            method2622(-3, (class272)null);
         }

         ++field4863;
         if (arg1 == 0) {
            this.field4847 = -(arg2 >= 0 ? arg2 : -arg2) + this.field4852;
            this.field4847 = this.field4847 * this.field4847 >> 12;
            this.field4860 = 4096;
            this.field4867 = this.field4847;
         } else {
            label35: {
               this.field4860 = this.field4851 * this.field4847 >> 12;
               if (~this.field4860 > -1) {
                  this.field4860 = 0;
                  if (!client.field10022) {
                     break label35;
                  }
               }

               if (~this.field4860 < -4097) {
                  this.field4860 = 4096;
               }
            }

            this.field4847 = -(arg2 >= 0 ? arg2 : -arg2) + this.field4852;
            this.field4847 = this.field4847 * this.field4847 >> 12;
            this.field4847 = this.field4860 * this.field4847 >> 12;
            this.field4867 += this.field4865 * this.field4847 >> 12;
            this.field4865 = this.field4865 * this.field4862 >> 12;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4868[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "<init>",
      descriptor = "(IIIIIFFF)V"
   )
   public class327(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field4852 = (int)(arg6 * 4096.0F);
         this.field4851 = (int)(arg7 * 4096.0F);
         this.field4865 = this.field4862 = (int)(Math.pow(0.5D, (double)(-arg5)) * 4096.0D);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field4868[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(IIB)V"
   )
   public void method1011(int arg0, int arg1, byte arg2) {
      try {
         ++field4866;
         this.field4857[arg0] = arg2;
         if (arg1 < 3) {
            this.method1520(true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4868[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2626(byte arg0) {
      try {
         ++field4861;
         if (!class299.field4479) {
            if (arg0 < 118) {
               method2624(0, -84, -63);
            }

            class411.field6028 = true;
            class299.field4479 = true;
            class662.field9329 += (-class662.field9329 + -24.0F) / 2.0F;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4868[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1517(int arg0) {
      try {
         this.field4867 >>= 4;
         this.field4865 = this.field4862;
         if (arg0 != -164086452) {
            this.method1520(false);
         }

         label23: {
            ++field4864;
            if (this.field4867 >= 0) {
               if (~this.field4867 >= -256) {
                  break label23;
               }

               this.field4867 = 255;
               if (!client.field10022) {
                  break label23;
               }
            }

            this.field4867 = 0;
         }

         this.method1011(this.field4858++, 114, (byte)this.field4867);
         this.field4867 = 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4868[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2627(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2628(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
