import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class539 {
   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7574 = new String[]{method4019(method4018("\u0007m5]")), method4019(method4018("\u0007m6]")), method4019(method4018("\u0007m7]")), method4019(method4018("\u0007m8]"))};
   @OriginalMember(
      owner = "client!b",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field7573 = true;
   @OriginalMember(
      owner = "client!b",
      name = "e",
      descriptor = "Lbu;"
   )
   public static class234 field7570 = new class234(0, 2, 2, 1);
   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "I"
   )
   public static int field7569;
   @OriginalMember(
      owner = "client!b",
      name = "c",
      descriptor = "I"
   )
   public static int field7571;
   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "I"
   )
   public static int field7572;

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4014(int arg0, int arg1, int arg2) {
      try {
         ++field7571;
         if (arg1 != -1) {
            method4015(-68, (byte)-53, -59);
         }

         return class341.method2719(arg0, true, arg2) | ~(458752 & arg2) != -1 || class201.method1749(arg0, arg2, 200);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7574[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method4015(int arg0, byte arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         label146: {
            if (!(class651.field9216 < class651.field9212)) {
               if (!(class651.field9216 > class651.field9212)) {
                  break label146;
               }

               class651.field9216 = (float)((double)class651.field9216 - (double)class651.field9216 / 30.0D);
               if (class651.field9212 > class651.field9216) {
                  class651.field9216 = class651.field9212;
               }

               class111.method1082(0);
               class651.field9209 = (int)class651.field9216 >> 1;
               class651.field9214 = class686.method4993(true, class651.field9209);
               if (!var3) {
                  break label146;
               }
            }

            class651.field9216 = (float)((double)class651.field9216 / 30.0D + (double)class651.field9216);
            if (class651.field9216 > class651.field9212) {
               class651.field9216 = class651.field9212;
            }

            class111.method1082(0);
            class651.field9209 = (int)class651.field9216 >> 1;
            class651.field9214 = class686.method4993(true, class651.field9209);
         }

         ++field7569;
         if (~class348.field5114 != 0 && ~class644.field9063 != 0) {
            int var4 = class348.field5114 - class784.field11423;
            if (~var4 > -3 || var4 > 2) {
               var4 /= 8;
            }

            int var5 = -class535.field7521 + class644.field9063;
            class784.field11423 += var4;
            if (var5 < 2 || ~var5 < -3) {
               var5 /= 8;
            }

            class535.field7521 += var5;
            if (~var4 == -1 && ~var5 == -1) {
               class348.field5114 = -1;
               class644.field9063 = -1;
            }

            class111.method1082(0);
         }

         label120: {
            int var6 = -52 / ((42 - arg1) / 48);
            if (class287.field4295 <= 0) {
               class460.field6701 = -1;
               class501.field7146 = -1;
               if (!var3) {
                  break label120;
               }
            }

            --class746.field10608;
            if (class746.field10608 == 0) {
               class746.field10608 = 100;
               --class287.field4295;
            }
         }

         if (class25.field361 && class418.field6115 != null) {
            class48 var7 = (class48)class418.field6115.method2245((byte)-94);
            if (var3 || var7 != null) {
               do {
                  label151: {
                     class541 var8 = class651.field9200.method1756(36, var7.field744.field4134);
                     if (!var7.method534(arg2, -119, arg0)) {
                        if (!var7.field744.field4137) {
                           break label151;
                        }

                        var7.field744.field4137 = false;
                        class427.method3342(class131.field2123, var7.field744.field4134, var8.field7606);
                        if (!var3) {
                           break label151;
                        }
                     }

                     if (var8.field7598 != null) {
                        if (var8.field7598[4] != null) {
                           class643.method4678(var8.field7606, 0, 1009, true, (long)var7.field744.field4134, var8.field7618, -1, false, 0, var8.field7598[4], (long)var7.field744.field4134, -1, false);
                        }

                        if (var8.field7598[3] != null) {
                           class643.method4678(var8.field7606, 0, 1006, true, (long)var7.field744.field4134, var8.field7618, -1, false, 0, var8.field7598[3], (long)var7.field744.field4134, -1, false);
                        }

                        if (var8.field7598[2] != null) {
                           class643.method4678(var8.field7606, 0, 1011, true, (long)var7.field744.field4134, var8.field7618, -1, false, 0, var8.field7598[2], (long)var7.field744.field4134, -1, false);
                        }

                        if (var8.field7598[1] != null) {
                           class643.method4678(var8.field7606, 0, 1008, true, (long)var7.field744.field4134, var8.field7618, -1, false, 0, var8.field7598[1], (long)var7.field744.field4134, -1, false);
                        }

                        if (var8.field7598[0] != null) {
                           class643.method4678(var8.field7606, 0, 1010, true, (long)var7.field744.field4134, var8.field7618, -1, false, 0, var8.field7598[0], (long)var7.field744.field4134, -1, false);
                        }
                     }

                     if (!var7.field744.field4137) {
                        var7.field744.field4137 = true;
                        class427.method3342(class211.field3021, var7.field744.field4134, var8.field7606);
                     }

                     if (var7.field744.field4137) {
                        class427.method3342(class297.field4417, var7.field744.field4134, var8.field7606);
                     }
                  }

                  var7 = (class48)class418.field6115.method2239((byte)118);
               } while(var7 != null);

            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7574[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method4016(long arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field7572;
         int var4 = class704.field10131;
         int var5 = class232.field3606;
         if (class779.field11378 != var4) {
            int var7;
            label79: {
               int var6 = var4 - class779.field11378;
               var7 = (int)((long)var6 * arg0 / 320L);
               if (var6 <= 0) {
                  if (~var7 == -1) {
                     var7 = -1;
                     if (!var3) {
                        break label79;
                     }
                  }

                  if (~var7 <= ~var6) {
                     break label79;
                  }

                  var7 = var6;
                  if (!var3) {
                     break label79;
                  }
               }

               if (var7 == 0) {
                  var7 = 1;
                  if (!var3) {
                     break label79;
                  }
               }

               if (var7 > var6) {
                  var7 = var6;
               }
            }

            class779.field11378 += var7;
         }

         class604.field8615 += (float)arg0 * class126.field2033 / 40.0F * 8.0F;
         if (arg1 != 11743) {
            method4016(-10L, 54);
         }

         class86.field1312 += (float)arg0 * class662.field9329 / 40.0F * 8.0F;
         if (class576.field8140 != var5) {
            int var9;
            label81: {
               int var8 = -class576.field8140 + var5;
               var9 = (int)((long)var8 * arg0 / 320L);
               if (~var8 >= -1) {
                  if (~var9 == -1) {
                     var9 = -1;
                     if (!var3) {
                        break label81;
                     }
                  }

                  if (var8 <= var9) {
                     break label81;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label81;
                  }
               }

               if (~var9 == -1) {
                  var9 = 1;
                  if (!var3) {
                     break label81;
                  }
               }

               if (var9 > var8) {
                  var9 = var8;
               }
            }

            class576.field8140 += var9;
         }

         class14.method116(true);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7574[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4017(int arg0) {
      try {
         field7570 = null;
         if (arg0 != -1) {
            field7570 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7574[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4018(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4019(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
