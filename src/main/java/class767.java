import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class767 {
   @OriginalMember(
      owner = "client!wj",
      name = "h",
      descriptor = "I"
   )
   private int field11003 = -1;
   @OriginalMember(
      owner = "client!wj",
      name = "g",
      descriptor = "Lsb;"
   )
   private class261 field11006 = new class261();
   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11014 = new String[]{method5529(method5528("F2~bF")), method5529(method5528("F2~gF")), method5529(method5528("Jv~\r\u0013")), method5529(method5528("F2~\u001f\u0007_1$\u001dF")), method5529(method5528("_-<O")), method5529(method5528("F2~fF")), method5529(method5528("F2~aF")), method5529(method5528("F2~`F")), method5529(method5528("F2~eF")), method5529(method5528("Eb")), method5529(method5528("d6\"F\r^?>J\u001dT<p`\u0002P6\u0003F\u001aE1>D\u001du=<W\u000f\u0011,)S\u000b\u00111>\u0003\nT;?G\u000b\u0019q")), method5529(method5528("F2~dF")), method5529(method5528("\u0011<5O\u001aPv?T\u0000T*j")), method5529(method5528("r41M=T,$J\u0000V+\u0014F\u0002E9~B\u001eA4)w\u0001r41M=T,$J\u0000V+x\nT\u0011\u001b\"F\nT6$J\u000f]+pG\u0001\u00116?WN\\9$@\u0006\u0010x\u0003F\u001aE1>D\u001d\u001f7'M\u000bCb")), method5529(method5528("\u0011- G\u000fE=\u001eV\u0003\u000b"))};
   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "Lcv;"
   )
   public static class249 field11001 = new class249(method5529(method5528("}\u0011\u0006f")), 0);
   @OriginalMember(
      owner = "client!wj",
      name = "l",
      descriptor = "I"
   )
   public static int field11011 = 100;
   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class398 field11012 = new class398(8);
   @OriginalMember(
      owner = "client!wj",
      name = "k",
      descriptor = "I"
   )
   public static int field11002;
   @OriginalMember(
      owner = "client!wj",
      name = "e",
      descriptor = "I"
   )
   public static int field11004;
   @OriginalMember(
      owner = "client!wj",
      name = "f",
      descriptor = "I"
   )
   public static int field11005;
   @OriginalMember(
      owner = "client!wj",
      name = "c",
      descriptor = "I"
   )
   public static int field11008;
   @OriginalMember(
      owner = "client!wj",
      name = "m",
      descriptor = "I"
   )
   public static int field11009;
   @OriginalMember(
      owner = "client!wj",
      name = "j",
      descriptor = "I"
   )
   public static int field11010;
   @OriginalMember(
      owner = "client!wj",
      name = "i",
      descriptor = "J"
   )
   private long field11007;
   @OriginalMember(
      owner = "client!wj",
      name = "d",
      descriptor = "Lsja;"
   )
   public static class466 field11013;

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IBII)Z"
   )
   public static final boolean method5521(int arg0, byte arg1, int arg2, int arg3) {
      try {
         if (arg1 != -78) {
            return true;
         } else {
            ++field11009;
            if (class66.field971 && class174.field2594) {
               if (class526.field7443 < 100) {
                  return false;
               } else {
                  int var4 = class411.field6030[arg2][arg0][arg3];
                  if (~(-class451.field6580) == ~var4) {
                     return false;
                  } else if (~class451.field6580 == ~var4) {
                     return true;
                  } else if (class634.field8989 == class225.field3197) {
                     return false;
                  } else {
                     int var5 = arg0 << class313.field4707;
                     int var6 = arg3 << class313.field4707;
                     if (class366.method2883(class225.field3197[arg2].method5400(-1, arg3 - -1, arg0 + 1), class44.field655 + -1 + var5, var5 - -1, class225.field3197[arg2].method5400(-1, arg3, arg0), var6 + 1, class225.field3197[arg2].method5400(arg1 ^ 77, arg3 - -1, arg0), class44.field655 + var6 - 1, var5 - -1, class44.field655 + -1 + var6, false) && class366.method2883(class225.field3197[arg2].method5400(-1, arg3, arg0 + 1), class44.field655 + var5 + -1, var5 + 1, class225.field3197[arg2].method5400(-1, arg3, arg0), var6 - -1, class225.field3197[arg2].method5400(-1, arg3 - -1, arg0 - -1), var6 + -1 - -class44.field655, class44.field655 + var5 + -1, var6 + 1, false)) {
                        ++class48.field729;
                        class411.field6030[arg2][arg0][arg3] = class451.field6580;
                        return true;
                     } else {
                        class411.field6030[arg2][arg0][arg3] = -class451.field6580;
                        return false;
                     }
                  }
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field11014[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(BLcu;)V"
   )
   private final void method5522(byte arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         this.field11007 = arg1.method680(-129);
         ++field11002;
         this.field11003 = arg1.method701(255);
         int var4 = arg1.method665(false);
         int var10000;
         byte var10001;
         if (var3) {
            if (class455.field6615) {
               System.out.println(field11014[9] + var4);
            }

            var10000 = var4;
            var10001 = 3;
         } else if (~var4 == -1) {
            var10000 = arg0;
            var10001 = -111;
            if (!var3) {
               if (arg0 >= -111) {
                  field11001 = null;
                  return;
               }

               return;
            }
         } else {
            if (class455.field6615) {
               System.out.println(field11014[9] + var4);
            }

            var10000 = var4;
            var10001 = 3;
         }

         while(true) {
            class191 var5;
            label203: {
               if (var10000 == var10001) {
                  var5 = new class457();
                  if (!var3) {
                     break label203;
                  }
               }

               if (var4 == 1) {
                  var5 = new class396();
                  if (!var3) {
                     break label203;
                  }
               }

               if (~var4 == -14) {
                  var5 = new class74();
                  if (!var3) {
                     break label203;
                  }
               }

               if (var4 != 4) {
                  if (var4 != 6) {
                     label204: {
                        if (~var4 == -6) {
                           var5 = new class182();
                           if (!var3) {
                              break label204;
                           }
                        }

                        if (var4 != 2) {
                           if (var4 != 7) {
                              label174: {
                                 if (var4 == 8) {
                                    var5 = new class674();
                                    if (!var3) {
                                       break label174;
                                    }
                                 }

                                 if (var4 != 9) {
                                    if (~var4 == -11) {
                                       var5 = new class337();
                                       if (var3) {
                                          if (~var4 == -12) {
                                             var5 = new class303();
                                             if (var3) {
                                                if (var4 != 12) {
                                                   break;
                                                }

                                                var5 = new class27();
                                                if (var3) {
                                                   break;
                                                }
                                             }
                                          } else {
                                             if (var4 != 12) {
                                                break;
                                             }

                                             var5 = new class27();
                                             if (var3) {
                                                break;
                                             }
                                          }
                                       }
                                    } else if (~var4 == -12) {
                                       var5 = new class303();
                                       if (var3) {
                                          if (var4 != 12) {
                                             break;
                                          }

                                          var5 = new class27();
                                          if (var3) {
                                             break;
                                          }
                                       }
                                    } else {
                                       if (var4 != 12) {
                                          break;
                                       }

                                       var5 = new class27();
                                       if (var3) {
                                          break;
                                       }
                                    }
                                 } else {
                                    var5 = new class178();
                                    if (var3) {
                                       var5 = new class571();
                                       if (var3) {
                                          var5 = new class253();
                                          if (var3) {
                                             var5 = new class504();
                                             if (var3) {
                                                var5 = new class353();
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           } else {
                              var5 = new class571();
                              if (var3) {
                                 var5 = new class253();
                                 if (var3) {
                                    var5 = new class504();
                                    if (var3) {
                                       var5 = new class353();
                                    }
                                 }
                              }
                           }
                        } else {
                           var5 = new class253();
                           if (var3) {
                              var5 = new class504();
                              if (var3) {
                                 var5 = new class353();
                              }
                           }
                        }
                     }
                  } else {
                     var5 = new class504();
                     if (var3) {
                        var5 = new class353();
                     }
                  }
               } else {
                  var5 = new class353();
               }
            }

            var5.method346(arg1, -128);
            this.field11006.method2238(var5, 13);
            var4 = arg1.method665(false);
            if (~var4 == -1) {
               var10000 = arg0;
               var10001 = -111;
               if (!var3) {
                  if (arg0 >= -111) {
                     field11001 = null;
                     return;
                  }

                  return;
               }
            } else {
               if (class455.field6615) {
                  System.out.println(field11014[9] + var4);
               }

               var10000 = var4;
               var10001 = 3;
            }
         }

         throw new RuntimeException(field11014[10]);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11014[8] + arg0 + ',' + (arg1 != null ? field11014[2] : field11014[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5523(int arg0) {
      try {
         if (arg0 != 2745) {
            method5523(81);
         }

         field11013 = null;
         field11012 = null;
         field11001 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11014[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(Lea;I)V"
   )
   public final void method5524(class456 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field11004;
         if (this.field11007 == arg0.field6624 && ~this.field11003 == ~arg0.field6643) {
            class191 var4 = (class191)this.field11006.method2245((byte)-94);
            if (var3) {
               var4.method342((byte)-127, arg0);
               var4 = (class191)this.field11006.method2239((byte)102);
            }

            while(true) {
               if (var4 == null) {
                  ++arg0.field6643;
                  if (!var3) {
                     if (arg1 != 26541) {
                        method5527(115);
                        return;
                     }

                     return;
                  }
               } else {
                  var4.method342((byte)-127, arg0);
               }

               var4 = (class191)this.field11006.method2239((byte)102);
            }
         } else {
            throw new RuntimeException(field11014[13] + class29.method363(arg0.field6624, 37) + field11014[14] + arg0.field6643 + field11014[12] + class29.method363(this.field11007, arg1 ^ 26504) + field11014[14] + this.field11003);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11014[11] + (arg0 != null ? field11014[2] : field11014[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5525(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method5526(int arg0, boolean arg1) {
      try {
         ++field11005;
         int var4 = (-715827883 & arg0 >>> 1) + (1431655765 & arg0);
         int var5 = ((-858993459 & var4) >>> 2) + (var4 & 858993459);
         if (arg1) {
            return 122;
         } else {
            var4 = (var5 >>> 4) + var5 & 252645135;
            var4 += var4 >>> 8;
            var4 += var4 >>> 16;
            return 255 & var4;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11014[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   public class767(class65 arg0) {
      try {
         this.method5522((byte)-113, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11014[3] + (arg0 != null ? field11014[2] : field11014[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method5527(int arg0) {
      try {
         if (arg0 >= -90) {
            field11011 = 103;
         }

         ++field11008;
         return class585.field8203;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11014[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5528(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5529(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
