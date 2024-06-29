import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class306 {
   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4641 = new String[]{method2522(method2521("]\r\tn%")), method2522(method2521("SA\t\u0005p")), method2522(method2521("F\u001aKG")), method2522(method2521("]\r\to%")), method2522(method2521("]\r\th%")), method2522(method2521("]\r\ti%"))};
   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "Liw;"
   )
   public static class107 field4633 = new class107(4);
   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field4637 = false;
   @OriginalMember(
      owner = "client!ub",
      name = "h",
      descriptor = "I"
   )
   public static int field4634 = 0;
   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "I"
   )
   public static int field4635;
   @OriginalMember(
      owner = "client!ub",
      name = "f",
      descriptor = "I"
   )
   public static int field4636;
   @OriginalMember(
      owner = "client!ub",
      name = "d",
      descriptor = "I"
   )
   public static int field4639;
   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "I"
   )
   public static int field4640;
   @OriginalMember(
      owner = "client!ub",
      name = "g",
      descriptor = "Lsa;"
   )
   public static class39 field4638;

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2516(int arg0) {
      try {
         if (arg0 != -9600) {
            method2518((byte)116, -112, -110, -25);
         }

         field4633 = null;
         field4638 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4641[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Z[I[JII)V"
   )
   public static final void method2517(boolean arg0, int[] arg1, long[] arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg0) {
            if (arg4 > arg3) {
               int var6 = (arg3 - -arg4) / 2;
               int var7 = arg3;
               long var8 = arg2[var6];
               arg2[var6] = arg2[arg4];
               arg2[arg4] = var8;
               int var10 = arg1[var6];
               arg1[var6] = arg1[arg4];
               arg1[arg4] = var10;
               int var11 = var8 == Long.MAX_VALUE ? 0 : 1;
               int var12 = arg3;
               long var13;
               int var15;
               if (var5) {
                  if (~arg2[arg3] > ~((long)(arg3 & var11) + var8)) {
                     var13 = arg2[arg3];
                     arg2[arg3] = arg2[arg3];
                     arg2[arg3] = var13;
                     var15 = arg1[arg3];
                     arg1[arg3] = arg1[arg3];
                     var7 = arg3 + 1;
                     arg1[arg3] = var15;
                  }

                  var12 = arg3 + 1;
               }

               while(true) {
                  int var10000;
                  if (~arg4 >= ~var12) {
                     arg2[arg4] = arg2[var7];
                     arg2[var7] = var8;
                     arg1[arg4] = arg1[var7];
                     arg1[var7] = var10;
                     method2517(true, arg1, arg2, arg3, var7 - 1);
                     var10000 = 1;
                     if (!var5) {
                        method2517(true, arg1, arg2, var7 + 1, arg4);
                        break;
                     }
                  } else {
                     long var18;
                     var10000 = (var18 = ~arg2[var12] - ~((long)(var12 & var11) + var8)) == 0L ? 0 : (var18 < 0L ? -1 : 1);
                  }

                  if (var10000 > 0) {
                     var13 = arg2[var12];
                     arg2[var12] = arg2[var7];
                     arg2[var7] = var13;
                     var15 = arg1[var12];
                     arg1[var12] = arg1[var7];
                     arg1[var7++] = var15;
                  }

                  ++var12;
               }
            }

            ++field4640;
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field4641[3] + arg0 + ',' + (arg1 != null ? field4641[1] : field4641[2]) + ',' + (arg2 != null ? field4641[1] : field4641[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(BIII)I"
   )
   public static final int method2518(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4635;
         int var4 = arg3 / arg2;
         int var5 = arg2 - 1 & arg3;
         int var6 = arg1 / arg2;
         int var7 = arg1 & arg2 + -1;
         if (arg0 != 100) {
            field4638 = null;
         }

         int var8 = class27.method345(var6, var4, 109);
         int var9 = class27.method345(var6, var4 + 1, 54);
         int var10 = class27.method345(var6 + 1, var4, 67);
         int var11 = class27.method345(var6 - -1, var4 + 1, 67);
         int var12 = class419.method3269(-106, var9, var5, arg2, var8);
         int var13 = class419.method3269(111, var11, var5, arg2, var10);
         return class419.method3269(125, var13, var7, arg2, var12);
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field4641[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IIBZI)V"
   )
   public static final void method2519(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
      try {
         class745.method5366(true);
         ++field4636;
         class561.field7989 = 0L;
         int var5 = class40.method477(false);
         if (arg2 < -119) {
            if (arg0 == 3 || var5 == 3) {
               arg3 = true;
            }

            if (!class54.field794.method208()) {
               arg3 = true;
            }

            class438.method3414(arg4, var5, arg0, arg1, -67, arg3);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4641[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lqga;I)Lqga;"
   )
   public abstract class657 method2520(class657 arg0, int arg1);

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2521(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2522(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
