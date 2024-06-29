import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class186 {
   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2919 = new String[]{method1676(method1675("+S\u0003\u001be")), method1676(method1675(")MA6")), method1676(method1675("<\u0016\u0003t0")), method1676(method1675("+S\u0003\u0019e")), method1676(method1675("+S\u0003\u0018e"))};
   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "Lbda;"
   )
   public static class783 field2916 = new class783(8, 1);
   @OriginalMember(
      owner = "client!lk",
      name = "c",
      descriptor = "I"
   )
   public static int field2917;
   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "I"
   )
   public static int field2918;

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1672(boolean arg0) {
      try {
         ++field2917;
         class519.field7897 = 0;
         class632.field9145 = -2;
         if (arg0) {
            class536.field8114 = -2;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2919[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(IIII[BII)V"
   )
   public static final void method1673(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         ++field2918;
         if (arg0 > arg2 && !class140.method1285(arg0, -11925)) {
            throw new IllegalArgumentException("");
         } else if (~arg1 < -1 && !class140.method1285(arg1, -11925)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class357.method2920((byte)-51, arg5);
            int var9 = 0;
            int var10 = ~arg1 < ~arg0 ? arg0 : arg1;
            int var11 = arg0 >> 1;
            int var12 = arg1 >> 1;
            byte[] var13 = arg4;
            byte[] var14 = new byte[var11 * var12 * var8];

            while(true) {
               OpenGL.glTexImage2Dub(arg3, var9, arg6, arg0, arg1, 0, arg5, 5121, var13, 0);
               if (~var10 >= -2) {
                  return;
               }

               int var10000;
               label97: {
                  int var15 = arg0 * var8;
                  byte[] var16 = var14;
                  int var17 = 0;
                  if (var7) {
                     var10000 = var17;
                  } else if (~var17 <= ~var8) {
                     var14 = var13;
                     var13 = var16;
                     arg0 = var11;
                     arg1 = var12;
                     ++var9;
                     var11 >>= 1;
                     var10 >>= 1;
                     var10000 = var12 >> 1;
                     if (!var7) {
                        break label97;
                     }
                  } else {
                     var10000 = var17;
                  }

                  while(true) {
                     int var18 = var10000;
                     int var19 = var17;
                     int var20 = var15 + var17;
                     int var21 = 0;
                     if (var7 || ~var21 > ~var12) {
                        do {
                           label91: {
                              int var22 = 0;
                              if (var7) {
                                 var10000 = var13[var19];
                              } else if (var11 <= var22) {
                                 var20 += var15;
                                 var10000 = var15 + var19;
                                 if (!var7) {
                                    break label91;
                                 }
                              } else {
                                 var10000 = var13[var19];
                              }

                              while(true) {
                                 int var23 = var10000;
                                 int var24 = var8 + var19;
                                 int var25 = var13[var24] + var23;
                                 int var26 = var13[var20] + var25;
                                 var19 = var8 + var24;
                                 int var27 = var8 + var20;
                                 int var28 = var13[var27] + var26;
                                 var14[var18] = (byte)(var28 >> 2);
                                 var20 = var8 + var27;
                                 var18 += var8;
                                 ++var22;
                                 if (var11 <= var22) {
                                    var20 += var15;
                                    var10000 = var15 + var19;
                                    if (!var7) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var13[var19];
                                 }
                              }
                           }

                           var19 = var10000;
                           ++var21;
                        } while(~var21 > ~var12);
                     }

                     ++var17;
                     if (~var17 <= ~var8) {
                        var14 = var13;
                        var13 = var16;
                        arg0 = var11;
                        arg1 = var12;
                        ++var9;
                        var11 >>= 1;
                        var10 >>= 1;
                        var10000 = var12 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var17;
                     }
                  }
               }

               var12 = var10000;
            }
         }
      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field2919[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2919[2] : field2919[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1674(int arg0) {
      try {
         if (arg0 > -4) {
            field2916 = null;
         }

         field2916 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2919[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1675(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1676(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
