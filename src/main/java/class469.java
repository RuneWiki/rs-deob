import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class469 extends class55 {
   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6744 = new String[]{method3406(method3405("RCN\u0019\u001b")), method3406(method3405("RCN\u001b\u001b")), method3406(method3405("F\u001eNpN")), method3406(method3405("RCN\u001c\u001b")), method3406(method3405("SE\f2")), method3406(method3405("RCN\u0016\u001b")), method3406(method3405("RCN\u001f\u001b")), method3406(method3405("RCN\u0018\u001b")), method3406(method3405("RCN\u001d\u001b"))};
   @OriginalMember(
      owner = "client!os",
      name = "i",
      descriptor = "I"
   )
   public static int field6737;
   @OriginalMember(
      owner = "client!os",
      name = "k",
      descriptor = "I"
   )
   public static int field6738;
   @OriginalMember(
      owner = "client!os",
      name = "g",
      descriptor = "I"
   )
   public static int field6739;
   @OriginalMember(
      owner = "client!os",
      name = "j",
      descriptor = "I"
   )
   public static int field6740;
   @OriginalMember(
      owner = "client!os",
      name = "f",
      descriptor = "I"
   )
   public static int field6741;
   @OriginalMember(
      owner = "client!os",
      name = "h",
      descriptor = "I"
   )
   public static int field6742;
   @OriginalMember(
      owner = "client!os",
      name = "e",
      descriptor = "I"
   )
   public static int field6743;

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(BIIILdea;)V"
   )
   public static final void method3402(byte param0, int param1, int param2, int param3, class259 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3403(byte arg0) {
      try {
         ++field6743;
         if (super.field683.method3300((byte)-56)) {
            return false;
         } else if (arg0 != 120) {
            return true;
         } else {
            return ~super.field683.field6434.method1454(-90) != -1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6744[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3404(int arg0) {
      try {
         ++field6737;
         int var2 = 76 / ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6744[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class469(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         super.field680 = arg0;
         int var3 = -56 / ((47 - arg1) / 46);
         ++field6742;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6744[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class469(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field6738;
         if (super.field683.method3300((byte)-56)) {
            super.field680 = 0;
         }

         if (super.field683.field6434.method1454(-128) == 0) {
            super.field680 = 0;
         }

         if (arg0 > super.field680 || super.field680 > 2) {
            super.field680 = this.method101(-118);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6744[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field6739;
         return arg0 >= -116 ? -105 : 2;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6744[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field6740;
         if (arg1 != 105) {
            this.method101(-68);
         }

         if (super.field683.method3300((byte)-56)) {
            return 3;
         } else {
            return ~super.field683.field6434.method1454(94) == -1 ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6744[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3405(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3406(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
