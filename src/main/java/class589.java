import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class589 {
   @OriginalMember(
      owner = "client!ar",
      name = "i",
      descriptor = "I"
   )
   private int field8682;
   @OriginalMember(
      owner = "client!ar",
      name = "f",
      descriptor = "[Loe;"
   )
   private class15[] field8675;
   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8683 = new String[]{method4389(method4388("MQ\u0019EC")), method4389(method4388("MQ\u0019DC")), method4389(method4388("MQ\u0019BC")), method4389(method4388("MQ\u0019;\u0002BJC9C")), method4389(method4388("MQ\u0019FC")), method4389(method4388("W\r\u0019)\u0016")), method4389(method4388("BV[k")), method4389(method4388("MQ\u0019CC"))};
   @OriginalMember(
      owner = "client!ar",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field8681 = new int[8];
   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "F"
   )
   public static float field8678;
   @OriginalMember(
      owner = "client!ar",
      name = "c",
      descriptor = "I"
   )
   public static int field8674;
   @OriginalMember(
      owner = "client!ar",
      name = "h",
      descriptor = "I"
   )
   public static int field8676;
   @OriginalMember(
      owner = "client!ar",
      name = "e",
      descriptor = "I"
   )
   public static int field8679;
   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "I"
   )
   public static int field8680;
   @OriginalMember(
      owner = "client!ar",
      name = "j",
      descriptor = "J"
   )
   private long field8677;
   @OriginalMember(
      owner = "client!ar",
      name = "g",
      descriptor = "Loe;"
   )
   private class15 field8673;

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(B)Loe;"
   )
   public final class15 method4383(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field8676;
         if (this.field8673 == null) {
            return null;
         } else {
            class15 var3 = this.field8675[(int)((long)(this.field8682 + -1) & this.field8677)];
            class15 var4;
            if (var2) {
               if (this.field8677 == this.field8673.field275) {
                  var4 = this.field8673;
                  this.field8673 = this.field8673.field272;
                  return var4;
               }

               this.field8673 = this.field8673.field272;
            }

            while(true) {
               int var10000;
               if (this.field8673 == var3) {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 > 0) {
                        return null;
                     }

                     this.field8673 = null;
                     return null;
                  }
               } else {
                  long var7;
                  var10000 = (var7 = this.field8677 - this.field8673.field275) == 0L ? 0 : (var7 < 0L ? -1 : 1);
               }

               if (var10000 == 0) {
                  var4 = this.field8673;
                  this.field8673 = this.field8673.field272;
                  return var4;
               }

               this.field8673 = this.field8673.field272;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8683[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(Loe;JZ)V"
   )
   public final void method4384(class15 arg0, long arg1, boolean arg2) {
      try {
         ++field8680;
         if (arg0.field274 != null) {
            arg0.method125(13582);
         }

         class15 var5 = this.field8675[(int)(arg1 & (long)(this.field8682 - 1))];
         arg0.field274 = var5.field274;
         arg0.field272 = var5;
         arg0.field274.field272 = arg0;
         arg0.field275 = arg1;
         arg0.field272.field274 = arg0;
         if (arg2) {
            this.field8682 = 115;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8683[4] + (arg0 != null ? field8683[5] : field8683[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(IIIIZ)I"
   )
   public static final int method4385(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field8679;
         if (arg4) {
            method4387(110);
         }

         int var5 = arg1 & 15;
         int var6 = var5 < 8 ? arg2 : arg0;
         int var7 = ~var5 > -5 ? arg0 : (~var5 != -13 && var5 != 14 ? arg3 : arg2);
         return ((var5 & 2) != 0 ? -var7 : var7) + ((var5 & 1) == 0 ? var6 : -var6);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8683[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(BJ)Loe;"
   )
   public final class15 method4386(byte arg0, long arg1) {
      boolean var4 = client.field1481;

      try {
         ++field8674;
         this.field8677 = arg1;
         class15 var5 = this.field8675[(int)((long)(this.field8682 + -1) & arg1)];
         int var6 = -38 / ((-32 - arg0) / 57);
         this.field8673 = var5.field272;
         class15 var7;
         if (var4) {
            if (~this.field8673.field275 == ~arg1) {
               var7 = this.field8673;
               this.field8673 = this.field8673.field272;
               return var7;
            }

            this.field8673 = this.field8673.field272;
         }

         while(true) {
            while(this.field8673 != var5) {
               if (~this.field8673.field275 == ~arg1) {
                  var7 = this.field8673;
                  this.field8673 = this.field8673.field272;
                  return var7;
               }

               this.field8673 = this.field8673.field272;
            }

            this.field8673 = null;
            if (!var4) {
               return null;
            }

            this.field8673 = this.field8673.field272;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8683[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4387(int arg0) {
      try {
         field8681 = null;
         if (arg0 != 0) {
            method4385(-81, -53, 36, -25, false);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8683[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class589(int arg0) {
      try {
         this.field8682 = arg0;
         this.field8675 = new class15[arg0];

         for(int var2 = 0; ~var2 > ~arg0; ++var2) {
            class15 var3 = this.field8675[var2] = new class15();
            var3.field274 = var3;
            var3.field272 = var3;
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8683[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4388(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4389(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
