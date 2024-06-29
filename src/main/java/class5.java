import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class5 implements class726 {
   @OriginalMember(
      owner = "client!ug",
      name = "e",
      descriptor = "[F"
   )
   public float[] field25;
   @OriginalMember(
      owner = "client!ug",
      name = "d",
      descriptor = "I"
   )
   public int field26;
   @OriginalMember(
      owner = "client!ug",
      name = "c",
      descriptor = "I"
   )
   public int field30;
   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field31 = new String[]{method23(method22("`'^&a")), method23(method22("nn^I4")), method23(method22("`'^%a")), method23(method22("{5\u001c\u000b")), method23(method22("`'^[ {)\u0004Ya"))};
   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "J"
   )
   public static long field28 = 0L;
   @OriginalMember(
      owner = "client!ug",
      name = "f",
      descriptor = "I"
   )
   public static int field24;
   @OriginalMember(
      owner = "client!ug",
      name = "g",
      descriptor = "I"
   )
   public static int field27;
   @OriginalMember(
      owner = "client!ug",
      name = "b",
      descriptor = "I"
   )
   public static int field29;

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public static final void method20(byte arg0) {
      try {
         class592.field8724 = null;
         class237.field3607 = null;
         class767.field11325 = null;
         class291.field4589 = null;
         if (arg0 == -68) {
            class516.field7847 = null;
            class610.field8880 = null;
            ++field27;
            class360.field5564 = null;
            class11.field133 = null;
            class652.field9505 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field31[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(Lcka;II[B)Lcca;",
      line = 27
   )
   public static final class129 method21(class174 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field29;
         if (arg3 == null) {
            return null;
         } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg3);
            OpenGL.glGetIntegerv(34379, class797.field11600, 0);
            int var5 = -119 % ((-6 - arg1) / 50);
            if (class797.field11600[0] != -1) {
               OpenGL.glBindProgramARB(arg2, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg2, 0);
               return new class129(arg0, arg2, var4);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field31[2] + (arg0 != null ? field31[1] : field31[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field31[1] : field31[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "<init>",
      descriptor = "(II)V",
      line = 60
   )
   public class5(int arg0, int arg1) {
      try {
         this.field25 = new float[arg0 * arg1];
         this.field26 = arg0;
         this.field30 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field31[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method22(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method23(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
