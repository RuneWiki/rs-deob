import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 {
   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field211 = new String[]{method131(method130("\u001cs=\u0002\u0000")), method131(method130("\u001cs=\u0007\u0000")), method131(method130("\u001cs=\u0005\u0000")), method131(method130("\u001cs=\u0006\u0000")), method131(method130("\u0003m\u007f/")), method131(method130("\u00166=mU")), method131(method130("\u001cs=\u0001\u0000")), method131(method130("\u001cs=\u0000\u0000"))};
   @OriginalMember(
      owner = "client!qk",
      name = "f",
      descriptor = "I"
   )
   public static int field204;
   @OriginalMember(
      owner = "client!qk",
      name = "g",
      descriptor = "I"
   )
   public static int field205;
   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "I"
   )
   public static int field206;
   @OriginalMember(
      owner = "client!qk",
      name = "d",
      descriptor = "I"
   )
   public static int field208;
   @OriginalMember(
      owner = "client!qk",
      name = "e",
      descriptor = "I"
   )
   public static int field209;
   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "I"
   )
   public static int field210;
   @OriginalMember(
      owner = "client!qk",
      name = "c",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field207;

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method124(int arg0) {
      try {
         if (arg0 != -2) {
            field207 = null;
         }

         field207 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field211[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(IB)I",
      line = 19
   )
   public static final int method125(int arg0, byte arg1) {
      try {
         if (arg1 <= 13) {
            return 60;
         } else {
            ++field206;
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 + -61440;
            int var4 = 40960 - -(arg0 * var3 >> 12);
            return var2 * var4 >> 12;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field211[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(B)V",
      line = 39
   )
   public static final void method126(byte arg0) {
      try {
         ++field209;
         if (class541.field7892 != null) {
            class623.field9082 = new class394();
            class623.field9082.method3007(0, class541.field7892, class541.field7892.field2133.method1562((byte)-92, class728.field10827), class411.field6306, class541.field7892.field2128);
            if (arg0 < -90) {
               class753.field11134 = new Thread(class623.field9082, "");
               class753.field11134.start();
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field211[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(ZLjava/lang/String;ZILjava/lang/String;)V",
      line = 60
   )
   public static final void method127(boolean arg0, String arg1, boolean arg2, int arg3, String arg4) {
      try {
         ++field205;
         class397.field6109 = arg4;
         class515.field7538 = arg0;
         class81.field993 = arg2;
         if (!arg2) {
            class752.field11122 = -1;
         }

         class685.field10283 = arg1;
         if (class81.field993 || !class685.field10283.equals("") && !class397.field6109.equals("")) {
            class768.field11267 = false;
            if (~class448.field6805 != -2) {
               class669.field10062 = 0;
               class619.field9030 = -1;
            }

            class553.method4089((byte)-94, -3);
            class777.field11357 = 1;
            class362.field5455 = arg3;
            class269.field3752 = 0;
         } else {
            class553.method4089((byte)-114, 3);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field211[3] + arg0 + ',' + (arg1 != null ? field211[5] : field211[4]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field211[5] : field211[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(IBZJ)Ljava/lang/String;",
      line = 92
   )
   public static final String method128(int arg0, byte arg1, boolean arg2, long arg3) {
      try {
         ++field204;
         if (arg1 != 3) {
            return null;
         } else {
            Calendar var5;
            label17: {
               if (arg2) {
                  class237.method1769(-1, arg3);
                  var5 = class447.field6795;
                  if (client.field4530 == 0) {
                     break label17;
                  }
               }

               class500.method3735(arg3, (byte)-92);
               var5 = class447.field6798;
            }

            int var6 = var5.get(5);
            int var7 = 1 + var5.get(2);
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field211[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "(B)V",
      line = 125
   )
   public static final void method129(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method130(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method131(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
