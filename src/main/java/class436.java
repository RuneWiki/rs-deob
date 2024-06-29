import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class436 extends class70 {
   @OriginalMember(
      owner = "client!eja",
      name = "I",
      descriptor = "I"
   )
   private int field5946 = 0;
   @OriginalMember(
      owner = "client!eja",
      name = "S",
      descriptor = "I"
   )
   private int field5951 = 4096;
   @OriginalMember(
      owner = "client!eja",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5954 = new String[]{method3372(method3371("\u0012:jj$_")), method3372(method3371("\f~%j\u001d")), method3372(method3371("\u0012:jj#_")), method3372(method3371("\u0019%g(")), method3372(method3371("\u0012:jj'_")), method3372(method3371("\u0012:jj/_")), method3372(method3371("\u0012:jj%_"))};
   @OriginalMember(
      owner = "client!eja",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5947 = new String[100];
   @OriginalMember(
      owner = "client!eja",
      name = "L",
      descriptor = "I"
   )
   public static int field5949 = -1;
   @OriginalMember(
      owner = "client!eja",
      name = "Q",
      descriptor = "Lhv;"
   )
   public static class227 field5944 = new class227(8);
   @OriginalMember(
      owner = "client!eja",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field5953 = new int[1000];
   @OriginalMember(
      owner = "client!eja",
      name = "P",
      descriptor = "I"
   )
   public static int field5943;
   @OriginalMember(
      owner = "client!eja",
      name = "J",
      descriptor = "I"
   )
   public static int field5945;
   @OriginalMember(
      owner = "client!eja",
      name = "N",
      descriptor = "I"
   )
   public static int field5948;
   @OriginalMember(
      owner = "client!eja",
      name = "O",
      descriptor = "I"
   )
   public static int field5950;
   @OriginalMember(
      owner = "client!eja",
      name = "K",
      descriptor = "[Z"
   )
   public static boolean[] field5952;

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3368(byte arg0) {
      try {
         ++field5943;
         class696.field10205.method3201((byte)126);
         if (arg0 >= -34) {
            method3368((byte)101);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5954[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label37: {
            label36: {
               ++field5945;
               if (arg2 != 0) {
                  if (arg2 != 1) {
                     break label37;
                  }

                  if (!var4) {
                     break label36;
                  }
               }

               this.field5946 = arg1.method603(-2);
               if (!var4) {
                  break label37;
               }
            }

            this.field5951 = arg1.method603(-2);
         }

         if (arg0 > -34) {
            field5947 = null;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5954[2] + arg0 + ',' + (arg1 != null ? field5954[1] : field5954[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "<init>",
      descriptor = "()V"
   )
   public class436() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3369(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1481;

      try {
         ++field5950;
         int var6 = 0;
         if (!var5 && ~var6 <= ~class121.field1604) {
            if (arg1 >= -41) {
               field5947 = null;
            }

            class762.method5522(arg3 - -arg4, arg0, arg0 + arg2, -101, arg3);
         } else {
            do {
               Rectangle var7 = class439.field5975[var6];
               if (var7.x - -var7.width > arg3 && var7.x < arg3 + arg4 && arg0 < var7.y - -var7.height && var7.y < arg0 + arg2) {
                  class485.field6750[var6] = true;
               }

               ++var6;
            } while(~var6 > ~class121.field1604);

            if (arg1 >= -41) {
               field5947 = null;
            }

            class762.method5522(arg3 - -arg4, arg0, arg0 + arg2, -101, arg3);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5954[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5948;
         int[] var4 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            this.method331((byte)-112, 50);
         }

         if (super.field940.field270) {
            int[] var5 = this.method690(arg0 ^ -100, 0, arg1);
            int var6 = 0;
            if (var3 || ~class262.field3328 < ~var6) {
               do {
                  int var7 = var5[var6];
                  var4[var6] = ~this.field5946 >= ~var7 ? (~this.field5951 > ~var7 ? 0 : 4096) : 0;
                  ++var6;
               } while(~class262.field3328 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5954[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method3370(boolean arg0) {
      try {
         field5947 = null;
         if (!arg0) {
            method3370(true);
         }

         field5944 = null;
         field5952 = null;
         field5953 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5954[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3371(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3372(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
