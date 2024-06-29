import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class260 extends class454 {
   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3310 = new String[]{method2096(method2095("\u0002!dz|")), method2096(method2095("\u0002!d{|")), method2096(method2095("\u0002!dx|")), method2096(method2095("\u0002!d~|")), method2096(method2095("\u0002!d}|")), method2096(method2095("\u0002!d\u007f|")), method2096(method2095("\u0002!d||"))};
   @OriginalMember(
      owner = "client!tw",
      name = "n",
      descriptor = "I"
   )
   public static int field3302;
   @OriginalMember(
      owner = "client!tw",
      name = "l",
      descriptor = "I"
   )
   public static int field3303;
   @OriginalMember(
      owner = "client!tw",
      name = "i",
      descriptor = "I"
   )
   public static int field3304;
   @OriginalMember(
      owner = "client!tw",
      name = "p",
      descriptor = "I"
   )
   public static int field3305;
   @OriginalMember(
      owner = "client!tw",
      name = "j",
      descriptor = "I"
   )
   public static int field3306;
   @OriginalMember(
      owner = "client!tw",
      name = "o",
      descriptor = "I"
   )
   public static int field3307;
   @OriginalMember(
      owner = "client!tw",
      name = "k",
      descriptor = "I"
   )
   public static int field3308;
   @OriginalMember(
      owner = "client!tw",
      name = "m",
      descriptor = "I"
   )
   public static int field3309;

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field3303;
         if (arg1) {
            method2094(-66, -40, true);
         }

         return 3;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3310[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2092(int arg0) {
      try {
         if (arg0 != -18033) {
            this.method2092(-51);
         }

         ++field3307;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3310[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method2093(int arg0, int arg1) {
      try {
         ++field3308;
         class487 var2 = class2.method12((long)arg1, 16, (byte)43);
         var2.method3696(-11118);
         if (arg0 >= 0) {
            method2094(-81, 15, false);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3310[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (!arg0) {
            field3305 = 119;
         }

         ++field3302;
         super.field6263 = this.method23(1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3310[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class260(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method2094(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            field3305 = 35;
         }

         ++field3309;
         return ~(393216 & arg0) != -1 | class268.method2142(arg1, arg0, 1) || class481.method3656(arg2, arg1, arg0) || class562.method4229(arg0, arg1, (byte)1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3310[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class260(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field3306;
         if (arg0 <= -46) {
            super.field6263 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3310[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            field3305 = 118;
         }

         ++field3304;
         return super.field6259.method5439(28852) == class450.field6103 && super.field6259.method5434((byte)-127) ? 0 : 1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3310[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2095(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2096(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
