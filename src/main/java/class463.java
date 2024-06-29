import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class463 extends class629 {
   @OriginalMember(
      owner = "client!vj",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6778 = new String[]{method3475(method3474("jN\u001eWE~")), method3475(method3474("dX_")), method3475(method3474("8\u0004")), method3475(method3474("2NQm\f")), method3475(method3474("?\nQ\u000fY")), method3475(method3474("*Q\u0013M")), method3475(method3474("2NQd\f")), method3475(method3474("2NQo\f")), method3475(method3474("2NQk\f")), method3475(method3474("2NQq\f")), method3475(method3474("2NQl\f"))};
   @OriginalMember(
      owner = "client!vj",
      name = "M",
      descriptor = "I"
   )
   public static int field6770 = 0;
   @OriginalMember(
      owner = "client!vj",
      name = "H",
      descriptor = "I"
   )
   public static int field6773 = 1;
   @OriginalMember(
      owner = "client!vj",
      name = "G",
      descriptor = "I"
   )
   public static int field6774 = 0;
   @OriginalMember(
      owner = "client!vj",
      name = "K",
      descriptor = "I"
   )
   public static int field6768 = 0;
   @OriginalMember(
      owner = "client!vj",
      name = "J",
      descriptor = "I"
   )
   public static int field6767;
   @OriginalMember(
      owner = "client!vj",
      name = "D",
      descriptor = "I"
   )
   public static int field6771;
   @OriginalMember(
      owner = "client!vj",
      name = "I",
      descriptor = "I"
   )
   public static int field6772;
   @OriginalMember(
      owner = "client!vj",
      name = "N",
      descriptor = "I"
   )
   public static int field6775;
   @OriginalMember(
      owner = "client!vj",
      name = "E",
      descriptor = "I"
   )
   public static int field6776;
   @OriginalMember(
      owner = "client!vj",
      name = "F",
      descriptor = "I"
   )
   public static int field6777;
   @OriginalMember(
      owner = "client!vj",
      name = "L",
      descriptor = "Lhw;"
   )
   public static class141 field6769;

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method3470(class65 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field6776;
         if (class624.field9090.method2575(-67) != 0) {
            label117: {
               if (class510.field7454.field11145.method2098(false) != 0) {
                  if (class728.field10486 == null) {
                     Canvas var3 = new Canvas();
                     var3.setSize(36, 32);
                     class728.field10486 = class328.method2537(class64.field1169, var3, 0, class169.field2640, (byte)51, 0);
                     class100.field1663 = class728.field10486.method414(class767.method5548(0, -1253, class329.field4702, class550.field7946), class94.method917(class392.field5782, class550.field7946, 0), true);
                  }

                  class26 var4 = (class26)class624.field9090.method2579(-801);
                  if (var2) {
                     class408.field5993.method838(var4.field399, var4.field400 ? class304.field4398.field6676 : null, arg0, class728.field10486, var4.field397, var4.field396, false, var4.field393, class100.field1663, var4.field390, -1, false);
                     var4.method154(-105);
                     var4 = (class26)class624.field9090.method2583(1);
                  }

                  while(true) {
                     while(var4 != null) {
                        class408.field5993.method838(var4.field399, var4.field400 ? class304.field4398.field6676 : null, arg0, class728.field10486, var4.field397, var4.field396, false, var4.field393, class100.field1663, var4.field390, -1, false);
                        var4.method154(-105);
                        var4 = (class26)class624.field9090.method2583(1);
                     }

                     if (!var2) {
                        if (!var2) {
                           break label117;
                        }
                        break;
                     }

                     var4 = (class26)class624.field9090.method2583(1);
                  }
               }

               class26 var5 = (class26)class624.field9090.method2579(-801);
               if (var2) {
                  class408.field5993.method838(var5.field399, var5.field400 ? class304.field4398.field6676 : null, arg0, arg0, var5.field397, var5.field396, false, var5.field393, class193.field2920, var5.field390, -1, false);
                  var5.method154(20);
                  var5 = (class26)class624.field9090.method2583(1);
               }

               while(true) {
                  while(var5 != null) {
                     class408.field5993.method838(var5.field399, var5.field400 ? class304.field4398.field6676 : null, arg0, arg0, var5.field397, var5.field396, false, var5.field393, class193.field2920, var5.field390, -1, false);
                     var5.method154(20);
                     var5 = (class26)class624.field9090.method2583(1);
                  }

                  if (!var2) {
                     class585.method4337((byte)-60);
                     break;
                  }

                  var5 = (class26)class624.field9090.method2583(1);
               }
            }

            int var6 = 1 / ((-50 - arg1) / 47);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6778[10] + (arg0 != null ? field6778[4] : field6778[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field6767;
         if (arg1 != 0) {
            method3472(-120);
         }

         if (~arg2 == -1) {
            super.field9166 = ~arg0.method3564((byte)-73) == -2;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6778[6] + (arg0 != null ? field6778[4] : field6778[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;"
   )
   public static final String method3471(boolean arg0, Throwable arg1) throws IOException {
      boolean var2;
      String var3;
      label43: {
         var2 = client.field4564;
         ++field6772;
         if (!(arg1 instanceof class70)) {
            var3 = "";
            if (!var2) {
               break label43;
            }
         }

         class70 var4 = (class70)arg1;
         arg1 = var4.field1248;
         var3 = var4.field1249 + field6778[1];
      }

      StringWriter var5 = new StringWriter();
      PrintWriter var6 = new PrintWriter(var5);
      arg1.printStackTrace(var6);
      var6.close();
      String var7 = var5.toString();
      BufferedReader var8 = new BufferedReader(new StringReader(var7));
      String var9 = var8.readLine();
      if (arg0) {
         method3473(true);
      }

      while(true) {
         String var10 = var8.readLine();
         if (var10 != null) {
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            if (var2) {
               break;
            }

            String var13;
            label32: {
               if (var11 != -1) {
                  var13 = var10.substring(0, var11);
                  if (!var2) {
                     break label32;
                  }
               }

               var13 = var10;
            }

            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(1 + var15.lastIndexOf(9));
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
               int var18 = var10.indexOf(field6778[0], var11);
               if (~var18 <= -1) {
                  var17 = var17 + var10.substring(var18 - -5, var12);
               }
            }

            var3 = var17 + ' ';
            if (!var2) {
               continue;
            }
         }

         var3 = var3 + field6778[2] + var9;
         break;
      }

      return var3;
   }

   @OriginalMember(
      owner = "client!vj",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3472(int arg0) {
      try {
         if (arg0 == 1) {
            field6769 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6778[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method3473(boolean arg0) {
      try {
         class398.field5859.method1570((byte)15);
         ++field6775;
         class191.field2889.method1570((byte)15);
         if (!arg0) {
            method3473(false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6778[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "<init>",
      descriptor = "()V"
   )
   public class463() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field6777;
         if (arg1 != 0) {
            this.method243(121, 95);
         }

         int[][] var4 = super.field9169.method785((byte)108, arg0);
         if (super.field9169.field1332) {
            int[][] var5 = this.method4621(-105, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || ~var12 > ~class66.field1214) {
               do {
                  var9[var12] = -var6[var12] + 4096;
                  var10[var12] = -var7[var12] + 4096;
                  var11[var12] = -var8[var12] + 4096;
                  ++var12;
               } while(~var12 > ~class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field6778[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field6771;
         if (arg1 != 2048) {
            return null;
         } else {
            int[] var4 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               int[] var5 = this.method4622((byte)125, 0, arg0);
               int var6 = 0;
               if (var3 || var6 < class66.field1214) {
                  do {
                     var4[var6] = -var5[var6] + 4096;
                     ++var6;
                  } while(var6 < class66.field1214);
               }
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6778[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3474(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3475(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
