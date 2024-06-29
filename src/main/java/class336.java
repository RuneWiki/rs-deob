import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class336 {
   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4987 = new String[]{method2694(method2693("\u0007qe\u000e#")), method2694(method2693("\u0012*'L")), method2694(method2693("\u0014(ebv"))};
   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "I"
   )
   public static int field4985 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "I"
   )
   public static int field4986;

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method2691(String arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field4986;
         if (arg0 != null) {
            if (arg1 != -32029) {
               field4985 = 4;
            }

            String var3 = class197.method1724(true, arg0);
            if (var3 != null) {
               int var4 = 0;
               if (var2 || class428.field6272 > var4) {
                  do {
                     String var5 = class201.field2879[var4];
                     String var6 = class197.method1724(true, var5);
                     if (class542.method4040(var3, (byte)-119, var6, var5, arg0)) {
                        --class428.field6272;
                        int var7 = var4;
                        if (var2) {
                           class201.field2879[var4] = class201.field2879[var4 - -1];
                           class428.field6276[var4] = class428.field6276[var4 + 1];
                           class129.field2080[var4] = class129.field2080[var4 + 1];
                           class346.field5091[var4] = class346.field5091[var4 - -1];
                           class739.field10551[var4] = class739.field10551[var4 + 1];
                           class60.field856[var4] = class60.field856[var4 + 1];
                           var7 = var4 + 1;
                        }

                        while(true) {
                           while(~var7 > ~class428.field6272) {
                              class201.field2879[var7] = class201.field2879[var7 - -1];
                              class428.field6276[var7] = class428.field6276[var7 + 1];
                              class129.field2080[var7] = class129.field2080[var7 + 1];
                              class346.field5091[var7] = class346.field5091[var7 - -1];
                              class739.field10551[var7] = class739.field10551[var7 + 1];
                              class60.field856[var7] = class60.field856[var7 + 1];
                              ++var7;
                           }

                           ++class669.field9394;
                           class709.field10182 = class742.field10569;
                           class242 var8 = class735.method5318(-125);
                           class381 var9 = class801.method5775(class794.field11548, arg1 ^ -32029, var8.field3718);
                           var9.field5570.method656((byte)30, class519.method3880(false, arg0));
                           var9.field5570.method658(arg0, -61);
                           var8.method2111(arg1 + 46053, var9);
                           if (!var2) {
                              return;
                           }

                           ++var7;
                        }
                     }

                     ++var4;
                  } while(class428.field6272 > var4);

               }
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field4987[2] + (arg0 != null ? field4987[0] : field4987[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(III)Lwaa;"
   )
   public static final class566 method2692(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      return var3 == null ? null : var3.field4679;
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2693(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2694(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
