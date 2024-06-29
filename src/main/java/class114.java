import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class114 extends class629 {
   @OriginalMember(
      owner = "client!kba",
      name = "P",
      descriptor = "[S"
   )
   private short[] field1845 = new short[257];
   @OriginalMember(
      owner = "client!kba",
      name = "Q",
      descriptor = "I"
   )
   private int field1839 = 0;
   @OriginalMember(
      owner = "client!kba",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1856 = new String[]{method1087(method1086("\u000epY\\\u0004M")), method1087(method1086("\u001e<\u0016\\<")), method1087(method1086("\u000bgT\u001e")), method1087(method1086("\u000epY\\\u0011M")), method1087(method1086("&gJ\u0004$E}H\u00173\u0004fQ\u001d/E`]\u00034\f`]\u0001a\u0004f\u0018\u001e$\u0004aLR5\u0012}\u0018\u001f \u0017y]\u00002")), method1087(method1086("\u000epY\\\bM")), method1087(method1086("\u000epY\\\u000eM")), method1087(method1086("\u000epY\\\u0010M")), method1087(method1086("\u000epY\\\fM")), method1087(method1086("\u000epY\\\u000bM")), method1087(method1086("\u000epY\\\u000fM"))};
   @OriginalMember(
      owner = "client!kba",
      name = "D",
      descriptor = "I"
   )
   public static int field1841 = 0;
   @OriginalMember(
      owner = "client!kba",
      name = "G",
      descriptor = "I"
   )
   public static int field1843 = 0;
   @OriginalMember(
      owner = "client!kba",
      name = "S",
      descriptor = "[Z"
   )
   public static boolean[] field1851 = new boolean[100];
   @OriginalMember(
      owner = "client!kba",
      name = "H",
      descriptor = "I"
   )
   public static int field1855 = 52;
   @OriginalMember(
      owner = "client!kba",
      name = "E",
      descriptor = "I"
   )
   public static int field1840;
   @OriginalMember(
      owner = "client!kba",
      name = "J",
      descriptor = "I"
   )
   public static int field1842;
   @OriginalMember(
      owner = "client!kba",
      name = "L",
      descriptor = "I"
   )
   public static int field1844;
   @OriginalMember(
      owner = "client!kba",
      name = "F",
      descriptor = "I"
   )
   public static int field1846;
   @OriginalMember(
      owner = "client!kba",
      name = "M",
      descriptor = "I"
   )
   public static int field1847;
   @OriginalMember(
      owner = "client!kba",
      name = "K",
      descriptor = "I"
   )
   public static int field1848;
   @OriginalMember(
      owner = "client!kba",
      name = "I",
      descriptor = "I"
   )
   public static int field1849;
   @OriginalMember(
      owner = "client!kba",
      name = "T",
      descriptor = "I"
   )
   public static int field1850;
   @OriginalMember(
      owner = "client!kba",
      name = "O",
      descriptor = "[I"
   )
   private int[] field1852;
   @OriginalMember(
      owner = "client!kba",
      name = "N",
      descriptor = "[I"
   )
   private int[] field1854;
   @OriginalMember(
      owner = "client!kba",
      name = "R",
      descriptor = "[[I"
   )
   private int[][] field1853;

   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 6
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         if (arg1 == arg2) {
            this.field1839 = arg0.method3564((byte)-93);
            this.field1853 = new int[arg0.method3564((byte)-51)][2];
            int var5 = 0;
            if (var4 || ~this.field1853.length < ~var5) {
               do {
                  this.field1853[var5][0] = arg0.method3565(true);
                  this.field1853[var5][1] = arg0.method3565(true);
                  ++var5;
               } while(~this.field1853.length < ~var5);
            }
         }

         ++field1842;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1856[0] + (arg0 != null ? field1856[1] : field1856[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "c",
      descriptor = "(II)[I",
      line = 30
   )
   private final int[] method1081(int arg0, int arg1) {
      try {
         int var3 = 111 % ((15 - arg0) / 37);
         ++field1840;
         if (~arg1 > -1) {
            return this.field1854;
         } else {
            return arg1 >= this.field1853.length ? this.field1852 : this.field1853[arg1];
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1856[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "<init>",
      descriptor = "()V",
      line = 48
   )
   public class114() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!kba",
      name = "g",
      descriptor = "(I)V",
      line = 52
   )
   public static void method1082(int arg0) {
      try {
         if (arg0 == 21729) {
            field1851 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1856[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "h",
      descriptor = "(I)V",
      line = 62
   )
   private final void method1083(int arg0) {
      try {
         ++field1850;
         int[] var2 = this.field1853[0];
         int[] var3 = this.field1853[1];
         int[] var4 = this.field1853[this.field1853.length + -2];
         int[] var5 = this.field1853[this.field1853.length + arg0];
         this.field1854 = new int[]{var2[0] + -var3[0] + var2[0], var2[1] + var2[1] - var3[1]};
         this.field1852 = new int[]{var4[0] - (-var4[0] - -var5[0]), var4[1] + var4[1] + -var5[1]};
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1856[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "(II)[I",
      line = 80
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1848;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            int[] var5 = this.method4622((byte)117, 0, arg0);
            int var6 = 0;
            if (var3 || class66.field1214 > var6) {
               do {
                  int var7 = var5[var6] >> 4;
                  if (~var7 > -1) {
                     var7 = 0;
                  }

                  if (~var7 < -257) {
                     var7 = 256;
                  }

                  var4[var6] = this.field1845[var7];
                  ++var6;
               } while(class66.field1214 > var6);
            }
         }

         return arg1 != 2048 ? null : var4;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1856[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "i",
      descriptor = "(I)V",
      line = 120
   )
   public static final void method1084(int arg0) {
      try {
         if (arg0 != 22443) {
            method1082(63);
         }

         class28.field415.method1589((byte)44);
         ++field1846;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1856[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "(I)V",
      line = 141
   )
   public final void method901(int arg0) {
      try {
         ++field1849;
         if (this.field1853 == null) {
            this.field1853 = new int[][]{new int[2], {4096, 4096}};
         }

         if (this.field1853.length < 2) {
            throw new RuntimeException(field1856[4]);
         } else {
            if (this.field1839 == 2) {
               this.method1083(-1);
            }

            class375.method2933(arg0 ^ 245881196);
            if (arg0 != 245880940) {
               this.field1853 = null;
            }

            this.method1085((byte)-17);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1856[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "(B)V",
      line = 163
   )
   private final void method1085(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1086(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1087(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
