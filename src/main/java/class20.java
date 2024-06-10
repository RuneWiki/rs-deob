import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!i")
public class class20 {
   @OriginalMember(
      owner = "loginapplet!i",
      name = "a",
      descriptor = "I"
   )
   public static int field139;
   @OriginalMember(
      owner = "loginapplet!i",
      name = "b",
      descriptor = "Laa;"
   )
   public static class2 field140;
   @OriginalMember(
      owner = "loginapplet!i",
      name = "c",
      descriptor = "Laa;"
   )
   public static class2 field141;
   @OriginalMember(
      owner = "loginapplet!i",
      name = "d",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field142 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @OriginalMember(
      owner = "loginapplet!i",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field143 = false;
   @OriginalMember(
      owner = "loginapplet!i",
      name = "f",
      descriptor = "I"
   )
   public static int field144;
   @OriginalMember(
      owner = "loginapplet!i",
      name = "g",
      descriptor = "Lsa;"
   )
   public static class41 field145 = class8.method31(61, "null");

   @OriginalMember(
      owner = "loginapplet!i",
      name = "a",
      descriptor = "(FFZFF)F",
      line = 29
   )
   public static final float method95(float arg0, float arg1, boolean arg2, float arg3, float arg4) {
      try {
         return arg2 ? 1.2320719F : arg3 * arg0 + arg1 * arg4;
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "i.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!i",
      name = "a",
      descriptor = "(II)I",
      line = 57
   )
   public static final int method96(int arg0, int arg1) {
      try {
         return arg1 >= -88 ? -85 : 0;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "i.A(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!i",
      name = "a",
      descriptor = "(B)V",
      line = 80
   )
   public static void method97(byte arg0) {
      try {
         field141 = null;
         int var1 = -7 % ((19 - arg0) / 58);
         field145 = null;
         field140 = null;
         field142 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "i.C(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!i",
      name = "a",
      descriptor = "([BIII)I",
      line = 95
   )
   public static final int method98(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         int var4 = -1;
         if (arg1 <= 54) {
            method97((byte)-104);
         }

         for(int var5 = arg3; arg2 > var5; ++var5) {
            var4 = class32.field204[255 & (var4 ^ arg0[var5])] ^ var4 >>> -1466097048;
         }

         return ~var4;
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "i.B(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }
}
