import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class258 {
   @OriginalMember(
      owner = "client!cca",
      name = "f",
      descriptor = "Lgw;"
   )
   private class179 field3660 = new class179(64);
   @OriginalMember(
      owner = "client!cca",
      name = "g",
      descriptor = "Lhw;"
   )
   private class141 field3667;
   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3668 = new String[]{method2078(method2077("H\b/nE\u0003")), method2078(method2077("H\b/nJ\u0003")), method2078(method2077("H\b/nC\u0003")), method2078(method2077("H\b/nG\u0003")), method2078(method2077("d\b-,wO\u000en\u0003cG\bn\u0014mD\u0000t`")), method2078(method2077("\u000b*-4k]\u000et`")), method2078(method2077("d\b-,wO\u000e*z\"l\u0019!5lOQ")), method2078(method2077("^\u0018")), method2078(method2077("\u000b</,nXQn")), method2078(method2077("d\b-,wO\u000e<38\u000b")), method2078(method2077("\u007f\u0004:!n\u000b?<!lXK\u0001.qH\u0019+%l\u0011K")), method2078(method2077("\u000b(\u001e38\u000b")), method2078(method2077("\u000b;'8gG\u0018t`")), method2078(method2077("\u007f\u0004:!n\u000b$>!s^\u000en\u000flX\b<%gEQn")), method2078(method2077("o\u0012 !oB\bt`")), method2078(method2077("E\u001e\",")), method2078(method2077("PE`n\u007f")), method2078(method2077("H\b/nD\u0003")), method2078(method2077("H\b/nA\u0003")), method2078(method2077("H\b/n@\u0003")), method2078(method2077("H\b/n>B\u0005'4<\u0003")), method2078(method2077("H\b/nF\u0003"))};
   @OriginalMember(
      owner = "client!cca",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field3657 = false;
   @OriginalMember(
      owner = "client!cca",
      name = "k",
      descriptor = "I"
   )
   public static int field3658;
   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "I"
   )
   public static int field3659;
   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "I"
   )
   public static int field3661;
   @OriginalMember(
      owner = "client!cca",
      name = "i",
      descriptor = "I"
   )
   public static int field3662;
   @OriginalMember(
      owner = "client!cca",
      name = "e",
      descriptor = "I"
   )
   public static int field3663;
   @OriginalMember(
      owner = "client!cca",
      name = "d",
      descriptor = "I"
   )
   public static int field3664;
   @OriginalMember(
      owner = "client!cca",
      name = "j",
      descriptor = "I"
   )
   public static int field3665;
   @OriginalMember(
      owner = "client!cca",
      name = "c",
      descriptor = "I"
   )
   public static int field3666;

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2068(int arg0) {
      try {
         ++field3663;
         class179 var2 = this.field3660;
         synchronized(this.field3660) {
            this.field3660.method1591((byte)58);
            if (arg0 < 30) {
               method2073();
            }

         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3668[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method2069(int arg0, boolean arg1) {
      try {
         class179 var3 = this.field3660;
         synchronized(this.field3660) {
            if (arg1) {
               return;
            }

            this.field3660.method1589((byte)92);
            this.field3660 = new class179(arg0);
         }

         ++field3664;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3668[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2070(int arg0, int arg1, int arg2) {
      try {
         ++field3665;
         ++class352.field4977;
         class542 var3 = class549.method4093((byte)-113, class722.field10448, class126.field2108);
         var3.field7859.method3554(arg2, arg0 + -4745);
         var3.field7859.method3540(arg1, 898075920);
         if (arg0 != 5000) {
            field3657 = true;
         }

         class740.method5332(var3, (byte)77);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3668[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2071(int arg0) {
      try {
         if (arg0 != -256) {
            this.field3660 = null;
         }

         class179 var2 = this.field3660;
         synchronized(this.field3660) {
            this.field3660.method1589((byte)81);
         }

         ++field3659;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3668[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2072(int arg0, byte arg1) {
      try {
         class179 var3 = this.field3660;
         synchronized(this.field3660) {
            this.field3660.method1579(-92, arg0);
            int var4 = 29 % ((-49 - arg1) / 54);
         }

         ++field3658;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3668[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2073() {
      byte var0 = 10;
      byte var1 = 30;
      if (class413.field6047 != 0 && class543.field7869 != null) {
         class49.field1047.method254(class8.field83);

         for(int var2 = 0; var2 < class474.field6930.length; ++var2) {
            class49.field1047.method695(class8.field83[1], class8.field83[3] - class8.field83[1], -256, class474.field6930[var2] + class172.field2660[var2], (byte)122);
         }

         for(int var3 = 0; var3 < class203.field3041; ++var3) {
            class743 var11 = class128.field2141[var3];
            class49.field1047.method367(var11.field10702[0], var11.field10705[0], var11.field10704[0], class745.field10755);
            class49.field1047.method367(var11.field10702[1], var11.field10705[1], var11.field10704[1], class93.field1517);
            class49.field1047.method367(var11.field10702[2], var11.field10705[2], var11.field10704[2], class412.field6036);
            class49.field1047.method367(var11.field10702[3], var11.field10705[3], var11.field10704[3], class491.field7153);
            if (class745.field10755[2] != -1 && class93.field1517[2] != -1 && class412.field6036[2] != -1 && class491.field7153[2] != -1) {
               int var12 = -65536;
               if (var11.field10710 == 4) {
                  var12 = -16776961;
               }

               class49.field1047.method689(class93.field1517[1], var12, class745.field10755[0], class745.field10755[1], class93.field1517[0], (byte)-110);
               class49.field1047.method689(class412.field6036[1], var12, class93.field1517[0], class93.field1517[1], class412.field6036[0], (byte)-120);
               class49.field1047.method689(class491.field7153[1], var12, class412.field6036[0], class412.field6036[1], class491.field7153[0], (byte)-117);
               class49.field1047.method689(class745.field10755[1], var12, class491.field7153[0], class491.field7153[1], class745.field10755[0], (byte)-121);
               class49.field1047.method689(class412.field6036[1], var12, class745.field10755[0], class745.field10755[1], class412.field6036[0], (byte)-110);
            }
         }

         class543.field7869.method711(var0, -16777216, var1 + 45, 0, -256, field3668[14] + class103.field1682 + "/" + 5000);
         class543.field7869.method711(var0, -16777216, var1 + 60, 0, -256, field3668[13] + class353.field4993 + "/" + 10000);
         class543.field7869.method711(var0, -16777216, var1 + 75, 0, -256, field3668[10] + class302.field4216 + "/" + 5000);
         class543.field7869.method711(var0, -16777216, var1 + 90, 0, -256, field3668[9] + (class614.field8921 + class38.field912) + field3668[5] + class203.field3041);
         class543.field7869.method711(var0, -16777216, var1 + 105, 0, -256, field3668[6] + class341.field4852 + field3668[8] + class57.field1127 + field3668[11] + class622.field9077 + field3668[12] + class771.field11305);
         class543.field7869.method711(var0, -16777216, var1 + 120, 0, -256, field3668[4] + class766.field11105 / 1000L + field3668[7]);
         if (class413.field6047 == 2 && class596.field8597 != null) {
            for(int var4 = 0; var4 < class596.field8597.length; ++var4) {
               float var6 = (float)class596.field8597[var4];
               float var7 = var6 / 4194304.0F;
               if (var7 > 1.0F) {
                  var7 = 1.0F;
               }

               float var8 = var7 * 255.0F;
               float var9 = 255.0F - var8;
               int var10 = (int)var9;
               class596.field8597[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
            }

            class476 var5 = class49.field1047.method696(class533.field7769, class580.field8327, 0, -63, class580.field8327, class596.field8597);
            var5.method1055(var0, 170, 1, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2074(int arg0) {
      try {
         if (arg0 != -14651) {
            field3657 = true;
         }

         ++field3661;
         if (!class566.field8215) {
            class566.field8215 = true;
            class261.field3714 = true;
            class588.field8498 += (-class588.field8498 + -24.0F) / 2.0F;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3668[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(IIIIIIILjava/lang/String;)V"
   )
   public static final void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
      try {
         ++field3662;
         if (arg1 == -256) {
            class408 var8 = new class408();
            var8.field5991 = arg3;
            var8.field5990 = arg4;
            var8.field5997 = arg0;
            var8.field6001 = class29.field458 + arg6;
            var8.field5996 = arg2;
            var8.field5992 = arg7;
            var8.field5998 = arg5;
            class563.field8189.method1398(true, var8);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3668[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field3668[16] : field3668[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "(IB)Ljha;"
   )
   public final class722 method2076(int arg0, byte arg1) {
      try {
         ++field3666;
         if (arg1 != -101) {
            field3657 = true;
         }

         class179 var3 = this.field3660;
         class722 var4;
         synchronized(this.field3660) {
            var4 = (class722)this.field3660.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field3667;
            byte[] var6;
            synchronized(this.field3667) {
               var6 = this.field3667.method1347((byte)122, class385.method2992(arg0, false), class535.method4004(28, arg0));
            }

            class722 var7 = new class722();
            if (var6 != null) {
               var7.method5241(new class473(var6), -128);
            }

            class179 var8 = this.field3660;
            synchronized(this.field3660) {
               this.field3660.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field3668[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class258(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field3667 = arg2;
         if (this.field3667 != null) {
            int var4 = this.field3667.method1337((byte)94) - 1;
            this.field3667.method1346(var4, 0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3668[20] + (arg0 != null ? field3668[16] : field3668[15]) + ',' + arg1 + ',' + (arg2 != null ? field3668[16] : field3668[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2077(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2078(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
