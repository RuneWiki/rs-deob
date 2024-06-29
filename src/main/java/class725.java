import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class725 {
   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "Liw;"
   )
   private class107 field10362 = new class107(128);
   @OriginalMember(
      owner = "client!rca",
      name = "e",
      descriptor = "Lsa;"
   )
   private class39 field10364;
   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10365 = new String[]{method5251(method5250("5%\u0006&L")), method5251(method5250(" ~Dd")), method5251(method5250("<hI&uf")), method5251(method5250("<hI&pf")), method5251(method5250("<hI&sf")), method5251(method5250("<hI&\r'eA|\u000ff")), method5251(method5250("<hI&rf")), method5251(method5250("<hI&tf"))};
   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "Lpl;"
   )
   public static class168 field10360 = new class168();
   @OriginalMember(
      owner = "client!rca",
      name = "d",
      descriptor = "I"
   )
   public static int field10358;
   @OriginalMember(
      owner = "client!rca",
      name = "g",
      descriptor = "I"
   )
   public static int field10359;
   @OriginalMember(
      owner = "client!rca",
      name = "c",
      descriptor = "I"
   )
   public static int field10361;
   @OriginalMember(
      owner = "client!rca",
      name = "f",
      descriptor = "I"
   )
   public static int field10363;

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(Ljga;II)I"
   )
   public static final int method5245(class91 arg0, int arg1, int arg2) {
      try {
         ++field10359;
         if (arg1 != 31619) {
            field10360 = null;
         }

         if (!client.method5048(arg0).method3241(arg2, arg1 + -47338) && arg0.field1481 == null) {
            return -1;
         } else {
            return arg0.field1498 != null && arg2 < arg0.field1498.length ? arg0.field1498[arg2] : -1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10365[3] + (arg0 != null ? field10365[0] : field10365[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5246(byte arg0) {
      try {
         if (arg0 <= 45) {
            method5247((byte)66, (byte[])null);
         }

         field10360 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10365[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(B[B)Z"
   )
   public static final boolean method5247(byte arg0, byte[] arg1) {
      try {
         ++field10363;
         class65 var2 = new class65(arg1);
         int var3 = var2.method665(false);
         if (var3 != 2) {
            return false;
         } else {
            if (arg0 <= 102) {
               field10360 = null;
            }

            boolean var4 = var2.method665(false) == 1;
            if (var4) {
               class585.method4298((byte)65, var2);
            }

            class167.method1570(92, var2);
            return true;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10365[2] + arg0 + ',' + (arg1 != null ? field10365[0] : field10365[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(BI)Lww;"
   )
   public final class623 method5248(byte arg0, int arg1) {
      try {
         ++field10361;
         class107 var3 = this.field10362;
         class623 var4;
         synchronized(this.field10362) {
            var4 = (class623)this.field10362.method1041((long)arg1, arg0 ^ 37);
         }

         if (var4 != null) {
            return var4;
         } else {
            byte[] var5 = this.field10364.method460((byte)-11, class220.method1903(arg1, arg0 ^ 44), class692.method5017(arg1, (byte)118));
            class623 var6 = new class623();
            if (var5 != null) {
               var6.method4586(new class65(var5), (byte)-65);
            }

            if (arg0 != 45) {
               return null;
            } else {
               class107 var7 = this.field10362;
               synchronized(this.field10362) {
                  this.field10362.method1050(-77, var6, (long)arg1);
                  return var6;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10365[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method5249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field10022;

      try {
         ++field10358;
         if (!class132.method1345(-101, arg3)) {
            if (~arg8 != 0) {
               class417.field6107[arg8] = true;
            } else {
               int var10 = 0;
               if (var9) {
                  class417.field6107[var10] = true;
                  ++var10;
               }

               while(true) {
                  while(var10 < 100) {
                     class417.field6107[var10] = true;
                     ++var10;
                  }

                  if (!var9) {
                     return;
                  }

                  ++var10;
               }
            }
         } else {
            int var11 = 0;
            int var12 = 0;
            int var13 = arg4;
            int var14 = 0;
            int var15 = 0;
            if (class563.field8012) {
               var14 = class153.field2342;
               var13 = class438.field6423;
               var15 = class749.field10650;
               var11 = class131.field2128;
               var12 = class158.field2426;
               class749.field10650 = 1;
            }

            label87: {
               if (class779.field11377[arg3] != null) {
                  class86.method901(arg8, arg5, arg7, arg2, arg0, arg6, class779.field11377[arg3], arg1, arg8 < 0, arg4 ^ -96255198, -1);
                  if (!var9) {
                     break label87;
                  }
               }

               class86.method901(arg8, arg5, arg7, arg2, arg0, arg6, class315.field4719[arg3], arg1, ~arg8 > -1, arg4 ^ -96255198, -1);
            }

            if (class563.field8012) {
               if (arg8 >= 0 && ~class749.field10650 == -3) {
                  class515.method3870(class158.field2426, class438.field6423, (byte)-50, class153.field2342, class131.field2128);
               }

               class131.field2128 = var11;
               class153.field2342 = var14;
               class749.field10650 = var15;
               class158.field2426 = var12;
               class438.field6423 = var13;
            }
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field10365[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class725(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field10364 = arg2;
         if (this.field10364 != null) {
            int var4 = -1 + this.field10364.method454(100);
            this.field10364.method434((byte)-106, var4);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10365[5] + (arg0 != null ? field10365[0] : field10365[1]) + ',' + arg1 + ',' + (arg2 != null ? field10365[0] : field10365[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
