import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class231 {
   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2944 = new String[]{method1746(method1745("G9PQ|\u001d")), method1746(method1745("G9PQ\u007f\u001d")), method1746(method1745("G9PQ}\u001d")), method1746(method1745("G9PQz\u001d"))};
   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "I"
   )
   public static int field2937 = 0;
   @OriginalMember(
      owner = "client!rha",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field2938 = false;
   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "[J"
   )
   public static long[] field2939 = new long[10];
   @OriginalMember(
      owner = "client!rha",
      name = "c",
      descriptor = "I"
   )
   public static int field2940;
   @OriginalMember(
      owner = "client!rha",
      name = "d",
      descriptor = "I"
   )
   public static int field2941;
   @OriginalMember(
      owner = "client!rha",
      name = "g",
      descriptor = "I"
   )
   public static int field2943;
   @OriginalMember(
      owner = "client!rha",
      name = "f",
      descriptor = "Lti;"
   )
   public static class464 field2942;

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(IIIZI)V",
      line = 4
   )
   public static final void method1741(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         label16: {
            if (class261.field3566.field9464.method4225(115) != 0) {
               class770.field11295 = class261.field3566.field9464.method4225(99);
               class428.method3261(true, -126, 0);
               if (client.field4530 == 0) {
                  break label16;
               }
            }

            class372.method2891(0, false);
         }

         ++field2941;
         class237.field2999 = arg1;
         class259.field3505 = arg3;
         int var5 = -94 % ((2 - arg0) / 39);
         class560.field8374 = arg2;
         class329.method2486(arg4);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2944[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(B)V",
      line = 25
   )
   public static void method1742(byte arg0) {
      try {
         field2942 = null;
         field2939 = null;
         if (arg0 < 112) {
            method1741(-92, -47, 47, false, -100);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2944[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "(B)V",
      line = 39
   )
   public static final void method1743(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(BII)V",
      line = 135
   )
   public static final void method1744(byte arg0, int arg1, int arg2) {
      try {
         ++field2940;
         class403 var3 = class453.method3410((long)arg2, true, 7);
         var3.method3093(22144);
         int var4 = 79 / ((arg0 - 18) / 52);
         var3.field6185 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2944[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1745(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1746(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
