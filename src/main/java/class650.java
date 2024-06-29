import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class650 extends class454 {
   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9714 = new String[]{method4783(method4782("n\u000b1O\u0011")), method4783(method4782("n\u000b1M\u0011")), method4783(method4782("eN1&D")), method4783(method4782("A\u0014px")), method4783(method4782("n\u000b1K\u0011")), method4783(method4782("p\u0015sd")), method4783(method4782("r\u000fxo\\z\u000fj|")), method4783(method4782("A\u0002siWu")), method4783(method4782("n\u000b1I\u0011")), method4783(method4782("n\u000b1F\u0011")), method4783(method4782("J6%(")), method4783(method4782("n\u000b1L\u0011")), method4783(method4782("n\u000b1@\u0011")), method4783(method4782("n\u000b1N\u0011")), method4783(method4782("n\u000b1J\u0011")), method4783(method4782("n\u000b1G\u0011"))};
   @OriginalMember(
      owner = "client!pk",
      name = "r",
      descriptor = "I"
   )
   public static int field9700 = 0;
   @OriginalMember(
      owner = "client!pk",
      name = "t",
      descriptor = "Lse;"
   )
   public static class6 field9703 = new class6(53, 4);
   @OriginalMember(
      owner = "client!pk",
      name = "m",
      descriptor = "Ll;"
   )
   public static class292 field9710 = new class292("", 21);
   @OriginalMember(
      owner = "client!pk",
      name = "v",
      descriptor = "Lse;"
   )
   public static class6 field9711 = new class6(64, 2);
   @OriginalMember(
      owner = "client!pk",
      name = "k",
      descriptor = "F"
   )
   public static float field9712;
   @OriginalMember(
      owner = "client!pk",
      name = "o",
      descriptor = "I"
   )
   public static int field9699;
   @OriginalMember(
      owner = "client!pk",
      name = "s",
      descriptor = "I"
   )
   public static int field9701;
   @OriginalMember(
      owner = "client!pk",
      name = "l",
      descriptor = "I"
   )
   public static int field9702;
   @OriginalMember(
      owner = "client!pk",
      name = "n",
      descriptor = "I"
   )
   public static int field9704;
   @OriginalMember(
      owner = "client!pk",
      name = "p",
      descriptor = "I"
   )
   public static int field9705;
   @OriginalMember(
      owner = "client!pk",
      name = "i",
      descriptor = "I"
   )
   public static int field9706;
   @OriginalMember(
      owner = "client!pk",
      name = "q",
      descriptor = "I"
   )
   public static int field9707;
   @OriginalMember(
      owner = "client!pk",
      name = "j",
      descriptor = "I"
   )
   public static int field9708;
   @OriginalMember(
      owner = "client!pk",
      name = "w",
      descriptor = "I"
   )
   public static int field9709;
   @OriginalMember(
      owner = "client!pk",
      name = "u",
      descriptor = "I"
   )
   public static int field9713;

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field9702;
         if (arg0 != 1) {
            return -45;
         } else {
            return !super.field6259.method5434((byte)-111) ? 0 : 1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9714[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Lqh;I)I"
   )
   public static final int method4776(class81 arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field9706;
         if (arg1 >= -29) {
            field9700 = 86;
         }

         class473 var3 = arg0.field1135;
         if (var3.field6583 != null) {
            var3 = var3.method3603(class175.field2266, 4764);
            if (var3 == null) {
               return -1;
            }
         }

         int var4 = var3.field6554;
         class516 var5 = arg0.method71(-12710);
         if (~arg0.field125 == 0 || arg0.field154) {
            var4 = var3.field6581;
            if (!var2) {
               return var4;
            }
         }

         if (arg0.field125 != var5.field7208 && arg0.field125 != var5.field7225 && arg0.field125 != var5.field7238 && arg0.field125 != var5.field7184) {
            if (arg0.field125 != var5.field7197 && arg0.field125 != var5.field7226 && ~arg0.field125 != ~var5.field7231 && arg0.field125 != var5.field7224) {
               return var4;
            }

            var4 = var3.field6547;
            if (!var2) {
               return var4;
            }
         }

         var4 = var3.field6520;
         return var4;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field9714[12] + (arg0 != null ? field9714[2] : field9714[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4777(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field9708;
         class191 var2 = (class191)class705.field10295.method1817(-39);
         class652 var4;
         class246 var5;
         if (var1) {
            if (var2.field2423.method2768(-25)) {
               class665.method4859(var2.field2427, (byte)-70);
               if (var1) {
                  var2.field2423.method3922((byte)105);

                  try {
                     var2.field2423.method2766(1);
                  } catch (Exception var10) {
                     class668.method4877((byte)126, var10, field9714[10] + var2.field2427);
                     class665.method4859(var2.field2427, (byte)-70);
                  }

                  if (!var2.field2422 && !var2.field2426) {
                     var4 = var2.field2423.method2767((byte)-112);
                     if (var4 != null) {
                        var5 = var4.method4790(-2985);
                        if (var5 != null) {
                           var5.method1954(var2.field2425, false);
                           class674.field9978.method2839(var5);
                           var2.field2422 = true;
                        }
                     }
                  }

                  var2 = (class191)class705.field10295.method1812(353);
               } else {
                  var2 = (class191)class705.field10295.method1812(353);
               }
            } else {
               var2.field2423.method3922((byte)105);

               try {
                  var2.field2423.method2766(1);
               } catch (Exception var11) {
                  class668.method4877((byte)126, var11, field9714[10] + var2.field2427);
                  class665.method4859(var2.field2427, (byte)-70);
               }

               if (!var2.field2422 && !var2.field2426) {
                  var4 = var2.field2423.method2767((byte)-112);
                  if (var4 != null) {
                     var5 = var4.method4790(-2985);
                     if (var5 != null) {
                        var5.method1954(var2.field2425, false);
                        class674.field9978.method2839(var5);
                        var2.field2422 = true;
                     }
                  }
               }

               var2 = (class191)class705.field10295.method1812(353);
            }
         }

         while(true) {
            while(var2 != null) {
               if (var2.field2423.method2768(-25)) {
                  class665.method4859(var2.field2427, (byte)-70);
                  if (var1) {
                     var2.field2423.method3922((byte)105);

                     try {
                        var2.field2423.method2766(1);
                     } catch (Exception var9) {
                        class668.method4877((byte)126, var9, field9714[10] + var2.field2427);
                        class665.method4859(var2.field2427, (byte)-70);
                     }

                     if (!var2.field2422 && !var2.field2426) {
                        var4 = var2.field2423.method2767((byte)-112);
                        if (var4 != null) {
                           var5 = var4.method4790(-2985);
                           if (var5 != null) {
                              var5.method1954(var2.field2425, false);
                              class674.field9978.method2839(var5);
                              var2.field2422 = true;
                           }
                        }
                     }

                     var2 = (class191)class705.field10295.method1812(353);
                  } else {
                     var2 = (class191)class705.field10295.method1812(353);
                  }
               } else {
                  var2.field2423.method3922((byte)105);

                  try {
                     var2.field2423.method2766(1);
                  } catch (Exception var8) {
                     class668.method4877((byte)126, var8, field9714[10] + var2.field2427);
                     class665.method4859(var2.field2427, (byte)-70);
                  }

                  if (!var2.field2422 && !var2.field2426) {
                     var4 = var2.field2423.method2767((byte)-112);
                     if (var4 != null) {
                        var5 = var4.method4790(-2985);
                        if (var5 != null) {
                           var5.method1954(var2.field2425, false);
                           class674.field9978.method2839(var5);
                           var2.field2422 = true;
                        }
                     }
                  }

                  var2 = (class191)class705.field10295.method1812(353);
               }
            }

            if (!var1) {
               if (arg0 < 2) {
                  field9713 = 11;
                  return;
               }

               return;
            }

            class665.method4859(arg0, (byte)2);
            if (var1) {
               var2.field2423.method3922((byte)105);

               try {
                  var2.field2423.method2766(1);
               } catch (Exception var7) {
                  class668.method4877((byte)126, var7, field9714[10] + var2.field2427);
                  class665.method4859(var2.field2427, (byte)-70);
               }

               if (!var2.field2422 && !var2.field2426) {
                  var4 = var2.field2423.method2767((byte)-112);
                  if (var4 != null) {
                     var5 = var4.method4790(-2985);
                     if (var5 != null) {
                        var5.method1954(var2.field2425, false);
                        class674.field9978.method2839(var5);
                        var2.field2422 = true;
                     }
                  }
               }

               var2 = (class191)class705.field10295.method1812(353);
            } else {
               var2 = (class191)class705.field10295.method1812(353);
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field9714[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class650(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4778(int arg0) {
      try {
         ++field9701;
         if (arg0 != -18033) {
            field9712 = 0.38602763F;
         }

         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9714[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4779(byte arg0) {
      try {
         field9711 = null;
         field9703 = null;
         if (arg0 < 19) {
            field9710 = null;
         }

         field9710 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9714[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class650(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Lgj;Ljava/lang/String;BLjava/lang/String;I)Lit;"
   )
   public static final class769 method4780(class736 arg0, String arg1, byte arg2, String arg3, int arg4) {
      try {
         ++field9709;
         if (arg2 != 11) {
            return null;
         } else if (~arg4 == -1) {
            return arg0.method5326(arg2 + -11, arg3);
         } else if (arg4 == 1) {
            try {
               Object var5 = class537.method4074(arg2 + 99, arg1, class152.field1893, new Object[]{(new URL(class152.field1893.getCodeBase(), arg3)).toString()});
               if (var5 == null) {
                  throw new RuntimeException();
               } else {
                  class769 var6 = new class769();
                  var6.field11210 = 1;
                  return var6;
               }
            } catch (Throwable var13) {
               class769 var7 = new class769();
               var7.field11210 = 2;
               return var7;
            }
         } else if (arg4 == 2) {
            try {
               class152.field1893.getAppletContext().showDocument(new URL(class152.field1893.getCodeBase(), arg3), field9714[7]);
               class769 var8 = new class769();
               var8.field11210 = 1;
               return var8;
            } catch (Exception var14) {
               class769 var9 = new class769();
               var9.field11210 = 2;
               return var9;
            }
         } else if (~arg4 == -4) {
            try {
               class537.method4076(field9714[6], class152.field1893, false);
            } catch (Throwable var16) {
            }

            try {
               class152.field1893.getAppletContext().showDocument(new URL(class152.field1893.getCodeBase(), arg3), field9714[3]);
               class769 var10 = new class769();
               var10.field11210 = 1;
               return var10;
            } catch (Exception var15) {
               class769 var11 = new class769();
               var11.field11210 = 2;
               return var11;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field9714[4] + (arg0 != null ? field9714[2] : field9714[5]) + ',' + (arg1 != null ? field9714[2] : field9714[5]) + ',' + arg2 + ',' + (arg3 != null ? field9714[2] : field9714[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         super.field6263 = arg1;
         if (arg0 >= -46) {
            this.method23(-1);
         }

         ++field9699;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9714[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field9707;
         if (!arg0) {
            field9703 = null;
         }

         super.field6263 = this.method23(1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9714[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4781(int arg0) {
      try {
         class708.method5177(13814);
         ++field9705;
         class161.method1344((byte)-104);
         int var1 = 64 / ((-37 - arg0) / 60);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9714[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field9704;
         if (arg1) {
            field9711 = null;
         }

         return 3;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9714[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4782(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4783(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
