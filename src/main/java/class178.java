import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class178 extends class70 {
   @OriginalMember(
      owner = "client!rf",
      name = "N",
      descriptor = "I"
   )
   private int field2278 = 4096;
   @OriginalMember(
      owner = "client!rf",
      name = "J",
      descriptor = "I"
   )
   private int field2280 = 4096;
   @OriginalMember(
      owner = "client!rf",
      name = "I",
      descriptor = "I"
   )
   private int field2282 = 4096;
   @OriginalMember(
      owner = "client!rf",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2283 = new String[]{method1519(method1518("&\b3p4")), method1519(method1518(":\u001bq_")), method1519(method1518("/@3\u001da")), method1519(method1518("&\b3q4"))};
   @OriginalMember(
      owner = "client!rf",
      name = "M",
      descriptor = "I"
   )
   public static int field2279 = 0;
   @OriginalMember(
      owner = "client!rf",
      name = "L",
      descriptor = "I"
   )
   public static int field2277;
   @OriginalMember(
      owner = "client!rf",
      name = "K",
      descriptor = "I"
   )
   public static int field2281;

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg0 > -34) {
            this.method547(1, 59);
         }

         label45: {
            label44: {
               label43: {
                  if (~arg2 != -1) {
                     if (arg2 == 1) {
                        break label43;
                     }

                     if (~arg2 != -3) {
                        break label45;
                     }

                     if (!var4) {
                        break label44;
                     }
                  }

                  this.field2280 = arg1.method603(-2);
                  if (!var4) {
                     break label45;
                  }
               }

               this.field2282 = arg1.method603(-2);
               if (!var4) {
                  break label45;
               }
            }

            this.field2278 = arg1.method603(-2);
         }

         ++field2277;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2283[0] + arg0 + ',' + (arg1 != null ? field2283[2] : field2283[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2281;
         if (arg0 != -6752) {
            this.method550(-7, (class66)null, 88);
         }

         int[][] var4 = super.field926.method2860(arg0 + 6752, arg1);
         if (super.field926.field5048) {
            int[][] var5 = this.method696(arg1, 0, 32767);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || ~var12 > ~class262.field3328) {
               do {
                  int var13 = var6[var12];
                  int var14 = var8[var12];
                  int var15 = var7[var12];
                  if (var13 == var14 && ~var14 == ~var15) {
                     var9[var12] = this.field2280 * var13 >> 12;
                     var10[var12] = this.field2282 * var14 >> 12;
                     var11[var12] = this.field2278 * var15 >> 12;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field2280;
                  var10[var12] = this.field2282;
                  var11[var12] = this.field2278;
                  ++var12;
               } while(~var12 > ~class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field2283[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "<init>",
      descriptor = "()V"
   )
   public class178() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1518(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1519(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
