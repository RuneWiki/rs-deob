import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class60 extends class22 {
   @OriginalMember(
      owner = "client!gda",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field1139;
   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1146 = new String[]{method666(method665("FwN?a\t")), method666(method665("\u0001;")), method666(method665("OfC}")), method666(method665("\u0001>\u00111\u001cB|C,FGuI!\u0010\u001f")), method666(method665("Z=\u0001?]")), method666(method665("\u001dp@}\u001dGuIw\u0010\u0011-")), method666(method665("FwN?b\t")), method666(method665("FwN?\u001cH}Fe\u001e\t"))};
   @OriginalMember(
      owner = "client!gda",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field1142 = false;
   @OriginalMember(
      owner = "client!gda",
      name = "n",
      descriptor = "[Lgaa;"
   )
   public static class312[] field1140 = new class312[2048];
   @OriginalMember(
      owner = "client!gda",
      name = "p",
      descriptor = "[F"
   )
   public static float[] field1143 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @OriginalMember(
      owner = "client!gda",
      name = "l",
      descriptor = "[[I"
   )
   public static int[][] field1144 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!gda",
      name = "j",
      descriptor = "I"
   )
   public static int field1141;
   @OriginalMember(
      owner = "client!gda",
      name = "k",
      descriptor = "I"
   )
   public static int field1145;

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(I)V",
      line = 8
   )
   public static void method663(int arg0) {
      try {
         if (arg0 == 0) {
            field1143 = null;
            field1140 = null;
            field1144 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1146[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "()V",
      line = 19
   )
   public class60() {
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 24
   )
   public class60(String arg0, int arg1) {
      try {
         this.field1139 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1146[7] + (arg0 != null ? field1146[4] : field1146[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(ZLuba;B)V",
      line = 48
   )
   public static final void method664(boolean arg0, class451 arg1, byte arg2) {
      boolean var3 = client.field4564;

      try {
         ++field1141;
         if (~class103.field1686 > -401) {
            int var4 = -106 / ((arg2 - -48) / 47);
            class15 var5 = arg1.field6586;
            String var6 = arg1.field6596;
            if (var5.field230 != null) {
               var5 = var5.method111(class616.field8951, -2690);
               if (var5 == null) {
                  return;
               }

               var6 = var5.field271;
            }

            if (var5.field276) {
               if (~arg1.field6603 != -1) {
                  String var7 = class294.field4103 == class128.field2145 ? class100.field1629.method961(class385.field5684, true) : class100.field1627.method961(class385.field5684, true);
                  var6 = var6 + class208.method1775(-99, class304.field4398.field6685, arg1.field6603) + field1146[1] + var7 + arg1.field6603 + ")";
               }

               if (class85.field1410 && !arg0) {
                  class576 var8 = ~class131.field2175 != 0 ? class559.field8143.method3265(11, class131.field2175) : null;
                  if ((class585.field8461 & 2) != 0 && (var8 == null || ~var5.method103(var8.field8296, class131.field2175, false) != ~var8.field8296)) {
                     class388.method3010((long)arg1.field11306, -1, true, (long)arg1.field11306, 0, false, -113, false, 0, class123.field1965 + field1146[3] + var6, 8, class560.field8149, class133.field2194);
                     ++class251.field3598;
                  }
               }

               if (!arg0) {
                  String[] var9 = var5.field248;
                  if (class349.field4967) {
                     var9 = class518.method3908(var9, (byte)-83);
                  }

                  if (var9 != null) {
                     int var10 = 4;
                     if (var3 || var10 >= 0) {
                        do {
                           if (var9[var10] != null) {
                              if (~var5.field281 != -1 && var9[var10].equalsIgnoreCase(class100.field1622.method961(class385.field5684, true))) {
                                 --var10;
                              } else {
                                 byte var11 = 0;
                                 if (var10 == 0) {
                                    var11 = 47;
                                 }

                                 int var12 = class245.field3528;
                                 if (var10 == 1) {
                                    var11 = 59;
                                 }

                                 if (~var10 == -3) {
                                    var11 = 23;
                                 }

                                 if (var10 == 3) {
                                    var11 = 17;
                                 }

                                 if (var5.field222 == var10) {
                                    var12 = var5.field264;
                                 }

                                 if (~var10 == -5) {
                                    var11 = 20;
                                 }

                                 if (~var5.field257 == ~var10) {
                                    var12 = var5.field234;
                                 }

                                 class388.method3010((long)arg1.field11306, -1, true, (long)arg1.field11306, 0, false, -96, false, 0, field1146[5] + var6, var11, var9[var10].equalsIgnoreCase(class100.field1622.method961(class385.field5684, true)) ? var5.field221 : var12, var9[var10]);
                                 ++class621.field9056;
                                 --var10;
                              }
                           } else {
                              --var10;
                           }
                        } while(var10 >= 0);
                     }
                  }

                  if (var5.field281 == 1 && var9 != null) {
                     int var13 = 4;
                     if (var3 || var13 >= 0) {
                        do {
                           if (var9[var13] != null && var9[var13].equalsIgnoreCase(class100.field1622.method961(class385.field5684, true))) {
                              short var14 = 0;
                              if (arg1.field6603 > class304.field4398.field6685) {
                                 var14 = 2000;
                              }

                              short var15 = 0;
                              if (~var13 == -1) {
                                 var15 = 47;
                              }

                              if (var13 == 1) {
                                 var15 = 59;
                              }

                              if (var13 == 2) {
                                 var15 = 23;
                              }

                              if (var13 == 3) {
                                 var15 = 17;
                              }

                              if (var13 == 4) {
                                 var15 = 20;
                              }

                              if (~var15 != -1) {
                                 var15 += var14;
                              }

                              ++class408.field5995;
                              class388.method3010((long)arg1.field11306, -1, true, (long)arg1.field11306, 0, false, -114, false, 0, field1146[5] + var6, var15, var5.field221, var9[var13]);
                           }

                           --var13;
                        } while(var13 >= 0);
                     }
                  }
               }

               ++class493.field7170;
               class388.method3010((long)arg1.field11306, -1, true, (long)arg1.field11306, 0, arg0, -120, false, 0, field1146[5] + var6, 1006, class330.field4712, class100.field1621.method961(class385.field5684, true));
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field1146[0] + arg0 + ',' + (arg1 != null ? field1146[4] : field1146[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method665(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method666(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
