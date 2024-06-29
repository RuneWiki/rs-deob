import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class390 {
   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6139 = new String[]{method3155(method3154("\u0017l\u0018\u00143")), method3155(method3154("\ntZ:")), method3155(method3154("\u0017l\u0018\u00173")), method3155(method3154("\u001f/\u0018xf"))};
   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "Lsn;"
   )
   public static class675 field6136 = new class675();
   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "I"
   )
   public static int field6138;
   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "J"
   )
   public static long field6137;

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method3152(byte arg0) {
      try {
         if (arg0 >= -47) {
            method3153(-119, -37, -34, 25, -35, (byte[])null, 17, 24, (byte[])null);
         }

         field6136 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6139[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(IIIII[BII[B)V",
      line = 16
   )
   public static final void method3153(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, byte[] arg8) {
      boolean var9 = client.field1786;

      try {
         ++field6138;
         int var10 = -(arg6 >> 2);
         int var16 = -(3 & arg6);
         int var11 = -arg2;
         int var10000;
         if (var9) {
            var10000 = var10;
         } else if (var11 >= 0) {
            var10000 = arg1;
            if (!var9) {
               if (arg1 != 645949058) {
                  field6137 = 14L;
                  return;
               }

               return;
            }
         } else {
            var10000 = var10;
         }

         label106:
         while(true) {
            int var12 = var10000;
            int var10001;
            if (var9) {
               var10001 = arg4++;
               arg5[var10001] = (byte)(arg5[var10001] + -arg8[arg0++]);
               int var17 = arg4++;
               arg5[var17] = (byte)(arg5[var17] + -arg8[arg0++]);
               int var18 = arg4++;
               arg5[var18] = (byte)(arg5[var18] + -arg8[arg0++]);
               int var19 = arg4++;
               arg5[var19] = (byte)(arg5[var19] + -arg8[arg0++]);
               ++var12;
            }

            while(true) {
               while(~var12 > -1) {
                  var10001 = arg4++;
                  arg5[var10001] = (byte)(arg5[var10001] + -arg8[arg0++]);
                  var10001 = arg4++;
                  arg5[var10001] = (byte)(arg5[var10001] + -arg8[arg0++]);
                  var10001 = arg4++;
                  arg5[var10001] = (byte)(arg5[var10001] + -arg8[arg0++]);
                  var10001 = arg4++;
                  arg5[var10001] = (byte)(arg5[var10001] + -arg8[arg0++]);
                  ++var12;
               }

               int var13 = var16;
               if (!var9) {
                  if (var9) {
                     var10001 = arg4++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg8[arg0++]);
                     var13 = var16 + 1;
                  }

                  while(true) {
                     while(~var13 > -1) {
                        var10001 = arg4++;
                        arg5[var10001] = (byte)(arg5[var10001] + -arg8[arg0++]);
                        ++var13;
                     }

                     arg4 += arg3;
                     arg0 += arg7;
                     if (!var9) {
                        ++var11;
                        if (var11 >= 0) {
                           var10000 = arg1;
                           if (!var9) {
                              if (arg1 != 645949058) {
                                 field6137 = 14L;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = var10;
                        }
                        continue label106;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field6139[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6139[3] : field6139[1]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field6139[3] : field6139[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3154(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3155(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
