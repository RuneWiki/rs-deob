import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class274 extends class549 {
   @OriginalMember(
      owner = "client!md",
      name = "G",
      descriptor = "I"
   )
   private int field3505 = -1;
   @OriginalMember(
      owner = "client!md",
      name = "H",
      descriptor = "I"
   )
   private int field3504 = -1;
   @OriginalMember(
      owner = "client!md",
      name = "y",
      descriptor = "I"
   )
   public int field3499;
   @OriginalMember(
      owner = "client!md",
      name = "E",
      descriptor = "I"
   )
   public int field3502;
   @OriginalMember(
      owner = "client!md",
      name = "x",
      descriptor = "I"
   )
   public int field3496;
   @OriginalMember(
      owner = "client!md",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3508 = new String[]{method2169(method2168("Y;F\u0004")), method2169(method2168("L`\u0004F~")), method2169(method2168("Z*\u0004TjY'^V+")), method2169(method2168("Z*\u0004)+")), method2169(method2168("Z*\u0004-+")), method2169(method2168("Z*\u0004,+")), method2169(method2168("Z*\u0004*+")), method2169(method2168("Z*\u0004++"))};
   @OriginalMember(
      owner = "client!md",
      name = "D",
      descriptor = "I"
   )
   public static int field3506 = 0;
   @OriginalMember(
      owner = "client!md",
      name = "w",
      descriptor = "Laka;"
   )
   public static class418 field3497 = new class418(22, -1);
   @OriginalMember(
      owner = "client!md",
      name = "A",
      descriptor = "I"
   )
   public static int field3495;
   @OriginalMember(
      owner = "client!md",
      name = "I",
      descriptor = "I"
   )
   public static int field3498;
   @OriginalMember(
      owner = "client!md",
      name = "F",
      descriptor = "I"
   )
   public static int field3500;
   @OriginalMember(
      owner = "client!md",
      name = "B",
      descriptor = "I"
   )
   public static int field3501;
   @OriginalMember(
      owner = "client!md",
      name = "C",
      descriptor = "I"
   )
   public static int field3503;
   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "I"
   )
   public static int field3507;

   @OriginalMember(
      owner = "client!md",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method2164(byte arg0) {
      try {
         field3497 = null;
         if (arg0 != 4) {
            field3506 = -22;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3508[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method2165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field3498;
         super.field8096.method4006(this, (byte)-121);
         OpenGL.glCopyTexSubImage3D(super.field8090, arg6, arg7, arg0, arg2, arg1, arg3, arg4, arg5);
         OpenGL.glFlush();
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3508[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method970(byte arg0) {
      try {
         ++field3495;
         OpenGL.glFramebufferTexture3DEXT(this.field3505, this.field3504, super.field8090, 0, 0, 0);
         this.field3505 = -1;
         if (arg0 > -12) {
            method2167(95);
         }

         this.field3504 = -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3508[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "<init>",
      descriptor = "(Liu;IIII)V"
   )
   public class274(class530 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);

      try {
         this.field3499 = arg4;
         this.field3502 = arg2;
         this.field3496 = arg3;
         super.field8096.method4006(this, (byte)62);
         OpenGL.glTexImage3Dub(super.field8090, 0, super.field8100, this.field3502, this.field3496, this.field3499, 0, class561.method4222(super.field8100, -111), 5121, (byte[])null, 0);
         this.method4157((byte)111, true);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3508[2] + (arg0 != null ? field3508[1] : field3508[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "<init>",
      descriptor = "(Liu;IIII[BI)V"
   )
   public class274(class530 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);

      try {
         this.field3502 = arg2;
         this.field3499 = arg4;
         this.field3496 = arg3;
         super.field8096.method4006(this, (byte)-128);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field8090, 0, super.field8100, this.field3502, this.field3496, this.field3499, 0, arg6, 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method4157((byte)111, true);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3508[2] + (arg0 != null ? field3508[1] : field3508[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3508[1] : field3508[0]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(IBI)Lko;"
   )
   public static final class327 method2166(int arg0, byte arg1, int arg2) {
      try {
         ++field3500;
         class327 var3 = new class327();
         var3.field4513 = arg0 + 5 - -1;
         var3.field4527 = arg2 + 1 + 5;
         var3.field4515 = -1;
         var3.field4518 = -1;
         var3.field4510 = new int[var3.field4513][var3.field4527];
         var3.method2596(9128);
         int var4 = 57 % ((1 - arg1) / 63);
         return var3;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3508[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method2167(int arg0) {
      try {
         if (arg0 != -1662) {
            method2164((byte)-47);
         }

         class100.field1320 = true;
         ++field3501;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3508[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2168(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2169(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
