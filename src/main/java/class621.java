import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class621 extends class67 {
   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9041 = new String[]{method4568(method4567("-F\u001cL\u007fa")), method4568(method4567("-F\u001cL}a")), method4568(method4567("-F\u001cLra")), method4568(method4567("-F\u001cLsa")), method4568(method4567("-F\u001cLxa")), method4568(method4567("-F\u001cLya")), method4568(method4567("-F\u001cL{a"))};
   @OriginalMember(
      owner = "client!daa",
      name = "o",
      descriptor = "Ltm;"
   )
   public static class406 field9033 = new class406(method4568(method4567("\u001en-")), 2);
   @OriginalMember(
      owner = "client!daa",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field9037 = false;
   @OriginalMember(
      owner = "client!daa",
      name = "s",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9038 = new String[]{method4568(method4567("\u0003F\u0013")), method4568(method4567("\u000fB\u001f")), method4568(method4567("\u0004F\u000f")), method4568(method4567("\bW\u000f")), method4568(method4567("\u0004F\u0004")), method4568(method4567("\u0003R\u0013")), method4568(method4567("\u0003R\u0011")), method4568(method4567("\bR\u001a")), method4568(method4567("\u001aB\r")), method4568(method4567("\u0006D\t")), method4568(method4567("\u0007H\u000b")), method4568(method4567("\rB\u001e"))};
   @OriginalMember(
      owner = "client!daa",
      name = "l",
      descriptor = "I"
   )
   public static int field9031;
   @OriginalMember(
      owner = "client!daa",
      name = "m",
      descriptor = "I"
   )
   public static int field9032;
   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "I"
   )
   public static int field9034;
   @OriginalMember(
      owner = "client!daa",
      name = "n",
      descriptor = "I"
   )
   public static int field9035;
   @OriginalMember(
      owner = "client!daa",
      name = "p",
      descriptor = "I"
   )
   public static int field9036;
   @OriginalMember(
      owner = "client!daa",
      name = "r",
      descriptor = "I"
   )
   public static int field9039;
   @OriginalMember(
      owner = "client!daa",
      name = "q",
      descriptor = "I"
   )
   public static int field9040;

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field9040;
         if (!arg1) {
            this.method161(5, 23);
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9041[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (super.field881.method298(arg0 + 165)) {
            super.field877 = 0;
         }

         if (arg0 != -69) {
            this.method162(5);
         }

         ++field9035;
         if (super.field877 < 0 && super.field877 > 2) {
            super.field877 = this.method162(arg0 ^ -69);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9041[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4564(int arg0) {
      try {
         ++field9031;
         if (arg0 != 3343) {
            field9038 = null;
         }

         return !super.field881.method298(96);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9041[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4565(boolean arg0) {
      try {
         field9038 = null;
         field9033 = null;
         if (arg0) {
            method4565(false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9041[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4566(int arg0) {
      try {
         if (arg0 != 480102311) {
            this.method162(-5);
         }

         ++field9034;
         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9041[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field9039;
         return arg0 != 0 ? 93 : 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9041[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class621(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field9032;
         if (super.field881.method298(96)) {
            return 3;
         } else if (arg0 != 0 && super.field881.field529.method1918(480102311) != 1) {
            return arg1 > -74 ? -71 : 2;
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9041[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class621(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4567(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4568(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
