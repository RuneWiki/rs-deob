import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class722 extends class733 {
   @OriginalMember(
      owner = "client!ev",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10550 = new String[]{method5253(method5252("$U%{C")), method5253(method5252("$U%zC")), method5253(method5252("/VgS")), method5253(method5252(":\r%\u0011\u0016")), method5253(method5252("$U%|C")), method5253(method5252("$U%~C")), method5253(method5252("$U%}C"))};
   @OriginalMember(
      owner = "client!ev",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field10543 = false;
   @OriginalMember(
      owner = "client!ev",
      name = "K",
      descriptor = "I"
   )
   public static int field10544 = -2;
   @OriginalMember(
      owner = "client!ev",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field10548 = new int[4];
   @OriginalMember(
      owner = "client!ev",
      name = "I",
      descriptor = "I"
   )
   public static int field10542;
   @OriginalMember(
      owner = "client!ev",
      name = "E",
      descriptor = "I"
   )
   public static int field10545;
   @OriginalMember(
      owner = "client!ev",
      name = "H",
      descriptor = "I"
   )
   public static int field10546;
   @OriginalMember(
      owner = "client!ev",
      name = "L",
      descriptor = "I"
   )
   public static int field10547;
   @OriginalMember(
      owner = "client!ev",
      name = "J",
      descriptor = "[B"
   )
   private byte[] field10549;

   @OriginalMember(
      owner = "client!ev",
      name = "<init>",
      descriptor = "()V",
      line = 6
   )
   public class722() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(IIII)[B",
      line = 9
   )
   public final byte[] method5248(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 != -4097) {
            method5249((byte)-70);
         }

         this.field10549 = new byte[arg3 * 2 * arg1 * arg2];
         ++field10545;
         this.method2389(arg2, (byte)-115, arg3, arg1);
         return this.field10549;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10550[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(B)V",
      line = 25
   )
   public static void method5249(byte arg0) {
      try {
         field10548 = null;
         int var1 = -85 % ((44 - arg0) / 55);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10550[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(CI)Z",
      line = 36
   )
   public static final boolean method5250(char arg0, int arg1) {
      try {
         ++field10546;
         if (arg1 > -8) {
            field10543 = true;
         }

         return arg0 >= 'A' && ~arg0 >= -91 || ~arg0 <= -98 && arg0 <= 'z';
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10550[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(ILha;Lbl;)V",
      line = 48
   )
   public static final void method5251(int arg0, class66 arg1, class678 arg2) {
      try {
         if (arg0 == -28298) {
            ++field10547;
            boolean var3 = class468.field6728.method2258(arg2.field9873, arg2.field9866, -1, arg2.field9928, arg2.field9912, arg2.field9858 | -16777216, !arg2.field9908 ? null : class564.field8045.field1571, arg1) == null;
            if (var3) {
               class391.field5673.method2930((byte)-46, new class243(arg2.field9912, arg2.field9928, arg2.field9866, -16777216 | arg2.field9858, arg2.field9873, arg2.field9908));
               class743.method5384(arg2, (byte)-17);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10550[1] + arg0 + ',' + (arg1 != null ? field10550[3] : field10550[2]) + ',' + (arg2 != null ? field10550[3] : field10550[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "a",
      descriptor = "(BBI)V",
      line = 77
   )
   public final void method397(byte arg0, byte arg1, int arg2) {
      try {
         if (arg0 < 5) {
            field10543 = true;
         }

         ++field10542;
         byte var7 = (byte)(((arg1 & 255) >> 1) + 127);
         int var4 = arg2 * 2;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field10549[var10001] = var7;
         this.field10549[var8] = var7;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10550[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5252(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ev",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5253(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
