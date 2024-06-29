import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class138 extends class629 {
   @OriginalMember(
      owner = "client!qea",
      name = "G",
      descriptor = "I"
   )
   private int field2242 = 4096;
   @OriginalMember(
      owner = "client!qea",
      name = "I",
      descriptor = "I"
   )
   private int field2241 = 4096;
   @OriginalMember(
      owner = "client!qea",
      name = "D",
      descriptor = "I"
   )
   private int field2248 = 4096;
   @OriginalMember(
      owner = "client!qea",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2249 = new String[]{method1290(method1289(",pc#%u")), method1290(method1289("&;,#\u001d")), method1290(method1289("3`na")), method1290(method1289(",pc#-u")), method1290(method1289(",pc#.u")), method1290(method1289(",pc#,u"))};
   @OriginalMember(
      owner = "client!qea",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field2243 = false;
   @OriginalMember(
      owner = "client!qea",
      name = "K",
      descriptor = "I"
   )
   public static int field2245;
   @OriginalMember(
      owner = "client!qea",
      name = "J",
      descriptor = "I"
   )
   public static int field2246;
   @OriginalMember(
      owner = "client!qea",
      name = "E",
      descriptor = "I"
   )
   public static int field2247;
   @OriginalMember(
      owner = "client!qea",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field2244;

   @OriginalMember(
      owner = "client!qea",
      name = "<init>",
      descriptor = "()V"
   )
   public class138() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!qea",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1287(byte arg0) {
      try {
         field2244 = null;
         if (arg0 != -118) {
            method1287((byte)-57);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2249[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "c",
      descriptor = "(II)[B"
   )
   public static final byte[] method1288(int arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field2247;
         int var3 = 27 % ((-63 - arg0) / 44);
         class61 var4 = (class61)class100.field1664.method162((long)arg1, 109);
         if (var4 == null) {
            byte[] var5 = new byte[512];
            Random var6 = new Random((long)arg1);
            int var7 = 0;
            if (var2) {
               var5[var7] = (byte)var7;
               ++var7;
            }

            while(true) {
               while(~var7 > -256) {
                  var5[var7] = (byte)var7;
                  ++var7;
               }

               int var8 = 0;
               if (!var2) {
                  if (var2 || var8 < 255) {
                     do {
                        int var9 = -var8 + 255;
                        int var10 = class398.method3070(var9, var6, (byte)114);
                        byte var11 = var5[var10];
                        var5[var10] = var5[var9];
                        var5[var9] = var5[-var8 + 511] = var11;
                        ++var8;
                     } while(var8 < 255);
                  }

                  var4 = new class61(var5);
                  class100.field1664.method164((long)arg1, var4, (byte)-124);
                  break;
               }

               ++var7;
            }
         }

         return var4.field1151;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field2249[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label46: {
            label45: {
               label44: {
                  if (arg2 != 0) {
                     if (~arg2 == -2) {
                        break label44;
                     }

                     if (arg2 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field2241 = arg0.method3565(true);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field2248 = arg0.method3565(true);
               if (!var4) {
                  break label46;
               }
            }

            this.field2242 = arg0.method3565(true);
         }

         if (arg1 != 0) {
            field2243 = false;
         }

         ++field2245;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2249[0] + (arg0 != null ? field2249[1] : field2249[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2246;
         if (arg1 != 0) {
            return null;
         } else {
            int[][] var4 = super.field9169.method785((byte)79, arg0);
            if (super.field9169.field1332) {
               int[][] var5 = this.method4621(arg1 ^ -118, 0, arg0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               if (var3 || class66.field1214 > var12) {
                  do {
                     int var13 = var6[var12];
                     int var14 = var8[var12];
                     int var15 = var7[var12];
                     if (var13 == var14 && var14 == var15) {
                        var9[var12] = this.field2241 * var13 >> 12;
                        var10[var12] = this.field2248 * var14 >> 12;
                        var11[var12] = this.field2242 * var15 >> 12;
                        if (!var3) {
                           ++var12;
                           continue;
                        }
                     }

                     var9[var12] = this.field2241;
                     var10[var12] = this.field2248;
                     var11[var12] = this.field2242;
                     ++var12;
                  } while(class66.field1214 > var12);
               }
            }

            return var4;
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field2249[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1289(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1290(char[] arg0) {
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
            var10005 = 21;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
