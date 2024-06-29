import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class755 implements class669 {
   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10964 = new String[]{method5444(method5443("~-L}\u001a")), method5444(method5443("b4\u000eP")), method5444(method5443("woL\u0012O")), method5444(method5443("~-L~\u001a")), method5444(method5443("~-L\u007f\u001a")), method5444(method5443("~-Lx\u001a"))};
   @OriginalMember(
      owner = "client!rl",
      name = "d",
      descriptor = "I"
   )
   public static int field10961;
   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "I"
   )
   public static int field10962;
   @OriginalMember(
      owner = "client!rl",
      name = "c",
      descriptor = "I"
   )
   public static int field10963;
   @OriginalMember(
      owner = "client!rl",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10960;

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(Lme;B)V"
   )
   public static final void method5440(class206 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "([IBLdd;J)Ljava/lang/String;"
   )
   public final String method4832(int[] arg0, byte arg1, class735 arg2, long arg3) {
      try {
         ++field10962;
         if (class568.field7746 == arg2) {
            class342 var6 = class484.field6675.method4790(arg0[0], -112);
            return var6.method2715((int)arg3, -6);
         } else if (class790.field11560 != arg2 && class223.field2783 != arg2) {
            int var8 = -125 / ((arg1 - 10) / 51);
            return class7.field59 != arg2 && class339.field4867 != arg2 && class388.field5430 != arg2 ? null : class484.field6675.method4790(arg0[0], -93).method2715((int)arg3, -6);
         } else {
            class261 var7 = class645.field9054.method485(0, (int)arg3);
            return var7.field3371;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field10964[5] + (arg0 != null ? field10964[2] : field10964[1]) + ',' + arg1 + ',' + (arg2 != null ? field10964[2] : field10964[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(BIIIIII)V"
   )
   public static final void method5441(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         label53: {
            if (arg6 == 8 || arg6 == 16) {
               if (arg6 != 8) {
                  int var8 = (arg1 << class76.field965) + class212.field2635;
                  int var9 = -class212.field2635 + var8;
                  int var10 = arg5 << class76.field965;
                  int var11 = var10 - -class212.field2635;
                  int var12 = class144.field1906[arg2].method2221(false, arg5, arg1 + 1);
                  int var13 = class144.field1906[arg2].method2221(false, arg5 - -1, arg1);
                  class397.field5579[class28.field350++] = new class777(arg6, arg2, var8, var9, var9, var8, var12, var13, -arg4 + var13, -arg4 + var12, var10, var11, var11, var10);
                  if (!var7) {
                     break label53;
                  }
               }

               int var14 = arg1 << class76.field965;
               int var15 = class212.field2635 + var14;
               int var16 = arg5 << class76.field965;
               int var17 = class212.field2635 + var16;
               int var18 = class144.field1906[arg2].method2221(false, arg5, arg1);
               int var19 = class144.field1906[arg2].method2221(false, arg5 + 1, arg1 + 1);
               class397.field5579[class28.field350++] = new class777(arg6, arg2, var14, var15, var15, var14, var18, var19, var19 - arg4, -arg4 + var18, var16, var17, var17, var16);
               if (!var7) {
                  break label53;
               }
            }

            class225 var20 = class111.field1404[arg2][arg1][arg5];
            if (var20 == null) {
               var20 = new class225(arg2);
            }

            label34: {
               if (arg6 != 1) {
                  if (arg6 != 2) {
                     break label34;
                  }

                  var20.field2823 = (short)arg3;
                  var20.field2827 = (short)arg4;
                  if (!var7) {
                     break label34;
                  }
               }

               var20.field2819 = (short)arg4;
               var20.field2832 = (short)arg3;
            }

            if (class766.field11047) {
               class685.method5008(0);
            }
         }

         ++field10963;
         int var21 = -66 % ((31 - arg0) / 50);
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field10964[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5442(int arg0) {
      try {
         if (arg0 == 3) {
            field10960 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10964[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5443(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5444(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
