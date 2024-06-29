import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class777 {
   @OriginalMember(
      owner = "client!qc",
      name = "p",
      descriptor = "[I"
   )
   public int[] field11312;
   @OriginalMember(
      owner = "client!qc",
      name = "f",
      descriptor = "[I"
   )
   public int[] field11305;
   @OriginalMember(
      owner = "client!qc",
      name = "k",
      descriptor = "B"
   )
   public byte field11296;
   @OriginalMember(
      owner = "client!qc",
      name = "q",
      descriptor = "B"
   )
   public byte field11311;
   @OriginalMember(
      owner = "client!qc",
      name = "h",
      descriptor = "[I"
   )
   public int[] field11298;
   @OriginalMember(
      owner = "client!qc",
      name = "e",
      descriptor = "S"
   )
   public short field11310;
   @OriginalMember(
      owner = "client!qc",
      name = "j",
      descriptor = "S"
   )
   public short field11304;
   @OriginalMember(
      owner = "client!qc",
      name = "d",
      descriptor = "S"
   )
   public short field11299;
   @OriginalMember(
      owner = "client!qc",
      name = "g",
      descriptor = "S"
   )
   public short field11301;
   @OriginalMember(
      owner = "client!qc",
      name = "l",
      descriptor = "[S"
   )
   public short[] field11307;
   @OriginalMember(
      owner = "client!qc",
      name = "n",
      descriptor = "[S"
   )
   public short[] field11303;
   @OriginalMember(
      owner = "client!qc",
      name = "o",
      descriptor = "[S"
   )
   public short[] field11308;
   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11313 = new String[]{method5566(method5565("\u0007IRB ")), method5566(method5565("\r\u0004R.u")), method5566(method5565("\u0012\u0012\u0010\u0000")), method5566(method5565("\r\u0004RP4\u0012\u000e\bRu")), method5566(method5565("\r\u0004R-u"))};
   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field11302 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "I"
   )
   public static int field11297;
   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "I"
   )
   public static int field11306;
   @OriginalMember(
      owner = "client!qc",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field11300;
   @OriginalMember(
      owner = "client!qc",
      name = "m",
      descriptor = "[[B"
   )
   public static byte[][] field11309;

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(ILeb;)Leb;"
   )
   public static final class657 method5563(int arg0, class657 arg1) {
      try {
         ++field11306;
         class657 var2 = client.method2409(arg1);
         if (var2 == null) {
            var2 = arg1.field9200;
         }

         if (arg0 <= 60) {
            method5563(-108, (class657)null);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11313[1] + arg0 + ',' + (arg1 != null ? field11313[0] : field11313[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5564(int arg0) {
      try {
         if (arg0 == -31408) {
            field11302 = null;
            field11300 = null;
            field11309 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11313[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIIII)V"
   )
   public class777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      try {
         this.field11312 = new int[4];
         this.field11305 = new int[4];
         this.field11296 = (byte)arg0;
         this.field11311 = (byte)arg1;
         this.field11298 = new int[4];
         this.field11298[2] = arg4;
         this.field11298[0] = arg2;
         this.field11298[1] = arg3;
         this.field11298[3] = arg5;
         this.field11312[2] = arg8;
         this.field11312[0] = arg6;
         this.field11312[1] = arg7;
         this.field11312[3] = arg9;
         this.field11310 = (short)(arg2 >> class76.field965);
         this.field11305[3] = arg13;
         this.field11305[2] = arg12;
         this.field11305[1] = arg11;
         this.field11305[0] = arg10;
         this.field11304 = (short)(arg4 >> class76.field965);
         this.field11299 = (short)(arg10 >> class76.field965);
         this.field11301 = (short)(arg12 >> class76.field965);
         this.field11307 = new short[4];
         this.field11303 = new short[4];
         this.field11308 = new short[4];
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field11313[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5565(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5566(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
