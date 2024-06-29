import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class116 {
   @OriginalMember(
      owner = "client!sha",
      name = "f",
      descriptor = "I"
   )
   private int field1529 = -1;
   @OriginalMember(
      owner = "client!sha",
      name = "b",
      descriptor = "Lrca;"
   )
   private class37 field1526 = new class37();
   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1533 = new String[]{method1035(method1034("j\u001a8w 1")), method1035(method1034("w\u000755")), method1035(method1034("b\\ww\u0019")), method1035(method1034("L\u001c+<\u0007v\u001570\u0017|\u0016y\u001a\bx\u001c\n<\u0010m\u001b7>\u0017]\u00175-\u00059\u0006 )\u00019\u001b7y\u0000|\u00116=\u00011[")), method1035(method1034("j\u001a8w&1")), method1035(method1034("mH")), method1035(method1034("j\u001a8wXp\u001c0-Z1")), method1035(method1034("Z\u001e877|\u0006-0\n~\u0001\u001d<\bm\u0013w8\u0014i\u001e \r\u000bZ\u001e877|\u0006-0\n~\u0001qp^91+<\u0000|\u001c-0\u0005u\u0001y=\u000b9\u001c6-Dt\u0013-:\f8R\n<\u0010m\u001b7>\u00177\u001d.7\u0001kH")), method1035(method1034("j\u001a8w'1")), method1035(method1034("9\u0016<5\u0010x\\6.\n|\u0000c")), method1035(method1034("9\u0007)=\u0005m\u0017\u0017,\t#")), method1035(method1034("j\u001a8w%1"))};
   @OriginalMember(
      owner = "client!sha",
      name = "g",
      descriptor = "I"
   )
   public static int field1525 = -1;
   @OriginalMember(
      owner = "client!sha",
      name = "d",
      descriptor = "I"
   )
   public static int field1527;
   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "I"
   )
   public static int field1528;
   @OriginalMember(
      owner = "client!sha",
      name = "h",
      descriptor = "I"
   )
   public static int field1532;
   @OriginalMember(
      owner = "client!sha",
      name = "c",
      descriptor = "J"
   )
   private long field1530;
   @OriginalMember(
      owner = "client!sha",
      name = "e",
      descriptor = "Lgea;"
   )
   public static class66 field1531;

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   private final void method1030(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         this.field1530 = arg1.method660(123);
         ++field1527;
         this.field1529 = arg1.method610(-36);
         int var4 = arg1.method640(255);
         int var10000;
         byte var10001;
         if (var3) {
            if (class374.field5234) {
               System.out.println(field1533[5] + var4);
            }

            var10000 = var4;
            var10001 = 3;
         } else if (~var4 == -1) {
            var10000 = arg0;
            var10001 = -11;
            if (!var3) {
               if (arg0 != -11) {
                  this.method1033(-2, (class790)null);
                  return;
               }

               return;
            }
         } else {
            if (class374.field5234) {
               System.out.println(field1533[5] + var4);
            }

            var10000 = var4;
            var10001 = 3;
         }

         while(true) {
            class644 var5;
            if (var10000 != var10001) {
               if (var4 != 1) {
                  label190: {
                     if (~var4 == -5) {
                        var5 = new class755();
                        if (!var3) {
                           break label190;
                        }
                     }

                     if (~var4 != -7) {
                        if (var4 != 5) {
                           label191: {
                              if (var4 == 2) {
                                 var5 = new class441();
                                 if (!var3) {
                                    break label191;
                                 }
                              }

                              if (var4 != 7) {
                                 label192: {
                                    if (var4 == 8) {
                                       var5 = new class58();
                                       if (!var3) {
                                          break label192;
                                       }
                                    }

                                    if (~var4 == -10) {
                                       var5 = new class556();
                                       if (!var3) {
                                          break label192;
                                       }
                                    }

                                    if (~var4 != -11) {
                                       if (~var4 == -12) {
                                          var5 = new class584();
                                          if (!var3) {
                                             break label192;
                                          }

                                          if (var4 != 12) {
                                             throw new RuntimeException(field1533[3]);
                                          }
                                       } else if (var4 != 12) {
                                          throw new RuntimeException(field1533[3]);
                                       }

                                       var5 = new class470();
                                       if (!var3) {
                                          break label192;
                                       }
                                    }

                                    var5 = new class356();
                                    if (var3) {
                                       var5 = new class587();
                                       if (var3) {
                                          var5 = new class321();
                                          if (var3) {
                                             var5 = new class522();
                                             if (var3) {
                                                var5 = new class506();
                                                if (var3) {
                                                   var5 = new class13();
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              } else {
                                 var5 = new class587();
                                 if (var3) {
                                    var5 = new class321();
                                    if (var3) {
                                       var5 = new class522();
                                       if (var3) {
                                          var5 = new class506();
                                          if (var3) {
                                             var5 = new class13();
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        } else {
                           var5 = new class321();
                           if (var3) {
                              var5 = new class522();
                              if (var3) {
                                 var5 = new class506();
                                 if (var3) {
                                    var5 = new class13();
                                 }
                              }
                           }
                        }
                     } else {
                        var5 = new class522();
                        if (var3) {
                           var5 = new class506();
                           if (var3) {
                              var5 = new class13();
                           }
                        }
                     }
                  }
               } else {
                  var5 = new class506();
                  if (var3) {
                     var5 = new class13();
                  }
               }
            } else {
               var5 = new class13();
            }

            var5.method111(arg0 ^ -2, arg1);
            this.field1526.method279(false, var5);
            var4 = arg1.method640(255);
            if (~var4 == -1) {
               var10000 = arg0;
               var10001 = -11;
               if (!var3) {
                  if (arg0 != -11) {
                     this.method1033(-2, (class790)null);
                     return;
                  }

                  return;
               }
            } else {
               if (class374.field5234) {
                  System.out.println(field1533[5] + var4);
               }

               var10000 = var4;
               var10001 = 3;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1533[4] + arg0 + ',' + (arg1 != null ? field1533[2] : field1533[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1031(int arg0) {
      try {
         field1531 = null;
         if (arg0 != -1) {
            method1031(85);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1533[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public static final int method1032(String arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field1528;
         if (!class529.field7414.field10745) {
            return -1;
         } else if (class159.field2036.containsKey(arg0)) {
            return 100;
         } else {
            String var3 = class591.method4403(arg1 ^ 68, arg0);
            if (var3 == null) {
               return -1;
            } else if (arg1 != 100) {
               return 14;
            } else {
               String var4 = class370.field5162 + var3;
               if (!class732.field10676.method2704(var4, "", 0)) {
                  return -1;
               } else if (!class732.field10676.method2696(arg1 + 155, var4)) {
                  return class732.field10676.method2693(arg1 + -100, var4);
               } else {
                  byte[] var5 = class732.field10676.method2692(var4, "", (byte)-86);
                  Object var6 = null;

                  File var7;
                  try {
                     var7 = class85.method809(-443, var3);
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8;
                     label95: {
                        var8 = true;
                        byte[] var9 = class217.method1770(arg1 + -228, var7);
                        if (var9 != null && var5.length == var9.length) {
                           int var10 = 0;
                           if (var2) {
                              if (var5[var10] != var9[var10]) {
                                 var8 = false;
                                 if (!var2) {
                                    break label95;
                                 }
                              }

                              ++var10;
                           }

                           while(true) {
                              while(~var9.length < ~var10) {
                                 if (var5[var10] != var9[var10]) {
                                    var8 = false;
                                    if (!var2) {
                                       break label95;
                                    }
                                 }

                                 ++var10;
                              }

                              if (!var2) {
                                 if (!var2) {
                                    break label95;
                                 }
                                 break;
                              }

                              ++var10;
                           }
                        }

                        var8 = false;
                     }

                     try {
                        if (!var8) {
                           class529.field7414.method5333(arg1 + -81, var7, var5);
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     class14.method122(false, arg0, var7);
                     return 100;
                  } else {
                     return -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field1533[0] + (arg0 != null ? field1533[2] : field1533[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method1033(int arg0, class790 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1532;
         if (~this.field1530 == ~arg1.field11527 && this.field1529 == arg1.field11533) {
            class644 var4 = (class644)this.field1526.method288(0);
            if (var3) {
               var4.method114(19163, arg1);
               var4 = (class644)this.field1526.method290(17958);
            }

            while(true) {
               if (var4 == null) {
                  if (!var3) {
                     if (arg0 < 19) {
                        this.field1529 = 12;
                     }

                     ++arg1.field11533;
                     return;
                  }
               } else {
                  var4.method114(19163, arg1);
               }

               var4 = (class644)this.field1526.method290(17958);
            }
         } else {
            throw new RuntimeException(field1533[7] + class550.method4166(37, arg1.field11527) + field1533[10] + arg1.field11533 + field1533[9] + class550.method4166(37, this.field1530) + field1533[10] + this.field1529);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1533[8] + arg0 + ',' + (arg1 != null ? field1533[2] : field1533[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "<init>",
      descriptor = "(Lgea;)V"
   )
   public class116(class66 arg0) {
      try {
         this.method1030(-11, arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1533[6] + (arg0 != null ? field1533[2] : field1533[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1034(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1035(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
