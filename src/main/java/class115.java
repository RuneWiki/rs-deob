import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class115 extends class81 {
   @OriginalMember(
      owner = "client!er",
      name = "g",
      descriptor = "I"
   )
   private int field1372;
   @OriginalMember(
      owner = "client!er",
      name = "l",
      descriptor = "Lck;"
   )
   private class667 field1375;
   @OriginalMember(
      owner = "client!er",
      name = "k",
      descriptor = "I"
   )
   private int field1371;
   @OriginalMember(
      owner = "client!er",
      name = "j",
      descriptor = "I"
   )
   private int field1368;
   @OriginalMember(
      owner = "client!er",
      name = "p",
      descriptor = "I"
   )
   private int field1377;
   @OriginalMember(
      owner = "client!er",
      name = "o",
      descriptor = "I"
   )
   private int field1378;
   @OriginalMember(
      owner = "client!er",
      name = "f",
      descriptor = "I"
   )
   private int field1373;
   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1384 = new String[]{method963(method962("d#H\u0015+")), method963(method962("d#H\u0012+")), method963(method962("z\u007fHx~")), method963(method962("d#Hjjo8\u0012h+")), method963(method962("o$\n:")), method963(method962("d#H\u0013+"))};
   @OriginalMember(
      owner = "client!er",
      name = "m",
      descriptor = "[F"
   )
   public static float[] field1369 = new float[4];
   @OriginalMember(
      owner = "client!er",
      name = "q",
      descriptor = "Lsd;"
   )
   public static class101 field1380 = new class101(114, 1);
   @OriginalMember(
      owner = "client!er",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field1381 = new int[1024];
   @OriginalMember(
      owner = "client!er",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field1383 = new int[2];
   @OriginalMember(
      owner = "client!er",
      name = "r",
      descriptor = "I"
   )
   public static int field1376;
   @OriginalMember(
      owner = "client!er",
      name = "h",
      descriptor = "I"
   )
   public static int field1379;
   @OriginalMember(
      owner = "client!er",
      name = "u",
      descriptor = "I"
   )
   public static int field1382;
   @OriginalMember(
      owner = "client!er",
      name = "s",
      descriptor = "Lqaa;"
   )
   public static class29 field1370;
   @OriginalMember(
      owner = "client!er",
      name = "n",
      descriptor = "Lvu;"
   )
   private class355 field1374;

   @OriginalMember(
      owner = "client!er",
      name = "b",
      descriptor = "(Z)Lvu;"
   )
   public final class355 method758(boolean arg0) {
      int var2 = client.field4530;

      try {
         ++field1379;
         if (arg0) {
            field1383 = null;
         }

         if (this.field1374 == null) {
            class160 var3;
            byte var4;
            int var5;
            int var9;
            label88: {
               class230.field2934[4] = this.field1377;
               class230.field2934[5] = this.field1378;
               class230.field2934[2] = this.field1373;
               class230.field2934[1] = this.field1371;
               class230.field2934[3] = this.field1368;
               class230.field2934[0] = this.field1372;
               var3 = this.field1375.field813;
               var4 = 0;
               var5 = 0;
               int var6 = 0;
               if (var2 != 0) {
                  if (!var3.method1165(class230.field2934[var6], -23239)) {
                     return null;
                  }
               } else if (~var6 <= -7) {
                  var9 = 0;
                  if (var2 == 0) {
                     break label88;
                  }
               } else if (!var3.method1165(class230.field2934[var6], -23239)) {
                  return null;
               }

               while(true) {
                  class327 var7 = var3.method1159(class230.field2934[var6], 125);
                  int var8 = !var7.field4646 ? 128 : 64;
                  if (~var7.field4634 < -1) {
                     var4 = 1;
                  }

                  if (var8 > var5) {
                     var5 = var8;
                  }

                  ++var6;
                  if (~var6 <= -7) {
                     var9 = 0;
                     if (var2 == 0) {
                        break;
                     }
                  } else if (!var3.method1165(class230.field2934[var6], -23239)) {
                     return null;
                  }
               }
            }

            if (var2 != 0) {
               class198.field2463[var9] = var3.method1166((byte)89, 1.0F, var5, var5, false, class230.field2934[var9]);
               ++var9;
            }

            while(true) {
               while(var9 < 6) {
                  class198.field2463[var9] = var3.method1166((byte)89, 1.0F, var5, var5, false, class230.field2934[var9]);
                  ++var9;
               }

               if (var2 == 0) {
                  this.field1374 = new class355(this.field1375, 6407, var5, ~var4 != -1, class198.field2463);
                  break;
               }

               ++var9;
            }
         }

         return this.field1374;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1384[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "b",
      descriptor = "(I)[Lgl;"
   )
   public static final class625[] method960(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method961(int arg0) {
      try {
         field1370 = null;
         field1383 = null;
         field1380 = null;
         field1381 = null;
         int var1 = -14 % ((-33 - arg0) / 47);
         field1369 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1384[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "<init>",
      descriptor = "(Lck;IIIIII)V"
   )
   public class115(class667 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field1372 = arg1;
         this.field1375 = arg0;
         this.field1371 = arg2;
         this.field1368 = arg4;
         this.field1377 = arg5;
         this.field1378 = arg6;
         this.field1373 = arg3;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field1384[3] + (arg0 != null ? field1384[2] : field1384[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method962(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method963(char[] arg0) {
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
            var10005 = 81;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
