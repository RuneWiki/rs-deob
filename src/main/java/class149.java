import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class149 extends class302 {
   @OriginalMember(
      owner = "client!ls",
      name = "I",
      descriptor = "I"
   )
   private int field1870 = -1;
   @OriginalMember(
      owner = "client!ls",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1873 = new String[]{method1228(method1227("O\u0001s3-")), method1228(method1227("O\u0001s#-")), method1228(method1227("O\u0001s2-")), method1228(method1227("O\u0001s*-")), method1228(method1227("O\u0001s/-")), method1228(method1227("O\u0001s'-")), method1228(method1227("X\\sOx")), method1228(method1227("M\u00071\r"))};
   @OriginalMember(
      owner = "client!ls",
      name = "Q",
      descriptor = "I"
   )
   public static int field1859 = -1;
   @OriginalMember(
      owner = "client!ls",
      name = "P",
      descriptor = "I"
   )
   public static int field1861 = -1;
   @OriginalMember(
      owner = "client!ls",
      name = "J",
      descriptor = "F"
   )
   public static float field1865;
   @OriginalMember(
      owner = "client!ls",
      name = "O",
      descriptor = "I"
   )
   public int field1858;
   @OriginalMember(
      owner = "client!ls",
      name = "U",
      descriptor = "I"
   )
   public static int field1860;
   @OriginalMember(
      owner = "client!ls",
      name = "M",
      descriptor = "I"
   )
   public static int field1862;
   @OriginalMember(
      owner = "client!ls",
      name = "L",
      descriptor = "I"
   )
   public static int field1863;
   @OriginalMember(
      owner = "client!ls",
      name = "T",
      descriptor = "I"
   )
   public static int field1864;
   @OriginalMember(
      owner = "client!ls",
      name = "K",
      descriptor = "I"
   )
   public static int field1866;
   @OriginalMember(
      owner = "client!ls",
      name = "V",
      descriptor = "I"
   )
   public int field1867;
   @OriginalMember(
      owner = "client!ls",
      name = "H",
      descriptor = "I"
   )
   public static int field1869;
   @OriginalMember(
      owner = "client!ls",
      name = "N",
      descriptor = "I"
   )
   public static int field1872;
   @OriginalMember(
      owner = "client!ls",
      name = "R",
      descriptor = "Lwo;"
   )
   public static class775 field1871;
   @OriginalMember(
      owner = "client!ls",
      name = "S",
      descriptor = "[I"
   )
   public int[] field1868;

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1224(int arg0) {
      try {
         if (arg0 != -1) {
            field1859 = 119;
         }

         ++field1863;
         return this.field1870;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1873[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1225(byte arg0) {
      try {
         field1871 = null;
         if (arg0 > -117) {
            method1225((byte)-44);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1873[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method1226(int arg0) {
      try {
         ++field1872;
         if (arg0 < 16) {
            this.method245((byte)-49, 2);
         }

         if (this.field1868 != null) {
            return true;
         } else if (~this.field1870 <= -1) {
            class671 var2 = class467.field7000 < 0 ? class671.method4890(class556.field8260, this.field1870) : class671.method4894(class556.field8260, class467.field7000, this.field1870);
            var2.method4892();
            this.field1868 = var2.method4893();
            this.field1867 = var2.field10097;
            this.field1858 = var2.field10100;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1873[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method241(boolean arg0) {
      try {
         super.method241(arg0);
         ++field1864;
         this.field1868 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1873[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "<init>",
      descriptor = "()V"
   )
   public class149() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field1866;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892 && this.method1226(24)) {
            label60: {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = this.field1858 * (~class501.field7439 == ~this.field1867 ? arg1 : this.field1867 * arg1 / class501.field7439);
               if (~class344.field5238 == ~this.field1858) {
                  int var9 = 0;
                  if (var3 != 0 || var9 < class344.field5238) {
                     do {
                        int var10 = this.field1868[var8++];
                        var7[var9] = class153.method1262(var10 << 4, 4080);
                        var6[var9] = class153.method1262(4080, var10 >> 4);
                        var5[var9] = class153.method1262(var10, 16711680) >> 12;
                        ++var9;
                     } while(var9 < class344.field5238);
                  }

                  if (var3 == 0) {
                     break label60;
                  }
               }

               int var11 = 0;
               if (var3 != 0 || ~class344.field5238 < ~var11) {
                  do {
                     int var12 = this.field1858 * var11 / class344.field5238;
                     int var13 = this.field1868[var8 + var12];
                     var7[var11] = class153.method1262(var13, 255) << 4;
                     var6[var11] = class153.method1262(var13, 65280) >> 4;
                     var5[var11] = class153.method1262(var13 >> 12, 4080);
                     ++var11;
                  } while(~class344.field5238 < ~var11);
               }
            }
         }

         if (arg0 != -90) {
            this.method1226(-117);
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field1873[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field1860;
         if (~arg0 == -1) {
            this.field1870 = arg2.method1038((byte)-102);
         }

         if (arg1 != 0) {
            field1862 = -98;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1873[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1873[6] : field1873[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1227(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1228(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
