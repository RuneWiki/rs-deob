import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class253 extends class465 {
   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3388 = new String[]{method1913(method1912("SBtJ\u001a")), method1913(method1912("SBtK\u001a")), method1913(method1912("J\u0006t&O")), method1913(method1912("_]6d")), method1913(method1912("SBt@\u001a")), method1913(method1912("SBtI\u001a")), method1913(method1912("SBtA\u001a")), method1913(method1912("SBtL\u001a")), method1913(method1912("\rK5d\u000fRK9kQR\u0016")), method1913(method1912("\u0011\u0005d(\u000eRG65TWN<nT\u000f")), method1913(method1912("SBtO\u001a")), method1913(method1912("\rK5d\u000fWN<nTW\u0016")), method1913(method1912("\u0011\u0000")), method1913(method1912("SBtM\u001a")), method1913(method1912("SBtN\u001a"))};
   @OriginalMember(
      owner = "client!bj",
      name = "f",
      descriptor = "I"
   )
   public static int field3379;
   @OriginalMember(
      owner = "client!bj",
      name = "l",
      descriptor = "I"
   )
   public static int field3380;
   @OriginalMember(
      owner = "client!bj",
      name = "n",
      descriptor = "I"
   )
   public static int field3381;
   @OriginalMember(
      owner = "client!bj",
      name = "h",
      descriptor = "I"
   )
   public static int field3382;
   @OriginalMember(
      owner = "client!bj",
      name = "g",
      descriptor = "I"
   )
   public static int field3383;
   @OriginalMember(
      owner = "client!bj",
      name = "m",
      descriptor = "I"
   )
   public static int field3384;
   @OriginalMember(
      owner = "client!bj",
      name = "j",
      descriptor = "I"
   )
   public static int field3385;
   @OriginalMember(
      owner = "client!bj",
      name = "k",
      descriptor = "I"
   )
   public static int field3386;
   @OriginalMember(
      owner = "client!bj",
      name = "i",
      descriptor = "I"
   )
   public static int field3387;

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IB)I",
      line = 3
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 70 / ((-51 - arg1) / 60);
         ++field3379;
         if (super.field6980.method4680(-17721)) {
            return 3;
         } else {
            return arg0 != 0 && super.field6980.field9451.method3262(105) != 1 ? 2 : 1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3388[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(I[BI[BIIIII)V",
      line = 21
   )
   public static final void method1907(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var9 = client.field4530;

      try {
         if (arg2 == -1) {
            ++field3384;
            int var10 = -(arg4 >> 2);
            int var16 = -(arg4 & 3);
            int var11 = -arg7;
            if (var9 != 0 || var11 < 0) {
               label88:
               do {
                  int var12 = var10;
                  int var10001;
                  if (var9 != 0) {
                     var10001 = arg6++;
                     arg3[var10001] += arg1[arg8++];
                     int var17 = arg6++;
                     arg3[var17] += arg1[arg8++];
                     int var18 = arg6++;
                     arg3[var18] += arg1[arg8++];
                     int var19 = arg6++;
                     arg3[var19] += arg1[arg8++];
                     var12 = var10 + 1;
                  }

                  while(true) {
                     while(var12 < 0) {
                        var10001 = arg6++;
                        arg3[var10001] += arg1[arg8++];
                        var10001 = arg6++;
                        arg3[var10001] += arg1[arg8++];
                        var10001 = arg6++;
                        arg3[var10001] += arg1[arg8++];
                        var10001 = arg6++;
                        arg3[var10001] += arg1[arg8++];
                        ++var12;
                     }

                     int var13 = var16;
                     if (var9 == 0) {
                        if (var9 != 0) {
                           var10001 = arg6++;
                           arg3[var10001] += arg1[arg8++];
                           var13 = var16 + 1;
                        }

                        while(true) {
                           while(var13 < 0) {
                              var10001 = arg6++;
                              arg3[var10001] += arg1[arg8++];
                              ++var13;
                           }

                           arg6 += arg5;
                           arg8 += arg0;
                           if (var9 == 0) {
                              ++var11;
                              continue label88;
                           }

                           ++var13;
                        }
                     }

                     ++var12;
                  }
               } while(var11 < 0);

            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field3388[4] + arg0 + ',' + (arg1 != null ? field3388[2] : field3388[3]) + ',' + arg2 + ',' + (arg3 != null ? field3388[2] : field3388[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 65
   )
   public class253(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "(Z)Z",
      line = 69
   )
   public final boolean method1908(boolean arg0) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field3383;
            return !super.field6980.method4680(-17721);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3388[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IILeaa;I)Lmja;",
      line = 86
   )
   public static final class440 method1909(int arg0, int arg1, class526 arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field3380;
         class128 var5 = new class128(arg2.method3899(-88, arg1, arg0));
         class440 var6 = new class440(arg1, var5.method1083((byte)127), var5.method1083((byte)105), var5.method1041(4758), var5.method1041(4758), var5.method1104(255) == 1, var5.method1104(255), var5.method1104(255));
         if (arg3 != -32536) {
            return null;
         } else {
            int var7 = var5.method1104(255);
            int var8 = 0;
            class440 var10000;
            if (var4 != 0) {
               var10000 = var6;
            } else if (var8 >= var7) {
               var6.method3322((byte)-117);
               var10000 = var6;
               if (var4 == 0) {
                  return var6;
               }
            } else {
               var10000 = var6;
            }

            while(true) {
               var10000.field6701.method4060(23, new class449(var5.method1104(255), var5.method1038((byte)-119), var5.method1038((byte)-125), var5.method1038((byte)-117), var5.method1038((byte)-106), var5.method1038((byte)-122), var5.method1038((byte)-113), var5.method1038((byte)-119), var5.method1038((byte)-102)));
               ++var8;
               if (var8 >= var7) {
                  var6.method3322((byte)-117);
                  var10000 = var6;
                  if (var4 == 0) {
                     return var6;
                  }
               } else {
                  var10000 = var6;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3388[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3388[2] : field3388[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(I)I",
      line = 113
   )
   public final int method78(int arg0) {
      try {
         ++field3385;
         return arg0 != 16726277 ? -50 : 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3388[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "(I)I",
      line = 124
   )
   public final int method1910(int arg0) {
      try {
         if (arg0 <= 81) {
            return 87;
         } else {
            ++field3387;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3388[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Z)V",
      line = 137
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            this.method69(true);
         }

         if (super.field6980.method4680(-17721)) {
            super.field6984 = 0;
         }

         ++field3382;
         if (super.field6984 < 0 && super.field6984 > 2) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3388[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "(II)V",
      line = 154
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 != -14812) {
            method1909(68, -82, (class526)null, -85);
         }

         super.field6984 = arg1;
         ++field3386;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3388[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 171
   )
   public class253(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Llw;BZ)V",
      line = 174
   )
   public static final void method1911(class687 param0, byte param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1912(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1913(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
