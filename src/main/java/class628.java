import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class628 extends class55 {
   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9230 = new String[]{method4559(method4558("q\u0013?\u000b#")), method4559(method4558("q\u0013?\b#")), method4559(method4558("q\u0013?\u000f#")), method4559(method4558("q\u0013?\u0006#")), method4559(method4558("q\u0013?\n#")), method4559(method4558("q\u0013?\r#")), method4559(method4558("q\u0013?\t#")), method4559(method4558("q\u0013?\f#"))};
   @OriginalMember(
      owner = "client!re",
      name = "g",
      descriptor = "Lje;"
   )
   public static class425 field9222 = new class425();
   @OriginalMember(
      owner = "client!re",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field9228 = new int[1];
   @OriginalMember(
      owner = "client!re",
      name = "l",
      descriptor = "Leg;"
   )
   public static class118 field9227 = new class118(9, -1);
   @OriginalMember(
      owner = "client!re",
      name = "m",
      descriptor = "[Luv;"
   )
   public static class386[] field9229 = new class386[75];
   @OriginalMember(
      owner = "client!re",
      name = "e",
      descriptor = "I"
   )
   public static int field9218;
   @OriginalMember(
      owner = "client!re",
      name = "f",
      descriptor = "I"
   )
   public static int field9219;
   @OriginalMember(
      owner = "client!re",
      name = "k",
      descriptor = "I"
   )
   public static int field9220;
   @OriginalMember(
      owner = "client!re",
      name = "i",
      descriptor = "I"
   )
   public static int field9221;
   @OriginalMember(
      owner = "client!re",
      name = "n",
      descriptor = "I"
   )
   public static int field9224;
   @OriginalMember(
      owner = "client!re",
      name = "p",
      descriptor = "I"
   )
   public static int field9225;
   @OriginalMember(
      owner = "client!re",
      name = "j",
      descriptor = "I"
   )
   public static int field9226;
   @OriginalMember(
      owner = "client!re",
      name = "o",
      descriptor = "Lew;"
   )
   public static class521 field9223;

   @OriginalMember(
      owner = "client!re",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 3
   )
   public class628(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(BII)I",
      line = 7
   )
   public static final int method4554(byte arg0, int arg1, int arg2) {
      try {
         ++field9226;
         arg2 = (arg1 & 127) * arg2 >> 7;
         if (arg0 != 99) {
            method4557((byte)52);
         }

         if (arg2 < 2) {
            arg2 = 2;
            if (!client.field4360) {
               return (arg1 & 65408) + arg2;
            }
         }

         if (arg2 > 126) {
            arg2 = 126;
         }

         return (arg1 & 65408) + arg2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9230[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "c",
      descriptor = "(I)I",
      line = 31
   )
   public final int method4555(int arg0) {
      try {
         int var2 = -112 % ((36 - arg0) / 41);
         ++field9219;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9230[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "(B)Z",
      line = 41
   )
   public final boolean method4556(byte arg0) {
      try {
         ++field9225;
         if (arg0 != 120) {
            field9228 = null;
         }

         return !super.field683.method3300((byte)-56);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9230[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(IB)I",
      line = 56
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method4556((byte)-12);
         }

         ++field9218;
         return super.field683.method3300((byte)-56) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9230[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(B)V",
      line = 71
   )
   public static void method4557(byte arg0) {
      try {
         field9228 = null;
         field9227 = null;
         field9229 = null;
         field9222 = null;
         if (arg0 >= -69) {
            method4554((byte)110, 73, 65);
         }

         field9223 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9230[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "(IB)V",
      line = 86
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field9221;
         int var3 = 24 / ((47 - arg1) / 46);
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9230[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(I)V",
      line = 96
   )
   public final void method98(int arg0) {
      try {
         if (super.field683.method3300((byte)-56)) {
            super.field680 = 0;
         }

         if (arg0 == 0) {
            ++field9220;
            if (~super.field680 != -2 && super.field680 != 0) {
               super.field680 = this.method101(-123);
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9230[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "(I)I",
      line = 115
   )
   public final int method101(int arg0) {
      try {
         ++field9224;
         if (arg0 >= -116) {
            this.method101(-75);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9230[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 131
   )
   public class628(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4558(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4559(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
