import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class484 extends class213 {
   @OriginalMember(
      owner = "client!gt",
      name = "P",
      descriptor = "I"
   )
   private int field6665 = 4096;
   @OriginalMember(
      owner = "client!gt",
      name = "E",
      descriptor = "I"
   )
   private int field6670 = 0;
   @OriginalMember(
      owner = "client!gt",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6678 = new String[]{method3525(method3524("\u001cu4\u0015\u0019")), method3525(method3524("\u001cu4\u0011\u0019")), method3525(method3524("\u001cu4\u0016\u0019")), method3525(method3524("\u001cu4\u0012\u0019")), method3525(method3524("\u001cu4\u0017\u0019")), method3525(method3524("\u0015tv8")), method3525(method3524("\u0000/4zL")), method3525(method3524("\u001cu4\u0010\u0019")), method3525(method3524("\u001cu4\u0013\u0019"))};
   @OriginalMember(
      owner = "client!gt",
      name = "L",
      descriptor = "Lbga;"
   )
   public static class378 field6667 = new class378(15, 6);
   @OriginalMember(
      owner = "client!gt",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field6676 = new int[2048];
   @OriginalMember(
      owner = "client!gt",
      name = "O",
      descriptor = "I"
   )
   public static int field6664;
   @OriginalMember(
      owner = "client!gt",
      name = "Q",
      descriptor = "I"
   )
   public static int field6666;
   @OriginalMember(
      owner = "client!gt",
      name = "K",
      descriptor = "I"
   )
   public static int field6668;
   @OriginalMember(
      owner = "client!gt",
      name = "H",
      descriptor = "I"
   )
   public static int field6669;
   @OriginalMember(
      owner = "client!gt",
      name = "F",
      descriptor = "I"
   )
   public static int field6671;
   @OriginalMember(
      owner = "client!gt",
      name = "D",
      descriptor = "I"
   )
   public static int field6672;
   @OriginalMember(
      owner = "client!gt",
      name = "I",
      descriptor = "I"
   )
   public static int field6674;
   @OriginalMember(
      owner = "client!gt",
      name = "J",
      descriptor = "I"
   )
   public static int field6677;
   @OriginalMember(
      owner = "client!gt",
      name = "G",
      descriptor = "Lui;"
   )
   public static class241 field6673;
   @OriginalMember(
      owner = "client!gt",
      name = "N",
      descriptor = "Lsn;"
   )
   public static class660 field6675;

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3519(int arg0, int arg1, int arg2) {
      try {
         ++field6668;
         if (arg0 != 14) {
            return false;
         } else {
            return (384 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6678[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label33: {
            label32: {
               ++field6674;
               if (arg2 != 0) {
                  if (arg2 != 1) {
                     break label33;
                  }

                  if (!var4) {
                     break label32;
                  }
               }

               this.field6670 = arg0.method4280(-19104);
               if (!var4) {
                  break label33;
               }
            }

            this.field6665 = arg0.method4280(-19104);
         }

         int var6 = 81 / ((arg1 - 68) / 48);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6678[8] + (arg0 != null ? field6678[6] : field6678[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "()V"
   )
   public class484() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3520(int arg0, int arg1) {
      try {
         if (arg0 > -64) {
            field6673 = null;
         }

         ++field6671;
         class446 var2 = class635.method4607(124, (long)arg1, 14);
         var2.method3312(-126);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6678[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 2064866508) {
            field6672 = -30;
         }

         ++field6664;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int[] var5 = this.method1619((byte)98, arg0, 0);
            int var6 = 0;
            if (var3 || ~class576.field7916 < ~var6) {
               do {
                  int var7 = var5[var6];
                  var4[var6] = this.field6670 <= var7 ? (~this.field6665 <= ~var7 ? 4096 : 0) : 0;
                  ++var6;
               } while(~class576.field7916 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6678[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3521(int arg0) {
      try {
         if (arg0 != 31629) {
            method3522((Component)null, true);
         }

         field6675 = null;
         field6673 = null;
         field6667 = null;
         field6676 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6678[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Ljava/awt/Component;Z)Lpc;"
   )
   public static final class701 method3522(Component arg0, boolean arg1) {
      try {
         if (arg1) {
            return null;
         } else {
            ++field6669;
            return new class537(arg0);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6678[7] + (arg0 != null ? field6678[6] : field6678[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method3523(byte arg0, int arg1) {
      try {
         if (arg0 > -35) {
            field6677 = 36;
         }

         ++field6666;
         class446 var2 = class635.method4607(110, (long)arg1, 12);
         var2.method3312(-123);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6678[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3524(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3525(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
