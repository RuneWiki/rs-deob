import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class725 extends class70 {
   @OriginalMember(
      owner = "client!fca",
      name = "J",
      descriptor = "[S"
   )
   private short[] field10583 = new short[512];
   @OriginalMember(
      owner = "client!fca",
      name = "Z",
      descriptor = "I"
   )
   private int field10588 = 5;
   @OriginalMember(
      owner = "client!fca",
      name = "W",
      descriptor = "[B"
   )
   private byte[] field10594 = new byte[512];
   @OriginalMember(
      owner = "client!fca",
      name = "I",
      descriptor = "I"
   )
   private int field10591 = 5;
   @OriginalMember(
      owner = "client!fca",
      name = "N",
      descriptor = "I"
   )
   private int field10595 = 0;
   @OriginalMember(
      owner = "client!fca",
      name = "ab",
      descriptor = "I"
   )
   private int field10593 = 2048;
   @OriginalMember(
      owner = "client!fca",
      name = "U",
      descriptor = "I"
   )
   private int field10584 = 2;
   @OriginalMember(
      owner = "client!fca",
      name = "O",
      descriptor = "I"
   )
   private int field10598 = 1;
   @OriginalMember(
      owner = "client!fca",
      name = "bb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10602 = new String[]{method5254(method5253("\u007f\u000ew7s1")), method5254(method5253("\u007f\u000ew7y1")), method5254(method5253("bC87K")), method5254(method5253("w\u0018zu")), method5254(method5253("\u007f\u000ew7|1")), method5254(method5253("\u007f\u000ew7u1")), method5254(method5253("\u007f\u000ew7r1")), method5254(method5253("\u007f\u000ew7z1")), method5254(method5253("\u007f\u000ew7q1")), method5254(method5253("\u007f\u000ew7~1"))};
   @OriginalMember(
      owner = "client!fca",
      name = "M",
      descriptor = "I"
   )
   public static int field10587 = 0;
   @OriginalMember(
      owner = "client!fca",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field10589 = new int[32];
   @OriginalMember(
      owner = "client!fca",
      name = "R",
      descriptor = "Lse;"
   )
   public static class6 field10600;
   @OriginalMember(
      owner = "client!fca",
      name = "Y",
      descriptor = "Lbu;"
   )
   public static class596 field10601;
   @OriginalMember(
      owner = "client!fca",
      name = "V",
      descriptor = "I"
   )
   public static int field10585;
   @OriginalMember(
      owner = "client!fca",
      name = "P",
      descriptor = "I"
   )
   public static int field10586;
   @OriginalMember(
      owner = "client!fca",
      name = "X",
      descriptor = "I"
   )
   public static int field10590;
   @OriginalMember(
      owner = "client!fca",
      name = "T",
      descriptor = "I"
   )
   public static int field10592;
   @OriginalMember(
      owner = "client!fca",
      name = "Q",
      descriptor = "I"
   )
   public static int field10596;
   @OriginalMember(
      owner = "client!fca",
      name = "S",
      descriptor = "I"
   )
   public static int field10597;
   @OriginalMember(
      owner = "client!fca",
      name = "K",
      descriptor = "I"
   )
   public static int field10599;

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method5248(class479 arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10599;
         int var3 = 0;
         int var4 = 0;
         if (class28.field416) {
            var3 = class356.method2825(0);
            var4 = class465.method3538(-26506);
         }

         label100: {
            int var5 = -10660793;
            class791.method5710(var5, class664.field9834 + var3, class99.field1314, class457.field6293, class338.field4629 - -var4, arg0, -16777216, false);
            class98.field1306.method3433(class606.field8927.method4490(class782.field11389, -16777216), class338.field4629 + var4 + 14, 115, arg1, class664.field9834 - -var3 + 3, var5);
            int var6 = class372.field5216.method1570(arg1 ^ -29659) - -var3;
            int var7 = class372.field5216.method1566(~arg1) + var4;
            if (!class341.field4710) {
               int var8 = 0;
               class541 var9 = (class541)class500.field6967.method288(0);
               if (var2 || var9 != null) {
                  do {
                     int var10 = class338.field4629 + var4 + 31 - -((class455.field6279 - 1 + -var8) * 16);
                     ++var8;
                     class789.method5680(class664.field9834 + var3, var7, var10, class338.field4629 + var4, arg0, class457.field6293, true, -1, -256, class99.field1314, var6, var9);
                     var9 = (class541)class500.field6967.method290(17958);
                  } while(var9 != null);
               }

               if (!var2) {
                  break label100;
               }
            }

            int var11 = 0;
            class438 var12 = (class438)class723.field10572.method5265(arg1 + -125);
            if (var2 || var12 != null) {
               do {
                  label71: {
                     int var13 = var11 * 16 + class338.field4629 + var4 + 31;
                     ++var11;
                     if (var12.field5970 == 1) {
                        class789.method5680(class664.field9834 + var3, var7, var13, class338.field4629 + var4, arg0, class457.field6293, true, -1, -256, class99.field1314, var6, (class541)var12.field5971.field10622.field272);
                        if (!var2) {
                           break label71;
                        }
                     }

                     class329.method2612(arg0, -1, class99.field1314, -256, var12, var6, -117, class457.field6293, var7, var13, class664.field9834 - -var3, class338.field4629 - -var4);
                  }

                  var12 = (class438)class723.field10572.method5266(false);
               } while(var12 != null);
            }

            if (class641.field9433 != null) {
               int var10000;
               int var10001;
               short var10002;
               label58: {
                  class791.method5710(var5, class288.field3984, class779.field11362, class387.field5356, class169.field2203, arg0, -16777216, false);
                  class98.field1306.method3433(class641.field9433.field5962, class169.field2203 + 14, 14, -1, class288.field3984 + 3, var5);
                  int var14 = 0;
                  class541 var15 = (class541)class641.field9433.field5971.method5265(-125);
                  if (var2) {
                     var10000 = var14 * 16;
                     var10001 = class169.field2203;
                     var10002 = -31;
                  } else if (var15 == null) {
                     var10000 = class169.field2203;
                     var10001 = class288.field3984;
                     var10002 = 21273;
                     if (!var2) {
                        break label58;
                     }
                  } else {
                     var10000 = var14 * 16;
                     var10001 = class169.field2203;
                     var10002 = -31;
                  }

                  while(true) {
                     int var16 = var10000 + (var10001 - var10002);
                     class789.method5680(class288.field3984, var7, var16, class169.field2203, arg0, class387.field5356, true, -1, -256, class779.field11362, var6, var15);
                     ++var14;
                     var15 = (class541)class641.field9433.field5971.method5266(false);
                     if (var15 == null) {
                        var10000 = class169.field2203;
                        var10001 = class288.field3984;
                        var10002 = 21273;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var14 * 16;
                        var10001 = class169.field2203;
                        var10002 = -31;
                     }
                  }
               }

               class538.method4077(var10000, var10001, var10002, class779.field11362, class387.field5356);
            }
         }

         class538.method4077(class338.field4629 - -var4, class664.field9834 + var3, 21273, class99.field1314, class457.field6293);
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field10602[9] + (arg0 != null ? field10602[2] : field10602[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method5249(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fca",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5250(byte arg0) {
      try {
         if (arg0 >= -76) {
            method5248((class479)null, 57);
         }

         field10600 = null;
         field10601 = null;
         field10589 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10602[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "<init>",
      descriptor = "()V"
   )
   public class725() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "([BI[BIIIIII)V"
   )
   public static final void method5251(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field1481;

      try {
         ++field10596;
         int var10 = -(arg3 >> 2);
         int var16 = -(3 & arg3);
         int var11 = -arg7;
         int var10000;
         if (var9) {
            var10000 = var10;
         } else if (var11 >= 0) {
            var10000 = arg5;
            if (!var9) {
               if (arg5 != -1) {
                  field10600 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = var10;
         }

         label106:
         while(true) {
            int var12 = var10000;
            int var10001;
            if (var9) {
               var10001 = arg4++;
               arg0[var10001] += arg2[arg8++];
               int var17 = arg4++;
               arg0[var17] += arg2[arg8++];
               int var18 = arg4++;
               arg0[var18] += arg2[arg8++];
               int var19 = arg4++;
               arg0[var19] += arg2[arg8++];
               ++var12;
            }

            while(true) {
               while(var12 < 0) {
                  var10001 = arg4++;
                  arg0[var10001] += arg2[arg8++];
                  var10001 = arg4++;
                  arg0[var10001] += arg2[arg8++];
                  var10001 = arg4++;
                  arg0[var10001] += arg2[arg8++];
                  var10001 = arg4++;
                  arg0[var10001] += arg2[arg8++];
                  ++var12;
               }

               int var13 = var16;
               if (!var9) {
                  if (var9) {
                     var10001 = arg4++;
                     arg0[var10001] += arg2[arg8++];
                     var13 = var16 + 1;
                  }

                  while(true) {
                     while(~var13 > -1) {
                        var10001 = arg4++;
                        arg0[var10001] += arg2[arg8++];
                        ++var13;
                     }

                     arg8 += arg1;
                     arg4 += arg6;
                     if (!var9) {
                        ++var11;
                        if (var11 >= 0) {
                           var10000 = arg5;
                           if (!var9) {
                              if (arg5 != -1) {
                                 field10600 = null;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = var10;
                        }
                        continue label106;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field10602[4] + (arg0 != null ? field10602[2] : field10602[3]) + ',' + arg1 + ',' + (arg2 != null ? field10602[2] : field10602[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         this.field10594 = class535.method4064((byte)101, this.field10595);
         ++field10592;
         if (arg0 > -36) {
            method5251((byte[])null, -39, (byte[])null, -28, -26, -74, -6, -5, -84);
         }

         this.method5249((byte)27);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10602[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg0 >= -34) {
            method5248((class479)null, 95);
         }

         label81: {
            label80: {
               label79: {
                  label78: {
                     label77: {
                        label76: {
                           label75: {
                              if (arg2 != 0) {
                                 if (arg2 == 1) {
                                    break label75;
                                 }

                                 if (~arg2 == -3) {
                                    break label76;
                                 }

                                 if (arg2 == 3) {
                                    break label77;
                                 }

                                 if (~arg2 == -5) {
                                    break label78;
                                 }

                                 if (arg2 == 5) {
                                    break label79;
                                 }

                                 if (~arg2 != -7) {
                                    break label81;
                                 }

                                 if (!var4) {
                                    break label80;
                                 }
                              }

                              this.field10591 = this.field10588 = arg1.method640(255);
                              if (!var4) {
                                 break label81;
                              }
                           }

                           this.field10595 = arg1.method640(255);
                           if (!var4) {
                              break label81;
                           }
                        }

                        this.field10593 = arg1.method603(-2);
                        if (!var4) {
                           break label81;
                        }
                     }

                     this.field10584 = arg1.method640(255);
                     if (!var4) {
                        break label81;
                     }
                  }

                  this.field10598 = arg1.method640(255);
                  if (!var4) {
                     break label81;
                  }
               }

               this.field10591 = arg1.method640(255);
               if (!var4) {
                  break label81;
               }
            }

            this.field10588 = arg1.method640(255);
         }

         ++field10590;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10602[5] + arg0 + ',' + (arg1 != null ? field10602[2] : field10602[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method5252(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10585;
         if (class613.field9018 && class78.field1042) {
            if (~class516.field7237 > -101) {
               return false;
            } else {
               int var4 = class46.field586[arg1][arg2][arg0];
               if (~(-class208.field2646) == ~var4) {
                  return false;
               } else if (~class208.field2646 == ~var4) {
                  return true;
               } else if (class659.field9815 == class569.field8364) {
                  return false;
               } else {
                  int var5 = arg2 << class783.field11447;
                  int var6 = arg0 << class783.field11447;
                  if (class281.method2217(class659.field9815[arg1].method3284(-1, arg2, arg0 - -1), var5 + 1, class15.field276 + arg3 + var6, var6 + 1, class15.field276 + var5 - 1, class659.field9815[arg1].method3284(arg3, arg2 + 1, arg0 + 1), var6 - -class15.field276 - 1, class659.field9815[arg1].method3284(-1, arg2, arg0), (byte)67, var5 - -1) && class281.method2217(class659.field9815[arg1].method3284(-1, arg2 + 1, arg0 - -1), var5 + -1 + class15.field276, class15.field276 + var6 + -1, var6 + 1, var5 - -class15.field276 + -1, class659.field9815[arg1].method3284(-1, arg2 - -1, arg0), var6 - -1, class659.field9815[arg1].method3284(-1, arg2, arg0), (byte)67, var5 + 1)) {
                     ++class627.field9262;
                     class46.field586[arg1][arg2][arg0] = class208.field2646;
                     return true;
                  } else {
                     class46.field586[arg1][arg2][arg0] = -class208.field2646;
                     return false;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10602[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field10589[var1] = var0 - 1;
         var0 += var0;
      }

      field10600 = new class6(4, 1);
      field10601 = new class596();
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5253(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5254(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
