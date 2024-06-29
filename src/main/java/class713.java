import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class713 extends class555 {
   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10445 = new String[]{method5192(method5191("`bvWc")), method5192(method5191("`bvRc")), method5192(method5191("`bvQc")), method5192(method5191("`bvVc")), method5192(method5191("`bvUc")), method5192(method5191("`bvPc"))};
   @OriginalMember(
      owner = "client!ar",
      name = "i",
      descriptor = "Lnw;"
   )
   public static class616 field10441 = new class616(70, -1);
   @OriginalMember(
      owner = "client!ar",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field10442 = new int[3];
   @OriginalMember(
      owner = "client!ar",
      name = "g",
      descriptor = "I"
   )
   public static int field10438;
   @OriginalMember(
      owner = "client!ar",
      name = "h",
      descriptor = "I"
   )
   public static int field10439;
   @OriginalMember(
      owner = "client!ar",
      name = "j",
      descriptor = "I"
   )
   public static int field10440;
   @OriginalMember(
      owner = "client!ar",
      name = "k",
      descriptor = "I"
   )
   public static int field10443;
   @OriginalMember(
      owner = "client!ar",
      name = "f",
      descriptor = "I"
   )
   public static int field10444;

   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (~super.field7632 > -1 && ~super.field7632 < -128) {
            super.field7632 = this.method635(126);
         }

         ++field10440;
         if (arg0 != -13712) {
            this.method637(17);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10445[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = -74 % ((arg1 - 12) / 47);
         ++field10438;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10445[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            field10442 = null;
         }

         ++field10439;
         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10445[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5189(int arg0) {
      try {
         if (arg0 != 5746) {
            method5189(118);
         }

         field10441 = null;
         field10442 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10445[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field10444;
         if (arg0 < 124) {
            this.method635(-16);
         }

         return 127;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10445[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class713(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5190(byte arg0) {
      try {
         ++field10443;
         if (arg0 > -61) {
            this.method638(-27, (byte)13);
         }

         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10445[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class713(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5191(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5192(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
