import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class778 {
   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11365 = new String[]{method5606(method5605("NgLGX")), method5606(method5605("NgLFX")), method5606(method5605("NgLDX"))};
   @OriginalMember(
      owner = "client!nh",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field11364 = new int[14];
   @OriginalMember(
      owner = "client!nh",
      name = "d",
      descriptor = "I"
   )
   public static int field11360;
   @OriginalMember(
      owner = "client!nh",
      name = "e",
      descriptor = "I"
   )
   public static int field11361;
   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "I"
   )
   public static int field11362;
   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "I"
   )
   public static int field11363;
   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "Lfa;"
   )
   public static class244 field11359;

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static final void method5602(byte arg0) {
      int var1 = client.field4530;

      try {
         class296.method2250(arg0 ^ -22406, (long)class314.field4488, class786.field11439);
         ++field11362;
         if (~class198.field2452 != 0) {
            class169.method1362(class198.field2452, (byte)-111);
         }

         int var2 = 0;
         if (var1 != 0) {
            if (class275.field3835[var2]) {
               class446.field6781[var2] = true;
            }

            class482.field7157[var2] = class275.field3835[var2];
            class275.field3835[var2] = false;
            ++var2;
         }

         while(true) {
            byte var10000;
            if (var2 >= class117.field1428) {
               var10000 = arg0;
               if (var1 == 0) {
                  if (arg0 != 0) {
                     method5603(49, 113, true, 0, -96L);
                  }

                  class255.field3401 = class314.field4488;
                  if (class198.field2452 != -1) {
                     class117.field1428 = 0;
                     class718.method5191(-24812);
                  }

                  class786.field11439.method607();
                  class87.method803((byte)-20, class786.field11439);
                  int var3 = class235.method1761((byte)121);
                  if (var3 == -1) {
                     var3 = class444.field6754;
                  }

                  if (var3 == -1) {
                     var3 = class20.field222;
                  }

                  class58.method488(var3, (byte)-109);
                  class65.field800 = 0;
                  return;
               }
            } else {
               var10000 = class275.field3835[var2];
            }

            if (var10000 != 0) {
               class446.field6781[var2] = true;
            }

            class482.field7157[var2] = class275.field3835[var2];
            class275.field3835[var2] = false;
            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11365[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(IIZIJ)Ljava/lang/String;",
      line = 57
   )
   public static final String method5603(int arg0, int arg1, boolean arg2, int arg3, long arg4) {
      int var6 = client.field4530;

      try {
         ++field11361;
         char var7 = ',';
         if (arg0 != -28424) {
            return null;
         } else {
            char var8 = '.';
            if (arg3 == 0) {
               var8 = ',';
               var7 = '.';
            }

            if (~arg3 == -3) {
               var8 = 160;
            }

            byte var9 = 0;
            if (~arg4 > -1L) {
               arg4 = -arg4;
               var9 = 1;
            }

            StringBuffer var10 = new StringBuffer(26);
            if (~arg1 < -1) {
               int var11 = 0;
               if (var6 != 0 || ~var11 > ~arg1) {
                  do {
                     int var12 = (int)arg4;
                     arg4 /= 10L;
                     var10.append((char)(var12 - (int)arg4 * 10 + 48));
                     ++var11;
                  } while(~var11 > ~arg1);
               }

               var10.append(var7);
            }

            int var13 = 0;

            int var10000;
            while(true) {
               int var14 = (int)arg4;
               arg4 /= 10L;
               var10.append((char)(-((int)arg4 * 10) + 48 + var14));
               if (arg4 != 0L) {
                  if (!arg2) {
                     continue;
                  }

                  ++var13;
                  var10000 = var13 % 3;
                  if (var6 != 0) {
                     break;
                  }

                  if (var10000 != 0) {
                     continue;
                  }

                  var10.append(var8);
                  if (var6 == 0) {
                     continue;
                  }
               }

               var10000 = var9;
               break;
            }

            if (var10000 != 0) {
               var10.append('-');
            }

            return var10.reverse().toString();
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field11365[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(I)V",
      line = 142
   )
   public static void method5604(int arg0) {
      try {
         field11359 = null;
         field11364 = null;
         if (arg0 != -31328) {
            method5603(-47, -6, true, 12, 84L);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11365[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5605(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5606(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
