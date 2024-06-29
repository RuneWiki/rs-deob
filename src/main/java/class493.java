import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class493 extends class55 {
   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7043 = new String[]{method3583(method3582("GD{g\u0007\n")), method3583(method3582("GD{g\u0004\n")), method3583(method3582("GD{g\u0001\n")), method3583(method3582("GD{g\u0005\n")), method3583(method3582("GD{g\n\n")), method3583(method3582("GD{g\u0003\n"))};
   @OriginalMember(
      owner = "client!eka",
      name = "j",
      descriptor = "Loi;"
   )
   public static class80 field7038 = new class80(3000000, 200);
   @OriginalMember(
      owner = "client!eka",
      name = "h",
      descriptor = "I"
   )
   public static int field7036;
   @OriginalMember(
      owner = "client!eka",
      name = "f",
      descriptor = "I"
   )
   public static int field7037;
   @OriginalMember(
      owner = "client!eka",
      name = "k",
      descriptor = "I"
   )
   public static int field7040;
   @OriginalMember(
      owner = "client!eka",
      name = "g",
      descriptor = "I"
   )
   public static int field7041;
   @OriginalMember(
      owner = "client!eka",
      name = "i",
      descriptor = "I"
   )
   public static int field7042;
   @OriginalMember(
      owner = "client!eka",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field7039;

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public final void method98(int arg0) {
      try {
         ++field7042;
         if (arg0 != 0) {
            this.method101(96);
         }

         if (super.field680 != 1 && super.field680 != 0) {
            super.field680 = this.method101(-119);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7043[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 18
   )
   public class493(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "(I)I",
      line = 23
   )
   public final int method101(int arg0) {
      try {
         ++field7041;
         if (arg0 >= -116) {
            field7039 = null;
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7043[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 35
   )
   public class493(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(B)V",
      line = 39
   )
   public static void method3580(byte arg0) {
      try {
         field7039 = null;
         field7038 = null;
         if (arg0 > -72) {
            field7038 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7043[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(IB)I",
      line = 51
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            return 47;
         } else {
            ++field7037;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7043[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "(IB)V",
      line = 68
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 103 / ((47 - arg1) / 46);
         super.field680 = arg0;
         ++field7036;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7043[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "c",
      descriptor = "(I)I",
      line = 78
   )
   public final int method3581(int arg0) {
      try {
         int var2 = 39 % ((36 - arg0) / 41);
         ++field7040;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7043[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3582(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3583(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
