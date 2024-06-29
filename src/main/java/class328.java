import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class328 extends class465 {
   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4665 = new String[]{method2473(method2472("\u0006n~HGF")), method2473(method2472("\u0000}s\n")), method2473(method2472("\u0015&1Hy")), method2473(method2472("\u0006n~HEF")), method2473(method2472("\u0006n~HCF")), method2473(method2472("\u0006n~HAF")), method2473(method2472("\u0006n~HBF")), method2473(method2472("\u0006n~H@F")), method2473(method2472("\u0006n~HFF"))};
   @OriginalMember(
      owner = "client!hfa",
      name = "h",
      descriptor = "I"
   )
   public static int field4658;
   @OriginalMember(
      owner = "client!hfa",
      name = "j",
      descriptor = "I"
   )
   public static int field4659;
   @OriginalMember(
      owner = "client!hfa",
      name = "i",
      descriptor = "I"
   )
   public static int field4660;
   @OriginalMember(
      owner = "client!hfa",
      name = "f",
      descriptor = "I"
   )
   public static int field4661;
   @OriginalMember(
      owner = "client!hfa",
      name = "g",
      descriptor = "I"
   )
   public static int field4662;
   @OriginalMember(
      owner = "client!hfa",
      name = "k",
      descriptor = "I"
   )
   public static int field4663;
   @OriginalMember(
      owner = "client!hfa",
      name = "l",
      descriptor = "I"
   )
   public static int field4664;

   @OriginalMember(
      owner = "client!hfa",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method2469(int arg0) {
      try {
         if (arg0 <= 81) {
            return 108;
         } else {
            ++field4664;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4665[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(IB)I",
      line = 15
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 78 % ((arg1 - -51) / 60);
         ++field4659;
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4665[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 27
   )
   public class328(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(III)V",
      line = 30
   )
   public static final void method2470(int arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         label32: {
            if (class3.field63 != 1) {
               if (class3.field63 != 2) {
                  break label32;
               }

               if (!class446.field6785) {
                  class443.method3353(arg2, arg1, 22);
                  if (var3 == 0) {
                     break label32;
                  }
               }

               class443.method3353(class319.method2421(true) + arg2, class325.method2458(arg0 + 8076) + arg1, 22);
               if (var3 == 0) {
                  break label32;
               }
            }

            class230.method1737((byte)111, arg1, class710.field10596, arg2);
         }

         if (arg0 != 21385) {
            method2471((class520)null, 93);
         }

         ++field4662;
         class710.field10596 = null;
         class3.field63 = 0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4665[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 56
   )
   public class328(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "b",
      descriptor = "(II)V",
      line = 63
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field4660;
         super.field6984 = arg1;
         if (arg0 == -14812) {
            ;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4665[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(Z)V",
      line = 76
   )
   public final void method69(boolean arg0) {
      try {
         ++field4663;
         if (arg0) {
            this.method78(22);
         }

         if (super.field6984 != 1 && ~super.field6984 != -1) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4665[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(I)I",
      line = 90
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            return 16;
         } else {
            ++field4658;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4665[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(Liaa;I)V",
      line = 101
   )
   public static final void method2471(class520 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2472(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2473(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
