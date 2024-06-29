import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class78 extends class109 {
   @OriginalMember(
      owner = "client!dn",
      name = "P",
      descriptor = "B"
   )
   public byte field1046;
   @OriginalMember(
      owner = "client!dn",
      name = "M",
      descriptor = "S"
   )
   public short field1040;
   @OriginalMember(
      owner = "client!dn",
      name = "L",
      descriptor = "S"
   )
   public short field1042;
   @OriginalMember(
      owner = "client!dn",
      name = "K",
      descriptor = "S"
   )
   public short field1044;
   @OriginalMember(
      owner = "client!dn",
      name = "G",
      descriptor = "Z"
   )
   public boolean field1038;
   @OriginalMember(
      owner = "client!dn",
      name = "F",
      descriptor = "S"
   )
   public short field1049;
   @OriginalMember(
      owner = "client!dn",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1050 = new String[]{method742(method741("J\u0017g}\u0018@\u0010=\u007fY")), method742(method741("J\u0017g\u00040\u0006")), method742(method741("J\u0017g\u00030\u0006")), method742(method741("J\u0017g\u00070\u0006")), method742(method741("J\u0017g\u00000\u0006")), method742(method741("@\f%-")), method742(method741("UWgo\f")), method742(method741("J\u0017g\u00020\u0006")), method742(method741("F\u0018?$\u0018KO")), method742(method741("Y\u0010'")), method742(method741("F\u0018?$\u0017G\u000b,'\u001eV")), method742(method741("J\u0017g\u0016Y")), method742(method741("C\u0018*")), method742(method741("J\u0017g\u00050\u0006"))};
   @OriginalMember(
      owner = "client!dn",
      name = "N",
      descriptor = "Ldha;"
   )
   public static class642 field1039 = new class642("", 16);
   @OriginalMember(
      owner = "client!dn",
      name = "J",
      descriptor = "I"
   )
   public static int field1037;
   @OriginalMember(
      owner = "client!dn",
      name = "E",
      descriptor = "I"
   )
   public static int field1041;
   @OriginalMember(
      owner = "client!dn",
      name = "D",
      descriptor = "I"
   )
   public static int field1043;
   @OriginalMember(
      owner = "client!dn",
      name = "I",
      descriptor = "I"
   )
   public static int field1045;
   @OriginalMember(
      owner = "client!dn",
      name = "H",
      descriptor = "I"
   )
   public static int field1047;
   @OriginalMember(
      owner = "client!dn",
      name = "O",
      descriptor = "I"
   )
   public static int field1048;

   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "(Lha;B)Z",
      line = 3
   )
   public final boolean method734(class610 arg0, byte arg1) {
      try {
         if (arg1 != -59) {
            this.field1038 = false;
         }

         ++field1041;
         return class92.method928(false, super.field1500, this.field1044, this.field1042, this.field1040, this.method41(arg1 + 4117, arg0), this.field1049);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1050[7] + (arg0 != null ? field1050[6] : field1050[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "l",
      descriptor = "(I)V",
      line = 14
   )
   public static void method735(int arg0) {
      try {
         if (arg0 != 0) {
            field1039 = null;
         }

         field1039 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1050[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(Ljava/lang/String;ZILsu;ZLjava/lang/String;)V",
      line = 26
   )
   public static final void method736(String arg0, boolean arg1, int arg2, class289 arg3, boolean arg4, String arg5) {
      try {
         label85: {
            ++field1043;
            if (!arg1) {
               class639.method4663(arg5, 3, arg3, 0);
               if (!client.field1786) {
                  break label85;
               }
            }

            if (class289.field4558.startsWith(field1050[9]) && arg3.field4556) {
               String var6 = null;
               if (class684.field10176 != null) {
                  var6 = class684.field10176.getParameter(field1050[8]);
               }

               if (var6 == null || !var6.equals("1")) {
                  class275 var7 = class639.method4663(arg5, 0, arg3, 0);
                  class671.field10001 = arg5;
                  class753.field11162 = arg3;
                  class97.field1369 = var7;
                  return;
               }
            }

            if (class289.field4558.startsWith(field1050[12])) {
               String var8 = null;
               if (class684.field10176 != null) {
                  var8 = class684.field10176.getParameter(field1050[10]);
               }

               if (var8 != null && var8.equals("1") && arg4) {
                  class785.method5700(arg0, 1, -83, arg3, arg5);
                  return;
               }
            }

            class639.method4663(arg5, 2, arg3, 0);
         }

         if (arg2 != 23902) {
            field1039 = null;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1050[11] + (arg0 != null ? field1050[6] : field1050[5]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1050[6] : field1050[5]) + ',' + arg4 + ',' + (arg5 != null ? field1050[6] : field1050[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(ZIBJ)Ljava/lang/String;",
      line = 90
   )
   public static final String method737(boolean arg0, int arg1, byte arg2, long arg3) {
      try {
         ++field1037;
         if (arg2 >= -47) {
            return null;
         } else {
            Calendar var5;
            label17: {
               if (!arg0) {
                  class552.method4193(27444, arg3);
                  var5 = class406.field6327;
                  if (!client.field1786) {
                     break label17;
                  }
               }

               class17.method134(36, arg3);
               var5 = class406.field6326;
            }

            int var6 = var5.get(5);
            int var7 = 1 + var5.get(2);
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field1050[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "i",
      descriptor = "(I)Z",
      line = 127
   )
   public final boolean method738(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field1045;
         if (arg0 != 0) {
            return false;
         } else {
            int var3 = this.field1040;
            short var10000;
            if (var2) {
               var10000 = this.field1044;
            } else if (this.field1042 < var3) {
               var10000 = 0;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = this.field1044;
            }

            while(true) {
               int var4 = var10000;
               if (var2 || ~this.field1049 <= ~var4) {
                  do {
                     int var5 = var3 - (class487.field7409 - class382.field6038);
                     if (var5 >= 0) {
                        if (~var5 <= ~class717.field10755.length && !var2) {
                           ++var4;
                        } else {
                           int var6 = -class701.field10446 + var4 + class382.field6038;
                           if (var6 >= 0) {
                              if (var6 >= class717.field10755.length) {
                                 if (var2) {
                                    if (class717.field10755[var5][var6]) {
                                       return true;
                                    }

                                    ++var4;
                                 } else {
                                    ++var4;
                                 }
                              } else {
                                 if (class717.field10755[var5][var6]) {
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
                  } while(~this.field1049 <= ~var4);
               }

               ++var3;
               if (this.field1042 < var3) {
                  var10000 = 0;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = this.field1044;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1050[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "m",
      descriptor = "(I)V",
      line = 175
   )
   public void method739(int arg0) {
      try {
         if (arg0 > 62) {
            ++field1047;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1050[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(I[Llja;)I",
      line = 192
   )
   public final int method740(int arg0, class404[] arg1) {
      boolean var3 = client.field1786;

      try {
         int var4;
         int var6;
         label356: {
            ++field1048;
            var4 = 0;
            int var5 = this.field1040;
            if (var3) {
               var6 = this.field1044;
            } else if (this.field1042 < var5) {
               var6 = var4;
               if (!var3) {
                  break label356;
               }
            } else {
               var6 = this.field1044;
            }

            label355:
            while(true) {
               label353:
               while(var3 || var6 <= this.field1049) {
                  while(true) {
                     label349:
                     while(true) {
                        int var10000;
                        short var10001;
                        label347: {
                           long var7 = class226.field3439[super.field1506][var5][var6];
                           long var9 = 0L;
                           int var11;
                           if (var3) {
                              var11 = (int)(var7 >>> (int)var9 & 65535L);
                              if (var11 <= 0) {
                                 if (var3) {
                                    break label355;
                                 }

                                 ++var6;
                                 var10000 = var6;
                                 var10001 = this.field1049;
                                 break label347;
                              }
                           } else {
                              if (var9 > 48L) {
                                 if (var3) {
                                    break label355;
                                 }

                                 ++var6;
                                 var10000 = var6;
                                 var10001 = this.field1049;
                                 break label347;
                              }

                              var11 = (int)(var7 >>> (int)var9 & 65535L);
                              if (var11 <= 0) {
                                 if (var3) {
                                    break label355;
                                 }

                                 ++var6;
                                 var10000 = var6;
                                 var10001 = this.field1049;
                                 break label347;
                              }
                           }

                           while(true) {
                              label344: {
                                 class330 var12 = class88.field1276[var11 + -1];
                                 int var13 = 0;
                                 if (var3) {
                                    if (arg1[var13] == var12.field5003) {
                                       var9 += 16L;
                                       if (!var3) {
                                          break label344;
                                       }

                                       ++var13;
                                    } else {
                                       ++var13;
                                    }
                                 }

                                 while(true) {
                                    if (var13 >= var4) {
                                       arg1[var4++] = var12.field5003;
                                       var10000 = ~var4;
                                       if (var3) {
                                          if (var10000 > -5) {
                                             break label353;
                                          }
                                          continue label349;
                                       }

                                       if (var10000 == -5) {
                                          var6 = var4;
                                          if (!var3) {
                                             break label355;
                                          }
                                          continue label349;
                                       }

                                       var9 += 16L;
                                       break;
                                    }

                                    if (arg1[var13] == var12.field5003) {
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
                                    break label355;
                                 }

                                 ++var6;
                                 var10000 = var6;
                                 var10001 = this.field1049;
                                 break;
                              }

                              var11 = (int)(var7 >>> (int)var9 & 65535L);
                              if (var11 <= 0) {
                                 if (var3) {
                                    break label355;
                                 }

                                 ++var6;
                                 var10000 = var6;
                                 var10001 = this.field1049;
                                 break;
                              }
                           }
                        }

                        if (var10000 > var10001) {
                           break label353;
                        }
                     }
                  }
               }

               if (var3) {
                  break;
               }

               ++var5;
               if (this.field1042 < var5) {
                  var6 = var4;
                  if (!var3) {
                     break;
                  }
               } else {
                  var6 = this.field1044;
               }
            }
         }

         if (var3) {
            arg1[var6] = null;
            ++var6;
         }

         while(true) {
            while(var6 < 4) {
               arg1[var6] = null;
               ++var6;
            }

            if (!var3) {
               if (arg0 != 27084) {
                  return 92;
               }

               if (~this.field1046 != -1) {
                  short var16;
                  short var17;
                  int var18;
                  int var19;
                  label392: {
                     int var14 = -class487.field7409 + this.field1040;
                     int var15 = -class701.field10446 + this.field1044;
                     if (this.field1046 == 1) {
                        if (var15 <= var14) {
                           var16 = this.field1044;
                           var17 = this.field1040;
                           var18 = this.field1040 + -1;
                           var19 = this.field1044 + 1;
                           if (!var3) {
                              break label392;
                           }
                        }

                        var17 = this.field1040;
                        var18 = this.field1040 + 1;
                        var19 = this.field1044 + -1;
                        var16 = this.field1044;
                        if (!var3) {
                           break label392;
                        }
                     }

                     if (~(-var14) > ~var15) {
                        var17 = this.field1040;
                        var18 = this.field1040 + -1;
                        var19 = this.field1044 - 1;
                        var16 = this.field1044;
                        if (!var3) {
                           break label392;
                        }
                     }

                     var16 = this.field1044;
                     var17 = this.field1040;
                     var19 = this.field1044 + 1;
                     var18 = this.field1040 + 1;
                  }

                  int var20 = 0;
                  if (var3 || var4 > var20) {
                     label215:
                     do {
                        long var21 = class226.field3439[super.field1506][var17][var19];
                        class330 var23;
                        long var24;
                        class330 var26;
                        int var27;
                        if (var3) {
                           var23 = class88.field1276[(int)((65535L & var21) - 1L)];
                           var21 >>>= 16;
                        } else {
                           if (~var21 == -1L) {
                              var24 = class226.field3439[super.field1506][var18][var16];
                              if (var3 || ~var24 != -1L) {
                                 do {
                                    var26 = class88.field1276[(int)((65535L & var24) - 1L)];
                                    var24 >>>= 16;

                                    while(arg1[var20] == var26.field5003) {
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
                                 while(~var27 > ~(var4 - 1)) {
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

                           var23 = class88.field1276[(int)((65535L & var21) - 1L)];
                           var21 >>>= 16;
                        }

                        while(true) {
                           while(arg1[var20] == var23.field5003) {
                              if (!var3) {
                                 if (!var3) {
                                    ++var20;
                                    continue label215;
                                 }
                                 break;
                              }
                           }

                           if (~var21 == -1L) {
                              var24 = class226.field3439[super.field1506][var18][var16];
                              if (var3 || ~var24 != -1L) {
                                 do {
                                    var26 = class88.field1276[(int)((65535L & var24) - 1L)];
                                    var24 >>>= 16;

                                    while(arg1[var20] == var26.field5003) {
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
                                 while(~var27 > ~(var4 - 1)) {
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

                           var23 = class88.field1276[(int)((65535L & var21) - 1L)];
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
         throw class482.method3757(var29, field1050[13] + arg0 + ',' + (arg1 != null ? field1050[6] : field1050[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "<init>",
      descriptor = "(IIIIIIIIIZB)V",
      line = 360
   )
   public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
      try {
         this.field1046 = arg10;
         super.field1505 = arg2;
         this.field1040 = (short)arg5;
         super.field1500 = (byte)arg1;
         this.field1042 = (short)arg6;
         super.field1494 = arg4;
         this.field1044 = (short)arg7;
         super.field1495 = arg3;
         this.field1038 = arg9;
         super.field1506 = (byte)arg0;
         this.field1049 = (short)arg8;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field1050[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method741(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method742(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
