import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class498 extends class101 {
   @OriginalMember(
      owner = "client!vaa",
      name = "u",
      descriptor = "I"
   )
   public int field6853;
   @OriginalMember(
      owner = "client!vaa",
      name = "q",
      descriptor = "I"
   )
   public int field6859;
   @OriginalMember(
      owner = "client!vaa",
      name = "r",
      descriptor = "I"
   )
   public int field6852;
   @OriginalMember(
      owner = "client!vaa",
      name = "v",
      descriptor = "I"
   )
   public int field6851;
   @OriginalMember(
      owner = "client!vaa",
      name = "t",
      descriptor = "I"
   )
   public int field6857;
   @OriginalMember(
      owner = "client!vaa",
      name = "y",
      descriptor = "I"
   )
   public int field6858;
   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6861 = new String[]{method3607(method3606("F.)uZ\u0018")), method3607(method3606("Kafuf")), method3607(method3606("F.)u'Y!!/%\u0018")), method3607(method3606("^:$7")), method3607(method3606("F.)uY\u0018")), method3607(method3606("F.)uX\u0018"))};
   @OriginalMember(
      owner = "client!vaa",
      name = "p",
      descriptor = "I"
   )
   public static int field6854;
   @OriginalMember(
      owner = "client!vaa",
      name = "w",
      descriptor = "I"
   )
   public static int field6855;
   @OriginalMember(
      owner = "client!vaa",
      name = "s",
      descriptor = "I"
   )
   public static int field6856;
   @OriginalMember(
      owner = "client!vaa",
      name = "x",
      descriptor = "I"
   )
   public static int field6860;

   @OriginalMember(
      owner = "client!vaa",
      name = "<init>",
      descriptor = "(Lsq;Ljh;IIIIIIIIIIIII)V"
   )
   public class498(class190 arg0, class169 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field6853 = arg14;
         this.field6859 = arg9;
         this.field6852 = arg13;
         this.field6851 = arg11;
         this.field6857 = arg10;
         this.field6858 = arg12;
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field6861[2] + (arg0 != null ? field6861[1] : field6861[3]) + ',' + (arg1 != null ? field6861[1] : field6861[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(BIII)V"
   )
   public static final void method3604(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6860;
         if (~class660.field9417 != ~arg1 || ~class596.field8300 != ~arg2 || ~class681.field9996 != ~arg3) {
            class660.field9417 = arg1;
            class596.field8300 = arg2;
            class681.field9996 = arg3;
            class591.field8180 = true;
            double var4 = -((double)(arg1 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double)(arg2 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class456.field6255 = var10 * var14;
            class600.field8374 = var12;
            class107.field1369 = -var10 * var12;
            if (arg0 < 73) {
               method3604((byte)107, 15, 29, 11);
            }

            class364.field5144 = var8;
            class527.field7207 = -var8 * var14;
            class603.field8411 = 0.0D;
            class433.field6036 = var10;
            class468.field6454 = var14;
            class486.field6704 = var8 * var12;
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field6861[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public class365 method19(int arg0) {
      try {
         ++field6855;
         int var2 = 65 % ((arg0 - 1) / 55);
         return class73.field897;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6861[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3605(int arg0, int arg1, int arg2) {
      try {
         if (arg0 < 14) {
            field6856 = 95;
         }

         ++field6854;
         return (arg1 & 540800) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6861[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3606(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3607(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
