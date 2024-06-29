import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class95 extends class707 {
   @OriginalMember(
      owner = "client!iia",
      name = "w",
      descriptor = "I"
   )
   private int field1534 = -1;
   @OriginalMember(
      owner = "client!iia",
      name = "t",
      descriptor = "I"
   )
   private int field1528 = -1;
   @OriginalMember(
      owner = "client!iia",
      name = "v",
      descriptor = "I"
   )
   public int field1529;
   @OriginalMember(
      owner = "client!iia",
      name = "u",
      descriptor = "I"
   )
   public int field1530;
   @OriginalMember(
      owner = "client!iia",
      name = "s",
      descriptor = "I"
   )
   public int field1533;
   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1535 = new String[]{method922(method921("?nW\u001d5~")), method922(method921("8rZ_")), method922(method921("-)\u0018\u001d\n")), method922(method921("?nW\u001dK?i_GI~")), method922(method921("?nW\u001d6~"))};
   @OriginalMember(
      owner = "client!iia",
      name = "r",
      descriptor = "I"
   )
   public static int field1531;
   @OriginalMember(
      owner = "client!iia",
      name = "x",
      descriptor = "I"
   )
   public static int field1532;

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 4
   )
   public final void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field1531;
         super.field10269.method252(this, (byte)-94);
         OpenGL.glCopyTexSubImage3D(super.field10277, 0, arg3, arg2, arg4, arg7, arg1, arg6, arg0);
         if (arg5 > -123) {
            this.field1529 = 60;
         }

         OpenGL.glFlush();
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1535[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "<init>",
      descriptor = "(Lrk;IIII)V",
      line = 18
   )
   public class95(class35 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);

      try {
         this.field1529 = arg2;
         this.field1530 = arg3;
         this.field1533 = arg4;
         super.field10269.method252(this, (byte)-92);
         OpenGL.glTexImage3Dub(super.field10277, 0, super.field10270, this.field1529, this.field1530, this.field1533, 0, class780.method5637(true, super.field10270), 5121, (byte[])null, 0);
         this.method5132(true, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1535[3] + (arg0 != null ? field1535[2] : field1535[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(I)V",
      line = 32
   )
   public final void method96(int arg0) {
      try {
         ++field1532;
         int var2 = -97 / ((6 - arg0) / 46);
         OpenGL.glFramebufferTexture3DEXT(this.field1534, this.field1528, super.field10277, 0, 0, 0);
         this.field1528 = -1;
         this.field1534 = -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1535[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "<init>",
      descriptor = "(Lrk;IIII[BI)V",
      line = 45
   )
   public class95(class35 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);

      try {
         this.field1533 = arg4;
         this.field1530 = arg3;
         this.field1529 = arg2;
         super.field10269.method252(this, (byte)-28);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field10277, 0, super.field10270, this.field1529, this.field1530, this.field1533, 0, arg6, 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5132(true, 0);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1535[3] + (arg0 != null ? field1535[2] : field1535[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1535[2] : field1535[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method922(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
