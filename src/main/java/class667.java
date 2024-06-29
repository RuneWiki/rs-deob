import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class667 extends class570 {
   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field9482;
   @OriginalMember(
      owner = "client!tda",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9491 = new String[]{method4828(method4827("\u001e61]7B")), method4828(method4827("\u001e61]4B")), method4828(method4827("\u001e61]2B")), method4828(method4827("\u001e61]3B")), method4828(method4827("\u0011|~]\b")), method4828(method4827("\u001e61]6B")), method4828(method4827("\u0004'<\u001f")), method4828(method4827("\u001e61]1B")), method4828(method4827("\u001e61]I\u0003<9\u0007KB")), method4828(method4827("\u001e61]0B"))};
   @OriginalMember(
      owner = "client!tda",
      name = "D",
      descriptor = "Lnc;"
   )
   public static class26 field9486 = new class26(method4828(method4827("\r3=\u0016F")), method4828(method4827("-3=\u0016UY")), 2);
   @OriginalMember(
      owner = "client!tda",
      name = "E",
      descriptor = "[[I"
   )
   public static int[][] field9488 = new int[][]{{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
   @OriginalMember(
      owner = "client!tda",
      name = "G",
      descriptor = "I"
   )
   public static int field9490 = 0;
   @OriginalMember(
      owner = "client!tda",
      name = "C",
      descriptor = "I"
   )
   public static int field9489 = 0;
   @OriginalMember(
      owner = "client!tda",
      name = "A",
      descriptor = "I"
   )
   public static int field9478;
   @OriginalMember(
      owner = "client!tda",
      name = "I",
      descriptor = "I"
   )
   public static int field9479;
   @OriginalMember(
      owner = "client!tda",
      name = "J",
      descriptor = "I"
   )
   public static int field9480;
   @OriginalMember(
      owner = "client!tda",
      name = "L",
      descriptor = "I"
   )
   public static int field9481;
   @OriginalMember(
      owner = "client!tda",
      name = "M",
      descriptor = "I"
   )
   public static int field9483;
   @OriginalMember(
      owner = "client!tda",
      name = "F",
      descriptor = "I"
   )
   public static int field9484;
   @OriginalMember(
      owner = "client!tda",
      name = "B",
      descriptor = "I"
   )
   public static int field9485;
   @OriginalMember(
      owner = "client!tda",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field9487;

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method4822(byte arg0, int arg1) {
      try {
         if (arg0 != -92) {
            field9486 = null;
         }

         ++field9478;
         class446 var2 = class635.method4607(121, (long)arg1, 11);
         var2.method3312(-124);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9491[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method1078(int arg0) {
      try {
         ++field9483;
         if (arg0 != 100) {
            this.method1079((byte)-15);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9491[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "d",
      descriptor = "(Z)V"
   )
   public static void method4823(boolean arg0) {
      try {
         if (arg0) {
            method4822((byte)110, 95);
         }

         field9487 = null;
         field9488 = null;
         field9486 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9491[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "d",
      descriptor = "(B)Lhq;"
   )
   public static final class168 method4824(byte arg0) {
      try {
         ++field9484;
         if (class618.field8624 != null && class459.field6294 != null) {
            class459.field6294.method2118(-117, class618.field8624);
            class168 var1 = (class168)class459.field6294.method2117((byte)-2);
            if (var1 == null) {
               return null;
            } else {
               int var2 = 51 % ((arg0 - 73) / 50);
               class297 var3 = class618.field8609.method5236(var1.field2123, (byte)70);
               return var3 != null && var3.field3936 && var3.method2239(class618.field8614, (byte)-92) ? var1 : class720.method5235(-30502);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9491[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(ZIILaha;)V"
   )
   public static final void method4825(boolean arg0, int arg1, int arg2, class404 arg3) {
      try {
         ++field9480;
         int[] var4 = new int[4];
         class714.method5196(var4, 0, var4.length, arg1);
         if (arg0) {
            method4823(false);
         }

         class186.method1416(arg3, 1, arg2, var4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9491[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9491[4] : field9491[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4826(int arg0, int arg1) {
      try {
         ++field9479;
         class149 var2 = (class149)class109.field1381.method1839(arg1 + -17969, (long)arg0);
         if (arg1 == 18067) {
            if (var2 != null) {
               var2.field1947 = !var2.field1947;
               var2.field1949.method5401(false, var2.field1947);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9491[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method1079(byte arg0) {
      try {
         if (arg0 >= -43) {
            return null;
         } else {
            ++field9485;
            return this.field9482;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9491[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "<init>",
      descriptor = "(Lli;Ljava/lang/Object;I)V"
   )
   public class667(class455 arg0, Object arg1, int arg2) {
      super(arg0, arg2);

      try {
         this.field9482 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9491[8] + (arg0 != null ? field9491[4] : field9491[6]) + ',' + (arg1 != null ? field9491[4] : field9491[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4827(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4828(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
