import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class668 {
   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10061 = new String[]{method4864(method4863("C\u001e-\u001c\u0007")), method4864(method4863("C\u001e-\u001e\u0007")), method4864(method4863("C\u001e-\u001b\u0007")), method4864(method4863("JW-qR")), method4864(method4863("_\fo3")), method4864(method4863("C\u001e-\u001d\u0007"))};
   @OriginalMember(
      owner = "client!rg",
      name = "f",
      descriptor = "I"
   )
   public static int field10056 = -1;
   @OriginalMember(
      owner = "client!rg",
      name = "c",
      descriptor = "I"
   )
   public static int field10057 = 0;
   @OriginalMember(
      owner = "client!rg",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field10059 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "I"
   )
   public static int field10054;
   @OriginalMember(
      owner = "client!rg",
      name = "d",
      descriptor = "I"
   )
   public static int field10055;
   @OriginalMember(
      owner = "client!rg",
      name = "e",
      descriptor = "I"
   )
   public static int field10058;
   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "I"
   )
   public static int field10060;

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public static final void method4859(boolean arg0) {
      try {
         class748 var1 = class413.field6322;
         synchronized(class413.field6322) {
            class413.field6322.method5445(697465426);
         }

         ++field10054;
         if (arg0) {
            method4859(false);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10061[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(B)V",
      line = 21
   )
   public static void method4860(byte arg0) {
      try {
         if (arg0 > -7) {
            method4859(false);
         }

         field10059 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10061[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(ILln;)V",
      line = 32
   )
   public static final void method4861(int arg0, class397 arg1) {
      try {
         if (arg0 != 6) {
            field10057 = 51;
         }

         label42: {
            if (!(arg1 instanceof class155)) {
               if (!(arg1 instanceof class687)) {
                  break label42;
               }

               class687 var2 = (class687)arg1;
               class253.method1911(var2, (byte)123, ~class693.field10418.field9010 != ~var2.field9010);
               if (client.field4530 == 0) {
                  break label42;
               }
            }

            class155 var3 = (class155)arg1;
            if (var3.field1971 != null) {
               class519.method3824(125, class693.field10418.field9010 != var3.field9010, var3);
            }
         }

         ++field10058;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10061[2] + arg0 + ',' + (arg1 != null ? field10061[3] : field10061[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "(B)I",
      line = 60
   )
   public static final int method4862(byte arg0) {
      try {
         ++field10060;
         if (arg0 != 13) {
            field10059 = null;
         }

         return class4.field85 == 1 ? class379.field5808 : class73.field933;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10061[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4863(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4864(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
