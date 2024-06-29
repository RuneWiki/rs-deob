import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class792 extends class719 {
   @OriginalMember(
      owner = "client!ht",
      name = "x",
      descriptor = "I"
   )
   private int field11530;
   @OriginalMember(
      owner = "client!ht",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11534 = new String[]{method5717(method5716("V_q7p")), method5717(method5716("V_q4p")), method5717(method5716("V_qI1PB+Kp")), method5717(method5716("E\u0005q[%")), method5717(method5716("P^3\u0019")), method5717(method5716("V_q6p"))};
   @OriginalMember(
      owner = "client!ht",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field11531 = new int[13];
   @OriginalMember(
      owner = "client!ht",
      name = "v",
      descriptor = "Liw;"
   )
   public static class107 field11528 = new class107(64);
   @OriginalMember(
      owner = "client!ht",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field11533 = new int[]{2047, 16383, 65535};
   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "I"
   )
   public static int field11529;
   @OriginalMember(
      owner = "client!ht",
      name = "w",
      descriptor = "I"
   )
   public static int field11532;

   @OriginalMember(
      owner = "client!ht",
      name = "<init>",
      descriptor = "(Laea;II[BI)V"
   )
   public class792(class678 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      super(arg0, 3552, arg1, arg2, false);

      try {
         this.field11530 = arg2;
         super.field10293.method4906(-2, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage1Dub(super.field10295, 0, super.field10288, this.field11530, 0, arg4, 5121, arg3, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5204(true, -1);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11534[2] + (arg0 != null ? field11534[3] : field11534[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11534[3] : field11534[4]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method69(int arg0) {
      try {
         ++field11529;
         if (arg0 != -4249) {
            this.method5714(true, -25);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11534[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "c",
      descriptor = "(ZI)V"
   )
   public final void method5714(boolean arg0, int arg1) {
      try {
         if (arg1 >= -60) {
            field11531 = null;
         }

         ++field11532;
         super.field10293.method4906(-2, this);
         OpenGL.glTexParameteri(super.field10295, 10242, arg0 ? 10497 : 33071);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11534[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5715(int arg0) {
      try {
         field11528 = null;
         field11533 = null;
         field11531 = null;
         int var1 = -12 % ((-26 - arg0) / 42);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11534[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5716(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5717(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
