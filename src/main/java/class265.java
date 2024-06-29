import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class265 extends class626 {
   @OriginalMember(
      owner = "client!ok",
      name = "S",
      descriptor = "I"
   )
   public int field3753 = -1;
   @OriginalMember(
      owner = "client!ok",
      name = "Z",
      descriptor = "I"
   )
   private int field3759 = 0;
   @OriginalMember(
      owner = "client!ok",
      name = "bb",
      descriptor = "I"
   )
   public int field3763 = -1;
   @OriginalMember(
      owner = "client!ok",
      name = "U",
      descriptor = "Z"
   )
   private boolean field3758 = false;
   @OriginalMember(
      owner = "client!ok",
      name = "db",
      descriptor = "I"
   )
   public int field3770 = 0;
   @OriginalMember(
      owner = "client!ok",
      name = "mb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3779 = new String[]{method2119(method2118("s\u0011\u00125T")), method2119(method2118("r\u000fP\u0013")), method2119(method2118("s\u0011\u0012,T")), method2119(method2118("gT\u0012Q\u0001")), method2119(method2118("s\u0011\u0012)T")), method2119(method2118("s\u0011\u00124T")), method2119(method2118("s\u0011\u00126T")), method2119(method2118("s\u0011\u00123T")), method2119(method2118("s\u0011\u0012<=4")), method2119(method2118("s\u0011\u00128T")), method2119(method2118("s\u0011\u0012*T")), method2119(method2118("s\u0011\u00127T")), method2119(method2118("s\u0011\u00129T")), method2119(method2118("s\u0011\u0012.T"))};
   @OriginalMember(
      owner = "client!ok",
      name = "Y",
      descriptor = "Lgh;"
   )
   public static class572 field3769 = new class572(118, 6);
   @OriginalMember(
      owner = "client!ok",
      name = "V",
      descriptor = "[S"
   )
   public static short[] field3774 = new short[]{5, 12, 30, 25, 9, 2, 15, 10};
   @OriginalMember(
      owner = "client!ok",
      name = "lb",
      descriptor = "I"
   )
   public static int field3775 = 0;
   @OriginalMember(
      owner = "client!ok",
      name = "Q",
      descriptor = "[Lke;"
   )
   public static class622[] field3778 = new class622[8];
   @OriginalMember(
      owner = "client!ok",
      name = "B",
      descriptor = "I"
   )
   public int field3754;
   @OriginalMember(
      owner = "client!ok",
      name = "eb",
      descriptor = "I"
   )
   public static int field3755;
   @OriginalMember(
      owner = "client!ok",
      name = "kb",
      descriptor = "I"
   )
   public int field3756;
   @OriginalMember(
      owner = "client!ok",
      name = "W",
      descriptor = "I"
   )
   public static int field3757;
   @OriginalMember(
      owner = "client!ok",
      name = "ab",
      descriptor = "I"
   )
   public static int field3760;
   @OriginalMember(
      owner = "client!ok",
      name = "ib",
      descriptor = "I"
   )
   public static int field3761;
   @OriginalMember(
      owner = "client!ok",
      name = "R",
      descriptor = "I"
   )
   public static int field3762;
   @OriginalMember(
      owner = "client!ok",
      name = "cb",
      descriptor = "I"
   )
   public static int field3764;
   @OriginalMember(
      owner = "client!ok",
      name = "X",
      descriptor = "I"
   )
   public static int field3765;
   @OriginalMember(
      owner = "client!ok",
      name = "P",
      descriptor = "I"
   )
   public static int field3766;
   @OriginalMember(
      owner = "client!ok",
      name = "G",
      descriptor = "I"
   )
   public static int field3767;
   @OriginalMember(
      owner = "client!ok",
      name = "hb",
      descriptor = "I"
   )
   public int field3768;
   @OriginalMember(
      owner = "client!ok",
      name = "fb",
      descriptor = "I"
   )
   public int field3771;
   @OriginalMember(
      owner = "client!ok",
      name = "O",
      descriptor = "I"
   )
   public static int field3772;
   @OriginalMember(
      owner = "client!ok",
      name = "jb",
      descriptor = "I"
   )
   public static int field3773;
   @OriginalMember(
      owner = "client!ok",
      name = "T",
      descriptor = "I"
   )
   public static int field3776;
   @OriginalMember(
      owner = "client!ok",
      name = "gb",
      descriptor = "[I"
   )
   public static int[] field3777;

   @OriginalMember(
      owner = "client!ok",
      name = "e",
      descriptor = "(B)Z",
      line = 4
   )
   public final boolean method593(byte arg0) {
      try {
         if (arg0 != -94) {
            return false;
         } else {
            ++field3767;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3779[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "f",
      descriptor = "(I)I",
      line = 18
   )
   public final int method2114(int arg0) {
      try {
         if (arg0 != 9549) {
            this.field3763 = -59;
         }

         ++field3773;
         class439 var2 = class408.field5993.method845((byte)-113, this.field3768);
         int var3 = var2.field6377;
         if (this.field3753 != -1) {
            class439 var4 = class408.field5993.method845((byte)113, this.field3753);
            if (~var3 > ~var4.field6377) {
               var3 = var4.field6377;
            }
         }

         if (this.field3763 != -1) {
            class439 var5 = class408.field5993.method845((byte)-28, this.field3763);
            if (var3 < var5.field6377) {
               var3 = var5.field6377;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3779[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "<init>",
      descriptor = "(IIIII)V",
      line = 380
   )
   public class265(int arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!ok",
      name = "c",
      descriptor = "(Lha;I)Lpca;",
      line = 58
   )
   public final class744 method586(class65 arg0, int arg1) {
      try {
         ++field3761;
         return arg1 != 0 ? null : null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3779[4] + (arg0 != null ? field3779[3] : field3779[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(I)V",
      line = 69
   )
   public static void method2115(int arg0) {
      try {
         field3777 = null;
         field3769 = null;
         field3774 = null;
         field3778 = null;
         if (arg0 != -1) {
            field3775 = 17;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3779[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "f",
      descriptor = "(B)I",
      line = 83
   )
   public final int method590(byte arg0) {
      try {
         ++field3762;
         if (arg0 != -79) {
            this.method589(25);
         }

         return this.field3759;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3779[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "e",
      descriptor = "(I)Z",
      line = 95
   )
   public final boolean method588(int arg0) {
      try {
         if (arg0 != 1) {
            method2115(85);
         }

         ++field3766;
         return this.field3758;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3779[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(IZI)Z",
      line = 106
   )
   public static final boolean method2116(int arg0, boolean arg1, int arg2) {
      try {
         ++field3772;
         if (arg1) {
            method2115(-116);
         }

         if (!(class450.method3392((byte)-61, arg0, arg2) | ~(65536 & arg0) != -1) && !class675.method4933(111, arg0, arg2)) {
            return (55 & arg2) == 0 && class455.method3422(125, arg0, arg2);
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3779[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "j",
      descriptor = "(I)I",
      line = 122
   )
   public static final int method2117(int arg0) {
      try {
         if (arg0 != 30) {
            return -83;
         } else {
            ++field3764;
            return class442.field6447++;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3779[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(ILha;)Lbv;",
      line = 134
   )
   public final class321 method599(int arg0, class65 arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3757;
         class533 var4 = class132.method1260(super.field4090, super.field4101 >> class76.field1336, super.field4096 >> class76.field1336);
         class417 var5 = class439.method3309(super.field4090, super.field4101 >> class76.field1336, super.field4096 >> class76.field1336);
         int var6 = 0;
         if (var4 != null && var4.field7766.field2349) {
            var6 = var4.field7766.method589(19053);
         }

         if (var5 != null && var5.field6097 > -var6) {
            var6 = -var5.field6097;
         }

         if (this.field3770 != var6) {
            super.field4097 -= this.field3770;
            this.field3770 = var6;
            super.field4097 += var6;
         }

         class173 var7 = arg1.method255();
         var7.method979();
         if (~this.field3770 == -1) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            class293 var11 = class269.field3810[super.field4091];
            int var12 = this.field3759 << 1;
            int var14 = -var12 / 2;
            int var15 = -var12 / 2;
            int var16 = var11.method2287(-68, super.field4096 - -var15, super.field4101 + var14);
            int var17 = var12 / 2;
            int var18 = -var12 / 2;
            int var19 = var11.method2287(111, super.field4096 - -var18, super.field4101 - -var17);
            int var20 = -var12 / 2;
            int var21 = var12 / 2;
            int var22 = var11.method2287(83, super.field4096 + var21, super.field4101 - -var20);
            int var23 = var12 / 2;
            int var24 = var12 / 2;
            int var25 = var11.method2287(-63, super.field4096 + var24, super.field4101 + var23);
            int var26 = var19 > var16 ? var16 : var19;
            int var27 = ~var25 >= ~var22 ? var25 : var22;
            int var28 = var19 < var25 ? var19 : var25;
            int var29 = var22 <= var16 ? var22 : var16;
            if (var12 != 0) {
               int var30 = (int)(2607.5945876176133D * Math.atan2((double)(-var27 + var26), (double)var12)) & 16383;
               if (~var30 != -1) {
                  var7.method998(var30);
               }
            }

            if (var12 != 0) {
               int var31 = 16383 & (int)(Math.atan2((double)(-var28 + var29), (double)var12) * 2607.5945876176133D);
               if (~var31 != -1) {
                  var7.method1015(-var31);
               }
            }

            int var32 = var16 + var25;
            if (~(var19 + var22) > ~var32) {
               var32 = var19 + var22;
            }

            int var33 = (var32 >> 1) + -super.field4097;
            if (~var33 != -1) {
               var7.method990(0, var33, 0);
            }
         }

         var7.method990(super.field4101, super.field4097 + -10, super.field4096);
         class321 var34 = class625.method4582(3, 0, true);
         this.field3758 = false;
         this.field3759 = 0;
         if (this.field3763 != -1) {
            class495 var35 = class408.field5993.method845((byte)73, this.field3763).method3293(this.field3756, 0, -1, 0, 2048, (class295)null, (class212)null, 0, arg1);
            if (var35 != null) {
               label115: {
                  if (class679.field9962) {
                     var35.method552(var7, var34.field4630[2], class75.field1316, 0);
                     if (!var3) {
                        break label115;
                     }
                  }

                  var35.method503(var7, var34.field4630[2], 0);
               }

               this.field3758 |= var35.method516();
               this.field3759 = var35.method548();
            }
         }

         if (this.field3753 != -1) {
            class495 var36 = class408.field5993.method845((byte)55, this.field3753).method3293(this.field3771, 0, -1, 0, 2048, (class295)null, (class212)null, arg0 ^ 50, arg1);
            if (var36 != null) {
               label107: {
                  if (!class679.field9962) {
                     var36.method503(var7, var34.field4630[1], 0);
                     if (!var3) {
                        break label107;
                     }
                  }

                  var36.method552(var7, var34.field4630[1], class75.field1316, 0);
               }

               this.field3758 |= var36.method516();
               if (var36.method548() > this.field3759) {
                  this.field3759 = var36.method548();
               }
            }
         }

         class495 var37 = class408.field5993.method845((byte)-111, this.field3768).method3293(this.field3754, 0, -1, 0, 2048, (class295)null, (class212)null, arg0 ^ arg0, arg1);
         if (var37 != null) {
            label100: {
               if (class679.field9962) {
                  var37.method552(var7, var34.field4630[0], class75.field1316, 0);
                  if (!var3) {
                     break label100;
                  }
               }

               var37.method503(var7, var34.field4630[0], 0);
            }

            this.field3758 |= var37.method516();
            if (~var37.method548() < ~this.field3759) {
               this.field3759 = var37.method548();
            }
         }

         return var34;
      } catch (RuntimeException var39) {
         throw class608.method4462(var39, field3779[2] + arg0 + ',' + (arg1 != null ? field3779[3] : field3779[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "c",
      descriptor = "(I)I",
      line = 302
   )
   public final int method589(int arg0) {
      try {
         ++field3765;
         if (arg0 != 19053) {
            this.method588(67);
         }

         return -10;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3779[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(ZLha;)V",
      line = 318
   )
   public final void method598(boolean arg0, class65 arg1) {
      try {
         if (arg0) {
            ++field3755;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3779[7] + arg0 + ',' + (arg1 != null ? field3779[3] : field3779[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(IIILha;)Z",
      line = 338
   )
   public final boolean method582(int arg0, int arg1, int arg2, class65 arg3) {
      try {
         ++field3760;
         class173 var5 = arg3.method255();
         var5.method1008(super.field4101, super.field4097 + -10, super.field4096);
         class439 var6 = class408.field5993.method845((byte)72, this.field3768);
         int var7 = 21 % ((-53 - arg2) / 63);
         class495 var8 = var6.method3293(this.field3754, 0, -1, 0, 131072, (class295)null, (class212)null, 0, arg3);
         if (var8 != null && (class679.field9962 ? var8.method551(arg1, arg0, var5, true, var6.field6377, class75.field1316) : var8.method521(arg1, arg0, var5, true, var6.field6377))) {
            return true;
         } else {
            if (~this.field3753 != 0) {
               class439 var9 = class408.field5993.method845((byte)-78, this.field3753);
               class495 var10 = var9.method3293(this.field3771, 0, -1, 0, 131072, (class295)null, (class212)null, 0, arg3);
               if (var10 != null && (!class679.field9962 ? var10.method521(arg1, arg0, var5, true, var9.field6377) : var10.method551(arg1, arg0, var5, true, var9.field6377, class75.field1316))) {
                  return true;
               }
            }

            if (~this.field3763 != 0) {
               class439 var11 = class408.field5993.method845((byte)-57, this.field3763);
               class495 var12 = var11.method3293(this.field3756, 0, -1, 0, 131072, (class295)null, (class212)null, 0, arg3);
               if (var12 != null && (class679.field9962 ? var12.method551(arg1, arg0, var5, true, var11.field6377, class75.field1316) : var12.method521(arg1, arg0, var5, true, var11.field6377))) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field3779[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3779[3] : field3779[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
