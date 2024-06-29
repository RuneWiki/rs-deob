import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class150 implements class107 {
   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2107 = new String[]{method1258(method1257("BKQn")), method1258(method1257("JP\u0013A\n")), method1258(method1257("W\u0010\u0013,_")), method1258(method1257("JP\u0013@\n")), method1258(method1257("JP\u0013C\n"))};
   @OriginalMember(
      owner = "client!fn",
      name = "e",
      descriptor = "I"
   )
   public static int field2097 = 0;
   @OriginalMember(
      owner = "client!fn",
      name = "h",
      descriptor = "Lll;"
   )
   public static class387 field2098 = new class387();
   @OriginalMember(
      owner = "client!fn",
      name = "f",
      descriptor = "I"
   )
   public int field2096;
   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "I"
   )
   public static int field2099;
   @OriginalMember(
      owner = "client!fn",
      name = "i",
      descriptor = "I"
   )
   public static int field2100;
   @OriginalMember(
      owner = "client!fn",
      name = "d",
      descriptor = "I"
   )
   public int field2101;
   @OriginalMember(
      owner = "client!fn",
      name = "c",
      descriptor = "I"
   )
   public int field2102;
   @OriginalMember(
      owner = "client!fn",
      name = "g",
      descriptor = "I"
   )
   public int field2103;
   @OriginalMember(
      owner = "client!fn",
      name = "k",
      descriptor = "I"
   )
   public int field2105;
   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "I"
   )
   public int field2106;
   @OriginalMember(
      owner = "client!fn",
      name = "j",
      descriptor = "Z"
   )
   public boolean field2104;

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(I)J",
      line = 4
   )
   public final long method877(int arg0) {
      try {
         ++field2099;
         long[] var2 = class89.field1158;
         long var3 = -1L;
         long var5 = var3 >>> 8 ^ var2[(int)((var3 ^ (long)this.field2105) & 255L)];
         if (arg0 >= -4) {
            this.method878(-92, (class107)null);
         }

         long var7 = var2[(int)(((long)(this.field2106 >> 8) ^ var5) & 255L)] ^ var5 >>> 8;
         long var9 = var2[(int)((var7 ^ (long)this.field2106) & 255L)] ^ var7 >>> 8;
         long var11 = var9 >>> 8 ^ var2[(int)((var9 ^ (long)(this.field2096 >> 24)) & 255L)];
         long var13 = var2[(int)(255L & ((long)(this.field2096 >> 16) ^ var11))] ^ var11 >>> 8;
         long var15 = var13 >>> 8 ^ var2[(int)((var13 ^ (long)(this.field2096 >> 8)) & 255L)];
         long var17 = var2[(int)((var15 ^ (long)this.field2096) & 255L)] ^ var15 >>> 8;
         long var19 = var2[(int)(255L & (var17 ^ (long)this.field2103))] ^ var17 >>> 8;
         long var21 = var2[(int)(((long)(this.field2101 >> 24) ^ var19) & 255L)] ^ var19 >>> 8;
         long var23 = var21 >>> 8 ^ var2[(int)((var21 ^ (long)(this.field2101 >> 16)) & 255L)];
         long var25 = var2[(int)(255L & (var23 ^ (long)(this.field2101 >> 8)))] ^ var23 >>> 8;
         long var27 = var25 >>> 8 ^ var2[(int)((var25 ^ (long)this.field2101) & 255L)];
         long var29 = var27 >>> 8 ^ var2[(int)(((long)this.field2102 ^ var27) & 255L)];
         return var29 >>> 8 ^ var2[(int)((var29 ^ (long)(!this.field2104 ? 0 : 1)) & 255L)];
      } catch (RuntimeException var34) {
         throw class237.method1823(var34, field2107[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "(I)V",
      line = 35
   )
   public static void method1256(int arg0) {
      try {
         field2098 = null;
         if (arg0 != 722096144) {
            field2098 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2107[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(ILiv;)Z",
      line = 54
   )
   public final boolean method878(int arg0, class107 arg1) {
      try {
         ++field2100;
         if (!(arg1 instanceof class150)) {
            return false;
         } else {
            class150 var3 = (class150)arg1;
            if (~this.field2105 != ~var3.field2105) {
               return false;
            } else if (~this.field2106 != ~var3.field2106) {
               return false;
            } else if (this.field2096 != var3.field2096) {
               return false;
            } else {
               if (arg0 != 4776) {
                  this.method878(-90, (class107)null);
               }

               if (this.field2103 != var3.field2103) {
                  return false;
               } else if (this.field2101 != var3.field2101) {
                  return false;
               } else if (this.field2102 != var3.field2102) {
                  return false;
               } else {
                  return this.field2104 == var3.field2104;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2107[1] + arg0 + ',' + (arg1 != null ? field2107[2] : field2107[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1257(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1258(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
