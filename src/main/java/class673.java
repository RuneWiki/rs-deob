import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class673 {
   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9976 = new String[]{method4929(method4928("ewv6\u000b.")), method4929(method4928("ho4\u000f")), method4929(method4928("}4vM7")), method4929(method4928("ewv7\u000b.")), method4929(method4928("ewv0\u000b.")), method4929(method4928("ewv5\u000b."))};
   @OriginalMember(
      owner = "client!cm",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field9971 = false;
   @OriginalMember(
      owner = "client!cm",
      name = "i",
      descriptor = "Ldja;"
   )
   public static class45 field9968 = new class45(1);
   @OriginalMember(
      owner = "client!cm",
      name = "e",
      descriptor = "I"
   )
   public static int field9966;
   @OriginalMember(
      owner = "client!cm",
      name = "j",
      descriptor = "I"
   )
   public static int field9969;
   @OriginalMember(
      owner = "client!cm",
      name = "c",
      descriptor = "I"
   )
   public static int field9970;
   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "I"
   )
   public static int field9973;
   @OriginalMember(
      owner = "client!cm",
      name = "f",
      descriptor = "I"
   )
   public static int field9974;
   @OriginalMember(
      owner = "client!cm",
      name = "k",
      descriptor = "J"
   )
   public long field9965;
   @OriginalMember(
      owner = "client!cm",
      name = "d",
      descriptor = "Lcm;"
   )
   public class673 field9972;
   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "Lcm;"
   )
   public class673 field9975;
   @OriginalMember(
      owner = "client!cm",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9967;

   @OriginalMember(
      owner = "client!cm",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method4924(int arg0) {
      try {
         ++field9974;
         if (this.field9975 != null) {
            this.field9975.field9972 = this.field9972;
            this.field9972.field9975 = this.field9975;
            if (arg0 != -2970) {
               field9968 = null;
            }

            this.field9972 = null;
            this.field9975 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9976[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(I[BII)[B"
   )
   public static final byte[] method4925(int arg0, byte[] arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         byte[] var5;
         label48: {
            ++field9966;
            if (arg3 > 0) {
               var5 = new byte[arg2];
               int var6 = 0;
               if (var4) {
                  var5[var6] = arg1[arg3 + var6];
                  ++var6;
               }

               while(true) {
                  while(~var6 > ~arg2) {
                     var5[var6] = arg1[arg3 + var6];
                     ++var6;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label48;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            var5 = arg1;
         }

         class164 var7 = new class164();
         var7.method1359((byte)26);
         var7.method1362((long)(arg0 * arg2), var5, (byte)-100);
         byte[] var8 = new byte[64];
         var7.method1361(0, var8, arg0 ^ 62);
         return var8;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field9976[3] + arg0 + ',' + (arg1 != null ? field9976[2] : field9976[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method4926(int arg0) {
      try {
         ++field9973;
         if (this.field9975 == null) {
            return false;
         } else {
            return arg0 == 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9976[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4927(int arg0) {
      try {
         if (arg0 >= 51) {
            field9967 = null;
            field9968 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9976[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4928(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4929(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
