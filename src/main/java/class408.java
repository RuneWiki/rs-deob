import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class408 extends class486 {
   @OriginalMember(
      owner = "client!ah",
      name = "u",
      descriptor = "I"
   )
   private int field5898 = -1;
   @OriginalMember(
      owner = "client!ah",
      name = "s",
      descriptor = "I"
   )
   private int field5899 = -1;
   @OriginalMember(
      owner = "client!ah",
      name = "t",
      descriptor = "I"
   )
   public int field5896;
   @OriginalMember(
      owner = "client!ah",
      name = "y",
      descriptor = "I"
   )
   public int field5895;
   @OriginalMember(
      owner = "client!ah",
      name = "w",
      descriptor = "I"
   )
   public int field5902;
   @OriginalMember(
      owner = "client!ah",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5908 = new String[]{method3075(method3074("\\8^\u0002YS9\u0004\u0000\u0018")), method3075(method3074("S%\u001cR")), method3075(method3074("F~^\u0010M")), method3075(method3074("\\8^\u007f\u0018")), method3075(method3074("\\8^{\u0018")), method3075(method3074("\\8^}\u0018")), method3075(method3074("\\8^|\u0018"))};
   @OriginalMember(
      owner = "client!ah",
      name = "B",
      descriptor = "J"
   )
   public static long field5900 = 0L;
   @OriginalMember(
      owner = "client!ah",
      name = "E",
      descriptor = "Lkda;"
   )
   public static class412 field5903 = new class412(method3075(method3074("j\u0004!\u007f")), method3075(method3074("R6\u0016WSX")), method3075(method3074("b!\u0011")), 2);
   @OriginalMember(
      owner = "client!ah",
      name = "x",
      descriptor = "I"
   )
   public static int field5905 = -1;
   @OriginalMember(
      owner = "client!ah",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field5906 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @OriginalMember(
      owner = "client!ah",
      name = "C",
      descriptor = "I"
   )
   public static int field5894;
   @OriginalMember(
      owner = "client!ah",
      name = "F",
      descriptor = "I"
   )
   public static int field5897;
   @OriginalMember(
      owner = "client!ah",
      name = "D",
      descriptor = "I"
   )
   public static int field5901;
   @OriginalMember(
      owner = "client!ah",
      name = "A",
      descriptor = "I"
   )
   public static int field5904;
   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "[Lin;"
   )
   public static class99[] field5907;

   @OriginalMember(
      owner = "client!ah",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3070(int arg0) {
      try {
         if (arg0 <= -93) {
            field5907 = null;
            field5906 = null;
            field5903 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5908[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method3071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field5904;
         super.field6940.method4107(-124, this);
         if (arg0 != -20630) {
            this.method3071(-6, -91, -78, -1, 52, -112, 44, 121);
         }

         OpenGL.glCopyTexSubImage3D(super.field6938, 0, arg4, arg1, arg2, arg3, arg7, arg5, arg6);
         OpenGL.glFlush();
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5908[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3072(int arg0, int arg1, int arg2) {
      boolean var3 = class663.field9659[0][arg1][arg2] != null && class663.field9659[0][arg1][arg2].field7467 != null;

      for(int var4 = arg0; var4 >= 0; --var4) {
         if (class663.field9659[var4][arg1][arg2] == null) {
            class517 var5 = class663.field9659[var4][arg1][arg2] = new class517(var4);
            if (var3) {
               ++var5.field7466;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ah",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method3073(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (class67.field818 != null) {
            int var2 = 0;
            if (var1) {
               class67.field818[var2] = null;
               ++var2;
            }

            while(true) {
               while(var2 < class545.field7817) {
                  class67.field818[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class67.field818 = null;
                  break;
               }

               ++var2;
            }
         }

         if (arg0 != 0) {
            method3070(-72);
         }

         ++field5897;
         if (class740.field10795 != null) {
            int var3 = 0;
            if (var1) {
               class740.field10795[var3] = null;
               ++var3;
            }

            while(true) {
               while(~class288.field4000 < ~var3) {
                  class740.field10795[var3] = null;
                  ++var3;
               }

               if (!var1) {
                  class740.field10795 = null;
                  break;
               }

               ++var3;
            }
         }

         if (class484.field6923 != null) {
            int var4 = 0;
            if (var1) {
               class484.field6923[var4] = null;
               ++var4;
            }

            while(true) {
               while(~class562.field8027 < ~var4) {
                  class484.field6923[var4] = null;
                  ++var4;
               }

               if (!var1) {
                  class484.field6923 = null;
                  break;
               }

               ++var4;
            }
         }

         class443.field6309 = null;
         field5905 = -1;
         class533.field7596 = -1;
         class147.field1929 = null;
         class139.field1774 = null;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5908[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "<init>",
      descriptor = "(Lea;IIII)V"
   )
   public class408(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);

      try {
         this.field5896 = arg4;
         this.field5895 = arg2;
         this.field5902 = arg3;
         super.field6940.method4107(86, this);
         OpenGL.glTexImage3Dub(super.field6938, 0, super.field6948, this.field5895, this.field5902, this.field5896, 0, class404.method3045((byte)-29, super.field6948), 5121, (byte[])null, 0);
         this.method3526(true, 32);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5908[0] + (arg0 != null ? field5908[2] : field5908[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1678(int arg0) {
      try {
         OpenGL.glFramebufferTexture3DEXT(this.field5898, this.field5899, super.field6938, arg0, 0, 0);
         ++field5901;
         this.field5899 = -1;
         this.field5898 = -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5908[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "<init>",
      descriptor = "(Lea;IIII[BI)V"
   )
   public class408(class573 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);

      try {
         this.field5902 = arg3;
         this.field5895 = arg2;
         this.field5896 = arg4;
         super.field6940.method4107(-117, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field6938, 0, super.field6948, this.field5895, this.field5902, this.field5896, 0, arg6, 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method3526(true, 32);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5908[0] + (arg0 != null ? field5908[2] : field5908[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5908[2] : field5908[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3074(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3075(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
