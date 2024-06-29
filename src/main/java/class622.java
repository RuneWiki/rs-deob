import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class622 {
   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8895 = new String[]{method4581(method4580("1\u000e?K%")), method4581(method4580("1\u000e?M%")), method4581(method4580("1\u000e?J%")), method4581(method4580("1\u000e?H%"))};
   @OriginalMember(
      owner = "client!qd",
      name = "e",
      descriptor = "I"
   )
   public static int field8886 = 0;
   @OriginalMember(
      owner = "client!qd",
      name = "d",
      descriptor = "Lhha;"
   )
   public static class724 field8885 = new class724(14, 2);
   @OriginalMember(
      owner = "client!qd",
      name = "j",
      descriptor = "B"
   )
   public byte field8883;
   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "I"
   )
   public static int field8884;
   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "I"
   )
   public static int field8887;
   @OriginalMember(
      owner = "client!qd",
      name = "k",
      descriptor = "I"
   )
   public static int field8888;
   @OriginalMember(
      owner = "client!qd",
      name = "f",
      descriptor = "I"
   )
   public static int field8889;
   @OriginalMember(
      owner = "client!qd",
      name = "l",
      descriptor = "I"
   )
   public int field8890;
   @OriginalMember(
      owner = "client!qd",
      name = "i",
      descriptor = "I"
   )
   public static int field8892;
   @OriginalMember(
      owner = "client!qd",
      name = "h",
      descriptor = "I"
   )
   public static int field8893;
   @OriginalMember(
      owner = "client!qd",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public String field8891;
   @OriginalMember(
      owner = "client!qd",
      name = "c",
      descriptor = "[Lma;"
   )
   public static class148[] field8894;

   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4576(byte arg0) {
      try {
         if (arg0 > -24) {
            field8893 = -63;
         }

         ++field8884;
         if (class375.field5484 != null) {
            class375.field5484.method5672(1);
         }

         if (class486.field6943 != null) {
            class486.field6943.method5672(1);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8895[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method4577(int arg0, byte arg1, int arg2) {
      try {
         ++field8889;
         int var3 = 86 / ((-30 - arg1) / 38);
         class111 var4 = class796.method5734(14, (long)arg0, (byte)-128);
         var4.method1087(0);
         var4.field1740 = arg2;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8895[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4578(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4579(int arg0) {
      try {
         if (arg0 == 0) {
            field8885 = null;
            field8894 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8895[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4580(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4581(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
