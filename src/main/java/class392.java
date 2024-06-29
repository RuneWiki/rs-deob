import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class392 extends class364 implements class722 {
   @OriginalMember(
      owner = "client!om",
      name = "D",
      descriptor = "I"
   )
   private int field5428;
   @OriginalMember(
      owner = "client!om",
      name = "A",
      descriptor = "I"
   )
   private int field5430;
   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "I"
   )
   private int field5426;
   @OriginalMember(
      owner = "client!om",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5434 = new String[]{method3100(method3099("\"'h\u000b$")), method3100(method3099("6dhjq")), method3100(method3099("#?*(")), method3100(method3099("\"'h\u0006$")), method3100(method3099("\"'hxe##2z$")), method3100(method3099("\"'h\u0014$"))};
   @OriginalMember(
      owner = "client!om",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field5429 = new int[128];
   @OriginalMember(
      owner = "client!om",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field5433;
   @OriginalMember(
      owner = "client!om",
      name = "E",
      descriptor = "I"
   )
   public static int field5424;
   @OriginalMember(
      owner = "client!om",
      name = "x",
      descriptor = "I"
   )
   public static int field5425;
   @OriginalMember(
      owner = "client!om",
      name = "w",
      descriptor = "I"
   )
   public static int field5427;
   @OriginalMember(
      owner = "client!om",
      name = "C",
      descriptor = "Lww;"
   )
   public static class339 field5431;
   @OriginalMember(
      owner = "client!om",
      name = "F",
      descriptor = "[[[Lbq;"
   )
   public static class731[][][] field5432;

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3096(byte arg0) {
      try {
         field5433 = null;
         field5429 = null;
         field5432 = null;
         if (arg0 != -58) {
            method3098(61, 55, (byte)77);
         }

         field5431 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5434[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "<init>",
      descriptor = "(Llea;Ldja;III[B)V"
   )
   public class392(class574 arg0, class45 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, 32879, arg1, class576.field8541, arg2 * arg3 * arg4, false);

      try {
         this.field5428 = arg3;
         this.field5430 = arg2;
         this.field5426 = arg4;
         super.field5058.method2265(this, (byte)122);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field5055, 0, this.method2866(false), this.field5430, this.field5428, this.field5426, 0, class615.method4531(123, super.field5056), 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5434[4] + (arg0 != null ? field5434[1] : field5434[2]) + ',' + (arg1 != null ? field5434[1] : field5434[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5434[1] : field5434[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)I"
   )
   public static final int method3097(String arg0, boolean arg1) {
      try {
         ++field5425;
         if (arg1) {
            field5433 = null;
         }

         return 2 + arg0.length();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5434[3] + (arg0 != null ? field5434[1] : field5434[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3098(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 <= 14) {
            return false;
         } else {
            ++field5424;
            return (arg0 & 2048) != 0 && ~(arg1 & 55) != -1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5434[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      for(int var0 = 0; field5429.length > var0; ++var0) {
         field5429[var0] = -1;
      }

      for(int var1 = 65; var1 <= 90; ++var1) {
         field5429[var1] = var1 - 65;
      }

      for(int var2 = 97; ~var2 >= -123; ++var2) {
         field5429[var2] = var2 - 97 - -26;
      }

      for(int var3 = 48; var3 <= 57; ++var3) {
         field5429[var3] = var3 - 48 + 52;
      }

      field5429[45] = field5429[47] = 63;
      field5429[42] = field5429[43] = 62;
      field5433 = new int[]{3, 7, 15};
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3099(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3100(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
