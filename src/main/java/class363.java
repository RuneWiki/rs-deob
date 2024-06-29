import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class363 {
   @OriginalMember(
      owner = "client!oba",
      name = "d",
      descriptor = "I"
   )
   private int field5033 = -1;
   @OriginalMember(
      owner = "client!oba",
      name = "b",
      descriptor = "I"
   )
   private int field5043 = 0;
   @OriginalMember(
      owner = "client!oba",
      name = "p",
      descriptor = "Lrca;"
   )
   private class37 field5031 = new class37();
   @OriginalMember(
      owner = "client!oba",
      name = "m",
      descriptor = "Z"
   )
   public boolean field5048 = false;
   @OriginalMember(
      owner = "client!oba",
      name = "r",
      descriptor = "I"
   )
   private int field5034;
   @OriginalMember(
      owner = "client!oba",
      name = "q",
      descriptor = "I"
   )
   private int field5046;
   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "[Lnf;"
   )
   private class137[] field5036;
   @OriginalMember(
      owner = "client!oba",
      name = "k",
      descriptor = "[[[I"
   )
   private int[][][] field5038;
   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5049 = new String[]{method2862(method2861("r:,n 5")), method2862(method2861("r:,n!5")), method2862(method2861("^9#`\fs44`\u0011x,?)\u0006k=m!C{-!,Ct5,'\u0006=;,#\u000bx")), method2862(method2861("r:,n\"5")), method2862(method2861("r:,n_t6$4]5")), method2862(method2861("r:,n'5"))};
   @OriginalMember(
      owner = "client!oba",
      name = "l",
      descriptor = "Lwk;"
   )
   public static class255 field5039 = new class255();
   @OriginalMember(
      owner = "client!oba",
      name = "i",
      descriptor = "Lse;"
   )
   public static class6 field5042 = new class6(19, 3);
   @OriginalMember(
      owner = "client!oba",
      name = "n",
      descriptor = "Laka;"
   )
   public static class418 field5044 = new class418(38, -1);
   @OriginalMember(
      owner = "client!oba",
      name = "h",
      descriptor = "I"
   )
   public static int field5032;
   @OriginalMember(
      owner = "client!oba",
      name = "c",
      descriptor = "I"
   )
   public static int field5035;
   @OriginalMember(
      owner = "client!oba",
      name = "j",
      descriptor = "I"
   )
   public static int field5040;
   @OriginalMember(
      owner = "client!oba",
      name = "e",
      descriptor = "I"
   )
   public static int field5041;
   @OriginalMember(
      owner = "client!oba",
      name = "o",
      descriptor = "I"
   )
   public static int field5045;
   @OriginalMember(
      owner = "client!oba",
      name = "f",
      descriptor = "I"
   )
   public static int field5047;
   @OriginalMember(
      owner = "client!oba",
      name = "g",
      descriptor = "Lvia;"
   )
   public static class627 field5037;

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2857(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         int var3 = 0;
         if (var2) {
            this.field5038[var3][0] = null;
            this.field5038[var3][1] = null;
            this.field5038[var3][2] = null;
            this.field5038[var3] = null;
            ++var3;
         }

         while(true) {
            while(~this.field5046 < ~var3) {
               this.field5038[var3][0] = null;
               this.field5038[var3][1] = null;
               this.field5038[var3][2] = null;
               this.field5038[var3] = null;
               ++var3;
            }

            ++field5041;
            this.field5036 = null;
            this.field5038 = null;
            if (!var2) {
               this.field5031.method289(!arg0);
               this.field5031 = null;
               if (arg0) {
                  this.field5043 = 39;
                  return;
               }

               return;
            }

            this.field5038[var3] = null;
            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5049[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2858(byte arg0) {
      try {
         field5039 = null;
         field5044 = null;
         field5042 = null;
         if (arg0 > 4) {
            field5037 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5049[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(I)[[[I"
   )
   public final int[][][] method2859(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field5032;
         if (this.field5046 != this.field5034) {
            throw new RuntimeException(field5049[2]);
         } else {
            int var3 = 0;
            if (arg0 <= 67) {
               field5039 = null;
               if (var2) {
                  this.field5036[var3] = class288.field3985;
                  ++var3;
               }
            }

            while(true) {
               class363 var10000;
               if (this.field5046 <= var3) {
                  var10000 = this;
                  if (!var2) {
                     return this.field5038;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field5036[var3] = class288.field3985;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5049[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method2860(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5040;
         if (arg0 != 0) {
            this.field5031 = null;
         }

         if (this.field5046 == this.field5034) {
            this.field5048 = this.field5036[arg1] == null;
            this.field5036[arg1] = class288.field3985;
            return this.field5038[arg1];
         } else if (~this.field5046 == -2) {
            this.field5048 = this.field5033 != arg1;
            this.field5033 = arg1;
            return this.field5038[0];
         } else {
            class137 var4;
            label54: {
               var4 = this.field5036[arg1];
               if (var4 != null) {
                  this.field5048 = false;
                  if (!var3) {
                     break label54;
                  }
               }

               label40: {
                  this.field5048 = true;
                  if (this.field5043 < this.field5046) {
                     var4 = new class137(arg1, this.field5043);
                     ++this.field5043;
                     if (!var3) {
                        break label40;
                     }
                  }

                  class137 var5 = (class137)this.field5031.method284((byte)45);
                  var4 = new class137(arg1, var5.field1738);
                  this.field5036[var5.field1739] = null;
                  var5.method4924(arg0 + -2970);
               }

               this.field5036[arg1] = var4;
            }

            this.field5031.method291(var4, 27);
            return this.field5038[var4.field1738];
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5049[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class363(int arg0, int arg1, int arg2) {
      try {
         this.field5034 = arg1;
         this.field5046 = arg0;
         this.field5036 = new class137[this.field5034];
         this.field5038 = new int[this.field5046][3][arg2];
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5049[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2861(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2862(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
