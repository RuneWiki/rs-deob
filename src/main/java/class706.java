import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class706 {
   @OriginalMember(
      owner = "client!lt",
      name = "g",
      descriptor = "Ltv;"
   )
   private class590 field10245 = new class590(64);
   @OriginalMember(
      owner = "client!lt",
      name = "k",
      descriptor = "Lqh;"
   )
   private class74 field10243;
   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10254 = new String[]{method5141(method5140("R:kn\u0015")), method5141(method5140("R:ki\u0015")), method5141(method5140("R:k\u0017TP'1\u0015\u0015")), method5141(method5140("P;)G")), method5141(method5140("E`k\u0005@")), method5141(method5140("R:kh\u0015")), method5141(method5140("R:ko\u0015")), method5141(method5140("R:kj\u0015"))};
   @OriginalMember(
      owner = "client!lt",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field10250 = new class378(36, 17);
   @OriginalMember(
      owner = "client!lt",
      name = "d",
      descriptor = "Lhba;"
   )
   public static class10 field10252 = null;
   @OriginalMember(
      owner = "client!lt",
      name = "h",
      descriptor = "I"
   )
   public static int field10244;
   @OriginalMember(
      owner = "client!lt",
      name = "e",
      descriptor = "I"
   )
   public static int field10246;
   @OriginalMember(
      owner = "client!lt",
      name = "j",
      descriptor = "I"
   )
   public static int field10247;
   @OriginalMember(
      owner = "client!lt",
      name = "i",
      descriptor = "I"
   )
   public static int field10248;
   @OriginalMember(
      owner = "client!lt",
      name = "f",
      descriptor = "I"
   )
   public static int field10249;
   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "I"
   )
   public static int field10251;
   @OriginalMember(
      owner = "client!lt",
      name = "c",
      descriptor = "I"
   )
   public static int field10253;

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5135(byte arg0) {
      try {
         ++field10247;
         class590 var2 = this.field10245;
         synchronized(this.field10245) {
            this.field10245.method4244(true);
         }

         if (arg0 < 41) {
            field10252 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10254[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method5136(byte arg0) {
      try {
         class590 var2 = this.field10245;
         synchronized(this.field10245) {
            this.field10245.method4245(true);
            if (arg0 > -95) {
               this.method5136((byte)-59);
            }
         }

         ++field10248;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10254[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5137(byte arg0) {
      try {
         field10252 = null;
         field10250 = null;
         if (arg0 != -62) {
            method5137((byte)34);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10254[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(II)Leca;"
   )
   public final class793 method5138(int arg0, int arg1) {
      try {
         ++field10246;
         class590 var3 = this.field10245;
         class793 var4;
         synchronized(this.field10245) {
            var4 = (class793)this.field10245.method4239((long)arg0, 0);
         }

         int var5 = 45 % ((arg1 - -68) / 42);
         if (var4 != null) {
            return var4;
         } else {
            class74 var6 = this.field10243;
            byte[] var7;
            synchronized(this.field10243) {
               var7 = this.field10243.method732(arg0, 31, (byte)87);
            }

            class793 var8 = new class793();
            if (var7 != null) {
               var8.method5715(24, new class594(var7));
            }

            class590 var9 = this.field10245;
            synchronized(this.field10245) {
               this.field10245.method4238(29, var8, (long)arg0);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field10254[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method5139(int arg0, int arg1) {
      try {
         if (arg0 != 18104) {
            field10249 = -53;
         }

         class590 var3 = this.field10245;
         synchronized(this.field10245) {
            this.field10245.method4234(arg0 ^ 18106, arg1);
         }

         ++field10244;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10254[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class706(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field10243 = arg2;
         this.field10243.method727(31, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10254[2] + (arg0 != null ? field10254[4] : field10254[3]) + ',' + arg1 + ',' + (arg2 != null ? field10254[4] : field10254[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5140(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5141(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
