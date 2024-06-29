import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class584 extends class299 {
   @OriginalMember(
      owner = "client!nda",
      name = "H",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field8653;
   @OriginalMember(
      owner = "client!nda",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8654 = new String[]{method4264(method4263("&lR)\u0000`")), method4264(method4263("&lR)\u0002`")), method4264(method4263("&lR)\u0003`")), method4264(method4263("&lR)\u0007`")), method4264(method4263("&}_k")), method4264(method4263("3&\u001d)8")), method4264(method4263("&lR)y!fZs{`")), method4264(method4263("&lR)\u0001`")), method4264(method4263("&lR)\u0004`")), method4264(method4263("&lR)\u0006`"))};
   @OriginalMember(
      owner = "client!nda",
      name = "L",
      descriptor = "Leg;"
   )
   public static class118 field8644 = new class118(46, 1);
   @OriginalMember(
      owner = "client!nda",
      name = "M",
      descriptor = "I"
   )
   public static int field8652 = 0;
   @OriginalMember(
      owner = "client!nda",
      name = "I",
      descriptor = "I"
   )
   public static int field8645;
   @OriginalMember(
      owner = "client!nda",
      name = "F",
      descriptor = "I"
   )
   public static int field8646;
   @OriginalMember(
      owner = "client!nda",
      name = "D",
      descriptor = "I"
   )
   public static int field8647;
   @OriginalMember(
      owner = "client!nda",
      name = "J",
      descriptor = "I"
   )
   public static int field8648;
   @OriginalMember(
      owner = "client!nda",
      name = "G",
      descriptor = "I"
   )
   public static int field8649;
   @OriginalMember(
      owner = "client!nda",
      name = "E",
      descriptor = "I"
   )
   public static int field8650;
   @OriginalMember(
      owner = "client!nda",
      name = "K",
      descriptor = "I"
   )
   public static int field8651;

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "([I[IBLrv;[I)V"
   )
   public static final void method4258(int[] arg0, int[] arg1, byte arg2, class121 arg3, int[] arg4) {
      boolean var5 = client.field4360;

      try {
         if (arg2 <= -47) {
            int var6 = 0;
            int var10000;
            if (var5) {
               var10000 = arg0[var6];
            } else if (~arg0.length >= ~var6) {
               var10000 = field8645 + 1;
               if (!var5) {
                  field8645 = var10000;
                  return;
               }
            } else {
               var10000 = arg0[var6];
            }

            while(true) {
               int var10001;
               label166:
               while(true) {
                  label164: {
                     int var7 = var10000;
                     int var8 = arg4[var6];
                     int var9 = arg1[var6];
                     int var10 = 0;
                     if (!var5) {
                        if (var8 == 0) {
                           ++var6;
                           break label164;
                        }

                        var10000 = arg3.field3809.length;
                        var10001 = var10;
                        if (var5) {
                           break;
                        }

                        if (var10000 <= var10) {
                           ++var6;
                           break label164;
                        }
                     }

                     while(true) {
                        if ((1 & var8) != 0) {
                           if (~var7 != 0) {
                              class85 var11 = class190.field2702.method4411(var7, 96);
                              int var12 = var11.field1106;
                              class100 var13 = arg3.field3809[var10];
                              if (var13 != null) {
                                 if (~var13.field1280 == ~var7) {
                                    if (var12 == 0) {
                                       var13 = arg3.field3809[var10] = null;
                                    } else {
                                       label139: {
                                          if (var12 != 1) {
                                             if (var12 != 2) {
                                                break label139;
                                             }

                                             var13.field1277 = 0;
                                             if (!var5) {
                                                break label139;
                                             }
                                          }

                                          var13.field1278 = 0;
                                          var13.field1281 = 1;
                                          var13.field1287 = 0;
                                          var13.field1282 = var9;
                                          var13.field1277 = 0;
                                          if (!arg3.field3801) {
                                             class478.method3485(0, var11, 734475305, arg3);
                                             if (var5 && var11.field1107 >= class190.field2702.method4411(var13.field1280, 122).field1107) {
                                                var13 = arg3.field3809[var10] = null;
                                             }
                                          }
                                       }
                                    }
                                 } else if (var11.field1107 >= class190.field2702.method4411(var13.field1280, 122).field1107) {
                                    var13 = arg3.field3809[var10] = null;
                                 }
                              }

                              if (var13 == null) {
                                 class100 var14 = arg3.field3809[var10] = new class100();
                                 var14.field1280 = var7;
                                 var14.field1277 = 0;
                                 var14.field1287 = 0;
                                 var14.field1282 = var9;
                                 var14.field1278 = 0;
                                 var14.field1281 = 1;
                                 if (!arg3.field3801) {
                                    class478.method3485(0, var11, 734475305, arg3);
                                    if (var5) {
                                       arg3.field3809[var10] = null;
                                    }
                                 }
                              }

                              ++var10;
                              var8 >>>= 1;
                           } else {
                              arg3.field3809[var10] = null;
                              ++var10;
                              var8 >>>= 1;
                           }
                        } else {
                           ++var10;
                           var8 >>>= 1;
                        }

                        if (var8 == 0) {
                           ++var6;
                           break;
                        }

                        var10000 = arg3.field3809.length;
                        var10001 = var10;
                        if (var5) {
                           break label166;
                        }

                        if (var10000 <= var10) {
                           ++var6;
                           break;
                        }
                     }
                  }

                  if (~arg0.length >= ~var6) {
                     var10000 = field8645 + 1;
                     if (!var5) {
                        field8645 = var10000;
                        return;
                     }
                  } else {
                     var10000 = arg0[var6];
                  }
               }

               if (var10000 >= var10001) {
                  var10000 = field8645 + 1;
                  if (!var5) {
                     field8645 = var10000;
                     return;
                  }
               } else {
                  var10000 = arg0[var6];
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field8654[7] + (arg0 != null ? field8654[5] : field8654[4]) + ',' + (arg1 != null ? field8654[5] : field8654[4]) + ',' + arg2 + ',' + (arg3 != null ? field8654[5] : field8654[4]) + ',' + (arg4 != null ? field8654[5] : field8654[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method4259(byte arg0, int arg1) {
      try {
         class648.field9463 = arg1;
         class282.field3915 = -1;
         class57.field705 = 0;
         class4.field38 = 1;
         ++field8650;
         if (arg0 != -116) {
            field8644 = null;
         }

         class397.field5738 = -1;
         class80.field1029 = null;
         class265.field3656 = false;
         class672.field9747 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8654[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;"
   )
   public static final String method4260(String[] arg0, int arg1, int arg2, byte arg3) {
      boolean var4 = client.field4360;

      try {
         ++field8646;
         if (~arg1 == -1) {
            return "";
         } else if (arg1 == 1) {
            String var5 = arg0[arg2];
            return var5 == null ? field8654[4] : var5.toString();
         } else {
            int var6 = arg1 + arg2;
            int var7 = 0;
            int var8 = arg2;
            if (var4 || arg2 < var6) {
               do {
                  String var9 = arg0[var8];
                  if (var9 == null) {
                     var7 += 4;
                     if (!var4) {
                        ++var8;
                        continue;
                     }
                  }

                  var7 += var9.length();
                  ++var8;
               } while(var8 < var6);
            }

            StringBuffer var10 = new StringBuffer(var7);
            int var11 = arg2;
            String var12;
            if (var4) {
               var12 = arg0[arg2];
               if (var12 == null) {
                  var10.append(field8654[4]);
                  if (var4) {
                     var10.append(var12);
                     var11 = arg2 + 1;
                  } else {
                     var11 = arg2 + 1;
                  }
               } else {
                  var10.append(var12);
                  var11 = arg2 + 1;
               }
            }

            while(true) {
               String var10000;
               if (~var11 <= ~var6) {
                  int var13 = 67 % ((45 - arg3) / 47);
                  var10000 = var10.toString();
                  if (!var4) {
                     return var10000;
                  }
               } else {
                  var10000 = arg0[var11];
               }

               var12 = var10000;
               if (var12 == null) {
                  var10.append(field8654[4]);
                  if (var4) {
                     var10.append(var12);
                     ++var11;
                  } else {
                     ++var11;
                  }
               } else {
                  var10.append(var12);
                  ++var11;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field8654[9] + (arg0 != null ? field8654[5] : field8654[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method2235(int arg0) {
      try {
         ++field8648;
         if (arg0 != 100) {
            this.field8653 = null;
         }

         return this.field8653;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8654[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class584(Object arg0, int arg1) {
      super(arg1);

      try {
         this.field8653 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8654[6] + (arg0 != null ? field8654[5] : field8654[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4261(boolean arg0) {
      try {
         field8644 = null;
         if (arg0) {
            field8644 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8654[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method2234(byte arg0) {
      try {
         if (arg0 <= 58) {
            return true;
         } else {
            ++field8649;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8654[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method4262(byte arg0) {
      try {
         ++field8647;
         if (!class11.field123) {
            class11.field123 = true;
            class444.field6311 = true;
            int var1 = 118 / ((arg0 - 18) / 38);
            class718.field10477 += (-class718.field10477 + 24.0F) / 2.0F;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8654[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4263(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4264(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
