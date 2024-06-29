import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public abstract class class413 {
   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5680 = new String[]{method3243(method3242("\u0012x)\u001b\u0011K")), method3243(method3242("\u0012x)\u001b\u0015K")), method3243(method3242("\u0012x)\u001b\u0017K")), method3243(method3242("\u00184f\u001b.")), method3243(method3242("\ro$Y"))};
   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "I"
   )
   public static int field5678 = 0;
   @OriginalMember(
      owner = "client!qba",
      name = "e",
      descriptor = "Laka;"
   )
   public static class418 field5677 = new class418(80, -1);
   @OriginalMember(
      owner = "client!qba",
      name = "d",
      descriptor = "Lse;"
   )
   public static class6 field5679 = new class6(39, 7);
   @OriginalMember(
      owner = "client!qba",
      name = "g",
      descriptor = "I"
   )
   public static int field5672;
   @OriginalMember(
      owner = "client!qba",
      name = "h",
      descriptor = "I"
   )
   public static int field5673;
   @OriginalMember(
      owner = "client!qba",
      name = "c",
      descriptor = "I"
   )
   public static int field5674;
   @OriginalMember(
      owner = "client!qba",
      name = "f",
      descriptor = "I"
   )
   public static int field5675;
   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "I"
   )
   public static int field5676;

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(BII)[B"
   )
   public abstract byte[] method527(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(I)[B"
   )
   public abstract byte[] method529(int arg0);

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(Lgea;I)Lhp;"
   )
   public static final class366 method3239(class66 arg0, int arg1) {
      try {
         ++field5672;
         int var2 = arg0.method603(-2);
         class237 var3 = class405.method3174(true)[arg0.method640(255)];
         class596 var4 = class680.method4958(127)[arg0.method640(255)];
         if (arg1 <= 45) {
            return null;
         } else {
            int var5 = arg0.method652((byte)79);
            int var6 = arg0.method652((byte)-121);
            return new class366(var2, var3, var4, var5, var6);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5680[2] + (arg0 != null ? field5680[3] : field5680[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method3240(int arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         ++field5675;
         if (arg1) {
            if (class661.field9817 != -1) {
               class108.method967((byte)-124, class661.field9817);
            }

            int var10000;
            label65: {
               class710 var3 = (class710)class397.field5473.method1817(-55);
               if (var2) {
                  var10000 = var3.method4926(0);
               } else if (var3 == null) {
                  class661.field9817 = -1;
                  class397.field5473 = new class227(8);
                  class486.method3691((byte)-98);
                  class661.field9817 = class405.field5556;
                  class491.method3730(false, false);
                  class406.method3178((byte)117);
                  var10000 = class661.field9817;
                  if (!var2) {
                     break label65;
                  }
               } else {
                  var10000 = var3.method4926(0);
               }

               label64:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class710)class397.field5473.method1817(-26);
                        if (var3 == null) {
                           if (!var2) {
                              class661.field9817 = -1;
                              class397.field5473 = new class227(8);
                              class486.method3691((byte)-98);
                              class661.field9817 = class405.field5556;
                              class491.method3730(false, false);
                              class406.method3178((byte)117);
                              var10000 = class661.field9817;
                              break;
                           }

                           class456.method3489(3, var3, false, true);
                           var3 = (class710)class397.field5473.method1812(353);
                        } else {
                           class456.method3489(3, var3, false, true);
                           var3 = (class710)class397.field5473.method1812(353);
                        }
                     } else {
                        class456.method3489(3, var3, false, true);
                        var3 = (class710)class397.field5473.method1812(353);
                     }

                     if (var3 == null) {
                        class661.field9817 = -1;
                        class397.field5473 = new class227(8);
                        class486.method3691((byte)-98);
                        class661.field9817 = class405.field5556;
                        class491.method3730(false, false);
                        class406.method3178((byte)117);
                        var10000 = class661.field9817;
                        if (!var2) {
                           break label64;
                        }
                     } else {
                        var10000 = var3.method4926(0);
                     }
                  }
               } while(var2);
            }

            class256.method2062(var10000);
         }

         label33: {
            class327.method2591(8);
            class553.field8136 = false;
            class170.method1471(-101);
            class436.field5949 = -1;
            class95.method882(class707.field10402, 2);
            class204.field2593 = new class783();
            class204.field2593.field10467 = class273.field3491 * 512 / 2;
            class204.field2593.field10468 = class211.field2689 * 512 / 2;
            class204.field2593.field210[0] = class273.field3491 / 2;
            int var4 = 64 % ((arg0 - -46) / 40);
            class168.field2195 = 0;
            class160.field2051 = 0;
            class204.field2593.field205[0] = class211.field2689 / 2;
            if (~class784.field11454 == -3) {
               class168.field2195 = class565.field8322 << 9;
               class160.field2051 = class567.field8342 << 9;
               if (!var2) {
                  break label33;
               }
            }

            class528.method3942((byte)127);
         }

         class274.method2167(-1662);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5680[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(I[B)V"
   )
   public abstract void method528(int arg0, byte[] arg1);

   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3241(int arg0) {
      try {
         if (arg0 != 0) {
            method3239((class66)null, -54);
         }

         field5679 = null;
         field5677 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5680[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
