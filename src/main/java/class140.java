import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class140 extends class61 {
   @OriginalMember(
      owner = "client!gr",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2021 = new String[]{method1287(method1286("K6T~\t")), method1287(method1286("K6Tt\t")), method1287(method1286("K6Tw\t")), method1287(method1286("K6T}\t")), method1287(method1286("B1\u0016P")), method1287(method1286("WjT\u0012\\")), method1287(method1286("K6Tv\t")), method1287(method1286("K6T\u007f\t")), method1287(method1286("K6Tx\t"))};
   @OriginalMember(
      owner = "client!gr",
      name = "D",
      descriptor = "I"
   )
   public static int field2013;
   @OriginalMember(
      owner = "client!gr",
      name = "H",
      descriptor = "I"
   )
   public static int field2014;
   @OriginalMember(
      owner = "client!gr",
      name = "I",
      descriptor = "I"
   )
   public static int field2015;
   @OriginalMember(
      owner = "client!gr",
      name = "E",
      descriptor = "I"
   )
   public static int field2016;
   @OriginalMember(
      owner = "client!gr",
      name = "F",
      descriptor = "I"
   )
   public static int field2017;
   @OriginalMember(
      owner = "client!gr",
      name = "C",
      descriptor = "I"
   )
   public static int field2019;
   @OriginalMember(
      owner = "client!gr",
      name = "G",
      descriptor = "I"
   )
   public static int field2020;
   @OriginalMember(
      owner = "client!gr",
      name = "B",
      descriptor = "[B"
   )
   private byte[] field2018;

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IIII)[B",
      line = 3
   )
   public final byte[] method1280(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2019;
         this.field2018 = new byte[arg0 * 2 * arg3 * arg2];
         this.method4171(arg0, arg3, false, arg2);
         return arg1 != 255 ? null : this.field2018;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2021[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "b",
      descriptor = "(I)V",
      line = 19
   )
   public static final void method1281(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field2014;
         int var2 = 84 % ((15 - arg0) / 52);
         int var3 = 0;
         if (var1 || var3 < class615.field8929) {
            do {
               int var4 = class334.field5139[var3];
               class795 var5 = (class795)class501.field7665.method3141((long)var4, true);
               if (var5 != null) {
                  class466 var6 = var5.field11592;
                  class705.method5201((byte)-96, var6.field7072.field5250, var6);
               }

               ++var3;
            } while(var3 < class615.field8929);

         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2021[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(BII)V",
      line = 50
   )
   public final void method354(byte arg0, int arg1, int arg2) {
      try {
         if (arg2 == -11617) {
            ++field2020;
            int var4 = arg1 * 2;
            int var10001 = var4;
            int var8 = var4 + 1;
            this.field2018[var10001] = -1;
            int var5 = arg0 & 255;
            this.field2018[var8] = (byte)(var5 * 3 >> 5);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2021[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(ZI)I",
      line = 67
   )
   public static final int method1282(boolean arg0, int arg1) {
      try {
         if (arg0) {
            return -64;
         } else {
            ++field2013;
            return arg1 >>> 7;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2021[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(Lria;Z)V",
      line = 80
   )
   public static final void method1283(class185 arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         if (arg1) {
            method1282(true, -110);
         }

         ++field2017;
         if (arg0 != null) {
            class326.field4958.method4980(arg0, 0);
            ++class558.field8307;
            Object var3 = null;
            class525 var4;
            if (!arg0.field2911 && !"".equals(arg0.field2910)) {
               class525 var10000;
               long var5;
               label79: {
                  var5 = arg0.field2895;
                  var4 = (class525)class715.field10719.method3141(var5, !arg1);
                  if (var2) {
                     var10000 = var4;
                  } else if (var4 == null) {
                     var10000 = var4;
                     if (!var2) {
                        break label79;
                     }
                  } else {
                     var10000 = var4;
                  }

                  label78:
                  while(true) {
                     while(var10000.field8002.equals(arg0.field2910)) {
                        var10000 = var4;
                        if (!var2) {
                           break label78;
                        }
                     }

                     var4 = (class525)class715.field10719.method3148(105);
                     if (var4 == null) {
                        var10000 = var4;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var4;
                     }
                  }
               }

               if (var10000 == null) {
                  var4 = (class525)class630.field9113.method2544(false, var5);
                  if (var4 != null && !var4.field8002.equals(arg0.field2910)) {
                     var4 = null;
                  }

                  if (var4 == null) {
                     var4 = new class525(arg0.field2910);
                  }

                  class715.field10719.method3143(69, var4, var5);
                  ++class97.field1368;
               }
            } else {
               var4 = new class525(arg0.field2910);
               ++class97.field1368;
            }

            if (var4.method4050((byte)-119, arg0)) {
               class680.method5035(var4, 4);
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2021[6] + (arg0 != null ? field2021[5] : field2021[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "c",
      descriptor = "(B)V",
      line = 137
   )
   public static final void method1284(byte arg0) {
      try {
         int var1 = 77 / (arg0 / 51);
         class780.field11436 = null;
         ++field2015;
         class655.field9789 = -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2021[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(II)Z",
      line = 149
   )
   public static final boolean method1285(int arg0, int arg1) {
      try {
         ++field2016;
         if (arg1 != -11925) {
            return false;
         } else {
            return (-arg0 & arg0) == arg0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2021[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "<init>",
      descriptor = "()V",
      line = 160
   )
   public class140() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1286(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1287(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
