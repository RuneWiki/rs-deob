import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class687 extends class418 {
   @OriginalMember(
      owner = "client!dv",
      name = "n",
      descriptor = "[Lhja;"
   )
   public class430[] field10132;
   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10136 = new String[]{method5021(method5020("(!\r|\u0018")), method5021(method5020("9nD5\t")), method5021(method5020("=zO>")), method5021(method5020("7y\r\u0011M")), method5021(method5020("7y\r\u0016M")), method5021(method5020("7y\r\u0017M")), method5021(method5020("7y\r\u0014M")), method5021(method5020("7y\rn\f=fWlM"))};
   @OriginalMember(
      owner = "client!dv",
      name = "k",
      descriptor = "I"
   )
   public static int field10131;
   @OriginalMember(
      owner = "client!dv",
      name = "l",
      descriptor = "I"
   )
   public static int field10133;
   @OriginalMember(
      owner = "client!dv",
      name = "m",
      descriptor = "I"
   )
   public static int field10134;
   @OriginalMember(
      owner = "client!dv",
      name = "j",
      descriptor = "I"
   )
   public static int field10135;

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Lkf;Ld;II)Lha;"
   )
   public static final class66 method5016(Canvas arg0, class266 arg1, class162 arg2, int arg3, int arg4) {
      try {
         ++field10134;
         if (arg4 != -7566) {
            return null;
         } else if (!class606.method4418((byte)-107)) {
            throw new RuntimeException("");
         } else if (!class715.method5188(-19503, field10136[1])) {
            throw new RuntimeException("");
         } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg3);
            if (var6 == 0L) {
               throw new RuntimeException("");
            } else {
               class494 var8 = new class494(var5, arg0, var6, arg2, arg1, arg3);
               var8.method2740(-14130);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field10136[3] + (arg0 != null ? field10136[0] : field10136[2]) + ',' + (arg1 != null ? field10136[0] : field10136[2]) + ',' + (arg2 != null ? field10136[0] : field10136[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method5017(int arg0) {
      try {
         ++field10133;
         if (arg0 != 1274) {
            return false;
         } else {
            return class278.field3784 > 0;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10136[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "<init>",
      descriptor = "([Lhja;)V"
   )
   public class687(class430[] arg0) {
      try {
         this.field10132 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10136[7] + (arg0 != null ? field10136[0] : field10136[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(IIIII[B[BBI)V"
   )
   public static final void method5018(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte[] arg6, byte arg7, int arg8) {
      boolean var9 = client.field4360;

      try {
         ++field10131;
         int var10 = -67 / ((arg7 - 4) / 45);
         int var11 = -(arg1 >> 2);
         int var17 = -(arg1 & 3);
         int var12 = -arg8;
         if (var9 || ~var12 > -1) {
            label84:
            do {
               int var13 = var11;
               int var10001;
               if (var9) {
                  var10001 = arg3++;
                  arg6[var10001] += arg5[arg2++];
                  int var18 = arg3++;
                  arg6[var18] += arg5[arg2++];
                  int var19 = arg3++;
                  arg6[var19] += arg5[arg2++];
                  int var20 = arg3++;
                  arg6[var20] += arg5[arg2++];
                  var13 = var11 + 1;
               }

               while(true) {
                  while(~var13 > -1) {
                     var10001 = arg3++;
                     arg6[var10001] += arg5[arg2++];
                     var10001 = arg3++;
                     arg6[var10001] += arg5[arg2++];
                     var10001 = arg3++;
                     arg6[var10001] += arg5[arg2++];
                     var10001 = arg3++;
                     arg6[var10001] += arg5[arg2++];
                     ++var13;
                  }

                  int var14 = var17;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg3++;
                        arg6[var10001] += arg5[arg2++];
                        var14 = var17 + 1;
                     }

                     while(true) {
                        while(var14 < 0) {
                           var10001 = arg3++;
                           arg6[var10001] += arg5[arg2++];
                           ++var14;
                        }

                        arg2 += arg0;
                        arg3 += arg4;
                        if (!var9) {
                           ++var12;
                           continue label84;
                        }

                        ++var14;
                     }
                  }

                  ++var13;
               }
            } while(~var12 > -1);

         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field10136[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10136[0] : field10136[2]) + ',' + (arg6 != null ? field10136[0] : field10136[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(ILfs;Lkf;IIZI)V"
   )
   public static final void method5019(int arg0, class582 arg1, class266 arg2, int arg3, int arg4, boolean arg5, int arg6) {
      try {
         if (arg4 == 0) {
            ++field10135;
            class192.method1515(arg0, arg3, (byte)-48, arg5, arg2, arg6);
            class80.field1029 = arg1;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10136[4] + arg0 + ',' + (arg1 != null ? field10136[0] : field10136[2]) + ',' + (arg2 != null ? field10136[0] : field10136[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5020(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5021(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
