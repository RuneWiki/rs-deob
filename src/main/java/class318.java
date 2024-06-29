import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class318 {
   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4342 = new String[]{method2334(method2333("q\u0004R\u0015\u001a")), method2334(method2333("q\u0004R\u0013\u001a")), method2334(method2333("q\u0004R\u0014\u001a")), method2334(method2333("r\u0004\u0010<")), method2334(method2333("g_R~O")), method2334(method2333("q\u0004R\u0012\u001a")), method2334(method2333("q\u0004R\u0011\u001a"))};
   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "Lwu;"
   )
   public static class395 field4331 = new class395(2, 4, 4, 0);
   @OriginalMember(
      owner = "client!mu",
      name = "i",
      descriptor = "[[B"
   )
   public static byte[][] field4335 = new byte[50][];
   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "I"
   )
   public int field4332;
   @OriginalMember(
      owner = "client!mu",
      name = "h",
      descriptor = "I"
   )
   public int field4333;
   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "I"
   )
   public static int field4334;
   @OriginalMember(
      owner = "client!mu",
      name = "k",
      descriptor = "I"
   )
   public static int field4336;
   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "I"
   )
   public static int field4338;
   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "I"
   )
   public static int field4339;
   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "I"
   )
   public static int field4340;
   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "[Lhca;"
   )
   public class518[] field4337;
   @OriginalMember(
      owner = "client!mu",
      name = "j",
      descriptor = "[[I"
   )
   public static int[][] field4341;

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BLwf;)V",
      line = 10
   )
   public final void method2328(byte param1, class147 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I)V",
      line = 39
   )
   public static final void method2329(int arg0) {
      try {
         ++field4334;
         if (class444.field6324 != 0) {
            try {
               label61: {
                  if (++class167.field2343 > 2000) {
                     class430.field6143.method54((byte)73);
                     if (class80.field1040 >= 2) {
                        break label61;
                     }

                     class679.field10017.method3187((byte)-26);
                     ++class80.field1040;
                     class167.field2343 = 0;
                     class444.field6324 = 1;
                     if (client.field4360) {
                        break label61;
                     }
                  }

                  if (class444.field6324 == 1) {
                     class430.field6143.field97 = class679.field10017.method3185((byte)-85, class316.field4304);
                     class444.field6324 = 2;
                  }

                  int var1 = 3 / ((34 - arg0) / 52);
                  if (~class444.field6324 == -3) {
                     if (class430.field6143.field97.field4078 == 2) {
                        throw new IOException();
                     }

                     if (class430.field6143.field97.field4078 != 1) {
                        return;
                     }

                     class430.field6143.field102 = class733.method5334((Socket)class430.field6143.field97.field4077, (byte)-108, 15000);
                     class430.field6143.field97 = null;
                     class430.field6143.method52((byte)94);
                     class444.field6324 = 4;
                  }

                  if (class444.field6324 == 4) {
                     if (!class430.field6143.field102.method1380(1, false)) {
                        return;
                     }

                     class430.field6143.field102.method1379(1, 0, class430.field6143.field105.field1889, -1);
                     int var2 = class430.field6143.field105.field1889[0] & 255;
                     class596.field8763 = var2;
                     class444.field6324 = 0;
                     class430.field6143.method54((byte)123);
                     return;
                  }

                  return;
               }

               class444.field6324 = 0;
               class596.field8763 = -5;
            } catch (IOException var4) {
               class430.field6143.method54((byte)87);
               if (~class80.field1040 <= -3) {
                  class444.field6324 = 0;
                  class596.field8763 = -4;
               } else {
                  class679.field10017.method3187((byte)-26);
                  class444.field6324 = 1;
                  ++class80.field1040;
                  class167.field2343 = 0;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4342[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(I)V",
      line = 130
   )
   public static void method2330(int arg0) {
      try {
         field4331 = null;
         field4341 = null;
         if (arg0 != 22670) {
            method2331((byte)50);
         }

         field4335 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4342[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(B)V",
      line = 143
   )
   public static final void method2331(byte arg0) {
      try {
         ++field4338;
         if (arg0 != 83) {
            field4341 = null;
         }

         class274.field3758.method572(class147.field1883, class623.field9162, class155.field2213);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4342[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lqca;BLwf;)Lhca;",
      line = 155
   )
   private final class518 method2332(class127 arg0, byte arg1, class147 arg2) {
      try {
         ++field4339;
         if (class9.field85 == arg0) {
            return class453.method3310(arg2, (byte)60);
         } else if (class336.field4574 == arg0) {
            return class263.method2007(arg2, 18563);
         } else if (class245.field3376 == arg0) {
            return class134.method1059(-21265, arg2);
         } else if (class116.field1445 == arg0) {
            return class470.method3408(arg2, -103);
         } else if (class509.field7411 == arg0) {
            return class134.method1058(-78, arg2);
         } else if (class102.field1305 == arg0) {
            return class488.method3545(arg2, false);
         } else if (class291.field4020 == arg0) {
            return class46.method387(-161, arg2);
         } else if (class271.field3741 == arg0) {
            return class153.method1279(arg2, 124);
         } else if (class592.field8711 == arg0) {
            return class416.method3109(arg2, 2);
         } else if (class345.field4670 == arg0) {
            return class12.method65((byte)36, arg2);
         } else {
            int var4 = 124 / ((-51 - arg1) / 37);
            return null;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4342[6] + (arg0 != null ? field4342[4] : field4342[3]) + ',' + arg1 + ',' + (arg2 != null ? field4342[4] : field4342[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2333(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2334(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
