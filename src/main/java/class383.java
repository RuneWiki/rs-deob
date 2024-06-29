import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class383 extends class567 {
   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5369 = new String[]{method2945(method2944("\u00139N+Q")), method2945(method2944("\u0015.\f\u0006Y")), method2945(method2944("\u0015.\f\bY")), method2945(method2944("\u0015.\f\u000bY")), method2945(method2944("\t)N\"")), method2945(method2944("\u0015.\f\rY")), method2945(method2944("\u001cr\f`\f")), method2945(method2944("\u0015.\f\nY")), method2945(method2944("\u0015.\f\fY")), method2945(method2944("\u0015.\f\tY")), method2945(method2944("\u0015.\f\u0004Y")), method2945(method2944("\u0015.\f\u000fY"))};
   @OriginalMember(
      owner = "client!rr",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field5359 = false;
   @OriginalMember(
      owner = "client!rr",
      name = "p",
      descriptor = "[Z"
   )
   public static boolean[] field5365 = new boolean[200];
   @OriginalMember(
      owner = "client!rr",
      name = "x",
      descriptor = "F"
   )
   public static float field5367 = 0.25F;
   @OriginalMember(
      owner = "client!rr",
      name = "y",
      descriptor = "I"
   )
   public static int field5358;
   @OriginalMember(
      owner = "client!rr",
      name = "v",
      descriptor = "I"
   )
   public static int field5360;
   @OriginalMember(
      owner = "client!rr",
      name = "r",
      descriptor = "I"
   )
   public static int field5361;
   @OriginalMember(
      owner = "client!rr",
      name = "q",
      descriptor = "I"
   )
   public static int field5362;
   @OriginalMember(
      owner = "client!rr",
      name = "o",
      descriptor = "I"
   )
   public static int field5363;
   @OriginalMember(
      owner = "client!rr",
      name = "w",
      descriptor = "I"
   )
   public static int field5364;
   @OriginalMember(
      owner = "client!rr",
      name = "t",
      descriptor = "I"
   )
   public static int field5366;
   @OriginalMember(
      owner = "client!rr",
      name = "u",
      descriptor = "I"
   )
   public static int field5368;

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2941(boolean arg0) {
      try {
         if (!arg0) {
            method2941(true);
         }

         field5365 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5369[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         super.field7728.method2581(arg1, 0);
         ++field5361;
         if (arg0) {
            super.field7728.method2593(0, arg2);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5369[8] + arg0 + ',' + (arg1 != null ? field5369[6] : field5369[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "<init>",
      descriptor = "(Lce;)V"
   )
   public class383(class327 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         ++field5358;
         if (arg0 != -1309) {
            this.method7(true, -15);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5369[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         if (arg0 != 0) {
            field5365 = null;
         }

         ++field5366;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5369[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      try {
         if (arg1 != 10286) {
            this.method7(true, -5);
         }

         ++field5363;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5369[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(BIII)V"
   )
   public static final void method2942(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5362;
         String var4 = field5369[0] + arg2 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 63) + "," + (arg1 & 63);
         System.out.println(var4);
         if (arg0 <= -65) {
            class479.method3494(var4, true, true, false);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5369[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         if (arg0 >= -64) {
            field5367 = -0.68208426F;
         }

         ++field5360;
         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5369[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      try {
         ++field5368;
         int var4 = -104 / ((63 - arg1) / 58);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5369[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(ZLeb;)V"
   )
   public static final void method2943(boolean arg0, class657 arg1) {
      try {
         ++field5364;
         if (class373.field5261 == arg1.field9335) {
            class244.field3057[arg1.field9342] = true;
         }

         if (arg0) {
            field5365 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5369[5] + arg0 + ',' + (arg1 != null ? field5369[6] : field5369[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2944(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2945(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
