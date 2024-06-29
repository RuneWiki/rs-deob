import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class27 {
   @OriginalMember(
      owner = "client!cv",
      name = "h",
      descriptor = "I"
   )
   private static int field401;
   @OriginalMember(
      owner = "client!cv",
      name = "c",
      descriptor = "I"
   )
   private static int field402;
   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "I"
   )
   private static int field403;
   @OriginalMember(
      owner = "client!cv",
      name = "e",
      descriptor = "I"
   )
   private static int field404;
   @OriginalMember(
      owner = "client!cv",
      name = "f",
      descriptor = "I"
   )
   private static int field406;
   @OriginalMember(
      owner = "client!cv",
      name = "g",
      descriptor = "I"
   )
   private static int field407;
   @OriginalMember(
      owner = "client!cv",
      name = "d",
      descriptor = "I"
   )
   private static int field408;
   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "[I"
   )
   private static int[] field405;

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(Lha;[IIII[I[I)V"
   )
   private static final void method208(class479 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method417(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method213();
         method217(arg1, arg2, arg3);
         method214(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method209(var7[3])) {
                  return;
               }

               var8 = field406;
               var9 = field408;
               var10 = field403;
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

            arg0.method474(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(I)Z"
   )
   private static final boolean method209(int arg0) {
      int var1 = field407;
      int var2 = field402;
      int var3 = field403;

      while(var2 >= var1) {
         ++var3;
         field403 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = field404;

         while(var1 < field401) {
            int var5 = field405[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = field405[var1];
            int var7 = field405[var1 + 2];
            int var8 = field405[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            field405[var1] = var10;
            field405[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = field405[var11 + 3];
            if (var3 >= var12) {
               field405[var11] = field405[var4];
               field405[var11 + 1] = field405[var4 + 1];
               field405[var11 + 2] = field405[var4 + 2];
               field405[var11 + 3] = field405[var4 + 3];
               var4 += 4;
            }
         }

         if (field401 == var4) {
            field401 = 0;
            return false;
         }

         method216(var4, var1);
         field404 = var4;
         field407 = var1;
         var2 = var4;
      }

      field406 = field405[var2] >> 16;
      field408 = field405[var2 + 4] >> 16;
      field405[var2] += field405[var2 + 2];
      field405[var2 + 4] += field405[var2 + 6];
      var2 += 8;
      field402 = var2;
      return true;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "()V"
   )
   public static void method210() {
      field405 = null;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(Lha;[II)V"
   )
   public static final void method211(class479 arg0, int[] arg1, int arg2) {
      method208(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(II)V"
   )
   private static final void method212(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = field405[arg0];
         int var4 = field405[arg0 + 1];
         int var5 = field405[arg0 + 2];
         int var6 = field405[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field405[var7 + 1];
            if (var8 < var4) {
               field405[var2] = field405[var7];
               field405[var2 + 1] = var8;
               field405[var2 + 2] = field405[var7 + 2];
               field405[var2 + 3] = field405[var7 + 3];
               var2 += 4;
               field405[var7] = field405[var2];
               field405[var7 + 1] = field405[var2 + 1];
               field405[var7 + 2] = field405[var2 + 2];
               field405[var7 + 3] = field405[var2 + 3];
            }
         }

         field405[var2] = var3;
         field405[var2 + 1] = var4;
         field405[var2 + 2] = var5;
         field405[var2 + 3] = var6;
         method212(arg0, var2);
         method212(var2 + 4, arg1);
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "()V"
   )
   private static final void method213() {
      field401 = 0;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(I)V"
   )
   private static final void method214(int arg0) {
      if (field401 < 0) {
         field402 = 0;
         field407 = 0;
         field404 = 0;
         field403 = 2147483646;
      } else {
         method212(0, field401);
         int var1 = field405[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < field401; var3 += 4) {
            int var4 = field405[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = field405[var3];
            int var6 = field405[var3 + 2];
            int var7 = field405[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field405[var3] = (var1 - var4) * var8 + var9;
            field405[var3 + 2] = var8;
         }

         field404 = var2;
         field407 = var3;
         field402 = var3;
         field403 = var1 - 1;
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(Lha;[II[I[I)V"
   )
   public static final void method215(class479 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method208(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(II)V"
   )
   private static final void method216(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = field405[var3 - 4];
               int var5 = field405[var3];
               if (var4 > var5) {
                  var2 = false;
                  field405[var3 - 4] = var5;
                  field405[var3] = var4;
                  int var6 = field405[var3 - 2];
                  field405[var3 - 2] = field405[var3 + 2];
                  field405[var3 + 2] = var6;
                  int var7 = field405[var3 - 1];
                  field405[var3 - 1] = field405[var3 + 3];
                  field405[var3 + 3] = var7;
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
      owner = "client!cv",
      name = "a",
      descriptor = "([III)V"
   )
   private static final void method217(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + field401;
      if (field405 == null || field405.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < field401; ++var5) {
            var4[var5] = field405[var5];
         }

         field405 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            field405[field401++] = arg0[var7];
            field405[field401++] = var9;
            field405[field401++] = arg0[var8];
            field405[field401++] = var10;
         } else if (var10 < var9) {
            field405[field401++] = arg0[var8];
            field405[field401++] = var10;
            field405[field401++] = arg0[var7];
            field405[field401++] = var9;
         }

         var7 = var8;
      }

   }
}
