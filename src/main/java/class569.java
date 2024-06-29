import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class569 extends class70 {
   @OriginalMember(
      owner = "client!ei",
      name = "L",
      descriptor = "I"
   )
   private int field8362 = 585;
   @OriginalMember(
      owner = "client!ei",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8366 = new String[]{method4275(method4274("\u001aLKSR")), method4275(method4274("\u0004\u000bK2\u0007")), method4275(method4274("\u0011P\tp")), method4275(method4274("\u001aLK_R")), method4275(method4274("\u001aLKXR"))};
   @OriginalMember(
      owner = "client!ei",
      name = "K",
      descriptor = "Ldp;"
   )
   public static class499 field8363 = new class499(2, 2);
   @OriginalMember(
      owner = "client!ei",
      name = "J",
      descriptor = "I"
   )
   public static int field8360;
   @OriginalMember(
      owner = "client!ei",
      name = "N",
      descriptor = "I"
   )
   public static int field8361;
   @OriginalMember(
      owner = "client!ei",
      name = "I",
      descriptor = "Lwfa;"
   )
   public static class174 field8365;
   @OriginalMember(
      owner = "client!ei",
      name = "M",
      descriptor = "[Ls;"
   )
   public static class423[] field8364;

   @OriginalMember(
      owner = "client!ei",
      name = "<init>",
      descriptor = "()V"
   )
   public class569() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4273(byte arg0) {
      try {
         field8363 = null;
         field8364 = null;
         if (arg0 > -55) {
            field8364 = null;
         }

         field8365 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8366[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field8361;
         int[] var4 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            field8363 = null;
         }

         if (super.field940.field270) {
            int var5 = class502.field6979[arg1];
            int var6 = 0;
            if (var3 || ~class262.field3328 < ~var6) {
               do {
                  int var7 = class17.field290[var6];
                  if (~this.field8362 > ~var7 && ~var7 > ~(-this.field8362 + 4096) && -this.field8362 + 2048 < var5 && this.field8362 + 2048 > var5) {
                     int var8 = 2048 - var7;
                     int var9 = var8 < 0 ? -var8 : var8;
                     int var10 = var9 << 12;
                     int var11 = var10 / (-this.field8362 + 2048);
                     var4[var6] = 4096 - var11;
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  if (var7 > -this.field8362 + 2048 && ~var7 > ~(2048 - -this.field8362)) {
                     int var12 = var5 + -2048;
                     int var13 = var12 < 0 ? -var12 : var12;
                     int var14 = var13 - this.field8362;
                     int var15 = var14 << 12;
                     var4[var6] = var15 / (2048 - this.field8362);
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  label103: {
                     int var16;
                     int var10000;
                     if (~var5 <= ~this.field8362) {
                        if (-this.field8362 + 4096 >= var5) {
                           break label103;
                        }

                        var16 = var7 + -2048;
                        var10000 = var16 >= 0 ? var16 : -var16;
                     } else {
                        var16 = var7 + -2048;
                        var10000 = var16 >= 0 ? var16 : -var16;
                     }

                     int var17 = var10000;
                     int var18 = var17 - this.field8362;
                     int var19 = var18 << 12;
                     var4[var6] = var19 / (-this.field8362 + 2048);
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  if (this.field8362 <= var7 && ~(-this.field8362 + 4096) <= ~var7) {
                     var4[var6] = 0;
                     ++var6;
                  } else {
                     int var20 = -var5 + 2048;
                     int var21 = ~var20 > -1 ? -var20 : var20;
                     int var22 = var21 << 12;
                     int var23 = var22 / (-this.field8362 + 2048);
                     var4[var6] = -var23 + 4096;
                     if (var3) {
                        var4[var6] = 0;
                        ++var6;
                     } else {
                        ++var6;
                     }
                  }
               } while(~class262.field3328 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var25) {
         throw class93.method866(var25, field8366[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg2 == 0) {
            this.field8362 = arg1.method603(-2);
         }

         if (arg0 >= -34) {
            this.method331((byte)-81, 22);
         }

         ++field8360;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8366[3] + arg0 + ',' + (arg1 != null ? field8366[1] : field8366[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4274(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4275(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
