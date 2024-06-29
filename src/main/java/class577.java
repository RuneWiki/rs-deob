import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class577 {
   @OriginalMember(
      owner = "client!qd",
      name = "f",
      descriptor = "Z"
   )
   private boolean field8551;
   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "I"
   )
   private int field8556;
   @OriginalMember(
      owner = "client!qd",
      name = "i",
      descriptor = "Liu;"
   )
   public class530 field8559;
   @OriginalMember(
      owner = "client!qd",
      name = "g",
      descriptor = "I"
   )
   private int field8553;
   @OriginalMember(
      owner = "client!qd",
      name = "l",
      descriptor = "I"
   )
   public int field8558;
   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8563 = new String[]{method4328(method4327("O^B#\u0010")), method4328(method4327("O^B!\u0010")), method4328(method4327("PO\u0000\u0006")), method4328(method4327("E\u0014BDE")), method4328(method4327("O^B \u0010")), method4328(method4327("O^BVQPS\u0018T\u0010")), method4328(method4327("O^B&\u0010")), method4328(method4327("O^B-\u0010")), method4328(method4327("O^B\fQP[\u0000\u0003B[\u0012")), method4328(method4327("O^B\"\u0010"))};
   @OriginalMember(
      owner = "client!qd",
      name = "j",
      descriptor = "I"
   )
   public static int field8561 = 0;
   @OriginalMember(
      owner = "client!qd",
      name = "n",
      descriptor = "D"
   )
   public static double field8552;
   @OriginalMember(
      owner = "client!qd",
      name = "e",
      descriptor = "I"
   )
   public static int field8549;
   @OriginalMember(
      owner = "client!qd",
      name = "k",
      descriptor = "I"
   )
   public static int field8550;
   @OriginalMember(
      owner = "client!qd",
      name = "c",
      descriptor = "I"
   )
   public static int field8554;
   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "I"
   )
   public static int field8557;
   @OriginalMember(
      owner = "client!qd",
      name = "m",
      descriptor = "I"
   )
   public static int field8560;
   @OriginalMember(
      owner = "client!qd",
      name = "h",
      descriptor = "I"
   )
   public static int field8562;
   @OriginalMember(
      owner = "client!qd",
      name = "d",
      descriptor = "Lha;"
   )
   public static class479 field8555;

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method4321(int arg0, int arg1, int arg2) {
      try {
         ++field8557;
         class487 var3 = class2.method12((long)arg0 | (long)arg1 << 32, 18, (byte)43);
         int var4 = -29 / ((arg2 - -57) / 56);
         var3.method3696(-11118);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8563[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method3931(byte arg0);

   @OriginalMember(
      owner = "client!qd",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field8554;
         this.field8559.method3998(1, this.field8558, this.field8556);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8563[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method4322(int arg0) {
      try {
         ++field8562;
         return arg0 != 1 ? -92 : class52.method387(108, false);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8563[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "([BIB)V"
   )
   public final void method4323(byte[] arg0, int arg1, byte arg2) {
      try {
         ++field8549;
         this.method3931((byte)-126);
         if (arg2 >= -117) {
            this.field8556 = 54;
         }

         if (~this.field8556 <= ~arg1) {
            OpenGL.glBufferSubDataARBub(this.field8553, 0, arg1, arg0, 0);
         } else {
            OpenGL.glBufferDataARBub(this.field8553, arg1, arg0, 0, this.field8551 ? 35040 : 35044);
            this.field8559.field7658 += -this.field8556 + arg1;
            this.field8556 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8563[6] + (arg0 != null ? field8563[3] : field8563[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method4324(byte arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field8550;
         if (class157.field2022 != arg1) {
            if (arg1 == 14 || arg1 == 15) {
               class4.method33(0);
            }

            if (~arg1 != -15 && class520.field7313 != null) {
               class520.field7313.method1050(9);
               class520.field7313 = null;
            }

            if (arg1 == 3) {
               class413.method3240(25, ~class661.field9817 != ~class405.field5556);
            }

            if (~arg1 == -8) {
               class590.method4394(-17144, class69.field919 != class661.field9817);
            }

            label143: {
               if (~arg1 != -6 && arg1 != 13) {
                  if (arg1 != 6 && ~arg1 != -10) {
                     break label143;
                  }

                  class4.method33(0);
                  if (!var2) {
                     break label143;
                  }
               }

               class17.method135(128);
            }

            if (class427.method3309(class157.field2022, (byte)96)) {
               class405.field5558.field4661 = 2;
               class762.field11161.field4661 = 2;
               class755.field11061.field4661 = 2;
               class504.field7017.field4661 = 2;
               class741.field10844.field4661 = 2;
               class159.field2038.field4661 = 2;
               class674.field9987.field4661 = 2;
            }

            if (class427.method3309(arg1, (byte)-56)) {
               class779.field11364 = 0;
               class313.field4348 = 1;
               class700.field10258 = 0;
               class566.field8338 = 0;
               class120.field1587 = 1;
               class359.method2833(116, true);
               class405.field5558.field4661 = 1;
               class762.field11161.field4661 = 1;
               class755.field11061.field4661 = 1;
               class504.field7017.field4661 = 1;
               class741.field10844.field4661 = 1;
               class159.field2038.field4661 = 1;
               class674.field9987.field4661 = 1;
            }

            if (arg0 > -122) {
               field8552 = 0.7793625219497885D;
            }

            if (~arg1 == -13 || arg1 == 3) {
               class561.method4223(false);
            }

            boolean var3 = arg1 == 2 || class772.method5574(arg1, 5) || class385.method3048(arg1, (byte)-84);
            boolean var4 = class157.field2022 == 2 || class772.method5574(class157.field2022, 5) || class385.method3048(class157.field2022, (byte)10);
            if (var3 == !var4) {
               label158: {
                  if (!var3) {
                     class389.method3068(-16164, 2);
                     class507.field7060.method2924(true, 200);
                     if (!var2) {
                        break label158;
                     }
                  }

                  label106: {
                     class614.field9048 = class469.field6464;
                     if (class757.field11093.field10986.method3351(-18033) != 0) {
                        class159.method1335(class469.field6464, false, 2, 0, class146.field1826, 94, class757.field11093.field10986.method3351(-18033));
                        class318.method2514(71);
                        if (!var2) {
                           break label106;
                        }
                     }

                     class389.method3068(-16164, 2);
                  }

                  class507.field7060.method2924(false, 200);
               }
            }

            if (class427.method3309(arg1, (byte)-102) || ~arg1 == -15 || ~arg1 == -16) {
               class629.field9294.method518();
            }

            class157.field2022 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8563[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method4325(byte arg0, String arg1) {
      boolean var2 = client.field1481;

      try {
         ++field8560;
         int var3 = arg1.length();
         if (arg0 <= 47) {
            field8555 = null;
         }

         int var4 = 0;
         int var5 = 0;
         if (var2) {
            var4 = -var4 + (var4 << 5) + arg1.charAt(var5);
            ++var5;
         }

         while(true) {
            while(var5 < var3) {
               var4 = -var4 + (var4 << 5) + arg1.charAt(var5);
               ++var5;
            }

            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8563[4] + arg0 + ',' + (arg1 != null ? field8563[3] : field8563[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "<init>",
      descriptor = "(Liu;I[BIZ)V"
   )
   public class577(class530 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         this.field8551 = arg4;
         this.field8556 = arg3;
         this.field8559 = arg0;
         this.field8553 = arg1;
         OpenGL.glGenBuffersARB(1, class559.field8186, 0);
         this.field8558 = class559.field8186[0];
         this.method3931((byte)95);
         OpenGL.glBufferDataARBub(arg1, this.field8556, arg2, 0, this.field8551 ? 35040 : 35044);
         this.field8559.field7658 += this.field8556;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8563[5] + (arg0 != null ? field8563[3] : field8563[2]) + ',' + arg1 + ',' + (arg2 != null ? field8563[3] : field8563[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4326(byte arg0) {
      try {
         if (arg0 > 5) {
            field8555 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8563[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "<init>",
      descriptor = "(Liu;ILjaclib/memory/Buffer;IZ)V"
   )
   public class577(class530 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      try {
         this.field8559 = arg0;
         this.field8551 = arg4;
         this.field8556 = arg3;
         this.field8553 = arg1;
         OpenGL.glGenBuffersARB(1, class559.field8186, 0);
         this.field8558 = class559.field8186[0];
         this.method3931((byte)107);
         OpenGL.glBufferDataARBa(arg1, this.field8556, arg2.getAddress(), this.field8551 ? 35040 : 35044);
         this.field8559.field7658 += this.field8556;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8563[5] + (arg0 != null ? field8563[3] : field8563[2]) + ',' + arg1 + ',' + (arg2 != null ? field8563[3] : field8563[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4327(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4328(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
