import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class563 extends class500 {
   @OriginalMember(
      owner = "client!tp",
      name = "m",
      descriptor = "I"
   )
   public int field7698;
   @OriginalMember(
      owner = "client!tp",
      name = "l",
      descriptor = "I"
   )
   public int field7695;
   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7699 = new String[]{method4048(method4047("k;*4Dq\"p6\u0005")), method4048(method4047("?f:(\u0011|$h5Ky-b8\u001d!")), method4048(method4047("?c")), method4048(method4047("q>hd")), method4048(method4047("k;*I\u0005")), method4048(method4047("#(kd\u0010y-bn\u001d/u")), method4048(method4047("de*&P")), method4048(method4047("k;*J\u0005"))};
   @OriginalMember(
      owner = "client!tp",
      name = "j",
      descriptor = "I"
   )
   public static int field7696;
   @OriginalMember(
      owner = "client!tp",
      name = "k",
      descriptor = "I"
   )
   public static int field7697;

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4045(int arg0) {
      try {
         class766.field11046 = -1;
         if (arg0 <= -67) {
            class619.field8658 = 1;
            class604.field8418 = class605.field8473;
            ++field7696;
            class396.method3008(class762.field11020.equals(""), class762.field11020, (byte)-86, true, "");
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7699[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(Lpl;BZ)V"
   )
   public static final void method4046(class680 arg0, byte arg1, boolean arg2) {
      boolean var3 = client.field4273;

      try {
         ++field7697;
         if (class234.field2899 < 400) {
            class392 var4 = arg0.field9989;
            String var5 = arg0.field9972;
            if (var4.field5516 != null) {
               var4 = var4.method2986(102, class259.field3320);
               if (var4 == null) {
                  return;
               }

               var5 = var4.field5534;
            }

            if (var4.field5510) {
               if (~arg0.field9985 != -1) {
                  String var6 = class381.field5334 != class339.field4866 ? class551.field7549.method3980(class494.field6787, true) : class551.field7551.method3980(class494.field6787, true);
                  var5 = var5 + client.method2408(arg0.field9985, class278.field3709.field5687, -102) + field7699[2] + var6 + arg0.field9985 + ")";
               }

               if (class221.field2764 && !arg2) {
                  class786 var7 = ~class111.field1407 != 0 ? class717.field10511.method5460(class111.field1407, 11) : null;
                  if (~(class32.field377 & 2) != -1 && (var7 == null || var4.method2987(class111.field1407, (byte)46, var7.field11479) != var7.field11479)) {
                     ++class574.field7895;
                     class324.method2441((long)arg0.field7843, false, 121, (long)arg0.field7843, class88.field1123 + field7699[1] + var5, 0, class460.field6309, -1, 0, true, 51, false, class740.field10780);
                  }
               }

               if (!arg2) {
                  String[] var8 = var4.field5467;
                  if (class787.field11488) {
                     var8 = class74.method734(false, var8);
                  }

                  if (var8 != null) {
                     int var9 = 4;
                     if (var3 || ~var9 <= -1) {
                        do {
                           if (var8[var9] != null) {
                              if (~var4.field5539 != -1 && var8[var9].equalsIgnoreCase(class551.field7544.method3980(class494.field6787, true))) {
                                 --var9;
                              } else {
                                 byte var10 = 0;
                                 int var11 = class478.field6607;
                                 if (~var9 == -1) {
                                    var10 = 4;
                                 }

                                 if (var9 == 1) {
                                    var10 = 45;
                                 }

                                 if (~var9 == -3) {
                                    var10 = 19;
                                 }

                                 if (~var9 == -4) {
                                    var10 = 25;
                                 }

                                 if (~var9 == -5) {
                                    var10 = 16;
                                 }

                                 if (var4.field5488 == var9) {
                                    var11 = var4.field5509;
                                 }

                                 if (var4.field5466 == var9) {
                                    var11 = var4.field5464;
                                 }

                                 class324.method2441((long)arg0.field7843, false, 121, (long)arg0.field7843, field7699[5] + var5, 0, var8[var9], -1, 0, true, var10, false, !var8[var9].equalsIgnoreCase(class551.field7544.method3980(class494.field6787, true)) ? var11 : var4.field5530);
                                 ++class679.field9952;
                                 --var9;
                              }
                           } else {
                              --var9;
                           }
                        } while(~var9 <= -1);
                     }
                  }

                  if (var4.field5539 == 1 && var8 != null) {
                     int var12 = 4;
                     if (var3 || var12 >= 0) {
                        do {
                           if (var8[var12] != null && var8[var12].equalsIgnoreCase(class551.field7544.method3980(class494.field6787, true))) {
                              short var13 = 0;
                              if (arg0.field9985 > class278.field3709.field5687) {
                                 var13 = 2000;
                              }

                              short var14 = 0;
                              if (var12 == 0) {
                                 var14 = 4;
                              }

                              if (var12 == 1) {
                                 var14 = 45;
                              }

                              if (~var12 == -3) {
                                 var14 = 19;
                              }

                              if (var12 == 3) {
                                 var14 = 25;
                              }

                              if (~var12 == -5) {
                                 var14 = 16;
                              }

                              if (var14 != 0) {
                                 var14 += var13;
                              }

                              ++class675.field9913;
                              class324.method2441((long)arg0.field7843, false, 122, (long)arg0.field7843, field7699[5] + var5, 0, var8[var12], -1, 0, true, var14, false, var4.field5530);
                           }

                           --var12;
                        } while(var12 >= 0);
                     }
                  }
               }

               ++class45.field512;
               class324.method2441((long)arg0.field7843, arg2, 126, (long)arg0.field7843, field7699[5] + var5, 0, class551.field7543.method3980(class494.field6787, true), -1, 0, true, 1002, false, class347.field4990);
               int var15 = 55 / ((arg1 - -35) / 63);
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field7699[4] + (arg0 != null ? field7699[6] : field7699[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class563(int arg0, int arg1) {
      try {
         this.field7698 = arg1;
         this.field7695 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7699[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4047(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4048(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
