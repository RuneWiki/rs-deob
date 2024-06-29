import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class154 implements class352 {
   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1998 = new String[]{method1313(method1312("VC\u0013j!\n")), method1313(method1312("LW\u001e(")), method1313(method1312("Y\f\\j\u001e")), method1313(method1312("VC\u0013j'\n")), method1313(method1312("VC\u0013j\"\n"))};
   @OriginalMember(
      owner = "client!taa",
      name = "i",
      descriptor = "I"
   )
   public int field1988;
   @OriginalMember(
      owner = "client!taa",
      name = "h",
      descriptor = "I"
   )
   public int field1989;
   @OriginalMember(
      owner = "client!taa",
      name = "b",
      descriptor = "I"
   )
   public static int field1990;
   @OriginalMember(
      owner = "client!taa",
      name = "f",
      descriptor = "I"
   )
   public static int field1991;
   @OriginalMember(
      owner = "client!taa",
      name = "j",
      descriptor = "I"
   )
   public int field1992;
   @OriginalMember(
      owner = "client!taa",
      name = "c",
      descriptor = "I"
   )
   public int field1994;
   @OriginalMember(
      owner = "client!taa",
      name = "d",
      descriptor = "I"
   )
   public static int field1995;
   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "I"
   )
   public int field1996;
   @OriginalMember(
      owner = "client!taa",
      name = "g",
      descriptor = "I"
   )
   public int field1997;
   @OriginalMember(
      owner = "client!taa",
      name = "e",
      descriptor = "Z"
   )
   public boolean field1993;

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public static final byte[] method1308(int arg0, byte[] arg1) {
      try {
         ++field1991;
         int var2 = arg1.length;
         byte[] var3 = new byte[var2];
         class349.method2762(arg1, arg0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1998[3] + arg0 + ',' + (arg1 != null ? field1998[2] : field1998[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(Lwja;B)Z"
   )
   public final boolean method1309(class352 arg0, byte arg1) {
      try {
         ++field1990;
         if (!(arg0 instanceof class154)) {
            return false;
         } else {
            class154 var3 = (class154)arg0;
            if (this.field1996 != var3.field1996) {
               return false;
            } else if (this.field1989 != var3.field1989) {
               return false;
            } else if (this.field1994 != var3.field1994) {
               return false;
            } else if (arg1 > -33) {
               return true;
            } else if (this.field1988 != var3.field1988) {
               return false;
            } else if (this.field1992 != var3.field1992) {
               return false;
            } else if (this.field1997 != var3.field1997) {
               return false;
            } else {
               return this.field1993 == var3.field1993;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1998[4] + (arg0 != null ? field1998[2] : field1998[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1310(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (class743.field10860 != null) {
         class743.field10860[arg0][arg1] = -16777216 | arg2;
      }

      if (class47.field600 != null) {
         class47.field600[arg0][arg1] = (short)arg3;
      }

      if (class684.field10073 != null) {
         class684.field10073[arg0][arg1] = (byte)arg4;
      }

   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1311(int arg0) {
      try {
         ++field1995;
         long[] var2 = class634.field9334;
         if (arg0 >= -84) {
            this.field1994 = -118;
         }

         long var3 = -1L;
         long var5 = var2[(int)(255L & ((long)this.field1996 ^ var3))] ^ var3 >>> 8;
         long var7 = var5 >>> 8 ^ var2[(int)((var5 ^ (long)(this.field1989 >> 8)) & 255L)];
         long var9 = var7 >>> 8 ^ var2[(int)((var7 ^ (long)this.field1989) & 255L)];
         long var11 = var9 >>> 8 ^ var2[(int)(255L & (var9 ^ (long)(this.field1994 >> 24)))];
         long var13 = var2[(int)(255L & ((long)(this.field1994 >> 16) ^ var11))] ^ var11 >>> 8;
         long var15 = var13 >>> 8 ^ var2[(int)((var13 ^ (long)(this.field1994 >> 8)) & 255L)];
         long var17 = var2[(int)(((long)this.field1994 ^ var15) & 255L)] ^ var15 >>> 8;
         long var19 = var2[(int)((var17 ^ (long)this.field1988) & 255L)] ^ var17 >>> 8;
         long var21 = var19 >>> 8 ^ var2[(int)(255L & (var19 ^ (long)(this.field1992 >> 24)))];
         long var23 = var21 >>> 8 ^ var2[(int)(255L & (var21 ^ (long)(this.field1992 >> 16)))];
         long var25 = var2[(int)(255L & (var23 ^ (long)(this.field1992 >> 8)))] ^ var23 >>> 8;
         long var27 = var2[(int)((var25 ^ (long)this.field1992) & 255L)] ^ var25 >>> 8;
         long var29 = var27 >>> 8 ^ var2[(int)((var27 ^ (long)this.field1997) & 255L)];
         return var2[(int)((var29 ^ (long)(this.field1993 ? 1 : 0)) & 255L)] ^ var29 >>> 8;
      } catch (RuntimeException var34) {
         throw class93.method866(var34, field1998[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
