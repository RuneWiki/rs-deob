import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class314 extends class264 {
   @OriginalMember(
      owner = "client!eo",
      name = "K",
      descriptor = "I"
   )
   private int field4287 = 0;
   @OriginalMember(
      owner = "client!eo",
      name = "L",
      descriptor = "I"
   )
   private int field4288 = 0;
   @OriginalMember(
      owner = "client!eo",
      name = "M",
      descriptor = "I"
   )
   private int field4295 = 1;
   @OriginalMember(
      owner = "client!eo",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4296 = new String[]{method2317(method2316("<\u0005ipK")), method2317(method2316("<\u0005ixK")), method2317(method2316("\"Di\u0015\u001e")), method2317(method2316("7\u001f+W")), method2317(method2316("<\u0005iyK")), method2317(method2316("<\u0005i~K")), method2317(method2316("<\u0005i\u007fK")), method2317(method2316("<\u0005izK"))};
   @OriginalMember(
      owner = "client!eo",
      name = "N",
      descriptor = "[B"
   )
   public static byte[] field4289 = null;
   @OriginalMember(
      owner = "client!eo",
      name = "I",
      descriptor = "I"
   )
   public static int field4286;
   @OriginalMember(
      owner = "client!eo",
      name = "F",
      descriptor = "I"
   )
   public static int field4290;
   @OriginalMember(
      owner = "client!eo",
      name = "G",
      descriptor = "I"
   )
   public static int field4291;
   @OriginalMember(
      owner = "client!eo",
      name = "J",
      descriptor = "I"
   )
   public static int field4292;
   @OriginalMember(
      owner = "client!eo",
      name = "H",
      descriptor = "I"
   )
   public static int field4293;
   @OriginalMember(
      owner = "client!eo",
      name = "O",
      descriptor = "[Lnp;"
   )
   public static class519[] field4294;

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method413(int arg0) {
      try {
         if (arg0 >= 49) {
            class69.method644(693);
            ++field4291;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4296[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2313(int arg0) {
      try {
         ++field4290;
         class743.field10830.method731(arg0 + arg0);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4296[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "<init>",
      descriptor = "()V"
   )
   public class314() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg2 >= 49) {
            label45: {
               label44: {
                  label43: {
                     if (~arg0 != -1) {
                        if (arg0 == 1) {
                           break label43;
                        }

                        if (arg0 != 3) {
                           break label45;
                        }

                        if (!var4) {
                           break label44;
                        }
                     }

                     this.field4287 = arg1.method1143(-15465);
                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field4288 = arg1.method1143(-15465);
                  if (!var4) {
                     break label45;
                  }
               }

               this.field4295 = arg1.method1143(-15465);
            }

            ++field4292;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4296[7] + arg0 + ',' + (arg1 != null ? field4296[2] : field4296[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(I[SI)[S"
   )
   public static final short[] method2314(int arg0, short[] arg1, int arg2) {
      try {
         int var3 = -19 % ((-16 - arg0) / 49);
         ++field4293;
         short[] var4 = new short[arg2];
         class242.method1851(arg1, 0, var4, 0, arg2);
         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4296[1] + arg0 + ',' + (arg1 != null ? field4296[2] : field4296[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field4286;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         int var5 = -18 / ((24 - arg1) / 44);
         if (super.field3641.field5922) {
            int var6 = class666.field9668[arg0];
            int var7 = var6 + -2048 >> 1;
            int var8 = 0;
            if (var3 || class430.field6152 > var8) {
               do {
                  int var13;
                  label35: {
                     int var9 = class258.field3496[var8];
                     int var10 = var9 - 2048 >> 1;
                     if (~this.field4287 != -1) {
                        int var11 = var10 * var10 - -(var7 * var7) >> 12;
                        int var12 = (int)(4096.0D * Math.sqrt((double)((float)var11 / 4096.0F)));
                        var13 = (int)((double)(this.field4295 * var12) * 3.141592653589793D);
                        if (!var3) {
                           break label35;
                        }
                     }

                     var13 = (-var6 + var9) * this.field4295;
                  }

                  int var14;
                  label42: {
                     var14 = var13 - (-4096 & var13);
                     if (~this.field4288 != -1) {
                        if (~this.field4288 != -3) {
                           break label42;
                        }

                        var14 -= 2048;
                        if (~var14 > -1) {
                           var14 = -var14;
                        }

                        var14 = -var14 + 2048 << 1;
                        if (!var3) {
                           break label42;
                        }
                     }

                     var14 = class270.field3734[(4081 & var14) >> 4] + 4096 >> 1;
                  }

                  var4[var8] = var14;
                  ++var8;
               } while(class430.field6152 > var8);
            }
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field4296[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method2315(boolean arg0) {
      try {
         if (arg0) {
            field4294 = null;
            field4289 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4296[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2317(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
