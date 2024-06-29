import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class216 {
   @OriginalMember(
      owner = "client!sa",
      name = "j",
      descriptor = "[I"
   )
   private int[] field2689 = new int[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2691 = new String[]{method1651(method1650("G\u0001a'c")), method1651(method1650("G\u0001a%c")), method1651(method1650("G\u0001a-c")), method1651(method1650("ONaH6")), method1651(method1650("Z\u0015#\n")), method1651(method1650("G\u0001a!c")), method1651(method1650("G\u0001a\"c")), method1651(method1650("G\u0001a,c")), method1651(method1650("G\u0001a*c")), method1651(method1650("G\u0001a c")), method1651(method1650("G\u0001a/c")), method1651(method1650("G\u0001a$c")), method1651(method1650("G\u0001a.c")), method1651(method1650("G\u0001a#c"))};
   @OriginalMember(
      owner = "client!sa",
      name = "e",
      descriptor = "Lnw;"
   )
   public static class616 field2680 = new class616(68, 8);
   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "Ldg;"
   )
   public static class436 field2688 = new class436(method1651(method1650("}.\u001b$\u000e`!")), method1651(method1650("[\u0006)\u000f(Q")), method1651(method1650("k\t!\u0012)Q\u0014.")), 6);
   @OriginalMember(
      owner = "client!sa",
      name = "p",
      descriptor = "I"
   )
   public static int field2671;
   @OriginalMember(
      owner = "client!sa",
      name = "c",
      descriptor = "I"
   )
   public static int field2672;
   @OriginalMember(
      owner = "client!sa",
      name = "g",
      descriptor = "I"
   )
   public static int field2673;
   @OriginalMember(
      owner = "client!sa",
      name = "n",
      descriptor = "I"
   )
   public static int field2674;
   @OriginalMember(
      owner = "client!sa",
      name = "s",
      descriptor = "I"
   )
   public static int field2677;
   @OriginalMember(
      owner = "client!sa",
      name = "h",
      descriptor = "I"
   )
   public static int field2682;
   @OriginalMember(
      owner = "client!sa",
      name = "o",
      descriptor = "I"
   )
   public static int field2683;
   @OriginalMember(
      owner = "client!sa",
      name = "f",
      descriptor = "I"
   )
   public static int field2684;
   @OriginalMember(
      owner = "client!sa",
      name = "t",
      descriptor = "I"
   )
   public static int field2685;
   @OriginalMember(
      owner = "client!sa",
      name = "l",
      descriptor = "I"
   )
   public static int field2686;
   @OriginalMember(
      owner = "client!sa",
      name = "q",
      descriptor = "I"
   )
   public static int field2690;
   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "Lvw;"
   )
   public class322 field2675;
   @OriginalMember(
      owner = "client!sa",
      name = "m",
      descriptor = "[I"
   )
   private int[] field2681;
   @OriginalMember(
      owner = "client!sa",
      name = "k",
      descriptor = "[S"
   )
   private short[] field2676;
   @OriginalMember(
      owner = "client!sa",
      name = "i",
      descriptor = "[S"
   )
   private short[] field2678;
   @OriginalMember(
      owner = "client!sa",
      name = "d",
      descriptor = "[S"
   )
   private short[] field2679;
   @OriginalMember(
      owner = "client!sa",
      name = "r",
      descriptor = "[S"
   )
   private short[] field2687;

   @OriginalMember(
      owner = "client!sa",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method1638(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method1639(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2674;
         if (arg0 != -1) {
            field2688 = null;
         }

         do {
            int var4 = arg1.method4288((byte)65);
            if (~var4 == -1) {
               break;
            }

            this.method1643(arg1, var4, false);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2691[8] + arg0 + ',' + (arg1 != null ? field2691[3] : field2691[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Lqa;ZLwm;)Lfka;"
   )
   public static final class745 method1640(class261 arg0, boolean arg1, class594 arg2) {
      boolean var3 = client.field4273;

      try {
         ++field2686;
         class745 var4 = new class745(arg0);
         int var5 = arg2.method4288((byte)106);
         boolean var6 = (var5 & 1) != 0;
         boolean var7 = ~(2 & var5) != -1;
         if (!arg1) {
            method1649(-60, 0, -121);
         }

         boolean var8 = (4 & var5) != 0;
         if (var6) {
            var4.field10837[0] = arg2.method4280(-19104);
            var4.field10835[0] = arg2.method4280(-19104);
            if (~arg0.field3375 != 0 || arg0.field3389 != -1) {
               var4.field10837[1] = arg2.method4280(-19104);
               var4.field10835[1] = arg2.method4280(-19104);
            }

            if (arg0.field3411 != -1 || ~arg0.field3400 != 0) {
               var4.field10837[2] = arg2.method4280(-19104);
               var4.field10835[2] = arg2.method4280(-19104);
            }
         }

         boolean var9 = ~(8 & var5) != -1;
         if (var7) {
            var4.field10832[0] = arg2.method4280(-19104);
            var4.field10838[0] = arg2.method4280(-19104);
            if (arg0.field3381 != -1 || ~arg0.field3377 != 0) {
               var4.field10832[1] = arg2.method4280(-19104);
               var4.field10838[1] = arg2.method4280(-19104);
            }
         }

         if (var8) {
            int var10 = arg2.method4280(-19104);
            int[] var11 = new int[]{class743.method5375(var10, 15), class743.method5375(245, var10) >> 4, class743.method5375(var10, 4011) >> 8, class743.method5375(15, var10 >> 12)};
            int var12 = 0;
            if (var3 || var12 < 4) {
               do {
                  if (var11[var12] != 15) {
                     var4.field10833[var11[var12]] = (short)arg2.method4280(-19104);
                  }

                  ++var12;
               } while(var12 < 4);
            }
         }

         if (var9) {
            int var13 = arg2.method4288((byte)61);
            int[] var14 = new int[]{class743.method5375(15, var13), class743.method5375(15, var13 >> 4)};
            int var15 = 0;
            if (var3 || var15 < 2) {
               do {
                  if (var14[var15] != 15) {
                     var4.field10834[var14[var15]] = (short)arg2.method4280(-19104);
                  }

                  ++var15;
               } while(var15 < 2);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field2691[5] + (arg0 != null ? field2691[3] : field2691[4]) + ',' + arg1 + ',' + (arg2 != null ? field2691[3] : field2691[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method1641(int arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            field2680 = null;
         }

         ++field2685;
         return (~(arg1 & 8192) != -1 | class793.method5714(arg1, arg0, (byte)-62) | class625.method4538(arg0, arg1, 65536)) & class273.method2087(true, arg1, arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2691[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(B)Lvp;"
   )
   public final class200 method1642(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Lwm;IZ)V"
   )
   private final void method1643(class594 arg0, int arg1, boolean arg2) {
      boolean var4 = client.field4273;

      try {
         if (!arg2) {
            label129: {
               if (arg1 == 1) {
                  arg0.method4288((byte)88);
                  if (!var4) {
                     break label129;
                  }
               }

               if (arg1 != 2) {
                  if (~arg1 == -4) {
                     break label129;
                  }

                  if (arg1 == 40) {
                     int var5 = arg0.method4288((byte)90);
                     this.field2678 = new short[var5];
                     this.field2676 = new short[var5];
                     int var6 = 0;
                     if (var4) {
                        this.field2676[var6] = (short)arg0.method4280(-19104);
                        this.field2678[var6] = (short)arg0.method4280(-19104);
                        ++var6;
                     }

                     while(true) {
                        while(~var5 < ~var6) {
                           this.field2676[var6] = (short)arg0.method4280(-19104);
                           this.field2678[var6] = (short)arg0.method4280(-19104);
                           ++var6;
                        }

                        if (!var4) {
                           if (!var4) {
                              break label129;
                           }
                           break;
                        }

                        ++var6;
                     }
                  }

                  if (~arg1 != -42) {
                     if (arg1 < 60 || ~arg1 <= -71) {
                        break label129;
                     }

                     this.field2689[arg1 + -60] = arg0.method4280(-19104);
                     if (!var4) {
                        break label129;
                     }
                  }

                  int var7 = arg0.method4288((byte)116);
                  this.field2687 = new short[var7];
                  this.field2679 = new short[var7];
                  int var8 = 0;
                  if (var4) {
                     this.field2687[var8] = (short)arg0.method4280(-19104);
                     this.field2679[var8] = (short)arg0.method4280(-19104);
                     ++var8;
                  }

                  while(true) {
                     while(var7 > var8) {
                        this.field2687[var8] = (short)arg0.method4280(-19104);
                        this.field2679[var8] = (short)arg0.method4280(-19104);
                        ++var8;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label129;
                        }
                        break;
                     }

                     ++var8;
                  }
               }

               int var9 = arg0.method4288((byte)111);
               this.field2681 = new int[var9];
               int var10 = 0;
               if (var4 || var9 > var10) {
                  do {
                     this.field2681[var10] = arg0.method4280(-19104);
                     ++var10;
                  } while(var9 > var10);
               }
            }

            ++field2683;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2691[10] + (arg0 != null ? field2691[3] : field2691[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1644(int arg0, int arg1) {
      try {
         ++field2672;
         if (arg0 <= 35) {
            method1640((class261)null, false, (class594)null);
         }

         if (arg1 < 96) {
            return 0;
         } else {
            return ~arg1 > -129 ? 2 : 3;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2691[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1645(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sa",
      name = "d",
      descriptor = "(I)Lvp;"
   )
   public final class200 method1646(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1647(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field2690;
         if (~class93.field1236 > -101) {
            return -2;
         } else {
            int var5 = -2;
            int var6 = arg0;
            int var7 = arg3 - class618.field8644;
            int var8 = arg1 - class618.field8627;
            class168 var9 = (class168)class618.field8624.method3855(-14);
            int var10000;
            if (var4) {
               var10000 = arg2;
            } else if (var9 == null) {
               var10000 = var5;
               if (!var4) {
                  return var5;
               }
            } else {
               var10000 = arg2;
            }

            while(true) {
               if (var10000 == var9.field2123) {
                  int var10 = var9.field2118;
                  int var11 = var9.field2124;
                  int var12 = class618.field8627 + var11 | class618.field8644 + var10 << 14;
                  int var13 = (-var10 + var7) * (-var10 + var7) - -((-var11 + var8) * (-var11 + var8));
                  if (~var5 <= -1) {
                     if (~var6 < ~var13) {
                        var6 = var13;
                        var5 = var12;
                     }
                  } else {
                     var6 = var13;
                     var5 = var12;
                  }
               }

               var9 = (class168)class618.field8624.method3866((byte)120);
               if (var9 == null) {
                  var10000 = var5;
                  if (!var4) {
                     return var5;
                  }
               } else {
                  var10000 = arg2;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field2691[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1648(int arg0) {
      try {
         field2688 = null;
         if (arg0 != 0) {
            method1649(-71, -24, -50);
         }

         field2680 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2691[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1649(int arg0, int arg1, int arg2) {
      try {
         class624.method4535(arg1, arg2, false);
         ++field2671;
         if (arg0 != 31064) {
            field2688 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2691[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1650(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1651(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
