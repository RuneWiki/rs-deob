import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class528 extends class454 {
   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7405 = new String[]{method3947(method3946(")ae\u0019po")), method3947(method3946(")ae\u0019uo")), method3947(method3946(")ae\u0019so")), method3947(method3946(")ae\u0019vo")), method3947(method3946("<'*\u0019J")), method3947(method3946(")|h[")), method3947(method3946(")ae\u0019to")), method3947(method3946(")ae\u0019qo")), method3947(method3946(")ae\u0019ro")), method3947(method3946(")ae\u0019\u007fo"))};
   @OriginalMember(
      owner = "client!nha",
      name = "p",
      descriptor = "I"
   )
   public static int field7397;
   @OriginalMember(
      owner = "client!nha",
      name = "o",
      descriptor = "I"
   )
   public static int field7398;
   @OriginalMember(
      owner = "client!nha",
      name = "n",
      descriptor = "I"
   )
   public static int field7399;
   @OriginalMember(
      owner = "client!nha",
      name = "k",
      descriptor = "I"
   )
   public static int field7400;
   @OriginalMember(
      owner = "client!nha",
      name = "j",
      descriptor = "I"
   )
   public static int field7401;
   @OriginalMember(
      owner = "client!nha",
      name = "l",
      descriptor = "I"
   )
   public static int field7402;
   @OriginalMember(
      owner = "client!nha",
      name = "i",
      descriptor = "I"
   )
   public static int field7403;
   @OriginalMember(
      owner = "client!nha",
      name = "m",
      descriptor = "I"
   )
   public static int field7404;

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3942(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field7402;
         if (~class561.field8209 != 0 && ~class623.field9221 != 0) {
            label75: {
               int var2 = ((class743.field10865 - class616.field9074) * class36.field513 >> 16) + class616.field9074;
               class36.field513 += var2;
               if (~class36.field513 <= -65536) {
                  label72: {
                     if (!class681.field10030) {
                        class46.field581 = true;
                        if (!var1) {
                           break label72;
                        }
                     }

                     class46.field581 = false;
                  }

                  class36.field513 = 65535;
                  class681.field10030 = true;
                  if (!var1) {
                     break label75;
                  }
               }

               class681.field10030 = false;
               class46.field581 = false;
            }

            float var3;
            float[] var4;
            int var5;
            float[] var14;
            int var15;
            int var10000;
            label53: {
               var3 = (float)class36.field513 / 65535.0F;
               var4 = new float[3];
               var5 = class507.field7056 * 2;
               int var6 = 0;
               if (var1) {
                  var10000 = class506.field7053[class561.field8209][var5][var6] * 3;
               } else if (var6 >= 3) {
                  class160.field2051 = (int)var4[0] + -(class539.field7889 * 512);
                  class168.field2195 = (int)var4[2] + -(class353.field4940 * 512);
                  class546.field8031 = (int)var4[1] * -1;
                  var14 = new float[3];
                  var15 = class778.field11342 * 2;
                  var10000 = 0;
                  if (!var1) {
                     break label53;
                  }
               } else {
                  var10000 = class506.field7053[class561.field8209][var5][var6] * 3;
               }

               while(true) {
                  int var7 = var10000;
                  int var8 = class506.field7053[class561.field8209][var5 + 1][var6] * 3;
                  int var9 = (class506.field7053[class561.field8209][var5 - -2][var6] - (class506.field7053[class561.field8209][var5 + 3][var6] + -class506.field7053[class561.field8209][var5 + 2][var6])) * 3;
                  int var10 = class506.field7053[class561.field8209][var5][var6];
                  int var11 = -var7 + var8;
                  int var12 = var7 + var9 + -(var8 * 2);
                  int var13 = class506.field7053[class561.field8209][var5 - -2][var6] + var8 + -var10 + -var9;
                  var4[var6] = (((float)var13 * var3 + (float)var12) * var3 + (float)var11) * var3 + (float)var10;
                  ++var6;
                  if (var6 >= 3) {
                     class160.field2051 = (int)var4[0] + -(class539.field7889 * 512);
                     class168.field2195 = (int)var4[2] + -(class353.field4940 * 512);
                     class546.field8031 = (int)var4[1] * -1;
                     var14 = new float[3];
                     var15 = class778.field11342 * 2;
                     var10000 = 0;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var10000 = class506.field7053[class561.field8209][var5][var6] * 3;
                  }
               }
            }

            int var16 = var10000;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            if (var1) {
               var17 = 3 * class506.field7053[class623.field9221][var15][var16];
               var18 = class506.field7053[class623.field9221][var15 + 1][var16] * 3;
               var19 = (class506.field7053[class623.field9221][var15 + 2][var16] + -class506.field7053[class623.field9221][var15 + 3][var16] + class506.field7053[class623.field9221][var15 + 2][var16]) * 3;
               var20 = class506.field7053[class623.field9221][var15][var16];
               var21 = -var17 + var18;
               var22 = -(var18 * 2) + var17 + var19;
               var23 = -var20 + var18 + -var19 + class506.field7053[class623.field9221][var15 - -2][var16];
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }

            while(true) {
               int var10001;
               byte var31;
               if (~var16 <= -4) {
                  float var24 = var14[0] + -var4[0];
                  float var25 = (var14[1] + -var4[1]) * -1.0F;
                  float var26 = var14[2] + -var4[2];
                  var31 = arg0;
                  var10001 = 122;
                  if (!var1) {
                     if (arg0 <= 122) {
                        return;
                     }

                     double var27 = Math.sqrt((double)(var24 * var24 + var26 * var26));
                     class653.field9755 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)var25, var27));
                     class242.field3054 = (int)(-Math.atan2((double)var24, (double)var26) * 2607.5945876176133D) & 16383;
                     class673.field9969 = ((class506.field7053[class561.field8209][var5 - -2][3] + -class506.field7053[class561.field8209][var5][3]) * class36.field513 >> 16) + class506.field7053[class561.field8209][var5][3];
                     return;
                  }
               } else {
                  var31 = 3;
                  var10001 = class506.field7053[class623.field9221][var15][var16];
               }

               var17 = var31 * var10001;
               var18 = class506.field7053[class623.field9221][var15 + 1][var16] * 3;
               var19 = (class506.field7053[class623.field9221][var15 + 2][var16] + -class506.field7053[class623.field9221][var15 + 3][var16] + class506.field7053[class623.field9221][var15 + 2][var16]) * 3;
               var20 = class506.field7053[class623.field9221][var15][var16];
               var21 = -var17 + var18;
               var22 = -(var18 * 2) + var17 + var19;
               var23 = -var20 + var18 + -var19 + class506.field7053[class623.field9221][var15 - -2][var16];
               var14[var16] = (((float)var23 * var3 + (float)var22) * var3 + (float)var21) * var3 + (float)var20;
               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class93.method866(var30, field7405[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3943(int arg0) {
      try {
         if (arg0 != -18033) {
            return -92;
         } else {
            ++field7399;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7405[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class528(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method3944(int arg0, byte arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field7404;
         if (class264.field3355 < 100) {
            return -2;
         } else {
            int var5 = -2;
            int var6 = Integer.MAX_VALUE;
            int var7 = arg3 - class326.field4502;
            if (arg1 != 113) {
               method3945(114, 43, (class642)null, 40);
            }

            int var8 = arg2 - class326.field4499;
            class160 var9 = (class160)class326.field4479.method288(0);
            int var10000;
            if (var4) {
               var10000 = ~var9.field2052;
            } else if (var9 == null) {
               var10000 = var5;
               if (!var4) {
                  return var5;
               }
            } else {
               var10000 = ~var9.field2052;
            }

            while(true) {
               if (var10000 == ~arg0) {
                  int var10 = var9.field2046;
                  int var11 = var9.field2048;
                  int var12 = var11 - -class326.field4499 | var10 - -class326.field4502 << 14;
                  int var13 = (-var10 + var7) * (-var10 + var7) + (-var11 + var8) * (-var11 + var8);
                  if (var5 >= 0) {
                     if (~var13 > ~var6) {
                        var6 = var13;
                        var5 = var12;
                     }
                  } else {
                     var6 = var13;
                     var5 = var12;
                  }
               }

               var9 = (class160)class326.field4479.method290(17958);
               if (var9 == null) {
                  var10000 = var5;
                  if (!var4) {
                     return var5;
                  }
               } else {
                  var10000 = ~var9.field2052;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field7405[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class528(int arg0, class752 arg1) {
      super(arg1);
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IILoca;I)V"
   )
   public static final void method3945(int arg0, int arg1, class642 arg2, int arg3) {
      try {
         ++field7397;
         if (class584.field8627 == null && !class652.field9742) {
            if (arg2 != null && class513.method3871(true, arg2) != null) {
               class584.field8627 = arg2;
               class509.field7102 = class513.method3871(true, arg2);
               class6.field83 = 0;
               class308.field4309 = arg0;
               class67.field897 = arg3;
               if (arg1 == 2) {
                  class70.field931 = false;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7405[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7405[4] : field7405[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 <= -46) {
            super.field6263 = arg1;
            ++field7400;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7405[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (arg0) {
            if (super.field6263 != 1 && super.field6263 != 0) {
               super.field6263 = this.method23(1);
            }

            ++field7403;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7405[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field7398;
         if (arg1) {
            this.method20((byte)-69, 18);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7405[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field7401;
         return arg0 != 1 ? 5 : 1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7405[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3946(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3947(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
