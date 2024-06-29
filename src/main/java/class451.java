import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class451 {
   @OriginalMember(
      owner = "client!pk",
      name = "e",
      descriptor = "Ltia;"
   )
   private class208 field6895 = new class208();
   @OriginalMember(
      owner = "client!pk",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field6900;
   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6906 = new String[]{method3544(method3543("\u0016\u00169T")), method3544(method3543("\b\b{y%")), method3544(method3543("\u0003M{\u0016p")), method3544(method3543("\b\b{\u0004d\u0016\n!\u0006%")), method3544(method3543("\b\b{z%")), method3544(method3543("\r\u000f")), method3544(method3543("\b\b{}%")), method3544(method3543("\r\u000e")), method3544(method3543("\b\b{|%")), method3544(method3543("\b\b{~%")), method3544(method3543("\b\b{p%")), method3544(method3543("\b\b{{%")), method3544(method3543("\b\b{\u007f%"))};
   @OriginalMember(
      owner = "client!pk",
      name = "d",
      descriptor = "I"
   )
   public static int field6897 = 0;
   @OriginalMember(
      owner = "client!pk",
      name = "h",
      descriptor = "I"
   )
   public static int field6893;
   @OriginalMember(
      owner = "client!pk",
      name = "f",
      descriptor = "I"
   )
   public static int field6896;
   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "I"
   )
   public static int field6898;
   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "I"
   )
   public static int field6899;
   @OriginalMember(
      owner = "client!pk",
      name = "l",
      descriptor = "I"
   )
   public static int field6901;
   @OriginalMember(
      owner = "client!pk",
      name = "k",
      descriptor = "I"
   )
   public static int field6902;
   @OriginalMember(
      owner = "client!pk",
      name = "g",
      descriptor = "I"
   )
   private volatile int field6904;
   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "I"
   )
   public static int field6905;
   @OriginalMember(
      owner = "client!pk",
      name = "i",
      descriptor = "Lda;"
   )
   public static class288 field6894;
   @OriginalMember(
      owner = "client!pk",
      name = "j",
      descriptor = "Lrm;"
   )
   private class533 field6903;

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method3535(int arg0) {
      try {
         if (arg0 != -10336) {
            method3539((byte)-101);
         }

         field6894 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6906[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Lvs;I)V",
      line = 17
   )
   public final void method3536(class27 arg0, int arg1) {
      try {
         class208 var3 = this.field6895;
         synchronized(this.field6895) {
            this.field6895.method1813(arg0, 0);
            if (arg1 < 55) {
               return;
            }

            ++this.field6904;
         }

         ++field6901;
         if (this.field6903 != null) {
            class533 var4 = this.field6903;
            synchronized(this.field6903) {
               this.field6903.notify();
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6906[1] + (arg0 != null ? field6906[2] : field6906[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(BLrm;)V",
      line = 45
   )
   public final void method3537(byte arg0, class533 arg1) {
      try {
         if (arg0 != -32) {
            this.method3537((byte)13, (class533)null);
         }

         this.field6903 = arg1;
         ++field6893;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6906[11] + arg0 + ',' + (arg1 != null ? field6906[2] : field6906[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Lbaa;I)V",
      line = 56
   )
   public final void method3538(class109 arg0, int arg1) {
      try {
         ++field6898;
         arg0.field1511 = false;
         class208 var3 = this.field6895;
         synchronized(this.field6895) {
            this.field6895.method1813(arg0, 0);
            ++this.field6904;
         }

         if (arg1 <= 49) {
            this.field6904 = 24;
         }

         if (this.field6903 != null) {
            class533 var4 = this.field6903;
            synchronized(this.field6903) {
               this.field6903.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6906[12] + (arg0 != null ? field6906[2] : field6906[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(B)V",
      line = 78
   )
   public static final void method3539(byte arg0) {
      boolean var1 = client.field1786;

      try {
         class55.field683 = 0;
         ++field6905;
         if (arg0 >= -116) {
            field6897 = 100;
         }

         int var3;
         int var4;
         int var6;
         int var7;
         int var9;
         label90: {
            class102 var2 = class510.field7801.field362;
            var3 = var2.method2867(68);
            var4 = var2.method2848(-96);
            int var5 = var2.method2868(1318266360);
            var6 = ~var2.method2855(-31007) != -2 ? 0 : 1;
            class227.method1966((byte)-1);
            class735.method5409((byte)20, var5);
            var7 = (class510.field7801.field370 - var2.field5436) / 16;
            class398.field6243 = new int[var7][4];
            int var8 = 0;
            if (var1) {
               var9 = 0;
               if (var1) {
                  class398.field6243[var8][var9] = var2.method2894(118);
                  ++var9;
               }
            } else {
               if (~var7 >= ~var8) {
                  class62.field796 = new int[var7];
                  class689.field10244 = new byte[var7][];
                  class147.field2216 = new int[var7];
                  class190.field2943 = null;
                  class109.field1510 = new int[var7];
                  class432.field6654 = null;
                  class332.field5034 = new byte[var7][];
                  class104.field1448 = new int[var7];
                  class341.field5192 = new byte[var7][];
                  class614.field8918 = new int[var7];
                  class511.field7815 = new byte[var7][];
                  var7 = 0;
                  var9 = (-(class513.field7828 >> 4) + var3) / 8;
                  if (!var1) {
                     break label90;
                  }
               } else {
                  var9 = 0;
               }

               if (var1) {
                  class398.field6243[var8][var9] = var2.method2894(118);
                  ++var9;
               }
            }

            while(true) {
               while(var9 < 4) {
                  class398.field6243[var8][var9] = var2.method2894(118);
                  ++var9;
               }

               if (!var1) {
                  ++var8;
                  if (~var7 >= ~var8) {
                     class62.field796 = new int[var7];
                     class689.field10244 = new byte[var7][];
                     class147.field2216 = new int[var7];
                     class190.field2943 = null;
                     class109.field1510 = new int[var7];
                     class432.field6654 = null;
                     class332.field5034 = new byte[var7][];
                     class104.field1448 = new int[var7];
                     class341.field5192 = new byte[var7][];
                     class614.field8918 = new int[var7];
                     class511.field7815 = new byte[var7][];
                     var7 = 0;
                     var9 = (-(class513.field7828 >> 4) + var3) / 8;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var9 = 0;
                  }

                  if (var1) {
                     class398.field6243[var8][var9] = var2.method2894(118);
                     ++var9;
                  }
               } else {
                  ++var9;
               }
            }
         }

         int var10000;
         int var10001;
         int var10002;
         if (var1) {
            var10000 = var4;
            var10001 = class475.field7230;
            var10002 = 1928409508;
         } else if (var9 > ((class513.field7828 >> 4) + var3) / 8) {
            var10000 = var6;
            var10001 = var4;
            var10002 = 12;
            if (!var1) {
               class510.method3965((boolean)var6, var4, 12, var3, (byte)51);
               return;
            }
         } else {
            var10000 = var4;
            var10001 = class475.field7230;
            var10002 = 1928409508;
         }

         while(true) {
            int var10 = (var10000 - (var10001 >> var10002)) / 8;
            if (var1) {
               class62.field796[var7] = (var9 << 8) + var10;
               class614.field8918[var7] = class742.field11031.method4999("m" + var9 + "_" + var10, (byte)45);
               class104.field1448[var7] = class742.field11031.method4999("l" + var9 + "_" + var10, (byte)115);
               class109.field1510[var7] = class742.field11031.method4999(field6906[7] + var9 + "_" + var10, (byte)126);
               class147.field2216[var7] = class742.field11031.method4999(field6906[5] + var9 + "_" + var10, (byte)124);
               ++var7;
               ++var10;
            }

            while(true) {
               while(var10 <= ((class475.field7230 >> 4) + var4) / 8) {
                  class62.field796[var7] = (var9 << 8) + var10;
                  class614.field8918[var7] = class742.field11031.method4999("m" + var9 + "_" + var10, (byte)45);
                  class104.field1448[var7] = class742.field11031.method4999("l" + var9 + "_" + var10, (byte)115);
                  class109.field1510[var7] = class742.field11031.method4999(field6906[7] + var9 + "_" + var10, (byte)126);
                  class147.field2216[var7] = class742.field11031.method4999(field6906[5] + var9 + "_" + var10, (byte)124);
                  ++var7;
                  ++var10;
               }

               if (!var1) {
                  ++var9;
                  if (var9 > ((class513.field7828 >> 4) + var3) / 8) {
                     var10000 = var6;
                     var10001 = var4;
                     var10002 = 12;
                     if (!var1) {
                        class510.method3965((boolean)var6, var4, 12, var3, (byte)51);
                        return;
                     }
                  } else {
                     var10000 = var4;
                     var10001 = class475.field7230;
                     var10002 = 1928409508;
                  }
                  break;
               }

               ++var10;
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field6906[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "(B)Lpha;",
      line = 162
   )
   public final class391 method3540(byte arg0) {
      try {
         ++field6899;
         Object var2 = null;
         if (arg0 != -108) {
            this.method3536((class27)null, -107);
         }

         class208 var3 = this.field6895;
         synchronized(this.field6895) {
            class391 var4 = this.field6895.method1815(arg0 ^ -107);
            var4.method3159(true);
            --this.field6904;
            return var4;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6906[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Z)Z",
      line = 181
   )
   public final boolean method3541(boolean arg0) {
      try {
         if (arg0) {
            method3539((byte)26);
         }

         ++field6902;
         return this.field6904 == 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6906[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 200
   )
   public class451(String arg0) {
      try {
         this.field6900 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6906[3] + (arg0 != null ? field6906[2] : field6906[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(Lbaa;B)V",
      line = 209
   )
   public final void method3542(class109 arg0, byte arg1) {
      try {
         arg0.field1511 = true;
         ++field6896;
         class208 var3 = this.field6895;
         synchronized(this.field6895) {
            this.field6895.method1813(arg0, 0);
            if (arg1 != 86) {
               this.method3542((class109)null, (byte)-37);
            }

            ++this.field6904;
         }

         if (this.field6903 != null) {
            class533 var4 = this.field6903;
            synchronized(this.field6903) {
               this.field6903.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6906[9] + (arg0 != null ? field6906[2] : field6906[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3543(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3544(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
