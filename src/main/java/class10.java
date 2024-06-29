import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class10 extends class575 {
   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field174 = new String[]{method90(method89("xC\u0015d")), method90(method89("yAWK\u0003")), method90(method89("m\u0018W&V")), method90(method89("yAWL\u0003")), method90(method89("yAWJ\u0003")), method90(method89("yAWO\u0003")), method90(method89("yAWI\u0003")), method90(method89("yAWM\u0003")), method90(method89("yAWN\u0003"))};
   @OriginalMember(
      owner = "client!ow",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field173 = new int[25];
   @OriginalMember(
      owner = "client!ow",
      name = "t",
      descriptor = "I"
   )
   public static int field165;
   @OriginalMember(
      owner = "client!ow",
      name = "q",
      descriptor = "I"
   )
   public static int field166;
   @OriginalMember(
      owner = "client!ow",
      name = "r",
      descriptor = "I"
   )
   public static int field167;
   @OriginalMember(
      owner = "client!ow",
      name = "s",
      descriptor = "I"
   )
   public static int field168;
   @OriginalMember(
      owner = "client!ow",
      name = "n",
      descriptor = "I"
   )
   public static int field169;
   @OriginalMember(
      owner = "client!ow",
      name = "o",
      descriptor = "I"
   )
   public static int field170;
   @OriginalMember(
      owner = "client!ow",
      name = "m",
      descriptor = "I"
   )
   public static int field171;
   @OriginalMember(
      owner = "client!ow",
      name = "l",
      descriptor = "I"
   )
   public static int field172;

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         if (arg1 != 23) {
            method83(59);
         }

         ++field169;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field174[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method83(int arg0) {
      try {
         field173 = null;
         if (arg0 <= 14) {
            field173 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field174[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 < 61) {
            method83(-64);
         }

         ++field171;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field174[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      try {
         ++field172;
         if (arg0) {
            method83(-118);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field174[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         if (arg0 != 15385) {
            field165 = 89;
         }

         ++field168;
         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field174[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "<init>",
      descriptor = "(Ldaa;)V"
   )
   public class10(class226 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      try {
         ++field166;
         if (!arg1) {
            field173 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field174[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         if (!arg1) {
            field173 = null;
         }

         ++field167;
         super.field8129.method1943(0, arg2);
         super.field8129.method1966(arg0, -5);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field174[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field174[2] : field174[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method89(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method90(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
