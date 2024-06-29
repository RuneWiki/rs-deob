import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public abstract class class741 extends class616 {
   @OriginalMember(
      owner = "client!lu",
      name = "M",
      descriptor = "S"
   )
   public short field10992;
   @OriginalMember(
      owner = "client!lu",
      name = "C",
      descriptor = "S"
   )
   public short field10995;
   @OriginalMember(
      owner = "client!lu",
      name = "I",
      descriptor = "S"
   )
   public short field11000;
   @OriginalMember(
      owner = "client!lu",
      name = "J",
      descriptor = "Z"
   )
   public boolean field10993;
   @OriginalMember(
      owner = "client!lu",
      name = "F",
      descriptor = "S"
   )
   public short field10990;
   @OriginalMember(
      owner = "client!lu",
      name = "G",
      descriptor = "B"
   )
   public byte field10997;
   @OriginalMember(
      owner = "client!lu",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11003 = new String[]{method5402(method5401("v\r-O[")), method5402(method5401("v\r-J[")), method5402(method5401("aV-%\u000e")), method5402(method5401("t\rog")), method5402(method5401("v\r-C[")), method5402(method5401("v\r-H[")), method5402(method5401("v\r-7\u001at\u0011w5[")), method5402(method5401("v\r-N["))};
   @OriginalMember(
      owner = "client!lu",
      name = "E",
      descriptor = "I"
   )
   public static int field10996 = -1;
   @OriginalMember(
      owner = "client!lu",
      name = "D",
      descriptor = "Lsda;"
   )
   public static class269 field10991 = new class269(41, -1);
   @OriginalMember(
      owner = "client!lu",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field11001 = new int[128];
   @OriginalMember(
      owner = "client!lu",
      name = "B",
      descriptor = "Lhv;"
   )
   public static class544 field11002;
   @OriginalMember(
      owner = "client!lu",
      name = "A",
      descriptor = "I"
   )
   public static int field10988;
   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "I"
   )
   public static int field10989;
   @OriginalMember(
      owner = "client!lu",
      name = "H",
      descriptor = "I"
   )
   public static int field10994;
   @OriginalMember(
      owner = "client!lu",
      name = "K",
      descriptor = "I"
   )
   public static int field10998;
   @OriginalMember(
      owner = "client!lu",
      name = "L",
      descriptor = "I"
   )
   public static int field10999;

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "([Llja;I)I"
   )
   public final int method1881(class744[] arg0, int arg1) {
      int var3 = client.field4530;

      try {
         int var4;
         int var6;
         label366: {
            ++field10988;
            var4 = 0;
            int var5 = this.field10995;
            if (var3 != 0) {
               var6 = this.field11000;
            } else if (~var5 < ~this.field10990) {
               var6 = var4;
               if (var3 == 0) {
                  break label366;
               }
            } else {
               var6 = this.field11000;
            }

            label365:
            while(true) {
               label363:
               while(var3 != 0 || this.field10992 >= var6) {
                  label361:
                  while(true) {
                     label359: {
                        long var7 = class544.field8093[super.field9010][var5][var6];
                        long var9 = 0L;
                        int var11;
                        if (var3 != 0) {
                           var11 = (int)(65535L & var7 >>> (int)var9);
                           if (~var11 >= -1 && var3 == 0) {
                              if (var3 != 0) {
                                 break label365;
                              }

                              ++var6;
                              break label359;
                           }
                        } else {
                           if (var9 > 48L) {
                              if (var3 != 0) {
                                 break label365;
                              }

                              ++var6;
                              break label359;
                           }

                           var11 = (int)(65535L & var7 >>> (int)var9);
                           if (~var11 >= -1 && var3 == 0) {
                              if (var3 != 0) {
                                 break label365;
                              }

                              ++var6;
                              break label359;
                           }
                        }

                        label358:
                        while(true) {
                           label356:
                           while(true) {
                              label354: {
                                 class33 var12 = class535.field7812[var11 - 1];
                                 int var13 = 0;
                                 if (var3 != 0) {
                                    if (arg0[var13] == var12.field356) {
                                       var9 += 16L;
                                       if (var3 == 0) {
                                          break label354;
                                       }

                                       ++var13;
                                    } else {
                                       ++var13;
                                    }
                                 }

                                 while(true) {
                                    if (~var13 <= ~var4) {
                                       arg0[var4++] = var12.field356;
                                       int var10000 = ~var4;
                                       if (var3 != 0) {
                                          if (var10000 >= -5 && var3 == 0) {
                                             if (var3 != 0) {
                                                break label365;
                                             }

                                             ++var6;
                                             break label358;
                                          }
                                          continue label356;
                                       }

                                       if (var10000 == -5) {
                                          var6 = var4;
                                          if (var3 == 0) {
                                             break label365;
                                          }
                                          continue label361;
                                       }

                                       var9 += 16L;
                                       break;
                                    }

                                    if (arg0[var13] == var12.field356) {
                                       var9 += 16L;
                                       if (var3 == 0) {
                                          break;
                                       }

                                       ++var13;
                                    } else {
                                       ++var13;
                                    }
                                 }
                              }

                              if (var9 > 48L) {
                                 if (var3 != 0) {
                                    break label365;
                                 }

                                 ++var6;
                                 break label358;
                              }

                              var11 = (int)(65535L & var7 >>> (int)var9);
                              if (~var11 >= -1 && var3 == 0) {
                                 if (var3 != 0) {
                                    break label365;
                                 }

                                 ++var6;
                                 break label358;
                              }
                           }
                        }
                     }

                     if (this.field10992 < var6) {
                        break label363;
                     }
                  }
               }

               if (var3 != 0) {
                  break;
               }

               ++var5;
               if (~var5 < ~this.field10990) {
                  var6 = var4;
                  if (var3 == 0) {
                     break;
                  }
               } else {
                  var6 = this.field11000;
               }
            }
         }

         if (var3 != 0) {
            arg0[var6] = null;
            ++var6;
         }

         while(true) {
            while(~var6 > -5) {
               arg0[var6] = null;
               ++var6;
            }

            if (var3 == 0) {
               if (~this.field10997 != -1) {
                  short var16;
                  int var17;
                  short var18;
                  int var19;
                  label398: {
                     int var14 = -class681.field10228 + this.field10995;
                     int var15 = -class518.field7555 + this.field11000;
                     if (~this.field10997 != -2) {
                        if (-var14 < var15) {
                           var16 = this.field10995;
                           var17 = this.field10995 + -1;
                           var18 = this.field11000;
                           var19 = this.field11000 - 1;
                           if (var3 == 0) {
                              break label398;
                           }
                        }

                        var19 = this.field11000 - -1;
                        var16 = this.field10995;
                        var18 = this.field11000;
                        var17 = this.field10995 + 1;
                        if (var3 == 0) {
                           break label398;
                        }
                     }

                     if (var15 > var14) {
                        var16 = this.field10995;
                        var18 = this.field11000;
                        var19 = this.field11000 + -1;
                        var17 = this.field10995 + 1;
                        if (var3 == 0) {
                           break label398;
                        }
                     }

                     var19 = this.field11000 + 1;
                     var17 = this.field10995 + -1;
                     var16 = this.field10995;
                     var18 = this.field11000;
                  }

                  int var20 = 0;
                  if (var3 != 0 || var4 > var20) {
                     label219:
                     do {
                        long var21 = class544.field8093[super.field9010][var16][var19];
                        class33 var23;
                        long var24;
                        class33 var26;
                        int var27;
                        if (var3 != 0) {
                           var23 = class535.field7812[(int)((var21 & 65535L) + -1L)];
                           var21 >>>= 16;
                        } else {
                           if (~var21 == -1L) {
                              var24 = class544.field8093[super.field9010][var17][var18];
                              if (var3 != 0 || ~var24 != -1L) {
                                 do {
                                    var26 = class535.field7812[(int)((var24 & 65535L) + -1L)];
                                    var24 >>>= 16;

                                    while(arg0[var20] == var26.field356) {
                                       if (var3 == 0) {
                                          if (var3 == 0) {
                                             ++var20;
                                             continue label219;
                                          }
                                          break;
                                       }
                                    }
                                 } while(~var24 != -1L);
                              }

                              var27 = var20;
                              if (var3 != 0) {
                                 arg0[var20] = arg0[var20 + 1];
                                 var27 = var20 + 1;
                              }

                              while(true) {
                                 while(~(var4 + -1) < ~var27) {
                                    arg0[var27] = arg0[var27 + 1];
                                    ++var27;
                                 }

                                 if (var3 == 0) {
                                    --var4;
                                    ++var20;
                                    continue label219;
                                 }

                                 ++var27;
                              }
                           }

                           var23 = class535.field7812[(int)((var21 & 65535L) + -1L)];
                           var21 >>>= 16;
                        }

                        while(true) {
                           while(arg0[var20] == var23.field356) {
                              if (var3 == 0) {
                                 if (var3 == 0) {
                                    ++var20;
                                    continue label219;
                                 }
                                 break;
                              }
                           }

                           if (~var21 == -1L) {
                              var24 = class544.field8093[super.field9010][var17][var18];
                              if (var3 != 0 || ~var24 != -1L) {
                                 do {
                                    var26 = class535.field7812[(int)((var24 & 65535L) + -1L)];
                                    var24 >>>= 16;

                                    while(arg0[var20] == var26.field356) {
                                       if (var3 == 0) {
                                          if (var3 == 0) {
                                             ++var20;
                                             continue label219;
                                          }
                                          break;
                                       }
                                    }
                                 } while(~var24 != -1L);
                              }

                              var27 = var20;
                              if (var3 != 0) {
                                 arg0[var20] = arg0[var20 + 1];
                                 var27 = var20 + 1;
                              }

                              while(true) {
                                 while(~(var4 + -1) < ~var27) {
                                    arg0[var27] = arg0[var27 + 1];
                                    ++var27;
                                 }

                                 if (var3 == 0) {
                                    --var4;
                                    ++var20;
                                    continue label219;
                                 }

                                 ++var27;
                              }
                           }

                           var23 = class535.field7812[(int)((var21 & 65535L) + -1L)];
                           var21 >>>= 16;
                        }
                     } while(var4 > var20);
                  }
               }

               if (arg1 != -52) {
                  return 50;
               }

               return var4;
            }

            ++var6;
         }
      } catch (RuntimeException var29) {
         throw class670.method4877(var29, field11003[7] + (arg0 != null ? field11003[2] : field11003[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "m",
      descriptor = "(I)V"
   )
   public void method14(int arg0) {
      try {
         ++field10994;
         if (arg0 > -37) {
            field11002 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11003[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "n",
      descriptor = "(I)V"
   )
   public static void method5400(int arg0) {
      try {
         field11002 = null;
         if (arg0 != 0) {
            method5400(-69);
         }

         field10991 = null;
         field11001 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11003[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(BLha;)Z"
   )
   public final boolean method1880(byte arg0, class66 arg1) {
      try {
         if (arg0 < 63) {
            this.method14(-76);
         }

         ++field10998;
         return class753.method5481(this.field10995, false, super.field9005, this.field10990, this.field10992, this.field11000, this.method16(-124, arg1));
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11003[1] + arg0 + ',' + (arg1 != null ? field11003[2] : field11003[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1883(boolean arg0) {
      int var2 = client.field4530;

      try {
         ++field10989;
         int var3 = this.field10995;
         short var10000;
         if (var2 != 0) {
            var10000 = this.field11000;
         } else if (~var3 < ~this.field10990) {
            var10000 = arg0;
            if (var2 == 0) {
               if (arg0 != 0) {
                  this.method14(44);
               }

               return false;
            }
         } else {
            var10000 = this.field11000;
         }

         while(true) {
            int var4 = var10000;
            if (var2 != 0 || ~var4 >= ~this.field10992) {
               do {
                  int var5 = -class681.field10228 + var3 + class488.field7212;
                  if (~var5 <= -1) {
                     if (var5 >= class569.field8487.length && var2 == 0) {
                        ++var4;
                     } else {
                        int var6 = -class518.field7555 + var4 + class488.field7212;
                        if (var6 >= 0) {
                           if (var6 >= class569.field8487.length) {
                              if (var2 != 0) {
                                 if (class569.field8487[var5][var6]) {
                                    return true;
                                 }

                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           } else {
                              if (class569.field8487[var5][var6]) {
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
               } while(~var4 >= ~this.field10992);
            }

            ++var3;
            if (~var3 < ~this.field10990) {
               var10000 = arg0;
               if (var2 == 0) {
                  if (arg0 != 0) {
                     this.method14(44);
                  }

                  return false;
               }
            } else {
               var10000 = this.field11000;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11003[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "<init>",
      descriptor = "(IIIIIIIIIZB)V"
   )
   public class741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
      try {
         this.field10992 = (short)arg8;
         super.field9007 = arg4;
         super.field8998 = arg3;
         super.field9003 = arg2;
         this.field10995 = (short)arg5;
         this.field11000 = (short)arg7;
         this.field10993 = arg9;
         this.field10990 = (short)arg6;
         super.field9010 = (byte)arg0;
         super.field9005 = (byte)arg1;
         this.field10997 = arg10;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field11003[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < field11001.length; ++var0) {
         field11001[var0] = -1;
      }

      for(int var1 = 65; ~var1 >= -91; ++var1) {
         field11001[var1] = var1 + -65;
      }

      for(int var2 = 97; var2 <= 122; ++var2) {
         field11001[var2] = var2 + -97 + 26;
      }

      for(int var3 = 48; var3 <= 57; ++var3) {
         field11001[var3] = var3 + -48 - -52;
      }

      field11001[42] = field11001[43] = 62;
      field11001[45] = field11001[47] = 63;
      field11002 = null;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5401(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5402(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
