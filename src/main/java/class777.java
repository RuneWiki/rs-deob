import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class777 {
   @OriginalMember(
      owner = "client!kr",
      name = "l",
      descriptor = "J"
   )
   private long field11345 = -1L;
   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "Lum;"
   )
   private class550 field11348 = new class550();
   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11358 = new String[]{method5601(method5600("(6\u0015N\u0005")), method5601(method5600("-1Wc")), method5601(method5600("8j\u0015!P")), method5601(method5600("(6\u0015M\u0005")), method5601(method5600("\u0016*IjN,#Uf^& \u001bLA\"*xgL-*^ci&(On\r7=Kj\r**\u001bkH +_j\u0005j")), method5601(method5600("(6\u00153D--O1\u0005")), method5601(method5600("\u0000(Zan+%UaH/\u0000^cY\"jZ\u007f]/=o`n/%ULE\"*UjAkm\u0001/n1!_jC7-Zc^c T/C,0\u001bbL7'S.\r '\u0015lA\"*sn^+~")), method5601(method5600("(6\u0015H\u0005")), method5601(method5600("c1KkL7!uz@y")), method5601(method5600("c ^cY\"jXcL-\fZ|Ey")), method5601(method5600("(6\u0015J\u0005")), method5601(method5600("(6\u0015L\u0005")), method5601(method5600("(6\u0015K\u0005")), method5601(method5600("(6\u0015I\u0005"))};
   @OriginalMember(
      owner = "client!kr",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field11350 = new class101(87, -1);
   @OriginalMember(
      owner = "client!kr",
      name = "i",
      descriptor = "[C"
   )
   public static char[] field11352 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @OriginalMember(
      owner = "client!kr",
      name = "j",
      descriptor = "[B"
   )
   public static byte[] field11354 = new byte[520];
   @OriginalMember(
      owner = "client!kr",
      name = "m",
      descriptor = "I"
   )
   public static int field11357 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "f",
      descriptor = "I"
   )
   public static int field11346;
   @OriginalMember(
      owner = "client!kr",
      name = "k",
      descriptor = "I"
   )
   public static int field11347;
   @OriginalMember(
      owner = "client!kr",
      name = "h",
      descriptor = "I"
   )
   public static int field11349;
   @OriginalMember(
      owner = "client!kr",
      name = "g",
      descriptor = "I"
   )
   public static int field11351;
   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "I"
   )
   public static int field11353;
   @OriginalMember(
      owner = "client!kr",
      name = "c",
      descriptor = "I"
   )
   public static int field11355;
   @OriginalMember(
      owner = "client!kr",
      name = "e",
      descriptor = "J"
   )
   private long field11356;

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(Ljj;I)V",
      line = 7
   )
   private final void method5593(class128 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(II)V",
      line = 49
   )
   public static final void method5594(int arg0, int arg1) {
      try {
         ++field11353;
         if (arg0 != -1) {
            if (class685.field10272[arg0]) {
               class241.field3064.method3883(arg0, -1);
               if (arg1 > 72) {
                  class136.field1744[arg0] = null;
                  class660.field9568[arg0] = null;
                  class685.field10272[arg0] = false;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11358[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(B)V",
      line = 70
   )
   public static final void method5595(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field11349;
         class423 var2 = (class423)class629.field9155.method4071(arg0);
         if (var1 != 0 || var2 != null) {
            do {
               label46: {
                  class793 var3 = var2.field6419;
                  if (var3.field11532) {
                     var2.method2720(arg0 ^ 127);
                     var3.method5697(2);
                     if (var1 == 0) {
                        break label46;
                     }
                  }

                  if (class314.field4488 >= var3.field11552) {
                     label47: {
                        var3.method5694(class65.field800, 2048);
                        if (var3.field11532) {
                           var2.method2720(0);
                           if (var1 == 0) {
                              break label47;
                           }
                        }

                        class117.method978(var3, true);
                     }
                  }
               }

               var2 = (class423)class629.field9155.method4059((byte)123);
            } while(var2 != null);

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11358[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "(I)V",
      line = 107
   )
   public static void method5596(int arg0) {
      try {
         if (arg0 != 2) {
            field11354 = null;
         }

         field11350 = null;
         field11352 = null;
         field11354 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11358[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(I)Lld;",
      line = 121
   )
   public static final class180 method5597(int arg0) {
      try {
         if (arg0 >= -90) {
            field11350 = null;
         }

         ++field11346;
         return ~class23.field245 == -1 ? new class180() : class597.field8794[--class23.field245];
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11358[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "<init>",
      descriptor = "(Ljj;)V",
      line = 277
   )
   public class777(class128 arg0) {
      try {
         this.method5593(arg0, -29768);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11358[5] + (arg0 != null ? field11358[2] : field11358[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(FI[FIBIIIII[FIFF)V",
      line = 143
   )
   public static final void method5598(float arg0, int arg1, float[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10, int arg11, float arg12, float arg13) {
      int var14 = client.field4530;

      try {
         int var24 = arg3 - arg6;
         ++field11347;
         int var25 = arg7 - arg9;
         int var26 = arg8 - arg11;
         float var15 = arg2[2] * (float)var25 + arg2[0] * (float)var26 + arg2[1] * (float)var24;
         float var16 = arg2[5] * (float)var25 + arg2[3] * (float)var26 + arg2[4] * (float)var24;
         if (arg4 == 15) {
            float var18;
            float var19;
            label73: {
               float var17 = arg2[8] * (float)var25 + arg2[7] * (float)var24 + arg2[6] * (float)var26;
               if (arg5 != 0) {
                  if (~arg5 == -2) {
                     var18 = arg0 + var17 + 0.5F;
                     var19 = arg13 + var15 + 0.5F;
                     if (var14 == 0) {
                        break label73;
                     }
                  }

                  if (arg5 == 2) {
                     var18 = -var16 + arg12 + 0.5F;
                     var19 = -var15 + arg13 + 0.5F;
                     if (var14 == 0) {
                        break label73;
                     }
                  }

                  if (arg5 != 3) {
                     if (arg5 == 4) {
                        var19 = arg0 + var17 + 0.5F;
                        var18 = -var16 + arg12 + 0.5F;
                        if (var14 == 0) {
                           break label73;
                        }
                     }

                     var19 = -var17 + arg0 + 0.5F;
                     var18 = -var16 + arg12 + 0.5F;
                     if (var14 == 0) {
                        break label73;
                     }
                  }

                  var19 = arg13 + var15 + 0.5F;
                  var18 = -var16 + arg12 + 0.5F;
                  if (var14 == 0) {
                     break label73;
                  }
               }

               var19 = arg13 + var15 + 0.5F;
               var18 = -var17 + arg0 + 0.5F;
            }

            label56: {
               if (~arg1 != -2) {
                  if (arg1 == 2) {
                     var18 = -var18;
                     var19 = -var19;
                     if (var14 == 0) {
                        break label56;
                     }
                  }

                  if (arg1 != 3) {
                     break label56;
                  }

                  float var20 = var19;
                  var19 = var18;
                  var18 = -var20;
                  if (var14 == 0) {
                     break label56;
                  }
               }

               float var21 = var19;
               var19 = -var18;
               var18 = var21;
            }

            arg10[0] = var19;
            arg10[1] = var18;
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field11358[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11358[2] : field11358[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field11358[2] : field11358[1]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(BLki;)V",
      line = 247
   )
   public final void method5599(byte param1, class736 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5600(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5601(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
