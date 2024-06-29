import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class263 implements class250 {
   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4027 = new String[]{method2257(method2256("naN$h")), method2257(method2256("s-NK=")), method2257(method2256("{:\ff")), method2257(method2256("s-NI=")), method2257(method2256("s-NO=")), method2257(method2256("V.\u0002htr*")), method2257(method2256("s-NH="))};
   @OriginalMember(
      owner = "client!fb",
      name = "k",
      descriptor = "Lfm;"
   )
   public static class164 field4024 = new class164(77, 8);
   @OriginalMember(
      owner = "client!fb",
      name = "i",
      descriptor = "Lpl;"
   )
   public static class168 field4025 = new class168();
   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field4026 = new class724(17, -2);
   @OriginalMember(
      owner = "client!fb",
      name = "e",
      descriptor = "I"
   )
   public int field4014;
   @OriginalMember(
      owner = "client!fb",
      name = "m",
      descriptor = "I"
   )
   public static int field4015;
   @OriginalMember(
      owner = "client!fb",
      name = "j",
      descriptor = "I"
   )
   public int field4016;
   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "I"
   )
   public static int field4017;
   @OriginalMember(
      owner = "client!fb",
      name = "d",
      descriptor = "I"
   )
   public static int field4019;
   @OriginalMember(
      owner = "client!fb",
      name = "h",
      descriptor = "I"
   )
   public int field4020;
   @OriginalMember(
      owner = "client!fb",
      name = "f",
      descriptor = "I"
   )
   public int field4021;
   @OriginalMember(
      owner = "client!fb",
      name = "l",
      descriptor = "I"
   )
   public int field4022;
   @OriginalMember(
      owner = "client!fb",
      name = "c",
      descriptor = "I"
   )
   public int field4023;
   @OriginalMember(
      owner = "client!fb",
      name = "g",
      descriptor = "Z"
   )
   public boolean field4018;

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(BLcu;I)Ljava/lang/String;"
   )
   public static final String method2253(byte arg0, class65 arg1, int arg2) {
      try {
         ++field4015;
         if (arg0 != 3) {
            method2255(47, -7, -64, (Class)null);
         }

         try {
            int var3 = arg1.method682(arg0 + -77);
            if (var3 > arg2) {
               var3 = arg2;
            }

            byte[] var4 = new byte[var3];
            arg1.field945 += class779.field11376.method5658(0, (byte)-103, arg1.field942, var3, var4, arg1.field945);
            return class724.method5241(var4, 0, (byte)106, var3);
         } catch (Exception var7) {
            return field4027[5];
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field4027[4] + arg0 + ',' + (arg1 != null ? field4027[0] : field4027[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2254(int arg0) {
      try {
         field4024 = null;
         if (arg0 == 594062152) {
            field4026 = null;
            field4025 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4027[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(BLhh;)Z"
   )
   public final boolean method2158(byte arg0, class250 arg1) {
      try {
         ++field4019;
         if (!(arg1 instanceof class263)) {
            return false;
         } else {
            class263 var3 = (class263)arg1;
            if (this.field4021 != var3.field4021) {
               return false;
            } else if (~this.field4020 != ~var3.field4020) {
               return false;
            } else if (this.field4023 != var3.field4023) {
               return false;
            } else if (this.field4022 != var3.field4022) {
               return false;
            } else if (this.field4016 != var3.field4016) {
               return false;
            } else if (arg0 >= -52) {
               return true;
            } else if (this.field4014 != var3.field4014) {
               return false;
            } else {
               return !var3.field4018 == !this.field4018;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4027[1] + arg0 + ',' + (arg1 != null ? field4027[0] : field4027[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)V"
   )
   public static final void method2255(int arg0, int arg1, int arg2, Class arg3) {
      class312 var4 = class324.field4826[arg0][arg1][arg2];
      if (var4 != null) {
         for(class84 var5 = var4.field4678; var5 != null; var5 = var5.field1305) {
            class578 var6 = var5.field1299;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8154 == arg1 && var6.field8160 == arg2) {
               class748.method5385(var6, false);
               return;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method2159(int arg0) {
      try {
         ++field4017;
         long[] var2 = class575.field8135;
         long var3 = -1L;
         long var5 = var2[(int)((var3 ^ (long)this.field4021) & 255L)] ^ var3 >>> 8;
         long var7 = var5 >>> 8 ^ var2[(int)(255L & ((long)(this.field4020 >> 8) ^ var5))];
         long var9 = var2[(int)(255L & ((long)this.field4020 ^ var7))] ^ var7 >>> 8;
         long var11 = var9 >>> 8 ^ var2[(int)(((long)(this.field4023 >> 24) ^ var9) & 255L)];
         long var13 = var11 >>> 8 ^ var2[(int)((var11 ^ (long)(this.field4023 >> 16)) & 255L)];
         long var15 = var2[(int)(255L & ((long)(this.field4023 >> 8) ^ var13))] ^ var13 >>> 8;
         long var17 = var2[(int)(255L & (var15 ^ (long)this.field4023))] ^ var15 >>> 8;
         long var19 = var2[(int)((var17 ^ (long)this.field4022) & 255L)] ^ var17 >>> 8;
         long var21 = var19 >>> 8 ^ var2[(int)((var19 ^ (long)(this.field4016 >> 24)) & 255L)];
         long var23 = var2[(int)(255L & (var21 ^ (long)(this.field4016 >> 16)))] ^ var21 >>> 8;
         long var25 = var23 >>> 8 ^ var2[(int)((var23 ^ (long)(this.field4016 >> 8)) & 255L)];
         if (arg0 > -5) {
            this.field4018 = true;
         }

         long var27 = var2[(int)(((long)this.field4016 ^ var25) & 255L)] ^ var25 >>> 8;
         long var29 = var27 >>> 8 ^ var2[(int)(255L & (var27 ^ (long)this.field4014))];
         return var29 >>> 8 ^ var2[(int)(255L & ((long)(this.field4018 ? 1 : 0) ^ var29))];
      } catch (RuntimeException var34) {
         throw class612.method4503(var34, field4027[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
