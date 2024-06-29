import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class375 extends class110 implements class371 {
   @OriginalMember(
      owner = "client!aw",
      name = "E",
      descriptor = "I"
   )
   private int field5479;
   @OriginalMember(
      owner = "client!aw",
      name = "F",
      descriptor = "I"
   )
   private int field5475;
   @OriginalMember(
      owner = "client!aw",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5485 = new String[]{method2934(method2933("\u0011I$p")), method2934(method2933("\u0004\u0012f2f")), method2934(method2933("\u001eKf_3")), method2934(method2933("\u001eKf r\u0011U<\"3")), method2934(method2933("\u001eKfR3")), method2934(method2933("\u001eKfQ3")), method2934(method2933("\u001eKfX3")), method2934(method2933("\u001eKfP3")), method2934(method2933("\u001eKfV3")), method2934(method2933("\u001eKf^3")), method2934(method2933("\u001eKfZ3")), method2934(method2933("\u001eKf[3")), method2934(method2933("\u001eKf]3")), method2934(method2933("\u001eKfT3"))};
   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "Lfm;"
   )
   public static class164 field5474 = new class164(2, 12);
   @OriginalMember(
      owner = "client!aw",
      name = "M",
      descriptor = "I"
   )
   public static int field5480 = 1338;
   @OriginalMember(
      owner = "client!aw",
      name = "G",
      descriptor = "Lhha;"
   )
   public static class724 field5482 = new class724(56, 8);
   @OriginalMember(
      owner = "client!aw",
      name = "I",
      descriptor = "I"
   )
   public static int field5469;
   @OriginalMember(
      owner = "client!aw",
      name = "C",
      descriptor = "I"
   )
   public static int field5470;
   @OriginalMember(
      owner = "client!aw",
      name = "L",
      descriptor = "I"
   )
   public static int field5471;
   @OriginalMember(
      owner = "client!aw",
      name = "J",
      descriptor = "I"
   )
   public static int field5472;
   @OriginalMember(
      owner = "client!aw",
      name = "H",
      descriptor = "I"
   )
   public static int field5473;
   @OriginalMember(
      owner = "client!aw",
      name = "y",
      descriptor = "I"
   )
   public static int field5476;
   @OriginalMember(
      owner = "client!aw",
      name = "K",
      descriptor = "I"
   )
   public static int field5477;
   @OriginalMember(
      owner = "client!aw",
      name = "D",
      descriptor = "I"
   )
   public static int field5478;
   @OriginalMember(
      owner = "client!aw",
      name = "x",
      descriptor = "I"
   )
   public static int field5481;
   @OriginalMember(
      owner = "client!aw",
      name = "A",
      descriptor = "I"
   )
   public static int field5483;
   @OriginalMember(
      owner = "client!aw",
      name = "B",
      descriptor = "Lnd;"
   )
   public static class785 field5484;

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(ZZZ)V"
   )
   public final void method31(boolean arg0, boolean arg1, boolean arg2) {
      try {
         if (arg1) {
            this.field5479 = -14;
         }

         ++field5478;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5485[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(IIIIII[II)V"
   )
   public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
      try {
         ++field5472;
         super.field1715.method1943(0, this);
         if (arg2 != -20998) {
            field5474 = null;
         }

         if (~arg4 == -1) {
            arg4 = arg5;
         }

         if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg4);
         }

         OpenGL.glTexSubImage2Di(super.field1719, 0, arg7, arg1, arg5, arg3, 32993, super.field1715.field11153, arg6, arg0);
         if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5485[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5485[1] : field5485[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   public final void method24(int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(FI)F"
   )
   public final float method26(float arg0, int arg1) {
      try {
         ++field5477;
         return arg1 != -22887 ? -0.42689118F : arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5485[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method18(byte arg0) {
      try {
         ++field5483;
         if (arg0 != -9) {
            this.field5475 = 3;
         }

         return this.field5475;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5485[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method28(byte arg0) {
      try {
         ++field5471;
         return arg0 >= -53 ? 17 : this.field5479;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5485[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method21(float arg0, int arg1) {
      try {
         if (arg1 != 11439) {
            this.method25(-104, -20, 111, 120, 7, -75, (int[])null, 68);
         }

         ++field5473;
         return arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5485[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(IIILsr;IIII[B)V"
   )
   public final void method22(int arg0, int arg1, int arg2, class78 arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
      try {
         if (~arg0 == -1) {
            arg0 = arg5;
         }

         ++field5476;
         super.field1715.method1943(0, this);
         OpenGL.glPixelStorei(3317, 1);
         if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, arg0);
         }

         OpenGL.glTexSubImage2Dub(super.field1719, 0, arg4, arg1, arg5, arg7, class186.method1672((byte)-109, arg3), 5121, arg8, arg6);
         if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
         }

         if (arg2 >= -17) {
            this.method25(17, -65, -82, -62, -97, -82, (int[])null, 88);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field5485[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5485[1] : field5485[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field5485[1] : field5485[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "<init>",
      descriptor = "(Lqs;Lsr;II[BII)V"
   )
   public class375(class771 arg0, class78 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class779.field11371, arg2 * arg3, false);

      try {
         this.field5479 = arg3;
         this.field5475 = arg2;
         super.field1715.method1943(0, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Dub(super.field1719, 0, this.method1073(-2), arg2, arg3, 0, class186.method1672((byte)-75, super.field1720), 5121, arg4, arg5);
         OpenGL.glPixelStorei(3314, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5485[3] + (arg0 != null ? field5485[1] : field5485[0]) + ',' + (arg1 != null ? field5485[1] : field5485[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5485[1] : field5485[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2931(int arg0) {
      try {
         field5482 = null;
         if (arg0 < 123) {
            field5474 = null;
         }

         field5474 = null;
         field5484 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5485[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "<init>",
      descriptor = "(Lqs;II[III)V"
   )
   public class375(class771 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      super(arg0, 34037, class31.field438, class779.field11371, arg1 * arg2, false);

      try {
         this.field5475 = arg1;
         this.field5479 = arg2;
         super.field1715.method1943(0, this);
         OpenGL.glPixelStorei(3314, arg5);
         OpenGL.glTexImage2Di(super.field1719, 0, 6408, this.field5475, this.field5479, 0, 32993, super.field1715.field11153, arg3, arg4 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5485[3] + (arg0 != null ? field5485[1] : field5485[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5485[1] : field5485[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method2932(int arg0) {
      try {
         if (class131.field2129 != null) {
            try {
               class131.field2129.close();
            } catch (IOException var2) {
            }
         }

         ++field5481;
         if (arg0 != 13814) {
            field5480 = -89;
         }

         class131.field2129 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5485[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method27(boolean arg0) {
      try {
         if (arg0) {
            this.method24(40, -87, -120, 38, (int[])null, 92, -121);
         }

         ++field5470;
         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5485[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "<init>",
      descriptor = "(Lqs;Lsr;Lob;II)V"
   )
   public class375(class771 arg0, class78 arg1, class779 arg2, int arg3, int arg4) {
      super(arg0, 34037, arg1, arg2, arg3 * arg4, false);

      try {
         this.field5475 = arg3;
         this.field5479 = arg4;
         super.field1715.method1943(0, this);
         OpenGL.glTexImage2Dub(super.field1719, 0, this.method1073(-2), arg3, arg4, 0, class186.method1672((byte)-84, super.field1720), class453.method3492((byte)-66, super.field1714), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5485[3] + (arg0 != null ? field5485[1] : field5485[0]) + ',' + (arg1 != null ? field5485[1] : field5485[0]) + ',' + (arg2 != null ? field5485[1] : field5485[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "<init>",
      descriptor = "(Lqs;Lsr;II[FII)V"
   )
   public class375(class771 arg0, class78 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
      super(arg0, 34037, arg1, class779.field11375, arg2 * arg3, false);

      try {
         this.field5479 = arg3;
         this.field5475 = arg2;
         super.field1715.method1943(0, this);
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexImage2Df(super.field1719, 0, this.method1073(-2), arg2, arg3, 0, class186.method1672((byte)-75, super.field1720), 5126, arg4, arg5 * 4);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5485[3] + (arg0 != null ? field5485[1] : field5485[0]) + ',' + (arg1 != null ? field5485[1] : field5485[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5485[1] : field5485[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2933(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2934(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
