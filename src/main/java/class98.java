import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class98 implements class34 {
   @OriginalMember(
      owner = "client!l",
      name = "m",
      descriptor = "Let;"
   )
   private class389 field1378 = new class389(128);
   @OriginalMember(
      owner = "client!l",
      name = "h",
      descriptor = "[I"
   )
   public int[] field1385;
   @OriginalMember(
      owner = "client!l",
      name = "k",
      descriptor = "[I"
   )
   private int[] field1382;
   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1387 = new String[]{method966(method965("U:u3")), method966(method965("U:{3")), method966(method965("U:z3")), method966(method965("U:\u0000r\\P`\u00023")), method966(method965("U:x3")), method966(method965("U:t3")), method966(method965("E4")), method966(method965("\u0019h\u001c")), method966(method965("\u0017~]mS\u0003")), method966(method965("U:y3")), method966(method965("U:}3")), method966(method965("U:~3"))};
   @OriginalMember(
      owner = "client!l",
      name = "b",
      descriptor = "I"
   )
   public static int field1379 = 0;
   @OriginalMember(
      owner = "client!l",
      name = "n",
      descriptor = "I"
   )
   public static int field1373;
   @OriginalMember(
      owner = "client!l",
      name = "c",
      descriptor = "I"
   )
   public static int field1374;
   @OriginalMember(
      owner = "client!l",
      name = "l",
      descriptor = "I"
   )
   public static int field1375;
   @OriginalMember(
      owner = "client!l",
      name = "e",
      descriptor = "I"
   )
   public static int field1376;
   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "I"
   )
   public static int field1377;
   @OriginalMember(
      owner = "client!l",
      name = "i",
      descriptor = "I"
   )
   public static int field1380;
   @OriginalMember(
      owner = "client!l",
      name = "f",
      descriptor = "I"
   )
   public static int field1381;
   @OriginalMember(
      owner = "client!l",
      name = "j",
      descriptor = "I"
   )
   public static int field1383;
   @OriginalMember(
      owner = "client!l",
      name = "g",
      descriptor = "I"
   )
   public static int field1386;
   @OriginalMember(
      owner = "client!l",
      name = "d",
      descriptor = "J"
   )
   public static long field1384;

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method958(byte arg0) {
      boolean var2 = client.field1786;

      try {
         int var3 = 0;
         class116 var4;
         if (var2) {
            var4 = class479.field7291.method502(true, var3);
            if (var4 != null && var4.field1563 == 0) {
               this.field1382[var3] = 0;
               this.field1385[var3] = 0;
            }

            ++var3;
         }

         while(~var3 > ~class479.field7291.field857) {
            var4 = class479.field7291.method502(true, var3);
            if (var4 != null && var4.field1563 == 0) {
               this.field1382[var3] = 0;
               this.field1385[var3] = 0;
            }

            ++var3;
         }

         if (arg0 != -56) {
            this.method964(-11, 33, -26);
         }

         ++field1377;
         this.field1378 = new class389(128);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1387[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method959(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 40) {
            this.method962(11, false);
         }

         ++field1383;
         this.field1385[arg1] = arg2;
         class536 var4 = (class536)this.field1378.method3141((long)arg1, true);
         if (var4 == null) {
            class536 var5 = new class536(class162.method1442(14080) - -500L);
            this.field1378.method3143(76, var5, (long)arg1);
         } else {
            var4.field8115 = class162.method1442(14080) - -500L;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1387[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method960(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 <= -44) {
            ++field1375;
            class87 var4 = class228.field3467.method1030((byte)-119, arg0);
            int var5 = var4.field1268;
            int var6 = var4.field1264;
            int var7 = var4.field1263;
            int var8 = class462.field7020[-var6 + var7];
            if (~arg2 > -1 || ~var8 > ~arg2) {
               arg2 = 0;
            }

            int var9 = var8 << var6;
            this.method959(40, var5, arg2 << var6 & var9 | this.field1385[var5] & ~var9);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1387[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;"
   )
   public static final String method961(Throwable arg0, int arg1) throws IOException {
      boolean var2;
      String var3;
      label45: {
         var2 = client.field1786;
         ++field1386;
         if (!(arg0 instanceof class364)) {
            var3 = "";
            if (!var2) {
               break label45;
            }
         }

         class364 var4 = (class364)arg0;
         var3 = var4.field5624 + field1387[7];
         arg0 = var4.field5626;
      }

      StringWriter var5 = new StringWriter();
      PrintWriter var6 = new PrintWriter(var5);
      arg0.printStackTrace(var6);
      var6.close();
      String var7 = var5.toString();
      BufferedReader var8 = new BufferedReader(new StringReader(var7));
      if (arg1 != 19010) {
         return null;
      } else {
         String var9 = var8.readLine();

         while(true) {
            String var10 = var8.readLine();
            if (var10 != null) {
               int var11 = var10.indexOf(40);
               int var12 = var10.indexOf(41, var11 + 1);
               if (var2) {
                  break;
               }

               String var13;
               label34: {
                  if (~var11 == 0) {
                     var13 = var10;
                     if (!var2) {
                        break label34;
                     }
                  }

                  var13 = var10.substring(0, var11);
               }

               String var14 = var13.trim();
               String var15 = var14.substring(1 + var14.lastIndexOf(32));
               String var16 = var15.substring(var15.lastIndexOf(9) - -1);
               String var17 = var3 + var16;
               if (var11 != -1 && ~var12 != 0) {
                  int var18 = var10.indexOf(field1387[8], var11);
                  if (~var18 <= -1) {
                     var17 = var17 + var10.substring(var18 + 5, var12);
                  }
               }

               var3 = var17 + ' ';
               if (!var2) {
                  continue;
               }
            }

            var3 = var3 + field1387[6] + var9;
            break;
         }

         return var3;
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "b",
      descriptor = "(IZ)I"
   )
   public final int method962(int arg0, boolean arg1) {
      boolean var3 = client.field1786;

      try {
         ++field1381;
         long var4 = class162.method1442(14080);
         class536 var6 = arg1 ? (class536)this.field1378.method3139(-123) : (class536)this.field1378.method3147(-21068);
         if (arg0 != 0) {
            return 79;
         } else {
            while(true) {
               int var10000;
               if (var6 == null) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  long var10;
                  var10000 = (var10 = var4 - (4611686018427387903L & var6.field8115)) == 0L ? 0 : (var10 < 0L ? -1 : 1);
               }

               if (var10000 > 0) {
                  if (~(var6.field8115 & 4611686018427387904L) != -1L) {
                     int var7 = (int)var6.field4655;
                     this.field1385[var7] = this.field1382[var7];
                     var6.method2477(1976);
                     return var7;
                  }

                  var6.method2477(1976);
               }

               var6 = (class536)this.field1378.method3147(-21068);
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field1387[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method963(byte arg0, int arg1, int arg2) {
      try {
         ++field1380;
         class87 var4 = class228.field3467.method1030((byte)-115, arg2);
         int var5 = var4.field1268;
         if (arg0 > -102) {
            this.method963((byte)-124, 109, 3);
         }

         int var6 = var4.field1264;
         int var7 = var4.field1263;
         int var8 = class462.field7020[-var6 + var7];
         if (~arg1 > -1 || var8 < arg1) {
            arg1 = 0;
         }

         int var9 = var8 << var6;
         this.method964(60, var5, arg1 << var6 & var9 | ~var9 & this.field1382[var5]);
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1387[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method253(int arg0, byte arg1) {
      try {
         if (arg1 != -118) {
            this.field1378 = null;
         }

         ++field1373;
         return this.field1385[arg0];
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1387[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method252(int arg0, boolean arg1) {
      try {
         ++field1376;
         if (!arg1) {
            field1379 = 64;
         }

         class87 var3 = class228.field3467.method1030((byte)-115, arg0);
         int var4 = var3.field1268;
         int var5 = var3.field1264;
         int var6 = var3.field1263;
         int var7 = class462.field7020[-var5 + var6];
         return var7 & this.field1385[var4] >> var5;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field1387[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method964(int arg0, int arg1, int arg2) {
      try {
         this.field1382[arg1] = arg2;
         int var4 = -8 % ((-2 - arg0) / 53);
         ++field1374;
         class536 var5 = (class536)this.field1378.method3141((long)arg1, true);
         if (var5 != null) {
            if (var5.field8115 != 4611686018427387905L) {
               var5.field8115 = 4611686018427387904L | 500L + class162.method1442(14080);
               return;
            }
         } else {
            class536 var6 = new class536(4611686018427387905L);
            this.field1378.method3143(52, var6, (long)arg1);
         }

      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1387[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "<init>",
      descriptor = "()V"
   )
   public class98() {
      try {
         this.field1385 = new int[class479.field7291.field857];
         this.field1382 = new int[class479.field7291.field857];
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1387[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method965(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method966(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
