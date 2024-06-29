import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class571 extends class191 {
   @OriginalMember(
      owner = "client!v",
      name = "v",
      descriptor = "I"
   )
   private int field8087 = -1;
   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8097 = new String[]{method4234(method4233("\r\u0019@\u0019")), method4234(method4233("\u0015Bh]")), method4234(method4233("\r\u0019F\u0019")), method4234(method4233("\u0000\u0019*\u001f\u001c")), method4234(method4233("\r\u0019G\u0019")), method4234(method4233("5Xj\u0011\u0002\u000b\u00066\u0004S[TlP\u0013\u001aTpT\u0013[\u0007|")), method4234(method4233("\r\u0019A\u0019")), method4234(method4233("[Gv^\u0017\u0012SaU")), method4234(method4233("\r\u0019B\u0019"))};
   @OriginalMember(
      owner = "client!v",
      name = "t",
      descriptor = "J"
   )
   public static long field8095 = 20000000L;
   @OriginalMember(
      owner = "client!v",
      name = "s",
      descriptor = "Liw;"
   )
   public static class107 field8093 = new class107(8);
   @OriginalMember(
      owner = "client!v",
      name = "o",
      descriptor = "I"
   )
   public static int field8085;
   @OriginalMember(
      owner = "client!v",
      name = "n",
      descriptor = "I"
   )
   public static int field8086;
   @OriginalMember(
      owner = "client!v",
      name = "p",
      descriptor = "I"
   )
   public static int field8088;
   @OriginalMember(
      owner = "client!v",
      name = "w",
      descriptor = "I"
   )
   public static int field8089;
   @OriginalMember(
      owner = "client!v",
      name = "r",
      descriptor = "I"
   )
   private int field8090;
   @OriginalMember(
      owner = "client!v",
      name = "m",
      descriptor = "I"
   )
   private int field8091;
   @OriginalMember(
      owner = "client!v",
      name = "l",
      descriptor = "I"
   )
   private int field8092;
   @OriginalMember(
      owner = "client!v",
      name = "u",
      descriptor = "I"
   )
   public static int field8094;
   @OriginalMember(
      owner = "client!v",
      name = "q",
      descriptor = "Lsa;"
   )
   public static class39 field8096;

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         ++field8085;
         this.field8087 = arg0.method685(-2);
         if (arg1 < -97) {
            this.field8091 = arg0.method701(255);
            this.field8090 = arg0.method665(false);
            this.field8092 = arg0.method665(false);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8097[4] + (arg0 != null ? field8097[3] : field8097[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(BI)C"
   )
   public static final char method4230(byte arg0, int arg1) {
      try {
         ++field8086;
         int var2 = arg0 & 255;
         if (var2 == 0) {
            throw new IllegalArgumentException(field8097[5] + Integer.toString(var2, 16) + field8097[7]);
         } else {
            int var3 = -125 / ((arg1 - -60) / 49);
            if (var2 >= 128 && var2 < 160) {
               char var4 = class574.field8113[var2 + -128];
               if (~var4 == -1) {
                  var4 = '?';
               }

               var2 = var4;
            }

            return (char)var2;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8097[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4231(int arg0) {
      try {
         field8096 = null;
         if (arg0 != 20000000) {
            field8089 = -74;
         }

         field8093 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8097[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         arg1.method3512(this.field8090, -29606, this.field8087, this.field8092, this.field8091);
         ++field8088;
         if (arg0 >= -106) {
            this.method342((byte)28, (class456)null);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8097[2] + arg0 + ',' + (arg1 != null ? field8097[3] : field8097[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4232(int arg0) {
      try {
         ++field8094;
         if (arg0 != 160) {
            field8093 = null;
         }

         class37.method421((byte)34);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8097[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4233(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4234(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
