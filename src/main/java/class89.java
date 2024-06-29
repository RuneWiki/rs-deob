import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class89 extends class70 {
   @OriginalMember(
      owner = "client!tb",
      name = "M",
      descriptor = "I"
   )
   private int field1285 = 4;
   @OriginalMember(
      owner = "client!tb",
      name = "G",
      descriptor = "I"
   )
   private int field1284 = 4;
   @OriginalMember(
      owner = "client!tb",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1289 = new String[]{method853(method852("z\fNT-")), method853(method852("z\fN]-")), method853(method852("`\u001b\fr")), method853(method852("u@N0x")), method853(method852("z\fNV-"))};
   @OriginalMember(
      owner = "client!tb",
      name = "K",
      descriptor = "Z"
   )
   public static boolean field1286 = false;
   @OriginalMember(
      owner = "client!tb",
      name = "I",
      descriptor = "I"
   )
   public static int field1281;
   @OriginalMember(
      owner = "client!tb",
      name = "N",
      descriptor = "I"
   )
   public static int field1282;
   @OriginalMember(
      owner = "client!tb",
      name = "J",
      descriptor = "I"
   )
   public static int field1283;
   @OriginalMember(
      owner = "client!tb",
      name = "H",
      descriptor = "I"
   )
   public static int field1287;
   @OriginalMember(
      owner = "client!tb",
      name = "L",
      descriptor = "I"
   )
   public static int field1288;

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(BI)[I",
      line = 4
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field1282;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            this.method537(-27, 1);
         }

         if (super.field923.field7284) {
            int var5;
            int[] var7;
            label42: {
               var5 = class678.field10127 / this.field1285;
               int var6 = class304.field4744 / this.field1284;
               if (var6 <= 0) {
                  var7 = this.method545(0, 0, (byte)-119);
                  if (!var3) {
                     break label42;
                  }
               }

               int var8 = arg1 % var6;
               var7 = this.method545(0, class304.field4744 * var8 / var6, (byte)-72);
            }

            int var9 = 0;
            if (var3 || class678.field10127 > var9) {
               do {
                  if (var5 > 0) {
                     int var10 = var9 % var5;
                     var4[var9] = var7[class678.field10127 * var10 / var5];
                     if (!var3) {
                        ++var9;
                        continue;
                     }
                  }

                  var4[var9] = var7[0];
                  ++var9;
               } while(class678.field10127 > var9);
            }
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field1289[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(II)[[I",
      line = 59
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != 32) {
            field1281 = -103;
         }

         ++field1283;
         int[][] var4 = super.field918.method3276((byte)116, arg1);
         if (super.field918.field6361) {
            int var5;
            int[][] var7;
            label40: {
               var5 = class678.field10127 / this.field1285;
               int var6 = class304.field4744 / this.field1284;
               if (~var6 >= -1) {
                  var7 = this.method539(true, 0, 0);
                  if (!var3) {
                     break label40;
                  }
               }

               int var8 = arg1 % var6;
               var7 = this.method539(true, class304.field4744 * var8 / var6, 0);
            }

            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            int var15 = 0;
            if (var3 || ~class678.field10127 < ~var15) {
               do {
                  int var16;
                  label33: {
                     if (var5 <= 0) {
                        var16 = 0;
                        if (!var3) {
                           break label33;
                        }
                     }

                     int var17 = var15 % var5;
                     var16 = class678.field10127 * var17 / var5;
                  }

                  var12[var15] = var9[var16];
                  var13[var15] = var10[var16];
                  var14[var15] = var11[var16];
                  ++var15;
               } while(~class678.field10127 < ~var15);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field1289[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(IILica;)V",
      line = 130
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field1287;
         if (arg0 != -1) {
            this.method537(-42, -124);
         }

         if (arg1 != 0) {
            if (~arg1 != -2) {
               return;
            }

            if (!client.field1786) {
               this.field1284 = arg2.method2855(arg0 ^ 31006);
               return;
            }
         }

         this.field1285 = arg2.method2855(arg0 ^ 31006);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1289[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1289[3] : field1289[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "<init>",
      descriptor = "()V",
      line = 175
   )
   public class89() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method852(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method853(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
