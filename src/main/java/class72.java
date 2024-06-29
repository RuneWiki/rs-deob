import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class72 {
   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "B"
   )
   public byte field921;
   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field924 = new String[]{method718(method717("| H-\u0013")), method718(method717("| H.\u0013")), method718(method717("v|HAF")), method718(method717("c'\n\u0003")), method718(method717("| H,\u0013")), method718(method717("| HSRc;\u0012Q\u0013")), method718(method717("| H+\u0013"))};
   @OriginalMember(
      owner = "client!qr",
      name = "p",
      descriptor = "I"
   )
   public static int field911;
   @OriginalMember(
      owner = "client!qr",
      name = "n",
      descriptor = "I"
   )
   public static int field920;
   @OriginalMember(
      owner = "client!qr",
      name = "d",
      descriptor = "I"
   )
   public static int field923;
   @OriginalMember(
      owner = "client!qr",
      name = "m",
      descriptor = "Ltea;"
   )
   public class249 field919;
   @OriginalMember(
      owner = "client!qr",
      name = "h",
      descriptor = "Lhe;"
   )
   public class389 field910;
   @OriginalMember(
      owner = "client!qr",
      name = "q",
      descriptor = "Llp;"
   )
   public class411 field907;
   @OriginalMember(
      owner = "client!qr",
      name = "l",
      descriptor = "Llp;"
   )
   public class411 field915;
   @OriginalMember(
      owner = "client!qr",
      name = "f",
      descriptor = "Lpga;"
   )
   public static class560 field916;
   @OriginalMember(
      owner = "client!qr",
      name = "c",
      descriptor = "Lnfa;"
   )
   public class707 field913;
   @OriginalMember(
      owner = "client!qr",
      name = "i",
      descriptor = "Lnfa;"
   )
   public class707 field922;
   @OriginalMember(
      owner = "client!qr",
      name = "o",
      descriptor = "Lqr;"
   )
   public class72 field918;
   @OriginalMember(
      owner = "client!qr",
      name = "j",
      descriptor = "Lfka;"
   )
   public class742 field917;
   @OriginalMember(
      owner = "client!qr",
      name = "e",
      descriptor = "S"
   )
   public short field908;
   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "S"
   )
   public short field909;
   @OriginalMember(
      owner = "client!qr",
      name = "k",
      descriptor = "S"
   )
   public short field912;
   @OriginalMember(
      owner = "client!qr",
      name = "g",
      descriptor = "S"
   )
   public short field914;

   @OriginalMember(
      owner = "client!qr",
      name = "<init>",
      descriptor = "(I)V",
      line = 2
   )
   public class72(int arg0) {
      try {
         this.field921 = (byte)arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field924[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(IIIIZ)V",
      line = 21
   )
   public static final void method713(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field923;
         class403 var5 = class453.method3410((long)arg0, arg4, 4);
         var5.method3093(22144);
         var5.field6187 = arg2;
         var5.field6183 = arg1;
         var5.field6185 = arg3;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field924[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "([Ljava/lang/String;BII)Ljava/lang/String;",
      line = 40
   )
   public static final String method714(String[] arg0, byte arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field920;
         if (~arg3 == -1) {
            return "";
         } else if (arg3 == 1) {
            String var5 = arg0[arg2];
            return var5 == null ? field924[3] : var5.toString();
         } else {
            int var6 = arg2 + arg3;
            int var7 = 0;
            int var8 = arg2;
            if (var4 != 0 || ~var6 < ~arg2) {
               do {
                  String var9 = arg0[var8];
                  if (var9 == null) {
                     var7 += 4;
                     if (var4 != 0) {
                        var7 += var9.length();
                        ++var8;
                     } else {
                        ++var8;
                     }
                  } else {
                     var7 += var9.length();
                     ++var8;
                  }
               } while(~var6 < ~var8);
            }

            StringBuffer var10 = new StringBuffer(var7);
            int var11 = arg2;
            int var12 = -79 / ((-32 - arg1) / 34);
            String var10000;
            if (var4 != 0) {
               var10000 = arg0[arg2];
            } else if (~arg2 <= ~var6) {
               var10000 = var10.toString();
               if (var4 == 0) {
                  return var10000;
               }
            } else {
               var10000 = arg0[arg2];
            }

            while(true) {
               String var13 = var10000;
               if (var13 == null) {
                  var10.append(field924[3]);
                  if (var4 != 0) {
                     var10.append(var13);
                     ++var11;
                  } else {
                     ++var11;
                  }
               } else {
                  var10.append(var13);
                  ++var11;
               }

               if (~var11 <= ~var6) {
                  var10000 = var10.toString();
                  if (var4 == 0) {
                     return var10000;
                  }
               } else {
                  var10000 = arg0[var11];
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field924[4] + (arg0 != null ? field924[2] : field924[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(B)V",
      line = 101
   )
   public static void method715(byte arg0) {
      try {
         if (arg0 >= -23) {
            field916 = null;
         }

         field916 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field924[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(Z)V",
      line = 111
   )
   public final void method716(boolean arg0) {
      int var2 = client.field4530;

      try {
         class389 var3;
         if (var2 != 0) {
            var3 = this.field910.field5942;
            this.field910.method2987(1);
            this.field910 = var3;
         }

         while(this.field910 != null) {
            var3 = this.field910.field5942;
            this.field910.method2987(1);
            this.field910 = var3;
         }

         ++field911;
         if (arg0) {
            this.field914 = 85;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field924[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method717(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method718(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
