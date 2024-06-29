import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class219 extends class247 {
   @OriginalMember(
      owner = "client!rea",
      name = "H",
      descriptor = "I"
   )
   private int field2713 = 0;
   @OriginalMember(
      owner = "client!rea",
      name = "N",
      descriptor = "Z"
   )
   private boolean field2719 = false;
   @OriginalMember(
      owner = "client!rea",
      name = "P",
      descriptor = "I"
   )
   public int field2715 = -1;
   @OriginalMember(
      owner = "client!rea",
      name = "K",
      descriptor = "I"
   )
   public int field2727 = 0;
   @OriginalMember(
      owner = "client!rea",
      name = "J",
      descriptor = "I"
   )
   public int field2728 = -1;
   @OriginalMember(
      owner = "client!rea",
      name = "eb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2736 = new String[]{method1664(method1663(")fs7\u0005s")), method1664(method1663("5v~u")), method1664(method1663(" -<7-")), method1664(method1663(")fs7\u0012s")), method1664(method1663(")fs7\u0016s")), method1664(method1663("?v\u007ft)")), method1664(method1663(")fs7\u0019s")), method1664(method1663(")fs7\u001ds")), method1664(method1663(")fs7\u001cs")), method1664(method1663(")fs7\u0002s")), method1664(method1663(")fs7\u0018\u001a+")), method1664(method1663(")fs7\u0001s")), method1664(method1663(")fs7\u0007s")), method1664(method1663(")fs7\u0011s")), method1664(method1663(")fs7\u0013s"))};
   @OriginalMember(
      owner = "client!rea",
      name = "db",
      descriptor = "Luk;"
   )
   public static class273 field2733 = new class273();
   @OriginalMember(
      owner = "client!rea",
      name = "L",
      descriptor = "I"
   )
   public static int field2735 = 0;
   @OriginalMember(
      owner = "client!rea",
      name = "R",
      descriptor = "F"
   )
   public static float field2734;
   @OriginalMember(
      owner = "client!rea",
      name = "I",
      descriptor = "I"
   )
   public static int field2714;
   @OriginalMember(
      owner = "client!rea",
      name = "Q",
      descriptor = "I"
   )
   public static int field2716;
   @OriginalMember(
      owner = "client!rea",
      name = "Y",
      descriptor = "I"
   )
   public static int field2717;
   @OriginalMember(
      owner = "client!rea",
      name = "cb",
      descriptor = "I"
   )
   public static int field2718;
   @OriginalMember(
      owner = "client!rea",
      name = "bb",
      descriptor = "I"
   )
   public static int field2720;
   @OriginalMember(
      owner = "client!rea",
      name = "T",
      descriptor = "I"
   )
   public static int field2721;
   @OriginalMember(
      owner = "client!rea",
      name = "M",
      descriptor = "I"
   )
   public int field2722;
   @OriginalMember(
      owner = "client!rea",
      name = "S",
      descriptor = "I"
   )
   public static int field2723;
   @OriginalMember(
      owner = "client!rea",
      name = "X",
      descriptor = "I"
   )
   public static int field2724;
   @OriginalMember(
      owner = "client!rea",
      name = "U",
      descriptor = "I"
   )
   public static int field2725;
   @OriginalMember(
      owner = "client!rea",
      name = "W",
      descriptor = "I"
   )
   public int field2726;
   @OriginalMember(
      owner = "client!rea",
      name = "V",
      descriptor = "I"
   )
   public int field2729;
   @OriginalMember(
      owner = "client!rea",
      name = "O",
      descriptor = "I"
   )
   public static int field2730;
   @OriginalMember(
      owner = "client!rea",
      name = "Z",
      descriptor = "I"
   )
   public static int field2731;
   @OriginalMember(
      owner = "client!rea",
      name = "ab",
      descriptor = "I"
   )
   public int field2732;

   @OriginalMember(
      owner = "client!rea",
      name = "c",
      descriptor = "(ZLha;)Lwia;"
   )
   public final class794 method770(boolean arg0, class65 arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2714;
         class752 var4 = class576.method4143(super.field1001, super.field999 >> class76.field965, super.field1003 >> class76.field965);
         class525 var5 = class270.method2064(super.field1001, super.field999 >> class76.field965, super.field1003 >> class76.field965);
         int var6 = 0;
         if (var4 != null && var4.field10922.field542) {
            var6 = var4.field10922.method782(116);
         }

         if (var5 != null && -var6 < var5.field7186) {
            var6 = -var5.field7186;
         }

         if (~this.field2727 != ~var6) {
            super.field998 -= this.field2727;
            super.field998 += var6;
            this.field2727 = var6;
         }

         class17 var7 = arg1.method600();
         var7.method145();
         if (this.field2727 == 0) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            class295 var11 = class93.field1241[super.field1005];
            int var12 = this.field2713 << 1;
            int var14 = -var12 / 2;
            int var15 = -var12 / 2;
            int var16 = var11.method2220(125, super.field999 + var14, super.field1003 + var15);
            int var17 = var12 / 2;
            int var18 = -var12 / 2;
            int var19 = var11.method2220(125, super.field999 + var17, super.field1003 + var18);
            int var20 = -var12 / 2;
            int var21 = var12 / 2;
            int var22 = var11.method2220(125, super.field999 + var20, super.field1003 + var21);
            int var23 = var12 / 2;
            int var24 = var12 / 2;
            int var25 = var11.method2220(121, super.field999 + var23, super.field1003 + var24);
            int var26 = ~var16 > ~var19 ? var16 : var19;
            int var27 = ~var22 > ~var25 ? var22 : var25;
            int var28 = ~var25 < ~var19 ? var19 : var25;
            if (var12 != 0) {
               int var29 = (int)(Math.atan2((double)(var26 - var27), (double)var12) * 2607.5945876176133D) & 16383;
               if (~var29 != -1) {
                  var7.method140(var29);
               }
            }

            int var30 = ~var22 < ~var16 ? var16 : var22;
            if (~var12 != -1) {
               int var31 = (int)(2607.5945876176133D * Math.atan2((double)(-var28 + var30), (double)var12)) & 16383;
               if (var31 != 0) {
                  var7.method144(-var31);
               }
            }

            int var32 = var16 - -var25;
            if (~(var19 + var22) > ~var32) {
               var32 = var19 - -var22;
            }

            int var33 = (var32 >> 1) + -super.field998;
            if (~var33 != -1) {
               var7.method154(0, var33, 0);
            }
         }

         var7.method154(super.field999, super.field998 + -10, super.field1003);
         class794 var34 = class625.method4546(0, 3, true);
         this.field2719 = arg0;
         this.field2713 = 0;
         if (~this.field2715 != 0) {
            class501 var35 = class645.field9054.method485(0, this.field2715).method2001((class648)null, !arg0, 2048, (class61)null, -1, 0, this.field2729, arg1, 0);
            if (var35 != null) {
               label120: {
                  if (class33.field392) {
                     var35.method321(var7, var34.field11601[2], class334.field4784, 0);
                     if (!var3) {
                        break label120;
                     }
                  }

                  var35.method370(var7, var34.field11601[2], 0);
               }

               this.field2719 |= var35.method328();
               this.field2713 = var35.method369();
            }
         }

         if (this.field2728 != -1) {
            class501 var36 = class645.field9054.method485(0, this.field2728).method2001((class648)null, true, 2048, (class61)null, -1, 0, this.field2732, arg1, 0);
            if (var36 != null) {
               label112: {
                  if (!class33.field392) {
                     var36.method370(var7, var34.field11601[1], 0);
                     if (!var3) {
                        break label112;
                     }
                  }

                  var36.method321(var7, var34.field11601[1], class334.field4784, 0);
               }

               this.field2719 |= var36.method328();
               if (~var36.method369() < ~this.field2713) {
                  this.field2713 = var36.method369();
               }
            }
         }

         class501 var37 = class645.field9054.method485(0, this.field2722).method2001((class648)null, true, 2048, (class61)null, -1, 0, this.field2726, arg1, 0);
         if (var37 != null) {
            label105: {
               if (class33.field392) {
                  var37.method321(var7, var34.field11601[0], class334.field4784, 0);
                  if (!var3) {
                     break label105;
                  }
               }

               var37.method370(var7, var34.field11601[0], 0);
            }

            this.field2719 |= var37.method328();
            if (~var37.method369() < ~this.field2713) {
               this.field2713 = var37.method369();
            }
         }

         return var34;
      } catch (RuntimeException var39) {
         throw class534.method3846(var39, field2736[0] + arg0 + ',' + (arg1 != null ? field2736[2] : field2736[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public final void method776(byte arg0, class65 arg1) {
      try {
         ++field2718;
         if (arg0 != 36) {
            this.field2726 = 125;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2736[8] + arg0 + ',' + (arg1 != null ? field2736[2] : field2736[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "g",
      descriptor = "(I)I"
   )
   public final int method782(int arg0) {
      try {
         ++field2724;
         if (arg0 <= 43) {
            this.field2728 = 16;
         }

         return -10;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2736[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class219(int arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method772(boolean arg0) {
      try {
         if (!arg0) {
            return 87;
         } else {
            ++field2717;
            class261 var2 = class645.field9054.method485(0, this.field2722);
            int var3 = var2.field3385;
            if (~this.field2728 != 0) {
               class261 var4 = class645.field9054.method485(0, this.field2728);
               if (~var3 > ~var4.field3385) {
                  var3 = var4.field3385;
               }
            }

            if (~this.field2715 != 0) {
               class261 var5 = class645.field9054.method485(0, this.field2715);
               if (var5.field3385 > var3) {
                  var3 = var5.field3385;
               }
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2736[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method780(int arg0) {
      try {
         ++field2720;
         if (arg0 < 7) {
            this.field2715 = 73;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2736[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(ILbj;Ljava/lang/Object;)V"
   )
   public static final void method1660(int arg0, class255 arg1, Object arg2) {
      boolean var3 = client.field4273;

      try {
         ++field2730;
         if (arg1.field3241 != null) {
            if (arg0 == -27299) {
               int var4 = 0;
               if (var3) {
                  class173.method1347(91, 1L);
                  ++var4;
               }

               Object var10000;
               boolean var10001;
               while(true) {
                  if (var4 >= 50) {
                     try {
                        var10000 = arg2;
                        break;
                     } catch (Exception var8) {
                        var10001 = false;
                        return;
                     }
                  }

                  var10000 = arg1.field3241.peekEvent();
                  if (var3) {
                     break;
                  }

                  if (var10000 == null) {
                     try {
                        var10000 = arg2;
                        break;
                     } catch (Exception var7) {
                        var10001 = false;
                        return;
                     }
                  }

                  class173.method1347(91, 1L);
                  ++var4;
               }

               try {
                  if (var10000 != null) {
                     arg1.field3241.postEvent(new ActionEvent(arg2, 1001, field2736[5]));
                  }
               } catch (Exception var6) {
                  var10001 = false;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field2736[4] + arg0 + ',' + (arg1 != null ? field2736[2] : field2736[1]) + ',' + (arg2 != null ? field2736[2] : field2736[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "i",
      descriptor = "(I)I"
   )
   public final int method773(int arg0) {
      try {
         ++field2723;
         if (arg0 != -1) {
            method1660(33, (class255)null, (Object)null);
         }

         return this.field2713;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2736[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1661(int arg0) {
      try {
         field2733 = null;
         int var1 = 80 / ((45 - arg0) / 50);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2736[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public final boolean method774(int arg0, int arg1, int arg2, class65 arg3) {
      try {
         ++field2716;
         class17 var5 = arg3.method600();
         var5.method143(super.field999, super.field998 + -10, super.field1003);
         class261 var6 = class645.field9054.method485(0, this.field2722);
         class501 var7 = var6.method2001((class648)null, true, 131072, (class61)null, -1, 0, this.field2726, arg3, 0);
         if (var7 != null && (!class33.field392 ? var7.method339(arg0, arg1, var5, true, var6.field3385) : var7.method363(arg0, arg1, var5, true, var6.field3385, class334.field4784))) {
            return true;
         } else {
            if (~this.field2728 != 0) {
               class261 var8 = class645.field9054.method485(0, this.field2728);
               class501 var9 = var8.method2001((class648)null, true, 131072, (class61)null, -1, 0, this.field2732, arg3, 0);
               if (var9 != null && (class33.field392 ? var9.method363(arg0, arg1, var5, true, var8.field3385, class334.field4784) : var9.method339(arg0, arg1, var5, true, var8.field3385))) {
                  return true;
               }
            }

            if (this.field2715 != -1) {
               class261 var10 = class645.field9054.method485(0, this.field2715);
               class501 var11 = var10.method2001((class648)null, true, 131072, (class61)null, -1, 0, this.field2729, arg3, 0);
               if (var11 != null && (class33.field392 ? var11.method363(arg0, arg1, var5, true, var10.field3385, class334.field4784) : var11.method339(arg0, arg1, var5, true, var10.field3385))) {
                  return true;
               }
            }

            int var12 = -27 / ((-2 - arg2) / 39);
            return false;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field2736[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2736[2] : field2736[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method1662(boolean arg0) {
      try {
         class616.field8589 = null;
         if (!arg0) {
            field2733 = null;
         }

         ++field2725;
         class209.field2584 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2736[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method775(int arg0) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field2721;
            return this.field2719;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2736[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(Lha;I)Loi;"
   )
   public final class79 method779(class65 arg0, int arg1) {
      try {
         ++field2731;
         if (arg1 != 0) {
            field2734 = -1.1341721F;
         }

         return null;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2736[12] + (arg0 != null ? field2736[2] : field2736[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1663(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1664(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
