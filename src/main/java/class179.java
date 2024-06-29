import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class179 implements class455 {
   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2234 = new String[]{method1385(method1384("0$6\u0005w{")), method1385(method1384("0$6\u0005p{")), method1385(method1384("=7;G")), method1385(method1384("(ly\u0005N")), method1385(method1384("0$6\u0005q{")), method1385(method1384("0$6\u0005r{"))};
   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "I"
   )
   public static int field2223 = 0;
   @OriginalMember(
      owner = "client!cfa",
      name = "h",
      descriptor = "Lnw;"
   )
   public static class616 field2230 = new class616(0, 0);
   @OriginalMember(
      owner = "client!cfa",
      name = "n",
      descriptor = "Lof;"
   )
   public static class653 field2231 = new class653();
   @OriginalMember(
      owner = "client!cfa",
      name = "i",
      descriptor = "I"
   )
   public static int field2232 = 0;
   @OriginalMember(
      owner = "client!cfa",
      name = "c",
      descriptor = "F"
   )
   public static float field2233;
   @OriginalMember(
      owner = "client!cfa",
      name = "d",
      descriptor = "I"
   )
   public int field2218;
   @OriginalMember(
      owner = "client!cfa",
      name = "e",
      descriptor = "I"
   )
   public static int field2219;
   @OriginalMember(
      owner = "client!cfa",
      name = "m",
      descriptor = "I"
   )
   public int field2220;
   @OriginalMember(
      owner = "client!cfa",
      name = "g",
      descriptor = "I"
   )
   public int field2221;
   @OriginalMember(
      owner = "client!cfa",
      name = "j",
      descriptor = "I"
   )
   public static int field2224;
   @OriginalMember(
      owner = "client!cfa",
      name = "p",
      descriptor = "I"
   )
   public int field2225;
   @OriginalMember(
      owner = "client!cfa",
      name = "o",
      descriptor = "I"
   )
   public int field2226;
   @OriginalMember(
      owner = "client!cfa",
      name = "l",
      descriptor = "I"
   )
   public int field2228;
   @OriginalMember(
      owner = "client!cfa",
      name = "f",
      descriptor = "I"
   )
   public static int field2229;
   @OriginalMember(
      owner = "client!cfa",
      name = "b",
      descriptor = "J"
   )
   public static long field2222;
   @OriginalMember(
      owner = "client!cfa",
      name = "k",
      descriptor = "Z"
   )
   public boolean field2227;

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method1380(boolean arg0, int arg1) {
      try {
         label37: {
            ++field2224;
            if (!arg0 || class618.field8615 == null) {
               class742.field10814 = -1;
               if (!client.field4273) {
                  break label37;
               }
            }

            class742.field10814 = class618.field8615.field1569;
         }

         class93.field1236 = 0;
         class572.field7867 = null;
         class618.field8615 = null;
         class432.field6030 = null;
         int var2 = 45 % ((arg1 - -43) / 49);
         class618.method4482();
         class618.field8624.method3861(70);
         class469.field6491 = null;
         class575.field7911 = -1;
         class618.field8626 = null;
         class522.field7146 = null;
         class76.field953 = null;
         class524.field7181 = null;
         class509.field7051 = null;
         class178.field2210 = null;
         class338.field4838 = null;
         class621.field8679 = null;
         class226.field2841 = -1;
         class264.field3446 = null;
         if (class618.field8609 != null) {
            class618.field8609.method5237((byte)-81);
            class618.field8609.method5238((byte)-126, 64, 128);
         }

         if (class618.field8616 != null) {
            class618.field8616.method2381(64, 64, 99);
         }

         if (class618.field8611 != null) {
            class618.field8611.method3592(0, 64);
         }

         class402.field5645.method2779(0, 64);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2234[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1381(boolean arg0) {
      try {
         if (!arg0) {
            field2232 = 59;
         }

         field2231 = null;
         field2230 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2234[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(ILli;)Z"
   )
   public final boolean method1382(int arg0, class455 arg1) {
      try {
         int var3 = 109 % ((26 - arg0) / 58);
         ++field2229;
         if (!(arg1 instanceof class179)) {
            return false;
         } else {
            class179 var4 = (class179)arg1;
            if (~this.field2228 != ~var4.field2228) {
               return false;
            } else if (~this.field2220 != ~var4.field2220) {
               return false;
            } else if (~this.field2221 != ~var4.field2221) {
               return false;
            } else if (~this.field2218 != ~var4.field2218) {
               return false;
            } else if (~this.field2225 != ~var4.field2225) {
               return false;
            } else if (~this.field2226 != ~var4.field2226) {
               return false;
            } else {
               return var4.field2227 != !this.field2227;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2234[4] + arg0 + ',' + (arg1 != null ? field2234[3] : field2234[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method1383(byte arg0) {
      try {
         ++field2219;
         long[] var2 = class511.field7075;
         long var3 = -1L;
         long var5 = var3 >>> 8 ^ var2[(int)(255L & ((long)this.field2228 ^ var3))];
         if (arg0 <= 76) {
            this.field2225 = 57;
         }

         long var7 = var5 >>> 8 ^ var2[(int)(255L & (var5 ^ (long)(this.field2220 >> 8)))];
         long var9 = var2[(int)(((long)this.field2220 ^ var7) & 255L)] ^ var7 >>> 8;
         long var11 = var2[(int)(((long)(this.field2221 >> 24) ^ var9) & 255L)] ^ var9 >>> 8;
         long var13 = var2[(int)((var11 ^ (long)(this.field2221 >> 16)) & 255L)] ^ var11 >>> 8;
         long var15 = var2[(int)((var13 ^ (long)(this.field2221 >> 8)) & 255L)] ^ var13 >>> 8;
         long var17 = var15 >>> 8 ^ var2[(int)(255L & ((long)this.field2221 ^ var15))];
         long var19 = var2[(int)(((long)this.field2218 ^ var17) & 255L)] ^ var17 >>> 8;
         long var21 = var2[(int)((var19 ^ (long)(this.field2225 >> 24)) & 255L)] ^ var19 >>> 8;
         long var23 = var21 >>> 8 ^ var2[(int)(((long)(this.field2225 >> 16) ^ var21) & 255L)];
         long var25 = var2[(int)((var23 ^ (long)(this.field2225 >> 8)) & 255L)] ^ var23 >>> 8;
         long var27 = var25 >>> 8 ^ var2[(int)(255L & (var25 ^ (long)this.field2225))];
         long var29 = var27 >>> 8 ^ var2[(int)(255L & (var27 ^ (long)this.field2226))];
         return var2[(int)(255L & (var29 ^ (long)(!this.field2227 ? 0 : 1)))] ^ var29 >>> 8;
      } catch (RuntimeException var34) {
         throw class534.method3846(var34, field2234[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1384(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1385(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
