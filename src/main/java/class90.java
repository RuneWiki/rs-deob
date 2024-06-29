import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public abstract class class90 {
   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1157 = new String[]{method862(method861("\u0016\u0014%M\u000fU")), method862(method861("\u0013\u0002(\u000f")), method862(method861("\u0006YjM4")), method862(method861("\u0016\u0014%M\u000eU")), method862(method861("\u0016\u0014%M\fU")), method862(method861("\u0016\u0014%M\rU")), method862(method861("\u0016\u0014%M\u0001U")), method862(method861("]\u00076\f?\u0014\u0013!\u0007")), method862(method861("\u0016\u0014%M\nU")), method862(method861("3\u0018*C*\rFvV{]\u0014,\u0002;\u001c\u00140\u0006;]G<")), method862(method861("PZzC")), method862(method861("\u0016\u0014%M\u0000U")), method862(method861("?\u0002-\u000f-GWrV}"))};
   @OriginalMember(
      owner = "client!kca",
      name = "j",
      descriptor = "S"
   )
   public static short field1147 = 256;
   @OriginalMember(
      owner = "client!kca",
      name = "l",
      descriptor = "Lnw;"
   )
   public static class616 field1145 = new class616(63, 4);
   @OriginalMember(
      owner = "client!kca",
      name = "m",
      descriptor = "I"
   )
   public static int field1156 = 0;
   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "Lnw;"
   )
   public static class616 field1155 = new class616(57, -1);
   @OriginalMember(
      owner = "client!kca",
      name = "e",
      descriptor = "I"
   )
   public int field1144;
   @OriginalMember(
      owner = "client!kca",
      name = "f",
      descriptor = "I"
   )
   public static int field1148;
   @OriginalMember(
      owner = "client!kca",
      name = "g",
      descriptor = "I"
   )
   public static int field1149;
   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "I"
   )
   public static int field1150;
   @OriginalMember(
      owner = "client!kca",
      name = "c",
      descriptor = "I"
   )
   public static int field1151;
   @OriginalMember(
      owner = "client!kca",
      name = "k",
      descriptor = "I"
   )
   public static int field1152;
   @OriginalMember(
      owner = "client!kca",
      name = "i",
      descriptor = "I"
   )
   public static int field1153;
   @OriginalMember(
      owner = "client!kca",
      name = "d",
      descriptor = "I"
   )
   public static int field1154;
   @OriginalMember(
      owner = "client!kca",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field1146;

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method853(boolean arg0) {
      try {
         if (arg0) {
            method855((byte)22, (byte)8);
         }

         field1145 = null;
         field1155 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1157[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method854(class65 arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field1148;
         int var3 = 0;
         int var4 = 0;
         if (class775.field11283) {
            var3 = class101.method916(38);
            var4 = class291.method2190(-95);
         }

         int var10000;
         int var10001;
         label81: {
            arg0.method577(var3, var4, class252.field3194 - -var3, var4 + 350);
            arg0.method508(var3, var4, class252.field3194, 350, 3351159 | class477.field6595 << 24, 1);
            class534.method3842(0, class252.field3194 + var3, var4 + 350, var4, var3);
            int var5 = 350 / class386.field5413;
            if (~class86.field1112 < -1) {
               label87: {
                  int var6 = -class386.field5413 + 342;
                  int var7 = var5 * var6 / (class86.field1112 + -1 + var5);
                  int var8 = 4;
                  if (~class86.field1112 < -2) {
                     var8 += (class86.field1112 + -1 + -class107.field1367) * (-var7 + var6) / (class86.field1112 - 1);
                  }

                  arg0.method508(var3 + -16 - -class252.field3194, var4 + var8, 12, var7, class477.field6595 << 24 | 3351159, 2);
                  int var9 = class107.field1367;
                  if (!var2) {
                     if (~var9 <= ~(class107.field1367 + var5)) {
                        break label87;
                     }

                     var10000 = ~var9;
                     var10001 = ~class86.field1112;
                     if (var2) {
                        break label81;
                     }

                     if (var10000 <= var10001) {
                        break label87;
                     }
                  }

                  do {
                     String[] var10 = class249.method1870('\b', class440.field6113[var9], false);
                     int var11 = (class252.field3194 + -24) / var10.length;
                     int var12 = 0;
                     if (var2 || var12 < var10.length) {
                        do {
                           int var13 = var11 * var12 + 8;
                           arg0.method577(var3 + var13, var4, var13 - 8 + var3 + var11, var4 - -350);
                           class163.field2095.method630(-1, -class422.field5940 + -2 + var4 - (class22.field281.field9444 - -((-class107.field1367 + var9) * class386.field5413) + -350), class529.method3818(var10[var12], 96), -16777216, var3 + var13, 16656);
                           ++var12;
                        } while(var12 < var10.length);
                     }

                     ++var9;
                     if (~var9 <= ~(class107.field1367 + var5)) {
                        break;
                     }

                     var10000 = ~var9;
                     var10001 = ~class86.field1112;
                     if (var2) {
                        break label81;
                     }
                  } while(var10000 > var10001);
               }
            }

            class183.field2263.method624(-16777216, field1157[12], var4 + 350 + -20, -1, var3 + -25 - -class252.field3194, -128);
            arg0.method577(var3, var4, class252.field3194 + var3, var4 + 350);
            arg0.method609(1, -1, var3, var4 - -350 + -class422.field5940, class252.field3194);
            class101.field1310.method630(-1, -class101.field1304.field9444 - 1 + var4 + 350, field1157[10] + class529.method3818(class203.field2495, 85), -16777216, var3 - -10, 16656);
            var10000 = arg1;
            var10001 = -111;
         }

         if (var10000 <= var10001) {
            if (class308.field4094) {
               int var14 = -1;
               if (~(class369.field5205 % 30) < -16) {
                  var14 = 16777215;
               }

               arg0.method587(var4 + -11 - (-350 - -class101.field1304.field9444), var14, class101.field1304.method4803(field1157[10] + class529.method3818(class203.field2495, 2).substring(0, class7.field66), (byte)-124) + var3 + 10, 12, (byte)-62);
            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field1157[11] + (arg0 != null ? field1157[2] : field1157[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(BB)C"
   )
   public static final char method855(byte arg0, byte arg1) {
      try {
         ++field1150;
         int var2 = 255 & arg0;
         int var3 = -11 / ((arg1 - 29) / 51);
         if (var2 == 0) {
            throw new IllegalArgumentException(field1157[9] + Integer.toString(var2, 16) + field1157[7]);
         } else {
            if (var2 >= 128 && ~var2 > -161) {
               char var4 = class79.field989[var2 + -128];
               if (var4 == 0) {
                  var4 = '?';
               }

               var2 = var4;
            }

            return (char)var2;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1157[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "(Z)Ljava/net/Socket;"
   )
   public final Socket method856(boolean arg0) throws IOException {
      try {
         ++field1152;
         if (arg0) {
            field1154 = 9;
         }

         return new Socket(this.field1146, this.field1144);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1157[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method857(int arg0, byte arg1) {
      try {
         if (arg1 <= 4) {
            return -93;
         } else {
            ++field1149;
            return arg0 & 255;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1157[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public abstract Socket method858(int arg0) throws IOException;

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method859(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(ZLqh;Ljava/lang/String;B)Lgca;"
   )
   public static final class263 method860(boolean arg0, class74 arg1, String arg2, byte arg3) {
      boolean var4 = client.field4273;

      try {
         ++field1153;
         int var5 = arg1.method740(-1, arg2);
         if (arg3 >= -97) {
            return null;
         } else if (var5 == -1) {
            return new class263(0);
         } else {
            int[] var6 = arg1.method730(var5, (byte)110);
            class263 var7 = new class263(var6.length);
            int var8 = 0;
            int var9 = 0;
            class594 var10;
            int var11;
            int var12;
            int var13;
            if (var4) {
               var10 = new class594(arg1.method732(var6[var9++], var5, (byte)96));
               var11 = var10.method4302(true);
               var12 = var10.method4280(-19104);
               var13 = var10.method4288((byte)92);
               if (!arg0) {
                  if (var13 == 1) {
                     --var7.field3436;
                     if (var4) {
                        var7.field3438[var8] = var11;
                        var7.field3435[var8] = var12;
                        ++var8;
                     }
                  } else {
                     var7.field3438[var8] = var11;
                     var7.field3435[var8] = var12;
                     ++var8;
                  }
               } else {
                  var7.field3438[var8] = var11;
                  var7.field3435[var8] = var12;
                  ++var8;
               }
            }

            do {
               while(var8 < var7.field3436) {
                  var10 = new class594(arg1.method732(var6[var9++], var5, (byte)96));
                  var11 = var10.method4302(true);
                  var12 = var10.method4280(-19104);
                  var13 = var10.method4288((byte)92);
                  if (!arg0) {
                     if (var13 == 1) {
                        --var7.field3436;
                        if (var4) {
                           var7.field3438[var8] = var11;
                           var7.field3435[var8] = var12;
                           ++var8;
                        }
                     } else {
                        var7.field3438[var8] = var11;
                        var7.field3435[var8] = var12;
                        ++var8;
                     }
                  } else {
                     var7.field3438[var8] = var11;
                     var7.field3435[var8] = var12;
                     ++var8;
                  }
               }
            } while(var4);

            return var7;
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field1157[3] + arg0 + ',' + (arg1 != null ? field1157[2] : field1157[1]) + ',' + (arg2 != null ? field1157[2] : field1157[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method861(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method862(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
