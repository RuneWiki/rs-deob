import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class282 {
   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "Liw;"
   )
   private class107 field4254 = new class107(64);
   @OriginalMember(
      owner = "client!gl",
      name = "h",
      descriptor = "Liw;"
   )
   public class107 field4257 = new class107(64);
   @OriginalMember(
      owner = "client!gl",
      name = "d",
      descriptor = "Lsa;"
   )
   public class39 field4252;
   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "Lsa;"
   )
   private class39 field4255;
   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4261 = new String[]{method2368(method2367("-={\\t")), method2368(method2367("-={[t")), method2368(method2367("-={Rt")), method2368(method2367("$$9v")), method2368(method2367("1\u007f{4!")), method2368(method2367("-={&5$8!$t")), method2368(method2367("-={Yt")), method2368(method2367("-={Xt")), method2368(method2367("-={Pt")), method2368(method2367("-={St")), method2368(method2367("-={^t")), method2368(method2367("-={]t"))};
   @OriginalMember(
      owner = "client!gl",
      name = "m",
      descriptor = "Lfm;"
   )
   public static class164 field4258 = new class164(58, 6);
   @OriginalMember(
      owner = "client!gl",
      name = "l",
      descriptor = "Lut;"
   )
   public static class495 field4259 = new class495();
   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "I"
   )
   public static int field4246;
   @OriginalMember(
      owner = "client!gl",
      name = "o",
      descriptor = "I"
   )
   public static int field4247;
   @OriginalMember(
      owner = "client!gl",
      name = "f",
      descriptor = "I"
   )
   public static int field4248;
   @OriginalMember(
      owner = "client!gl",
      name = "g",
      descriptor = "I"
   )
   public static int field4249;
   @OriginalMember(
      owner = "client!gl",
      name = "e",
      descriptor = "I"
   )
   public static int field4250;
   @OriginalMember(
      owner = "client!gl",
      name = "i",
      descriptor = "I"
   )
   public static int field4251;
   @OriginalMember(
      owner = "client!gl",
      name = "k",
      descriptor = "I"
   )
   public static int field4253;
   @OriginalMember(
      owner = "client!gl",
      name = "j",
      descriptor = "I"
   )
   public static int field4256;
   @OriginalMember(
      owner = "client!gl",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field4260;

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2357(byte arg0) {
      try {
         ++field4249;
         class617.method4535(-12081);
         class678.field9669 = false;
         class91.method918(class752.field10679, class587.field8249, (byte)123, class685.field9890, class133.field2180);
         if (arg0 >= -28) {
            method2359(-44, 72, (byte)93);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4261[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(IJ)I"
   )
   public static final int method2358(int arg0, long arg1) {
      try {
         int var3 = -80 / ((83 - arg0) / 43);
         class623.method4590(false, arg1);
         ++field4256;
         return class309.field4659.get(1);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4261[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "(IIB)V"
   )
   public static final void method2359(int arg0, int arg1, byte arg2) {
      try {
         ++field4248;
         class111 var3 = class796.method5734(5, (long)arg0, (byte)-104);
         if (arg2 >= 84) {
            var3.method1087(0);
            var3.field1740 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4261[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2360(int arg0) {
      try {
         class107 var2 = this.field4254;
         synchronized(this.field4254) {
            this.field4254.method1052(true);
         }

         ++field4253;
         class107 var3 = this.field4257;
         synchronized(this.field4257) {
            this.field4257.method1052(true);
         }

         if (arg0 != -9370) {
            this.field4255 = null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4261[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2361(int arg0, int arg1) {
      try {
         if (arg1 != 4) {
            method2362(-16);
         }

         class107 var3 = this.field4254;
         synchronized(this.field4254) {
            this.field4254.method1048(arg0, -8543);
         }

         ++field4250;
         class107 var4 = this.field4257;
         synchronized(this.field4257) {
            this.field4257.method1048(arg0, -8543);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field4261[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2362(int arg0) {
      try {
         field4259 = null;
         field4260 = null;
         if (arg0 != 0) {
            method2359(-42, 94, (byte)62);
         }

         field4258 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4261[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "(II)Ldja;"
   )
   public final class104 method2363(int arg0, int arg1) {
      try {
         ++field4247;
         class107 var3 = this.field4254;
         class104 var4;
         synchronized(this.field4254) {
            var4 = (class104)this.field4254.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field4255;
            byte[] var6;
            synchronized(this.field4255) {
               var6 = this.field4255.method460((byte)-11, arg0, 34);
            }

            class104 var7 = new class104();
            var7.field1636 = this;
            if (var6 != null) {
               var7.method1021(new class65(var6), (byte)-56);
            }

            class107 var8 = this.field4254;
            synchronized(this.field4254) {
               this.field4254.method1050(-89, var7, (long)arg0);
               int var9 = 25 % ((18 - arg1) / 39);
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field4261[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method2364(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 65) {
            field4259 = null;
         }

         ++field4246;
         this.field4254 = new class107(arg0);
         this.field4257 = new class107(arg1);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4261[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method2365(int arg0, int arg1) {
      class412 var2 = null;

      for(int var3 = arg0; var3 < arg1; ++var3) {
         class751 var4 = class558.field7922[var3];
         if (var4 != null) {
            for(int var5 = 0; var5 < class25.field360; ++var5) {
               for(int var6 = 0; var6 < class155.field2381; ++var6) {
                  var2 = var4.method43(var6, var5, var2);
                  if (var2 != null) {
                     int var7 = var6 << class313.field4707;
                     int var8 = var5 << class313.field4707;

                     for(int var9 = var3 - 1; var9 >= 0; --var9) {
                        class751 var10 = class558.field7922[var9];
                        if (var10 != null) {
                           int var11 = var4.method5400(-1, var5, var6) - var10.method5400(-1, var5, var6);
                           int var12 = var4.method5400(-1, var5, var6 + 1) - var10.method5400(-1, var5, var6 + 1);
                           int var13 = var4.method5400(-1, var5 + 1, var6 + 1) - var10.method5400(-1, var5 + 1, var6 + 1);
                           int var14 = var4.method5400(-1, var5 + 1, var6) - var10.method5400(-1, var5 + 1, var6);
                           var10.method49(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2366(int arg0) {
      try {
         ++field4251;
         class107 var2 = this.field4254;
         synchronized(this.field4254) {
            this.field4254.method1045(3);
         }

         class107 var3 = this.field4257;
         synchronized(this.field4257) {
            this.field4257.method1045(arg0 ^ 2);
         }

         if (arg0 != 1) {
            this.method2360(40);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4261[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lsa;)V"
   )
   public class282(class392 arg0, int arg1, class39 arg2, class39 arg3) {
      try {
         this.field4252 = arg3;
         this.field4255 = arg2;
         this.field4255.method434((byte)-106, 34);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4261[5] + (arg0 != null ? field4261[4] : field4261[3]) + ',' + arg1 + ',' + (arg2 != null ? field4261[4] : field4261[3]) + ',' + (arg3 != null ? field4261[4] : field4261[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2367(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2368(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
