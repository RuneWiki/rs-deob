import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class524 {
   @OriginalMember(
      owner = "client!np",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field7412 = new class107(256);
   @OriginalMember(
      owner = "client!np",
      name = "h",
      descriptor = "Lsa;"
   )
   private class39 field7414;
   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7420 = new String[]{method3929(method3928("%5\u001fT\u0014")), method3929(method3928("%5\u001fV\u0014")), method3929(method3928("%5\u001fQ\u0014")), method3929(method3928("%5\u001fP\u0014")), method3929(method3928("%5\u001fS\u0014")), method3929(method3928("%5\u001f)U%,E+\u0014")), method3929(method3928("0k\u001f;A")), method3929(method3928("%0]y")), method3929(method3928("%5\u001fR\u0014")), method3929(method3928("%5\u001fW\u0014"))};
   @OriginalMember(
      owner = "client!np",
      name = "f",
      descriptor = "Lbu;"
   )
   public static class234 field7410 = new class234(4, 1, 1, 1);
   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class398 field7418 = new class398(16);
   @OriginalMember(
      owner = "client!np",
      name = "g",
      descriptor = "I"
   )
   public static int field7409;
   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "I"
   )
   public static int field7411;
   @OriginalMember(
      owner = "client!np",
      name = "d",
      descriptor = "I"
   )
   public static int field7413;
   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "I"
   )
   public static int field7415;
   @OriginalMember(
      owner = "client!np",
      name = "j",
      descriptor = "I"
   )
   public static int field7416;
   @OriginalMember(
      owner = "client!np",
      name = "i",
      descriptor = "I"
   )
   public static int field7417;
   @OriginalMember(
      owner = "client!np",
      name = "k",
      descriptor = "I"
   )
   public static int field7419;

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(Ljga;I)V"
   )
   public static final void method3921(class91 arg0, int arg1) {
      try {
         int var3;
         int var4;
         label26: {
            ++field7415;
            class91 var2 = class363.method2853(arg0, (byte)12);
            if (var2 != null) {
               var3 = var2.field1513;
               var4 = var2.field1452;
               if (!client.field10022) {
                  break label26;
               }
            }

            var3 = class557.field7909;
            var4 = class140.field2243;
         }

         class439.method3418(var3, var4, false, -6, arg0);
         class508.method3831(var3, arg0, (byte)61, var4);
         if (arg1 != 2) {
            method3921((class91)null, -115);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7420[9] + (arg0 != null ? field7420[6] : field7420[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3922(int arg0) {
      try {
         ++field7409;
         class107 var2 = this.field7412;
         synchronized(this.field7412) {
            if (arg0 == 21521) {
               this.field7412.method1052(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7420[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3923(int arg0, int arg1) {
      try {
         ++field7411;
         if (~arg1 > -97) {
            return 0;
         } else if (~arg1 > -129) {
            return 2;
         } else {
            if (arg0 != 1) {
               field7410 = null;
            }

            return 3;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7420[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3924(int arg0) {
      try {
         field7418 = null;
         field7410 = null;
         if (arg0 != 26) {
            field7419 = 63;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7420[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3925(int arg0, byte arg1) {
      try {
         class107 var3 = this.field7412;
         synchronized(this.field7412) {
            this.field7412.method1048(arg0, -8543);
         }

         ++field7413;
         if (arg1 >= -101) {
            field7418 = null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7420[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3926(int arg0) {
      try {
         ++field7416;
         if (arg0 == 26) {
            class107 var2 = this.field7412;
            synchronized(this.field7412) {
               this.field7412.method1045(3);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7420[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "(II)Loo;"
   )
   public final class593 method3927(int arg0, int arg1) {
      try {
         ++field7417;
         class107 var3 = this.field7412;
         class593 var4;
         synchronized(this.field7412) {
            var4 = (class593)this.field7412.method1041((long)arg1, arg0 + 7);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field7414;
            byte[] var6;
            synchronized(this.field7414) {
               var6 = this.field7414.method460((byte)-11, arg1, 26);
            }

            if (arg0 != 1) {
               field7418 = null;
            }

            class593 var7 = new class593();
            if (var6 != null) {
               var7.method4355(new class65(var6), -1);
            }

            class107 var8 = this.field7412;
            synchronized(this.field7412) {
               this.field7412.method1050(arg0 ^ -71, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7420[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class524(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field7414 = arg2;
         this.field7414.method434((byte)-106, 26);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7420[5] + (arg0 != null ? field7420[6] : field7420[7]) + ',' + arg1 + ',' + (arg2 != null ? field7420[6] : field7420[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3928(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3929(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
