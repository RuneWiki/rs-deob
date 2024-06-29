import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class525 extends Exception {
   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7532 = new String[]{method3805(method3804("xU$w{")), method3805(method3804("m\u000ef5")), method3805(method3804("u\u001a$\u001d.")), method3805(method3804("u\u001a$\u001b.")), method3805(method3804("u\u001a$\u0018.")), method3805(method3804("u\u001a$\u001a."))};
   @OriginalMember(
      owner = "client!va",
      name = "h",
      descriptor = "Leg;"
   )
   public static class118 field7523 = new class118(82, 11);
   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "Lek;"
   )
   public static class536 field7525 = new class536(48, 3);
   @OriginalMember(
      owner = "client!va",
      name = "e",
      descriptor = "S"
   )
   public static short field7530 = 32767;
   @OriginalMember(
      owner = "client!va",
      name = "g",
      descriptor = "Ldba;"
   )
   public static class102 field7529 = class546.method3922((byte)58);
   @OriginalMember(
      owner = "client!va",
      name = "f",
      descriptor = "I"
   )
   public static int field7524;
   @OriginalMember(
      owner = "client!va",
      name = "i",
      descriptor = "I"
   )
   public static int field7526;
   @OriginalMember(
      owner = "client!va",
      name = "b",
      descriptor = "I"
   )
   public static int field7527;
   @OriginalMember(
      owner = "client!va",
      name = "c",
      descriptor = "I"
   )
   public static int field7528;
   @OriginalMember(
      owner = "client!va",
      name = "d",
      descriptor = "Lkf;"
   )
   public static class266 field7531;

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method3800(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         ++field7524;
         if (arg0 != -122) {
            method3800((byte)-83, -28, 91, -118, 55);
         }

         int var6 = 0;
         if (!var5 && ~var6 <= ~class425.field6085) {
            class193.method1520(arg3, -87, arg1 + arg3, arg2 + arg4, arg2);
         } else {
            do {
               Rectangle var7 = class763.field11268[var6];
               if (var7.x - -var7.width > arg2 && var7.x < arg2 + arg4 && var7.y + var7.height > arg3 && arg1 + arg3 > var7.y) {
                  class188.field2673[var6] = true;
               }

               ++var6;
            } while(~var6 > ~class425.field6085);

            class193.method1520(arg3, -87, arg1 + arg3, arg2 + arg4, arg2);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field7532[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(ZLjava/lang/String;)[B"
   )
   public static final byte[] method3801(boolean arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field7526;
         int var3 = arg1.length();
         if (arg0) {
            method3800((byte)46, -127, 85, -114, 0);
         }

         byte[] var4 = new byte[var3];
         int var5 = 0;
         if (!var2 && ~var3 >= ~var5) {
            return var4;
         } else {
            do {
               label267: {
                  char var6 = arg1.charAt(var5);
                  if (~var6 < -1 && var6 < 128 || ~var6 <= -161 && var6 <= 255) {
                     var4[var5] = (byte)var6;
                     if (!var2) {
                        break label267;
                     }
                  }

                  if (~var6 != -8365) {
                     label231: {
                        if (var6 != 8218) {
                           if (var6 == 402) {
                              var4[var5] = -125;
                              if (!var2) {
                                 break label231;
                              }
                           }

                           if (var6 == 8222) {
                              var4[var5] = -124;
                              if (!var2) {
                                 break label231;
                              }
                           }

                           if (~var6 == -8231) {
                              var4[var5] = -123;
                              if (!var2) {
                                 break label231;
                              }
                           }

                           if (var6 != 8224) {
                              if (var6 != 8225) {
                                 if (var6 == 710) {
                                    var4[var5] = -120;
                                    if (!var2) {
                                       break label231;
                                    }
                                 }

                                 if (~var6 == -8241) {
                                    var4[var5] = -119;
                                    if (!var2) {
                                       break label231;
                                    }
                                 }

                                 if (~var6 == -353) {
                                    var4[var5] = -118;
                                    if (!var2) {
                                       break label231;
                                    }
                                 }

                                 if (~var6 != -8250) {
                                    if (var6 == 338) {
                                       var4[var5] = -116;
                                       if (!var2) {
                                          break label231;
                                       }
                                    }

                                    if (~var6 == -382) {
                                       var4[var5] = -114;
                                       if (!var2) {
                                          break label231;
                                       }
                                    }

                                    if (~var6 != -8217) {
                                       if (~var6 == -8218) {
                                          var4[var5] = -110;
                                          if (!var2) {
                                             break label231;
                                          }
                                       }

                                       if (var6 == 8220) {
                                          var4[var5] = -109;
                                          if (!var2) {
                                             break label231;
                                          }
                                       }

                                       if (var6 == 8221) {
                                          var4[var5] = -108;
                                          if (!var2) {
                                             break label231;
                                          }
                                       }

                                       if (var6 != 8226) {
                                          if (var6 == 8211) {
                                             var4[var5] = -106;
                                             if (!var2) {
                                                break label231;
                                             }
                                          }

                                          if (~var6 != -8213) {
                                             if (~var6 != -733) {
                                                if (~var6 == -8483) {
                                                   var4[var5] = -103;
                                                   if (!var2) {
                                                      break label231;
                                                   }
                                                }

                                                if (~var6 != -354) {
                                                   if (var6 == 8250) {
                                                      var4[var5] = -101;
                                                      if (!var2) {
                                                         break label231;
                                                      }
                                                   }

                                                   if (~var6 != -340) {
                                                      if (var6 != 382) {
                                                         if (var6 == 376) {
                                                            var4[var5] = -97;
                                                            if (!var2) {
                                                               break label231;
                                                            }
                                                         }

                                                         var4[var5] = 63;
                                                         if (!var2) {
                                                            break label231;
                                                         }
                                                      }

                                                      var4[var5] = -98;
                                                      if (!var2) {
                                                         break label231;
                                                      }
                                                   }

                                                   var4[var5] = -100;
                                                   if (!var2) {
                                                      break label231;
                                                   }
                                                }

                                                var4[var5] = -102;
                                                if (!var2) {
                                                   break label231;
                                                }
                                             }

                                             var4[var5] = -104;
                                             if (!var2) {
                                                break label231;
                                             }
                                          }

                                          var4[var5] = -105;
                                          if (!var2) {
                                             break label231;
                                          }
                                       }

                                       var4[var5] = -107;
                                       if (!var2) {
                                          break label231;
                                       }
                                    }

                                    var4[var5] = -111;
                                    if (!var2) {
                                       break label231;
                                    }
                                 }

                                 var4[var5] = -117;
                                 if (!var2) {
                                    break label231;
                                 }
                              }

                              var4[var5] = -121;
                              if (!var2) {
                                 break label231;
                              }
                           }

                           var4[var5] = -122;
                           if (!var2) {
                              break label231;
                           }
                        }

                        var4[var5] = -126;
                        if (var2) {
                           var4[var5] = -128;
                        }
                     }
                  } else {
                     var4[var5] = -128;
                  }
               }

               ++var5;
            } while(~var3 < ~var5);

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7532[2] + arg0 + ',' + (arg1 != null ? field7532[0] : field7532[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3802(int arg0) {
      try {
         field7529 = null;
         if (arg0 != 20612) {
            method3800((byte)16, -72, 120, -105, -94);
         }

         field7523 = null;
         field7531 = null;
         field7525 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7532[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z"
   )
   public static final boolean method3803(String arg0, String arg1, int arg2, String arg3, String arg4) {
      try {
         ++field7527;
         if (arg2 != -18357) {
            return true;
         } else if (arg3 != null && arg0 != null) {
            return !arg3.startsWith("#") && !arg0.startsWith("#") ? arg1.equals(arg4) : arg3.equals(arg0);
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7532[4] + (arg0 != null ? field7532[0] : field7532[1]) + ',' + (arg1 != null ? field7532[0] : field7532[1]) + ',' + arg2 + ',' + (arg3 != null ? field7532[0] : field7532[1]) + ',' + (arg4 != null ? field7532[0] : field7532[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3804(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3805(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
