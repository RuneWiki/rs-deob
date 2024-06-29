import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class681 extends class573 {
   @OriginalMember(
      owner = "client!fh",
      name = "x",
      descriptor = "I"
   )
   private int field9994;
   @OriginalMember(
      owner = "client!fh",
      name = "A",
      descriptor = "I"
   )
   private int field9995;
   @OriginalMember(
      owner = "client!fh",
      name = "y",
      descriptor = "I"
   )
   public int field10000;
   @OriginalMember(
      owner = "client!fh",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10002 = new String[]{method4984(method4983(";\t(I")), method4984(method4983(".Rj\u000b\f")), method4984(method4983("3\u0014j\u0019\u0018;\u00150\u001bY")), method4984(method4983("3\u0014jgY")), method4984(method4983("3\u0014jdY")), method4984(method4983("3\u0014jfY"))};
   @OriginalMember(
      owner = "client!fh",
      name = "w",
      descriptor = "I"
   )
   public static int field9996 = -1;
   @OriginalMember(
      owner = "client!fh",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field9999 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "I"
   )
   public static int field9997 = 1403;
   @OriginalMember(
      owner = "client!fh",
      name = "D",
      descriptor = "I"
   )
   public static int field10001;
   @OriginalMember(
      owner = "client!fh",
      name = "v",
      descriptor = "I"
   )
   public static int field9998;

   @OriginalMember(
      owner = "client!fh",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method4981(byte arg0) {
      try {
         field9999 = null;
         if (arg0 <= 5) {
            method4981((byte)-39);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10002[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "<init>",
      descriptor = "(Lor;IIZ[[I)V"
   )
   public class681(class670 param1, int param2, int param3, boolean param4, int[][] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method4982(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg4, super.field7882, arg1);
         ++field9998;
         if (arg3 <= -100) {
            this.field9995 = arg2;
            this.field9994 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10002[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "<init>",
      descriptor = "(Lor;IIZ[[BI)V"
   )
   public class681(class670 param1, int param2, int param3, boolean param4, byte[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fh",
      name = "<init>",
      descriptor = "(Lor;II)V"
   )
   public class681(class670 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method317(int arg0) {
      try {
         ++field10001;
         OpenGL.glFramebufferTexture2DEXT(this.field9994, this.field9995, 3553, 0, arg0);
         this.field9994 = -1;
         this.field9995 = -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10002[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4983(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4984(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
