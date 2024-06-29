import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class754 {
   @OriginalMember(
      owner = "client!jb",
      name = "j",
      descriptor = "[B"
   )
   private byte[] field11039;
   @OriginalMember(
      owner = "client!jb",
      name = "i",
      descriptor = "[I"
   )
   private int[] field11046;
   @OriginalMember(
      owner = "client!jb",
      name = "e",
      descriptor = "[I"
   )
   private int[] field11040;
   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11051 = new String[]{method5468(method5467("%\u0016V\u001f")), method5468(method5467("!\u0001\u00147\u0012")), method5468(method5467("0M\u0014]G")), method5468(method5467("!\u0001\u00145\u0012")), method5468(method5467("!\u0001\u00146\u0012")), method5468(method5467("!\u0001\u00142\u0012")), method5468(method5467("\u0005\f\u001a\u0010U/\u0006M\u001cH/C\\\u001cHk\u0007[\u0007[k\u0015[\u001fO.C")), method5468(method5467("!\u0001\u0014OS%\nNM\u0012")), method5468(method5467("!\u0001\u00141\u0012")), method5468(method5467("!\u0001\u00140\u0012"))};
   @OriginalMember(
      owner = "client!jb",
      name = "k",
      descriptor = "I"
   )
   public static int field11042 = 0;
   @OriginalMember(
      owner = "client!jb",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field11048 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
   @OriginalMember(
      owner = "client!jb",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field11038 = new class418(136, -1);
   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "I"
   )
   public static int field11041;
   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "I"
   )
   public static int field11044;
   @OriginalMember(
      owner = "client!jb",
      name = "g",
      descriptor = "I"
   )
   public static int field11045;
   @OriginalMember(
      owner = "client!jb",
      name = "d",
      descriptor = "I"
   )
   public static int field11047;
   @OriginalMember(
      owner = "client!jb",
      name = "f",
      descriptor = "I"
   )
   public static int field11049;
   @OriginalMember(
      owner = "client!jb",
      name = "l",
      descriptor = "Lfr;"
   )
   public static class331 field11043;
   @OriginalMember(
      owner = "client!jb",
      name = "h",
      descriptor = "[Lpd;"
   )
   public static class648[] field11050;

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method5461(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 < 20) {
            method5461(21, (byte)10, 95);
         }

         ++field11044;
         arg0 = (arg2 & 127) * arg0 >> 7;
         if (~arg0 > -3) {
            arg0 = 2;
            if (!client.field1481) {
               return (arg2 & 65408) + arg0;
            }
         }

         if (~arg0 < -127) {
            arg0 = 126;
         }

         return (arg2 & 65408) + arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11051[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(III[B[BI)I"
   )
   public final int method5462(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
      boolean var7 = client.field1481;

      try {
         ++field11049;
         if (arg5 != 1) {
            field11043 = null;
         }

         int var8 = 0;
         int var9 = arg2 << 3;
         int var19 = arg0 + arg1;
         int var10000;
         if (var7) {
            var10000 = arg3[arg1] & 255;
         } else if (~arg1 <= ~var19) {
            var10000 = (var9 + 7 >> 3) + -arg2;
            if (!var7) {
               return var10000;
            }
         } else {
            var10000 = arg3[arg1] & 255;
         }

         while(true) {
            int var10 = var10000;
            int var11 = this.field11046[var10];
            byte var12 = this.field11039[var10];
            if (~var12 == -1) {
               throw new RuntimeException(field11051[6] + var10);
            }

            int var13 = var9 >> 3;
            int var14 = var9 & 7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 - 1 + var14 >> 3) + var13;
            int var20 = var14 + 24;
            arg4[var13] = (byte)(var8 = class2.method15(var15, var11 >>> var20));
            if (~var16 < ~var13) {
               ++var13;
               var14 = var20 - 8;
               arg4[var13] = (byte)(var8 = var11 >>> var14);
               if (~var13 > ~var16) {
                  var14 -= 8;
                  ++var13;
                  arg4[var13] = (byte)(var8 = var11 >>> var14);
                  if (var13 < var16) {
                     var14 -= 8;
                     ++var13;
                     arg4[var13] = (byte)(var8 = var11 >>> var14);
                     if (var16 > var13) {
                        var14 -= 8;
                        ++var13;
                        arg4[var13] = (byte)(var8 = var11 << -var14);
                     }
                  }
               }
            }

            var9 += var12;
            ++arg1;
            if (~arg1 <= ~var19) {
               var10000 = (var9 + 7 >> 3) + -arg2;
               if (!var7) {
                  return var10000;
               }
            } else {
               var10000 = arg3[arg1] & 255;
            }
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field11051[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11051[2] : field11051[0]) + ',' + (arg4 != null ? field11051[2] : field11051[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5463(int arg0) {
      try {
         field11048 = null;
         if (arg0 != 0) {
            field11042 = -71;
         }

         field11050 = null;
         field11038 = null;
         field11043 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11051[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(IILha;B)V"
   )
   public static final void method5464(int arg0, int arg1, class479 arg2, byte arg3) {
      try {
         class475.field6627 = new class244[arg1][arg0];
         ++field11041;
         class577.field8555 = arg2;
         if (arg3 == -104) {
            if (class700.field10255 != null) {
               class199.field2536 = class613.method4517(class700.field10255[2], class700.field10255[1], class700.field10255[5], -4, class700.field10255[3], class700.field10255[0], class700.field10255[4]);
            }

            class568.field8355 = new class244();
            class44.method333((byte)46);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11051[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11051[2] : field11051[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "([BII[BII)I"
   )
   public final int method5465(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
      boolean var7 = client.field1481;

      try {
         ++field11045;
         if (~arg4 == -1) {
            return 0;
         } else {
            int var8 = 0;
            int var21 = arg1 + arg4;
            if (arg2 != 5) {
               method5464(0, -87, (class479)null, (byte)49);
            }

            int var9 = arg5;

            do {
               byte var10;
               label97: {
                  var10 = arg3[var9];
                  if (~var10 > -1) {
                     var8 = this.field11040[var8];
                     if (var7 || !var7) {
                        break label97;
                     }
                  }

                  ++var8;
               }

               int var11;
               if (~(var11 = this.field11040[var8]) > -1) {
                  arg0[arg1++] = (byte)(~var11);
                  if (var21 <= arg1) {
                     break;
                  }

                  var8 = 0;
               }

               label165: {
                  if (~(64 & var10) != -1) {
                     var8 = this.field11040[var8];
                     if (!var7) {
                        break label165;
                     }
                  }

                  ++var8;
               }

               int var12;
               if ((var12 = this.field11040[var8]) < 0) {
                  arg0[arg1++] = (byte)(~var12);
                  if (~arg1 <= ~var21) {
                     break;
                  }

                  var8 = 0;
               }

               label159: {
                  if (~(32 & var10) != -1) {
                     var8 = this.field11040[var8];
                     if (!var7) {
                        break label159;
                     }
                  }

                  ++var8;
               }

               int var13;
               if ((var13 = this.field11040[var8]) < 0) {
                  arg0[arg1++] = (byte)(~var13);
                  if (~arg1 <= ~var21) {
                     break;
                  }

                  var8 = 0;
               }

               label153: {
                  if (~(var10 & 16) != -1) {
                     var8 = this.field11040[var8];
                     if (!var7) {
                        break label153;
                     }
                  }

                  ++var8;
               }

               int var14;
               if (~(var14 = this.field11040[var8]) > -1) {
                  arg0[arg1++] = (byte)(~var14);
                  if (arg1 >= var21) {
                     break;
                  }

                  var8 = 0;
               }

               label147: {
                  if ((var10 & 8) == 0) {
                     ++var8;
                     if (!var7) {
                        break label147;
                     }
                  }

                  var8 = this.field11040[var8];
               }

               int var15;
               if ((var15 = this.field11040[var8]) < 0) {
                  arg0[arg1++] = (byte)(~var15);
                  if (var21 <= arg1) {
                     break;
                  }

                  var8 = 0;
               }

               label141: {
                  if (~(4 & var10) == -1) {
                     ++var8;
                     if (!var7) {
                        break label141;
                     }
                  }

                  var8 = this.field11040[var8];
               }

               int var16;
               if ((var16 = this.field11040[var8]) < 0) {
                  arg0[arg1++] = (byte)(~var16);
                  if (~var21 >= ~arg1) {
                     break;
                  }

                  var8 = 0;
               }

               label135: {
                  if ((2 & var10) == 0) {
                     ++var8;
                     if (!var7) {
                        break label135;
                     }
                  }

                  var8 = this.field11040[var8];
               }

               int var17;
               if (~(var17 = this.field11040[var8]) > -1) {
                  arg0[arg1++] = (byte)(~var17);
                  if (~var21 >= ~arg1) {
                     break;
                  }

                  var8 = 0;
               }

               label129: {
                  if (~(1 & var10) != -1) {
                     var8 = this.field11040[var8];
                     if (!var7) {
                        break label129;
                     }
                  }

                  ++var8;
               }

               int var18;
               if (~(var18 = this.field11040[var8]) > -1) {
                  arg0[arg1++] = (byte)(~var18);
                  if (var21 <= arg1) {
                     break;
                  }

                  var8 = 0;
               }

               ++var9;
            } while(!var7);

            return var9 - -1 + -arg5;
         }
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field11051[1] + (arg0 != null ? field11051[2] : field11051[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11051[2] : field11051[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;ILd;Z)Lha;"
   )
   public static final class479 method5466(Canvas arg0, int arg1, class102 arg2, boolean arg3) {
      try {
         if (arg3) {
            field11038 = null;
         }

         ++field11047;
         return new class530(arg0, arg2, arg1);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11051[3] + (arg0 != null ? field11051[2] : field11051[0]) + ',' + arg1 + ',' + (arg2 != null ? field11051[2] : field11051[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class754(byte[] arg0) {
      boolean var2 = client.field1481;
      super();

      try {
         int var3 = arg0.length;
         this.field11039 = arg0;
         this.field11046 = new int[var3];
         this.field11040 = new int[8];
         int[] var4 = new int[33];
         int var5 = 0;
         int var6 = 0;
         if (var2 || ~var3 < ~var6) {
            label270:
            do {
               byte var7 = arg0[var6];
               if (~var7 == -1) {
                  ++var6;
               } else {
                  int var9;
                  int var10;
                  int var11;
                  label275: {
                     int var8 = 1 << -var7 + 32;
                     var9 = var4[var7];
                     this.field11046[var6] = var9;
                     if (~(var8 & var9) == -1) {
                        var10 = var9 | var8;
                        var11 = var7 + -1;
                        if (!var2 && var11 < 1) {
                           if (var2) {
                              if (var2) {
                                 if (var4[var11] == var9) {
                                    var4[var11] = var10;
                                 }

                                 ++var11;
                              }
                              break label275;
                           }

                           if (var2) {
                              var10 = var4[var7 + -1];
                           }
                        } else {
                           while(true) {
                              int var12 = var4[var11];
                              if (~var9 != ~var12) {
                                 break;
                              }

                              int var13 = 1 << -var11 + 32;
                              if (~(var12 & var13) != -1) {
                                 var4[var11] = var4[var11 + -1];
                                 if (!var2) {
                                    break;
                                 }

                                 var4[var11] = class2.method15(var13, var12);
                                 --var11;
                              } else {
                                 var4[var11] = class2.method15(var13, var12);
                                 --var11;
                              }

                              if (var11 < 1) {
                                 if (var2) {
                                    if (var2) {
                                       if (var4[var11] == var9) {
                                          var4[var11] = var10;
                                       }

                                       ++var11;
                                    }
                                    break label275;
                                 }

                                 if (var2) {
                                    var10 = var4[var7 + -1];
                                 }
                                 break;
                              }
                           }
                        }
                     } else {
                        var10 = var4[var7 + -1];
                     }

                     var4[var7] = var10;
                     var11 = var7 + 1;
                     if (var2) {
                        if (var4[var11] == var9) {
                           var4[var11] = var10;
                        }

                        ++var11;
                     }
                  }

                  while(true) {
                     while(~var11 >= -33) {
                        if (var4[var11] == var9) {
                           var4[var11] = var10;
                        }

                        ++var11;
                     }

                     byte var14 = 0;
                     int var15 = 0;
                     if (!var2) {
                        int var16;
                        int var10000;
                        int var10001;
                        int var22;
                        if (var2) {
                           var16 = Integer.MIN_VALUE >>> var15;
                           if ((var9 & var16) == 0) {
                              var22 = var14 + 1;
                              if (var2) {
                                 if (this.field11040[var22] == 0) {
                                    this.field11040[var22] = var5;
                                 }

                                 var22 = this.field11040[var22];
                              }
                           } else {
                              if (this.field11040[var14] == 0) {
                                 this.field11040[var14] = var5;
                              }

                              var22 = this.field11040[var14];
                           }
                        } else {
                           if (var15 >= var7) {
                              this.field11040[var14] = ~var6;
                              var10000 = var5;
                              var10001 = var14;
                              if (!var2) {
                                 if (var5 <= var14) {
                                    var5 = var14 + 1;
                                 }

                                 ++var6;
                                 break;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var15;
                           }

                           var16 = var10000 >>> var10001;
                           if ((var9 & var16) == 0) {
                              var22 = var14 + 1;
                              if (var2) {
                                 if (this.field11040[var22] == 0) {
                                    this.field11040[var22] = var5;
                                 }

                                 var22 = this.field11040[var22];
                              }
                           } else {
                              if (this.field11040[var14] == 0) {
                                 this.field11040[var14] = var5;
                              }

                              var22 = this.field11040[var14];
                           }
                        }

                        while(true) {
                           int var17 = var16 >>> 1;
                           if (var22 < this.field11040.length) {
                              ++var15;
                           } else {
                              int[] var18 = new int[this.field11040.length * 2];
                              int var19 = 0;
                              if (var2) {
                                 var18[var19] = this.field11040[var19];
                                 ++var19;
                              }

                              while(true) {
                                 while(~var19 > ~this.field11040.length) {
                                    var18[var19] = this.field11040[var19];
                                    ++var19;
                                 }

                                 if (!var2) {
                                    this.field11040 = var18;
                                    ++var15;
                                    break;
                                 }

                                 ++var19;
                              }
                           }

                           if (var15 >= var7) {
                              this.field11040[var22] = ~var6;
                              var10000 = var5;
                              var10001 = var22;
                              if (!var2) {
                                 if (var5 <= var22) {
                                    var5 = var22 + 1;
                                 }

                                 ++var6;
                                 continue label270;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var15;
                           }

                           var16 = var10000 >>> var10001;
                           if ((var9 & var16) == 0) {
                              ++var22;
                              if (var2) {
                                 if (this.field11040[var22] == 0) {
                                    this.field11040[var22] = var5;
                                 }

                                 var22 = this.field11040[var22];
                              }
                           } else {
                              if (this.field11040[var22] == 0) {
                                 this.field11040[var22] = var5;
                              }

                              var22 = this.field11040[var22];
                           }
                        }
                     }

                     ++var11;
                  }
               }
            } while(~var3 < ~var6);

         }
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field11051[7] + (arg0 != null ? field11051[2] : field11051[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5467(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5468(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
