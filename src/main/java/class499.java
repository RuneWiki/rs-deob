import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class499 extends class22 {
   @OriginalMember(
      owner = "client!qq",
      name = "n",
      descriptor = "S"
   )
   public short field7291;
   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7294 = new String[]{method3763(method3762("rW8x\u000e")), method3763(method3762("rW8}\u000e")), method3763(method3762("mSzU")), method3763(method3762("x\b8\u0017[")), method3763(method3762("rW8\u0005OmOb\u0007\u000e")), method3763(method3762("rW8{\u000e")), method3763(method3762("iGq^J")), method3763(method3762("rW8z\u000e"))};
   @OriginalMember(
      owner = "client!qq",
      name = "m",
      descriptor = "Lgh;"
   )
   public static class572 field7288 = new class572(40, 11);
   @OriginalMember(
      owner = "client!qq",
      name = "o",
      descriptor = "F"
   )
   public static float field7293;
   @OriginalMember(
      owner = "client!qq",
      name = "j",
      descriptor = "I"
   )
   public static int field7287;
   @OriginalMember(
      owner = "client!qq",
      name = "p",
      descriptor = "I"
   )
   public static int field7289;
   @OriginalMember(
      owner = "client!qq",
      name = "l",
      descriptor = "I"
   )
   public static int field7290;
   @OriginalMember(
      owner = "client!qq",
      name = "k",
      descriptor = "I"
   )
   public static int field7292;

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(IIZLek;)V",
      line = 3
   )
   public static final void method3758(int arg0, int arg1, boolean arg2, class531 arg3) {
      try {
         class448.field6548[arg1][arg0] = arg3;
         if (!arg2) {
            field7288 = null;
         }

         ++field7287;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7294[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7294[3] : field7294[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(I)V",
      line = 15
   )
   public static void method3759(int arg0) {
      try {
         if (arg0 > 8) {
            field7288 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7294[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(Lhw;Ld;Ljava/awt/Canvas;IB)Lha;",
      line = 28
   )
   public static final class65 method3760(class141 arg0, class160 arg1, Canvas arg2, int arg3, byte arg4) {
      try {
         ++field7290;
         if (!class321.method2506(false)) {
            throw new RuntimeException("");
         } else if (!class621.method4548((byte)116, field7294[6])) {
            throw new RuntimeException("");
         } else {
            OpenGL var5 = new OpenGL();
            if (arg4 <= 100) {
               return null;
            } else {
               long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg3);
               if (~var6 == -1L) {
                  throw new RuntimeException("");
               } else {
                  class124 var8 = new class124(var5, arg2, var6, arg1, arg0, arg3);
                  var8.method2787(true);
                  return var8;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field7294[7] + (arg0 != null ? field7294[3] : field7294[2]) + ',' + (arg1 != null ? field7294[3] : field7294[2]) + ',' + (arg2 != null ? field7294[3] : field7294[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(IJIIZ)Ljava/lang/String;",
      line = 57
   )
   public static final String method3761(int arg0, long arg1, int arg2, int arg3, boolean arg4) {
      boolean var6 = client.field4564;

      try {
         ++field7289;
         char var7 = ',';
         char var8 = '.';
         if (arg3 == 0) {
            var8 = ',';
            var7 = '.';
         }

         if (~arg3 == -3) {
            var8 = 160;
         }

         byte var9 = 0;
         if (arg1 < 0L) {
            var9 = 1;
            arg1 = -arg1;
         }

         StringBuffer var10 = new StringBuffer(26);
         if (arg2 > 0) {
            int var11 = 0;
            if (var6 || ~arg2 < ~var11) {
               do {
                  int var12 = (int)arg1;
                  arg1 /= 10L;
                  var10.append((char)(var12 + 48 + -((int)arg1 * 10)));
                  ++var11;
               } while(~arg2 < ~var11);
            }

            var10.append(var7);
         }

         if (arg0 != 10) {
            field7288 = null;
         }

         int var13 = 0;

         int var10000;
         while(true) {
            int var14 = (int)arg1;
            arg1 /= 10L;
            var10.append((char)(var14 + 48 - (int)arg1 * 10));
            if (arg1 != 0L) {
               if (!arg4) {
                  continue;
               }

               ++var13;
               var10000 = var13 % 3;
               if (var6) {
                  break;
               }

               if (var10000 != 0) {
                  continue;
               }

               var10.append(var8);
               if (!var6) {
                  continue;
               }
            }

            var10000 = var9;
            break;
         }

         if (var10000 != 0) {
            var10.append('-');
         }

         return var10.reverse().toString();
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field7294[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "<init>",
      descriptor = "()V",
      line = 142
   )
   public class499() {
   }

   @OriginalMember(
      owner = "client!qq",
      name = "<init>",
      descriptor = "(S)V",
      line = 144
   )
   public class499(short arg0) {
      try {
         this.field7291 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7294[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3762(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3763(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
