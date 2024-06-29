import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class246 {
   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3539 = new String[]{method2001(method2000("zi|<\u0015Q%")), method2001(method2000("}xq~")), method2001(method2000("h#3</")), method2001(method2000("zi|<\u001bQ%")), method2001(method2000("zi|<\u0014Q%")), method2001(method2000("zi|<\u0017Q%")), method2001(method2000("zi|<\u001aQ%"))};
   @OriginalMember(
      owner = "client!ida",
      name = "i",
      descriptor = "Lwh;"
   )
   public static class157 field3531 = new class157();
   @OriginalMember(
      owner = "client!ida",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field3537 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
   @OriginalMember(
      owner = "client!ida",
      name = "g",
      descriptor = "I"
   )
   public static int field3530;
   @OriginalMember(
      owner = "client!ida",
      name = "f",
      descriptor = "I"
   )
   public static int field3532;
   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "I"
   )
   public static int field3533;
   @OriginalMember(
      owner = "client!ida",
      name = "e",
      descriptor = "I"
   )
   public static int field3535;
   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "I"
   )
   public static int field3538;
   @OriginalMember(
      owner = "client!ida",
      name = "c",
      descriptor = "Lida;"
   )
   public class246 field3534;
   @OriginalMember(
      owner = "client!ida",
      name = "d",
      descriptor = "Lida;"
   )
   public class246 field3536;

   @OriginalMember(
      owner = "client!ida",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1995(byte arg0) {
      try {
         ++field3535;
         if (this.field3534 != null) {
            this.field3534.field3536 = this.field3536;
            if (arg0 != 35) {
               this.field3534 = null;
            }

            this.field3536.field3534 = this.field3534;
            this.field3536 = null;
            this.field3534 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3539[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method1996(byte arg0) {
      try {
         field3537 = null;
         int var1 = -26 / ((arg0 - -76) / 37);
         field3531 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3539[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "(Lha;I)V"
   )
   public static final void method1997(class65 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field3530;
         class42 var3 = (class42)class513.field7485.method1394((byte)-122);
         if (var2) {
            if (var3.field979) {
               var3.method496(arg0);
            }

            var3 = (class42)class513.field7485.method1400(false);
         }

         while(true) {
            int var10000;
            if (var3 == null) {
               var10000 = arg1;
               if (!var2) {
                  if (arg1 < 117) {
                     field3537 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var3.field979;
            }

            if (var10000 != 0) {
               var3.method496(arg0);
            }

            var3 = (class42)class513.field7485.method1400(false);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3539[0] + (arg0 != null ? field3539[2] : field3539[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(IILha;)V"
   )
   public static final void method1998(int arg0, int arg1, class65 arg2) {
      boolean var3 = client.field4564;

      try {
         ++field3532;
         if (class11.field119 && class675.field9895) {
            if (class189.field2839) {
               class516.field7513 = class56.field1116.method803((byte)66);
            }

            class57.field1127 = 0;
            class622.field9077 = 0;
            class341.field4852 = 0;
            int[] var4 = arg2.method278();
            class405.field5980 = (int)((float)var4[2] / 3.0F);
            class276.field3902 = (int)((float)var4[3] / 3.0F);
            arg2.method264(class685.field10081);
            if ((int)((float)class685.field10081[0] / 3.0F) != class580.field8327 || ~((int)((float)class685.field10081[1] / 3.0F)) != ~class533.field7769) {
               class533.field7769 = (int)((float)class685.field10081[1] / 3.0F);
               class580.field8327 = (int)((float)class685.field10081[0] / 3.0F);
               class484.field7036 = class533.field7769 >> 1;
               class596.field8597 = new int[class580.field8327 * class533.field7769];
               class697.field10211 = class580.field8327 >> 1;
            }

            class333.field4770 = arg2.method398();
            class203.field3041 = 0;
            int var5 = 0;
            if (var3) {
               class355.method2722(class245.field3527[var5], arg2, 1, arg1);
               ++var5;
            }

            while(true) {
               while(var5 < class614.field8921) {
                  class355.method2722(class245.field3527[var5], arg2, 1, arg1);
                  ++var5;
               }

               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     class355.method2722(class530.field7719[var6], arg2, 1, arg1);
                     ++var6;
                  }

                  while(true) {
                     while(var6 < class38.field912) {
                        class355.method2722(class530.field7719[var6], arg2, 1, arg1);
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           class355.method2722(class256.field3636[var7], arg2, 1, arg1);
                           ++var7;
                        }

                        while(true) {
                           while(~var7 > ~class778.field11382) {
                              class355.method2722(class256.field3636[var7], arg2, 1, arg1);
                              ++var7;
                           }

                           class771.field11305 = arg0;
                           if (!var3) {
                              if (~class203.field3041 < -1) {
                                 int var8 = class596.field8597.length;
                                 int var9 = 7 & var8 - var8;
                                 int var10 = 0;
                                 if (var3) {
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                 }

                                 while(true) {
                                    while(var10 < var9) {
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                       class596.field8597[var10++] = Integer.MAX_VALUE;
                                    }

                                    if (!var3) {
                                       if (var3) {
                                          class596.field8597[var10++] = Integer.MAX_VALUE;
                                       }

                                       while(~var8 < ~var10) {
                                          class596.field8597[var10++] = Integer.MAX_VALUE;
                                       }

                                       class289.field4045 = 1;
                                       int var11 = 0;
                                       if (var3 || class203.field3041 > var11) {
                                          do {
                                             class743 var12 = class128.field2141[var11];
                                             class375.method2935(var12.field10707[1], var12.field10697[3], var12.field10709[0], var12.field10707[0], var12.field10709[3], -101, var12.field10709[1], var12.field10697[0], var12.field10707[3], var12.field10697[1]);
                                             class375.method2935(var12.field10707[2], var12.field10697[3], var12.field10709[1], var12.field10707[1], var12.field10709[3], -104, var12.field10709[2], var12.field10697[1], var12.field10707[3], var12.field10697[2]);
                                             ++var11;
                                          } while(class203.field3041 > var11);
                                       }

                                       class289.field4045 = 2;
                                       break;
                                    }

                                    class596.field8597[var10++] = Integer.MAX_VALUE;
                                 }
                              }

                              if (class189.field2839) {
                                 class766.field11105 = class56.field1116.method803((byte)-103) - class516.field7513;
                                 return;
                              }

                              return;
                           }

                           ++var7;
                        }
                     }

                     ++var6;
                  }
               }

               ++var5;
            }
         } else {
            class203.field3041 = 0;
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field3539[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3539[2] : field3539[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1999(int arg0) {
      try {
         class645.method4735(11, -112);
         ++field3533;
         class360.method2829(0);
         System.gc();
         if (arg0 <= 6) {
            method1998(-17, -41, (class65)null);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3539[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2000(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2001(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
