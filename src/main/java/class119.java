import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 {
   @OriginalMember(
      owner = "client!ra",
      name = "d",
      descriptor = "Lkf;"
   )
   private class266 field1487;
   @OriginalMember(
      owner = "client!ra",
      name = "j",
      descriptor = "Lkf;"
   )
   private class266 field1481;
   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1489 = new String[]{method956(method955("\u001959\u001e\u001d")), method956(method955("\u001959\u001a\u001d")), method956(method955("\u0005!{1")), method956(method955("\u0010z9sH")), method956(method955("\u001959\u0019\u001d")), method956(method955("\u001959\u001c\u001d")), method956(method955("\u001959\u0018\u001d")), method956(method955("\u001959\u001b\u001d")), method956(method955("\u001959\u001f\u001d")), method956(method955("\u001959a\\\u0005=cc\u001d"))};
   @OriginalMember(
      owner = "client!ra",
      name = "c",
      descriptor = "I"
   )
   public static int field1484 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "g",
      descriptor = "Leg;"
   )
   public static class118 field1480 = new class118(6, -2);
   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "Lll;"
   )
   public static class387 field1488 = new class387();
   @OriginalMember(
      owner = "client!ra",
      name = "e",
      descriptor = "I"
   )
   public static int field1476;
   @OriginalMember(
      owner = "client!ra",
      name = "k",
      descriptor = "I"
   )
   public static int field1477;
   @OriginalMember(
      owner = "client!ra",
      name = "h",
      descriptor = "I"
   )
   public static int field1482;
   @OriginalMember(
      owner = "client!ra",
      name = "m",
      descriptor = "I"
   )
   public static int field1483;
   @OriginalMember(
      owner = "client!ra",
      name = "l",
      descriptor = "I"
   )
   public static int field1485;
   @OriginalMember(
      owner = "client!ra",
      name = "f",
      descriptor = "I"
   )
   public static int field1486;
   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "Lbm;"
   )
   private class124 field1478;
   @OriginalMember(
      owner = "client!ra",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field1479;

   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "(I)Lbm;"
   )
   private final class124 method948(int arg0) {
      try {
         if (arg0 <= 83) {
            method950((byte)-83, -4, 45, 32);
         }

         ++field1482;
         if (this.field1478 == null) {
            this.field1478 = new class124();
         }

         return this.field1478;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1489[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method949(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0 != 0) {
            method954(true, (String)null, 87);
         }

         ++field1476;
         if (class182.field2549 == null) {
            if (!class131.field1677 && class521.field7496 != null) {
               return class521.field7496.field462;
            }

            int var2 = class611.field8968.method1660(false);
            int var3 = class611.field8968.method1659((byte)124);
            if (!class662.field9649) {
               if (~class185.field2624 <= ~var2 || ~(class285.field3949 + class185.field2624) >= ~var2) {
                  return -1;
               }

               int var4 = -1;
               int var5 = 0;
               int var6;
               int var7;
               if (var1) {
                  if (!class743.field10822) {
                     var6 = (-var5 + -1 + class278.field3784) * 16 + class305.field4177 + 31;
                     if (var6 + -13 < var3) {
                        if (var6 + 3 >= var3) {
                           var4 = var5;
                           if (var1) {
                              var7 = 33 + (class305.field4177 - -((class278.field3784 + -1 - var5) * 16));
                              if (~(var7 + -13) > ~var3 && ~var3 >= ~(var7 + 3)) {
                                 var4 = var5;
                              }

                              ++var5;
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     } else {
                        ++var5;
                     }
                  } else {
                     var7 = 33 + (class305.field4177 - -((class278.field3784 + -1 - var5) * 16));
                     if (~(var7 + -13) > ~var3 && ~var3 >= ~(var7 + 3)) {
                        var4 = var5;
                     }

                     ++var5;
                  }
               }

               label483:
               while(true) {
                  while(~var5 > ~class278.field3784) {
                     if (!class743.field10822) {
                        var6 = (-var5 + -1 + class278.field3784) * 16 + class305.field4177 + 31;
                        if (var6 + -13 < var3) {
                           if (var6 + 3 >= var3) {
                              var4 = var5;
                              if (var1) {
                                 var7 = 33 + (class305.field4177 - -((class278.field3784 + -1 - var5) * 16));
                                 if (~(var7 + -13) > ~var3 && ~var3 >= ~(var7 + 3)) {
                                    var4 = var5;
                                 }

                                 ++var5;
                              } else {
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     } else {
                        var7 = 33 + (class305.field4177 - -((class278.field3784 + -1 - var5) * 16));
                        if (~(var7 + -13) > ~var3 && ~var3 >= ~(var7 + 3)) {
                           var4 = var5;
                        }

                        ++var5;
                     }
                  }

                  if (!var1) {
                     if (var4 == -1) {
                        return -1;
                     }

                     int var8 = 0;
                     class348 var9 = new class348(class627.field9216);
                     class32 var10 = (class32)var9.method2541(arg0 + 10);
                     if (var1) {
                        if (~var4 == ~(var8++)) {
                           return var10.field462;
                        }

                        var10 = (class32)var9.method2542((byte)-120);
                     }

                     while(true) {
                        while(var10 != null) {
                           if (~var4 == ~(var8++)) {
                              return var10.field462;
                           }

                           var10 = (class32)var9.method2542((byte)-120);
                        }

                        if (!var1) {
                           if (!var1) {
                              return -1;
                           }
                           break label483;
                        }

                        var10 = (class32)var9.method2542((byte)-120);
                     }
                  }

                  var7 = var4 + -1;
                  if (~(var7 + -13) > ~var3 && ~var3 >= ~(var7 + 3)) {
                     var4 = var5;
                  }

                  ++var5;
               }
            }

            if (~class185.field2624 <= ~var2 || ~(class285.field3949 + class185.field2624) >= ~var2) {
               if (class491.field7031 == null || ~class100.field1286 <= ~var2 || var2 >= class25.field405 + class100.field1286) {
                  return -1;
               }

               int var11 = -1;
               int var12 = 0;
               int var13;
               int var14;
               if (var1) {
                  if (class743.field10822) {
                     var13 = var12 * 16 + class380.field5479 + 33;
                     if (~(var13 + -13) > ~var3) {
                        if (var13 + 3 >= var3) {
                           var11 = var12;
                           if (var1) {
                              var14 = class380.field5479 - (-31 - var12 * 16);
                              if (~(var14 - 13) > ~var3 && var14 + 3 >= var3) {
                                 var11 = var12;
                              }

                              ++var12;
                           } else {
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     } else {
                        ++var12;
                     }
                  } else {
                     var14 = class380.field5479 - (-31 - var12 * 16);
                     if (~(var14 - 13) > ~var3 && var14 + 3 >= var3) {
                        var11 = var12;
                     }

                     ++var12;
                  }
               }

               label279:
               while(true) {
                  while(class491.field7031.field8785 > var12) {
                     if (class743.field10822) {
                        var13 = var12 * 16 + class380.field5479 + 33;
                        if (~(var13 + -13) > ~var3) {
                           if (var13 + 3 >= var3) {
                              var11 = var12;
                              if (var1) {
                                 var14 = class380.field5479 - (-31 - var12 * 16);
                                 if (~(var14 - 13) > ~var3 && var14 + 3 >= var3) {
                                    var11 = var12;
                                 }

                                 ++var12;
                              } else {
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     } else {
                        var14 = class380.field5479 - (-31 - var12 * 16);
                        if (~(var14 - 13) > ~var3 && var14 + 3 >= var3) {
                           var11 = var12;
                        }

                        ++var12;
                     }
                  }

                  if (!var1) {
                     if (var11 == -1) {
                        return -1;
                     }

                     int var15 = 0;
                     class333 var16 = new class333(class491.field7031.field8795);
                     class32 var17 = (class32)var16.method2467(214);
                     if (var1) {
                        if (var11 == var15++) {
                           return var17.field462;
                        }

                        var17 = (class32)var16.method2465((byte)16);
                     }

                     while(true) {
                        while(var17 != null) {
                           if (var11 == var15++) {
                              return var17.field462;
                           }

                           var17 = (class32)var16.method2465((byte)16);
                        }

                        if (!var1) {
                           if (!var1) {
                              return -1;
                           }
                           break label279;
                        }

                        var17 = (class32)var16.method2465((byte)16);
                     }
                  }

                  var14 = var11 - -1;
                  if (~(var14 - 13) > ~var3 && var14 + 3 >= var3) {
                     var11 = var12;
                  }

                  ++var12;
               }
            }

            int var18 = -1;
            int var19 = 0;
            int var10000;
            int var22;
            class333 var23;
            class598 var24;
            if (var1) {
               var10000 = class743.field10822;
            } else if (~class578.field8529 >= ~var19) {
               var10000 = ~var18;
               if (!var1) {
                  if (var10000 == 0) {
                     return -1;
                  }

                  var22 = 0;
                  var23 = new class333(class265.field3654);
                  var24 = (class598)var23.method2467(214);
                  if (var1) {
                     if (var18 == var22++) {
                        return ((class32)var24.field8795.field6868.field950).field462;
                     }

                     var24 = (class598)var23.method2465((byte)16);
                  }

                  while(true) {
                     while(var24 != null) {
                        if (var18 == var22++) {
                           return ((class32)var24.field8795.field6868.field950).field462;
                        }

                        var24 = (class598)var23.method2465((byte)16);
                     }

                     if (!var1) {
                        if (var1) {
                           return class521.field7496.field462;
                        }

                        return -1;
                     }

                     var24 = (class598)var23.method2465((byte)16);
                  }
               }
            } else {
               var10000 = class743.field10822;
            }

            while(true) {
               int var21;
               if (var10000 == 0) {
                  int var20 = var19 * 16 + 31 + class305.field4177;
                  if (~(var20 + -13) > ~var3) {
                     if (~(var20 + 3) <= ~var3) {
                        var18 = var19;
                        if (var1) {
                           var21 = var19 * 16 + class305.field4177 + 33;
                           if (var3 > var21 - 13 && ~var3 >= ~(var21 - -3)) {
                              var18 = var19;
                           }

                           ++var19;
                        } else {
                           ++var19;
                        }
                     } else {
                        ++var19;
                     }
                  } else {
                     ++var19;
                  }
               } else {
                  var21 = var19 * 16 + class305.field4177 + 33;
                  if (var3 > var21 - 13 && ~var3 >= ~(var21 - -3)) {
                     var18 = var19;
                  }

                  ++var19;
               }

               if (~class578.field8529 >= ~var19) {
                  var10000 = ~var18;
                  if (!var1) {
                     if (var10000 == 0) {
                        break;
                     }

                     var22 = 0;
                     var23 = new class333(class265.field3654);
                     var24 = (class598)var23.method2467(214);
                     if (var1) {
                        if (var18 == var22++) {
                           return ((class32)var24.field8795.field6868.field950).field462;
                        }

                        var24 = (class598)var23.method2465((byte)16);
                     }

                     while(true) {
                        while(var24 != null) {
                           if (var18 == var22++) {
                              return ((class32)var24.field8795.field6868.field950).field462;
                           }

                           var24 = (class598)var23.method2465((byte)16);
                        }

                        if (!var1) {
                           if (var1) {
                              return class521.field7496.field462;
                           }

                           return -1;
                        }

                        var24 = (class598)var23.method2465((byte)16);
                     }
                  }
               } else {
                  var10000 = class743.field10822;
               }
            }
         }

         return -1;
      } catch (RuntimeException var26) {
         throw class237.method1823(var26, field1489[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(BIII)Lcl;"
   )
   public static final class279 method950(byte arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         ++field1483;
         class517 var5 = class663.field9659[arg2][arg1][arg3];
         if (var5 == null) {
            return null;
         } else {
            class279 var6 = null;
            int var7 = -1;
            class772 var8 = var5.field7468;

            while(true) {
               class627 var10000;
               if (var8 == null) {
                  int var17 = 89 / ((17 - arg0) / 32);
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = var8.field11352;
               }

               class627 var9 = var10000;
               if (var9 instanceof class279) {
                  class279 var10 = (class279)var9;
                  int var11 = 252 + 256 * (-1 + var10.method972(-1));
                  int var12 = var10.field10694 - var11 >> 9;
                  int var13 = -var11 + var10.field10693 >> 9;
                  int var14 = var10.field10694 - -var11 >> 9;
                  int var15 = var10.field10693 - -var11 >> 9;
                  if (arg1 >= var12 && ~arg3 <= ~var13 && ~var14 <= ~arg1 && arg3 <= var15) {
                     int var16 = (-arg1 + 1 + var14) * (var15 + 1 + -arg3);
                     if (var7 < var16) {
                        var7 = var16;
                        var6 = var10;
                     }
                  }
               }

               var8 = var8.field11354;
            }
         }
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field1489[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Lhca;I)Lqa;"
   )
   public final class261 method951(class518 arg0, int arg1) {
      try {
         ++field1486;
         if (arg0 == null) {
            return null;
         } else {
            class127 var3 = arg0.method993((byte)-48);
            if (class9.field85 == var3) {
               return new class104((class611)arg0);
            } else if (class245.field3376 == var3) {
               return new class739(this.method948(arg1 + 11394), (class123)arg0);
            } else if (class509.field7411 == var3) {
               return new class257(this.field1481, (class730)arg0);
            } else if (class116.field1445 == var3) {
               return new class402(this.field1481, (class199)arg0);
            } else {
               if (arg1 != -11269) {
                  method949(-37);
               }

               if (class336.field4574 == var3) {
                  return new class12(this.field1481, this.field1487, (class273)arg0);
               } else if (class102.field1305 == var3) {
                  return new class366(this.field1481, this.field1487, (class229)arg0);
               } else if (class291.field4020 == var3) {
                  return new class610(this.field1481, this.field1487, (class626)arg0);
               } else if (class271.field3741 == var3) {
                  return new class596(this.field1481, this.field1487, (class790)arg0);
               } else if (class592.field8711 == var3) {
                  return new class445(this.field1481, (class538)arg0);
               } else {
                  return class345.field4670 == var3 ? new class692(this.field1481, this.field1487, (class655)arg0) : null;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1489[5] + (arg0 != null ? field1489[3] : field1489[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method952(int arg0) {
      try {
         field1488 = null;
         field1480 = null;
         if (arg0 == -13) {
            field1479 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1489[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Ljava/io/File;Z)[B"
   )
   public static final byte[] method953(File arg0, boolean arg1) {
      try {
         if (arg1) {
            method953((File)null, true);
         }

         ++field1477;
         return class270.method2076((int)arg0.length(), arg0, (byte)-89);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1489[1] + (arg0 != null ? field1489[3] : field1489[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(ZLjava/lang/String;I)V"
   )
   public static final void method954(boolean arg0, String arg1, int arg2) {
      try {
         ++field1485;
         class279.method2116(-21414, -1, arg1, arg2, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1489[6] + arg0 + ',' + (arg1 != null ? field1489[3] : field1489[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "<init>",
      descriptor = "(Lkf;Lkf;)V"
   )
   public class119(class266 arg0, class266 arg1) {
      try {
         this.field1487 = arg1;
         this.field1481 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1489[9] + (arg0 != null ? field1489[3] : field1489[2]) + ',' + (arg1 != null ? field1489[3] : field1489[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method955(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method956(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
