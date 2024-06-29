import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class627 {
   @OriginalMember(
      owner = "client!kfa",
      name = "m",
      descriptor = "[F"
   )
   private float[] field9111 = new float[16];
   @OriginalMember(
      owner = "client!kfa",
      name = "o",
      descriptor = "Leja;"
   )
   private class764 field9105 = new class764(786336);
   @OriginalMember(
      owner = "client!kfa",
      name = "t",
      descriptor = "I"
   )
   private int field9113 = class788.method5654(29990, 1600);
   @OriginalMember(
      owner = "client!kfa",
      name = "q",
      descriptor = "[I"
   )
   private int[] field9119 = new int[1600];
   @OriginalMember(
      owner = "client!kfa",
      name = "i",
      descriptor = "[[Lid;"
   )
   private class611[][] field9118 = new class611[64][768];
   @OriginalMember(
      owner = "client!kfa",
      name = "c",
      descriptor = "[[Lid;"
   )
   private class611[][] field9122 = new class611[1600][64];
   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "I"
   )
   private int field9120 = 0;
   @OriginalMember(
      owner = "client!kfa",
      name = "h",
      descriptor = "[I"
   )
   private int[] field9123 = new int[64];
   @OriginalMember(
      owner = "client!kfa",
      name = "j",
      descriptor = "[I"
   )
   private int[] field9121 = new int[8191];
   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9124 = new String[]{method4526(method4525("Tx\u0011q")), method4526(method4525("A#S3*")), method4526(method4525("Qk\u001c3\u0014\u0012")), method4526(method4525("Qk\u001c3\u0012\u0012")), method4526(method4525("Qk\u001c3\u0011\u0012")), method4526(method4525("Qk\u001c3\u0010\u0012")), method4526(method4525("Qk\u001c3\u0015\u0012")), method4526(method4525("Qk\u001c3\u0016\u0012")), method4526(method4525("Qk\u001c3\u0013\u0012"))};
   @OriginalMember(
      owner = "client!kfa",
      name = "p",
      descriptor = "I"
   )
   public static int field9106 = 0;
   @OriginalMember(
      owner = "client!kfa",
      name = "s",
      descriptor = "I"
   )
   public static int field9103;
   @OriginalMember(
      owner = "client!kfa",
      name = "b",
      descriptor = "I"
   )
   public static int field9104;
   @OriginalMember(
      owner = "client!kfa",
      name = "e",
      descriptor = "I"
   )
   public static int field9107;
   @OriginalMember(
      owner = "client!kfa",
      name = "l",
      descriptor = "I"
   )
   public static int field9108;
   @OriginalMember(
      owner = "client!kfa",
      name = "g",
      descriptor = "I"
   )
   public static int field9109;
   @OriginalMember(
      owner = "client!kfa",
      name = "r",
      descriptor = "I"
   )
   public static int field9110;
   @OriginalMember(
      owner = "client!kfa",
      name = "d",
      descriptor = "I"
   )
   public static int field9112;
   @OriginalMember(
      owner = "client!kfa",
      name = "k",
      descriptor = "Lrr;"
   )
   private class380 field9114;
   @OriginalMember(
      owner = "client!kfa",
      name = "u",
      descriptor = "Lrr;"
   )
   private class380 field9115;
   @OriginalMember(
      owner = "client!kfa",
      name = "f",
      descriptor = "Lrr;"
   )
   private class380 field9117;
   @OriginalMember(
      owner = "client!kfa",
      name = "n",
      descriptor = "Lgka;"
   )
   private class390 field9116;

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(ILck;)V",
      line = 5
   )
   public final void method4518(int arg0, class667 arg1) {
      try {
         this.field9116 = arg1.method4808(24, (byte)-99, 196584, true, (byte[])null);
         ++field9104;
         if (arg0 != -449958824) {
            this.field9114 = null;
         }

         this.field9114 = new class380(this.field9116, 5126, 2, 0);
         this.field9115 = new class380(this.field9116, 5126, 3, 8);
         this.field9117 = new class380(this.field9116, 5121, 4, 20);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9124[3] + arg0 + ',' + (arg1 != null ? field9124[1] : field9124[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V",
      line = 22
   )
   public static final void method4519(String arg0, byte arg1) {
      try {
         int var2 = 23 / ((arg1 - 67) / 44);
         System.exit(1);
         ++field9110;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9124[2] + (arg0 != null ? field9124[1] : field9124[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(Lck;II)V",
      line = 43
   )
   private final void method4520(class667 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(ILck;I)V",
      line = 397
   )
   private final void method4521(int arg0, class667 arg1, int arg2) {
      try {
         class165.field2077 = arg1.field10009;
         if (arg2 == -8088) {
            ++field9103;
            arg1.method4800((float)arg0, -4);
            arg1.method4787((byte)-116);
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            arg1.method4811(-32, false);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9124[5] + arg0 + ',' + (arg1 != null ? field9124[1] : field9124[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "b",
      descriptor = "(Lck;Z)V",
      line = 414
   )
   private final void method4522(class667 arg0, boolean arg1) {
      try {
         ++field9108;
         arg0.method4811(-32, arg1);
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
         if (class165.field2077 != arg0.field10009) {
            arg0.method654(class165.field2077);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9124[6] + (arg0 != null ? field9124[1] : field9124[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(Lck;BILoda;)V",
      line = 434
   )
   public final void method4523(class667 param1, byte param2, int param3, class127 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(Lck;Z)V",
      line = 603
   )
   private final void method4524(class667 arg0, boolean arg1) {
      try {
         ++field9109;
         class165.field2077 = arg0.field10009;
         if (!arg1) {
            this.method4523((class667)null, (byte)44, 32, (class127)null);
         }

         arg0.method4820(false);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg0.method4811(-32, false);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9124[7] + (arg0 != null ? field9124[1] : field9124[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4525(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4526(char[] arg0) {
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
            var10005 = 13;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
