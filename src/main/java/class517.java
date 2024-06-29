import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class517 {
   @OriginalMember(
      owner = "client!kp",
      name = "g",
      descriptor = "B"
   )
   public byte field7466;
   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7477 = new String[]{method3768(method3767("jMys\u0015")), method3768(method3767("jMyw\u0015")), method3768(method3767("jMyv\u0015")), method3768(method3767("jMyp\u0015")), method3768(method3767("jMyq\u0015")), method3768(method3767("jMy\u000eToT#\f\u0015"))};
   @OriginalMember(
      owner = "client!kp",
      name = "j",
      descriptor = "I"
   )
   public static int field7455 = -1;
   @OriginalMember(
      owner = "client!kp",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field7458 = false;
   @OriginalMember(
      owner = "client!kp",
      name = "v",
      descriptor = "I"
   )
   public static int field7460 = 0;
   @OriginalMember(
      owner = "client!kp",
      name = "l",
      descriptor = "D"
   )
   public static double field7456;
   @OriginalMember(
      owner = "client!kp",
      name = "q",
      descriptor = "F"
   )
   public static float field7462;
   @OriginalMember(
      owner = "client!kp",
      name = "h",
      descriptor = "I"
   )
   public static int field7453;
   @OriginalMember(
      owner = "client!kp",
      name = "o",
      descriptor = "I"
   )
   public static int field7454;
   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "I"
   )
   public static int field7457;
   @OriginalMember(
      owner = "client!kp",
      name = "s",
      descriptor = "I"
   )
   public static int field7459;
   @OriginalMember(
      owner = "client!kp",
      name = "p",
      descriptor = "I"
   )
   public static int field7461;
   @OriginalMember(
      owner = "client!kp",
      name = "c",
      descriptor = "Lta;"
   )
   public class226 field7464;
   @OriginalMember(
      owner = "client!kp",
      name = "r",
      descriptor = "Lol;"
   )
   public class300 field7474;
   @OriginalMember(
      owner = "client!kp",
      name = "f",
      descriptor = "Lol;"
   )
   public class300 field7475;
   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "Lbg;"
   )
   public static class492 field7463;
   @OriginalMember(
      owner = "client!kp",
      name = "m",
      descriptor = "Lkp;"
   )
   public class517 field7467;
   @OriginalMember(
      owner = "client!kp",
      name = "k",
      descriptor = "Lkfa;"
   )
   public class629 field7472;
   @OriginalMember(
      owner = "client!kp",
      name = "w",
      descriptor = "Lsv;"
   )
   public class688 field7469;
   @OriginalMember(
      owner = "client!kp",
      name = "e",
      descriptor = "Lsv;"
   )
   public class688 field7476;
   @OriginalMember(
      owner = "client!kp",
      name = "x",
      descriptor = "Lfl;"
   )
   public class772 field7468;
   @OriginalMember(
      owner = "client!kp",
      name = "u",
      descriptor = "S"
   )
   public short field7465;
   @OriginalMember(
      owner = "client!kp",
      name = "n",
      descriptor = "S"
   )
   public short field7470;
   @OriginalMember(
      owner = "client!kp",
      name = "i",
      descriptor = "S"
   )
   public short field7471;
   @OriginalMember(
      owner = "client!kp",
      name = "d",
      descriptor = "S"
   )
   public short field7473;

   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method3762(int arg0) throws class525 {
      try {
         label20: {
            if (class614.field9025 == 1) {
               class50.field660.method560(class136.field1735, class532.field7589);
               if (!client.field4360) {
                  break label20;
               }
            }

            class50.field660.method560(0, 0);
         }

         ++field7453;
         if (arg0 != 0) {
            method3763(4);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7477[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "d",
      descriptor = "(I)V",
      line = 23
   )
   public static void method3763(int arg0) {
      try {
         field7463 = null;
         if (arg0 <= 50) {
            field7455 = -99;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7477[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(B)V",
      line = 35
   )
   public final void method3764(byte arg0) {
      boolean var2 = client.field4360;

      try {
         class772 var3;
         if (var2) {
            var3 = this.field7468.field11354;
            this.field7468.method5577((byte)119);
            this.field7468 = var3;
         }

         while(this.field7468 != null) {
            var3 = this.field7468.field11354;
            this.field7468.method5577((byte)119);
            this.field7468 = var3;
         }

         ++field7454;
         if (arg0 < 96) {
            method3766(31);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7477[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "c",
      descriptor = "(I)V",
      line = 58
   )
   public static final void method3765(int arg0) {
      boolean var1 = client.field4360;

      try {
         int var2 = arg0;
         int var10000;
         if (var1) {
            var10000 = class700.method5086(class503.field7302 + arg0, (byte)-62, class131.field1670) * class50.field658;
         } else if (~arg0 <= ~class131.field1670) {
            var10000 = field7459 + 1;
            if (!var1) {
               field7459 = var10000;
               return;
            }
         } else {
            var10000 = class700.method5086(class503.field7302 + arg0, (byte)-62, class131.field1670) * class50.field658;
         }

         while(true) {
            int var3 = var10000;
            int var4 = 0;
            if (var1 || ~var4 > ~class50.field658) {
               do {
                  int var5 = var3 - -class700.method5086(class360.field4901 + var4, (byte)-80, class50.field658);
                  if (class287.field3964[var5] == class489.field7006) {
                     class12.field133[var5].method1(0, 0, class347.field4686, class88.field1146, class347.field4686 * var4, class88.field1146 * var2, true, true);
                  }

                  ++var4;
               } while(~var4 > ~class50.field658);
            }

            ++var2;
            if (~var2 <= ~class131.field1670) {
               var10000 = field7459 + 1;
               if (!var1) {
                  field7459 = var10000;
                  return;
               }
            } else {
               var10000 = class700.method5086(class503.field7302 + var2, (byte)-62, class131.field1670) * class50.field658;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7477[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(I)V",
      line = 94
   )
   public static final void method3766(int arg0) {
      try {
         class750.field11103 = "";
         class284.field3931 = "";
         ++field7457;
         if (arg0 != -19277) {
            field7458 = true;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7477[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "<init>",
      descriptor = "(I)V",
      line = 104
   )
   public class517(int arg0) {
      try {
         this.field7466 = (byte)arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7477[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3767(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3768(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
