import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class235 extends class550 {
   @OriginalMember(
      owner = "client!sa",
      name = "o",
      descriptor = "Z"
   )
   private boolean field3592;
   @OriginalMember(
      owner = "client!sa",
      name = "l",
      descriptor = "Z"
   )
   private boolean field3591;
   @OriginalMember(
      owner = "client!sa",
      name = "q",
      descriptor = "[Lan;"
   )
   private class496[] field3595;
   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3598 = new String[]{method2021(method2020(".]]B\u0011")), method2021(method2020("&\u0012])D")), method2021(method2020(".]]N\u0011")), method2021(method2020("3I\u001fk")), method2021(method2020(".]]D\u0011")), method2021(method2020(".]]E\u0011")), method2021(method2020(".]]A\u0011")), method2021(method2020(".]]I\u0011")), method2021(method2020(".T\u001cpo4X\u0016hx9")), method2021(method2020(".]]K\u0011")), method2021(method2020(".]];P3U\u00079\u0011")), method2021(method2020(".]]F\u0011"))};
   @OriginalMember(
      owner = "client!sa",
      name = "t",
      descriptor = "I"
   )
   public static int field3587;
   @OriginalMember(
      owner = "client!sa",
      name = "k",
      descriptor = "I"
   )
   public static int field3588;
   @OriginalMember(
      owner = "client!sa",
      name = "n",
      descriptor = "I"
   )
   public static int field3589;
   @OriginalMember(
      owner = "client!sa",
      name = "m",
      descriptor = "I"
   )
   public static int field3590;
   @OriginalMember(
      owner = "client!sa",
      name = "r",
      descriptor = "I"
   )
   public static int field3593;
   @OriginalMember(
      owner = "client!sa",
      name = "j",
      descriptor = "I"
   )
   public static int field3594;
   @OriginalMember(
      owner = "client!sa",
      name = "s",
      descriptor = "I"
   )
   public static int field3596;
   @OriginalMember(
      owner = "client!sa",
      name = "p",
      descriptor = "I"
   )
   public static int field3597;

   @OriginalMember(
      owner = "client!sa",
      name = "<init>",
      descriptor = "(Lmu;)V",
      line = 5
   )
   public class235(class258 arg0) {
      boolean var2 = client.field1786;
      super(arg0);
      this.field3592 = false;

      try {
         if (arg0.field4215) {
            this.field3591 = ~arg0.field4150 > -4;
            int var3 = this.field3591 ? 48 : 127;
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int[][] var6 = new int[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && var8 >= 64) {
               this.field3595 = new class496[3];
               this.field3595[0] = super.field8234.method1473(var5, false, 64, (byte)99);
               this.field3595[1] = super.field8234.method1473(var6, false, 64, (byte)105);
               this.field3595[2] = super.field8234.method1473(var4, false, 64, (byte)121);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var9 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float)var8 * 2.0F / 64.0F - 1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var10 * var10 + 1.0F)));
                        float var13 = var10 * var12;
                        float var14 = var11 * var12;
                        int var15 = 0;
                        float var16;
                        int var17;
                        int var18;
                        int var19;
                        if (var2) {
                           if (~var15 != -1) {
                              if (var15 == 1) {
                                 var16 = var13;
                                 if (var2) {
                                    if (~var15 == -3) {
                                       var16 = var14;
                                       if (var2) {
                                          if (~var15 == -4) {
                                             var16 = -var14;
                                             if (var2) {
                                                if (~var15 == -5) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = -var13;
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             }
                                          } else if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       }
                                    } else if (~var15 == -4) {
                                       var16 = -var14;
                                       if (var2) {
                                          if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       }
                                    } else if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 }
                              } else if (~var15 == -3) {
                                 var16 = var14;
                                 if (var2) {
                                    if (~var15 == -4) {
                                       var16 = -var14;
                                       if (var2) {
                                          if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       }
                                    } else if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 }
                              } else if (~var15 == -4) {
                                 var16 = -var14;
                                 if (var2) {
                                    if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 }
                              } else if (~var15 == -5) {
                                 var16 = var12;
                                 if (var2) {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = -var13;
                                    }
                                 }
                              } else {
                                 var16 = -var12;
                                 if (var2) {
                                    var16 = -var13;
                                 }
                              }
                           } else {
                              var16 = -var13;
                           }

                           if (var16 > 0.0F) {
                              var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                              var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                              var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                              if (var2) {
                                 var19 = 0;
                                 var18 = 0;
                                 var17 = 0;
                              }
                           } else {
                              var19 = 0;
                              var18 = 0;
                              var17 = 0;
                           }

                           var5[var15][var7] = var17 << 24;
                           var6[var15][var7] = var18 << 24;
                           var4[var15][var7] = var19 << 24;
                           ++var15;
                        }

                        while(true) {
                           while(var15 < 6) {
                              if (~var15 != -1) {
                                 if (var15 == 1) {
                                    var16 = var13;
                                    if (var2) {
                                       if (~var15 == -3) {
                                          var16 = var14;
                                          if (var2) {
                                             if (~var15 == -4) {
                                                var16 = -var14;
                                                if (var2) {
                                                   if (~var15 == -5) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = -var12;
                                                         if (var2) {
                                                            var16 = -var13;
                                                         }
                                                      }
                                                   } else {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = -var13;
                                                      }
                                                   }
                                                }
                                             } else if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          }
                                       } else if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          }
                                       } else if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    }
                                 } else if (~var15 == -3) {
                                    var16 = var14;
                                    if (var2) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          }
                                       } else if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    }
                                 } else if (~var15 == -4) {
                                    var16 = -var14;
                                    if (var2) {
                                       if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    }
                                 } else if (~var15 == -5) {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 } else {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = -var13;
                                    }
                                 }
                              } else {
                                 var16 = -var13;
                              }

                              if (var16 > 0.0F) {
                                 var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                 var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 if (var2) {
                                    var19 = 0;
                                    var18 = 0;
                                    var17 = 0;
                                 }
                              } else {
                                 var19 = 0;
                                 var18 = 0;
                                 var17 = 0;
                              }

                              var5[var15][var7] = var17 << 24;
                              var6[var15][var7] = var18 << 24;
                              var4[var15][var7] = var19 << 24;
                              ++var15;
                           }

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           var16 = -var13;
                           if (var16 > 0.0F) {
                              var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                              var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                              var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                              if (var2) {
                                 var19 = 0;
                                 var18 = 0;
                                 var17 = 0;
                              }
                           } else {
                              var19 = 0;
                              var18 = 0;
                              var17 = 0;
                           }

                           var5[var15][var7] = var17 << 24;
                           var6[var15][var7] = var18 << 24;
                           var4[var15][var7] = var19 << 24;
                           ++var15;
                        }
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(var8 < 64);

               this.field3595 = new class496[3];
               this.field3595[0] = super.field8234.method1473(var5, false, 64, (byte)99);
               this.field3595[1] = super.field8234.method1473(var6, false, 64, (byte)105);
               this.field3595[2] = super.field8234.method1473(var4, false, 64, (byte)121);
            }
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field3598[10] + (arg0 != null ? field3598[1] : field3598[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(BII)V",
      line = 115
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      try {
         ++field3588;
         if (this.field3592) {
            super.field8234.method2220(1, arg0 ^ 84);
            super.field8234.method2193(this.field3595[arg2 + -1], (byte)-19);
            super.field8234.method2220(0, 14);
         }

         if (arg0 != 90) {
            method2018(-6, -51, (byte[])null);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3598[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(ZB)V",
      line = 132
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         if (arg1 >= -44) {
            this.field3592 = false;
         }

         ++field3597;
         if (this.field3595 != null && arg0) {
            label23: {
               super.field8234.method2220(1, 14);
               super.field8234.method1475(class47.field619, -27302);
               class504 var3 = super.field8234.method2188(0);
               var3.method1552(1024);
               super.field8234.method2247(11901, class443.field6802);
               if (this.field3591) {
                  super.field8234.method2212((byte)119, class154.field2302, class453.field6943);
                  super.field8234.method1494(0, true, 0, class751.field11122, false);
                  super.field8234.method2221(0, (byte)51, class53.field655);
                  if (!client.field1786) {
                     break label23;
                  }
               }

               super.field8234.method2212((byte)119, class453.field6943, class716.field10733);
               super.field8234.method2185((byte)-97, 0, class36.field435);
               super.field8234.method2220(2, 14);
               super.field8234.method2212((byte)119, class154.field2302, class453.field6943);
               super.field8234.method2185((byte)-107, 0, class36.field435);
               super.field8234.method1494(0, true, 1, class36.field435, false);
               super.field8234.method2221(0, (byte)51, class53.field655);
               super.field8234.method2193(super.field8234.field4153, (byte)-19);
            }

            super.field8234.method2220(0, 14);
            this.field3592 = true;
         } else {
            super.field8234.method2221(0, (byte)51, class53.field655);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3598[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(II[B)I",
      line = 175
   )
   public static final int method2018(int arg0, int arg1, byte[] arg2) {
      try {
         ++field3589;
         if (arg1 >= -59) {
            method2018(90, -3, (byte[])null);
         }

         return class180.method1632(2, 0, arg0, arg2);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3598[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3598[1] : field3598[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "e",
      descriptor = "(B)Z",
      line = 188
   )
   public static final boolean method2019(byte arg0) {
      try {
         if (arg0 < 122) {
            return false;
         } else {
            ++field3596;
            if (class774.field11383) {
               try {
                  class676.method4989(class684.field10176, field3598[8], -23226);
                  return true;
               } catch (Throwable var2) {
               }
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3598[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(IBLwm;)V",
      line = 209
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         ++field3593;
         int var4 = 79 / ((arg1 - 18) / 60);
         super.field8234.method2193(arg2, (byte)-19);
         super.field8234.method2255(arg0, (byte)90);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3598[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3598[1] : field3598[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "c",
      descriptor = "(B)Z",
      line = 220
   )
   public final boolean method69(byte arg0) {
      try {
         ++field3587;
         if (arg0 != 120) {
            this.field3595 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3598[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "(I)V",
      line = 232
   )
   public final void method72(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field3594;
         if (arg0 != -2) {
            method2019((byte)99);
         }

         label29: {
            if (this.field3592) {
               label26: {
                  super.field8234.method2220(1, 14);
                  super.field8234.method2193((class428)null, (byte)-19);
                  super.field8234.method1475(class525.field7998, -27302);
                  super.field8234.method2233((byte)-62);
                  if (this.field3591) {
                     super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
                     super.field8234.method2185((byte)-126, 0, class751.field11122);
                     super.field8234.method2221(0, (byte)51, class751.field11122);
                     if (!var2) {
                        break label26;
                     }
                  }

                  super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
                  super.field8234.method2185((byte)-119, 0, class751.field11122);
                  super.field8234.method2220(2, 14);
                  super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
                  super.field8234.method2185((byte)-126, 0, class751.field11122);
                  super.field8234.method2185((byte)-109, 1, class36.field435);
                  super.field8234.method2221(0, (byte)51, class751.field11122);
                  super.field8234.method2193((class428)null, (byte)-19);
               }

               super.field8234.method2220(0, 14);
               this.field3592 = false;
               if (!var2) {
                  break label29;
               }
            }

            super.field8234.method2221(0, (byte)51, class751.field11122);
         }

         super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3598[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(BZ)V",
      line = 282
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         super.field8234.method2212((byte)119, class716.field10733, class453.field6943);
         if (arg0 >= 82) {
            ++field3590;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3598[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2020(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2021(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
