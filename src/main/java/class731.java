import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class731 extends class465 {
   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10854 = new String[]{method5320(method5319("OjL{\u0006\u0010")), method5320(method5319("OjL{\u0005\u0010")), method5320(method5319("OjL{\u0003\u0010")), method5320(method5319("OjL{\u0000\u0010")), method5320(method5319("OjL{\u0002\u0010")), method5320(method5319("OjL{\u0001\u0010")), method5320(method5319("OjL{\u0004\u0010"))};
   @OriginalMember(
      owner = "client!waa",
      name = "k",
      descriptor = "Lhn;"
   )
   public static class751 field10848 = new class751(0, -1);
   @OriginalMember(
      owner = "client!waa",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field10853 = false;
   @OriginalMember(
      owner = "client!waa",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field10849 = new int[]{1, 4, 1, 2};
   @OriginalMember(
      owner = "client!waa",
      name = "f",
      descriptor = "I"
   )
   public static int field10843;
   @OriginalMember(
      owner = "client!waa",
      name = "o",
      descriptor = "I"
   )
   public static int field10844;
   @OriginalMember(
      owner = "client!waa",
      name = "h",
      descriptor = "I"
   )
   public static int field10845;
   @OriginalMember(
      owner = "client!waa",
      name = "g",
      descriptor = "I"
   )
   public static int field10846;
   @OriginalMember(
      owner = "client!waa",
      name = "j",
      descriptor = "I"
   )
   public static int field10847;
   @OriginalMember(
      owner = "client!waa",
      name = "l",
      descriptor = "I"
   )
   public static int field10850;
   @OriginalMember(
      owner = "client!waa",
      name = "i",
      descriptor = "I"
   )
   public static int field10852;
   @OriginalMember(
      owner = "client!waa",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field10851;

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            return 21;
         } else {
            ++field10845;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10854[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method5316(boolean arg0) {
      try {
         ++field10852;
         if (arg0) {
            field10848 = null;
         }

         return !super.field6980.method4680(-17721);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10854[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class731(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (super.field6980.method4680(-17721)) {
            super.field6984 = 0;
         }

         if (arg0) {
            field10853 = true;
         }

         ++field10846;
         if (super.field6984 != 1 && super.field6984 != 0) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10854[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5317(int arg0) {
      try {
         if (arg0 < 81) {
            field10851 = null;
         }

         ++field10850;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10854[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 96 % ((arg1 - -51) / 60);
         ++field10847;
         return super.field6980.method4680(-17721) ? 3 : 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10854[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 == -14812) {
            super.field6984 = arg1;
            ++field10843;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10854[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class731(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5318(byte arg0) {
      try {
         field10848 = null;
         if (arg0 <= 85) {
            field10844 = -100;
         }

         field10851 = null;
         field10849 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10854[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5319(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5320(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
