import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class568 extends class555 {
   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7752 = new String[]{method4071(method4070("\u0016OGVR")), method4071(method4070("\u0016OG]R")), method4071(method4070("\u0016OGXR")), method4071(method4070("\u0016OG\\R")), method4071(method4070("\u0016OG[R")), method4071(method4070("\u0016OGZR")), method4071(method4070("\u0016OGYR")), method4071(method4070("\u0016OG_R"))};
   @OriginalMember(
      owner = "client!rc",
      name = "k",
      descriptor = "I"
   )
   public static int field7743 = 0;
   @OriginalMember(
      owner = "client!rc",
      name = "f",
      descriptor = "Ldd;"
   )
   public static class735 field7746 = new class735(0, 2, 2, 1);
   @OriginalMember(
      owner = "client!rc",
      name = "h",
      descriptor = "I"
   )
   public static int field7741;
   @OriginalMember(
      owner = "client!rc",
      name = "l",
      descriptor = "I"
   )
   public static int field7742;
   @OriginalMember(
      owner = "client!rc",
      name = "n",
      descriptor = "I"
   )
   public static int field7744;
   @OriginalMember(
      owner = "client!rc",
      name = "g",
      descriptor = "I"
   )
   public static int field7745;
   @OriginalMember(
      owner = "client!rc",
      name = "o",
      descriptor = "I"
   )
   public static int field7747;
   @OriginalMember(
      owner = "client!rc",
      name = "p",
      descriptor = "I"
   )
   public static int field7748;
   @OriginalMember(
      owner = "client!rc",
      name = "j",
      descriptor = "I"
   )
   public static int field7749;
   @OriginalMember(
      owner = "client!rc",
      name = "i",
      descriptor = "I"
   )
   public static int field7750;
   @OriginalMember(
      owner = "client!rc",
      name = "q",
      descriptor = "I"
   )
   public static int field7751;
   @OriginalMember(
      owner = "client!rc",
      name = "m",
      descriptor = "[Lbo;"
   )
   public static class763[] field7740;

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         label31: {
            ++field7745;
            if (super.field7633.method4418((byte)-123) == class551.field7585) {
               if (!super.field7633.method4414(0)) {
                  break label31;
               }

               super.field7632 = 0;
               if (!client.field4273) {
                  break label31;
               }
            }

            super.field7632 = 1;
         }

         if (arg0 != -13712) {
            this.method633(-50, (byte)101);
         }

         if (~super.field7632 != -1 && ~super.field7632 != -2) {
            super.field7632 = this.method635(126);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7752[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class568(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field7742;
         super.field7632 = arg0;
         int var3 = -63 / ((arg1 - 12) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7752[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method4066(byte arg0) {
      try {
         if (arg0 > -61) {
            field7749 = -52;
         }

         ++field7741;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7752[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4067(byte arg0) {
      try {
         ++field7748;
         if (arg0 != -107) {
            this.method637(-104);
         }

         if (super.field7633.method4418((byte)-123) == class551.field7585) {
            return !super.field7633.method4414(0);
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7752[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method4068(byte arg0) {
      try {
         int var1 = 7 / ((arg0 - -17) / 58);
         field7746 = null;
         field7740 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7752[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field7747;
         if (arg0 <= 124) {
            method4068((byte)-97);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7752[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4069(int arg0) {
      try {
         ++field7751;
         if (arg0 < 42) {
            field7749 = -23;
         }

         if (~class742.field10814 != 0) {
            class529.method3820(-1, -1, false, -1, class742.field10814);
            class742.field10814 = -1;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7752[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field7744;
         if (arg1 <= 36) {
            this.method633(74, (byte)-21);
         }

         if (super.field7633.method4418((byte)-123) == class551.field7585) {
            if (super.field7633.method4414(0)) {
               return 3;
            } else {
               return ~arg0 != -1 && ~super.field7633.field8461.method1732((byte)-64) != -2 ? 2 : 1;
            }
         } else {
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7752[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class568(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4070(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4071(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
