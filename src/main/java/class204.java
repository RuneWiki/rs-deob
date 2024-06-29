import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class204 extends class213 {
   @OriginalMember(
      owner = "client!ru",
      name = "O",
      descriptor = "I"
   )
   private int field2502 = -1;
   @OriginalMember(
      owner = "client!ru",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2516 = new String[]{method1544(method1543("\u0017$~\u0001 ")), method1544(method1543("\u0017$~\u0003 ")), method1544(method1543("\u0017$~\u0002 ")), method1544(method1543("\u0017$~\u0014IM")), method1544(method1543("\u0017$~\u0000 ")), method1544(method1543("\u0017$~\u0016IM")), method1544(method1543("\u001e\u007f~{u")), method1544(method1543("\u0017$~\u0012 ")), method1544(method1543("\u000b$<9")), method1544(method1543("\u0017$~\u0011IM")), method1544(method1543("\u0017$~\u0017IM")), method1544(method1543("\u0017$~\u001f "))};
   @OriginalMember(
      owner = "client!ru",
      name = "R",
      descriptor = "Lnw;"
   )
   public static class616 field2504 = new class616(58, 6);
   @OriginalMember(
      owner = "client!ru",
      name = "N",
      descriptor = "I"
   )
   public static int field2500;
   @OriginalMember(
      owner = "client!ru",
      name = "S",
      descriptor = "I"
   )
   public static int field2501;
   @OriginalMember(
      owner = "client!ru",
      name = "J",
      descriptor = "I"
   )
   public int field2503;
   @OriginalMember(
      owner = "client!ru",
      name = "P",
      descriptor = "I"
   )
   public static int field2505;
   @OriginalMember(
      owner = "client!ru",
      name = "H",
      descriptor = "I"
   )
   public static int field2506;
   @OriginalMember(
      owner = "client!ru",
      name = "T",
      descriptor = "I"
   )
   public static int field2507;
   @OriginalMember(
      owner = "client!ru",
      name = "L",
      descriptor = "I"
   )
   public int field2508;
   @OriginalMember(
      owner = "client!ru",
      name = "D",
      descriptor = "I"
   )
   public static int field2509;
   @OriginalMember(
      owner = "client!ru",
      name = "F",
      descriptor = "I"
   )
   public static int field2510;
   @OriginalMember(
      owner = "client!ru",
      name = "E",
      descriptor = "I"
   )
   public static int field2511;
   @OriginalMember(
      owner = "client!ru",
      name = "I",
      descriptor = "I"
   )
   public static int field2514;
   @OriginalMember(
      owner = "client!ru",
      name = "G",
      descriptor = "Lqh;"
   )
   public static class74 field2512;
   @OriginalMember(
      owner = "client!ru",
      name = "K",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field2515;
   @OriginalMember(
      owner = "client!ru",
      name = "Q",
      descriptor = "[I"
   )
   public int[] field2513;

   @OriginalMember(
      owner = "client!ru",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method1535(int arg0) {
      try {
         field2512 = null;
         field2504 = null;
         field2515 = null;
         if (arg0 != 0) {
            method1535(-99);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2516[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2514;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (super.field2644.field6719 && this.method1540(-1)) {
            label60: {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = this.field2508 * (~class392.field5515 == ~this.field2503 ? arg0 : this.field2503 * arg0 / class392.field5515);
               if (class576.field7916 != this.field2508) {
                  int var9 = 0;
                  if (var3 || var9 < class576.field7916) {
                     do {
                        int var10 = this.field2508 * var9 / class576.field7916;
                        int var11 = this.field2513[var8 + var10];
                        var7[var9] = class743.method5375(255, var11) << 4;
                        var6[var9] = class743.method5375(4080, var11 >> 4);
                        var5[var9] = class743.method5375(16711680, var11) >> 12;
                        ++var9;
                     } while(var9 < class576.field7916);
                  }

                  if (!var3) {
                     break label60;
                  }
               }

               int var12 = 0;
               if (var3 || class576.field7916 > var12) {
                  do {
                     int var13 = this.field2513[var8++];
                     var7[var12] = class743.method5375(255, var13) << 4;
                     var6[var12] = class743.method5375(var13 >> 4, 4080);
                     var5[var12] = class743.method5375(var13, 16711680) >> 12;
                     ++var12;
                  } while(class576.field7916 > var12);
               }
            }
         }

         if (arg1 <= 26) {
            this.method1537(-3);
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field2516[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "<init>",
      descriptor = "()V"
   )
   public class204() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method1536(int arg0, int arg1, int arg2) {
      try {
         int var3 = -67 / ((-17 - arg2) / 33);
         ++field2506;
         return (1024 & arg1) != 0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2516[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1537(int arg0) {
      try {
         if (arg0 >= -57) {
            method1538(-127);
         }

         ++field2501;
         super.method1537(-71);
         this.field2513 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2516[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method1538(int arg0) {
      try {
         ++field2507;
         if (class423.field5947 != null) {
            class423.field5947 = null;
            class480.method3499(class746.field10850, arg0 ^ arg0, class46.field535, class594.field8244, class275.field3671);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2516[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method1539(int arg0) {
      try {
         method1538(arg0 ^ -239662812);
         ++field2500;
         class666.field9473 = false;
         class480.method3499(class378.field5305, arg0 + arg0, class441.field6118, class604.field8417, class67.field776);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2516[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "j",
      descriptor = "(I)Z"
   )
   public final boolean method1540(int arg0) {
      try {
         ++field2505;
         if (this.field2513 != null) {
            return true;
         } else if (arg0 >= ~this.field2502) {
            class267 var2 = ~class483.field6662 > -1 ? class267.method2048(class170.field2139, this.field2502) : class267.method2050(class170.field2139, class483.field6662, this.field2502);
            var2.method2049();
            this.field2513 = var2.method2053();
            this.field2503 = var2.field3469;
            this.field2508 = var2.field3467;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2516[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field2511;
         int var4 = 116 / ((arg1 - 68) / 48);
         if (~arg2 == -1) {
            this.field2502 = arg0.method4280(-19104);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2516[7] + (arg0 != null ? field2516[6] : field2516[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1541(byte arg0) {
      try {
         ++field2510;
         return arg0 < 40 ? 92 : this.field2502;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2516[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1542(byte arg0) {
      boolean var1 = client.field4273;

      try {
         label34: {
            ++field2509;
            if (class280.field3748 != null) {
               class30.method249(class766.field11046, false);
               if (!var1) {
                  break label34;
               }
            }

            if (~class25.field324 == 0) {
               class59.method444(class616.field8591, -128, class766.field11046, class631.field8834);
               if (!var1) {
                  break label34;
               }
            }

            class534.method3844(-8347, class766.field11046);
         }

         if (arg0 < 89) {
            field2515 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2516[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1543(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1544(char[] arg0) {
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
            var10005 = 81;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
