import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class131 extends class316 {
   @OriginalMember(
      owner = "client!laa",
      name = "p",
      descriptor = "Ltaa;"
   )
   private class426 field2179;
   @OriginalMember(
      owner = "client!laa",
      name = "n",
      descriptor = "Lwn;"
   )
   private class752 field2174;
   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2182 = new String[]{method1256(method1255("R[Xa\r\u0016")), method1256(method1255("R[XauWTP;w\u0016")), method1256(method1255("POU#")), method1256(method1255("E\u0014\u0017a4")), method1256(method1255("R[Xa\u0000\u0016")), method1256(method1255("R[Xa\n\u0016")), method1256(method1255("R[Xa\u000b\u0016")), method1256(method1255("R[Xa\u0001\u0016")), method1256(method1255("R[Xa\b\u0016")), method1256(method1255("R[Xa\f\u0016")), method1256(method1255("R[Xa\u000f\u0016")), method1256(method1255("R[Xa\u000e\u0016"))};
   @OriginalMember(
      owner = "client!laa",
      name = "c",
      descriptor = "I"
   )
   public static int field2168;
   @OriginalMember(
      owner = "client!laa",
      name = "d",
      descriptor = "I"
   )
   public static int field2169;
   @OriginalMember(
      owner = "client!laa",
      name = "g",
      descriptor = "I"
   )
   public static int field2170;
   @OriginalMember(
      owner = "client!laa",
      name = "j",
      descriptor = "I"
   )
   public static int field2172;
   @OriginalMember(
      owner = "client!laa",
      name = "l",
      descriptor = "I"
   )
   public static int field2173;
   @OriginalMember(
      owner = "client!laa",
      name = "o",
      descriptor = "I"
   )
   public static int field2175;
   @OriginalMember(
      owner = "client!laa",
      name = "k",
      descriptor = "I"
   )
   public static int field2176;
   @OriginalMember(
      owner = "client!laa",
      name = "f",
      descriptor = "I"
   )
   public static int field2177;
   @OriginalMember(
      owner = "client!laa",
      name = "e",
      descriptor = "I"
   )
   public static int field2178;
   @OriginalMember(
      owner = "client!laa",
      name = "m",
      descriptor = "I"
   )
   public static int field2181;
   @OriginalMember(
      owner = "client!laa",
      name = "h",
      descriptor = "Llt;"
   )
   private class702 field2171;
   @OriginalMember(
      owner = "client!laa",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field2180;

   @OriginalMember(
      owner = "client!laa",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1252(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!laa",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method1253(int arg0) {
      try {
         this.field2171 = new class702(super.field4567, 2);
         ++field2178;
         this.field2171.method5116((byte)111, 0);
         super.field4567.method259(32, 1);
         super.field4567.method314(7681, -60, 260);
         super.field4567.method262(0, 768, 8960, 34168);
         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glEnable(3168);
         super.field4567.method259(32, 0);
         OpenGL.glTexEnvf(8960, 34163, 2.0F);
         if (this.field2179.field6173) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
         }

         this.field2171.method5115((byte)-32);
         this.field2171.method5116((byte)111, (char)arg0);
         super.field4567.method259(32, 1);
         super.field4567.method314(8448, 85, 8448);
         super.field4567.method262(0, 768, 8960, 5890);
         OpenGL.glDisable(3168);
         super.field4567.method259(32, 0);
         OpenGL.glTexEnvf(8960, 34163, 1.0F);
         if (this.field2179.field6173) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
         }

         this.field2171.method5115((byte)-116);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2182[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method806(byte arg0, boolean arg1) {
      try {
         ++field2168;
         if (~super.field4567.field842 < -1) {
            float var3 = -0.5F / (float)super.field4567.field842;
            super.field4567.method259(32, 1);
            class462.field6758[3] = super.field4567.field774 * var3 + 0.25F;
            class462.field6758[2] = var3;
            class462.field6758[1] = 0.0F;
            class462.field6758[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class462.field6758, 0);
            OpenGL.glPopMatrix();
            super.field4567.method353(81, 0.5F, (float)super.field4567.field842);
            super.field4567.method252(this.field2174, (byte)-26);
            super.field4567.method259(32, 0);
         }

         int var4 = 74 % ((arg0 - -44) / 38);
         this.field2171.method5117('\u0000', 5);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(0.25F, 0.25F, 1.0F);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2182[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "<init>",
      descriptor = "(Lrk;Ltaa;)V"
   )
   public class131(class35 arg0, class426 arg1) {
      super(arg0);

      try {
         this.field2179 = arg1;
         this.method1253(1);
         this.field2174 = new class752(super.field4567, 6406, 2, new byte[]{0, -1}, 6406);
         this.field2174.method5443(10497, false);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2182[1] + (arg0 != null ? field2182[3] : field2182[2]) + ',' + (arg1 != null ? field2182[3] : field2182[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method807(int arg0) {
      try {
         if (arg0 != -18913) {
            this.method810(-48, 53, -25);
         }

         ++field2170;
         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2182[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method1254(int arg0) {
      try {
         field2180 = null;
         if (arg0 != 16764) {
            method1254(-50);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2182[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method805(int arg0) {
      try {
         ++field2169;
         int var2 = 5 % ((arg0 - -18) / 63);
         this.field2171.method5117('\u0001', 5);
         if (super.field4567.field842 > 0) {
            super.field4567.method259(32, 1);
            super.field4567.method252((class707)null, (byte)-113);
            super.field4567.method353(105, 1.0F, 0.0F);
            super.field4567.method259(32, 0);
         }

         super.field4567.method314(8448, 127, 8448);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2182[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method810(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label40: {
            if ((arg0 & 1) != 1) {
               if (!this.field2179.field6173) {
                  super.field4567.method252(this.field2179.field6174[0], (byte)-10);
                  if (!var4) {
                     break label40;
                  }
               }

               super.field4567.method252(this.field2179.field6178, (byte)-109);
               class462.field6758[2] = 0.0F;
               class462.field6758[0] = 0.0F;
               class462.field6758[3] = 0.0F;
               class462.field6758[1] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class462.field6758, 0);
               if (!var4) {
                  break label40;
               }
            }

            if (!this.field2179.field6173) {
               int var5 = super.field4567.field728 % 4000 * 16 / 4000;
               super.field4567.method252(this.field2179.field6174[var5], (byte)-86);
               if (!var4) {
                  break label40;
               }
            }

            super.field4567.method252(this.field2179.field6178, (byte)-105);
            class462.field6758[2] = 0.0F;
            class462.field6758[1] = 0.0F;
            class462.field6758[3] = (float)(super.field4567.field728 % 4000) / 4000.0F;
            class462.field6758[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class462.field6758, 0);
         }

         if (arg2 == 0) {
            ++field2181;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2182[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(IILufa;)V"
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         if (arg0 != 0) {
            this.field2174 = null;
         }

         ++field2177;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2182[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2182[3] : field2182[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         super.field4567.method314(260, arg0 ^ 62, 8448);
         ++field2173;
         if (arg0 != 51) {
            field2175 = 33;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2182[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1255(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1256(char[] arg0) {
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
            var10005 = 58;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
