import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 extends class604 {
   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field449 = new String[]{method288(method287("n^r! ")), method288(method287("n^r% ")), method288(method287("bN0\b")), method288(method287("w\u0015rJu")), method288(method287("n^r& ")), method288(method287("n^r  ")), method288(method287("n^r' "))};
   @OriginalMember(
      owner = "client!be",
      name = "r",
      descriptor = "I"
   )
   public static int field438;
   @OriginalMember(
      owner = "client!be",
      name = "n",
      descriptor = "I"
   )
   public int field439;
   @OriginalMember(
      owner = "client!be",
      name = "l",
      descriptor = "I"
   )
   public int field440;
   @OriginalMember(
      owner = "client!be",
      name = "s",
      descriptor = "I"
   )
   public int field443;
   @OriginalMember(
      owner = "client!be",
      name = "m",
      descriptor = "I"
   )
   public static int field444;
   @OriginalMember(
      owner = "client!be",
      name = "k",
      descriptor = "I"
   )
   public static int field446;
   @OriginalMember(
      owner = "client!be",
      name = "o",
      descriptor = "I"
   )
   public int field447;
   @OriginalMember(
      owner = "client!be",
      name = "t",
      descriptor = "I"
   )
   public static int field448;
   @OriginalMember(
      owner = "client!be",
      name = "j",
      descriptor = "J"
   )
   public static long field442;
   @OriginalMember(
      owner = "client!be",
      name = "q",
      descriptor = "Lqb;"
   )
   public static class234 field441;
   @OriginalMember(
      owner = "client!be",
      name = "p",
      descriptor = "Lln;"
   )
   public class397 field437;
   @OriginalMember(
      owner = "client!be",
      name = "i",
      descriptor = "[Lat;"
   )
   public static class396[] field445;

   @OriginalMember(
      owner = "client!be",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public static void method282(int arg0) {
      try {
         field441 = null;
         field445 = null;
         if (arg0 >= -17) {
            method282(-25);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field449[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(Ljj;B)Lwg;",
      line = 16
   )
   public static final class448 method283(class128 arg0, byte arg1) {
      try {
         if (arg1 != -13) {
            return null;
         } else {
            ++field446;
            int var2 = arg0.method1038((byte)-123);
            return new class448(var2);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field449[6] + (arg0 != null ? field449[3] : field449[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(I)V",
      line = 31
   )
   public static final void method284(int arg0) {
      try {
         class688.field10366 = 0;
         class408.field6224 = 0;
         class717.field10661 = 0;
         class122.field1488 = 0;
         int var1 = 40 % ((arg0 - -45) / 46);
         ++field448;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field449[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "b",
      descriptor = "(I)Z",
      line = 41
   )
   public static final boolean method285(int arg0) {
      int var1 = client.field4530;

      try {
         ++field438;

         try {
            if (class627.field9106 == 2) {
               if (class205.field2633 == null) {
                  class205.field2633 = class90.method823(class67.field837, class560.field8372, class668.field10055);
                  if (class205.field2633 == null) {
                     return false;
                  }
               }

               if (class208.field2654 == null) {
                  class208.field2654 = new class374(class100.field1225, class386.field5904);
               }

               class55 var2 = class663.field9609;
               if (class660.field9563 != null) {
                  var2 = class660.field9563;
               }

               if (var2.method450(class205.field2633, true, 22050, class48.field577, class208.field2654)) {
                  class663.field9609 = var2;
                  class663.field9609.method438((byte)-116);
                  class55 var10000;
                  int var3;
                  if (class552.field8185 > 0) {
                     class627.field9106 = 3;
                     class663.field9609.method436(~class9.field136 > ~class552.field8185 ? class9.field136 : class552.field8185, -66);
                     var3 = 0;
                     if (var1 != 0) {
                        class663.field9609.method463(-120, var3, class185.field2310[var3]);
                        class185.field2310[var3] = 255;
                        ++var3;
                     }

                     while(true) {
                        while(class185.field2310.length > var3) {
                           class663.field9609.method463(-120, var3, class185.field2310[var3]);
                           class185.field2310[var3] = 255;
                           ++var3;
                        }

                        if (var1 == 0) {
                           if (var1 != 0) {
                              class627.field9106 = 0;
                              class663.field9609.method436(class9.field136, arg0 ^ 31209);
                              var3 = 0;
                              if (var1 != 0) {
                                 class663.field9609.method463(-67, var3, class185.field2310[var3]);
                                 class185.field2310[var3] = 255;
                                 ++var3;
                              }
                           } else {
                              var10000 = class660.field9563;
                              if (var1 == 0) {
                                 if (var10000 == null) {
                                    label169: {
                                       if (~class547.field8118 < -1L) {
                                          class663.field9609.method441(87, class205.field2633, class547.field8118, true, class660.field9569);
                                          if (var1 == 0) {
                                             break label169;
                                          }
                                       }

                                       class663.field9609.method432(class660.field9569, class205.field2633, -60);
                                    }
                                 }

                                 if (class69.field872 != null) {
                                    class69.field872.method1663(-114, class663.field9609);
                                 }

                                 class67.field837 = null;
                                 class660.field9563 = null;
                                 class208.field2654 = null;
                                 class205.field2633 = null;
                                 class547.field8118 = 0L;
                                 return true;
                              }

                              var10000.method463(-67, var3, class185.field2310[var3]);
                              class185.field2310[var3] = 255;
                              ++var3;
                           }
                           break;
                        }

                        ++var3;
                     }
                  } else {
                     class627.field9106 = 0;
                     class663.field9609.method436(class9.field136, arg0 ^ 31209);
                     var3 = 0;
                     if (var1 != 0) {
                        class663.field9609.method463(-67, var3, class185.field2310[var3]);
                        class185.field2310[var3] = 255;
                        ++var3;
                     }
                  }

                  while(true) {
                     while(~var3 > ~class185.field2310.length) {
                        class663.field9609.method463(-67, var3, class185.field2310[var3]);
                        class185.field2310[var3] = 255;
                        ++var3;
                     }

                     var10000 = class660.field9563;
                     if (var1 == 0) {
                        if (var10000 == null) {
                           label170: {
                              if (~class547.field8118 < -1L) {
                                 class663.field9609.method441(87, class205.field2633, class547.field8118, true, class660.field9569);
                                 if (var1 == 0) {
                                    break label170;
                                 }
                              }

                              class663.field9609.method432(class660.field9569, class205.field2633, -60);
                           }
                        }

                        if (class69.field872 != null) {
                           class69.field872.method1663(-114, class663.field9609);
                        }

                        class67.field837 = null;
                        class660.field9563 = null;
                        class208.field2654 = null;
                        class205.field2633 = null;
                        class547.field8118 = 0L;
                        return true;
                     }

                     var10000.method463(-67, var3, class185.field2310[var3]);
                     class185.field2310[var3] = 255;
                     ++var3;
                  }
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class663.field9609.method437(arg0 ^ 31164);
            class660.field9563 = null;
            class205.field2633 = null;
            class627.field9106 = 0;
            class208.field2654 = null;
            class67.field837 = null;
         }

         return arg0 != -31165;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field449[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(IIIILsp;I)V",
      line = 141
   )
   public static final void method286(int arg0, int arg1, int arg2, int arg3, class661 arg4, int arg5) {
      try {
         ++field444;
         if (arg2 >= ~arg3 && ~arg1 <= -2 && arg3 <= class323.field4603 + -2 && class178.field2197 - 2 >= arg1) {
            if (class353.field5360 == null) {
               return;
            }

            class86 var6 = class221.field2832.method1257(-2, arg1, arg5, arg3, arg0);
            if (var6 != null) {
               if (!(var6 instanceof class451)) {
                  if (var6 instanceof class74) {
                     ((class74)var6).method727(arg4, arg2 ^ -11130);
                     return;
                  }

                  if (var6 instanceof class365) {
                     ((class365)var6).method2832(arg4, 0);
                     return;
                  }

                  if (var6 instanceof class718) {
                     ((class718)var6).method5189((byte)-81, arg4);
                     return;
                  }
               } else {
                  ((class451)var6).method3400(true, arg4);
               }

               return;
            }
         }

      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field449[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field449[3] : field449[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method287(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method288(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
