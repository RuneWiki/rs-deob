import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class355 extends class689 {
   @OriginalMember(
      owner = "client!vu",
      name = "F",
      descriptor = "I"
   )
   private int field5381;
   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "I"
   )
   private int field5379;
   @OriginalMember(
      owner = "client!vu",
      name = "E",
      descriptor = "I"
   )
   public int field5386;
   @OriginalMember(
      owner = "client!vu",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5388 = new String[]{method2776(method2775("R\u001e.Z")), method2776(method2775("GEl\u0018\u0002")), method2776(method2775("J\u001el\n\u0016R\u00026\bW")), method2776(method2775("J\u001elzW")), method2776(method2775("J\u001el|W")), method2776(method2775("J\u001elxW")), method2776(method2775("J\u001el\u007fW")), method2776(method2775("J\u001el}W"))};
   @OriginalMember(
      owner = "client!vu",
      name = "A",
      descriptor = "I"
   )
   public static int field5380 = 0;
   @OriginalMember(
      owner = "client!vu",
      name = "G",
      descriptor = "Lqb;"
   )
   public static class234 field5382 = new class234(2);
   @OriginalMember(
      owner = "client!vu",
      name = "y",
      descriptor = "I"
   )
   public static int field5383;
   @OriginalMember(
      owner = "client!vu",
      name = "D",
      descriptor = "I"
   )
   public static int field5384;
   @OriginalMember(
      owner = "client!vu",
      name = "C",
      descriptor = "I"
   )
   public static int field5385;
   @OriginalMember(
      owner = "client!vu",
      name = "I",
      descriptor = "I"
   )
   public static int field5387;

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public final void method117(byte arg0) {
      try {
         ++field5383;
         OpenGL.glFramebufferTexture2DEXT(this.field5381, this.field5379, 3553, 0, 0);
         this.field5379 = -1;
         int var2 = 61 / ((arg0 - 26) / 55);
         this.field5381 = -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5388[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "<init>",
      descriptor = "(Lck;II)V",
      line = 16
   )
   public class355(class667 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(IBIII)V",
      line = 36
   )
   public final void method2771(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         OpenGL.glFramebufferTexture2DEXT(arg4, arg2, arg3, super.field10388, arg0);
         ++field5384;
         this.field5379 = arg2;
         this.field5381 = arg4;
         int var6 = -73 % ((31 - arg1) / 51);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5388[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "<init>",
      descriptor = "(Lck;IIZ[[I)V",
      line = 55
   )
   public class355(class667 param1, int param2, int param3, boolean param4, int[][] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(ILhv;II)V",
      line = 87
   )
   public static final void method2772(int arg0, class544 arg1, int arg2, int arg3) {
      try {
         ++field5387;
         if (class331.field4741 == null && !class750.field11111) {
            if (arg1 != null && class581.method4280(true, arg1) != null) {
               class331.field4741 = arg1;
               class741.field11002 = class581.method4280(true, arg1);
               class213.field2708 = false;
               class204.field2630 = 0;
               class430.field6583 = arg2;
               class64.field792 = arg3;
               if (arg0 != 6691) {
                  field5382 = null;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5388[7] + arg0 + ',' + (arg1 != null ? field5388[1] : field5388[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "<init>",
      descriptor = "(Lck;IIZ[[BI)V",
      line = 134
   )
   public class355(class667 param1, int param2, int param3, boolean param4, byte[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vu",
      name = "e",
      descriptor = "(B)V",
      line = 112
   )
   public static void method2773(byte arg0) {
      try {
         int var1 = -106 % ((arg0 - 79) / 43);
         field5382 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5388[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(II)V",
      line = 121
   )
   public static final void method2774(int arg0, int arg1) {
      try {
         ++field5385;
         class403 var2 = class453.method3410((long)arg1, true, arg0);
         var2.method3096((byte)85);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5388[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2775(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2776(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
