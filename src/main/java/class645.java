import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class645 extends class70 {
   @OriginalMember(
      owner = "client!sga",
      name = "K",
      descriptor = "I"
   )
   private int field9310 = 204;
   @OriginalMember(
      owner = "client!sga",
      name = "O",
      descriptor = "I"
   )
   private int field9311 = 1;
   @OriginalMember(
      owner = "client!sga",
      name = "J",
      descriptor = "I"
   )
   private int field9306 = 1;
   @OriginalMember(
      owner = "client!sga",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9316 = new String[]{method4695(method4694("\u0006&pwl]")), method4695(method4694("\u001b4}5")), method4695(method4694("\u000eo?wY")), method4695(method4694("\u0006&pwg]")), method4695(method4694("\u0006&pw`]")), method4695(method4694("\u0006&pwa]")), method4695(method4694("I&eg")), method4695(method4694("I-eg")), method4695(method4694("\u0006&pwb]")), method4695(method4694("\u0006&pwe]"))};
   @OriginalMember(
      owner = "client!sga",
      name = "L",
      descriptor = "F"
   )
   public static float field9313;
   @OriginalMember(
      owner = "client!sga",
      name = "H",
      descriptor = "I"
   )
   public static int field9305;
   @OriginalMember(
      owner = "client!sga",
      name = "F",
      descriptor = "I"
   )
   public static int field9307;
   @OriginalMember(
      owner = "client!sga",
      name = "G",
      descriptor = "I"
   )
   public static int field9308;
   @OriginalMember(
      owner = "client!sga",
      name = "M",
      descriptor = "I"
   )
   public static int field9314;
   @OriginalMember(
      owner = "client!sga",
      name = "P",
      descriptor = "I"
   )
   public static int field9315;
   @OriginalMember(
      owner = "client!sga",
      name = "N",
      descriptor = "Lbja;"
   )
   public static class275 field9312;
   @OriginalMember(
      owner = "client!sga",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field9309;

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg0 != -1) {
            field9309 = null;
         }

         label45: {
            label44: {
               label43: {
                  if (arg1 != 0) {
                     if (~arg1 == -2) {
                        break label43;
                     }

                     if (arg1 != 2) {
                        break label45;
                     }

                     if (!var4) {
                        break label44;
                     }
                  }

                  this.field9311 = arg2.method2855(-31007);
                  if (!var4) {
                     break label45;
                  }
               }

               this.field9306 = arg2.method2855(-31007);
               if (!var4) {
                  break label45;
               }
            }

            this.field9310 = arg2.method2848(arg0 + -103);
         }

         ++field9307;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9316[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9316[2] : field9316[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "<init>",
      descriptor = "()V"
   )
   public class645() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4690(boolean arg0) {
      try {
         field9312 = null;
         field9309 = null;
         if (!arg0) {
            field9312 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9316[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9314;
         if (arg0 != 87) {
            return null;
         } else {
            int[] var4 = super.field923.method3718(-2, arg1);
            if (super.field923.field7284) {
               int var5 = 0;
               if (var3 || ~var5 > ~class678.field10127) {
                  do {
                     int var6 = class199.field3060[var5];
                     int var7 = class204.field3113[arg1];
                     int var8 = this.field9311 * var6 >> 12;
                     int var9 = this.field9306 * var7 >> 12;
                     int var10 = var6 % (4096 / this.field9311) * this.field9311;
                     int var11 = var7 % (4096 / this.field9306) * this.field9306;
                     if (~var11 > ~this.field9310) {
                        var8 -= var9;
                        if (var3) {
                           var8 += 4;
                        }

                        while(~var8 > -1) {
                           var8 += 4;
                        }

                        if (var3) {
                           var8 -= 4;
                        }

                        while(var8 > 3) {
                           var8 -= 4;
                        }

                        if (~var8 != -2) {
                           var4[var5] = 0;
                           if (!var3) {
                              ++var5;
                              continue;
                           }
                        }

                        if (~var10 > ~this.field9310) {
                           var4[var5] = 0;
                           if (!var3) {
                              ++var5;
                              continue;
                           }
                        }
                     }

                     if (~var10 <= ~this.field9310) {
                        var4[var5] = 4096;
                        ++var5;
                     } else {
                        int var12 = var8 - var9;
                        if (var3) {
                           var12 += 4;
                        }

                        while(~var12 > -1) {
                           var12 += 4;
                        }

                        if (var3) {
                           var12 -= 4;
                        }

                        while(~var12 < -4) {
                           var12 -= 4;
                        }

                        if (~var12 < -1) {
                           var4[var5] = 0;
                           if (var3) {
                              var4[var5] = 4096;
                              ++var5;
                           } else {
                              ++var5;
                           }
                        } else {
                           var4[var5] = 4096;
                           ++var5;
                        }
                     }
                  } while(~var5 > ~class678.field10127);
               }
            }

            return var4;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field9316[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(IBLha;)Lqda;"
   )
   public static final class697 method4691(int arg0, byte arg1, class610 arg2) {
      try {
         ++field9308;
         if (arg1 != 24) {
            return null;
         } else {
            class564 var3 = class671.method4942((byte)112, arg2, arg0, true);
            return var3 == null ? null : var3.field8382;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9316[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9316[2] : field9316[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method4692(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 0) {
            return true;
         } else {
            ++field9315;
            return (2048 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9316[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method4693(byte arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         ++field9305;
         int var3 = arg1.length();
         int var4 = 0;
         int var5 = 0;
         if (var2) {
            char var6 = arg1.charAt(var5);
            if (var6 != '<') {
               if (var6 == '>') {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }

         while(true) {
            int var10000;
            if (~var3 >= ~var5) {
               StringBuffer var7 = new StringBuffer(var3 + var4);
               var10000 = arg0;
               if (!var2) {
                  if (arg0 > -27) {
                     return null;
                  }

                  int var8 = 0;
                  String var13;
                  if (var2) {
                     var13 = arg1;
                  } else if (~var8 <= ~var3) {
                     var13 = var7.toString();
                     if (!var2) {
                        return var13;
                     }
                  } else {
                     var13 = arg1;
                  }

                  while(true) {
                     char var9 = var13.charAt(var8);
                     if (~var9 == -61) {
                        var7.append(field9316[7]);
                        if (var2) {
                           if (var9 == '>') {
                              var7.append(field9316[6]);
                              if (var2) {
                                 var7.append(var9);
                                 ++var8;
                              } else {
                                 ++var8;
                              }
                           } else {
                              var7.append(var9);
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     } else if (var9 == '>') {
                        var7.append(field9316[6]);
                        if (var2) {
                           var7.append(var9);
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        var7.append(var9);
                        ++var8;
                     }

                     if (~var8 <= ~var3) {
                        var13 = var7.toString();
                        if (!var2) {
                           return var13;
                        }
                     } else {
                        var13 = arg1;
                     }
                  }
               }
            } else {
               var10000 = arg1.charAt(var5);
            }

            int var12 = var10000;
            if (var12 != 60) {
               if (var12 == 62) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field9316[5] + arg0 + ',' + (arg1 != null ? field9316[2] : field9316[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4694(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4695(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
