import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class409 extends class465 {
   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6242 = new String[]{method3127(method3126("\t8;\u0019)")), method3127(method3126("\t8;\u001b)")), method3127(method3126("\t8;\u001e)")), method3127(method3126("\t8;\u001c)")), method3127(method3126("\t8;\u0018)")), method3127(method3126("\t8;\u001d)")), method3127(method3126("\u0013 y3")), method3127(method3126("\t8;\u0017)")), method3127(method3126("\u0006{;q|")), method3127(method3126("\t8;\u001a)"))};
   @OriginalMember(
      owner = "client!tm",
      name = "g",
      descriptor = "J"
   )
   public static long field6238 = 0L;
   @OriginalMember(
      owner = "client!tm",
      name = "n",
      descriptor = "[Z"
   )
   public static boolean[] field6239 = new boolean[100];
   @OriginalMember(
      owner = "client!tm",
      name = "i",
      descriptor = "I"
   )
   public static int field6231;
   @OriginalMember(
      owner = "client!tm",
      name = "f",
      descriptor = "I"
   )
   public static int field6232;
   @OriginalMember(
      owner = "client!tm",
      name = "o",
      descriptor = "I"
   )
   public static int field6233;
   @OriginalMember(
      owner = "client!tm",
      name = "j",
      descriptor = "I"
   )
   public static int field6234;
   @OriginalMember(
      owner = "client!tm",
      name = "h",
      descriptor = "I"
   )
   public static int field6236;
   @OriginalMember(
      owner = "client!tm",
      name = "l",
      descriptor = "I"
   )
   public static int field6237;
   @OriginalMember(
      owner = "client!tm",
      name = "k",
      descriptor = "I"
   )
   public static int field6240;
   @OriginalMember(
      owner = "client!tm",
      name = "m",
      descriptor = "I"
   )
   public static int field6241;
   @OriginalMember(
      owner = "client!tm",
      name = "p",
      descriptor = "Lnia;"
   )
   public static class671 field6235;

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = -24 / ((-51 - arg1) / 60);
         ++field6231;
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6242[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         ++field6240;
         if (arg0) {
            method3123((class544)null, (class544)null, (byte)0);
         }

         if (super.field6980.method4681(-17520) == class180.field2219) {
            super.field6984 = 2;
         }

         if (~super.field6984 > -1 || super.field6984 > 2) {
            super.field6984 = this.method78(16726277);
         }

      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6242[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class409(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3122(byte arg0) {
      try {
         field6235 = null;
         field6239 = null;
         if (arg0 != -83) {
            method3123((class544)null, (class544)null, (byte)-53);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6242[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(Lhv;Lhv;B)V"
   )
   public static final void method3123(class544 arg0, class544 arg1, byte arg2) {
      try {
         ++field6232;
         ++class526.field7638;
         class180 var3 = class486.method3603(class137.field1763, (byte)-122, class48.field583);
         var3.field2211.method1094(-29, arg0.field8054);
         if (arg2 == -47) {
            var3.field2211.method1103(arg1.field8048, -89);
            var3.field2211.method1051((byte)-121, arg1.field8054);
            var3.field2211.method1096((byte)-107, arg0.field7969);
            var3.field2211.method1079(arg1.field7969, 1856);
            var3.field2211.method1081(128, arg0.field8048);
            class763.method5527(false, var3);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6242[7] + (arg0 != null ? field6242[8] : field6242[6]) + ',' + (arg1 != null ? field6242[8] : field6242[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method3124(int arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field6236;
         class347 var3 = class417.field6385.method5677((byte)44);
         if (var2 != 0) {
            if (~(var3.field5280 >> 48 & 65535L) == ~((long)arg0)) {
               var3.method2720(0);
            }

            var3 = class417.field6385.method5671(-109);
         }

         while(true) {
            while(var3 != null) {
               if (~(var3.field5280 >> 48 & 65535L) == ~((long)arg0)) {
                  var3.method2720(0);
               }

               var3 = class417.field6385.method5671(-109);
            }

            if (var2 == 0) {
               if (arg1 != 17664) {
                  field6238 = -117L;
                  return;
               }

               return;
            }

            if (arg1 == 0) {
               var3.method2720(0);
            }

            var3 = class417.field6385.method5671(-109);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6242[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3125(int arg0) {
      try {
         if (arg0 <= 81) {
            return 109;
         } else {
            ++field6241;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6242[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            return 62;
         } else {
            ++field6233;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6242[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class409(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tm",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field6234;
         if (arg0 != -14812) {
            field6239 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6242[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3126(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3127(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
