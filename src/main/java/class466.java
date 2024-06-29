import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class466 extends class792 {
   @OriginalMember(
      owner = "client!ri",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6417 = new String[]{method3549(method3548("qd\u0012.'")), method3549(method3548("qd\u0012&'")), method3549(method3548("qd\u00129'")), method3549(method3548("qd\u0012*'")), method3549(method3548("qd\u0012!'"))};
   @OriginalMember(
      owner = "client!ri",
      name = "K",
      descriptor = "Lse;"
   )
   public static class6 field6408 = new class6(5, 4);
   @OriginalMember(
      owner = "client!ri",
      name = "J",
      descriptor = "J"
   )
   public static long field6415 = -1L;
   @OriginalMember(
      owner = "client!ri",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field6412 = new int[3];
   @OriginalMember(
      owner = "client!ri",
      name = "M",
      descriptor = "Lhv;"
   )
   public static class227 field6411 = new class227(16);
   @OriginalMember(
      owner = "client!ri",
      name = "O",
      descriptor = "I"
   )
   public static int field6409;
   @OriginalMember(
      owner = "client!ri",
      name = "H",
      descriptor = "I"
   )
   public static int field6410;
   @OriginalMember(
      owner = "client!ri",
      name = "C",
      descriptor = "I"
   )
   public static int field6413;
   @OriginalMember(
      owner = "client!ri",
      name = "N",
      descriptor = "I"
   )
   public static int field6414;
   @OriginalMember(
      owner = "client!ri",
      name = "L",
      descriptor = "[B"
   )
   private byte[] field6416;

   @OriginalMember(
      owner = "client!ri",
      name = "<init>",
      descriptor = "()V"
   )
   public class466() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3544(int arg0, int arg1) {
      try {
         ++field6413;
         if (arg1 != 2) {
            field6412 = null;
         }

         if (class5.method44((byte)-29)) {
            if (class428.field5822 != arg0) {
               class368.field5134 = "";
            }

            class428.field5822 = arg0;
            class387.field5363.method4422((byte)-67);
            class577.method4324((byte)-126, 5);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6417[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3545(int arg0) {
      try {
         field6408 = null;
         if (arg0 == -1) {
            field6412 = null;
            field6411 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6417[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "b",
      descriptor = "(IIBI)[B"
   )
   public final byte[] method3546(int arg0, int arg1, byte arg2, int arg3) {
      try {
         this.field6416 = new byte[arg0 * arg1 * arg3 * 2];
         ++field6414;
         this.method3281(arg3, arg0, (byte)-123, arg1);
         if (arg2 != 4) {
            method3547(124, 27, (byte)-2, -97, 100, 25);
         }

         return this.field6416;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6417[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(IIBIII)V"
   )
   public static final void method3547(int param0, int param1, byte param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method3298(byte arg0, int arg1, int arg2) {
      try {
         ++field6410;
         byte var7 = (byte)((127 & arg0 >> 1) + 127);
         int var4 = arg2 * 2;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field6416[var10001] = var7;
         if (arg1 != -7499) {
            field6408 = null;
         }

         this.field6416[var8] = var7;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6417[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3548(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3549(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
