import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!v")
public class class46 {
   @OriginalMember(
      owner = "loginapplet!v",
      name = "a",
      descriptor = "Ljava/util/Random;"
   )
   public static Random field337 = new Random();
   @OriginalMember(
      owner = "loginapplet!v",
      name = "b",
      descriptor = "Lsa;"
   )
   public static class41 field338 = class8.method31(67, "submit_expanded_");
   @OriginalMember(
      owner = "loginapplet!v",
      name = "c",
      descriptor = "I"
   )
   public static int field339 = 0;
   @OriginalMember(
      owner = "loginapplet!v",
      name = "d",
      descriptor = "I"
   )
   public static int field340;
   @OriginalMember(
      owner = "loginapplet!v",
      name = "e",
      descriptor = "[I"
   )
   private int[] field341;

   @OriginalMember(
      owner = "loginapplet!v",
      name = "a",
      descriptor = "(II)I",
      line = 27
   )
   public final int method224(int arg0, int arg1) {
      try {
         int var3 = this.field341.length - 2;
         if (arg1 < 93) {
            this.method224(123, 36);
         }

         int var4 = arg0 << 877319201 & var3;

         while(true) {
            int var5 = this.field341[var4];
            if (arg0 == var5) {
               return this.field341[var4 - -1];
            }

            if (0 == ~var5) {
               return -1;
            }

            var4 = var4 + 2 & var3;
         }
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "v.C(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!v",
      name = "a",
      descriptor = "([BI)[B",
      line = 57
   )
   public static final byte[] method225(byte[] arg0, int arg1) {
      try {
         if (arg1 != 877319201) {
            method225((byte[])null, -100);
         }

         int var2 = arg0.length;
         byte[] var3 = new byte[var2];
         class47.method227(arg0, 0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "v.A(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!v",
      name = "a",
      descriptor = "(I)V",
      line = 71
   )
   public static void method226(int arg0) {
      try {
         field338 = null;
         field337 = null;
         if (arg0 != 0) {
            field338 = (class41)null;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "v.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!v",
      name = "<init>",
      descriptor = "([I)V",
      line = 99
   )
   public class46(int[] arg0) {
      try {
         int var2;
         for(var2 = 1; var2 <= arg0.length - -(arg0.length >> 248172417); var2 <<= 1) {
         }

         this.field341 = new int[var2 + var2];

         int var3;
         for(var3 = 0; ~var3 > ~(var2 + var2); ++var3) {
            this.field341[var3] = -1;
         }

         var3 = 0;

         while(arg0.length > var3) {
            int var4;
            for(var4 = var2 - 1 & arg0[var3]; -1 != this.field341[1 + var4 + var4]; var4 = var2 - 1 & var4 + 1) {
            }

            this.field341[var4 + var4] = arg0[var3];
            this.field341[1 + var4 + var4] = var3++;
         }

      } catch (RuntimeException var5) {
         throw class28.method139(var5, "v.<init>(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }
}
