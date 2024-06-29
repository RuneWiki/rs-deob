import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class208 {
   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3098 = new String[]{method1778(method1777("\u0007\"[Ph\u001d.QH\u007f\u0010")), method1778(method1777("\u0003,U\t\u007f\\")), method1778(method1777("\u000fd\u001a\tC")), method1778(method1777("\u001a?XK")), method1778(method1777("\u0003,U\tz\\")), method1778(method1777("\u0003,U\tx\\")), method1778(method1777("\u0003,U\t|\\")), method1778(method1777("H)[K\u0003\u0012,RA\u000eDt")), method1778(method1777("H)[K\u0003\u0017zRA\u000eDt")), method1778(method1777("H)[K\u0003\u0012,\u0007\u0017\u000eDt")), method1778(method1777("H)[K\u0003LzRA\u000eDt")), method1778(method1777("H)[K\u0003\u0012,V\u0017\u000eDt")), method1778(method1777("H)[K\u0003@zRA\u000eDt")), method1778(method1777("H)[K\u0003DzRA\u000eDt")), method1778(method1777("H)[K\u0003\u0012,\u0004\u0017\u000eDt")), method1778(method1777("H)[K\u0003\u0012,\u0003\u0017\u000eDt")), method1778(method1777("\u0003,U\t}\\")), method1778(method1777("\u0003,U\ty\\"))};
   @OriginalMember(
      owner = "client!wfa",
      name = "e",
      descriptor = "I"
   )
   public static int field3092;
   @OriginalMember(
      owner = "client!wfa",
      name = "f",
      descriptor = "I"
   )
   public static int field3093;
   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "I"
   )
   public static int field3094;
   @OriginalMember(
      owner = "client!wfa",
      name = "c",
      descriptor = "I"
   )
   public static int field3095;
   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "I"
   )
   public static int field3096;
   @OriginalMember(
      owner = "client!wfa",
      name = "d",
      descriptor = "I"
   )
   public static int field3097;

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(II)I",
      line = 5
   )
   public static final int method1770(int arg0, int arg1) {
      try {
         int var5 = (arg0 & 1431655765) - -((-1431655765 & arg0) >>> 1);
         ++field3097;
         int var6 = (1932735283 & var5 >>> 2) + (var5 & 858993459);
         int var2 = -2 % ((35 - arg1) / 63);
         int var7 = 252645135 & (var6 >>> 4) + var6;
         int var8 = (var7 >>> 8) + var7;
         int var9 = (var8 >>> 16) + var8;
         return 255 & var9;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3098[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(ILhw;I)Ltd;",
      line = 22
   )
   public static final class476 method1771(int arg0, class141 arg1, int arg2) {
      try {
         ++field3093;
         if (arg2 > -59) {
            return null;
         } else {
            class476 var3 = (class476)class115.field1862.method1584((long)arg0, 1);
            if (var3 == null) {
               label27: {
                  if (class455.field6646) {
                     var3 = class444.field6473.method307(class94.method919(arg1, arg0), true);
                     if (!client.field4564) {
                        break label27;
                     }
                  }

                  var3 = class607.method4458((byte)-122, arg1.method1331((byte)-98, arg0));
               }

               class115.field1862.method1581((long)arg0, 0, var3);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3098[4] + arg0 + ',' + (arg1 != null ? field3098[2] : field3098[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "(III)V",
      line = 46
   )
   public static final void method1772(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      if (var3 != null) {
         class428.method3232(var3.field8654);
         if (var3.field8654 != null) {
            var3.field8654 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(IIILjava/lang/Object;)[B",
      line = 57
   )
   public static final byte[] method1773(int arg0, int arg1, int arg2, Object arg3) {
      try {
         ++field3095;
         if (arg3 == null) {
            return null;
         } else {
            int var4 = -33 / ((arg1 - 22) / 32);
            if (arg3 instanceof byte[]) {
               byte[] var5 = (byte[])arg3;
               return class5.method40(arg0, 62, arg2, var5);
            } else if (arg3 instanceof class277) {
               class277 var6 = (class277)arg3;
               return var6.method2172(arg0, arg2, (byte)64);
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3098[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3098[2] : field3098[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(ZLkk;)V",
      line = 91
   )
   public static final void method1774(boolean arg0, class200 arg1) {
      boolean var2 = client.field4564;

      try {
         arg1.method1711((byte)125);
         ++field3096;
         int var3 = class20.field324;
         class457 var4 = class304.field4398 = class458.field6723[var3] = new class457();
         var4.field11306 = var3;
         int var5 = arg1.method1714((byte)-34, 30);
         byte var6 = (byte)(var5 >> 28);
         int var7 = (var5 & 268426554) >> 14;
         var4.field11313[0] = var7 - class347.field4939;
         int var8 = 16383 & var5;
         var4.field4101 = (var4.field11313[0] << 9) + (var4.method3438(false) << 8);
         var4.field11322[0] = -class753.field10887 + var8;
         var4.field4096 = (var4.field11322[0] << 9) - -(var4.method3438(false) << 8);
         class731.field10504 = var4.field4090 = var4.field4091 = var6;
         if (class561.method4189(var4.field11313[0], -32018, var4.field11322[0])) {
            ++var4.field4091;
         }

         if (class774.field11341[var3] != null) {
            var4.method3433(-67, class774.field11341[var3]);
         }

         class158.field2525 = 0;
         class442.field6446[class158.field2525++] = var3;
         class495.field7244[var3] = 0;
         class283.field3955 = 0;
         int var9 = 1;
         int var10000;
         int var10001;
         if (var2) {
            var10000 = ~var9;
            var10001 = ~var3;
         } else if (~var9 <= -2049) {
            arg1.method1719(-1537210170);
            var10000 = arg0;
            var10001 = 1;
            if (!var2) {
               if (arg0 != 1) {
                  method1773(-31, -88, -60, (Object)null);
                  return;
               }

               return;
            }
         } else {
            var10000 = ~var9;
            var10001 = ~var3;
         }

         while(true) {
            if (var10000 != var10001) {
               int var10 = arg1.method1714((byte)-34, 18);
               int var11 = var10 >> 16;
               int var12 = (65390 & var10) >> 8;
               int var13 = 255 & var10;
               class312 var14 = class60.field1140[var9] = new class312();
               var14.field4489 = false;
               var14.field4492 = false;
               var14.field4493 = 0;
               var14.field4490 = -1;
               var14.field4494 = (var11 << 28) + (var12 << 14) + var13;
               class729.field10496[class283.field3955++] = var9;
               class495.field7244[var9] = 0;
            }

            ++var9;
            if (~var9 <= -2049) {
               arg1.method1719(-1537210170);
               var10000 = arg0;
               var10001 = 1;
               if (!var2) {
                  if (arg0 != 1) {
                     method1773(-31, -88, -60, (Object)null);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = ~var9;
               var10001 = ~var3;
            }
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field3098[17] + arg0 + ',' + (arg1 != null ? field3098[2] : field3098[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(III)Ljava/lang/String;",
      line = 167
   )
   public static final String method1775(int arg0, int arg1, int arg2) {
      try {
         ++field3094;
         int var3 = -arg2 + arg1;
         if (var3 < -9) {
            return field3098[14];
         } else if (~var3 > 5) {
            return field3098[9];
         } else if (arg0 > -36) {
            return null;
         } else if (var3 < -3) {
            return field3098[15];
         } else if (var3 < 0) {
            return field3098[11];
         } else if (~var3 < -10) {
            return field3098[13];
         } else if (~var3 < -7) {
            return field3098[12];
         } else if (~var3 < -4) {
            return field3098[10];
         } else {
            return ~var3 < -1 ? field3098[8] : field3098[7];
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3098[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(Z)Z",
      line = 210
   )
   public static final boolean method1776(boolean arg0) {
      try {
         ++field3092;
         if (arg0) {
            return true;
         } else {
            if (class741.field10680) {
               try {
                  class575.method4254(class514.field7493, (byte)16, field3098[0]);
                  return true;
               } catch (Throwable var2) {
               }
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3098[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1777(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1778(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
