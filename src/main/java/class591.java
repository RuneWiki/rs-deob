import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class591 extends class508 {
   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8710 = new String[]{method4301(method4300("W4Q)8")), method4301(method4300("W4Q*8")), method4301(method4300("[wQFm")), method4301(method4300("N,\u0013\u0004")), method4301(method4300("W4Q,8")), method4301(method4300("W4Q+8")), method4301(method4300("W4Q!8")), method4301(method4300("W4Q.8"))};
   @OriginalMember(
      owner = "client!wm",
      name = "w",
      descriptor = "I"
   )
   public static int field8704;
   @OriginalMember(
      owner = "client!wm",
      name = "v",
      descriptor = "I"
   )
   public static int field8706;
   @OriginalMember(
      owner = "client!wm",
      name = "r",
      descriptor = "I"
   )
   public static int field8707;
   @OriginalMember(
      owner = "client!wm",
      name = "u",
      descriptor = "I"
   )
   public static int field8708;
   @OriginalMember(
      owner = "client!wm",
      name = "t",
      descriptor = "I"
   )
   public static int field8709;
   @OriginalMember(
      owner = "client!wm",
      name = "s",
      descriptor = "[Lgn;"
   )
   public static class731[] field8705;

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public final void method1486(int arg0) {
      try {
         ++field8706;
         if (arg0 != -5238) {
            field8705 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8710[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I",
      line = 13
   )
   public static final int method4296(String arg0, int arg1) {
      try {
         ++field8707;
         if (arg1 != 8) {
            field8705 = null;
         }

         return 2 + arg0.length();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8710[1] + (arg0 != null ? field8710[2] : field8710[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(ZLjagtheora/ogg/OggPacket;)V",
      line = 25
   )
   public final void method1485(boolean arg0, OggPacket arg1) {
      try {
         if (arg0) {
            method4299(14);
         }

         ++field8704;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8710[7] + arg0 + ',' + (arg1 != null ? field8710[2] : field8710[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(ILkj;)V",
      line = 37
   )
   public static final void method4297(int arg0, class593 arg1) {
      boolean var2 = client.field4360;

      RuntimeException var10000;
      label42: {
         boolean var10001;
         class593 var3;
         try {
            if (arg1.field8721 != null) {
               arg1.field8721.field9719 = 0;
            }

            ++field8708;
            arg1.field8720 = false;
            var3 = arg1.method1603();
            if (arg0 != -1787) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label42;
         }

         while(true) {
            label37: {
               try {
                  if (var3 != null) {
                     method4297(-1787, var3);
                     break label37;
                  }
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var2) {
                  return;
               }
            }

            try {
               var3 = arg1.method1605();
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class237.method1823(var4, field8710[5] + arg0 + ',' + (arg1 != null ? field8710[2] : field8710[3]) + ')');
   }

   @OriginalMember(
      owner = "client!wm",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V",
      line = 59
   )
   public class591(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!wm",
      name = "c",
      descriptor = "(I)V",
      line = 67
   )
   public static final void method4298(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field8709;
         short var2 = 1024;
         short var3 = 3072;
         if (class183.field2581) {
            if (class357.field4792) {
               var2 = 2048;
            }

            var3 = 4096;
         }

         if (class273.field3753 < (float)var2) {
            class273.field3753 = (float)var2;
         }

         if ((float)var3 < class273.field3753) {
            class273.field3753 = (float)var3;
            if (var1) {
               class117.field1467 -= 16384.0F;
            }
         }

         while(class117.field1467 >= 16384.0F) {
            class117.field1467 -= 16384.0F;
         }

         if (var1) {
            class117.field1467 += 16384.0F;
         }

         while(class117.field1467 < 0.0F) {
            class117.field1467 += 16384.0F;
         }

         int var4 = class725.field10585 >> 9;
         int var5 = class310.field4257 >> 9;
         int var6 = class102.method851(class561.field8019, (byte)127, class725.field10585, class310.field4257);
         int var7 = 0;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var10000;
         if (~var4 < -4) {
            if (~var5 < -4) {
               if (~(class644.field9403 - 4) < ~var4) {
                  if (~(class337.field4594 + -4) < ~var5) {
                     var8 = var4 + -4;
                     if (var1) {
                        var9 = -4 + var5;
                        if (var1) {
                           var10 = class561.field8019;
                           if (var10 < 3 && class437.method3224(var9, true, var8)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                              var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                           }

                           if (class731.field10698 != null && class731.field10698[var10] != null) {
                              var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     } else if (var4 - -4 < var8) {
                        var8 = (var7 >> 2) * 1536;
                        var10000 = ~var8;
                        if (!var1) {
                           if (var10000 < -786433) {
                              var8 = 786432;
                           }

                           if (arg0 > var8) {
                              var8 = 262144;
                           }

                           if (~var8 >= ~class532.field7591) {
                              if (~class532.field7591 < ~var8) {
                                 class532.field7591 += (var8 - class532.field7591) / 80;
                                 return;
                              }
                           } else {
                              class532.field7591 += (var8 - class532.field7591) / 24;
                           }

                           return;
                        }

                        var9 = var10000 + -786433;
                        if (var1) {
                           var10 = class561.field8019;
                           if (var10 < 3 && class437.method3224(var9, true, var8)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                              var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                           }

                           if (class731.field10698 != null && class731.field10698[var10] != null) {
                              var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     } else {
                        var9 = -4 + var5;
                        if (var1) {
                           var10 = class561.field8019;
                           if (var10 < 3 && class437.method3224(var9, true, var8)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                              var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                           }

                           if (class731.field10698 != null && class731.field10698[var10] != null) {
                              var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  } else {
                     var8 = (var7 >> 2) * 1536;
                     var10000 = ~var8;
                     if (!var1) {
                        if (var10000 < -786433) {
                           var8 = 786432;
                        }

                        if (arg0 > var8) {
                           var8 = 262144;
                        }

                        if (~var8 >= ~class532.field7591) {
                           if (~class532.field7591 < ~var8) {
                              class532.field7591 += (var8 - class532.field7591) / 80;
                              return;
                           }
                        } else {
                           class532.field7591 += (var8 - class532.field7591) / 24;
                        }

                        return;
                     }

                     var9 = var10000 + -786433;
                     if (var1) {
                        var10 = class561.field8019;
                        if (var10 < 3 && class437.method3224(var9, true, var8)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                           var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                        }

                        if (class731.field10698 != null && class731.field10698[var10] != null) {
                           var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                           if (~var12 < ~var7) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  }
               } else {
                  var8 = (var7 >> 2) * 1536;
                  var10000 = ~var8;
                  if (!var1) {
                     if (var10000 < -786433) {
                        var8 = 786432;
                     }

                     if (arg0 > var8) {
                        var8 = 262144;
                     }

                     if (~var8 >= ~class532.field7591) {
                        if (~class532.field7591 < ~var8) {
                           class532.field7591 += (var8 - class532.field7591) / 80;
                           return;
                        }
                     } else {
                        class532.field7591 += (var8 - class532.field7591) / 24;
                     }

                     return;
                  }

                  var9 = var10000 + -786433;
                  if (var1) {
                     var10 = class561.field8019;
                     if (var10 < 3 && class437.method3224(var9, true, var8)) {
                        ++var10;
                     }

                     var11 = 0;
                     if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                        var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                     }

                     if (class731.field10698 != null && class731.field10698[var10] != null) {
                        var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                        if (~var12 < ~var7) {
                           var7 = var12;
                        }
                     }

                     ++var9;
                  }
               }
            } else {
               var8 = (var7 >> 2) * 1536;
               var10000 = ~var8;
               if (!var1) {
                  if (var10000 < -786433) {
                     var8 = 786432;
                  }

                  if (arg0 > var8) {
                     var8 = 262144;
                  }

                  if (~var8 >= ~class532.field7591) {
                     if (~class532.field7591 < ~var8) {
                        class532.field7591 += (var8 - class532.field7591) / 80;
                        return;
                     }
                  } else {
                     class532.field7591 += (var8 - class532.field7591) / 24;
                  }

                  return;
               }

               var9 = var10000 + -786433;
               if (var1) {
                  var10 = class561.field8019;
                  if (var10 < 3 && class437.method3224(var9, true, var8)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                     var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                  }

                  if (class731.field10698 != null && class731.field10698[var10] != null) {
                     var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                     if (~var12 < ~var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }
            }
         } else {
            var8 = (var7 >> 2) * 1536;
            var10000 = ~var8;
            if (!var1) {
               if (var10000 < -786433) {
                  var8 = 786432;
               }

               if (arg0 > var8) {
                  var8 = 262144;
               }

               if (~var8 >= ~class532.field7591) {
                  if (~class532.field7591 < ~var8) {
                     class532.field7591 += (var8 - class532.field7591) / 80;
                     return;
                  }
               } else {
                  class532.field7591 += (var8 - class532.field7591) / 24;
               }

               return;
            }

            var9 = var10000 + -786433;
            if (var1) {
               var10 = class561.field8019;
               if (var10 < 3 && class437.method3224(var9, true, var8)) {
                  ++var10;
               }

               var11 = 0;
               if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                  var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
               }

               if (class731.field10698 != null && class731.field10698[var10] != null) {
                  var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                  if (~var12 < ~var7) {
                     var7 = var12;
                  }
               }

               ++var9;
            }
         }

         while(true) {
            while(~var9 >= ~(var5 + 4)) {
               var10 = class561.field8019;
               if (var10 < 3 && class437.method3224(var9, true, var8)) {
                  ++var10;
               }

               var11 = 0;
               if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                  var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
               }

               if (class731.field10698 != null && class731.field10698[var10] != null) {
                  var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                  if (~var12 < ~var7) {
                     var7 = var12;
                  }
               }

               ++var9;
            }

            ++var8;
            if (var4 - -4 < var8) {
               var8 = (var7 >> 2) * 1536;
               var10000 = ~var8;
               if (!var1) {
                  if (var10000 < -786433) {
                     var8 = 786432;
                  }

                  if (arg0 > var8) {
                     var8 = 262144;
                  }

                  if (~var8 >= ~class532.field7591) {
                     if (~class532.field7591 < ~var8) {
                        class532.field7591 += (var8 - class532.field7591) / 80;
                        return;
                     }
                  } else {
                     class532.field7591 += (var8 - class532.field7591) / 24;
                  }

                  return;
               }

               var9 = var10000 + -786433;
               if (var1) {
                  var10 = class561.field8019;
                  if (var10 < 3 && class437.method3224(var9, true, var8)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                     var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                  }

                  if (class731.field10698 != null && class731.field10698[var10] != null) {
                     var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                     if (~var12 < ~var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }
            } else {
               var9 = -4 + var5;
               if (var1) {
                  var10 = class561.field8019;
                  if (var10 < 3 && class437.method3224(var9, true, var8)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class101.field1294.field9701 != null && class101.field1294.field9701[var10] != null) {
                     var11 = (255 & class101.field1294.field9701[var10][var8][var9]) * 8 << 2;
                  }

                  if (class731.field10698 != null && class731.field10698[var10] != null) {
                     var12 = -class731.field10698[var10].method2219(true, var8, var9) - -var11 + var6;
                     if (~var12 < ~var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field8710[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "b",
      descriptor = "(I)V",
      line = 166
   )
   public static void method4299(int arg0) {
      try {
         field8705 = null;
         if (arg0 != 25258) {
            field8705 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8710[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4300(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4301(char[] arg0) {
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
            var10005 = 89;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
