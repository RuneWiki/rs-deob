import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class318 {
   @OriginalMember(
      owner = "client!mu",
      name = "k",
      descriptor = "Ltv;"
   )
   private class590 field4242 = new class590(64);
   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "Ltv;"
   )
   public class590 field4251 = new class590(64);
   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "Lqh;"
   )
   public class74 field4239;
   @OriginalMember(
      owner = "client!mu",
      name = "o",
      descriptor = "Lqh;"
   )
   private class74 field4240;
   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4253 = new String[]{method2392(method2391("N|=bg")), method2392(method2391("['\u007f ")), method2392(method2391("X'=\u000e2")), method2392(method2391("X'=\n2")), method2392(method2391("X'=\u00052")), method2392(method2391("X'=\t2")), method2392(method2391("X'=\u000f2")), method2392(method2391("X'=\u00042")), method2392(method2391("X'=ps[;gr2")), method2392(method2391("X'=\r2")), method2392(method2391("X'=\u000b2")), method2392(method2391("X'=\u00062")), method2392(method2391("X'=\b2"))};
   @OriginalMember(
      owner = "client!mu",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field4241 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @OriginalMember(
      owner = "client!mu",
      name = "i",
      descriptor = "[F"
   )
   public static float[] field4243 = new float[4];
   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "I"
   )
   public static int field4238;
   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "I"
   )
   public static int field4244;
   @OriginalMember(
      owner = "client!mu",
      name = "h",
      descriptor = "I"
   )
   public static int field4245;
   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "I"
   )
   public static int field4246;
   @OriginalMember(
      owner = "client!mu",
      name = "m",
      descriptor = "I"
   )
   public static int field4247;
   @OriginalMember(
      owner = "client!mu",
      name = "l",
      descriptor = "I"
   )
   public static int field4248;
   @OriginalMember(
      owner = "client!mu",
      name = "n",
      descriptor = "I"
   )
   public static int field4249;
   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "I"
   )
   public static int field4250;
   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "I"
   )
   public static int field4252;

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2381(int arg0, int arg1, int arg2) {
      try {
         this.field4242 = new class590(arg0);
         if (arg2 <= 11) {
            method2383(94, true, 75);
         }

         ++field4248;
         this.field4251 = new class590(arg1);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4253[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2382(byte arg0) {
      try {
         if (arg0 < 34) {
            this.field4242 = null;
         }

         ++field4250;
         class590 var2 = this.field4242;
         synchronized(this.field4242) {
            this.field4242.method4244(true);
         }

         class590 var3 = this.field4251;
         synchronized(this.field4251) {
            this.field4251.method4244(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4253[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method2383(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            field4241 = null;
         }

         ++field4249;
         return class715.method5203(arg0, true, arg2) | (arg2 & 458752) != 0 || class625.method4545(arg2, arg0, (byte)-111);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4253[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2384(byte arg0) {
      try {
         if (arg0 >= -24) {
            field4243 = null;
         }

         field4243 = null;
         field4241 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4253[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method2385(int arg0) {
      try {
         if (arg0 < 19) {
            return true;
         } else {
            ++field4252;
            return class411.field5793;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4253[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IZ)Lvr;"
   )
   public final class146 method2386(int arg0, boolean arg1) {
      try {
         ++field4245;
         class590 var3 = this.field4242;
         class146 var4;
         synchronized(this.field4242) {
            var4 = (class146)this.field4242.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field4240;
            byte[] var6;
            synchronized(this.field4240) {
               var6 = this.field4240.method732(arg0, 34, (byte)54);
            }

            class146 var7 = new class146();
            var7.field1925 = this;
            if (var6 != null) {
               var7.method1237(new class594(var6), arg1);
            }

            if (!arg1) {
               this.field4251 = null;
            }

            class590 var8 = this.field4242;
            synchronized(this.field4242) {
               this.field4242.method4238(119, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4253[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2387(int arg0, int arg1) {
      try {
         class590 var3 = this.field4242;
         synchronized(this.field4242) {
            this.field4242.method4234(2, arg0);
         }

         if (arg1 != 34165) {
            this.method2387(70, -16);
         }

         ++field4247;
         class590 var4 = this.field4251;
         synchronized(this.field4251) {
            this.field4251.method4234(2, arg0);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4253[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Leb;IBIZ)V"
   )
   public static final void method2388(class657 arg0, int arg1, byte arg2, int arg3, boolean arg4) {
      boolean var5 = client.field4273;

      try {
         ++field4244;
         if (arg2 != -123) {
            field4243 = null;
         }

         int var6;
         label126: {
            var6 = arg0.field9379;
            if (arg0.field9303 == 0) {
               arg0.field9379 = arg0.field9272;
               if (!var5) {
                  break label126;
               }
            }

            if (arg0.field9303 != 1) {
               if (arg0.field9303 != 2) {
                  break label126;
               }

               arg0.field9379 = arg0.field9272 * arg1 >> 14;
               if (!var5) {
                  break label126;
               }
            }

            arg0.field9379 = -arg0.field9272 + arg1;
         }

         int var7;
         label109: {
            var7 = arg0.field9360;
            if (~arg0.field9312 != -1) {
               if (~arg0.field9312 == -2) {
                  arg0.field9360 = -arg0.field9277 + arg3;
                  if (!var5) {
                     break label109;
                  }
               }

               if (~arg0.field9312 != -3) {
                  break label109;
               }

               arg0.field9360 = arg0.field9277 * arg3 >> 14;
               if (!var5) {
                  break label109;
               }
            }

            arg0.field9360 = arg0.field9277;
         }

         if (arg0.field9303 == 4) {
            arg0.field9379 = arg0.field9360 * arg0.field9234 / arg0.field9374;
         }

         if (~arg0.field9312 == -5) {
            arg0.field9360 = arg0.field9379 * arg0.field9374 / arg0.field9234;
         }

         if (class92.field1233 && (client.method2396(arg0).field5875 != 0 || arg0.field9372 == 0)) {
            label135: {
               if (~arg0.field9360 <= -6 || ~arg0.field9379 <= -6) {
                  if (~arg0.field9360 >= -1) {
                     arg0.field9360 = 5;
                  }

                  if (~arg0.field9379 < -1) {
                     break label135;
                  }

                  arg0.field9379 = 5;
                  if (!var5) {
                     break label135;
                  }
               }

               arg0.field9379 = 5;
               arg0.field9360 = 5;
            }
         }

         if (class107.field1373 == arg0.field9209) {
            class726.field10630 = arg0;
         }

         if (arg4 && arg0.field9319 != null) {
            if (~arg0.field9379 != ~var6 || ~arg0.field9360 != ~var7) {
               class589 var8 = new class589();
               var8.field8110 = arg0;
               var8.field8116 = arg0.field9319;
               class426.field5956.method3859(2, var8);
            }

         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4253[2] + (arg0 != null ? field4253[0] : field4253[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2389(int arg0) {
      try {
         ++field4246;
         class590 var2 = this.field4242;
         synchronized(this.field4242) {
            if (arg0 != 64) {
               return;
            }

            this.field4242.method4245(true);
         }

         class590 var3 = this.field4251;
         synchronized(this.field4251) {
            this.field4251.method4245(true);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field4253[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(ILou;)I"
   )
   public static final int method2390(int arg0, class635 arg1) {
      try {
         ++field4238;
         if (class535.field7314 == arg1) {
            return 7681;
         } else if (class449.field6203 != arg1) {
            if (class581.field7982 == arg1) {
               return 34165;
            } else if (class59.field623 == arg1) {
               return 260;
            } else if (class767.field11065 == arg1) {
               return 34023;
            } else {
               if (arg0 != 8672) {
                  field4241 = null;
               }

               throw new IllegalArgumentException();
            }
         } else {
            return 8448;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4253[10] + arg0 + ',' + (arg1 != null ? field4253[0] : field4253[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "<init>",
      descriptor = "(Lnc;ILqh;Lqh;)V"
   )
   public class318(class26 arg0, int arg1, class74 arg2, class74 arg3) {
      try {
         this.field4239 = arg3;
         this.field4240 = arg2;
         this.field4240.method727(34, -32767);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4253[8] + (arg0 != null ? field4253[0] : field4253[1]) + ',' + arg1 + ',' + (arg2 != null ? field4253[0] : field4253[1]) + ',' + (arg3 != null ? field4253[0] : field4253[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
