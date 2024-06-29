import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public abstract class class404 extends class294 {
   @OriginalMember(
      owner = "client!lja",
      name = "x",
      descriptor = "I"
   )
   public int field6312;
   @OriginalMember(
      owner = "client!lja",
      name = "s",
      descriptor = "I"
   )
   private int field6315;
   @OriginalMember(
      owner = "client!lja",
      name = "q",
      descriptor = "I"
   )
   private int field6313;
   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "F"
   )
   public float field6319;
   @OriginalMember(
      owner = "client!lja",
      name = "r",
      descriptor = "I"
   )
   public int field6314;
   @OriginalMember(
      owner = "client!lja",
      name = "p",
      descriptor = "I"
   )
   public int field6301;
   @OriginalMember(
      owner = "client!lja",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6320 = new String[]{method3256(method3255("AYILR\u0005")), method3256(method3255("AYIL_\u0005")), method3256(method3255("AYILZ\u0005")), method3256(method3255("CFD\u000e")), method3256(method3255("V\u001d\u0006Lh")), method3256(method3255("AYILS\u0005")), method3256(method3255("AYILX\u0005")), method3256(method3255("AYIL^\u0005")), method3256(method3255("AYIL)D]A\u0016+\u0005")), method3256(method3255("AYIL\\\u0005")), method3256(method3255("AYILY\u0005")), method3256(method3255("AYIL]\u0005")), method3256(method3255("AYIL[\u0005"))};
   @OriginalMember(
      owner = "client!lja",
      name = "A",
      descriptor = "I"
   )
   public static int field6307 = 0;
   @OriginalMember(
      owner = "client!lja",
      name = "v",
      descriptor = "Ljw;"
   )
   public static class779 field6308 = new class779(7, 0, 1, 1);
   @OriginalMember(
      owner = "client!lja",
      name = "y",
      descriptor = "Lfja;"
   )
   public static class4 field6318 = new class4();
   @OriginalMember(
      owner = "client!lja",
      name = "u",
      descriptor = "I"
   )
   public static int field6302;
   @OriginalMember(
      owner = "client!lja",
      name = "o",
      descriptor = "I"
   )
   public static int field6303;
   @OriginalMember(
      owner = "client!lja",
      name = "E",
      descriptor = "I"
   )
   public static int field6304;
   @OriginalMember(
      owner = "client!lja",
      name = "t",
      descriptor = "I"
   )
   public static int field6305;
   @OriginalMember(
      owner = "client!lja",
      name = "D",
      descriptor = "I"
   )
   public static int field6306;
   @OriginalMember(
      owner = "client!lja",
      name = "m",
      descriptor = "I"
   )
   public static int field6309;
   @OriginalMember(
      owner = "client!lja",
      name = "w",
      descriptor = "I"
   )
   public static int field6310;
   @OriginalMember(
      owner = "client!lja",
      name = "C",
      descriptor = "I"
   )
   public static int field6311;
   @OriginalMember(
      owner = "client!lja",
      name = "n",
      descriptor = "I"
   )
   public static int field6316;
   @OriginalMember(
      owner = "client!lja",
      name = "B",
      descriptor = "Lrr;"
   )
   public static class678 field6317;

   @OriginalMember(
      owner = "client!lja",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3245(int arg0) {
      try {
         field6308 = null;
         int var1 = 107 % ((64 - arg0) / 44);
         field6318 = null;
         field6317 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6320[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method3246(byte arg0) {
      try {
         ++field6309;
         return arg0 != -127 ? 67 : this.field6312;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6320[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(BF)V"
   )
   public abstract void method151(byte arg0, float arg1);

   @OriginalMember(
      owner = "client!lja",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method3247(byte arg0) {
      try {
         if (arg0 >= -108) {
            method3250((Canvas)null, 126);
         }

         ++field6316;
         return this.field6314;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6320[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(IIIIIII)Z"
   )
   public static final boolean method3248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field6311;
         int var7 = arg1 + arg3;
         int var8 = arg0 + arg5;
         int var9 = arg2 + arg6;
         if (!class355.method2909(var8, var8, var8, arg3, var9, var9, arg2, var7, arg3, arg4)) {
            return false;
         } else if (!class355.method2909(var8, var8, var8, var7, var9, arg2, arg2, var7, arg3, arg4)) {
            return false;
         } else {
            if (class109.field1501 > arg3) {
               if (!class355.method2909(arg5, var8, var8, arg3, var9, arg2, var9, arg3, arg3, arg4)) {
                  return false;
               }

               if (!class355.method2909(arg5, arg5, var8, arg3, arg2, arg2, var9, arg3, arg3, 0)) {
                  return false;
               }
            } else {
               if (!class355.method2909(arg5, var8, var8, var7, var9, arg2, var9, var7, var7, arg4)) {
                  return false;
               }

               if (!class355.method2909(arg5, arg5, var8, var7, arg2, arg2, var9, var7, var7, arg4)) {
                  return false;
               }
            }

            if (class228.field3491 <= arg2) {
               if (!class355.method2909(arg5, var8, var8, arg3, var9, var9, var9, var7, arg3, arg4)) {
                  return false;
               }

               if (!class355.method2909(arg5, arg5, var8, var7, var9, var9, var9, var7, arg3, 0)) {
                  return false;
               }
            } else {
               if (!class355.method2909(arg5, var8, var8, arg3, arg2, arg2, arg2, var7, arg3, 0)) {
                  return false;
               }

               if (!class355.method2909(arg5, arg5, var8, var7, arg2, arg2, arg2, var7, arg3, arg4)) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field6320[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public abstract void method152(int arg0, int arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method3249(byte arg0) {
      try {
         if (arg0 < 1) {
            return -81;
         } else {
            ++field6310;
            return this.field6315;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6320[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;I)V"
   )
   public static final void method3250(Canvas arg0, int arg1) {
      try {
         ++field6303;
         Dimension var2 = arg0.getSize();
         class6.method26(false, var2.width, var2.height);
         if (~class67.field883 == arg1) {
            class450.field6888.method647(arg0, class790.field11557, class63.field837);
         } else {
            class450.field6888.method647(arg0, class86.field1255, class208.field3176);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6320[7] + (arg0 != null ? field6320[4] : field6320[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3251(int arg0) {
      try {
         ++field6302;
         if (arg0 != 0) {
            this.field6319 = 0.5058553F;
         }

         return this.field6313;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6320[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(B)F"
   )
   public final float method3252(byte arg0) {
      try {
         if (arg0 >= -92) {
            return 0.8336962F;
         } else {
            ++field6305;
            return this.field6319;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6320[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3253(int arg0) {
      try {
         if (arg0 != 0) {
            this.method3249((byte)-121);
         }

         ++field6304;
         return this.field6301;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6320[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(IIILka;I)Lil;"
   )
   public static final class680 method3254(int arg0, int arg1, int arg2, class91 arg3, int arg4) {
      try {
         ++field6306;
         if (arg3 == null) {
            return null;
         } else {
            int var5 = 103 % ((arg0 - -54) / 54);
            return new class680(arg4, arg2, arg1, arg3.method891(), arg3.method902(), arg3.method876(), arg3.method911(), arg3.method871(), arg3.method918(), arg3.method866());
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6320[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6320[4] : field6320[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class404(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         this.field6312 = arg0;
         this.field6315 = arg3;
         this.field6313 = arg4;
         this.field6319 = arg5;
         this.field6314 = arg2;
         this.field6301 = arg1;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6320[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3255(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3256(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
