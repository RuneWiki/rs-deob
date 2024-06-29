import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class688 extends class297 implements class323 {
   @OriginalMember(
      owner = "client!dda",
      name = "B",
      descriptor = "I"
   )
   private int field10226 = -1;
   @OriginalMember(
      owner = "client!dda",
      name = "y",
      descriptor = "I"
   )
   private int field10230 = -1;
   @OriginalMember(
      owner = "client!dda",
      name = "E",
      descriptor = "I"
   )
   private int field10229;
   @OriginalMember(
      owner = "client!dda",
      name = "F",
      descriptor = "Lc;"
   )
   private class652 field10218;
   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "I"
   )
   public int field10222;
   @OriginalMember(
      owner = "client!dda",
      name = "C",
      descriptor = "I"
   )
   public int field10225;
   @OriginalMember(
      owner = "client!dda",
      name = "G",
      descriptor = "I"
   )
   private int field10224;
   @OriginalMember(
      owner = "client!dda",
      name = "A",
      descriptor = "I"
   )
   private int field10223;
   @OriginalMember(
      owner = "client!dda",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10231 = new String[]{method5071(method5070("1u]{\u0018}")), method5071(method5070(".?\u0012{$")), method5071(method5070("1u]{e<\u007fU!g}")), method5071(method5070(";dP9")), method5071(method5070("1u]{\u001a}")), method5071(method5070("1u]{\u001c}")), method5071(method5070("1u]{\u001b}")), method5071(method5070("1u]{?<\u007f]90/t\u0014"))};
   @OriginalMember(
      owner = "client!dda",
      name = "x",
      descriptor = "I"
   )
   public static int field10219;
   @OriginalMember(
      owner = "client!dda",
      name = "D",
      descriptor = "I"
   )
   public static int field10220;
   @OriginalMember(
      owner = "client!dda",
      name = "u",
      descriptor = "I"
   )
   public static int field10221;
   @OriginalMember(
      owner = "client!dda",
      name = "w",
      descriptor = "I"
   )
   public static int field10227;
   @OriginalMember(
      owner = "client!dda",
      name = "v",
      descriptor = "I"
   )
   public static int field10228;

   @OriginalMember(
      owner = "client!dda",
      name = "d",
      descriptor = "(B)V",
      line = 5
   )
   public final void method5067(byte arg0) {
      try {
         ++field10221;
         if (~this.field10224 < -1) {
            this.field10218.method4786(this.field10224, this.field10223, 11482);
            this.field10224 = 0;
         }

         if (arg0 != 96) {
            method5069(false, 119, -116, 17, 8);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10231[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(B)V",
      line = 22
   )
   public final void method1683(byte arg0) {
      try {
         OpenGL.glFramebufferRenderbufferEXT(this.field10226, this.field10230, 36161, 0);
         if (arg0 != -117) {
            this.field10223 = -122;
         }

         ++field10219;
         this.field10230 = -1;
         this.field10226 = -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10231[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "finalize",
      descriptor = "()V",
      line = 37
   )
   protected final void finalize() throws Throwable {
      try {
         this.method5067((byte)96);
         ++field10227;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10231[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IIB)V",
      line = 49
   )
   public final void method5068(int arg0, int arg1, byte arg2) {
      try {
         ++field10220;
         OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.field10224);
         if (arg2 >= 31) {
            this.field10230 = arg0;
            this.field10226 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10231[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ZIIII)V",
      line = 62
   )
   public static final void method5069(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10228;
         if (client.method1170(arg1, (byte)-119)) {
            class408.method3273(false, arg2, arg3, arg0, arg4, class296.field4672[arg1]);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10231[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(Lc;III)V",
      line = 89
   )
   public class688(class652 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10229 = arg1;
         this.field10218 = arg0;
         this.field10222 = arg3;
         this.field10225 = arg2;
         OpenGL.glGenRenderbuffersEXT(1, class373.field5769, 0);
         this.field10224 = class373.field5769[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field10224);
         OpenGL.glRenderbufferStorageEXT(36161, this.field10229, this.field10225, this.field10222);
         this.field10223 = this.field10225 * this.field10222 * this.field10218.method4754(6, this.field10229);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10231[2] + (arg0 != null ? field10231[1] : field10231[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(Lc;IIII)V",
      line = 104
   )
   public class688(class652 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field10218 = arg0;
         this.field10222 = arg3;
         this.field10225 = arg2;
         this.field10229 = arg1;
         OpenGL.glGenRenderbuffersEXT(1, class373.field5769, 0);
         this.field10224 = class373.field5769[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field10224);
         OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field10229, this.field10225, this.field10222);
         this.field10223 = this.field10225 * this.field10222 * this.field10218.method4754(6, this.field10229);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10231[2] + (arg0 != null ? field10231[1] : field10231[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5070(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5071(char[] arg0) {
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
            var10005 = 17;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
