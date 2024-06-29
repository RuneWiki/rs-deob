import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class250 implements class549 {
   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3354 = new String[]{method1891(method1890("Bp\u0005\u0007q")), method1891(method1890("W+GE")), method1891(method1890("K9J\u0007M\u0011")), method1891(method1890("K9J\u0007N\u0011"))};
   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "I"
   )
   public int field3345;
   @OriginalMember(
      owner = "client!rga",
      name = "c",
      descriptor = "I"
   )
   public static int field3347;
   @OriginalMember(
      owner = "client!rga",
      name = "f",
      descriptor = "I"
   )
   public int field3348;
   @OriginalMember(
      owner = "client!rga",
      name = "b",
      descriptor = "I"
   )
   public int field3349;
   @OriginalMember(
      owner = "client!rga",
      name = "g",
      descriptor = "I"
   )
   public static int field3350;
   @OriginalMember(
      owner = "client!rga",
      name = "e",
      descriptor = "I"
   )
   public int field3351;
   @OriginalMember(
      owner = "client!rga",
      name = "h",
      descriptor = "I"
   )
   public int field3352;
   @OriginalMember(
      owner = "client!rga",
      name = "d",
      descriptor = "I"
   )
   public int field3353;
   @OriginalMember(
      owner = "client!rga",
      name = "i",
      descriptor = "Z"
   )
   public boolean field3346;

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method1888(byte arg0) {
      try {
         int var2 = 97 / ((arg0 - 62) / 62);
         ++field3350;
         long[] var3 = class503.field7465;
         long var4 = -1L;
         long var6 = var4 >>> 8 ^ var3[(int)(255L & ((long)this.field3353 ^ var4))];
         long var8 = var3[(int)(255L & ((long)(this.field3351 >> 8) ^ var6))] ^ var6 >>> 8;
         long var10 = var3[(int)((var8 ^ (long)this.field3351) & 255L)] ^ var8 >>> 8;
         long var12 = var10 >>> 8 ^ var3[(int)(((long)(this.field3352 >> 24) ^ var10) & 255L)];
         long var14 = var3[(int)(255L & ((long)(this.field3352 >> 16) ^ var12))] ^ var12 >>> 8;
         long var16 = var3[(int)(255L & ((long)(this.field3352 >> 8) ^ var14))] ^ var14 >>> 8;
         long var18 = var16 >>> 8 ^ var3[(int)(((long)this.field3352 ^ var16) & 255L)];
         long var20 = var18 >>> 8 ^ var3[(int)(((long)this.field3345 ^ var18) & 255L)];
         long var22 = var20 >>> 8 ^ var3[(int)((var20 ^ (long)(this.field3348 >> 24)) & 255L)];
         long var24 = var3[(int)(((long)(this.field3348 >> 16) ^ var22) & 255L)] ^ var22 >>> 8;
         long var26 = var24 >>> 8 ^ var3[(int)(((long)(this.field3348 >> 8) ^ var24) & 255L)];
         long var28 = var3[(int)((var26 ^ (long)this.field3348) & 255L)] ^ var26 >>> 8;
         long var30 = var3[(int)((var28 ^ (long)this.field3349) & 255L)] ^ var28 >>> 8;
         return var30 >>> 8 ^ var3[(int)(255L & ((long)(this.field3346 ? 1 : 0) ^ var30))];
      } catch (RuntimeException var35) {
         throw class670.method4877(var35, field3354[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(Lsf;I)Z"
   )
   public final boolean method1889(class549 arg0, int arg1) {
      try {
         ++field3347;
         if (!(arg0 instanceof class250)) {
            return false;
         } else {
            class250 var3 = (class250)arg0;
            if (this.field3353 != var3.field3353) {
               return false;
            } else if (this.field3351 != var3.field3351) {
               return false;
            } else if (~this.field3352 != ~var3.field3352) {
               return false;
            } else if (this.field3345 != var3.field3345) {
               return false;
            } else if (this.field3348 != var3.field3348) {
               return false;
            } else {
               if (arg1 != -14313) {
                  this.method1888((byte)111);
               }

               if (~this.field3349 != ~var3.field3349) {
                  return false;
               } else {
                  return !this.field3346 == !var3.field3346;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3354[2] + (arg0 != null ? field3354[0] : field3354[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1890(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1891(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
