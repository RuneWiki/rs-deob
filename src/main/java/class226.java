import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class226 {
   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2827 = new String[]{method1806(method1805("X\u0017_2M")), method1806(method1805("X\u0017_5M")), method1806(method1805("X\u0017_7M")), method1806(method1805("X\u0017_3M")), method1806(method1805("X\u0017_4M"))};
   @OriginalMember(
      owner = "client!nc",
      name = "e",
      descriptor = "Lifa;"
   )
   public static class75 field2823 = new class75(14, 7);
   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "Laka;"
   )
   public static class418 field2824 = new class418(68, 6);
   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "I"
   )
   public static int field2826 = -1;
   @OriginalMember(
      owner = "client!nc",
      name = "g",
      descriptor = "[B"
   )
   public static byte[] field2825 = null;
   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "I"
   )
   public static int field2820;
   @OriginalMember(
      owner = "client!nc",
      name = "f",
      descriptor = "I"
   )
   public static int field2821;
   @OriginalMember(
      owner = "client!nc",
      name = "d",
      descriptor = "I"
   )
   public static int field2822;

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(ZIBIII)V"
   )
   public static final void method1800(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field2822;
         if (arg2 > -105) {
            method1802(66);
         }

         long var7 = (long)(arg4 | (!arg0 ? 0 : Integer.MIN_VALUE));
         class657 var9 = (class657)class401.field5510.method1818(-1, var7);
         if (var9 == null) {
            var9 = new class657();
            class401.field5510.method1808(var7, var9, 26459);
         }

         if (~var9.field9798.length >= ~arg5) {
            int[] var10 = new int[arg5 + 1];
            int[] var11 = new int[arg5 + 1];
            int var12 = 0;
            if (var6) {
               var10[var12] = var9.field9798[var12];
               var11[var12] = var9.field9799[var12];
               ++var12;
            }

            label70:
            while(true) {
               while(~var12 > ~var9.field9798.length) {
                  var10[var12] = var9.field9798[var12];
                  var11[var12] = var9.field9799[var12];
                  ++var12;
               }

               int var13 = var9.field9798.length;
               if (!var6) {
                  if (var6) {
                     var10[var13] = -1;
                     var11[var13] = 0;
                     ++var13;
                  }

                  while(true) {
                     while(var13 < arg5) {
                        var10[var13] = -1;
                        var11[var13] = 0;
                        ++var13;
                     }

                     var9.field9798 = var10;
                     if (!var6) {
                        var9.field9799 = var11;
                        break label70;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }

         var9.field9798[arg5] = arg3;
         var9.field9799[arg5] = arg1;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field2827[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1801(int arg0) {
      try {
         field2824 = null;
         if (arg0 == 17576) {
            field2825 = null;
            field2823 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2827[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1802(int arg0) {
      try {
         int var1 = -29 % ((arg0 - 59) / 63);
         ++field2820;
         if (~class571.field8393 != -1) {
            try {
               if (~(++class795.field11627) < -2001) {
                  class387.field5363.method4422((byte)-85);
                  if (client.field1476 >= 2) {
                     class337.field4609 = -5;
                     class571.field8393 = 0;
                     return;
                  }

                  class732.field10678.method5456(-124);
                  class795.field11627 = 0;
                  ++client.field1476;
                  class571.field8393 = 1;
               }

               if (~class571.field8393 == -2) {
                  class387.field5363.field8750 = class732.field10678.method5457(class366.field5092, 18746);
                  class571.field8393 = 2;
               }

               if (class571.field8393 == 2) {
                  if (class387.field5363.field8750.field11210 == 2) {
                     throw new IOException();
                  }

                  if (class387.field5363.field8750.field11210 != 1) {
                     return;
                  }

                  class387.field5363.field8760 = class150.method1205(15000, (Socket)class387.field5363.field8750.field11212, -20653);
                  class387.field5363.field8750 = null;
                  class387.field5363.method4419(108);
                  class571.field8393 = 4;
               }

               if (class571.field8393 == 4) {
                  if (class387.field5363.field8760.method1044(1, -1)) {
                     class387.field5363.field8760.method1046((byte)15, 0, 1, class387.field5363.field8764.field859);
                     int var2 = 255 & class387.field5363.field8764.field859[0];
                     class337.field4609 = var2;
                     class571.field8393 = 0;
                     class387.field5363.method4422((byte)-98);
                  }
               }
            } catch (IOException var4) {
               class387.field5363.method4422((byte)-86);
               if (client.field1476 < 2) {
                  class732.field10678.method5456(-110);
                  class795.field11627 = 0;
                  ++client.field1476;
                  class571.field8393 = 1;
               } else {
                  class571.field8393 = 0;
                  class337.field4609 = -4;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2827[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(ZZ)Z"
   )
   public static boolean method1803(boolean arg0, boolean arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2827[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1804(int arg0) {
      try {
         ++field2821;
         if (!class7.field97) {
            class419.field5734 += (12.0F - class419.field5734) / 2.0F;
            class7.field97 = true;
            class193.field2447 = true;
            int var1 = -22 % ((43 - arg0) / 51);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2827[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1805(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1806(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
