import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class206 extends class515 {
   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2930 = new String[]{method1781(method1780("S\t|\u001c\u0002")), method1781(method1780("S\t|\u0012\u0002")), method1781(method1780("S\t|\u001b\u0002")), method1781(method1780("T\u0018>6")), method1781(method1780("AC|tW")), method1781(method1780("S\t|\u001f\u0002")), method1781(method1780("S\t|\u0018\u0002")), method1781(method1780("S\t|\u0013\u0002"))};
   @OriginalMember(
      owner = "client!id",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field2927 = false;
   @OriginalMember(
      owner = "client!id",
      name = "j",
      descriptor = "I"
   )
   public static int field2923;
   @OriginalMember(
      owner = "client!id",
      name = "f",
      descriptor = "I"
   )
   public static int field2924;
   @OriginalMember(
      owner = "client!id",
      name = "g",
      descriptor = "I"
   )
   public static int field2925;
   @OriginalMember(
      owner = "client!id",
      name = "k",
      descriptor = "I"
   )
   public static int field2926;
   @OriginalMember(
      owner = "client!id",
      name = "i",
      descriptor = "I"
   )
   public static int field2928;
   @OriginalMember(
      owner = "client!id",
      name = "l",
      descriptor = "I"
   )
   public static int field2929;

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         ++field2926;
         super.field7307.method4906(-2, arg1);
         super.field7307.method4947(false, arg2);
         int var4 = -91 % ((-44 - arg0) / 41);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2930[2] + arg0 + ',' + (arg1 != null ? field2930[4] : field2930[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      try {
         ++field2928;
         int var4 = -84 % ((arg1 - -57) / 60);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2930[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         ++field2929;
         super.field7307.method4932((byte)-128, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2930[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      try {
         super.field7307.method4932((byte)-56, true);
         if (arg1 != 3) {
            this.method132(-121, false);
         }

         ++field2925;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2930[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         ++field2923;
         return arg0 != 19455 ? true : true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2930[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         ++field2924;
         if (arg0 != -15) {
            this.method133(true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2930[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class206(class678 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1780(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1781(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
