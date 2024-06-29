import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class212 extends class486 {
   @OriginalMember(
      owner = "client!wfa",
      name = "v",
      descriptor = "I"
   )
   private int field3022;
   @OriginalMember(
      owner = "client!wfa",
      name = "C",
      descriptor = "I"
   )
   private int field3027;
   @OriginalMember(
      owner = "client!wfa",
      name = "y",
      descriptor = "I"
   )
   public int field3028;
   @OriginalMember(
      owner = "client!wfa",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3035 = new String[]{method1680(method1679("Z=#K")), method1680(method1679("Ofa\t\u0000")), method1680(method1679("C..\tA]&&SC\u001c")), method1680(method1679("C..\t9\u001c")), method1680(method1679("C..\t?\u001c")), method1680(method1679("C..\t<\u001c")), method1680(method1679("C..\t>\u001c"))};
   @OriginalMember(
      owner = "client!wfa",
      name = "x",
      descriptor = "Lgj;"
   )
   public static class663 field3023 = new class663();
   @OriginalMember(
      owner = "client!wfa",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field3030 = new String[8];
   @OriginalMember(
      owner = "client!wfa",
      name = "t",
      descriptor = "I"
   )
   public static int field3032 = 0;
   @OriginalMember(
      owner = "client!wfa",
      name = "A",
      descriptor = "Lek;"
   )
   public static class536 field3031 = new class536(56, 8);
   @OriginalMember(
      owner = "client!wfa",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field3034 = new int[1];
   @OriginalMember(
      owner = "client!wfa",
      name = "u",
      descriptor = "I"
   )
   public static int field3024;
   @OriginalMember(
      owner = "client!wfa",
      name = "s",
      descriptor = "I"
   )
   public static int field3025;
   @OriginalMember(
      owner = "client!wfa",
      name = "D",
      descriptor = "I"
   )
   public static int field3026;
   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field3033;
   @OriginalMember(
      owner = "client!wfa",
      name = "w",
      descriptor = "[[B"
   )
   public static byte[][] field3029;

   @OriginalMember(
      owner = "client!wfa",
      name = "<init>",
      descriptor = "(Lea;II)V",
      line = 3
   )
   public class212(class573 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(III)I",
      line = 21
   )
   public static final int method1675(int arg0, int arg1, int arg2) {
      try {
         ++field3026;
         if (arg2 != 1 && arg2 != 3) {
            if (arg1 != -11765) {
               field3034 = null;
            }

            return class438.field6257[3 & arg0];
         } else {
            return class356.field4785[3 & arg0];
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3035[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(IIIII)V",
      line = 35
   )
   public final void method1676(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg1 <= 67) {
            this.method1676(48, -117, -58, 110, -65);
         }

         OpenGL.glFramebufferTexture2DEXT(arg4, arg2, arg3, super.field6931, arg0);
         ++field3025;
         this.field3027 = arg4;
         this.field3022 = arg2;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3035[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "<init>",
      descriptor = "(Lea;IIZ[[I)V",
      line = 50
   )
   public class212(class573 param1, int param2, int param3, boolean param4, int[][] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(Z)V",
      line = 82
   )
   public static void method1677(boolean arg0) {
      try {
         field3029 = null;
         field3034 = null;
         field3023 = null;
         field3030 = null;
         if (arg0) {
            method1677(true);
         }

         field3031 = null;
         field3033 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3035[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(I)V",
      line = 97
   )
   public final void method1678(int arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field3027, this.field3022, 3553, 0, arg0);
         ++field3024;
         this.field3022 = -1;
         this.field3027 = -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3035[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "<init>",
      descriptor = "(Lea;IIZ[[BI)V",
      line = 119
   )
   public class212(class573 param1, int param2, int param3, boolean param4, byte[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1679(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1680(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
