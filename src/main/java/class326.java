import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class326 extends class557 {
   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4846 = new String[]{method2620(method2619("5X8I^h")), method2620(method2619(".D5\u000b")), method2620(method2619("5X8IXh")), method2620(method2619(";\u001fwId")), method2620(method2619("5X8IZh")), method2620(method2619("5X8I_h")), method2620(method2619("5X8I\\h")), method2620(method2619("5X8I]h")), method2620(method2619("5X8ISh"))};
   @OriginalMember(
      owner = "client!uia",
      name = "j",
      descriptor = "I"
   )
   public static int field4841 = -1;
   @OriginalMember(
      owner = "client!uia",
      name = "h",
      descriptor = "I"
   )
   public static int field4838;
   @OriginalMember(
      owner = "client!uia",
      name = "i",
      descriptor = "I"
   )
   public static int field4839;
   @OriginalMember(
      owner = "client!uia",
      name = "n",
      descriptor = "I"
   )
   public static int field4840;
   @OriginalMember(
      owner = "client!uia",
      name = "l",
      descriptor = "I"
   )
   public static int field4842;
   @OriginalMember(
      owner = "client!uia",
      name = "m",
      descriptor = "I"
   )
   public static int field4843;
   @OriginalMember(
      owner = "client!uia",
      name = "o",
      descriptor = "I"
   )
   public static int field4844;
   @OriginalMember(
      owner = "client!uia",
      name = "k",
      descriptor = "I"
   )
   public static int field4845;

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field4838;
         if (arg0 != 1) {
            field4841 = -61;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4846[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            method2617(-83, 76, 4, -66, -18);
         }

         ++field4839;
         return 3;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4846[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2615(int arg0) {
      try {
         if (arg0 > -52) {
            return -98;
         } else {
            ++field4844;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4846[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2616(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      if (var3 != null) {
         class631.method4625(var3.field4677);
         if (var3.field4677 != null) {
            var3.field4677 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 != -22) {
            field4841 = -60;
         }

         ++field4842;
         if (~super.field7905 > -1 || super.field7905 > 4) {
            super.field7905 = this.method97(arg0 + 22);
         }

      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4846[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class326(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!uia",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class326(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method98((byte)23);
         }

         super.field7905 = arg0;
         ++field4843;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4846[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2617(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg2 == 20675) {
            ++field4845;
            if (arg1 != 8 && ~arg1 != -17) {
               class312 var6 = class324.field4826[arg0][arg3][arg4];
               if (var6 != null) {
                  label48: {
                     if (arg1 != 1) {
                        if (arg1 != 2) {
                           break label48;
                        }

                        var6.field4682 = 0;
                        if (!var5) {
                           break label48;
                        }
                     }

                     var6.field4681 = 0;
                  }
               }

               class37.method421((byte)121);
            } else {
               int var7 = 0;
               if (var5 || var7 < class229.field3566) {
                  do {
                     class662 var8 = class114.field1804[var7];
                     if (~var8.field9324 == ~arg1 && ~var8.field9312 == ~arg3 && ~var8.field9315 == ~arg4 || var8.field9318 == arg3 && ~var8.field9315 == ~arg4) {
                        if (~class229.field3566 != ~var7) {
                           class474.method3638(class114.field1804, var7 + 1, class114.field1804, var7, -var7 - 1 + class114.field1804.length);
                        }

                        --class229.field3566;
                        return;
                     }

                     ++var7;
                  } while(var7 < class229.field3566);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field4846[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "([BIZIIII)Z"
   )
   public static final boolean method2618(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         if (!arg2) {
            field4841 = -122;
         }

         int var9;
         label45: {
            ++field4840;
            int var8 = arg3 % arg4;
            if (~var8 != -1) {
               var9 = -var8 + arg4;
               if (!var7) {
                  break label45;
               }
            }

            var9 = 0;
         }

         int var10 = -((arg4 + arg6 + -1) / arg4);
         int var11 = -((arg3 + -1 + arg4) / arg4);
         int var12 = var10;
         int var10000;
         if (var7) {
            var10000 = var11;
         } else if (var10 >= 0) {
            var10000 = 0;
            if (!var7) {
               return false;
            }
         } else {
            var10000 = var11;
         }

         while(true) {
            int var13 = var10000;
            if (var7) {
               if (arg0[arg1] == 0) {
                  return true;
               }

               arg1 += arg4;
               ++var13;
            }

            while(true) {
               byte var16;
               if (~var13 <= -1) {
                  arg1 -= var9;
                  var16 = arg0[arg1 + -1];
                  if (!var7) {
                     if (var16 == 0) {
                        return true;
                     }

                     arg1 += arg5;
                     ++var12;
                     if (var12 >= 0) {
                        var10000 = 0;
                        if (!var7) {
                           return false;
                        }
                     } else {
                        var10000 = var11;
                     }
                     break;
                  }
               } else {
                  var16 = arg0[arg1];
               }

               if (var16 == 0) {
                  return true;
               }

               arg1 += arg4;
               ++var13;
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field4846[2] + (arg0 != null ? field4846[3] : field4846[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2619(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2620(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
