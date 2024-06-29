import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class742 extends class213 {
   @OriginalMember(
      owner = "client!ega",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10817 = new String[]{method5374(method5373("\u0000\b\u0017cEM")), method5374(method5373("\u0000\b\u0017cGM")), method5374(method5373("\u0000\b\u0017cJM")), method5374(method5373("\u000b\u001a\u001a!")), method5374(method5373("\u001eAXcp")), method5374(method5373("\u0000\b\u0017cLM")), method5374(method5373("\u0000\b\u0017cDM"))};
   @OriginalMember(
      owner = "client!ega",
      name = "K",
      descriptor = "[[I"
   )
   public static int[][] field10808 = new int[128][128];
   @OriginalMember(
      owner = "client!ega",
      name = "G",
      descriptor = "Lnw;"
   )
   public static class616 field10806 = new class616(60, 8);
   @OriginalMember(
      owner = "client!ega",
      name = "N",
      descriptor = "I"
   )
   public static int field10815 = -1;
   @OriginalMember(
      owner = "client!ega",
      name = "I",
      descriptor = "S"
   )
   public static short field10816 = 205;
   @OriginalMember(
      owner = "client!ega",
      name = "H",
      descriptor = "I"
   )
   public static int field10809;
   @OriginalMember(
      owner = "client!ega",
      name = "J",
      descriptor = "I"
   )
   public static int field10810;
   @OriginalMember(
      owner = "client!ega",
      name = "M",
      descriptor = "I"
   )
   public static int field10811;
   @OriginalMember(
      owner = "client!ega",
      name = "E",
      descriptor = "I"
   )
   public static int field10812;
   @OriginalMember(
      owner = "client!ega",
      name = "L",
      descriptor = "I"
   )
   public static int field10814;
   @OriginalMember(
      owner = "client!ega",
      name = "O",
      descriptor = "Lca;"
   )
   public static class323 field10813;
   @OriginalMember(
      owner = "client!ega",
      name = "D",
      descriptor = "[Lga;"
   )
   private class426[] field10807;

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label103: {
            ++field10810;
            if (arg2 != 0) {
               if (~arg2 != -2) {
                  break label103;
               }

               super.field2645 = ~arg0.method4288((byte)115) == -2;
               if (!var4) {
                  break label103;
               }
            }

            this.field10807 = new class426[arg0.method4288((byte)74)];
            int var5 = 0;
            if (var4 || this.field10807.length > var5) {
               do {
                  label88: {
                     int var6 = arg0.method4288((byte)109);
                     if (~var6 != -1) {
                        if (var6 == 1) {
                           break label88;
                        }

                        if (var6 == 2) {
                           this.field10807[var5] = class277.method2106(0, arg0);
                           if (var4) {
                              this.field10807[var5] = class493.method3580(2, arg0);
                              ++var5;
                           } else {
                              ++var5;
                           }
                           continue;
                        }

                        if (var6 != 3) {
                           ++var5;
                           continue;
                        }

                        if (!var4) {
                           this.field10807[var5] = class493.method3580(2, arg0);
                           ++var5;
                           continue;
                        }
                     }

                     this.field10807[var5] = class56.method433(arg0, 0);
                     if (!var4) {
                        ++var5;
                        continue;
                     }
                  }

                  this.field10807[var5] = class80.method778((byte)126, arg0);
                  if (var4) {
                     this.field10807[var5] = class277.method2106(0, arg0);
                     if (var4) {
                        this.field10807[var5] = class493.method3580(2, arg0);
                        ++var5;
                     } else {
                        ++var5;
                     }
                  } else {
                     ++var5;
                  }
               } while(this.field10807.length > var5);
            }
         }

         int var8 = -73 / ((arg1 - 68) / 48);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field10817[2] + (arg0 != null ? field10817[4] : field10817[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      try {
         ++field10811;
         int[] var3 = super.field2650.method3769(arg0, arg1 + -2064866512);
         if (arg1 != 2064866508) {
            field10808 = null;
         }

         if (super.field2650.field7140) {
            this.method5371(super.field2650.method3772(arg1 + -2064866508), 0);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10817[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "<init>",
      descriptor = "()V"
   )
   public class742() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10809;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 < 26) {
            return null;
         } else {
            if (super.field2644.field6719) {
               int var5 = class576.field7916;
               int var6 = class392.field5515;
               int[][] var7 = new int[var6][var5];
               int[][][] var8 = super.field2644.method3540((byte)29);
               this.method5371(var7, 0);
               int var9 = 0;
               if (var3 || var9 < class392.field5515) {
                  do {
                     int[] var10 = var7[var9];
                     int[][] var11 = var8[var9];
                     int[] var12 = var11[0];
                     int[] var13 = var11[1];
                     int[] var14 = var11[2];
                     int var15 = 0;
                     if (var3 || class576.field7916 > var15) {
                        do {
                           int var16 = var10[var15];
                           var14[var15] = class743.method5375(var16, 255) << 4;
                           var13[var15] = class743.method5375(65280, var16) >> 4;
                           var12[var15] = class743.method5375(var16 >> 12, 4080);
                           ++var15;
                        } while(class576.field7916 > var15);
                     }

                     ++var9;
                  } while(var9 < class392.field5515);
               }
            }

            return var4;
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field10817[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "([[II)V"
   )
   private final void method5371(int[][] arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10812;
         int var4 = class576.field7916;
         int var5 = class392.field5515;
         class696.method5062(arg0, arg1 + -1);
         class133.method1122(arg1, class676.field9924, 0, 0, class40.field468);
         if (this.field10807 != null) {
            int var6 = 0;
            if (var3 || ~var6 > ~this.field10807.length) {
               do {
                  class426 var7 = this.field10807[var6];
                  int var8 = var7.field5958;
                  int var9 = var7.field5957;
                  if (var8 < 0) {
                     if (~var9 <= -1) {
                        var7.method2689(var4, var5, (byte)109);
                        if (var3) {
                           if (~var9 > -1) {
                              var7.method2688((byte)41, var4, var5);
                              if (var3) {
                                 var7.method2691(var5, var4, 553);
                                 ++var6;
                              } else {
                                 ++var6;
                              }
                           } else {
                              var7.method2691(var5, var4, 553);
                              ++var6;
                           }
                        } else {
                           ++var6;
                        }
                     } else {
                        ++var6;
                     }
                  } else if (~var9 > -1) {
                     var7.method2688((byte)41, var4, var5);
                     if (var3) {
                        var7.method2691(var5, var4, 553);
                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     var7.method2691(var5, var4, 553);
                     ++var6;
                  }
               } while(~var6 > ~this.field10807.length);

            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field10817[6] + (arg0 != null ? field10817[4] : field10817[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method5372(int arg0) {
      try {
         field10808 = null;
         field10806 = null;
         field10813 = null;
         int var1 = 69 / ((arg0 - 15) / 62);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10817[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5373(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5374(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
