import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!va")
public class class47 {
   @OriginalMember(
      owner = "loginapplet!va",
      name = "a",
      descriptor = "([BI[BII)V",
      line = 15
   )
   public static final void method227(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      int var5;
      if (arg0 == arg2) {
         if (arg1 == arg3) {
            return;
         }

         if (arg3 > arg1 && arg3 < arg1 + arg4) {
            var5 = arg4 - 1;
            int var21 = arg1 + var5;
            int var22 = arg3 + var5;
            var5 = var21 - var5;
            var5 += 7;

            while(var21 >= var5) {
               arg2[var22--] = arg0[var21--];
               arg2[var22--] = arg0[var21--];
               arg2[var22--] = arg0[var21--];
               arg2[var22--] = arg0[var21--];
               arg2[var22--] = arg0[var21--];
               arg2[var22--] = arg0[var21--];
               arg2[var22--] = arg0[var21--];
               arg2[var22--] = arg0[var21--];
            }

            var5 -= 7;

            while(var21 >= var5) {
               arg2[var22--] = arg0[var21--];
            }

            return;
         }
      }

      var5 = arg4 + arg1;
      int var6 = var5 - 7;

      while(arg1 < var6) {
         arg2[arg3++] = arg0[arg1++];
         arg2[arg3++] = arg0[arg1++];
         arg2[arg3++] = arg0[arg1++];
         arg2[arg3++] = arg0[arg1++];
         arg2[arg3++] = arg0[arg1++];
         arg2[arg3++] = arg0[arg1++];
         arg2[arg3++] = arg0[arg1++];
         arg2[arg3++] = arg0[arg1++];
      }

      var5 = var6 + 7;

      while(arg1 < var5) {
         arg2[arg3++] = arg0[arg1++];
      }

   }
}
