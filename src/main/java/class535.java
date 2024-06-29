import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class535 extends class199 {
   @OriginalMember(
      owner = "client!bda",
      name = "u",
      descriptor = "I"
   )
   private int field7313;
   @OriginalMember(
      owner = "client!bda",
      name = "n",
      descriptor = "I"
   )
   private int field7306;
   @OriginalMember(
      owner = "client!bda",
      name = "r",
      descriptor = "I"
   )
   private int field7307;
   @OriginalMember(
      owner = "client!bda",
      name = "l",
      descriptor = "I"
   )
   private int field7305;
   @OriginalMember(
      owner = "client!bda",
      name = "p",
      descriptor = "I"
   )
   private int field7308;
   @OriginalMember(
      owner = "client!bda",
      name = "o",
      descriptor = "I"
   )
   private int field7303;
   @OriginalMember(
      owner = "client!bda",
      name = "w",
      descriptor = "Lce;"
   )
   private class327 field7310;
   @OriginalMember(
      owner = "client!bda",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7318 = new String[]{method3854(method3853("\u001d\u0005X#XW")), method3854(method3853("\u001d\u0005X#VW")), method3854(method3853("\u001d\u0005X#WW")), method3854(method3853("\u001d\u0005X#TW")), method3854(method3853("\u0004O\u0017#m")), method3854(method3853("\u0011\u0014Ua")), method3854(method3853("\u001d\u0005X#,\u0016\u000fPy.W"))};
   @OriginalMember(
      owner = "client!bda",
      name = "q",
      descriptor = "Lou;"
   )
   public static class635 field7314 = new class635();
   @OriginalMember(
      owner = "client!bda",
      name = "v",
      descriptor = "Lo;"
   )
   public static class31 field7316 = new class31(14, 7);
   @OriginalMember(
      owner = "client!bda",
      name = "t",
      descriptor = "[F"
   )
   public static float[] field7317 = new float[4];
   @OriginalMember(
      owner = "client!bda",
      name = "s",
      descriptor = "I"
   )
   public static int field7304;
   @OriginalMember(
      owner = "client!bda",
      name = "x",
      descriptor = "I"
   )
   public static int field7309;
   @OriginalMember(
      owner = "client!bda",
      name = "y",
      descriptor = "I"
   )
   public static int field7312;
   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "Leea;"
   )
   private class142 field7315;
   @OriginalMember(
      owner = "client!bda",
      name = "m",
      descriptor = "[Z"
   )
   public static boolean[] field7311;

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(IIIIIIIII)Z"
   )
   public static final boolean method3850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field7312;
         if (~arg5 > ~(arg4 - -arg0) && ~(arg3 + arg5) < ~arg4) {
            if (arg1 != 2) {
               field7317 = null;
            }

            return ~arg2 > ~(arg6 + arg8) && ~(arg2 + arg7) < ~arg6;
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field7318[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3851(int arg0) {
      try {
         field7311 = null;
         field7316 = null;
         field7314 = null;
         if (arg0 != 1) {
            field7316 = null;
         }

         field7317 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7318[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3852(byte arg0) {
      try {
         if (arg0 > -32) {
            method3852((byte)53);
         }

         class247.field3108 = 200;
         class493.field6783 = (int)((double)class507.field7030 * 34.46D);
         ++field7309;
         class493.field6783 <<= 2;
         if (class338.field4832.method596()) {
            class493.field6783 += 512;
         }

         class78.method757(false, 47);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7318[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(I)Leea;"
   )
   public final class142 method1492(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field7304;
         if (arg0 != -11756) {
            method3850(63, -45, -126, -2, 17, -58, 97, 62, 107);
         }

         if (this.field7315 == null) {
            class160 var3;
            byte var4;
            int var5;
            int var9;
            label88: {
               class633.field8959[4] = this.field7303;
               class633.field8959[2] = this.field7313;
               class633.field8959[1] = this.field7305;
               var3 = this.field7310.field726;
               class633.field8959[5] = this.field7307;
               class633.field8959[3] = this.field7306;
               class633.field8959[0] = this.field7308;
               var4 = 0;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method1289((byte)-65, class633.field8959[var6])) {
                     return null;
                  }
               } else if (~var6 <= -7) {
                  var9 = 0;
                  if (!var2) {
                     break label88;
                  }
               } else if (!var3.method1289((byte)-65, class633.field8959[var6])) {
                  return null;
               }

               while(true) {
                  class359 var7 = var3.method1293(class633.field8959[var6], -5150);
                  int var8 = var7.field5116 ? 64 : 128;
                  if (var8 > var5) {
                     var5 = var8;
                  }

                  if (var7.field5106 > 0) {
                     var4 = 1;
                  }

                  ++var6;
                  if (~var6 <= -7) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method1289((byte)-65, class633.field8959[var6])) {
                     return null;
                  }
               }
            }

            if (var2) {
               class119.field1454[var9] = var3.method1292(var5, false, (byte)124, 1.0F, var5, class633.field8959[var9]);
               ++var9;
            }

            while(true) {
               while(var9 < 6) {
                  class119.field1454[var9] = var3.method1292(var5, false, (byte)124, 1.0F, var5, class633.field8959[var9]);
                  ++var9;
               }

               if (!var2) {
                  this.field7315 = this.field7310.method2569(~var4 != -1, class119.field1454, var5, 122);
                  break;
               }

               ++var9;
            }
         }

         return this.field7315;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field7318[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(Lce;IIIIII)V"
   )
   public class535(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field7313 = arg3;
         this.field7306 = arg4;
         this.field7307 = arg6;
         this.field7305 = arg2;
         this.field7308 = arg1;
         this.field7303 = arg5;
         this.field7310 = arg0;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field7318[6] + (arg0 != null ? field7318[4] : field7318[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3853(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3854(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
