import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class503 extends class163 {
   @OriginalMember(
      owner = "client!gk",
      name = "p",
      descriptor = "I"
   )
   public int field7298 = -1;
   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7309 = new String[]{method3654(method3653("\"^J0M")), method3654(method3653("\"^J3M")), method3654(method3653("+@\b\u0014")), method3654(method3653("\"^J?M")), method3654(method3653(">\u001bJV\u0018")), method3654(method3653("\"^J>M")), method3654(method3653("\"^J2M")), method3654(method3653("\"^J1M"))};
   @OriginalMember(
      owner = "client!gk",
      name = "o",
      descriptor = "Leg;"
   )
   public static class118 field7301 = new class118(64, -1);
   @OriginalMember(
      owner = "client!gk",
      name = "s",
      descriptor = "I"
   )
   public static int field7307 = 0;
   @OriginalMember(
      owner = "client!gk",
      name = "m",
      descriptor = "Ltja;"
   )
   public static class287 field7303 = new class287(0, -1);
   @OriginalMember(
      owner = "client!gk",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field7308 = true;
   @OriginalMember(
      owner = "client!gk",
      name = "v",
      descriptor = "I"
   )
   public static int field7294;
   @OriginalMember(
      owner = "client!gk",
      name = "y",
      descriptor = "I"
   )
   public static int field7295;
   @OriginalMember(
      owner = "client!gk",
      name = "r",
      descriptor = "I"
   )
   public static int field7299;
   @OriginalMember(
      owner = "client!gk",
      name = "w",
      descriptor = "I"
   )
   public static int field7300;
   @OriginalMember(
      owner = "client!gk",
      name = "n",
      descriptor = "I"
   )
   public static int field7302;
   @OriginalMember(
      owner = "client!gk",
      name = "t",
      descriptor = "I"
   )
   public int field7304;
   @OriginalMember(
      owner = "client!gk",
      name = "u",
      descriptor = "I"
   )
   public static int field7305;
   @OriginalMember(
      owner = "client!gk",
      name = "k",
      descriptor = "I"
   )
   public static int field7306;
   @OriginalMember(
      owner = "client!gk",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   public String field7296;
   @OriginalMember(
      owner = "client!gk",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field7297;

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static void method3647(byte arg0) {
      try {
         field7301 = null;
         if (arg0 != -51) {
            method3650(-49);
         }

         field7303 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7309[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(Lgl;B)Lfl;",
      line = 16
   )
   public static final class772 method3648(class627 arg0, byte arg1) {
      try {
         class772 var2;
         label21: {
            ++field7305;
            if (class598.field8787 != null) {
               var2 = class598.field8787;
               class598.field8787 = class598.field8787.field11354;
               var2.field11354 = null;
               --class653.field9570;
               if (!client.field4360) {
                  break label21;
               }
            }

            var2 = new class772();
         }

         var2.field11352 = arg0;
         int var3 = 75 / ((4 - arg1) / 61);
         return var2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7309[5] + (arg0 != null ? field7309[4] : field7309[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "f",
      descriptor = "(I)Lika;",
      line = 43
   )
   public final class451 method3649(int arg0) {
      try {
         ++field7300;
         if (arg0 < 95) {
            this.field7297 = null;
         }

         return class484.field6922[super.field2311];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7309[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "g",
      descriptor = "(I)V",
      line = 55
   )
   public static final void method3650(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field7299;
         class29.method268();
         int var2 = 0;
         if (var1) {
            class767.field11309[var2].method4397(31436);
            ++var2;
         }

         while(true) {
            while(~var2 > -5) {
               class767.field11309[var2].method4397(31436);
               ++var2;
            }

            class188.method1492(-1);
            class84.method750(arg0 ^ -102);
            class444.method3265((byte)127);
            System.gc();
            if (!var1) {
               if (arg0 != 11) {
                  return;
               }

               class383.field5543.method523();
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7309[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(III)Z",
      line = 78
   )
   public static final boolean method3651(int arg0, int arg1, int arg2) {
      try {
         ++field7295;
         int var3 = 72 % ((arg2 - -32) / 40);
         if (arg0 == 11) {
            arg0 = 10;
         }

         class259 var4 = class387.field5618.method3977(arg1, (byte)75);
         if (~arg0 <= -6 && arg0 <= 8) {
            arg0 = 4;
         }

         return var4.method1983(-127, arg0);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7309[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "([IB[J)V",
      line = 103
   )
   public static final void method3652(int[] arg0, byte arg1, long[] arg2) {
      try {
         ++field7294;
         class10.method49(arg0, arg2, arg2.length - 1, 0, 0);
         if (arg1 != -83) {
            method3651(39, -59, 111);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7309[3] + (arg0 != null ? field7309[4] : field7309[2]) + ',' + arg1 + ',' + (arg2 != null ? field7309[4] : field7309[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3653(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3654(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
