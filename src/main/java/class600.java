import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class600 {
   @OriginalMember(
      owner = "client!cr",
      name = "j",
      descriptor = "I"
   )
   private int field8823 = 0;
   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "I"
   )
   private int field8817 = -1;
   @OriginalMember(
      owner = "client!cr",
      name = "h",
      descriptor = "Lll;"
   )
   private class387 field8818 = new class387();
   @OriginalMember(
      owner = "client!cr",
      name = "l",
      descriptor = "Z"
   )
   public boolean field8828 = false;
   @OriginalMember(
      owner = "client!cr",
      name = "o",
      descriptor = "I"
   )
   private int field8824;
   @OriginalMember(
      owner = "client!cr",
      name = "p",
      descriptor = "I"
   )
   private int field8816;
   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "[Lmda;"
   )
   private class277[] field8821;
   @OriginalMember(
      owner = "client!cr",
      name = "d",
      descriptor = "[[[I"
   )
   private int[][][] field8822;
   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8829 = new String[]{method4368(method4367("|o0\" ")), method4368(method4367("\\|pDgqqgDzzil\rmix>\u0005(yhr\b(vp\u007f\u0003m?~\u007f\u0007`z")), method4368(method4367("|o0' ")), method4368(method4367("|o0XaqtjZ ")), method4368(method4367("|o0! ")), method4368(method4367("|o0& ")), method4368(method4367("?n{\u0007gqymJ&1")), method4368(method4367("|o0% ")), method4368(method4367("o|k\u0017m")), method4368(method4367("C20^$?B3OSBc^")), method4368(method4367("O|k\u0017aqz>\u0002gm=")), method4368(method4367("|o0  "))};
   @OriginalMember(
      owner = "client!cr",
      name = "e",
      descriptor = "F"
   )
   public static float field8825 = 1.0F;
   @OriginalMember(
      owner = "client!cr",
      name = "c",
      descriptor = "I"
   )
   public static int field8819 = 0;
   @OriginalMember(
      owner = "client!cr",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field8813 = new class118(61, 0);
   @OriginalMember(
      owner = "client!cr",
      name = "n",
      descriptor = "I"
   )
   public static int field8814;
   @OriginalMember(
      owner = "client!cr",
      name = "g",
      descriptor = "I"
   )
   public static int field8815;
   @OriginalMember(
      owner = "client!cr",
      name = "k",
      descriptor = "I"
   )
   public static int field8820;
   @OriginalMember(
      owner = "client!cr",
      name = "i",
      descriptor = "I"
   )
   public static int field8826;
   @OriginalMember(
      owner = "client!cr",
      name = "m",
      descriptor = "I"
   )
   public static int field8827;

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(IIZ)Z",
      line = 3
   )
   public static final boolean method4361(int arg0, int arg1, boolean arg2) {
      try {
         ++field8827;
         if (!arg2) {
            method4361(-45, 92, true);
         }

         return ~(540800 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8829[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(BI)[[I",
      line = 14
   )
   public final int[][] method4362(byte arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 != 116) {
            return null;
         } else {
            ++field8814;
            if (~this.field8824 == ~this.field8816) {
               this.field8828 = this.field8821[arg1] == null;
               this.field8821[arg1] = class225.field3202;
               return this.field8822[arg1];
            } else if (this.field8824 == 1) {
               this.field8828 = this.field8817 != arg1;
               this.field8817 = arg1;
               return this.field8822[0];
            } else {
               class277 var4;
               label44: {
                  var4 = this.field8821[arg1];
                  if (var4 == null) {
                     label41: {
                        this.field8828 = true;
                        if (~this.field8823 > ~this.field8824) {
                           var4 = new class277(arg1, this.field8823);
                           ++this.field8823;
                           if (!var3) {
                              break label41;
                           }
                        }

                        class277 var5 = (class277)this.field8818.method2936(false);
                        var4 = new class277(arg1, var5.field3779);
                        this.field8821[var5.field3781] = null;
                        var5.method3165(116);
                     }

                     this.field8821[arg1] = var4;
                     if (!var3) {
                        break label44;
                     }
                  }

                  this.field8828 = false;
               }

               this.field8818.method2932(-17488, var4);
               return this.field8822[var4.field3779];
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8829[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(I)V",
      line = 83
   )
   public final void method4363(int arg0) {
      boolean var2 = client.field4360;

      try {
         int var3 = 0;
         if (var2) {
            this.field8822[var3][0] = null;
            this.field8822[var3][1] = null;
            this.field8822[var3][2] = null;
            this.field8822[var3] = null;
            ++var3;
         }

         while(true) {
            while(~this.field8824 < ~var3) {
               this.field8822[var3][0] = null;
               this.field8822[var3][1] = null;
               this.field8822[var3][2] = null;
               this.field8822[var3] = null;
               ++var3;
            }

            ++field8820;
            if (!var2) {
               if (arg0 != 2) {
                  this.field8822 = null;
               }

               this.field8822 = null;
               this.field8821 = null;
               this.field8818.method2934(0);
               this.field8818 = null;
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8829[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "(I)[[[I",
      line = 113
   )
   public final int[][][] method4364(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field8815;
         if (this.field8824 != this.field8816) {
            throw new RuntimeException(field8829[1]);
         } else if (arg0 < 106) {
            return null;
         } else {
            int var3 = 0;
            if (var2) {
               this.field8821[var3] = class225.field3202;
               ++var3;
            }

            while(true) {
               class600 var10000;
               if (this.field8824 <= var3) {
                  var10000 = this;
                  if (!var2) {
                     return this.field8822;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field8821[var3] = class225.field3202;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8829[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "(B)V",
      line = 137
   )
   public static void method4365(byte arg0) {
      try {
         field8813 = null;
         int var1 = -61 / ((arg0 - -6) / 49);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8829[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "<init>",
      descriptor = "(III)V",
      line = 371
   )
   public class600(int arg0, int arg1, int arg2) {
      try {
         this.field8824 = arg0;
         this.field8816 = arg1;
         this.field8821 = new class277[this.field8816];
         this.field8822 = new int[this.field8824][3][arg2];
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8829[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(B)V",
      line = 157
   )
   public static final void method4366(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4367(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4368(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
