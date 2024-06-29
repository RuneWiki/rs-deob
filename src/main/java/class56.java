import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class56 extends class302 {
   @OriginalMember(
      owner = "client!aea",
      name = "P",
      descriptor = "I"
   )
   private int field701 = 0;
   @OriginalMember(
      owner = "client!aea",
      name = "N",
      descriptor = "I"
   )
   private int field702 = 0;
   @OriginalMember(
      owner = "client!aea",
      name = "L",
      descriptor = "I"
   )
   private int field703 = 1365;
   @OriginalMember(
      owner = "client!aea",
      name = "H",
      descriptor = "I"
   )
   private int field707 = 20;
   @OriginalMember(
      owner = "client!aea",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field709 = new String[]{method473(method472("Q\u00050\u001d")), method473(method472("^\u0015=_\u000f\u0017")), method473(method472("D^r_4")), method473(method472("^\u0015=_\b\u0017"))};
   @OriginalMember(
      owner = "client!aea",
      name = "I",
      descriptor = "I"
   )
   public static int field705 = -1;
   @OriginalMember(
      owner = "client!aea",
      name = "O",
      descriptor = "F"
   )
   public static float field706 = 0.0F;
   @OriginalMember(
      owner = "client!aea",
      name = "M",
      descriptor = "I"
   )
   public static int field704 = 64;
   @OriginalMember(
      owner = "client!aea",
      name = "J",
      descriptor = "I"
   )
   public static int field700;
   @OriginalMember(
      owner = "client!aea",
      name = "K",
      descriptor = "I"
   )
   public static int field708;

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label55: {
            label54: {
               label53: {
                  label52: {
                     ++field708;
                     if (arg0 != 0) {
                        if (~arg0 == -2) {
                           break label52;
                        }

                        if (~arg0 == -3) {
                           break label53;
                        }

                        if (~arg0 != -4) {
                           break label55;
                        }

                        if (var4 == 0) {
                           break label54;
                        }
                     }

                     this.field703 = arg2.method1038((byte)-107);
                     if (var4 == 0) {
                        break label55;
                     }
                  }

                  this.field707 = arg2.method1038((byte)-109);
                  if (var4 == 0) {
                     break label55;
                  }
               }

               this.field702 = arg2.method1038((byte)-97);
               if (var4 == 0) {
                  break label55;
               }
            }

            this.field701 = arg2.method1038((byte)-96);
         }

         if (arg1 != 0) {
            this.method244(-94, 89, (class128)null);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field709[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field709[2] : field709[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field700;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 >= -37) {
            return null;
         } else {
            if (super.field4298.field6356) {
               int var5 = 0;
               int var10000;
               int var10001;
               if (var3 != 0 || ~class344.field5238 < ~var5) {
                  label67:
                  do {
                     do {
                        int var14;
                        label63: {
                           int var6 = (class757.field11167[var5] << 12) / this.field703 - -this.field702;
                           int var7 = (class23.field241[arg0] << 12) / this.field703 - -this.field701;
                           int var8 = var6;
                           int var9 = var7;
                           int var10 = var6;
                           int var11 = var7;
                           int var12 = var6 * var6 >> 12;
                           int var13 = var7 * var7 >> 12;
                           var14 = 0;
                           if (var3 == 0) {
                              if (var12 + var13 >= 16384) {
                                 break label63;
                              }

                              var10000 = var14;
                              var10001 = this.field707;
                              if (var3 != 0) {
                                 continue label67;
                              }

                              if (var14 >= var10001) {
                                 break label63;
                              }
                           }

                           do {
                              var11 = (var10 * var11 >> 12) * 2 + var9;
                              var10 = -var13 + var12 + var8;
                              ++var14;
                              var13 = var11 * var11 >> 12;
                              var12 = var10 * var10 >> 12;
                              if (var12 + var13 >= 16384) {
                                 break;
                              }

                              var10000 = var14;
                              var10001 = this.field707;
                              if (var3 != 0) {
                                 continue label67;
                              }
                           } while(var14 < var10001);
                        }

                        var4[var5] = this.field707 + -1 > var14 ? (var14 << 12) / this.field707 : 0;
                        ++var5;
                     } while(~class344.field5238 < ~var5);

                     return var4;
                  } while(var10000 < var10001);
               }
            }

            return var4;
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field709[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "<init>",
      descriptor = "()V"
   )
   public class56() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method472(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method473(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
