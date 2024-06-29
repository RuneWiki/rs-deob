import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class311 {
   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "I"
   )
   public int field4824;
   @OriginalMember(
      owner = "client!tv",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field4827;
   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4829 = new String[]{method2596(method2595("\n\u000bU2\u001c")), method2596(method2595("\u001fP\u0017p")), method2596(method2595("\u0005SU]I")), method2596(method2595("\u0005SUh\u000e\"Q\tu\u000f\u0016\r")), method2596(method2595("\u0005SU \b\u001fL\u000f\"I")), method2596(method2595("\u0005SU^I")), method2596(method2595("\u0005SU_I"))};
   @OriginalMember(
      owner = "client!tv",
      name = "f",
      descriptor = "[Lnka;"
   )
   public static class740[] field4826 = new class740[37];
   @OriginalMember(
      owner = "client!tv",
      name = "d",
      descriptor = "Lhka;"
   )
   public static class377 field4825 = new class377(1, 7);
   @OriginalMember(
      owner = "client!tv",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field4828 = new class498(122, 8);
   @OriginalMember(
      owner = "client!tv",
      name = "g",
      descriptor = "I"
   )
   public static int field4821;
   @OriginalMember(
      owner = "client!tv",
      name = "e",
      descriptor = "I"
   )
   public static int field4822;
   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "I"
   )
   public static int field4823;

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(II)V",
      line = 3
   )
   public static final void method2592(int arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         label48: {
            class230.field3525 = -1;
            if (arg0 == 37) {
               class60.field748 = 3.0F;
               if (!var2) {
                  break label48;
               }
            }

            if (arg0 == 50) {
               class60.field748 = 4.0F;
               if (!var2) {
                  break label48;
               }
            }

            if (arg0 == 75) {
               class60.field748 = 6.0F;
               if (!var2) {
                  break label48;
               }
            }

            if (~arg0 == -101) {
               class60.field748 = 8.0F;
               if (!var2) {
                  break label48;
               }
            }

            if (~arg0 == -201) {
               class60.field748 = 16.0F;
            }
         }

         ++field4823;
         int var3 = 61 / ((18 - arg1) / 48);
         class230.field3525 = -1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4829[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(ILmq;III)V",
      line = 34
   )
   public static final void method2593(int arg0, class577 arg1, int arg2, int arg3, int arg4) {
      try {
         arg1.field8531.method2849(arg2, (byte)-34);
         if (arg4 != 8) {
            method2593(-111, (class577)null, -23, -60, 38);
         }

         ++field4821;
         arg1.field8531.method2853(false, arg0);
         arg1.field8531.method2853(false, arg3);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4829[2] + arg0 + ',' + (arg1 != null ? field4829[0] : field4829[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(I)V",
      line = 48
   )
   public static void method2594(int arg0) {
      try {
         field4826 = null;
         field4828 = null;
         if (arg0 != -31448) {
            method2594(56);
         }

         field4825 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4829[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 62
   )
   public final String toString() {
      try {
         ++field4822;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4829[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      line = 85
   )
   public class311(String arg0, String arg1, int arg2) {
      try {
         this.field4824 = arg2;
         this.field4827 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4829[4] + (arg0 != null ? field4829[0] : field4829[1]) + ',' + (arg1 != null ? field4829[0] : field4829[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2595(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2596(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
