import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class768 extends class70 {
   @OriginalMember(
      owner = "client!ml",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11335 = new String[]{method5614(method5613("\u0002D\u0017=<")), method5614(method5613("\u0002D\u00176<")), method5614(method5613("\u0014\u0006\u0017Pi")), method5614(method5613("\u0001]U\u0012")), method5614(method5613("\u0002D\u00174<")), method5614(method5613("\u0002D\u0017?<")), method5614(method5613("\u0002D\u0017:<"))};
   @OriginalMember(
      owner = "client!ml",
      name = "I",
      descriptor = "I"
   )
   public static int field11331 = 0;
   @OriginalMember(
      owner = "client!ml",
      name = "G",
      descriptor = "I"
   )
   public static int field11329;
   @OriginalMember(
      owner = "client!ml",
      name = "H",
      descriptor = "I"
   )
   public static int field11330;
   @OriginalMember(
      owner = "client!ml",
      name = "K",
      descriptor = "I"
   )
   public static int field11332;
   @OriginalMember(
      owner = "client!ml",
      name = "F",
      descriptor = "I"
   )
   public static int field11333;
   @OriginalMember(
      owner = "client!ml",
      name = "J",
      descriptor = "[Leja;"
   )
   public static class738[] field11334;

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5610(byte arg0) {
      try {
         int var1 = -34 / ((arg0 - 26) / 63);
         field11334 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11335[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "c",
      descriptor = "(III)V"
   )
   private final void method5611(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field11330;
         int var5 = class199.field3060[arg2];
         int var6 = class204.field3113[arg0];
         if (arg1 == 24382) {
            label114: {
               float var7 = (float)Math.atan2((double)(var5 + -2048), (double)(var6 + -2048));
               if (!((double)var7 >= -3.141592653589793D) || !((double)var7 <= -2.356194490192345D)) {
                  if (!((double)var7 <= -1.5707963267948966D) || !((double)var7 >= -2.356194490192345D)) {
                     if ((double)var7 <= -0.7853981633974483D && (double)var7 >= -1.5707963267948966D) {
                        class651.field9395 = class678.field10127 - arg0;
                        class269.field4366 = arg2;
                        if (!var4) {
                           break label114;
                        }
                     }

                     if (var7 <= 0.0F && (double)var7 >= -0.7853981633974483D) {
                        class269.field4366 = class304.field4744 - arg0;
                        class651.field9395 = arg2;
                        if (!var4) {
                           break label114;
                        }
                     }

                     if (!(var7 >= 0.0F) || !((double)var7 <= 0.7853981633974483D)) {
                        if ((double)var7 >= 0.7853981633974483D && (double)var7 <= 1.5707963267948966D) {
                           class269.field4366 = -arg2 + class304.field4744;
                           class651.field9395 = -arg0 + class678.field10127;
                           if (!var4) {
                              break label114;
                           }
                        }

                        if (!((double)var7 >= 1.5707963267948966D) || !((double)var7 <= 2.356194490192345D)) {
                           if (!((double)var7 >= 2.356194490192345D) || !((double)var7 <= 3.141592653589793D)) {
                              break label114;
                           }

                           class269.field4366 = arg0;
                           class651.field9395 = -arg2 + class678.field10127;
                           if (!var4) {
                              break label114;
                           }
                        }

                        class269.field4366 = class304.field4744 - arg2;
                        class651.field9395 = arg0;
                        if (!var4) {
                           break label114;
                        }
                     }

                     class651.field9395 = -arg2 + class678.field10127;
                     class269.field4366 = -arg0 + class304.field4744;
                     if (!var4) {
                        break label114;
                     }
                  }

                  class651.field9395 = arg0;
                  class269.field4366 = arg2;
                  if (!var4) {
                     break label114;
                  }
               }

               class269.field4366 = arg0;
               class651.field9395 = arg2;
            }

            class651.field9395 &= class50.field637;
            class269.field4366 &= class578.field8547;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11335[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         if (~arg1 == arg0) {
            super.field933 = ~arg2.method2855(arg0 ^ 31006) == -2;
         }

         ++field11329;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11335[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11335[2] : field11335[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field11333;
         if (arg0 != 32) {
            return null;
         } else {
            int[][] var4 = super.field918.method3276((byte)124, arg1);
            if (super.field918.field6361) {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = 0;
               if (var3 || ~class678.field10127 < ~var8) {
                  do {
                     this.method5611(arg1, arg0 + 24350, var8);
                     int[][] var9 = this.method539(true, class269.field4366, 0);
                     var5[var8] = var9[0][class651.field9395];
                     var6[var8] = var9[1][class651.field9395];
                     var7[var8] = var9[2][class651.field9395];
                     ++var8;
                  } while(~class678.field10127 < ~var8);
               }
            }

            return var4;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field11335[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method5612(int arg0, int arg1, int arg2) {
      class190 var3 = class711.field10694[arg0][arg1][arg2];
      if (var3 != null) {
         class592.method4409(var3.field2953);
         class592.method4409(var3.field2951);
         if (var3.field2953 != null) {
            var3.field2953 = null;
         }

         if (var3.field2951 != null) {
            var3.field2951 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != 87) {
            field11331 = -126;
         }

         ++field11332;
         int[] var4 = super.field923.method3718(arg0 ^ -87, arg1);
         if (super.field923.field7284) {
            int var5 = 0;
            if (var3 || ~var5 > ~class678.field10127) {
               do {
                  this.method5611(arg1, 24382, var5);
                  int[] var6 = this.method545(0, class269.field4366, (byte)-84);
                  var4[var5] = var6[class651.field9395];
                  ++var5;
               } while(~var5 > ~class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11335[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "<init>",
      descriptor = "()V"
   )
   public class768() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5613(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5614(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
