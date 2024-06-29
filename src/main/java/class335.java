import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class335 {
   @OriginalMember(
      owner = "client!ne",
      name = "g",
      descriptor = "[I"
   )
   public int[] field4789;
   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4792 = new String[]{method2605(method2604("*pqPf")), method2605(method2604("*`3\u007f")), method2605(method2604("?;q=3")), method2605(method2604("*pqWf")), method2605(method2604("*pqRf")), method2605(method2604("*pqQf")), method2605(method2604("*pq/'*|+-f"))};
   @OriginalMember(
      owner = "client!ne",
      name = "c",
      descriptor = "I"
   )
   public static int field4787 = 1408;
   @OriginalMember(
      owner = "client!ne",
      name = "d",
      descriptor = "I"
   )
   public static int field4784 = 4;
   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "I"
   )
   public static int field4785;
   @OriginalMember(
      owner = "client!ne",
      name = "b",
      descriptor = "I"
   )
   public static int field4786;
   @OriginalMember(
      owner = "client!ne",
      name = "h",
      descriptor = "I"
   )
   public static int field4788;
   @OriginalMember(
      owner = "client!ne",
      name = "f",
      descriptor = "I"
   )
   public static int field4790;
   @OriginalMember(
      owner = "client!ne",
      name = "e",
      descriptor = "I"
   )
   public static int field4791;

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(Luda;B)V"
   )
   private final void method2600(class473 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         ++field4785;
         if (arg1 != 35) {
            field4788 = 27;
         }

         while(true) {
            label38:
            while(true) {
               int var4 = arg0.method3564((byte)-100);
               if (var4 == 0) {
                  return;
               }

               int var10000 = var4;

               while(var10000 == 1) {
                  int var5 = arg0.method3564((byte)-119);
                  this.field4789 = new int[var5];
                  var10000 = 0;
                  if (!var3) {
                     int var6 = 0;
                     if (var3) {
                        this.field4789[var6] = arg0.method3564((byte)-59);
                        ++var6;
                     }

                     while(true) {
                        while(var6 < this.field4789.length) {
                           this.field4789[var6] = arg0.method3564((byte)-59);
                           ++var6;
                        }

                        if (!var3) {
                           continue label38;
                        }

                        ++var6;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4792[3] + (arg0 != null ? field4792[2] : field4792[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(IZILha;)V"
   )
   public static final void method2601(int arg0, boolean arg1, int arg2, class65 arg3) {
      try {
         class625.field9095 = arg3;
         class448.field6548 = new class531[arg2][arg0];
         ++field4790;
         if (class22.field348 != null) {
            class191.field2892 = class346.method2675(class22.field348[5], class22.field348[0], class22.field348[2], (byte)-16, class22.field348[1], class22.field348[3], class22.field348[4]);
         }

         class764.field11096 = new class531();
         if (!arg1) {
            field4784 = 104;
         }

         client.method2451(30282);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4792[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4792[2] : field4792[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(BZ)I"
   )
   public static final int method2602(byte arg0, boolean arg1) {
      try {
         if (arg0 != 75) {
            method2602((byte)-35, false);
         }

         ++field4786;
         int var2 = class402.field5939;
         if (~var2 != -1) {
            if (var2 == 1) {
               return class601.field8673;
            }

            if (var2 != 2) {
               return 0;
            }

            if (!client.field4564) {
               return 0;
            }
         }

         return arg1 ? 0 : class601.field8673;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4792[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "(Lhw;)V"
   )
   public class335(class141 arg0) {
      try {
         byte[] var2 = arg0.method1331((byte)-98, 6);
         this.method2600(new class473(var2), (byte)35);
         if (this.field4789 == null) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4792[6] + (arg0 != null ? field4792[2] : field4792[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "a",
      descriptor = "(ILjava/lang/String;)[B"
   )
   public static final byte[] method2603(int arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         ++field4791;
         if (arg0 != -1129) {
            field4784 = -8;
         }

         int var3 = arg1.length();
         byte[] var4 = new byte[var3];
         int var5 = 0;
         if (!var2 && var3 <= var5) {
            return var4;
         } else {
            do {
               label267: {
                  char var6 = arg1.charAt(var5);
                  if (var6 > 0 && ~var6 > -129 || var6 >= 160 && var6 <= 255) {
                     var4[var5] = (byte)var6;
                     if (!var2) {
                        break label267;
                     }
                  }

                  if (var6 != 8364) {
                     label255: {
                        if (var6 == 8218) {
                           var4[var5] = -126;
                           if (!var2) {
                              break label255;
                           }
                        }

                        if (~var6 != -403) {
                           if (~var6 != -8223) {
                              if (var6 == 8230) {
                                 var4[var5] = -123;
                                 if (!var2) {
                                    break label255;
                                 }
                              }

                              if (~var6 != -8225) {
                                 if (var6 == 8225) {
                                    var4[var5] = -121;
                                    if (!var2) {
                                       break label255;
                                    }
                                 }

                                 if (var6 == 710) {
                                    var4[var5] = -120;
                                    if (!var2) {
                                       break label255;
                                    }
                                 }

                                 if (~var6 != -8241) {
                                    if (var6 != 352) {
                                       if (var6 != 8249) {
                                          if (~var6 == -339) {
                                             var4[var5] = -116;
                                             if (!var2) {
                                                break label255;
                                             }
                                          }

                                          if (var6 == 381) {
                                             var4[var5] = -114;
                                             if (!var2) {
                                                break label255;
                                             }
                                          }

                                          if (~var6 == -8217) {
                                             var4[var5] = -111;
                                             if (!var2) {
                                                break label255;
                                             }
                                          }

                                          if (~var6 != -8218) {
                                             if (~var6 == -8221) {
                                                var4[var5] = -109;
                                                if (!var2) {
                                                   break label255;
                                                }
                                             }

                                             if (var6 != 8221) {
                                                if (var6 != 8226) {
                                                   if (var6 != 8211) {
                                                      if (~var6 != -8213) {
                                                         if (var6 == 732) {
                                                            var4[var5] = -104;
                                                            if (!var2) {
                                                               break label255;
                                                            }
                                                         }

                                                         if (~var6 != -8483) {
                                                            if (var6 == 353) {
                                                               var4[var5] = -102;
                                                               if (!var2) {
                                                                  break label255;
                                                               }
                                                            }

                                                            if (var6 != 8250) {
                                                               if (var6 != 339) {
                                                                  if (~var6 == -383) {
                                                                     var4[var5] = -98;
                                                                     if (!var2) {
                                                                        break label255;
                                                                     }
                                                                  }

                                                                  if (var6 != 376) {
                                                                     var4[var5] = 63;
                                                                     if (!var2) {
                                                                        break label255;
                                                                     }
                                                                  }

                                                                  var4[var5] = -97;
                                                                  if (!var2) {
                                                                     break label255;
                                                                  }
                                                               }

                                                               var4[var5] = -100;
                                                               if (!var2) {
                                                                  break label255;
                                                               }
                                                            }

                                                            var4[var5] = -101;
                                                            if (!var2) {
                                                               break label255;
                                                            }
                                                         }

                                                         var4[var5] = -103;
                                                         if (!var2) {
                                                            break label255;
                                                         }
                                                      }

                                                      var4[var5] = -105;
                                                      if (!var2) {
                                                         break label255;
                                                      }
                                                   }

                                                   var4[var5] = -106;
                                                   if (!var2) {
                                                      break label255;
                                                   }
                                                }

                                                var4[var5] = -107;
                                                if (!var2) {
                                                   break label255;
                                                }
                                             }

                                             var4[var5] = -108;
                                             if (!var2) {
                                                break label255;
                                             }
                                          }

                                          var4[var5] = -110;
                                          if (!var2) {
                                             break label255;
                                          }
                                       }

                                       var4[var5] = -117;
                                       if (!var2) {
                                          break label255;
                                       }
                                    }

                                    var4[var5] = -118;
                                    if (!var2) {
                                       break label255;
                                    }
                                 }

                                 var4[var5] = -119;
                                 if (!var2) {
                                    break label255;
                                 }
                              }

                              var4[var5] = -122;
                              if (!var2) {
                                 break label255;
                              }
                           }

                           var4[var5] = -124;
                           if (!var2) {
                              break label255;
                           }
                        }

                        var4[var5] = -125;
                        if (var2) {
                           var4[var5] = -128;
                        }
                     }
                  } else {
                     var4[var5] = -128;
                  }
               }

               ++var5;
            } while(var3 > var5);

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4792[5] + arg0 + ',' + (arg1 != null ? field4792[2] : field4792[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "<init>",
      descriptor = "()V"
   )
   protected class335() {
      try {
         this.field4789 = new int[0];
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4792[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2604(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ne",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2605(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
