import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class546 extends class500 {
   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7457 = new String[]{method3948(method3947(".)mZ-")), method3948(method3947(".)m[-")), method3948(method3947(".)m]-")), method3948(method3947(".)m^-")), method3948(method3947(".)m_-")), method3948(method3947(".)m\\-"))};
   @OriginalMember(
      owner = "client!dn",
      name = "p",
      descriptor = "I"
   )
   public static int field7447 = 0;
   @OriginalMember(
      owner = "client!dn",
      name = "m",
      descriptor = "I"
   )
   public static int field7448;
   @OriginalMember(
      owner = "client!dn",
      name = "r",
      descriptor = "I"
   )
   public static int field7449;
   @OriginalMember(
      owner = "client!dn",
      name = "s",
      descriptor = "I"
   )
   public static int field7450;
   @OriginalMember(
      owner = "client!dn",
      name = "j",
      descriptor = "I"
   )
   public static int field7454;
   @OriginalMember(
      owner = "client!dn",
      name = "n",
      descriptor = "I"
   )
   public static int field7455;
   @OriginalMember(
      owner = "client!dn",
      name = "o",
      descriptor = "I"
   )
   public static int field7456;
   @OriginalMember(
      owner = "client!dn",
      name = "l",
      descriptor = "J"
   )
   public long field7452;
   @OriginalMember(
      owner = "client!dn",
      name = "k",
      descriptor = "Ldn;"
   )
   public class546 field7451;
   @OriginalMember(
      owner = "client!dn",
      name = "q",
      descriptor = "Ldn;"
   )
   public class546 field7453;

   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method3941(boolean arg0) {
      try {
         if (arg0) {
            method3942((byte)-13);
         }

         ++field7456;
         return this.field7451 != null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7457[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(B)Lbn;"
   )
   public static final class471 method3942(byte arg0) {
      try {
         ++field7455;
         if (arg0 > -67) {
            method3942((byte)28);
         }

         return ~class686.field10070 == -1 ? new class471() : class739.field10766[--class686.field10070];
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7457[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3943(int arg0) {
      try {
         ++field7450;
         if (this.field7451 != null) {
            this.field7451.field7453 = this.field7453;
            this.field7453.field7451 = this.field7451;
            this.field7453 = null;
            if (arg0 != -4) {
               this.field7452 = 53L;
            }

            this.field7451 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7457[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3944(int arg0, int arg1) {
      try {
         if (arg0 != 10) {
            method3945(-128, -122, -44, -69);
         }

         int var4 = arg1 - 1;
         ++field7448;
         int var5 = var4 | var4 >>> 1;
         int var6 = var5 | var5 >>> 2;
         int var7 = var6 | var6 >>> 4;
         int var8 = var7 | var7 >>> 8;
         int var9 = var8 | var8 >>> 16;
         return var9 + 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7457[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method3945(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 <= -39) {
            ++field7454;
            class100.field1295 = new byte[arg2][arg3][arg0];
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7457[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(JIZI)Ljava/lang/String;"
   )
   public static final String method3946(long arg0, int arg1, boolean arg2, int arg3) {
      try {
         Calendar var5;
         label22: {
            ++field7449;
            if (arg2) {
               class168.method1322(arg0, 118);
               var5 = class624.field8715;
               if (!client.field4273) {
                  break label22;
               }
            }

            class621.method4518((byte)-2, arg0);
            var5 = class624.field8714;
         }

         int var6 = var5.get(5);
         int var7 = var5.get(2);
         if (arg3 != 19828) {
            field7447 = 83;
         }

         int var8 = var5.get(1);
         int var9 = var5.get(11);
         int var10 = var5.get(12);
         return ~arg1 == -4 ? class540.method3904(arg0, arg1, 5, arg2) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class429.field5981[arg1][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field7457[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3947(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3948(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
