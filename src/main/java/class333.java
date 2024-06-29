import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class333 extends class465 {
   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4774 = new String[]{method2530(method2529("\u001c~bZBA")), method2530(method2529("\u00125-Z|")), method2530(method2529("\u0007no\u0018")), method2530(method2529("\u001c~bZFA")), method2530(method2529("\u001c~bZ@A")), method2530(method2529("\u001c~bZCA")), method2530(method2529("\u001c~bZDA")), method2530(method2529("\u001c~bZGA")), method2530(method2529("\u001c~bZEA"))};
   @OriginalMember(
      owner = "client!uea",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field4773 = true;
   @OriginalMember(
      owner = "client!uea",
      name = "f",
      descriptor = "I"
   )
   public static int field4766;
   @OriginalMember(
      owner = "client!uea",
      name = "i",
      descriptor = "I"
   )
   public static int field4767;
   @OriginalMember(
      owner = "client!uea",
      name = "l",
      descriptor = "I"
   )
   public static int field4768;
   @OriginalMember(
      owner = "client!uea",
      name = "h",
      descriptor = "I"
   )
   public static int field4769;
   @OriginalMember(
      owner = "client!uea",
      name = "g",
      descriptor = "I"
   )
   public static int field4770;
   @OriginalMember(
      owner = "client!uea",
      name = "j",
      descriptor = "I"
   )
   public static int field4771;
   @OriginalMember(
      owner = "client!uea",
      name = "k",
      descriptor = "I"
   )
   public static int field4772;

   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method2526(int arg0) {
      try {
         ++field4768;
         if (arg0 < 81) {
            field4773 = false;
         }

         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4774[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(Z)V",
      line = 17
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            field4773 = false;
         }

         if (super.field6984 != 1 && ~super.field6984 != -1) {
            super.field6984 = this.method78(16726277);
         }

         ++field4767;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4774[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(ZZLjava/lang/String;I)V",
      line = 32
   )
   public static final void method2527(boolean arg0, boolean arg1, String arg2, int arg3) {
      try {
         class350.method2735(85);
         ++field4766;
         class2.method26(false);
         class661.method4747(-2236);
         class630.method4542(arg1, arg2, arg3, arg0);
         class704.method5123(false);
         class536.method3978(false, class786.field11439);
         class405.method3108(class786.field11439, !arg0);
         class288.method2195(class521.field7580, class786.field11439, 109);
         class395.method3025((byte)15);
         class416.method3180(class134.field1717, -6202);
         class491.method3635((byte)-19);
         class157.method1304(-127);
         if (~class672.field10112 == -4) {
            class317.method2411(4, (byte)-39);
         } else if (class672.field10112 != 7) {
            if (class672.field10112 == 10) {
               class317.method2411(11, (byte)-76);
            } else {
               if (~class672.field10112 == -2 || class672.field10112 == 2) {
                  class97.method855(0);
               }

            }
         } else {
            class317.method2411(8, (byte)106);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4774[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4774[1] : field4774[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 68
   )
   public class333(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(Liaa;I)V",
      line = 71
   )
   public static final void method2528(class520 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uea",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 144
   )
   public class333(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(I)I",
      line = 147
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            this.method69(false);
         }

         ++field4771;
         return 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4774[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(IB)I",
      line = 160
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field4772;
         int var3 = 33 % ((arg1 - -51) / 60);
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4774[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "(II)V",
      line = 171
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field4769;
         if (arg0 != -14812) {
            this.method2526(-100);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4774[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
