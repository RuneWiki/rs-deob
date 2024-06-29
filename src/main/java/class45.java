import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class45 extends class264 {
   @OriginalMember(
      owner = "client!vba",
      name = "G",
      descriptor = "I"
   )
   private int field612 = -1;
   @OriginalMember(
      owner = "client!vba",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field615 = new String[]{method384(method383("LN\u001bE\u001b\u0012")), method384(method383("TY\u0016\u0007")), method384(method383("A\u0002TE'")), method384(method383("LN\u001bE\u0017\u0012")), method384(method383("LN\u001bE\u001d\u0012")), method384(method383("LN\u001bE\u0019\u0012")), method384(method383("LN\u001bE\u0016\u0012")), method384(method383("LN\u001bE\u000f\u0012")), method384(method383("LN\u001bE\u0013\u0012"))};
   @OriginalMember(
      owner = "client!vba",
      name = "L",
      descriptor = "I"
   )
   public static int field604;
   @OriginalMember(
      owner = "client!vba",
      name = "I",
      descriptor = "I"
   )
   public static int field605;
   @OriginalMember(
      owner = "client!vba",
      name = "K",
      descriptor = "I"
   )
   public static int field607;
   @OriginalMember(
      owner = "client!vba",
      name = "P",
      descriptor = "I"
   )
   public static int field608;
   @OriginalMember(
      owner = "client!vba",
      name = "N",
      descriptor = "I"
   )
   public static int field609;
   @OriginalMember(
      owner = "client!vba",
      name = "J",
      descriptor = "I"
   )
   public int field610;
   @OriginalMember(
      owner = "client!vba",
      name = "M",
      descriptor = "I"
   )
   public static int field611;
   @OriginalMember(
      owner = "client!vba",
      name = "F",
      descriptor = "I"
   )
   public static int field613;
   @OriginalMember(
      owner = "client!vba",
      name = "H",
      descriptor = "I"
   )
   public int field614;
   @OriginalMember(
      owner = "client!vba",
      name = "O",
      descriptor = "[I"
   )
   public int[] field606;

   @OriginalMember(
      owner = "client!vba",
      name = "b",
      descriptor = "(B)I",
      line = 7
   )
   public static final int method377(byte arg0) {
      try {
         if (arg0 != -37) {
            return 83;
         } else {
            ++field611;
            return class614.field9025 == 1 ? class752.field11122 : class392.field5678;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field615[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 24
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (~arg0 == -1) {
            this.field612 = arg1.method1211(-26166);
         }

         ++field609;
         if (arg2 < 49) {
            method377((byte)18);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field615[0] + arg0 + ',' + (arg1 != null ? field615[2] : field615[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(I[IIILuo;ZIIII[IIBII)I",
      line = 38
   )
   public static final int method378(int param0, int[] param1, int param2, int param3, class603 param4, boolean param5, int param6, int param7, int param8, int param9, int[] param10, int param11, byte param12, int param13, int param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vba",
      name = "b",
      descriptor = "(I)V",
      line = 213
   )
   public final void method379(int arg0) {
      try {
         super.method379(123);
         ++field605;
         this.field606 = null;
         if (arg0 < 117) {
            this.field610 = -78;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field615[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "d",
      descriptor = "(I)Z",
      line = 226
   )
   public final boolean method380(int arg0) {
      try {
         ++field607;
         if (this.field606 != null) {
            return true;
         } else {
            if (arg0 != -1615170204) {
               method381(-79, 76, 30);
            }

            if (~this.field612 <= -1) {
               class439 var2 = class590.field8701 < 0 ? class439.method3235(class80.field1027, this.field612) : class439.method3239(class80.field1027, class590.field8701, this.field612);
               var2.method3234();
               this.field606 = var2.method3244();
               this.field610 = var2.field6267;
               this.field614 = var2.field6269;
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field615[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(IB)[[I",
      line = 252
   )
   public int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 > -117) {
            this.method379(112);
         }

         ++field608;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828 && this.method380(-1615170204)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = (~class20.field234 != ~this.field610 ? this.field610 * arg0 / class20.field234 : arg0) * this.field614;
            if (class430.field6152 == this.field614) {
               int var9 = 0;
               if (var3 || ~class430.field6152 < ~var9) {
                  do {
                     int var10 = this.field606[var8++];
                     var7[var9] = class556.method3988(var10, 255) << 4;
                     var6[var9] = class556.method3988(var10, 65280) >> 4;
                     var5[var9] = class556.method3988(16711680, var10) >> 12;
                     ++var9;
                  } while(~class430.field6152 < ~var9);
               }

               if (!var3) {
                  return var4;
               }
            }

            int var11 = 0;
            if (var3 || ~class430.field6152 < ~var11) {
               do {
                  int var12 = this.field614 * var11 / class430.field6152;
                  int var13 = this.field606[var8 + var12];
                  var7[var11] = class556.method3988(var13 << 4, 4080);
                  var6[var11] = class556.method3988(4080, var13 >> 4);
                  var5[var11] = class556.method3988(4080, var13 >> 12);
                  ++var11;
               } while(~class430.field6152 < ~var11);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field615[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "b",
      descriptor = "(III)Lsv;",
      line = 323
   )
   public static final class688 method381(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      return var3 == null ? null : var3.field7476;
   }

   @OriginalMember(
      owner = "client!vba",
      name = "<init>",
      descriptor = "()V",
      line = 348
   )
   public class45() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(Z)I",
      line = 335
   )
   public final int method382(boolean arg0) {
      try {
         ++field604;
         return !arg0 ? 29 : this.field612;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field615[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method383(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method384(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
