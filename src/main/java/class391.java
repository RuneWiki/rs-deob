import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class391 {
   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6150 = new String[]{method3161(method3160("3\u0003l\u00023\u0001C")), method3161(method3160("8E#\u0002\u001f")), method3161(method3160("3\u0003l\u0002-\u0001C")), method3161(method3160("-\u001ea@")), method3161(method3160("3\u0003l\u00022\u0001C"))};
   @OriginalMember(
      owner = "client!pha",
      name = "i",
      descriptor = "Luk;"
   )
   public static class498 field6143 = new class498(112, 6);
   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field6146 = new int[1];
   @OriginalMember(
      owner = "client!pha",
      name = "h",
      descriptor = "Luk;"
   )
   public static class498 field6148 = new class498(102, -1);
   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "Ltm;"
   )
   public static class406 field6149 = new class406(method3161(method3160("\u0011(")), 1);
   @OriginalMember(
      owner = "client!pha",
      name = "d",
      descriptor = "I"
   )
   public static int field6142;
   @OriginalMember(
      owner = "client!pha",
      name = "c",
      descriptor = "I"
   )
   public static int field6145;
   @OriginalMember(
      owner = "client!pha",
      name = "j",
      descriptor = "Liba;"
   )
   public static class343 field6147;
   @OriginalMember(
      owner = "client!pha",
      name = "g",
      descriptor = "Lpha;"
   )
   public class391 field6140;
   @OriginalMember(
      owner = "client!pha",
      name = "e",
      descriptor = "Lpha;"
   )
   public class391 field6144;
   @OriginalMember(
      owner = "client!pha",
      name = "f",
      descriptor = "Lrr;"
   )
   public static class678 field6141;

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(Lfq;IILjq;IBLaa;I)V",
      line = 3
   )
   public static final void method3156(class374 arg0, int arg1, int arg2, class672 arg3, int arg4, byte arg5, class96 arg6, int arg7) {
      try {
         int var8 = 83 % ((arg5 - -50) / 56);
         ++field6142;
         if (arg3 != null) {
            int var9;
            label43: {
               if (class648.field9340 == 4) {
                  var9 = (int)class417.field6456 & 16383;
                  if (!client.field1786) {
                     break label43;
                  }
               }

               var9 = (int)class417.field6456 - -class438.field6710 & 16383;
            }

            int var10 = Math.max(arg0.field5849 / 2, arg0.field5915 / 2) - -10;
            int var11 = arg2 * arg2 + arg4 * arg4;
            if (~(var10 * var10) <= ~var11) {
               int var12 = class83.field1196[var9];
               int var13 = class83.field1194[var9];
               if (~class648.field9340 != -5) {
                  var12 = var12 * 256 / (class243.field3683 + 256);
                  var13 = var13 * 256 / (class243.field3683 + 256);
               }

               int var14 = arg2 * var13 + arg4 * var12 >> 14;
               int var15 = arg4 * var13 - arg2 * var12 >> 14;
               arg3.method939(arg1 - (-(arg0.field5849 / 2) - var14 - -(arg3.method2106() / 2)), arg7 - -(arg0.field5915 / 2) - var15 - arg3.method2108() / 2, arg6, arg1, arg7);
            }
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field6150[2] + (arg0 != null ? field6150[1] : field6150[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6150[1] : field6150[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6150[1] : field6150[3]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "d",
      descriptor = "(I)V",
      line = 46
   )
   public static void method3157(int arg0) {
      try {
         field6149 = null;
         if (arg0 == -4453) {
            field6141 = null;
            field6148 = null;
            field6143 = null;
            field6147 = null;
            field6146 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6150[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IIIII)V",
      line = 61
   )
   public static final void method3158(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (class284.field4485 != null) {
         class284.field4485[arg0][arg1] = -16777216 | arg2;
      }

      if (class183.field2879 != null) {
         class183.field2879[arg0][arg1] = (short)arg3;
      }

      if (class191.field2968 != null) {
         class191.field2968[arg0][arg1] = (byte)arg4;
      }

   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(Z)V",
      line = 75
   )
   public final void method3159(boolean arg0) {
      try {
         ++field6145;
         if (!arg0) {
            method3157(115);
         }

         if (this.field6140 != null) {
            this.field6140.field6144 = this.field6144;
            this.field6144.field6140 = this.field6140;
            this.field6144 = null;
            this.field6140 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6150[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3160(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3161(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
