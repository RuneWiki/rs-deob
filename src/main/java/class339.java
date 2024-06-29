import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class339 extends class426 {
   @OriginalMember(
      owner = "client!en",
      name = "g",
      descriptor = "I"
   )
   private int field4863;
   @OriginalMember(
      owner = "client!en",
      name = "n",
      descriptor = "I"
   )
   private int field4860;
   @OriginalMember(
      owner = "client!en",
      name = "r",
      descriptor = "I"
   )
   private int field4861;
   @OriginalMember(
      owner = "client!en",
      name = "o",
      descriptor = "I"
   )
   private int field4857;
   @OriginalMember(
      owner = "client!en",
      name = "p",
      descriptor = "I"
   )
   private int field4859;
   @OriginalMember(
      owner = "client!en",
      name = "i",
      descriptor = "I"
   )
   private int field4865;
   @OriginalMember(
      owner = "client!en",
      name = "s",
      descriptor = "I"
   )
   private int field4858;
   @OriginalMember(
      owner = "client!en",
      name = "u",
      descriptor = "I"
   )
   private int field4852;
   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4868 = new String[]{method2693(method2692("$5t=1")), method2693(method2692(":utWd")), method2693(method2692("/.6\u0015")), method2693(method2692("$5t81")), method2693(method2692("$5t;1")), method2693(method2692("$5t<1")), method2693(method2692("$5t:1")), method2693(method2692("$5tEp/2.G1"))};
   @OriginalMember(
      owner = "client!en",
      name = "m",
      descriptor = "Lbga;"
   )
   public static class378 field4862 = new class378(49, 10);
   @OriginalMember(
      owner = "client!en",
      name = "v",
      descriptor = "[[[I"
   )
   public static int[][][] field4864 = new int[2][][];
   @OriginalMember(
      owner = "client!en",
      name = "q",
      descriptor = "Lnc;"
   )
   public static class26 field4866 = new class26(method2693(method2692("2/?\u0015u )>\u0018n/")), method2693(method2692("\u0012/?\u0015u )z=x65")), 1);
   @OriginalMember(
      owner = "client!en",
      name = "h",
      descriptor = "Ldd;"
   )
   public static class735 field4867 = new class735(7, 0, 1, 1);
   @OriginalMember(
      owner = "client!en",
      name = "l",
      descriptor = "I"
   )
   public static int field4853;
   @OriginalMember(
      owner = "client!en",
      name = "k",
      descriptor = "I"
   )
   public static int field4854;
   @OriginalMember(
      owner = "client!en",
      name = "j",
      descriptor = "I"
   )
   public static int field4855;
   @OriginalMember(
      owner = "client!en",
      name = "t",
      descriptor = "I"
   )
   public static int field4856;

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2687(byte arg0) {
      try {
         field4867 = null;
         if (arg0 != 41) {
            field4867 = null;
         }

         field4866 = null;
         field4864 = null;
         field4862 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4868[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2688(byte arg0, int arg1, int arg2) {
      try {
         ++field4854;
         if (arg0 != 41) {
            this.method2688((byte)-39, 20, -59);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4868[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method2689(int arg0, int arg1, byte arg2) {
      try {
         ++field4853;
         int var4 = this.field4860 * arg0 >> 12;
         int var5 = this.field4859 * arg1 >> 12;
         int var6 = this.field4857 * arg0 >> 12;
         int var7 = this.field4852 * arg1 >> 12;
         if (arg2 != 109) {
            this.field4858 = -95;
         }

         int var8 = this.field4863 * arg0 >> 12;
         int var9 = this.field4861 * arg1 >> 12;
         int var10 = this.field4865 * arg0 >> 12;
         int var11 = this.field4858 * arg1 >> 12;
         class553.method3993(arg2 ^ -8568, var9, var6, var10, var7, var5, var11, super.field5957, var4, var8);
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4868[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      super(-1, arg8, arg9);

      try {
         this.field4863 = arg4;
         this.field4860 = arg0;
         this.field4861 = arg5;
         this.field4857 = arg2;
         this.field4859 = arg1;
         this.field4865 = arg6;
         this.field4858 = arg7;
         this.field4852 = arg3;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field4868[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(ZIZILjava/lang/String;Ljava/lang/String;I)V"
   )
   public static final void method2690(boolean arg0, int arg1, boolean arg2, int arg3, String arg4, String arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         class737.field10752.field920 = 1;
         ++field4856;
         String var21 = arg4.toLowerCase();
         short[] var8 = new short[16];
         int var9 = -1;
         String var10 = null;
         if (~arg6 != 0) {
            label171: {
               class786 var11 = class717.field10511.method5460(arg6, 11);
               if (var11 == null || var11.method5659((byte)-104) != arg0) {
                  return;
               }

               if (!var11.method5659((byte)-70)) {
                  var9 = var11.field11479;
                  if (!var7) {
                     break label171;
                  }
               }

               var10 = var11.field11481;
            }
         }

         int var12 = 0;
         int var13 = 0;
         if (var7 || class645.field9054.field707 > var13) {
            do {
               class261 var14 = class645.field9054.method485(0, var13);
               if ((!arg2 || var14.field3415) && ~var14.field3336 == 0 && ~var14.field3365 == 0 && var14.field3338 == -1 && (~var14.field3401 == -1 || var7) && ~var14.field3371.toLowerCase().indexOf(var21) != 0) {
                  label181: {
                     if (~arg6 != 0) {
                        label123: {
                           if (!arg0) {
                              if (var14.method1995(-1, var9, arg6) == arg3) {
                                 break label123;
                              }

                              if (!var7) {
                                 break label181;
                              }
                           }

                           if (!arg5.equals(var14.method1994(123, var10, arg6)) && !var7) {
                              break label181;
                           }
                        }
                     }

                     if (var12 >= 250) {
                        class413.field5814 = null;
                        class386.field5416 = -1;
                        return;
                     }

                     if (var8.length <= var12) {
                        short[] var15 = new short[var8.length * 2];
                        int var16 = 0;
                        if (var7) {
                           var15[var16] = var8[var16];
                           ++var16;
                        }

                        while(true) {
                           short[] var10000;
                           if (~var12 >= ~var16) {
                              var10000 = var15;
                              if (!var7) {
                                 var8 = var15;
                                 break;
                              }
                           } else {
                              var10000 = var15;
                           }

                           var10000[var16] = var8[var16];
                           ++var16;
                        }
                     }

                     var8[var12++] = (short)var13;
                  }
               }

               ++var13;
            } while(class645.field9054.field707 > var13);
         }

         class413.field5814 = var8;
         class68.field783 = 0;
         class386.field5416 = var12;
         String[] var17 = new String[class386.field5416];
         int var18 = 0;
         if (var7) {
            var17[var18] = class645.field9054.method485(0, var8[var18]).field3371;
            ++var18;
         }

         while(true) {
            while(class386.field5416 > var18) {
               var17[var18] = class645.field9054.method485(0, var8[var18]).field3371;
               ++var18;
            }

            if (!var7) {
               if (arg1 < 55) {
                  field4867 = null;
               }

               class483.method3515(var17, class413.field5814, 7);
               class737.field10752.method723(97);
               class737.field10752.field920 = 2;
               return;
            }

            ++var18;
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field4868[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4868[1] : field4868[2]) + ',' + (arg5 != null ? field4868[1] : field4868[2]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2691(int arg0, int arg1, int arg2) {
      try {
         ++field4855;
         if (arg2 != 553) {
            this.field4863 = 106;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4868[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2692(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!en",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2693(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
