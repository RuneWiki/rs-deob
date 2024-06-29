import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class493 {
   @OriginalMember(
      owner = "client!qe",
      name = "f",
      descriptor = "I"
   )
   private static int field7274;
   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "I"
   )
   private static int field7276;
   @OriginalMember(
      owner = "client!qe",
      name = "c",
      descriptor = "I"
   )
   private static int field7277;
   @OriginalMember(
      owner = "client!qe",
      name = "h",
      descriptor = "I"
   )
   private static int field7278;
   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "I"
   )
   private static int field7279;
   @OriginalMember(
      owner = "client!qe",
      name = "d",
      descriptor = "I"
   )
   private static int field7280;
   @OriginalMember(
      owner = "client!qe",
      name = "g",
      descriptor = "I"
   )
   private static int field7281;
   @OriginalMember(
      owner = "client!qe",
      name = "e",
      descriptor = "[I"
   )
   private static int[] field7275;

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   private static final void method3650(int arg0) {
      if (field7277 < 0) {
         field7280 = 0;
         field7281 = 0;
         field7278 = 0;
         field7279 = 2147483646;
      } else {
         method3653(0, field7277);
         int var1 = field7275[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < field7277; var3 += 4) {
            int var4 = field7275[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = field7275[var3];
            int var6 = field7275[var3 + 2];
            int var7 = field7275[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field7275[var3] = (var1 - var4) * var8 + var9;
            field7275[var3 + 2] = var8;
         }

         field7278 = var2;
         field7281 = var3;
         field7280 = var3;
         field7279 = var1 - 1;
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "([III)V",
      line = 53
   )
   private static final void method3651(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + field7277;
      if (field7275 == null || field7275.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < field7277; ++var5) {
            var4[var5] = field7275[var5];
         }

         field7275 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            field7275[field7277++] = arg0[var7];
            field7275[field7277++] = var9;
            field7275[field7277++] = arg0[var8];
            field7275[field7277++] = var10;
         } else if (var10 < var9) {
            field7275[field7277++] = arg0[var8];
            field7275[field7277++] = var10;
            field7275[field7277++] = arg0[var7];
            field7275[field7277++] = var9;
         }

         var7 = var8;
      }

   }

   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "(I)Z",
      line = 104
   )
   private static final boolean method3652(int arg0) {
      int var1 = field7281;
      int var2 = field7280;
      int var3 = field7279;

      while(var2 >= var1) {
         ++var3;
         field7279 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = field7278;

         while(var1 < field7277) {
            int var5 = field7275[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = field7275[var1];
            int var7 = field7275[var1 + 2];
            int var8 = field7275[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            field7275[var1] = var10;
            field7275[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = field7275[var11 + 3];
            if (var3 >= var12) {
               field7275[var11] = field7275[var4];
               field7275[var11 + 1] = field7275[var4 + 1];
               field7275[var11 + 2] = field7275[var4 + 2];
               field7275[var11 + 3] = field7275[var4 + 3];
               var4 += 4;
            }
         }

         if (field7277 == var4) {
            field7277 = 0;
            return false;
         }

         method3656(var4, var1);
         field7278 = var4;
         field7281 = var1;
         var2 = var4;
      }

      field7276 = field7275[var2] >> 16;
      field7274 = field7275[var2 + 4] >> 16;
      field7275[var2] += field7275[var2 + 2];
      field7275[var2 + 4] += field7275[var2 + 6];
      var2 += 8;
      field7280 = var2;
      return true;
   }

   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "(II)V",
      line = 179
   )
   private static final void method3653(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = field7275[arg0];
         int var4 = field7275[arg0 + 1];
         int var5 = field7275[arg0 + 2];
         int var6 = field7275[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field7275[var7 + 1];
            if (var8 < var4) {
               field7275[var2] = field7275[var7];
               field7275[var2 + 1] = var8;
               field7275[var2 + 2] = field7275[var7 + 2];
               field7275[var2 + 3] = field7275[var7 + 3];
               var2 += 4;
               field7275[var7] = field7275[var2];
               field7275[var7 + 1] = field7275[var2 + 1];
               field7275[var7 + 2] = field7275[var2 + 2];
               field7275[var7 + 3] = field7275[var2 + 3];
            }
         }

         field7275[var2] = var3;
         field7275[var2 + 1] = var4;
         field7275[var2 + 2] = var5;
         field7275[var2 + 3] = var6;
         method3653(arg0, var2);
         method3653(var2 + 4, arg1);
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "()V",
      line = 223
   )
   public static void method3654() {
      field7275 = null;
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(Lha;[II)V",
      line = 231
   )
   public static final void method3655(class66 arg0, int[] arg1, int arg2) {
      method3657(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(II)V",
      line = 236
   )
   private static final void method3656(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = field7275[var3 - 4];
               int var5 = field7275[var3];
               if (var4 > var5) {
                  var2 = false;
                  field7275[var3 - 4] = var5;
                  field7275[var3] = var4;
                  int var6 = field7275[var3 - 2];
                  field7275[var3 - 2] = field7275[var3 + 2];
                  field7275[var3 + 2] = var6;
                  int var7 = field7275[var3 - 1];
                  field7275[var3 - 1] = field7275[var3 + 3];
                  field7275[var3 + 3] = var7;
               }
            }

            if (!var2) {
               arg1 -= 4;
               continue;
            }
         }

         return;
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(Lha;[IIII[I[I)V",
      line = 277
   )
   private static final void method3657(class66 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method618(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method3659();
         method3651(arg1, arg2, arg3);
         method3650(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method3652(var7[3])) {
                  return;
               }

               var8 = field7276;
               var9 = field7274;
               var10 = field7279;
               if (arg5 == null) {
                  break;
               }

               int var11 = var10 - var7[1];
               if (var8 < arg5[var11] + var7[0]) {
                  var8 = arg5[var11] + var7[0];
               }

               if (var9 > arg5[var11] + arg6[var11] + var7[0]) {
                  var9 = arg5[var11] + arg6[var11] + var7[0];
               }
            } while(var9 - var8 <= 0);

            arg0.method615(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(Lha;[II[I[I)V",
      line = 313
   )
   public static final void method3658(class66 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method3657(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "()V",
      line = 316
   )
   private static final void method3659() {
      field7277 = 0;
   }
}
