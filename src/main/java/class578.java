import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class578 extends class471 {
   @OriginalMember(
      owner = "client!wb",
      name = "G",
      descriptor = "S"
   )
   public short field8160;
   @OriginalMember(
      owner = "client!wb",
      name = "T",
      descriptor = "S"
   )
   public short field8155;
   @OriginalMember(
      owner = "client!wb",
      name = "Q",
      descriptor = "S"
   )
   public short field8150;
   @OriginalMember(
      owner = "client!wb",
      name = "M",
      descriptor = "S"
   )
   public short field8154;
   @OriginalMember(
      owner = "client!wb",
      name = "E",
      descriptor = "B"
   )
   public byte field8156;
   @OriginalMember(
      owner = "client!wb",
      name = "R",
      descriptor = "Z"
   )
   public boolean field8163;
   @OriginalMember(
      owner = "client!wb",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8165 = new String[]{method4274(method4273("-VF3F")), method4274(method4273("8\r\u0004q")), method4274(method4273("!\u001aFY\u0013")), method4274(method4273("!\u001aFVy~")), method4274(method4273("!\u001aF!R8\u0011\u001c#\u0013")), method4274(method4273("!\u001aFQy~")), method4274(method4273("!\u001aFWy~")), method4274(method4273("!\u001aF_\u0013")), method4274(method4273("!\u001aFX\u0013")), method4274(method4273("!\u001aFH\u0013"))};
   @OriginalMember(
      owner = "client!wb",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field8158 = new int[8];
   @OriginalMember(
      owner = "client!wb",
      name = "N",
      descriptor = "Lfm;"
   )
   public static class164 field8152 = new class164(79, 3);
   @OriginalMember(
      owner = "client!wb",
      name = "F",
      descriptor = "[[B"
   )
   public static byte[][] field8164 = new byte[50][];
   @OriginalMember(
      owner = "client!wb",
      name = "O",
      descriptor = "I"
   )
   public static int field8149;
   @OriginalMember(
      owner = "client!wb",
      name = "J",
      descriptor = "I"
   )
   public static int field8151;
   @OriginalMember(
      owner = "client!wb",
      name = "P",
      descriptor = "I"
   )
   public static int field8157;
   @OriginalMember(
      owner = "client!wb",
      name = "I",
      descriptor = "I"
   )
   public static int field8159;
   @OriginalMember(
      owner = "client!wb",
      name = "H",
      descriptor = "I"
   )
   public static int field8161;
   @OriginalMember(
      owner = "client!wb",
      name = "L",
      descriptor = "I"
   )
   public static int field8162;
   @OriginalMember(
      owner = "client!wb",
      name = "S",
      descriptor = "Lfea;"
   )
   public static class82 field8153;

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(Lha;I)Z"
   )
   public final boolean method1682(class17 arg0, int arg1) {
      try {
         if (arg1 != 1) {
            this.field8163 = true;
         }

         ++field8157;
         return class107.method1053(this.method722(false, arg0), this.field8155, arg1 ^ 3, this.field8160, this.field8154, this.field8150, super.field6826);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8165[2] + (arg0 != null ? field8165[0] : field8165[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method1685(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8162;
         int var3 = this.field8154;
         short var10000;
         if (arg0 != -1) {
            this.field8155 = -17;
            if (var2) {
               var10000 = this.field8160;
            } else if (var3 > this.field8150) {
               var10000 = 0;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = this.field8160;
            }
         } else if (var3 > this.field8150) {
            var10000 = 0;
            if (!var2) {
               return false;
            }
         } else {
            var10000 = this.field8160;
         }

         while(true) {
            int var4 = var10000;
            if (var2 || this.field8155 >= var4) {
               do {
                  int var5 = -class507.field7207 + var3 + class15.field214;
                  if (~var5 <= -1) {
                     if (~var5 <= ~class232.field3602.length && !var2) {
                        ++var4;
                     } else {
                        int var6 = class15.field214 + var4 + -class477.field6876;
                        if (~var6 <= -1) {
                           if (~var6 <= ~class232.field3602.length) {
                              if (var2) {
                                 if (class232.field3602[var5][var6]) {
                                    return true;
                                 }

                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           } else {
                              if (class232.field3602[var5][var6]) {
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
               } while(this.field8155 >= var4);
            }

            ++var3;
            if (var3 > this.field8150) {
               var10000 = 0;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = this.field8160;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8165[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "l",
      descriptor = "(I)Z"
   )
   public static final boolean method4270(int arg0) {
      try {
         if (arg0 != 65535) {
            return false;
         } else {
            ++field8149;
            return class487.field6949 != 0 ? true : class691.field9950.method1177((byte)14);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8165[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "m",
      descriptor = "(I)V"
   )
   public void method3052(int arg0) {
      try {
         if (arg0 == 240) {
            ++field8151;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8165[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(B[Lpha;)I"
   )
   public final int method1681(byte arg0, class757[] arg1) {
      boolean var3 = client.field10022;

      try {
         ++field8159;
         int var4 = 0;
         if (arg0 != 39) {
            return 92;
         } else {
            int var6;
            label355: {
               int var5 = this.field8154;
               if (var3) {
                  var6 = this.field8160;
               } else if (var5 > this.field8150) {
                  var6 = var4;
                  if (!var3) {
                     break label355;
                  }
               } else {
                  var6 = this.field8160;
               }

               label354:
               while(true) {
                  label352:
                  while(var3 || this.field8155 >= var6) {
                     while(true) {
                        label348:
                        while(true) {
                           short var10000;
                           int var10001;
                           label346: {
                              long var7 = class232.field3604[super.field6824][var5][var6];
                              long var9 = 0L;
                              int var11;
                              if (var3) {
                                 var11 = (int)(var7 >>> (int)var9 & 65535L);
                                 if (var11 <= 0) {
                                    if (var3) {
                                       break label354;
                                    }

                                    ++var6;
                                    var10000 = this.field8155;
                                    var10001 = var6;
                                    break label346;
                                 }
                              } else {
                                 if (var9 > 48L) {
                                    if (var3) {
                                       break label354;
                                    }

                                    ++var6;
                                    var10000 = this.field8155;
                                    var10001 = var6;
                                    break label346;
                                 }

                                 var11 = (int)(var7 >>> (int)var9 & 65535L);
                                 if (var11 <= 0) {
                                    if (var3) {
                                       break label354;
                                    }

                                    ++var6;
                                    var10000 = this.field8155;
                                    var10001 = var6;
                                    break label346;
                                 }
                              }

                              while(true) {
                                 label343: {
                                    class425 var12 = class274.field4176[var11 + -1];
                                    int var13 = 0;
                                    if (var3) {
                                       if (arg1[var13] == var12.field6218) {
                                          var9 += 16L;
                                          if (!var3) {
                                             break label343;
                                          }

                                          ++var13;
                                       } else {
                                          ++var13;
                                       }
                                    }

                                    while(true) {
                                       if (var13 >= var4) {
                                          arg1[var4++] = var12.field6218;
                                          int var30 = ~var4;
                                          if (var3) {
                                             if (var30 < -5) {
                                                break label352;
                                             }
                                             continue label348;
                                          }

                                          if (var30 == -5) {
                                             var6 = var4;
                                             if (!var3) {
                                                break label354;
                                             }
                                             continue label348;
                                          }

                                          var9 += 16L;
                                          break;
                                       }

                                       if (arg1[var13] == var12.field6218) {
                                          var9 += 16L;
                                          if (!var3) {
                                             break;
                                          }

                                          ++var13;
                                       } else {
                                          ++var13;
                                       }
                                    }
                                 }

                                 if (var9 > 48L) {
                                    if (var3) {
                                       break label354;
                                    }

                                    ++var6;
                                    var10000 = this.field8155;
                                    var10001 = var6;
                                    break;
                                 }

                                 var11 = (int)(var7 >>> (int)var9 & 65535L);
                                 if (var11 <= 0) {
                                    if (var3) {
                                       break label354;
                                    }

                                    ++var6;
                                    var10000 = this.field8155;
                                    var10001 = var6;
                                    break;
                                 }
                              }
                           }

                           if (var10000 < var10001) {
                              break label352;
                           }
                        }
                     }
                  }

                  if (var3) {
                     break;
                  }

                  ++var5;
                  if (var5 > this.field8150) {
                     var6 = var4;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var6 = this.field8160;
                  }
               }
            }

            if (var3) {
               arg1[var6] = null;
               ++var6;
            }

            while(true) {
               while(~var6 > -5) {
                  arg1[var6] = null;
                  ++var6;
               }

               if (!var3) {
                  if (this.field8156 != 0) {
                     int var16;
                     int var17;
                     short var18;
                     short var19;
                     label391: {
                        int var14 = -class507.field7207 + this.field8154;
                        int var15 = -class477.field6876 + this.field8160;
                        if (~this.field8156 == -2) {
                           if (~var14 > ~var15) {
                              var16 = this.field8160 - 1;
                              var17 = this.field8154 + 1;
                              var18 = this.field8160;
                              var19 = this.field8154;
                              if (!var3) {
                                 break label391;
                              }
                           }

                           var17 = this.field8154 - 1;
                           var18 = this.field8160;
                           var16 = this.field8160 + 1;
                           var19 = this.field8154;
                           if (!var3) {
                              break label391;
                           }
                        }

                        if (-var14 < var15) {
                           var18 = this.field8160;
                           var16 = this.field8160 - 1;
                           var19 = this.field8154;
                           var17 = this.field8154 - 1;
                           if (!var3) {
                              break label391;
                           }
                        }

                        var19 = this.field8154;
                        var16 = this.field8160 - -1;
                        var18 = this.field8160;
                        var17 = this.field8154 + 1;
                     }

                     int var20 = 0;
                     if (var3 || var4 > var20) {
                        label215:
                        do {
                           long var21 = class232.field3604[super.field6824][var19][var16];
                           class425 var23;
                           long var24;
                           class425 var26;
                           int var27;
                           if (var3) {
                              var23 = class274.field4176[(int)((var21 & 65535L) + -1L)];
                              var21 >>>= 16;
                           } else {
                              if (var21 == 0L) {
                                 var24 = class232.field3604[super.field6824][var17][var18];
                                 if (var3 || ~var24 != -1L) {
                                    do {
                                       var26 = class274.field4176[(int)((65535L & var24) + -1L)];
                                       var24 >>>= 16;

                                       while(arg1[var20] == var26.field6218) {
                                          if (!var3) {
                                             if (!var3) {
                                                ++var20;
                                                continue label215;
                                             }
                                             break;
                                          }
                                       }
                                    } while(~var24 != -1L);
                                 }

                                 var27 = var20;
                                 if (var3) {
                                    arg1[var20] = arg1[var20 + 1];
                                    var27 = var20 + 1;
                                 }

                                 while(true) {
                                    while(var27 < var4 + -1) {
                                       arg1[var27] = arg1[var27 + 1];
                                       ++var27;
                                    }

                                    if (!var3) {
                                       --var4;
                                       ++var20;
                                       continue label215;
                                    }

                                    ++var27;
                                 }
                              }

                              var23 = class274.field4176[(int)((var21 & 65535L) + -1L)];
                              var21 >>>= 16;
                           }

                           while(true) {
                              while(arg1[var20] == var23.field6218) {
                                 if (!var3) {
                                    if (!var3) {
                                       ++var20;
                                       continue label215;
                                    }
                                    break;
                                 }
                              }

                              if (var21 == 0L) {
                                 var24 = class232.field3604[super.field6824][var17][var18];
                                 if (var3 || ~var24 != -1L) {
                                    do {
                                       var26 = class274.field4176[(int)((65535L & var24) + -1L)];
                                       var24 >>>= 16;

                                       while(arg1[var20] == var26.field6218) {
                                          if (!var3) {
                                             if (!var3) {
                                                ++var20;
                                                continue label215;
                                             }
                                             break;
                                          }
                                       }
                                    } while(~var24 != -1L);
                                 }

                                 var27 = var20;
                                 if (var3) {
                                    arg1[var20] = arg1[var20 + 1];
                                    var27 = var20 + 1;
                                 }

                                 while(true) {
                                    while(var27 < var4 + -1) {
                                       arg1[var27] = arg1[var27 + 1];
                                       ++var27;
                                    }

                                    if (!var3) {
                                       --var4;
                                       ++var20;
                                       continue label215;
                                    }

                                    ++var27;
                                 }
                              }

                              var23 = class274.field4176[(int)((var21 & 65535L) + -1L)];
                              var21 >>>= 16;
                           }
                        } while(var4 > var20);
                     }
                  }

                  return var4;
               }

               ++var6;
            }
         }
      } catch (RuntimeException var29) {
         throw class612.method4503(var29, field8165[8] + arg0 + ',' + (arg1 != null ? field8165[0] : field8165[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "<init>",
      descriptor = "(IIIIIIIIIZB)V"
   )
   public class578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
      try {
         this.field8160 = (short)arg7;
         this.field8155 = (short)arg8;
         super.field6824 = (byte)arg0;
         super.field6833 = arg4;
         this.field8150 = (short)arg6;
         super.field6826 = (byte)arg1;
         super.field6832 = arg2;
         super.field6829 = arg3;
         this.field8154 = (short)arg5;
         this.field8156 = arg10;
         this.field8163 = arg9;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field8165[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method4271(byte arg0) {
      try {
         if (arg0 >= 70) {
            field8164 = null;
            field8158 = null;
            field8153 = null;
            field8152 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8165[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(IIILsa;)Lwm;"
   )
   public static final class440 method4272(int arg0, int arg1, int arg2, class39 arg3) {
      try {
         if (arg2 != -22579) {
            method4271((byte)14);
         }

         ++field8161;
         byte[] var4 = arg3.method460((byte)-11, arg0, arg1);
         return var4 == null ? null : new class440(var4);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8165[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8165[0] : field8165[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4273(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4274(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
