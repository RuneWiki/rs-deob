import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class220 extends class629 {
   @OriginalMember(
      owner = "client!su",
      name = "I",
      descriptor = "Z"
   )
   private boolean field3310 = true;
   @OriginalMember(
      owner = "client!su",
      name = "M",
      descriptor = "Z"
   )
   private boolean field3317 = true;
   @OriginalMember(
      owner = "client!su",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3319 = new String[]{method1863(method1862("EYehm")), method1863(method1862("M\u0002e\u00038")), method1863(method1862("P\u0002'*")), method1863(method1862("M\u0002e\f8")), method1863(method1862("M\u0002e\n8"))};
   @OriginalMember(
      owner = "client!su",
      name = "E",
      descriptor = "I"
   )
   public static int field3312 = 0;
   @OriginalMember(
      owner = "client!su",
      name = "K",
      descriptor = "I"
   )
   public static int field3309;
   @OriginalMember(
      owner = "client!su",
      name = "H",
      descriptor = "I"
   )
   public static int field3311;
   @OriginalMember(
      owner = "client!su",
      name = "G",
      descriptor = "I"
   )
   public static int field3313;
   @OriginalMember(
      owner = "client!su",
      name = "F",
      descriptor = "I"
   )
   public static int field3314;
   @OriginalMember(
      owner = "client!su",
      name = "L",
      descriptor = "I"
   )
   public static int field3315;
   @OriginalMember(
      owner = "client!su",
      name = "D",
      descriptor = "I"
   )
   public static int field3316;
   @OriginalMember(
      owner = "client!su",
      name = "J",
      descriptor = "I"
   )
   public static int field3318;

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field3309;
         if (arg1 != 0) {
            this.field3317 = false;
         }

         if (~arg2 != -1) {
            if (arg2 == 1) {
               this.field3310 = arg0.method3564((byte)-123) == 1;
               return;
            }

            if (~arg2 != -3) {
               return;
            }

            if (!client.field4564) {
               super.field9166 = arg0.method3564((byte)-90) == 1;
               return;
            }
         }

         this.field3317 = arg0.method3564((byte)-79) == 1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3319[1] + (arg0 != null ? field3319[0] : field3319[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3315;
         int[][] var4 = super.field9169.method785((byte)112, arg0);
         if (arg1 != 0) {
            field3313 = 13;
         }

         if (super.field9169.field1332) {
            int[][] var5 = this.method4621(-108, 0, this.field3310 ? class37.field902 - arg0 : arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field3317) {
               int var12 = 0;
               if (var3) {
                  var9[var12] = var6[var12];
                  var10[var12] = var7[var12];
                  var11[var12] = var8[var12];
                  ++var12;
               }

               while(true) {
                  while(class66.field1214 > var12) {
                     var9[var12] = var6[var12];
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     ++var12;
                  }

                  if (!var3) {
                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  ++var12;
               }
            }

            int var13 = 0;
            if (var3 || class66.field1214 > var13) {
               do {
                  var9[var13] = var6[-var13 + class704.field10259];
                  var10[var13] = var7[-var13 + class704.field10259];
                  var11[var13] = var8[-var13 + class704.field10259];
                  ++var13;
               } while(class66.field1214 > var13);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field3319[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "<init>",
      descriptor = "()V"
   )
   public class220() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3316;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            this.field3310 = true;
         }

         if (super.field9161.field7474) {
            int[] var5 = this.method4622((byte)122, 0, this.field3310 ? -arg0 + class37.field902 : arg0);
            if (this.field3317) {
               int var6 = 0;
               if (var3) {
                  var4[var6] = var5[class704.field10259 - var6];
                  ++var6;
               }

               while(true) {
                  while(~var6 > ~class66.field1214) {
                     var4[var6] = var5[class704.field10259 - var6];
                     ++var6;
                  }

                  if (!var3) {
                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            class365.method2855(var5, 0, var4, 0, class66.field1214);
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3319[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1862(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1863(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
