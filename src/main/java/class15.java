import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class15 {
   @OriginalMember(
      owner = "client!vl",
      name = "c",
      descriptor = "[B"
   )
   private byte[] field181;
   @OriginalMember(
      owner = "client!vl",
      name = "b",
      descriptor = "[I"
   )
   private int[] field178;
   @OriginalMember(
      owner = "client!vl",
      name = "f",
      descriptor = "[I"
   )
   private int[] field184;
   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field188 = new String[]{method112(method111("k8\fa")), method112(method111("~cN#U")), method112(method111("s!N1Ak$\u00143\u0000")), method112(method111("s!NO\u0000")), method112(method111("s!NI\u0000")), method112(method111("K\"@nGa(\u0017bZam\u0006bZ%)\u0001yI%;\u0001a]`m")), method112(method111("s!NN\u0000")), method112(method111("s!NL\u0000"))};
   @OriginalMember(
      owner = "client!vl",
      name = "i",
      descriptor = "Lsd;"
   )
   public static class101 field183 = new class101(120, 6);
   @OriginalMember(
      owner = "client!vl",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field186 = true;
   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field185 = new class101(133, -2);
   @OriginalMember(
      owner = "client!vl",
      name = "d",
      descriptor = "I"
   )
   public static int field179;
   @OriginalMember(
      owner = "client!vl",
      name = "e",
      descriptor = "I"
   )
   public static int field180;
   @OriginalMember(
      owner = "client!vl",
      name = "h",
      descriptor = "I"
   )
   public static int field182;
   @OriginalMember(
      owner = "client!vl",
      name = "j",
      descriptor = "I"
   )
   public static int field187;

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "([BB)V"
   )
   public static final void method107(byte[] arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 != -37) {
            field183 = null;
         }

         ++field182;
         class128 var3 = new class128(arg0);

         while(true) {
            label85:
            while(true) {
               int var4;
               do {
                  var4 = var3.method1104(255);
                  if (var4 == 0) {
                     return;
                  }

                  if (~var4 != -2) {
                     break;
                  }

                  int[] var5 = class188.field2346 = new int[6];
                  var5[0] = var3.method1038((byte)-124);
                  var5[1] = var3.method1038((byte)-122);
                  var5[2] = var3.method1038((byte)-123);
                  var5[3] = var3.method1038((byte)-97);
                  var5[4] = var3.method1038((byte)-128);
                  var5[5] = var3.method1038((byte)-103);
               } while(var2 == 0);

               int var8;
               int var9;
               do {
                  if (var4 == 4) {
                     int var6 = var3.method1104(arg1 ^ -220);
                     class260.field3545 = new int[var6];
                     int var7 = 0;
                     if (var2 != 0) {
                        class260.field3545[var7] = var3.method1038((byte)-128);
                        if (class260.field3545[var7] == 65535) {
                           class260.field3545[var7] = -1;
                        }

                        ++var7;
                     }

                     while(true) {
                        if (~var7 <= ~var6) {
                           if (var2 == 0) {
                              if (var2 == 0) {
                                 continue label85;
                              }
                              break;
                           }
                        } else {
                           class260.field3545[var7] = var3.method1038((byte)-128);
                        }

                        if (class260.field3545[var7] == 65535) {
                           class260.field3545[var7] = -1;
                        }

                        ++var7;
                     }
                  }

                  if (~var4 != -6) {
                     continue label85;
                  }

                  var8 = var3.method1104(255);
                  class312.field4459 = new int[var8];
                  var9 = 0;
               } while(var2 != 0);

               if (var2 != 0) {
                  class312.field4459[var9] = var3.method1038((byte)-100);
                  if (~class312.field4459[var9] == -65536) {
                     class312.field4459[var9] = -1;
                  }

                  ++var9;
               }

               while(true) {
                  if (~var8 >= ~var9) {
                     if (var2 == 0) {
                        break;
                     }
                  } else {
                     class312.field4459[var9] = var3.method1038((byte)-100);
                  }

                  if (~class312.field4459[var9] == -65536) {
                     class312.field4459[var9] = -1;
                  }

                  ++var9;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field188[3] + (arg0 != null ? field188[1] : field188[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(II[B[BII)I"
   )
   public final int method108(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
      int var7 = client.field4530;

      try {
         ++field180;
         if (~arg4 == -1) {
            return 0;
         } else {
            if (arg0 != -24095) {
               method110((byte)35);
            }

            int var21 = arg4 + arg5;
            int var8 = 0;
            int var9 = arg1;

            do {
               byte var10;
               label101: {
                  var10 = arg3[var9];
                  if (var10 >= 0) {
                     ++var8;
                     if (var7 != 0 || var7 == 0) {
                        break label101;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var11;
               if ((var11 = this.field184[var8]) < 0) {
                  arg2[arg5++] = (byte)(~var11);
                  if (~arg5 <= ~var21) {
                     break;
                  }

                  var8 = 0;
               }

               label169: {
                  if (~(var10 & 64) == -1) {
                     ++var8;
                     if (var7 == 0) {
                        break label169;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var12;
               if (~(var12 = this.field184[var8]) > -1) {
                  arg2[arg5++] = (byte)(~var12);
                  if (var21 <= arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label163: {
                  if (~(32 & var10) == -1) {
                     ++var8;
                     if (var7 == 0) {
                        break label163;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var13;
               if (~(var13 = this.field184[var8]) > -1) {
                  arg2[arg5++] = (byte)(~var13);
                  if (~arg5 <= ~var21) {
                     break;
                  }

                  var8 = 0;
               }

               label157: {
                  if ((16 & var10) == 0) {
                     ++var8;
                     if (var7 == 0) {
                        break label157;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var14;
               if ((var14 = this.field184[var8]) < 0) {
                  arg2[arg5++] = (byte)(~var14);
                  if (var21 <= arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label151: {
                  if (~(var10 & 8) == -1) {
                     ++var8;
                     if (var7 == 0) {
                        break label151;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var15;
               if ((var15 = this.field184[var8]) < 0) {
                  arg2[arg5++] = (byte)(~var15);
                  if (arg5 >= var21) {
                     break;
                  }

                  var8 = 0;
               }

               label145: {
                  if (~(var10 & 4) == -1) {
                     ++var8;
                     if (var7 == 0) {
                        break label145;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var16;
               if ((var16 = this.field184[var8]) < 0) {
                  arg2[arg5++] = (byte)(~var16);
                  if (var21 <= arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label139: {
                  if (~(2 & var10) == -1) {
                     ++var8;
                     if (var7 == 0) {
                        break label139;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var17;
               if (~(var17 = this.field184[var8]) > -1) {
                  arg2[arg5++] = (byte)(~var17);
                  if (arg5 >= var21) {
                     break;
                  }

                  var8 = 0;
               }

               label133: {
                  if (~(var10 & 1) == -1) {
                     ++var8;
                     if (var7 == 0) {
                        break label133;
                     }
                  }

                  var8 = this.field184[var8];
               }

               int var18;
               if (~(var18 = this.field184[var8]) > -1) {
                  arg2[arg5++] = (byte)(~var18);
                  if (~var21 >= ~arg5) {
                     break;
                  }

                  var8 = 0;
               }

               ++var9;
            } while(var7 == 0);

            return var9 - arg1 + 1;
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field188[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field188[1] : field188[0]) + ',' + (arg3 != null ? field188[1] : field188[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "([B[BZIII)I"
   )
   public final int method109(byte[] arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
      int var7 = client.field4530;

      try {
         if (!arg2) {
            field185 = null;
         }

         ++field179;
         int var8 = 0;
         int var9 = arg3 << 3;
         int var19 = arg4 + arg5;
         int var10000;
         if (var7 != 0) {
            var10000 = 255 & arg1[arg5];
         } else if (var19 <= arg5) {
            var10000 = (var9 + 7 >> 3) - arg3;
            if (var7 == 0) {
               return var10000;
            }
         } else {
            var10000 = 255 & arg1[arg5];
         }

         while(true) {
            int var10 = var10000;
            int var11 = this.field178[var10];
            byte var12 = this.field181[var10];
            if (~var12 == -1) {
               throw new RuntimeException(field188[5] + var10);
            }

            int var13 = var9 >> 3;
            int var14 = 7 & var9;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 - 1 + var14 >> 3) + var13;
            var9 += var12;
            int var20 = var14 + 24;
            arg0[var13] = (byte)(var8 = class379.method2928(var15, var11 >>> var20));
            if (var13 < var16) {
               ++var13;
               var14 = var20 - 8;
               arg0[var13] = (byte)(var8 = var11 >>> var14);
               if (var13 < var16) {
                  var14 -= 8;
                  ++var13;
                  arg0[var13] = (byte)(var8 = var11 >>> var14);
                  if (var13 < var16) {
                     ++var13;
                     var14 -= 8;
                     arg0[var13] = (byte)(var8 = var11 >>> var14);
                     if (~var13 > ~var16) {
                        var14 -= 8;
                        ++var13;
                        arg0[var13] = (byte)(var8 = var11 << -var14);
                     }
                  }
               }
            }

            ++arg5;
            if (var19 <= arg5) {
               var10000 = (var9 + 7 >> 3) - arg3;
               if (var7 == 0) {
                  return var10000;
               }
            } else {
               var10000 = 255 & arg1[arg5];
            }
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field188[4] + (arg0 != null ? field188[1] : field188[0]) + ',' + (arg1 != null ? field188[1] : field188[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method110(byte arg0) {
      try {
         field185 = null;
         field183 = null;
         if (arg0 != -117) {
            method107((byte[])null, (byte)-73);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field188[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class15(byte[] arg0) {
      int var2 = client.field4530;
      super();

      try {
         int var3 = arg0.length;
         this.field181 = arg0;
         this.field178 = new int[var3];
         this.field184 = new int[8];
         int[] var4 = new int[33];
         int var5 = 0;
         int var6 = 0;
         if (var2 != 0 || var6 < var3) {
            label244:
            do {
               byte var7 = arg0[var6];
               if (~var7 == -1) {
                  ++var6;
               } else {
                  int var9;
                  int var10;
                  int var11;
                  label240: {
                     int var8 = 1 << -var7 + 32;
                     var9 = var4[var7];
                     this.field178[var6] = var9;
                     if ((var9 & var8) == 0) {
                        label238: {
                           var10 = var8 | var9;
                           var11 = var7 + -1;
                           int var12;
                           if (var2 != 0) {
                              var12 = var4[var11];
                              if (var9 != var12) {
                                 break label238;
                              }
                           } else {
                              if (var11 < 1) {
                                 if (var2 != 0) {
                                    break label240;
                                 }

                                 if (var2 != 0) {
                                    var10 = var4[var7 + -1];
                                 }
                                 break label238;
                              }

                              var12 = var4[var11];
                              if (var9 != var12) {
                                 break label238;
                              }
                           }

                           do {
                              int var13 = 1 << 32 - var11;
                              if (~(var12 & var13) == -1) {
                                 var4[var11] = class379.method2928(var13, var12);
                                 if (var2 != 0) {
                                    var4[var11] = var4[var11 + -1];
                                    if (var2 == 0) {
                                       break;
                                    }

                                    --var11;
                                 } else {
                                    --var11;
                                 }
                              } else {
                                 var4[var11] = var4[var11 + -1];
                                 if (var2 == 0) {
                                    break;
                                 }

                                 --var11;
                              }

                              if (var11 < 1) {
                                 if (var2 != 0) {
                                    break label240;
                                 }

                                 if (var2 != 0) {
                                    var10 = var4[var7 + -1];
                                 }
                                 break;
                              }

                              var12 = var4[var11];
                           } while(var9 == var12);
                        }
                     } else {
                        var10 = var4[var7 + -1];
                     }

                     var4[var7] = var10;
                     var11 = var7 - -1;
                  }

                  if (var2 != 0) {
                     if (~var4[var11] == ~var9) {
                        var4[var11] = var10;
                     }

                     ++var11;
                  }

                  while(true) {
                     while(var11 <= 32) {
                        if (~var4[var11] == ~var9) {
                           var4[var11] = var10;
                        }

                        ++var11;
                     }

                     byte var14 = 0;
                     int var15 = 0;
                     if (var2 == 0) {
                        int var16;
                        int var10000;
                        int var10001;
                        int var22;
                        if (var2 != 0) {
                           var16 = Integer.MIN_VALUE >>> var15;
                           if (~(var9 & var16) != -1) {
                              if (this.field184[var14] == 0) {
                                 this.field184[var14] = var5;
                              }

                              var22 = this.field184[var14];
                              if (var2 != 0) {
                                 ++var22;
                              }
                           } else {
                              var22 = var14 + 1;
                           }
                        } else {
                           if (var7 <= var15) {
                              this.field184[var14] = ~var6;
                              var10000 = ~var14;
                              var10001 = ~var5;
                              if (var2 == 0) {
                                 if (var10000 <= var10001) {
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
                           if (~(var9 & var16) != -1) {
                              if (this.field184[var14] == 0) {
                                 this.field184[var14] = var5;
                              }

                              var22 = this.field184[var14];
                              if (var2 != 0) {
                                 ++var22;
                              }
                           } else {
                              var22 = var14 + 1;
                           }
                        }

                        while(true) {
                           int var17 = var16 >>> 1;
                           if (this.field184.length > var22) {
                              ++var15;
                           } else {
                              int[] var18 = new int[this.field184.length * 2];
                              int var19 = 0;
                              if (var2 != 0) {
                                 var18[var19] = this.field184[var19];
                                 ++var19;
                              }

                              while(true) {
                                 while(this.field184.length > var19) {
                                    var18[var19] = this.field184[var19];
                                    ++var19;
                                 }

                                 if (var2 == 0) {
                                    this.field184 = var18;
                                    ++var15;
                                    break;
                                 }

                                 ++var19;
                              }
                           }

                           if (var7 <= var15) {
                              this.field184[var22] = ~var6;
                              var10000 = ~var22;
                              var10001 = ~var5;
                              if (var2 == 0) {
                                 if (var10000 <= var10001) {
                                    var5 = var22 + 1;
                                 }

                                 ++var6;
                                 continue label244;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var15;
                           }

                           var16 = var10000 >>> var10001;
                           if (~(var9 & var16) != -1) {
                              if (this.field184[var22] == 0) {
                                 this.field184[var22] = var5;
                              }

                              var22 = this.field184[var22];
                              if (var2 != 0) {
                                 ++var22;
                              }
                           } else {
                              ++var22;
                           }
                        }
                     }

                     ++var11;
                  }
               }
            } while(var6 < var3);

         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field188[2] + (arg0 != null ? field188[1] : field188[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method111(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method112(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
