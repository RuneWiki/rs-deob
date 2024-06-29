import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public class class352 extends class96 implements class491 {
   @OriginalMember(
      owner = "client!lka",
      name = "w",
      descriptor = "I"
   )
   private int field5217 = -1;
   @OriginalMember(
      owner = "client!lka",
      name = "r",
      descriptor = "I"
   )
   private int field5222 = -1;
   @OriginalMember(
      owner = "client!lka",
      name = "C",
      descriptor = "I"
   )
   private int field5218;
   @OriginalMember(
      owner = "client!lka",
      name = "A",
      descriptor = "I"
   )
   public int field5216;
   @OriginalMember(
      owner = "client!lka",
      name = "y",
      descriptor = "I"
   )
   public int field5221;
   @OriginalMember(
      owner = "client!lka",
      name = "B",
      descriptor = "Laea;"
   )
   private class678 field5213;
   @OriginalMember(
      owner = "client!lka",
      name = "x",
      descriptor = "I"
   )
   private int field5224;
   @OriginalMember(
      owner = "client!lka",
      name = "u",
      descriptor = "I"
   )
   private int field5219;
   @OriginalMember(
      owner = "client!lka",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5225 = new String[]{method2779(method2778("\u0000\u0004\u0006X\u000b")), method2779(method2778("\u0017AIXJ\u0012DA\u0002HS")), method2779(method2778("\u0015_D\u001a")), method2779(method2778("\u0017AIX7S")), method2779(method2778("\u0017AIX\u0010\u0012DI\u001a\u001f\u0001O\u0000")), method2779(method2778("\u0017AIX4S")), method2779(method2778("\u0017AIX5S"))};
   @OriginalMember(
      owner = "client!lka",
      name = "s",
      descriptor = "J"
   )
   public static volatile long field5214 = 0L;
   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "I"
   )
   public static int field5212;
   @OriginalMember(
      owner = "client!lka",
      name = "v",
      descriptor = "I"
   )
   public static int field5215;
   @OriginalMember(
      owner = "client!lka",
      name = "t",
      descriptor = "I"
   )
   public static int field5220;
   @OriginalMember(
      owner = "client!lka",
      name = "q",
      descriptor = "I"
   )
   public static int field5223;

   @OriginalMember(
      owner = "client!lka",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method2776(int arg0) {
      try {
         if (~this.field5224 < arg0) {
            this.field5213.method4942(this.field5219, arg0 + -28, this.field5224);
            this.field5224 = 0;
         }

         ++field5212;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5225[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2777(int arg0, int arg1, int arg2) {
      try {
         ++field5220;
         OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, arg1, this.field5224);
         this.field5222 = arg0;
         this.field5217 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5225[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field5215;
         this.method2776(-1);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5225[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method69(int arg0) {
      try {
         if (arg0 == -4249) {
            ++field5223;
            OpenGL.glFramebufferRenderbufferEXT(this.field5217, this.field5222, 36161, 0);
            this.field5217 = -1;
            this.field5222 = -1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5225[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "<init>",
      descriptor = "(Laea;III)V"
   )
   public class352(class678 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5218 = arg1;
         this.field5216 = arg3;
         this.field5221 = arg2;
         this.field5213 = arg0;
         OpenGL.glGenRenderbuffersEXT(1, class439.field6433, 0);
         this.field5224 = class439.field6433[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field5224);
         OpenGL.glRenderbufferStorageEXT(36161, this.field5218, this.field5221, this.field5216);
         this.field5219 = this.field5216 * this.field5221 * this.field5213.method4950(this.field5218, -6411);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5225[1] + (arg0 != null ? field5225[0] : field5225[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "<init>",
      descriptor = "(Laea;IIII)V"
   )
   public class352(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field5216 = arg3;
         this.field5218 = arg1;
         this.field5213 = arg0;
         this.field5221 = arg2;
         OpenGL.glGenRenderbuffersEXT(1, class439.field6433, 0);
         this.field5224 = class439.field6433[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field5224);
         OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field5218, this.field5221, this.field5216);
         this.field5219 = this.field5221 * this.field5216 * this.field5213.method4950(this.field5218, -6411);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5225[1] + (arg0 != null ? field5225[0] : field5225[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2778(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2779(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
