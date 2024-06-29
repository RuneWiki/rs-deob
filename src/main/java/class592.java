import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class592 extends class465 {
   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8745 = new String[]{method4355(method4354("_>\r)E")), method4355(method4354("_>\r.E")), method4355(method4354("_>\r(E")), method4355(method4354("_>\r+E")), method4355(method4354("_>\r/E")), method4355(method4354("_>\r,E"))};
   @OriginalMember(
      owner = "client!kj",
      name = "g",
      descriptor = "I"
   )
   public static int field8739;
   @OriginalMember(
      owner = "client!kj",
      name = "h",
      descriptor = "I"
   )
   public static int field8740;
   @OriginalMember(
      owner = "client!kj",
      name = "i",
      descriptor = "I"
   )
   public static int field8741;
   @OriginalMember(
      owner = "client!kj",
      name = "f",
      descriptor = "I"
   )
   public static int field8742;
   @OriginalMember(
      owner = "client!kj",
      name = "j",
      descriptor = "I"
   )
   public static int field8743;
   @OriginalMember(
      owner = "client!kj",
      name = "k",
      descriptor = "I"
   )
   public static int field8744;

   @OriginalMember(
      owner = "client!kj",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 3
   )
   public class592(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "(I)I",
      line = 6
   )
   public final int method4352(int arg0) {
      try {
         ++field8741;
         if (arg0 <= 81) {
            this.method69(false);
         }

         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8745[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(I)I",
      line = 19
   )
   public final int method78(int arg0) {
      try {
         ++field8743;
         if (arg0 != 16726277) {
            return 95;
         } else {
            return super.field6980.method4673((byte)-76).method3314(true) ? 3 : 2;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8745[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(Z)V",
      line = 32
   )
   public final void method69(boolean arg0) {
      try {
         ++field8739;
         if (~super.field6984 > -2 || super.field6984 > 3) {
            super.field6984 = this.method78(16726277);
         }

         if (!arg0) {
            ;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8745[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(IB)I",
      line = 46
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field8744;
         int var3 = 33 % ((-51 - arg1) / 60);
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8745[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 56
   )
   public static final void method4353(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kj",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 175
   )
   public class592(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "(II)V",
      line = 182
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         ++field8742;
         if (arg0 != -14812) {
            method4353(23, -18, 7, 83, 65, 6);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8745[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4354(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4355(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
