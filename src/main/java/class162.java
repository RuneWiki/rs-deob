import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class162 extends class689 {
   @OriginalMember(
      owner = "client!as",
      name = "F",
      descriptor = "I"
   )
   private int field2037 = -1;
   @OriginalMember(
      owner = "client!as",
      name = "y",
      descriptor = "I"
   )
   private int field2041 = -1;
   @OriginalMember(
      owner = "client!as",
      name = "C",
      descriptor = "I"
   )
   public int field2044;
   @OriginalMember(
      owner = "client!as",
      name = "E",
      descriptor = "I"
   )
   public int field2039;
   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "I"
   )
   public int field2042;
   @OriginalMember(
      owner = "client!as",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2045 = new String[]{method1330(method1329("\u0007\u0014TSa")), method1330(method1329("\u0007\u0014TTa")), method1330(method1329("\u0007\u0014T! \b\u000e\u000e#a")), method1330(method1329("\b\u0012\u0016q")), method1330(method1329("\u001dIT34"))};
   @OriginalMember(
      owner = "client!as",
      name = "A",
      descriptor = "I"
   )
   public static int field2043 = 1401;
   @OriginalMember(
      owner = "client!as",
      name = "D",
      descriptor = "I"
   )
   public static int field2036;
   @OriginalMember(
      owner = "client!as",
      name = "G",
      descriptor = "I"
   )
   public static int field2038;
   @OriginalMember(
      owner = "client!as",
      name = "H",
      descriptor = "I"
   )
   public static int field2040;

   @OriginalMember(
      owner = "client!as",
      name = "<init>",
      descriptor = "(Lck;IIII)V",
      line = 6
   )
   public class162(class667 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);

      try {
         this.field2044 = arg2;
         this.field2039 = arg4;
         this.field2042 = arg3;
         super.field10381.method4818((byte)-116, this);
         OpenGL.glTexImage3Dub(super.field10376, 0, super.field10369, this.field2044, this.field2042, this.field2039, 0, class589.method4335(-106, super.field10369), 5121, (byte[])null, 0);
         this.method5012(true, -10161);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2045[2] + (arg0 != null ? field2045[4] : field2045[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "(B)V",
      line = 21
   )
   public final void method117(byte arg0) {
      try {
         ++field2040;
         int var2 = 4 / ((26 - arg0) / 55);
         OpenGL.glFramebufferTexture3DEXT(this.field2037, this.field2041, super.field10376, 0, 0, 0);
         this.field2037 = -1;
         this.field2041 = -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2045[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "<init>",
      descriptor = "(Lck;IIII[BI)V",
      line = 59
   )
   public class162(class667 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);

      try {
         this.field2044 = arg2;
         this.field2039 = arg4;
         this.field2042 = arg3;
         super.field10381.method4818((byte)-111, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field10376, 0, super.field10369, this.field2044, this.field2042, this.field2039, 0, arg6, 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5012(true, -10161);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2045[2] + (arg0 != null ? field2045[4] : field2045[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2045[4] : field2045[3]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "(ZIIIIIII)V",
      line = 40
   )
   public final void method1328(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (!arg0) {
            ++field2038;
            super.field10381.method4818((byte)87, this);
            OpenGL.glCopyTexSubImage3D(super.field10376, 0, arg5, arg3, arg2, arg1, arg7, arg4, arg6);
            OpenGL.glFlush();
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field2045[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1329(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1330(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
