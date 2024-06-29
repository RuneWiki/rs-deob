import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class725 {
   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10460 = new String[]{method5250(method5249("cr\u00013w")), method5250(method5249("cr\u00011w")), method5250(method5249("cr\u00012w"))};
   @OriginalMember(
      owner = "client!dq",
      name = "c",
      descriptor = "I"
   )
   public static int field10457 = 0;
   @OriginalMember(
      owner = "client!dq",
      name = "e",
      descriptor = "I"
   )
   public static int field10455;
   @OriginalMember(
      owner = "client!dq",
      name = "d",
      descriptor = "I"
   )
   public static int field10456;
   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "I"
   )
   public static int field10458;
   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "I"
   )
   public static int field10459;

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5246(int arg0, int arg1) {
      try {
         class769.field11205.method1579(arg0 ^ -104, arg1);
         ++field10455;
         if (arg0 != -1) {
            method5247((byte)15, 14, 59);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10460[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method5247(byte arg0, int arg1, int arg2) {
      try {
         ++field10456;
         if (class28.method199(0, arg2)) {
            class293.method2278(arg1, 13297, class253.field3608[arg2]);
            if (arg0 != 3) {
               field10458 = -73;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10460[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5248(boolean arg0) {
      try {
         class733.field10534 = 0;
         class344.field4901 = -1;
         if (arg0) {
            method5248(false);
         }

         class639.field9311 = -1;
         ++field10459;
         class770.field11213 = -1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10460[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5249(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5250(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
