import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class563 extends class302 {
   @OriginalMember(
      owner = "client!ur",
      name = "J",
      descriptor = "I"
   )
   private int field8404 = 585;
   @OriginalMember(
      owner = "client!ur",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8408 = new String[]{method4169(method4168("\u0016\b\u0013\u0005S")), method4169(method4168("\u0018T\u0013n\u0006")), method4169(method4168("\u0016\b\u0013\u0006S")), method4169(method4168("\r\u000fQ,")), method4169(method4168("\u0016\b\u0013\u0001S"))};
   @OriginalMember(
      owner = "client!ur",
      name = "K",
      descriptor = "Lcj;"
   )
   public static class721 field8407 = new class721(2, 4, 4, 0);
   @OriginalMember(
      owner = "client!ur",
      name = "I",
      descriptor = "I"
   )
   public static int field8405;
   @OriginalMember(
      owner = "client!ur",
      name = "H",
      descriptor = "I"
   )
   public static int field8406;

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "()V"
   )
   public class563() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field8405;
         if (arg1 == 0) {
            if (~arg0 == -1) {
               this.field8404 = arg2.method1038((byte)-107);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8408[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8408[1] : field8408[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8406;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int var5 = class23.field241[arg0];
            int var6 = 0;
            if (var3 != 0 || class344.field5238 > var6) {
               do {
                  label112: {
                     int var7 = class757.field11167[var6];
                     if (~this.field8404 > ~var7 && var7 < 4096 - this.field8404 && ~var5 < ~(2048 - this.field8404) && var5 < this.field8404 + 2048) {
                        int var8 = -var7 + 2048;
                        int var9 = ~var8 > -1 ? -var8 : var8;
                        int var10 = var9 << 12;
                        int var11 = var10 / (-this.field8404 + 2048);
                        var4[var6] = -var11 + 4096;
                        if (var3 == 0) {
                           break label112;
                        }
                     }

                     if (~var7 < ~(2048 - this.field8404) && ~(this.field8404 + 2048) < ~var7) {
                        int var12 = var5 + -2048;
                        int var13 = ~var12 > -1 ? -var12 : var12;
                        int var14 = var13 - this.field8404;
                        int var15 = var14 << 12;
                        var4[var6] = var15 / (-this.field8404 + 2048);
                        if (var3 == 0) {
                           break label112;
                        }
                     }

                     if (var5 < this.field8404 || var5 > -this.field8404 + 4096) {
                        int var16 = var7 - 2048;
                        int var17 = var16 < 0 ? -var16 : var16;
                        int var18 = var17 - this.field8404;
                        int var19 = var18 << 12;
                        var4[var6] = var19 / (-this.field8404 + 2048);
                        if (var3 == 0) {
                           break label112;
                        }
                     }

                     if (~var7 > ~this.field8404 || ~(-this.field8404 + 4096) > ~var7) {
                        int var20 = -var5 + 2048;
                        int var21 = var20 < 0 ? -var20 : var20;
                        int var22 = var21 << 12;
                        int var23 = var22 / (-this.field8404 + 2048);
                        var4[var6] = -var23 + 4096;
                        if (var3 == 0) {
                           break label112;
                        }
                     }

                     var4[var6] = 0;
                  }

                  ++var6;
               } while(class344.field5238 > var6);
            }
         }

         if (arg1 >= -37) {
            this.method401(-45, -122);
         }

         return var4;
      } catch (RuntimeException var25) {
         throw class670.method4877(var25, field8408[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4166(byte arg0) {
      try {
         field8407 = null;
         if (arg0 != -122) {
            method4167((class616)null, (class744[])null);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8408[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(Lvs;[Llja;)V"
   )
   public static final void method4167(class616 arg0, class744[] arg1) {
      if (class177.field2183) {
         int var2 = arg0.method1881(arg1, -52);
         class261.field3550.method599(var2, arg1);
      }

      if (class650.field9484 == class377.field5711) {
         boolean var3 = false;
         boolean var4 = false;
         int var5;
         int var6;
         if (arg0 instanceof class741) {
            var5 = ((class741)arg0).field10995;
            var6 = ((class741)arg0).field11000;
         } else {
            var5 = arg0.field9003 >> class459.field6950;
            var6 = arg0.field9007 >> class459.field6950;
         }

         class261.field3550.method641(class147.field1843[0].method2236((byte)126, arg0.field9003, arg0.field9007), class515.method3815(var5, var6), class500.method3732(var5, var6), class247.method1849(var5, var6));
      }

      class319 var7 = arg0.method10(class261.field3550, -1);
      if (var7 != null) {
         if (arg0.field8997) {
            class655[] var8 = var7.field4560;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class655 var10 = var8[var9];
               if (var10.field9523) {
                  class458.method3442(var10.field9524 + var10.field9520, 26306, var10.field9519 - var10.field9520, var10.field9521 - var10.field9520, var10.field9522 + var10.field9520);
               }
            }
         }

         if (var7.field4566) {
            var7.field4565 = arg0;
            if (class667.field9877) {
               class710 var11 = class499.field7394;
               synchronized(class499.field7394) {
                  class499.field7394.method5145(-17430, var7);
                  return;
               }
            }

            class499.field7394.method5145(-17430, var7);
            return;
         }

         class326.method2462(-201, var7);
      }

   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4168(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4169(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
