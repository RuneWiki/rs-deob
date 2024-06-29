import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class662 {
   @OriginalMember(
      owner = "client!ip",
      name = "e",
      descriptor = "[I"
   )
   public int[] field9313;
   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "B"
   )
   public byte field9325;
   @OriginalMember(
      owner = "client!ip",
      name = "n",
      descriptor = "[I"
   )
   public int[] field9323;
   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "B"
   )
   public byte field9324;
   @OriginalMember(
      owner = "client!ip",
      name = "h",
      descriptor = "[I"
   )
   public int[] field9310;
   @OriginalMember(
      owner = "client!ip",
      name = "c",
      descriptor = "S"
   )
   public short field9312;
   @OriginalMember(
      owner = "client!ip",
      name = "t",
      descriptor = "S"
   )
   public short field9318;
   @OriginalMember(
      owner = "client!ip",
      name = "j",
      descriptor = "S"
   )
   public short field9315;
   @OriginalMember(
      owner = "client!ip",
      name = "g",
      descriptor = "S"
   )
   public short field9320;
   @OriginalMember(
      owner = "client!ip",
      name = "f",
      descriptor = "[S"
   )
   public short[] field9316;
   @OriginalMember(
      owner = "client!ip",
      name = "k",
      descriptor = "[S"
   )
   public short[] field9317;
   @OriginalMember(
      owner = "client!ip",
      name = "o",
      descriptor = "[S"
   )
   public short[] field9314;
   @OriginalMember(
      owner = "client!ip",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9330 = new String[]{method4806(method4805("S2_uw")), method4806(method4805("S2_ww")), method4806(method4805("S2_vw")), method4806(method4805("S2_\b6T+\u0005\nw"))};
   @OriginalMember(
      owner = "client!ip",
      name = "q",
      descriptor = "Lrg;"
   )
   public static class167 field9321 = new class167(true);
   @OriginalMember(
      owner = "client!ip",
      name = "s",
      descriptor = "I"
   )
   public static int field9326 = -1;
   @OriginalMember(
      owner = "client!ip",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field9327 = true;
   @OriginalMember(
      owner = "client!ip",
      name = "d",
      descriptor = "Liw;"
   )
   public static class107 field9322 = new class107(64);
   @OriginalMember(
      owner = "client!ip",
      name = "r",
      descriptor = "F"
   )
   public static float field9329 = 0.0F;
   @OriginalMember(
      owner = "client!ip",
      name = "m",
      descriptor = "I"
   )
   public static int field9311;
   @OriginalMember(
      owner = "client!ip",
      name = "l",
      descriptor = "I"
   )
   public static int field9319;
   @OriginalMember(
      owner = "client!ip",
      name = "i",
      descriptor = "Ld;"
   )
   public static class672 field9328;

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method4801(int arg0) {
      try {
         ++field9319;
         if (class387.field5642 == null) {
            return false;
         } else {
            if (~class387.field5642.field4159 <= -2001) {
               class387.field5642.field4159 -= 2000;
            }

            return (short)arg0 == class387.field5642.field4159;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9330[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4802(boolean arg0) {
      if (arg0) {
         class324.field4826 = class506.field7196;
         class225.field3197 = class634.field8989;
      } else {
         class324.field4826 = class211.field3016;
         class225.field3197 = class558.field7922;
      }

      class522.field7337 = class324.field4826.length;
   }

   @OriginalMember(
      owner = "client!ip",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIIII)V"
   )
   public class662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      try {
         this.field9313 = new int[4];
         this.field9325 = (byte)arg1;
         this.field9323 = new int[4];
         this.field9324 = (byte)arg0;
         this.field9310 = new int[4];
         this.field9323[2] = arg4;
         this.field9323[1] = arg3;
         this.field9323[0] = arg2;
         this.field9323[3] = arg5;
         this.field9313[0] = arg6;
         this.field9313[3] = arg9;
         this.field9313[1] = arg7;
         this.field9313[2] = arg8;
         this.field9310[2] = arg12;
         this.field9310[1] = arg11;
         this.field9310[0] = arg10;
         this.field9312 = (short)(arg2 >> class313.field4707);
         this.field9310[3] = arg13;
         this.field9318 = (short)(arg4 >> class313.field4707);
         this.field9315 = (short)(arg10 >> class313.field4707);
         this.field9320 = (short)(arg12 >> class313.field4707);
         this.field9316 = new short[4];
         this.field9317 = new short[4];
         this.field9314 = new short[4];
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field9330[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4803(int arg0) {
      try {
         field9322 = null;
         if (arg0 != 4) {
            field9321 = null;
         }

         field9328 = null;
         field9321 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9330[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4804(int arg0, byte arg1, int arg2) {
      try {
         ++field9311;
         if (arg1 >= -47) {
            return false;
         } else {
            return (65536 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9330[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4805(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ip",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4806(char[] arg0) {
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
            var10005 = 66;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
