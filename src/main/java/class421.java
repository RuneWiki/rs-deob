import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class421 extends class305 implements class714 {
   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "I"
   )
   private int field6131 = -1;
   @OriginalMember(
      owner = "client!ns",
      name = "J",
      descriptor = "I"
   )
   private int field6130 = -1;
   @OriginalMember(
      owner = "client!ns",
      name = "G",
      descriptor = "Lrk;"
   )
   private class35 field6126;
   @OriginalMember(
      owner = "client!ns",
      name = "H",
      descriptor = "I"
   )
   public int field6137;
   @OriginalMember(
      owner = "client!ns",
      name = "I",
      descriptor = "I"
   )
   public int field6138;
   @OriginalMember(
      owner = "client!ns",
      name = "K",
      descriptor = "I"
   )
   private int field6139;
   @OriginalMember(
      owner = "client!ns",
      name = "B",
      descriptor = "I"
   )
   private int field6127;
   @OriginalMember(
      owner = "client!ns",
      name = "v",
      descriptor = "I"
   )
   private int field6136;
   @OriginalMember(
      owner = "client!ns",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6143 = new String[]{method3203(method3202("\u0004\u001e&*)\u0004\fd%:\u000fE")), method3203(method3202("\u0011C&b=")), method3203(method3202("\u0004\u0018d ")), method3203(method3202("\u0004\u001e&\rh")), method3203(method3202("\u0004\u001e&p)\u0004\u0004|rh")), method3203(method3202("\u0004\u001e&\u000fh")), method3203(method3202("\u0004\u001e&\bh")), method3203(method3202("\u0004\u001e&\th")), method3203(method3202("\u0004\u001e&\u000eh"))};
   @OriginalMember(
      owner = "client!ns",
      name = "y",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6142 = new String[100];
   @OriginalMember(
      owner = "client!ns",
      name = "A",
      descriptor = "Lej;"
   )
   public static class133 field6132 = new class133();
   @OriginalMember(
      owner = "client!ns",
      name = "F",
      descriptor = "I"
   )
   public static int field6128;
   @OriginalMember(
      owner = "client!ns",
      name = "w",
      descriptor = "I"
   )
   public static int field6134;
   @OriginalMember(
      owner = "client!ns",
      name = "x",
      descriptor = "I"
   )
   public static int field6135;
   @OriginalMember(
      owner = "client!ns",
      name = "C",
      descriptor = "I"
   )
   public static int field6140;
   @OriginalMember(
      owner = "client!ns",
      name = "L",
      descriptor = "I"
   )
   public static int field6141;
   @OriginalMember(
      owner = "client!ns",
      name = "E",
      descriptor = "Lhw;"
   )
   public static class141 field6129;
   @OriginalMember(
      owner = "client!ns",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field6133;

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public final void method96(int arg0) {
      try {
         OpenGL.glFramebufferRenderbufferEXT(this.field6130, this.field6131, 36161, 0);
         ++field6141;
         this.field6131 = -1;
         this.field6130 = -1;
         int var2 = -22 / ((6 - arg0) / 46);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6143[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "finalize",
      descriptor = "()V",
      line = 19
   )
   protected final void finalize() throws Throwable {
      try {
         this.method3199(-4349);
         ++field6135;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6143[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(Luda;I)Lco;",
      line = 33
   )
   public static final class130 method3198(class473 arg0, int arg1) {
      try {
         ++field6140;
         if (arg1 != -1) {
            method3200(-101);
         }

         int var2 = arg0.method3565(true);
         return new class130(var2);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6143[3] + (arg0 != null ? field6143[1] : field6143[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "i",
      descriptor = "(I)V",
      line = 49
   )
   public final void method3199(int arg0) {
      try {
         ++field6128;
         if (~this.field6127 < -1) {
            this.field6126.method413(this.field6136, this.field6127, true);
            this.field6127 = 0;
         }

         if (arg0 != -4349) {
            method3198((class473)null, -114);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6143[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "h",
      descriptor = "(I)V",
      line = 67
   )
   public static void method3200(int arg0) {
      try {
         field6133 = null;
         field6132 = null;
         field6129 = null;
         field6142 = null;
         if (arg0 != 36161) {
            method3198((class473)null, 14);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6143[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "<init>",
      descriptor = "(Lrk;III)V",
      line = 109
   )
   public class421(class35 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field6126 = arg0;
         this.field6137 = arg2;
         this.field6138 = arg3;
         this.field6139 = arg1;
         OpenGL.glGenRenderbuffersEXT(1, class583.field8440, 0);
         this.field6127 = class583.field8440[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field6127);
         OpenGL.glRenderbufferStorageEXT(36161, this.field6139, this.field6137, this.field6138);
         this.field6136 = this.field6138 * this.field6137 * this.field6126.method373(this.field6139, 34023);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6143[4] + (arg0 != null ? field6143[1] : field6143[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "<init>",
      descriptor = "(Lrk;IIII)V",
      line = 127
   )
   public class421(class35 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field6138 = arg3;
         this.field6126 = arg0;
         this.field6137 = arg2;
         this.field6139 = arg1;
         OpenGL.glGenRenderbuffersEXT(1, class583.field8440, 0);
         this.field6127 = class583.field8440[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field6127);
         OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6139, this.field6137, this.field6138);
         this.field6136 = this.field6138 * this.field6137 * this.field6126.method373(this.field6139, 34023);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6143[4] + (arg0 != null ? field6143[1] : field6143[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(IBI)V",
      line = 85
   )
   public final void method3201(int arg0, byte arg1, int arg2) {
      try {
         ++field6134;
         int var4 = 95 % ((11 - arg1) / 59);
         OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field6127);
         this.field6131 = arg2;
         this.field6130 = arg0;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6143[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
