import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class323 {
   @OriginalMember(
      owner = "client!ca",
      name = "l",
      descriptor = "Ltv;"
   )
   private class590 field4309 = new class590(64);
   @OriginalMember(
      owner = "client!ca",
      name = "k",
      descriptor = "Ltv;"
   )
   public class590 field4317 = new class590(50);
   @OriginalMember(
      owner = "client!ca",
      name = "d",
      descriptor = "Ltv;"
   )
   public class590 field4318 = new class590(5);
   @OriginalMember(
      owner = "client!ca",
      name = "j",
      descriptor = "Lqh;"
   )
   public class74 field4314;
   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "Z"
   )
   public boolean field4305;
   @OriginalMember(
      owner = "client!ca",
      name = "n",
      descriptor = "Lqh;"
   )
   private class74 field4313;
   @OriginalMember(
      owner = "client!ca",
      name = "r",
      descriptor = "Lnc;"
   )
   public class26 field4303;
   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4320 = new String[]{method2439(method2438("\rCXWf")), method2439(method2438("\rCXXf")), method2439(method2438("\rCXSf")), method2439(method2438("\rCXRf")), method2439(method2438("\rCXVf")), method2439(method2438("\u0000W\u001a}")), method2439(method2438("\u0015\fX?3")), method2439(method2438("\rCX[f")), method2439(method2438("\rCX-'\u0000K\u0002/f")), method2439(method2438("\rCXUf")), method2439(method2438("\rCXTf")), method2439(method2438("\rCXYf")), method2439(method2438("\rCXPf")), method2439(method2438("\rCXZf"))};
   @OriginalMember(
      owner = "client!ca",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4301 = new String[]{method2439(method2438("=W\u0018")), method2439(method2438("#M\u0018")), method2439(method2438(":W\u0013")), method2439(method2438("9G\u0012")), method2439(method2438(":J\u0003")), method2439(method2438("(P\u001f")), method2439(method2438("=C\u0002"))};
   @OriginalMember(
      owner = "client!ca",
      name = "f",
      descriptor = "I"
   )
   public static int field4302;
   @OriginalMember(
      owner = "client!ca",
      name = "q",
      descriptor = "I"
   )
   public static int field4304;
   @OriginalMember(
      owner = "client!ca",
      name = "o",
      descriptor = "I"
   )
   public static int field4306;
   @OriginalMember(
      owner = "client!ca",
      name = "i",
      descriptor = "I"
   )
   public static int field4307;
   @OriginalMember(
      owner = "client!ca",
      name = "m",
      descriptor = "I"
   )
   public static int field4308;
   @OriginalMember(
      owner = "client!ca",
      name = "p",
      descriptor = "I"
   )
   public static int field4310;
   @OriginalMember(
      owner = "client!ca",
      name = "e",
      descriptor = "I"
   )
   public static int field4311;
   @OriginalMember(
      owner = "client!ca",
      name = "g",
      descriptor = "I"
   )
   public static int field4312;
   @OriginalMember(
      owner = "client!ca",
      name = "s",
      descriptor = "I"
   )
   public static int field4315;
   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "I"
   )
   public static int field4316;
   @OriginalMember(
      owner = "client!ca",
      name = "c",
      descriptor = "I"
   )
   public int field4319;

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(ILwm;)Lkaa;"
   )
   public static final class51 method2427(int arg0, class594 arg1) {
      try {
         if (arg0 > -33) {
            return null;
         } else {
            ++field4302;
            int var2 = arg1.method4280(-19104);
            return new class51(var2);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4320[7] + arg0 + ',' + (arg1 != null ? field4320[6] : field4320[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(II)Lpa;"
   )
   public final class392 method2428(int arg0, int arg1) {
      try {
         ++field4306;
         if (arg0 != -24138) {
            method2437((byte)5);
         }

         class590 var3 = this.field4309;
         class392 var4;
         synchronized(this.field4309) {
            var4 = (class392)this.field4309.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field4313;
            byte[] var6;
            synchronized(this.field4313) {
               var6 = this.field4313.method732(class18.method161(arg1, 4095), class21.method181(arg1, 2), (byte)82);
            }

            class392 var7 = new class392();
            var7.field5535 = arg1;
            var7.field5514 = this;
            if (var6 != null) {
               var7.method2980(false, new class594(var6));
            }

            var7.method2988(-11886);
            class590 var8 = this.field4309;
            synchronized(this.field4309) {
               this.field4309.method4238(27, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4320[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2429(int arg0, byte arg1) {
      try {
         this.field4319 = arg0;
         if (arg1 != -21) {
            this.field4305 = false;
         }

         ++field4312;
         class590 var3 = this.field4317;
         synchronized(this.field4317) {
            this.field4317.method4245(true);
         }

         class590 var4 = this.field4318;
         synchronized(this.field4318) {
            this.field4318.method4245(true);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4320[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2430(byte arg0) {
      try {
         if (arg0 >= -112) {
            method2433((byte)-85);
         }

         ++field4307;
         class590 var2 = this.field4309;
         synchronized(this.field4309) {
            this.field4309.method4245(true);
         }

         class590 var3 = this.field4317;
         synchronized(this.field4317) {
            this.field4317.method4245(true);
         }

         class590 var4 = this.field4318;
         synchronized(this.field4318) {
            this.field4318.method4245(true);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4320[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(IIIZ)I"
   )
   public static final int method2431(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         if (arg0 <= 126) {
            field4301 = null;
         }

         ++field4311;
         class784 var4 = class655.method4729(arg3, arg1, (byte)-26);
         if (var4 == null) {
            return 0;
         } else {
            return ~arg2 <= -1 && var4.field11456.length > arg2 ? var4.field11456[arg2] : 0;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4320[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2432(int arg0, int arg1) {
      try {
         class590 var3 = this.field4309;
         synchronized(this.field4309) {
            this.field4309.method4234(2, arg1);
         }

         ++field4310;
         class590 var4 = this.field4317;
         synchronized(this.field4317) {
            this.field4317.method4234(arg0 ^ 8754, arg1);
         }

         class590 var5 = this.field4318;
         synchronized(this.field4318) {
            if (arg0 == 8752) {
               this.field4318.method4234(arg0 + -8750, arg1);
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field4320[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2433(byte arg0) {
      try {
         class252.field3198.method557((0.7F + 0.1F * (float)class674.field9907.field8452.method844((byte)-73)) * class114.field1411);
         ++field4315;
         class252.field3198.method509(class365.field5152, class592.field8184, class663.field9458, (float)(class71.field879 << 2), (float)(class469.field6500 << 2), (float)(class188.field2300 << 2));
         if (arg0 < 93) {
            field4301 = null;
         }

         class252.field3198.method556(class427.field5963);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4320[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2434(int arg0) {
      try {
         ++field4308;
         class590 var2 = this.field4309;
         synchronized(this.field4309) {
            if (arg0 != 1134059266) {
               this.method2435(true, true);
            }

            this.field4309.method4244(true);
         }

         class590 var3 = this.field4317;
         synchronized(this.field4317) {
            this.field4317.method4244(true);
         }

         class590 var4 = this.field4318;
         synchronized(this.field4318) {
            this.field4318.method4244(true);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4320[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method2435(boolean arg0, boolean arg1) {
      try {
         ++field4304;
         if (!arg1 != !this.field4305) {
            if (!arg0) {
               this.field4309 = null;
            }

            this.field4305 = arg1;
            this.method2430((byte)-128);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4320[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2436(int arg0) {
      try {
         class590 var2 = this.field4317;
         synchronized(this.field4317) {
            this.field4317.method4245(true);
         }

         ++field4316;
         class590 var3 = this.field4318;
         synchronized(this.field4318) {
            if (arg0 == 5) {
               this.field4318.method4245(true);
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4320[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2437(byte arg0) {
      try {
         field4301 = null;
         if (arg0 < 18) {
            method2431(54, 89, 88, true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4320[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "<init>",
      descriptor = "(Lnc;IZLqh;Lqh;)V"
   )
   public class323(class26 arg0, int arg1, boolean arg2, class74 arg3, class74 arg4) {
      try {
         this.field4314 = arg4;
         this.field4305 = arg2;
         this.field4313 = arg3;
         this.field4303 = arg0;
         if (this.field4313 != null) {
            int var6 = this.field4313.method719(true) + -1;
            this.field4313.method727(var6, -32767);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4320[8] + (arg0 != null ? field4320[6] : field4320[5]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4320[6] : field4320[5]) + ',' + (arg4 != null ? field4320[6] : field4320[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2438(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2439(char[] arg0) {
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
            var10005 = 34;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
