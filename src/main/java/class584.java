import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class584 extends class555 {
   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8015 = new String[]{method4197(method4196("Xx{a/")), method4197(method4196("Xx{e/")), method4197(method4196("Xx{d/")), method4197(method4196("Xx{c/")), method4197(method4196("Xx{f/")), method4197(method4196("Xx{g/")), method4197(method4196("Xx{`/"))};
   @OriginalMember(
      owner = "client!jw",
      name = "j",
      descriptor = "Lbga;"
   )
   public static class378 field8008 = new class378(48, -2);
   @OriginalMember(
      owner = "client!jw",
      name = "f",
      descriptor = "I"
   )
   public static int field8007;
   @OriginalMember(
      owner = "client!jw",
      name = "g",
      descriptor = "I"
   )
   public static int field8009;
   @OriginalMember(
      owner = "client!jw",
      name = "h",
      descriptor = "I"
   )
   public static int field8010;
   @OriginalMember(
      owner = "client!jw",
      name = "k",
      descriptor = "I"
   )
   public static int field8011;
   @OriginalMember(
      owner = "client!jw",
      name = "l",
      descriptor = "I"
   )
   public static int field8012;
   @OriginalMember(
      owner = "client!jw",
      name = "i",
      descriptor = "I"
   )
   public static int field8013;
   @OriginalMember(
      owner = "client!jw",
      name = "m",
      descriptor = "[[S"
   )
   public static short[][] field8014;

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            this.method638(20, (byte)116);
         }

         ++field8012;
         return 2;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8015[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method4193(byte arg0) {
      try {
         ++field8011;
         if (arg0 > -61) {
            this.method4193((byte)19);
         }

         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8015[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4194(int arg0) {
      try {
         class633.field8958.method581(class773.field11148);
         if (arg0 == 5122) {
            ++field8009;
            class633.field8958.method526(class480.field6632, class110.field1398, class257.field3279, class266.field3461);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8015[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4195(int arg0) {
      try {
         if (arg0 != 2) {
            field8014 = null;
         }

         field8008 = null;
         field8014 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8015[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 != -13712) {
            field8008 = null;
         }

         ++field8007;
         if (super.field7633.field8471.method2855((byte)119) && ~super.field7632 == -3) {
            super.field7632 = 1;
         }

         if (super.field7632 < 0 || super.field7632 > 2) {
            super.field7632 = this.method635(127);
         }

      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8015[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class584(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field8013;
         return arg1 < 36 ? 27 : 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8015[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field8010;
         super.field7632 = arg0;
         int var3 = -14 / ((arg1 - 12) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8015[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class584(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4196(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4197(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
