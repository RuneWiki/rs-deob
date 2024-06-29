import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class551 {
   @OriginalMember(
      owner = "client!nq",
      name = "g",
      descriptor = "I"
   )
   private static int field8238;
   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "I"
   )
   private static int field8239;
   @OriginalMember(
      owner = "client!nq",
      name = "e",
      descriptor = "I"
   )
   private static int field8240;
   @OriginalMember(
      owner = "client!nq",
      name = "d",
      descriptor = "I"
   )
   private static int field8241;
   @OriginalMember(
      owner = "client!nq",
      name = "f",
      descriptor = "I"
   )
   private static int field8243;
   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "I"
   )
   private static int field8244;
   @OriginalMember(
      owner = "client!nq",
      name = "h",
      descriptor = "I"
   )
   private static int field8245;
   @OriginalMember(
      owner = "client!nq",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field8242;

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(II)V"
   )
   private static final void method4179(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = field8242[var3 - 4];
               int var5 = field8242[var3];
               if (var4 > var5) {
                  var2 = false;
                  field8242[var3 - 4] = var5;
                  field8242[var3] = var4;
                  int var6 = field8242[var3 - 2];
                  field8242[var3 - 2] = field8242[var3 + 2];
                  field8242[var3 + 2] = var6;
                  int var7 = field8242[var3 - 1];
                  field8242[var3 - 1] = field8242[var3 + 3];
                  field8242[var3 + 3] = var7;
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
      owner = "client!nq",
      name = "a",
      descriptor = "([III)V"
   )
   private static final void method4180(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + field8245;
      if (field8242 == null || field8242.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < field8245; ++var5) {
            var4[var5] = field8242[var5];
         }

         field8242 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            field8242[field8245++] = arg0[var7];
            field8242[field8245++] = var9;
            field8242[field8245++] = arg0[var8];
            field8242[field8245++] = var10;
         } else if (var10 < var9) {
            field8242[field8245++] = arg0[var8];
            field8242[field8245++] = var10;
            field8242[field8245++] = arg0[var7];
            field8242[field8245++] = var9;
         }

         var7 = var8;
      }

   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Lha;[IIII[I[I)V"
   )
   private static final void method4181(class610 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method626(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method4184();
         method4180(arg1, arg2, arg3);
         method4185(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method4187(var7[3])) {
                  return;
               }

               var8 = field8243;
               var9 = field8241;
               var10 = field8240;
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

            arg0.method665(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "()V"
   )
   public static void method4182() {
      field8242 = null;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Lha;[II[I[I)V"
   )
   public static final void method4183(class610 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method4181(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "()V"
   )
   private static final void method4184() {
      field8245 = 0;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(I)V"
   )
   private static final void method4185(int arg0) {
      if (field8245 < 0) {
         field8244 = 0;
         field8238 = 0;
         field8239 = 0;
         field8240 = 2147483646;
      } else {
         method4188(0, field8245);
         int var1 = field8242[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < field8245; var3 += 4) {
            int var4 = field8242[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = field8242[var3];
            int var6 = field8242[var3 + 2];
            int var7 = field8242[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field8242[var3] = (var1 - var4) * var8 + var9;
            field8242[var3 + 2] = var8;
         }

         field8239 = var2;
         field8238 = var3;
         field8244 = var3;
         field8240 = var1 - 1;
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Lha;[II)V"
   )
   public static final void method4186(class610 arg0, int[] arg1, int arg2) {
      method4181(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(I)Z"
   )
   private static final boolean method4187(int arg0) {
      int var1 = field8238;
      int var2 = field8244;
      int var3 = field8240;

      while(var2 >= var1) {
         ++var3;
         field8240 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = field8239;

         while(var1 < field8245) {
            int var5 = field8242[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = field8242[var1];
            int var7 = field8242[var1 + 2];
            int var8 = field8242[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            field8242[var1] = var10;
            field8242[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = field8242[var11 + 3];
            if (var3 >= var12) {
               field8242[var11] = field8242[var4];
               field8242[var11 + 1] = field8242[var4 + 1];
               field8242[var11 + 2] = field8242[var4 + 2];
               field8242[var11 + 3] = field8242[var4 + 3];
               var4 += 4;
            }
         }

         if (field8245 == var4) {
            field8245 = 0;
            return false;
         }

         method4179(var4, var1);
         field8239 = var4;
         field8238 = var1;
         var2 = var4;
      }

      field8243 = field8242[var2] >> 16;
      field8241 = field8242[var2 + 4] >> 16;
      field8242[var2] += field8242[var2 + 2];
      field8242[var2 + 4] += field8242[var2 + 6];
      var2 += 8;
      field8244 = var2;
      return true;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(II)V"
   )
   private static final void method4188(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = field8242[arg0];
         int var4 = field8242[arg0 + 1];
         int var5 = field8242[arg0 + 2];
         int var6 = field8242[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field8242[var7 + 1];
            if (var8 < var4) {
               field8242[var2] = field8242[var7];
               field8242[var2 + 1] = var8;
               field8242[var2 + 2] = field8242[var7 + 2];
               field8242[var2 + 3] = field8242[var7 + 3];
               var2 += 4;
               field8242[var7] = field8242[var2];
               field8242[var7 + 1] = field8242[var2 + 1];
               field8242[var7 + 2] = field8242[var2 + 2];
               field8242[var7 + 3] = field8242[var2 + 3];
            }
         }

         field8242[var2] = var3;
         field8242[var2 + 1] = var4;
         field8242[var2 + 2] = var5;
         field8242[var2 + 3] = var6;
         method4188(arg0, var2);
         method4188(var2 + 4, arg1);
      }
   }
}
