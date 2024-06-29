import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class331 {
   @OriginalMember(
      owner = "client!cd",
      name = "f",
      descriptor = "Ldh;"
   )
   public class338 field4745;
   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4751 = new String[]{method2517(method2516("\u007f0aD\b")), method2517(method2516("gza;]")), method2517(method2516("r!#y")), method2517(method2516("\u007f0aF\b")), method2517(method2516("\u007f0aT\b")), method2517(method2516("\u007f0aY\b")), method2517(method2516("\u007f0aP\b")), method2517(method2516("\u007f0aV\b")), method2517(method2516("\u007f0aQ\b")), method2517(method2516("\u007f0a)Ir=;+\b")), method2517(method2516("\u007f0aG\b")), method2517(method2516("\u007f0aR\b"))};
   @OriginalMember(
      owner = "client!cd",
      name = "m",
      descriptor = "Lhv;"
   )
   public static class544 field4741 = null;
   @OriginalMember(
      owner = "client!cd",
      name = "l",
      descriptor = "Lsda;"
   )
   public static class269 field4742 = new class269(18, 8);
   @OriginalMember(
      owner = "client!cd",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4746 = new String[200];
   @OriginalMember(
      owner = "client!cd",
      name = "e",
      descriptor = "Lsd;"
   )
   public static class101 field4750 = new class101(128, -1);
   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "I"
   )
   public static int field4738;
   @OriginalMember(
      owner = "client!cd",
      name = "j",
      descriptor = "I"
   )
   public static int field4739;
   @OriginalMember(
      owner = "client!cd",
      name = "k",
      descriptor = "I"
   )
   public static int field4740;
   @OriginalMember(
      owner = "client!cd",
      name = "d",
      descriptor = "I"
   )
   public static int field4743;
   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "I"
   )
   public static int field4744;
   @OriginalMember(
      owner = "client!cd",
      name = "g",
      descriptor = "I"
   )
   public static int field4747;
   @OriginalMember(
      owner = "client!cd",
      name = "i",
      descriptor = "I"
   )
   public static int field4748;
   @OriginalMember(
      owner = "client!cd",
      name = "c",
      descriptor = "I"
   )
   public static int field4749;

   @OriginalMember(
      owner = "client!cd",
      name = "e",
      descriptor = "(I)V",
      line = 3
   )
   public void method408(int arg0) {
      try {
         ++field4748;
         if (arg0 <= 57) {
            field4746 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4751[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(Z)V",
      line = 15
   )
   public void method415(boolean arg0) {
      try {
         if (arg0) {
            ++field4740;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4751[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "([III[II)V",
      line = 28
   )
   public static final void method2513(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field4743;
         if (arg2 > arg1) {
            int[] var10000;
            int var10001;
            label58: {
               int var6 = (arg1 + arg2) / 2;
               int var7 = arg1;
               int var8 = arg0[var6];
               arg0[var6] = arg0[arg2];
               arg0[arg2] = var8;
               int var9 = arg3[var6];
               arg3[var6] = arg3[arg2];
               arg3[arg2] = var9;
               int var10 = ~var8 != Integer.MIN_VALUE ? 1 : 0;
               int var11 = arg1;
               if (var5 != 0) {
                  var10000 = arg0;
                  var10001 = arg1;
               } else if (arg1 >= arg2) {
                  arg0[arg2] = arg0[arg1];
                  arg0[arg1] = var8;
                  arg3[arg2] = arg3[arg1];
                  arg3[arg1] = var9;
                  method2513(arg0, arg1, arg1 - 1, arg3, 0);
                  var10000 = arg0;
                  var10001 = arg1 + 1;
                  if (var5 == 0) {
                     break label58;
                  }
               } else {
                  var10000 = arg0;
                  var10001 = arg1;
               }

               while(true) {
                  if (~var10000[var10001] > ~((var11 & var10) + var8)) {
                     int var12 = arg0[var11];
                     arg0[var11] = arg0[var7];
                     arg0[var7] = var12;
                     int var13 = arg3[var11];
                     arg3[var11] = arg3[var7];
                     arg3[var7++] = var13;
                  }

                  ++var11;
                  if (var11 >= arg2) {
                     arg0[arg2] = arg0[var7];
                     arg0[var7] = var8;
                     arg3[arg2] = arg3[var7];
                     arg3[var7] = var9;
                     method2513(arg0, arg1, var7 - 1, arg3, 0);
                     var10000 = arg0;
                     var10001 = var7 + 1;
                     if (var5 == 0) {
                        break;
                     }
                  } else {
                     var10000 = arg0;
                     var10001 = var11;
                  }
               }
            }

            method2513(var10000, var10001, arg2, arg3, 0);
         }

         if (arg4 != 0) {
            method2514(-86);
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field4751[3] + (arg0 != null ? field4751[1] : field4751[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4751[1] : field4751[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "c",
      descriptor = "(I)V",
      line = 89
   )
   public void method1559(int arg0) {
      try {
         if (arg0 == -27966) {
            ++field4747;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4751[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(Z)V",
      line = 99
   )
   public void method416(boolean arg0) {
      try {
         ++field4744;
         if (!arg0) {
            this.method414(1, -102, (class254)null);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4751[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "d",
      descriptor = "(I)V",
      line = 109
   )
   public void method409(int arg0) {
      try {
         ++field4738;
         if (arg0 != -20939) {
            this.field4745 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4751[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(I)V",
      line = 125
   )
   public static void method2514(int arg0) {
      try {
         field4742 = null;
         field4746 = null;
         field4750 = null;
         if (arg0 != 0) {
            field4746 = null;
         }

         field4741 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4751[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(IB)I",
      line = 142
   )
   public static final int method2515(int arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field4749;
         if (arg1 != -50) {
            return 61;
         } else {
            double var3 = (double)((16725475 & arg0) >> 16) / 256.0D;
            double var5 = (double)(255 & arg0 >> 8) / 256.0D;
            double var7 = (double)(arg0 & 255) / 256.0D;
            double var9 = var3;
            if (var5 < var3) {
               var9 = var5;
            }

            if (var9 > var7) {
               var9 = var7;
            }

            double var11 = var3;
            if (var5 > var3) {
               var11 = var5;
            }

            if (var7 > var11) {
               var11 = var7;
            }

            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var9 + var11) / 2.0D;
            if (var9 != var11) {
               if (var17 < 0.5D) {
                  var15 = (var11 - var9) / (var9 + var11);
               }

               label93: {
                  if (var3 != var11) {
                     if (var5 != var11) {
                        if (var7 != var11) {
                           break label93;
                        }

                        var13 = (-var5 + var3) / (-var9 + var11) + 4.0D;
                        if (var2 == 0) {
                           break label93;
                        }
                     }

                     var13 = (var7 - var3) / (var11 - var9) + 2.0D;
                     if (var2 == 0) {
                        break label93;
                     }
                  }

                  var13 = (var5 - var7) / (-var9 + var11);
               }

               if (var17 >= 0.5D) {
                  var15 = (var11 - var9) / (-var11 + 2.0D + -var9);
               }
            }

            int var21;
            int var22;
            int var23;
            label83: {
               double var19 = var13 / 6.0D;
               var21 = (int)(var19 * 256.0D);
               var22 = (int)(var15 * 256.0D);
               var23 = (int)(var17 * 256.0D);
               if (var22 >= 0) {
                  if (~var22 >= -256) {
                     break label83;
                  }

                  var22 = 255;
                  if (var2 == 0) {
                     break label83;
                  }
               }

               var22 = 0;
            }

            label76: {
               if (var23 < 0) {
                  var23 = 0;
                  if (var2 == 0) {
                     break label76;
                  }
               }

               if (~var23 < -256) {
                  var23 = 255;
               }
            }

            if (var23 <= 243) {
               if (var23 > 217) {
                  var22 >>= 3;
                  if (var2 == 0) {
                     return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
                  }
               }

               if (~var23 >= -193) {
                  if (var23 <= 179) {
                     return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
                  }

                  var22 >>= 1;
                  if (var2 == 0) {
                     return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
                  }
               }

               var22 >>= 2;
               if (var2 == 0) {
                  return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
               }
            }

            var22 >>= 4;
            return (var22 >> 5 << 7) + ((63 & var21 >> 2) << 10) + (var23 >> 1);
         }
      } catch (RuntimeException var25) {
         throw class670.method4877(var25, field4751[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(B)V",
      line = 246
   )
   public void method413(byte arg0) {
      try {
         ++field4739;
         if (arg0 != 87) {
            field4742 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4751[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "<init>",
      descriptor = "(Ldh;)V",
      line = 262
   )
   public class331(class338 arg0) {
      try {
         this.field4745 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4751[9] + (arg0 != null ? field4751[1] : field4751[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method412(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method411(int arg0);

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(ZB)V"
   )
   public abstract void method417(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method410(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(IILuha;)V"
   )
   public abstract void method414(int arg0, int arg1, class254 arg2);

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method407(byte arg0);

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2516(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2517(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
