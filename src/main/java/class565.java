import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class565 extends class471 {
   @OriginalMember(
      owner = "client!jf",
      name = "J",
      descriptor = "S"
   )
   public short field8032;
   @OriginalMember(
      owner = "client!jf",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8036 = new String[]{method4203(method4202("\\\r|E\"")), method4203(method4202("X\u001e>m")), method4203(method4202("ME|/w")), method4203(method4202("\\\r|=cX\u0002&?\"")), method4203(method4202("\\\r|C\"")), method4203(method4202("\\\r|D\""))};
   @OriginalMember(
      owner = "client!jf",
      name = "G",
      descriptor = "D"
   )
   public static double field8035;
   @OriginalMember(
      owner = "client!jf",
      name = "H",
      descriptor = "F"
   )
   public static float field8031;
   @OriginalMember(
      owner = "client!jf",
      name = "E",
      descriptor = "I"
   )
   public static int field8030;
   @OriginalMember(
      owner = "client!jf",
      name = "F",
      descriptor = "I"
   )
   public static int field8033;
   @OriginalMember(
      owner = "client!jf",
      name = "I",
      descriptor = "I"
   )
   public static int field8034;

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(B[Lpha;)I"
   )
   public final int method1681(byte arg0, class757[] arg1) {
      boolean var3 = client.field10022;

      try {
         int var4;
         int var5;
         int var6;
         label115: {
            ++field8034;
            var4 = super.field6832 >> class313.field4707;
            var5 = super.field6833 >> class313.field4707;
            var6 = 0;
            if (class507.field7207 != var4) {
               if (var4 <= class507.field7207) {
                  break label115;
               }

               var6 += 2;
               if (!var3) {
                  break label115;
               }
            }

            ++var6;
         }

         label108: {
            if (~class477.field6876 == ~var5) {
               var6 += 3;
               if (!var3) {
                  break label108;
               }
            }

            if (class477.field6876 > var5) {
               var6 += 6;
            }
         }

         if (arg0 != 39) {
            return -112;
         } else {
            int var7 = class75.field1194[var6];
            if ((var7 & this.field8032) != 0) {
               return this.method3610(arg1, var5, 32764, var4);
            } else if (this.field8032 == 1 && ~var4 < -1) {
               return this.method3610(arg1, var5, arg0 ^ 32731, var4 - 1);
            } else if (~this.field8032 == -5 && var4 <= class155.field2381) {
               return this.method3610(arg1, var5, 32764, var4 + 1);
            } else if (this.field8032 == 8 && ~var5 < -1) {
               return this.method3610(arg1, var5 - 1, 32764, var4);
            } else if (~this.field8032 == -3 && ~var5 >= ~class25.field360) {
               return this.method3610(arg1, var5 + 1, 32764, var4);
            } else if (~this.field8032 == -17 && ~var4 < -1 && ~var5 >= ~class25.field360) {
               return this.method3610(arg1, var5 + 1, 32764, var4 + -1);
            } else if (~this.field8032 == -33 && ~class155.field2381 <= ~var4 && class25.field360 >= var5) {
               return this.method3610(arg1, var5 + 1, arg0 + 32725, var4 + 1);
            } else if (~this.field8032 == -129 && var4 > 0 && var5 > 0) {
               return this.method3610(arg1, var5 + -1, 32764, var4 + -1);
            } else if (this.field8032 == 64 && class155.field2381 >= var4 && ~var5 < -1) {
               return this.method3610(arg1, var5 - 1, 32764, var4 - -1);
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8036[5] + arg0 + ',' + (arg1 != null ? field8036[2] : field8036[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method1685(int arg0) {
      try {
         ++field8033;
         if (arg0 != -1) {
            this.method1681((byte)-10, (class757[])null);
         }

         return class232.field3602[(super.field6832 >> class313.field4707) + -class507.field7207 + class15.field214][(super.field6833 >> class313.field4707) - class477.field6876 + class15.field214];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8036[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "(Lha;I)Z"
   )
   public final boolean method1682(class17 arg0, int arg1) {
      try {
         if (arg1 != 1) {
            field8035 = 0.36509626404762985D;
         }

         ++field8030;
         return class530.method3957(super.field6826, super.field6832 >> class313.field4707, this, (byte)-65, super.field6833 >> class313.field4707);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8036[0] + (arg0 != null ? field8036[2] : field8036[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field8032 = (short)arg5;
         super.field6832 = arg0;
         super.field6826 = (byte)arg4;
         super.field6824 = (byte)arg3;
         super.field6833 = arg2;
         super.field6829 = arg1;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8036[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
