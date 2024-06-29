import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class449 implements class644 {
   @OriginalMember(
      owner = "client!li",
      name = "j",
      descriptor = "I"
   )
   public int field6554;
   @OriginalMember(
      owner = "client!li",
      name = "l",
      descriptor = "Lfk;"
   )
   public class678 field6556;
   @OriginalMember(
      owner = "client!li",
      name = "e",
      descriptor = "I"
   )
   public int field6551;
   @OriginalMember(
      owner = "client!li",
      name = "f",
      descriptor = "Lqda;"
   )
   public class112 field6564;
   @OriginalMember(
      owner = "client!li",
      name = "m",
      descriptor = "I"
   )
   public int field6560;
   @OriginalMember(
      owner = "client!li",
      name = "k",
      descriptor = "I"
   )
   public int field6555;
   @OriginalMember(
      owner = "client!li",
      name = "q",
      descriptor = "I"
   )
   public int field6561;
   @OriginalMember(
      owner = "client!li",
      name = "g",
      descriptor = "I"
   )
   public int field6562;
   @OriginalMember(
      owner = "client!li",
      name = "c",
      descriptor = "I"
   )
   public int field6566;
   @OriginalMember(
      owner = "client!li",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6567 = new String[]{method3388(method3387("/?f&>")), method3388(method3387(":d$d")), method3388(method3387("8xf4*:x<6k")), method3388(method3387("8xfIk")), method3388(method3387("8xfBk")), method3388(method3387("8xf@k")), method3388(method3387("8xfAk")), method3388(method3387("8xfNk")), method3388(method3387("8xfOk"))};
   @OriginalMember(
      owner = "client!li",
      name = "o",
      descriptor = "I"
   )
   public static int field6559 = 0;
   @OriginalMember(
      owner = "client!li",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field6565 = new int[6];
   @OriginalMember(
      owner = "client!li",
      name = "d",
      descriptor = "I"
   )
   public static int field6550;
   @OriginalMember(
      owner = "client!li",
      name = "i",
      descriptor = "I"
   )
   public static int field6552;
   @OriginalMember(
      owner = "client!li",
      name = "h",
      descriptor = "I"
   )
   public static int field6553;
   @OriginalMember(
      owner = "client!li",
      name = "p",
      descriptor = "I"
   )
   public static int field6557;
   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "I"
   )
   public static int field6558;
   @OriginalMember(
      owner = "client!li",
      name = "n",
      descriptor = "I"
   )
   public static int field6563;

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "([BII)[B",
      line = 4
   )
   public static final byte[] method3382(byte[] arg0, int arg1, int arg2) {
      try {
         ++field6563;
         if (arg2 != -65536) {
            method3386((byte)124);
         }

         byte[] var3 = new byte[arg1];
         class365.method2856(arg0, 0, var3, 0, arg1);
         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6567[5] + (arg0 != null ? field6567[0] : field6567[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(I)V",
      line = 18
   )
   public static void method3383(int arg0) {
      try {
         field6565 = null;
         if (arg0 != 90) {
            method3384((class473)null, 62);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6567[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(Luda;I)Lwia;",
      line = 38
   )
   public static final class790 method3384(class473 arg0, int arg1) {
      try {
         ++field6553;
         int var2 = arg0.method3565(true);
         if (arg1 < 34) {
            method3385((byte)61);
         }

         class678 var3 = class405.method3115(86)[arg0.method3564((byte)-97)];
         class112 var4 = class213.method1811(false)[arg0.method3564((byte)-117)];
         int var5 = arg0.method3538(-128);
         int var6 = arg0.method3538(-128);
         return new class790(var2, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6567[6] + (arg0 != null ? field6567[0] : field6567[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "b",
      descriptor = "(B)I",
      line = 66
   )
   public static final int method3385(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field6550;
         class65 var2 = class444.field6473;
         boolean var3 = false;
         if (~class510.field7454.field11145.method2098(false) != -1) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class328.method2537((class160)null, var4, 0, (class141)null, (byte)-110, 0);
            var3 = true;
         }

         long var5 = class57.method650(118);
         if (arg0 <= 3) {
            method3385((byte)67);
         }

         int var7 = 0;
         if (var1) {
            var2.method385(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            ++var7;
         }

         while(true) {
            while(var7 < 10000) {
               var2.method385(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
               ++var7;
            }

            int var8 = (int)(class57.method650(125) - var5);
            var2.method693(10240, -16777216, 100, 100, 0, 0);
            if (!var1) {
               if (var3) {
                  var2.method697(true);
               }

               return var8;
            }

            ++var7;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field6567[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "c",
      descriptor = "(B)V",
      line = 108
   )
   public static final void method3386(byte arg0) {
      try {
         ++field6557;
         if (class85.field1410) {
            if (arg0 <= -1) {
               class303 var1 = class345.method2670(class752.field10823, (byte)104, class780.field11429);
               if (var1 != null && var1.field4393 != null) {
                  class227 var2 = new class227();
                  var2.field3360 = var1;
                  var2.field3352 = var1.field4393;
                  class161.method1463(var2);
               }

               class513.field7486 = -1;
               class85.field1410 = false;
               class135.field2225 = -1;
               if (var1 != null) {
                  class322.method2512(16, var1);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6567[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(B)Lqg;",
      line = 140
   )
   public class485 method672(byte arg0) {
      try {
         ++field6558;
         if (arg0 != 83) {
            this.field6562 = -19;
         }

         return null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6567[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "<init>",
      descriptor = "(Lfk;Lqda;IIIIIII)V",
      line = 158
   )
   public class449(class678 arg0, class112 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field6554 = arg8;
         this.field6556 = arg0;
         this.field6551 = arg6;
         this.field6564 = arg1;
         this.field6560 = arg3;
         this.field6555 = arg4;
         this.field6561 = arg2;
         this.field6562 = arg7;
         this.field6566 = arg5;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field6567[2] + (arg0 != null ? field6567[0] : field6567[1]) + ',' + (arg1 != null ? field6567[0] : field6567[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3387(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!li",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3388(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
