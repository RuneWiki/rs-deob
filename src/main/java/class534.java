import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class534 {
   @OriginalMember(
      owner = "client!dk",
      name = "l",
      descriptor = "I"
   )
   public int field7775 = -1;
   @OriginalMember(
      owner = "client!dk",
      name = "e",
      descriptor = "I"
   )
   public int field7782 = -1;
   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7785 = new String[]{method4003(method4002("?I@<T")), method4003(method4002("5W\u0002\u0015")), method4003(method4002(" \f@W\u0001")), method4003(method4002("?I@=T")), method4003(method4002("?I@8T")), method4003(method4002("?I@;T")), method4003(method4002("?I@:T"))};
   @OriginalMember(
      owner = "client!dk",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field7778 = false;
   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "J"
   )
   public static long field7780 = 0L;
   @OriginalMember(
      owner = "client!dk",
      name = "j",
      descriptor = "I"
   )
   public static int field7783 = 0;
   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "I"
   )
   public static int field7773;
   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "I"
   )
   public static int field7774;
   @OriginalMember(
      owner = "client!dk",
      name = "i",
      descriptor = "I"
   )
   public static int field7776;
   @OriginalMember(
      owner = "client!dk",
      name = "k",
      descriptor = "I"
   )
   public static int field7777;
   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "I"
   )
   public static int field7781;
   @OriginalMember(
      owner = "client!dk",
      name = "f",
      descriptor = "Lhw;"
   )
   public static class141 field7784;
   @OriginalMember(
      owner = "client!dk",
      name = "h",
      descriptor = "[I"
   )
   public int[] field7779;

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Luda;I)V",
      line = 3
   )
   public final void method3997(class473 arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg0.method3564((byte)-48);
            if (~var4 != -1) {
               this.method4001(-119, var4, arg0);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != 14671) {
               return;
            }

            ++field7773;
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7785[6] + (arg0 != null ? field7785[2] : field7785[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(BI)V",
      line = 25
   )
   public static final void method3998(byte arg0, int arg1) {
      try {
         class537.field7822 = -1;
         class203.field3034 = 1;
         class233.field3405 = false;
         class548.field7918 = null;
         class435.field6292 = 0;
         ++field7781;
         class167.field2626 = -1;
         class217.field3288 = arg1;
         class710.field10318 = null;
         if (arg0 > -62) {
            field7780 = 121L;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7785[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(B)V",
      line = 52
   )
   public static void method3999(byte arg0) {
      try {
         field7784 = null;
         int var1 = 25 / ((-30 - arg0) / 54);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7785[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(III)Z",
      line = 69
   )
   public static final boolean method4000(int arg0, int arg1, int arg2) {
      try {
         if (arg1 <= 116) {
            field7777 = -61;
         }

         ++field7774;
         return (arg2 & 393216) != 0 | class764.method5527((byte)-56, arg0, arg2) || class330.method2552(arg0, arg2, -1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7785[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(IILuda;)V",
      line = 85
   )
   private final void method4001(int arg0, int arg1, class473 arg2) {
      boolean var4 = client.field4564;

      try {
         label64: {
            if (arg1 == 1) {
               this.field7775 = arg2.method3565(true);
               if (!var4) {
                  break label64;
               }
            }

            if (~arg1 == -3) {
               this.field7779 = new int[arg2.method3564((byte)-68)];
               int var5 = 0;
               if (var4) {
                  this.field7779[var5] = arg2.method3565(true);
                  ++var5;
               }

               while(true) {
                  while(this.field7779.length > var5) {
                     this.field7779[var5] = arg2.method3565(true);
                     ++var5;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label64;
                     }
                     break;
                  }

                  ++var5;
               }
            }

            if (~arg1 == -4) {
               this.field7782 = arg2.method3564((byte)-106);
            }
         }

         int var6 = -1 / ((-70 - arg0) / 36);
         ++field7776;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7785[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7785[2] : field7785[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4002(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4003(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
