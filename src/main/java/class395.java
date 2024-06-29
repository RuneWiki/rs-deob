import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class395 extends class70 {
   @OriginalMember(
      owner = "client!ng",
      name = "P",
      descriptor = "I"
   )
   private int field5460 = 4096;
   @OriginalMember(
      owner = "client!ng",
      name = "N",
      descriptor = "I"
   )
   private int field5461 = 0;
   @OriginalMember(
      owner = "client!ng",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5462 = new String[]{method3118(method3117("\u0006T\u001f]B")), method3118(method3117("\u0006T\u001fWB")), method3118(method3117("\u0006F]t")), method3118(method3117("\u0013\u001d\u001f6\u0017")), method3118(method3117("\u0006T\u001f[B")), method3118(method3117("\u0006T\u001fZB")), method3118(method3117("\u0006T\u001f_B")), method3118(method3117("\u0006T\u001f\\B"))};
   @OriginalMember(
      owner = "client!ng",
      name = "J",
      descriptor = "[[I"
   )
   public static int[][] field5456 = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!ng",
      name = "O",
      descriptor = "I"
   )
   public static int field5454;
   @OriginalMember(
      owner = "client!ng",
      name = "M",
      descriptor = "I"
   )
   public static int field5455;
   @OriginalMember(
      owner = "client!ng",
      name = "I",
      descriptor = "I"
   )
   public static int field5457;
   @OriginalMember(
      owner = "client!ng",
      name = "L",
      descriptor = "I"
   )
   public static int field5458;
   @OriginalMember(
      owner = "client!ng",
      name = "K",
      descriptor = "I"
   )
   public static int field5459;

   @OriginalMember(
      owner = "client!ng",
      name = "j",
      descriptor = "(I)V"
   )
   public static final void method3114(int arg0) {
      try {
         class98.field1305.method5161(121);
         ++field5455;
         class471.field6491 = null;
         class176.field2274 = null;
         class533.field7825 = 1;
         int var1 = -114 % ((4 - arg0) / 39);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5462[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5454;
         int[] var4 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            this.method547(-110, 40);
         }

         if (super.field940.field270) {
            int[] var5 = this.method690(arg0 ^ -82, 0, arg1);
            int var6 = 0;
            if (var3 || ~class262.field3328 < ~var6) {
               do {
                  int var7 = var5[var6];
                  if (var7 >= this.field5461) {
                     if (~var7 < ~this.field5460) {
                        var4[var6] = this.field5460;
                        if (var3) {
                           var4[var6] = var7;
                           if (var3) {
                              var4[var6] = this.field5461;
                              ++var6;
                           } else {
                              ++var6;
                           }
                        } else {
                           ++var6;
                        }
                     } else {
                        var4[var6] = var7;
                        if (var3) {
                           var4[var6] = this.field5461;
                           ++var6;
                        } else {
                           ++var6;
                        }
                     }
                  } else {
                     var4[var6] = this.field5461;
                     ++var6;
                  }
               } while(~class262.field3328 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5462[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(I[III[J)V"
   )
   public static final void method3115(int arg0, int[] arg1, int arg2, int arg3, long[] arg4) {
      boolean var5 = client.field1481;

      try {
         if (arg3 > arg2) {
            int var6 = (arg2 + arg3) / 2;
            int var7 = arg2;
            long var8 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var8;
            int var10 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var10;
            int var11 = ~var8 != Long.MIN_VALUE ? 1 : 0;
            int var12 = arg2;
            long var13;
            int var15;
            if (var5) {
               if (arg4[arg2] < (long)(arg2 & var11) + var8) {
                  var13 = arg4[arg2];
                  arg4[arg2] = arg4[arg2];
                  arg4[arg2] = var13;
                  var15 = arg1[arg2];
                  arg1[arg2] = arg1[arg2];
                  var7 = arg2 + 1;
                  arg1[arg2] = var15;
               }

               var12 = arg2 + 1;
            }

            while(true) {
               int var10000;
               if (~var12 <= ~arg3) {
                  arg4[arg3] = arg4[var7];
                  arg4[var7] = var8;
                  arg1[arg3] = arg1[var7];
                  arg1[var7] = var10;
                  method3115(1, arg1, arg2, var7 + -1, arg4);
                  var10000 = 1;
                  if (!var5) {
                     method3115(1, arg1, var7 + 1, arg3, arg4);
                     break;
                  }
               } else {
                  long var18;
                  var10000 = (var18 = arg4[var12] - ((long)(var12 & var11) + var8)) == 0L ? 0 : (var18 < 0L ? -1 : 1);
               }

               if (var10000 < 0) {
                  var13 = arg4[var12];
                  arg4[var12] = arg4[var7];
                  arg4[var7] = var13;
                  var15 = arg1[var12];
                  arg1[var12] = arg1[var7];
                  arg1[var7++] = var15;
               }

               ++var12;
            }
         }

         if (arg0 != 1) {
            method3114(-90);
         }

         ++field5458;
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field5462[7] + arg0 + ',' + (arg1 != null ? field5462[3] : field5462[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5462[3] : field5462[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg0 > -34) {
            method3116(-26);
         }

         ++field5457;
         if (~arg2 != -1) {
            if (~arg2 == -2) {
               this.field5460 = arg1.method603(-2);
               return;
            }

            if (arg2 != 2) {
               return;
            }

            if (!client.field1481) {
               super.field930 = arg1.method640(255) == 1;
               return;
            }
         }

         this.field5461 = arg1.method603(-2);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5462[4] + arg0 + ',' + (arg1 != null ? field5462[3] : field5462[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5459;
         int[][] var4 = super.field926.method2860(arg0 ^ arg0, arg1);
         if (super.field926.field5048) {
            int[][] var5 = this.method696(arg1, 0, 32767);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || ~var12 > ~class262.field3328) {
               do {
                  int var14;
                  int var15;
                  label79: {
                     int var13 = var6[var12];
                     var14 = var7[var12];
                     var15 = var8[var12];
                     if (~this.field5461 < ~var13) {
                        var9[var12] = this.field5461;
                        if (!var3) {
                           break label79;
                        }
                     }

                     if (~var13 >= ~this.field5460) {
                        var9[var12] = var13;
                        if (var3) {
                           var9[var12] = this.field5460;
                        }
                     } else {
                        var9[var12] = this.field5460;
                     }
                  }

                  label83: {
                     if (this.field5461 > var14) {
                        var10[var12] = this.field5461;
                        if (!var3) {
                           break label83;
                        }
                     }

                     if (~this.field5460 > ~var14) {
                        var10[var12] = this.field5460;
                        if (var3) {
                           var10[var12] = var14;
                        }
                     } else {
                        var10[var12] = var14;
                     }
                  }

                  if (~this.field5461 >= ~var15) {
                     if (~var15 >= ~this.field5460) {
                        var11[var12] = var15;
                        if (var3) {
                           var11[var12] = this.field5460;
                           if (var3) {
                              var11[var12] = this.field5461;
                              ++var12;
                           } else {
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     } else {
                        var11[var12] = this.field5460;
                        if (var3) {
                           var11[var12] = this.field5461;
                           ++var12;
                        } else {
                           ++var12;
                        }
                     }
                  } else {
                     var11[var12] = this.field5461;
                     ++var12;
                  }
               } while(~var12 > ~class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field5462[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method3116(int arg0) {
      try {
         field5456 = null;
         if (arg0 != 2) {
            method3116(83);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5462[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "<init>",
      descriptor = "()V"
   )
   public class395() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3117(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3118(char[] arg0) {
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
            var10005 = 51;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
