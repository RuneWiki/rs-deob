import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class721 extends class606 {
   @OriginalMember(
      owner = "client!bf",
      name = "O",
      descriptor = "I"
   )
   private int field10328 = -1;
   @OriginalMember(
      owner = "client!bf",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10332 = new String[]{method5221(method5220("l;=\fx")), method5221(method5220("l;=\u0004x")), method5221(method5220("l;=\u000ex")), method5221(method5220("`(\u007f.")), method5221(method5220("us=l-")), method5221(method5220("l;=\u000fx")), method5221(method5220("l;=\u0003x")), method5221(method5220("l;=\u0000x"))};
   @OriginalMember(
      owner = "client!bf",
      name = "L",
      descriptor = "I"
   )
   public static int field10326 = 4;
   @OriginalMember(
      owner = "client!bf",
      name = "H",
      descriptor = "I"
   )
   public static int field10321;
   @OriginalMember(
      owner = "client!bf",
      name = "K",
      descriptor = "I"
   )
   public static int field10322;
   @OriginalMember(
      owner = "client!bf",
      name = "E",
      descriptor = "I"
   )
   public static int field10323;
   @OriginalMember(
      owner = "client!bf",
      name = "M",
      descriptor = "I"
   )
   public static int field10324;
   @OriginalMember(
      owner = "client!bf",
      name = "N",
      descriptor = "I"
   )
   private int field10325;
   @OriginalMember(
      owner = "client!bf",
      name = "G",
      descriptor = "I"
   )
   public static int field10327;
   @OriginalMember(
      owner = "client!bf",
      name = "D",
      descriptor = "I"
   )
   private int field10329;
   @OriginalMember(
      owner = "client!bf",
      name = "J",
      descriptor = "I"
   )
   public static int field10330;
   @OriginalMember(
      owner = "client!bf",
      name = "I",
      descriptor = "[I"
   )
   private int[] field10331;

   @OriginalMember(
      owner = "client!bf",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field10330;
         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (arg0 != 373) {
            this.method4470(68);
         }

         if (super.field8649.field11043) {
            int var5 = (class451.field6570 != this.field10329 ? this.field10329 * arg1 / class451.field6570 : arg1) * this.field10325;
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (~class563.field8014 == ~this.field10325) {
               int var9 = 0;
               if (var3 || ~class563.field8014 < ~var9) {
                  do {
                     int var10 = this.field10331[var5++];
                     var8[var9] = class697.method5101(4080, var10 << 4);
                     var7[var9] = class697.method5101(var10 >> 4, 4080);
                     var6[var9] = class697.method5101(var10 >> 12, 4080);
                     ++var9;
                  } while(~class563.field8014 < ~var9);
               }

               if (!var3) {
                  return var4;
               }
            }

            int var11 = 0;
            if (var3 || class563.field8014 > var11) {
               do {
                  int var12 = this.field10325 * var11 / class563.field8014;
                  int var13 = this.field10331[var5 + var12];
                  var8[var11] = class697.method5101(4080, var13 << 4);
                  var7[var11] = class697.method5101(4080, var13 >> 4);
                  var6[var11] = class697.method5101(var13, 16711680) >> 12;
                  ++var11;
               } while(class563.field8014 > var11);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field10332[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4470(int arg0) {
      try {
         super.method4470(arg0);
         ++field10323;
         this.field10331 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10332[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field10327;
         if (arg2 >= -6) {
            this.method8((class65)null, 31, 41);
         }

         if (~arg1 == -1) {
            this.field10328 = arg0.method685(-2);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10332[6] + (arg0 != null ? field10332[4] : field10332[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method4468(byte arg0) {
      try {
         ++field10324;
         return arg0 != 121 ? -47 : this.field10328;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10332[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "<init>",
      descriptor = "()V"
   )
   public class721() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "([BI)[B"
   )
   public static final byte[] method5219(byte[] arg0, int arg1) {
      try {
         ++field10322;
         class65 var2 = new class65(arg0);
         if (arg1 <= 38) {
            field10326 = -97;
         }

         int var3 = var2.method665(false);
         int var4 = var2.method701(255);
         if (var4 < 0 || ~class606.field8654 != -1 && class606.field8654 < var4) {
            throw new RuntimeException();
         } else if (~var3 == -1) {
            byte[] var5 = new byte[var4];
            var2.method678(var4, -32768, 0, var5);
            return var5;
         } else {
            int var6 = var2.method701(255);
            if (var6 >= 0 && (~class606.field8654 == -1 || ~var6 >= ~class606.field8654)) {
               byte[] var7 = new byte[var6];
               if (~var3 != -2) {
                  class495 var8 = class282.field4259;
                  synchronized(class282.field4259) {
                     class282.field4259.method3753(0, var7, var2);
                  }
               } else {
                  class640.method4665(var7, var6, arg0, var4, 9);
               }

               return var7;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10332[5] + (arg0 != null ? field10332[4] : field10332[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method4464(int arg0, int arg1, byte arg2) {
      try {
         ++field10321;
         super.method4464(arg0, arg1, arg2);
         if (~this.field10328 <= -1 && class759.field10844 != null) {
            int var4 = class759.field10844.method2043(-60, this.field10328).field5685 ? 64 : 128;
            this.field10331 = class759.field10844.method2038(1.0F, var4, false, this.field10328, var4, -23361);
            this.field10329 = var4;
            this.field10325 = var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10332[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5220(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5221(char[] arg0) {
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
            var10005 = 93;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
