import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class464 extends class454 {
   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6387 = new String[]{method3536(method3535("%QMFc")), method3536(method3535("?\u0018M*6")), method3536(method3535("%QMGc")), method3536(method3535("*C\u000fh")), method3536(method3535("%QMLc")), method3536(method3535("%QMEc")), method3536(method3535("%QMJc")), method3536(method3535("%QMCc")), method3536(method3535("%QMAc")), method3536(method3535("%QMKc")), method3536(method3535("%QM@c")), method3536(method3535("%QMBc"))};
   @OriginalMember(
      owner = "client!ag",
      name = "l",
      descriptor = "Lqb;"
   )
   public static class68 field6386 = new class68();
   @OriginalMember(
      owner = "client!ag",
      name = "j",
      descriptor = "I"
   )
   public static int field6377;
   @OriginalMember(
      owner = "client!ag",
      name = "m",
      descriptor = "I"
   )
   public static int field6378;
   @OriginalMember(
      owner = "client!ag",
      name = "i",
      descriptor = "I"
   )
   public static int field6379;
   @OriginalMember(
      owner = "client!ag",
      name = "q",
      descriptor = "I"
   )
   public static int field6380;
   @OriginalMember(
      owner = "client!ag",
      name = "p",
      descriptor = "I"
   )
   public static int field6381;
   @OriginalMember(
      owner = "client!ag",
      name = "n",
      descriptor = "I"
   )
   public static int field6382;
   @OriginalMember(
      owner = "client!ag",
      name = "o",
      descriptor = "I"
   )
   public static int field6383;
   @OriginalMember(
      owner = "client!ag",
      name = "k",
      descriptor = "I"
   )
   public static int field6384;
   @OriginalMember(
      owner = "client!ag",
      name = "r",
      descriptor = "I"
   )
   public static int field6385;

   @OriginalMember(
      owner = "client!ag",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class464(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3529(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         label29: {
            if (class415.field5689 <= -arg2 + arg1 && ~class282.field3921 <= ~(arg1 + arg2) && -arg2 + arg3 >= class577.field8561 && ~class586.field8647 <= ~(arg2 + arg3)) {
               class367.method2899(arg3, arg1, arg0, (byte)7, arg2);
               if (!client.field1481) {
                  break label29;
               }
            }

            class396.method3122(arg3, arg1, arg2, arg0, (byte)-122);
         }

         if (arg4 != 0) {
            method3529(-70, -3, 89, -63, 84);
         }

         ++field6378;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6387[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field6384;
         if (arg1) {
            field6386 = null;
         }

         return arg0 != 0 && ~super.field6259.field10967.method1752(-18033) != -2 ? 2 : 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6387[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 >= -46) {
            field6386 = null;
         }

         super.field6263 = arg1;
         ++field6382;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6387[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            return 41;
         } else {
            ++field6377;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6387[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "([I[[BI[BI[[BZ[I)I"
   )
   public static final int method3530(int[] arg0, byte[][] arg1, int arg2, byte[] arg3, int arg4, byte[][] arg5, boolean arg6, int[] arg7) {
      boolean var8 = client.field1481;

      try {
         ++field6380;
         int var9 = arg7[arg4];
         int var10 = arg0[arg4] + var9;
         int var11 = arg7[arg2];
         if (!arg6) {
            field6386 = null;
         }

         int var12 = arg0[arg2] + var11;
         int var13 = var9;
         if (var9 < var11) {
            var13 = var11;
         }

         int var14 = var10;
         if (var10 > var12) {
            var14 = var12;
         }

         int var15 = arg3[arg4] & 255;
         if ((255 & arg3[arg2]) < var15) {
            var15 = arg3[arg2] & 255;
         }

         byte[] var16 = arg5[arg4];
         byte[] var17 = arg1[arg2];
         int var18 = -var9 + var13;
         int var19 = -var11 + var13;
         int var20 = var13;
         int var21;
         if (var8) {
            var21 = var16[var18++] - -var17[var19++];
            if (var21 < var15) {
               var15 = var21;
            }

            var20 = var13 + 1;
         }

         while(true) {
            while(var20 < var14) {
               var21 = var16[var18++] - -var17[var19++];
               if (var21 < var15) {
                  var15 = var21;
               }

               ++var20;
            }

            int var24 = -var15;
            if (!var8) {
               return var24;
            }

            var21 = var24;
            if (var21 < var15) {
               var15 = var21;
            }

            ++var20;
         }
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field6387[2] + (arg0 != null ? field6387[1] : field6387[3]) + ',' + (arg1 != null ? field6387[1] : field6387[3]) + ',' + arg2 + ',' + (arg3 != null ? field6387[1] : field6387[3]) + ',' + arg4 + ',' + (arg5 != null ? field6387[1] : field6387[3]) + ',' + arg6 + ',' + (arg7 != null ? field6387[1] : field6387[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method3531(boolean arg0) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field6383;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6387[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3532(int arg0) {
      try {
         if (arg0 != -18033) {
            field6386 = null;
         }

         ++field6379;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6387[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method3533(byte arg0, String arg1) {
      boolean var2 = client.field1481;

      try {
         ++field6381;
         if (arg1 == null) {
            return null;
         } else {
            int var3;
            int var4;
            byte var10000;
            label113: {
               var3 = 0;
               var4 = arg1.length();
               if (var2) {
                  ++var3;
               }

               while(~var4 < ~var3) {
                  var10000 = class479.method3641(arg0 ^ -30991, arg1.charAt(var3));
                  if (var2) {
                     break label113;
                  }

                  if (var10000 == 0) {
                     break;
                  }

                  ++var3;
               }

               var10000 = arg0;
            }

            if (var10000 != 87) {
               return null;
            } else {
               int var13;
               while(true) {
                  if (var4 > var3) {
                     var13 = class479.method3641(-31066, arg1.charAt(var4 - 1));
                     if (var2) {
                        break;
                     }

                     if (var13 != 0) {
                        --var4;
                        continue;
                     }
                  }

                  var13 = -var3 + var4;
                  break;
               }

               int var5 = var13;
               if (~var5 <= -2 && ~var5 >= -13) {
                  StringBuffer var6 = new StringBuffer(var5);
                  int var7 = var3;
                  char var9;
                  if (var2) {
                     char var8 = arg1.charAt(var3);
                     if (class408.method3208(false, var8)) {
                        var9 = class78.method744(var8, true);
                        if (var9 != 0) {
                           var6.append(var9);
                        }
                     }

                     var7 = var3 + 1;
                  }

                  while(true) {
                     if (var4 <= var7) {
                        var13 = var6.length();
                        if (!var2) {
                           if (var13 == 0) {
                              return null;
                           }

                           return var6.toString();
                        }
                     } else {
                        var13 = arg1.charAt(var7);
                     }

                     int var12 = var13;
                     if (class408.method3208(false, (char)var12)) {
                        var9 = class78.method744((char)var12, true);
                        if (var9 != 0) {
                           var6.append(var9);
                        }
                     }

                     ++var7;
                  }
               } else {
                  return null;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field6387[10] + arg0 + ',' + (arg1 != null ? field6387[1] : field6387[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class464(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (super.field6263 != 0 && ~super.field6259.field10967.method1752(-18033) != -2) {
            super.field6263 = 0;
         }

         ++field6385;
         if (super.field6263 < 0 || super.field6263 > 1) {
            super.field6263 = this.method23(1);
         }

         if (!arg0) {
            field6386 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6387[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3534(int arg0) {
      try {
         field6386 = null;
         if (arg0 != 0) {
            method3534(64);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6387[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3535(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3536(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
