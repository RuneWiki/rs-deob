import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class766 extends class730 {
   @OriginalMember(
      owner = "client!ns",
      name = "w",
      descriptor = "I"
   )
   private int field11317;
   @OriginalMember(
      owner = "client!ns",
      name = "A",
      descriptor = "I"
   )
   private int field11312;
   @OriginalMember(
      owner = "client!ns",
      name = "q",
      descriptor = "I"
   )
   private int field11316;
   @OriginalMember(
      owner = "client!ns",
      name = "m",
      descriptor = "I"
   )
   private int field11307;
   @OriginalMember(
      owner = "client!ns",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11321 = new String[]{method5602(method5601("g,MaF")), method5602(method5601("g,McF")), method5602(method5601("g,M\u001e\u0007g6\u0017\u001cF")), method5602(method5601("g*\u000fN")), method5602(method5601("g,MgF")), method5602(method5601("rqM\f\u0013")), method5602(method5601("g,MfF")), method5602(method5601("g,M`F")), method5602(method5601("g,MkF"))};
   @OriginalMember(
      owner = "client!ns",
      name = "n",
      descriptor = "[F"
   )
   public static float[] field11311 = new float[2];
   @OriginalMember(
      owner = "client!ns",
      name = "y",
      descriptor = "Ljl;"
   )
   public static class133 field11310 = new class133();
   @OriginalMember(
      owner = "client!ns",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field11318 = false;
   @OriginalMember(
      owner = "client!ns",
      name = "s",
      descriptor = "I"
   )
   public static int field11320 = -1;
   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "F"
   )
   public static float field11309;
   @OriginalMember(
      owner = "client!ns",
      name = "v",
      descriptor = "I"
   )
   public static int field11306;
   @OriginalMember(
      owner = "client!ns",
      name = "p",
      descriptor = "I"
   )
   public static int field11308;
   @OriginalMember(
      owner = "client!ns",
      name = "t",
      descriptor = "I"
   )
   public static int field11313;
   @OriginalMember(
      owner = "client!ns",
      name = "r",
      descriptor = "I"
   )
   public static int field11314;
   @OriginalMember(
      owner = "client!ns",
      name = "o",
      descriptor = "I"
   )
   public static int field11315;
   @OriginalMember(
      owner = "client!ns",
      name = "x",
      descriptor = "I"
   )
   public static int field11319;

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method2081(boolean arg0, int arg1, int arg2) {
      try {
         ++field11314;
         if (!arg0) {
            this.method2080(-74, -18, 31);
         }

         int var4 = this.field11316 * arg2 >> 12;
         int var5 = this.field11317 * arg2 >> 12;
         int var6 = this.field11312 * arg1 >> 12;
         int var7 = this.field11307 * arg1 >> 12;
         class179.method1626(var6, var4, var5, super.field10892, var7, 0);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11321[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5598(int arg0) {
      try {
         int var1 = 69 / ((63 - arg0) / 43);
         field11311 = null;
         field11310 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11321[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2080(int arg0, int arg1, int arg2) {
      try {
         ++field11315;
         int var4 = this.field11316 * arg1 >> 12;
         if (arg2 != 19856) {
            field11320 = 112;
         }

         int var5 = this.field11317 * arg1 >> 12;
         int var6 = this.field11312 * arg0 >> 12;
         int var7 = this.field11307 * arg0 >> 12;
         class423.method3357(super.field10896, arg2 + -19980, super.field10899, var7, var4, var6, super.field10892, var5);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11321[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method2083(int arg0, int arg1, int arg2) {
      try {
         ++field11306;
         int var4 = this.field11316 * arg2 >> 12;
         int var5 = this.field11317 * arg2 >> 12;
         int var6 = this.field11312 * arg0 >> 12;
         int var7 = 16 % ((-13 - arg1) / 40);
         int var8 = this.field11307 * arg0 >> 12;
         class464.method3605(super.field10899, super.field10896, -5462, var4, var6, var5, var8);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field11321[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method5599(byte arg0) {
      try {
         ++field11313;
         if (class303.method2535(class342.field5204, -105)) {
            class321.method2638(arg0 ^ -47, false);
         } else {
            class346.field5308 = class510.field7801.field355;
            class510.field7801.field355 = null;
            if (arg0 == -45) {
               class69.method532(1, 14);
            }
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11321[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(Ljava/lang/String;ZBLjava/lang/String;Z)V"
   )
   public static final void method5600(String arg0, boolean arg1, byte arg2, String arg3, boolean arg4) {
      try {
         class671.field10005 = arg4;
         ++field11308;
         class455.field6963 = arg3;
         class722.field10813 = arg0;
         if (!arg1) {
            class727.field10854 = -1;
         }

         class361.field5596 = arg1;
         if (class361.field5596 || !class722.field10813.equals("") && !class455.field6963.equals("")) {
            if (class12.field156 != 1) {
               class492.field7434 = 0;
               class705.field10621 = -1;
               class115.field1560 = -1;
            }

            class37.field448.field365 = false;
            class56.method418(-3, (byte)95);
            class519.field7897 = 1;
            int var5 = -113 / ((-37 - arg2) / 51);
            class742.field11030 = 0;
            class768.field11331 = 0;
         } else {
            class56.method418(3, (byte)101);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11321[4] + (arg0 != null ? field11321[5] : field11321[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11321[5] : field11321[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field11317 = arg2;
         this.field11312 = arg1;
         this.field11316 = arg0;
         this.field11307 = arg3;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11321[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5601(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5602(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
