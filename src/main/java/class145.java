import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class145 {
   @OriginalMember(
      owner = "client!vja",
      name = "e",
      descriptor = "I"
   )
   public int field2062 = -1;
   @OriginalMember(
      owner = "client!vja",
      name = "h",
      descriptor = "I"
   )
   public int field2068 = -1;
   @OriginalMember(
      owner = "client!vja",
      name = "k",
      descriptor = "I"
   )
   public int field2061 = 0;
   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "I"
   )
   public int field2069 = -1;
   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2070 = new String[]{method1317(method1316("R\n\u000b*@\f")), method1317(method1316("R\n\u000b*C\f")), method1317(method1316("J\u0015\u0006h")), method1317(method1316("_ND*\u007f")), method1317(method1316("R\n\u000b*G\f")), method1317(method1316("R\n\u000b*A\f")), method1317(method1316("R\n\u000b*F\f"))};
   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "Ljl;"
   )
   public static class133 field2065 = new class133();
   @OriginalMember(
      owner = "client!vja",
      name = "j",
      descriptor = "I"
   )
   public static int field2058;
   @OriginalMember(
      owner = "client!vja",
      name = "i",
      descriptor = "I"
   )
   public static int field2059;
   @OriginalMember(
      owner = "client!vja",
      name = "c",
      descriptor = "I"
   )
   public static int field2060;
   @OriginalMember(
      owner = "client!vja",
      name = "l",
      descriptor = "I"
   )
   public static int field2063;
   @OriginalMember(
      owner = "client!vja",
      name = "d",
      descriptor = "I"
   )
   public static int field2064;
   @OriginalMember(
      owner = "client!vja",
      name = "g",
      descriptor = "I"
   )
   public static int field2067;
   @OriginalMember(
      owner = "client!vja",
      name = "f",
      descriptor = "[I"
   )
   public int[] field2066;

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(IIZIZII)V"
   )
   public static final void method1311(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         if (arg6 != 2) {
            field2067 = -65;
         }

         if (arg5 > arg3) {
            int var8 = (arg3 + arg5) / 2;
            int var9 = arg3;
            class433 var10 = class529.field8026[var8];
            class529.field8026[var8] = class529.field8026[arg5];
            class529.field8026[arg5] = var10;
            int var11 = arg3;
            class433 var12;
            if (var7) {
               if (class183.method1659(class529.field8026[arg3], false, var10, arg1, arg2, arg4, arg0) <= 0) {
                  var12 = class529.field8026[arg3];
                  class529.field8026[arg3] = class529.field8026[arg3];
                  var9 = arg3 + 1;
                  class529.field8026[arg3] = var12;
               }

               var11 = arg3 + 1;
            }

            while(true) {
               int var10000;
               if (~var11 <= ~arg5) {
                  class529.field8026[arg5] = class529.field8026[var9];
                  class529.field8026[var9] = var10;
                  method1311(arg0, arg1, arg2, arg3, arg4, var9 + -1, 2);
                  var10000 = arg0;
                  if (!var7) {
                     method1311(arg0, arg1, arg2, var9 + 1, arg4, arg5, 2);
                     break;
                  }
               } else {
                  var10000 = class183.method1659(class529.field8026[var11], false, var10, arg1, arg2, arg4, arg0);
               }

               if (var10000 <= 0) {
                  var12 = class529.field8026[var11];
                  class529.field8026[var11] = class529.field8026[var9];
                  class529.field8026[var9++] = var12;
               }

               ++var11;
            }
         }

         ++field2059;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field2070[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(CI)Z"
   )
   public static final boolean method1312(char arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field2058;
         if (~arg0 < -1 && ~arg0 > -129 || arg0 >= 160 && arg0 <= 255) {
            return true;
         } else {
            if (~arg0 != -1) {
               char[] var3 = class653.field9779;
               int var4 = 0;
               if (var2 || ~var3.length < ~var4) {
                  do {
                     char var5 = var3[var4];
                     if (arg0 == var5) {
                        return true;
                     }

                     ++var4;
                  } while(~var3.length < ~var4);
               }
            }

            if (arg1 != 2198) {
               field2065 = null;
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2070[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(ILica;B)V"
   )
   private final void method1313(int arg0, class354 arg1, byte arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg2 < 102) {
            this.field2068 = -118;
         }

         label77: {
            if (~arg0 != -2) {
               if (~arg0 != -3) {
                  if (~arg0 == -4) {
                     this.field2068 = arg1.method2855(-31007);
                     if (!var4) {
                        break label77;
                     }
                  }

                  if (arg0 != 4) {
                     if (arg0 != 5) {
                        break label77;
                     }

                     this.field2062 = arg1.method2848(-121);
                     if (!var4) {
                        break label77;
                     }
                  }

                  this.field2061 = arg1.method2855(-31007);
                  if (!var4) {
                     break label77;
                  }
               }

               this.field2066 = new int[arg1.method2855(-31007)];
               int var5 = 0;
               if (var4) {
                  this.field2066[var5] = arg1.method2848(-92);
                  ++var5;
               }

               while(true) {
                  while(this.field2066.length > var5) {
                     this.field2066[var5] = arg1.method2848(-92);
                     ++var5;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label77;
                     }
                     break;
                  }

                  ++var5;
               }
            }

            this.field2069 = arg1.method2848(-97);
         }

         ++field2063;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2070[4] + arg0 + ',' + (arg1 != null ? field2070[3] : field2070[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public final void method1314(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg0.method2855(-31007);
            if (~var4 != -1) {
               this.method1313(var4, arg0, (byte)104);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field2060;
            break;
         }

         if (arg1 > -103) {
            this.method1313(42, (class354)null, (byte)96);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2070[6] + (arg0 != null ? field2070[3] : field2070[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1315(byte arg0) {
      try {
         if (arg0 >= -35) {
            field2067 = -77;
         }

         field2065 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2070[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1317(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
