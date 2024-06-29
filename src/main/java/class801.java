import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class801 {
   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11661 = new String[]{method5777(method5776("V2gyi\u001c")), method5777(method5776("V2gyl\u001c")), method5777(method5776("V2gyk\u001c")), method5777(method5776("V2gyZ[\u0003r%GZ7.")), method5777(method5776("O~(yS")), method5777(method5776("V2gyo\u001c")), method5777(method5776("Z%j;")), method5777(method5776("V2gym\u001c")), method5777(method5776("\u001b1;")), method5777(method5776("\u001a3i:\u0001Xm")), method5777(method5776("\\$r'\u0014\u001b\u007f")), method5777(method5776("\u001b ;")), method5777(method5776("C'qzY@!g")), method5777(method5776("C'qzY@'o'")), method5777(method5776("C'qzY@\"e")), method5777(method5776("V2gyj\u001c")), method5777(method5776("C'q")), method5777(method5776("V2gyh\u001c"))};
   @OriginalMember(
      owner = "client!bba",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field11650 = new int[13];
   @OriginalMember(
      owner = "client!bba",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field11647 = new class724(5, 9);
   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "I"
   )
   public static int field11654 = 0;
   @OriginalMember(
      owner = "client!bba",
      name = "d",
      descriptor = "D"
   )
   public static double field11656 = -1.0D;
   @OriginalMember(
      owner = "client!bba",
      name = "l",
      descriptor = "Lsb;"
   )
   public static class261 field11657 = new class261();
   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "I"
   )
   public static int field11648;
   @OriginalMember(
      owner = "client!bba",
      name = "g",
      descriptor = "I"
   )
   public static int field11649;
   @OriginalMember(
      owner = "client!bba",
      name = "h",
      descriptor = "I"
   )
   public static int field11651;
   @OriginalMember(
      owner = "client!bba",
      name = "e",
      descriptor = "I"
   )
   public static int field11652;
   @OriginalMember(
      owner = "client!bba",
      name = "f",
      descriptor = "I"
   )
   public static int field11653;
   @OriginalMember(
      owner = "client!bba",
      name = "m",
      descriptor = "I"
   )
   public static int field11655;
   @OriginalMember(
      owner = "client!bba",
      name = "i",
      descriptor = "I"
   )
   public static int field11659;
   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "I"
   )
   public static int field11660;
   @OriginalMember(
      owner = "client!bba",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field11658;

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I"
   )
   public static final int method5769(String arg0, int arg1, String arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field11648;
         int var5 = arg0.length();
         int var6 = arg2.length();
         int var7 = arg3;
         int var8 = 0;
         char var9 = 0;
         char var10 = 0;

         int var10000;
         label185:
         while(-var9 + var7 < var5 || var6 > -var10 + var8) {
            var10000 = ~var5;
            int var10001 = ~(var7 - var9);

            while(var10000 < var10001) {
               if (var6 <= -var10 + var8) {
                  return 1;
               }

               char var11;
               label110: {
                  if (var9 == 0) {
                     var11 = arg0.charAt(var7++);
                     if (!var4) {
                        break label110;
                     }
                  }

                  var11 = var9;
                  boolean var12 = false;
               }

               char var13;
               label105: {
                  if (~var10 != -1) {
                     var13 = var10;
                     boolean var14 = false;
                     if (!var4) {
                        break label105;
                     }
                  }

                  var13 = arg2.charAt(var8++);
               }

               var9 = class272.method2309(var11, arg3 ^ 255);
               var10 = class272.method2309(var13, 255);
               char var15 = class560.method4168(arg1, var11, 111);
               char var16 = class560.method4168(arg1, var13, 111);
               if (~var15 == ~var16) {
                  continue label185;
               }

               var10000 = ~Character.toUpperCase(var15);
               var10001 = ~Character.toUpperCase(var16);
               if (!var4) {
                  if (var10000 != var10001) {
                     char var17 = Character.toLowerCase(var15);
                     char var18 = Character.toLowerCase(var16);
                     if (~var17 != ~var18) {
                        return class71.method761((byte)-26, var17, arg1) - class71.method761((byte)125, var18, arg1);
                     }
                  }
                  continue label185;
               }
            }

            return -1;
         }

         int var19 = Math.min(var5, var6);
         int var20 = 0;
         int var27;
         int var28;
         char var29;
         char var30;
         char var33;
         if (var4) {
            var10000 = arg1;
         } else if (var20 >= var19) {
            var27 = -var6 + var5;
            var10000 = var27;
            if (!var4) {
               if (var27 != 0) {
                  return var27;
               }

               var28 = 0;
               if (var4) {
                  var33 = arg0.charAt(var28);
               } else if (var19 <= var28) {
                  var33 = 0;
                  if (!var4) {
                     return 0;
                  }
               } else {
                  var33 = arg0.charAt(var28);
               }

               while(true) {
                  var29 = var33;
                  var30 = arg2.charAt(var28);
                  if (~var29 != ~var30) {
                     return class71.method761((byte)-35, var29, arg1) - class71.method761((byte)122, var30, arg1);
                  }

                  ++var28;
                  if (var19 <= var28) {
                     var33 = 0;
                     if (!var4) {
                        return 0;
                     }
                  } else {
                     var33 = arg0.charAt(var28);
                  }
               }
            }
         } else {
            var10000 = arg1;
         }

         while(true) {
            int var21;
            int var22;
            if (var10000 != 2) {
               var21 = var20;
               var22 = var20;
               if (var4) {
                  var22 = var5 - 1 + -var20;
                  var21 = -var20 + var6 - 1;
               }
            } else {
               var22 = var5 - 1 + -var20;
               var21 = -var20 + var6 - 1;
            }

            char var23 = arg0.charAt(var22);
            char var24 = arg2.charAt(var21);
            if (~var23 != ~var24 && ~Character.toUpperCase(var23) != ~Character.toUpperCase(var24)) {
               char var25 = Character.toLowerCase(var23);
               char var26 = Character.toLowerCase(var24);
               if (~var25 != ~var26) {
                  return class71.method761((byte)-11, var25, arg1) + -class71.method761((byte)124, var26, arg1);
               }
            }

            ++var20;
            if (var20 >= var19) {
               var27 = -var6 + var5;
               var10000 = var27;
               if (!var4) {
                  if (var27 != 0) {
                     return var27;
                  }

                  var28 = 0;
                  if (var4) {
                     var33 = arg0.charAt(var28);
                  } else if (var19 <= var28) {
                     var33 = 0;
                     if (!var4) {
                        return 0;
                     }
                  } else {
                     var33 = arg0.charAt(var28);
                  }

                  while(true) {
                     var29 = var33;
                     var30 = arg2.charAt(var28);
                     if (~var29 != ~var30) {
                        return class71.method761((byte)-35, var29, arg1) - class71.method761((byte)122, var30, arg1);
                     }

                     ++var28;
                     if (var19 <= var28) {
                        var33 = 0;
                        if (!var4) {
                           return 0;
                        }
                     } else {
                        var33 = arg0.charAt(var28);
                     }
                  }
               }
            } else {
               var10000 = arg1;
            }
         }
      } catch (RuntimeException var32) {
         throw class612.method4503(var32, field11661[5] + (arg0 != null ? field11661[4] : field11661[6]) + ',' + arg1 + ',' + (arg2 != null ? field11661[4] : field11661[6]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5770(int arg0) {
      try {
         if (arg0 == 24010) {
            field11647 = null;
            field11657 = null;
            field11650 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11661[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method5771(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field11651;
         String var2 = field11661[16];
         if (arg0 >= -78) {
            return null;
         } else {
            label39: {
               if (class479.field6892 == class396.field5870) {
                  var2 = field11661[14];
                  if (!var1) {
                     break label39;
                  }
               }

               if (class550.field7866 != class479.field6892) {
                  if (class479.field6892 != class13.field193) {
                     break label39;
                  }

                  var2 = field11661[13];
                  if (!var1) {
                     break label39;
                  }
               }

               var2 = field11661[12];
            }

            String var3 = "";
            if (class432.field6350 != null) {
               var3 = field11661[11] + class432.field6350;
            }

            return field11661[10] + var2 + "." + class343.field5054.field5702 + field11661[9] + class777.field11340 + field11661[8] + class302.field4544 + var3 + "/";
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11661[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method5772(int arg0, byte arg1) {
      try {
         if (arg1 <= 70) {
            field11650 = null;
         }

         ++field11653;
         return 1023 & arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11661[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5773(int arg0) {
      boolean var1 = client.field10022;

      try {
         if (arg0 == 1) {
            ++field11655;
            if (class140.field2242 >= 0) {
               long var2;
               label57: {
                  var2 = class604.method4452(-4);
                  class140.field2242 = (int)((long)class140.field2242 - (-class705.field10149 + var2));
                  if (class140.field2242 > 0) {
                     int var4 = (class140.field2242 << 8) / class212.field3025;
                     int var5 = 255 - var4;
                     float var6 = (float)var4 / 255.0F;
                     float var7 = -var6 + 1.0F;
                     class244.field3751 = (16711680 & (class405.field5958 & 65280) * var4 + (class744.field10582.field6399 & 65280) * var5) + (-16711936 & (16711935 & class405.field5958) * var4 + (16711935 & class744.field10582.field6399) * var5) >>> 8;
                     class405.field5959 = (-class557.field7903 + class744.field10582.field6401) * var7 + class557.field7903;
                     class218.field3126 = (class744.field10582.field6410 - class192.field2800) * var7 + class192.field2800;
                     class566.field8039 = (class744.field10582.field6407 - class609.field8676) * var7 + class609.field8676;
                     class572.field8102 = (-class696.field10050 + class744.field10582.field6393) * var7 + class696.field10050;
                     class279.field4230 = (-16711936 & (16711935 & class693.field9997) * var4 + (class744.field10582.field6391 & 16711935) * var5) - -((65280 & class693.field9997) * var4 + (class744.field10582.field6391 & 65280) * var5 & 16711680) >>> 8;
                     class69.field1001 = class664.field9364 * var4 + class744.field10582.field6394 * var5 >> 8;
                     class31.field441 = (class744.field10582.field6398 - class382.field5575) * var7 + class382.field5575;
                     class236.field3656 = (-class417.field6110 + class744.field10582.field6397) * var7 + class417.field6110;
                     if (class201.field2881 != class744.field10582.field6404) {
                        class413.field6064 = class513.field7285.method152(class201.field2881, class744.field10582.field6404, var7, class413.field6064);
                     }

                     if (class138.field2215 == class744.field10582.field6411) {
                        break label57;
                     }

                     if (class138.field2215 == null) {
                        class606.field8652 = class744.field10582.field6411;
                        if (class606.field8652 == null) {
                           break label57;
                        }

                        class606.field8652.method5565(var5, 16127, 0);
                        if (!var1) {
                           break label57;
                        }
                     }

                     class606.field8652 = class138.field2215;
                     if (class606.field8652 == null) {
                        break label57;
                     }

                     class606.field8652.method5565(var5, 16127, 255);
                     if (!var1) {
                        break label57;
                     }
                  }

                  class413.field6064 = class744.field10582.field6404;
                  class236.field3656 = class744.field10582.field6397;
                  class279.field4230 = class744.field10582.field6391;
                  class69.field1001 = class744.field10582.field6394;
                  class218.field3126 = class744.field10582.field6410;
                  class31.field441 = class744.field10582.field6398;
                  class572.field8102 = class744.field10582.field6393;
                  class405.field5959 = class744.field10582.field6401;
                  class566.field8039 = class744.field10582.field6407;
                  class244.field3751 = class744.field10582.field6399;
                  if (class606.field8652 != null) {
                     class606.field8652.method5569(true);
                  }

                  class606.field8652 = class744.field10582.field6411;
                  class140.field2242 = -1;
               }

               class705.field10149 = var2;
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field11661[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5774(int arg0, int arg1, int arg2) {
      try {
         ++field11652;
         if (arg0 != 20) {
            return true;
         } else {
            return class431.method3361(arg2, arg1, (byte)32) || class266.method2276(arg1, arg2, 115);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11661[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field11649;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11661[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Lfm;ILuj;)Lrb;"
   )
   public static final class381 method5775(class164 arg0, int arg1, class292 arg2) {
      boolean var3 = client.field10022;

      try {
         class381 var4;
         label49: {
            ++field11659;
            var4 = class243.method2120(arg1 + 4795);
            var4.field5566 = arg0.field2490;
            var4.field5568 = arg0;
            if (var4.field5566 != -1) {
               if (~var4.field5566 == 1) {
                  var4.field5570 = new class408(10000);
                  if (!var3) {
                     break label49;
                  }
               }

               if (var4.field5566 <= 18) {
                  var4.field5570 = new class408(20);
                  if (!var3) {
                     break label49;
                  }
               }

               if (~var4.field5566 < -99) {
                  var4.field5570 = new class408(260);
                  if (!var3) {
                     break label49;
                  }
               }

               var4.field5570 = new class408(100);
               if (!var3) {
                  break label49;
               }
            }

            var4.field5570 = new class408(260);
         }

         var4.field5570.method3199((byte)114, arg2);
         var4.field5570.method3200(var4.field5568.method1543(arg1 ^ 6), 792388743);
         var4.field5563 = arg1;
         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11661[7] + (arg0 != null ? field11661[4] : field11661[6]) + ',' + arg1 + ',' + (arg2 != null ? field11661[4] : field11661[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5776(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5777(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
