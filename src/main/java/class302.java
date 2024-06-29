import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class302 extends class648 {
   @OriginalMember(
      owner = "client!hw",
      name = "l",
      descriptor = "I"
   )
   private int field4207 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "u",
      descriptor = "I"
   )
   private int field4212 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "n",
      descriptor = "I"
   )
   private int field4213 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "D",
      descriptor = "Z"
   )
   private boolean field4211 = false;
   @OriginalMember(
      owner = "client!hw",
      name = "w",
      descriptor = "I"
   )
   private int field4226 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "B",
      descriptor = "I"
   )
   private int field4204 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "k",
      descriptor = "Liu;"
   )
   private class530 field4202;
   @OriginalMember(
      owner = "client!hw",
      name = "e",
      descriptor = "Lik;"
   )
   private class124 field4217;
   @OriginalMember(
      owner = "client!hw",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4234 = new String[]{method2431(method2430("nC\u001d\u001d8")), method2431(method2430("{\u0018__")), method2431(method2430("}\u001a\u001d\u000f,{\u0004G\rm")), method2431(method2430("}\u001a\u001dx\u0004=")), method2431(method2430("}\u001a\u001dtm")), method2431(method2430("}\u001a\u001dam")), method2431(method2430("}\u001a\u001d~m")), method2431(method2430("}\u001a\u001du\u0004=")), method2431(method2430("}\u001a\u001d|m")), method2431(method2430("}\u001a\u001dqm")), method2431(method2430("}\u001a\u001d{m")), method2431(method2430("}\u001a\u001drm")), method2431(method2430("}\u001a\u001dum")), method2431(method2430("}\u001a\u001dbm")), method2431(method2430("}\u001a\u001dz\u0004=")), method2431(method2430("}\u001a\u001dt\u0004=")), method2431(method2430("}\u001a\u001dr\u0004=")), method2431(method2430("}\u001a\u001dcm")), method2431(method2430("}\u001a\u001dxm")), method2431(method2430("}\u001a\u001d{\u0004=")), method2431(method2430("}\u001a\u001dfm")), method2431(method2430("}\u001a\u001d}m")), method2431(method2430("}\u001a\u001dzm"))};
   @OriginalMember(
      owner = "client!hw",
      name = "v",
      descriptor = "I"
   )
   public static int field4223 = 0;
   @OriginalMember(
      owner = "client!hw",
      name = "g",
      descriptor = "Lse;"
   )
   public static class6 field4222 = new class6(77, 4);
   @OriginalMember(
      owner = "client!hw",
      name = "F",
      descriptor = "Laka;"
   )
   public static class418 field4231 = new class418(79, -2);
   @OriginalMember(
      owner = "client!hw",
      name = "o",
      descriptor = "I"
   )
   public static int field4203;
   @OriginalMember(
      owner = "client!hw",
      name = "q",
      descriptor = "I"
   )
   public static int field4206;
   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "I"
   )
   public static int field4208;
   @OriginalMember(
      owner = "client!hw",
      name = "p",
      descriptor = "I"
   )
   public static int field4209;
   @OriginalMember(
      owner = "client!hw",
      name = "d",
      descriptor = "I"
   )
   public static int field4210;
   @OriginalMember(
      owner = "client!hw",
      name = "i",
      descriptor = "I"
   )
   public static int field4214;
   @OriginalMember(
      owner = "client!hw",
      name = "j",
      descriptor = "I"
   )
   public static int field4215;
   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "I"
   )
   public static int field4216;
   @OriginalMember(
      owner = "client!hw",
      name = "f",
      descriptor = "I"
   )
   public static int field4218;
   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "I"
   )
   public static int field4219;
   @OriginalMember(
      owner = "client!hw",
      name = "t",
      descriptor = "I"
   )
   public static int field4220;
   @OriginalMember(
      owner = "client!hw",
      name = "s",
      descriptor = "I"
   )
   public static int field4221;
   @OriginalMember(
      owner = "client!hw",
      name = "C",
      descriptor = "I"
   )
   public static int field4224;
   @OriginalMember(
      owner = "client!hw",
      name = "x",
      descriptor = "I"
   )
   public static int field4225;
   @OriginalMember(
      owner = "client!hw",
      name = "m",
      descriptor = "I"
   )
   public static int field4227;
   @OriginalMember(
      owner = "client!hw",
      name = "A",
      descriptor = "I"
   )
   public static int field4228;
   @OriginalMember(
      owner = "client!hw",
      name = "E",
      descriptor = "I"
   )
   public static int field4229;
   @OriginalMember(
      owner = "client!hw",
      name = "h",
      descriptor = "I"
   )
   public static int field4230;
   @OriginalMember(
      owner = "client!hw",
      name = "c",
      descriptor = "I"
   )
   public static int field4232;
   @OriginalMember(
      owner = "client!hw",
      name = "r",
      descriptor = "I"
   )
   public static int field4233;
   @OriginalMember(
      owner = "client!hw",
      name = "y",
      descriptor = "Lik;"
   )
   private class124 field4205;

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method2397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         this.field4217.method4157((byte)111, ~(arg7 & 1) != -1);
         ++field4219;
         this.field4202.method4008(-2);
         this.field4202.method4012(arg6, -114);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (this.field4211) {
            float var9 = (float)arg2 / (float)this.method2406();
            float var10 = (float)arg3 / (float)this.method2396();
            float var11 = (float)this.field4207 * var9 + (float)arg0;
            float var12 = (float)this.field4226 * var10 + (float)arg1;
            float var13 = (float)this.field4217.field1624 * var9 + var11;
            float var14 = (float)this.field4217.field1620 * var10 + var12;
            if (this.field4205 == null) {
               this.field4202.method4006(this.field4217, (byte)84);
               this.field4202.method4009(arg4, 1);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
            } else {
               this.method2426(arg4, 7894);
               this.field4205.method4157((byte)111, true);
               OpenGL.glBegin(7);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4217.field1621);
               OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
               OpenGL.glVertex2f(var11, var12);
               OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2f(var11, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field4217.field1623, 0.0F);
               OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
               OpenGL.glVertex2f(var13, var14);
               OpenGL.glMultiTexCoord2f(33985, this.field4217.field1623, this.field4217.field1621);
               OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
               OpenGL.glVertex2f(var13, var12);
               OpenGL.glEnd();
               this.method2425(0);
            }
         } else if (this.field4205 == null) {
            this.field4202.method4006(this.field4217, (byte)-125);
            this.field4202.method4009(arg4, 1);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
            OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
         } else {
            this.method2426(arg4, 7894);
            this.field4205.method4157((byte)111, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4217.field1621);
            OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4217.field1623, 0.0F);
            OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field4217.field1623, this.field4217.field1621);
            OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method2425(0);
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field4234[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(Lqq;Lqq;I)V"
   )
   public static final void method2424(class82 arg0, class82 arg1, int arg2) {
      try {
         if (arg2 < -33) {
            ++field4227;
            if (arg1.field1154 != null) {
               arg1.method797((byte)93);
            }

            arg1.field1154 = arg0.field1154;
            arg1.field1157 = arg0;
            arg1.field1154.field1157 = arg1;
            arg1.field1157.field1154 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4234[21] + (arg0 != null ? field4234[0] : field4234[1]) + ',' + (arg1 != null ? field4234[0] : field4234[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method2425(int arg0) {
      try {
         ++field4214;
         this.field4202.method3988(-128, 1);
         this.field4202.method4006((class549)null, (byte)32);
         this.field4202.method4022(8448, arg0 ^ 34161, 8448);
         this.field4202.method3959(-67, 768, 34168, 1);
         this.field4202.method3969(arg0, 5890, (byte)-125, 770);
         this.field4202.method3988(arg0 + -128, 0);
         this.field4202.method3959(-80, 768, 34168, 1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4234[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method2426(int arg0, int arg1) {
      try {
         this.field4202.method3988(-128, 1);
         ++field4206;
         this.field4202.method4006(this.field4217, (byte)71);
         this.field4202.method4022(7681, 34161, this.field4202.method3966((byte)-111, arg0));
         this.field4202.method3959(-55, 768, 34167, 1);
         if (arg1 != 7894) {
            this.method2425(-109);
         }

         this.field4202.method3969(0, 34168, (byte)-127, 770);
         this.field4202.method3988(arg1 + -8022, 0);
         this.field4202.method4006(this.field4205, (byte)83);
         this.field4202.method4022(7681, arg1 ^ 39847, 34479);
         this.field4202.method3959(-52, 768, 34166, 1);
         if (~this.field4213 == -1) {
            this.field4202.method4001(1.0F, 29361, 0.0F, 0.5F, 0.5F);
         } else if (~this.field4213 == -2) {
            this.field4202.method4001(0.5F, arg1 ^ 27751, 0.0F, 1.0F, 0.5F);
         } else {
            if (this.field4213 != 2) {
               if (this.field4213 == 3) {
                  this.field4202.method4001(128.5F, 29361, 0.0F, 128.5F, 128.5F);
                  return;
               }
            } else {
               this.field4202.method4001(0.5F, 29361, 0.0F, 0.5F, 1.0F);
            }

         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4234[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "()I"
   )
   public final int method2406() {
      try {
         ++field4215;
         return this.field4217.field1624 + this.field4207 - -this.field4212;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4234[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2427(byte arg0) {
      try {
         field4222 = null;
         int var1 = -2 / ((59 - arg0) / 55);
         field4231 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4234[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method2395(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9) {
      try {
         ++field4208;
         class124 var11 = ((class229)arg7).field2864;
         if (this.field4211) {
            float var12 = (float)this.method2406();
            float var13 = (float)this.method2396();
            float var14 = (-arg0 + arg2) / var12;
            float var15 = (-arg1 + arg3) / var12;
            float var16 = (-arg0 + arg4) / var13;
            float var17 = (-arg1 + arg5) / var13;
            float var18 = (float)this.field4226 * var16;
            float var19 = (float)this.field4226 * var17;
            float var20 = (float)this.field4207 * var14;
            float var21 = (float)this.field4207 * var15;
            float var22 = (float)this.field4212 * -var14;
            float var23 = (float)this.field4212 * -var15;
            float var24 = (float)this.field4204 * -var16;
            arg3 = arg3 + var23 + var19;
            arg0 = arg0 + var20 + var18;
            float var25 = (float)this.field4204 * -var17;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
         }

         float var26 = -arg0 + arg2 + arg4;
         this.field4217.method4157((byte)111, ~(1 & arg6) != -1);
         float var27 = -arg1 + arg5 + arg3;
         this.field4202.method4008(-2);
         this.field4202.method4006(this.field4217, (byte)-124);
         this.field4202.method4009(1, 1);
         this.field4202.method3988(-128, 1);
         this.field4202.method4006(var11, (byte)-125);
         this.field4202.method4022(8448, 34161, 7681);
         this.field4202.method3959(-95, 768, 34168, 0);
         this.field4202.method4012(1, -17);
         float var28 = var11.field1623 / (float)var11.field1624;
         float var29 = var11.field1621 / (float)var11.field1620;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4217.field1621);
         OpenGL.glMultiTexCoord2f(33985, (arg0 - (float)arg8) * var28, var11.field1621 - ((float)(-arg9) + arg1) * var29);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, ((float)(-arg8) + arg4) * var28, var11.field1621 - ((float)(-arg9) + arg5) * var29);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glMultiTexCoord2f(33984, this.field4217.field1623, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, (var26 - (float)arg8) * var28, var11.field1621 - (var27 - (float)arg9) * var29);
         OpenGL.glVertex2f(var26, var27);
         OpenGL.glMultiTexCoord2f(33984, this.field4217.field1623, this.field4217.field1621);
         OpenGL.glMultiTexCoord2f(33985, (arg2 - (float)arg8) * var28, var11.field1621 - ((float)(-arg9) + arg3) * var29);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
         this.field4202.method3959(-54, 768, 5890, 0);
         this.field4202.method4009(0, 1);
         this.field4202.method4006((class549)null, (byte)-122);
         this.field4202.method3988(-128, 0);
      } catch (RuntimeException var31) {
         throw class93.method866(var31, field4234[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4234[0] : field4234[1]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method2399(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field4217.method4157((byte)111, false);
         ++field4203;
         this.field4202.method4008(-2);
         this.field4202.method4012(arg4, 109);
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         int var8 = this.field4207 + arg0;
         int var9 = this.field4226 + arg1;
         if (this.field4205 != null) {
            this.method2426(arg2, 7894);
            this.field4205.method4157((byte)111, false);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field4217.field1621);
            OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, var9 - -this.field4217.field1620);
            OpenGL.glMultiTexCoord2f(33985, this.field4217.field1623, 0.0F);
            OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
            OpenGL.glVertex2i(this.field4217.field1624 + var8, var9 - -this.field4217.field1620);
            OpenGL.glMultiTexCoord2f(33985, this.field4217.field1623, this.field4217.field1621);
            OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
            OpenGL.glVertex2i(var8 - -this.field4217.field1624, var9);
            OpenGL.glEnd();
            this.method2425(0);
         } else {
            this.field4202.method4006(this.field4217, (byte)55);
            this.field4202.method4009(arg2, 1);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var8, this.field4217.field1620 + var9);
            OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
            OpenGL.glVertex2i(this.field4217.field1624 + var8, var9 - -this.field4217.field1620);
            OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
            OpenGL.glVertex2i(this.field4217.field1624 + var8, var9);
            OpenGL.glEnd();
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4234[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method2398(int arg0, int arg1, class87 arg2, int arg3, int arg4) {
      try {
         ++field4230;
         class229 var6 = (class229)arg2;
         class124 var7 = var6.field2864;
         this.field4217.method4157((byte)111, false);
         this.field4202.method4008(-2);
         this.field4202.method4006(this.field4217, (byte)-26);
         this.field4202.method4009(1, 1);
         this.field4202.method3988(-128, 1);
         this.field4202.method4006(var7, (byte)66);
         this.field4202.method4022(8448, 34161, 7681);
         this.field4202.method3959(-88, 768, 34168, 0);
         this.field4202.method4012(1, -120);
         int var18 = this.field4207 + arg0;
         int var19 = this.field4226 + arg1;
         int var8 = this.field4217.field1624 + var18;
         int var9 = this.field4217.field1620 + var19;
         float var10 = var7.field1623 / (float)var7.field1624;
         float var11 = var7.field1621 / (float)var7.field1620;
         float var12 = (float)(-arg3 + var18) * var10;
         float var13 = (float)(var8 - arg3) * var10;
         float var14 = -((float)(-arg4 + var19) * var11) + var7.field1621;
         float var15 = -((float)(-arg4 + var9) * var11) + var7.field1621;
         OpenGL.glBegin(7);
         OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field4217.field1621);
         OpenGL.glMultiTexCoord2f(33985, var12, var14);
         OpenGL.glVertex2i(var18, var19);
         OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var12, var15);
         OpenGL.glVertex2i(var18, this.field4217.field1620 + var19);
         OpenGL.glMultiTexCoord2f(33984, this.field4217.field1623, 0.0F);
         OpenGL.glMultiTexCoord2f(33985, var13, var15);
         OpenGL.glVertex2i(this.field4217.field1624 + var18, var19 - -this.field4217.field1620);
         OpenGL.glMultiTexCoord2f(33984, this.field4217.field1623, this.field4217.field1621);
         OpenGL.glMultiTexCoord2f(33985, var13, var14);
         OpenGL.glVertex2i(this.field4217.field1624 + var18, var19);
         OpenGL.glEnd();
         this.field4202.method3959(-118, 768, 5890, 0);
         this.field4202.method4009(0, 1);
         this.field4202.method4006((class549)null, (byte)-126);
         this.field4202.method3988(-128, 0);
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field4234[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4234[0] : field4234[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(ZLoca;)V"
   )
   public static final void method2428(boolean arg0, class642 arg1) {
      try {
         ++field4216;
         if (~class389.field5370 == ~arg1.field9558) {
            if (class204.field2593.field11422 == null) {
               arg1.field9535 = 0;
               arg1.field9475 = 0;
            } else {
               arg1.field9498 = 150;
               arg1.field9540 = 2047 & (int)(Math.sin((double)class413.field5678 / 40.0D) * 256.0D);
               arg1.field9528 = 5;
               arg1.field9535 = class16.field280;
               arg1.field9475 = class577.method4325((byte)76, class204.field2593.field11422);
               arg1.field9469 = class204.field2593.field169;
               arg1.field9529 = class204.field2593.field125;
               arg1.field9597 = 0;
               arg1.field9611 = class204.field2593.field175;
               class238 var2 = ~arg1.field9529 == 0 ? null : class532.field7812.method2473((byte)86, arg1.field9529);
               if (var2 != null) {
                  class129.method1099(arg1.field9611, var2, !arg0);
               }

            }
         } else if (!arg0) {
            field4231 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4234[5] + arg0 + ',' + (arg1 != null ? field4234[0] : field4234[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method2411(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method2402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         if (this.field4211) {
            float var11 = (float)this.method2406();
            float var12 = (float)this.method2396();
            float var13 = (-arg0 + arg2) / var11;
            float var14 = (-arg1 + arg3) / var11;
            float var15 = (-arg0 + arg4) / var12;
            float var16 = (-arg1 + arg5) / var12;
            float var17 = (float)this.field4226 * var15;
            float var18 = (float)this.field4226 * var16;
            float var19 = (float)this.field4207 * var13;
            float var20 = (float)this.field4207 * var14;
            float var21 = (float)this.field4212 * -var13;
            float var22 = (float)this.field4212 * -var14;
            float var23 = (float)this.field4204 * -var15;
            arg3 = arg3 + var22 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg1 = arg1 + var20 + var18;
            arg0 = arg0 + var19 + var17;
            float var24 = (float)this.field4204 * -var16;
            arg5 = arg5 + var20 + var24;
         }

         ++field4229;
         float var25 = -arg0 + arg2 + arg4;
         this.field4217.method4157((byte)111, (1 & arg9) != 0);
         float var26 = -arg1 + arg5 + arg3;
         this.field4202.method4008(-2);
         this.field4202.method4006(this.field4217, (byte)100);
         this.field4202.method4012(arg8, -14);
         this.field4202.method4009(arg6, 1);
         OpenGL.glColor4ub((byte)(arg7 >> 16), (byte)(arg7 >> 8), (byte)arg7, (byte)(arg7 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
         OpenGL.glVertex2f(arg0, arg1);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(arg4, arg5);
         OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
         OpenGL.glVertex2f(var25, var26);
         OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
         OpenGL.glVertex2f(arg2, arg3);
         OpenGL.glEnd();
      } catch (RuntimeException var28) {
         throw class93.method866(var28, field4234[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "()I"
   )
   public final int method2394() {
      try {
         ++field4210;
         return this.field4217.field1624;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4234[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   private final void method2429(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      try {
         this.field4217.method2126(arg5, arg3, arg6, true, arg0, arg4, -79, arg2, arg1);
         ++field4233;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4234[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4234[0] : field4234[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public final void method2409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         ++field4221;
         int var9 = arg0 + arg2;
         this.field4217.method4157((byte)111, false);
         int var10 = arg1 + arg3;
         this.field4202.method4008(-2);
         this.field4202.method4006(this.field4217, (byte)-126);
         this.field4202.method4012(arg6, -127);
         this.field4202.method4009(arg4, 1);
         OpenGL.glColor4ub((byte)(arg5 >> 16), (byte)(arg5 >> 8), (byte)arg5, (byte)(arg5 >> 24));
         if (this.field4217.field1622 && !this.field4211) {
            float var11 = (float)arg3 * this.field4217.field1621 / (float)this.field4217.field1620;
            float var12 = (float)arg2 * this.field4217.field1623 / (float)this.field4217.field1624;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var11);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var10);
            OpenGL.glTexCoord2f(var12, 0.0F);
            OpenGL.glVertex2i(var9, var10);
            OpenGL.glTexCoord2f(var12, var11);
            OpenGL.glVertex2i(var9, arg1);
            OpenGL.glEnd();
         } else {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef((float)this.field4207, (float)this.field4226, 0.0F);
            int var13 = this.method2406();
            int var14 = this.method2396();
            int var15 = this.field4217.field1620 + arg1;
            OpenGL.glBegin(7);
            int var16 = arg1;
            int var10000;
            int var17;
            int var10001;
            int var18;
            float var20;
            int var21;
            int var22;
            float var23;
            if (var8) {
               var17 = this.field4217.field1624 + arg0;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                  OpenGL.glVertex2i(var17, arg1);
                  var18 = var13 + arg0;
                  var17 += var13;
               }
            } else {
               if (var10 < var15) {
                  var10000 = arg1;
                  var10001 = var10;
                  if (!var8) {
                     if (arg1 < var10) {
                        var20 = (float)(this.field4217.field1620 + arg1 + -var10) * this.field4217.field1621 / (float)this.field4217.field1620;
                        var21 = arg0 - -this.field4217.field1624;
                        var22 = arg0;
                        if (var8) {
                           OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                           OpenGL.glVertex2i(arg0, arg1);
                           OpenGL.glTexCoord2f(0.0F, var20);
                           OpenGL.glVertex2i(arg0, var10);
                           OpenGL.glTexCoord2f(this.field4217.field1623, var20);
                           OpenGL.glVertex2i(var21, var10);
                           OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                           OpenGL.glVertex2i(var21, arg1);
                           var22 = var13 + arg0;
                           var21 += var13;
                        }

                        while(true) {
                           while(~var9 <= ~var21) {
                              OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                              OpenGL.glVertex2i(var22, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(var22, var10);
                              OpenGL.glTexCoord2f(this.field4217.field1623, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                              OpenGL.glVertex2i(var21, var16);
                              var22 += var13;
                              var21 += var13;
                           }

                           var10000 = ~var9;
                           var10001 = ~var22;
                           if (!var8) {
                              if (var10000 < var10001) {
                                 var23 = (float)(var9 - var22) * this.field4217.field1623 / (float)this.field4217.field1624;
                                 OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(var23, var20);
                                 OpenGL.glVertex2i(var9, var10);
                                 OpenGL.glTexCoord2f(var23, this.field4217.field1621);
                                 OpenGL.glVertex2i(var9, var16);
                              }
                              break;
                           }

                           var21 = var10000 + var10001;
                        }
                     }

                     OpenGL.glEnd();
                     OpenGL.glPopMatrix();
                     return;
                  }
               } else {
                  var10000 = this.field4217.field1624;
                  var10001 = arg0;
               }

               var17 = var10000 + var10001;
               var18 = arg0;
               if (var8) {
                  OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                  OpenGL.glVertex2i(arg0, arg1);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(arg0, var15);
                  OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                  OpenGL.glVertex2i(var17, arg1);
                  var18 = var13 + arg0;
                  var17 += var13;
               }
            }

            while(true) {
               while(~var9 <= ~var17) {
                  OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                  OpenGL.glVertex2i(var18, var16);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glVertex2i(var18, var15);
                  OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
                  OpenGL.glVertex2i(var17, var15);
                  OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                  OpenGL.glVertex2i(var17, var16);
                  var18 += var13;
                  var17 += var13;
               }

               var10000 = ~var18;
               var10001 = ~var9;
               if (!var8) {
                  if (var10000 > var10001) {
                     float var19 = (float)(-var18 + var9) * this.field4217.field1623 / (float)this.field4217.field1624;
                     OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                     OpenGL.glVertex2i(var18, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(var18, var15);
                     OpenGL.glTexCoord2f(var19, 0.0F);
                     OpenGL.glVertex2i(var9, var15);
                     OpenGL.glTexCoord2f(var19, this.field4217.field1621);
                     OpenGL.glVertex2i(var9, var16);
                  }

                  var15 += var14;
                  var16 += var14;
                  if (var10 < var15) {
                     var10000 = var16;
                     var10001 = var10;
                     if (!var8) {
                        if (var16 < var10) {
                           var20 = (float)(this.field4217.field1620 + var16 + -var10) * this.field4217.field1621 / (float)this.field4217.field1620;
                           var21 = arg0 - -this.field4217.field1624;
                           var22 = arg0;
                           if (var8) {
                              OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                              OpenGL.glVertex2i(arg0, var16);
                              OpenGL.glTexCoord2f(0.0F, var20);
                              OpenGL.glVertex2i(arg0, var10);
                              OpenGL.glTexCoord2f(this.field4217.field1623, var20);
                              OpenGL.glVertex2i(var21, var10);
                              OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                              OpenGL.glVertex2i(var21, var16);
                              var22 = var13 + arg0;
                              var21 += var13;
                           }

                           while(true) {
                              while(~var9 <= ~var21) {
                                 OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                                 OpenGL.glVertex2i(var22, var16);
                                 OpenGL.glTexCoord2f(0.0F, var20);
                                 OpenGL.glVertex2i(var22, var10);
                                 OpenGL.glTexCoord2f(this.field4217.field1623, var20);
                                 OpenGL.glVertex2i(var21, var10);
                                 OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                                 OpenGL.glVertex2i(var21, var16);
                                 var22 += var13;
                                 var21 += var13;
                              }

                              var10000 = ~var9;
                              var10001 = ~var22;
                              if (!var8) {
                                 if (var10000 < var10001) {
                                    var23 = (float)(var9 - var22) * this.field4217.field1623 / (float)this.field4217.field1624;
                                    OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                                    OpenGL.glVertex2i(var22, var16);
                                    OpenGL.glTexCoord2f(0.0F, var20);
                                    OpenGL.glVertex2i(var22, var10);
                                    OpenGL.glTexCoord2f(var23, var20);
                                    OpenGL.glVertex2i(var9, var10);
                                    OpenGL.glTexCoord2f(var23, this.field4217.field1621);
                                    OpenGL.glVertex2i(var9, var16);
                                 }
                                 break;
                              }

                              var21 = var10000 + var10001;
                           }
                        }

                        OpenGL.glEnd();
                        OpenGL.glPopMatrix();
                        return;
                     }
                  } else {
                     var10000 = this.field4217.field1624;
                     var10001 = arg0;
                  }

                  var17 = var10000 + var10001;
                  var18 = arg0;
                  if (var8) {
                     OpenGL.glTexCoord2f(0.0F, this.field4217.field1621);
                     OpenGL.glVertex2i(arg0, var16);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(arg0, var15);
                     OpenGL.glTexCoord2f(this.field4217.field1623, 0.0F);
                     OpenGL.glVertex2i(var17, var15);
                     OpenGL.glTexCoord2f(this.field4217.field1623, this.field4217.field1621);
                     OpenGL.glVertex2i(var17, var16);
                     var18 = var13 + arg0;
                     var17 += var13;
                  }
               } else {
                  var17 = var10000 + var10001;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class93.method866(var25, field4234[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "d",
      descriptor = "()I"
   )
   public final int method2396() {
      try {
         ++field4218;
         return this.field4217.field1620 + this.field4226 + this.field4204;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4234[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "c",
      descriptor = "()I"
   )
   public final int method2404() {
      try {
         ++field4228;
         return this.field4217.field1620;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4234[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method2405(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4209;
         this.field4226 = arg1;
         this.field4212 = arg2;
         this.field4204 = arg3;
         this.field4207 = arg0;
         this.field4211 = ~this.field4207 != -1 || this.field4226 != 0 || this.field4212 != 0 || ~this.field4204 != -1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4234[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method2408(int[] arg0) {
      try {
         arg0[2] = this.field4212;
         arg0[1] = this.field4226;
         arg0[3] = this.field4204;
         ++field4220;
         arg0[0] = this.field4207;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4234[9] + (arg0 != null ? field4234[0] : field4234[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2410(int arg0, int arg1, int arg2) {
      try {
         OpenGL.glPixelTransferf(3348, 0.5F);
         ++field4225;
         OpenGL.glPixelTransferf(3349, 0.499F);
         OpenGL.glPixelTransferf(3352, 0.5F);
         OpenGL.glPixelTransferf(3353, 0.499F);
         OpenGL.glPixelTransferf(3354, 0.5F);
         OpenGL.glPixelTransferf(3355, 0.499F);
         this.field4205 = class539.method4089(this.field4217.field1624, this.field4202, arg0, this.field4217.field1620, arg1, (byte)78);
         this.field4213 = arg2;
         OpenGL.glPixelTransferf(3348, 1.0F);
         OpenGL.glPixelTransferf(3349, 0.0F);
         OpenGL.glPixelTransferf(3352, 1.0F);
         OpenGL.glPixelTransferf(3353, 0.0F);
         OpenGL.glPixelTransferf(3354, 1.0F);
         OpenGL.glPixelTransferf(3355, 0.0F);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4234[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "<init>",
      descriptor = "(Liu;IIZ)V"
   )
   public class302(class530 arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field4202 = arg0;
         this.field4217 = class112.method1007(arg0, arg3 ? 6408 : 6407, false, arg2, arg1);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4234[2] + (arg0 != null ? field4234[0] : field4234[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "<init>",
      descriptor = "(Liu;IIII)V"
   )
   public class302(class530 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field4202 = arg0;
         this.field4217 = class539.method4089(arg3, arg0, arg1, arg4, arg2, (byte)78);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4234[2] + (arg0 != null ? field4234[0] : field4234[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "<init>",
      descriptor = "(Liu;II[III)V"
   )
   public class302(class530 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      try {
         this.field4202 = arg0;
         this.field4217 = class306.method2446(arg5, arg2, arg0, false, arg1, true, arg4, arg3);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field4234[2] + (arg0 != null ? field4234[0] : field4234[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4234[0] : field4234[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2430(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2431(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
