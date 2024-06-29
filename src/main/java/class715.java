import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class715 extends class465 {
   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10658 = new String[]{method5181(method5180("v\b@I0")), method5181(method5180("v\b@M0")), method5181(method5180("v\b@J0")), method5181(method5180("v\b@N0")), method5181(method5180("v\b@H0")), method5181(method5180("v\b@K0")), method5181(method5180("v\b@O0"))};
   @OriginalMember(
      owner = "client!bs",
      name = "h",
      descriptor = "Lhv;"
   )
   public static class544 field10655 = null;
   @OriginalMember(
      owner = "client!bs",
      name = "f",
      descriptor = "I"
   )
   public static int field10657 = 100;
   @OriginalMember(
      owner = "client!bs",
      name = "m",
      descriptor = "I"
   )
   public static int field10650;
   @OriginalMember(
      owner = "client!bs",
      name = "j",
      descriptor = "I"
   )
   public static int field10651;
   @OriginalMember(
      owner = "client!bs",
      name = "k",
      descriptor = "I"
   )
   public static int field10652;
   @OriginalMember(
      owner = "client!bs",
      name = "l",
      descriptor = "I"
   )
   public static int field10653;
   @OriginalMember(
      owner = "client!bs",
      name = "g",
      descriptor = "I"
   )
   public static int field10654;
   @OriginalMember(
      owner = "client!bs",
      name = "i",
      descriptor = "I"
   )
   public static int field10656;

   @OriginalMember(
      owner = "client!bs",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class715(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bs",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5177(int arg0) {
      try {
         if (arg0 <= 81) {
            this.method5177(84);
         }

         ++field10650;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10658[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method5178(boolean arg0) {
      try {
         ++field10651;
         if (super.field6980.method4680(-17721)) {
            return false;
         } else if (super.field6980.method4681(-17520) == class382.field5860) {
            return true;
         } else {
            return arg0 ? false : false;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10658[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field10656;
         super.field6984 = arg1;
         if (arg0 != -14812) {
            this.method78(94);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10658[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5179(int arg0) {
      try {
         if (arg0 != 1) {
            field10655 = null;
         }

         field10655 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10658[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            field10655 = null;
         }

         label29: {
            if (super.field6980.method4681(-17520) != class382.field5860) {
               super.field6984 = 1;
               if (client.field4530 == 0) {
                  break label29;
               }
            }

            if (super.field6980.method4680(-17721)) {
               super.field6984 = 0;
            }
         }

         ++field10653;
         if (super.field6984 != 0 && super.field6984 != 1) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10658[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field10654;
         if (super.field6980.method4680(-17721)) {
            return 3;
         } else if (super.field6980.method4681(-17520) == class382.field5860) {
            return 1;
         } else {
            int var3 = 109 / ((-51 - arg1) / 60);
            return 3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10658[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            return 50;
         } else {
            ++field10652;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10658[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class715(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5180(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5181(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
