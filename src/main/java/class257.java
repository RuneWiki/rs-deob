import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class257 {
   @OriginalMember(
      owner = "client!ig",
      name = "g",
      descriptor = "Ltv;"
   )
   private class590 field3293 = new class590(16);
   @OriginalMember(
      owner = "client!ig",
      name = "l",
      descriptor = "Lqh;"
   )
   private class74 field3283;
   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3294 = new String[]{method1974(method1973("tjT\u0003d")), method1974(method1973("sx\u0016(")), method1974(method1973("f#Tj1")), method1974(method1973("tjT\u0002d")), method1974(method1973("tjTx%sd\u000ezd")), method1974(method1973("tjT\u0000d")), method1974(method1973("tjT\u0001d")), method1974(method1973("tjT\fd")), method1974(method1973("tjT\u0007d")), method1974(method1973("tjT\u0006d")), method1974(method1973("tjT\u0005d"))};
   @OriginalMember(
      owner = "client!ig",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field3285 = new int[4096];
   @OriginalMember(
      owner = "client!ig",
      name = "i",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field3286 = new String[200];
   @OriginalMember(
      owner = "client!ig",
      name = "e",
      descriptor = "I"
   )
   public static int field3287 = 0;
   @OriginalMember(
      owner = "client!ig",
      name = "c",
      descriptor = "I"
   )
   public static int field3278;
   @OriginalMember(
      owner = "client!ig",
      name = "m",
      descriptor = "I"
   )
   public static int field3279;
   @OriginalMember(
      owner = "client!ig",
      name = "h",
      descriptor = "I"
   )
   public static int field3280;
   @OriginalMember(
      owner = "client!ig",
      name = "o",
      descriptor = "I"
   )
   public static int field3281;
   @OriginalMember(
      owner = "client!ig",
      name = "j",
      descriptor = "I"
   )
   public static int field3282;
   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "I"
   )
   public static int field3284;
   @OriginalMember(
      owner = "client!ig",
      name = "d",
      descriptor = "I"
   )
   public static int field3290;
   @OriginalMember(
      owner = "client!ig",
      name = "n",
      descriptor = "I"
   )
   public static int field3291;
   @OriginalMember(
      owner = "client!ig",
      name = "k",
      descriptor = "I"
   )
   public static int field3292;
   @OriginalMember(
      owner = "client!ig",
      name = "f",
      descriptor = "Lok;"
   )
   public static class267 field3288;
   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "[Lu;"
   )
   public static class80[] field3289;

   @OriginalMember(
      owner = "client!ig",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1965(int arg0) {
      try {
         class590 var2 = this.field3293;
         synchronized(this.field3293) {
            this.field3293.method4244(true);
            if (arg0 != 0) {
               field3285 = null;
            }
         }

         ++field3280;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3294[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(Lme;B)I"
   )
   public static final int method1966(class206 arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field3281;
         if (arg1 != -77) {
            method1967((byte)25, (class65)null);
         }

         int var3 = arg0.method1566(2, -12869);
         int var4;
         if (~var3 != -1) {
            if (var3 != 1) {
               if (~var3 != -3) {
                  var4 = arg0.method1566(11, -12869);
                  if (!var2) {
                     return var4;
                  }
               }

               var4 = arg0.method1566(8, -12869);
               if (!var2) {
                  return var4;
               }
            }

            var4 = arg0.method1566(5, -12869);
            if (!var2) {
               return var4;
            }
         }

         var4 = 0;
         return var4;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3294[5] + (arg0 != null ? field3294[2] : field3294[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method1967(byte arg0, class65 arg1) {
      try {
         ++field3278;
         if (arg0 < 66) {
            field3287 = 36;
         }

         if (class639.field9015 != class278.field3709.field1001) {
            if (class111.field1404 != null) {
               if (class40.method300(-4, arg1, class278.field3709.field1001)) {
                  class639.field9015 = class278.field3709.field1001;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3294[3] + arg0 + ',' + (arg1 != null ? field3294[2] : field3294[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method1968(int arg0, int arg1) {
      try {
         ++field3282;
         if (arg0 >= 38) {
            class590 var3 = this.field3293;
            synchronized(this.field3293) {
               this.field3293.method4234(2, arg1);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3294[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(II)Lnu;"
   )
   private final class622 method1969(int arg0, int arg1) {
      try {
         ++field3284;
         class590 var3 = this.field3293;
         class622 var4;
         synchronized(this.field3293) {
            var4 = (class622)this.field3293.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field3283;
            byte[] var6;
            synchronized(this.field3283) {
               var6 = this.field3283.method732(arg0, 29, (byte)75);
            }

            if (arg1 < 104) {
               this.method1968(-40, 53);
            }

            class622 var7 = new class622();
            if (var6 != null) {
               var7.method4525(-45, new class594(var6));
            }

            class590 var8 = this.field3293;
            synchronized(this.field3293) {
               this.field3293.method4238(91, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field3294[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1970(int arg0) {
      try {
         field3288 = null;
         field3286 = null;
         field3285 = null;
         field3289 = null;
         if (arg0 != 30769) {
            field3289 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3294[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(IIIILij;I)Ljd;"
   )
   public final class242 method1971(int arg0, int arg1, int arg2, int arg3, class447 arg4, int arg5) {
      boolean var7 = client.field4273;

      try {
         ++field3292;
         class408[] var8 = null;
         if (arg5 != -527) {
            method1970(113);
         }

         class622 var9 = this.method1969(arg3, 106);
         if (var9.field8689 != null) {
            var8 = new class408[var9.field8689.length];
            int var10 = 0;
            if (var7 || var8.length > var10) {
               do {
                  class382 var11 = arg4.method3317((byte)-114, var9.field8689[var10]);
                  var8[var10] = new class408(var11.field5345, var11.field5343, var11.field5346, var11.field5349, var11.field5350, var11.field5355, var11.field5356, var11.field5348);
                  ++var10;
               } while(var8.length > var10);
            }
         }

         return new class242(var9.field8686, var8, var9.field8688, arg1, arg0, arg2);
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field3294[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3294[2] : field3294[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1972(int arg0) {
      try {
         ++field3290;
         class590 var2 = this.field3293;
         synchronized(this.field3293) {
            if (arg0 != 29) {
               field3289 = null;
            }

            this.field3293.method4245(true);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3294[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class257(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field3283 = arg2;
         this.field3283.method727(29, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3294[4] + (arg0 != null ? field3294[2] : field3294[1]) + ',' + arg1 + ',' + (arg2 != null ? field3294[2] : field3294[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1973(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1974(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
