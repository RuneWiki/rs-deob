import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class137 extends class264 {
   @OriginalMember(
      owner = "client!ju",
      name = "I",
      descriptor = "I"
   )
   private int field1740 = 32768;
   @OriginalMember(
      owner = "client!ju",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1752 = new String[]{method1089(method1088("jI+m>")), method1089(method1088("{\u0012+\u0007k")), method1089(method1088("\u007f\u0012i/")), method1089(method1088("{\u0012+\u0004k")), method1089(method1088("{\u0012+\u0006k")), method1089(method1088("{\u0012+\u0005k")), method1089(method1088("{\u0012+\tk")), method1089(method1088("{\u0012+\u000fk")), method1089(method1088("{\u0012+\u0001k")), method1089(method1088("{\u0012+\bk")), method1089(method1088("\u007f\u0014ks")), method1089(method1088("{\u0012+\nk")), method1089(method1088("\u007f\u0014kp")), method1089(method1088("\u007f\u0014kr")), method1089(method1088("\u007f\u0014kq")), method1089(method1088("{\u0012+\u0000k")), method1089(method1088("{\u0012+\u000bk")), method1089(method1088("{\u0012+\u0002k"))};
   @OriginalMember(
      owner = "client!ju",
      name = "G",
      descriptor = "I"
   )
   public static int field1739;
   @OriginalMember(
      owner = "client!ju",
      name = "R",
      descriptor = "I"
   )
   public static int field1741;
   @OriginalMember(
      owner = "client!ju",
      name = "O",
      descriptor = "I"
   )
   public static int field1742;
   @OriginalMember(
      owner = "client!ju",
      name = "F",
      descriptor = "I"
   )
   public static int field1743;
   @OriginalMember(
      owner = "client!ju",
      name = "M",
      descriptor = "I"
   )
   public static int field1744;
   @OriginalMember(
      owner = "client!ju",
      name = "J",
      descriptor = "I"
   )
   public static int field1745;
   @OriginalMember(
      owner = "client!ju",
      name = "P",
      descriptor = "I"
   )
   public static int field1746;
   @OriginalMember(
      owner = "client!ju",
      name = "K",
      descriptor = "I"
   )
   public static int field1747;
   @OriginalMember(
      owner = "client!ju",
      name = "L",
      descriptor = "I"
   )
   public static int field1748;
   @OriginalMember(
      owner = "client!ju",
      name = "H",
      descriptor = "I"
   )
   public static int field1749;
   @OriginalMember(
      owner = "client!ju",
      name = "Q",
      descriptor = "I"
   )
   public static int field1750;
   @OriginalMember(
      owner = "client!ju",
      name = "N",
      descriptor = "I"
   )
   public static int field1751;

   @OriginalMember(
      owner = "client!ju",
      name = "g",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method1080(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(IIB)Z",
      line = 225
   )
   public static final boolean method1081(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != -30) {
            return false;
         } else {
            ++field1739;
            return ~(arg1 & 52) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1752[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "<init>",
      descriptor = "()V",
      line = 236
   )
   public class137() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(BLbda;)V",
      line = 246
   )
   public static final void method1082(byte param0, class534 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(I[BIZII)Z",
      line = 449
   )
   public static final boolean method1083(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         ++field1748;
         boolean var7 = true;
         if (arg3) {
            return true;
         } else {
            class147 var8 = new class147(arg1);
            int var9 = -1;

            boolean var10000;
            while(true) {
               int var10 = var8.method1144((byte)-92);
               if (~var10 != -1) {
                  var9 += var10;
                  int var11 = 0;
                  var10000 = false;
                  if (var6) {
                     break;
                  }

                  boolean var12 = false;

                  label96:
                  do {
                     class259 var20;
                     do {
                        int var17;
                        int var18;
                        int var19;
                        do {
                           do {
                              label75:
                              do {
                                 while(true) {
                                    while(var12) {
                                       int var13 = var8.method1145((byte)44);
                                       if (var13 == 0) {
                                          break label96;
                                       }

                                       var8.method1143(-15465);
                                       if (var6) {
                                          break;
                                       }
                                    }

                                    int var14 = var8.method1145((byte)40);
                                    int var23 = ~var14;

                                    while(true) {
                                       if (var23 == -1) {
                                          break label96;
                                       }

                                       var11 += var14 + -1;
                                       int var15 = 63 & var11;
                                       int var16 = (var11 & 4090) >> 6;
                                       var17 = var8.method1143(-15465) >> 2;
                                       var18 = arg5 + var16;
                                       var19 = arg0 + var15;
                                       if (~var18 >= -1) {
                                          break;
                                       }

                                       var23 = var19;
                                       if (!var6) {
                                          continue label75;
                                       }
                                    }
                                 }
                              } while(var19 <= 0);
                           } while(var18 >= arg2 + -1);
                        } while(arg4 + -1 <= var19);

                        var20 = class387.field5618.method3977(var9, (byte)75);
                        if (~var17 == -23 && class300.field4107.field6448.method4664(103) == 0 && ~var20.field3587 == -1 && var20.field3553 != 1 && !var20.field3545) {
                           continue label96;
                        }

                        var12 = true;
                     } while(var20.method1985(101));

                     ++class26.field412;
                     var7 = false;
                  } while(!var6);

                  if (!var6) {
                     continue;
                  }
               }

               var10000 = var7;
               break;
            }

            return var10000;
         }
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field1752[7] + arg0 + ',' + (arg1 != null ? field1752[0] : field1752[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(II)[I",
      line = 532
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1746;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[] var5 = this.method2019(1, -27804, arg0);
            int[] var6 = this.method2019(2, -27804, arg0);
            int var7 = 0;
            if (var3 || ~class430.field6152 < ~var7) {
               do {
                  int var8 = var5[var7] >> 4 & 255;
                  int var9 = var6[var7] * this.field1740 >> 12;
                  int var10 = class290.field4017[var8] * var9 >> 12;
                  int var11 = class270.field3734[var8] * var9 >> 12;
                  int var12 = (var10 >> 12) + var7 & class78.field967;
                  int var13 = (var11 >> 12) + arg0 & class220.field3144;
                  int[] var14 = this.method2019(0, -27804, var13);
                  var4[var7] = var14[var12];
                  ++var7;
               } while(~class430.field6152 < ~var7);
            }
         }

         int var15 = 102 / ((arg1 - 24) / 44);
         return var4;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field1752[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(Lea;ZILjava/lang/String;)Lko;",
      line = 580
   )
   public static final class533 method1084(class573 arg0, boolean arg1, int arg2, String arg3) {
      try {
         ++field1741;
         int var4 = OpenGL.glGenProgramARB();
         OpenGL.glBindProgramARB(arg2, var4);
         OpenGL.glProgramStringARB(arg2, 34933, arg3);
         OpenGL.glGetIntegerv(34379, class155.field2214, 0);
         if (class155.field2214[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
         } else if (arg1) {
            return null;
         } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class533(arg0, arg2, var4);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1752[1] + (arg0 != null ? field1752[0] : field1752[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1752[0] : field1752[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(I)V",
      line = 611
   )
   public final void method413(int arg0) {
      try {
         if (arg0 < 49) {
            this.method3(98, (class147)null, -52);
         }

         ++field1747;
         class69.method644(693);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1752[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "d",
      descriptor = "(I)V",
      line = 626
   )
   public static final void method1085(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ju",
      name = "b",
      descriptor = "(II)Lgk;",
      line = 4983
   )
   public static final class503 method1086(int arg0, int arg1) {
      try {
         ++field1744;
         if (class369.field5219 && class140.field1788 <= arg0 && ~arg0 >= ~class33.field478) {
            return arg1 != 0 ? null : class123.field1606[-class140.field1788 + arg0];
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1752[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 5000
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         ++field1742;
         if (arg2 < 49) {
            method1083(-7, (byte[])null, 14, false, -123, -25);
         }

         if (arg0 != 0) {
            if (~arg0 != -2) {
               return;
            }

            if (!client.field4360) {
               super.field3637 = arg1.method1143(-15465) == 1;
               return;
            }
         }

         this.field1740 = arg1.method1211(-26166) << 4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1752[17] + arg0 + ',' + (arg1 != null ? field1752[0] : field1752[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(ZI)Z",
      line = 5034
   )
   public static final boolean method1087(boolean arg0, int arg1) {
      try {
         ++field1745;
         if (arg1 != 0) {
            method1085(-11);
         }

         boolean var2 = class383.field5543.method528();
         if (arg0 == var2) {
            return true;
         } else {
            label39: {
               if (arg0) {
                  if (class383.field5543.method606()) {
                     break label39;
                  }

                  arg0 = false;
                  if (!client.field4360) {
                     break label39;
                  }
               }

               class383.field5543.method579();
            }

            if (!var2 == arg0) {
               class300.field4107.method3301(25349, class300.field4107.field6450, arg0 ? 1 : 0);
               class441.method3246(0);
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1752[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(IB)[[I",
      line = 5071
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 > -117) {
            method1083(124, (byte[])null, -54, false, -76, 116);
         }

         ++field1743;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828) {
            int[] var5 = this.method2019(1, -27804, arg0);
            int[] var6 = this.method2019(2, -27804, arg0);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int var10 = 0;
            if (var3 || var10 < class430.field6152) {
               do {
                  int var11 = var5[var10] * 255 >> 12 & 255;
                  int var12 = var6[var10] * this.field1740 >> 12;
                  int var13 = class290.field4017[var11] * var12 >> 12;
                  int var14 = class270.field3734[var11] * var12 >> 12;
                  int var15 = class78.field967 & (var13 >> 12) + var10;
                  int var16 = class220.field3144 & (var14 >> 12) + arg0;
                  int[][] var17 = this.method2015(0, (byte)76, var16);
                  var7[var10] = var17[0][var15];
                  var8[var10] = var17[1][var15];
                  var9[var10] = var17[2][var15];
                  ++var10;
               } while(var10 < class430.field6152);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field1752[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1088(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1089(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
