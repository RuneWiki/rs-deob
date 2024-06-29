import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class577 extends class629 {
   @OriginalMember(
      owner = "client!ii",
      name = "P",
      descriptor = "I"
   )
   private int field8306 = 10;
   @OriginalMember(
      owner = "client!ii",
      name = "N",
      descriptor = "I"
   )
   private int field8309 = 0;
   @OriginalMember(
      owner = "client!ii",
      name = "H",
      descriptor = "I"
   )
   private int field8318 = 2048;
   @OriginalMember(
      owner = "client!ii",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8319 = new String[]{method4267(method4266("IsLss")), method4267(method4266("No\u000eR")), method4267(method4266("[4L\u0010&")), method4267(method4266("IsLws")), method4267(method4266("IsLns")), method4267(method4266("IsLps")), method4267(method4266("IsL{s")), method4267(method4266("IsLts")), method4267(method4266("IsLqs"))};
   @OriginalMember(
      owner = "client!ii",
      name = "D",
      descriptor = "Luw;"
   )
   public static class435 field8308 = new class435(5, 8);
   @OriginalMember(
      owner = "client!ii",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field8316 = new int[1024];
   @OriginalMember(
      owner = "client!ii",
      name = "J",
      descriptor = "I"
   )
   public static int field8305;
   @OriginalMember(
      owner = "client!ii",
      name = "Q",
      descriptor = "I"
   )
   public static int field8307;
   @OriginalMember(
      owner = "client!ii",
      name = "L",
      descriptor = "I"
   )
   public static int field8310;
   @OriginalMember(
      owner = "client!ii",
      name = "M",
      descriptor = "I"
   )
   public static int field8311;
   @OriginalMember(
      owner = "client!ii",
      name = "O",
      descriptor = "I"
   )
   public static int field8312;
   @OriginalMember(
      owner = "client!ii",
      name = "K",
      descriptor = "I"
   )
   public static int field8315;
   @OriginalMember(
      owner = "client!ii",
      name = "E",
      descriptor = "I"
   )
   public static int field8317;
   @OriginalMember(
      owner = "client!ii",
      name = "F",
      descriptor = "[I"
   )
   private int[] field8313;
   @OriginalMember(
      owner = "client!ii",
      name = "G",
      descriptor = "[I"
   )
   private int[] field8314;

   @OriginalMember(
      owner = "client!ii",
      name = "c",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method4262(int arg0, int arg1, int arg2) {
      try {
         ++field8305;
         if (arg1 != 0) {
            field8316 = null;
         }

         return ~(arg0 & 2048) != -1 && (55 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8319[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "(II)[I",
      line = 15
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 2048) {
            return null;
         } else {
            ++field8312;
            int[] var4 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               int var5 = class442.field6448[arg0];
               if (~this.field8309 == -1) {
                  label205: {
                     short var6 = 0;
                     int var7 = 0;
                     if (var3) {
                        if (this.field8313[var7] <= var5) {
                           if (~var5 > ~this.field8313[var7 + 1]) {
                              if (this.field8314[var7] > var5) {
                                 var6 = 4096;
                                 if (var3) {
                                    ++var7;
                                 } else {
                                    class365.method2852(var4, 0, class66.field1214, var6);
                                    if (!var3) {
                                       break label205;
                                    }

                                    ++var7;
                                 }
                              } else {
                                 class365.method2852(var4, 0, class66.field1214, var6);
                                 if (!var3) {
                                    break label205;
                                 }

                                 ++var7;
                              }
                           } else {
                              ++var7;
                           }
                        } else {
                           ++var7;
                        }
                     }

                     label204:
                     while(true) {
                        while(this.field8306 > var7) {
                           if (this.field8313[var7] <= var5) {
                              if (~var5 > ~this.field8313[var7 + 1]) {
                                 if (this.field8314[var7] > var5) {
                                    var6 = 4096;
                                    if (var3) {
                                       ++var7;
                                    } else {
                                       class365.method2852(var4, 0, class66.field1214, var6);
                                       if (!var3) {
                                          break label204;
                                       }

                                       ++var7;
                                    }
                                 } else {
                                    class365.method2852(var4, 0, class66.field1214, var6);
                                    if (!var3) {
                                       break label204;
                                    }

                                    ++var7;
                                 }
                              } else {
                                 ++var7;
                              }
                           } else {
                              ++var7;
                           }
                        }

                        class365.method2852(var4, 0, class66.field1214, var6);
                        if (!var3) {
                           break;
                        }

                        ++var7;
                     }
                  }

                  if (!var3) {
                     return var4;
                  }
               }

               int var8 = 0;
               if (var3 || class66.field1214 > var8) {
                  do {
                     int var9;
                     short var10;
                     label78: {
                        int var11;
                        label77: {
                           label76: {
                              var9 = 0;
                              var10 = 0;
                              var11 = class429.field6201[var8];
                              int var12 = this.field8309;
                              if (var12 != 1) {
                                 if (var12 == 2) {
                                    break label76;
                                 }

                                 if (var12 != 3) {
                                    break label78;
                                 }

                                 if (!var3) {
                                    break label77;
                                 }
                              }

                              var9 = var11;
                              if (!var3) {
                                 break label78;
                              }
                           }

                           var9 = (-4096 - (-var5 - var11) >> 1) + 2048;
                           if (!var3) {
                              break label78;
                           }
                        }

                        var9 = (-var5 + var11 >> 1) + 2048;
                     }

                     label136: {
                        int var13 = 0;
                        if (var3) {
                           if (~this.field8313[var13] >= ~var9) {
                              if (~this.field8313[var13 + 1] < ~var9) {
                                 if (this.field8314[var13] > var9) {
                                    var10 = 4096;
                                    if (var3) {
                                       ++var13;
                                    } else {
                                       var4[var8] = var10;
                                       if (!var3) {
                                          break label136;
                                       }

                                       ++var13;
                                    }
                                 } else {
                                    var4[var8] = var10;
                                    if (!var3) {
                                       break label136;
                                    }

                                    ++var13;
                                 }
                              } else {
                                 ++var13;
                              }
                           } else {
                              ++var13;
                           }
                        }

                        label135:
                        while(true) {
                           while(~var13 > ~this.field8306) {
                              if (~this.field8313[var13] >= ~var9) {
                                 if (~this.field8313[var13 + 1] < ~var9) {
                                    if (this.field8314[var13] > var9) {
                                       var10 = 4096;
                                       if (var3) {
                                          ++var13;
                                       } else {
                                          var4[var8] = var10;
                                          if (!var3) {
                                             break label135;
                                          }

                                          ++var13;
                                       }
                                    } else {
                                       var4[var8] = var10;
                                       if (!var3) {
                                          break label135;
                                       }

                                       ++var13;
                                    }
                                 } else {
                                    ++var13;
                                 }
                              } else {
                                 ++var13;
                              }
                           }

                           var4[var8] = var10;
                           if (!var3) {
                              break;
                           }

                           ++var13;
                        }
                     }

                     ++var8;
                  } while(class66.field1214 > var8);
               }
            }

            return var4;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field8319[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "<init>",
      descriptor = "()V",
      line = 265
   )
   public class577() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V",
      line = 139
   )
   public static final void method4263(String arg0, boolean arg1, String arg2, String arg3, String arg4, int arg5, int arg6) {
      try {
         class593.method4375(arg6, 99, -1, arg5, arg3, (String)null, arg2, arg0, arg4);
         ++field8317;
         if (!arg1) {
            field8308 = null;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8319[0] + (arg0 != null ? field8319[2] : field8319[1]) + ',' + arg1 + ',' + (arg2 != null ? field8319[2] : field8319[1]) + ',' + (arg3 != null ? field8319[2] : field8319[1]) + ',' + (arg4 != null ? field8319[2] : field8319[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 158
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label46: {
            label45: {
               label44: {
                  ++field8315;
                  if (~arg2 != -1) {
                     if (arg2 == 1) {
                        break label44;
                     }

                     if (~arg2 != -3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field8306 = arg0.method3564((byte)-57);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field8318 = arg0.method3565(true);
               if (!var4) {
                  break label46;
               }
            }

            this.field8309 = arg0.method3564((byte)-82);
         }

         if (arg1 != 0) {
            this.method45(9, 45);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8319[6] + (arg0 != null ? field8319[2] : field8319[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "h",
      descriptor = "(I)V",
      line = 203
   )
   public static void method4264(int arg0) {
      try {
         int var1 = 104 / ((arg0 - 28) / 37);
         field8316 = null;
         field8308 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8319[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "g",
      descriptor = "(I)V",
      line = 217
   )
   private final void method4265(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "(I)V",
      line = 248
   )
   public final void method901(int arg0) {
      try {
         if (arg0 != 245880940) {
            this.field8318 = 0;
         }

         this.method4265(-101);
         ++field8307;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8319[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4266(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4267(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
