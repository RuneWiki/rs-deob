import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class244 extends class730 {
   @OriginalMember(
      owner = "client!dh",
      name = "n",
      descriptor = "I"
   )
   private int field3708;
   @OriginalMember(
      owner = "client!dh",
      name = "v",
      descriptor = "I"
   )
   private int field3711;
   @OriginalMember(
      owner = "client!dh",
      name = "u",
      descriptor = "I"
   )
   private int field3713;
   @OriginalMember(
      owner = "client!dh",
      name = "m",
      descriptor = "I"
   )
   private int field3716;
   @OriginalMember(
      owner = "client!dh",
      name = "x",
      descriptor = "I"
   )
   private int field3714;
   @OriginalMember(
      owner = "client!dh",
      name = "t",
      descriptor = "I"
   )
   private int field3719;
   @OriginalMember(
      owner = "client!dh",
      name = "r",
      descriptor = "I"
   )
   private int field3710;
   @OriginalMember(
      owner = "client!dh",
      name = "s",
      descriptor = "I"
   )
   private int field3707;
   @OriginalMember(
      owner = "client!dh",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3721 = new String[]{method2086(method2085("<N\u0001*A")), method2086(method2085("<N\u0001W\u00006O[UA")), method2086(method2085("<N\u0001)A")), method2086(method2085("<N\u0001(A")), method2086(method2085("<N\u0001/A")), method2086(method2085("<N\u0001.A"))};
   @OriginalMember(
      owner = "client!dh",
      name = "q",
      descriptor = "I"
   )
   public static int field3715 = 999999;
   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "I"
   )
   public static int field3709;
   @OriginalMember(
      owner = "client!dh",
      name = "w",
      descriptor = "I"
   )
   public static int field3712;
   @OriginalMember(
      owner = "client!dh",
      name = "o",
      descriptor = "I"
   )
   public static int field3717;
   @OriginalMember(
      owner = "client!dh",
      name = "p",
      descriptor = "I"
   )
   public static int field3718;
   @OriginalMember(
      owner = "client!dh",
      name = "y",
      descriptor = "I"
   )
   public static int field3720;

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2080(int arg0, int arg1, int arg2) {
      try {
         ++field3718;
         if (arg2 != 19856) {
            this.method2081(true, 76, -94);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3721[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method2081(boolean arg0, int arg1, int arg2) {
      try {
         ++field3720;
         if (!arg0) {
            method2082((byte)49, -122);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3721[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      super(-1, arg8, arg9);

      try {
         this.field3708 = arg1;
         this.field3711 = arg4;
         this.field3713 = arg0;
         this.field3716 = arg2;
         this.field3714 = arg7;
         this.field3719 = arg5;
         this.field3710 = arg3;
         this.field3707 = arg6;
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field3721[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2082(byte arg0, int arg1) {
      try {
         class600.field8790 = arg1;
         ++field3717;
         class739.field10981 = -1;
         class475.field7231 = 3;
         class241.field3658 = 100;
         if (arg0 != -93) {
            field3715 = -33;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3721[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method2083(int arg0, int arg1, int arg2) {
      try {
         ++field3712;
         int var4 = this.field3713 * arg2 >> 12;
         int var5 = this.field3708 * arg0 >> 12;
         int var6 = this.field3716 * arg2 >> 12;
         int var7 = this.field3710 * arg0 >> 12;
         int var8 = this.field3711 * arg2 >> 12;
         int var9 = this.field3719 * arg0 >> 12;
         int var10 = this.field3707 * arg2 >> 12;
         int var11 = this.field3714 * arg0 >> 12;
         class359.method2943(super.field10896, var7, var9, var5, var4, var11, var10, 2, var8, var6);
         int var12 = -116 % ((-13 - arg1) / 40);
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field3721[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2084(int arg0, int arg1) {
      try {
         ++field3709;
         class345.method2791(-10279);
         int var2 = class479.field7291.method502(true, arg1).field1563;
         if (~var2 != -1) {
            int var3 = class45.field599.field1385[arg1];
            if (~var2 == -6) {
               class504.field7688 = var3;
            }

            if (arg0 == var2) {
               class648.field9342 = var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3721[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2085(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2086(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
