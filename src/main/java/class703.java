import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class703 extends class757 {
   @OriginalMember(
      owner = "client!kaa",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10286 = new String[]{method5113(method5112("OO.\u001d>\f")), method5113(method5112("OO.\u001d0\f")), method5113(method5112("OO.\u001d;\f")), method5113(method5112("OO.\u001d3\f")), method5113(method5112("OO.\u001d<\f")), method5113(method5112("OO.\u001d9\f")), method5113(method5112("_\u0000a\u001d\u0007")), method5113(method5112("J[#_"))};
   @OriginalMember(
      owner = "client!kaa",
      name = "v",
      descriptor = "I"
   )
   public static int field10282 = 0;
   @OriginalMember(
      owner = "client!kaa",
      name = "E",
      descriptor = "I"
   )
   public static int field10273;
   @OriginalMember(
      owner = "client!kaa",
      name = "q",
      descriptor = "I"
   )
   public static int field10274;
   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "I"
   )
   public static int field10278;
   @OriginalMember(
      owner = "client!kaa",
      name = "A",
      descriptor = "I"
   )
   public static int field10279;
   @OriginalMember(
      owner = "client!kaa",
      name = "s",
      descriptor = "I"
   )
   public static int field10280;
   @OriginalMember(
      owner = "client!kaa",
      name = "C",
      descriptor = "I"
   )
   public static int field10283;
   @OriginalMember(
      owner = "client!kaa",
      name = "y",
      descriptor = "I"
   )
   public static int field10284;
   @OriginalMember(
      owner = "client!kaa",
      name = "r",
      descriptor = "I"
   )
   public static int field10285;
   @OriginalMember(
      owner = "client!kaa",
      name = "t",
      descriptor = "Lpd;"
   )
   private class648 field10271;
   @OriginalMember(
      owner = "client!kaa",
      name = "D",
      descriptor = "Lpd;"
   )
   private class648 field10272;
   @OriginalMember(
      owner = "client!kaa",
      name = "x",
      descriptor = "Lpd;"
   )
   private class648 field10275;
   @OriginalMember(
      owner = "client!kaa",
      name = "u",
      descriptor = "Lpd;"
   )
   private class648 field10276;
   @OriginalMember(
      owner = "client!kaa",
      name = "B",
      descriptor = "Lpd;"
   )
   public class648 field10277;
   @OriginalMember(
      owner = "client!kaa",
      name = "w",
      descriptor = "Lpd;"
   )
   private class648 field10281;

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public final void method3508(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg3 != 1) {
            method5111((byte)98, (long[])null, (int[])null);
         }

         if (arg2) {
            int[] var5 = new int[4];
            class629.field9294.method417(var5);
            class629.field9294.method460(arg1, arg0, super.field11086.field2853 + arg1, super.field11086.field2850 + arg0);
            int var6 = this.field10281.method2406();
            int var7 = this.field10281.method2396();
            int var8 = this.field10271.method2406();
            int var9 = this.field10271.method2396();
            this.field10281.method4760(arg1, (-var7 + super.field11086.field2850) / 2 + arg0);
            this.field10271.method4760(super.field11086.field2853 + arg1 + -var8, arg0 - -((-var9 + super.field11086.field2850) / 2));
            class629.field9294.method460(arg1, arg0, arg1 - -super.field11086.field2853, this.field10272.method2396() + arg0);
            this.field10272.method4762(arg1 - -var6, arg0, -var8 + super.field11086.field2853 - var6, super.field11086.field2850);
            int var10 = this.field10275.method2396();
            class629.field9294.method460(arg1, arg0 - -super.field11086.field2850 + -var10, super.field11086.field2853 + arg1, super.field11086.field2850 + arg0);
            this.field10275.method4762(arg1 - -var6, super.field11086.field2850 + arg0 + -var10, -var6 + -var8 + super.field11086.field2853, super.field11086.field2850);
            class629.field9294.method460(var5[0], var5[1], var5[2], var5[3]);
         }

         ++field10278;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field10286[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method223(int arg0) {
      try {
         super.method223(arg0);
         ++field10285;
         class773 var2 = (class773)super.field11086;
         this.field10277 = class13.method110(super.field11092, var2.field11264, arg0 ^ -28879);
         this.field10276 = class13.method110(super.field11092, var2.field11259, arg0 + 28977);
         this.field10281 = class13.method110(super.field11092, var2.field11266, arg0 ^ -28879);
         this.field10271 = class13.method110(super.field11092, var2.field11260, 255);
         this.field10272 = class13.method110(super.field11092, var2.field11263, 255);
         this.field10275 = class13.method110(super.field11092, var2.field11267, 255);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10286[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(B[J[I)V"
   )
   public static final void method5111(byte arg0, long[] arg1, int[] arg2) {
      try {
         class395.method3115(1, arg2, 0, arg1.length + -1, arg1);
         if (arg0 >= -20) {
            field10282 = -11;
         }

         ++field10283;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10286[5] + arg0 + ',' + (arg1 != null ? field10286[6] : field10286[7]) + ',' + (arg2 != null ? field10286[6] : field10286[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public void method2811(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         if (arg3 <= 126) {
            this.method221(-92);
         }

         this.field10277.method4762(arg1, arg4, arg2, arg0);
         ++field10280;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10286[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(ZBII)V"
   )
   public final void method3506(boolean arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field10279;
         int var5 = arg3 + this.field10281.method2406();
         int var6 = arg3 + (super.field11086.field2853 - this.field10271.method2406());
         int var7 = arg2 + this.field10272.method2396();
         int var8 = arg2 - (-super.field11086.field2850 - -this.field10275.method2396());
         int var9 = -var5 + var6;
         int var10 = -var7 + var8;
         int var11 = var9 * this.method5479(arg1 ^ 121) / 10000;
         int[] var12 = new int[4];
         if (arg1 != 62) {
            this.method2811(-30, -59, 112, (byte)-29, 58);
         }

         class629.field9294.method417(var12);
         class629.field9294.method460(var5, var7, var5 - -var11, var8);
         this.method2811(var10, var5, var9, (byte)127, var7);
         class629.field9294.method460(var5 + var11, var7, var6, var8);
         this.field10276.method4762(var5, var7, var9, var10);
         class629.field9294.method460(var12[0], var12[1], var12[2], var12[3]);
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field10286[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "<init>",
      descriptor = "(Lww;Lww;Ljg;)V"
   )
   public class703(class339 arg0, class339 arg1, class773 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method221(int arg0) {
      try {
         ++field10284;
         if (!super.method221(arg0)) {
            return false;
         } else {
            class773 var2 = (class773)super.field11086;
            if (!super.field11092.method2681((byte)102, var2.field11264)) {
               return false;
            } else if (!super.field11092.method2681((byte)119, var2.field11259)) {
               return false;
            } else if (!super.field11092.method2681((byte)60, var2.field11266)) {
               return false;
            } else if (!super.field11092.method2681((byte)81, var2.field11260)) {
               return false;
            } else if (!super.field11092.method2681((byte)80, var2.field11263)) {
               return false;
            } else {
               return super.field11092.method2681((byte)120, var2.field11267);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10286[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5112(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5113(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
