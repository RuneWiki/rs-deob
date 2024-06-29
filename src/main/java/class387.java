import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class387 extends class213 {
   @OriginalMember(
      owner = "client!ll",
      name = "H",
      descriptor = "I"
   )
   private int field5418 = 4096;
   @OriginalMember(
      owner = "client!ll",
      name = "L",
      descriptor = "I"
   )
   private int field5422 = 0;
   @OriginalMember(
      owner = "client!ll",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5427 = new String[]{method2960(method2959("1zr2\u0007")), method2960(method2959("1zr9\u0007")), method2960(method2959("1zr1\u0007")), method2960(method2959("3c0\u001f")), method2960(method2959("&8r]R")), method2960(method2959("1zr4\u0007"))};
   @OriginalMember(
      owner = "client!ll",
      name = "E",
      descriptor = "Lsq;"
   )
   public static class190 field5419 = new class190();
   @OriginalMember(
      owner = "client!ll",
      name = "K",
      descriptor = "Lrv;"
   )
   public static class120 field5424 = new class120();
   @OriginalMember(
      owner = "client!ll",
      name = "I",
      descriptor = "Lbga;"
   )
   public static class378 field5426 = new class378(97, 6);
   @OriginalMember(
      owner = "client!ll",
      name = "G",
      descriptor = "I"
   )
   public static int field5420;
   @OriginalMember(
      owner = "client!ll",
      name = "D",
      descriptor = "I"
   )
   public static int field5421;
   @OriginalMember(
      owner = "client!ll",
      name = "F",
      descriptor = "I"
   )
   public static int field5423;
   @OriginalMember(
      owner = "client!ll",
      name = "J",
      descriptor = "I"
   )
   public static int field5425;

   @OriginalMember(
      owner = "client!ll",
      name = "<init>",
      descriptor = "()V"
   )
   public class387() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2958(byte arg0) {
      try {
         field5419 = null;
         field5426 = null;
         if (arg0 != 24) {
            field5419 = null;
         }

         field5424 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5427[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field5425;
         int var4 = -36 % ((68 - arg1) / 48);
         if (arg2 != 0) {
            if (~arg2 == -2) {
               this.field5418 = arg0.method4280(-19104);
               return;
            }

            if (arg2 != 2) {
               return;
            }

            if (!client.field4273) {
               super.field2645 = ~arg0.method4288((byte)81) == -2;
               return;
            }
         }

         this.field5422 = arg0.method4280(-19104);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5427[5] + (arg0 != null ? field5427[4] : field5427[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5423;
         int[] var4 = super.field2650.method3769(arg0, arg1 ^ -2064866512);
         if (arg1 != 2064866508) {
            this.method215(23, 6);
         }

         if (super.field2650.field7140) {
            int[] var5 = this.method1619((byte)90, arg0, 0);
            int var6 = 0;
            if (var3 || var6 < class576.field7916) {
               do {
                  int var7 = var5[var6];
                  if (~var7 > ~this.field5422) {
                     var4[var6] = this.field5422;
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  if (this.field5418 >= var7) {
                     var4[var6] = var7;
                     if (var3) {
                        var4[var6] = this.field5418;
                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     var4[var6] = this.field5418;
                     ++var6;
                  }
               } while(var6 < class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5427[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 < 26) {
            return null;
         } else {
            ++field5421;
            int[][] var4 = super.field2644.method3543(-2, arg0);
            if (super.field2644.field6719) {
               int[][] var5 = this.method1615(true, arg0, 0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               if (var3 || ~var12 > ~class576.field7916) {
                  do {
                     int var13 = var6[var12];
                     int var14 = var7[var12];
                     int var15 = var8[var12];
                     if (this.field5422 <= var13) {
                        if (~var13 < ~this.field5418) {
                           var9[var12] = this.field5418;
                           if (var3) {
                              var9[var12] = var13;
                              if (var3) {
                                 var9[var12] = this.field5422;
                              }
                           }
                        } else {
                           var9[var12] = var13;
                           if (var3) {
                              var9[var12] = this.field5422;
                           }
                        }
                     } else {
                        var9[var12] = this.field5422;
                     }

                     label89: {
                        if (~var14 > ~this.field5422) {
                           var10[var12] = this.field5422;
                           if (!var3) {
                              break label89;
                           }
                        }

                        if (var14 > this.field5418) {
                           var10[var12] = this.field5418;
                           if (var3) {
                              var10[var12] = var14;
                           }
                        } else {
                           var10[var12] = var14;
                        }
                     }

                     if (this.field5422 <= var15) {
                        if (~var15 < ~this.field5418) {
                           var11[var12] = this.field5418;
                           if (var3) {
                              var11[var12] = var15;
                              if (var3) {
                                 var11[var12] = this.field5422;
                                 ++var12;
                              } else {
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        } else {
                           var11[var12] = var15;
                           if (var3) {
                              var11[var12] = this.field5422;
                              ++var12;
                           } else {
                              ++var12;
                           }
                        }
                     } else {
                        var11[var12] = this.field5422;
                        ++var12;
                     }
                  } while(~var12 > ~class576.field7916);
               }
            }

            return var4;
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field5427[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2959(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2960(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
