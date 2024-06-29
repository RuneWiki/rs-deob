import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class763 extends class719 {
   @OriginalMember(
      owner = "client!cfa",
      name = "v",
      descriptor = "I"
   )
   private int field10883;
   @OriginalMember(
      owner = "client!cfa",
      name = "x",
      descriptor = "I"
   )
   private int field10887;
   @OriginalMember(
      owner = "client!cfa",
      name = "B",
      descriptor = "I"
   )
   public int field10884;
   @OriginalMember(
      owner = "client!cfa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10888 = new String[]{method5510(method5509("Wi*i")), method5510(method5509("Zz'+1Pr/q3\u0011")), method5510(method5509("B2h+p")), method5510(method5509("Zz'+O\u0011")), method5510(method5509("Zz'+N\u0011")), method5510(method5509("Zz'+C\u0011")), method5510(method5509("Zz'+L\u0011"))};
   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "I"
   )
   public static int field10881;
   @OriginalMember(
      owner = "client!cfa",
      name = "w",
      descriptor = "I"
   )
   public static int field10882;
   @OriginalMember(
      owner = "client!cfa",
      name = "y",
      descriptor = "I"
   )
   public static int field10885;
   @OriginalMember(
      owner = "client!cfa",
      name = "A",
      descriptor = "Lma;"
   )
   public static class148 field10886;

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method69(int arg0) {
      try {
         OpenGL.glFramebufferTexture2DEXT(this.field10887, this.field10883, 3553, 0, 0);
         ++field10882;
         if (arg0 != -4249) {
            this.field10887 = -124;
         }

         this.field10883 = -1;
         this.field10887 = -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10888[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5506(byte arg0) {
      try {
         field10886 = null;
         if (arg0 != -57) {
            method5508(123, false);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10888[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "<init>",
      descriptor = "(Laea;IIZ[[BI)V"
   )
   public class763(class678 param1, int param2, int param3, boolean param4, byte[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method5507(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10885;
         OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.field10298, arg4);
         this.field10887 = arg1;
         this.field10883 = arg2;
         if (arg3 <= 81) {
            method5508(88, false);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10888[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "<init>",
      descriptor = "(Laea;IIZ[[I)V"
   )
   public class763(class678 param1, int param2, int param3, boolean param4, int[][] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "<init>",
      descriptor = "(Laea;II)V"
   )
   public class763(class678 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method5508(int arg0, boolean arg1) {
      try {
         ++field10881;
         int var2 = class217.field3113;
         if (~var2 != -1) {
            if (var2 == 1) {
               return class235.field3639;
            }

            if (~var2 != -3) {
               if (arg0 != 0) {
                  method5508(34, true);
               }

               return 0;
            }

            if (!client.field10022) {
               return 0;
            }
         }

         return arg1 ? 0 : class235.field3639;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10888[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5509(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5510(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
