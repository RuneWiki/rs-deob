import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class647 extends class690 {
   @OriginalMember(
      owner = "client!aaa",
      name = "n",
      descriptor = "I"
   )
   private int field9064 = -1;
   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9069 = new String[]{method4663(method4662("w\u0015\u000e\u001b\u0000rHS")), method4663(method4662("w\u0015\r\u001b\u0000rHS")), method4663(method4662("e\u0015\r\u001b\u0000rHS")), method4663(method4662("fE^j$/")), method4663(method4662("iQS(")), method4663(method4662("|\n\u0011j\u001b")), method4663(method4662("oV\u0005(\u0014")), method4663(method4662("fE^j'/")), method4663(method4662("fE^j /")), method4663(method4662("fE^j%/")), method4663(method4662("fE^j\"/")), method4663(method4662("fE^j#/"))};
   @OriginalMember(
      owner = "client!aaa",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field9062 = false;
   @OriginalMember(
      owner = "client!aaa",
      name = "r",
      descriptor = "I"
   )
   public static int field9061;
   @OriginalMember(
      owner = "client!aaa",
      name = "p",
      descriptor = "I"
   )
   public static int field9063;
   @OriginalMember(
      owner = "client!aaa",
      name = "o",
      descriptor = "I"
   )
   public static int field9065;
   @OriginalMember(
      owner = "client!aaa",
      name = "s",
      descriptor = "I"
   )
   public static int field9066;
   @OriginalMember(
      owner = "client!aaa",
      name = "q",
      descriptor = "I"
   )
   public static int field9067;
   @OriginalMember(
      owner = "client!aaa",
      name = "m",
      descriptor = "I"
   )
   public static int field9068;

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(BLme;I)Z"
   )
   public static final boolean method4658(byte arg0, class206 arg1, int arg2) {
      try {
         ++field9067;
         if (arg0 <= 118) {
            method4658((byte)-20, (class206)null, -102);
         }

         int var3 = arg1.method1566(2, -12869);
         if (var3 == 0) {
            if (~arg1.method1566(1, -12869) != -1) {
               method4658((byte)124, arg1, arg2);
            }

            int var4 = arg1.method1566(6, -12869);
            int var5 = arg1.method1566(6, -12869);
            boolean var6 = arg1.method1566(1, -12869) == 1;
            if (var6) {
               class484.field6676[class173.field2159++] = arg2;
            }

            if (class136.field1773[arg2] != null) {
               throw new RuntimeException(field9069[6]);
            } else {
               class662 var7 = class56.field608[arg2];
               class404 var8 = class136.field1773[arg2] = new class404();
               var8.field7843 = arg2;
               if (class731.field10708[arg2] != null) {
                  var8.method3055(class731.field10708[arg2], 116);
               }

               var8.method4077(var7.field9437, 1, true);
               var8.field7780 = var7.field9440;
               int var9 = var7.field9441;
               int var10 = var9 >> 28;
               int var11 = (4189914 & var9) >> 14;
               int var12 = 255 & var9;
               int var13 = (var11 << 6) + var4 + -class752.field10921;
               int var14 = (var12 << 6) - -var5 + -class17.field237;
               var8.field5689 = var7.field9438;
               var8.field5691 = var7.field9439;
               var8.field7854[0] = class394.field5562[arg2];
               var8.field1001 = var8.field1005 = (byte)var10;
               if (class407.method3090(var13, 1, var14)) {
                  ++var8.field1005;
               }

               var8.method3056(var13, 48, var14);
               var8.field5659 = false;
               class56.field608[arg2] = null;
               return true;
            }
         } else if (var3 == 1) {
            int var15 = arg1.method1566(2, -12869);
            int var16 = class56.field608[arg2].field9441;
            class56.field608[arg2].field9441 = (805306368 & (var16 >> 28) + var15 << 28) + (268435455 & var16);
            return false;
         } else if (var3 == 2) {
            int var17 = arg1.method1566(5, -12869);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class56.field608[arg2].field9441;
            int var21 = 3 & (var20 >> 28) + var18;
            int var22 = 255 & var20 >> 14;
            int var23 = var20 & 255;
            if (var19 == 0) {
               --var23;
               --var22;
            }

            if (var19 == 1) {
               --var23;
            }

            if (~var19 == -3) {
               ++var22;
               --var23;
            }

            if (var19 == 3) {
               --var22;
            }

            if (~var19 == -5) {
               ++var22;
            }

            if (var19 == 5) {
               --var22;
               ++var23;
            }

            if (~var19 == -7) {
               ++var23;
            }

            if (~var19 == -8) {
               ++var22;
               ++var23;
            }

            class56.field608[arg2].field9441 = (var21 << 28) + (var22 << 14) - -var23;
            return false;
         } else {
            int var24 = arg1.method1566(18, -12869);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 255;
            int var27 = var24 & 255;
            int var28 = class56.field608[arg2].field9441;
            int var29 = 3 & (var28 >> 28) + var25;
            int var30 = 255 & (var28 >> 14) + var26;
            int var31 = var27 + var28 & 255;
            class56.field608[arg2].field9441 = (var29 << 28) + (var30 << 14) + var31;
            return false;
         }
      } catch (RuntimeException var33) {
         throw class534.method3846(var33, field9069[7] + arg0 + ',' + (arg1 != null ? field9069[5] : field9069[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(ILjava/lang/String;)J"
   )
   public static final long method4659(int arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field9065;
         if (arg0 >= -101) {
            field9062 = false;
         }

         long var3;
         label106: {
            var3 = 0L;
            int var5 = arg1.length();
            int var6 = 0;
            if (var2) {
               var3 *= 37L;
            } else if (var6 >= var5) {
               if (!var2) {
                  if (var2) {
                     var3 /= 37L;
                  }
                  break label106;
               }
            } else {
               var3 *= 37L;
            }

            while(true) {
               label123: {
                  char var7 = arg1.charAt(var6);
                  if (var7 >= 'A' && ~var7 >= -91) {
                     var3 += (long)(var7 + 1 - 65);
                     if (!var2) {
                        break label123;
                     }
                  }

                  if (~var7 > -98 || ~var7 < -123) {
                     if (var7 < '0' || var7 > '9') {
                        break label123;
                     }

                     var3 += (long)(var7 + 27 - 48);
                     if (!var2) {
                        break label123;
                     }
                  }

                  var3 += (long)(var7 + 1 + -97);
               }

               if (var3 >= 177917621779460413L) {
                  if (!var2) {
                     break;
                  }

                  ++var6;
               } else {
                  ++var6;
               }

               if (var6 >= var5) {
                  if (!var2) {
                     if (var2) {
                        var3 /= 37L;
                     }
                     break;
                  }
               } else {
                  var3 *= 37L;
               }
            }
         }

         long var10000;
         while(~(var3 % 37L) == -1L) {
            var10000 = ~var3;
            if (var2) {
               return var10000;
            }

            if (var10000 == -1L) {
               break;
            }

            var3 /= 37L;
         }

         var10000 = var3;
         return var10000;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9069[11] + arg0 + ',' + (arg1 != null ? field9069[5] : field9069[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(Lqh;I)V"
   )
   public static final void method4660(class74 arg0, int arg1) {
      try {
         if (arg1 != -595791044) {
            method4658((byte)-89, (class206)null, 56);
         }

         class465.field6382 = arg0.method740(arg1 + 595791043, field9069[0]);
         ++field9063;
         class167.field2112 = arg0.method740(-1, field9069[1]);
         class18.field245 = arg0.method740(arg1 + 595791043, field9069[2]);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9069[3] + (arg0 != null ? field9069[5] : field9069[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         ++field9068;
         if (arg1 > -19) {
            field9062 = false;
         }

         this.field9064 = arg0.method4280(-19104);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9069[10] + (arg0 != null ? field9069[5] : field9069[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         if (arg0) {
            field9062 = false;
         }

         arg1.method1183(this.field9064, (byte)115);
         ++field9061;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9069[9] + arg0 + ',' + (arg1 != null ? field9069[5] : field9069[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4661(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field9066;
         class468 var2 = null;

         try {
            class289 var3 = class61.field671.method1946("", true, (byte)107);
            if (var1) {
               class173.method1347(75, 1L);
            }

            while(true) {
               int var10000;
               if (~var3.field3826 != -1) {
                  var10000 = ~var3.field3826;
                  if (!var1) {
                     if (var10000 == -2) {
                        var2 = (class468)var3.field3830;
                        class594 var4 = class674.field9907.method4415(-118);
                        var2.method3430(0, var4.field8243, var4.field8227, (byte)126);
                     }
                     break;
                  }
               } else {
                  var10000 = 75;
               }

               class173.method1347(var10000, 1L);
            }
         } catch (Exception var8) {
         }

         try {
            if (var2 != null) {
               var2.method3435(false);
            }
         } catch (Exception var7) {
         }

         int var5 = 1 / ((49 - arg0) / 38);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9069[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4662(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4663(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
