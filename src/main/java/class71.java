import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class71 extends class302 {
   @OriginalMember(
      owner = "client!qn",
      name = "R",
      descriptor = "I"
   )
   private int field892 = 0;
   @OriginalMember(
      owner = "client!qn",
      name = "N",
      descriptor = "[S"
   )
   private short[] field899 = new short[257];
   @OriginalMember(
      owner = "client!qn",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field906 = new String[]{method712(method711("g\u0015@\u0019u\u0004\u000fB\nbE\u0014[\u0000~\u0004\u0012W\u001eeM\u0012W\u001c0E\u0014\u0012\u0003uE\u0013FOdS\u000f\u0012\u0002qV\u000bW\u001dc")), method712(method711("U\u000e\u001c+8")), method712(method711("U\u000e\u001c(8")), method712(method711("U\u000e\u001c,8")), method712(method711("U\u000e\u001c>8")), method712(method711("U\u000e\u001c.8")), method712(method711("U\u000e\u001c=8")), method712(method711("U\u000e\u001c*8")), method712(method711("P\u0002@\nvV\u0005A\u0007")), method712(method711("U\u000e\u001c<8")), method712(method711("J\u0015^\u0003")), method712(method711("U\u000e\u001c)8")), method712(method711("_N\u001cAm"))};
   @OriginalMember(
      owner = "client!qn",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field894 = false;
   @OriginalMember(
      owner = "client!qn",
      name = "H",
      descriptor = "I"
   )
   public static int field891;
   @OriginalMember(
      owner = "client!qn",
      name = "M",
      descriptor = "I"
   )
   public static int field893;
   @OriginalMember(
      owner = "client!qn",
      name = "P",
      descriptor = "I"
   )
   public static int field895;
   @OriginalMember(
      owner = "client!qn",
      name = "V",
      descriptor = "I"
   )
   public static int field896;
   @OriginalMember(
      owner = "client!qn",
      name = "L",
      descriptor = "I"
   )
   public static int field901;
   @OriginalMember(
      owner = "client!qn",
      name = "O",
      descriptor = "I"
   )
   public static int field902;
   @OriginalMember(
      owner = "client!qn",
      name = "T",
      descriptor = "I"
   )
   public static int field904;
   @OriginalMember(
      owner = "client!qn",
      name = "Q",
      descriptor = "I"
   )
   public static int field905;
   @OriginalMember(
      owner = "client!qn",
      name = "K",
      descriptor = "Ldaa;"
   )
   public static class12 field903;
   @OriginalMember(
      owner = "client!qn",
      name = "U",
      descriptor = "[I"
   )
   private int[] field898;
   @OriginalMember(
      owner = "client!qn",
      name = "S",
      descriptor = "[I"
   )
   private int[] field900;
   @OriginalMember(
      owner = "client!qn",
      name = "J",
      descriptor = "[[I"
   )
   private int[][] field897;

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field904;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(arg0, false, 0);
            int var6 = 0;
            if (var3 != 0 || class344.field5238 > var6) {
               do {
                  int var7 = var5[var6] >> 4;
                  if (var7 < 0) {
                     var7 = 0;
                  }

                  if (~var7 < -257) {
                     var7 = 256;
                  }

                  var4[var6] = this.field899[var7];
                  ++var6;
               } while(class344.field5238 > var6);
            }
         }

         return arg1 > -37 ? null : var4;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field906[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method704(byte arg0) {
      try {
         field903 = null;
         if (arg0 <= 42) {
            field894 = true;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field906[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method705(int arg0) {
      try {
         ++field896;
         int[] var2 = this.field897[0];
         int[] var3 = this.field897[1];
         int[] var4 = this.field897[this.field897.length - 2];
         int[] var5 = this.field897[this.field897.length - 1];
         this.field900 = new int[]{var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[arg0]};
         this.field898 = new int[]{var4[0] - (var5[0] - var4[0]), var4[1] + -var5[1] + var4[1]};
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field906[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method706(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(BI)[I"
   )
   private final int[] method707(byte arg0, int arg1) {
      try {
         ++field891;
         if (~arg1 > -1) {
            return this.field900;
         } else {
            if (arg0 <= 31) {
               this.field898 = null;
            }

            return ~arg1 <= ~this.field897.length ? this.field898 : this.field897[arg1];
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field906[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int param1, int param2, class128 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      try {
         ++field901;
         if (this.field897 == null) {
            this.field897 = new int[][]{new int[2], {4096, 4096}};
         }

         if (this.field897.length < 2) {
            throw new RuntimeException(field906[0]);
         } else {
            if (this.field892 == 2) {
               this.method705(1);
            }

            if (arg0 > -87) {
               method704((byte)70);
            }

            class378.method2923(-117);
            this.method706(-1358027327);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field906[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "()V"
   )
   public class71() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!qn",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method709(int arg0) {
      try {
         ++field905;
         if (class487.field7208 != class266.field3653) {
            try {
               if (arg0 > -31) {
                  method709(-1);
               }

               class359.method2803(field906[8], class158.field2008, (byte)-127);
            } catch (Throwable var2) {
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field906[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method710(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method711(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method712(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
