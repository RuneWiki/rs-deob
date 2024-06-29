import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oka")
public class class313 {
   @OriginalMember(
      owner = "client!oka",
      name = "b",
      descriptor = "I"
   )
   private int field4855 = class617.method4543(16);
   @OriginalMember(
      owner = "client!oka",
      name = "d",
      descriptor = "I"
   )
   private int field4851 = class617.method4543(24);
   @OriginalMember(
      owner = "client!oka",
      name = "f",
      descriptor = "I"
   )
   private int field4854 = class617.method4543(24);
   @OriginalMember(
      owner = "client!oka",
      name = "g",
      descriptor = "I"
   )
   private int field4853 = class617.method4543(24) + 1;
   @OriginalMember(
      owner = "client!oka",
      name = "c",
      descriptor = "I"
   )
   private int field4852 = class617.method4543(6) + 1;
   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "I"
   )
   private int field4849 = class617.method4543(8);
   @OriginalMember(
      owner = "client!oka",
      name = "e",
      descriptor = "[I"
   )
   private int[] field4850;

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "([FIZ)V"
   )
   public final void method2604(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = class617.field8938[this.field4849].field9042;
         int var6 = this.field4854 - this.field4851;
         int var7 = var6 / this.field4853;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = class617.field8938[this.field4849].method4570();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field4852;
                     }

                     var11 /= this.field4852;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field4850[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field4853 * var10 + this.field4851;
                     class622 var17 = class617.field8938[var15];
                     if (this.field4855 == 0) {
                        int var18 = this.field4853 / var17.field9042;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method4572();

                           for(int var21 = 0; var21 < var17.field9042; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field4853) {
                           float[] var23 = var17.method4572();

                           for(int var24 = 0; var24 < var17.field9042; ++var24) {
                              arg0[var16 + var22] += var23[var24];
                              ++var22;
                           }
                        }
                     }
                  }

                  ++var10;
                  if (var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "<init>",
      descriptor = "()V"
   )
   public class313() {
      int[] var1 = new int[this.field4852];

      for(int var2 = 0; var2 < this.field4852; ++var2) {
         int var4 = 0;
         int var5 = class617.method4543(3);
         boolean var6 = class617.method4539() != 0;
         if (var6) {
            var4 = class617.method4543(5);
         }

         var1[var2] = var4 << 3 | var5;
      }

      this.field4850 = new int[this.field4852 * 8];

      for(int var3 = 0; var3 < this.field4852 * 8; ++var3) {
         this.field4850[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? class617.method4543(8) : -1;
      }

   }
}
