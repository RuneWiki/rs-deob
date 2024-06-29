import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class13 {
   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field154 = new String[]{method80(method79("uD\rK\u001c9")), method80(method79("j\u0001BK'")), method80(method79("\u007fZ\u0000\t")), method80(method79("uD\rK\u001f9")), method80(method79("uD\rK\u001e9")), method80(method79("uD\rK\u00189")), method80(method79("uD\rK\u00199")), method80(method79("uD\rK\u001b9"))};
   @OriginalMember(
      owner = "client!dka",
      name = "i",
      descriptor = "Lwv;"
   )
   public static class37 field145 = new class37(512);
   @OriginalMember(
      owner = "client!dka",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field153 = new int[1];
   @OriginalMember(
      owner = "client!dka",
      name = "b",
      descriptor = "I"
   )
   public static int field142;
   @OriginalMember(
      owner = "client!dka",
      name = "h",
      descriptor = "I"
   )
   public static int field143;
   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "I"
   )
   public static int field144;
   @OriginalMember(
      owner = "client!dka",
      name = "l",
      descriptor = "I"
   )
   public int field146;
   @OriginalMember(
      owner = "client!dka",
      name = "g",
      descriptor = "I"
   )
   public int field147;
   @OriginalMember(
      owner = "client!dka",
      name = "e",
      descriptor = "I"
   )
   private int field148;
   @OriginalMember(
      owner = "client!dka",
      name = "d",
      descriptor = "I"
   )
   public static int field151;
   @OriginalMember(
      owner = "client!dka",
      name = "f",
      descriptor = "I"
   )
   public static int field152;
   @OriginalMember(
      owner = "client!dka",
      name = "k",
      descriptor = "Lqha;"
   )
   public class112 field150;
   @OriginalMember(
      owner = "client!dka",
      name = "c",
      descriptor = "Lbu;"
   )
   public static class21 field149;

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IILwf;)V",
      line = 4
   )
   private final void method73(int arg0, int arg1, class147 arg2) {
      try {
         label30: {
            ++field143;
            if (arg0 == 1) {
               this.field148 = arg2.method1211(-26166);
               if (!client.field4360) {
                  break label30;
               }
            }

            if (arg0 == 2) {
               this.field147 = arg2.method1143(-15465);
               this.field146 = arg2.method1143(-15465);
            }
         }

         if (arg1 != 2) {
            field145 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field154[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field154[1] : field154[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "b",
      descriptor = "(I)V",
      line = 32
   )
   public static void method74(int arg0) {
      try {
         field145 = null;
         field153 = null;
         field149 = null;
         if (arg0 != 512) {
            field145 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field154[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(III)Z",
      line = 46
   )
   public static final boolean method75(int arg0, int arg1, int arg2) {
      try {
         ++field151;
         return arg1 <= 84 ? true : class366.method2729(-121, arg0, arg2) & class97.method823(arg2, false, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field154[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(I)Lmha;",
      line = 63
   )
   public final synchronized class439 method76(int arg0) {
      try {
         ++field144;
         class439 var2 = (class439)this.field150.field1417.method725(0, (long)this.field148);
         if (var2 != null) {
            return var2;
         } else {
            class439 var3 = class439.method3239(this.field150.field1406, this.field148, 0);
            if (arg0 != 1) {
               this.method77((class147)null, false);
            }

            if (var3 != null) {
               this.field150.field1417.method723(0, (long)this.field148, var3);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field154[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(Lwf;Z)V",
      line = 85
   )
   public final void method77(class147 arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         if (!arg1) {
            method74(59);
         }

         while(true) {
            int var4 = arg0.method1143(-15465);
            if (var4 != 0) {
               this.method73(var4, 2, arg0);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field142;
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field154[3] + (arg0 != null ? field154[1] : field154[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(B)V",
      line = 107
   )
   public static final void method78(byte arg0) {
      try {
         class379.field5462 = null;
         ++field152;
         if (arg0 < 125) {
            method78((byte)-85);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field154[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method79(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method80(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
