import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class742 extends class55 {
   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10820 = new String[]{method5379(method5378(">H\u0016\u0003$z")), method5379(method5378(">H\u0016\u0003&z")), method5379(method5378(">H\u0016\u0003-z")), method5379(method5378(">H\u0016\u0003\"z")), method5379(method5378(">H\u0016\u0003 z")), method5379(method5378(">H\u0016\u0003'z")), method5379(method5378(">H\u0016\u0003#z"))};
   @OriginalMember(
      owner = "client!lga",
      name = "g",
      descriptor = "I"
   )
   public static int field10813;
   @OriginalMember(
      owner = "client!lga",
      name = "k",
      descriptor = "I"
   )
   public static int field10814;
   @OriginalMember(
      owner = "client!lga",
      name = "h",
      descriptor = "I"
   )
   public static int field10815;
   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "I"
   )
   public static int field10817;
   @OriginalMember(
      owner = "client!lga",
      name = "i",
      descriptor = "I"
   )
   public static int field10818;
   @OriginalMember(
      owner = "client!lga",
      name = "j",
      descriptor = "I"
   )
   public static int field10819;
   @OriginalMember(
      owner = "client!lga",
      name = "f",
      descriptor = "Lkf;"
   )
   public static class266 field10816;

   @OriginalMember(
      owner = "client!lga",
      name = "d",
      descriptor = "(I)I",
      line = 3
   )
   public final int method5375(int arg0) {
      try {
         ++field10813;
         int var2 = 90 % ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10820[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(B)Z",
      line = 13
   )
   public final boolean method5376(byte arg0) {
      try {
         ++field10814;
         if (arg0 != 120) {
            field10816 = null;
         }

         return class653.method4786((byte)-106, super.field683.field6419.method391(arg0 + -42));
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10820[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 28
   )
   public class742(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(I)V",
      line = 32
   )
   public static void method5377(int arg0) {
      try {
         field10816 = null;
         if (arg0 != 1) {
            method5377(9);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10820[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(IB)I",
      line = 42
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field10818;
         if (!class653.method4786((byte)-106, super.field683.field6419.method391(78))) {
            return 3;
         } else {
            if (arg1 != 105) {
               field10816 = null;
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10820[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(IB)V",
      line = 56
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field10819;
         super.field680 = arg0;
         int var3 = -104 / ((47 - arg1) / 46);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10820[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(I)V",
      line = 67
   )
   public final void method98(int arg0) {
      try {
         if (super.field683.field6419.method386(arg0 ^ 3) && !class653.method4786((byte)-106, super.field683.field6419.method391(86))) {
            super.field680 = 0;
         }

         ++field10817;
         if (arg0 == 0) {
            if (~super.field680 > -1 || super.field680 > 1) {
               super.field680 = this.method101(-123);
            }

         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10820[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 84
   )
   public class742(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(I)I",
      line = 88
   )
   public final int method101(int arg0) {
      try {
         if (arg0 >= -116) {
            method5377(-9);
         }

         ++field10815;
         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10820[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5378(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5379(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
