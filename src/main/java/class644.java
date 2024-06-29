import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class644 extends class143 {
   @OriginalMember(
      owner = "client!dia",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9073 = new String[]{method4690(method4689("~RS\u0013")), method4690(method4689("k\t\u0011Q~")), method4690(method4689("tN^QN8")), method4690(method4689("tN^QA8")), method4690(method4689("tN^QB8")), method4690(method4689("tN^QJ8")), method4690(method4689("Uhy")), method4690(method4689("tN^QO8")), method4690(method4689("tN^QI8")), method4690(method4689("tN^QG8")), method4690(method4689("tN^QF8")), method4690(method4689("tN^Q@8")), method4690(method4689("tN^QH8"))};
   @OriginalMember(
      owner = "client!dia",
      name = "B",
      descriptor = "I"
   )
   public static int field9056 = 52;
   @OriginalMember(
      owner = "client!dia",
      name = "r",
      descriptor = "I"
   )
   public static int field9063 = -1;
   @OriginalMember(
      owner = "client!dia",
      name = "q",
      descriptor = "I"
   )
   public static int field9058;
   @OriginalMember(
      owner = "client!dia",
      name = "x",
      descriptor = "I"
   )
   public static int field9059;
   @OriginalMember(
      owner = "client!dia",
      name = "G",
      descriptor = "I"
   )
   public static int field9060;
   @OriginalMember(
      owner = "client!dia",
      name = "C",
      descriptor = "I"
   )
   public static int field9061;
   @OriginalMember(
      owner = "client!dia",
      name = "u",
      descriptor = "I"
   )
   public static int field9062;
   @OriginalMember(
      owner = "client!dia",
      name = "D",
      descriptor = "I"
   )
   public static int field9064;
   @OriginalMember(
      owner = "client!dia",
      name = "t",
      descriptor = "I"
   )
   public static int field9065;
   @OriginalMember(
      owner = "client!dia",
      name = "A",
      descriptor = "I"
   )
   public int field9066;
   @OriginalMember(
      owner = "client!dia",
      name = "E",
      descriptor = "I"
   )
   public static int field9067;
   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "I"
   )
   public int field9068;
   @OriginalMember(
      owner = "client!dia",
      name = "s",
      descriptor = "I"
   )
   public int field9069;
   @OriginalMember(
      owner = "client!dia",
      name = "F",
      descriptor = "I"
   )
   public static int field9071;
   @OriginalMember(
      owner = "client!dia",
      name = "w",
      descriptor = "I"
   )
   public int field9072;
   @OriginalMember(
      owner = "client!dia",
      name = "y",
      descriptor = "J"
   )
   public long field9057;
   @OriginalMember(
      owner = "client!dia",
      name = "v",
      descriptor = "[[[B"
   )
   public static byte[][][] field9070;

   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method4684(boolean arg0) {
      boolean var1 = client.field10022;

      try {
         ++field9058;
         class610 var2 = null;

         try {
            class92 var3 = class720.field10318.method877(arg0, 92, "2");
            if (var1) {
               class97.method968(32353, 1L);
            }

            label67:
            while(true) {
               int var10000;
               if (~var3.field1526 != -1) {
                  var10000 = ~var3.field1526;
                  if (!var1) {
                     if (var10000 == -2) {
                        var2 = (class610)var3.field1525;
                        byte[] var4 = new byte[(int)var2.method4495(1191)];
                        int var5 = 0;
                        int var6;
                        if (var1) {
                           var6 = var2.method4492(9236, var4.length + -var5, var5, var4);
                           if (var6 == -1) {
                              throw new IOException(field9073[6]);
                           }

                           var5 += var6;
                        }

                        while(true) {
                           if (var5 >= var4.length) {
                              var10000 = 0;
                              if (!var1) {
                                 class280.method2348(0, new class65(var4));
                                 break label67;
                              }
                           } else {
                              var10000 = var2.method4492(9236, var4.length + -var5, var5, var4);
                           }

                           var6 = var10000;
                           if (var6 == -1) {
                              throw new IOException(field9073[6]);
                           }

                           var5 += var6;
                        }
                     }
                     break;
                  }
               } else {
                  var10000 = 32353;
               }

               class97.method968(var10000, 1L);
            }
         } catch (Exception var9) {
         }

         try {
            if (var2 != null) {
               var2.method4494((byte)97);
            }
         } catch (Exception var8) {
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9073[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method501(byte arg0) {
      try {
         int var2 = -4 / ((arg0 - -56) / 48);
         ++field9064;
         return this.field9057;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9073[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Lwm;Ljava/lang/String;BZLda;Lha;)V"
   )
   public static final void method4685(class440 arg0, String arg1, byte arg2, boolean arg3, class216 arg4, class17 arg5) {
      try {
         ++field9061;
         if (arg2 >= -20) {
            field9056 = 117;
         }

         boolean var6 = !class70.field1029 || class72.method815(1);
         if (var6) {
            label74: {
               if (class70.field1029 && var6) {
                  arg0 = class563.field8018;
                  arg4 = arg5.method170(arg0, class374.field5464, true);
                  int var7 = arg0.method3431(arg1, 250, (class148[])null, 95);
                  int var8 = arg0.method3424(arg1, (class148[])null, -100, 250, arg0.field6439);
                  int var9 = class587.field8244.field6361;
                  int var10 = var9 + 4;
                  int var11 = var10 * 2 + var8;
                  int var12 = var10 * 2 + var7;
                  if (~class283.field4280 < ~var12) {
                     var12 = class283.field4280;
                  }

                  if (class169.field2528 > var11) {
                     var11 = class169.field2528;
                  }

                  int var13 = class137.field2206.method4636(class111.field1737, (byte)-123, var12) + class615.field8754;
                  int var14 = class678.field9661.method5290(var11, class595.field8386, 106) - -class684.field9884;
                  if (class563.field8012) {
                     var13 += class425.method3319(0);
                     var14 += class630.method4620((byte)85);
                  }

                  arg5.method187(class319.field4769, false).method1353(class325.field4833.field6361 + var13, var14 - -class325.field4833.field6353, -(class325.field4833.field6361 * 2) + var12, -(class325.field4833.field6353 * 2) + var11, 1, 0, 0);
                  arg5.method187(class325.field4833, true).method1451(var13, var14);
                  class325.field4833.method3373();
                  arg5.method187(class325.field4833, true).method1451(var12 + var13 + -var9, var14);
                  class325.field4833.method3376();
                  arg5.method187(class325.field4833, true).method1451(var12 + var13 + -var9, -var9 + var14 - -var11);
                  class325.field4833.method3373();
                  arg5.method187(class325.field4833, true).method1451(var13, -var9 + var14 + var11);
                  class325.field4833.method3376();
                  arg5.method187(class587.field8244, true).method1448(var13, class325.field4833.field6353 + var14, var9, var11 - class325.field4833.field6353 * 2);
                  class587.field8244.method3378();
                  arg5.method187(class587.field8244, true).method1448(class325.field4833.field6361 + var13, var14, -(class325.field4833.field6361 * 2) + var12, var9);
                  class587.field8244.method3378();
                  arg5.method187(class587.field8244, true).method1448(var13 - -var12 + -var9, class325.field4833.field6353 + var14, var9, -(class325.field4833.field6353 * 2) + var11);
                  class587.field8244.method3378();
                  arg5.method187(class587.field8244, true).method1448(class325.field4833.field6361 + var13, var11 + var14 - var9, var12 - class325.field4833.field6361 * 2, var9);
                  class587.field8244.method3378();
                  arg4.method1870(0, (int[])null, 0, var10 + var14, 1, var10 + var13, 1, -1, class546.field7780 | -16777216, (class684)null, arg1, -(var10 * 2) + var12, (byte)-126, (class148[])null, -(var10 * 2) + var11, 0);
                  class91.method918(var13, var12, (byte)123, var11, var14);
                  if (!client.field10022) {
                     break label74;
                  }
               }

               int var15 = arg0.method3431(arg1, 250, (class148[])null, 118);
               int var16 = 13 * arg0.method3421(arg1, 250, 3599, (class148[])null);
               byte var17 = 4;
               int var18 = var17 + 6;
               int var19 = var17 + 6;
               arg5.method226(var18 - var17, var19 - var17, var17 + var17 + var15, var16 - -var17 + var17, -16777216, 0);
               arg5.method257(-var17 + var18, var19 - var17, var15 + var17 + var17, var16 - -var17 - -var17, -1, 0);
               arg4.method1870(0, (int[])null, 0, var19, 1, var18, 1, -1, -1, (class684)null, arg1, var15, (byte)-123, (class148[])null, var16, 0);
               class91.method918(-var17 + var18, var15 + var17 + var17, (byte)123, var16 - -var17 + var17, var19 - var17);
            }

            if (arg3) {
               try {
                  if (!class563.field8012) {
                     arg5.method142(114);
                  } else {
                     class671.method4863(-29289);
                  }
               } catch (class37 var21) {
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field9073[2] + (arg0 != null ? field9073[1] : field9073[0]) + ',' + (arg1 != null ? field9073[1] : field9073[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9073[1] : field9073[0]) + ',' + (arg5 != null ? field9073[1] : field9073[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method500(byte arg0) {
      try {
         int var2 = 3 / ((arg0 - 28) / 50);
         ++field9060;
         return this.field9068;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9073[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method502(int arg0) {
      try {
         if (arg0 != 4) {
            this.field9069 = -90;
         }

         ++field9065;
         return this.field9072;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9073[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Lbt;[I[II[I)V"
   )
   public static final void method4686(class395 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg3 == -31133) {
            int var6 = 0;
            int var10000;
            if (var5) {
               var10000 = arg2[var6];
            } else if (~arg2.length >= ~var6) {
               var10000 = field9062 + 1;
               if (!var5) {
                  field9062 = var10000;
                  return;
               }
            } else {
               var10000 = arg2[var6];
            }

            while(true) {
               int var10001;
               label177:
               while(true) {
                  label175: {
                     int var7 = var10000;
                     int var8 = arg1[var6];
                     int var9 = arg4[var6];
                     int var10 = 0;
                     if (!var5) {
                        if (~var8 == -1) {
                           ++var6;
                           break label175;
                        }

                        var10000 = var10;
                        var10001 = arg0.field5833.length;
                        if (var5) {
                           break;
                        }

                        if (var10 >= var10001) {
                           ++var6;
                           break label175;
                        }
                     }

                     while(true) {
                        if ((var8 & 1) != 0) {
                           label188: {
                              if (~var7 == 0) {
                                 arg0.field5833[var10] = null;
                                 if (!var5) {
                                    ++var10;
                                    var8 >>>= 1;
                                    break label188;
                                 }
                              }

                              class33 var11 = class216.field3085.method4252(var7, -1);
                              int var12 = var11.field468;
                              class756 var13 = arg0.field5833[var10];
                              if (var13 != null && var13.method2201((byte)-113)) {
                                 if (~var13.method2218(false) == ~var7) {
                                    if (~var12 == -1) {
                                       var13 = arg0.field5833[var10] = null;
                                    } else if (~var12 != -2) {
                                       if (var12 == 2) {
                                          var13.method2205(121);
                                          if (var5) {
                                             var13.method2192(73);
                                             var13.field10815 = var9;
                                             if (var5 && var11.field481 >= var13.method2196((byte)23).field481) {
                                                var13 = arg0.field5833[var10] = null;
                                             }
                                          }
                                       }
                                    } else {
                                       var13.method2192(73);
                                       var13.field10815 = var9;
                                       if (var5 && var11.field481 >= var13.method2196((byte)23).field481) {
                                          var13 = arg0.field5833[var10] = null;
                                       }
                                    }
                                 } else if (var11.field481 >= var13.method2196((byte)23).field481) {
                                    var13 = arg0.field5833[var10] = null;
                                 }
                              }

                              class756 var14;
                              if (var13 != null) {
                                 if (!var13.method2201((byte)-92)) {
                                    var14 = arg0.field5833[var10] = new class756(arg0);
                                    var14.method2207(var7, (byte)-117);
                                    var14.field10815 = var9;
                                    ++var10;
                                    var8 >>>= 1;
                                 } else {
                                    ++var10;
                                    var8 >>>= 1;
                                 }
                              } else {
                                 var14 = arg0.field5833[var10] = new class756(arg0);
                                 var14.method2207(var7, (byte)-117);
                                 var14.field10815 = var9;
                                 ++var10;
                                 var8 >>>= 1;
                              }
                           }
                        } else {
                           ++var10;
                           var8 >>>= 1;
                        }

                        if (~var8 == -1) {
                           ++var6;
                           break;
                        }

                        var10000 = var10;
                        var10001 = arg0.field5833.length;
                        if (var5) {
                           break label177;
                        }

                        if (var10 >= var10001) {
                           ++var6;
                           break;
                        }
                     }
                  }

                  if (~arg2.length >= ~var6) {
                     var10000 = field9062 + 1;
                     if (!var5) {
                        field9062 = var10000;
                        return;
                     }
                  } else {
                     var10000 = arg2[var6];
                  }
               }

               if (var10000 >= var10001) {
                  var10000 = field9062 + 1;
                  if (!var5) {
                     field9062 = var10000;
                     return;
                  }
               } else {
                  var10000 = arg2[var6];
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field9073[8] + (arg0 != null ? field9073[1] : field9073[0]) + ',' + (arg1 != null ? field9073[1] : field9073[0]) + ',' + (arg2 != null ? field9073[1] : field9073[0]) + ',' + arg3 + ',' + (arg4 != null ? field9073[1] : field9073[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method4687(byte arg0) {
      try {
         field9070 = null;
         if (arg0 > -77) {
            field9070 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9073[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Lqs;BI[B)Lwd;"
   )
   public static final class79 method4688(class771 arg0, byte arg1, int arg2, byte[] arg3) {
      try {
         ++field9067;
         if (arg3 == null) {
            return null;
         } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg3);
            OpenGL.glGetIntegerv(34379, class104.field1637, 0);
            int var5 = -39 % ((arg1 - -48) / 57);
            if (class104.field1637[0] != -1) {
               OpenGL.glBindProgramARB(arg2, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg2, 0);
               return new class79(arg0, arg2, var4);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9073[5] + (arg0 != null ? field9073[1] : field9073[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9073[1] : field9073[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method504(boolean arg0) {
      try {
         if (arg0) {
            this.field9068 = 56;
         }

         ++field9071;
         return this.field9066;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9073[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method503(boolean arg0) {
      try {
         ++field9059;
         return !arg0 ? -107 : this.field9069;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9073[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4689(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4690(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
