import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class122 extends class247 {
   @OriginalMember(
      owner = "client!ts",
      name = "m",
      descriptor = "Laea;"
   )
   public class678 field1965;
   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1968 = new String[]{method1214(method1213("5@\u001c\tc")), method1214(method1213(":\u001d\u001cf6")), method1214(method1213("5@\u001ct\"/ZFvc")), method1214(method1213("/F^$")), method1214(method1213("5@\u001c\rc")), method1214(method1213("5@\u001c\u0004c")), method1214(method1213("5@\u001c\fc")), method1214(method1213("5@\u001c\u0003c")), method1214(method1213("5@\u001c\u000fc")), method1214(method1213("5@\u001c\u0002c"))};
   @OriginalMember(
      owner = "client!ts",
      name = "j",
      descriptor = "Ltb;"
   )
   public static class392 field1967 = new class392(method1214(method1213("2GW$' AV)</")), method1214(method1213("\u0012GW$' A\u0012\f*6]")), 1);
   @OriginalMember(
      owner = "client!ts",
      name = "p",
      descriptor = "I"
   )
   public static int field1958;
   @OriginalMember(
      owner = "client!ts",
      name = "r",
      descriptor = "I"
   )
   public static int field1959;
   @OriginalMember(
      owner = "client!ts",
      name = "l",
      descriptor = "I"
   )
   public static int field1961;
   @OriginalMember(
      owner = "client!ts",
      name = "n",
      descriptor = "I"
   )
   public static int field1962;
   @OriginalMember(
      owner = "client!ts",
      name = "q",
      descriptor = "I"
   )
   public static int field1963;
   @OriginalMember(
      owner = "client!ts",
      name = "s",
      descriptor = "I"
   )
   public static int field1964;
   @OriginalMember(
      owner = "client!ts",
      name = "k",
      descriptor = "I"
   )
   public static int field1966;
   @OriginalMember(
      owner = "client!ts",
      name = "o",
      descriptor = "Z"
   )
   public boolean field1960;

   @OriginalMember(
      owner = "client!ts",
      name = "g",
      descriptor = "(I)Z"
   )
   public abstract boolean method1200(int arg0);

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(I)I"
   )
   public int method1201(int arg0) {
      try {
         if (arg0 != 256) {
            this.method1207(-103);
         }

         ++field1963;
         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1968[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1202(int arg0) {
      try {
         if (arg0 <= -51) {
            field1967 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1968[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(ILmn;Lmn;B)V"
   )
   public abstract void method1203(int arg0, class8 arg1, class8 arg2, byte arg3);

   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method1204(boolean arg0) {
      try {
         if (arg0) {
            this.field1960 = true;
         }

         ++field1966;
         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1968[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1205(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ts",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method1206(int arg0);

   @OriginalMember(
      owner = "client!ts",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method1207(int arg0) {
      try {
         int var2 = 33 / ((arg0 - 28) / 43);
         ++field1958;
         return this.field1960;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1968[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "h",
      descriptor = "(I)Z"
   )
   public abstract boolean method1208(int arg0);

   @OriginalMember(
      owner = "client!ts",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class122(class678 arg0) {
      try {
         this.field1965 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1968[2] + (arg0 != null ? field1968[1] : field1968[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1209(int arg0, int arg1) {
      try {
         int var2 = 70 / ((arg1 - 72) / 36);
         ++field1961;
         return ~(-arg0 & arg0) == ~arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1968[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1210(boolean arg0) {
      try {
         if (!arg0) {
            this.method1200(52);
         }

         ++field1959;
         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1968[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(IB)V"
   )
   public abstract void method1211(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method1212(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field1962;
         int var12 = arg2 + 1;
         class100.method989(arg3, (byte)22, arg0, arg5, class788.field11482[arg2]);
         int var13 = arg4 - 1;
         class100.method989(arg3, (byte)22, arg0, arg5, class788.field11482[arg4]);
         if (arg1) {
            int var7 = var12;
            if (var6 || ~var13 <= ~var12) {
               do {
                  int[] var8 = class788.field11482[var7];
                  var8[arg3] = var8[arg0] = arg5;
                  ++var7;
               } while(~var13 <= ~var7);

            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field1968[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1213(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1214(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
