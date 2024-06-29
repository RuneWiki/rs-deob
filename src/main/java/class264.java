import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class264 {
   @OriginalMember(
      owner = "client!kf",
      name = "f",
      descriptor = "Ldw;"
   )
   private class748 field3611 = new class748(64);
   @OriginalMember(
      owner = "client!kf",
      name = "l",
      descriptor = "Leaa;"
   )
   public class526 field3617;
   @OriginalMember(
      owner = "client!kf",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field3605;
   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3618 = new String[]{method2010(method2009("A[Qvy")), method2010(method2009("A[Qsy")), method2010(method2009("DH\u0013Y")), method2010(method2009("A[Qqy")), method2010(method2009("Q\u0013Q\u001b,")), method2010(method2009("A[Q}y")), method2010(method2009("A[Qwy")), method2010(method2009("A[Qpy")), method2010(method2009("A[Qry")), method2010(method2009("A[Qty")), method2010(method2009("A[Q\t8DT\u000b\u000by"))};
   @OriginalMember(
      owner = "client!kf",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field3608 = true;
   @OriginalMember(
      owner = "client!kf",
      name = "o",
      descriptor = "Lwia;"
   )
   public static class791 field3613 = new class791(8);
   @OriginalMember(
      owner = "client!kf",
      name = "m",
      descriptor = "Lnda;"
   )
   public static class583 field3616 = new class583();
   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "I"
   )
   public static int field3603;
   @OriginalMember(
      owner = "client!kf",
      name = "d",
      descriptor = "I"
   )
   public static int field3604;
   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "I"
   )
   public static int field3606;
   @OriginalMember(
      owner = "client!kf",
      name = "i",
      descriptor = "I"
   )
   public static int field3607;
   @OriginalMember(
      owner = "client!kf",
      name = "h",
      descriptor = "I"
   )
   public static int field3609;
   @OriginalMember(
      owner = "client!kf",
      name = "j",
      descriptor = "I"
   )
   public static int field3612;
   @OriginalMember(
      owner = "client!kf",
      name = "n",
      descriptor = "I"
   )
   public static int field3614;
   @OriginalMember(
      owner = "client!kf",
      name = "c",
      descriptor = "I"
   )
   public static int field3615;
   @OriginalMember(
      owner = "client!kf",
      name = "e",
      descriptor = "Lvk;"
   )
   public static class386 field3610;

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(Lmga;IZII)V",
      line = 4
   )
   public static final void method2001(class738 arg0, int arg1, boolean arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field3614;
         long var6 = (long)(arg1 | arg3 << 14 | arg4 << 28);
         class167 var8 = (class167)class561.field8393.method5681(var6, -1);
         if (var8 == null) {
            class167 var9 = new class167();
            class561.field8393.method5682(var6, var9, (byte)7);
            var9.field2084.method4060(23, arg0);
         } else {
            class91 var10 = class54.field616.method1689(arg0.field10955, (byte)127);
            int var11 = var10.field1137;
            if (var10.field1150 == 1) {
               var11 = (arg0.field10954 - -1) * var11;
            }

            class738 var12 = (class738)var8.field2084.method4071((byte)127);
            int var13;
            if (var5 != 0) {
               var10 = class54.field616.method1689(var12.field10955, (byte)-48);
               var13 = var10.field1137;
               if (var10.field1150 == 1) {
                  var13 = (var12.field10954 + 1) * var13;
               }

               if (var11 > var13) {
                  class709.method5141(var12, arg0, 2);
                  return;
               }

               var12 = (class738)var8.field2084.method4059((byte)-14);
            }

            while(true) {
               int var10000;
               if (var12 == null) {
                  var10000 = arg2;
                  if (var5 == 0) {
                     if (arg2 != 0) {
                        method2001((class738)null, 62, false, 88, -125);
                     }

                     var8.field2084.method4060(23, arg0);
                     return;
                  }
               } else {
                  var10 = class54.field616.method1689(var12.field10955, (byte)-48);
                  var10000 = var10.field1137;
               }

               var13 = var10000;
               if (var10.field1150 == 1) {
                  var13 = (var12.field10954 + 1) * var13;
               }

               if (var11 > var13) {
                  class709.method5141(var12, arg0, 2);
                  return;
               }

               var12 = (class738)var8.field2084.method4059((byte)-14);
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field3618[5] + (arg0 != null ? field3618[4] : field3618[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "(B)V",
      line = 60
   )
   public final void method2002(byte arg0) {
      try {
         if (arg0 <= 122) {
            this.method2005(115, -117);
         }

         ++field3607;
         class748 var2 = this.field3611;
         synchronized(this.field3611) {
            this.field3611.method5451(-117);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3618[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(B)V",
      line = 73
   )
   public static void method2003(byte arg0) {
      try {
         field3613 = null;
         field3616 = null;
         field3610 = null;
         if (arg0 <= 117) {
            method2008(12, true, -123, 72, 110, -66);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3618[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "(II)Lrc;",
      line = 88
   )
   public final class564 method2004(int arg0, int arg1) {
      try {
         ++field3604;
         class748 var3 = this.field3611;
         class564 var5;
         synchronized(this.field3611) {
            if (arg0 < 64) {
               return null;
            }

            var5 = (class564)this.field3611.method5454((long)arg1, 18261);
         }

         if (var5 != null) {
            return var5;
         } else {
            class526 var6 = this.field3605;
            byte[] var7;
            synchronized(this.field3605) {
               var7 = this.field3605.method3899(-65, arg1, 3);
            }

            class564 var8 = new class564();
            var8.field8422 = this;
            if (var7 != null) {
               var8.method4170(new class128(var7), 0);
            }

            class748 var9 = this.field3611;
            synchronized(this.field3611) {
               this.field3611.method5455(-2049, var8, (long)arg1);
               return var8;
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field3618[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(II)V",
      line = 126
   )
   public final void method2005(int arg0, int arg1) {
      try {
         ++field3603;
         class748 var3 = this.field3611;
         synchronized(this.field3611) {
            this.field3611.method5453(arg0, false);
         }

         if (arg1 != -2) {
            this.field3617 = null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3618[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(I)V",
      line = 141
   )
   public final void method2006(int arg0) {
      try {
         ++field3615;
         class748 var2 = this.field3611;
         synchronized(this.field3611) {
            if (arg0 <= -112) {
               this.field3611.method5445(697465426);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3618[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(Liaa;IILlw;I)V",
      line = 154
   )
   public static final void method2007(class520 arg0, int arg1, int arg2, class687 arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field3609;
         byte var6 = -1;
         if ((32 & arg4) != 0) {
            int[] var7 = new int[4];
            int var8 = 0;
            if (var5 != 0) {
               var7[var8] = arg0.method1038((byte)-109);
               if (~var7[var8] == -65536) {
                  var7[var8] = -1;
               }

               ++var8;
            }

            while(true) {
               while(~var8 > -5) {
                  var7[var8] = arg0.method1038((byte)-109);
                  if (~var7[var8] == -65536) {
                     var7[var8] = -1;
                  }

                  ++var8;
               }

               int var9 = arg0.method1043((byte)-116);
               if (var5 == 0) {
                  class450.method3395(var9, arg3, -16, var7);
                  break;
               }

               if (var9 == -65536) {
                  var7[var8] = -1;
               }

               ++var8;
            }
         }

         if (~(arg4 & 128) != -1) {
            int var10 = arg0.method1086(-1);
            if (~var10 == -65536) {
               var10 = -1;
            }

            arg3.field6048 = var10;
         }

         if (~(4096 & arg4) != -1) {
            int var11 = arg0.method1054(-8779);
            int var12 = arg0.method1041(4758);
            if (~var11 == -65536) {
               var11 = -1;
            }

            int var13 = arg0.method1076((byte)-89);
            int var14 = var13 & 7;
            int var15 = 15 & var13 >> 3;
            if (~var15 == -16) {
               var15 = -1;
            }

            arg3.method3047(var11, var12, var14, (byte)11, var15, 1);
         }

         if (~(512 & arg4) != -1) {
            label250: {
               arg3.field6034 = arg0.method1083((byte)98);
               if (~arg3.field6034.charAt(0) == -127) {
                  arg3.field6034 = arg3.field6034.substring(1);
                  class286.method2180(arg3.field10316, arg3.method5002(false, (byte)-99), arg3.method5003(true, -116), 0, 0, arg3.field6034, 2);
                  if (var5 == 0) {
                     break label250;
                  }
               }

               if (class693.field10418 == arg3) {
                  class286.method2180(arg3.field10316, arg3.method5002(false, (byte)-111), arg3.method5003(true, -116), 0, 0, arg3.field6034, 2);
               }
            }

            arg3.field6065 = 0;
            arg3.field6052 = 150;
            arg3.field6044 = 0;
         }

         if (~(16 & arg4) != -1) {
            int var16 = arg0.method1054(-8779);
            int var17 = arg0.method1082((byte)30);
            if (var16 == 65535) {
               var16 = -1;
            }

            int var18 = arg0.method1043((byte)-125);
            int var19 = 7 & var18;
            int var20 = (var18 & 121) >> 3;
            if (var20 == 15) {
               var20 = -1;
            }

            arg3.method3047(var16, var17, var19, (byte)11, var20, 0);
         }

         if ((arg4 & 65536) != 0) {
            arg3.field6068 = arg0.method1045((byte)99);
            arg3.field6080 = arg0.method1039(128);
            arg3.field6023 = arg0.method1045((byte)125);
            arg3.field6038 = (byte)arg0.method1104(255);
            arg3.field6095 = class314.field4488 - -arg0.method1038((byte)-124);
            arg3.field6074 = class314.field4488 - -arg0.method1054(-8779);
         }

         if (~(256 & arg4) != -1) {
            int var21 = arg0.method1053(false);
            arg3.field6036 = arg0.method1076((byte)-89);
            arg3.field6085 = arg0.method1104(255);
            arg3.field6069 = var21 & 32767;
            arg3.field6017 = ~(32768 & var21) != -1;
            arg3.field6035 = class314.field4488 + arg3.field6069 + arg3.field6036;
         }

         if (~(arg4 & 1024) != -1) {
            arg3.field10318 = arg0.method1074((byte)-123) == 1;
         }

         if ((arg4 & 64) != 0) {
            int var22 = arg0.method1104(255);
            byte[] var23 = new byte[var22];
            class128 var24 = new class128(var23);
            arg0.method1102(var22, var23, 0, (byte)15);
            class496.field7338[arg1] = var24;
            arg3.method4993(63, var24);
         }

         if ((arg4 & 8192) != 0) {
            int var25 = arg0.method1076((byte)-125);
            int[] var26 = new int[var25];
            int[] var27 = new int[var25];
            int[] var28 = new int[var25];
            int var29 = 0;
            if (var5 != 0 || ~var25 < ~var29) {
               do {
                  int var30 = arg0.method1053(false);
                  if (~var30 == -65536) {
                     var30 = -1;
                  }

                  var26[var29] = var30;
                  var27[var29] = arg0.method1043((byte)-128);
                  var28[var29] = arg0.method1053(false);
                  ++var29;
               } while(~var25 < ~var29);
            }

            class530.method3923(arg3, var28, var27, var26, -102);
         }

         if ((arg4 & 524288) != 0) {
            int var31 = arg0.method1053(false);
            int var32 = arg0.method1073(1);
            if (var31 == 65535) {
               var31 = -1;
            }

            int var33 = arg0.method1074((byte)-120);
            int var34 = var33 & 7;
            int var35 = 15 & var33 >> 3;
            if (~var35 == -16) {
               var35 = -1;
            }

            arg3.method3047(var31, var32, var34, (byte)11, var35, 2);
         }

         if ((4 & arg4) != 0) {
            class790.field11482[arg1] = arg0.method1045((byte)124);
         }

         if ((131072 & arg4) != 0) {
            arg3.field10302 = ~arg0.method1074((byte)-108) == -2;
         }

         if ((8 & arg4) != 0) {
            arg3.field10321 = arg0.method1053(false);
            if (arg3.field6121 == 0) {
               arg3.method3045(arg3.field10321, -18952);
               arg3.field10321 = -1;
            }
         }

         if (arg2 < 30) {
            field3613 = null;
         }

         if ((arg4 & 32768) != 0) {
            label218: {
               arg3.field6089 = arg0.method1047((byte)-110);
               arg3.field6039 = arg0.method1047((byte)101);
               arg3.field6062 = arg0.method1047((byte)94);
               arg3.field6047 = arg0.method1047((byte)74);
               arg3.field6086 = arg0.method1053(false) + class314.field4488;
               arg3.field6028 = arg0.method1053(false) + class314.field4488;
               arg3.field6031 = arg0.method1043((byte)-121);
               arg3.field6119 = 0;
               if (!arg3.field10336) {
                  arg3.field6062 += arg3.field6114[0];
                  arg3.field6047 += arg3.field6116[0];
                  arg3.field6089 += arg3.field6114[0];
                  arg3.field6121 = 1;
                  arg3.field6039 += arg3.field6116[0];
                  if (var5 == 0) {
                     break label218;
                  }
               }

               arg3.field6062 += arg3.field10349;
               arg3.field6047 += arg3.field10342;
               arg3.field6039 += arg3.field10342;
               arg3.field6089 += arg3.field10349;
               arg3.field6121 = 0;
            }
         }

         if (~(262144 & arg4) != -1) {
            int var36 = arg0.method1043((byte)-124);
            int[] var37 = new int[var36];
            int[] var38 = new int[var36];
            int var39 = 0;
            if (var5 != 0 || var36 > var39) {
               do {
                  label208: {
                     int var40 = arg0.method1054(-8779);
                     if (~(var40 & 49152) == -49153) {
                        int var41 = arg0.method1054(-8779);
                        var37[var39] = class379.method2928(var40 << 16, var41);
                        if (var5 == 0) {
                           break label208;
                        }
                     }

                     var37[var39] = var40;
                  }

                  var38[var39] = arg0.method1086(-1);
                  ++var39;
               } while(var36 > var39);
            }

            arg3.method3057(var38, (byte)42, var37);
         }

         if ((arg4 & 1) != 0) {
            int var42 = arg0.method1076((byte)-127);
            if (~var42 < -1) {
               int var43 = 0;
               if (var5 != 0 || var43 < var42) {
                  do {
                     int var44;
                     int var45;
                     int var46;
                     int var47;
                     label191: {
                        var44 = -1;
                        var45 = -1;
                        var46 = -1;
                        var47 = arg0.method1061((byte)60);
                        if (var47 != 32767) {
                           if (~var47 != -32767) {
                              var45 = arg0.method1061((byte)60);
                              if (var5 == 0) {
                                 break label191;
                              }
                           }

                           var47 = -1;
                           if (var5 == 0) {
                              break label191;
                           }
                        }

                        var47 = arg0.method1061((byte)60);
                        var45 = arg0.method1061((byte)60);
                        var44 = arg0.method1061((byte)60);
                        var46 = arg0.method1061((byte)60);
                     }

                     int var48 = arg0.method1061((byte)60);
                     int var49 = arg0.method1076((byte)-101);
                     arg3.method3039(var47, var49, var46, var45, class314.field4488, (byte)55, var44, var48);
                     ++var43;
                  } while(var43 < var42);
               }
            }
         }

         if (~(arg4 & 16384) != -1) {
            var6 = arg0.method1092((byte)68);
         }

         if (arg3.field10336) {
            if (var6 == 127) {
               arg3.method5001(63, arg3.field10349, arg3.field10342);
            } else {
               byte var50;
               label172: {
                  if (var6 == -1) {
                     var50 = class790.field11482[arg1];
                     if (var5 == 0) {
                        break label172;
                     }
                  }

                  var50 = var6;
               }

               class175.method1389(var50, arg3, -117);
               arg3.method4997(true, var50, arg3.field10349, arg3.field10342);
            }
         }
      } catch (RuntimeException var52) {
         throw class670.method4877(var52, field3618[3] + (arg0 != null ? field3618[4] : field3618[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3618[4] : field3618[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(IZIIII)V",
      line = 522
   )
   public static final void method2008(int param0, boolean param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kf",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;Leaa;)V",
      line = 666
   )
   public class264(class24 arg0, int arg1, class526 arg2, class526 arg3) {
      try {
         this.field3617 = arg3;
         this.field3605 = arg2;
         this.field3605.method3875(0, 3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3618[10] + (arg0 != null ? field3618[4] : field3618[2]) + ',' + arg1 + ',' + (arg2 != null ? field3618[4] : field3618[2]) + ',' + (arg3 != null ? field3618[4] : field3618[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2009(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2010(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
