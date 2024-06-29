import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class417 extends class673 {
   @OriginalMember(
      owner = "client!sj",
      name = "l",
      descriptor = "I"
   )
   public int field5702;
   @OriginalMember(
      owner = "client!sj",
      name = "o",
      descriptor = "I"
   )
   public int field5705;
   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5710 = new String[]{method3258(method3257("HM[[q")), method3258(method3257("UR\u0019r")), method3258(method3257("@\t[0$")), method3258(method3257("HM[\"0UN\u0001 q")), method3258(method3257("HM[Zq")), method3258(method3257("\u001b\nK>")), method3258(method3257("HM[_q")), method3258(method3257("HM[]q")), method3258(method3257("_R\u0018n\u0011^F\u0005")), method3258(method3257("HM[\\q")), method3258(method3257("QF\u0003\u007fwWF\u001bywhS\u0007w7\\")), method3258(method3257("sB\u0014n\u001dNJ\u0005><IU\u001alc")), method3258(method3257("XH\u00180*NI[s8UF\u0012{4^I\u00010\u0011TS&n6Oc\u001c\u007f>UH\u0006j0Xj-\\<ZI"))};
   @OriginalMember(
      owner = "client!sj",
      name = "t",
      descriptor = "I"
   )
   public static int field5706 = -1;
   @OriginalMember(
      owner = "client!sj",
      name = "q",
      descriptor = "Laka;"
   )
   public static class418 field5701 = new class418(91, 11);
   @OriginalMember(
      owner = "client!sj",
      name = "v",
      descriptor = "I"
   )
   public static int field5707 = 0;
   @OriginalMember(
      owner = "client!sj",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field5708 = new int[4096];
   @OriginalMember(
      owner = "client!sj",
      name = "w",
      descriptor = "I"
   )
   public static int field5698;
   @OriginalMember(
      owner = "client!sj",
      name = "u",
      descriptor = "I"
   )
   public static int field5699;
   @OriginalMember(
      owner = "client!sj",
      name = "m",
      descriptor = "I"
   )
   public static int field5700;
   @OriginalMember(
      owner = "client!sj",
      name = "p",
      descriptor = "I"
   )
   public static int field5703;
   @OriginalMember(
      owner = "client!sj",
      name = "n",
      descriptor = "I"
   )
   public static int field5704;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!sj",
      name = "r",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5709;

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Ljava/io/File;ZB)V"
   )
   public static final void method3251(File arg0, boolean arg1, byte arg2) {
      try {
         if (class188.field2401 == null) {
            class362.method2852(-1);
         }

         ++field5698;
         if (arg2 > -22) {
            field5703 = -97;
         }

         try {
            Class var3 = Class.forName(field5710[12]);
            Method var4 = var3.getDeclaredMethod(field5710[8], field5709 != null ? field5709 : (field5709 = method3256(field5710[10])), Boolean.TYPE);
            var4.invoke(class188.field2401, arg0.getAbsolutePath(), new Boolean(arg1));
         } catch (Exception var7) {
            System.out.println(field5710[11]);
            var7.printStackTrace();
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5710[9] + (arg0 != null ? field5710[2] : field5710[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(IIBLoca;)V"
   )
   public static final void method3252(int arg0, int arg1, byte arg2, class642 arg3) {
      boolean var4 = client.field1481;

      try {
         if (class597.field8823) {
            class32 var5 = class268.field3427 != -1 ? class566.field8336.method1210(class268.field3427, true) : null;
            if (client.method999(arg3).method5277(true) && (32 & class112.field1500) != 0 && (var5 == null || arg3.method4724(var5.field466, class268.field3427, true) != var5.field466)) {
               ++class193.field2446;
               class254.method2040(13, true, 0L, class207.field2632 + field5710[5] + arg3.field9560, arg3.field9482, false, false, (byte)-124, arg3.field9524, class741.field10841, class649.field9694, arg3.field9518, (long)(arg3.field9482 | arg3.field9518 << 0));
            }
         }

         ++field5700;
         int var6 = 9;
         String var7;
         if (var4) {
            var7 = class324.method2544(var6, 126, arg3);
            if (var7 != null) {
               ++class558.field8178;
               class254.method2040(1004, true, (long)(var6 + 1), arg3.field9560, arg3.field9482, false, false, (byte)-118, arg3.field9524, class233.method1847(var6, arg3, (byte)62), var7, arg3.field9518, (long)(arg3.field9518 << 0 | arg3.field9482));
            }

            --var6;
         }

         while(true) {
            String var10000;
            if (var6 < 5) {
               int var8 = -11 / ((-18 - arg2) / 38);
               var7 = class403.method3159(-1, arg3);
               var10000 = var7;
               if (!var4) {
                  if (var7 != null) {
                     ++class192.field2436;
                     class254.method2040(3, true, 0L, arg3.field9560, arg3.field9482, false, false, (byte)-45, arg3.field9524, arg3.field9643, var7, arg3.field9518, (long)(arg3.field9482 | arg3.field9518 << 0));
                  }

                  int var9 = 4;
                  String var10;
                  if (var4) {
                     var10 = class324.method2544(var9, -104, arg3);
                     if (var10 != null) {
                        ++class558.field8178;
                        class254.method2040(45, true, (long)(var9 + 1), arg3.field9560, arg3.field9482, false, false, (byte)-124, arg3.field9524, class233.method1847(var9, arg3, (byte)62), var10, arg3.field9518, (long)(arg3.field9482 | arg3.field9518 << 0));
                     }

                     --var9;
                  }

                  while(true) {
                     int var13;
                     if (~var9 > -1) {
                        var13 = client.method999(arg3).method5278(116);
                        if (!var4) {
                           if (var13 != 0) {
                              ++class42.field553;
                              if (arg3.field9559 == null) {
                                 class254.method2040(16, true, 0L, "", arg3.field9482, false, false, (byte)-103, arg3.field9524, -1, class606.field8913.method4490(class782.field11389, -16777216), arg3.field9518, (long)(arg3.field9482 | arg3.field9518 << 0));
                                 return;
                              }

                              class254.method2040(16, true, 0L, "", arg3.field9482, false, false, (byte)-43, arg3.field9524, -1, arg3.field9559, arg3.field9518, (long)(arg3.field9482 | arg3.field9518 << 0));
                              return;
                           }

                           return;
                        }
                     } else {
                        var13 = var9;
                     }

                     var10 = class324.method2544(var13, -104, arg3);
                     if (var10 != null) {
                        ++class558.field8178;
                        class254.method2040(45, true, (long)(var9 + 1), arg3.field9560, arg3.field9482, false, false, (byte)-124, arg3.field9524, class233.method1847(var9, arg3, (byte)62), var10, arg3.field9518, (long)(arg3.field9482 | arg3.field9518 << 0));
                     }

                     --var9;
                  }
               }
            } else {
               var7 = class324.method2544(var6, 126, arg3);
               var10000 = var7;
            }

            if (var10000 != null) {
               ++class558.field8178;
               class254.method2040(1004, true, (long)(var6 + 1), arg3.field9560, arg3.field9482, false, false, (byte)-118, arg3.field9524, class233.method1847(var6, arg3, (byte)62), var7, arg3.field9518, (long)(arg3.field9518 << 0 | arg3.field9482));
            }

            --var6;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field5710[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5710[2] : field5710[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3253(int arg0) {
      try {
         if (arg0 != 91) {
            field5707 = -65;
         }

         field5708 = null;
         field5701 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5710[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Lww;Lww;[II)V"
   )
   public static final void method3254(class339 arg0, class339 arg1, int[] arg2, int arg3) {
      try {
         ++field5699;
         class28.field414 = arg0;
         if (arg2 != null) {
            class211.field2686 = arg2;
         }

         class258.field3268 = arg1;
         if (arg3 > -99) {
            field5703 = 81;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5710[0] + (arg0 != null ? field5710[2] : field5710[1]) + ',' + (arg1 != null ? field5710[2] : field5710[1]) + ',' + (arg2 != null ? field5710[2] : field5710[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Loca;IIIIILaa;IJ)V"
   )
   public static final void method3255(class642 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, long arg8) {
      try {
         ++field5704;
         int var10 = arg2 * arg2 + arg4 * arg4;
         if ((long)var10 <= arg8) {
            if (arg7 == 11) {
               int var11 = Math.min(arg0.field9629 / 2, arg0.field9572 / 2);
               if (~(var11 * var11) <= ~var10) {
                  class615.method4529(arg0, arg2, class86.field1183[arg3], 3903, arg5, arg4, arg1, arg6);
               } else {
                  int var12;
                  label39: {
                     var11 -= 10;
                     if (~class784.field11454 != -5) {
                        var12 = (int)class623.field9202 + class495.field6914 & 16383;
                        if (!client.field1481) {
                           break label39;
                        }
                     }

                     var12 = 16383 & (int)class623.field9202;
                  }

                  int var13 = class746.field10907[var12];
                  int var14 = class746.field10897[var12];
                  if (~class784.field11454 != -5) {
                     var14 = var14 * 256 / (class391.field5419 - -256);
                     var13 = var13 * 256 / (class391.field5419 - -256);
                  }

                  int var15 = arg2 * var14 + arg4 * var13 >> 14;
                  int var16 = arg4 * var14 - arg2 * var13 >> 14;
                  double var17 = Math.atan2((double)var15, (double)var16);
                  int var19 = (int)(Math.sin(var17) * (double)var11);
                  int var20 = (int)(Math.cos(var17) * (double)var11);
                  class54.field742[arg3].method4763((float)arg0.field9629 / 2.0F + (float)arg5 + (float)var19, (float)arg0.field9572 / 2.0F + (float)arg1 - (float)var20, 4096, (int)(-var17 / 6.283185307179586D * 65535.0D));
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field5710[7] + (arg0 != null ? field5710[2] : field5710[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5710[2] : field5710[1]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class417(int arg0, int arg1) {
      try {
         this.field5702 = arg1;
         this.field5705 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5710[3] + arg0 + ',' + arg1 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3256(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3257(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3258(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
