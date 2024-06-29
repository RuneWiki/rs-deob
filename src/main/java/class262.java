import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class262 {
   @OriginalMember(
      owner = "client!ae",
      name = "c",
      descriptor = "Las;"
   )
   public class162 field3576;
   @OriginalMember(
      owner = "client!ae",
      name = "e",
      descriptor = "[Ldt;"
   )
   public class251[] field3580;
   @OriginalMember(
      owner = "client!ae",
      name = "l",
      descriptor = "[Ldt;"
   )
   public class251[] field3578;
   @OriginalMember(
      owner = "client!ae",
      name = "k",
      descriptor = "Las;"
   )
   public class162 field3577;
   @OriginalMember(
      owner = "client!ae",
      name = "h",
      descriptor = "Las;"
   )
   public class162 field3586;
   @OriginalMember(
      owner = "client!ae",
      name = "d",
      descriptor = "Z"
   )
   public boolean field3579;
   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3587 = new String[]{method1994(method1993("f\u001dGf\f")), method1994(method1993("f\u001dG`\f")), method1994(method1993("|VG\nY")), method1994(method1993("f\u001dG\u0018Mi\u0011\u001d\u001a\f")), method1994(method1993("i\r\u0005H")), method1994(method1993("f\u001dGe\f")), method1994(method1993("J\u001d\u0004\u001e")), method1994(method1993("A\b\u001a\u001e")), method1994(method1993("f\u001dGg\f")), method1994(method1993("B7/"))};
   @OriginalMember(
      owner = "client!ae",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field3585 = new int[4];
   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field3584 = new class101(83, -1);
   @OriginalMember(
      owner = "client!ae",
      name = "i",
      descriptor = "I"
   )
   public static int field3575;
   @OriginalMember(
      owner = "client!ae",
      name = "j",
      descriptor = "I"
   )
   public static int field3581;
   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "I"
   )
   public static int field3582;
   @OriginalMember(
      owner = "client!ae",
      name = "g",
      descriptor = "I"
   )
   public static int field3583;

   @OriginalMember(
      owner = "client!ae",
      name = "<init>",
      descriptor = "(Lck;)V",
      line = 185
   )
   public class262(class667 arg0) {
      int var2 = client.field4530;
      super();
      this.field3576 = null;
      this.field3580 = null;
      this.field3578 = null;
      this.field3577 = null;
      this.field3586 = null;

      try {
         this.field3579 = arg0.field9995;
         class180.method1417(arg0, (byte)49);
         if (this.field3579) {
            byte[] var3 = class500.method3731((byte)82, false, class693.field10417);
            this.field3586 = new class162(arg0, 6410, 128, 128, 16, var3, 6410);
            byte[] var4 = class500.method3731((byte)-116, false, class455.field6906);
            this.field3577 = new class162(arg0, 6410, 128, 128, 16, var4, 6410);
            class30 var5 = arg0.field9899;
            if (var5.method215(0)) {
               class162 var7;
               label35: {
                  byte[] var6 = class500.method3731((byte)-114, false, class486.field7196);
                  this.field3576 = new class162(arg0, 6408, 128, 128, 16);
                  var7 = new class162(arg0, 6409, 128, 128, 16, var6, 6409);
                  if (!var5.method214(73, this.field3576, var7, 2.0F)) {
                     this.field3576.method5015((byte)76);
                     this.field3576 = null;
                     if (var2 == 0) {
                        break label35;
                     }
                  }

                  this.field3576.method5013((byte)70);
               }

               var7.method5015((byte)57);
               return;
            }
         } else {
            Object var10000;
            int var10001;
            label63: {
               this.field3580 = new class251[16];
               int var8 = 0;
               if (var2 != 0) {
                  var10000 = class693.field10417;
                  var10001 = 32768;
               } else if (var8 >= 16) {
                  var10000 = this;
                  var10001 = 16;
                  if (var2 == 0) {
                     break label63;
                  }
               } else {
                  var10000 = class693.field10417;
                  var10001 = 32768;
               }

               while(true) {
                  byte[] var9 = class10.method86(var10000, var10001, var8 * 128 * 128 * 2, (byte)127);
                  this.field3580[var8] = new class251(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
                  ++var8;
                  if (var8 >= 16) {
                     var10000 = this;
                     var10001 = 16;
                     if (var2 == 0) {
                        break;
                     }
                  } else {
                     var10000 = class693.field10417;
                     var10001 = 32768;
                  }
               }
            }

            ((class262)var10000).field3578 = new class251[var10001];
            int var10 = 0;
            if (var2 != 0 || var10 < 16) {
               do {
                  byte[] var11 = class10.method86(class455.field6906, 32768, var10 * 128 * 256, (byte)113);
                  this.field3578[var10] = new class251(arg0, 3553, 6410, 128, 128, true, var11, 6410, false);
                  ++var10;
               } while(var10 < 16);
            }
         }

      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field3587[3] + (arg0 != null ? field3587[2] : field3587[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(B)V",
      line = 10
   )
   public static void method1989(byte arg0) {
      try {
         field3585 = null;
         field3584 = null;
         if (arg0 >= -96) {
            field3584 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3587[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(Lha;ILd;IIII)V",
      line = 30
   )
   public static final void method1990(class66 arg0, int arg1, class160 arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (class180.field2223 < 100) {
            class480.method3565(arg2, arg0, false);
         }

         ++field3575;
         arg0.method554(arg6, arg1, arg6 - -arg4, arg1 + arg3);
         if (class180.field2223 < 100) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg6;
            int var9 = arg1 - -(arg3 / 2) + -var7 - 18;
            arg0.method645(arg6, arg1, arg4, arg3, -16777216, 0);
            arg0.method553(var8 + -152, var9, 304, 34, class8.field129[class779.field11370].getRGB(), 0);
            arg0.method645(var8 + -150, var9 + 2, class180.field2223 * 3, 30, class336.field4808[class779.field11370].getRGB(), 0);
            class524.field7616.method666(0, class204.field2582.method1562((byte)-67, class728.field10827), var7 + var9, -1, var8, class379.field5785[class779.field11370].getRGB());
         } else {
            int var10 = -((int)((float)arg4 / class329.field4678)) + class729.field10834;
            int var11 = (int)((float)arg3 / class329.field4678) + class670.field10075;
            int var12 = (int)((float)arg4 / class329.field4678) + class729.field10834;
            if (arg5 < 107) {
               field3584 = null;
            }

            int var13 = -((int)((float)arg3 / class329.field4678)) + class670.field10075;
            class112.field1357 = (int)((float)(arg4 * 2) / class329.field4678);
            class767.field11257 = -((int)((float)arg4 / class329.field4678)) + class729.field10834;
            class749.field11106 = (int)((float)(arg3 * 2) / class329.field4678);
            class177.field2184 = -((int)((float)arg3 / class329.field4678)) + class670.field10075;
            class329.method2495(class329.field4688 + var10, class329.field4696 + var11, class329.field4688 + var12, class329.field4696 + var13, arg6, arg1, arg4 + arg6, arg1 - -1 + arg3);
            class329.method2476(arg0);
            class550 var14 = class329.method2494(arg0);
            class33.method232(0, 0, arg0, var14, 118);
            if (~class705.field10553 < -1) {
               --class283.field3936;
               if (class283.field3936 == 0) {
                  class283.field3936 = 20;
                  --class705.field10553;
               }
            }

            if (class576.field8555) {
               int var15 = arg4 + arg6 + -5;
               int var16 = arg1 - 8 + arg3;
               class288.field4045.method668(-1, var15, 16776960, field3587[7] + class280.field3898, var16, -25049);
               int var22 = var16 - 15;
               Runtime var17 = Runtime.getRuntime();
               int var18 = (int)((var17.totalMemory() + -var17.freeMemory()) / 1024L);
               int var19 = 16776960;
               if (var18 > 65536) {
                  var19 = 16711680;
               }

               class288.field4045.method668(-1, var15, var19, field3587[6] + var18 + "k", var22, -25049);
               var16 = var22 - 15;
            }
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field3587[5] + (arg0 != null ? field3587[2] : field3587[4]) + ',' + arg1 + ',' + (arg2 != null ? field3587[2] : field3587[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(BD)V",
      line = 112
   )
   public static final void method1991(byte arg0, double arg1) {
      try {
         if (arg0 != -96) {
            method1989((byte)-12);
         }

         class681.field10231.method1513(class283.field3939);
         ++field3583;
         class681.field10231.method1512(0, 0, (int)arg1);
         class616.field9011.method550(class681.field10231);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3587[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(I)V",
      line = 130
   )
   public static final void method1992(int arg0) {
      int var1 = client.field4530;

      try {
         ++field3581;
         class7 var2 = null;

         try {
            class12 var3 = class755.field11144.method5212("2", true, false);
            if (var1 != 0) {
               class89.method817(1L, 2535);
            }

            while(~var3.field159 == -1) {
               class89.method817(1L, 2535);
            }

            if (~var3.field159 == -2) {
               var2 = (class7)var3.field160;
               byte[] var4 = new byte[(int)var2.method65(false)];
               int var5 = 0;
               int var6;
               if (var1 != 0) {
                  var6 = var2.method58(true, var4, var5, var4.length + -var5);
                  if (var6 == -1) {
                     throw new IOException(field3587[9]);
                  }

                  var5 += var6;
               }

               while(true) {
                  int var10000;
                  if (~var5 <= ~var4.length) {
                     var10000 = -23980;
                     if (var1 == 0) {
                        class525.method3870(-23980, new class128(var4));
                        break;
                     }
                  } else {
                     var10000 = var2.method58(true, var4, var5, var4.length + -var5);
                  }

                  var6 = var10000;
                  if (var6 == -1) {
                     throw new IOException(field3587[9]);
                  }

                  var5 += var6;
               }
            }
         } catch (Exception var10) {
         }

         try {
            if (var2 != null) {
               var2.method60(false);
            }

            int var7 = -126 % ((arg0 - 65) / 55);
         } catch (Exception var9) {
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3587[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1993(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1994(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
