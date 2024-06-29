import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class215 implements class574 {
   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3237 = new String[]{method1836(method1835("kr\u000f\u0017+")), method1836(method1835("kr\u000f\u0015+")), method1836(method1835("mnM:")), method1836(method1835("kr\u000f\u0012+")), method1836(method1835("x5\u000fx~")), method1836(method1835("kr\u000f\u0014+"))};
   @OriginalMember(
      owner = "client!hi",
      name = "j",
      descriptor = "Z"
   )
   public static volatile boolean field3226 = true;
   @OriginalMember(
      owner = "client!hi",
      name = "e",
      descriptor = "Luw;"
   )
   public static class435 field3224 = new class435(46, 15);
   @OriginalMember(
      owner = "client!hi",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field3236 = new int[13];
   @OriginalMember(
      owner = "client!hi",
      name = "h",
      descriptor = "I"
   )
   public static int field3222;
   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "I"
   )
   public int field3223;
   @OriginalMember(
      owner = "client!hi",
      name = "c",
      descriptor = "I"
   )
   public int field3225;
   @OriginalMember(
      owner = "client!hi",
      name = "i",
      descriptor = "I"
   )
   public static int field3227;
   @OriginalMember(
      owner = "client!hi",
      name = "n",
      descriptor = "I"
   )
   public int field3229;
   @OriginalMember(
      owner = "client!hi",
      name = "l",
      descriptor = "I"
   )
   public int field3230;
   @OriginalMember(
      owner = "client!hi",
      name = "k",
      descriptor = "I"
   )
   public int field3231;
   @OriginalMember(
      owner = "client!hi",
      name = "g",
      descriptor = "I"
   )
   public static int field3232;
   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "I"
   )
   public static int field3233;
   @OriginalMember(
      owner = "client!hi",
      name = "m",
      descriptor = "I"
   )
   public int field3235;
   @OriginalMember(
      owner = "client!hi",
      name = "d",
      descriptor = "Lsm;"
   )
   public static class297 field3234;
   @OriginalMember(
      owner = "client!hi",
      name = "o",
      descriptor = "Z"
   )
   public boolean field3228;

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(I)V",
      line = 6
   )
   public static void method1831(int arg0) {
      try {
         field3236 = null;
         field3234 = null;
         if (arg0 < 19) {
            method1832((byte)126);
         }

         field3224 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3237[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(B)I",
      line = 26
   )
   public static final int method1832(byte arg0) {
      try {
         if (arg0 != -123) {
            method1831(-85);
         }

         ++field3232;
         return class231.field3395;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3237[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(I)J",
      line = 38
   )
   public final long method1833(int arg0) {
      try {
         ++field3222;
         long[] var2 = class275.field3894;
         long var3 = -1L;
         long var5 = var2[(int)(((long)this.field3223 ^ var3) & 255L)] ^ var3 >>> 8;
         long var7 = var2[(int)((var5 ^ (long)(this.field3230 >> 8)) & 255L)] ^ var5 >>> 8;
         long var9 = var2[(int)(((long)this.field3230 ^ var7) & 255L)] ^ var7 >>> 8;
         long var11 = var2[(int)(255L & ((long)(this.field3229 >> 24) ^ var9))] ^ var9 >>> 8;
         long var13 = var2[(int)(255L & (var11 ^ (long)(this.field3229 >> 16)))] ^ var11 >>> 8;
         long var15 = var13 >>> 8 ^ var2[(int)(255L & (var13 ^ (long)(this.field3229 >> 8)))];
         long var17 = var15 >>> 8 ^ var2[(int)(255L & ((long)this.field3229 ^ var15))];
         long var19 = var2[(int)(((long)this.field3225 ^ var17) & 255L)] ^ var17 >>> 8;
         long var21 = var2[(int)(255L & ((long)(this.field3231 >> 24) ^ var19))] ^ var19 >>> 8;
         long var23 = var21 >>> 8 ^ var2[(int)(255L & (var21 ^ (long)(this.field3231 >> 16)))];
         long var25 = var23 >>> 8 ^ var2[(int)(255L & (var23 ^ (long)(this.field3231 >> 8)))];
         long var27 = var2[(int)((var25 ^ (long)this.field3231) & 255L)] ^ var25 >>> 8;
         if (arg0 != -28737) {
            this.field3230 = 35;
         }

         long var29 = var2[(int)((var27 ^ (long)this.field3235) & 255L)] ^ var27 >>> 8;
         return var2[(int)((var29 ^ (long)(!this.field3228 ? 0 : 1)) & 255L)] ^ var29 >>> 8;
      } catch (RuntimeException var34) {
         throw class608.method4462(var34, field3237[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(ILcba;)Z",
      line = 70
   )
   public final boolean method1834(int arg0, class574 arg1) {
      try {
         ++field3233;
         if (!(arg1 instanceof class215)) {
            return false;
         } else if (arg0 != -19799) {
            return true;
         } else {
            class215 var3 = (class215)arg1;
            if (~this.field3223 != ~var3.field3223) {
               return false;
            } else if (~this.field3230 != ~var3.field3230) {
               return false;
            } else if (~this.field3229 != ~var3.field3229) {
               return false;
            } else if (~this.field3225 != ~var3.field3225) {
               return false;
            } else if (this.field3231 != var3.field3231) {
               return false;
            } else if (this.field3235 != var3.field3235) {
               return false;
            } else {
               return this.field3228 != !var3.field3228;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3237[3] + arg0 + ',' + (arg1 != null ? field3237[4] : field3237[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1835(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1836(char[] arg0) {
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
            var10005 = 27;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
