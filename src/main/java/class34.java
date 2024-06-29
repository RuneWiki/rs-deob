import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class34 extends class629 {
   @OriginalMember(
      owner = "client!bja",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field511 = new String[]{method251(method250("m\u0012ZP\u0011f\u0016R\n\u0013'")), method251(method250("m\u0012ZP}'")), method251(method250("tV\u0015PP")), method251(method250("a\rW\u0012")), method251(method250("m\u0012ZPh'")), method251(method250("m\u0012ZPa'")), method251(method250("m\u0012ZPc'")), method251(method250("m\u0012ZP`'")), method251(method250("{\u001aR")), method251(method250("e\u0019\\\nEj\u0017I\u001f")), method251(method250("`\b^\u0010^a")), method251(method250("c\u0017\\\u0019Hk\u0011U")), method251(method250("m\u0012ZPb'")), method251(method250("c\u000bL\u000e_/\bT\r\u0017")), method251(method250("u\u0019K")), method251(method250("c\u000bL\u000e\r\u007f\u0017HD")), method251(method250("m\u0014Z\u0010F!\u000fH")), method251(method250("z\u0016A\u001f]")), method251(method250("/\bH\u0017WjB"))};
   @OriginalMember(
      owner = "client!bja",
      name = "L",
      descriptor = "J"
   )
   public static long field502 = 0L;
   @OriginalMember(
      owner = "client!bja",
      name = "N",
      descriptor = "Lgh;"
   )
   public static class572 field500 = new class572(100, 3);
   @OriginalMember(
      owner = "client!bja",
      name = "H",
      descriptor = "Luw;"
   )
   public static class435 field510 = new class435(75, 18);
   @OriginalMember(
      owner = "client!bja",
      name = "D",
      descriptor = "I"
   )
   public static int field501;
   @OriginalMember(
      owner = "client!bja",
      name = "I",
      descriptor = "I"
   )
   private int field503;
   @OriginalMember(
      owner = "client!bja",
      name = "J",
      descriptor = "I"
   )
   public static int field504;
   @OriginalMember(
      owner = "client!bja",
      name = "M",
      descriptor = "I"
   )
   public static int field505;
   @OriginalMember(
      owner = "client!bja",
      name = "K",
      descriptor = "I"
   )
   private int field506;
   @OriginalMember(
      owner = "client!bja",
      name = "F",
      descriptor = "I"
   )
   public static int field507;
   @OriginalMember(
      owner = "client!bja",
      name = "E",
      descriptor = "I"
   )
   public static int field508;
   @OriginalMember(
      owner = "client!bja",
      name = "G",
      descriptor = "I"
   )
   private int field509;

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         if (arg1 != 0) {
            field502 = 32L;
         }

         ++field507;
         if (arg2 == 0) {
            this.method246((byte)124, arg0.method3577(-2));
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field511[4] + (arg0 != null ? field511[2] : field511[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "b",
      descriptor = "(BI)V"
   )
   private final void method246(byte arg0, int arg1) {
      try {
         this.field503 = (255 & arg1) << 4;
         this.field506 = (arg1 & 65280) >> 4;
         if (arg0 > 107) {
            ++field508;
            this.field509 = (arg1 & 16711680) >> 12;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field511[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field504;
         int[][] var4 = super.field9169.method785((byte)40, arg0);
         if (super.field9169.field1332) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || ~var8 > ~class66.field1214) {
               do {
                  var5[var8] = this.field509;
                  var6[var8] = this.field506;
                  var7[var8] = this.field503;
                  ++var8;
               } while(~var8 > ~class66.field1214);
            }
         }

         if (arg1 != 0) {
            field500 = null;
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field511[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "<init>",
      descriptor = "()V"
   )
   public class34() {
      this(0);
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(ILct;Lsda;Lha;)V"
   )
   public static final void method247(int arg0, class155 arg1, class269 arg2, class65 arg3) {
      boolean var4 = client.field4564;

      try {
         ++field501;
         class476 var5 = arg1.method1431(131072, arg3);
         if (var5 != null) {
            int var6 = var5.method3002();
            if (var5.method3005() > var6) {
               var6 = var5.method3005();
            }

            byte var7 = 10;
            if (arg0 <= 85) {
               method247(28, (class155)null, (class269)null, (class65)null);
            }

            int var8 = arg2.field3804;
            int var9 = arg2.field3798;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            if (arg1.field2501 != null) {
               var10 = class4.field45.method3347((class476[])null, 0, (int[])null, arg1.field2501, class344.field4910);
               int var13 = 0;
               if (var4 || var10 > var13) {
                  do {
                     String var14 = class344.field4910[var13];
                     if (~var13 > ~(var10 + -1)) {
                        var14 = var14.substring(0, var14.length() - 4);
                     }

                     int var15 = class215.field3234.method2318(var14);
                     if (var11 < var15) {
                        var11 = var15;
                     }

                     ++var13;
                  } while(var10 > var13);
               }

               var12 = class215.field3234.method2319() * var10 + class215.field3234.method2316() / 2;
            }

            int var16;
            label106: {
               var16 = var6 / 2 + arg2.field3804;
               if (var8 >= class370.field5514 + var6) {
                  if (var8 <= -var6 + class370.field5507) {
                     break label106;
                  }

                  var8 = class370.field5507 - var6;
                  var16 = -(var6 / 2) + -var7 + -5 + -(var11 / 2) + class370.field5507;
                  if (!var4) {
                     break label106;
                  }
               }

               var16 = class370.field5514 - -var7 + var6 / 2 + 5 - -(var11 / 2);
               var8 = class370.field5514;
            }

            int var17;
            label99: {
               var17 = arg2.field3798;
               if (var9 >= class370.field5500 + var6) {
                  if (-var6 + class370.field5515 >= var9) {
                     break label99;
                  }

                  var17 = class370.field5515 - var7 - var12 + -(var6 / 2);
                  var9 = -var6 + class370.field5515;
                  if (!var4) {
                     break label99;
                  }
               }

               var9 = class370.field5500;
               var17 = var6 / 2 + var7 + class370.field5500;
            }

            int var18 = 65535 & (int)(Math.atan2((double)(-arg2.field3804 + var8), (double)(-arg2.field3798 + var9)) / 3.141592653589793D * 32767.0D);
            var5.method3601((float)var6 / 2.0F + (float)var8, (float)var6 / 2.0F + (float)var9, 4096, var18);
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            int var22 = -2;
            if (arg1.field2501 != null) {
               var19 = -(var11 / 2) - 5 + var16;
               var20 = var17;
               var21 = var19 + 10 + var11;
               var22 = 3 + var10 * class215.field3234.method2319() + var17;
               if (~arg1.field2491 != -1) {
                  arg3.method693(10240, arg1.field2491, var21 - var19, -var17 + var22, var17, var19);
               }

               if (arg1.field2465 != 0) {
                  arg3.method691((byte)104, arg1.field2465, -var17 + var22, var17, var21 - var19, var19);
               }

               int var23 = 0;
               if (var4 || var10 > var23) {
                  do {
                     String var24 = class344.field4910[var23];
                     if (~(var10 + -1) < ~var23) {
                        var24 = var24.substring(0, var24.length() - 4);
                     }

                     class215.field3234.method2320(arg3, var24, var16, var17, arg1.field2499, true);
                     var17 += class215.field3234.method2319();
                     ++var23;
                  } while(var10 > var23);
               }
            }

            if (~arg1.field2504 != 0 || arg1.field2501 != null) {
               int var25 = var6 >> 1;
               class78 var26 = new class78(arg2);
               var26.field1355 = -var25 + var9;
               var26.field1352 = var8 - var25;
               var26.field1353 = var22;
               var26.field1345 = var9 + var25;
               var26.field1351 = var20;
               var26.field1356 = var8 + var25;
               var26.field1357 = var21;
               var26.field1354 = var19;
               class791.field11560.method2585(var26, -126);
            }

         }
      } catch (RuntimeException var28) {
         throw class608.method4462(var28, field511[7] + arg0 + ',' + (arg1 != null ? field511[2] : field511[3]) + ',' + (arg2 != null ? field511[2] : field511[3]) + ',' + (arg3 != null ? field511[2] : field511[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method248(int arg0) {
      try {
         field510 = null;
         int var1 = 122 % ((35 - arg0) / 37);
         field500 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field511[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method249(boolean arg0) {
      boolean var1 = client.field4564;

      try {
         ++field505;
         if (class241.field3483 != 0 && ~class241.field3483 != -11) {
            try {
               short var2;
               label647: {
                  if (class6.field60 != 0) {
                     var2 = 2000;
                     if (!var1) {
                        break label647;
                     }
                  }

                  var2 = 250;
               }

               if (class255.field3621 && ~class241.field3483 <= -7) {
                  var2 = 6000;
               }

               if (~(++class462.field6750) < ~var2) {
                  if (class361.field5404 != null) {
                     class361.field5404.method2045(907867169);
                     class361.field5404 = null;
                  }

                  if (class6.field60 >= 3) {
                     class241.field3483 = 0;
                     class359.method2826((byte)-117, -5);
                     return;
                  }

                  label636: {
                     if (class743.field10700 == 2) {
                        class101.field1674.method4822(43594);
                        if (!var1) {
                           break label636;
                        }
                     }

                     class37.field903.method4822(43594);
                  }

                  class241.field3483 = 1;
                  class462.field6750 = 0;
                  ++class6.field60;
               }

               if (class241.field3483 == 1) {
                  label629: {
                     if (class743.field10700 == 2) {
                        class356.field5015 = class101.field1674.method4821(class412.field6033, (byte)105);
                        if (!var1) {
                           break label629;
                        }
                     }

                     class356.field5015 = class37.field903.method4821(class412.field6033, (byte)94);
                  }

                  class241.field3483 = 2;
               }

               if (~class241.field3483 == -3) {
                  if (class356.field5015.field11542 == 2) {
                     throw new IOException();
                  }

                  if (~class356.field5015.field11542 != -2) {
                     return;
                  }

                  class542 var3;
                  label658: {
                     class361.field5404 = class48.method592((Socket)class356.field5015.field11537, 15000, (byte)27);
                     class356.field5015 = null;
                     class61.method668(false);
                     var3 = class44.method560(16);
                     if (!class255.field3621) {
                        var3.field7859.method3571(255, class485.field7041.field7915);
                        if (!var1) {
                           break label658;
                        }
                     }

                     var3.field7859.method3571(255, class485.field7056.field7915);
                     var3.field7859.method3550(0, 29620);
                     int var4 = var3.field7859.field6907;
                     var3.field7859.method3540(653, 898075920);
                     if (class743.field10700 == 2) {
                        var3.field7859.method3571(255, class376.field5588 != 13 ? 0 : 1);
                     }

                     class473 var5 = class275.method2164(-96);
                     var5.method3571(255, class733.field10535);
                     var5.method3550((int)(9.9999999E7D * Math.random()), 29620);
                     var5.method3571(255, class385.field5684);
                     var5.method3540(class767.field11135, 898075920);
                     int var6 = 0;
                     if (var1) {
                        var5.method3540((int)(9.9999999E7D * Math.random()), 898075920);
                        ++var6;
                     }

                     while(true) {
                        while(~var6 > -7) {
                           var5.method3540((int)(9.9999999E7D * Math.random()), 898075920);
                           ++var6;
                        }

                        var5.method3528(class647.field9402, (byte)116);
                        var5.method3571(255, class128.field2145.field4608);
                        var5.method3571(255, (int)(Math.random() * 9.9999999E7D));
                        var5.method3551(0, class25.field370, class475.field6933);
                        var3.field7859.method3536(0, var5.field6907, var5.field6889, -13091);
                        class200 var10000 = var3.field7859;
                        int var10001 = -var4 + var3.field7859.field6907;
                        if (!var1) {
                           var10000.method3560(var10001, 27995);
                           break;
                        }

                        var10000.method3540(var10001, 27995);
                        ++var6;
                     }
                  }

                  class740.method5332(var3, (byte)77);
                  class349.method2694(-1);
                  class241.field3483 = 3;
               }

               if (~class241.field3483 == -4) {
                  label661: {
                     if (!class361.field5404.method2046(1, 3)) {
                        return;
                     }

                     class361.field5404.method2049(1, class346.field4923.field6889, 0, (byte)116);
                     int var7 = class346.field4923.field6889[0] & 255;
                     if (var7 != 0) {
                        class241.field3483 = 0;
                        class359.method2826((byte)-109, var7);
                        class361.field5404.method2045(907867169);
                        class361.field5404 = null;
                        class257.method2058((byte)-112);
                        return;
                     }

                     if (class255.field3621) {
                        class241.field3483 = 4;
                        if (!var1) {
                           break label661;
                        }
                     }

                     class241.field3483 = 8;
                  }
               }

               if (class241.field3483 == 4) {
                  if (!class361.field5404.method2046(2, 3)) {
                     return;
                  }

                  class361.field5404.method2049(2, class346.field4923.field6889, 0, (byte)116);
                  class346.field4923.field6907 = 0;
                  class346.field4923.field6907 = class346.field4923.method3565(true);
                  class241.field3483 = 5;
               }

               if (~class241.field3483 == -6) {
                  if (!class361.field5404.method2046(class346.field4923.field6907, 3)) {
                     return;
                  }

                  class361.field5404.method2049(class346.field4923.field6907, class346.field4923.field6889, 0, (byte)116);
                  class346.field4923.method3574(-93, class85.field1395);
                  class346.field4923.field6907 = 0;
                  String var8 = class346.field4923.method3570(false);
                  class346.field4923.field6907 = 0;
                  String var9 = field511[10];
                  if (!class741.field10680 || class397.method3061(var8, var9, 1, class412.field6033, -1).field11542 == 2) {
                     class252.method2036(var8, true, false, class412.field6033, class510.field7454.field11145.method2098(false) == 1, var9);
                  }

                  class241.field3483 = 6;
               }

               if (~class241.field3483 == -7) {
                  if (!class361.field5404.method2046(1, 3)) {
                     return;
                  }

                  class361.field5404.method2049(1, class346.field4923.field6889, 0, (byte)116);
                  if (~(class346.field4923.field6889[0] & 255) == -2) {
                     class241.field3483 = 7;
                  }
               }

               if (~class241.field3483 == -8) {
                  if (!class361.field5404.method2046(16, 3)) {
                     return;
                  }

                  class361.field5404.method2049(16, class346.field4923.field6889, 0, (byte)116);
                  class346.field4923.field6907 = 16;
                  class346.field4923.method3574(113, class85.field1395);
                  class346.field4923.field6907 = 0;
                  class386.field5693 = class154.field2452 = class166.method1512(!arg0, class346.field4923.method3523(-112));
                  class749.field10797 = class346.field4923.method3523(8);
                  class241.field3483 = 8;
               }

               if (class241.field3483 == 8) {
                  class542 var10;
                  label666: {
                     class346.field4923.field6907 = 0;
                     class61.method668(false);
                     var10 = class44.method560(16);
                     class200 var11 = var10.field7859;
                     if (~class743.field10700 == -3) {
                        class548 var12;
                        label567: {
                           if (!class255.field3621) {
                              var12 = class485.field7047;
                              if (!var1) {
                                 break label567;
                              }
                           }

                           var12 = class485.field7057;
                        }

                        var11.method3571(255, var12.field7915);
                        var11.method3550(0, 29620);
                        int var13 = var11.field6907;
                        int var14 = var11.field6907;
                        if (!class255.field3621) {
                           var11.method3540(653, 898075920);
                           var11.method3571(255, class376.field5588 != 13 ? 0 : 1);
                           int var15 = var11.field6907;
                           class473 var16 = class640.method4687(-62);
                           var11.method3536(0, var16.field6907, var16.field6889, -13091);
                           var14 = var11.field6907;
                           var11.method3546((byte)-99, class386.field5693);
                        }

                        var11.method3571(255, class475.field6939);
                        var11.method3571(255, class257.method2057(false));
                        var11.method3550(class720.field10406, 29620);
                        var11.method3550(class218.field3296, 29620);
                        var11.method3571(255, class510.field7454.field11149.method4644(false));
                        class543.method4062(var11, 108);
                        var11.method3546((byte)-128, class746.field10770);
                        var11.method3540(class767.field11135, 898075920);
                        class473 var17 = class510.field7454.method5558(arg0);
                        var11.method3571(255, var17.field6907);
                        var11.method3536(0, var17.field6907, var17.field6889, -13091);
                        class650.field9430 = true;
                        class473 var18 = new class473(class359.field5381.method4853(3912));
                        class359.field5381.method4850(-52, var18);
                        var11.method3536(0, var18.field6889.length, var18.field6889, -13091);
                        var11.method3550(class718.field10372, 29620);
                        var11.method3528(class580.field8335, (byte)126);
                        var11.method3571(255, class698.field10219 == null ? 0 : 1);
                        if (class698.field10219 != null) {
                           var11.method3546((byte)-125, class698.field10219);
                        }

                        var11.method3571(255, !class438.method3286(field511[9], (byte)114) ? 0 : 1);
                        var11.method3571(255, class741.field10680 ? 1 : 0);
                        class377.method2946(var11, 22066);
                        var11.method3552((byte)85, var11.field6907, class85.field1395, var14);
                        var11.method3560(-var13 + var11.field6907, 27995);
                        if (!var1) {
                           break label666;
                        }
                     }

                     class548 var19;
                     label562: {
                        if (class255.field3621) {
                           var19 = class485.field7057;
                           if (!var1) {
                              break label562;
                           }
                        }

                        var19 = class485.field7049;
                     }

                     var11.method3571(255, var19.field7915);
                     var11.method3550(0, 29620);
                     int var20 = var11.field6907;
                     int var21 = var11.field6907;
                     if (!class255.field3621) {
                        var11.method3540(653, 898075920);
                        class473 var22 = class640.method4687(-105);
                        var11.method3536(0, var22.field6907, var22.field6889, -13091);
                        var21 = var11.field6907;
                        var11.method3546((byte)-110, class386.field5693);
                     }

                     var11.method3571(255, class128.field2145.field4608);
                     var11.method3571(255, class385.field5684);
                     class543.method4062(var11, 116);
                     var11.method3546((byte)-111, class746.field10770);
                     var11.method3540(class767.field11135, 898075920);
                     class377.method2946(var11, 22066);
                     var11.method3552((byte)13, var11.field6907, class85.field1395, var21);
                     var11.method3560(var11.field6907 - var20, 27995);
                  }

                  class740.method5332(var10, (byte)77);
                  class349.method2694(-1);
                  class126.field2108 = new class681(class85.field1395);
                  int var23 = 0;
                  if (var1) {
                     class85.field1395[var23] += 50;
                     ++var23;
                  }

                  while(true) {
                     while(~var23 > -5) {
                        class85.field1395[var23] += 50;
                        ++var23;
                     }

                     class346.field4923.method1709(class85.field1395, (byte)-13);
                     class85.field1395 = null;
                     if (!var1) {
                        class241.field3483 = 9;
                        break;
                     }

                     ++var23;
                  }
               }

               if (~class241.field3483 == -10) {
                  label670: {
                     if (!class361.field5404.method2046(1, 3)) {
                        return;
                     }

                     class361.field5404.method2049(1, class346.field4923.field6889, 0, (byte)116);
                     int var24 = 255 & class346.field4923.field6889[0];
                     if (var24 == 21) {
                        class241.field3483 = 12;
                        if (!var1) {
                           break label670;
                        }
                     }

                     if (var24 != 29) {
                        if (var24 == 1) {
                           class241.field3483 = 10;
                           class359.method2826((byte)-116, var24);
                           return;
                        }

                        if (var24 != 2) {
                           if (var24 != 15) {
                              if (~var24 == -24 && class6.field60 < 3) {
                                 class462.field6750 = 0;
                                 ++class6.field60;
                                 class241.field3483 = 1;
                                 class361.field5404.method2045(907867169);
                                 class361.field5404 = null;
                                 return;
                              }

                              if (class596.field8594 && !class255.field3621 && ~class733.field10535 != 0 && ~var24 == -36) {
                                 class255.field3621 = true;
                                 class241.field3483 = 1;
                                 class462.field6750 = 0;
                                 class361.field5404.method2045(907867169);
                                 class361.field5404 = null;
                                 return;
                              }

                              class241.field3483 = 0;
                              class359.method2826((byte)-117, var24);
                              class361.field5404.method2045(907867169);
                              class361.field5404 = null;
                              class257.method2058((byte)-112);
                              return;
                           }

                           class241.field3483 = 19;
                           class650.field9423 = -2;
                           if (!var1) {
                              break label670;
                           }
                        }

                        class241.field3483 = 13;
                        if (!var1) {
                           break label670;
                        }
                     }

                     class241.field3483 = 18;
                  }
               }

               if (!arg0) {
                  if (~class241.field3483 == -12) {
                     class61.method668(arg0);
                     class542 var25 = class44.method560(16);
                     class200 var26 = var25.field7859;
                     var26.method1718((byte)-119, class126.field2108);
                     var26.method1713((byte)80, class485.field7053.field7915);
                     class740.method5332(var25, (byte)77);
                     class349.method2694(-1);
                     class241.field3483 = 9;
                  } else if (~class241.field3483 == -13) {
                     if (class361.field5404.method2046(1, 3)) {
                        class361.field5404.method2049(1, class346.field4923.field6889, 0, (byte)116);
                        int var27 = 255 & class346.field4923.field6889[0];
                        class418.field6110 = var27 * 50;
                        class241.field3483 = 0;
                        class359.method2826((byte)-127, 21);
                        class361.field5404.method2045(907867169);
                        class361.field5404 = null;
                        class257.method2058((byte)-112);
                     }
                  } else if (class241.field3483 == 18) {
                     if (class361.field5404.method2046(1, 3)) {
                        class361.field5404.method2049(1, class346.field4923.field6889, 0, (byte)116);
                        class241.field3483 = 0;
                        class530.field7720 = 255 & class346.field4923.field6889[0];
                        class359.method2826((byte)-113, 29);
                        class361.field5404.method2045(907867169);
                        class361.field5404 = null;
                        class257.method2058((byte)-112);
                     }
                  } else if (class241.field3483 == 13) {
                     if (class361.field5404.method2046(1, 3)) {
                        class361.field5404.method2049(1, class346.field4923.field6889, 0, (byte)116);
                        class241.field3483 = 14;
                        class712.field10336 = class346.field4923.field6889[0] & 255;
                     }
                  } else {
                     label725: {
                        if (~class241.field3483 == -15) {
                           label675: {
                              class200 var28 = class346.field4923;
                              if (~class743.field10700 != -3) {
                                 if (!class361.field5404.method2046(class712.field10336, 3)) {
                                    return;
                                 }

                                 class361.field5404.method2049(class712.field10336, var28.field6889, 0, (byte)116);
                                 var28.field6907 = 0;
                                 class292.field4071 = var28.method3564((byte)-93);
                                 class433.field6265 = var28.method3564((byte)-105);
                                 class440.field6426 = var28.method3564((byte)-125) == 1;
                                 class195.field2953 = ~var28.method3564((byte)-40) == -2;
                                 class675.field9896 = var28.method3564((byte)-127) == 1;
                                 class478.field6970 = var28.method3523(-124);
                                 class153.field2445 = class478.field6970 + -class57.method650(106) + -var28.method3569(236136096);
                                 int var29 = var28.method3564((byte)-49);
                                 class344.field4893 = ~(var29 & 2) != -1;
                                 class628.field9157 = (var29 & 1) != 0;
                                 class131.field2172 = var28.method3567(31871);
                                 class621.field9040 = var28.method3565(true);
                                 class106.field1760 = var28.method3565(true);
                                 class547.field7912 = var28.method3565(true);
                                 class133.field2203 = var28.method3567(31871);
                                 class104.field1720 = class412.field6033.method4776((byte)-85, class133.field2203);
                                 class600.field8647 = var28.method3564((byte)-111);
                                 class304.field4404 = var28.method3565(true);
                                 class464.field6789 = var28.method3565(true);
                                 class528.field7693 = var28.method3564((byte)-123) == 1;
                                 class304.field4398.field6665 = class304.field4398.field6680 = class355.field5008 = var28.method3570(false);
                                 class590.field8517 = var28.method3564((byte)-45);
                                 class1.field1 = var28.method3567(31871);
                                 class447.field6526 = ~var28.method3564((byte)-58) == -2;
                                 class252.field3604 = new class656();
                                 class252.field3604.field9569 = var28.method3565(!arg0);
                                 if (~class252.field3604.field9569 == -65536) {
                                    class252.field3604.field9569 = -1;
                                 }

                                 class252.field3604.field9570 = var28.method3570(arg0);
                                 if (class628.field9136 != class409.field6010) {
                                    class252.field3604.field9580 = 40000 - -class252.field3604.field9569;
                                    class252.field3604.field9575 = 50000 - -class252.field3604.field9569;
                                 }

                                 if (class409.field6010 == class402.field5938 || class409.field6010 == class211.field3152 && ~class292.field4071 <= -3 || !class101.field1674.method4823(43594, class415.field6082) && !class101.field1674.method4823(43594, class563.field8191)) {
                                    break label675;
                                 }

                                 class168.method1519((byte)-52);
                                 if (!var1) {
                                    break label675;
                                 }
                              }

                              if (!class361.field5404.method2046(class712.field10336, 3)) {
                                 return;
                              }

                              class361.field5404.method2049(class712.field10336, var28.field6889, 0, (byte)116);
                              var28.field6907 = 0;
                              class292.field4071 = var28.method3564((byte)-76);
                              class433.field6265 = var28.method3564((byte)-93);
                              class440.field6426 = ~var28.method3564((byte)-42) == -2;
                              class195.field2953 = ~var28.method3564((byte)-51) == -2;
                              class675.field9896 = ~var28.method3564((byte)-66) == -2;
                              class323.field4654 = var28.method3564((byte)-53) == 1;
                              class20.field324 = var28.method3565(true);
                              class628.field9157 = var28.method3564((byte)-93) == 1;
                              class204.field3049 = var28.method3548((byte)-122);
                              class116.field1905 = ~var28.method3564((byte)-113) == -2;
                              class634.field9256.method2553(class116.field1905, (byte)46);
                              class408.field5993.method836(0, class116.field1905);
                              class373.field5547.method2065(class116.field1905, (byte)18);
                           }

                           label727: {
                              if ((!class440.field6426 || class675.field9896) && !class628.field9157) {
                                 try {
                                    class575.method4254(class514.field7493, (byte)16, field511[17]);
                                    break label727;
                                 } catch (Throwable var37) {
                                    if (!var1) {
                                       break label727;
                                    }
                                 }
                              }

                              try {
                                 class575.method4254(class514.field7493, (byte)16, field511[14]);
                              } catch (Throwable var36) {
                                 if (class545.field7894) {
                                    try {
                                       class514.field7493.getAppletContext().showDocument(new URL(class514.field7493.getCodeBase(), field511[16]), field511[8]);
                                    } catch (Exception var35) {
                                    }
                                 }
                              }
                           }

                           if (class628.field9136 == class409.field6010) {
                              try {
                                 class575.method4254(class514.field7493, (byte)16, field511[11]);
                              } catch (Throwable var34) {
                              }
                           }

                           if (~class743.field10700 != -3) {
                              break label725;
                           }

                           class241.field3483 = 16;
                           if (var1) {
                              break label725;
                           }
                        }

                        if (class241.field3483 == 16) {
                           if (!class361.field5404.method2046(3, 3)) {
                              return;
                           }

                           class361.field5404.method2049(3, class346.field4923.field6889, 0, (byte)116);
                           class241.field3483 = 17;
                        }

                        if (class241.field3483 == 17) {
                           class200 var30 = class346.field4923;
                           var30.field6907 = 0;
                           if (var30.method1710(true)) {
                              if (!class361.field5404.method2046(1, 3)) {
                                 return;
                              }

                              class361.field5404.method2049(1, var30.field6889, 3, (byte)116);
                           }

                           class459.field6728 = class247.method2003((byte)82)[var30.method1712((byte)95)];
                           class650.field9423 = var30.method3565(true);
                           class241.field3483 = 15;
                        }

                        if (~class241.field3483 == -16) {
                           if (!class361.field5404.method2046(class650.field9423, 3)) {
                              return;
                           }

                           int var31;
                           label454: {
                              class361.field5404.method2049(class650.field9423, class346.field4923.field6889, 0, (byte)116);
                              class346.field4923.field6907 = 0;
                              var31 = class650.field9423;
                              class241.field3483 = 0;
                              class359.method2826((byte)-100, 2);
                              class261.method2088((byte)101);
                              class208.method1774(true, class346.field4923);
                              class36.field883 = -1;
                              if (class459.field6728 != class437.field6306) {
                                 class314.method2437(126);
                                 if (!var1) {
                                    break label454;
                                 }
                              }

                              class692.method5031(-9279);
                           }

                           if (~class346.field4923.field6907 != ~var31) {
                              throw new RuntimeException(field511[15] + class346.field4923.field6907 + field511[18] + var31);
                           }

                           class459.field6728 = null;
                           return;
                        }

                        if (class241.field3483 == 19) {
                           if (class650.field9423 == -2) {
                              if (!class361.field5404.method2046(2, 3)) {
                                 return;
                              }

                              class361.field5404.method2049(2, class346.field4923.field6889, 0, (byte)116);
                              class346.field4923.field6907 = 0;
                              class650.field9423 = class346.field4923.method3565(true);
                           }

                           if (!class361.field5404.method2046(class650.field9423, 3)) {
                              return;
                           }

                           class361.field5404.method2049(class650.field9423, class346.field4923.field6889, 0, (byte)116);
                           class346.field4923.field6907 = 0;
                           int var32 = class650.field9423;
                           class241.field3483 = 0;
                           class359.method2826((byte)-100, 15);
                           class363.method2838(2048);
                           class208.method1774(!arg0, class346.field4923);
                           if (class346.field4923.field6907 != var32) {
                              throw new RuntimeException(field511[13] + class346.field4923.field6907 + field511[18] + var32);
                           }

                           class459.field6728 = null;
                           return;
                        }

                        return;
                     }

                     class241.field3483 = 0;
                     class359.method2826((byte)-99, 2);
                     class314.method2434((byte)-117);
                     class645.method4735(7, -124);
                     class459.field6728 = null;
                  }
               }
            } catch (IOException var38) {
               if (class361.field5404 != null) {
                  class361.field5404.method2045(907867169);
                  class361.field5404 = null;
               }

               if (~class6.field60 <= -4) {
                  class241.field3483 = 0;
                  class359.method2826((byte)-118, -4);
                  class257.method2058((byte)-112);
               } else {
                  label444: {
                     if (class743.field10700 != 2) {
                        class37.field903.method4822(43594);
                        if (!var1) {
                           break label444;
                        }
                     }

                     class101.field1674.method4822(43594);
                  }

                  class241.field3483 = 1;
                  ++class6.field60;
                  class462.field6750 = 0;
               }
            }
         }
      } catch (RuntimeException var39) {
         throw class608.method4462(var39, field511[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class34(int arg0) {
      super(0, false);

      try {
         this.method246((byte)116, arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field511[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
