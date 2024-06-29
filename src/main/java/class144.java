import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class144 extends class294 {
   @OriginalMember(
      owner = "client!mc",
      name = "J",
      descriptor = "S"
   )
   public short field2348;
   @OriginalMember(
      owner = "client!mc",
      name = "F",
      descriptor = "B"
   )
   public byte field2355;
   @OriginalMember(
      owner = "client!mc",
      name = "C",
      descriptor = "S"
   )
   public short field2354;
   @OriginalMember(
      owner = "client!mc",
      name = "H",
      descriptor = "S"
   )
   public short field2356;
   @OriginalMember(
      owner = "client!mc",
      name = "D",
      descriptor = "S"
   )
   public short field2347;
   @OriginalMember(
      owner = "client!mc",
      name = "L",
      descriptor = "Z"
   )
   public boolean field2349;
   @OriginalMember(
      owner = "client!mc",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2359 = new String[]{method1369(method1368("'\u0007i\u0005Lb")), method1369(method1368("'\u0007i\u001aOb")), method1369(method1368("'\u0007i\u000bOb")), method1369(method1368("'\u0007i\u0004Lb")), method1369(method1368("$\u0011+#")), method1369(method1368("1Jias")), method1369(method1368("'\u0007i\tOb")), method1369(method1368("'\u0007isg$\r3q&")), method1369(method1368("'\u0007i\bOb"))};
   @OriginalMember(
      owner = "client!mc",
      name = "G",
      descriptor = "I"
   )
   public static int field2350;
   @OriginalMember(
      owner = "client!mc",
      name = "E",
      descriptor = "I"
   )
   public static int field2351;
   @OriginalMember(
      owner = "client!mc",
      name = "K",
      descriptor = "I"
   )
   public static int field2352;
   @OriginalMember(
      owner = "client!mc",
      name = "B",
      descriptor = "I"
   )
   public static int field2353;
   @OriginalMember(
      owner = "client!mc",
      name = "I",
      descriptor = "I"
   )
   public static int field2357;
   @OriginalMember(
      owner = "client!mc",
      name = "A",
      descriptor = "I"
   )
   public static int field2358;

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(III)Lnm;",
      line = 5
   )
   public static final class496 method1361(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      return var3 == null ? null : var3.field8661;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "(ILha;)Z",
      line = 14
   )
   public final boolean method1362(int arg0, class65 arg1) {
      try {
         if (arg0 != 0) {
            this.field2347 = -41;
         }

         ++field2358;
         return class72.method769(this.field2356, this.field2348, -251, this.method586(arg1, 0), this.field2347, this.field2354, super.field4091);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2359[8] + arg0 + ',' + (arg1 != null ? field2359[5] : field2359[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "g",
      descriptor = "(B)V",
      line = 25
   )
   public void method1363(byte arg0) {
      try {
         if (arg0 != -67) {
            this.method1362(58, (class65)null);
         }

         ++field2357;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2359[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "j",
      descriptor = "(I)V",
      line = 37
   )
   public static final void method1364(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field2353;
         if (arg0 != -12275) {
            method1361(127, -67, -66);
         }

         class41 var2 = (class41)class358.field5361.method2579(arg0 + 11474);
         if (var1 || var2 != null) {
            do {
               label79: {
                  class488 var3 = var2.field959;
                  if (~var3.field7084 > ~class29.field458) {
                     var2.method154(-113);
                     var3.method3685(-26405);
                     if (!var1) {
                        break label79;
                     }
                  }

                  if (~class29.field458 <= ~var3.field7090) {
                     var3.method3689(arg0 ^ 12254);
                     if (var3.field7095 > 0) {
                        class272 var4 = (class272)class78.field1344.method1572((long)(var3.field7095 - 1), arg0 + -4014);
                        if (var4 != null) {
                           class451 var5 = var4.field3851;
                           if (~var5.field4101 <= -1 && ~(class209.field3112 * 512) < ~var5.field4101 && ~var5.field4096 <= -1 && class1.field3 * 512 > var5.field4096) {
                              var3.method3693(var5.field4101, class663.method4851(var5.field4096, var5.field4101, var3.field4090, 122) - var3.field7110, class29.field458, var5.field4096, 0);
                           }
                        }
                     }

                     if (~var3.field7095 > -1) {
                        int var6 = -var3.field7095 + -1;
                        class457 var7;
                        if (~class20.field324 != ~var6) {
                           var7 = class458.field6723[var6];
                           if (var1) {
                              var7 = class304.field4398;
                           }
                        } else {
                           var7 = class304.field4398;
                        }

                        if (var7 != null && ~var7.field4101 <= -1 && class209.field3112 * 512 > var7.field4101 && var7.field4096 >= 0 && var7.field4096 < class1.field3 * 512) {
                           var3.method3693(var7.field4101, class663.method4851(var7.field4096, var7.field4101, var3.field4090, 118) + -var3.field7110, class29.field458, var7.field4096, 0);
                        }
                     }

                     var3.method3690(class697.field10217, 114);
                     class627.method4591(var3, true);
                  }
               }

               var2 = (class41)class358.field5361.method2583(1);
            } while(var2 != null);

         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2359[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "i",
      descriptor = "(I)Z",
      line = 103
   )
   public final boolean method1365(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2352;
         int var3 = this.field2354;
         int var10000;
         if (var2) {
            var10000 = this.field2347;
         } else if (~var3 < ~this.field2356) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 != -1) {
                  this.field2354 = 121;
               }

               return false;
            }
         } else {
            var10000 = this.field2347;
         }

         while(true) {
            int var4 = var10000;
            if (var2 || var4 <= this.field2348) {
               do {
                  int var5 = class54.field1102 + var3 + -class566.field8206;
                  if (var5 >= 0) {
                     if (~var5 <= ~class750.field10812.length && !var2) {
                        ++var4;
                     } else {
                        int var6 = var4 - (-class54.field1102 + class115.field1864);
                        if (~var6 <= -1) {
                           if (~var6 <= ~class750.field10812.length) {
                              if (var2) {
                                 if (class750.field10812[var5][var6]) {
                                    return true;
                                 }

                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           } else {
                              if (class750.field10812[var5][var6]) {
                                 return true;
                              }

                              ++var4;
                           }
                        } else {
                           ++var4;
                        }
                     }
                  } else {
                     ++var4;
                  }
               } while(var4 <= this.field2348);
            }

            ++var3;
            if (~var3 < ~this.field2356) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 != -1) {
                     this.field2354 = 121;
                  }

                  return false;
               }
            } else {
               var10000 = this.field2347;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2359[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "([Lke;B)I",
      line = 144
   )
   public final int method1366(class622[] arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2350;
         int var4 = 0;
         if (arg1 >= -57) {
            this.method1366((class622[])null, (byte)-42);
         }

         int var6;
         label325: {
            int var5 = this.field2354;
            if (var3) {
               var6 = this.field2347;
            } else if (this.field2356 < var5) {
               var6 = var4;
               if (!var3) {
                  break label325;
               }
            } else {
               var6 = this.field2347;
            }

            label324:
            while(true) {
               label322:
               while(var3 || var6 <= this.field2348) {
                  while(true) {
                     label318:
                     while(true) {
                        long var7 = class236.field3434[super.field4090][var5][var6];
                        long var9 = 0L;
                        if (var3 || var9 <= 48L) {
                           label315:
                           do {
                              int var11 = (int)(var7 >>> (int)var9 & 65535L);
                              if (var11 <= 0) {
                                 break;
                              }

                              class538 var12 = class234.field3419[var11 + -1];
                              int var13 = 0;
                              if (var3) {
                                 if (arg0[var13] == var12.field7826) {
                                    var9 += 16L;
                                    if (!var3) {
                                       continue;
                                    }

                                    ++var13;
                                 } else {
                                    ++var13;
                                 }
                              }

                              while(~var13 > ~var4) {
                                 if (arg0[var13] == var12.field7826) {
                                    var9 += 16L;
                                    if (!var3) {
                                       continue label315;
                                    }

                                    ++var13;
                                 } else {
                                    ++var13;
                                 }
                              }

                              arg0[var4++] = var12.field7826;
                              if (var3) {
                                 if (var4 > 4) {
                                    break label322;
                                 }
                                 continue label318;
                              }

                              if (var4 == 4) {
                                 var6 = var4;
                                 if (!var3) {
                                    break label324;
                                 }
                                 continue label318;
                              }

                              var9 += 16L;
                           } while(var9 <= 48L);
                        }

                        if (var3) {
                           if (!var3) {
                              break label324;
                           }
                        } else {
                           ++var6;
                           if (var6 > this.field2348) {
                              break label322;
                           }
                        }
                     }
                  }
               }

               if (var3) {
                  break;
               }

               ++var5;
               if (this.field2356 < var5) {
                  var6 = var4;
                  if (!var3) {
                     break;
                  }
               } else {
                  var6 = this.field2347;
               }
            }
         }

         if (var3) {
            arg0[var6] = null;
            ++var6;
         }

         while(true) {
            while(var6 < 4) {
               arg0[var6] = null;
               ++var6;
            }

            if (!var3) {
               if (this.field2355 != 0) {
                  int var16;
                  short var17;
                  short var18;
                  int var19;
                  label357: {
                     int var14 = -class566.field8206 + this.field2354;
                     int var15 = -class115.field1864 + this.field2347;
                     if (~this.field2355 != -2) {
                        if (var15 <= -var14) {
                           var16 = this.field2347 + 1;
                           var17 = this.field2354;
                           var18 = this.field2347;
                           var19 = this.field2354 - -1;
                           if (!var3) {
                              break label357;
                           }
                        }

                        var18 = this.field2347;
                        var19 = this.field2354 + -1;
                        var17 = this.field2354;
                        var16 = this.field2347 - 1;
                        if (!var3) {
                           break label357;
                        }
                     }

                     if (var14 >= var15) {
                        var17 = this.field2354;
                        var18 = this.field2347;
                        var16 = this.field2347 + 1;
                        var19 = this.field2354 + -1;
                        if (!var3) {
                           break label357;
                        }
                     }

                     var16 = this.field2347 - 1;
                     var17 = this.field2354;
                     var19 = this.field2354 + 1;
                     var18 = this.field2347;
                  }

                  int var20 = 0;
                  if (var3 || var4 > var20) {
                     label216:
                     do {
                        long var21 = class236.field3434[super.field4090][var17][var16];
                        class538 var23;
                        long var24;
                        class538 var26;
                        int var27;
                        if (var3) {
                           var23 = class234.field3419[(int)((var21 & 65535L) - 1L)];
                           var21 >>>= 16;
                        } else {
                           if (var21 == 0L) {
                              var24 = class236.field3434[super.field4090][var19][var18];
                              if (var3 || var24 != 0L) {
                                 do {
                                    var26 = class234.field3419[(int)((var24 & 65535L) + -1L)];
                                    var24 >>>= 16;

                                    while(arg0[var20] == var26.field7826) {
                                       if (!var3) {
                                          if (!var3) {
                                             ++var20;
                                             continue label216;
                                          }
                                          break;
                                       }
                                    }
                                 } while(var24 != 0L);
                              }

                              var27 = var20;
                              if (var3) {
                                 arg0[var20] = arg0[var20 + 1];
                                 var27 = var20 + 1;
                              }

                              while(true) {
                                 while(var4 + -1 > var27) {
                                    arg0[var27] = arg0[var27 + 1];
                                    ++var27;
                                 }

                                 if (!var3) {
                                    --var4;
                                    ++var20;
                                    continue label216;
                                 }

                                 ++var27;
                              }
                           }

                           var23 = class234.field3419[(int)((var21 & 65535L) - 1L)];
                           var21 >>>= 16;
                        }

                        while(true) {
                           while(arg0[var20] == var23.field7826) {
                              if (!var3) {
                                 if (!var3) {
                                    ++var20;
                                    continue label216;
                                 }
                                 break;
                              }
                           }

                           if (var21 == 0L) {
                              var24 = class236.field3434[super.field4090][var19][var18];
                              if (var3 || var24 != 0L) {
                                 do {
                                    var26 = class234.field3419[(int)((var24 & 65535L) + -1L)];
                                    var24 >>>= 16;

                                    while(arg0[var20] == var26.field7826) {
                                       if (!var3) {
                                          if (!var3) {
                                             ++var20;
                                             continue label216;
                                          }
                                          break;
                                       }
                                    }
                                 } while(var24 != 0L);
                              }

                              var27 = var20;
                              if (var3) {
                                 arg0[var20] = arg0[var20 + 1];
                                 var27 = var20 + 1;
                              }

                              while(true) {
                                 while(var4 + -1 > var27) {
                                    arg0[var27] = arg0[var27 + 1];
                                    ++var27;
                                 }

                                 if (!var3) {
                                    --var4;
                                    ++var20;
                                    continue label216;
                                 }

                                 ++var27;
                              }
                           }

                           var23 = class234.field3419[(int)((var21 & 65535L) - 1L)];
                           var21 >>>= 16;
                        }
                     } while(var4 > var20);
                  }
               }

               return var4;
            }

            ++var6;
         }
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field2359[6] + (arg0 != null ? field2359[5] : field2359[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(Loo;Luda;II)V",
      line = 315
   )
   public static final void method1367(class651 param0, class473 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "(IIIIIIIIIZB)V",
      line = 430
   )
   public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
      try {
         this.field2348 = (short)arg8;
         super.field4091 = (byte)arg1;
         super.field4097 = arg3;
         super.field4101 = arg2;
         this.field2355 = arg10;
         super.field4096 = arg4;
         super.field4090 = (byte)arg0;
         this.field2354 = (short)arg5;
         this.field2356 = (short)arg6;
         this.field2347 = (short)arg7;
         this.field2349 = arg9;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field2359[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1368(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1369(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
