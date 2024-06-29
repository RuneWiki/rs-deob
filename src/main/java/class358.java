import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class358 extends class213 {
   @OriginalMember(
      owner = "client!vu",
      name = "F",
      descriptor = "I"
   )
   private int field5086 = 4;
   @OriginalMember(
      owner = "client!vu",
      name = "L",
      descriptor = "I"
   )
   private int field5085 = 4;
   @OriginalMember(
      owner = "client!vu",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5095 = new String[]{method2805(method2804("Ss5\u0014S")), method2805(method2804("Ss5\u001dS")), method2805(method2804("Ss5\u0013S")), method2805(method2804("Ss5\u0015S")), method2805(method2804("Ss5\u0010S")), method2805(method2804("Ksw;")), method2805(method2804("^(5y\u0006")), method2805(method2804("Ss5\u0016S"))};
   @OriginalMember(
      owner = "client!vu",
      name = "J",
      descriptor = "Lbga;"
   )
   public static class378 field5092 = new class378(23, 8);
   @OriginalMember(
      owner = "client!vu",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field5093 = new int[]{-1, -1, 1, 1};
   @OriginalMember(
      owner = "client!vu",
      name = "K",
      descriptor = "Lod;"
   )
   public static class536 field5094 = new class536();
   @OriginalMember(
      owner = "client!vu",
      name = "H",
      descriptor = "I"
   )
   public static int field5087;
   @OriginalMember(
      owner = "client!vu",
      name = "I",
      descriptor = "I"
   )
   public static int field5088;
   @OriginalMember(
      owner = "client!vu",
      name = "G",
      descriptor = "I"
   )
   public static int field5089;
   @OriginalMember(
      owner = "client!vu",
      name = "M",
      descriptor = "I"
   )
   public static int field5090;
   @OriginalMember(
      owner = "client!vu",
      name = "N",
      descriptor = "I"
   )
   public static int field5091;

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label33: {
            label32: {
               if (arg2 != 0) {
                  if (~arg2 != -2) {
                     break label33;
                  }

                  if (!var4) {
                     break label32;
                  }
               }

               this.field5085 = arg0.method4288((byte)119);
               if (!var4) {
                  break label33;
               }
            }

            this.field5086 = arg0.method4288((byte)97);
         }

         ++field5088;
         int var6 = -110 / ((arg1 - 68) / 48);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5095[4] + (arg0 != null ? field5095[6] : field5095[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5090;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 <= 26) {
            field5093 = null;
         }

         if (super.field2644.field6719) {
            int var5;
            int[][] var8;
            label40: {
               var5 = class576.field7916 / this.field5085;
               int var6 = class392.field5515 / this.field5086;
               if (~var6 < -1) {
                  int var7 = arg0 % var6;
                  var8 = this.method1615(true, class392.field5515 * var7 / var6, 0);
                  if (!var3) {
                     break label40;
                  }
               }

               var8 = this.method1615(true, 0, 0);
            }

            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            int var15 = 0;
            if (var3 || var15 < class576.field7916) {
               do {
                  int var17;
                  if (var5 > 0) {
                     int var16 = var15 % var5;
                     var17 = class576.field7916 * var16 / var5;
                     if (var3) {
                        var17 = 0;
                     }
                  } else {
                     var17 = 0;
                  }

                  var12[var15] = var9[var17];
                  var13[var15] = var10[var17];
                  var14[var15] = var11[var17];
                  ++var15;
               } while(var15 < class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field5095[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2801(byte arg0) {
      try {
         field5094 = null;
         field5093 = null;
         int var1 = -19 % ((arg0 - 61) / 53);
         field5092 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5095[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method2802(int arg0, int arg1, int arg2) {
      try {
         int var3 = 15 % ((5 - arg1) / 44);
         ++field5091;
         return ~(55 & arg0) != -1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5095[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2803(byte arg0) {
      try {
         ++field5089;
         if (~class617.field8606 != -1) {
            try {
               if (~(++class291.field3840) < -2001) {
                  class605.field8473.method1697(105);
                  if (class546.field7447 >= 2) {
                     class489.field6746 = -5;
                     class617.field8606 = 0;
                     return;
                  }

                  class308.field4093.method3348((byte)-118);
                  class617.field8606 = 1;
                  class291.field3840 = 0;
                  ++class546.field7447;
               }

               if (~class617.field8606 == -2) {
                  class605.field8473.field2780 = class308.field4093.method3351(class61.field671, 99);
                  class617.field8606 = 2;
               }

               if (class617.field8606 == 2) {
                  if (class605.field8473.field2780.field3826 == 2) {
                     throw new IOException();
                  }

                  if (~class605.field8473.field2780.field3826 != -2) {
                     return;
                  }

                  class605.field8473.field2779 = class175.method1360((Socket)class605.field8473.field2780.field3830, 15000, 10);
                  class605.field8473.field2780 = null;
                  class605.field8473.method1699(-16186);
                  class617.field8606 = 4;
               }

               if (~class617.field8606 == -5) {
                  if (class605.field8473.field2779.method1029(true, 1)) {
                     class605.field8473.field2779.method1030(0, class605.field8473.field2788.field8227, (byte)43, 1);
                     int var1 = 255 & class605.field8473.field2788.field8227[0];
                     class489.field6746 = var1;
                     class617.field8606 = 0;
                     class605.field8473.method1697(123);
                  }
               } else {
                  int var2 = 57 / ((arg0 - -25) / 54);
               }
            } catch (IOException var4) {
               class605.field8473.method1697(83);
               if (~class546.field7447 <= -3) {
                  class489.field6746 = -4;
                  class617.field8606 = 0;
               } else {
                  class308.field4093.method3348((byte)-99);
                  ++class546.field7447;
                  class291.field3840 = 0;
                  class617.field8606 = 1;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5095[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "<init>",
      descriptor = "()V"
   )
   public class358() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5087;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (arg1 != 2064866508) {
            field5094 = null;
         }

         if (super.field2650.field7140) {
            int var5;
            int[] var8;
            label42: {
               var5 = class576.field7916 / this.field5085;
               int var6 = class392.field5515 / this.field5086;
               if (~var6 < -1) {
                  int var7 = arg0 % var6;
                  var8 = this.method1619((byte)41, class392.field5515 * var7 / var6, 0);
                  if (!var3) {
                     break label42;
                  }
               }

               var8 = this.method1619((byte)59, 0, 0);
            }

            int var9 = 0;
            if (var3 || var9 < class576.field7916) {
               do {
                  if (~var5 < -1) {
                     int var10 = var9 % var5;
                     var4[var9] = var8[class576.field7916 * var10 / var5];
                     if (!var3) {
                        ++var9;
                        continue;
                     }
                  }

                  var4[var9] = var8[0];
                  ++var9;
               } while(var9 < class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field5095[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2804(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2805(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
