import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class637 extends class465 {
   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9266 = new String[]{method4588(method4587("}Y}1\u00139")), method4588(method4587("}Y}1\u00169")), method4588(method4587("}Y}1\u00109")), method4588(method4587("}Y}1\u00129")), method4588(method4587("}Y}1\u00159")), method4588(method4587("}Y}1\u00179")), method4588(method4587("}Y}1\u00149"))};
   @OriginalMember(
      owner = "client!lea",
      name = "m",
      descriptor = "Lsd;"
   )
   public static class101 field9256 = new class101(22, -1);
   @OriginalMember(
      owner = "client!lea",
      name = "i",
      descriptor = "I"
   )
   public static int field9260 = -1;
   @OriginalMember(
      owner = "client!lea",
      name = "l",
      descriptor = "Lpia;"
   )
   public static class102 field9258 = new class102("", 13);
   @OriginalMember(
      owner = "client!lea",
      name = "h",
      descriptor = "I"
   )
   public static int field9257;
   @OriginalMember(
      owner = "client!lea",
      name = "n",
      descriptor = "I"
   )
   public static int field9259;
   @OriginalMember(
      owner = "client!lea",
      name = "k",
      descriptor = "I"
   )
   public static int field9261;
   @OriginalMember(
      owner = "client!lea",
      name = "o",
      descriptor = "I"
   )
   public static int field9262;
   @OriginalMember(
      owner = "client!lea",
      name = "g",
      descriptor = "I"
   )
   public static int field9263;
   @OriginalMember(
      owner = "client!lea",
      name = "j",
      descriptor = "I"
   )
   public static int field9264;
   @OriginalMember(
      owner = "client!lea",
      name = "f",
      descriptor = "I"
   )
   public static int field9265;

   @OriginalMember(
      owner = "client!lea",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4584(int arg0) {
      try {
         if (arg0 <= 81) {
            this.method70(-84, (byte)-30);
         }

         ++field9262;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9266[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            field9265 = 60;
         }

         ++field9263;
         if (super.field6984 != 1 && ~super.field6984 != -1) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9266[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         ++field9261;
         return arg0 != 16726277 ? 66 : 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9266[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field9259;
         int var3 = 55 / ((arg1 - -51) / 60);
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9266[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4585(int arg0) {
      try {
         if (arg0 != -11973) {
            field9258 = null;
         }

         field9258 = null;
         field9256 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9266[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field9257;
         if (arg0 != -14812) {
            field9256 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9266[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class637(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lea",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4586(int arg0) {
      try {
         ++field9264;
         class663.field9609.method437(-1);
         class627.field9106 = 1;
         int var1 = 26 % (arg0 / 35);
         class660.field9563 = null;
         class67.field837 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9266[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class637(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4587(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4588(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
