import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class781 extends class335 {
   @OriginalMember(
      owner = "client!hda",
      name = "n",
      descriptor = "I"
   )
   private int field11399;
   @OriginalMember(
      owner = "client!hda",
      name = "j",
      descriptor = "I"
   )
   private int field11402;
   @OriginalMember(
      owner = "client!hda",
      name = "k",
      descriptor = "I"
   )
   private int field11396;
   @OriginalMember(
      owner = "client!hda",
      name = "l",
      descriptor = "I"
   )
   private int field11394;
   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11404 = new String[]{method5621(method5620("ADtmo\u0001")), method5621(method5620("ADtmj\u0001")), method5621(method5620("ADtmk\u0001")), method5621(method5620("ADtm\u0012@N|7\u0010\u0001")), method5621(method5620("ADtml\u0001")), method5621(method5620("ADtmm\u0001"))};
   @OriginalMember(
      owner = "client!hda",
      name = "m",
      descriptor = "Ldw;"
   )
   public static class748 field11392 = new class748(8);
   @OriginalMember(
      owner = "client!hda",
      name = "o",
      descriptor = "I"
   )
   public static int field11398 = 0;
   @OriginalMember(
      owner = "client!hda",
      name = "p",
      descriptor = "Lwm;"
   )
   public static class590 field11403 = new class590();
   @OriginalMember(
      owner = "client!hda",
      name = "s",
      descriptor = "I"
   )
   public static int field11393;
   @OriginalMember(
      owner = "client!hda",
      name = "t",
      descriptor = "I"
   )
   public static int field11395;
   @OriginalMember(
      owner = "client!hda",
      name = "r",
      descriptor = "I"
   )
   public static int field11397;
   @OriginalMember(
      owner = "client!hda",
      name = "i",
      descriptor = "I"
   )
   public static int field11400;
   @OriginalMember(
      owner = "client!hda",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field11401;

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2540(byte arg0, int arg1, int arg2) {
      try {
         ++field11395;
         int var4 = this.field11399 * arg2 >> 12;
         int var5 = this.field11402 * arg2 >> 12;
         int var6 = this.field11396 * arg1 >> 12;
         if (arg0 <= 71) {
            this.field11396 = 60;
         }

         int var7 = this.field11394 * arg1 >> 12;
         class40.method274(var7, var6, var5, super.field4791, var4, -19594, super.field4789);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11404[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method5618(int arg0) {
      try {
         ++field11397;
         int var1 = -68 % ((arg0 - 48) / 48);
         class290.field4059.method4062(0);
         class506.field7477 = 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11404[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2541(int arg0, int arg1, int arg2) {
      try {
         ++field11393;
         int var4 = this.field11399 * arg0 >> 12;
         int var5 = this.field11402 * arg0 >> 12;
         int var6 = this.field11396 * arg2 >> 12;
         int var7 = this.field11394 * arg2 >> 12;
         class571.method4233(super.field4789, super.field4791, var7, var5, super.field4793, var4, -128, var6);
         if (arg1 != 0) {
            field11392 = null;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11404[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5619(int arg0) {
      try {
         field11401 = null;
         if (arg0 != 2) {
            method5619(13);
         }

         field11392 = null;
         field11403 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11404[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method2537(int arg0, byte arg1, int arg2) {
      try {
         ++field11400;
         int var4 = this.field11399 * arg2 >> 12;
         int var5 = this.field11402 * arg2 >> 12;
         if (arg1 < 84) {
            this.field11396 = -87;
         }

         int var6 = this.field11396 * arg0 >> 12;
         int var7 = this.field11394 * arg0 >> 12;
         class751.method5472(false, var7, var5, var6, var4, super.field4793);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11404[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field11399 = arg0;
         this.field11402 = arg2;
         this.field11396 = arg1;
         this.field11394 = arg3;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11404[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5620(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5621(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
