import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class329 {
   @OriginalMember(
      owner = "client!lb",
      name = "d",
      descriptor = "I"
   )
   private static int field4886;
   @OriginalMember(
      owner = "client!lb",
      name = "h",
      descriptor = "I"
   )
   private static int field4887;
   @OriginalMember(
      owner = "client!lb",
      name = "g",
      descriptor = "I"
   )
   private static int field4888;
   @OriginalMember(
      owner = "client!lb",
      name = "f",
      descriptor = "I"
   )
   private static int field4889;
   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "I"
   )
   private static int field4891;
   @OriginalMember(
      owner = "client!lb",
      name = "c",
      descriptor = "I"
   )
   private static int field4892;
   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "I"
   )
   private static int field4893;
   @OriginalMember(
      owner = "client!lb",
      name = "e",
      descriptor = "[I"
   )
   private static int[] field4890;

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(Lha;[IIII[I[I)V"
   )
   private static final void method2637(class17 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method211(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method2641();
         method2638(arg1, arg2, arg3);
         method2644(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method2640(var7[3])) {
                  return;
               }

               var8 = field4886;
               var9 = field4893;
               var10 = field4889;
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

            arg0.method218(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "([III)V"
   )
   private static final void method2638(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + field4887;
      if (field4890 == null || field4890.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < field4887; ++var5) {
            var4[var5] = field4890[var5];
         }

         field4890 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            field4890[field4887++] = arg0[var7];
            field4890[field4887++] = var9;
            field4890[field4887++] = arg0[var8];
            field4890[field4887++] = var10;
         } else if (var10 < var9) {
            field4890[field4887++] = arg0[var8];
            field4890[field4887++] = var10;
            field4890[field4887++] = arg0[var7];
            field4890[field4887++] = var9;
         }

         var7 = var8;
      }

   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(Lha;[II[I[I)V"
   )
   public static final void method2639(class17 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method2637(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "(I)Z"
   )
   private static final boolean method2640(int arg0) {
      int var1 = field4892;
      int var2 = field4891;
      int var3 = field4889;

      while(var2 >= var1) {
         ++var3;
         field4889 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = field4888;

         while(var1 < field4887) {
            int var5 = field4890[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = field4890[var1];
            int var7 = field4890[var1 + 2];
            int var8 = field4890[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            field4890[var1] = var10;
            field4890[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = field4890[var11 + 3];
            if (var3 >= var12) {
               field4890[var11] = field4890[var4];
               field4890[var11 + 1] = field4890[var4 + 1];
               field4890[var11 + 2] = field4890[var4 + 2];
               field4890[var11 + 3] = field4890[var4 + 3];
               var4 += 4;
            }
         }

         if (field4887 == var4) {
            field4887 = 0;
            return false;
         }

         method2646(var4, var1);
         field4888 = var4;
         field4892 = var1;
         var2 = var4;
      }

      field4886 = field4890[var2] >> 16;
      field4893 = field4890[var2 + 4] >> 16;
      field4890[var2] += field4890[var2 + 2];
      field4890[var2 + 4] += field4890[var2 + 6];
      var2 += 8;
      field4891 = var2;
      return true;
   }

   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "()V"
   )
   private static final void method2641() {
      field4887 = 0;
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(II)V"
   )
   private static final void method2642(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = field4890[arg0];
         int var4 = field4890[arg0 + 1];
         int var5 = field4890[arg0 + 2];
         int var6 = field4890[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field4890[var7 + 1];
            if (var8 < var4) {
               field4890[var2] = field4890[var7];
               field4890[var2 + 1] = var8;
               field4890[var2 + 2] = field4890[var7 + 2];
               field4890[var2 + 3] = field4890[var7 + 3];
               var2 += 4;
               field4890[var7] = field4890[var2];
               field4890[var7 + 1] = field4890[var2 + 1];
               field4890[var7 + 2] = field4890[var2 + 2];
               field4890[var7 + 3] = field4890[var2 + 3];
            }
         }

         field4890[var2] = var3;
         field4890[var2 + 1] = var4;
         field4890[var2 + 2] = var5;
         field4890[var2 + 3] = var6;
         method2642(arg0, var2);
         method2642(var2 + 4, arg1);
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "()V"
   )
   public static void method2643() {
      field4890 = null;
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(I)V"
   )
   private static final void method2644(int arg0) {
      if (field4887 < 0) {
         field4891 = 0;
         field4892 = 0;
         field4888 = 0;
         field4889 = 2147483646;
      } else {
         method2642(0, field4887);
         int var1 = field4890[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < field4887; var3 += 4) {
            int var4 = field4890[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = field4890[var3];
            int var6 = field4890[var3 + 2];
            int var7 = field4890[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field4890[var3] = (var1 - var4) * var8 + var9;
            field4890[var3 + 2] = var8;
         }

         field4888 = var2;
         field4892 = var3;
         field4891 = var3;
         field4889 = var1 - 1;
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(Lha;[II)V"
   )
   public static final void method2645(class17 arg0, int[] arg1, int arg2) {
      method2637(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "(II)V"
   )
   private static final void method2646(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = field4890[var3 - 4];
               int var5 = field4890[var3];
               if (var4 > var5) {
                  var2 = false;
                  field4890[var3 - 4] = var5;
                  field4890[var3] = var4;
                  int var6 = field4890[var3 - 2];
                  field4890[var3 - 2] = field4890[var3 + 2];
                  field4890[var3 + 2] = var6;
                  int var7 = field4890[var3 - 1];
                  field4890[var3 - 1] = field4890[var3 + 3];
                  field4890[var3 + 3] = var7;
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
}
