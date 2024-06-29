import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class139 extends class465 {
   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1794 = new String[]{method1181(method1180("c\u001a \u0006\u0014")), method1181(method1180("c\u001a \u0000\u0014")), method1181(method1180("c\u001a \u0004\u0014")), method1181(method1180("c\u001a \u0007\u0014")), method1181(method1180("c\u001a \u0003\u0014")), method1181(method1180("c\u001a \u0005\u0014")), method1181(method1180("c\u001a \u0001\u0014")), method1181(method1180("c\u001a \n\u0014"))};
   @OriginalMember(
      owner = "client!hh",
      name = "k",
      descriptor = "Lsda;"
   )
   public static class269 field1786 = new class269(40, 3);
   @OriginalMember(
      owner = "client!hh",
      name = "j",
      descriptor = "I"
   )
   public static int field1785;
   @OriginalMember(
      owner = "client!hh",
      name = "n",
      descriptor = "I"
   )
   public static int field1787;
   @OriginalMember(
      owner = "client!hh",
      name = "h",
      descriptor = "I"
   )
   public static int field1788;
   @OriginalMember(
      owner = "client!hh",
      name = "m",
      descriptor = "I"
   )
   public static int field1789;
   @OriginalMember(
      owner = "client!hh",
      name = "f",
      descriptor = "I"
   )
   public static int field1790;
   @OriginalMember(
      owner = "client!hh",
      name = "g",
      descriptor = "I"
   )
   public static int field1791;
   @OriginalMember(
      owner = "client!hh",
      name = "i",
      descriptor = "I"
   )
   public static int field1792;
   @OriginalMember(
      owner = "client!hh",
      name = "l",
      descriptor = "I"
   )
   public static int field1793;

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(I)I",
      line = 4
   )
   public final int method1176(int arg0) {
      try {
         ++field1790;
         if (arg0 <= 81) {
            this.method1176(-117);
         }

         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1794[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "c",
      descriptor = "(Z)Z",
      line = 15
   )
   public final boolean method1177(boolean arg0) {
      try {
         ++field1788;
         int var2 = super.field6980.method4673((byte)-76).method3317(19285);
         if (var2 < 96) {
            return false;
         } else {
            return arg0 ? true : true;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1794[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(IB)I",
      line = 33
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = -81 / ((-51 - arg1) / 60);
         ++field1785;
         int var4 = super.field6980.method4673((byte)-76).method3317(19285);
         if (~var4 > -97) {
            return 3;
         } else if (arg0 > 1 && ~var4 > -129) {
            return 3;
         } else {
            return ~arg0 < -4 && ~var4 > -193 ? 3 : 1;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1794[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(II)V",
      line = 56
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field1791;
         if (arg0 != -14812) {
            this.method1176(79);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1794[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(III)Z",
      line = 67
   )
   public static final boolean method1178(int arg0, int arg1, int arg2) {
      try {
         if (arg1 < 99) {
            return false;
         } else {
            ++field1787;
            return ~(arg2 & 2048) != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1794[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 78
   )
   public class139(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hh",
      name = "c",
      descriptor = "(I)V",
      line = 84
   )
   public static void method1179(int arg0) {
      try {
         if (arg0 < 70) {
            field1792 = -87;
         }

         field1786 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1794[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(Z)V",
      line = 94
   )
   public final void method69(boolean arg0) {
      try {
         ++field1793;
         int var2 = super.field6980.method4673((byte)-76).method3317(19285);
         if (~var2 > -97) {
            super.field6984 = 0;
         }

         if (arg0) {
            this.method77(14, 20);
         }

         if (~super.field6984 < -2 && var2 < 128) {
            super.field6984 = 1;
         }

         if (super.field6984 > 2 && ~var2 > -193) {
            super.field6984 = 2;
         }

         if (super.field6984 < 0 || super.field6984 > 3) {
            super.field6984 = this.method78(16726277);
         }

      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1794[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(I)I",
      line = 119
   )
   public final int method78(int arg0) {
      try {
         ++field1789;
         if (arg0 != 16726277) {
            this.method78(-67);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1794[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 130
   )
   public class139(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1180(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1181(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
