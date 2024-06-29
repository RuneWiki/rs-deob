import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class59 {
   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field776 = new String[]{method544(method543("\u001a%t\u000eyF")), method544(method543("\u00002yL")), method544(method543("\u0015i;\u000eF")), method544(method543("\u001a%t\u000exF")), method544(method543("\u001a%t\u000e\u007fF")), method544(method543("\u001a%t\u000e~F")), method544(method543("\u001a%t\u000ezF"))};
   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "[Lsa;"
   )
   public static class783[] field771 = new class783[2048];
   @OriginalMember(
      owner = "client!tba",
      name = "e",
      descriptor = "I"
   )
   public static int field769;
   @OriginalMember(
      owner = "client!tba",
      name = "d",
      descriptor = "I"
   )
   public static int field772;
   @OriginalMember(
      owner = "client!tba",
      name = "c",
      descriptor = "I"
   )
   public static int field773;
   @OriginalMember(
      owner = "client!tba",
      name = "h",
      descriptor = "I"
   )
   public static int field774;
   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "I"
   )
   public static int field775;
   @OriginalMember(
      owner = "client!tba",
      name = "f",
      descriptor = "Lwe;"
   )
   public class133 field768;
   @OriginalMember(
      owner = "client!tba",
      name = "g",
      descriptor = "Lda;"
   )
   public static class447 field770;

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method538(String arg0, int arg1) {
      try {
         ++field769;
         if (arg1 > -91) {
            method541(112);
         }

         return class159.field2036.containsKey(arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field776[3] + (arg0 != null ? field776[2] : field776[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field775;
         if (arg1 != 862696096) {
            field770 = null;
         }

         class460.method3509(arg5, arg4, arg3, arg8, 0, (byte)126, arg7, arg0, arg2, arg6);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field776[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(ILtga;II)J"
   )
   public static final long method540(int arg0, class660 arg1, int arg2, int arg3) {
      try {
         ++field773;
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         class294 var8 = class438.field5967.method929((byte)-104, arg1.method175((byte)9));
         long var9 = (long)(1073741824 | arg1.method181(-6696) << 14 | arg2 << 7 | arg3 | arg1.method184(true) << 20);
         if (var8.field4079 == 0) {
            var9 |= var6;
         }

         if (~var8.field4085 == -2) {
            var9 |= var4;
         }

         long var11 = var9 | (long)arg1.method175((byte)9) << 32;
         if (arg0 <= 9) {
            method538((String)null, -128);
         }

         return var11;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field776[4] + arg0 + ',' + (arg1 != null ? field776[2] : field776[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method541(int arg0) {
      try {
         field770 = null;
         if (arg0 != 1073741824) {
            field770 = null;
         }

         field771 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field776[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public static final void method542(int arg0, int arg1, byte arg2, int arg3) {
      try {
         int var4 = 110 % ((-39 - arg2) / 33);
         ++field772;
         class487 var5 = class2.method12((long)arg0, 11, (byte)43);
         var5.method3694(-21792);
         var5.field6794 = arg1;
         var5.field6791 = arg3;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field776[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method543(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method544(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
