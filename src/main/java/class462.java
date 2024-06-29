import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class462 extends class109 {
   @OriginalMember(
      owner = "client!nc",
      name = "J",
      descriptor = "S"
   )
   public short field7024;
   @OriginalMember(
      owner = "client!nc",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7028 = new String[]{method3590(method3589("\u0012<B8mT")), method3590(method3589("\u0012*\u0000\u0016")), method3590(method3589("\u0012<B9mT")), method3590(method3589("\u0007qBTQ")), method3590(method3589("\u0012<B?mT")), method3590(method3589("\u0012<B-\u0004")), method3590(method3589("\u0012<B;mT")), method3590(method3589("\u0012<B>mT")), method3590(method3589("\u0012<BFE\u00126\u0018D\u0004"))};
   @OriginalMember(
      owner = "client!nc",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field7020 = new int[32];
   @OriginalMember(
      owner = "client!nc",
      name = "H",
      descriptor = "Lgv;"
   )
   public static class12 field7027;
   @OriginalMember(
      owner = "client!nc",
      name = "F",
      descriptor = "I"
   )
   public static int field7019;
   @OriginalMember(
      owner = "client!nc",
      name = "K",
      descriptor = "I"
   )
   public static int field7021;
   @OriginalMember(
      owner = "client!nc",
      name = "I",
      descriptor = "I"
   )
   public static int field7022;
   @OriginalMember(
      owner = "client!nc",
      name = "L",
      descriptor = "I"
   )
   public static int field7023;
   @OriginalMember(
      owner = "client!nc",
      name = "D",
      descriptor = "I"
   )
   public static int field7025;
   @OriginalMember(
      owner = "client!nc",
      name = "M",
      descriptor = "I"
   )
   public static int field7026;

   @OriginalMember(
      owner = "client!nc",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method738(int arg0) {
      try {
         ++field7026;
         if (arg0 != 0) {
            this.method740(-113, (class404[])null);
         }

         return class717.field10755[(super.field1505 >> class394.field6180) - class487.field7409 + class382.field6038][(super.field1494 >> class394.field6180) + class382.field6038 + -class701.field10446];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7028[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "l",
      descriptor = "(I)V"
   )
   public static final void method3586(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field7023;
         int var2 = class687.field10213.field501.method5090(480102311);
         if (arg0 != 255) {
            field7020 = null;
         }

         label37: {
            if (~var2 == -1) {
               class303.field4736 = null;
               class478.method3721(0, (byte)12);
               if (!var1) {
                  break label37;
               }
            }

            if (var2 != 1) {
               class767.method5603((byte)(255 & class801.field11657 - 4), 0);
               class478.method3721(2, (byte)12);
               if (!var1) {
                  break label37;
               }
            }

            class767.method5603((byte)0, 0);
            class478.method3721(512, (byte)12);
            if (class757.field11211 != null) {
               class374.method3046(0);
            }
         }

         class780.field11438 = class464.field7054;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7028[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3587(int arg0, byte arg1) {
      try {
         ++field7022;
         if (client.method1170(arg0, (byte)-119)) {
            class136.method1260(-1, (byte)-59, class296.field4672[arg0]);
            if (arg1 != -120) {
               method3587(-115, (byte)-44);
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7028[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(I[Llja;)I"
   )
   public final int method740(int arg0, class404[] arg1) {
      try {
         if (arg0 != 27084) {
            field7020 = null;
         }

         ++field7019;
         return this.method1040(super.field1494 >> class394.field6180, super.field1505 >> class394.field6180, false, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7028[7] + arg0 + ',' + (arg1 != null ? field7028[3] : field7028[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method3588(boolean arg0) {
      try {
         field7020 = null;
         field7027 = null;
         if (!arg0) {
            field7020 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7028[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field1495 = arg1;
         super.field1506 = (byte)arg3;
         super.field1500 = (byte)arg4;
         this.field7024 = (short)arg5;
         super.field1505 = arg0;
         super.field1494 = arg2;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7028[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(Lha;B)Z"
   )
   public final boolean method734(class610 arg0, byte arg1) {
      try {
         if (arg1 != -59) {
            this.field7024 = 47;
         }

         ++field7025;
         return client.method1174(super.field1494 >> class394.field6180, super.field1500, super.field1505 >> class394.field6180, 116);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7028[2] + (arg0 != null ? field7028[3] : field7028[1]) + ',' + arg1 + ')');
      }
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field7020[var1] = var0 - 1;
         var0 += var0;
      }

      field7027 = new class12(method3590(method3589("+\u000b>9")), method3590(method3589("\u00139\n\u0013O\u0019")), method3590(method3589("#-\u000f")), 1);
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3589(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3590(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
