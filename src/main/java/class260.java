import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class260 extends class629 {
   @OriginalMember(
      owner = "client!kw",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3678 = new String[]{method2087(method2086("@ |\u001bSah~\u0010[c!q\u001a\u0016u)t\u0013Swr")), method2087(method2086("}=q\u0013")), method2087(method2086("hf3QK")), method2087(method2086("x?32\u001e")), method2087(method2086("x?35\u001e"))};
   @OriginalMember(
      owner = "client!kw",
      name = "D",
      descriptor = "I"
   )
   public static int field3676;
   @OriginalMember(
      owner = "client!kw",
      name = "E",
      descriptor = "I"
   )
   public static int field3677;

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(ILbba;B[B)Lpaa;",
      line = 4
   )
   public static final class648 method2084(int arg0, class124 arg1, byte arg2, byte[] arg3) {
      try {
         ++field3677;
         if (arg3 != null && ~arg3.length != -1) {
            long var4 = OpenGL.glCreateShaderObjectARB(arg0);
            OpenGL.glShaderSourceRawARB(var4, arg3);
            if (arg2 != 116) {
               return null;
            } else {
               OpenGL.glCompileShaderARB(var4);
               OpenGL.glGetObjectParameterivARB(var4, 35713, class597.field8619, 0);
               if (class597.field8619[0] == 0) {
                  if (~class597.field8619[0] == -1) {
                     System.out.println(field3678[0]);
                  }

                  OpenGL.glGetObjectParameterivARB(var4, 35716, class597.field8619, 1);
                  if (class597.field8619[1] > 1) {
                     byte[] var6 = new byte[class597.field8619[1]];
                     OpenGL.glGetInfoLogARB(var4, class597.field8619[1], class597.field8619, 0, var6, 0);
                     System.out.println(new String(var6));
                  }

                  if (~class597.field8619[0] == -1) {
                     OpenGL.glDeleteObjectARB(var4);
                     return null;
                  }
               }

               return new class648(arg1, var4, arg0);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3678[3] + arg0 + ',' + (arg1 != null ? field3678[2] : field3678[1]) + ',' + arg2 + ',' + (arg3 != null ? field3678[2] : field3678[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "<init>",
      descriptor = "()V",
      line = 47
   )
   public class260() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!kw",
      name = "b",
      descriptor = "(II)[I",
      line = 52
   )
   public final int[] method45(int arg0, int arg1) {
      try {
         if (arg1 != 2048) {
            return null;
         } else {
            ++field3676;
            int[] var3 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               class365.method2852(var3, 0, class66.field1214, class442.field6448[arg0]);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3678[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(Lr;III[Z)V",
      line = 75
   )
   public static final void method2085(class192 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (class455.field6647 != class269.field3810) {
         int var5 = class530.field7721[arg1].method2287(-97, arg3, arg2);

         for(int var6 = 0; var6 <= arg1; ++var6) {
            if (arg4 == null || arg4[var6]) {
               class293 var7 = class530.field7721[var6];
               if (var7 != null) {
                  var7.method2288(arg0, arg2, var5 - var7.method2287(-81, arg3, arg2), arg3, 0, false);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2086(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2087(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
