import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class305 {
   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4054 = new String[]{method2298(method2297("P\u001b-\u0006")), method2298(method2297("E@oD\u0015")), method2298(method2297("T\b D+\u0016")), method2298(method2297("T\b D)\u0016")), method2298(method2297("T\b D*\u0016"))};
   @OriginalMember(
      owner = "client!jfa",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field4050 = false;
   @OriginalMember(
      owner = "client!jfa",
      name = "d",
      descriptor = "Ltv;"
   )
   public static class590 field4046 = new class590(260);
   @OriginalMember(
      owner = "client!jfa",
      name = "c",
      descriptor = "I"
   )
   public int field4044;
   @OriginalMember(
      owner = "client!jfa",
      name = "g",
      descriptor = "I"
   )
   public static int field4045;
   @OriginalMember(
      owner = "client!jfa",
      name = "e",
      descriptor = "I"
   )
   public int field4047;
   @OriginalMember(
      owner = "client!jfa",
      name = "b",
      descriptor = "I"
   )
   public static int field4048;
   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "I"
   )
   public int field4049;
   @OriginalMember(
      owner = "client!jfa",
      name = "i",
      descriptor = "Lwm;"
   )
   public static class594 field4053;
   @OriginalMember(
      owner = "client!jfa",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field4052;
   @OriginalMember(
      owner = "client!jfa",
      name = "h",
      descriptor = "[Lnk;"
   )
   public static class750[] field4051;

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   public final void method2294(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 1) {
            this.field4044 = -96;
         }

         while(true) {
            int var4 = arg0.method4288((byte)78);
            if (var4 != 0) {
               this.method2296(arg0, 1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field4048;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4054[2] + (arg0 != null ? field4054[1] : field4054[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2295(int arg0) {
      try {
         field4052 = null;
         field4046 = null;
         field4053 = null;
         if (arg0 == 260) {
            field4051 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4054[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method2296(class594 arg0, int arg1, int arg2) {
      try {
         if (arg1 == arg2) {
            this.field4049 = arg0.method4280(-19104);
            this.field4044 = arg0.method4288((byte)68);
            this.field4047 = arg0.method4288((byte)110);
         }

         ++field4045;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4054[3] + (arg0 != null ? field4054[1] : field4054[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2297(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2298(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
