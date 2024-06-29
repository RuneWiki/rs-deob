import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class566 extends class297 {
   @OriginalMember(
      owner = "client!dia",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8402 = new String[]{method4273(method4272("+w\u0001DWg")), method4273(method4272("+w\u0001DSg")), method4273(method4272("40NDo")), method4273(method4272("+w\u0001DUg")), method4273(method4272("!k\f\u0006")), method4273(method4272("+w\u0001D.&p\t\u001e,g")), method4273(method4272("+w\u0001DPg")), method4273(method4272("+w\u0001DVg")), method4273(method4272("+w\u0001DZg")), method4273(method4272("+w\u0001DTg")), method4273(method4272("+w\u0001DQg"))};
   @OriginalMember(
      owner = "client!dia",
      name = "u",
      descriptor = "J"
   )
   public static long field8391 = -1L;
   @OriginalMember(
      owner = "client!dia",
      name = "w",
      descriptor = "I"
   )
   public static int field8389;
   @OriginalMember(
      owner = "client!dia",
      name = "x",
      descriptor = "I"
   )
   public int field8390;
   @OriginalMember(
      owner = "client!dia",
      name = "E",
      descriptor = "I"
   )
   public static int field8392;
   @OriginalMember(
      owner = "client!dia",
      name = "C",
      descriptor = "I"
   )
   public static int field8393;
   @OriginalMember(
      owner = "client!dia",
      name = "D",
      descriptor = "I"
   )
   public int field8394;
   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "I"
   )
   public static int field8395;
   @OriginalMember(
      owner = "client!dia",
      name = "G",
      descriptor = "I"
   )
   public static int field8396;
   @OriginalMember(
      owner = "client!dia",
      name = "B",
      descriptor = "I"
   )
   public static int field8397;
   @OriginalMember(
      owner = "client!dia",
      name = "F",
      descriptor = "I"
   )
   public int field8398;
   @OriginalMember(
      owner = "client!dia",
      name = "A",
      descriptor = "I"
   )
   public static int field8399;
   @OriginalMember(
      owner = "client!dia",
      name = "v",
      descriptor = "I"
   )
   public static int field8401;
   @OriginalMember(
      owner = "client!dia",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   public String field8400;

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(B)J",
      line = 8
   )
   public final long method4264(byte arg0) {
      try {
         if (arg0 < 83) {
            return 124L;
         } else {
            ++field8395;
            return Long.MAX_VALUE & super.field4684;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8402[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Ljava/lang/String;IB)V",
      line = 19
   )
   public static final void method4265(String arg0, int arg1, byte arg2) {
      boolean var3 = client.field1786;

      try {
         ++field8397;
         int var4 = class728.field10861;
         int[] var5 = class17.field223;
         boolean var6 = false;
         int var7 = -99 / ((44 - arg2) / 35);
         int var8 = 0;
         if (var3 || var4 > var8) {
            do {
               class9 var9 = class484.field7370[var5[var8]];
               if (var9 != null && class476.field7251 != var9 && var9.field67 != null && var9.field67.equalsIgnoreCase(arg0)) {
                  class113 var10 = null;
                  if (~arg1 == -2) {
                     var10 = class692.field10275;
                  } else if (~arg1 == -5) {
                     var10 = class13.field165;
                  } else if (~arg1 == -6) {
                     var10 = class125.field1796;
                  } else if (~arg1 == -7) {
                     var10 = class579.field8555;
                  } else if (arg1 == 7) {
                     var10 = class178.field2779;
                  } else if (~arg1 == -10) {
                     var10 = class13.field170;
                  }

                  var6 = true;
                  if (var10 == null) {
                     break;
                  }

                  ++class341.field5195;
                  class577 var11 = class218.method1888(var10, 106, class510.field7801.field361);
                  var11.field8531.method2853(false, var5[var8]);
                  var11.field8531.method2864(-26110, 0);
                  class510.field7801.method211(var11, 116);
                  if (!var3) {
                     break;
                  }
               }

               ++var8;
            } while(var4 > var8);
         }

         if (!var6) {
            class23.method170(4, 0, class499.field7609.method3875(class493.field7455, 103) + arg0);
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field8402[3] + (arg0 != null ? field8402[2] : field8402[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(II[IIIIII)Z",
      line = 92
   )
   public static final boolean method4266(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1786;

      try {
         if (arg6 < 0) {
            arg6 = 0;
         }

         ++field8401;
         if (arg4 < 108) {
            return true;
         } else {
            if (arg3 > class211.field3196) {
               arg3 = class211.field3196;
            }

            if (arg6 >= arg3) {
               return true;
            } else {
               int var10000;
               label213: {
                  arg5 += arg6 * arg7;
                  arg0 = arg3 - arg6 >> 2;
                  arg1 += arg6 - 1;
                  int var11;
                  int var12;
                  if (~class69.field908 == -2) {
                     label172: {
                        class84.field1223 += arg0;
                        if (var8) {
                           ++arg1;
                           if (arg2[arg1] > arg5) {
                              arg2[arg1] = arg5;
                           }

                           arg5 += arg7;
                        } else {
                           --arg0;
                           if (arg0 < 0) {
                              arg0 = 3 & -arg6 + arg3;
                              if (!var8) {
                                 break label172;
                              }
                           } else {
                              ++arg1;
                              if (arg2[arg1] > arg5) {
                                 arg2[arg1] = arg5;
                              }

                              arg5 += arg7;
                           }
                        }

                        while(true) {
                           var11 = arg1 + 1;
                           if (arg5 < arg2[var11]) {
                              arg2[var11] = arg5;
                           }

                           var12 = arg5 + arg7;
                           ++var11;
                           if (arg2[var11] > var12) {
                              arg2[var11] = var12;
                           }

                           var12 += arg7;
                           arg1 = var11 + 1;
                           if (~arg2[arg1] < ~var12) {
                              arg2[arg1] = var12;
                           }

                           arg5 = var12 + arg7;
                           --arg0;
                           if (arg0 < 0) {
                              arg0 = 3 & -arg6 + arg3;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              ++arg1;
                              if (arg2[arg1] > arg5) {
                                 arg2[arg1] = arg5;
                              }

                              arg5 += arg7;
                           }
                        }
                     }

                     if (var8) {
                        ++arg1;
                        if (~arg2[arg1] < ~arg5) {
                           arg2[arg1] = arg5;
                        }

                        arg5 += arg7;
                     }

                     label142:
                     while(true) {
                        while(true) {
                           --arg0;
                           if (~arg0 > -1) {
                              if (!var8) {
                                 if (!var8) {
                                    var10000 = 1;
                                    if (!var8) {
                                       return true;
                                    }
                                    break label213;
                                 }
                                 break label142;
                              }

                              arg5 += arg7;
                           } else {
                              ++arg1;
                              if (~arg2[arg1] < ~arg5) {
                                 arg2[arg1] = arg5;
                              }

                              arg5 += arg7;
                           }
                        }
                     }
                  }

                  label121: {
                     arg5 -= 38400;
                     if (var8) {
                        ++arg1;
                        if (arg2[arg1] > arg5) {
                           return false;
                        }

                        arg5 += arg7;
                     } else {
                        --arg0;
                        if (arg0 < 0) {
                           arg0 = 3 & -arg6 + arg3;
                           if (!var8) {
                              break label121;
                           }
                        } else {
                           ++arg1;
                           if (arg2[arg1] > arg5) {
                              return false;
                           }

                           arg5 += arg7;
                        }
                     }

                     while(true) {
                        var11 = arg1 + 1;
                        if (~arg2[var11] < ~arg5) {
                           return false;
                        }

                        var12 = arg5 + arg7;
                        var10000 = ~var12;
                        ++var11;
                        if (var10000 > ~arg2[var11]) {
                           return false;
                        }

                        var12 += arg7;
                        arg1 = var11 + 1;
                        if (var12 < arg2[arg1]) {
                           return false;
                        }

                        arg5 = var12 + arg7;
                        --arg0;
                        if (arg0 < 0) {
                           arg0 = 3 & -arg6 + arg3;
                           if (!var8) {
                              break;
                           }
                        } else {
                           ++arg1;
                           if (arg2[arg1] > arg5) {
                              return false;
                           }

                           arg5 += arg7;
                        }
                     }
                  }

                  if (var8) {
                     var10000 = ~arg5;
                  } else {
                     --arg0;
                     if (arg0 < 0) {
                        var10000 = 1;
                        if (!var8) {
                           return true;
                        }
                     } else {
                        var10000 = ~arg5;
                     }
                  }
               }

               while(true) {
                  ++arg1;
                  if (var10000 > ~arg2[arg1]) {
                     return false;
                  }

                  arg5 += arg7;
                  --arg0;
                  if (arg0 < 0) {
                     var10000 = 1;
                     if (!var8) {
                        return true;
                     }
                  } else {
                     var10000 = ~arg5;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8402[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8402[2] : field8402[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Z)V",
      line = 196
   )
   public static final void method4267(boolean arg0) {
      boolean var1 = client.field1786;

      try {
         int var2 = 0;
         if (var1) {
            class514.field7831[var2] = false;
            ++var2;
         }

         while(true) {
            while(var2 < 5) {
               class514.field7831[var2] = false;
               ++var2;
            }

            ++field8393;
            class294.field4652 = class317.field4895;
            class85.field1247 = 0;
            class576.field8516 = class308.field4801;
            class89.field1281 = class703.field10589;
            class572.field8464 = -1;
            class697.field10346 = -1;
            if (!var1) {
               if (!arg0) {
                  return;
               }

               class648.field9340 = 5;
               class321.field4919 = class653.field9780;
               class179.field2785 = class401.field6288;
               class603.field8817 = 0;
               class351.field5352 = class691.field10259;
               class735.field10948 = -1;
               class306.field4788 = -1;
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8402[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "(I)V",
      line = 229
   )
   public final void method4268(int arg0) {
      try {
         ++field8392;
         super.field4684 = super.field4684 & Long.MIN_VALUE | class162.method1442(14080) + 500L;
         class77.field1017.method3693(this, true);
         if (arg0 != 4) {
            this.field8400 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8402[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "f",
      descriptor = "(B)V",
      line = 242
   )
   public final void method4269(byte arg0) {
      try {
         ++field8396;
         super.field4684 |= Long.MIN_VALUE;
         if (arg0 > -96) {
            this.field8390 = 73;
         }

         if (this.method4264((byte)109) == 0L) {
            class553.field8273.method3693(this, true);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8402[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "e",
      descriptor = "(B)J",
      line = 256
   )
   public final long method4270(byte arg0) {
      try {
         ++field8389;
         int var2 = -18 / ((arg0 - 53) / 59);
         return super.field4655 & 72057594037927935L;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8402[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "<init>",
      descriptor = "(IJ)V",
      line = 267
   )
   public class566(int arg0, long arg1) {
      try {
         super.field4655 = arg1 | (long)arg0 << 56;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8402[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "d",
      descriptor = "(B)I",
      line = 276
   )
   public final int method4271(byte arg0) {
      try {
         if (arg0 != -91) {
            return -51;
         } else {
            ++field8399;
            return (int)(super.field4655 >>> 56 & 255L);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8402[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
