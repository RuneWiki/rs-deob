import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class668 extends class55 {
   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9718 = new String[]{method4879(method4878("AFet\u0004")), method4879(method4878("AFer\u0004")), method4879(method4878("AFes\u0004")), method4879(method4878("AFe\u007f\u0004")), method4879(method4878("AFeq\u0004")), method4879(method4878("AFep\u0004")), method4879(method4878("\u0005\u0004{")), method4879(method4878("\u0005\u0003*")), method4879(method4878("C\\\"RBTU9ECR\u001e<D\u0013C\r")), method4879(method4878("\u0006Fz\n")), method4879(method4878("\u0005\u0002}")), method4879(method4878("\u0006Fy\n")), method4879(method4878("\u0006Uv")), method4879(method4878("\u0005\u0002x")), method4879(method4878("\u0000Lk")), method4879(method4878("\u0006Ev")), method4879(method4878("AFev\u0004"))};
   @OriginalMember(
      owner = "client!av",
      name = "j",
      descriptor = "I"
   )
   public static int field9708;
   @OriginalMember(
      owner = "client!av",
      name = "l",
      descriptor = "I"
   )
   public static int field9709;
   @OriginalMember(
      owner = "client!av",
      name = "e",
      descriptor = "I"
   )
   public static int field9710;
   @OriginalMember(
      owner = "client!av",
      name = "n",
      descriptor = "I"
   )
   public static int field9711;
   @OriginalMember(
      owner = "client!av",
      name = "k",
      descriptor = "I"
   )
   public static int field9712;
   @OriginalMember(
      owner = "client!av",
      name = "g",
      descriptor = "I"
   )
   public static int field9713;
   @OriginalMember(
      owner = "client!av",
      name = "f",
      descriptor = "I"
   )
   public static int field9715;
   @OriginalMember(
      owner = "client!av",
      name = "i",
      descriptor = "I"
   )
   public static int field9716;
   @OriginalMember(
      owner = "client!av",
      name = "h",
      descriptor = "I"
   )
   public static int field9717;
   @OriginalMember(
      owner = "client!av",
      name = "m",
      descriptor = "[[B"
   )
   public static byte[][] field9714;

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method4874(byte arg0) {
      try {
         int var1 = -62 % ((arg0 - -23) / 36);
         field9714 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9718[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(IC)I",
      line = 13
   )
   public static final int method4875(int arg0, char arg1) {
      try {
         ++field9708;
         return ~arg1 <= arg0 && class603.field8874.length > arg1 ? class603.field8874[arg1] : -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9718[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 27
   )
   public class668(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(I)V",
      line = 34
   )
   public final void method98(int arg0) {
      try {
         if (~super.field680 != -2 && super.field680 != 0) {
            super.field680 = this.method101(arg0 + -125);
         }

         ++field9717;
         if (arg0 != 0) {
            this.method4877(-71);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9718[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V",
      line = 47
   )
   public static final void method4876(int arg0, String arg1, Throwable arg2) {
      boolean var3 = client.field4360;
      ++field9715;

      try {
         String var4 = "";
         if (arg2 != null) {
            var4 = class760.method5513((byte)-41, arg2);
         }

         if (arg1 != null) {
            if (arg2 != null) {
               var4 = var4 + field9718[14];
            }

            var4 = var4 + arg1;
         }

         class494.method3592(var4, 120);
         String var5 = class227.method1770(":", field9718[7], -3, var4);
         String var6 = class227.method1770("@", field9718[6], -3, var5);
         String var7 = class227.method1770("&", field9718[10], -3, var6);
         String var8 = class227.method1770("#", field9718[13], -3, var7);
         if (class229.field3230 != null) {
            if (arg0 > -28) {
               field9714 = null;
            }

            class296 var9 = class356.field4789.method4509((byte)87, new URL(class229.field3230.getCodeBase(), field9718[8] + class484.field6924 + field9718[15] + (class564.field8047 != null ? class564.field8047 : String.valueOf(class473.field6815)) + field9718[9] + class619.field9136 + field9718[11] + class619.field9133 + field9718[12] + var8));
            if (var3) {
               class661.method4825(0, 1L);
            }

            while(true) {
               int var10000;
               if (var9.field4078 != 0) {
                  var10000 = ~var9.field4078;
                  if (!var3) {
                     if (var10000 == -2) {
                        DataInputStream var10 = (DataInputStream)var9.field4077;
                        var10.read();
                        var10.close();
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = 0;
               }

               class661.method4825(var10000, 1L);
            }
         }
      } catch (Exception var11) {
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "c",
      descriptor = "(I)I",
      line = 99
   )
   public final int method4877(int arg0) {
      try {
         ++field9709;
         int var2 = -22 / ((arg0 - 36) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9718[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "b",
      descriptor = "(IB)V",
      line = 109
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field9716;
         int var3 = -29 / ((47 - arg1) / 46);
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9718[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(IB)I",
      line = 119
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method97(6, (byte)-95);
         }

         ++field9710;
         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9718[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "b",
      descriptor = "(I)I",
      line = 130
   )
   public final int method101(int arg0) {
      try {
         ++field9711;
         if (arg0 > -116) {
            this.method4877(-64);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9718[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 145
   )
   public class668(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4878(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4879(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
