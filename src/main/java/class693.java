import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class693 extends class70 {
   @OriginalMember(
      owner = "client!jaa",
      name = "M",
      descriptor = "I"
   )
   private int field10309 = 4096;
   @OriginalMember(
      owner = "client!jaa",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10312 = new String[]{method5103(method5102("\u0013+VLMQ")), method5103(method5102("\u0013+VLJQ")), method5103(method5102("\u0002d\u0019Ls")), method5103(method5102("\u0013+VLOQ")), method5103(method5102("\u0017?[\u000e")), method5103(method5102("\u0013+VLKQ")), method5103(method5102("\u0013+VLFQ"))};
   @OriginalMember(
      owner = "client!jaa",
      name = "J",
      descriptor = "S"
   )
   public static short field10308 = 256;
   @OriginalMember(
      owner = "client!jaa",
      name = "L",
      descriptor = "F"
   )
   public static float field10310;
   @OriginalMember(
      owner = "client!jaa",
      name = "G",
      descriptor = "I"
   )
   public static int field10304;
   @OriginalMember(
      owner = "client!jaa",
      name = "F",
      descriptor = "I"
   )
   public static int field10305;
   @OriginalMember(
      owner = "client!jaa",
      name = "H",
      descriptor = "I"
   )
   public static int field10306;
   @OriginalMember(
      owner = "client!jaa",
      name = "I",
      descriptor = "I"
   )
   public static int field10307;
   @OriginalMember(
      owner = "client!jaa",
      name = "K",
      descriptor = "I"
   )
   public static int field10311;

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(BI)[I",
      line = 4
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != 87) {
            return null;
         } else {
            ++field10305;
            int[] var4 = super.field923.method3718(-2, arg1);
            if (super.field923.field7284) {
               int[] var5 = this.method545(0, arg1 - 1 & class578.field8547, (byte)-105);
               int[] var6 = this.method545(0, arg1, (byte)-55);
               int[] var7 = this.method545(0, arg1 + 1 & class578.field8547, (byte)-109);
               int var8 = 0;
               if (var3 || class678.field10127 > var8) {
                  do {
                     int var9 = (var7[var8] + -var5[var8]) * this.field10309;
                     int var10 = (var6[class50.field637 & var8 + 1] + -var6[class50.field637 & var8 + -1]) * this.field10309;
                     int var11 = var10 >> 12;
                     int var12 = var9 >> 12;
                     int var13 = var11 * var11 >> 12;
                     int var14 = var12 * var12 >> 12;
                     int var15 = (int)(Math.sqrt((double)((float)(var13 - (-var14 - 4096)) / 4096.0F)) * 4096.0D);
                     int var16 = ~var15 == -1 ? 0 : 16777216 / var15;
                     var4[var8] = 4096 - var16;
                     ++var8;
                  } while(class678.field10127 > var8);
               }
            }

            return var4;
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field10312[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "<init>",
      descriptor = "()V",
      line = 58
   )
   public class693() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(IILica;)V",
      line = 61
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field10304;
         if (~arg1 == arg0) {
            this.field10309 = arg2.method2848(-119);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10312[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10312[2] : field10312[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(III)I",
      line = 72
   )
   public static final int method5099(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(B)V",
      line = 160
   )
   public static final void method5100(byte arg0) {
      try {
         class719.field10778.method2551(true);
         if (arg0 == 88) {
            ++field10311;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10312[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Lfq;I)V",
      line = 171
   )
   public static final void method5101(class374 arg0, int arg1) {
      try {
         ++field10306;
         if (class552.field8264) {
            if (arg0.field5799 != null) {
               class374 var2 = class221.method1912(class175.field2750, -56, class105.field1459);
               if (var2 != null) {
                  class36 var3 = new class36();
                  var3.field440 = var2;
                  var3.field437 = arg0.field5799;
                  var3.field441 = arg0;
                  class469.method3632(var3);
               }
            }

            ++client.field1770;
            class577 var4 = class218.method1888(class623.field9049, 99, class510.field7801.field361);
            var4.field8531.method2874((byte)-23, arg0.field5848);
            var4.field8531.method2838(arg0.field5840, arg1 + -8);
            var4.field8531.method2901(arg1 ^ 72, class175.field2750);
            if (arg1 == 64) {
               var4.field8531.method2874((byte)-23, class105.field1459);
               var4.field8531.method2873(class449.field6882, (byte)122);
               var4.field8531.method2874((byte)-23, arg0.field5927);
               class510.field7801.method211(var4, arg1 ^ 58);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10312[3] + (arg0 != null ? field10312[2] : field10312[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5102(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5103(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
