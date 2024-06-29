import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class24 {
   @OriginalMember(
      owner = "client!fu",
      name = "k",
      descriptor = "Llj;"
   )
   private class304 field295 = new class304(64);
   @OriginalMember(
      owner = "client!fu",
      name = "e",
      descriptor = "Lrr;"
   )
   private class678 field299;
   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field306 = new String[]{method181(method180("TP}\u000b")), method181(method180("A\u000b?I9")), method181(method180("\\P?!l")), method181(method180("\\P?\"l")), method181(method180("\\P?#l")), method181(method180("\\P?$l")), method181(method180("\\P?%l")), method181(method180("\\P?&l")), method181(method180("\\P?[-TLeYl"))};
   @OriginalMember(
      owner = "client!fu",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field296 = new class498(111, 8);
   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field302 = false;
   @OriginalMember(
      owner = "client!fu",
      name = "f",
      descriptor = "Lnaa;"
   )
   public static class113 field297 = new class113(84, 3);
   @OriginalMember(
      owner = "client!fu",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field305 = new int[3];
   @OriginalMember(
      owner = "client!fu",
      name = "h",
      descriptor = "I"
   )
   public static int field298;
   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "I"
   )
   public static int field300;
   @OriginalMember(
      owner = "client!fu",
      name = "j",
      descriptor = "I"
   )
   public static int field301;
   @OriginalMember(
      owner = "client!fu",
      name = "i",
      descriptor = "I"
   )
   public static int field303;
   @OriginalMember(
      owner = "client!fu",
      name = "d",
      descriptor = "I"
   )
   public static int field304;

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(I)V",
      line = 10
   )
   public static void method174(int arg0) {
      try {
         field296 = null;
         if (arg0 > -84) {
            method174(-84);
         }

         field297 = null;
         field305 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field306[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(B)V",
      line = 23
   )
   public final void method175(byte arg0) {
      try {
         class304 var2 = this.field295;
         synchronized(this.field295) {
            if (arg0 != 35) {
               field296 = null;
            }

            this.field295.method2551(true);
         }

         ++field300;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field306[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(I)V",
      line = 40
   )
   public final void method176(int arg0) {
      try {
         if (arg0 != -17003) {
            field296 = null;
         }

         ++field304;
         class304 var2 = this.field295;
         synchronized(this.field295) {
            this.field295.method2554(arg0 ^ 16922);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field306[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(IIBILjava/lang/String;)V",
      line = 60
   )
   public static final void method177(int arg0, int arg1, byte arg2, int arg3, String arg4) {
      try {
         ++field298;
         class374 var5 = class221.method1912(arg1, arg2 ^ -93, arg3);
         if (var5 != null) {
            if (var5.field5914 != null) {
               class36 var6 = new class36();
               var6.field437 = var5.field5914;
               var6.field441 = var5;
               var6.field439 = arg0;
               var6.field432 = arg4;
               class469.method3632(var6);
            }

            if (class342.field5204 == 11) {
               if (client.method1148(var5).method526(arg0 + -1, (byte)-61)) {
                  if (~arg0 == -2) {
                     ++class486.field7387;
                     class577 var7 = class218.method1888(class47.field616, arg2 ^ 121, class510.field7801.field361);
                     class311.method2593(arg3, var7, arg1, var5.field5927, 8);
                     class510.field7801.method211(var7, 124);
                  }

                  if (arg2 == 9) {
                     if (~arg0 == -3) {
                        ++class718.field10762;
                        class577 var8 = class218.method1888(class738.field10967, 125, class510.field7801.field361);
                        class311.method2593(arg3, var8, arg1, var5.field5927, arg2 + -1);
                        class510.field7801.method211(var8, 119);
                     }

                     if (arg0 == 3) {
                        ++class285.field4495;
                        class577 var9 = class218.method1888(class119.field1609, 98, class510.field7801.field361);
                        class311.method2593(arg3, var9, arg1, var5.field5927, 8);
                        class510.field7801.method211(var9, 118);
                     }

                     if (~arg0 == -5) {
                        ++class103.field1439;
                        class577 var10 = class218.method1888(class383.field6041, 126, class510.field7801.field361);
                        class311.method2593(arg3, var10, arg1, var5.field5927, 8);
                        class510.field7801.method211(var10, 125);
                     }

                     if (arg0 == 5) {
                        ++class253.field3822;
                        class577 var11 = class218.method1888(class696.field10339, arg2 + 85, class510.field7801.field361);
                        class311.method2593(arg3, var11, arg1, var5.field5927, arg2 + -1);
                        class510.field7801.method211(var11, 121);
                     }

                     if (~arg0 == -7) {
                        ++class17.field226;
                        class577 var12 = class218.method1888(class300.field4709, 113, class510.field7801.field361);
                        class311.method2593(arg3, var12, arg1, var5.field5927, arg2 + -1);
                        class510.field7801.method211(var12, 121);
                     }

                     if (arg0 == 7) {
                        ++class548.field8204;
                        class577 var13 = class218.method1888(class588.field8676, 97, class510.field7801.field361);
                        class311.method2593(arg3, var13, arg1, var5.field5927, 8);
                        class510.field7801.method211(var13, 117);
                     }

                     if (~arg0 == -9) {
                        ++class696.field10342;
                        class577 var14 = class218.method1888(class396.field6211, 101, class510.field7801.field361);
                        class311.method2593(arg3, var14, arg1, var5.field5927, 8);
                        class510.field7801.method211(var14, 126);
                     }

                     if (arg0 == 9) {
                        ++class691.field10261;
                        class577 var15 = class218.method1888(class790.field11561, 107, class510.field7801.field361);
                        class311.method2593(arg3, var15, arg1, var5.field5927, 8);
                        class510.field7801.method211(var15, 115);
                     }

                     if (~arg0 == -11) {
                        ++class127.field1818;
                        class577 var16 = class218.method1888(class115.field1556, 115, class510.field7801.field361);
                        class311.method2593(arg3, var16, arg1, var5.field5927, 8);
                        class510.field7801.method211(var16, 124);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field306[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field306[1] : field306[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(ZI)V",
      line = 191
   )
   public final void method178(boolean arg0, int arg1) {
      try {
         class304 var3 = this.field295;
         synchronized(this.field295) {
            if (!arg0) {
               this.field295 = null;
            }

            this.field295.method2552(arg1, 21533);
         }

         ++field303;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field306[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(II)Lcb;",
      line = 204
   )
   public final class58 method179(int arg0, int arg1) {
      try {
         if (arg0 != -1572) {
            this.method175((byte)23);
         }

         ++field301;
         class304 var3 = this.field295;
         class58 var4;
         synchronized(this.field295) {
            var4 = (class58)this.field295.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field299;
            byte[] var6;
            synchronized(this.field299) {
               var6 = this.field299.method5017(11, arg1, (byte)71);
            }

            class58 var7 = new class58();
            if (var6 != null) {
               var7.method429(new class354(var6), -118);
            }

            class304 var8 = this.field295;
            synchronized(this.field295) {
               this.field295.method2545((long)arg1, arg0 ^ -1620, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field306[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 243
   )
   public class24(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field299 = arg2;
         if (this.field299 != null) {
            this.field299.method4998((byte)-82, 11);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field306[8] + (arg0 != null ? field306[1] : field306[0]) + ',' + arg1 + ',' + (arg2 != null ? field306[1] : field306[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method180(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method181(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
