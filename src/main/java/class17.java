import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 extends class55 {
   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field203 = new String[]{method104(method103("#\u0015-\u0007\u000b")), method104(method103("#\u0015-\u0004\u000b")), method104(method103("#\u0015-\u0002\u000b")), method104(method103("#\u0015-\t\u000b")), method104(method103("#\u0015-\u0000\u000b")), method104(method103("#\u0015-\u0003\u000b")), method104(method103("&\bo-")), method104(method103("#\u0015-}J&\u0014w\u007f\u000b")), method104(method103("3S-o^")), method104(method103("#\u0015-\u0006\u000b"))};
   @OriginalMember(
      owner = "client!kh",
      name = "l",
      descriptor = "I"
   )
   public static int field201 = 0;
   @OriginalMember(
      owner = "client!kh",
      name = "g",
      descriptor = "Lga;"
   )
   public static class426 field194 = new class426(8);
   @OriginalMember(
      owner = "client!kh",
      name = "m",
      descriptor = "I"
   )
   public static int field192;
   @OriginalMember(
      owner = "client!kh",
      name = "k",
      descriptor = "I"
   )
   public static int field193;
   @OriginalMember(
      owner = "client!kh",
      name = "f",
      descriptor = "I"
   )
   public static int field195;
   @OriginalMember(
      owner = "client!kh",
      name = "j",
      descriptor = "I"
   )
   public static int field197;
   @OriginalMember(
      owner = "client!kh",
      name = "n",
      descriptor = "I"
   )
   public static int field198;
   @OriginalMember(
      owner = "client!kh",
      name = "o",
      descriptor = "I"
   )
   public static int field199;
   @OriginalMember(
      owner = "client!kh",
      name = "h",
      descriptor = "I"
   )
   public static int field200;
   @OriginalMember(
      owner = "client!kh",
      name = "e",
      descriptor = "Lkf;"
   )
   public static class266 field196;
   @OriginalMember(
      owner = "client!kh",
      name = "i",
      descriptor = "[[S"
   )
   public static short[][] field202;

   @OriginalMember(
      owner = "client!kh",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 4
   )
   public class17(class453 arg0) {
      super(arg0);

      try {
         class305.method2278(super.field680, -107);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field203[7] + (arg0 != null ? field203[8] : field203[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(IB)V",
      line = 12
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field200;
         super.field680 = arg0;
         int var3 = 125 % ((arg1 - 47) / 46);
         class305.method2278(super.field680, -114);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field203[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(IB)I",
      line = 24
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            return 49;
         } else {
            ++field193;
            return super.field683.method3307(false).method4353(false) < 96 ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field203[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(I)V",
      line = 41
   )
   public final void method98(int arg0) {
      try {
         if (super.field683.method3307(false).method4353(false) < 96) {
            super.field680 = 0;
         }

         ++field197;
         if (super.field680 < arg0 || super.field680 > 2) {
            super.field680 = this.method101(-119);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field203[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(B)Z",
      line = 54
   )
   public final boolean method99(byte arg0) {
      try {
         if (arg0 != 120) {
            this.method99((byte)74);
         }

         ++field192;
         return ~super.field683.method3307(false).method4353(false) <= -97;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field203[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "d",
      descriptor = "(I)I",
      line = 75
   )
   public final int method100(int arg0) {
      try {
         ++field199;
         int var2 = 67 / ((arg0 - 36) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field203[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(I)I",
      line = 86
   )
   public final int method101(int arg0) {
      try {
         ++field198;
         if (super.field683.method3307(false).method4353(false) < 96) {
            return 0;
         } else {
            if (arg0 >= -116) {
               field202 = null;
            }

            return 2;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field203[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 102
   )
   public class17(int arg0, class453 arg1) {
      super(arg0, arg1);

      try {
         class305.method2278(super.field680, -110);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field203[7] + arg0 + ',' + (arg1 != null ? field203[8] : field203[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "(I)V",
      line = 114
   )
   public static void method102(int arg0) {
      try {
         field194 = null;
         if (arg0 != 27256) {
            method102(-111);
         }

         field202 = null;
         field196 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field203[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method103(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method104(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
