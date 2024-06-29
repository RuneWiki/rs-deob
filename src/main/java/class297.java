import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class297 extends class648 {
   @OriginalMember(
      owner = "client!uk",
      name = "i",
      descriptor = "Lpq;"
   )
   public class195 field4165;
   @OriginalMember(
      owner = "client!uk",
      name = "d",
      descriptor = "I"
   )
   public int field4169;
   @OriginalMember(
      owner = "client!uk",
      name = "o",
      descriptor = "I"
   )
   public int field4151;
   @OriginalMember(
      owner = "client!uk",
      name = "r",
      descriptor = "I"
   )
   public static int field4147 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "n",
      descriptor = "I"
   )
   public static int field4154 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "I"
   )
   private static int field4171 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "E",
      descriptor = "I"
   )
   public static int field4160 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "q",
      descriptor = "I"
   )
   private static int field4175 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "G",
      descriptor = "I"
   )
   public static int field4172 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "s",
      descriptor = "I"
   )
   public static int field4159 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "j",
      descriptor = "I"
   )
   public static int field4156 = 0;
   @OriginalMember(
      owner = "client!uk",
      name = "e",
      descriptor = "I"
   )
   private static int field4146;
   @OriginalMember(
      owner = "client!uk",
      name = "m",
      descriptor = "I"
   )
   public int field4148;
   @OriginalMember(
      owner = "client!uk",
      name = "g",
      descriptor = "I"
   )
   public static int field4149;
   @OriginalMember(
      owner = "client!uk",
      name = "F",
      descriptor = "I"
   )
   public int field4150;
   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "I"
   )
   public static int field4152;
   @OriginalMember(
      owner = "client!uk",
      name = "h",
      descriptor = "I"
   )
   private static int field4153;
   @OriginalMember(
      owner = "client!uk",
      name = "B",
      descriptor = "I"
   )
   public static int field4155;
   @OriginalMember(
      owner = "client!uk",
      name = "l",
      descriptor = "I"
   )
   public static int field4158;
   @OriginalMember(
      owner = "client!uk",
      name = "u",
      descriptor = "I"
   )
   public static int field4161;
   @OriginalMember(
      owner = "client!uk",
      name = "k",
      descriptor = "I"
   )
   public static int field4162;
   @OriginalMember(
      owner = "client!uk",
      name = "x",
      descriptor = "I"
   )
   public static int field4163;
   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "I"
   )
   public int field4164;
   @OriginalMember(
      owner = "client!uk",
      name = "p",
      descriptor = "I"
   )
   private static int field4166;
   @OriginalMember(
      owner = "client!uk",
      name = "t",
      descriptor = "I"
   )
   public static int field4167;
   @OriginalMember(
      owner = "client!uk",
      name = "A",
      descriptor = "I"
   )
   private static int field4168;
   @OriginalMember(
      owner = "client!uk",
      name = "f",
      descriptor = "I"
   )
   public static int field4170;
   @OriginalMember(
      owner = "client!uk",
      name = "v",
      descriptor = "I"
   )
   public static int field4173;
   @OriginalMember(
      owner = "client!uk",
      name = "D",
      descriptor = "I"
   )
   public static int field4174;
   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "I"
   )
   public static int field4176;
   @OriginalMember(
      owner = "client!uk",
      name = "w",
      descriptor = "I"
   )
   public int field4177;
   @OriginalMember(
      owner = "client!uk",
      name = "C",
      descriptor = "I"
   )
   public static int field4178;
   @OriginalMember(
      owner = "client!uk",
      name = "y",
      descriptor = "[I"
   )
   private int[] field4157;

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method2393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "()I"
   )
   public final int method2394() {
      return this.field4169;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method2395(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9) {
      if (this.field4165.method1623()) {
         throw new IllegalStateException();
      } else if (this.method2407(arg0, arg1, arg2, arg3, arg4, arg5)) {
         class424 var11 = (class424)arg7;
         this.method2400(var11.field5778, var11.field5776, field4146 - arg8, -arg9 - (field4178 - field4166));
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "d",
      descriptor = "()I"
   )
   public final int method2396() {
      return this.field4177 + this.field4151 + this.field4150;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method2397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method2398(int arg0, int arg1, class87 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method2399(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "([I[III)V"
   )
   public abstract void method2400(int[] arg0, int[] arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method2401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method2402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field4165.method1623()) {
         throw new IllegalStateException();
      } else if (this.method2407(arg0, arg1, arg2, arg3, arg4, arg5)) {
         field4149 = arg7;
         if (arg6 != 1) {
            field4156 = arg7 >>> 24;
            field4147 = 256 - field4156;
            if (arg6 == 0) {
               field4160 = (arg7 & 16711680) >> 16;
               field4154 = (arg7 & 65280) >> 8;
               field4172 = arg7 & 255;
            } else if (arg6 == 2) {
               field4175 = arg7 >>> 24;
               field4171 = 256 - field4175;
               int var11 = (arg7 & 16711935) * field4171 & -16711936;
               int var12 = (arg7 & 65280) * field4171 & 16711680;
               field4159 = (var11 | var12) >>> 8;
            }
         }

         if (arg6 == 1) {
            if (arg8 == 0) {
               this.method2403(1, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2403(1, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2403(1, 2);
               return;
            }
         } else if (arg6 == 0) {
            if (arg8 == 0) {
               this.method2403(0, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2403(0, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2403(0, 2);
               return;
            }
         } else if (arg6 == 3) {
            if (arg8 == 0) {
               this.method2403(3, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2403(3, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2403(3, 2);
               return;
            }
         } else if (arg6 == 2) {
            if (arg8 == 0) {
               this.method2403(2, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2403(2, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2403(2, 2);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method2403(int arg0, int arg1);

   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "()I"
   )
   public final int method2404() {
      return this.field4151;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method2405(int arg0, int arg1, int arg2, int arg3) {
      this.field4148 = arg0;
      this.field4177 = arg1;
      this.field4164 = arg2;
      this.field4150 = arg3;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "()I"
   )
   public final int method2406() {
      return this.field4169 + this.field4148 + this.field4164;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(FFFFFF)Z"
   )
   private final boolean method2407(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      int var7 = this.field4169 + this.field4148 + this.field4164;
      int var8 = this.field4177 + this.field4151 + this.field4150;
      if (this.field4169 != var7 || this.field4151 != var8) {
         float var9 = (arg2 - arg0) / (float)var7;
         float var10 = (arg3 - arg1) / (float)var7;
         float var11 = (arg4 - arg0) / (float)var8;
         float var12 = (arg5 - arg1) / (float)var8;
         float var13 = (float)this.field4177 * var11;
         float var14 = (float)this.field4177 * var12;
         float var15 = (float)this.field4148 * var9;
         float var16 = (float)this.field4148 * var10;
         float var17 = (float)this.field4164 * -var9;
         float var18 = (float)this.field4164 * -var10;
         float var19 = (float)this.field4150 * -var11;
         float var20 = (float)this.field4150 * -var12;
         arg0 += var13 + var15;
         arg1 += var14 + var16;
         arg2 += var13 + var17;
         arg3 += var14 + var18;
         arg4 += var15 + var19;
         arg5 += var16 + var20;
      }

      float var21 = arg2 - arg0 + arg4;
      float var22 = arg5 - arg1 + arg3;
      float var23;
      float var24;
      if (arg0 < arg2) {
         var23 = arg0;
         var24 = arg2;
      } else {
         var23 = arg2;
         var24 = arg0;
      }

      if (arg4 < var23) {
         var23 = arg4;
      }

      if (var21 < var23) {
         var23 = var21;
      }

      if (arg4 > var24) {
         var24 = arg4;
      }

      if (var21 > var24) {
         var24 = var21;
      }

      float var25;
      float var26;
      if (arg1 < arg3) {
         var25 = arg1;
         var26 = arg3;
      } else {
         var25 = arg3;
         var26 = arg1;
      }

      if (arg5 < var25) {
         var25 = arg5;
      }

      if (var22 < var25) {
         var25 = var22;
      }

      if (arg5 > var26) {
         var26 = arg5;
      }

      if (var22 > var26) {
         var26 = var22;
      }

      if (var23 < (float)this.field4165.field2483) {
         var23 = (float)this.field4165.field2483;
      }

      if (var24 > (float)this.field4165.field2492) {
         var24 = (float)this.field4165.field2492;
      }

      if (var25 < (float)this.field4165.field2512) {
         var25 = (float)this.field4165.field2512;
      }

      if (var26 > (float)this.field4165.field2495) {
         var26 = (float)this.field4165.field2495;
      }

      float var27 = var23 - var24;
      if (var27 >= 0.0F) {
         return false;
      } else {
         float var28 = var25 - var26;
         if (var28 >= 0.0F) {
            return false;
         } else {
            field4167 = this.field4165.field2486;
            field4152 = (int)((float)((int)var25 * field4167) + var23);
            float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
            float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
            field4176 = (int)((arg5 - arg1) * 4096.0F * (float)this.field4169 / var29);
            field4155 = (int)((arg3 - arg1) * 4096.0F * (float)this.field4151 / var30);
            field4173 = (int)((arg4 - arg0) * 4096.0F * (float)this.field4169 / var30);
            field4163 = (int)((arg2 - arg0) * 4096.0F * (float)this.field4151 / var29);
            field4153 = (int)(var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
            field4168 = (int)(var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
            field4161 = (this.field4169 >> 1 << 12) + (field4173 * field4168 >> 4);
            field4170 = (this.field4151 >> 1 << 12) + (field4168 * field4163 >> 4);
            field4158 = field4176 * field4153 >> 4;
            field4174 = field4155 * field4153 >> 4;
            field4146 = (int)var23;
            field4162 = (int)var27;
            field4166 = (int)var25;
            field4178 = (int)var28;
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method2408(int[] arg0) {
      arg0[0] = this.field4148;
      arg0[1] = this.field4177;
      arg0[2] = this.field4164;
      arg0[3] = this.field4150;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "<init>",
      descriptor = "(Lpq;II)V"
   )
   public class297(class195 arg0, int arg1, int arg2) {
      this.field4165 = arg0;
      this.field4169 = arg1;
      this.field4151 = arg2;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public final void method2409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field4165.method1623()) {
         throw new IllegalStateException();
      } else {
         if (this.field4157 == null) {
            this.field4157 = new int[4];
         }

         this.field4165.method417(this.field4157);
         this.field4165.method412(this.field4165.field2483, this.field4165.field2512, arg0 + arg2, arg1 + arg3);
         int var8 = this.method2406();
         int var9 = this.method2396();
         int var10 = (arg2 + var8 - 1) / var8;
         int var11 = (arg3 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var9 * var12;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method2399(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
         }

         this.field4165.method460(this.field4157[0], this.field4157[1], this.field4157[2], this.field4157[3]);
      }
   }
}
