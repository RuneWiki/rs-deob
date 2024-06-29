import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class483 extends class673 {
   @OriginalMember(
      owner = "client!bp",
      name = "o",
      descriptor = "I"
   )
   public int field6716;
   @OriginalMember(
      owner = "client!bp",
      name = "x",
      descriptor = "I"
   )
   private int field6707;
   @OriginalMember(
      owner = "client!bp",
      name = "p",
      descriptor = "I"
   )
   public int field6717;
   @OriginalMember(
      owner = "client!bp",
      name = "u",
      descriptor = "I"
   )
   public int field6709;
   @OriginalMember(
      owner = "client!bp",
      name = "t",
      descriptor = "I"
   )
   private int field6721;
   @OriginalMember(
      owner = "client!bp",
      name = "A",
      descriptor = "I"
   )
   private int field6718;
   @OriginalMember(
      owner = "client!bp",
      name = "r",
      descriptor = "I"
   )
   private int field6711;
   @OriginalMember(
      owner = "client!bp",
      name = "q",
      descriptor = "I"
   )
   public int field6712;
   @OriginalMember(
      owner = "client!bp",
      name = "l",
      descriptor = "I"
   )
   private int field6720;
   @OriginalMember(
      owner = "client!bp",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6724 = new String[]{method3673(method3672("\u001cG9LQ")), method3673(method3672("\t\u001c{\u000e")), method3673(method3672("\u0005\u00199!\u0004")), method3673(method3672("\u0005\u00199#\u0004")), method3673(method3672("\u0005\u00199^E\t\u0000c\\\u0004")), method3673(method3672("\u0005\u00199 \u0004")), method3673(method3672("\u0005\u00199'\u0004")), method3673(method3672("\u0005\u00199&\u0004"))};
   @OriginalMember(
      owner = "client!bp",
      name = "s",
      descriptor = "I"
   )
   public static int field6714 = -1;
   @OriginalMember(
      owner = "client!bp",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field6722 = false;
   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "I"
   )
   public static int field6708;
   @OriginalMember(
      owner = "client!bp",
      name = "y",
      descriptor = "I"
   )
   public static int field6710;
   @OriginalMember(
      owner = "client!bp",
      name = "w",
      descriptor = "I"
   )
   public static int field6713;
   @OriginalMember(
      owner = "client!bp",
      name = "n",
      descriptor = "I"
   )
   public static int field6715;
   @OriginalMember(
      owner = "client!bp",
      name = "B",
      descriptor = "I"
   )
   public static int field6719;
   @OriginalMember(
      owner = "client!bp",
      name = "m",
      descriptor = "I"
   )
   public static int field6723;

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method3667(int arg0, int arg1, int arg2) {
      try {
         ++field6713;
         if (arg2 != 26547) {
            this.method3668(-10, -51, -24, 50);
         }

         return ~arg1 <= ~this.field6720 && ~arg1 >= ~this.field6718 && ~arg0 <= ~this.field6721 && ~arg0 >= ~this.field6707;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6724[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method3668(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6719;
         if (arg3 != 1) {
            this.field6718 = 100;
         }

         return ~this.field6711 == ~arg1 && this.field6720 <= arg0 && arg0 <= this.field6718 && ~this.field6721 >= ~arg2 && ~this.field6707 <= ~arg2;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6724[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(I[III)V"
   )
   public final void method3669(int arg0, int[] arg1, int arg2, int arg3) {
      try {
         arg1[arg2] = -this.field6721 + arg3 + this.field6716;
         arg1[1] = this.field6709 + arg0 + -this.field6720;
         ++field6708;
         arg1[0] = 0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6724[7] + arg0 + ',' + (arg1 != null ? field6724[0] : field6724[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(IB[II)V"
   )
   public final void method3670(int arg0, byte arg1, int[] arg2, int arg3) {
      try {
         arg2[1] = -this.field6709 + this.field6720 + arg3;
         if (arg1 <= -22) {
            arg2[0] = this.field6711;
            arg2[2] = -this.field6716 + arg0 + this.field6721;
            ++field6710;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6724[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6724[0] : field6724[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "<init>",
      descriptor = "(IIIIIIIII)V"
   )
   public class483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field6716 = arg6;
         this.field6707 = arg4;
         this.field6717 = arg8;
         this.field6709 = arg5;
         this.field6721 = arg2;
         this.field6718 = arg3;
         this.field6711 = arg0;
         this.field6712 = arg7;
         this.field6720 = arg1;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field6724[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "(III)Z"
   )
   public final boolean method3671(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 22307) {
            return false;
         } else {
            ++field6715;
            return this.field6709 <= arg0 && ~this.field6712 <= ~arg0 && ~this.field6716 >= ~arg2 && this.field6717 >= arg2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6724[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3672(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3673(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
