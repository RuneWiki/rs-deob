import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public abstract class class373 {
   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5550 = new String[]{method2923(method2922("\u0016\fX\u0018s\\")), method2923(method2922("\u0016Z\u000biY\u0001\u0007U")), method2923(method2922("\u0004Z\u000biY\u0001\u0007U")), method2923(method2922("\u001a\u001eUZ")), method2923(method2922("\u0004Z\biY\u0001\u0007U")), method2923(method2922("\u000fE\u0017\u0018B")), method2923(method2922("\u0016\fX\u0018q\\")), method2923(method2922("\u0016\fX\u0018o\\")), method2923(method2922("\u0016\fX\u0018p\\")), method2923(method2922("\u0016\fX\u0018r\\"))};
   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "I"
   )
   public static int field5543;
   @OriginalMember(
      owner = "client!bga",
      name = "g",
      descriptor = "I"
   )
   public static int field5545;
   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "I"
   )
   public static int field5546;
   @OriginalMember(
      owner = "client!bga",
      name = "f",
      descriptor = "I"
   )
   public static int field5548;
   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "I"
   )
   public static int field5549;
   @OriginalMember(
      owner = "client!bga",
      name = "e",
      descriptor = "Ldea;"
   )
   public static class257 field5547;
   @OriginalMember(
      owner = "client!bga",
      name = "d",
      descriptor = "[Laq;"
   )
   public static class168[] field5544;

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(II)Z",
      line = 9
   )
   public static final boolean method2915(int arg0, int arg1) {
      try {
         if (arg1 != 25700) {
            field5548 = -12;
         }

         ++field5549;
         return ~arg0 == -4 || ~arg0 == -5;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5550[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(ILhw;)V",
      line = 22
   )
   public static final void method2917(int arg0, class141 arg1) {
      try {
         class550.field7946 = arg1.method1329(-1, field5550[4]);
         ++field5545;
         if (arg0 < 56) {
            method2918((byte)-67);
         }

         class422.field6146 = arg1.method1329(-1, field5550[2]);
         class247.field3558 = arg1.method1329(-1, field5550[1]);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5550[0] + arg0 + ',' + (arg1 != null ? field5550[5] : field5550[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(B)V",
      line = 35
   )
   public static final void method2918(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(BLhw;I)Ldr;",
      line = 58
   )
   public static final class749 method2919(byte arg0, class141 arg1, int arg2) {
      try {
         ++field5543;
         byte[] var3 = arg1.method1331((byte)-98, arg2);
         if (var3 == null) {
            return null;
         } else {
            return arg0 > -34 ? null : new class749(var3);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5550[9] + arg0 + ',' + (arg1 != null ? field5550[5] : field5550[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "(B)V",
      line = 80
   )
   public static void method2921(byte arg0) {
      try {
         field5547 = null;
         field5544 = null;
         if (arg0 <= 44) {
            field5547 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5550[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IB)Z"
   )
   public abstract boolean method2913(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(Z)Lgg;"
   )
   public abstract class184 method2914(boolean arg0);

   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "(Z)V"
   )
   public abstract void method2916(boolean arg0);

   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "(Z)V"
   )
   public abstract void method2920(boolean arg0);

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2922(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2923(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
