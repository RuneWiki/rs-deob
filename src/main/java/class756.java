import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class756 extends class70 {
   @OriginalMember(
      owner = "client!ika",
      name = "S",
      descriptor = "I"
   )
   private int field11070 = 10;
   @OriginalMember(
      owner = "client!ika",
      name = "N",
      descriptor = "I"
   )
   private int field11074 = 0;
   @OriginalMember(
      owner = "client!ika",
      name = "K",
      descriptor = "I"
   )
   private int field11066 = 2048;
   @OriginalMember(
      owner = "client!ika",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11078 = new String[]{method5478(method5477("J(o5\b\u000b")), method5478(method5477("J(o5\u000b\u000b")), method5478(method5477("J(o5\u000e\u000b")), method5478(method5477("J(o5\u000f\u000b")), method5478(method5477("J(o5\t\u000b")), method5478(method5477("Xm 59")), method5478(method5477("M6bw")), method5478(method5477("J(o5\n\u000b")), method5478(method5477("J(o5\u0007\u000b"))};
   @OriginalMember(
      owner = "client!ika",
      name = "M",
      descriptor = "Lse;"
   )
   public static class6 field11065 = new class6(12, 8);
   @OriginalMember(
      owner = "client!ika",
      name = "U",
      descriptor = "I"
   )
   public static int field11067;
   @OriginalMember(
      owner = "client!ika",
      name = "L",
      descriptor = "I"
   )
   public static int field11072;
   @OriginalMember(
      owner = "client!ika",
      name = "O",
      descriptor = "I"
   )
   public static int field11073;
   @OriginalMember(
      owner = "client!ika",
      name = "I",
      descriptor = "I"
   )
   public static int field11075;
   @OriginalMember(
      owner = "client!ika",
      name = "R",
      descriptor = "I"
   )
   public static int field11076;
   @OriginalMember(
      owner = "client!ika",
      name = "J",
      descriptor = "I"
   )
   public static int field11077;
   @OriginalMember(
      owner = "client!ika",
      name = "Q",
      descriptor = "Lpd;"
   )
   public static class648 field11071;
   @OriginalMember(
      owner = "client!ika",
      name = "P",
      descriptor = "[I"
   )
   private int[] field11068;
   @OriginalMember(
      owner = "client!ika",
      name = "T",
      descriptor = "[I"
   )
   private int[] field11069;

   @OriginalMember(
      owner = "client!ika",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         ++field11073;
         if (arg0 < -36) {
            this.method5473((byte)107);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11078[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method5473(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field11067;
         this.field11068 = new int[this.field11070 + 1];
         this.field11069 = new int[this.field11070 + 1];
         int var3 = 0;
         int var4 = 4096 / this.field11070;
         int var5 = this.field11066 * var4 >> 12;
         int var6 = 0;
         if (var2) {
            this.field11069[var6] = var3;
            this.field11068[var6] = var3 + var5;
            var3 += var4;
            ++var6;
         }

         while(true) {
            while(var6 < this.field11070) {
               this.field11069[var6] = var3;
               this.field11068[var6] = var3 + var5;
               var3 += var4;
               ++var6;
            }

            this.field11069[this.field11070] = 4096;
            this.field11068[this.field11070] = 4096 - -this.field11068[0];
            if (!var2) {
               if (arg0 != 107) {
                  this.field11070 = -35;
                  return;
               }

               return;
            }

            var3 = arg0 + 107;
            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11078[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(ILuia;)V"
   )
   public static final void method5474(int arg0, class592 arg1) {
      try {
         arg1.field8732 = null;
         ++field11076;
         if (arg0 > class703.field10282) {
            class480.field6677.method4637(arg1, (byte)96);
            ++class703.field10282;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11078[4] + arg0 + ',' + (arg1 != null ? field11078[5] : field11078[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "j",
      descriptor = "(I)V"
   )
   public static final void method5475(int arg0) {
      try {
         class456.field6290 = null;
         class497.field6954 = null;
         class171.field2227 = -1;
         class657.field9802 = null;
         class37.field522 = null;
         class175.field2258 = -1;
         class781.field11385 = -1;
         if (arg0 != 8111) {
            field11065 = null;
         }

         class543.field7934 = null;
         class134.field1704 = null;
         class353.field4942 = -1;
         class308.field4310 = null;
         ++field11075;
         class194.field2462.method297(0);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11078[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "<init>",
      descriptor = "()V"
   )
   public class756() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label46: {
            label45: {
               label44: {
                  if (arg2 != 0) {
                     if (~arg2 == -2) {
                        break label44;
                     }

                     if (arg2 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field11070 = arg1.method640(255);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field11066 = arg1.method603(-2);
               if (!var4) {
                  break label46;
               }
            }

            this.field11074 = arg1.method640(255);
         }

         if (arg0 >= -34) {
            method5476(62);
         }

         ++field11077;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11078[8] + arg0 + ',' + (arg1 != null ? field11078[5] : field11078[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field11072;
         int[] var4 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            method5476(-101);
         }

         if (super.field940.field270) {
            int var5 = class502.field6979[arg1];
            if (~this.field11074 == -1) {
               label205: {
                  short var6 = 0;
                  int var7 = 0;
                  if (var3) {
                     if (~var5 <= ~this.field11069[var7]) {
                        if (~var5 > ~this.field11069[var7 + 1]) {
                           if (~var5 > ~this.field11068[var7]) {
                              var6 = 4096;
                              if (var3) {
                                 ++var7;
                              } else {
                                 class349.method2764(var4, 0, class262.field3328, var6);
                                 if (!var3) {
                                    break label205;
                                 }

                                 ++var7;
                              }
                           } else {
                              class349.method2764(var4, 0, class262.field3328, var6);
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
                     while(var7 < this.field11070) {
                        if (~var5 <= ~this.field11069[var7]) {
                           if (~var5 > ~this.field11069[var7 + 1]) {
                              if (~var5 > ~this.field11068[var7]) {
                                 var6 = 4096;
                                 if (var3) {
                                    ++var7;
                                 } else {
                                    class349.method2764(var4, 0, class262.field3328, var6);
                                    if (!var3) {
                                       break label204;
                                    }

                                    ++var7;
                                 }
                              } else {
                                 class349.method2764(var4, 0, class262.field3328, var6);
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

                     class349.method2764(var4, 0, class262.field3328, var6);
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
            if (var3 || ~var8 > ~class262.field3328) {
               do {
                  int var9;
                  short var10;
                  label78: {
                     int var11;
                     label77: {
                        label76: {
                           var9 = 0;
                           var10 = 0;
                           var11 = class17.field290[var8];
                           int var12 = this.field11074;
                           if (~var12 != -2) {
                              if (~var12 == -3) {
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

                        var9 = (var5 + -4096 + var11 >> 1) + 2048;
                        if (!var3) {
                           break label78;
                        }
                     }

                     var9 = 2048 - -(var11 - var5 >> 1);
                  }

                  label136: {
                     int var13 = 0;
                     if (var3) {
                        if (~var9 <= ~this.field11069[var13]) {
                           if (this.field11069[var13 + 1] > var9) {
                              if (~this.field11068[var13] < ~var9) {
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
                        while(~var13 > ~this.field11070) {
                           if (~var9 <= ~this.field11069[var13]) {
                              if (this.field11069[var13 + 1] > var9) {
                                 if (~this.field11068[var13] < ~var9) {
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
               } while(~var8 > ~class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field11078[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method5476(int arg0) {
      try {
         field11071 = null;
         if (arg0 < 36) {
            field11065 = null;
         }

         field11065 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11078[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
