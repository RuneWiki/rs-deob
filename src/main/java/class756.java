import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class756 {
   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11158 = new String[]{method5496(method5495("\u000bW\u0004\u00006")), method5496(method5495("\u000bW\u0004\u00026")), method5496(method5495("\u000bW\u0004\u00056")), method5496(method5495("\u000bW\u0004\u00036")), method5496(method5495("\u0018\u001b\u0004hc")), method5496(method5495("\u000bW\u0004\u00076")), method5496(method5495("\u0006SK")), method5496(method5495("\r@F*")), method5496(method5495("\u000bW\u0004\u00046"))};
   @OriginalMember(
      owner = "client!hb",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field11153 = false;
   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "I"
   )
   public static int field11148;
   @OriginalMember(
      owner = "client!hb",
      name = "h",
      descriptor = "I"
   )
   public int field11149;
   @OriginalMember(
      owner = "client!hb",
      name = "f",
      descriptor = "I"
   )
   public int field11150;
   @OriginalMember(
      owner = "client!hb",
      name = "j",
      descriptor = "I"
   )
   public static int field11151;
   @OriginalMember(
      owner = "client!hb",
      name = "c",
      descriptor = "I"
   )
   public static int field11152;
   @OriginalMember(
      owner = "client!hb",
      name = "e",
      descriptor = "I"
   )
   public int field11154;
   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "I"
   )
   public static int field11155;
   @OriginalMember(
      owner = "client!hb",
      name = "i",
      descriptor = "I"
   )
   public static int field11156;
   @OriginalMember(
      owner = "client!hb",
      name = "g",
      descriptor = "I"
   )
   public static int field11157;

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method5489(int arg0) {
      int var1 = client.field4530;

      try {
         ++field11151;

         while(true) {
            if (class401.field6163.method3834(class61.field759, 8) >= 15) {
               int var2 = class401.field6163.method3829(-70, 15);
               if (var2 != 32767) {
                  boolean var3 = false;
                  class726 var4 = (class726)class259.field3509.method5681((long)var2, -1);
                  if (var4 == null) {
                     class155 var5 = new class155();
                     var5.field6027 = var2;
                     var4 = new class726(var5);
                     class259.field3509.method5682((long)var2, var4, (byte)7);
                     var3 = true;
                     class506.field7478[class132.field1657++] = var4;
                  }

                  class155 var6 = var4.field10794;
                  class115.field1381[class159.field2021++] = var2;
                  var6.field6088 = class109.field1338;
                  if (var6.field1971 != null && var6.field1971.method2871(arg0 + -1937382822)) {
                     class58.method487(false, var6);
                  }

                  int var7 = class401.field6163.method3829(-20, 1);
                  if (var7 == 1) {
                     class96.field1189[class144.field1823++] = var2;
                  }

                  int var8 = class401.field6163.method3829(arg0 + -1937382831, 2);
                  int var9 = 14718 & 4 + class401.field6163.method3829(-35, 3) << 11;
                  int var10 = class401.field6163.method3829(arg0 + -1937382824, 1);
                  var6.method1288(-120, class536.field7845.method3363(class401.field6163.method3829(-49, 14), false));
                  int var11 = class401.field6163.method3829(-23, 5);
                  if (~var11 < -16) {
                     var11 -= 32;
                  }

                  int var12 = class401.field6163.method3829(-108, 5);
                  if (var12 > 15) {
                     var12 -= 32;
                  }

                  var6.method3043((byte)-120, var6.field1971.field5589);
                  var6.field6104 = var6.field1971.field5628 << 3;
                  if (var3) {
                     var6.method3048(10, var9, true);
                  }

                  var6.method1279(class693.field10418.field6116[0] + var12, var6.method3046(-34), var8, (byte)-11, ~var10 == -2, class693.field10418.field6114[0] + var11);
                  if (!var6.field1971.method2871(arg0 ^ -1937382714)) {
                     continue;
                  }

                  class597.method4374(1111756009, 0, (class687)null, var6.field6116[0], (class557)null, var6.field9010, var6.field6114[0], var6);
                  if (var1 != 0) {
                     break;
                  }

                  if (var1 == 0) {
                     continue;
                  }
               }
            }

            if (arg0 != 1937382723) {
               return;
            }

            class401.field6163.method3840((byte)-106);
            break;
         }

      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field11158[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(I)Z",
      line = 97
   )
   public final boolean method5490(int arg0) {
      try {
         if (arg0 < 18) {
            return false;
         } else {
            ++field11152;
            return (this.field11149 & 4) != 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11158[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "c",
      descriptor = "(I)Z",
      line = 110
   )
   public final boolean method5491(int arg0) {
      try {
         ++field11156;
         if (arg0 != -28939) {
            field11153 = false;
         }

         return ~(8 & this.field11149) != -1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11158[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(B)Z",
      line = 123
   )
   public final boolean method5492(byte arg0) {
      try {
         ++field11148;
         int var2 = 40 % ((arg0 - -44) / 61);
         return ~(this.field11149 & 2) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11158[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "([BIZ)Ljava/lang/Object;",
      line = 135
   )
   public static final Object method5493(byte[] arg0, int arg1, boolean arg2) {
      try {
         int var3 = 25 / ((arg1 - -64) / 32);
         ++field11155;
         if (arg0 == null) {
            return null;
         } else {
            if (~arg0.length < -137 && !class132.field1656) {
               try {
                  class65 var4 = (class65)Class.forName(field11158[6]).newInstance();
                  var4.method532((byte)50, arg0);
                  return var4;
               } catch (Throwable var6) {
                  class132.field1656 = true;
               }
            }

            return arg2 ? class729.method5311((byte)-4, arg0) : arg0;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11158[5] + (arg0 != null ? field11158[4] : field11158[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(B)Z",
      line = 167
   )
   public final boolean method5494(byte arg0) {
      try {
         int var2 = -128 % ((-8 - arg0) / 35);
         ++field11157;
         return ~(1 & this.field11149) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11158[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5495(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5496(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
