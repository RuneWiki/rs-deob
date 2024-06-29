import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class719 implements class491 {
   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "Z"
   )
   private boolean field10299 = false;
   @OriginalMember(
      owner = "client!ln",
      name = "j",
      descriptor = "I"
   )
   private int field10289;
   @OriginalMember(
      owner = "client!ln",
      name = "u",
      descriptor = "I"
   )
   public int field10288;
   @OriginalMember(
      owner = "client!ln",
      name = "m",
      descriptor = "I"
   )
   public int field10295;
   @OriginalMember(
      owner = "client!ln",
      name = "c",
      descriptor = "Laea;"
   )
   public class678 field10293;
   @OriginalMember(
      owner = "client!ln",
      name = "l",
      descriptor = "Z"
   )
   private boolean field10304;
   @OriginalMember(
      owner = "client!ln",
      name = "p",
      descriptor = "I"
   )
   public int field10298;
   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10309 = new String[]{method5213(method5212("{u)cy")), method5213(method5212("ynkI")), method5213(method5212("{u)\u00198yrs\u001by")), method5213(method5212("l5)\u000b,")), method5213(method5212("{u)my")), method5213(method5212("{u)oy")), method5213(method5212("{u)ly")), method5213(method5212("{u)`y")), method5213(method5212("{u)C8yzkL+r3")), method5213(method5212("{u)ny")), method5213(method5212("{u)hy")), method5213(method5212("{u)by")), method5213(method5212("{u)ay")), method5213(method5212("{u)iy"))};
   @OriginalMember(
      owner = "client!ln",
      name = "h",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field10294 = new BigInteger(method5213(method5212("&+7\u0015`")), 16);
   @OriginalMember(
      owner = "client!ln",
      name = "n",
      descriptor = "Lfm;"
   )
   public static class164 field10307 = new class164(21, 4);
   @OriginalMember(
      owner = "client!ln",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field10308 = new int[8];
   @OriginalMember(
      owner = "client!ln",
      name = "i",
      descriptor = "I"
   )
   public static int field10290;
   @OriginalMember(
      owner = "client!ln",
      name = "q",
      descriptor = "I"
   )
   public static int field10291;
   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "I"
   )
   public static int field10292;
   @OriginalMember(
      owner = "client!ln",
      name = "t",
      descriptor = "I"
   )
   public static int field10296;
   @OriginalMember(
      owner = "client!ln",
      name = "g",
      descriptor = "I"
   )
   public static int field10297;
   @OriginalMember(
      owner = "client!ln",
      name = "s",
      descriptor = "I"
   )
   public static int field10300;
   @OriginalMember(
      owner = "client!ln",
      name = "f",
      descriptor = "I"
   )
   public static int field10301;
   @OriginalMember(
      owner = "client!ln",
      name = "e",
      descriptor = "I"
   )
   public static int field10302;
   @OriginalMember(
      owner = "client!ln",
      name = "r",
      descriptor = "I"
   )
   public static int field10303;
   @OriginalMember(
      owner = "client!ln",
      name = "o",
      descriptor = "I"
   )
   public static int field10305;
   @OriginalMember(
      owner = "client!ln",
      name = "k",
      descriptor = "[[Z"
   )
   public static boolean[][] field10306;

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(IBII)V"
   )
   public static final void method5202(int arg0, byte arg1, int arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         label42: {
            ++field10291;
            if (~arg0 != -1011) {
               if (~arg0 == -1009) {
                  class427.method3342(class776.field11326, arg2, arg3);
                  if (!var4) {
                     break label42;
                  }
               }

               if (~arg0 == -1012) {
                  class427.method3342(class785.field11437, arg2, arg3);
                  if (!var4) {
                     break label42;
                  }
               }

               if (~arg0 != -1007) {
                  if (~arg0 != -1010) {
                     break label42;
                  }

                  class427.method3342(class394.field5754, arg2, arg3);
                  if (!var4) {
                     break label42;
                  }
               }

               class427.method3342(class323.field4808, arg2, arg3);
               if (!var4) {
                  break label42;
               }
            }

            class427.method3342(class140.field2239, arg2, arg3);
         }

         int var5 = -122 / ((-6 - arg1) / 57);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10309[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5203(byte arg0) {
      try {
         if (~this.field10298 < -1) {
            this.field10293.method4940(this.method5205(0), 1, this.field10298);
            this.field10298 = 0;
         }

         ++field10302;
         if (arg0 != -38) {
            this.field10295 = 1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10309[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method5204(boolean arg0, int arg1) {
      try {
         ++field10301;
         if (arg0 == !this.field10299) {
            this.field10299 = arg0;
            this.method5207(75);
         }

         if (arg1 != -1) {
            this.field10293 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10309[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "c",
      descriptor = "(I)I"
   )
   private final int method5205(int arg0) {
      try {
         ++field10305;
         int var2 = this.field10293.method4950(this.field10288, -6411) * this.field10289;
         if (arg0 != 0) {
            this.field10299 = true;
         }

         return this.field10304 ? var2 * 4 / 3 : var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10309[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5206(byte arg0) {
      try {
         field10306 = null;
         int var1 = 95 / ((-24 - arg0) / 34);
         field10307 = null;
         field10308 = null;
         field10294 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10309[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method5207(int arg0) {
      try {
         if (arg0 >= 62) {
            ++field10303;
            this.field10293.method4906(-2, this);
            if (!this.field10299) {
               OpenGL.glTexParameteri(this.field10295, 10241, this.field10304 ? 9984 : 9728);
               OpenGL.glTexParameteri(this.field10295, 10240, 9728);
            } else {
               OpenGL.glTexParameteri(this.field10295, 10241, this.field10304 ? 9987 : 9729);
               OpenGL.glTexParameteri(this.field10295, 10240, 9729);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10309[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method5208(boolean arg0, int arg1) {
      try {
         if (arg1 != -1) {
            this.field10299 = true;
         }

         ++field10297;
         if (this.field10304 != arg0) {
            int var3 = this.method5205(0);
            this.field10304 = true;
            this.method5207(113);
            this.method5209(var3, 0);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10309[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method5209(int arg0, int arg1) {
      try {
         this.field10293.field9696 -= arg0;
         ++field10300;
         this.field10293.field9696 += this.method5205(arg1 ^ arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10309[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5210(int arg0) {
      try {
         ++field10292;
         if (arg0 != 21) {
            method5206((byte)54);
         }

         return this.field10298;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10309[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method5203((byte)-38);
         ++field10296;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10309[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method5211(boolean arg0) {
      try {
         ++field10290;
         if (this.field10293.field9729) {
            int var2 = this.method5205(0);
            this.field10293.method4906(-2, this);
            OpenGL.glGenerateMipmapEXT(this.field10295);
            this.field10304 = true;
            this.method5207(72);
            this.method5209(var2, 0);
            return true;
         } else {
            if (!arg0) {
               this.method5208(false, 115);
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10309[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "<init>",
      descriptor = "(Laea;IIIZ)V"
   )
   public class719(class678 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         this.field10289 = arg3;
         this.field10288 = arg2;
         this.field10295 = arg1;
         this.field10293 = arg0;
         this.field10304 = arg4;
         OpenGL.glGenTextures(1, class490.field7009, 0);
         this.field10298 = class490.field7009[0];
         this.method5209(0, 0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10309[2] + (arg0 != null ? field10309[3] : field10309[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method69(int arg0);

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5212(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5213(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
