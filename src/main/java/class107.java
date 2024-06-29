import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class107 {
   @OriginalMember(
      owner = "client!iw",
      name = "q",
      descriptor = "Lom;"
   )
   private class722 field1675;
   @OriginalMember(
      owner = "client!iw",
      name = "v",
      descriptor = "I"
   )
   private int field1676;
   @OriginalMember(
      owner = "client!iw",
      name = "n",
      descriptor = "I"
   )
   private int field1659;
   @OriginalMember(
      owner = "client!iw",
      name = "u",
      descriptor = "Lbga;"
   )
   private class398 field1671;
   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1681 = new String[]{method1057(method1056("1d\u0015YU")), method1057(method1056("#=\u00152\u0000")), method1057(method1056("+-Xo")), method1057(method1056("6fWp")), method1057(method1056("1d\u0015QU")), method1057(method1056("1d\u0015]U")), method1057(method1056("1d\u0015^U")), method1057(method1056("1d\u0015TU")), method1057(method1056("1d\u0015SU")), method1057(method1056("1d\u0015ZU")), method1057(method1056("1d\u0015XU")), method1057(method1056("1d\u0015UU")), method1057(method1056("1d\u0015MU")), method1057(method1056("1d\u0015WU")), method1057(method1056("1d\u0015RU")), method1057(method1056("1d\u0015LU")), method1057(method1056("?}Ks\u000bi")), method1057(method1056("1d\u0015_U")), method1057(method1056("1d\u0015PU")), method1057(method1056("1d\u0015 \u00146zO\"U")), method1057(method1056("1d\u0015[U")), method1057(method1056("1d\u0015VU")), method1057(method1056("1d\u0015NU"))};
   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "I"
   )
   public static int field1660;
   @OriginalMember(
      owner = "client!iw",
      name = "m",
      descriptor = "I"
   )
   public static int field1661;
   @OriginalMember(
      owner = "client!iw",
      name = "h",
      descriptor = "I"
   )
   public static int field1662;
   @OriginalMember(
      owner = "client!iw",
      name = "o",
      descriptor = "I"
   )
   public static int field1663;
   @OriginalMember(
      owner = "client!iw",
      name = "k",
      descriptor = "I"
   )
   public static int field1664;
   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "I"
   )
   public static int field1665;
   @OriginalMember(
      owner = "client!iw",
      name = "j",
      descriptor = "I"
   )
   public static int field1666;
   @OriginalMember(
      owner = "client!iw",
      name = "t",
      descriptor = "I"
   )
   public static int field1667;
   @OriginalMember(
      owner = "client!iw",
      name = "i",
      descriptor = "I"
   )
   public static int field1668;
   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "I"
   )
   public static int field1669;
   @OriginalMember(
      owner = "client!iw",
      name = "r",
      descriptor = "I"
   )
   public static int field1670;
   @OriginalMember(
      owner = "client!iw",
      name = "g",
      descriptor = "I"
   )
   public static int field1672;
   @OriginalMember(
      owner = "client!iw",
      name = "p",
      descriptor = "I"
   )
   public static int field1673;
   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "I"
   )
   public static int field1677;
   @OriginalMember(
      owner = "client!iw",
      name = "l",
      descriptor = "I"
   )
   public static int field1678;
   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "I"
   )
   public static int field1679;
   @OriginalMember(
      owner = "client!iw",
      name = "s",
      descriptor = "I"
   )
   public static int field1680;
   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "Lpb;"
   )
   public static class142 field1674;

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ILjava/lang/Object;JI)V"
   )
   public final void method1038(int param1, Object param2, long param3, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method1039(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field1673;
         if (arg0 >= 44) {
            class408 var2 = class745.field10605.field3719;
            var2.method3190((byte)113);
            int var3 = var2.method3195(123, 8);
            if (~var3 > ~class261.field3995) {
               int var4 = var3;
               if (var1 || ~class261.field3995 < ~var3) {
                  do {
                     class197.field2865[class596.field8398++] = class344.field5068[var4];
                     ++var4;
                  } while(~class261.field3995 < ~var4);
               }
            }

            if (var3 > class261.field3995) {
               throw new RuntimeException(field1681[16]);
            } else {
               class261.field3995 = 0;
               int var5 = 0;
               if (var1 || var5 < var3) {
                  do {
                     label99: {
                        int var6 = class344.field5068[var5];
                        class799 var7 = ((class432)class573.field8110.method3101(-1, (long)var6)).field6345;
                        int var8 = var2.method3195(114, 1);
                        if (~var8 == -1) {
                           class344.field5068[class261.field3995++] = var6;
                           var7.field5841 = class365.field5400;
                           if (!var1) {
                              break label99;
                           }
                        }

                        int var9 = var2.method3195(124, 2);
                        if (~var9 == -1) {
                           class344.field5068[class261.field3995++] = var6;
                           var7.field5841 = class365.field5400;
                           class463.field6742[class190.field2788++] = var6;
                           if (!var1) {
                              break label99;
                           }
                        }

                        if (var9 == 1) {
                           class344.field5068[class261.field3995++] = var6;
                           var7.field5841 = class365.field5400;
                           int var10 = var2.method3195(121, 3);
                           var7.method5761(1, (byte)-8, var10);
                           int var11 = var2.method3195(118, 1);
                           if (~var11 != -2) {
                              break label99;
                           }

                           class463.field6742[class190.field2788++] = var6;
                           if (!var1) {
                              break label99;
                           }
                        }

                        if (var9 == 2) {
                           label71: {
                              class344.field5068[class261.field3995++] = var6;
                              var7.field5841 = class365.field5400;
                              if (var2.method3195(118, 1) != 1) {
                                 int var12 = var2.method3195(116, 3);
                                 var7.method5761(0, (byte)-94, var12);
                                 if (!var1) {
                                    break label71;
                                 }
                              }

                              int var13 = var2.method3195(125, 3);
                              var7.method5761(2, (byte)0, var13);
                              int var14 = var2.method3195(126, 3);
                              var7.method5761(2, (byte)120, var14);
                           }

                           int var15 = var2.method3195(124, 1);
                           if (~var15 != -2) {
                              break label99;
                           }

                           class463.field6742[class190.field2788++] = var6;
                           if (!var1) {
                              break label99;
                           }
                        }

                        if (~var9 == -4) {
                           class197.field2865[class596.field8398++] = var6;
                        }
                     }

                     ++var5;
                  } while(var5 < var3);

               }
            }
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field1681[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(Z)Ljava/lang/Object;"
   )
   public final Object method1040(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         if (arg0) {
            this.field1676 = 31;
         }

         ++field1668;
         class580 var3 = (class580)this.field1671.method3095((byte)-118);
         if (!var2 && var3 == null) {
            return null;
         } else {
            do {
               Object var4 = var3.method2068((byte)50);
               if (var4 != null) {
                  return var4;
               }

               class580 var5 = var3;
               var3 = (class580)this.field1671.method3095((byte)-118);
               var5.method2140((byte)98);
               var5.method962(false);
               this.field1659 += var5.field8167;
            } while(var3 != null);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1681[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(JI)Ljava/lang/Object;"
   )
   public final Object method1041(long arg0, int arg1) {
      try {
         ++field1662;
         class580 var4 = (class580)this.field1671.method3101(-1, arg0);
         if (var4 == null) {
            return null;
         } else {
            if (arg1 != 8) {
               field1674 = null;
            }

            Object var5 = var4.method2068((byte)50);
            if (var5 == null) {
               var4.method2140((byte)50);
               var4.method962(false);
               this.field1659 += var4.field8167;
               return null;
            } else {
               if (!var4.method2067((byte)122)) {
                  this.field1675.method5224(var4, 47);
                  var4.field1548 = 0L;
                  if (!client.field10022) {
                     return var5;
                  }
               }

               class233 var6 = new class233(var5, var4.field8167);
               this.field1671.method3098(var4.field3777, var6, -1);
               this.field1675.method5224(var6, arg1 + 81);
               var6.field1548 = 0L;
               var4.method2140((byte)-104);
               var4.method962(false);
               return var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1681[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class107(int arg0) {
      this(arg0, arg0);
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lqea;I)V"
   )
   private final void method1042(class580 arg0, int arg1) {
      try {
         if (arg1 >= 27) {
            if (arg0 != null) {
               arg0.method2140((byte)-80);
               arg0.method962(false);
               this.field1659 += arg0.field8167;
            }

            ++field1670;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1681[11] + (arg0 != null ? field1681[1] : field1681[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(JI)V"
   )
   private final void method1043(long arg0, int arg1) {
      try {
         if (arg1 != 100) {
            this.field1676 = 15;
         }

         ++field1666;
         class580 var4 = (class580)this.field1671.method3101(arg1 + -101, arg0);
         this.method1042(var4, arg1 + 11);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1681[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(II)Liba;"
   )
   public static final class766 method1044(int arg0, int arg1) {
      try {
         ++field1663;
         class766 var2 = (class766)class553.field7885.method1041((long)arg1, 8);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class255.field3871.method460((byte)-11, arg1, 0);
            class766 var4 = new class766();
            if (arg0 < 91) {
               field1674 = null;
            }

            if (var3 != null) {
               var4.method5517(arg1, 1, new class65(var3));
            }

            class553.field7885.method1050(-114, var4, (long)arg1);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1681[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1045(int arg0) {
      boolean var2 = client.field10022;

      RuntimeException var10000;
      label36: {
         boolean var10001;
         class580 var3;
         try {
            var3 = (class580)this.field1675.method5225(true);
            if (arg0 != 3) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label36;
         }

         while(true) {
            label31: {
               try {
                  if (var3 != null) {
                     if (var3.method2067((byte)119)) {
                        var3.method2140((byte)110);
                        var3.method962(false);
                        this.field1659 += var3.field8167;
                     }
                     break label31;
                  }

                  ++field1677;
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var2) {
                  return;
               }
            }

            try {
               var3 = (class580)this.field1675.method5227(-17856);
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class612.method4503(var4, field1681[5] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1046(byte arg0) {
      try {
         ++field1679;
         if (arg0 <= 95) {
            this.field1659 = -34;
         }

         return this.field1676;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1681[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method1047(byte arg0, int arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field1672;
         if (arg0 != 1) {
            return 13;
         } else {
            int var4 = 0;
            if (var3) {
               var4 = var4 << 1 | 1 & arg1;
               arg1 >>>= 1;
               --arg2;
            }

            while(true) {
               while(arg2 > 0) {
                  var4 = var4 << 1 | 1 & arg1;
                  arg1 >>>= 1;
                  --arg2;
               }

               if (!var3) {
                  return var4;
               }

               arg1 = var4;
               --arg2;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1681[22] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1048(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 != -8543) {
            this.field1675 = null;
         }

         if (class197.field2863 != null) {
            class580 var4 = (class580)this.field1675.method5225(true);
            if (var3 || var4 != null) {
               do {
                  label39: {
                     if (var4.method2067((byte)127)) {
                        if (var4.method2068((byte)50) != null) {
                           break label39;
                        }

                        var4.method2140((byte)93);
                        var4.method962(false);
                        this.field1659 += var4.field8167;
                        if (!var3) {
                           break label39;
                        }
                     }

                     if (~((long)arg0) > ~(++var4.field1548)) {
                        class580 var5 = class197.field2863.method2324(-23659, var4);
                        this.field1671.method3098(var4.field3777, var5, arg1 + 8542);
                        class141.method1412(false, var4, var5);
                        var4.method2140((byte)91);
                        var4.method962(false);
                     }
                  }

                  var4 = (class580)this.field1675.method5227(-17856);
               } while(var4 != null);
            }
         }

         ++field1678;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1681[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method1049(int arg0) {
      try {
         ++field1661;
         if (arg0 != 1) {
            this.method1045(37);
         }

         return this.field1659;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1681[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ILjava/lang/Object;J)V"
   )
   public final void method1050(int arg0, Object arg1, long arg2) {
      try {
         if (arg0 >= -61) {
            this.field1675 = null;
         }

         this.method1038(-31278, arg1, arg2, 1);
         ++field1667;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1681[17] + arg0 + ',' + (arg1 != null ? field1681[1] : field1681[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1051(int arg0) {
      try {
         field1674 = null;
         int var1 = -82 % ((85 - arg0) / 32);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1681[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1052(boolean arg0) {
      try {
         if (arg0) {
            this.field1675.method5222((byte)-63);
            ++field1660;
            this.field1671.method3096(-127);
            this.field1659 = this.field1676;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1681[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Loga;IIIIII)Z"
   )
   public static final boolean method1053(class358 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         ++field1664;
         if (class66.field971 && class174.field2594) {
            if (class526.field7443 < 100) {
               return false;
            } else if (~arg4 == ~arg5 && ~arg1 == ~arg3) {
               if (!class767.method5521(arg4, (byte)-78, arg6, arg3)) {
                  return false;
               } else if (class286.method2381(arg2 + 97, arg0)) {
                  ++class40.field622;
                  return true;
               } else {
                  return false;
               }
            } else {
               int var8 = arg4;
               int var10000;
               int var9;
               if (var7) {
                  var9 = arg3;
                  if (var7) {
                     if (class411.field6030[arg6][arg4][arg3] == -class451.field6580) {
                        return false;
                     }

                     var9 = arg3 + 1;
                  }
               } else {
                  if (arg5 < arg4) {
                     var10000 = arg2;
                     if (!var7) {
                        if (arg2 != 2) {
                           method1039(-45);
                        }

                        if (!class286.method2381(97, arg0)) {
                           return false;
                        }

                        ++class40.field622;
                        return true;
                     }
                  } else {
                     var10000 = arg3;
                  }

                  var9 = var10000;
                  if (var7) {
                     if (class411.field6030[arg6][arg4][var9] == -class451.field6580) {
                        return false;
                     }

                     ++var9;
                  }
               }

               while(true) {
                  while(~var9 >= ~arg1) {
                     if (class411.field6030[arg6][var8][var9] == -class451.field6580) {
                        return false;
                     }

                     ++var9;
                  }

                  if (!var7) {
                     ++var8;
                     if (arg5 < var8) {
                        var10000 = arg2;
                        if (!var7) {
                           if (arg2 != 2) {
                              method1039(-45);
                           }

                           if (!class286.method2381(97, arg0)) {
                              return false;
                           }

                           ++class40.field622;
                           return true;
                        }
                     } else {
                        var10000 = arg3;
                     }

                     var9 = var10000;
                     if (var7) {
                        if (class411.field6030[arg6][var8][var9] == -class451.field6580) {
                           return false;
                        }

                        ++var9;
                     }
                  } else {
                     ++var9;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field1681[7] + (arg0 != null ? field1681[1] : field1681[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1054(int arg0) {
      boolean var2 = client.field10022;

      try {
         int var3 = 52 % ((arg0 - 44) / 40);
         ++field1680;
         int var4 = 0;
         class580 var5 = (class580)this.field1675.method5225(true);
         if (var2) {
            if (!var5.method2067((byte)123)) {
               ++var4;
            }

            var5 = (class580)this.field1675.method5227(-17856);
         }

         while(true) {
            int var10000;
            if (var5 == null) {
               var10000 = var4;
               if (!var2) {
                  return var4;
               }
            } else {
               var10000 = var5.method2067((byte)123);
            }

            if (var10000 == 0) {
               ++var4;
            }

            var5 = (class580)this.field1675.method5227(-17856);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1681[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class107(int arg0, int arg1) {
      this.field1675 = new class722();

      try {
         this.field1676 = arg0;
         this.field1659 = arg0;

         int var3;
         for(var3 = 1; arg0 > var3 + var3 && arg1 > var3; var3 += var3) {
         }

         this.field1671 = new class398(var3);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1681[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method1055(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (arg0 != 18814) {
            return null;
         } else {
            ++field1669;
            class580 var3 = (class580)this.field1671.method3102(-79);
            if (!var2 && var3 == null) {
               return null;
            } else {
               do {
                  Object var4 = var3.method2068((byte)50);
                  if (var4 != null) {
                     return var4;
                  }

                  class580 var5 = var3;
                  var3 = (class580)this.field1671.method3095((byte)-118);
                  var5.method2140((byte)122);
                  var5.method962(false);
                  this.field1659 += var5.field8167;
               } while(var3 != null);

               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1681[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1056(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1057(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
