import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class609 implements class334 {
   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "[F"
   )
   public float[] field8672;
   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "I"
   )
   public int field8671;
   @OriginalMember(
      owner = "client!ji",
      name = "i",
      descriptor = "I"
   )
   public int field8673;
   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8679 = new String[]{method4490(method4489("$\rU\u000e|")), method4490(method4489("1V\u0017L")), method4490(method4489("5JUb)")), method4490(method4489("5JUc)")), method4490(method4489("5JUd)")), method4490(method4489("5JUa)")), method4490(method4489("5JU\u001ch1J\u000f\u001e)"))};
   @OriginalMember(
      owner = "client!ji",
      name = "c",
      descriptor = "Ljm;"
   )
   public static class483 field8675 = new class483(0);
   @OriginalMember(
      owner = "client!ji",
      name = "h",
      descriptor = "Ljava/lang/Object;"
   )
   public static volatile Object field8677 = null;
   @OriginalMember(
      owner = "client!ji",
      name = "d",
      descriptor = "F"
   )
   public static float field8676;
   @OriginalMember(
      owner = "client!ji",
      name = "f",
      descriptor = "I"
   )
   public static int field8670;
   @OriginalMember(
      owner = "client!ji",
      name = "e",
      descriptor = "I"
   )
   public static int field8674;
   @OriginalMember(
      owner = "client!ji",
      name = "g",
      descriptor = "I"
   )
   public static int field8678;

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4485(byte arg0) {
      try {
         if (arg0 < 22) {
            method4485((byte)-116);
         }

         field8677 = null;
         field8675 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8679[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "([S[Ljava/lang/String;Z)V"
   )
   public static final void method4486(short[] arg0, String[] arg1, boolean arg2) {
      try {
         class202.method1755(-1, 0, arg1, arg1.length + -1, arg0);
         ++field8674;
         if (!arg2) {
            method4488(34, -12, -46, 115);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8679[2] + (arg0 != null ? field8679[0] : field8679[1]) + ',' + (arg1 != null ? field8679[0] : field8679[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method4487(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class729.field10384 = arg3;
         int var5 = -23 % ((arg2 - -8) / 58);
         ++field8678;
         class587.field8239 = arg4;
         class604.field8618 = arg0;
         class767.field11011 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8679[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4488(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8670;
         if (arg0 <= 3) {
            method4487(96, -55, -116, 70, 60);
         }

         int var7 = (-16711936 & (arg3 & 16711935) * arg1 | (arg3 & 65280) * arg1 & 16711680) >>> 8;
         int var4 = -arg1 + 255;
         return ((-16711936 & (arg2 & 16711935) * var4 | (65280 & arg2) * var4 & 16711680) >>> 8) + var7;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8679[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class609(int arg0, int arg1) {
      try {
         this.field8672 = new float[arg0 * arg1];
         this.field8671 = arg0;
         this.field8673 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8679[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4489(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4490(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
