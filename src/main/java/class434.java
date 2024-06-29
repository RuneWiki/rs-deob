import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class434 extends class347 {
   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6620 = new String[]{method3304(method3303("^lQ'S")), method3304(method3303("_#QN\u0006")), method3304(method3303("K7\u0013e")), method3304(method3303("_#QO\u0006")), method3304(method3303("_#QA\u0006")), method3304(method3303("I-\u0018nKA-\n}"))};
   @OriginalMember(
      owner = "client!za",
      name = "i",
      descriptor = "Ldw;"
   )
   public static class748 field6616 = new class748(4);
   @OriginalMember(
      owner = "client!za",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field6619 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   @OriginalMember(
      owner = "client!za",
      name = "l",
      descriptor = "I"
   )
   public static int field6617;
   @OriginalMember(
      owner = "client!za",
      name = "j",
      descriptor = "I"
   )
   public static int field6618;

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(II[Ljava/awt/Rectangle;)V",
      line = 6
   )
   public static final void method3300(int arg0, int arg1, Rectangle[] arg2) throws class280 {
      try {
         label27: {
            if (class4.field85 == 1) {
               class616.field9011.method605(arg2, arg1, class706.field10569, class538.field7870);
               if (client.field4530 == 0) {
                  break label27;
               }
            }

            class616.field9011.method605(arg2, arg1, 0, 0);
         }

         if (arg0 != 2) {
            field6619 = null;
         }

         ++field6617;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6620[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6620[0] : field6620[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(ZI)V",
      line = 23
   )
   public static final void method3301(boolean arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field6618;
         if (class429.field6546 != null) {
            class429.field6546.method812(2035738378);
            class429.field6546 = null;
         }

         class625.method4512(126);
         class607.method4426(-16770);
         class124.method1022();
         int var3 = 0;
         if (var2 != 0) {
            class532.field7778[var3].method5387(3);
            ++var3;
         }

         while(true) {
            while(~var3 > -5) {
               class532.field7778[var3].method5387(3);
               ++var3;
            }

            class372.method2891(0, false);
            System.gc();
            class578.method4265(65, 2);
            class56.field705 = -1;
            class107.field1306 = false;
            class454.method3417((byte)-101);
            class524.method3854(true, -114);
            class688.field10364 = 0;
            class669.field10064 = arg1;
            class465.field6983 = 0;
            class718.field10676 = 0;
            class643.field9369 = 0;
            class256.field3459 = 0;
            int var4 = 0;
            if (var2 == 0) {
               if (var2 != 0) {
                  class594.field8758[var4] = null;
                  ++var4;
               }

               while(true) {
                  while(class594.field8758.length > var4) {
                     class594.field8758[var4] = null;
                     ++var4;
                  }

                  class100.method877(17538);
                  int var5 = 0;
                  if (var2 == 0) {
                     if (var2 != 0) {
                        class661.field9578[var5] = null;
                        ++var5;
                     }

                     while(true) {
                        while(var5 < 2048) {
                           class661.field9578[var5] = null;
                           ++var5;
                        }

                        class159.field2021 = 0;
                        class259.field3509.method5680(true);
                        class132.field1657 = 0;
                        class561.field8393.method5680(true);
                        class633.method4552(true);
                        class744.field11043 = 0;
                        class597.field8793.method1245(111);
                        class370.method2880((byte)-106);
                        class132.method1131(false);
                        class257.field3482 = null;
                        class762.field11197 = 0L;
                        class740.field10986 = null;
                        class778.field11359 = null;
                        class30.field329 = null;
                        class437.field6674 = null;
                        if (var2 == 0) {
                           if (!arg0) {
                              class317.method2411(3, (byte)107);

                              try {
                                 class359.method2803(field6620[5], class238.field3003, (byte)-70);
                                 return;
                              } catch (Throwable var7) {
                                 return;
                              }
                           }

                           class317.method2411(12, (byte)-3);
                           return;
                        }

                        ++var5;
                     }
                  }

                  ++var4;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6620[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(I)V",
      line = 102
   )
   public static void method3302(int arg0) {
      try {
         if (arg0 <= 118) {
            method3301(false, -70);
         }

         field6619 = null;
         field6616 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6620[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3303(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3304(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
