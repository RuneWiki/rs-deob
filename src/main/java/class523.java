import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class523 {
   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7339 = new String[]{method3921(method3920("K\u000e\u0006\u0013}")), method3921(method3920("K\u000e\u0006\u0014}")), method3921(method3920("K\u000e\u0006\u0012}")), method3921(method3920("K\u000e\u0006\u0010}")), method3921(method3920("R\u000fD=")), method3921(method3920("GT\u0006\u007f(")), method3921(method3920("K\u000e\u0006\u0015}"))};
   @OriginalMember(
      owner = "client!wt",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field7329 = new int[2];
   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field7338 = false;
   @OriginalMember(
      owner = "client!wt",
      name = "f",
      descriptor = "I"
   )
   public int field7330;
   @OriginalMember(
      owner = "client!wt",
      name = "h",
      descriptor = "I"
   )
   public int field7332;
   @OriginalMember(
      owner = "client!wt",
      name = "d",
      descriptor = "I"
   )
   public static int field7333;
   @OriginalMember(
      owner = "client!wt",
      name = "e",
      descriptor = "I"
   )
   public static int field7334;
   @OriginalMember(
      owner = "client!wt",
      name = "b",
      descriptor = "I"
   )
   public static int field7335;
   @OriginalMember(
      owner = "client!wt",
      name = "c",
      descriptor = "I"
   )
   public static int field7336;
   @OriginalMember(
      owner = "client!wt",
      name = "i",
      descriptor = "I"
   )
   public static int field7337;
   @OriginalMember(
      owner = "client!wt",
      name = "g",
      descriptor = "[Lcea;"
   )
   public class110[] field7331;

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3915(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 0) {
            method3915(-119, -18, -12);
         }

         ++field7335;
         return (arg1 & 2048) != 0 && (55 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7339[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(Ldp;ILgea;)Lcea;"
   )
   private final class110 method3916(class499 arg0, int arg1, class66 arg2) {
      try {
         ++field7333;
         if (class238.field3011 == arg0) {
            return class131.method1112(arg2, 39);
         } else if (class763.field11167 == arg0) {
            return class780.method5630(arg2, 34963);
         } else if (class495.field6912 == arg0) {
            return class311.method2479(arg2, 1);
         } else if (class188.field2390 == arg0) {
            return class593.method4415(16777215, arg2);
         } else if (class359.field4999 == arg0) {
            return class413.method3239(arg2, 101);
         } else if (class569.field8363 == arg0) {
            return class761.method5516(arg2, -1);
         } else if (class793.field11596 == arg0) {
            return class486.method3690(arg2, (byte)-110);
         } else if (class447.field6053 == arg0) {
            return class676.method4947(24595, arg2);
         } else if (class238.field3033 == arg0) {
            return class106.method949(arg2, arg1 ^ 7186);
         } else if (class21.field327 == arg0) {
            return class204.method1691(16711935, arg2);
         } else {
            return arg1 != 7186 ? null : null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7339[3] + (arg0 != null ? field7339[5] : field7339[4]) + ',' + arg1 + ',' + (arg2 != null ? field7339[5] : field7339[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(Lgea;B)V"
   )
   public final void method3917(class66 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3918(boolean arg0) {
      try {
         field7329 = null;
         if (arg0) {
            field7329 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7339[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3919(int arg0) {
      try {
         class577.field8555.method405(class380.field5296, class457.field6296, class259.field3292);
         if (arg0 != -31851) {
            field7329 = null;
         }

         ++field7337;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7339[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3920(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3921(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
