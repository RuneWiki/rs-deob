import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class623 extends class500 {
   @OriginalMember(
      owner = "client!kq",
      name = "k",
      descriptor = "I"
   )
   public int field8699 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "l",
      descriptor = "I"
   )
   public int field8700 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "m",
      descriptor = "I"
   )
   public int field8698 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "o",
      descriptor = "I"
   )
   public int field8697 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "n",
      descriptor = "I"
   )
   public int field8705 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "x",
      descriptor = "I"
   )
   public int field8704 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "s",
      descriptor = "I"
   )
   public int field8707 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "v",
      descriptor = "I"
   )
   public int field8708 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!kq",
      name = "u",
      descriptor = "Lhq;"
   )
   public class168 field8706;
   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8709 = new String[]{method4532(method4531("UL\u0016\u0010]")), method4532(method4531("E\u0013\u0016\u0002I@\u000bL\u0000\b")), method4532(method4531("@\u0017TR")), method4532(method4531("E\u0013\u0016|\b")), method4532(method4531("E\u0013\u0016\u007f\b"))};
   @OriginalMember(
      owner = "client!kq",
      name = "p",
      descriptor = "I"
   )
   public static int field8694 = -1;
   @OriginalMember(
      owner = "client!kq",
      name = "q",
      descriptor = "I"
   )
   public static int field8695;
   @OriginalMember(
      owner = "client!kq",
      name = "t",
      descriptor = "I"
   )
   public static int field8696;
   @OriginalMember(
      owner = "client!kq",
      name = "j",
      descriptor = "I"
   )
   public static int field8701;
   @OriginalMember(
      owner = "client!kq",
      name = "r",
      descriptor = "I"
   )
   public static int field8702;
   @OriginalMember(
      owner = "client!kq",
      name = "w",
      descriptor = "I"
   )
   public static int field8703;

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(Lqh;I)V"
   )
   public static final void method4529(class74 arg0, int arg1) {
      try {
         if (arg1 == -1) {
            class204.field2512 = arg0;
            ++field8702;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8709[4] + (arg0 != null ? field8709[0] : field8709[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public final boolean method4530(int arg0, byte arg1, int arg2) {
      try {
         int var4 = 28 % ((26 - arg1) / 63);
         ++field8696;
         if (arg0 >= this.field8700 && arg0 <= this.field8697 && ~this.field8705 >= ~arg2 && this.field8708 >= arg2) {
            return true;
         } else {
            return ~arg0 <= ~this.field8704 && ~this.field8707 <= ~arg0 && arg2 >= this.field8698 && arg2 <= this.field8699;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8709[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "<init>",
      descriptor = "(Lhq;)V"
   )
   public class623(class168 arg0) {
      try {
         this.field8706 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8709[1] + (arg0 != null ? field8709[0] : field8709[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4531(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4532(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
