import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class286 implements class102 {
   @OriginalMember(
      owner = "client!uea",
      name = "d",
      descriptor = "Lpo;"
   )
   private class372 field3955;
   @OriginalMember(
      owner = "client!uea",
      name = "m",
      descriptor = "Lww;"
   )
   private class339 field3951;
   @OriginalMember(
      owner = "client!uea",
      name = "n",
      descriptor = "Lww;"
   )
   private class339 field3962;
   @OriginalMember(
      owner = "client!uea",
      name = "c",
      descriptor = "I"
   )
   private int field3956;
   @OriginalMember(
      owner = "client!uea",
      name = "j",
      descriptor = "[Lta;"
   )
   private class668[] field3960;
   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3967 = new String[]{method2329(method2328("4N\u00183Zi")), method2329(method2328("4N\u00183Ui")), method2329(method2328("4N\u00183[i")), method2329(method2328("4N\u00183]i")), method2329(method2328("4N\u00183Ti")), method2329(method2328("4N\u00183^i")), method2329(method2328("4N\u00183_i")), method2329(method2328("4N\u00183Yi")), method2329(method2328("4N\u00183Xi")), method2329(method2328(":\u0005W3a")), method2329(method2328("4N\u00183 (E\u0010i\"i")), method2329(method2328("/^\u0015q"))};
   @OriginalMember(
      owner = "client!uea",
      name = "l",
      descriptor = "I"
   )
   public static int field3953 = -1;
   @OriginalMember(
      owner = "client!uea",
      name = "h",
      descriptor = "Lsia;"
   )
   public static class407 field3959 = new class407(8);
   @OriginalMember(
      owner = "client!uea",
      name = "o",
      descriptor = "I"
   )
   public static int field3961 = 765;
   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "I"
   )
   public static int field3952;
   @OriginalMember(
      owner = "client!uea",
      name = "i",
      descriptor = "I"
   )
   public static int field3954;
   @OriginalMember(
      owner = "client!uea",
      name = "e",
      descriptor = "I"
   )
   public static int field3957;
   @OriginalMember(
      owner = "client!uea",
      name = "p",
      descriptor = "I"
   )
   public static int field3958;
   @OriginalMember(
      owner = "client!uea",
      name = "k",
      descriptor = "I"
   )
   public static int field3963;
   @OriginalMember(
      owner = "client!uea",
      name = "g",
      descriptor = "I"
   )
   public static int field3964;
   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "I"
   )
   public static int field3965;
   @OriginalMember(
      owner = "client!uea",
      name = "f",
      descriptor = "I"
   )
   public static int field3966;

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(ZIFIII)[F"
   )
   public final float[] method916(boolean arg0, int arg1, float arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3958;
         return arg1 != -29003 ? null : this.method2325(1, arg5).method1133(this.field3962, this, this.field3960[arg5].field9893, arg4, 1, arg3);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3967[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "c",
      descriptor = "(II)Ljn;"
   )
   private final class135 method2325(int arg0, int arg1) {
      try {
         ++field3952;
         class15 var3 = this.field3955.method2947((long)arg1, 28581);
         if (arg0 != 1) {
            this.field3960 = null;
         }

         if (var3 != null) {
            return (class135)var3;
         } else {
            byte[] var4 = this.field3951.method2700(arg1, -2);
            if (var4 == null) {
               return null;
            } else {
               class135 var5 = new class135(new class66(var4));
               this.field3955.method2946(var5, true, (long)arg1);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3967[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method912(int arg0) {
      try {
         ++field3954;
         if (arg0 != 3106) {
            this.method2325(111, 103);
         }

         return this.field3956;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3967[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method2326(int arg0, int arg1, byte arg2) {
      try {
         ++field3964;
         if (arg2 <= 39) {
            field3953 = -67;
         }

         return (arg0 & 33) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3967[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "(II)Z"
   )
   public final boolean method915(int arg0, int arg1) {
      try {
         ++field3965;
         class135 var3 = this.method2325(1, arg0);
         if (arg1 <= 125) {
            return false;
         } else {
            return var3 != null && var3.method1132(14033, this.field3962, this);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3967[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(IIZIFI)[I"
   )
   public final int[] method913(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
      try {
         ++field3966;
         if (arg3 <= 74) {
            this.field3955 = null;
         }

         return this.method2325(1, arg1).method1131(this.field3960[arg1].field9893, (double)arg4, arg0, this, this.field3962, 81, arg5, arg2);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3967[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(II)Lta;"
   )
   public final class668 method911(int arg0, int arg1) {
      try {
         int var3 = 39 / ((arg1 - -28) / 52);
         ++field3963;
         return this.field3960[arg0];
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3967[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(IIIZFZ)[I"
   )
   public final int[] method914(int arg0, int arg1, int arg2, boolean arg3, float arg4, boolean arg5) {
      try {
         if (!arg5) {
            return null;
         } else {
            ++field3957;
            return this.method2325(1, arg0).method1130(arg1, (double)arg4, this, this.field3960[arg0].field9893, 87, this.field3962, arg2);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3967[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2327(int arg0) {
      try {
         if (arg0 != -27270) {
            method2326(36, -41, (byte)71);
         }

         field3959 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3967[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "<init>",
      descriptor = "(Lww;Lww;Lww;)V"
   )
   public class286(class339 param1, class339 param2, class339 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2328(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2329(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
