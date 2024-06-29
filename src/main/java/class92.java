import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class92 extends class302 {
   @OriginalMember(
      owner = "client!vga",
      name = "N",
      descriptor = "I"
   )
   private int field1175 = 4096;
   @OriginalMember(
      owner = "client!vga",
      name = "O",
      descriptor = "I"
   )
   private int field1178 = 4096;
   @OriginalMember(
      owner = "client!vga",
      name = "J",
      descriptor = "I"
   )
   private int field1182 = 4096;
   @OriginalMember(
      owner = "client!vga",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1183 = new String[]{method848(method847("OaY<\u0004\u0011")), method848(method847("OaY<\u0005\u0011")), method848(method847("OaY<\u0001\u0011")), method848(method847("B(\u0016<:")), method848(method847("WsT~"))};
   @OriginalMember(
      owner = "client!vga",
      name = "K",
      descriptor = "I"
   )
   public static int field1179 = 0;
   @OriginalMember(
      owner = "client!vga",
      name = "H",
      descriptor = "I"
   )
   public static int field1176;
   @OriginalMember(
      owner = "client!vga",
      name = "M",
      descriptor = "I"
   )
   public static int field1177;
   @OriginalMember(
      owner = "client!vga",
      name = "I",
      descriptor = "I"
   )
   public static int field1180;
   @OriginalMember(
      owner = "client!vga",
      name = "L",
      descriptor = "I"
   )
   public static int field1181;

   @OriginalMember(
      owner = "client!vga",
      name = "c",
      descriptor = "(III)V",
      line = 6
   )
   public static final void method845(int arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         if (arg1 != -1115237556) {
            field1179 = 122;
         }

         ++field1177;
         if (class344.field5238 != arg2) {
            class757.field11167 = new int[arg2];
            int var4 = 0;
            if (var3 != 0) {
               class757.field11167[var4] = (var4 << 12) / arg2;
               ++var4;
            }

            while(true) {
               while(arg2 > var4) {
                  class757.field11167[var4] = (var4 << 12) / arg2;
                  ++var4;
               }

               class344.field5238 = arg2;
               class264.field3612 = arg2 + -1;
               if (var3 == 0) {
                  class1.field52 = arg2 * 32;
                  break;
               }

               ++var4;
            }
         }

         if (class501.field7439 != arg0) {
            label57: {
               if (~class344.field5238 != ~arg0) {
                  class23.field241 = new int[arg0];
                  int var5 = 0;
                  if (var3 != 0) {
                     class23.field241[var5] = (var5 << 12) / arg0;
                     ++var5;
                  }

                  while(true) {
                     while(~arg0 < ~var5) {
                        class23.field241[var5] = (var5 << 12) / arg0;
                        ++var5;
                     }

                     if (var3 == 0) {
                        if (var3 == 0) {
                           break label57;
                        }
                        break;
                     }

                     ++var5;
                  }
               }

               class23.field241 = class757.field11167;
            }

            class275.field3837 = arg0 + -1;
            class501.field7439 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1183[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "<init>",
      descriptor = "()V",
      line = 53
   )
   public class92() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 71
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label46: {
            label45: {
               label44: {
                  if (~arg0 != -1) {
                     if (~arg0 == -2) {
                        break label44;
                     }

                     if (arg0 != 2) {
                        break label46;
                     }

                     if (var4 == 0) {
                        break label45;
                     }
                  }

                  this.field1178 = arg2.method1038((byte)-128);
                  if (var4 == 0) {
                     break label46;
                  }
               }

               this.field1175 = arg2.method1038((byte)-115);
               if (var4 == 0) {
                  break label46;
               }
            }

            this.field1182 = arg2.method1038((byte)-98);
         }

         ++field1181;
         if (arg1 != 0) {
            field1176 = -22;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1183[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1183[3] : field1183[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(BI)[[I",
      line = 117
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field1180;
         int[][] var4 = super.field4292.method3409(arg1, arg0 ^ -90);
         if (arg0 != -90) {
            this.field1178 = 16;
         }

         if (super.field4292.field6892) {
            int[][] var5 = this.method2297(0, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 != 0 || var12 < class344.field5238) {
               do {
                  int var13 = var6[var12];
                  int var14 = var8[var12];
                  int var15 = var7[var12];
                  if (var13 == var14 && var14 == var15) {
                     var9[var12] = this.field1178 * var13 >> 12;
                     var10[var12] = this.field1175 * var14 >> 12;
                     var11[var12] = this.field1182 * var15 >> 12;
                     if (var3 == 0) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field1178;
                  var10[var12] = this.field1175;
                  var11[var12] = this.field1182;
                  ++var12;
               } while(var12 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field1183[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "f",
      descriptor = "(I)I",
      line = 180
   )
   public static final int method846(int arg0) {
      int var1 = -1;

      for(int var2 = 0; var2 < class705.field10556 - 1; ++var2) {
         if (arg0 < class68.field861[var2] + class2.field60[var2]) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = class705.field10556 - 1;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method847(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method848(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
