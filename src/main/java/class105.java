import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class105 extends class454 {
   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1372 = new String[]{method940(method939("\u001e;\u000b\u0007)")), method940(method939("\u001e;\u000b\f)")), method940(method939("\u001e;\u000b\r)")), method940(method939("\u001e;\u000b\u000b)")), method940(method939("\u001e;\u000b\n)")), method940(method939("\u001e;\u000b\t)")), method940(method939("\u001e;\u000b\u000e)")), method940(method939("\u001e;\u000b\b)"))};
   @OriginalMember(
      owner = "client!db",
      name = "t",
      descriptor = "Laka;"
   )
   public static class418 field1365 = new class418(1, 4);
   @OriginalMember(
      owner = "client!db",
      name = "q",
      descriptor = "I"
   )
   public static int field1371 = 0;
   @OriginalMember(
      owner = "client!db",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field1370 = false;
   @OriginalMember(
      owner = "client!db",
      name = "o",
      descriptor = "B"
   )
   public static byte field1369;
   @OriginalMember(
      owner = "client!db",
      name = "k",
      descriptor = "I"
   )
   public static int field1360;
   @OriginalMember(
      owner = "client!db",
      name = "m",
      descriptor = "I"
   )
   public static int field1362;
   @OriginalMember(
      owner = "client!db",
      name = "r",
      descriptor = "I"
   )
   public static int field1363;
   @OriginalMember(
      owner = "client!db",
      name = "p",
      descriptor = "I"
   )
   public static int field1364;
   @OriginalMember(
      owner = "client!db",
      name = "n",
      descriptor = "I"
   )
   public static int field1366;
   @OriginalMember(
      owner = "client!db",
      name = "i",
      descriptor = "I"
   )
   public static int field1367;
   @OriginalMember(
      owner = "client!db",
      name = "l",
      descriptor = "I"
   )
   public static int field1368;
   @OriginalMember(
      owner = "client!db",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field1361;

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class105(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method935(int arg0) {
      try {
         ++field1364;
         return arg0 != -18033 ? -3 : super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1372[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field1366;
         if (arg1 > -1) {
            method936(-76, -24, -99, 111, 17, 23);
         }

         int var7 = 0;
         int var8 = arg2;
         int var9 = arg3 * arg3;
         int var10 = arg2 * arg2;
         int var11 = var10 << 1;
         int var12 = var9 << 1;
         int var13 = arg2 << 1;
         int var14 = (-var13 + 1) * var9 + var11;
         int var15 = -((var13 - 1) * var12) + var10;
         int var16 = var9 << 2;
         int var17 = var10 << 2;
         int var18 = ((var7 << 1) + 3) * var11;
         int var19 = ((arg2 << 1) + -3) * var12;
         int var20 = (var7 + 1) * var17;
         int var21 = (arg2 + -1) * var16;
         if (~arg5 <= ~class577.field8561) {
            if (arg5 <= class586.field8647) {
               int var22 = class180.method1522(25495, class415.field5689, class282.field3921, arg0 + arg3);
               int var23 = class180.method1522(25495, class415.field5689, class282.field3921, arg0 - arg3);
               class385.method3045(arg4, var22, class237.field3001[arg5], var23, (byte)-65);
               if (!var6 && ~arg2 >= -1) {
                  return;
               }
            } else if (~arg2 >= -1) {
               return;
            }
         } else if (~arg2 >= -1) {
            return;
         }

         do {
            int var10000;
            label88: {
               if (var14 < 0) {
                  if (var6) {
                     var14 += var18;
                     var15 += var20;
                     ++var7;
                     var20 += var17;
                     var18 += var17;
                  }
               } else {
                  var10000 = var15;
                  if (!var6) {
                     break label88;
                  }

                  var18 = var15;
               }

               while(true) {
                  while(~var14 > -1) {
                     var14 += var18;
                     var15 += var20;
                     ++var7;
                     var20 += var17;
                     var18 += var17;
                  }

                  var10000 = var15;
                  if (!var6) {
                     break;
                  }

                  var18 = var15;
               }
            }

            if (var10000 < 0) {
               var14 += var18;
               var15 += var20;
               ++var7;
               var18 += var17;
               var20 += var17;
            }

            var15 += -var19;
            var14 += -var21;
            var19 -= var16;
            var21 -= var16;
            --var8;
            int var24 = -var8 + arg5;
            int var25 = arg5 + var8;
            var10000 = class577.field8561;
            int var10001 = var25;

            while(var10000 <= var10001) {
               var10000 = ~class586.field8647;
               var10001 = ~var24;
               if (!var6) {
                  if (var10000 <= var10001) {
                     int var26 = class180.method1522(25495, class415.field5689, class282.field3921, arg0 + var7);
                     int var27 = class180.method1522(25495, class415.field5689, class282.field3921, arg0 - var7);
                     if (~class577.field8561 >= ~var24) {
                        class385.method3045(arg4, var26, class237.field3001[var24], var27, (byte)-124);
                     }

                     if (class586.field8647 >= var25) {
                        class385.method3045(arg4, var26, class237.field3001[var25], var27, (byte)-66);
                     }
                  }
                  break;
               }
            }
         } while(~var8 < -1);

      } catch (RuntimeException var29) {
         throw class93.method866(var29, field1372[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method937(int arg0) {
      try {
         if (arg0 != 4) {
            field1369 = 121;
         }

         field1365 = null;
         field1361 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1372[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            return -89;
         } else {
            ++field1360;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1372[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (super.field6259.field11012.method22((byte)92) && !class485.method3683((byte)-67, super.field6259.field11012.method27(-18033))) {
            super.field6263 = 0;
         }

         if (!arg0) {
            field1361 = null;
         }

         ++field1362;
         if (~super.field6263 > -1 || super.field6263 > 1) {
            super.field6263 = this.method23(1);
         }

      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1372[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         super.field6263 = arg1;
         if (arg0 >= -46) {
            field1365 = null;
         }

         ++field1367;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1372[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method938(boolean arg0) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field1363;
            return class485.method3683((byte)-76, super.field6259.field11012.method27(-18033));
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1372[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class105(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            return -77;
         } else {
            ++field1368;
            return !class485.method3683((byte)-98, super.field6259.field11012.method27(-18033)) ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1372[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method939(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method940(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
