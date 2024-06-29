import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {
   @OriginalMember(
      owner = "client!ro",
      name = "f",
      descriptor = "I"
   )
   private static int field10;
   @OriginalMember(
      owner = "client!ro",
      name = "d",
      descriptor = "I"
   )
   private static int field11;
   @OriginalMember(
      owner = "client!ro",
      name = "c",
      descriptor = "I"
   )
   private static int field12;
   @OriginalMember(
      owner = "client!ro",
      name = "h",
      descriptor = "I"
   )
   private static int field14;
   @OriginalMember(
      owner = "client!ro",
      name = "g",
      descriptor = "I"
   )
   private static int field15;
   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "I"
   )
   private static int field8;
   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "I"
   )
   private static int field9;
   @OriginalMember(
      owner = "client!ro",
      name = "e",
      descriptor = "[I"
   )
   private static int[] field13;

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "([III)V",
      line = 8
   )
   private static final void method7(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + field15;
      if (field13 == null || field13.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < field15; ++var5) {
            var4[var5] = field13[var5];
         }

         field13 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            field13[field15++] = arg0[var7];
            field13[field15++] = var9;
            field13[field15++] = arg0[var8];
            field13[field15++] = var10;
         } else if (var10 < var9) {
            field13[field15++] = arg0[var8];
            field13[field15++] = var10;
            field13[field15++] = arg0[var7];
            field13[field15++] = var9;
         }

         var7 = var8;
      }

   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Lha;[II[I[I)V",
      line = 57
   )
   public static final void method8(class65 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method9(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Lha;[IIII[I[I)V",
      line = 63
   )
   private static final void method9(class65 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method254(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method10();
         method7(arg1, arg2, arg3);
         method12(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method11(var7[3])) {
                  return;
               }

               var8 = field11;
               var9 = field10;
               var10 = field14;
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

            arg0.method361(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "()V",
      line = 100
   )
   private static final void method10() {
      field15 = 0;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "(I)Z",
      line = 107
   )
   private static final boolean method11(int arg0) {
      int var1 = field12;
      int var2 = field8;
      int var3 = field14;

      while(var2 >= var1) {
         ++var3;
         field14 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = field9;

         while(var1 < field15) {
            int var5 = field13[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = field13[var1];
            int var7 = field13[var1 + 2];
            int var8 = field13[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            field13[var1] = var10;
            field13[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = field13[var11 + 3];
            if (var3 >= var12) {
               field13[var11] = field13[var4];
               field13[var11 + 1] = field13[var4 + 1];
               field13[var11 + 2] = field13[var4 + 2];
               field13[var11 + 3] = field13[var4 + 3];
               var4 += 4;
            }
         }

         if (field15 == var4) {
            field15 = 0;
            return false;
         }

         method13(var4, var1);
         field9 = var4;
         field12 = var1;
         var2 = var4;
      }

      field11 = field13[var2] >> 16;
      field10 = field13[var2 + 4] >> 16;
      field13[var2] += field13[var2 + 2];
      field13[var2 + 4] += field13[var2 + 6];
      var2 += 8;
      field8 = var2;
      return true;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(I)V",
      line = 182
   )
   private static final void method12(int arg0) {
      if (field15 < 0) {
         field8 = 0;
         field12 = 0;
         field9 = 0;
         field14 = 2147483646;
      } else {
         method16(0, field15);
         int var1 = field13[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < field15; var3 += 4) {
            int var4 = field13[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = field13[var3];
            int var6 = field13[var3 + 2];
            int var7 = field13[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field13[var3] = (var1 - var4) * var8 + var9;
            field13[var3 + 2] = var8;
         }

         field9 = var2;
         field12 = var3;
         field8 = var3;
         field14 = var1 - 1;
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "(II)V",
      line = 229
   )
   private static final void method13(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = field13[var3 - 4];
               int var5 = field13[var3];
               if (var4 > var5) {
                  var2 = false;
                  field13[var3 - 4] = var5;
                  field13[var3] = var4;
                  int var6 = field13[var3 - 2];
                  field13[var3 - 2] = field13[var3 + 2];
                  field13[var3 + 2] = var6;
                  int var7 = field13[var3 - 1];
                  field13[var3 - 1] = field13[var3 + 3];
                  field13[var3 + 3] = var7;
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
      owner = "client!ro",
      name = "a",
      descriptor = "()V",
      line = 266
   )
   public static void method14() {
      field13 = null;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Lha;[II)V",
      line = 270
   )
   public static final void method15(class65 arg0, int[] arg1, int arg2) {
      method9(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(II)V",
      line = 276
   )
   private static final void method16(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = field13[arg0];
         int var4 = field13[arg0 + 1];
         int var5 = field13[arg0 + 2];
         int var6 = field13[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field13[var7 + 1];
            if (var8 < var4) {
               field13[var2] = field13[var7];
               field13[var2 + 1] = var8;
               field13[var2 + 2] = field13[var7 + 2];
               field13[var2 + 3] = field13[var7 + 3];
               var2 += 4;
               field13[var7] = field13[var2];
               field13[var7 + 1] = field13[var2 + 1];
               field13[var7 + 2] = field13[var2 + 2];
               field13[var7 + 3] = field13[var2 + 3];
            }
         }

         field13[var2] = var3;
         field13[var2 + 1] = var4;
         field13[var2 + 2] = var5;
         field13[var2 + 3] = var6;
         method16(arg0, var2);
         method16(var2 + 4, arg1);
      }
   }
}
