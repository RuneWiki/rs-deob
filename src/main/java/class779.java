import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class779 {
   @OriginalMember(
      owner = "client!kr",
      name = "m",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field11411;
   @OriginalMember(
      owner = "client!kr",
      name = "d",
      descriptor = "Lku;"
   )
   private class399 field11422;
   @OriginalMember(
      owner = "client!kr",
      name = "j",
      descriptor = "Ldw;"
   )
   private class750 field11417;
   @OriginalMember(
      owner = "client!kr",
      name = "h",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field11420;
   @OriginalMember(
      owner = "client!kr",
      name = "f",
      descriptor = "Lrc;"
   )
   private class565 field11412;
   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11423 = new String[]{method5613(method5612("D(\u0013\u001c\u0006")), method5613(method5612("D(\u0013\u001d\u0006")), method5613(method5612("D(\u0013\u001a\u0006")), method5613(method5612("D(\u0013\u001f\u0006")), method5613(method5612("Tt\u0013pS")), method5613(method5612("A/Q2")), method5613(method5612("D(\u0013\u001b\u0006")), method5613(method5612("D(\u0013bGA3I`\u0006"))};
   @OriginalMember(
      owner = "client!kr",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field11416 = false;
   @OriginalMember(
      owner = "client!kr",
      name = "c",
      descriptor = "I"
   )
   public static int field11409;
   @OriginalMember(
      owner = "client!kr",
      name = "g",
      descriptor = "I"
   )
   public static int field11413;
   @OriginalMember(
      owner = "client!kr",
      name = "n",
      descriptor = "I"
   )
   public static int field11415;
   @OriginalMember(
      owner = "client!kr",
      name = "i",
      descriptor = "I"
   )
   public static int field11418;
   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "I"
   )
   public static int field11419;
   @OriginalMember(
      owner = "client!kr",
      name = "e",
      descriptor = "I"
   )
   public static int field11421;
   @OriginalMember(
      owner = "client!kr",
      name = "l",
      descriptor = "Lwf;"
   )
   private class147 field11414;
   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "[Lnq;"
   )
   private class488[] field11410;

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(B)Z",
      line = 4
   )
   public final boolean method5607(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11421;
         if (this.field11414 != null) {
            return true;
         } else {
            if (this.field11412 == null) {
               if (this.field11422.method3019(arg0 ^ -12292)) {
                  return false;
               }

               this.field11412 = this.field11422.method3017(255, true, (byte)0, 255, -88);
            }

            if (this.field11412.field2586) {
               return false;
            } else {
               class147 var3 = new class147(this.field11412.method1464(true));
               var3.field1856 = 5;
               int var4 = var3.method1143(-15465);
               var3.field1856 += var4 * 72;
               byte[] var5 = new byte[var3.field1889.length + -var3.field1856];
               if (arg0 != -100) {
                  field11416 = false;
               }

               byte[] var8;
               label66: {
                  var3.method1191(-5766, var5.length, var5, 0);
                  if (this.field11420 != null && this.field11411 != null) {
                     BigInteger var6 = new BigInteger(var5);
                     BigInteger var7 = var6.modPow(this.field11420, this.field11411);
                     var8 = var7.toByteArray();
                     if (!var2) {
                        break label66;
                     }
                  }

                  var8 = var5;
               }

               if (~var8.length != -66) {
                  throw new RuntimeException();
               } else {
                  byte[] var9 = class474.method3452(arg0 ^ -100, var3.field1889, -var5.length + var3.field1856 + -5, 5);
                  int var10 = 0;
                  if (var2) {
                     if (~var9[var10] != ~var8[var10 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }

                  while(true) {
                     int var10000;
                     if (~var10 <= -65) {
                        this.field11414 = var3;
                        this.field11410 = new class488[var4];
                        var10000 = 1;
                        if (!var2) {
                           return true;
                        }
                     } else {
                        var10000 = ~var9[var10];
                     }

                     if (var10000 != ~var8[var10 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field11423[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(ILnha;Lnha;I)Lnq;",
      line = 81
   )
   public final class488 method5608(int arg0, class342 arg1, class342 arg2, int arg3) {
      try {
         if (arg3 != 6) {
            field11416 = false;
         }

         ++field11419;
         return this.method5609(arg2, arg0, true, false, arg1);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11423[6] + arg0 + ',' + (arg1 != null ? field11423[4] : field11423[5]) + ',' + (arg2 != null ? field11423[4] : field11423[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(Lnha;IZZLnha;)Lnq;",
      line = 92
   )
   private final class488 method5609(class342 arg0, int arg1, boolean arg2, boolean arg3, class342 arg4) {
      try {
         ++field11413;
         if (this.field11414 == null) {
            throw new RuntimeException();
         } else if (arg1 >= 0 && arg1 < this.field11410.length) {
            if (this.field11410[arg1] != null) {
               return this.field11410[arg1];
            } else {
               this.field11414.field1856 = arg1 * 72 + 6;
               if (arg3) {
                  this.method5610(-45);
               }

               int var6 = this.field11414.method1164(19693);
               int var7 = this.field11414.method1164(19693);
               byte[] var8 = new byte[64];
               this.field11414.method1191(-5766, 64, var8, 0);
               class488 var9 = new class488(arg1, arg0, arg4, this.field11422, this.field11417, var6, var8, var7, arg2);
               this.field11410[arg1] = var9;
               return var9;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field11423[3] + (arg0 != null ? field11423[4] : field11423[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11423[4] : field11423[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(I)V",
      line = 139
   )
   public final void method5610(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11418;
         if (this.field11410 != null) {
            int var3 = 0;
            if (var2) {
               if (this.field11410[var3] != null) {
                  this.field11410[var3].method3542(30450);
               }

               ++var3;
            }

            while(true) {
               while(~var3 > ~this.field11410.length) {
                  if (this.field11410[var3] != null) {
                     this.field11410[var3].method3542(30450);
                  }

                  ++var3;
               }

               int var4 = 0;
               if (!var2) {
                  if (var2) {
                     if (this.field11410[var4] != null) {
                        this.field11410[var4].method3547(255);
                     }

                     ++var4;
                  }

                  while(true) {
                     while(~this.field11410.length < ~var4) {
                        if (this.field11410[var4] != null) {
                           this.field11410[var4].method3547(255);
                        }

                        ++var4;
                     }

                     if (!var2) {
                        if (arg0 != -4377) {
                           this.method5610(-101);
                           return;
                        }

                        return;
                     }

                     ++var4;
                  }
               }

               ++var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11423[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "<init>",
      descriptor = "(Lku;Ldw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V",
      line = 188
   )
   public class779(class399 arg0, class750 arg1, BigInteger arg2, BigInteger arg3) {
      try {
         this.field11411 = arg3;
         this.field11422 = arg0;
         this.field11417 = arg1;
         this.field11420 = arg2;
         if (!this.field11422.method3019(12384)) {
            this.field11412 = this.field11422.method3017(255, true, (byte)0, 255, 52);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11423[7] + (arg0 != null ? field11423[4] : field11423[5]) + ',' + (arg1 != null ? field11423[4] : field11423[5]) + ',' + (arg2 != null ? field11423[4] : field11423[5]) + ',' + (arg3 != null ? field11423[4] : field11423[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(IIII)V",
      line = 202
   )
   public static final void method5611(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field11409;
         if (~class64.field772 != ~arg0 || ~class751.field11114 != ~arg3 || ~class138.field1765 != ~arg2) {
            class64.field772 = arg0;
            class171.field2384 = true;
            class138.field1765 = arg2;
            class751.field11114 = arg3;
            double var4 = -((double)(arg0 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double)(arg3 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class385.field5595 = var12;
            class170.field2375 = var10 * var14;
            class554.field7936 = var14;
            class426.field6116 = var8 * var12;
            class429.field6140 = var10;
            class160.field2286 = (double)arg1;
            class517.field7456 = -var8 * var14;
            class23.field267 = var8;
            class347.field4691 = -var10 * var12;
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field11423[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5612(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5613(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
