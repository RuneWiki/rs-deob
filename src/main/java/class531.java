import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class531 extends OutputStream {
   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8049 = new String[]{method4077(method4076("\b? 0")), method4077(method4076("\u001ddbr_")), method4077(method4076("\u0001#-r`N")), method4077(method4076("\u0001#-rU\u0014#89\n")), method4077(method4076("\u0015p .")), method4077(method4076("\u0001#-rcN"))};
   @OriginalMember(
      owner = "client!gia",
      name = "b",
      descriptor = "I"
   )
   public static int field8045;
   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "I"
   )
   public static int field8046;
   @OriginalMember(
      owner = "client!gia",
      name = "c",
      descriptor = "I"
   )
   public static int field8047;
   @OriginalMember(
      owner = "client!gia",
      name = "d",
      descriptor = "I"
   )
   public static int field8048;

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(Lfq;IIB)V"
   )
   public static final void method4074(class374 arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg0.field5893 == 0) {
            arg0.field5845 = arg0.field5901;
         } else if (arg0.field5893 != 1) {
            if (arg0.field5893 == 2) {
               arg0.field5845 = -arg0.field5901 + -arg0.field5849 + arg2;
            } else if (arg0.field5893 != 3) {
               if (~arg0.field5893 == -5) {
                  arg0.field5845 = (arg0.field5901 * arg2 >> 14) + (-arg0.field5849 + arg2) / 2;
               } else {
                  arg0.field5845 = -arg0.field5849 + arg2 + -(arg0.field5901 * arg2 >> 14);
               }
            } else {
               arg0.field5845 = arg0.field5901 * arg2 >> 14;
            }
         } else {
            arg0.field5845 = (-arg0.field5849 + arg2) / 2 + arg0.field5901;
         }

         ++field8045;
         if (arg0.field5889 != 0) {
            if (arg0.field5889 == 1) {
               arg0.field5879 = (-arg0.field5915 + arg1) / 2 + arg0.field5943;
            } else if (arg0.field5889 == 2) {
               arg0.field5879 = arg1 - (arg0.field5943 + arg0.field5915);
            } else if (arg0.field5889 != 3) {
               if (~arg0.field5889 != -5) {
                  arg0.field5879 = -arg0.field5915 + arg1 + -(arg0.field5943 * arg1 >> 14);
               } else {
                  arg0.field5879 = (arg0.field5943 * arg1 >> 14) + (arg1 - arg0.field5915) / 2;
               }
            } else {
               arg0.field5879 = arg0.field5943 * arg1 >> 14;
            }
         } else {
            arg0.field5879 = arg0.field5943;
         }

         int var4 = -102 % ((arg3 - 30) / 45);
         if (class351.field5351) {
            if (client.method1148(arg0).field898 == 0 && ~arg0.field5910 != -1) {
               return;
            }

            if (arg0.field5845 >= 0) {
               if (~(arg0.field5849 + arg0.field5845) < ~arg2) {
                  arg0.field5845 = -arg0.field5849 + arg2;
               }
            } else {
               arg0.field5845 = 0;
            }

            if (arg0.field5879 < 0) {
               arg0.field5879 = 0;
               return;
            }

            if (arg0.field5879 - -arg0.field5915 > arg1) {
               arg0.field5879 = arg1 - arg0.field5915;
               return;
            }
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8049[2] + (arg0 != null ? field8049[1] : field8049[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(ILpfa;I)V"
   )
   public static final void method4075(int arg0, class102 arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field8046;
         boolean var4 = arg1.method988((byte)-116, 1) == 1;
         if (var4) {
            class213.field3236[class667.field9984++] = arg2;
         }

         int var5 = arg1.method988((byte)-116, 2);
         if (arg0 < 6) {
            method4074((class374)null, 56, -64, (byte)-51);
         }

         class9 var6 = class484.field7370[arg2];
         if (var5 == 0) {
            if (var4) {
               var6.field107 = false;
            } else if (class315.field4864 == arg2) {
               throw new RuntimeException(field8049[4]);
            } else {
               class240 var7;
               label189: {
                  var7 = class127.field1826[arg2] = new class240();
                  var7.field3643 = (var6.field1683[0] + class120.field1694 >> 6 << 14) + ((var6.field1506 << 28) - -(class119.field1606 - -var6.field1685[0] >> 6));
                  if (var6.field105 == -1) {
                     var7.field3634 = var6.field1666.method5322((byte)58);
                     if (!var3) {
                        break label189;
                     }
                  }

                  var7.field3634 = var6.field105;
               }

               var7.field3636 = var6.field1649;
               var7.field3641 = var6.field78;
               var7.field3639 = var6.field81;
               if (~var6.field101 < -1) {
                  class717.method5310((byte)113, var6);
               }

               class484.field7370[arg2] = null;
               if (~arg1.method988((byte)-116, 1) != -1) {
                  class271.method2316((byte)-76, arg1, arg2);
               }

            }
         } else if (~var5 == -2) {
            int var9;
            int var10;
            label303: {
               int var8 = arg1.method988((byte)-116, 3);
               var9 = var6.field1683[0];
               var10 = var6.field1685[0];
               if (var8 == 0) {
                  --var10;
                  --var9;
                  if (!var3) {
                     break label303;
                  }
               }

               if (~var8 == -2) {
                  --var10;
                  if (!var3) {
                     break label303;
                  }
               }

               if (var8 == 2) {
                  --var10;
                  ++var9;
                  if (!var3) {
                     break label303;
                  }
               }

               if (~var8 != -4) {
                  if (var8 != 4) {
                     if (~var8 == -6) {
                        ++var10;
                        --var9;
                        if (!var3) {
                           break label303;
                        }
                     }

                     if (var8 != 6) {
                        if (~var8 != -8) {
                           break label303;
                        }

                        ++var9;
                        ++var10;
                        if (!var3) {
                           break label303;
                        }
                     }

                     ++var10;
                     if (!var3) {
                        break label303;
                     }
                  }

                  ++var9;
                  if (!var3) {
                     break label303;
                  }
               }

               --var9;
            }

            if (var4) {
               var6.field107 = true;
               var6.field90 = var9;
               var6.field103 = var10;
            } else {
               var6.method59(var10, var9, true, class417.field6452[arg2]);
            }
         } else if (~var5 == -3) {
            int var12;
            int var13;
            label306: {
               int var11 = arg1.method988((byte)-116, 4);
               var12 = var6.field1683[0];
               var13 = var6.field1685[0];
               if (~var11 == -1) {
                  var12 -= 2;
                  var13 -= 2;
                  if (!var3) {
                     break label306;
                  }
               }

               if (var11 == 1) {
                  var13 -= 2;
                  --var12;
                  if (!var3) {
                     break label306;
                  }
               }

               if (~var11 != -3) {
                  if (~var11 != -4) {
                     if (~var11 == -5) {
                        var13 -= 2;
                        var12 += 2;
                        if (!var3) {
                           break label306;
                        }
                     }

                     if (var11 != 5) {
                        if (~var11 != -7) {
                           if (var11 != 7) {
                              if (~var11 != -9) {
                                 if (~var11 == -10) {
                                    ++var13;
                                    var12 -= 2;
                                    if (!var3) {
                                       break label306;
                                    }
                                 }

                                 if (~var11 != -11) {
                                    if (~var11 == -12) {
                                       var13 += 2;
                                       var12 -= 2;
                                       if (!var3) {
                                          break label306;
                                       }
                                    }

                                    if (~var11 == -13) {
                                       var13 += 2;
                                       --var12;
                                       if (!var3) {
                                          break label306;
                                       }
                                    }

                                    if (~var11 == -14) {
                                       var13 += 2;
                                       if (!var3) {
                                          break label306;
                                       }
                                    }

                                    if (var11 == 14) {
                                       var13 += 2;
                                       ++var12;
                                       if (!var3) {
                                          break label306;
                                       }
                                    }

                                    if (var11 != 15) {
                                       break label306;
                                    }

                                    var12 += 2;
                                    var13 += 2;
                                    if (!var3) {
                                       break label306;
                                    }
                                 }

                                 var12 += 2;
                                 ++var13;
                                 if (!var3) {
                                    break label306;
                                 }
                              }

                              var12 += 2;
                              if (!var3) {
                                 break label306;
                              }
                           }

                           var12 -= 2;
                           if (!var3) {
                              break label306;
                           }
                        }

                        var12 += 2;
                        --var13;
                        if (!var3) {
                           break label306;
                        }
                     }

                     --var13;
                     var12 -= 2;
                     if (!var3) {
                        break label306;
                     }
                  }

                  ++var12;
                  var13 -= 2;
                  if (!var3) {
                     break label306;
                  }
               }

               var13 -= 2;
            }

            if (var4) {
               var6.field90 = var12;
               var6.field107 = true;
               var6.field103 = var13;
            } else {
               var6.method59(var13, var12, true, class417.field6452[arg2]);
            }
         } else {
            int var14 = arg1.method988((byte)-116, 1);
            if (~var14 == -1) {
               int var15 = arg1.method988((byte)-116, 12);
               int var16 = var15 >> 10;
               int var17 = 31 & var15 >> 5;
               if (~var17 < -16) {
                  var17 -= 32;
               }

               int var18 = 31 & var15;
               if (~var18 < -16) {
                  var18 -= 32;
               }

               int var19;
               int var20;
               label282: {
                  var19 = var6.field1683[0] + var17;
                  var20 = var6.field1685[0] + var18;
                  if (var4) {
                     var6.field107 = true;
                     var6.field90 = var19;
                     var6.field103 = var20;
                     if (!var3) {
                        break label282;
                     }
                  }

                  var6.method59(var20, var19, true, class417.field6452[arg2]);
               }

               var6.field1506 = var6.field1500 = (byte)(var6.field1506 + var16 & 3);
               if (class577.method4326(var19, (byte)77, var20)) {
                  ++var6.field1500;
               }

               if (class315.field4864 == arg2) {
                  if (~class464.field7054 != ~var6.field1506) {
                     class67.field884 = true;
                  }

                  class464.field7054 = var6.field1506;
               }

            } else {
               int var22;
               int var25;
               int var26;
               label292: {
                  int var21 = arg1.method988((byte)-116, 30);
                  var22 = var21 >> 28;
                  int var23 = var21 >> 14 & 16383;
                  int var24 = var21 & 16383;
                  var25 = (var6.field1683[0] + class120.field1694 + var23 & 16383) + -class120.field1694;
                  var26 = (class119.field1606 + var24 + var6.field1685[0] & 16383) - class119.field1606;
                  if (!var4) {
                     var6.method59(var26, var25, true, class417.field6452[arg2]);
                     if (!var3) {
                        break label292;
                     }
                  }

                  var6.field107 = true;
                  var6.field103 = var26;
                  var6.field90 = var25;
               }

               var6.field1506 = var6.field1500 = (byte)(var6.field1506 + var22 & 3);
               if (class577.method4326(var25, (byte)77, var26)) {
                  ++var6.field1500;
               }

               if (class315.field4864 == arg2) {
                  class464.field7054 = var6.field1506;
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class482.method3757(var28, field8049[5] + arg0 + ',' + (arg1 != null ? field8049[1] : field8049[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field8048;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8049[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4076(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4077(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
