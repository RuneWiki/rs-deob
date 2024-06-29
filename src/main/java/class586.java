import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class586 extends class673 {
   @OriginalMember(
      owner = "client!va",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8656 = new String[]{method4373(method4372("M!k\u0017W")), method4373(method4372("@nkz\u0002")), method4373(method4372("U5)8")), method4373(method4372("\u0001`")), method4373(method4372("M!k\u0015W")), method4373(method4372("M!k\u0016W"))};
   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "I"
   )
   public static int field8647 = 100;
   @OriginalMember(
      owner = "client!va",
      name = "n",
      descriptor = "I"
   )
   public static int field8649 = 999999;
   @OriginalMember(
      owner = "client!va",
      name = "w",
      descriptor = "I"
   )
   public static int field8654 = 0;
   @OriginalMember(
      owner = "client!va",
      name = "C",
      descriptor = "I"
   )
   public static int field8638;
   @OriginalMember(
      owner = "client!va",
      name = "p",
      descriptor = "I"
   )
   public int field8639;
   @OriginalMember(
      owner = "client!va",
      name = "t",
      descriptor = "I"
   )
   public static int field8640;
   @OriginalMember(
      owner = "client!va",
      name = "r",
      descriptor = "I"
   )
   public static int field8641;
   @OriginalMember(
      owner = "client!va",
      name = "v",
      descriptor = "I"
   )
   public int field8642;
   @OriginalMember(
      owner = "client!va",
      name = "o",
      descriptor = "I"
   )
   public int field8646;
   @OriginalMember(
      owner = "client!va",
      name = "y",
      descriptor = "I"
   )
   public int field8650;
   @OriginalMember(
      owner = "client!va",
      name = "x",
      descriptor = "I"
   )
   public static int field8651;
   @OriginalMember(
      owner = "client!va",
      name = "q",
      descriptor = "I"
   )
   public int field8652;
   @OriginalMember(
      owner = "client!va",
      name = "u",
      descriptor = "I"
   )
   public int field8653;
   @OriginalMember(
      owner = "client!va",
      name = "B",
      descriptor = "Loca;"
   )
   public class642 field8644;
   @OriginalMember(
      owner = "client!va",
      name = "l",
      descriptor = "Loca;"
   )
   public class642 field8655;
   @OriginalMember(
      owner = "client!va",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field8643;
   @OriginalMember(
      owner = "client!va",
      name = "A",
      descriptor = "Z"
   )
   public boolean field8645;
   @OriginalMember(
      owner = "client!va",
      name = "s",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field8648;

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method4369(String arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         if (class644.field9659 == null) {
            class209.method1722(true);
         }

         ++field8641;
         class652.field9740.setTime(new Date(class163.method1353(-121)));
         int var3 = class652.field9740.get(11);
         int var4 = class652.field9740.get(12);
         int var5 = class652.field9740.get(13);
         String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
         String[] var7 = class61.method549(arg0, '\n', true);
         int var8 = 0;
         if (arg1 <= 37) {
            field8647 = 120;
            if (!var2 && var7.length <= var8) {
               return;
            }
         } else if (var7.length <= var8) {
            return;
         }

         do {
            int var9 = class307.field4306;
            if (var2) {
               class644.field9659[var9] = class644.field9659[var9 + -1];
               --var9;
            }

            while(true) {
               while(~var9 < -1) {
                  class644.field9659[var9] = class644.field9659[var9 + -1];
                  --var9;
               }

               class644.field9659[0] = var6 + field8656[3] + var7[var8];
               if (!var2) {
                  if (class199.field2533 != null) {
                     try {
                        class199.field2533.write(class270.method2147(-70, class644.field9659[0] + "\n"));
                     } catch (IOException var11) {
                     }
                  }

                  if (class644.field9659.length + -1 > class307.field4306) {
                     if (~class737.field10796 < -1) {
                        ++class737.field10796;
                     }

                     ++class307.field4306;
                  }

                  ++var8;
                  break;
               }

               --var9;
            }
         } while(var7.length > var8);

      } catch (RuntimeException var12) {
         throw class93.method866(var12, field8656[0] + (arg0 != null ? field8656[1] : field8656[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(IBIILka;Lnk;)V"
   )
   public static final void method4370(int arg0, byte arg1, int arg2, int arg3, class232 arg4, class484 arg5) {
      try {
         ++field8640;
         if (arg4 != null) {
            int var6 = 96 % ((arg1 - -14) / 60);
            arg5.method3677(arg4.method1295(), arg4.method1287(), arg4.method1303(), arg4.method1226(), arg4.method1250(), -124, arg0, arg2, arg4.method1261(), arg3, arg4.method1286());
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field8656[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8656[1] : field8656[2]) + ',' + (arg5 != null ? field8656[1] : field8656[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method4371(int arg0, int arg1, byte arg2) {
      try {
         ++field8638;
         if (arg2 <= 6) {
            return true;
         } else if (arg1 >= 1000 && arg0 < 1000) {
            return true;
         } else if (arg1 < 1000 && ~arg0 > -1001) {
            if (class391.method3093(arg0, false)) {
               return true;
            } else {
               return !class391.method3093(arg1, false);
            }
         } else {
            return arg1 >= 1000 && arg0 >= 1000;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8656[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
