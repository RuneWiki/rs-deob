import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class534 extends class107 implements class53 {
   @OriginalMember(
      owner = "client!mq",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7801 = new String[]{method3962(method3961("_&z\"\u0014")), method3962(method3961("_&z$\u0014")), method3962(method3961("_&z'\u0014")), method3962(method3961("_&z*\u0014")), method3962(method3961("_&z+\u0014")), method3962(method3961("IyzMA")), method3962(method3961("\\\"8\u000f")), method3962(method3961("_&z%\u0014")), method3962(method3961("_&z(\u0014")), method3962(method3961("_&z)\u0014"))};
   @OriginalMember(
      owner = "client!mq",
      name = "G",
      descriptor = "Lqb;"
   )
   public static class234 field7792 = new class234(1);
   @OriginalMember(
      owner = "client!mq",
      name = "D",
      descriptor = "Lsd;"
   )
   public static class101 field7799 = new class101(25, 2);
   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "B"
   )
   private byte field7797;
   @OriginalMember(
      owner = "client!mq",
      name = "A",
      descriptor = "B"
   )
   public static byte field7800;
   @OriginalMember(
      owner = "client!mq",
      name = "t",
      descriptor = "I"
   )
   public static int field7788;
   @OriginalMember(
      owner = "client!mq",
      name = "F",
      descriptor = "I"
   )
   public static int field7789;
   @OriginalMember(
      owner = "client!mq",
      name = "C",
      descriptor = "I"
   )
   public static int field7790;
   @OriginalMember(
      owner = "client!mq",
      name = "E",
      descriptor = "I"
   )
   public static int field7791;
   @OriginalMember(
      owner = "client!mq",
      name = "x",
      descriptor = "I"
   )
   public static int field7793;
   @OriginalMember(
      owner = "client!mq",
      name = "w",
      descriptor = "I"
   )
   public static int field7794;
   @OriginalMember(
      owner = "client!mq",
      name = "v",
      descriptor = "I"
   )
   public static int field7798;
   @OriginalMember(
      owner = "client!mq",
      name = "u",
      descriptor = "Leaa;"
   )
   public static class526 field7795;
   @OriginalMember(
      owner = "client!mq",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field7796;

   @OriginalMember(
      owner = "client!mq",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method927(int arg0) {
      try {
         if (arg0 != 34962) {
            field7796 = null;
         }

         ++field7789;
         return super.method927(34962);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7801[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(B)Z",
      line = 15
   )
   public final boolean method422(byte arg0) {
      try {
         if (arg0 != 98) {
            this.method422((byte)11);
         }

         ++field7794;
         return super.method921(super.field1304.field5826, 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7801[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "<init>",
      descriptor = "(Leh;Z)V",
      line = 29
   )
   public class534(class379 arg0, boolean arg1) {
      super(arg0, 34962, arg1);
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;",
      line = 43
   )
   public final Buffer method421(byte arg0, boolean arg1) {
      try {
         if (arg0 > -86) {
            this.method421((byte)23, true);
         }

         ++field7788;
         return super.method924(arg1, super.field1304.field5826, -126);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7801[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(Z)V",
      line = 55
   )
   public static void method3959(boolean arg0) {
      try {
         if (arg0) {
            method3959(true);
         }

         field7799 = null;
         field7796 = null;
         field7792 = null;
         field7795 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7801[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(IBI)Z",
      line = 68
   )
   public final boolean method424(int arg0, byte arg1, int arg2) {
      try {
         this.field7797 = (byte)arg2;
         ++field7793;
         super.method923((byte)77, arg0);
         int var4 = -45 / ((arg1 - 61) / 32);
         return true;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7801[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;II)Z",
      line = 85
   )
   public final boolean method420(int arg0, Source arg1, int arg2, int arg3) {
      try {
         this.field7797 = (byte)arg3;
         ++field7798;
         super.method928(0, arg1, arg0);
         if (arg2 != 7491) {
            field7799 = null;
         }

         return true;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7801[7] + arg0 + ',' + (arg1 != null ? field7801[5] : field7801[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(I)V",
      line = 100
   )
   public final void method423(int arg0) {
      try {
         super.method423(arg0);
         if (arg0 != -15607) {
            this.method927(-101);
         }

         ++field7791;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7801[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "c",
      descriptor = "(I)I",
      line = 113
   )
   public final int method3960(int arg0) {
      try {
         int var2 = -96 % ((arg0 - -27) / 32);
         ++field7790;
         return this.field7797;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7801[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3961(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3962(char[] arg0) {
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
            var10005 = 87;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
