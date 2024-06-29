import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class220 extends class557 {
   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3153 = new String[]{method1910(method1909("WT)\u000eQ\u0010")), method1910(method1909("WT)\u000eY\u0010")), method1910(method1909("C\u0019f\u000ef")), method1910(method1909("VB$L")), method1910(method1909("WT)\u000e_\u0010")), method1910(method1909("WT)\u000e]\u0010")), method1910(method1909("WT)\u000eS\u0010")), method1910(method1909("WT)\u000e^\u0010")), method1910(method1909("WT)\u000eR\u0010")), method1910(method1909("WT)\u000e\\\u0010")), method1910(method1909("WT)\u000eZ\u0010")), method1910(method1909("WT)\u000eX\u0010"))};
   @OriginalMember(
      owner = "client!oca",
      name = "j",
      descriptor = "Ldi;"
   )
   public static class577 field3142 = new class577(5, 1);
   @OriginalMember(
      owner = "client!oca",
      name = "q",
      descriptor = "I"
   )
   public static int field3141;
   @OriginalMember(
      owner = "client!oca",
      name = "o",
      descriptor = "I"
   )
   public static int field3143;
   @OriginalMember(
      owner = "client!oca",
      name = "i",
      descriptor = "I"
   )
   public static int field3146;
   @OriginalMember(
      owner = "client!oca",
      name = "s",
      descriptor = "I"
   )
   public static int field3147;
   @OriginalMember(
      owner = "client!oca",
      name = "l",
      descriptor = "I"
   )
   public static int field3148;
   @OriginalMember(
      owner = "client!oca",
      name = "k",
      descriptor = "I"
   )
   public static int field3149;
   @OriginalMember(
      owner = "client!oca",
      name = "n",
      descriptor = "I"
   )
   public static int field3150;
   @OriginalMember(
      owner = "client!oca",
      name = "r",
      descriptor = "I"
   )
   public static int field3151;
   @OriginalMember(
      owner = "client!oca",
      name = "p",
      descriptor = "I"
   )
   public static int field3152;
   @OriginalMember(
      owner = "client!oca",
      name = "h",
      descriptor = "Laaa;"
   )
   public static class393 field3144;
   @OriginalMember(
      owner = "client!oca",
      name = "m",
      descriptor = "[B"
   )
   public static byte[] field3145;

   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method1903(int arg0, int arg1) {
      try {
         ++field3152;
         return arg1 != 1 ? -78 : 255 & arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3153[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "c",
      descriptor = "(II)Z"
   )
   public static final boolean method1904(int arg0, int arg1) {
      try {
         ++field3143;
         if (arg0 != 0) {
            return false;
         } else if (~arg1 != -12 && arg1 != 10 && ~arg1 != -16 && ~arg1 != -52 && ~arg1 != -59 && arg1 != 1004) {
            return ~arg1 == -51;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3153[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class220(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field3147;
         if (~super.field7905 > -2 || ~super.field7905 < -4) {
            super.field7905 = this.method97(0);
         }

         if (arg0 != -22) {
            field3145 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3153[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1905(int arg0) {
      try {
         ++field3141;
         if (arg0 >= -52) {
            this.method97(-90);
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3153[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(ILjga;Z)V"
   )
   public static final void method1906(int arg0, class91 arg1, boolean arg2) {
      try {
         ++field3146;
         int var3 = ~arg1.field1457 == -1 ? arg1.field1513 : arg1.field1457;
         int var4 = arg1.field1393 != 0 ? arg1.field1393 : arg1.field1452;
         class164.method1541(class315.field4719[arg1.field1356 >> 16], true, var4, arg1.field1356, var3, arg2);
         if (arg1.field1373 != null) {
            class164.method1541(arg1.field1373, true, var4, arg1.field1356, var3, arg2);
         }

         if (arg0 != -9278) {
            method1903(-24, 16);
         }

         class733 var5 = (class733)class139.field2228.method3101(arg0 ^ 9277, (long)arg1.field1356);
         if (var5 != null) {
            class588.method4314(var4, var5.field10417, var3, -106, arg2);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3153[10] + arg0 + ',' + (arg1 != null ? field3153[2] : field3153[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(ILsa;IZ)Led;"
   )
   public static final class58 method1907(int arg0, class39 arg1, int arg2, boolean arg3) {
      boolean var4 = client.field10022;

      try {
         ++field3150;
         if (!arg3) {
            method1903(-26, 1);
         }

         class65 var5 = new class65(arg1.method460((byte)-11, arg2, arg0));
         class58 var6 = new class58(arg2, var5.method640((byte)51), var5.method640((byte)51), var5.method701(255), var5.method701(255), var5.method665(false) == 1, var5.method665(!arg3), var5.method665(false));
         int var7 = var5.method665(!arg3);
         int var8 = 0;
         class58 var10000;
         if (var4) {
            var10000 = var6;
         } else if (~var8 <= ~var7) {
            var6.method599(false);
            var10000 = var6;
            if (!var4) {
               return var6;
            }
         } else {
            var10000 = var6;
         }

         while(true) {
            var10000.field828.method2238(new class209(var5.method665(false), var5.method685(-2), var5.method685(-2), var5.method685(-2), var5.method685(-2), var5.method685(-2), var5.method685(-2), var5.method685(-2), var5.method685(-2)), 13);
            ++var8;
            if (~var8 <= ~var7) {
               var6.method599(false);
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = var6;
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3153[1] + arg0 + ',' + (arg1 != null ? field3153[2] : field3153[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            return -128;
         } else {
            ++field3151;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3153[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field3145 = null;
         }

         super.field7905 = arg0;
         ++field3149;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3153[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class220(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!oca",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1908(int arg0) {
      try {
         if (arg0 >= 10) {
            field3142 = null;
            field3145 = null;
            field3144 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3153[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field3148;
         if (arg0 != 0) {
            field3145 = null;
         }

         return super.field7906.method4714((byte)-40).method5255((byte)17) ? 3 : 2;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3153[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1909(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1910(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
