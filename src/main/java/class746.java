import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class746 extends class264 {
   @OriginalMember(
      owner = "client!lja",
      name = "J",
      descriptor = "I"
   )
   private int field10939 = 0;
   @OriginalMember(
      owner = "client!lja",
      name = "O",
      descriptor = "I"
   )
   private int field10938 = 0;
   @OriginalMember(
      owner = "client!lja",
      name = "N",
      descriptor = "I"
   )
   private int field10940 = 20;
   @OriginalMember(
      owner = "client!lja",
      name = "K",
      descriptor = "I"
   )
   private int field10947 = 1365;
   @OriginalMember(
      owner = "client!lja",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10948 = new String[]{method5410(method5409("\u001a\u001b*}+^")), method5410(method5409("\u001a\u001b*}*^")), method5410(method5409("\u001a\u001b*}(^")), method5410(method5409("\r_e}\u0014")), method5410(method5409("\u0018\u0004'?"))};
   @OriginalMember(
      owner = "client!lja",
      name = "H",
      descriptor = "Lek;"
   )
   public static class536 field10943 = new class536(18, -1);
   @OriginalMember(
      owner = "client!lja",
      name = "G",
      descriptor = "I"
   )
   public static int field10937;
   @OriginalMember(
      owner = "client!lja",
      name = "M",
      descriptor = "I"
   )
   public static int field10941;
   @OriginalMember(
      owner = "client!lja",
      name = "P",
      descriptor = "I"
   )
   public static int field10942;
   @OriginalMember(
      owner = "client!lja",
      name = "Q",
      descriptor = "I"
   )
   public static int field10944;
   @OriginalMember(
      owner = "client!lja",
      name = "L",
      descriptor = "J"
   )
   public static long field10945;
   @OriginalMember(
      owner = "client!lja",
      name = "F",
      descriptor = "[Lup;"
   )
   public static class291[] field10946;

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label55: {
            label54: {
               label53: {
                  label52: {
                     if (~arg0 != -1) {
                        if (~arg0 == -2) {
                           break label52;
                        }

                        if (~arg0 == -3) {
                           break label53;
                        }

                        if (arg0 != 3) {
                           break label55;
                        }

                        if (!var4) {
                           break label54;
                        }
                     }

                     this.field10947 = arg1.method1211(-26166);
                     if (!var4) {
                        break label55;
                     }
                  }

                  this.field10940 = arg1.method1211(-26166);
                  if (!var4) {
                     break label55;
                  }
               }

               this.field10938 = arg1.method1211(-26166);
               if (!var4) {
                  break label55;
               }
            }

            this.field10939 = arg1.method1211(-26166);
         }

         if (arg2 < 49) {
            this.method3(60, (class147)null, -1);
         }

         ++field10944;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10948[2] + arg0 + ',' + (arg1 != null ? field10948[3] : field10948[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "<init>",
      descriptor = "()V"
   )
   public class746() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = 38 % ((arg1 - 24) / 44);
         ++field10941;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = 0;
            int var10000;
            int var10001;
            if (var3 || ~class430.field6152 < ~var6) {
               label64:
               do {
                  do {
                     int var15;
                     label60: {
                        int var7 = (class258.field3496[var6] << 12) / this.field10947 + this.field10938;
                        int var8 = (class666.field9668[arg0] << 12) / this.field10947 - -this.field10939;
                        int var9 = var7;
                        int var10 = var8;
                        int var11 = var7;
                        int var12 = var8;
                        int var13 = var7 * var7 >> 12;
                        int var14 = var8 * var8 >> 12;
                        var15 = 0;
                        if (!var3) {
                           if (~(var13 - -var14) <= -16385) {
                              break label60;
                           }

                           var10000 = ~var15;
                           var10001 = ~this.field10940;
                           if (var3) {
                              continue label64;
                           }

                           if (var10000 <= var10001) {
                              break label60;
                           }
                        }

                        do {
                           var12 = (var11 * var12 >> 12) * 2 - -var10;
                           var11 = var13 - var14 - -var9;
                           var14 = var12 * var12 >> 12;
                           ++var15;
                           var13 = var11 * var11 >> 12;
                           if (~(var13 - -var14) <= -16385) {
                              break;
                           }

                           var10000 = ~var15;
                           var10001 = ~this.field10940;
                           if (var3) {
                              continue label64;
                           }
                        } while(var10000 > var10001);
                     }

                     var5[var6] = ~(this.field10940 + -1) >= ~var15 ? 0 : (var15 << 12) / this.field10940;
                     ++var6;
                  } while(~class430.field6152 < ~var6);

                  return var5;
               } while(var10000 < var10001);
            }
         }

         return var5;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field10948[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method5408(boolean arg0) {
      try {
         field10946 = null;
         field10943 = null;
         if (arg0) {
            method5408(false);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10948[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5409(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5410(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
