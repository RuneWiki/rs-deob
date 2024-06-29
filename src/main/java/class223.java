import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class223 {
   @OriginalMember(
      owner = "client!bda",
      name = "j",
      descriptor = "Lsia;"
   )
   private class407 field2790 = new class407(64);
   @OriginalMember(
      owner = "client!bda",
      name = "e",
      descriptor = "Lww;"
   )
   private class339 field2789;
   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "I"
   )
   public int field2797;
   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2798 = new String[]{method1789(method1788("BcD(Q\b")), method1789(method1788("BcD(V\b")), method1789(method1788("NrIj")), method1789(method1788("[)\u000b(m")), method1789(method1788("BcD(,IiLr.\b")), method1789(method1788("BcD(R\b")), method1789(method1788("BcD(U\b")), method1789(method1788("BcD(W\b")), method1789(method1788("BcD(S\b")), method1789(method1788("BcD(T\b"))};
   @OriginalMember(
      owner = "client!bda",
      name = "i",
      descriptor = "I"
   )
   public static int field2788;
   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "I"
   )
   public static int field2791;
   @OriginalMember(
      owner = "client!bda",
      name = "c",
      descriptor = "I"
   )
   public static int field2793;
   @OriginalMember(
      owner = "client!bda",
      name = "d",
      descriptor = "I"
   )
   public static int field2794;
   @OriginalMember(
      owner = "client!bda",
      name = "g",
      descriptor = "I"
   )
   public static int field2795;
   @OriginalMember(
      owner = "client!bda",
      name = "f",
      descriptor = "I"
   )
   public static int field2796;
   @OriginalMember(
      owner = "client!bda",
      name = "h",
      descriptor = "Lum;"
   )
   public static class594 field2792;

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method1781(int arg0, int arg1) {
      try {
         ++field2788;
         if (arg1 != 8) {
            method1781(90, 90);
         }

         class191 var2 = (class191)class705.field10295.method1818(arg1 ^ -9, (long)arg0);
         if (var2 != null) {
            class667 var3 = var2.field2423.method2777(-689277144);
            if (var3 != null) {
               double var4 = var2.field2423.method2771(arg1 + -8);
               if (var4 >= (double)var3.method4871(arg1 ^ 8) && var4 <= (double)var3.method4872((byte)-86)) {
                  return var3.method4873(0);
               }
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2798[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IB)Lqg;"
   )
   public final class304 method1782(int arg0, byte arg1) {
      try {
         ++field2796;
         class407 var3 = this.field2790;
         class304 var4;
         synchronized(this.field2790) {
            var4 = (class304)this.field2790.method3192((long)arg0, (byte)-111);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field2789;
            byte[] var7;
            synchronized(this.field2789) {
               if (arg1 < 110) {
                  return null;
               }

               var7 = this.field2789.method2697(arg0, 47, false);
            }

            class304 var8 = new class304();
            if (var7 != null) {
               var8.method2436(0, new class66(var7));
            }

            class407 var9 = this.field2790;
            synchronized(this.field2790) {
               this.field2790.method3190(var8, (long)arg0, 8);
               return var8;
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field2798[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1783(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field2791;
         short var2 = 1024;
         short var3 = 3072;
         if (class400.field5500) {
            if (class212.field2698) {
               var2 = 2048;
            }

            var3 = 4096;
         }

         if ((float)var2 > class250.field3162) {
            class250.field3162 = (float)var2;
            if (var1) {
               class623.field9202 -= 16384.0F;
            }
         }

         while(true) {
            while(class623.field9202 >= 16384.0F) {
               class623.field9202 -= 16384.0F;
            }

            float var10000 = (float)var3;
            float var10001 = class250.field3162;
            if (!var1) {
               if (var10000 < var10001) {
                  class250.field3162 = (float)var3;
                  if (var1) {
                     class623.field9202 += 16384.0F;
                  }
               }

               while(class623.field9202 < 0.0F) {
                  class623.field9202 += 16384.0F;
               }

               int var4 = class70.field942 >> 9;
               int var5 = class95.field1290 >> 9;
               int var6 = class215.method1757(class70.field942, false, class674.field9984, class95.field1290);
               int var7 = 0;
               int var8;
               int var9;
               int var10;
               int var11;
               int var12;
               int var15;
               if (~var4 < -4) {
                  if (var5 > 3) {
                     if (~(class273.field3491 + -4) < ~var4) {
                        if (~(class211.field2689 + -4) < ~var5) {
                           var8 = var4 + -4;
                           if (var1) {
                              var9 = var5 + -4;
                              if (var1) {
                                 var10 = class674.field9984;
                                 if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                                    ++var10;
                                 }

                                 var11 = 0;
                                 if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                                    var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                                 }

                                 if (class659.field9815 != null && class659.field9815[var10] != null) {
                                    var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                                    if (~var7 > ~var12) {
                                       var7 = var12;
                                    }
                                 }

                                 ++var9;
                              }
                           } else if (var8 > var4 - -4) {
                              var8 = (var7 >> 2) * 1536;
                              var15 = ~var8;
                              if (!var1) {
                                 if (var15 < -786433) {
                                    var8 = 786432;
                                 }

                                 if (arg0 > -39) {
                                    method1783((byte)124);
                                 }

                                 if (var8 < 262144) {
                                    var8 = 262144;
                                 }

                                 if (var8 > class422.field5759) {
                                    class422.field5759 += (-class422.field5759 + var8) / 24;
                                    return;
                                 }

                                 if (~class422.field5759 < ~var8) {
                                    class422.field5759 += (-class422.field5759 + var8) / 80;
                                    return;
                                 }

                                 return;
                              }

                              var9 = var15 + -786433;
                              if (var1) {
                                 var10 = class674.field9984;
                                 if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                                    ++var10;
                                 }

                                 var11 = 0;
                                 if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                                    var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                                 }

                                 if (class659.field9815 != null && class659.field9815[var10] != null) {
                                    var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                                    if (~var7 > ~var12) {
                                       var7 = var12;
                                    }
                                 }

                                 ++var9;
                              }
                           } else {
                              var9 = var5 + -4;
                              if (var1) {
                                 var10 = class674.field9984;
                                 if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                                    ++var10;
                                 }

                                 var11 = 0;
                                 if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                                    var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                                 }

                                 if (class659.field9815 != null && class659.field9815[var10] != null) {
                                    var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                                    if (~var7 > ~var12) {
                                       var7 = var12;
                                    }
                                 }

                                 ++var9;
                              }
                           }
                        } else {
                           var8 = (var7 >> 2) * 1536;
                           var15 = ~var8;
                           if (!var1) {
                              if (var15 < -786433) {
                                 var8 = 786432;
                              }

                              if (arg0 > -39) {
                                 method1783((byte)124);
                              }

                              if (var8 < 262144) {
                                 var8 = 262144;
                              }

                              if (var8 > class422.field5759) {
                                 class422.field5759 += (-class422.field5759 + var8) / 24;
                                 return;
                              }

                              if (~class422.field5759 < ~var8) {
                                 class422.field5759 += (-class422.field5759 + var8) / 80;
                                 return;
                              }

                              return;
                           }

                           var9 = var15 + -786433;
                           if (var1) {
                              var10 = class674.field9984;
                              if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                                 ++var10;
                              }

                              var11 = 0;
                              if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                                 var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                              }

                              if (class659.field9815 != null && class659.field9815[var10] != null) {
                                 var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                                 if (~var7 > ~var12) {
                                    var7 = var12;
                                 }
                              }

                              ++var9;
                           }
                        }
                     } else {
                        var8 = (var7 >> 2) * 1536;
                        var15 = ~var8;
                        if (!var1) {
                           if (var15 < -786433) {
                              var8 = 786432;
                           }

                           if (arg0 > -39) {
                              method1783((byte)124);
                           }

                           if (var8 < 262144) {
                              var8 = 262144;
                           }

                           if (var8 > class422.field5759) {
                              class422.field5759 += (-class422.field5759 + var8) / 24;
                              return;
                           }

                           if (~class422.field5759 < ~var8) {
                              class422.field5759 += (-class422.field5759 + var8) / 80;
                              return;
                           }

                           return;
                        }

                        var9 = var15 + -786433;
                        if (var1) {
                           var10 = class674.field9984;
                           if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                              var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                           }

                           if (class659.field9815 != null && class659.field9815[var10] != null) {
                              var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                              if (~var7 > ~var12) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  } else {
                     var8 = (var7 >> 2) * 1536;
                     var15 = ~var8;
                     if (!var1) {
                        if (var15 < -786433) {
                           var8 = 786432;
                        }

                        if (arg0 > -39) {
                           method1783((byte)124);
                        }

                        if (var8 < 262144) {
                           var8 = 262144;
                        }

                        if (var8 > class422.field5759) {
                           class422.field5759 += (-class422.field5759 + var8) / 24;
                           return;
                        }

                        if (~class422.field5759 < ~var8) {
                           class422.field5759 += (-class422.field5759 + var8) / 80;
                           return;
                        }

                        return;
                     }

                     var9 = var15 + -786433;
                     if (var1) {
                        var10 = class674.field9984;
                        if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                           var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                        }

                        if (class659.field9815 != null && class659.field9815[var10] != null) {
                           var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                           if (~var7 > ~var12) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  }
               } else {
                  var8 = (var7 >> 2) * 1536;
                  var15 = ~var8;
                  if (!var1) {
                     if (var15 < -786433) {
                        var8 = 786432;
                     }

                     if (arg0 > -39) {
                        method1783((byte)124);
                     }

                     if (var8 < 262144) {
                        var8 = 262144;
                     }

                     if (var8 > class422.field5759) {
                        class422.field5759 += (-class422.field5759 + var8) / 24;
                        return;
                     }

                     if (~class422.field5759 < ~var8) {
                        class422.field5759 += (-class422.field5759 + var8) / 80;
                        return;
                     }

                     return;
                  }

                  var9 = var15 + -786433;
                  if (var1) {
                     var10 = class674.field9984;
                     if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                        ++var10;
                     }

                     var11 = 0;
                     if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                        var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                     }

                     if (class659.field9815 != null && class659.field9815[var10] != null) {
                        var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                        if (~var7 > ~var12) {
                           var7 = var12;
                        }
                     }

                     ++var9;
                  }
               }

               while(true) {
                  while(~var9 >= ~(var5 + 4)) {
                     var10 = class674.field9984;
                     if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                        ++var10;
                     }

                     var11 = 0;
                     if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                        var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                     }

                     if (class659.field9815 != null && class659.field9815[var10] != null) {
                        var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                        if (~var7 > ~var12) {
                           var7 = var12;
                        }
                     }

                     ++var9;
                  }

                  ++var8;
                  if (var8 > var4 - -4) {
                     var8 = (var7 >> 2) * 1536;
                     var15 = ~var8;
                     if (!var1) {
                        if (var15 < -786433) {
                           var8 = 786432;
                        }

                        if (arg0 > -39) {
                           method1783((byte)124);
                        }

                        if (var8 < 262144) {
                           var8 = 262144;
                        }

                        if (var8 > class422.field5759) {
                           class422.field5759 += (-class422.field5759 + var8) / 24;
                           return;
                        }

                        if (~class422.field5759 < ~var8) {
                           class422.field5759 += (-class422.field5759 + var8) / 80;
                           return;
                        }

                        return;
                     }

                     var9 = var15 + -786433;
                     if (var1) {
                        var10 = class674.field9984;
                        if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                           var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                        }

                        if (class659.field9815 != null && class659.field9815[var10] != null) {
                           var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                           if (~var7 > ~var12) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  } else {
                     var9 = var5 + -4;
                     if (var1) {
                        var10 = class674.field9984;
                        if (var10 < 3 && class738.method5357(var9, var8, -20749)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class456.field6286.field5378 != null && class456.field6286.field5378[var10] != null) {
                           var11 = (255 & class456.field6286.field5378[var10][var8][var9]) * 8 << 2;
                        }

                        if (class659.field9815 != null && class659.field9815[var10] != null) {
                           var12 = -class659.field9815[var10].method3284(-1, var8, var9) + var6 + var11;
                           if (~var7 > ~var12) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  }
               }
            }

            class623.field9202 = var10000 - var10001;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field2798[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1784(int arg0, int arg1) {
      try {
         if (arg1 > -81) {
            this.method1786(-76);
         }

         ++field2794;
         class407 var3 = this.field2790;
         synchronized(this.field2790) {
            this.field2790.method3197(5, arg0);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2798[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method1785(boolean arg0) {
      try {
         class407 var2 = this.field2790;
         synchronized(this.field2790) {
            this.field2790.method3201((byte)-46);
            if (arg0) {
               this.field2789 = null;
            }
         }

         ++field2795;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2798[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1786(int arg0) {
      try {
         class407 var2 = this.field2790;
         synchronized(this.field2790) {
            if (arg0 != 24) {
               return;
            }

            this.field2790.method3187(-23825);
         }

         ++field2793;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2798[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class223(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field2789 = arg2;
         if (this.field2789 != null) {
            this.field2797 = this.field2789.method2691(47, -26);
         } else {
            this.field2797 = 0;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2798[4] + (arg0 != null ? field2798[3] : field2798[2]) + ',' + arg1 + ',' + (arg2 != null ? field2798[3] : field2798[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1787(boolean arg0) {
      try {
         if (arg0) {
            field2792 = null;
         }

         field2792 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2798[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1788(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1789(char[] arg0) {
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
            var10005 = 7;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
