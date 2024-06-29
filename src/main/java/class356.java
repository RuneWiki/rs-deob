import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class356 {
   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "Ldw;"
   )
   public class748 field5398 = new class748(20);
   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "Ldw;"
   )
   private class748 field5402 = new class748(64);
   @OriginalMember(
      owner = "client!jg",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field5392;
   @OriginalMember(
      owner = "client!jg",
      name = "n",
      descriptor = "Leaa;"
   )
   public class526 field5391;
   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5403 = new String[]{method2786(method2785("\u0002v\u001a\t7")), method2786(method2785("\u0002v\u001a\u00067")), method2786(method2785("\u0002v\u001a\u00037")), method2786(method2785("\u0002v\u001a\u00047")), method2786(method2785("\u0006dX-")), method2786(method2785("\u0013?\u001aob")), method2786(method2785("\u0002v\u001a\u00057")), method2786(method2785("\u0002v\u001a\u00027")), method2786(method2785("\u0002v\u001a\u00007")), method2786(method2785("\u0002v\u001a\u00077")), method2786(method2785("\u0002v\u001a}v\u0006x@\u007f7"))};
   @OriginalMember(
      owner = "client!jg",
      name = "h",
      descriptor = "Lum;"
   )
   public static class550 field5394 = new class550();
   @OriginalMember(
      owner = "client!jg",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field5401 = new int[2048];
   @OriginalMember(
      owner = "client!jg",
      name = "m",
      descriptor = "I"
   )
   public static int field5389;
   @OriginalMember(
      owner = "client!jg",
      name = "d",
      descriptor = "I"
   )
   public static int field5393;
   @OriginalMember(
      owner = "client!jg",
      name = "l",
      descriptor = "I"
   )
   public static int field5395;
   @OriginalMember(
      owner = "client!jg",
      name = "c",
      descriptor = "I"
   )
   public static int field5396;
   @OriginalMember(
      owner = "client!jg",
      name = "j",
      descriptor = "I"
   )
   public static int field5397;
   @OriginalMember(
      owner = "client!jg",
      name = "e",
      descriptor = "I"
   )
   public static int field5399;
   @OriginalMember(
      owner = "client!jg",
      name = "f",
      descriptor = "I"
   )
   public static int field5400;
   @OriginalMember(
      owner = "client!jg",
      name = "i",
      descriptor = "Leaa;"
   )
   public static class526 field5390;

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(IZ)V",
      line = 4
   )
   public final void method2777(int arg0, boolean arg1) {
      try {
         class748 var3 = this.field5402;
         synchronized(this.field5402) {
            this.field5402.method5453(arg0, false);
         }

         if (arg1) {
            ++field5393;
            class748 var4 = this.field5398;
            synchronized(this.field5398) {
               this.field5398.method5453(arg0, false);
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5403[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(ILka;BII)Lcka;",
      line = 21
   )
   public static final class185 method2778(int arg0, class497 arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field5399;
         if (arg2 <= 121) {
            method2783(92);
         }

         return arg1 == null ? null : new class185(arg3, arg0, arg4, arg1.method302(), arg1.method344(), arg1.method306(), arg1.method339(), arg1.method304(), arg1.method342(), arg1.method300());
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5403[3] + arg0 + ',' + (arg1 != null ? field5403[5] : field5403[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(IIIILha;I)V",
      line = 37
   )
   public static final void method2779(int arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5) {
      int var6 = client.field4530;

      try {
         if (arg0 != -1996488705) {
            method2778(-81, (class497)null, (byte)-52, 9, -127);
         }

         arg4.method554(arg2, arg1, arg2 + arg3, arg1 + arg5);
         ++field5400;
         arg4.method609(1, arg5, arg2, arg3, arg1, -16777216);
         if (~class180.field2223 <= -101) {
            int var8;
            int var9;
            label89: {
               float var7 = (float)class329.field4687 / (float)class329.field4706;
               var8 = arg3;
               var9 = arg5;
               if (var7 < 1.0F) {
                  var9 = (int)((float)arg3 * var7);
                  if (var6 == 0) {
                     break label89;
                  }
               }

               var8 = (int)((float)arg5 / var7);
            }

            int var24 = (arg5 - var9) / 2 + arg1;
            int var25 = (-var8 + arg3) / 2 + arg2;
            if (class235.field2989 == null || arg3 != class235.field2989.method1965() || ~arg5 != ~class235.field2989.method1967()) {
               class329.method2495(class329.field4688, class329.field4696 - -class329.field4687, class329.field4706 + class329.field4688, class329.field4696, var25, var24, var25 + var8, var24 + var9);
               class329.method2476(arg4);
               class235.field2989 = arg4.method602(var25, var24, var8, var9, false);
            }

            class235.field2989.method3035(var25, var24);
            int var10 = class112.field1357 * var8 / class329.field4706;
            int var11 = class749.field11106 * var9 / class329.field4687;
            int var12 = class767.field11257 * var8 / class329.field4706 + var25;
            int var13 = var24 - class177.field2184 * var9 / class329.field4687 + -var11 + var9;
            int var14 = -1996554240;
            if (class489.field7224 == class180.field2219) {
               var14 = -1996488705;
            }

            arg4.method645(var12, var13, var10, var11, var14, 1);
            arg4.method553(var12, var13, var10, var11, var14, 0);
            if (~class705.field10553 < -1) {
               int var15;
               label57: {
                  if (class283.field3936 > 50) {
                     var15 = -(class283.field3936 * 5) + 500;
                     if (var6 == 0) {
                        break label57;
                     }
                  }

                  var15 = class283.field3936 * 5;
               }

               class446 var16 = (class446)class329.field4676.method4071((byte)127);
               if (var6 != 0 || var16 != null) {
                  do {
                     class426 var17 = class329.field4666.method3293(27767, var16.field6786);
                     if (class402.method3086((byte)22, var17)) {
                        label101: {
                           if (~class379.field5799 == ~var16.field6786) {
                              int var18 = var16.field6780 * var8 / class329.field4706 + var25;
                              int var19 = var24 - -((-var16.field6777 + class329.field4687) * var9 / class329.field4687);
                              arg4.method609(1, 4, var18 - 2, 4, var19 + -2, 16776960 | var15 << 24);
                              if (var6 == 0) {
                                 break label101;
                              }
                           }

                           if (~class606.field8893 != 0 && ~class606.field8893 == ~var17.field6481) {
                              int var20 = var16.field6780 * var8 / class329.field4706 + var25;
                              int var21 = var24 - -((-var16.field6777 + class329.field4687) * var9 / class329.field4687);
                              arg4.method609(1, 4, var20 + -2, 4, var21 - 2, var15 << 24 | 16776960);
                           }
                        }
                     }

                     var16 = (class446)class329.field4676.method4059((byte)125);
                  } while(var16 != null);

               }
            }
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field5403[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5403[5] : field5403[4]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(B)V",
      line = 136
   )
   public final void method2780(byte arg0) {
      try {
         class748 var2 = this.field5402;
         synchronized(this.field5402) {
            this.field5402.method5445(697465426);
            if (arg0 <= 17) {
               this.field5391 = null;
            }
         }

         ++field5395;
         class748 var3 = this.field5398;
         synchronized(this.field5398) {
            this.field5398.method5445(697465426);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5403[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "(I)V",
      line = 153
   )
   public final void method2781(int arg0) {
      try {
         class748 var2 = this.field5402;
         synchronized(this.field5402) {
            this.field5402.method5451(arg0 ^ -1996488777);
         }

         ++field5396;
         if (arg0 == -1996488705) {
            class748 var3 = this.field5398;
            synchronized(this.field5398) {
               this.field5398.method5451(87);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5403[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "(IZ)Loga;",
      line = 169
   )
   public final class499 method2782(int arg0, boolean arg1) {
      try {
         ++field5397;
         class748 var3 = this.field5402;
         class499 var4;
         synchronized(this.field5402) {
            var4 = (class499)this.field5402.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field5392;
            byte[] var6;
            synchronized(this.field5392) {
               var6 = this.field5392.method3899(-47, arg0, 46);
            }

            class499 var7 = new class499();
            var7.field7409 = this;
            if (var6 != null) {
               var7.method3719((byte)-83, new class128(var6));
            }

            class748 var8 = this.field5402;
            synchronized(this.field5402) {
               if (!arg1) {
                  return null;
               } else {
                  this.field5402.method5455(-2049, var7, (long)arg0);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field5403[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(I)V",
      line = 212
   )
   public static void method2783(int arg0) {
      try {
         field5390 = null;
         if (arg0 >= -99) {
            method2779(-61, 124, -28, 77, (class66)null, 105);
         }

         field5401 = null;
         field5394 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5403[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(II)V",
      line = 224
   )
   public static final void method2784(int arg0, int arg1) {
      try {
         ++field5389;
         class403 var2 = class453.method3410((long)arg0, true, 10);
         var2.method3096((byte)61);
         if (arg1 >= -22) {
            field5394 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5403[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;Leaa;)V",
      line = 247
   )
   public class356(class24 arg0, int arg1, class526 arg2, class526 arg3) {
      try {
         this.field5392 = arg2;
         this.field5391 = arg3;
         this.field5392.method3875(0, 46);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5403[10] + (arg0 != null ? field5403[5] : field5403[4]) + ',' + arg1 + ',' + (arg2 != null ? field5403[5] : field5403[4]) + ',' + (arg3 != null ? field5403[5] : field5403[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2785(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2786(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
