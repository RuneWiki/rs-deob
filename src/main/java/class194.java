import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class194 extends class546 {
   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2368 = new String[]{method1464(method1463("s\fBK")), method1464(method1463("oW~\u000f")), method1464(method1463("s\f@K")), method1464(method1463("z\f<M\u001f")), method1464(method1463("s\fCK"))};
   @OriginalMember(
      owner = "client!r",
      name = "y",
      descriptor = "Lnw;"
   )
   public static class616 field2362 = new class616(22, 2);
   @OriginalMember(
      owner = "client!r",
      name = "w",
      descriptor = "Lbga;"
   )
   public static class378 field2367 = new class378(57, -2);
   @OriginalMember(
      owner = "client!r",
      name = "v",
      descriptor = "I"
   )
   public static int field2363;
   @OriginalMember(
      owner = "client!r",
      name = "u",
      descriptor = "I"
   )
   public static int field2366;
   @OriginalMember(
      owner = "client!r",
      name = "t",
      descriptor = "Lqh;"
   )
   public static class74 field2365;
   @OriginalMember(
      owner = "client!r",
      name = "x",
      descriptor = "[[[Lcea;"
   )
   public static class225[][][] field2364;

   @OriginalMember(
      owner = "client!r",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1460(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field2366;
         if (class85.field1098 == null) {
            int var2 = class322.field4298;
            int var3 = class682.field10009;
            if (arg0 != 5) {
               field2362 = null;
            }

            int var4 = -class252.field3194 + -var2 + class682.field10003;
            int var5 = -class41.field479 + class434.field6038 + -var3;
            if (var2 > 0 || ~var4 < -1 || var3 > 0 || ~var5 < -1) {
               try {
                  Container var6;
                  label55: {
                     if (class533.field7289 == null) {
                        if (class126.field1586 == null) {
                           var6 = class186.field2284;
                           if (!var1) {
                              break label55;
                           }
                        }

                        var6 = class126.field1586;
                        if (!var1) {
                           break label55;
                        }
                     }

                     var6 = class533.field7289;
                  }

                  int var7 = 0;
                  int var8 = 0;
                  if (class533.field7289 == var6) {
                     Insets var9 = class533.field7289.getInsets();
                     var8 = var9.top;
                     var7 = var9.left;
                  }

                  Graphics var10 = var6.getGraphics();
                  var10.setColor(Color.black);
                  if (var2 > 0) {
                     var10.fillRect(var7, var8, var2, class434.field6038);
                  }

                  if (~var3 < -1) {
                     var10.fillRect(var7, var8, class682.field10003, var3);
                  }

                  if (~var4 < -1) {
                     var10.fillRect(var7 - (-class682.field10003 - -var4), var8, var4, class434.field6038);
                  }

                  if (var5 > 0) {
                     var10.fillRect(var7, class434.field6038 + var8 + -var5, class682.field10003, var5);
                     return;
                  }
               } catch (Exception var12) {
                  return;
               }
            }

         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2368[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(BII[Ljava/lang/Object;[J)V"
   )
   public static final void method1461(byte arg0, int arg1, int arg2, Object[] arg3, long[] arg4) {
      boolean var5 = client.field4273;

      try {
         ++field2363;
         if (~arg1 > ~arg2) {
            int var6 = (arg1 - -arg2) / 2;
            int var7 = arg1;
            long var8 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var8;
            Object var10 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var10;
            int var11 = ~var8 != Long.MIN_VALUE ? 1 : 0;
            int var12 = arg1;
            long var13;
            Object var15;
            if (var5) {
               if (arg4[arg1] < (long)(arg1 & var11) + var8) {
                  var13 = arg4[arg1];
                  arg4[arg1] = arg4[arg1];
                  arg4[arg1] = var13;
                  var15 = arg3[arg1];
                  arg3[arg1] = arg3[arg1];
                  var7 = arg1 + 1;
                  arg3[arg1] = var15;
               }

               var12 = arg1 + 1;
            }

            while(true) {
               int var10000;
               if (~var12 <= ~arg2) {
                  arg4[arg2] = arg4[var7];
                  arg4[var7] = var8;
                  arg3[arg2] = arg3[var7];
                  arg3[var7] = var10;
                  method1461((byte)-120, arg1, var7 + -1, arg3, arg4);
                  var10000 = -120;
                  if (!var5) {
                     method1461((byte)-120, var7 - -1, arg2, arg3, arg4);
                     break;
                  }
               } else {
                  long var18;
                  var10000 = (var18 = arg4[var12] - ((long)(var12 & var11) + var8)) == 0L ? 0 : (var18 < 0L ? -1 : 1);
               }

               if (var10000 < 0) {
                  var13 = arg4[var12];
                  arg4[var12] = arg4[var7];
                  arg4[var7] = var13;
                  var15 = arg3[var12];
                  arg3[var12] = arg3[var7];
                  arg3[var7++] = var15;
               }

               ++var12;
            }
         }

         if (arg0 != -120) {
            method1460((byte)-32);
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field2368[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2368[3] : field2368[1]) + ',' + (arg4 != null ? field2368[3] : field2368[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1462(int arg0) {
      try {
         field2362 = null;
         field2365 = null;
         field2367 = null;
         int var1 = -73 / ((-6 - arg0) / 42);
         field2364 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2368[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1463(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1464(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
