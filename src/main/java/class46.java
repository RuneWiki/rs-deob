import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class46 extends class55 {
   @OriginalMember(
      owner = "client!cja",
      name = "o",
      descriptor = "Z"
   )
   private boolean field623 = true;
   @OriginalMember(
      owner = "client!cja",
      name = "q",
      descriptor = "Z"
   )
   public boolean field617 = false;
   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field629 = new String[]{method393(method392("9My+br")), method393(method392("9My+lr")), method393(method392("0F\u007faQ")), method393(method392("9My+hr")), method393(method392("9My+ar")), method393(method392("9My+kr")), method393(method392("4Rti")), method393(method392("!\t6+T")), method393(method392("9My+`r")), method393(method392("9My+nr")), method393(method392("9My+cr")), method393(method392("9My+jr")), method393(method392("9My+mr")), method393(method392("9My+or"))};
   @OriginalMember(
      owner = "client!cja",
      name = "k",
      descriptor = "Lak;"
   )
   public static class371 field621 = new class371(1);
   @OriginalMember(
      owner = "client!cja",
      name = "l",
      descriptor = "I"
   )
   public static int field616;
   @OriginalMember(
      owner = "client!cja",
      name = "n",
      descriptor = "I"
   )
   public static int field618;
   @OriginalMember(
      owner = "client!cja",
      name = "h",
      descriptor = "I"
   )
   public static int field619;
   @OriginalMember(
      owner = "client!cja",
      name = "p",
      descriptor = "I"
   )
   public static int field620;
   @OriginalMember(
      owner = "client!cja",
      name = "i",
      descriptor = "I"
   )
   public static int field622;
   @OriginalMember(
      owner = "client!cja",
      name = "j",
      descriptor = "I"
   )
   public static int field624;
   @OriginalMember(
      owner = "client!cja",
      name = "g",
      descriptor = "I"
   )
   public static int field625;
   @OriginalMember(
      owner = "client!cja",
      name = "e",
      descriptor = "I"
   )
   public static int field626;
   @OriginalMember(
      owner = "client!cja",
      name = "m",
      descriptor = "I"
   )
   public static int field627;
   @OriginalMember(
      owner = "client!cja",
      name = "f",
      descriptor = "I"
   )
   public static int field628;

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method385(byte arg0) {
      try {
         ++field626;
         if (!super.field683.method3307(false).method4356((byte)-75)) {
            return false;
         } else {
            return arg0 != 120 ? true : true;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field629[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method386(int arg0) {
      try {
         if (arg0 != 3) {
            method389(67);
         }

         ++field620;
         return this.field623;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field629[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(ILwf;)Lai;"
   )
   public static final class626 method387(int arg0, class147 arg1) {
      try {
         ++field622;
         class270 var2 = class663.method4841(1, arg1);
         int var3 = arg1.method1211(-26166);
         int var4 = arg1.method1211(-26166);
         int var5 = arg1.method1211(arg0 + -26005);
         int var6 = arg1.method1211(arg0 ^ 26261);
         if (arg0 != -161) {
            return null;
         } else {
            int var7 = arg1.method1211(-26166);
            int var8 = arg1.method1211(-26166);
            return new class626(var2.field3728, var2.field3724, var2.field3725, var2.field3727, var2.field3731, var2.field3729, var2.field3738, var2.field3736, var2.field3732, var3, var4, var5, var6, var7, var8);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field629[8] + arg0 + ',' + (arg1 != null ? field629[7] : field629[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method388(int arg0, boolean arg1) {
      try {
         this.field623 = arg1;
         ++field628;
         if (arg0 != -12062) {
            this.method391(32);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field629[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method389(int arg0) {
      try {
         field621 = null;
         if (arg0 <= 16) {
            method390(92, 'K');
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field629[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = -22 % ((arg1 - 47) / 46);
         ++field616;
         super.field680 = arg0;
         this.field617 = false;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field629[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field618;
         if (arg1 != 105) {
            this.field617 = false;
         }

         if (!super.field683.method3307(false).method4356((byte)-77)) {
            return 3;
         } else {
            return arg0 == 3 && !class185.method1472((byte)-47, field629[2]) ? 3 : 2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field629[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method390(int arg0, char arg1) {
      boolean var2 = client.field4360;

      try {
         ++field619;
         if (~arg1 < -1 && ~arg1 > -129 || ~arg1 <= -161 && ~arg1 >= -256) {
            return true;
         } else {
            if (~arg1 != -1) {
               char[] var3 = class361.field4923;
               int var4 = 0;
               if (var2 || ~var4 > ~var3.length) {
                  do {
                     char var5 = var3[var4];
                     if (arg1 == var5) {
                        return true;
                     }

                     ++var4;
                  } while(~var4 > ~var3.length);
               }
            }

            return arg0 != 2 ? false : false;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field629[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class46(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cja",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class46(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         if (!super.field683.method3307(false).method4356((byte)107)) {
            super.field680 = 0;
         }

         ++field624;
         if (~super.field680 > -1 || super.field680 > 5) {
            super.field680 = this.method101(-117);
         }

         if (arg0 != 0) {
            method390(118, 's');
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field629[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method391(int arg0) {
      try {
         ++field627;
         int var2 = 46 / ((arg0 - 36) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field629[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field625;
         if (arg0 > -116) {
            this.field623 = false;
         }

         this.field617 = true;
         return !super.field683.method3307(false).method4356((byte)112) ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field629[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method392(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method393(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
