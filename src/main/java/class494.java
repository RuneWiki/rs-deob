import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class494 extends class188 {
   @OriginalMember(
      owner = "client!qv",
      name = "r",
      descriptor = "Lsn;"
   )
   public class675 field7462 = new class675();
   @OriginalMember(
      owner = "client!qv",
      name = "s",
      descriptor = "Lkja;"
   )
   public class647 field7470 = new class647();
   @OriginalMember(
      owner = "client!qv",
      name = "A",
      descriptor = "Lti;"
   )
   private class80 field7459;
   @OriginalMember(
      owner = "client!qv",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7471 = new String[]{method3822(method3821(" !\u0002M\"")), method3822(method3821("?\"@g")), method3822(method3821("*y\u0002%w")), method3822(method3821(" !\u0002DKy")), method3822(method3821(" !\u0002OKy")), method3822(method3821(" !\u0002I\"")), method3822(method3821(" !\u0002D\"")), method3822(method3821(" !\u00027c?>X5\"")), method3822(method3821(" !\u0002J\"")), method3822(method3821(" !\u0002^Ky")), method3822(method3821(" !\u0002H\""))};
   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "Lfq;"
   )
   public static class374 field7460 = null;
   @OriginalMember(
      owner = "client!qv",
      name = "C",
      descriptor = "F"
   )
   public static float field7464;
   @OriginalMember(
      owner = "client!qv",
      name = "v",
      descriptor = "I"
   )
   public static int field7461;
   @OriginalMember(
      owner = "client!qv",
      name = "t",
      descriptor = "I"
   )
   public static int field7463;
   @OriginalMember(
      owner = "client!qv",
      name = "y",
      descriptor = "I"
   )
   public static int field7465;
   @OriginalMember(
      owner = "client!qv",
      name = "w",
      descriptor = "I"
   )
   public static int field7466;
   @OriginalMember(
      owner = "client!qv",
      name = "q",
      descriptor = "I"
   )
   public static int field7467;
   @OriginalMember(
      owner = "client!qv",
      name = "u",
      descriptor = "I"
   )
   public static int field7468;
   @OriginalMember(
      owner = "client!qv",
      name = "x",
      descriptor = "I"
   )
   public static int field7469;

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(IILsfa;[III)V"
   )
   private final void method3818(int arg0, int arg1, class357 arg2, int[] arg3, int arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         label73: {
            ++field7468;
            if ((this.field7459.field1072[arg2.field5515] & 4) != 0 && ~arg2.field5492 > -1) {
               int var8 = this.field7459.field1100[arg2.field5515] / class752.field11155;

               while(true) {
                  int var9 = (var8 + 1048575 - arg2.field5498) / var8;
                  if (arg4 < var9) {
                     break;
                  }

                  arg2.field5509.method391(arg3, arg5, var9);
                  arg5 += var9;
                  arg2.field5498 += var8 * var9 + -1048576;
                  arg4 -= var9;
                  int var10 = class752.field11155 / 100;
                  int var11 = 262144 / var8;
                  if (var10 > var11) {
                     var10 = var11;
                  }

                  class54 var12;
                  label80: {
                     var12 = arg2.field5509;
                     if (this.field7459.field1117[arg2.field5515] == 0) {
                        arg2.field5509 = class54.method387(arg2.field5517, var12.method388(), var12.method378(), var12.method401());
                        if (!var7) {
                           break label80;
                        }
                     }

                     arg2.field5509 = class54.method387(arg2.field5517, var12.method388(), 0, var12.method401());
                     this.field7459.method773(arg2, arg2.field5500.field8594[arg2.field5510] < 0, true);
                     arg2.field5509.method371(var10, var12.method378());
                  }

                  if (~arg2.field5500.field8594[arg2.field5510] > -1) {
                     arg2.field5509.method395(-1);
                  }

                  var12.method389(var10);
                  var12.method391(arg3, arg5, -arg5 + arg1);
                  if (var12.method373()) {
                     this.field7470.method4699(var12);
                     if (var7) {
                        break label73;
                     }

                     if (var7) {
                        break;
                     }
                  }
               }

               arg2.field5498 += arg4 * var8;
            }

            arg2.field5509.method391(arg3, arg5, arg4);
         }

         if (arg0 < 102) {
            method3820(false);
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7471[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7471[2] : field7471[1]) + ',' + (arg3 != null ? field7471[2] : field7471[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "c",
      descriptor = "()I"
   )
   public final int method372() {
      try {
         ++field7461;
         return 0;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7471[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "b",
      descriptor = "()Lbn;"
   )
   public final class188 method375() {
      boolean var1 = client.field1786;

      try {
         ++field7469;

         while(true) {
            class357 var2 = (class357)this.field7462.method4975((byte)93);
            if (var2 == null) {
               return null;
            }

            class54 var10000 = var2.field5509;

            while(var10000 != null) {
               var10000 = var2.field5509;
               if (!var1) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7471[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method383(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method391(int[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(Lsfa;BI)V"
   )
   private final void method3819(class357 arg0, byte arg1, int arg2) {
      try {
         int var4 = 109 % ((arg1 - -37) / 59);
         ++field7466;
         if (~(4 & this.field7459.field1072[arg0.field5515]) != -1 && ~arg0.field5492 > -1) {
            int var5 = this.field7459.field1100[arg0.field5515] / class752.field11155;
            int var6 = (1048575 - -var5 + -arg0.field5498) / var5;
            arg0.field5498 = arg2 * var5 + arg0.field5498 & 1048575;
            if (~var6 >= ~arg2) {
               label38: {
                  if (~this.field7459.field1117[arg0.field5515] != -1) {
                     arg0.field5509 = class54.method387(arg0.field5517, arg0.field5509.method388(), 0, arg0.field5509.method401());
                     this.field7459.method773(arg0, arg0.field5500.field8594[arg0.field5510] < 0, true);
                     if (!client.field1786) {
                        break label38;
                     }
                  }

                  arg0.field5509 = class54.method387(arg0.field5517, arg0.field5509.method388(), arg0.field5509.method378(), arg0.field5509.method401());
               }

               if (arg0.field5500.field8594[arg0.field5510] < 0) {
                  arg0.field5509.method395(-1);
               }

               arg2 = arg0.field5498 / var5;
            }
         }

         arg0.field5509.method383(arg2);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7471[5] + (arg0 != null ? field7471[2] : field7471[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3820(boolean arg0) {
      try {
         field7460 = null;
         if (!arg0) {
            method3820(true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7471[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "()Lbn;"
   )
   public final class188 method394() {
      try {
         ++field7467;
         class357 var1 = (class357)this.field7462.method4972((byte)-84);
         if (var1 == null) {
            return null;
         } else {
            return var1.field5509 != null ? var1.field5509 : this.method375();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7471[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "<init>",
      descriptor = "(Lti;)V"
   )
   public class494(class80 arg0) {
      try {
         this.field7459 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7471[7] + (arg0 != null ? field7471[2] : field7471[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3821(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3822(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
