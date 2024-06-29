import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class399 extends class22 {
   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5878 = new String[]{method3078(method3077("z\u0007\u0007R#6")), method3078(method3077("n\u0007")), method3078(method3077("p\u0016\n\u0010")), method3078(method3077("eMHR\u001c")), method3078(method3077("z\u0007\u0007R 6")), method3078(method3077("z\u0007\u0007R\"6"))};
   @OriginalMember(
      owner = "client!dda",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field5863 = false;
   @OriginalMember(
      owner = "client!dda",
      name = "s",
      descriptor = "Lgh;"
   )
   public static class572 field5874 = new class572(44, -2);
   @OriginalMember(
      owner = "client!dda",
      name = "m",
      descriptor = "[[I"
   )
   public static int[][] field5875 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!dda",
      name = "r",
      descriptor = "I"
   )
   public int field5864;
   @OriginalMember(
      owner = "client!dda",
      name = "o",
      descriptor = "I"
   )
   public static int field5866;
   @OriginalMember(
      owner = "client!dda",
      name = "j",
      descriptor = "I"
   )
   public static int field5867;
   @OriginalMember(
      owner = "client!dda",
      name = "n",
      descriptor = "I"
   )
   public int field5868;
   @OriginalMember(
      owner = "client!dda",
      name = "u",
      descriptor = "I"
   )
   public static int field5872;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!dda",
      name = "q",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5877;
   @OriginalMember(
      owner = "client!dda",
      name = "v",
      descriptor = "[I"
   )
   public int[] field5869;
   @OriginalMember(
      owner = "client!dda",
      name = "k",
      descriptor = "[I"
   )
   public int[] field5870;
   @OriginalMember(
      owner = "client!dda",
      name = "x",
      descriptor = "[I"
   )
   public int[] field5876;
   @OriginalMember(
      owner = "client!dda",
      name = "w",
      descriptor = "[Leca;"
   )
   public class789[] field5865;
   @OriginalMember(
      owner = "client!dda",
      name = "t",
      descriptor = "[Leca;"
   )
   public class789[] field5873;
   @OriginalMember(
      owner = "client!dda",
      name = "p",
      descriptor = "[[[B"
   )
   public byte[][][] field5871;

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3073(int arg0) {
      try {
         if (arg0 < -33) {
            field5875 = null;
            field5874 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5878[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method3074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field5872;
         if (arg4 >= 69) {
            if (arg3 >= 0 && arg0 >= 0 && arg3 < class209.field3112 + -1 && class1.field3 + -1 > arg0) {
               if (class90.field1473 != null) {
                  if (~arg1 == -1) {
                     class268 var8 = (class268)class245.method1990(arg7, arg3, arg0);
                     class268 var9 = (class268)class144.method1361(arg7, arg3, arg0);
                     if (var8 != null && ~arg2 != -3) {
                        label137: {
                           if (!(var8 instanceof class270)) {
                              class690.method5021(arg1, arg5, arg0, -19897, arg3, arg7, arg2, arg6, var8.method591((byte)-74));
                              if (!client.field4564) {
                                 break label137;
                              }
                           }

                           ((class270)var8).field3812.method4547(arg6, 107);
                        }
                     }

                     if (var9 != null) {
                        if (!(var9 instanceof class270)) {
                           class690.method5021(arg1, arg5, arg0, -19897, arg3, arg7, arg2, arg6, var9.method591((byte)-81));
                           return;
                        }

                        ((class270)var9).field3812.method4547(arg6, -106);
                        return;
                     }
                  } else if (~arg1 == -2) {
                     class268 var10 = (class268)class615.method4514(arg7, arg3, arg0);
                     if (var10 != null) {
                        if (!(var10 instanceof class566)) {
                           int var11 = var10.method591((byte)-45);
                           if (~arg2 != -5 && arg2 != 5) {
                              if (arg2 != 6) {
                                 if (~arg2 == -8) {
                                    class690.method5021(arg1, (arg5 + 2 & 3) + 4, arg0, -19897, arg3, arg7, 4, arg6, var11);
                                    return;
                                 }

                                 if (arg2 == 8) {
                                    class690.method5021(arg1, arg5 - -4, arg0, -19897, arg3, arg7, 4, arg6, var11);
                                    class690.method5021(arg1, (arg5 + 2 & 3) + 4, arg0, -19897, arg3, arg7, 4, arg6, var11);
                                    return;
                                 }
                              } else {
                                 class690.method5021(arg1, arg5 - -4, arg0, -19897, arg3, arg7, 4, arg6, var11);
                              }

                              return;
                           }

                           class690.method5021(arg1, arg5, arg0, -19897, arg3, arg7, 4, arg6, var11);
                           return;
                        }

                        ((class566)var10).field8216.method4547(arg6, 57);
                        return;
                     }
                  } else if (arg1 == 2) {
                     class268 var12 = (class268)class740.method5337(arg7, arg3, arg0, field5877 != null ? field5877 : (field5877 = method3076(field5878[1])));
                     if (var12 != null) {
                        if (arg2 == 11) {
                           arg2 = 10;
                        }

                        if (!(var12 instanceof class48)) {
                           class690.method5021(arg1, arg5, arg0, -19897, arg3, arg7, arg2, arg6, var12.method591((byte)-32));
                           return;
                        }

                        ((class48)var12).field1020.method4547(arg6, -122);
                        return;
                     }
                  } else {
                     if (~arg1 != -4) {
                        return;
                     }

                     class268 var13 = (class268)class439.method3309(arg7, arg3, arg0);
                     if (var13 == null) {
                        return;
                     }

                     if (!(var13 instanceof class397)) {
                        class690.method5021(arg1, arg5, arg0, -19897, arg3, arg7, arg2, arg6, var13.method591((byte)-113));
                        return;
                     }

                     ((class397)var13).field5841.method4547(arg6, -127);
                  }

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field5878[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "([II[ILaf;[I)V"
   )
   public static final void method3075(int[] arg0, int arg1, int[] arg2, class457 arg3, int[] arg4) {
      boolean var5 = client.field4564;

      try {
         if (arg1 != 1) {
            field5863 = true;
         }

         int var6 = 0;
         int var10000;
         if (var5) {
            var10000 = arg4[var6];
         } else if (var6 >= arg4.length) {
            var10000 = field5867 + 1;
            if (!var5) {
               field5867 = var10000;
               return;
            }
         } else {
            var10000 = arg4[var6];
         }

         while(true) {
            int var10001;
            label175:
            while(true) {
               label173: {
                  int var7 = var10000;
                  int var8 = arg0[var6];
                  int var9 = arg2[var6];
                  int var10 = 0;
                  if (!var5) {
                     if (~var8 == -1) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break label173;
                     }

                     var10000 = arg3.field11240.length;
                     var10001 = var10;
                     if (var5) {
                        break;
                     }

                     if (var10000 <= var10) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break label173;
                     }
                  }

                  while(true) {
                     if ((1 & var8) != 0) {
                        if (~var7 != 0) {
                           class295 var11 = class588.field8496.method3781(5, var7);
                           int var12 = var11.field4114;
                           class716 var13 = arg3.field11240[var10];
                           if (var13 != null) {
                              if (var13.field10358 == var7) {
                                 if (~var12 == -1) {
                                    var13 = arg3.field11240[var10] = null;
                                 } else {
                                    label142: {
                                       if (var12 != 1) {
                                          if (var12 != 2) {
                                             break label142;
                                          }

                                          var13.field10361 = 0;
                                          if (!var5) {
                                             break label142;
                                          }
                                       }

                                       var13.field10360 = 0;
                                       var13.field10361 = 0;
                                       var13.field10363 = 1;
                                       var13.field10359 = 0;
                                       var13.field10362 = var9;
                                       if (!arg3.field11222) {
                                          class720.method5205(0, arg3, 0, var11);
                                          if (var5 && ~var11.field4108 <= ~class588.field8496.method3781(arg1 ^ 4, var13.field10358).field4108) {
                                             var13 = arg3.field11240[var10] = null;
                                          }
                                       }
                                    }
                                 }
                              } else if (~var11.field4108 <= ~class588.field8496.method3781(arg1 ^ 4, var13.field10358).field4108) {
                                 var13 = arg3.field11240[var10] = null;
                              }
                           }

                           if (var13 == null) {
                              class716 var14 = arg3.field11240[var10] = new class716();
                              var14.field10362 = var9;
                              var14.field10363 = 1;
                              var14.field10360 = 0;
                              var14.field10359 = 0;
                              var14.field10358 = var7;
                              var14.field10361 = 0;
                              if (!arg3.field11222) {
                                 class720.method5205(0, arg3, 0, var11);
                                 if (var5) {
                                    arg3.field11240[var10] = null;
                                 }
                              }
                           }

                           var8 >>>= 1;
                           ++var10;
                        } else {
                           arg3.field11240[var10] = null;
                           var8 >>>= 1;
                           ++var10;
                        }
                     } else {
                        var8 >>>= 1;
                        ++var10;
                     }

                     if (~var8 == -1) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break;
                     }

                     var10000 = arg3.field11240.length;
                     var10001 = var10;
                     if (var5) {
                        break label175;
                     }

                     if (var10000 <= var10) {
                        ++var6;
                        var10000 = var6;
                        var10001 = arg4.length;
                        break;
                     }
                  }
               }

               if (var10000 >= var10001) {
                  var10000 = field5867 + 1;
                  if (!var5) {
                     field5867 = var10000;
                     return;
                  }
               } else {
                  var10000 = arg4[var6];
               }
            }

            if (var10000 >= var10001) {
               var10000 = field5867 + 1;
               if (!var5) {
                  field5867 = var10000;
                  return;
               }
            } else {
               var10000 = arg4[var6];
            }
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field5878[4] + (arg0 != null ? field5878[3] : field5878[2]) + ',' + arg1 + ',' + (arg2 != null ? field5878[3] : field5878[2]) + ',' + (arg3 != null ? field5878[3] : field5878[2]) + ',' + (arg4 != null ? field5878[3] : field5878[2]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3076(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3077(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3078(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
