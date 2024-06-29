import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class580 {
   @OriginalMember(
      owner = "client!wb",
      name = "h",
      descriptor = "Lsia;"
   )
   private class407 field8585 = new class407(256);
   @OriginalMember(
      owner = "client!wb",
      name = "i",
      descriptor = "Ld;"
   )
   private class102 field8577;
   @OriginalMember(
      owner = "client!wb",
      name = "e",
      descriptor = "Lfm;"
   )
   private class281 field8582;
   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8587 = new String[]{method4344(method4343("^\frXB")), method4344(method4343("G\u001b0p")), method4344(method4343("R@r2\u0017")), method4344(method4343("^\fr \u0003G\u0007(\"B")), method4344(method4343("^\frYB")), method4344(method4343("^\fr^B")), method4344(method4343("^\fr_B")), method4344(method4343("^\frZB")), method4344(method4343("^\fr]B")), method4344(method4343("\u0015\t(\"")), method4344(method4343("\u0015\u0002(\""))};
   @OriginalMember(
      owner = "client!wb",
      name = "j",
      descriptor = "I"
   )
   public static int field8580 = 0;
   @OriginalMember(
      owner = "client!wb",
      name = "k",
      descriptor = "I"
   )
   public static int field8586 = 0;
   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "I"
   )
   public static int field8576;
   @OriginalMember(
      owner = "client!wb",
      name = "f",
      descriptor = "I"
   )
   public static int field8578;
   @OriginalMember(
      owner = "client!wb",
      name = "g",
      descriptor = "I"
   )
   public static int field8579;
   @OriginalMember(
      owner = "client!wb",
      name = "d",
      descriptor = "I"
   )
   public static int field8581;
   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "I"
   )
   public static int field8583;
   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "I"
   )
   public static int field8584;

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(IIIIIIB)I"
   )
   public static final int method4337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         if (~(1 & arg2) == -2) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
         }

         int var10 = arg0 & 3;
         ++field8579;
         if (var10 == 0) {
            return arg5;
         } else if (var10 == 1) {
            return arg3;
         } else {
            if (arg6 < 28) {
               method4341((class339)null, 38);
            }

            return ~var10 == -3 ? -arg5 + 7 + -arg1 + 1 : -arg3 + 7 - (arg4 + -1);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8587[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;"
   )
   public static final String method4338(String arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         ++field8578;
         int var3 = arg0.length();
         int var4 = 0;
         int var5 = 0;
         char var6;
         if (var2) {
            var6 = arg0.charAt(var5);
            if (~var6 != -61) {
               if (~var6 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }

         while(true) {
            char var10000;
            if (~var3 >= ~var5) {
               var10000 = (char)arg1;
               if (!var2) {
                  if (arg1 != 1) {
                     field8586 = -38;
                  }

                  StringBuffer var7 = new StringBuffer(var3 + var4);
                  int var8 = 0;
                  String var12;
                  if (var2) {
                     var12 = arg0;
                  } else if (~var3 >= ~var8) {
                     var12 = var7.toString();
                     if (!var2) {
                        return var12;
                     }
                  } else {
                     var12 = arg0;
                  }

                  while(true) {
                     char var9 = var12.charAt(var8);
                     if (var9 == '<') {
                        var7.append(field8587[10]);
                        if (var2) {
                           if (var9 == '>') {
                              var7.append(field8587[9]);
                              if (var2) {
                                 var7.append(var9);
                                 ++var8;
                              } else {
                                 ++var8;
                              }
                           } else {
                              var7.append(var9);
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     } else if (var9 == '>') {
                        var7.append(field8587[9]);
                        if (var2) {
                           var7.append(var9);
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        var7.append(var9);
                        ++var8;
                     }

                     if (~var3 >= ~var8) {
                        var12 = var7.toString();
                        if (!var2) {
                           return var12;
                        }
                     } else {
                        var12 = arg0;
                     }
                  }
               }
            } else {
               var10000 = arg0.charAt(var5);
            }

            var6 = var10000;
            if (~var6 != -61) {
               if (~var6 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8587[8] + (arg0 != null ? field8587[2] : field8587[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4339(byte arg0) {
      try {
         this.field8585.method3197(5, 5);
         if (arg0 >= -55) {
            this.field8577 = null;
         }

         ++field8584;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8587[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method4340(byte arg0) {
      try {
         ++field8576;
         this.field8585.method3201((byte)113);
         if (arg0 != -51) {
            this.field8577 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8587[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(Lww;I)V"
   )
   public static final void method4341(class339 arg0, int arg1) {
      try {
         int var2 = 31 % ((arg1 - 78) / 33);
         ++field8581;
         class118.field1553 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8587[6] + (arg0 != null ? field8587[2] : field8587[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(II)Lcb;"
   )
   public final class177 method4342(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field8583;
         Object var4 = this.field8585.method3192((long)arg1, (byte)-112);
         if (var4 != null) {
            return (class177)var4;
         } else if (!this.field8577.method915(arg1, 127)) {
            return null;
         } else {
            class668 var5 = this.field8577.method911(arg1, -92);
            if (arg0 <= 106) {
               return null;
            } else {
               class177 var8;
               label76: {
                  int var6 = var5.field9901 ? 64 : this.field8582.field3797;
                  if (!var5.field9896 || !this.field8582.method399()) {
                     int[] var7;
                     label47: {
                        if (var5.field9898 != 2 && class188.method1575(var5.field9911, 107)) {
                           var7 = this.field8577.method913(var6, arg1, true, 98, 0.7F, var6);
                           if (!var3) {
                              break label47;
                           }
                        }

                        var7 = this.field8577.method914(arg1, var6, var6, false, 0.7F, true);
                     }

                     var8 = this.field8582.method2283((byte)-53, var6, var5.field9900 != 0, var6, var7);
                     if (!var3) {
                        break label76;
                     }
                  }

                  float[] var9 = this.field8577.method916(false, -29003, 0.7F, var6, var6, arg1);
                  var8 = this.field8582.method2262(class606.field8967, var6, var9, var5.field9900 != 0, var6, (byte)-52);
               }

               var8.method1516(var5.field9902, var5.field9906, 13852);
               this.field8585.method3190(var8, (long)arg1, 8);
               return var8;
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8587[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "<init>",
      descriptor = "(Lfm;Ld;)V"
   )
   public class580(class281 arg0, class102 arg1) {
      try {
         this.field8577 = arg1;
         this.field8582 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8587[3] + (arg0 != null ? field8587[2] : field8587[1]) + ',' + (arg1 != null ? field8587[2] : field8587[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4343(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4344(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
