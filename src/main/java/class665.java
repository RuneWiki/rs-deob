import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class665 implements class26 {
   @OriginalMember(
      owner = "client!ej",
      name = "c",
      descriptor = "I"
   )
   public int field9950;
   @OriginalMember(
      owner = "client!ej",
      name = "i",
      descriptor = "I"
   )
   public int field9954;
   @OriginalMember(
      owner = "client!ej",
      name = "h",
      descriptor = "Lgea;"
   )
   public class750 field9967;
   @OriginalMember(
      owner = "client!ej",
      name = "s",
      descriptor = "I"
   )
   public int field9951;
   @OriginalMember(
      owner = "client!ej",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public String field9965;
   @OriginalMember(
      owner = "client!ej",
      name = "p",
      descriptor = "I"
   )
   public int field9963;
   @OriginalMember(
      owner = "client!ej",
      name = "o",
      descriptor = "Lrga;"
   )
   public class694 field9949;
   @OriginalMember(
      owner = "client!ej",
      name = "j",
      descriptor = "I"
   )
   public int field9955;
   @OriginalMember(
      owner = "client!ej",
      name = "l",
      descriptor = "I"
   )
   public int field9960;
   @OriginalMember(
      owner = "client!ej",
      name = "r",
      descriptor = "I"
   )
   public int field9959;
   @OriginalMember(
      owner = "client!ej",
      name = "q",
      descriptor = "I"
   )
   public int field9953;
   @OriginalMember(
      owner = "client!ej",
      name = "e",
      descriptor = "I"
   )
   public int field9956;
   @OriginalMember(
      owner = "client!ej",
      name = "n",
      descriptor = "I"
   )
   public int field9952;
   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9969 = new String[]{method4918(method4917(".\b;oW")), method4918(method4917(".\b;hW")), method4918(method4917(".\b;kW")), method4918(method4917(".\b;nW")), method4918(method4917(".\b;lW")), method4918(method4917("%\u0017yF")), method4918(method4917("0L;\u0004\u0002")), method4918(method4917(".\b;\u0016\u0016%\u000ba\u0014W")), method4918(method4917(".\b;iW"))};
   @OriginalMember(
      owner = "client!ej",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field9966 = true;
   @OriginalMember(
      owner = "client!ej",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field9961 = new class498(110, -2);
   @OriginalMember(
      owner = "client!ej",
      name = "g",
      descriptor = "Luk;"
   )
   public static class498 field9968 = new class498(38, 4);
   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "I"
   )
   public static int field9948;
   @OriginalMember(
      owner = "client!ej",
      name = "u",
      descriptor = "I"
   )
   public static int field9957;
   @OriginalMember(
      owner = "client!ej",
      name = "b",
      descriptor = "I"
   )
   public static int field9958;
   @OriginalMember(
      owner = "client!ej",
      name = "k",
      descriptor = "I"
   )
   public static int field9962;
   @OriginalMember(
      owner = "client!ej",
      name = "f",
      descriptor = "I"
   )
   public static int field9964;

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public static final void method4912(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field9962;
         if (class560.field8328 != arg0 || class200.field3072 != arg1 || ~class662.field9929 != ~arg3) {
            class662.field9929 = arg3;
            class67.field884 = true;
            class560.field8328 = arg0;
            class200.field3072 = arg1;
            double var4 = -((double)(arg0 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double)(arg1 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            if (arg2 > 81) {
               double var12 = Math.cos(var4);
               double var14 = Math.sin(var4);
               class193.field2989 = var10;
               class341.field5193 = var8 * var12;
               class780.field11435 = -var10 * var12;
               class298.field4690 = var14;
               class238.field3622 = -var8 * var14;
               class97.field1364 = var8;
               class341.field5194 = var10 * var14;
               class162.field2420 = var12;
               class383.field6042 = 0.0D;
            }
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field9969[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "b",
      descriptor = "(B)Lkb;"
   )
   public static final class28 method4913(byte arg0) {
      try {
         ++field9964;
         if (class60.field747 != null && class125.field1799 != null) {
            if (arg0 != 35) {
               field9968 = null;
            }

            class125.field1799.method4452((byte)44, class60.field747);
            class28 var1 = (class28)class125.field1799.method4453((byte)127);
            if (var1 == null) {
               return null;
            } else {
               class77 var2 = class60.field744.method133(var1.field332, 36);
               return var2 != null && var2.field987 && var2.method725(class60.field741, true) ? var1 : class431.method3406(25710);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9969[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4914(byte arg0) {
      try {
         field9961 = null;
         if (arg0 >= -101) {
            method4915(false, 39);
         }

         field9968 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9969[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method4915(boolean arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field9957;
         if (class623.field9053 == null) {
            return 0;
         } else if (!arg0 && class471.field7172 != null) {
            return class623.field9053.length * 2;
         } else {
            int var3 = 0;
            int var4 = arg1;
            int var5;
            if (var2) {
               var5 = class623.field9053[arg1];
               if (class702.field10458.method5002(var5, (byte)100)) {
                  ++var3;
               }

               if (class81.field1152.method5002(var5, (byte)110)) {
                  ++var3;
               }

               var4 = arg1 + 1;
            }

            while(true) {
               int var10000;
               if (~class623.field9053.length >= ~var4) {
                  var10000 = var3;
                  if (!var2) {
                     return var3;
                  }
               } else {
                  var10000 = class623.field9053[var4];
               }

               var5 = var10000;
               if (class702.field10458.method5002(var5, (byte)100)) {
                  ++var3;
               }

               if (class81.field1152.method5002(var5, (byte)110)) {
                  ++var3;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9969[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method4916(byte arg0, int arg1) {
      try {
         if (arg0 != 59) {
            field9968 = null;
         }

         ++field9948;
         return arg1 & 255;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9969[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Lrga;Lgea;IIIIIIIIII)V"
   )
   public class665(String arg0, class694 arg1, class750 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.field9950 = arg9;
         this.field9954 = arg12;
         this.field9967 = arg2;
         this.field9951 = arg3;
         this.field9965 = arg0;
         this.field9963 = arg10;
         this.field9949 = arg1;
         this.field9955 = arg8;
         this.field9960 = arg4;
         this.field9959 = arg11;
         this.field9953 = arg6;
         this.field9956 = arg7;
         this.field9952 = arg5;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field9969[7] + (arg0 != null ? field9969[6] : field9969[5]) + ',' + (arg1 != null ? field9969[6] : field9969[5]) + ',' + (arg2 != null ? field9969[6] : field9969[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(I)Lbda;"
   )
   public final class783 method193(int arg0) {
      try {
         if (arg0 != -1) {
            this.field9954 = -77;
         }

         ++field9958;
         return class650.field9377;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9969[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4917(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4918(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
