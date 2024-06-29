import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class132 extends class264 {
   @OriginalMember(
      owner = "client!laa",
      name = "Y",
      descriptor = "[S"
   )
   private short[] field1692 = new short[257];
   @OriginalMember(
      owner = "client!laa",
      name = "I",
      descriptor = "I"
   )
   private int field1690 = 0;
   @OriginalMember(
      owner = "client!laa",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1698 = new String[]{method1049(method1048("\u0016\u0012mJ\u000eR")), method1049(method1048("\u0016\u0012mJ\u0000R")), method1049(method1048("9\u0006~\u0012.Z\u001c|\u00019\u001b\u0007e\u000b%Z\u0001i\u0015>\u0013\u0001i\u0017k\u001b\u0007,\b.\u001b\u0000xD?\r\u001c,\t*\b\u0018i\u00168")), method1049(method1048("\u0016\u0012mJ\tR")), method1049(method1048("\u0016\u0012mJ\bR")), method1049(method1048("\u0016\u0012mJ\u0003R")), method1049(method1048("\u0001]\"J6")), method1049(method1048("\u0014\u0006`\b")), method1049(method1048("\u0016\u0012mJ\rR")), method1049(method1048("\u0016\u0012mJ\u000fR")), method1049(method1048("\u0016\u0012mJ\nR")), method1049(method1048("\u0016\u0012mJ\u0002R"))};
   @OriginalMember(
      owner = "client!laa",
      name = "R",
      descriptor = "I"
   )
   public static int field1680 = 2;
   @OriginalMember(
      owner = "client!laa",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field1695 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @OriginalMember(
      owner = "client!laa",
      name = "O",
      descriptor = "Ldb;"
   )
   public static class343 field1694 = new class343();
   @OriginalMember(
      owner = "client!laa",
      name = "W",
      descriptor = "Lek;"
   )
   public static class536 field1697 = new class536(9, 7);
   @OriginalMember(
      owner = "client!laa",
      name = "V",
      descriptor = "I"
   )
   public static int field1681;
   @OriginalMember(
      owner = "client!laa",
      name = "Q",
      descriptor = "I"
   )
   public static int field1682;
   @OriginalMember(
      owner = "client!laa",
      name = "M",
      descriptor = "I"
   )
   public static int field1683;
   @OriginalMember(
      owner = "client!laa",
      name = "S",
      descriptor = "I"
   )
   public static int field1684;
   @OriginalMember(
      owner = "client!laa",
      name = "L",
      descriptor = "I"
   )
   public static int field1685;
   @OriginalMember(
      owner = "client!laa",
      name = "U",
      descriptor = "I"
   )
   public static int field1688;
   @OriginalMember(
      owner = "client!laa",
      name = "P",
      descriptor = "I"
   )
   public static int field1689;
   @OriginalMember(
      owner = "client!laa",
      name = "N",
      descriptor = "I"
   )
   public static int field1691;
   @OriginalMember(
      owner = "client!laa",
      name = "X",
      descriptor = "I"
   )
   public static int field1696;
   @OriginalMember(
      owner = "client!laa",
      name = "F",
      descriptor = "[I"
   )
   private int[] field1686;
   @OriginalMember(
      owner = "client!laa",
      name = "K",
      descriptor = "[I"
   )
   private int[] field1693;
   @OriginalMember(
      owner = "client!laa",
      name = "T",
      descriptor = "[[I"
   )
   private int[][] field1687;

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public final void method413(int arg0) {
      try {
         if (arg0 < 49) {
            this.method1042((byte)-33);
         }

         if (this.field1687 == null) {
            this.field1687 = new int[][]{new int[2], {4096, 4096}};
         }

         ++field1684;
         if (~this.field1687.length > -3) {
            throw new RuntimeException(field1698[2]);
         } else {
            if (this.field1690 == 2) {
               this.method1047(0);
            }

            class69.method644(693);
            this.method1042((byte)126);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1698[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "(B)V",
      line = 27
   )
   private final void method1042(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!laa",
      name = "g",
      descriptor = "(I)V",
      line = 205
   )
   public static void method1043(int arg0) {
      try {
         field1697 = null;
         field1695 = null;
         field1694 = null;
         if (arg0 != 14691) {
            method1045(true, (class678)null, -118);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1698[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 222
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (~arg0 == -1) {
            this.field1690 = arg1.method1143(-15465);
            this.field1687 = new int[arg1.method1143(-15465)][2];
            int var5 = 0;
            if (var4 || var5 < this.field1687.length) {
               do {
                  this.field1687[var5][0] = arg1.method1211(-26166);
                  this.field1687[var5][1] = arg1.method1211(-26166);
                  ++var5;
               } while(var5 < this.field1687.length);
            }
         }

         if (arg2 <= 49) {
            this.method1042((byte)-32);
         }

         ++field1688;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1698[10] + arg0 + ',' + (arg1 != null ? field1698[6] : field1698[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "(II)[I",
      line = 253
   )
   private final int[] method1044(int arg0, int arg1) {
      try {
         if (arg1 > -75) {
            return null;
         } else {
            ++field1689;
            if (~arg0 > -1) {
               return this.field1693;
            } else {
               return arg0 >= this.field1687.length ? this.field1686 : this.field1687[arg0];
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1698[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "<init>",
      descriptor = "()V",
      line = 271
   )
   public class132() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(ZLbl;I)V",
      line = 274
   )
   public static final void method1045(boolean arg0, class678 arg1, int arg2) {
      try {
         if (arg2 < 31) {
            field1697 = null;
         }

         ++field1696;
         int var3 = ~arg1.field9978 != -1 ? arg1.field9978 : arg1.field9904;
         int var4 = arg1.field9972 != 0 ? arg1.field9972 : arg1.field9980;
         class389.method2960(var4, class547.field7851[arg1.field9854 >> 16], var3, arg0, (byte)-35, arg1.field9854);
         if (arg1.field9840 != null) {
            class389.method2960(var4, arg1.field9840, var3, arg0, (byte)86, arg1.field9854);
         }

         class561 var5 = (class561)class191.field2708.method329((byte)-52, (long)arg1.field9854);
         if (var5 != null) {
            class395.method2993(var4, var3, arg0, var5.field8021, 31821);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1698[5] + arg0 + ',' + (arg1 != null ? field1698[6] : field1698[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "c",
      descriptor = "(II)Lic;",
      line = 307
   )
   public static final class729 method1046(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1681;
         if (arg0 != 1) {
            method1046(60, 79);
         }

         class729[] var3 = class384.method2915(-31264);
         int var4 = 0;
         if (!var2 && ~var4 <= ~var3.length) {
            return null;
         } else {
            do {
               class729 var5 = var3[var4];
               if (var5.field10679 == arg1) {
                  return var5;
               }

               ++var4;
            } while(~var4 > ~var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1698[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "d",
      descriptor = "(I)V",
      line = 340
   )
   private final void method1047(int arg0) {
      try {
         ++field1683;
         int[] var2 = this.field1687[0];
         int[] var3 = this.field1687[1];
         int[] var4 = this.field1687[this.field1687.length + -2];
         int[] var5 = this.field1687[this.field1687.length - 1];
         this.field1693 = new int[]{var2[0] - var3[0] - -var2[arg0], var2[1] - (var3[1] + -var2[1])};
         this.field1686 = new int[]{var4[0] + var4[0] + -var5[0], -var5[1] - (-var4[1] - var4[1])};
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1698[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(II)[I",
      line = 370
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1685;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         int var5 = 77 / ((24 - arg1) / 44);
         if (super.field3641.field5922) {
            int[] var6 = this.method2019(0, -27804, arg0);
            int var7 = 0;
            if (var3 || class430.field6152 > var7) {
               do {
                  int var8 = var6[var7] >> 4;
                  if (~var8 > -1) {
                     var8 = 0;
                  }

                  if (~var8 < -257) {
                     var8 = 256;
                  }

                  var4[var7] = this.field1692[var8];
                  ++var7;
               } while(class430.field6152 > var7);
            }
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1698[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1048(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1049(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
