import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class635 {
   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9252 = new String[]{method4579(method4578("\boh9")), method4579(method4578("\u001d4*{z")), method4579(method4578("\fs*\u0010/")), method4579(method4578("\fs*\u0011/")), method4579(method4578("\fs*\u0014/")), method4579(method4578("\fs*\u0017/")), method4579(method4578("\fs*\u0016/"))};
   @OriginalMember(
      owner = "client!ji",
      name = "g",
      descriptor = "[F"
   )
   public static float[] field9246 = new float[16];
   @OriginalMember(
      owner = "client!ji",
      name = "c",
      descriptor = "I"
   )
   public int field9243;
   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "I"
   )
   public static int field9244;
   @OriginalMember(
      owner = "client!ji",
      name = "f",
      descriptor = "I"
   )
   public int field9245;
   @OriginalMember(
      owner = "client!ji",
      name = "e",
      descriptor = "I"
   )
   public int field9247;
   @OriginalMember(
      owner = "client!ji",
      name = "i",
      descriptor = "I"
   )
   public static int field9248;
   @OriginalMember(
      owner = "client!ji",
      name = "d",
      descriptor = "I"
   )
   public static int field9249;
   @OriginalMember(
      owner = "client!ji",
      name = "h",
      descriptor = "I"
   )
   public static int field9250;
   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "I"
   )
   public static int field9251;

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(ZI)V",
      line = 4
   )
   public static final void method4573(boolean arg0, int arg1) {
      try {
         ++field9251;
         class276.field3847 = arg1;
         if (!arg0) {
            class466.field6990.method5451(85);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9252[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method4574(int arg0) {
      try {
         if (arg0 == -16711936) {
            field9246 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9252[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIIB)I",
      line = 30
   )
   public static final int method4575(int arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 <= 24) {
            field9250 = -44;
         }

         ++field9244;
         int var4 = -arg1 + 255;
         int var7 = ((arg2 & 16711935) * arg1 & -16711936 | (65280 & arg2) * arg1 & 16711680) >>> 8;
         return ((16711680 & (arg0 & 65280) * var4 | -16711936 & (16711935 & arg0) * var4) >>> 8) - -var7;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9252[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(Ld;BLjava/awt/Canvas;I)Lha;",
      line = 53
   )
   public static final class66 method4576(class160 arg0, byte arg1, Canvas arg2, int arg3) {
      try {
         if (arg1 < 17) {
            method4577(-123, 107, (byte)-69, 99);
         }

         ++field9248;
         return new class667(arg2, arg0, arg3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9252[2] + (arg0 != null ? field9252[1] : field9252[0]) + ',' + arg1 + ',' + (arg2 != null ? field9252[1] : field9252[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIBI)V",
      line = 64
   )
   public static final void method4577(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field9249;
         class284 var4 = class208.field2653[arg1][arg3];
         class634.method4569(arg0, -16624, var4 == null ? class550.field8130 : var4);
         if (arg2 < 103) {
            field9246 = null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9252[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4578(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4579(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
