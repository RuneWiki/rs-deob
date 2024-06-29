import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class530 extends class465 {
   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7714 = new String[]{method3926(method3925("\u000eZ\u0005w*")), method3926(method3925("\u000eZ\u0005u*")), method3926(method3925("\u000eZ\u0005x*")), method3926(method3925("\u000eZ\u0005t*")), method3926(method3925("\u000eZ\u0005v*")), method3926(method3925("\u000eZ\u0005z*")), method3926(method3925("\u000eZ\u0005p*")), method3926(method3925("\u000b@G^")), method3926(method3925("\u001e\u001b\u0005\u001c\u007f")), method3926(method3925("\u000eZ\u0005{*")), method3926(method3925("\u000eZ\u0005s*")), method3926(method3925("\u000eZ\u0005q*"))};
   @OriginalMember(
      owner = "client!ko",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field7704 = false;
   @OriginalMember(
      owner = "client!ko",
      name = "n",
      descriptor = "I"
   )
   public static int field7703;
   @OriginalMember(
      owner = "client!ko",
      name = "i",
      descriptor = "I"
   )
   public static int field7705;
   @OriginalMember(
      owner = "client!ko",
      name = "k",
      descriptor = "I"
   )
   public static int field7706;
   @OriginalMember(
      owner = "client!ko",
      name = "f",
      descriptor = "I"
   )
   public static int field7708;
   @OriginalMember(
      owner = "client!ko",
      name = "j",
      descriptor = "I"
   )
   public static int field7709;
   @OriginalMember(
      owner = "client!ko",
      name = "p",
      descriptor = "I"
   )
   public static int field7710;
   @OriginalMember(
      owner = "client!ko",
      name = "o",
      descriptor = "I"
   )
   public static int field7711;
   @OriginalMember(
      owner = "client!ko",
      name = "m",
      descriptor = "I"
   )
   public static int field7712;
   @OriginalMember(
      owner = "client!ko",
      name = "h",
      descriptor = "I"
   )
   public static int field7713;
   @OriginalMember(
      owner = "client!ko",
      name = "g",
      descriptor = "Los;"
   )
   public static class466 field7707;

   @OriginalMember(
      owner = "client!ko",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method3919(int arg0) {
      try {
         ++field7708;
         if (!class759.field11182) {
            class358.method2799(class293.field4084, 127);
            if (class91.field1171 != null) {
               class358.method2799(class91.field1171, -30);
            }

            class759.field11182 = true;
            if (arg0 != 0) {
               method3920(118, 78);
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7714[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "b",
      descriptor = "(II)V",
      line = 28
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field7711;
         if (arg0 != -14812) {
            method3924(false);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7714[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(I)I",
      line = 45
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            field7704 = true;
         }

         ++field7703;
         return 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7714[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "c",
      descriptor = "(II)V",
      line = 56
   )
   public static final void method3920(int arg0, int arg1) {
      try {
         class379.field5799 = arg0;
         class606.field8893 = -1;
         ++field7705;
         class283.field3936 = 100;
         class705.field10553 = 3;
         if (arg1 != 14728) {
            method3923((class687)null, (int[])null, (int[])null, (int[])null, -127);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7714[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "d",
      descriptor = "(Z)Z",
      line = 71
   )
   public final boolean method3921(boolean arg0) {
      try {
         ++field7712;
         if (!class638.method4593(-341283472, super.field6980.field9464.method4225(110))) {
            return false;
         } else {
            if (arg0) {
               field7707 = null;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7714[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "b",
      descriptor = "(I)I",
      line = 89
   )
   public final int method3922(int arg0) {
      try {
         if (arg0 < 81) {
            field7704 = false;
         }

         ++field7709;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7714[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(Llw;[I[I[II)V",
      line = 100
   )
   public static final void method3923(class687 arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
      int var5 = client.field4530;

      try {
         int var6 = 0;
         if (arg4 < -71) {
            while(true) {
               int var10000 = ~arg3.length;
               int var10001 = ~var6;

               label126:
               while(true) {
                  if (var10000 >= var10001) {
                     var10000 = field7706 + 1;
                     if (var5 == 0) {
                        field7706 = var10000;
                        return;
                     }
                  } else {
                     var10000 = arg3[var6];
                  }

                  int var7 = var10000;
                  int var8 = arg1[var6];
                  int var9 = arg2[var6];
                  int var10 = 0;
                  if (var5 == 0) {
                     if (var8 == 0) {
                        break;
                     }

                     var10000 = var10;
                     var10001 = arg0.field6058.length;
                     if (var5 != 0) {
                        continue;
                     }

                     if (var10 >= var10001) {
                        break;
                     }
                  }

                  while(true) {
                     if (~(var8 & 1) != -1) {
                        if (var7 == -1) {
                           arg0.field6058[var10] = null;
                        } else {
                           class676 var11 = class576.field8554.method3189(var7, (byte)-59);
                           int var12 = var11.field10152;
                           class146 var13 = arg0.field6058[var10];
                           if (var13 != null) {
                              label118: {
                                 if (~var13.field1836 == ~var7) {
                                    if (var12 == 0) {
                                       var13 = arg0.field6058[var10] = null;
                                       break label118;
                                    }

                                    if (~var12 != -2) {
                                       if (~var12 != -3) {
                                          break label118;
                                       }

                                       var13.field1835 = 0;
                                       if (var5 == 0) {
                                          break label118;
                                       }
                                    }

                                    var13.field1835 = 0;
                                    var13.field1832 = var9;
                                    var13.field1833 = 0;
                                    var13.field1831 = 0;
                                    var13.field1834 = 1;
                                    if (arg0.field6025) {
                                       break label118;
                                    }

                                    class718.method5194(arg0, 0, var11, true);
                                    if (var5 == 0) {
                                       break label118;
                                    }
                                 }

                                 if (~var11.field10162 <= ~class576.field8554.method3189(var13.field1836, (byte)-36).field10162) {
                                    var13 = arg0.field6058[var10] = null;
                                 }
                              }
                           }

                           if (var13 == null) {
                              class146 var14 = arg0.field6058[var10] = new class146();
                              var14.field1832 = var9;
                              var14.field1835 = 0;
                              var14.field1833 = 0;
                              var14.field1831 = 0;
                              var14.field1834 = 1;
                              var14.field1836 = var7;
                              if (!arg0.field6025) {
                                 class718.method5194(arg0, 0, var11, true);
                                 if (var5 != 0) {
                                    arg0.field6058[var10] = null;
                                 }
                              }
                           }
                        }
                     }

                     ++var10;
                     var8 >>>= 1;
                     if (var8 == 0) {
                        break label126;
                     }

                     var10000 = var10;
                     var10001 = arg0.field6058.length;
                     if (var5 != 0) {
                        break;
                     }

                     if (var10 >= var10001) {
                        break label126;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field7714[9] + (arg0 != null ? field7714[8] : field7714[7]) + ',' + (arg1 != null ? field7714[8] : field7714[7]) + ',' + (arg2 != null ? field7714[8] : field7714[7]) + ',' + (arg3 != null ? field7714[8] : field7714[7]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(IB)I",
      line = 199
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field7710;
         if (!class638.method4593(-341283472, super.field6980.field9464.method4225(97))) {
            return 3;
         } else {
            int var3 = 110 / ((arg1 - -51) / 60);
            return 1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7714[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "c",
      descriptor = "(Z)V",
      line = 212
   )
   public static void method3924(boolean arg0) {
      try {
         field7707 = null;
         if (!arg0) {
            field7707 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7714[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(Z)V",
      line = 223
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            field7704 = false;
         }

         if (super.field6980.field9464.method4223((byte)111) && !class638.method4593(-341283472, super.field6980.field9464.method4225(88))) {
            super.field6984 = 0;
         }

         ++field7713;
         if (super.field6984 < 0 || ~super.field6984 < -2) {
            super.field6984 = this.method78(16726277);
         }

      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7714[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 242
   )
   public class530(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ko",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 247
   )
   public class530(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3925(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3926(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
