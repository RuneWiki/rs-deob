import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class314 extends class465 {
   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4497 = new String[]{method2371(method2370("qPx\u0014")), method2371(method2370("qPz\u0014")), method2371(method2370("qP~\u0014")), method2371(method2370("qP}\u0014")), method2371(method2370("qP\u007f\u0014")), method2371(method2370("qP{\u0014")), method2371(method2370("qPy\u0014"))};
   @OriginalMember(
      owner = "client!w",
      name = "n",
      descriptor = "I"
   )
   public static int field4488 = 0;
   @OriginalMember(
      owner = "client!w",
      name = "f",
      descriptor = "I"
   )
   public static int field4487;
   @OriginalMember(
      owner = "client!w",
      name = "j",
      descriptor = "I"
   )
   public static int field4490;
   @OriginalMember(
      owner = "client!w",
      name = "h",
      descriptor = "I"
   )
   public static int field4491;
   @OriginalMember(
      owner = "client!w",
      name = "k",
      descriptor = "I"
   )
   public static int field4492;
   @OriginalMember(
      owner = "client!w",
      name = "m",
      descriptor = "I"
   )
   public static int field4493;
   @OriginalMember(
      owner = "client!w",
      name = "l",
      descriptor = "I"
   )
   public static int field4494;
   @OriginalMember(
      owner = "client!w",
      name = "i",
      descriptor = "I"
   )
   public static int field4495;
   @OriginalMember(
      owner = "client!w",
      name = "o",
      descriptor = "Lsh;"
   )
   public static class76 field4489;
   @OriginalMember(
      owner = "client!w",
      name = "g",
      descriptor = "[[[S"
   )
   public static short[][][] field4496;

   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "(I)V",
      line = 7
   )
   public static void method2367(int arg0) {
      try {
         if (arg0 == 0) {
            field4496 = null;
            field4489 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4497[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(Z)V",
      line = 20
   )
   public final void method69(boolean arg0) {
      try {
         label31: {
            if (super.field6980.method4681(-17520) == class382.field5860) {
               if (!super.field6980.method4680(-17721)) {
                  break label31;
               }

               super.field6984 = 0;
               if (client.field4530 == 0) {
                  break label31;
               }
            }

            super.field6984 = 1;
         }

         ++field4490;
         if (arg0) {
            this.method78(62);
         }

         if (super.field6984 != 0 && ~super.field6984 != -2) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4497[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(I)I",
      line = 42
   )
   public final int method78(int arg0) {
      try {
         ++field4495;
         return arg0 != 16726277 ? -120 : 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4497[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 53
   )
   public class314(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!w",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 57
   )
   public class314(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(IB)I",
      line = 68
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 111 % ((arg1 - -51) / 60);
         ++field4491;
         if (super.field6980.method4681(-17520) == class382.field5860) {
            if (super.field6980.method4680(-17721)) {
               return 3;
            } else {
               return ~arg0 != -1 && ~super.field6980.field9451.method3262(121) != -2 ? 2 : 1;
            }
         } else {
            return 3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4497[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(II)V",
      line = 90
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field4487;
         if (arg0 != -14812) {
            this.method2368(false);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4497[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "(Z)Z",
      line = 102
   )
   public final boolean method2368(boolean arg0) {
      try {
         if (arg0) {
            field4492 = -57;
         }

         ++field4493;
         if (super.field6980.method4681(-17520) == class382.field5860) {
            return !super.field6980.method4680(-17721);
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4497[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(I)I",
      line = 123
   )
   public final int method2369(int arg0) {
      try {
         if (arg0 < 81) {
            return -55;
         } else {
            ++field4494;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4497[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2370(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2371(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
