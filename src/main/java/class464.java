import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class464 extends class629 {
   @OriginalMember(
      owner = "client!os",
      name = "G",
      descriptor = "I"
   )
   private int field6792 = -1;
   @OriginalMember(
      owner = "client!os",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6794 = new String[]{method3483(method3482("\u001cgO\bd")), method3483(method3482("\u001da\r4")), method3483(method3482("\b:Ov1")), method3483(method3482("\u001cgO\u0014d")), method3483(method3482("\u001cgO\u0010d")), method3483(method3482("\u001cgO\u001dd")), method3483(method3482("\u001cgO\u0015d")), method3483(method3482("\u001cgO\u0019d")), method3483(method3482("\u001cgO\u001ed")), method3483(method3482("\u001cgO\u0016d")), method3483(method3482("\u001cgO\u0017d"))};
   @OriginalMember(
      owner = "client!os",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field6782 = new int[3];
   @OriginalMember(
      owner = "client!os",
      name = "F",
      descriptor = "I"
   )
   public static int field6779;
   @OriginalMember(
      owner = "client!os",
      name = "H",
      descriptor = "I"
   )
   public static int field6780;
   @OriginalMember(
      owner = "client!os",
      name = "R",
      descriptor = "I"
   )
   public static int field6781;
   @OriginalMember(
      owner = "client!os",
      name = "L",
      descriptor = "I"
   )
   private int field6784;
   @OriginalMember(
      owner = "client!os",
      name = "E",
      descriptor = "I"
   )
   private int field6785;
   @OriginalMember(
      owner = "client!os",
      name = "K",
      descriptor = "I"
   )
   public static int field6786;
   @OriginalMember(
      owner = "client!os",
      name = "N",
      descriptor = "I"
   )
   public static int field6787;
   @OriginalMember(
      owner = "client!os",
      name = "O",
      descriptor = "I"
   )
   public static int field6788;
   @OriginalMember(
      owner = "client!os",
      name = "M",
      descriptor = "I"
   )
   public static int field6789;
   @OriginalMember(
      owner = "client!os",
      name = "Q",
      descriptor = "I"
   )
   public static int field6790;
   @OriginalMember(
      owner = "client!os",
      name = "J",
      descriptor = "I"
   )
   public static int field6791;
   @OriginalMember(
      owner = "client!os",
      name = "I",
      descriptor = "I"
   )
   public static int field6793;
   @OriginalMember(
      owner = "client!os",
      name = "P",
      descriptor = "[I"
   )
   private int[] field6783;

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(ILka;III)Lpca;",
      line = 6
   )
   public static final class744 method3476(int arg0, class495 arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 != -27340) {
            method3479(3);
         }

         ++field6793;
         return arg1 == null ? null : new class744(arg2, arg4, arg3, arg1.method553(), arg1.method528(), arg1.method531(), arg1.method540(), arg1.method507(), arg1.method517(), arg1.method546());
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6794[0] + arg0 + ',' + (arg1 != null ? field6794[2] : field6794[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(III)V",
      line = 26
   )
   public final void method3477(int arg0, int arg1, int arg2) {
      try {
         super.method3477(2, arg1, arg2);
         ++field6787;
         if (this.field6792 >= 0 && class511.field7469 != null) {
            int var4 = class511.field7469.method1456(-8988, this.field6792).field10153 ? 64 : 128;
            this.field6783 = class511.field7469.method1459(1.0F, false, var4, this.field6792, 118, var4);
            this.field6784 = var4;
            this.field6785 = var4;
         }

         int var5 = -54 % ((-73 - arg0) / 47);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6794[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "f",
      descriptor = "(I)V",
      line = 48
   )
   public final void method1953(int arg0) {
      try {
         super.method1953(115);
         ++field6786;
         if (arg0 <= 48) {
            method3481(-122, -8, 0, 24, (byte)70, -48);
         }

         this.field6783 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6794[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(B)I",
      line = 64
   )
   public final int method3478(byte arg0) {
      try {
         if (arg0 <= 100) {
            return -35;
         } else {
            ++field6779;
            return this.field6792;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6794[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(II)[[I",
      line = 75
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 0) {
            method3476(62, (class495)null, -94, 29, 30);
         }

         ++field6791;
         int[][] var4 = super.field9169.method785((byte)63, arg0);
         if (super.field9169.field1332) {
            int var5 = this.field6785 * (class686.field10095 != this.field6784 ? this.field6784 * arg0 / class686.field10095 : arg0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (~class66.field1214 == ~this.field6785) {
               int var9 = 0;
               if (var3 || class66.field1214 > var9) {
                  do {
                     int var10 = this.field6783[var5++];
                     var8[var9] = class66.method706(4080, var10 << 4);
                     var7[var9] = class66.method706(var10 >> 4, 4080);
                     var6[var9] = class66.method706(var10 >> 12, 4080);
                     ++var9;
                  } while(class66.field1214 > var9);
               }

               if (!var3) {
                  return var4;
               }
            }

            int var11 = 0;
            if (var3 || var11 < class66.field1214) {
               do {
                  int var12 = this.field6785 * var11 / class66.field1214;
                  int var13 = this.field6783[var5 + var12];
                  var8[var11] = class66.method706(var13 << 4, 4080);
                  var7[var11] = class66.method706(var13, 65280) >> 4;
                  var6[var11] = class66.method706(var13, 16711680) >> 12;
                  ++var11;
               } while(var11 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field6794[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 143
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         if (arg1 != 0) {
            field6789 = 10;
         }

         if (~arg2 == -1) {
            this.field6792 = arg0.method3565(true);
         }

         ++field6780;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6794[5] + (arg0 != null ? field6794[2] : field6794[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "g",
      descriptor = "(I)V",
      line = 157
   )
   public static void method3479(int arg0) {
      try {
         field6782 = null;
         if (arg0 != 0) {
            method3476(120, (class495)null, -114, -118, -114);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6794[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "(B)Lpo;",
      line = 168
   )
   public static final class582 method3480(byte arg0) {
      try {
         if (arg0 < 48) {
            method3476(-52, (class495)null, -23, 99, 24);
         }

         ++field6788;
         return class657.field9595;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6794[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(IIIIBI)V",
      line = 181
   )
   public static final void method3481(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
      try {
         label35: {
            if (~arg2 > ~class515.field7502 || ~arg0 < ~class130.field2163 || ~arg5 > ~class3.field16 || class581.field8354 < arg1) {
               class376.method2939(arg3, arg0, arg1, arg5, arg2, (byte)-105);
               if (!client.field4564) {
                  break label35;
               }
            }

            class494.method3725(arg0, arg2, 1, arg3, arg1, arg5);
         }

         ++field6781;
         if (arg4 != -32) {
            field6789 = -40;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6794[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "<init>",
      descriptor = "()V",
      line = 202
   )
   public class464() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3482(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3483(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
