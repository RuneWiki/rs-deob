import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class774 extends class207 {
   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11336 = new String[]{method5581(method5580("F\u000b1\u000f\u0014")), method5581(method5580("F\u000b1\b\u0014")), method5581(method5580("LF1eA")), method5581(method5580("Y\u001ds'")), method5581(method5580("F\u000b1\t\u0014")), method5581(method5580("F\u000b1\u000e\u0014")), method5581(method5580("F\u000b1\n\u0014"))};
   @OriginalMember(
      owner = "client!qc",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field11324 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @OriginalMember(
      owner = "client!qc",
      name = "o",
      descriptor = "I"
   )
   public static int field11327 = -1;
   @OriginalMember(
      owner = "client!qc",
      name = "p",
      descriptor = "I"
   )
   private int field11325;
   @OriginalMember(
      owner = "client!qc",
      name = "u",
      descriptor = "I"
   )
   public static int field11326;
   @OriginalMember(
      owner = "client!qc",
      name = "n",
      descriptor = "I"
   )
   public static int field11328;
   @OriginalMember(
      owner = "client!qc",
      name = "y",
      descriptor = "I"
   )
   public static int field11329;
   @OriginalMember(
      owner = "client!qc",
      name = "w",
      descriptor = "I"
   )
   public static int field11330;
   @OriginalMember(
      owner = "client!qc",
      name = "r",
      descriptor = "I"
   )
   private int field11332;
   @OriginalMember(
      owner = "client!qc",
      name = "s",
      descriptor = "I"
   )
   private int field11333;
   @OriginalMember(
      owner = "client!qc",
      name = "v",
      descriptor = "I"
   )
   private int field11334;
   @OriginalMember(
      owner = "client!qc",
      name = "q",
      descriptor = "I"
   )
   public static int field11335;
   @OriginalMember(
      owner = "client!qc",
      name = "t",
      descriptor = "Ldf;"
   )
   public static class420 field11331;

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(Ljj;Z)V",
      line = 4
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         if (!arg1) {
            method5577(119);
         }

         ++field11328;
         this.field11332 = arg0.method1041(4758);
         this.field11333 = arg0.method1041(4758);
         this.field11325 = arg0.method1104(255);
         this.field11334 = arg0.method1104(255);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11336[6] + (arg0 != null ? field11336[2] : field11336[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "(I)V",
      line = 20
   )
   public static void method5577(int arg0) {
      try {
         field11324 = null;
         int var1 = 33 % ((-8 - arg0) / 37);
         field11331 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11336[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(Lfa;Z)V",
      line = 36
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         arg0.method1811(this.field11325, this.field11334, 107, this.field11332, this.field11333);
         ++field11335;
         if (!arg1) {
            field11330 = 96;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11336[4] + (arg0 != null ? field11336[2] : field11336[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(II)I",
      line = 53
   )
   public static int method5578(int arg0, int arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11336[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(B)V",
      line = 60
   )
   public static final void method5579(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5580(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5581(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
