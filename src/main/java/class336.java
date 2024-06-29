import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class336 extends class67 {
   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5160 = new String[]{method2745(method2744("\u0019I#X<")), method2745(method2744("\u0019I#^<")), method2745(method2744("\u0019I#_<")), method2745(method2744("\u0019I#R<")), method2745(method2744("\u0019I#Y<")), method2745(method2744("\u0019I#S<")), method2745(method2744("\u0019I#\\<")), method2745(method2744("\u0019I#Z<")), method2745(method2744("\u0015\u0012#5i")), method2745(method2744("\u0000Iaw")), method2745(method2744("\u0019I#]<"))};
   @OriginalMember(
      owner = "client!wu",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field5157 = new int[1];
   @OriginalMember(
      owner = "client!wu",
      name = "n",
      descriptor = "I"
   )
   public static int field5151;
   @OriginalMember(
      owner = "client!wu",
      name = "m",
      descriptor = "I"
   )
   public static int field5152;
   @OriginalMember(
      owner = "client!wu",
      name = "s",
      descriptor = "I"
   )
   public static int field5153;
   @OriginalMember(
      owner = "client!wu",
      name = "q",
      descriptor = "I"
   )
   public static int field5154;
   @OriginalMember(
      owner = "client!wu",
      name = "p",
      descriptor = "I"
   )
   public static int field5155;
   @OriginalMember(
      owner = "client!wu",
      name = "k",
      descriptor = "I"
   )
   public static int field5156;
   @OriginalMember(
      owner = "client!wu",
      name = "r",
      descriptor = "I"
   )
   public static int field5158;
   @OriginalMember(
      owner = "client!wu",
      name = "o",
      descriptor = "I"
   )
   public static int field5159;

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(Lil;BLka;III)V"
   )
   public static final void method2739(class680 arg0, byte arg1, class91 arg2, int arg3, int arg4, int arg5) {
      try {
         ++field5156;
         if (arg2 != null) {
            arg0.method5037(arg2.method902(), arg2.method871(), arg2.method918(), arg5, arg2.method911(), arg2.method866(), arg4, arg2.method876(), arg2.method891(), 124, arg3);
            if (arg1 != 53) {
               field5157 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5160[7] + (arg0 != null ? field5160[8] : field5160[9]) + ',' + arg1 + ',' + (arg2 != null ? field5160[8] : field5160[9]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class336(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!wu",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class336(int arg0, class41 arg1) {
      super(arg1);
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         ++field5154;
         if (!arg1) {
            this.method165(-70, false);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5160[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2740(byte arg0) {
      try {
         int var1 = 61 % ((arg0 - -42) / 45);
         class801.field11661.method2551(true);
         ++field5153;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5160[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2741(int arg0) {
      try {
         ++field5159;
         if (arg0 != 480102311) {
            field5157 = null;
         }

         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5160[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method2742(int arg0) {
      try {
         field5157 = null;
         if (arg0 != 1) {
            method2742(-19);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5160[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method2743(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 21) {
            method2740((byte)119);
         }

         ++field5155;
         class566 var3 = class146.method1321((long)arg1 | (long)arg0 << 32, 18, -1428737160);
         var3.method4268(arg2 ^ 17);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5160[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            method2739((class680)null, (byte)-52, (class91)null, 51, -97, 9);
         }

         ++field5151;
         return 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5160[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 >= -74) {
            field5157 = null;
         }

         ++field5152;
         return 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5160[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 != -69) {
            this.method2741(70);
         }

         if (super.field877 != 1 && super.field877 != 0) {
            super.field877 = this.method162(0);
         }

         ++field5158;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5160[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2744(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2745(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
