import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class642 {
   @OriginalMember(
      owner = "client!aaa",
      name = "g",
      descriptor = "I"
   )
   public int field9348;
   @OriginalMember(
      owner = "client!aaa",
      name = "s",
      descriptor = "[B"
   )
   private byte[] field9361;
   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9366 = new String[]{method4617(method4616("6C|0H\u007f")), method4617(method4616("6C|0K\u007f")), method4617(method4616("9Wqr")), method4617(method4616(",\f30w")), method4617(method4616("6C|06>Ltj4\u007f")), method4617(method4616("6C|0I\u007f"))};
   @OriginalMember(
      owner = "client!aaa",
      name = "f",
      descriptor = "Lsd;"
   )
   public static class101 field9357 = new class101(30, 2);
   @OriginalMember(
      owner = "client!aaa",
      name = "t",
      descriptor = "I"
   )
   public static int field9346;
   @OriginalMember(
      owner = "client!aaa",
      name = "n",
      descriptor = "I"
   )
   public int field9350;
   @OriginalMember(
      owner = "client!aaa",
      name = "i",
      descriptor = "I"
   )
   public int field9352;
   @OriginalMember(
      owner = "client!aaa",
      name = "o",
      descriptor = "I"
   )
   public static int field9362;
   @OriginalMember(
      owner = "client!aaa",
      name = "m",
      descriptor = "I"
   )
   public int field9364;
   @OriginalMember(
      owner = "client!aaa",
      name = "l",
      descriptor = "Lhaa;"
   )
   public class87 field9358;
   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "Ljava/awt/datatransfer/Clipboard;"
   )
   public static Clipboard field9365;
   @OriginalMember(
      owner = "client!aaa",
      name = "r",
      descriptor = "[I"
   )
   public int[] field9347;
   @OriginalMember(
      owner = "client!aaa",
      name = "c",
      descriptor = "[I"
   )
   public int[] field9349;
   @OriginalMember(
      owner = "client!aaa",
      name = "k",
      descriptor = "[I"
   )
   public int[] field9351;
   @OriginalMember(
      owner = "client!aaa",
      name = "p",
      descriptor = "[I"
   )
   public int[] field9353;
   @OriginalMember(
      owner = "client!aaa",
      name = "j",
      descriptor = "[I"
   )
   public int[] field9356;
   @OriginalMember(
      owner = "client!aaa",
      name = "h",
      descriptor = "[I"
   )
   public int[] field9360;
   @OriginalMember(
      owner = "client!aaa",
      name = "d",
      descriptor = "[Lhaa;"
   )
   public class87[] field9363;
   @OriginalMember(
      owner = "client!aaa",
      name = "e",
      descriptor = "[[B"
   )
   public byte[][] field9359;
   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "[[I"
   )
   public int[][] field9354;
   @OriginalMember(
      owner = "client!aaa",
      name = "q",
      descriptor = "[[I"
   )
   public int[][] field9355;

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4613(int arg0) {
      try {
         field9357 = null;
         field9365 = null;
         if (arg0 != 0) {
            field9365 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9366[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method4614(byte arg0) {
      int var1 = client.field4530;

      try {
         byte var4;
         label36: {
            int var2 = 52 % ((arg0 - 51) / 43);
            ++field9362;
            if (~class56.field704 <= -97) {
               int var3 = class24.method159(1);
               if (~var3 >= -101) {
                  var4 = 4;
                  class379.method2927((byte)-88);
                  if (var1 == 0) {
                     break label36;
                  }
               }

               if (var3 > 500) {
                  if (var3 > 1000) {
                     var4 = 1;
                     class564.method4172(-8519, true);
                     if (var1 == 0) {
                        break label36;
                     }
                  }

                  var4 = 2;
                  class492.method3645((byte)116);
                  if (var1 == 0) {
                     break label36;
                  }
               }

               class30.method216(-89);
               var4 = 3;
               if (var1 == 0) {
                  break label36;
               }
            }

            var4 = 1;
            class564.method4172(-8519, true);
         }

         if (~class261.field3566.field9464.method4225(105) != -1) {
            class261.field3566.method4677(class261.field3566.field9465, 60, 0);
            class428.method3261(false, -122, 0);
         }

         class471.method3510((byte)118);
         return var4;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9366[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(B[B)V"
   )
   private final void method4615(byte arg0, byte[] arg1) {
      int var3 = client.field4530;

      try {
         int var4 = 56 % ((80 - arg0) / 45);
         ++field9346;
         class128 var5 = new class128(class656.method4718(arg1, (byte)-65));
         int var6 = var5.method1104(255);
         if (~var6 <= -6 && var6 <= 6) {
            label531: {
               if (~var6 <= -7) {
                  this.field9352 = var5.method1041(4758);
                  if (var3 == 0) {
                     break label531;
                  }
               }

               this.field9352 = 0;
            }

            int var7 = var5.method1104(255);
            int var8 = (var7 & 1) == 0 ? 0 : 1;
            int var9 = (2 & var7) == 0 ? 0 : 1;
            this.field9350 = var5.method1038((byte)-97);
            int var10 = 0;
            this.field9347 = new int[this.field9350];
            int var11 = -1;
            int var12 = 0;
            if (var3 != 0) {
               this.field9347[var12] = var10 += var5.method1038((byte)-102);
               if (this.field9347[var12] > var11) {
                  var11 = this.field9347[var12];
               }

               ++var12;
            }

            while(true) {
               while(~this.field9350 < ~var12) {
                  this.field9347[var12] = var10 += var5.method1038((byte)-102);
                  if (this.field9347[var12] > var11) {
                     var11 = this.field9347[var12];
                  }

                  ++var12;
               }

               this.field9364 = var11 - -1;
               if (var3 == 0) {
                  if (var9 != 0) {
                     this.field9359 = new byte[this.field9364][];
                  }

                  this.field9353 = new int[this.field9364];
                  this.field9356 = new int[this.field9364];
                  this.field9351 = new int[this.field9364];
                  this.field9354 = new int[this.field9364][];
                  this.field9360 = new int[this.field9364];
                  if (var8 != 0) {
                     this.field9349 = new int[this.field9364];
                     int var13 = 0;
                     if (var3 != 0) {
                        this.field9349[var13] = -1;
                        ++var13;
                     }

                     while(true) {
                        while(~var13 > ~this.field9364) {
                           this.field9349[var13] = -1;
                           ++var13;
                        }

                        int var14 = 0;
                        if (var3 == 0) {
                           class642 var10000;
                           label451: {
                              if (var3 != 0) {
                                 var10000 = this;
                              } else if (this.field9350 <= var14) {
                                 var10000 = this;
                                 if (var3 == 0) {
                                    break label451;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              while(true) {
                                 var10000.field9349[this.field9347[var14]] = var5.method1041(4758);
                                 ++var14;
                                 if (this.field9350 <= var14) {
                                    var10000 = this;
                                    if (var3 == 0) {
                                       break;
                                    }
                                 } else {
                                    var10000 = this;
                                 }
                              }
                           }

                           var10000.field9358 = new class87(this.field9349);
                           break;
                        }

                        ++var13;
                     }
                  }

                  int var15 = 0;
                  if (var3 != 0) {
                     this.field9360[this.field9347[var15]] = var5.method1041(4758);
                     ++var15;
                  }

                  while(true) {
                     while(this.field9350 > var15) {
                        this.field9360[this.field9347[var15]] = var5.method1041(4758);
                        ++var15;
                     }

                     if (var3 == 0) {
                        if (var9 != 0) {
                           int var16 = 0;
                           if (var3 != 0 || this.field9350 > var16) {
                              do {
                                 byte[] var17 = new byte[64];
                                 var5.method1102(64, var17, 0, (byte)-118);
                                 this.field9359[this.field9347[var16]] = var17;
                                 ++var16;
                              } while(this.field9350 > var16);
                           }
                        }

                        int var18 = 0;
                        if (var3 != 0) {
                           this.field9353[this.field9347[var18]] = var5.method1041(4758);
                           ++var18;
                        }

                        while(true) {
                           while(~var18 > ~this.field9350) {
                              this.field9353[this.field9347[var18]] = var5.method1041(4758);
                              ++var18;
                           }

                           int var19 = 0;
                           if (var3 == 0) {
                              if (var3 != 0) {
                                 this.field9356[this.field9347[var19]] = var5.method1038((byte)-113);
                                 ++var19;
                              }

                              while(true) {
                                 while(~var19 > ~this.field9350) {
                                    this.field9356[this.field9347[var19]] = var5.method1038((byte)-113);
                                    ++var19;
                                 }

                                 int var20 = 0;
                                 if (var3 == 0) {
                                    int var21;
                                    int var22;
                                    int var23;
                                    int var24;
                                    int var25;
                                    int var26;
                                    int var27;
                                    int var28;
                                    int var29;
                                    int var30;
                                    int var31;
                                    int var32;
                                    int var35;
                                    if (var3 != 0) {
                                       var21 = this.field9347[var20];
                                       var22 = 0;
                                       var23 = this.field9356[var21];
                                       this.field9354[var21] = new int[var23];
                                       var24 = -1;
                                       var25 = 0;
                                       if (var3 != 0) {
                                          var26 = this.field9354[var21][var25] = var22 += var5.method1038((byte)-110);
                                          if (var24 < var26) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }
                                    } else {
                                       if (this.field9350 <= var20) {
                                          var35 = var8;
                                          if (var3 == 0) {
                                             if (var8 == 0) {
                                                return;
                                             }

                                             this.field9363 = new class87[var11 + 1];
                                             this.field9355 = new int[var11 - -1][];
                                             var27 = 0;
                                             if (var3 == 0 && ~var27 <= ~this.field9350) {
                                                return;
                                             }

                                             label278:
                                             do {
                                                var28 = this.field9347[var27];
                                                var29 = this.field9356[var28];
                                                this.field9355[var28] = new int[this.field9351[var28]];
                                                var30 = 0;
                                                if (var3 != 0) {
                                                   this.field9355[var28][var30] = -1;
                                                   ++var30;
                                                }

                                                while(true) {
                                                   while(~this.field9351[var28] < ~var30) {
                                                      this.field9355[var28][var30] = -1;
                                                      ++var30;
                                                   }

                                                   var31 = 0;
                                                   if (var3 == 0) {
                                                      if (var3 != 0) {
                                                         if (this.field9354[var28] == null) {
                                                            if (var3 != 0) {
                                                               var32 = this.field9354[var28][var31];
                                                               this.field9355[var28][var32] = var5.method1041(4758);
                                                               ++var31;
                                                            } else {
                                                               this.field9355[var28][var31] = var5.method1041(4758);
                                                               ++var31;
                                                            }
                                                         } else {
                                                            var32 = this.field9354[var28][var31];
                                                            this.field9355[var28][var32] = var5.method1041(4758);
                                                            ++var31;
                                                         }
                                                      }

                                                      while(true) {
                                                         while(~var31 > ~var29) {
                                                            if (this.field9354[var28] == null) {
                                                               if (var3 != 0) {
                                                                  var32 = this.field9354[var28][var31];
                                                                  this.field9355[var28][var32] = var5.method1041(4758);
                                                                  ++var31;
                                                               } else {
                                                                  this.field9355[var28][var31] = var5.method1041(4758);
                                                                  ++var31;
                                                               }
                                                            } else {
                                                               var32 = this.field9354[var28][var31];
                                                               this.field9355[var28][var32] = var5.method1041(4758);
                                                               ++var31;
                                                            }
                                                         }

                                                         this.field9363[var28] = new class87(this.field9355[var28]);
                                                         if (var3 == 0) {
                                                            ++var27;
                                                            continue label278;
                                                         }

                                                         var32 = this.field9354[var28][var31];
                                                         this.field9355[var28][var32] = var5.method1041(4758);
                                                         ++var31;
                                                      }
                                                   }

                                                   ++var30;
                                                }
                                             } while(~var27 > ~this.field9350);

                                             return;
                                          }
                                       } else {
                                          var35 = this.field9347[var20];
                                       }

                                       var21 = var35;
                                       var22 = 0;
                                       var23 = this.field9356[var21];
                                       this.field9354[var21] = new int[var23];
                                       var24 = -1;
                                       var25 = 0;
                                       if (var3 != 0) {
                                          var26 = this.field9354[var21][var25] = var22 += var5.method1038((byte)-110);
                                          if (var24 < var26) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }
                                    }

                                    while(true) {
                                       while(~var23 < ~var25) {
                                          var26 = this.field9354[var21][var25] = var22 += var5.method1038((byte)-110);
                                          if (var24 < var26) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }

                                       this.field9351[var21] = var24 + 1;
                                       var35 = ~var23;
                                       if (var3 == 0) {
                                          if (var35 == ~(var24 + 1)) {
                                             this.field9354[var21] = null;
                                          }

                                          ++var20;
                                          if (this.field9350 <= var20) {
                                             var35 = var8;
                                             if (var3 == 0) {
                                                if (var8 == 0) {
                                                   return;
                                                }

                                                this.field9363 = new class87[var11 + 1];
                                                this.field9355 = new int[var11 - -1][];
                                                var27 = 0;
                                                if (var3 == 0 && ~var27 <= ~this.field9350) {
                                                   return;
                                                }

                                                label195:
                                                do {
                                                   var28 = this.field9347[var27];
                                                   var29 = this.field9356[var28];
                                                   this.field9355[var28] = new int[this.field9351[var28]];
                                                   var30 = 0;
                                                   if (var3 != 0) {
                                                      this.field9355[var28][var30] = -1;
                                                      ++var30;
                                                   }

                                                   while(true) {
                                                      while(~this.field9351[var28] < ~var30) {
                                                         this.field9355[var28][var30] = -1;
                                                         ++var30;
                                                      }

                                                      var31 = 0;
                                                      if (var3 == 0) {
                                                         if (var3 != 0) {
                                                            if (this.field9354[var28] == null) {
                                                               if (var3 != 0) {
                                                                  var32 = this.field9354[var28][var31];
                                                                  this.field9355[var28][var32] = var5.method1041(4758);
                                                                  ++var31;
                                                               } else {
                                                                  this.field9355[var28][var31] = var5.method1041(4758);
                                                                  ++var31;
                                                               }
                                                            } else {
                                                               var32 = this.field9354[var28][var31];
                                                               this.field9355[var28][var32] = var5.method1041(4758);
                                                               ++var31;
                                                            }
                                                         }

                                                         while(true) {
                                                            while(~var31 > ~var29) {
                                                               if (this.field9354[var28] == null) {
                                                                  if (var3 != 0) {
                                                                     var32 = this.field9354[var28][var31];
                                                                     this.field9355[var28][var32] = var5.method1041(4758);
                                                                     ++var31;
                                                                  } else {
                                                                     this.field9355[var28][var31] = var5.method1041(4758);
                                                                     ++var31;
                                                                  }
                                                               } else {
                                                                  var32 = this.field9354[var28][var31];
                                                                  this.field9355[var28][var32] = var5.method1041(4758);
                                                                  ++var31;
                                                               }
                                                            }

                                                            this.field9363[var28] = new class87(this.field9355[var28]);
                                                            if (var3 == 0) {
                                                               ++var27;
                                                               continue label195;
                                                            }

                                                            var32 = this.field9354[var28][var31];
                                                            this.field9355[var28][var32] = var5.method1041(4758);
                                                            ++var31;
                                                         }
                                                      }

                                                      ++var30;
                                                   }
                                                } while(~var27 > ~this.field9350);

                                                return;
                                             }
                                          } else {
                                             var35 = this.field9347[var20];
                                          }

                                          var21 = var35;
                                          var22 = 0;
                                          var23 = this.field9356[var21];
                                          this.field9354[var21] = new int[var23];
                                          var24 = -1;
                                          var25 = 0;
                                          if (var3 != 0) {
                                             var26 = this.field9354[var21][var25] = var22 += var5.method1038((byte)-110);
                                             if (var24 < var26) {
                                                var24 = var26;
                                             }

                                             ++var25;
                                          }
                                       } else {
                                          var26 = var35;
                                          if (var24 < var26) {
                                             var24 = var26;
                                          }

                                          ++var25;
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }

                           ++var18;
                        }
                     }

                     ++var15;
                  }
               }

               if (var9 > var11) {
                  var11 = this.field9347[var12];
               }

               ++var12;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var34) {
         throw class670.method4877(var34, field9366[1] + arg0 + ',' + (arg1 != null ? field9366[3] : field9366[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "<init>",
      descriptor = "([BI[B)V"
   )
   public class642(byte[] arg0, int arg1, byte[] arg2) {
      int var4 = client.field4530;
      super();

      try {
         this.field9348 = class57.method479(arg0, arg0.length, -31850);
         if (this.field9348 != arg1) {
            throw new RuntimeException();
         } else {
            if (arg2 != null) {
               if (arg2.length != 64) {
                  throw new RuntimeException();
               }

               this.field9361 = class246.method1840(true, arg0.length, arg0, 0);
               int var5 = 0;
               if (var4 != 0 || ~var5 > -65) {
                  do {
                     if (this.field9361[var5] != arg2[var5]) {
                        throw new RuntimeException();
                     }

                     ++var5;
                  } while(~var5 > -65);
               }
            }

            this.method4615((byte)-23, arg0);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9366[4] + (arg0 != null ? field9366[3] : field9366[2]) + ',' + arg1 + ',' + (arg2 != null ? field9366[3] : field9366[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4617(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
