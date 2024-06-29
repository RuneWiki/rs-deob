import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class262 {
   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "Lsia;"
   )
   private class407 field3325 = new class407(16);
   @OriginalMember(
      owner = "client!tu",
      name = "g",
      descriptor = "Lww;"
   )
   private class339 field3318;
   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3331 = new String[]{method2106(method2105("%\u001bN4\u000e")), method2106(method2105("%\u001bN3\u000e")), method2106(method2105("%\u001bN7\u000e")), method2106(method2105("%\u001bN5\u000e")), method2106(method2105("%\u001bN0\u000e")), method2106(method2105("%\u001bN2\u000e")), method2106(method2105("?\u001b\f\u001d")), method2106(method2105("%\u001bN6\u000e")), method2106(method2105("*@N_[")), method2106(method2105("%\u001bNMO?\u0007\u0014O\u000e"))};
   @OriginalMember(
      owner = "client!tu",
      name = "j",
      descriptor = "Lse;"
   )
   public static class6 field3324 = new class6(42, -1);
   @OriginalMember(
      owner = "client!tu",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field3327 = new int[]{28, 35, 40, 44};
   @OriginalMember(
      owner = "client!tu",
      name = "l",
      descriptor = "I"
   )
   public static int field3330 = -60;
   @OriginalMember(
      owner = "client!tu",
      name = "e",
      descriptor = "I"
   )
   public static int field3319;
   @OriginalMember(
      owner = "client!tu",
      name = "d",
      descriptor = "I"
   )
   public static int field3320;
   @OriginalMember(
      owner = "client!tu",
      name = "i",
      descriptor = "I"
   )
   public static int field3321;
   @OriginalMember(
      owner = "client!tu",
      name = "k",
      descriptor = "I"
   )
   public static int field3322;
   @OriginalMember(
      owner = "client!tu",
      name = "f",
      descriptor = "I"
   )
   public static int field3323;
   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "I"
   )
   public static int field3326;
   @OriginalMember(
      owner = "client!tu",
      name = "c",
      descriptor = "I"
   )
   public static int field3328;
   @OriginalMember(
      owner = "client!tu",
      name = "h",
      descriptor = "I"
   )
   public static int field3329;

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2098(byte arg0, int arg1) {
      try {
         class407 var3 = this.field3325;
         synchronized(this.field3325) {
            if (arg0 != -77) {
               method2104((byte)-106);
            }

            this.field3325.method3197(5, arg1);
         }

         ++field3319;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3331[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2099(byte arg0) {
      try {
         ++field3320;
         class407 var2 = this.field3325;
         synchronized(this.field3325) {
            this.field3325.method3201((byte)4);
            if (arg0 != -90) {
               this.field3325 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3331[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2100(int arg0) {
      try {
         ++field3329;
         class407 var2 = this.field3325;
         synchronized(this.field3325) {
            this.field3325.method3187(-23825);
            if (arg0 > -112) {
               field3324 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3331[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "(II)Lmka;"
   )
   private final class398 method2101(int arg0, int arg1) {
      try {
         ++field3326;
         class407 var3 = this.field3325;
         class398 var4;
         synchronized(this.field3325) {
            var4 = (class398)this.field3325.method3192((long)arg1, (byte)-116);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field3318;
            byte[] var6;
            synchronized(this.field3318) {
               var6 = this.field3318.method2697(arg1, 29, false);
               if (arg0 != 28) {
                  method2103(93, -117);
               }
            }

            class398 var7 = new class398();
            if (var6 != null) {
               var7.method3130(new class66(var6), 3);
            }

            class407 var8 = this.field3325;
            synchronized(this.field3325) {
               this.field3325.method3190(var7, (long)arg1, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field3331[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(Len;IIBII)Lnj;"
   )
   public final class468 method2102(class412 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
      boolean var7 = client.field1481;

      try {
         ++field3323;
         class599[] var8 = null;
         class398 var9 = this.method2101(28, arg4);
         if (arg3 <= 61) {
            return null;
         } else {
            if (var9.field5482 != null) {
               var8 = new class599[var9.field5482.length];
               int var10 = 0;
               if (var7 || var8.length > var10) {
                  do {
                     class495 var11 = arg0.method3231(var9.field5482[var10], (byte)86);
                     var8[var10] = new class599(var11.field6909, var11.field6904, var11.field6908, var11.field6910, var11.field6901, var11.field6903, var11.field6900, var11.field6907);
                     ++var10;
                  } while(var8.length > var10);
               }
            }

            return new class468(var9.field5486, var8, var9.field5479, arg1, arg2, arg5);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field3331[7] + (arg0 != null ? field3331[8] : field3331[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class262(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field3318 = arg2;
         this.field3318.method2691(29, 120);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3331[9] + (arg0 != null ? field3331[8] : field3331[6]) + ',' + arg1 + ',' + (arg2 != null ? field3331[8] : field3331[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(II)Lae;"
   )
   public static final class285 method2103(int arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field3322;
         if (arg1 != 28) {
            field3330 = -113;
         }

         class285[] var3 = class78.method741(-97);
         int var4 = 0;
         if (!var2 && ~var4 <= ~var3.length) {
            return null;
         } else {
            do {
               class285 var5 = var3[var4];
               if (~var5.field3949 == ~arg0) {
                  return var5;
               }

               ++var4;
            } while(~var4 > ~var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3331[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2104(byte arg0) {
      try {
         field3324 = null;
         field3327 = null;
         if (arg0 > -27) {
            field3328 = -124;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3331[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2105(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2106(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
