import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class428 extends class465 {
   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6545 = new String[]{method3267(method3266("JQH\u001bW\u0016")), method3267(method3266("JQH\u001bP\u0016")), method3267(method3266("JQH\u001bS\u0016")), method3267(method3266("JQH\u001b\\\u0016")), method3267(method3266("JQH\u001bT\u0016")), method3267(method3266("JQH\u001b]\u0016")), method3267(method3266("E\u001e\u0007\u001bh")), method3267(method3266("JQH\u001bR\u0016")), method3267(method3266("PEEY")), method3267(method3266("JQH\u001bQ\u0016")), method3267(method3266("JQH\u001bV\u0016"))};
   @OriginalMember(
      owner = "client!taa",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field6537 = new class101(89, -2);
   @OriginalMember(
      owner = "client!taa",
      name = "n",
      descriptor = "Lsda;"
   )
   public static class269 field6541 = new class269(63, -1);
   @OriginalMember(
      owner = "client!taa",
      name = "l",
      descriptor = "I"
   )
   public static int field6544 = 0;
   @OriginalMember(
      owner = "client!taa",
      name = "f",
      descriptor = "I"
   )
   public static int field6534;
   @OriginalMember(
      owner = "client!taa",
      name = "o",
      descriptor = "I"
   )
   public static int field6535;
   @OriginalMember(
      owner = "client!taa",
      name = "p",
      descriptor = "I"
   )
   public static int field6536;
   @OriginalMember(
      owner = "client!taa",
      name = "g",
      descriptor = "I"
   )
   public static int field6538;
   @OriginalMember(
      owner = "client!taa",
      name = "k",
      descriptor = "I"
   )
   public static int field6539;
   @OriginalMember(
      owner = "client!taa",
      name = "m",
      descriptor = "I"
   )
   public static int field6540;
   @OriginalMember(
      owner = "client!taa",
      name = "i",
      descriptor = "I"
   )
   public static int field6542;
   @OriginalMember(
      owner = "client!taa",
      name = "j",
      descriptor = "I"
   )
   public static int field6543;

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(ZII)V",
      line = 4
   )
   public static final void method3261(boolean arg0, int arg1, int arg2) {
      try {
         class333.method2527(true, arg0, class204.field2576.method1562((byte)-61, class728.field10827), arg2);
         ++field6542;
         if (arg1 > -121) {
            field6541 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6545[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "b",
      descriptor = "(II)V",
      line = 15
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field6539;
         if (arg0 != -14812) {
            this.method3265(true);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6545[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "b",
      descriptor = "(I)I",
      line = 26
   )
   public final int method3262(int arg0) {
      try {
         ++field6534;
         if (arg0 <= 81) {
            field6541 = null;
         }

         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6545[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(ILjj;Ljava/lang/String;)I",
      line = 37
   )
   public static final int method3263(int arg0, class128 arg1, String arg2) {
      try {
         ++field6536;
         if (arg0 <= 5) {
            return 2;
         } else {
            int var3 = arg1.field1590;
            byte[] var4 = class23.method156(arg2, (byte)-120);
            arg1.method1044(var4.length, (byte)-56);
            arg1.field1590 += class175.field2175.method109(arg1.field1552, var4, true, arg1.field1590, var4.length, 0);
            return arg1.field1590 - var3;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6545[7] + arg0 + ',' + (arg1 != null ? field6545[6] : field6545[8]) + ',' + (arg2 != null ? field6545[6] : field6545[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "d",
      descriptor = "(Z)V",
      line = 57
   )
   public static void method3264(boolean arg0) {
      try {
         field6541 = null;
         field6537 = null;
         if (!arg0) {
            field6537 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6545[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "c",
      descriptor = "(Z)Z",
      line = 68
   )
   public final boolean method3265(boolean arg0) {
      try {
         ++field6535;
         if (super.field6980.method4680(-17721)) {
            return false;
         } else if (arg0) {
            return true;
         } else {
            return super.field6980.method4681(-17520) == class382.field5860;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6545[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(Z)V",
      line = 86
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            field6537 = null;
         }

         label29: {
            ++field6540;
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

         if (~super.field6984 != -1 && ~super.field6984 != -2) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6545[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(I)I",
      line = 109
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            field6537 = null;
         }

         ++field6543;
         return 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6545[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 122
   )
   public class428(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(IB)I",
      line = 126
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field6538;
         if (super.field6980.method4680(-17721)) {
            return 3;
         } else {
            int var3 = -81 / ((-51 - arg1) / 60);
            if (super.field6980.method4681(-17520) == class382.field5860) {
               if (arg0 == 0) {
                  if (~super.field6980.field9439.method1555(123) == -2) {
                     return 2;
                  }

                  if (~super.field6980.field9467.method2369(93) == -2) {
                     return 2;
                  }

                  if (~super.field6980.field9456.method1910(116) < -1) {
                     return 2;
                  }
               }

               return 1;
            } else {
               return 3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6545[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 159
   )
   public class428(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3266(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3267(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
