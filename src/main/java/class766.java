import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class766 {
   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "[F"
   )
   private float[] field11108 = new float[16];
   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "Lhha;"
   )
   private class543 field11100 = new class543(786336);
   @OriginalMember(
      owner = "client!ql",
      name = "i",
      descriptor = "I"
   )
   private int field11109 = class752.method5444(-59, 1600);
   @OriginalMember(
      owner = "client!ql",
      name = "s",
      descriptor = "[I"
   )
   private int[] field11115 = new int[64];
   @OriginalMember(
      owner = "client!ql",
      name = "t",
      descriptor = "[I"
   )
   private int[] field11117 = new int[1600];
   @OriginalMember(
      owner = "client!ql",
      name = "p",
      descriptor = "[I"
   )
   private int[] field11116 = new int[8191];
   @OriginalMember(
      owner = "client!ql",
      name = "l",
      descriptor = "I"
   )
   private int field11119 = 0;
   @OriginalMember(
      owner = "client!ql",
      name = "c",
      descriptor = "[[Lfia;"
   )
   private class599[][] field11118 = new class599[1600][64];
   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "[[Lfia;"
   )
   private class599[][] field11120 = new class599[64][768];
   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11121 = new String[]{method5545(method5544("1(>\u001cJ")), method5545(method5544("$s|^")), method5545(method5544(";j>t\u001f")), method5545(method5544(";j>u\u001f")), method5545(method5544(";j>q\u001f")), method5545(method5544(";j>s\u001f")), method5545(method5544(";j>p\u001f")), method5545(method5544(";j>v\u001f")), method5545(method5544(";j>w\u001f"))};
   @OriginalMember(
      owner = "client!ql",
      name = "j",
      descriptor = "I"
   )
   public static int field11101;
   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "I"
   )
   public static int field11102;
   @OriginalMember(
      owner = "client!ql",
      name = "u",
      descriptor = "I"
   )
   public static int field11103;
   @OriginalMember(
      owner = "client!ql",
      name = "f",
      descriptor = "I"
   )
   public static int field11104;
   @OriginalMember(
      owner = "client!ql",
      name = "h",
      descriptor = "I"
   )
   public static int field11106;
   @OriginalMember(
      owner = "client!ql",
      name = "n",
      descriptor = "I"
   )
   public static int field11107;
   @OriginalMember(
      owner = "client!ql",
      name = "g",
      descriptor = "I"
   )
   public static int field11110;
   @OriginalMember(
      owner = "client!ql",
      name = "m",
      descriptor = "J"
   )
   public static long field11105;
   @OriginalMember(
      owner = "client!ql",
      name = "r",
      descriptor = "Ljia;"
   )
   private class642 field11111;
   @OriginalMember(
      owner = "client!ql",
      name = "q",
      descriptor = "Ljia;"
   )
   private class642 field11112;
   @OriginalMember(
      owner = "client!ql",
      name = "k",
      descriptor = "Ljia;"
   )
   private class642 field11114;
   @OriginalMember(
      owner = "client!ql",
      name = "o",
      descriptor = "Lpv;"
   )
   private class77 field11113;

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(Lrk;I)V"
   )
   private final void method5537(class35 arg0, int arg1) {
      try {
         if (arg1 >= 19) {
            arg0.method440((byte)-37, true);
            ++field11102;
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            if (class232.field3399 != arg0.field862) {
               arg0.method297(class232.field3399);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11121[4] + (arg0 != null ? field11121[0] : field11121[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(ZLrk;)V"
   )
   public final void method5538(boolean arg0, class35 arg1) {
      try {
         if (arg0) {
            this.field11109 = 2;
         }

         this.field11113 = arg1.method285(true, 196584, (byte[])null, 24, -19795);
         ++field11104;
         this.field11111 = new class642(this.field11113, 5126, 2, 0);
         this.field11112 = new class642(this.field11113, 5126, 3, 8);
         this.field11114 = new class642(this.field11113, 5121, 4, 20);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11121[5] + arg0 + ',' + (arg1 != null ? field11121[0] : field11121[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(BLrk;)V"
   )
   private final void method5539(byte arg0, class35 arg1) {
      try {
         ++field11103;
         if (arg0 != 110) {
            this.method5540(-16, (class35)null, (class713)null, (byte)-29);
         }

         class232.field3399 = arg1.field862;
         arg1.method370(117);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg1.method440((byte)-45, false);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11121[3] + arg0 + ',' + (arg1 != null ? field11121[0] : field11121[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(ILrk;Lvm;B)V"
   )
   public final void method5540(int param1, class35 param2, class713 param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(Lrk;ZI)V"
   )
   private final void method5541(class35 arg0, boolean arg1, int arg2) {
      try {
         class232.field3399 = arg0.field862;
         ++field11106;
         arg0.method362((float)arg2, -1);
         arg0.method305(1);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg0.method440((byte)122, arg1);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11121[2] + (arg0 != null ? field11121[0] : field11121[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5542(int arg0) {
      try {
         if (arg0 == -14818) {
            ++field11101;
            class769.field11205.method1591((byte)58);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11121[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(Lrk;II)V"
   )
   private final void method5543(class35 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5544(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5545(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
