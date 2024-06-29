import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class552 implements class517 {
   @OriginalMember(
      owner = "client!td",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   private String field8123;
   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8128 = new String[]{method4181(method4180("'\u0010{.\n")), method4181(method4180("'\u0010{SK=\u001d!Q\n")), method4181(method4180("(Z{A_")), method4181(method4180("=\u00019\u0003")), method4181(method4180("'\u0010{(\n")), method4181(method4180("'\u0010{-\n")), method4181(method4180("'\u0010{+\n")), method4181(method4180("'\u0010{'\n")), method4181(method4180("'\u0010{,\n")), method4181(method4180("\u007f\u0015g")), method4181(method4180("|\u0018h")), method4181(method4180("\f\u00070\u0003D")), method4181(method4180("'\u0010{)\n")), method4181(method4180("|\u0004h")), method4181(method4180(";\u0000!\u001f\u0018|[")), method4181(method4180("|\u0015h")), method4181(method4180("|\u001e")), method4181(method4180("\u007f\u001b")), method4181(method4180("'\u0010{*\n"))};
   @OriginalMember(
      owner = "client!td",
      name = "i",
      descriptor = "Lse;"
   )
   public static class6 field8121 = new class6(92, 2);
   @OriginalMember(
      owner = "client!td",
      name = "c",
      descriptor = "I"
   )
   public static int field8117;
   @OriginalMember(
      owner = "client!td",
      name = "g",
      descriptor = "I"
   )
   public static int field8118;
   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "I"
   )
   public static int field8120;
   @OriginalMember(
      owner = "client!td",
      name = "d",
      descriptor = "I"
   )
   public static int field8122;
   @OriginalMember(
      owner = "client!td",
      name = "k",
      descriptor = "I"
   )
   public static int field8124;
   @OriginalMember(
      owner = "client!td",
      name = "h",
      descriptor = "I"
   )
   public static int field8125;
   @OriginalMember(
      owner = "client!td",
      name = "f",
      descriptor = "I"
   )
   public static int field8126;
   @OriginalMember(
      owner = "client!td",
      name = "j",
      descriptor = "I"
   )
   public static int field8127;
   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "Z"
   )
   private boolean field8119;

   @OriginalMember(
      owner = "client!td",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4174(int arg0) {
      try {
         ++field8120;
         if (arg0 != -1116574932) {
            this.field8123 = null;
         }

         return this.field8119;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8128[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4175(int arg0) {
      try {
         field8121 = null;
         if (arg0 != 2919) {
            field8121 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8128[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(I)Ltg;"
   )
   public final class374 method1641(int arg0) {
      try {
         if (arg0 != -23257) {
            method4177(-45, -123, true);
         }

         ++field8117;
         return class374.field5233;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8128[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class552(String arg0) {
      try {
         this.field8123 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8128[1] + (arg0 != null ? field8128[2] : field8128[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(Llia;Z)Z"
   )
   public static final boolean method4176(class633 arg0, boolean arg1) {
      try {
         if (!arg1) {
            method4177(-53, 30, true);
         }

         ++field8126;
         return class625.field9242 == arg0 || class776.field11304 == arg0 || class267.field3376 == arg0 || class588.field8670 == arg0 || class93.field1259 == arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8128[4] + (arg0 != null ? field8128[2] : field8128[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1638(int arg0) {
      try {
         ++field8127;
         int var2 = class116.method1032(this.field8123, 100);
         if (~var2 <= -1 && ~var2 >= -101) {
            return var2;
         } else {
            this.field8119 = true;
            if (arg0 != 13053) {
               field8121 = null;
            }

            return 100;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8128[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method4177(int arg0, int arg1, boolean arg2) {
      try {
         ++field8124;
         if (!arg2) {
            field8122 = 88;
         }

         return (2048 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8128[18] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIZIII)V"
   )
   public static final void method4178(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field8125;
         int var7 = -arg5 + arg1;
         int var8 = -arg0 + arg4;
         if (var7 != 0) {
            if (var8 == 0) {
               class491.method3731((byte)-36, arg3, arg0, arg1, arg5);
            } else {
               int var9;
               int var10;
               int var11;
               int var12;
               label75: {
                  var9 = (var8 << 12) / var7;
                  var10 = -(arg5 * var9 >> 12) + arg0;
                  if (arg5 >= class415.field5689) {
                     if (~class282.field3921 > ~arg5) {
                        var11 = var10 - -(class282.field3921 * var9 >> 12);
                        var12 = class282.field3921;
                        if (!var6) {
                           break label75;
                        }
                     }

                     var12 = arg5;
                     var11 = arg0;
                     if (!var6) {
                        break label75;
                     }
                  }

                  var11 = (class415.field5689 * var9 >> 12) + var10;
                  var12 = class415.field5689;
               }

               int var13;
               int var14;
               label84: {
                  if (class415.field5689 > arg1) {
                     var13 = class415.field5689;
                     var14 = var10 - -(class415.field5689 * var9 >> 12);
                     if (!var6) {
                        break label84;
                     }
                  }

                  if (~arg1 >= ~class282.field3921) {
                     var14 = arg4;
                     var13 = arg1;
                     if (!var6) {
                        break label84;
                     }
                  }

                  var13 = class282.field3921;
                  var14 = (class282.field3921 * var9 >> 12) + var10;
               }

               label58: {
                  if (~class577.field8561 >= ~var14) {
                     if (var14 <= class586.field8647) {
                        break label58;
                     }

                     var14 = class586.field8647;
                     var13 = (-var10 + class586.field8647 << 12) / var9;
                     if (!var6) {
                        break label58;
                     }
                  }

                  var14 = class577.field8561;
                  var13 = (-var10 + class577.field8561 << 12) / var9;
               }

               if (!arg2) {
                  field8122 = -89;
               }

               label50: {
                  if (~var11 <= ~class577.field8561) {
                     if (~class586.field8647 <= ~var11) {
                        break label50;
                     }

                     var11 = class586.field8647;
                     var12 = (-var10 + class586.field8647 << 12) / var9;
                     if (!var6) {
                        break label50;
                     }
                  }

                  var11 = class577.field8561;
                  var12 = (-var10 + class577.field8561 << 12) / var9;
               }

               class466.method3547(var11, arg3, (byte)68, var14, var13, var12);
            }
         } else {
            if (var8 != 0) {
               class710.method5187(arg0, arg5, arg3, 6647, arg4);
            }

         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field8128[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IILjava/lang/String;)Z"
   )
   public static final boolean method4179(int arg0, int arg1, String arg2) {
      boolean var3 = client.field1481;

      try {
         ++field8118;
         if (class366.field5092.field10745) {
            class44.field571 = new class753();
            class44.field571.field11029 = arg2;
            class44.field571.field11035 = arg1;
            if (class781.field11380 != class583.field8611) {
               class44.field571.field11028 = 50000 - -class44.field571.field11035;
               class44.field571.field11031 = class44.field571.field11035 + 40000;
            }

            int var4 = 0;
            if (var3) {
               if (class426.field5795[var4].field1488 == arg1) {
                  class745.field10875 = class426.field5795[var4].field8332;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (class426.field5795.length <= var4) {
                  var10000 = 1;
                  if (!var3) {
                     return true;
                  }
               } else {
                  var10000 = class426.field5795[var4].field1488;
               }

               if (var10000 == arg1) {
                  class745.field10875 = class426.field5795[var4].field8332;
               }

               ++var4;
            }
         } else {
            String var5 = "";
            if (class781.field11380 != class583.field8611) {
               var5 = ":" + (arg1 - -7000);
            }

            if (arg0 != -3616) {
               field8121 = null;
            }

            String var6 = "";
            if (class452.field6244 != null) {
               var6 = field8128[13] + class452.field6244;
            }

            String var7 = field8128[14] + arg2 + var5 + field8128[10] + class782.field11389 + field8128[15] + class311.field4331 + var6 + field8128[16] + (!class322.field4415 ? "0" : "1") + field8128[17] + (!class292.field4022 ? "0" : "1") + field8128[9];

            try {
               class107.field1426.getAppletContext().showDocument(new URL(var7), field8128[11]);
               return true;
            } catch (Exception var9) {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field8128[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8128[2] : field8128[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4180(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4181(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
