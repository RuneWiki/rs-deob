import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class247 {
   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3122 = new String[]{method1968(method1967("O#\u0005&\u001a")), method1968(method1967("O#\u0005%\u001a"))};
   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "I"
   )
   public static int field3120;
   @OriginalMember(
      owner = "client!mg",
      name = "b",
      descriptor = "I"
   )
   public static int field3121;

   @OriginalMember(
      owner = "client!mg",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1965(int arg0) {
      try {
         if (arg0 < -22) {
            ++field3121;
            if (class337.field4619 != null) {
               class337.field4619.method3649(false);
               class337.field4619 = null;
               class693.field10171 = null;
            }
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3122[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1966(int arg0) {
      boolean var1 = client.field1481;

      try {
         label49: {
            ++field3120;
            int var2 = class304.field4255;
            int[] var3 = class710.field10421;
            int var4 = 0;
            if (arg0 != -6913) {
               method1966(-102);
               if (!var1 && var4 >= var2) {
                  break label49;
               }
            } else if (var4 >= var2) {
               break label49;
            }

            do {
               class783 var5 = class59.field771[var3[var4]];
               if (var5 != null && var5.field190 > 0) {
                  --var5.field190;
                  if (~var5.field190 == -1) {
                     var5.field113 = null;
                  }
               }

               ++var4;
            } while(var4 < var2);
         }

         int var6 = 0;
         if (var1 || var6 < class737.field10798) {
            do {
               long var7 = (long)class277.field3534[var6];
               class411 var9 = (class411)class35.field493.method1818(-1, var7);
               if (var9 != null) {
                  class81 var10 = var9.field5654;
                  if (var10.field190 > 0) {
                     --var10.field190;
                     if (var10.field190 == 0) {
                        var10.field113 = null;
                     }
                  }
               }

               ++var6;
            } while(var6 < class737.field10798);

         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field3122[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1967(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1968(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
