import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class350 extends class546 {
   @OriginalMember(
      owner = "client!wb",
      name = "u",
      descriptor = "I"
   )
   public int field5009 = 0;
   @OriginalMember(
      owner = "client!wb",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5020 = new String[]{method2765(method2764("\r>Z6R")), method2765(method2764("\u0001rZ\\\u0007")), method2765(method2764("\u0018e\u0018t")), method2765(method2764("\u0001rZZ\u0007")), method2765(method2764("\u0001rZ]\u0007")), method2765(method2764("\u0001rZY\u0007")), method2765(method2764("\u0001rZ[\u0007"))};
   @OriginalMember(
      owner = "client!wb",
      name = "C",
      descriptor = "Lnw;"
   )
   public static class616 field5011 = new class616(36, -1);
   @OriginalMember(
      owner = "client!wb",
      name = "w",
      descriptor = "I"
   )
   public static int field5016 = -1;
   @OriginalMember(
      owner = "client!wb",
      name = "D",
      descriptor = "I"
   )
   public static int field5018 = 1;
   @OriginalMember(
      owner = "client!wb",
      name = "y",
      descriptor = "F"
   )
   public static float field5013;
   @OriginalMember(
      owner = "client!wb",
      name = "B",
      descriptor = "I"
   )
   public static int field5010;
   @OriginalMember(
      owner = "client!wb",
      name = "v",
      descriptor = "I"
   )
   public static int field5012;
   @OriginalMember(
      owner = "client!wb",
      name = "x",
      descriptor = "I"
   )
   public static int field5014;
   @OriginalMember(
      owner = "client!wb",
      name = "E",
      descriptor = "I"
   )
   public static int field5015;
   @OriginalMember(
      owner = "client!wb",
      name = "t",
      descriptor = "Lqh;"
   )
   public static class74 field5019;
   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "[[B"
   )
   public static byte[][] field5017;

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2759(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field5012;
         if (class661.field9422 == null) {
            class661.field9422 = new int[65536];
            double var2 = 0.7D + (Math.random() * 0.03D - 0.015D);
            int var4 = 0;
            if (arg0 >= -28) {
               field5013 = -0.73010296F;
               if (!var1 && var4 >= 65536) {
                  return;
               }
            } else if (var4 >= 65536) {
               return;
            }

            do {
               double var5 = (double)(var4 >> 10 & 63) / 64.0D + 0.0078125D;
               double var7 = (double)(7 & var4 >> 7) / 8.0D + 0.0625D;
               double var9 = (double)(var4 & 127) / 128.0D;
               double var11 = var9;
               double var13 = var9;
               double var15 = var9;
               if (var7 != 0.0D) {
                  label124: {
                     double var17;
                     if (!(var9 < 0.5D)) {
                        var17 = var7 + var9 - var7 * var9;
                        if (var1) {
                           var17 = (var7 + 1.0D) * var9;
                        }
                     } else {
                        var17 = (var7 + 1.0D) * var9;
                     }

                     double var19 = var9 * 2.0D - var17;
                     double var21 = var5 + 0.3333333333333333D;
                     if (var21 > 1.0D) {
                        --var21;
                     }

                     double var25 = var5 - 0.3333333333333333D;
                     if (var25 < 0.0D) {
                        ++var25;
                     }

                     label106: {
                        if (!(var5 * 6.0D < 1.0D)) {
                           if (var5 * 2.0D < 1.0D) {
                              var13 = var17;
                              if (!var1) {
                                 break label106;
                              }
                           }

                           if (var5 * 3.0D < 2.0D) {
                              var13 = (-var19 + var17) * (-var5 + 0.6666666666666666D) * 6.0D + var19;
                              if (!var1) {
                                 break label106;
                              }
                           }

                           var13 = var19;
                           if (!var1) {
                              break label106;
                           }
                        }

                        var13 = (-var19 + var17) * 6.0D * var5 + var19;
                     }

                     label95: {
                        if (!(var21 * 6.0D < 1.0D)) {
                           if (var21 * 2.0D < 1.0D) {
                              var11 = var17;
                              if (!var1) {
                                 break label95;
                              }
                           }

                           if (!(var21 * 3.0D < 2.0D)) {
                              var11 = var19;
                              if (!var1) {
                                 break label95;
                              }
                           }

                           var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                           if (!var1) {
                              break label95;
                           }
                        }

                        var11 = (-var19 + var17) * 6.0D * var21 + var19;
                     }

                     if (!(var25 * 6.0D < 1.0D)) {
                        if (!(var25 * 2.0D < 1.0D)) {
                           if (!(var25 * 3.0D < 2.0D)) {
                              var15 = var19;
                              if (!var1) {
                                 break label124;
                              }
                           }

                           var15 = (var17 - var19) * (-var25 + 0.6666666666666666D) * 6.0D + var19;
                           if (!var1) {
                              break label124;
                           }
                        }

                        var15 = var17;
                        if (!var1) {
                           break label124;
                        }
                     }

                     var15 = (var17 - var19) * 6.0D * var25 + var19;
                  }
               }

               double var27 = Math.pow(var11, var2);
               double var29 = Math.pow(var13, var2);
               double var31 = Math.pow(var15, var2);
               int var33 = (int)(var27 * 256.0D);
               int var34 = (int)(var29 * 256.0D);
               int var35 = (int)(var31 * 256.0D);
               int var36 = (var33 << 16) + (var34 << 8) + var35;
               class661.field9422[var4] = var36;
               ++var4;
            } while(var4 < 65536);

         }
      } catch (RuntimeException var38) {
         throw class534.method3846(var38, field5020[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public final void method2760(class594 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         while(true) {
            int var4 = arg0.method4288((byte)99);
            if (~var4 != -1) {
               this.method2762(arg0, var4, -78);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (!arg1) {
               return;
            }

            ++field5014;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5020[1] + (arg0 != null ? field5020[0] : field5020[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2761(byte arg0) {
      try {
         field5017 = null;
         field5019 = null;
         field5011 = null;
         if (arg0 > -39) {
            field5018 = -81;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5020[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method2762(class594 arg0, int arg1, int arg2) {
      try {
         ++field5010;
         if (arg1 == 2) {
            this.field5009 = arg0.method4280(-19104);
         }

         if (arg2 >= -52) {
            this.method2760((class594)null, true);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5020[3] + (arg0 != null ? field5020[0] : field5020[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2763(byte param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2764(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2765(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
