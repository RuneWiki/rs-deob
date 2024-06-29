import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class546 extends class629 {
   @OriginalMember(
      owner = "client!fo",
      name = "S",
      descriptor = "Z"
   )
   private boolean field7826 = false;
   @OriginalMember(
      owner = "client!fo",
      name = "P",
      descriptor = "I"
   )
   public int field7820 = -1;
   @OriginalMember(
      owner = "client!fo",
      name = "eb",
      descriptor = "I"
   )
   public int field7824 = 0;
   @OriginalMember(
      owner = "client!fo",
      name = "R",
      descriptor = "I"
   )
   public int field7836 = -1;
   @OriginalMember(
      owner = "client!fo",
      name = "Y",
      descriptor = "I"
   )
   private int field7819 = 0;
   @OriginalMember(
      owner = "client!fo",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7840 = new String[]{method3924(method3923("UF00/")), method3924(method3923("UF02/")), method3924(method3923("XJ")), method3924(method3923("UF08/")), method3924(method3923("UF05/")), method3924(method3923("UF07F\u001b")), method3924(method3923("UF01F\u001b")), method3924(method3923("UF05F\u001b")), method3924(method3923("UF0'F\u001b")), method3924(method3923("]\\r\u0018")), method3924(method3923("H\u00070Zz")), method3924(method3923("UF03F\u001b")), method3924(method3923("UF06F\u001b")), method3924(method3923("UF09/")), method3924(method3923("UF06/")), method3924(method3923("UF02F\u001b"))};
   @OriginalMember(
      owner = "client!fo",
      name = "Z",
      descriptor = "I"
   )
   public static int field7821;
   @OriginalMember(
      owner = "client!fo",
      name = "X",
      descriptor = "I"
   )
   public int field7822;
   @OriginalMember(
      owner = "client!fo",
      name = "ab",
      descriptor = "I"
   )
   public int field7823;
   @OriginalMember(
      owner = "client!fo",
      name = "J",
      descriptor = "I"
   )
   public static int field7825;
   @OriginalMember(
      owner = "client!fo",
      name = "N",
      descriptor = "I"
   )
   public static int field7827;
   @OriginalMember(
      owner = "client!fo",
      name = "V",
      descriptor = "I"
   )
   public int field7828;
   @OriginalMember(
      owner = "client!fo",
      name = "K",
      descriptor = "I"
   )
   public static int field7830;
   @OriginalMember(
      owner = "client!fo",
      name = "M",
      descriptor = "I"
   )
   public static int field7831;
   @OriginalMember(
      owner = "client!fo",
      name = "O",
      descriptor = "I"
   )
   public static int field7832;
   @OriginalMember(
      owner = "client!fo",
      name = "db",
      descriptor = "I"
   )
   public int field7833;
   @OriginalMember(
      owner = "client!fo",
      name = "W",
      descriptor = "I"
   )
   public static int field7834;
   @OriginalMember(
      owner = "client!fo",
      name = "cb",
      descriptor = "I"
   )
   public static int field7835;
   @OriginalMember(
      owner = "client!fo",
      name = "gb",
      descriptor = "I"
   )
   public static int field7837;
   @OriginalMember(
      owner = "client!fo",
      name = "U",
      descriptor = "I"
   )
   public static int field7838;
   @OriginalMember(
      owner = "client!fo",
      name = "bb",
      descriptor = "I"
   )
   public static int field7839;
   @OriginalMember(
      owner = "client!fo",
      name = "fb",
      descriptor = "[I"
   )
   public static int[] field7829;

   @OriginalMember(
      owner = "client!fo",
      name = "c",
      descriptor = "(ILha;)Lth;"
   )
   public final class623 method242(int arg0, class66 arg1) {
      boolean var3 = client.field4360;

      try {
         ++field7832;
         class772 var4 = class589.method4287(super.field10701, super.field10694 >> class773.field11359, super.field10693 >> class773.field11359);
         class226 var5 = class216.method1708(super.field10701, super.field10694 >> class773.field11359, super.field10693 >> class773.field11359);
         int var6 = 0;
         if (var4 != null && var4.field11352.field9210) {
            var6 = var4.field11352.method232(-121);
         }

         if (var5 != null && ~var5.field3209 < ~(-var6)) {
            var6 = -var5.field3209;
         }

         if (this.field7824 != var6) {
            super.field10697 -= this.field7824;
            this.field7824 = var6;
            super.field10697 += var6;
         }

         if (arg0 < 94) {
            return null;
         } else {
            class521 var7 = arg1.method598();
            var7.method1220();
            if (this.field7824 == 0) {
               boolean var8 = false;
               boolean var9 = false;
               boolean var10 = false;
               class295 var11 = class731.field10698[super.field10702];
               int var12 = this.field7819 << 1;
               int var14 = -var12 / 2;
               int var15 = -var12 / 2;
               int var16 = var11.method2220(super.field10693 + var15, super.field10694 + var14, -16);
               int var17 = var12 / 2;
               int var18 = -var12 / 2;
               int var19 = var11.method2220(super.field10693 + var18, super.field10694 + var17, 73);
               int var20 = -var12 / 2;
               int var21 = var12 / 2;
               int var22 = var11.method2220(super.field10693 - -var21, super.field10694 + var20, 104);
               int var23 = var12 / 2;
               int var24 = var12 / 2;
               int var25 = var11.method2220(super.field10693 + var24, super.field10694 + var23, -38);
               int var26 = var16 >= var19 ? var19 : var16;
               int var27 = var25 > var22 ? var22 : var25;
               int var28 = ~var19 <= ~var25 ? var25 : var19;
               int var29 = var22 <= var16 ? var22 : var16;
               if (~var12 != -1) {
                  int var30 = (int)(Math.atan2((double)(-var27 + var26), (double)var12) * 2607.5945876176133D) & 16383;
                  if (~var30 != -1) {
                     var7.method1228(var30);
                  }
               }

               int var31 = var16 + var25;
               if (var12 != 0) {
                  int var32 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)(var29 - var28), (double)var12));
                  if (var32 != 0) {
                     var7.method1229(-var32);
                  }
               }

               if (var31 > var19 + var22) {
                  var31 = var19 + var22;
               }

               int var33 = (var31 >> 1) + -super.field10697;
               if (var33 != 0) {
                  var7.method1215(0, var33, 0);
               }
            }

            var7.method1215(super.field10694, super.field10697 - 10, super.field10693);
            class623 var34 = class403.method3038(3, true, true);
            this.field7819 = 0;
            this.field7826 = false;
            if (~this.field7836 != 0) {
               class500 var35 = class468.field6728.method2261(-1, this.field7836).method2683(0, arg1, -1, (class651)null, -89, this.field7828, (class85)null, 0, 2048);
               if (var35 != null) {
                  label118: {
                     if (class183.field2581) {
                        var35.method182(var7, var34.field9164[2], class298.field4088, 0);
                        if (!var3) {
                           break label118;
                        }
                     }

                     var35.method192(var7, var34.field9164[2], 0);
                  }

                  this.field7826 |= var35.method222();
                  this.field7819 = var35.method225();
               }
            }

            if (~this.field7820 != 0) {
               class500 var36 = class468.field6728.method2261(-1, this.field7820).method2683(0, arg1, -1, (class651)null, -75, this.field7822, (class85)null, 0, 2048);
               if (var36 != null) {
                  label110: {
                     if (!class183.field2581) {
                        var36.method192(var7, var34.field9164[1], 0);
                        if (!var3) {
                           break label110;
                        }
                     }

                     var36.method182(var7, var34.field9164[1], class298.field4088, 0);
                  }

                  this.field7826 |= var36.method222();
                  if (~var36.method225() < ~this.field7819) {
                     this.field7819 = var36.method225();
                  }
               }
            }

            class500 var37 = class468.field6728.method2261(-1, this.field7823).method2683(0, arg1, -1, (class651)null, 81, this.field7833, (class85)null, 0, 2048);
            if (var37 != null) {
               label103: {
                  if (!class183.field2581) {
                     var37.method192(var7, var34.field9164[0], 0);
                     if (!var3) {
                        break label103;
                     }
                  }

                  var37.method182(var7, var34.field9164[0], class298.field4088, 0);
               }

               this.field7826 |= var37.method222();
               if (~var37.method225() < ~this.field7819) {
                  this.field7819 = var37.method225();
               }
            }

            return var34;
         }
      } catch (RuntimeException var39) {
         throw class237.method1823(var39, field7840[15] + arg0 + ',' + (arg1 != null ? field7840[10] : field7840[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public final void method245(class66 arg0, boolean arg1) {
      try {
         ++field7835;
         if (arg1) {
            this.field7819 = -24;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7840[11] + (arg0 != null ? field7840[10] : field7840[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "f",
      descriptor = "(B)I"
   )
   public final int method3670(byte arg0) {
      try {
         ++field7830;
         class358 var2 = class468.field6728.method2261(arg0 ^ -29, this.field7823);
         int var3 = var2.field4855;
         if (arg0 != 28) {
            method3919(35, (byte)-59, 97);
         }

         if (this.field7820 != -1) {
            class358 var4 = class468.field6728.method2261(-1, this.field7820);
            if (var3 < var4.field4855) {
               var3 = var4.field4855;
            }
         }

         if (~this.field7836 != 0) {
            class358 var5 = class468.field6728.method2261(-1, this.field7836);
            if (var3 < var5.field4855) {
               var3 = var5.field4855;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7840[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class546(int arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!fo",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method238(byte arg0) {
      try {
         if (arg0 <= 73) {
            return true;
         } else {
            ++field7838;
            return this.field7826;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7840[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method248(int arg0) {
      try {
         ++field7825;
         if (arg0 != -1) {
            this.field7828 = -63;
         }

         return this.field7819;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7840[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Lha;I)Lmk;"
   )
   public final class62 method244(class66 arg0, int arg1) {
      try {
         ++field7831;
         if (arg1 != 92160000) {
            this.method3670((byte)51);
         }

         return null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7840[13] + (arg0 != null ? field7840[10] : field7840[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IILha;I)Z"
   )
   public final boolean method251(int arg0, int arg1, class66 arg2, int arg3) {
      try {
         ++field7837;
         class521 var5 = arg2.method598();
         var5.method1217(super.field10694, super.field10697 + -10, super.field10693);
         class358 var6 = class468.field6728.method2261(arg3, this.field7823);
         class500 var7 = var6.method2683(0, arg2, arg3, (class651)null, -101, this.field7833, (class85)null, 0, 131072);
         if (var7 != null && (!class183.field2581 ? var7.method183(arg1, arg0, var5, true, var6.field4855) : var7.method206(arg1, arg0, var5, true, var6.field4855, class298.field4088))) {
            return true;
         } else {
            if (this.field7820 != -1) {
               class358 var8 = class468.field6728.method2261(-1, this.field7820);
               class500 var9 = var8.method2683(0, arg2, -1, (class651)null, 125, this.field7822, (class85)null, 0, 131072);
               if (var9 != null && (!class183.field2581 ? var9.method183(arg1, arg0, var5, true, var8.field4855) : var9.method206(arg1, arg0, var5, true, var8.field4855, class298.field4088))) {
                  return true;
               }
            }

            if (this.field7836 != -1) {
               class358 var10 = class468.field6728.method2261(arg3, this.field7836);
               class500 var11 = var10.method2683(0, arg2, -1, (class651)null, arg3 ^ 91, this.field7828, (class85)null, 0, 131072);
               if (var11 != null && (class183.field2581 ? var11.method206(arg1, arg0, var5, true, var10.field4855, class298.field4088) : var11.method183(arg1, arg0, var5, true, var10.field4855))) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field7840[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7840[10] : field7840[9]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method3919(int arg0, byte arg1, int arg2) {
      try {
         ++field7834;
         int var3 = 25 / ((arg1 - -35) / 36);
         return (1024 & arg2) != 0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7840[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3920(int arg0) {
      try {
         field7829 = null;
         if (arg0 != 0) {
            method3919(-49, (byte)-9, 117);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7840[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method232(int arg0) {
      try {
         ++field7827;
         if (arg0 >= -88) {
            this.field7833 = 99;
         }

         return -10;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7840[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(ZZ)Z"
   )
   public static boolean method3921(boolean arg0, boolean arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7840[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "h",
      descriptor = "(B)Z"
   )
   public final boolean method253(byte arg0) {
      try {
         int var2 = -98 % ((-84 - arg0) / 38);
         ++field7839;
         return false;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7840[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(B)Ldba;"
   )
   public static final class102 method3922(byte arg0) {
      try {
         ++field7821;
         if (arg0 != 58) {
            return null;
         } else {
            try {
               return (class102)Class.forName(field7840[2]).newInstance();
            } catch (Throwable var2) {
               return null;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7840[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3923(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3924(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
