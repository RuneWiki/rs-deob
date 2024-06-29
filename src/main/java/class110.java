import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class110 extends class70 {
   @OriginalMember(
      owner = "client!fv",
      name = "K",
      descriptor = "Z"
   )
   private boolean field1514 = true;
   @OriginalMember(
      owner = "client!fv",
      name = "H",
      descriptor = "I"
   )
   private int field1519 = 4096;
   @OriginalMember(
      owner = "client!fv",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1522 = new String[]{method1048(method1047("\u007f\u000e:Nc")), method1048(method1047("bV:(6")), method1048(method1047("w\rxj")), method1048(method1047("\u007f\u000e:Lc")), method1048(method1047("\u007f\u000e:Bc")), method1048(method1047("\u007f\u000e:Gc"))};
   @OriginalMember(
      owner = "client!fv",
      name = "L",
      descriptor = "Lnaa;"
   )
   public static class113 field1517 = new class113(50, 3);
   @OriginalMember(
      owner = "client!fv",
      name = "J",
      descriptor = "Ldha;"
   )
   public static class642 field1520 = new class642("", 13);
   @OriginalMember(
      owner = "client!fv",
      name = "G",
      descriptor = "I"
   )
   public static int field1515;
   @OriginalMember(
      owner = "client!fv",
      name = "I",
      descriptor = "I"
   )
   public static int field1516;
   @OriginalMember(
      owner = "client!fv",
      name = "F",
      descriptor = "I"
   )
   public static int field1518;
   @OriginalMember(
      owner = "client!fv",
      name = "M",
      descriptor = "I"
   )
   public static int field1521;

   @OriginalMember(
      owner = "client!fv",
      name = "g",
      descriptor = "(I)V",
      line = 7
   )
   public static final void method1045(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "(Z)V",
      line = 48
   )
   public static void method1046(boolean arg0) {
      try {
         field1517 = null;
         field1520 = null;
         if (arg0) {
            method1046(true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1522[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "<init>",
      descriptor = "()V",
      line = 59
   )
   public class110() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IILica;)V",
      line = 67
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label48: {
            label42: {
               if (arg1 != 0) {
                  if (arg1 != 1) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field1519 = arg2.method2848(-106);
               if (!var4) {
                  break label48;
               }
            }

            this.field1514 = ~arg2.method2855(-31007) == -2;
         }

         if (arg0 == -1) {
            ++field1518;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1522[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1522[1] : field1522[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(II)[[I",
      line = 115
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != 32) {
            method1046(true);
         }

         ++field1515;
         int[][] var4 = super.field918.method3276((byte)113, arg1);
         if (super.field918.field6361) {
            int[] var5 = this.method545(0, arg1 - 1 & class578.field8547, (byte)-80);
            int[] var6 = this.method545(0, arg1, (byte)-123);
            int[] var7 = this.method545(0, class578.field8547 & arg1 + 1, (byte)-111);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int var11 = 0;
            if (var3 || ~var11 > ~class678.field10127) {
               do {
                  int var19;
                  int var20;
                  int var21;
                  label33: {
                     int var12 = (var7[var11] - var5[var11]) * this.field1519;
                     int var13 = (var6[class50.field637 & var11 + 1] - var6[var11 + -1 & class50.field637]) * this.field1519;
                     int var14 = var13 >> 12;
                     int var15 = var12 >> 12;
                     int var16 = var14 * var14 >> 12;
                     int var17 = var15 * var15 >> 12;
                     int var18 = (int)(4096.0D * Math.sqrt((double)((float)(var16 + 4096 - -var17) / 4096.0F)));
                     if (var18 == 0) {
                        var19 = 0;
                        var20 = 0;
                        var21 = 0;
                        if (!var3) {
                           break label33;
                        }
                     }

                     var21 = var13 / var18;
                     var19 = 16777216 / var18;
                     var20 = var12 / var18;
                  }

                  if (this.field1514) {
                     var20 = (var20 >> 1) + 2048;
                     var21 = 2048 - -(var21 >> 1);
                     var19 = (var19 >> 1) + 2048;
                  }

                  var8[var11] = var21;
                  var9[var11] = var20;
                  var10[var11] = var19;
                  ++var11;
               } while(~var11 > ~class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field1522[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1047(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1048(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
