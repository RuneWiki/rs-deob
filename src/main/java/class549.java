import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class class549 implements class219 {
   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "Z"
   )
   private boolean field8082 = false;
   @OriginalMember(
      owner = "client!ll",
      name = "h",
      descriptor = "I"
   )
   private int field8097;
   @OriginalMember(
      owner = "client!ll",
      name = "q",
      descriptor = "Liu;"
   )
   public class530 field8096;
   @OriginalMember(
      owner = "client!ll",
      name = "d",
      descriptor = "I"
   )
   public int field8100;
   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "I"
   )
   public int field8090;
   @OriginalMember(
      owner = "client!ll",
      name = "l",
      descriptor = "Z"
   )
   private boolean field8092;
   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "I"
   )
   public int field8098;
   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8104 = new String[]{method4164(method4163("%9\bCq")), method4164(method4163("%9\bXq")), method4164(method4163("' J`")), method4164(method4163("2{\b\"$")), method4164(method4163("%9\b00'<R2q")), method4164(method4163("%9\b\\q")), method4164(method4163("%9\b^q")), method4164(method4163("%9\b]q")), method4164(method4163("%9\bGq")), method4164(method4163("%9\bBq")), method4164(method4163("%9\bYq")), method4164(method4163("%9\b@q")), method4164(method4163("%9\bAq")), method4164(method4163("%9\b_q")), method4164(method4163("%9\bj0'4Je#,}"))};
   @OriginalMember(
      owner = "client!ll",
      name = "i",
      descriptor = "I"
   )
   public static int field8088 = 0;
   @OriginalMember(
      owner = "client!ll",
      name = "n",
      descriptor = "I"
   )
   public static int field8103 = -1;
   @OriginalMember(
      owner = "client!ll",
      name = "j",
      descriptor = "Lvo;"
   )
   public static class384 field8089 = class529.method3951((byte)-25);
   @OriginalMember(
      owner = "client!ll",
      name = "f",
      descriptor = "I"
   )
   public static int field8083;
   @OriginalMember(
      owner = "client!ll",
      name = "u",
      descriptor = "I"
   )
   public static int field8084;
   @OriginalMember(
      owner = "client!ll",
      name = "o",
      descriptor = "I"
   )
   public static int field8085;
   @OriginalMember(
      owner = "client!ll",
      name = "m",
      descriptor = "I"
   )
   public static int field8086;
   @OriginalMember(
      owner = "client!ll",
      name = "e",
      descriptor = "I"
   )
   public static int field8087;
   @OriginalMember(
      owner = "client!ll",
      name = "g",
      descriptor = "I"
   )
   public static int field8093;
   @OriginalMember(
      owner = "client!ll",
      name = "v",
      descriptor = "I"
   )
   public static int field8094;
   @OriginalMember(
      owner = "client!ll",
      name = "r",
      descriptor = "I"
   )
   public static int field8095;
   @OriginalMember(
      owner = "client!ll",
      name = "k",
      descriptor = "I"
   )
   public static int field8099;
   @OriginalMember(
      owner = "client!ll",
      name = "p",
      descriptor = "I"
   )
   public static int field8101;
   @OriginalMember(
      owner = "client!ll",
      name = "t",
      descriptor = "I"
   )
   public static int field8102;
   @OriginalMember(
      owner = "client!ll",
      name = "s",
      descriptor = "Lu;"
   )
   public static class65 field8091;

   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4152(byte arg0) {
      try {
         field8091 = null;
         field8089 = null;
         if (arg0 > -29) {
            method4160(-22L, (byte)-62, -105);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8104[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4153(int arg0) {
      try {
         ++field8085;
         if (this.field8096.field7780) {
            int var2 = this.method4159(-107);
            this.field8096.method4006(this, (byte)16);
            OpenGL.glGenerateMipmapEXT(this.field8090);
            this.field8092 = true;
            this.method4154(10240);
            this.method4161(var2, true);
            return true;
         } else {
            if (arg0 != 1) {
               this.method4157((byte)-100, false);
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8104[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method4154(int arg0) {
      try {
         if (arg0 != 10240) {
            method4162(94);
         }

         this.field8096.method4006(this, (byte)125);
         ++field8095;
         if (this.field8082) {
            OpenGL.glTexParameteri(this.field8090, 10241, !this.field8092 ? 9729 : 9987);
            OpenGL.glTexParameteri(this.field8090, 10240, 9729);
         } else {
            OpenGL.glTexParameteri(this.field8090, 10241, !this.field8092 ? 9728 : 9984);
            OpenGL.glTexParameteri(this.field8090, 10240, 9728);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8104[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4155(boolean arg0, int arg1) {
      try {
         if (arg1 == -1) {
            ++field8102;
            if (this.field8092 != arg0) {
               int var3 = this.method4159(-71);
               this.field8092 = true;
               this.method4154(10240);
               this.method4161(var3, true);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8104[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method4156(int arg0) {
      try {
         ++field8101;
         return arg0 != 0 ? -46 : this.field8098;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8104[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method4157(byte arg0, boolean arg1) {
      try {
         if (arg0 != 111) {
            this.method4159(85);
         }

         ++field8083;
         if (this.field8082 != arg1) {
            this.field8082 = arg1;
            this.method4154(10240);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8104[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method4158(byte arg0) {
      try {
         ++field8093;
         if (~this.field8098 < -1) {
            this.field8096.method4025(this.method4159(-73), this.field8098, 4319);
            this.field8098 = 0;
         }

         if (arg0 >= -64) {
            this.field8097 = -94;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8104[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(I)I"
   )
   private final int method4159(int arg0) {
      try {
         ++field8099;
         int var2 = this.field8096.method3975(this.field8100, -7184) * this.field8097;
         int var3 = 81 % ((arg0 - -1) / 32);
         return this.field8092 ? var2 * 4 / 3 : var2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8104[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(JBI)Ljava/lang/String;"
   )
   public static final String method4160(long arg0, byte arg1, int arg2) {
      try {
         ++field8084;
         if (arg1 != 9) {
            return null;
         } else {
            class30.method243(arg1 + -123, arg0);
            int var4 = class585.field8631.get(5);
            int var5 = class585.field8631.get(2);
            int var6 = class585.field8631.get(1);
            return arg2 == 3 ? class446.method3415(arg2, 10, arg0) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class440.field5983[arg2][var5] + "-" + var6;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field8104[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method4161(int arg0, boolean arg1) {
      try {
         this.field8096.field7660 -= arg0;
         ++field8086;
         if (!arg1) {
            this.method4154(116);
         }

         this.field8096.field7660 += this.method4159(60);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8104[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4162(int arg0) {
      try {
         class107.field1426.method759(5);
         ++field8087;
         class223.field2792.method4424(0);
         class223.field2792.field8774 = null;
         class688.field10121 = arg0;
         class223.field2792.field8767 = 0;
         class223.field2792.field8777 = null;
         class223.field2792.field8775 = null;
         class223.field2792.field8764.field864 = 0;
         class489.method3712((byte)-100);
         class141.field1779 = 0;
         class340.field4687 = null;
         class704.field10291 = null;
         class74.field984 = null;
         class94.field1280 = 0;
         class202.field2575 = 0;
         class427.field5811 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8104[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method4158((byte)-81);
         ++field8094;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8104[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "<init>",
      descriptor = "(Liu;IIIZ)V"
   )
   public class549(class530 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         this.field8097 = arg3;
         this.field8096 = arg0;
         this.field8100 = arg2;
         this.field8090 = arg1;
         this.field8092 = arg4;
         OpenGL.glGenTextures(1, class229.field2865, 0);
         this.field8098 = class229.field2865[0];
         this.method4161(0, true);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8104[4] + (arg0 != null ? field8104[3] : field8104[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method970(byte arg0);

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4163(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4164(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
