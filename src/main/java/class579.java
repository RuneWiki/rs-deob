import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class579 {
   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8575 = new String[]{method4336(method4335("\u0000Y%\u0018O")), method4336(method4335("\u0000Y%\u0019O")), method4336(method4335("\n]g6")), method4336(method4335("\u0000Y%\u001bO")), method4336(method4335("\u001f\u0006%t\u001a"))};
   @OriginalMember(
      owner = "client!dq",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8571;
   @OriginalMember(
      owner = "client!dq",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8573;
   @OriginalMember(
      owner = "client!dq",
      name = "e",
      descriptor = "I"
   )
   public static int field8570;
   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "I"
   )
   public static int field8572;
   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8574;

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IB)Lfn;"
   )
   public static final class696 method4332(int arg0, byte arg1) {
      try {
         ++field8570;
         int var2 = 49 % ((-15 - arg1) / 62);
         class696 var3 = (class696)class23.field343.method3192((long)arg0, (byte)-121);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4 = class36.field507.method2697(arg0, 0, false);
            class696 var5 = new class696();
            if (var4 != null) {
               var5.method5070(arg0, 12102, new class66(var4));
            }

            class23.field343.method3190(var5, (long)arg0, 8);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8575[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "([BI)V"
   )
   public static final void method4333(byte[] arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field8572;
         if (arg1 <= 57) {
            method4333((byte[])null, -75);
         }

         class66 var3 = new class66(arg0);

         while(true) {
            label102:
            while(true) {
               int var4 = var3.method640(255);
               if (~var4 == -1) {
                  if (!var2) {
                     return;
                  }
                  break;
               }

               if (~var4 == -2) {
                  break;
               }

               if (~var4 != -5) {
                  if (var4 != 5) {
                     continue;
                  }

                  int var5 = var3.method640(255);
                  class163.field2070 = new int[var5];
                  int var6 = 0;
                  if (var2) {
                     class163.field2070[var6] = var3.method603(-2);
                     if (~class163.field2070[var6] == -65536) {
                        class163.field2070[var6] = -1;
                     }

                     ++var6;
                  }

                  while(true) {
                     if (~var5 >= ~var6) {
                        if (!var2) {
                           if (!var2) {
                              continue label102;
                           }
                           break;
                        }
                     } else {
                        class163.field2070[var6] = var3.method603(-2);
                     }

                     if (~class163.field2070[var6] == -65536) {
                        class163.field2070[var6] = -1;
                     }

                     ++var6;
                  }
               }

               int var7 = var3.method640(255);
               class516.field7209 = new int[var7];
               int var8 = 0;
               if (var2) {
                  class516.field7209[var8] = var3.method603(-2);
                  if (class516.field7209[var8] == 65535) {
                     class516.field7209[var8] = -1;
                  }

                  ++var8;
               }

               while(true) {
                  if (var7 <= var8) {
                     if (!var2) {
                        if (var2) {
                           break label102;
                        }
                        break;
                     }
                  } else {
                     class516.field7209[var8] = var3.method603(-2);
                  }

                  if (class516.field7209[var8] == 65535) {
                     class516.field7209[var8] = -1;
                  }

                  ++var8;
               }
            }

            int[] var9 = class700.field10255 = new int[6];
            var9[0] = var3.method603(-2);
            var9[1] = var3.method603(-2);
            var9[2] = var3.method603(-2);
            var9[3] = var3.method603(-2);
            var9[4] = var3.method603(-2);
            var9[5] = var3.method603(-2);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8575[3] + (arg0 != null ? field8575[4] : field8575[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4334(int arg0) {
      try {
         field8574 = null;
         if (arg0 == -1) {
            field8571 = null;
            field8573 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8575[1] + arg0 + ')');
      }
   }

   static {
      String var0 = method4336(method4335("1F`4\b\u0013F"));

      try {
         var0 = System.getProperty(method4336(method4335("\u000eI};I\u0012Me>\b\u0016"))).toLowerCase();
      } catch (Exception var11) {
      }

      var0.toLowerCase();
      String var1 = method4336(method4335("1F`4\b\u0013F"));

      try {
         var1 = System.getProperty(method4336(method4335("\u000eI};I\u0012My)\u000e\u000bF"))).toLowerCase();
      } catch (Exception var10) {
      }

      var1.toLowerCase();
      String var2 = method4336(method4335("1F`4\b\u0013F"));

      try {
         var2 = System.getProperty(method4336(method4335("\u000b[%4\u0006\tM"))).toLowerCase();
      } catch (Exception var9) {
      }

      field8571 = var2.toLowerCase();
      String var3 = method4336(method4335("1F`4\b\u0013F"));

      try {
         var3 = System.getProperty(method4336(method4335("\u000b[%;\u0015\u0007@"))).toLowerCase();
      } catch (Exception var8) {
      }

      field8573 = var3.toLowerCase();
      String var4 = method4336(method4335("1F`4\b\u0013F"));

      try {
         var4 = System.getProperty(method4336(method4335("\u000b[%,\u0002\u0016[b5\t"))).toLowerCase();
      } catch (Exception var7) {
      }

      var4.toLowerCase();
      String var5 = method4336(method4335("\u001a\u0007"));

      try {
         var5 = System.getProperty(method4336(method4335("\u0011[n(I\fGf?"))).toLowerCase();
      } catch (Exception var6) {
      }

      new File(var5);
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4336(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
