import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class359 {
   @OriginalMember(
      owner = "client!jg",
      name = "c",
      descriptor = "I"
   )
   private static int field4893;
   @OriginalMember(
      owner = "client!jg",
      name = "e",
      descriptor = "I"
   )
   private static int field4895;
   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "I"
   )
   private static int field4896;
   @OriginalMember(
      owner = "client!jg",
      name = "h",
      descriptor = "I"
   )
   private static int field4897;
   @OriginalMember(
      owner = "client!jg",
      name = "d",
      descriptor = "I"
   )
   private static int field4898;
   @OriginalMember(
      owner = "client!jg",
      name = "g",
      descriptor = "I"
   )
   private static int field4899;
   @OriginalMember(
      owner = "client!jg",
      name = "f",
      descriptor = "I"
   )
   private static int field4900;
   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "[I"
   )
   private static int[] field4894;

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "()V",
      line = 3
   )
   private static final void method2687() {
      field4899 = 0;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(II)V",
      line = 6
   )
   private static final void method2688(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = field4894[arg0];
         int var4 = field4894[arg0 + 1];
         int var5 = field4894[arg0 + 2];
         int var6 = field4894[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4894[var7 + 1];
            if (var8 < var4) {
               field4894[var2] = field4894[var7];
               field4894[var2 + 1] = var8;
               field4894[var2 + 2] = field4894[var7 + 2];
               field4894[var2 + 3] = field4894[var7 + 3];
               var2 += 4;
               field4894[var7] = field4894[var2];
               field4894[var7 + 1] = field4894[var2 + 1];
               field4894[var7 + 2] = field4894[var2 + 2];
               field4894[var7 + 3] = field4894[var2 + 3];
            }
         }

         field4894[var2] = var3;
         field4894[var2 + 1] = var4;
         field4894[var2 + 2] = var5;
         field4894[var2 + 3] = var6;
         method2688(arg0, var2);
         method2688(var2 + 4, arg1);
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Lha;[II[I[I)V",
      line = 51
   )
   public static final void method2689(class66 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method2690(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Lha;[IIII[I[I)V",
      line = 62
   )
   private static final void method2690(class66 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method605(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method2687();
         method2692(arg1, arg2, arg3);
         method2693(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method2696(var7[3])) {
                  return;
               }

               var8 = field4897;
               var9 = field4893;
               var10 = field4896;
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

            arg0.method576(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "(II)V",
      line = 98
   )
   private static final void method2691(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = field4894[var3 - 4];
               int var5 = field4894[var3];
               if (var4 > var5) {
                  var2 = false;
                  field4894[var3 - 4] = var5;
                  field4894[var3] = var4;
                  int var6 = field4894[var3 - 2];
                  field4894[var3 - 2] = field4894[var3 + 2];
                  field4894[var3 + 2] = var6;
                  int var7 = field4894[var3 - 1];
                  field4894[var3 - 1] = field4894[var3 + 3];
                  field4894[var3 + 3] = var7;
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
      owner = "client!jg",
      name = "a",
      descriptor = "([III)V",
      line = 138
   )
   private static final void method2692(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + field4899;
      if (field4894 == null || field4894.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < field4899; ++var5) {
            var4[var5] = field4894[var5];
         }

         field4894 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            field4894[field4899++] = arg0[var7];
            field4894[field4899++] = var9;
            field4894[field4899++] = arg0[var8];
            field4894[field4899++] = var10;
         } else if (var10 < var9) {
            field4894[field4899++] = arg0[var8];
            field4894[field4899++] = var10;
            field4894[field4899++] = arg0[var7];
            field4894[field4899++] = var9;
         }

         var7 = var8;
      }

   }

   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "(I)V",
      line = 189
   )
   private static final void method2693(int arg0) {
      if (field4899 < 0) {
         field4900 = 0;
         field4898 = 0;
         field4895 = 0;
         field4896 = 2147483646;
      } else {
         method2688(0, field4899);
         int var1 = field4894[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < field4899; var3 += 4) {
            int var4 = field4894[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = field4894[var3];
            int var6 = field4894[var3 + 2];
            int var7 = field4894[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4894[var3] = (var1 - var4) * var8 + var9;
            field4894[var3 + 2] = var8;
         }

         field4895 = var2;
         field4898 = var3;
         field4900 = var3;
         field4896 = var1 - 1;
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Lha;[II)V",
      line = 234
   )
   public static final void method2694(class66 arg0, int[] arg1, int arg2) {
      method2690(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @OriginalMember(
      owner = "client!jg",
      name = "b",
      descriptor = "()V",
      line = 237
   )
   public static void method2695() {
      field4894 = null;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(I)Z",
      line = 245
   )
   private static final boolean method2696(int arg0) {
      int var1 = field4898;
      int var2 = field4900;
      int var3 = field4896;

      while(var2 >= var1) {
         ++var3;
         field4896 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = field4895;

         while(var1 < field4899) {
            int var5 = field4894[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = field4894[var1];
            int var7 = field4894[var1 + 2];
            int var8 = field4894[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            field4894[var1] = var10;
            field4894[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = field4894[var11 + 3];
            if (var3 >= var12) {
               field4894[var11] = field4894[var4];
               field4894[var11 + 1] = field4894[var4 + 1];
               field4894[var11 + 2] = field4894[var4 + 2];
               field4894[var11 + 3] = field4894[var4 + 3];
               var4 += 4;
            }
         }

         if (field4899 == var4) {
            field4899 = 0;
            return false;
         }

         method2691(var4, var1);
         field4895 = var4;
         field4898 = var1;
         var2 = var4;
      }

      field4897 = field4894[var2] >> 16;
      field4893 = field4894[var2 + 4] >> 16;
      field4894[var2] += field4894[var2 + 2];
      field4894[var2 + 4] += field4894[var2 + 6];
      var2 += 8;
      field4900 = var2;
      return true;
   }
}
