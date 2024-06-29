import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class64 {
   @OriginalMember(
      owner = "client!nr",
      name = "g",
      descriptor = "Ltv;"
   )
   private class590 field709 = new class590(64);
   @OriginalMember(
      owner = "client!nr",
      name = "u",
      descriptor = "Ltv;"
   )
   public class590 field716 = new class590(50);
   @OriginalMember(
      owner = "client!nr",
      name = "q",
      descriptor = "Lwf;"
   )
   public class145 field717 = new class145(250);
   @OriginalMember(
      owner = "client!nr",
      name = "k",
      descriptor = "Lcfa;"
   )
   private class179 field718 = new class179();
   @OriginalMember(
      owner = "client!nr",
      name = "w",
      descriptor = "Lqh;"
   )
   public class74 field710;
   @OriginalMember(
      owner = "client!nr",
      name = "f",
      descriptor = "Z"
   )
   private boolean field704;
   @OriginalMember(
      owner = "client!nr",
      name = "d",
      descriptor = "Lqh;"
   )
   private class74 field698;
   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "I"
   )
   public int field701;
   @OriginalMember(
      owner = "client!nr",
      name = "y",
      descriptor = "Lhb;"
   )
   private class759 field719;
   @OriginalMember(
      owner = "client!nr",
      name = "i",
      descriptor = "I"
   )
   public int field707;
   @OriginalMember(
      owner = "client!nr",
      name = "n",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field721;
   @OriginalMember(
      owner = "client!nr",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field720;
   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field723 = new String[]{method488(method487("\u0006-F\u0000l")), method488(method487("\u0013qFi9")), method488(method487("\u0013v\u0004B")), method488(method487("\u0013qFh9")), method488(method487("\u0013qFo9")), method488(method487("\u0013qFm9")), method488(method487("\u0013qFk9")), method488(method487("\u0013qFb9")), method488(method487("\u0013qFj9")), method488(method487("\u0013qFd9")), method488(method487("\u0013qF\u0012x\u0013j\u001c\u00109")), method488(method487("\u0013qFe9")), method488(method487("\u0013qFl9")), method488(method487("\u0013qFg9")), method488(method487("\u0013qFf9"))};
   @OriginalMember(
      owner = "client!nr",
      name = "h",
      descriptor = "Lnw;"
   )
   public static class616 field700 = new class616(71, 3);
   @OriginalMember(
      owner = "client!nr",
      name = "j",
      descriptor = "I"
   )
   public static int field699;
   @OriginalMember(
      owner = "client!nr",
      name = "r",
      descriptor = "I"
   )
   public static int field702;
   @OriginalMember(
      owner = "client!nr",
      name = "o",
      descriptor = "I"
   )
   public static int field703;
   @OriginalMember(
      owner = "client!nr",
      name = "m",
      descriptor = "I"
   )
   public static int field705;
   @OriginalMember(
      owner = "client!nr",
      name = "t",
      descriptor = "I"
   )
   public static int field706;
   @OriginalMember(
      owner = "client!nr",
      name = "c",
      descriptor = "I"
   )
   public static int field708;
   @OriginalMember(
      owner = "client!nr",
      name = "p",
      descriptor = "I"
   )
   public static int field711;
   @OriginalMember(
      owner = "client!nr",
      name = "s",
      descriptor = "I"
   )
   public static int field712;
   @OriginalMember(
      owner = "client!nr",
      name = "x",
      descriptor = "I"
   )
   public static int field713;
   @OriginalMember(
      owner = "client!nr",
      name = "l",
      descriptor = "I"
   )
   public static int field714;
   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "I"
   )
   public static int field715;
   @OriginalMember(
      owner = "client!nr",
      name = "v",
      descriptor = "I"
   )
   public int field722;

   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method475(int arg0) {
      try {
         if (arg0 != -20741) {
            method475(125);
         }

         field700 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field723[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method476(byte arg0) {
      try {
         class590 var2 = this.field709;
         synchronized(this.field709) {
            this.field709.method4244(true);
         }

         ++field715;
         class590 var3 = this.field716;
         synchronized(this.field716) {
            this.field716.method4244(true);
         }

         if (arg0 != 52) {
            this.field719 = null;
         }

         class145 var4 = this.field717;
         synchronized(this.field717) {
            this.field717.method1222(arg0 + -71);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field723[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method477(byte arg0, int arg1) {
      try {
         ++field713;
         int var3 = 9 % ((arg0 - -30) / 56);
         this.field722 = arg1;
         class590 var4 = this.field716;
         synchronized(this.field716) {
            this.field716.method4245(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field723[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method478(boolean arg0) {
      try {
         class590 var2 = this.field709;
         synchronized(this.field709) {
            this.field709.method4245(arg0);
         }

         ++field708;
         class590 var3 = this.field716;
         synchronized(this.field716) {
            this.field716.method4245(arg0);
         }

         class145 var4 = this.field717;
         synchronized(this.field717) {
            this.field717.method1221(-1);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field723[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(Lqh;ILha;)V"
   )
   public static final void method479(class74 param0, int param1, class65 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method480(int arg0, int arg1) {
      try {
         ++field699;
         class590 var3 = this.field709;
         synchronized(this.field709) {
            this.field709.method4234(2, arg0);
         }

         class590 var4 = this.field716;
         synchronized(this.field716) {
            if (arg1 != 0) {
               this.method483((byte)-9);
            }

            this.field716.method4234(2, arg0);
         }

         class145 var5 = this.field717;
         synchronized(this.field717) {
            this.field717.method1230((byte)17, arg0);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field723[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(IIILha;Ljia;III)Lbo;"
   )
   public final class763 method481(int arg0, int arg1, int arg2, class65 arg3, class648 arg4, int arg5, int arg6, int arg7) {
      try {
         this.field718.field2218 = arg2;
         this.field718.field2221 = arg1;
         if (arg5 < 9) {
            return null;
         } else {
            this.field718.field2220 = arg7;
            ++field714;
            this.field718.field2225 = arg6;
            this.field718.field2226 = arg0;
            this.field718.field2227 = arg4 != null;
            this.field718.field2228 = arg3.field740;
            return (class763)this.field717.method1227((byte)-126, this.field718);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field723[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field723[0] : field723[2]) + ',' + (arg4 != null ? field723[0] : field723[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method482(int arg0) {
      try {
         ++field711;
         class145 var2 = this.field717;
         synchronized(this.field717) {
            this.field717.method1221(arg0 + -1);
         }

         if (arg0 != 0) {
            this.method476((byte)9);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field723[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method483(byte arg0) {
      try {
         ++field705;
         int var2 = -27 % ((arg0 - -40) / 50);
         class590 var3 = this.field716;
         synchronized(this.field716) {
            this.field716.method4245(true);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field723[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method484(boolean arg0, int arg1) {
      try {
         ++field702;
         if (this.field704 != arg0) {
            if (arg1 != 0) {
               this.field721 = null;
            }

            this.field704 = arg0;
            this.method478(true);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field723[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(II)Lqa;"
   )
   public final class261 method485(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field712;
         class590 var4 = this.field709;
         class261 var5;
         synchronized(this.field709) {
            var5 = (class261)this.field709.method4239((long)arg1, 0);
         }

         if (var5 != null) {
            return var5;
         } else {
            class74 var6 = this.field698;
            byte[] var7;
            synchronized(this.field698) {
               var7 = this.field698.method732(class90.method857(arg1, (byte)90), class310.method2327(arg1, false), (byte)45);
            }

            class261 var8 = new class261();
            var8.field3374 = arg1;
            var8.field3391 = this;
            var8.field3366 = new String[]{null, null, class551.field7529.method3980(this.field701, true), null, null};
            var8.field3359 = new String[]{null, null, null, null, class551.field7530.method3980(this.field701, true)};
            if (var7 != null) {
               var8.method2010((byte)119, new class594(var7));
            }

            var8.method1990((byte)-16);
            if (~var8.field3336 != 0) {
               var8.method1998(this.method485(0, var8.field3342), this.method485(0, var8.field3336), (byte)-113);
            }

            if (var8.field3365 != -1) {
               var8.method1999((byte)17, this.method485(0, var8.field3365), this.method485(0, var8.field3376));
            }

            if (~var8.field3338 != arg0) {
               var8.method1993((byte)85, this.method485(0, var8.field3332), this.method485(0, var8.field3338));
            }

            if (!this.field704 && var8.field3339) {
               var8.field3371 = class551.field7526.method3980(this.field701, true);
               var8.field3415 = false;
               var8.field3366 = this.field721;
               var8.field3359 = this.field720;
               var8.field3392 = null;
               var8.field3363 = 0;
               if (var8.field3356 != null) {
                  boolean var9 = false;
                  class500 var10 = var8.field3356.method1850(0);
                  if (var3 || var10 != null) {
                     do {
                        label64: {
                           class786 var11 = this.field719.method5460((int)var10.field6862, arg0 ^ 11);
                           if (!var11.field11480) {
                              var9 = true;
                              if (!var3) {
                                 break label64;
                              }
                           }

                           var10.method3609(108);
                        }

                        var10 = var8.field3356.method1847(arg0 + 121);
                     } while(var10 != null);
                  }

                  if (!var9) {
                     var8.field3356 = null;
                  }
               }
            }

            class590 var12 = this.field709;
            synchronized(this.field709) {
               this.field709.method4238(64, var8, (long)arg1);
               return var8;
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field723[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(ILha;IZLda;IZIILha;Ljia;I)Lbo;"
   )
   public final class763 method486(int arg0, class65 arg1, int arg2, boolean arg3, class66 arg4, int arg5, boolean arg6, int arg7, int arg8, class65 arg9, class648 arg10, int arg11) {
      boolean var13 = client.field4273;

      try {
         ++field703;
         class763 var14 = this.method481(arg2, arg5, arg11, arg9, arg10, arg8 + 10820, arg7, arg0);
         if (var14 != null) {
            return var14;
         } else {
            class261 var15 = this.method485(arg8 ^ arg8, arg0);
            if (~arg5 < -2 && var15.field3414 != null) {
               int var16;
               int var10000;
               label90: {
                  var16 = -1;
                  int var17 = 0;
                  if (var13) {
                     var10000 = arg5;
                  } else if (var17 >= 10) {
                     var10000 = ~var16;
                     if (!var13) {
                        break label90;
                     }
                  } else {
                     var10000 = arg5;
                  }

                  while(true) {
                     if (var10000 >= var15.field3352[var17] && ~var15.field3352[var17] != -1) {
                        var16 = var15.field3414[var17];
                     }

                     ++var17;
                     if (var17 >= 10) {
                        var10000 = ~var16;
                        if (!var13) {
                           break;
                        }
                     } else {
                        var10000 = arg5;
                     }
                  }
               }

               if (var10000 != 0) {
                  var15 = this.method485(arg8 + 10791, var16);
               }
            }

            int[] var18 = var15.method2005(arg1, arg11, arg2, arg4, arg10, arg7, arg5, arg9, arg8 ^ -10777, arg3);
            if (var18 == null) {
               return null;
            } else {
               class763 var19;
               label71: {
                  if (arg6) {
                     var19 = arg1.method525(36, var18, 32, 36, 0, 0);
                     if (!var13) {
                        break label71;
                     }
                  }

                  var19 = arg9.method525(36, var18, 32, 36, 0, 0);
               }

               if (!arg6) {
                  class179 var20 = new class179();
                  var20.field2220 = arg0;
                  var20.field2221 = arg5;
                  var20.field2228 = arg9.field740;
                  var20.field2226 = arg2;
                  var20.field2227 = arg10 != null;
                  var20.field2225 = arg7;
                  var20.field2218 = arg11;
                  this.field717.method1226(26255, var20, var19);
               }

               return var19;
            }
         }
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field723[3] + arg0 + ',' + (arg1 != null ? field723[0] : field723[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field723[0] : field723[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field723[0] : field723[2]) + ',' + (arg10 != null ? field723[0] : field723[2]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "<init>",
      descriptor = "(Lnc;IZLhb;Lqh;Lqh;)V"
   )
   public class64(class26 arg0, int arg1, boolean arg2, class759 arg3, class74 arg4, class74 arg5) {
      try {
         label38: {
            this.field710 = arg5;
            this.field704 = arg2;
            this.field698 = arg4;
            this.field701 = arg1;
            this.field719 = arg3;
            if (this.field698 != null) {
               int var7 = this.field698.method719(true) - 1;
               this.field707 = this.field698.method727(var7, -32767) + var7 * 256;
               if (!client.field4273) {
                  break label38;
               }
            }

            this.field707 = 0;
         }

         this.field721 = new String[]{null, null, class551.field7529.method3980(this.field701, true), null, null};
         this.field720 = new String[]{null, null, null, null, class551.field7530.method3980(this.field701, true)};
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field723[10] + (arg0 != null ? field723[0] : field723[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field723[0] : field723[2]) + ',' + (arg4 != null ? field723[0] : field723[2]) + ',' + (arg5 != null ? field723[0] : field723[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
