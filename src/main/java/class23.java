import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {
   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "Leaa;"
   )
   private class526 field244;
   @OriginalMember(
      owner = "client!qia",
      name = "d",
      descriptor = "Leaa;"
   )
   private class526 field242;
   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field251 = new String[]{method158(method157("\u0010j`LwI")), method158(method157("\u001a-/LH")), method158(method157("\u0010j`LtI")), method158(method157("\u000fvm\u000e")), method158(method157("\u0010j`L\t\bmh\u0016\u000bI")), method158(method157("\u0010j`LvI")), method158(method157("\u0010j`LsI")), method158(method157("\u0010j`LpI")), method158(method157("\u0010j`LqI"))};
   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "I"
   )
   public static int field245 = 0;
   @OriginalMember(
      owner = "client!qia",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field248 = new class101(79, 2);
   @OriginalMember(
      owner = "client!qia",
      name = "g",
      descriptor = "I"
   )
   public static int field240;
   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "I"
   )
   public static int field243;
   @OriginalMember(
      owner = "client!qia",
      name = "e",
      descriptor = "I"
   )
   public static int field247;
   @OriginalMember(
      owner = "client!qia",
      name = "j",
      descriptor = "I"
   )
   public static int field249;
   @OriginalMember(
      owner = "client!qia",
      name = "i",
      descriptor = "I"
   )
   public static int field250;
   @OriginalMember(
      owner = "client!qia",
      name = "k",
      descriptor = "Les;"
   )
   private class402 field246;
   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field241;

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public static final void method151(class128 arg0, boolean arg1) {
      int var2 = client.field4530;

      try {
         if (arg1) {
            method154(-37);
         }

         ++field240;
         byte[] var3 = new byte[24];
         if (class561.field8395 != null) {
            try {
               int var10000;
               label85: {
                  class561.field8395.method3968(-96, 0L);
                  class561.field8395.method3975(var3, false);
                  int var4 = 0;
                  if (var2 != 0) {
                     var10000 = var3[var4];
                  } else if (~var4 <= -25) {
                     var10000 = ~var4;
                     if (var2 == 0) {
                        break label85;
                     }
                  } else {
                     var10000 = var3[var4];
                  }

                  label84:
                  do {
                     while(true) {
                        if (var10000 != 0) {
                           if (var2 == 0) {
                              var10000 = ~var4;
                              break;
                           }

                           ++var4;
                        } else {
                           ++var4;
                        }

                        if (~var4 <= -25) {
                           var10000 = ~var4;
                           if (var2 == 0) {
                              break label84;
                           }
                        } else {
                           var10000 = var3[var4];
                        }
                     }
                  } while(var2 != 0);
               }

               if (var10000 <= -25) {
                  throw new IOException();
               }
            } catch (Exception var7) {
               int var5 = 0;
               if (var2 != 0) {
                  var3[var5] = -1;
                  ++var5;
               }

               while(true) {
                  while(~var5 > -25) {
                     var3[var5] = -1;
                     ++var5;
                  }

                  if (var2 == 0) {
                     break;
                  }

                  ++var5;
               }
            }
         }

         arg0.method1059(24, -2125022416, var3, 0);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field251[7] + (arg0 != null ? field251[1] : field251[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method152(int arg0) {
      try {
         field241 = null;
         if (arg0 >= 88) {
            field248 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field251[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Lcw;I)Leu;"
   )
   public final class505 method153(class191 arg0, int arg1) {
      try {
         ++field243;
         if (arg0 == null) {
            return null;
         } else {
            class79 var3 = arg0.method1311(-127);
            if (class688.field10363 == var3) {
               return new class660((class317)arg0);
            } else if (class561.field8388 == var3) {
               return new class235(this.method155(-24823), (class281)arg0);
            } else if (class362.field5454 == var3) {
               return new class551(this.field244, (class450)arg0);
            } else if (class335.field4792 == var3) {
               return new class11(this.field244, (class709)arg0);
            } else if (class554.field8209 == var3) {
               return new class64(this.field244, this.field242, (class665)arg0);
            } else if (class33.field367 == var3) {
               return new class543(this.field244, this.field242, (class576)arg0);
            } else if (arg1 != 0) {
               return null;
            } else if (class675.field10143 == var3) {
               return new class641(this.field244, this.field242, (class158)arg0);
            } else if (class389.field5946 == var3) {
               return new class597(this.field244, this.field242, (class183)arg0);
            } else if (class55.field686 == var3) {
               return new class682(this.field244, (class448)arg0);
            } else {
               return class380.field5848 == var3 ? new class656(this.field244, this.field242, (class607)arg0) : null;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field251[6] + (arg0 != null ? field251[1] : field251[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method154(int arg0) {
      try {
         ++field247;
         if (class186.field2336 != null) {
            try {
               class186.field2336.close();
            } catch (IOException var2) {
            }
         }

         if (arg0 != -8070) {
            field241 = null;
         }

         class186.field2336 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field251[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I)Les;"
   )
   private final class402 method155(int arg0) {
      try {
         if (this.field246 == null) {
            this.field246 = new class402();
         }

         if (arg0 != -24823) {
            this.field244 = null;
         }

         ++field249;
         return this.field246;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field251[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "(Leaa;Leaa;)V"
   )
   public class23(class526 arg0, class526 arg1) {
      try {
         this.field244 = arg0;
         this.field242 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field251[4] + (arg0 != null ? field251[1] : field251[3]) + ',' + (arg1 != null ? field251[1] : field251[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Ljava/lang/String;B)[B"
   )
   public static final byte[] method156(String arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field250;
         int var3 = arg0.length();
         byte[] var4 = new byte[var3];
         int var5 = 0;
         if (arg1 != -120) {
            field245 = 44;
            if (var2 == 0 && var5 >= var3) {
               return var4;
            }
         } else if (var5 >= var3) {
            return var4;
         }

         do {
            label269: {
               char var6 = arg0.charAt(var5);
               if (var6 > 0 && ~var6 > -129 || ~var6 <= -161 && ~var6 >= -256) {
                  var4[var5] = (byte)var6;
                  if (var2 == 0) {
                     break label269;
                  }
               }

               if (var6 != 8364) {
                  label257: {
                     if (var6 == 8218) {
                        var4[var5] = -126;
                        if (var2 == 0) {
                           break label257;
                        }
                     }

                     if (var6 != 402) {
                        if (~var6 == -8223) {
                           var4[var5] = -124;
                           if (var2 == 0) {
                              break label257;
                           }
                        }

                        if (var6 == 8230) {
                           var4[var5] = -123;
                           if (var2 == 0) {
                              break label257;
                           }
                        }

                        if (var6 == 8224) {
                           var4[var5] = -122;
                           if (var2 == 0) {
                              break label257;
                           }
                        }

                        if (var6 == 8225) {
                           var4[var5] = -121;
                           if (var2 == 0) {
                              break label257;
                           }
                        }

                        if (~var6 == -711) {
                           var4[var5] = -120;
                           if (var2 == 0) {
                              break label257;
                           }
                        }

                        if (var6 != 8240) {
                           if (~var6 != -353) {
                              if (~var6 != -8250) {
                                 if (~var6 == -339) {
                                    var4[var5] = -116;
                                    if (var2 == 0) {
                                       break label257;
                                    }
                                 }

                                 if (~var6 == -382) {
                                    var4[var5] = -114;
                                    if (var2 == 0) {
                                       break label257;
                                    }
                                 }

                                 if (var6 != 8216) {
                                    if (var6 == 8217) {
                                       var4[var5] = -110;
                                       if (var2 == 0) {
                                          break label257;
                                       }
                                    }

                                    if (var6 != 8220) {
                                       if (var6 == 8221) {
                                          var4[var5] = -108;
                                          if (var2 == 0) {
                                             break label257;
                                          }
                                       }

                                       if (~var6 != -8227) {
                                          if (~var6 == -8212) {
                                             var4[var5] = -106;
                                             if (var2 == 0) {
                                                break label257;
                                             }
                                          }

                                          if (~var6 == -8213) {
                                             var4[var5] = -105;
                                             if (var2 == 0) {
                                                break label257;
                                             }
                                          }

                                          if (var6 == 732) {
                                             var4[var5] = -104;
                                             if (var2 == 0) {
                                                break label257;
                                             }
                                          }

                                          if (var6 != 8482) {
                                             if (~var6 == -354) {
                                                var4[var5] = -102;
                                                if (var2 == 0) {
                                                   break label257;
                                                }
                                             }

                                             if (~var6 != -8251) {
                                                if (var6 != 339) {
                                                   if (var6 != 382) {
                                                      if (var6 != 376) {
                                                         var4[var5] = 63;
                                                         if (var2 == 0) {
                                                            break label257;
                                                         }
                                                      }

                                                      var4[var5] = -97;
                                                      if (var2 == 0) {
                                                         break label257;
                                                      }
                                                   }

                                                   var4[var5] = -98;
                                                   if (var2 == 0) {
                                                      break label257;
                                                   }
                                                }

                                                var4[var5] = -100;
                                                if (var2 == 0) {
                                                   break label257;
                                                }
                                             }

                                             var4[var5] = -101;
                                             if (var2 == 0) {
                                                break label257;
                                             }
                                          }

                                          var4[var5] = -103;
                                          if (var2 == 0) {
                                             break label257;
                                          }
                                       }

                                       var4[var5] = -107;
                                       if (var2 == 0) {
                                          break label257;
                                       }
                                    }

                                    var4[var5] = -109;
                                    if (var2 == 0) {
                                       break label257;
                                    }
                                 }

                                 var4[var5] = -111;
                                 if (var2 == 0) {
                                    break label257;
                                 }
                              }

                              var4[var5] = -117;
                              if (var2 == 0) {
                                 break label257;
                              }
                           }

                           var4[var5] = -118;
                           if (var2 == 0) {
                              break label257;
                           }
                        }

                        var4[var5] = -119;
                        if (var2 == 0) {
                           break label257;
                        }
                     }

                     var4[var5] = -125;
                     if (var2 != 0) {
                        var4[var5] = -128;
                     }
                  }
               } else {
                  var4[var5] = -128;
               }
            }

            ++var5;
         } while(var5 < var3);

         return var4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field251[2] + (arg0 != null ? field251[1] : field251[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
