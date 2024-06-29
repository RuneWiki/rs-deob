import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class308 extends class557 {
   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4653 = new String[]{method2528(method2527("\u001bcr)gP")), method2528(method2527("\u001bcr)nP")), method2528(method2527("\u001bcr)kP")), method2528(method2527("\u001bcr)oP")), method2528(method2527("\u001bcr)jP")), method2528(method2527("\u001bcr)iP")), method2528(method2527("\u0016w\u007fk")), method2528(method2527("\u0003,=)P")), method2528(method2527("\u001bcr)lP"))};
   @OriginalMember(
      owner = "client!caa",
      name = "k",
      descriptor = "I"
   )
   public static int field4646;
   @OriginalMember(
      owner = "client!caa",
      name = "j",
      descriptor = "I"
   )
   public static int field4647;
   @OriginalMember(
      owner = "client!caa",
      name = "l",
      descriptor = "I"
   )
   public static int field4648;
   @OriginalMember(
      owner = "client!caa",
      name = "i",
      descriptor = "I"
   )
   public static int field4649;
   @OriginalMember(
      owner = "client!caa",
      name = "n",
      descriptor = "I"
   )
   public static int field4650;
   @OriginalMember(
      owner = "client!caa",
      name = "h",
      descriptor = "I"
   )
   public static int field4651;
   @OriginalMember(
      owner = "client!caa",
      name = "m",
      descriptor = "I"
   )
   public static int field4652;

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(Lha;Lai;I)I"
   )
   public static final int method2524(class17 arg0, class376 arg1, int arg2) {
      try {
         ++field4648;
         if (arg1.field5501 == arg2) {
            if (arg1.field5486 != -1) {
               class390 var3 = arg0.field240.method2043(-97, arg1.field5486);
               if (!var3.field5670) {
                  return var3.field5674;
               }
            }

            return arg1.field5504;
         } else {
            return arg1.field5501;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4653[8] + (arg0 != null ? field4653[7] : field4653[6]) + ',' + (arg1 != null ? field4653[7] : field4653[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class308(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (super.field7905 != 1 && ~super.field7905 != -1) {
            super.field7905 = this.method97(0);
         }

         ++field4646;
         if (arg0 != -22) {
            this.method2525(108);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4653[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field4649;
         if (arg0 != 0) {
            this.method97(-46);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4653[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2525(int arg0) {
      try {
         ++field4651;
         return arg0 > -52 ? -77 : super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4653[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2526(byte arg0, int arg1) {
      try {
         class571.field8095 = 1000000000L / (long)arg1;
         if (arg0 != -109) {
            method2524((class17)null, (class376)null, -13);
         }

         ++field4647;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4653[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field4650;
         if (arg0 != 1) {
            this.method92(26, 89);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4653[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class308(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field4652;
         super.field7905 = arg0;
         if (!arg1) {
            this.method98((byte)41);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4653[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
