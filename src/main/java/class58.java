import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class58 extends class96 {
   @OriginalMember(
      owner = "client!ed",
      name = "q",
      descriptor = "I"
   )
   public int field824 = 0;
   @OriginalMember(
      owner = "client!ed",
      name = "D",
      descriptor = "I"
   )
   public int field834 = 12800;
   @OriginalMember(
      owner = "client!ed",
      name = "G",
      descriptor = "I"
   )
   public int field836 = 0;
   @OriginalMember(
      owner = "client!ed",
      name = "L",
      descriptor = "I"
   )
   public int field832 = -1;
   @OriginalMember(
      owner = "client!ed",
      name = "F",
      descriptor = "Z"
   )
   public boolean field839 = true;
   @OriginalMember(
      owner = "client!ed",
      name = "w",
      descriptor = "I"
   )
   public int field833 = -1;
   @OriginalMember(
      owner = "client!ed",
      name = "t",
      descriptor = "I"
   )
   public int field840 = 12800;
   @OriginalMember(
      owner = "client!ed",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   public String field825;
   @OriginalMember(
      owner = "client!ed",
      name = "x",
      descriptor = "I"
   )
   public int field827;
   @OriginalMember(
      owner = "client!ed",
      name = "B",
      descriptor = "I"
   )
   public int field826;
   @OriginalMember(
      owner = "client!ed",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public String field831;
   @OriginalMember(
      owner = "client!ed",
      name = "J",
      descriptor = "Lsb;"
   )
   public class261 field828;
   @OriginalMember(
      owner = "client!ed",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field843 = new String[]{method604(method603("+Ji\u000e0")), method604(method603(" [+&")), method604(method603("5\u0000ide")), method604(method603("+Ji\u000b0")), method604(method603("+Ji\b0")), method604(method603("+Jivq G3t0")), method604(method603("+Ji\r0")), method604(method603("+Ji\f0")), method604(method603("'O")), method604(method603("+Ji\t0"))};
   @OriginalMember(
      owner = "client!ed",
      name = "K",
      descriptor = "I"
   )
   public static int field838 = -1;
   @OriginalMember(
      owner = "client!ed",
      name = "E",
      descriptor = "I"
   )
   public static int field823;
   @OriginalMember(
      owner = "client!ed",
      name = "H",
      descriptor = "I"
   )
   public static int field829;
   @OriginalMember(
      owner = "client!ed",
      name = "u",
      descriptor = "I"
   )
   public static int field830;
   @OriginalMember(
      owner = "client!ed",
      name = "r",
      descriptor = "I"
   )
   public static int field835;
   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "I"
   )
   public static int field837;
   @OriginalMember(
      owner = "client!ed",
      name = "s",
      descriptor = "I"
   )
   public static int field841;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ed",
      name = "v",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field842;

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public final boolean method595(boolean arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         if (!arg0) {
            return false;
         } else {
            ++field829;
            class209 var5 = (class209)this.field828.method2245((byte)-94);
            if (var4) {
               if (var5.method1804(arg1, arg2, 2)) {
                  return true;
               }

               var5 = (class209)this.field828.method2239((byte)87);
            }

            while(true) {
               boolean var10000;
               if (var5 == null) {
                  var10000 = false;
                  if (!var4) {
                     return false;
                  }
               } else {
                  var10000 = var5.method1804(arg1, arg2, 2);
               }

               if (var10000) {
                  return true;
               }

               var5 = (class209)this.field828.method2239((byte)87);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field843[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(IIIIIILha;II)V"
   )
   public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class17 arg6, int arg7, int arg8) {
      boolean var9 = client.field10022;

      try {
         ++field835;
         if (arg2 == -7) {
            class338 var10 = (class338)class421.method3284(arg0, arg5, arg8);
            if (var10 != null) {
               label187: {
                  class544 var11 = class549.field7834.method3850(3917, var10.method724(arg2 + 23983));
                  int var12 = var10.method734(-5723) & 3;
                  int var13 = var10.method733(arg2 ^ -28351);
                  if (var11.field7691 != -1) {
                     class59.method610(4, arg7, var12, arg1, arg6, var11);
                     if (!var9) {
                        break label187;
                     }
                  }

                  int var14 = arg4;
                  if (~var11.field7716 < -1) {
                     var14 = arg3;
                  }

                  if (var13 == 0 || ~var13 == -3) {
                     label186: {
                        if (~var12 == -1) {
                           arg6.method225(arg7, -1732, arg1, var14, 4);
                           if (!var9) {
                              break label186;
                           }
                        }

                        if (~var12 != -2) {
                           if (~var12 != -3) {
                              if (var12 != 3) {
                                 break label186;
                              }

                              arg6.method253(arg7, (byte)-109, var14, arg1 - -3, 4);
                              if (!var9) {
                                 break label186;
                              }
                           }

                           arg6.method225(arg7 + 3, arg2 ^ 1733, arg1, var14, 4);
                           if (!var9) {
                              break label186;
                           }
                        }

                        arg6.method253(arg7, (byte)-109, var14, arg1, 4);
                     }
                  }

                  if (~var13 == -4) {
                     label179: {
                        if (~var12 == -1) {
                           arg6.method223(arg1, 1, 1, arg7, var14, 1);
                           if (!var9) {
                              break label179;
                           }
                        }

                        if (~var12 == -2) {
                           arg6.method223(arg1, 1, 1, arg7 + 3, var14, 1);
                           if (!var9) {
                              break label179;
                           }
                        }

                        if (var12 != 2) {
                           if (~var12 != -4) {
                              break label179;
                           }

                           arg6.method223(arg1 + 3, 1, 1, arg7, var14, 1);
                           if (!var9) {
                              break label179;
                           }
                        }

                        arg6.method223(arg1 + 3, 1, 1, arg7 - -3, var14, 1);
                     }
                  }

                  if (~var13 == -3) {
                     label129: {
                        if (~var12 != -1) {
                           if (~var12 == -2) {
                              arg6.method225(arg7 + 3, arg2 ^ 1733, arg1, var14, 4);
                              if (!var9) {
                                 break label129;
                              }
                           }

                           if (var12 == 2) {
                              arg6.method253(arg7, (byte)-109, var14, arg1 + 3, 4);
                              if (!var9) {
                                 break label129;
                              }
                           }

                           if (~var12 != -4) {
                              break label129;
                           }

                           arg6.method225(arg7, arg2 ^ 1733, arg1, var14, 4);
                           if (!var9) {
                              break label129;
                           }
                        }

                        arg6.method253(arg7, (byte)-109, var14, arg1, 4);
                     }
                  }
               }
            }

            class338 var15 = (class338)class331.method2653(arg0, arg5, arg8, field842 != null ? field842 : (field842 = method602(field843[8])));
            if (var15 != null) {
               label114: {
                  class544 var16 = class549.field7834.method3850(arg2 + 3924, var15.method724(23976));
                  int var17 = var15.method734(-5723) & 3;
                  int var18 = var15.method733(28344);
                  if (var16.field7691 == -1) {
                     if (var18 != 9) {
                        break label114;
                     }

                     int var19 = -1118482;
                     if (var16.field7716 > 0) {
                        var19 = -1179648;
                     }

                     if (var17 == 0 || ~var17 == -3) {
                        arg6.method177(arg1 + 3, arg7 + 3, arg7, var19, arg1, (byte)31);
                        if (!var9) {
                           break label114;
                        }
                     }

                     arg6.method177(arg1, arg7 - -3, arg7, var19, arg1 + 3, (byte)31);
                     if (!var9) {
                        break label114;
                     }
                  }

                  class59.method610(4, arg7, var17, arg1, arg6, var16);
               }
            }

            class338 var20 = (class338)class495.method3755(arg0, arg5, arg8);
            if (var20 != null) {
               class544 var21 = class549.field7834.method3850(3917, var20.method724(23976));
               int var22 = 3 & var20.method734(-5723);
               if (~var21.field7691 != 0) {
                  class59.method610(arg2 + 11, arg7, var22, arg1, arg6, var21);
                  return;
               }
            }

         }
      } catch (RuntimeException var24) {
         throw class612.method4503(var24, field843[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field843[2] : field843[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "()V"
   )
   public static final void method597() {
      class282.method2365(1, class522.field7337);
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(I[IIBI)Z"
   )
   public final boolean method598(int arg0, int[] arg1, int arg2, byte arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         if (arg3 < 113) {
            this.method601((byte)34, 103, -90, (int[])null);
         }

         ++field837;
         class209 var7 = (class209)this.field828.method2245((byte)-94);
         boolean var10000;
         if (var6) {
            var10000 = var7.method1809(arg4, arg2, arg0, (byte)89);
         } else if (var7 == null) {
            var10000 = false;
            if (!var6) {
               return false;
            }
         } else {
            var10000 = var7.method1809(arg4, arg2, arg0, (byte)89);
         }

         while(!var10000) {
            var7 = (class209)this.field828.method2239((byte)125);
            if (var7 == null) {
               var10000 = false;
               if (!var6) {
                  return false;
               }
            } else {
               var10000 = var7.method1809(arg4, arg2, arg0, (byte)89);
            }
         }

         var7.method1805(arg0, arg2, arg1, true);
         return true;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field843[4] + arg0 + ',' + (arg1 != null ? field843[2] : field843[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method599(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "([IIII)Z"
   )
   public final boolean method600(int[] arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         if (arg2 >= -104) {
            this.field824 = -87;
         }

         ++field841;
         class209 var6 = (class209)this.field828.method2245((byte)-94);
         boolean var10000;
         if (var5) {
            var10000 = var6.method1804(arg1, arg3, 2);
         } else if (var6 == null) {
            var10000 = false;
            if (!var5) {
               return false;
            }
         } else {
            var10000 = var6.method1804(arg1, arg3, 2);
         }

         while(!var10000) {
            var6 = (class209)this.field828.method2239((byte)92);
            if (var6 == null) {
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               var10000 = var6.method1804(arg1, arg3, 2);
            }
         }

         var6.method1805(arg1, arg3, arg0, true);
         return true;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field843[6] + (arg0 != null ? field843[2] : field843[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(BII[I)Z"
   )
   public final boolean method601(byte arg0, int arg1, int arg2, int[] arg3) {
      boolean var5 = client.field10022;

      try {
         ++field830;
         class209 var6 = (class209)this.field828.method2245((byte)-94);
         if (var5) {
            if (var6.method1806(arg2, (byte)99, arg1)) {
               var6.method1808(81, arg2, arg1, arg3);
               return true;
            }

            var6 = (class209)this.field828.method2239((byte)107);
         }

         while(true) {
            byte var10000;
            if (var6 == null) {
               var10000 = arg0;
               if (!var5) {
                  if (arg0 != 5) {
                     return true;
                  }

                  return false;
               }
            } else {
               var10000 = var6.method1806(arg2, (byte)99, arg1);
            }

            if (var10000 != 0) {
               var6.method1808(81, arg2, arg1, arg3);
               return true;
            }

            var6 = (class209)this.field828.method2239((byte)107);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field843[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field843[2] : field843[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "<init>",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V"
   )
   public class58(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         this.field825 = arg2;
         this.field832 = arg4;
         this.field827 = arg0;
         this.field826 = arg3;
         this.field831 = arg1;
         this.field833 = arg6;
         this.field839 = arg5;
         if (this.field833 == 255) {
            this.field833 = 0;
         }

         this.field828 = new class261();
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field843[5] + arg0 + ',' + (arg1 != null ? field843[2] : field843[1]) + ',' + (arg2 != null ? field843[2] : field843[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method602(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method603(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method604(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
