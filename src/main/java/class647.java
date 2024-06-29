import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public class class647 {
   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9459 = new String[]{method4720(method4719("\u0016\u0015\u0019\u0019xS")), method4720(method4719("\u0016\u0015\u0019\u0019yS")), method4720(method4719("\u0015\u000b\u0014[")), method4720(method4719("\u0016\u0015\u0019\u0019{S")), method4720(method4719("\u0000PV\u0019G"))};
   @OriginalMember(
      owner = "client!mka",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field9457 = new int[1000];
   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "Lns;"
   )
   public static class427 field9458 = new class427();
   @OriginalMember(
      owner = "client!mka",
      name = "c",
      descriptor = "I"
   )
   public static int field9455;
   @OriginalMember(
      owner = "client!mka",
      name = "d",
      descriptor = "I"
   )
   public static int field9456;

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method4716(int arg0) {
      try {
         class80 var1 = class108.field1346;
         synchronized(class108.field1346) {
            class108.field1346.method715(true);
         }

         ++field9455;
         class80 var2 = class551.field7898;
         synchronized(class551.field7898) {
            if (arg0 < 32) {
               field9457 = null;
            }

            class551.field7898.method715(true);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9459[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V",
      line = 21
   )
   public static final void method4717(int arg0, String arg1, String arg2, boolean arg3) {
      try {
         class686.field10122 = arg0;
         ++field9456;
         class136.field1737 = class430.field6150;
         class235.field3273 = 2;
         class506.method3675(arg3, false, arg1, arg2, 0);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9459[3] + arg0 + ',' + (arg1 != null ? field9459[4] : field9459[2]) + ',' + (arg2 != null ? field9459[4] : field9459[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(Z)V",
      line = 36
   )
   public static void method4718(boolean arg0) {
      try {
         field9457 = null;
         if (!arg0) {
            method4717(-101, (String)null, (String)null, true);
         }

         field9458 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9459[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4719(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4720(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
