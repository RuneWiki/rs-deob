import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class738 {
   @OriginalMember(
      owner = "client!ip",
      name = "c",
      descriptor = "I"
   )
   private static int field10755;
   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "I"
   )
   private static int field10756;
   @OriginalMember(
      owner = "client!ip",
      name = "f",
      descriptor = "I"
   )
   private static int field10757;
   @OriginalMember(
      owner = "client!ip",
      name = "e",
      descriptor = "I"
   )
   private static int field10758;
   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "I"
   )
   private static int field10760;
   @OriginalMember(
      owner = "client!ip",
      name = "h",
      descriptor = "I"
   )
   private static int field10761;
   @OriginalMember(
      owner = "client!ip",
      name = "g",
      descriptor = "I"
   )
   private static int field10762;
   @OriginalMember(
      owner = "client!ip",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field10759;

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(II)V"
   )
   private static final void method5345(int arg0, int arg1) {
      while(true) {
         if (arg1 >= arg0 + 8) {
            boolean var2 = true;

            for(int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
               int var4 = field10759[var3 - 4];
               int var5 = field10759[var3];
               if (var4 > var5) {
                  var2 = false;
                  field10759[var3 - 4] = var5;
                  field10759[var3] = var4;
                  int var6 = field10759[var3 - 2];
                  field10759[var3 - 2] = field10759[var3 + 2];
                  field10759[var3 + 2] = var6;
                  int var7 = field10759[var3 - 1];
                  field10759[var3 - 1] = field10759[var3 + 3];
                  field10759[var3 + 3] = var7;
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
      owner = "client!ip",
      name = "a",
      descriptor = "(Lha;[IIII[I[I)V"
   )
   private static final void method5346(class65 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
      int[] var7 = new int[4];
      arg0.method582(var7);
      if (arg5 != null && var7[3] - var7[1] != arg5.length) {
         throw new IllegalStateException();
      } else {
         method5352();
         method5351(arg1, arg2, arg3);
         method5350(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if (!method5354(var7[3])) {
                  return;
               }

               var8 = field10757;
               var9 = field10762;
               var10 = field10758;
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

            arg0.method558(var8, var10, var9 - var8, arg4, 1);
         }
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "(II)V"
   )
   private static final void method5347(int arg0, int arg1) {
      if (arg1 > arg0 + 4) {
         int var2 = arg0;
         int var3 = field10759[arg0];
         int var4 = field10759[arg0 + 1];
         int var5 = field10759[arg0 + 2];
         int var6 = field10759[arg0 + 3];

         for(int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
            int var8 = field10759[var7 + 1];
            if (var8 < var4) {
               field10759[var2] = field10759[var7];
               field10759[var2 + 1] = var8;
               field10759[var2 + 2] = field10759[var7 + 2];
               field10759[var2 + 3] = field10759[var7 + 3];
               var2 += 4;
               field10759[var7] = field10759[var2];
               field10759[var7 + 1] = field10759[var2 + 1];
               field10759[var7 + 2] = field10759[var2 + 2];
               field10759[var7 + 3] = field10759[var2 + 3];
            }
         }

         field10759[var2] = var3;
         field10759[var2 + 1] = var4;
         field10759[var2 + 2] = var5;
         field10759[var2 + 3] = var6;
         method5347(arg0, var2);
         method5347(var2 + 4, arg1);
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "()V"
   )
   public static void method5348() {
      field10759 = null;
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(Lha;[II[I[I)V"
   )
   public static final void method5349(class65 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
      method5346(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "(I)V"
   )
   private static final void method5350(int arg0) {
      if (field10761 < 0) {
         field10755 = 0;
         field10760 = 0;
         field10756 = 0;
         field10758 = 2147483646;
      } else {
         method5347(0, field10761);
         int var1 = field10759[1];
         if (var1 < arg0) {
            var1 = arg0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < field10761; var3 += 4) {
            int var4 = field10759[var3 + 1];
            if (var1 < var4) {
               break;
            }

            int var5 = field10759[var3];
            int var6 = field10759[var3 + 2];
            int var7 = field10759[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + 32768;
            field10759[var3] = (var1 - var4) * var8 + var9;
            field10759[var3 + 2] = var8;
         }

         field10756 = var2;
         field10760 = var3;
         field10755 = var3;
         field10758 = var1 - 1;
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "([III)V"
   )
   private static final void method5351(int[] arg0, int arg1, int arg2) {
      int var3 = (arg2 << 1) + field10761;
      if (field10759 == null || field10759.length < var3) {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < field10761; ++var5) {
            var4[var5] = field10759[var5];
         }

         field10759 = var4;
      }

      int var6 = arg1 + arg2;
      int var7 = var6 - 2;

      for(int var8 = arg1; var8 < var6; var8 += 2) {
         int var9 = arg0[var7 + 1];
         int var10 = arg0[var8 + 1];
         if (var9 < var10) {
            field10759[field10761++] = arg0[var7];
            field10759[field10761++] = var9;
            field10759[field10761++] = arg0[var8];
            field10759[field10761++] = var10;
         } else if (var10 < var9) {
            field10759[field10761++] = arg0[var8];
            field10759[field10761++] = var10;
            field10759[field10761++] = arg0[var7];
            field10759[field10761++] = var9;
         }

         var7 = var8;
      }

   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "()V"
   )
   private static final void method5352() {
      field10761 = 0;
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(Lha;[II)V"
   )
   public static final void method5353(class65 arg0, int[] arg1, int arg2) {
      method5346(arg0, arg1, 0, arg1.length, arg2, (int[])null, (int[])null);
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(I)Z"
   )
   private static final boolean method5354(int arg0) {
      int var1 = field10760;
      int var2 = field10755;
      int var3 = field10758;

      while(var2 >= var1) {
         ++var3;
         field10758 = var3;
         if (var3 >= arg0) {
            return false;
         }

         int var4 = field10756;

         while(var1 < field10761) {
            int var5 = field10759[var1 + 1];
            if (var3 < var5) {
               break;
            }

            int var6 = field10759[var1];
            int var7 = field10759[var1 + 2];
            int var8 = field10759[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + 32768;
            field10759[var1] = var10;
            field10759[var1 + 2] = var9;
            var1 += 4;
         }

         for(int var11 = var4; var11 < var1; var11 += 4) {
            int var12 = field10759[var11 + 3];
            if (var3 >= var12) {
               field10759[var11] = field10759[var4];
               field10759[var11 + 1] = field10759[var4 + 1];
               field10759[var11 + 2] = field10759[var4 + 2];
               field10759[var11 + 3] = field10759[var4 + 3];
               var4 += 4;
            }
         }

         if (field10761 == var4) {
            field10761 = 0;
            return false;
         }

         method5345(var4, var1);
         field10756 = var4;
         field10760 = var1;
         var2 = var4;
      }

      field10757 = field10759[var2] >> 16;
      field10762 = field10759[var2 + 4] >> 16;
      field10759[var2] += field10759[var2 + 2];
      field10759[var2 + 4] += field10759[var2 + 6];
      var2 += 8;
      field10755 = var2;
      return true;
   }
}
