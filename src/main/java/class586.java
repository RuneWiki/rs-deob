import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class586 extends class428 {
   @OriginalMember(
      owner = "client!si",
      name = "y",
      descriptor = "I"
   )
   public int field8661 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "o",
      descriptor = "I"
   )
   public int field8660 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "s",
      descriptor = "I"
   )
   public int field8663 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "w",
      descriptor = "I"
   )
   public int field8664 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "p",
      descriptor = "I"
   )
   public int field8659 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "m",
      descriptor = "I"
   )
   public int field8667 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "q",
      descriptor = "I"
   )
   public int field8668 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "v",
      descriptor = "I"
   )
   public int field8669 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!si",
      name = "x",
      descriptor = "Lrd;"
   )
   public class357 field8658;
   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8670 = new String[]{method4271(method4270("H\nLmc")), method4271(method4270("H\nLoc")), method4271(method4270("U\u0016\u000e@")), method4271(method4270("@ML\u00026")), method4271(method4270("H\nL\u0010\"U\n\u0016\u0012c")), method4271(method4270("H\nLnc"))};
   @OriginalMember(
      owner = "client!si",
      name = "n",
      descriptor = "I"
   )
   public static int field8657;
   @OriginalMember(
      owner = "client!si",
      name = "r",
      descriptor = "I"
   )
   public static int field8662;
   @OriginalMember(
      owner = "client!si",
      name = "t",
      descriptor = "I"
   )
   public static int field8665;
   @OriginalMember(
      owner = "client!si",
      name = "u",
      descriptor = "I"
   )
   public static int field8666;

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(III[[[BIIIIIILha;BI)V"
   )
   public static final void method4267(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class66 arg10, byte arg11, int arg12) {
      try {
         ++field8657;
         if (~arg4 != -1 && ~arg12 != -1) {
            if (arg4 == 9) {
               arg4 = 1;
               arg5 = 3 & arg5 + 1;
            }

            if (arg4 == 10) {
               arg4 = 1;
               arg5 = arg5 + 3 & 3;
            }

            if (~arg4 == -12) {
               arg4 = 8;
               arg5 = 3 & arg5 + 3;
            }

            if (arg11 < -71) {
               arg10.method610(arg0, arg2, arg6, arg1, arg7, arg8, arg3[arg4 - 1][arg5], arg12, arg9);
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field8670[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8670[3] : field8670[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field8670[3] : field8670[2]) + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method4268(int arg0, int arg1, int arg2) {
      try {
         ++field8662;
         if (~this.field8663 >= ~arg1 && ~arg1 >= ~this.field8668 && ~arg0 <= ~this.field8661 && ~this.field8664 <= ~arg0) {
            return true;
         } else if (~this.field8667 >= ~arg1 && this.field8660 >= arg1 && this.field8659 <= arg0 && arg0 <= this.field8669) {
            return true;
         } else {
            if (arg2 != 18167) {
               method4267(-71, -52, -51, (byte[][][])null, -28, -32, -104, -77, 35, 117, (class66)null, (byte)57, -93);
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8670[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         class29 var8 = (class29)class477.field6863.method5529((byte)-42);
         int var10000;
         int var10001;
         if (var7) {
            var10000 = var8.field430;
            var10001 = class96.field1234;
         } else if (var8 == null) {
            var10000 = arg0;
            var10001 = -15326;
            if (!var7) {
               if (arg0 != -15326) {
                  return;
               }

               ++field8665;
               return;
            }
         } else {
            var10000 = var8.field430;
            var10001 = class96.field1234;
         }

         while(true) {
            label58: {
               if (var10000 <= var10001) {
                  var8.method12((byte)78);
                  if (!var7) {
                     var8 = (class29)class477.field6863.method5527((byte)45);
                     break label58;
                  }
               }

               class424.method3133((var8.field426 << 9) - -256, arg6 >> 1, var8.field432, arg0 ^ 15268, (var8.field427 << 9) + 256, arg5 >> 1, arg2, var8.field425 * 2, arg3);
               class455.field6465.method632(arg1 - -class131.field1678[0], false, 0, class131.field1678[1] + arg4, var8.field431, -16777216 | var8.field424);
               var8 = (class29)class477.field6863.method5527((byte)45);
            }

            if (var8 == null) {
               var10000 = arg0;
               var10001 = -15326;
               if (!var7) {
                  if (arg0 != -15326) {
                     return;
                  }

                  ++field8665;
                  return;
               }
            } else {
               var10000 = var8.field430;
               var10001 = class96.field1234;
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8670[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "<init>",
      descriptor = "(Lrd;)V"
   )
   public class586(class357 arg0) {
      try {
         this.field8658 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8670[4] + (arg0 != null ? field8670[3] : field8670[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4270(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4271(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
