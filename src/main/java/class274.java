import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class274 extends class67 {
   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4396 = new String[]{method2327(method2326("6-C^\u007f")), method2327(method2326("6-C]\u007f")), method2327(method2326("6-CY\u007f")), method2327(method2326("6-C[\u007f")), method2327(method2326("6-CR\u007f")), method2327(method2326("6-C_\u007f")), method2327(method2326("6-CX\u007f"))};
   @OriginalMember(
      owner = "client!rl",
      name = "n",
      descriptor = "I"
   )
   public static int field4388;
   @OriginalMember(
      owner = "client!rl",
      name = "o",
      descriptor = "I"
   )
   public static int field4389;
   @OriginalMember(
      owner = "client!rl",
      name = "m",
      descriptor = "I"
   )
   public static int field4390;
   @OriginalMember(
      owner = "client!rl",
      name = "l",
      descriptor = "I"
   )
   public static int field4392;
   @OriginalMember(
      owner = "client!rl",
      name = "k",
      descriptor = "I"
   )
   public static int field4393;
   @OriginalMember(
      owner = "client!rl",
      name = "r",
      descriptor = "I"
   )
   public static int field4394;
   @OriginalMember(
      owner = "client!rl",
      name = "p",
      descriptor = "I"
   )
   public static int field4395;
   @OriginalMember(
      owner = "client!rl",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field4391;

   @OriginalMember(
      owner = "client!rl",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field4391 = true;
         }

         ++field4393;
         return 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4396[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "c",
      descriptor = "(I)I",
      line = 17
   )
   public final int method2323(int arg0) {
      try {
         if (arg0 != 480102311) {
            field4391 = false;
         }

         ++field4390;
         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4396[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 28
   )
   public class274(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(II)I",
      line = 31
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field4392;
         if (arg1 >= -74) {
            this.method158((byte)8);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4396[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(III)I",
      line = 42
   )
   public static final int method2324(int arg0, int arg1, int arg2) {
      try {
         ++field4389;
         if (arg2 != -2) {
            field4391 = true;
         }

         int var3 = 0;

         while(arg1 > 0) {
            var3 = 1 & arg0 | var3 << 1;
            --arg1;
            arg0 >>>= 1;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4396[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(IZ)V",
      line = 63
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         if (!arg1) {
            field4391 = false;
         }

         ++field4388;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4396[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(B)V",
      line = 75
   )
   public final void method158(byte arg0) {
      try {
         if (~super.field877 != -2 && ~super.field877 != -1) {
            super.field877 = this.method162(0);
         }

         if (arg0 == -69) {
            ++field4394;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4396[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(ZIZ)V",
      line = 88
   )
   public static final void method2325(boolean arg0, int arg1, boolean arg2) {
      try {
         ++field4395;
         if (arg0) {
            ++class79.field1053;
            class297.method2493((byte)-56);
         }

         if (arg1 == 1) {
            if (arg2) {
               ++class48.field628;
               class798.method5753(0);
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4396[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 114
   )
   public class274(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
