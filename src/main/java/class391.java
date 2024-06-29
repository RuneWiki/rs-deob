import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class391 extends class227 {
   @OriginalMember(
      owner = "client!bfa",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5676 = new String[]{method2976(method2975("{KF<\u000b1")), method2976(method2975("{KF<\u000e1")), method2976(method2975("{KF<\t1")), method2976(method2975("{KF<\f1")), method2976(method2975("{KF<\n1")), method2976(method2975("{KF<\b1")), method2976(method2975("{KF<\u000f1")), method2976(method2975("b\u0003\t<0")), method2976(method2975("{KF<\u00051")), method2976(method2975("wXK~"))};
   @OriginalMember(
      owner = "client!bfa",
      name = "C",
      descriptor = "Lll;"
   )
   public static class387 field5673 = new class387();
   @OriginalMember(
      owner = "client!bfa",
      name = "E",
      descriptor = "I"
   )
   public static int field5663;
   @OriginalMember(
      owner = "client!bfa",
      name = "u",
      descriptor = "I"
   )
   public static int field5664;
   @OriginalMember(
      owner = "client!bfa",
      name = "s",
      descriptor = "I"
   )
   public int field5665;
   @OriginalMember(
      owner = "client!bfa",
      name = "D",
      descriptor = "I"
   )
   public int field5666;
   @OriginalMember(
      owner = "client!bfa",
      name = "x",
      descriptor = "I"
   )
   public static int field5667;
   @OriginalMember(
      owner = "client!bfa",
      name = "t",
      descriptor = "I"
   )
   public static int field5668;
   @OriginalMember(
      owner = "client!bfa",
      name = "A",
      descriptor = "I"
   )
   public int field5670;
   @OriginalMember(
      owner = "client!bfa",
      name = "v",
      descriptor = "I"
   )
   public static int field5671;
   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "I"
   )
   public int field5672;
   @OriginalMember(
      owner = "client!bfa",
      name = "F",
      descriptor = "I"
   )
   public static int field5674;
   @OriginalMember(
      owner = "client!bfa",
      name = "w",
      descriptor = "I"
   )
   public static int field5675;
   @OriginalMember(
      owner = "client!bfa",
      name = "y",
      descriptor = "J"
   )
   public long field5669;

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;)V"
   )
   public static final void method2972(int arg0, int arg1, String arg2, String arg3) {
      try {
         ++field5667;
         if (~arg2.length() >= -321) {
            if (class236.method1817((byte)-5)) {
               class9.method44((byte)-63);
               class750.field11103 = arg3;
               class686.field10122 = arg1;
               if (arg0 == 65280) {
                  class284.field3931 = arg2;
                  class731.method5321(6, (byte)-127);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5676[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5676[7] : field5676[9]) + ',' + (arg3 != null ? field5676[7] : field5676[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method482(byte arg0) {
      try {
         ++field5664;
         if (arg0 >= -72) {
            this.method482((byte)64);
         }

         return this.field5665;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5676[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method2973(int arg0, int arg1, int arg2) {
      try {
         ++field5668;
         int var3 = arg1 >>> 24;
         int var4 = -var3 + 255;
         int var7 = ((65280 & arg1) * var3 & arg2 | -16711936 & (16711935 & arg1) * var3) >>> 8;
         return ((-16711936 & (16711935 & arg0) * var4 | (arg0 & 65280) * var4 & 16711680) >>> 8) - -var7;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5676[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method478(byte arg0) {
      try {
         int var2 = 42 % ((-45 - arg0) / 62);
         ++field5671;
         return this.field5672;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5676[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2974(int arg0) {
      try {
         if (arg0 > -102) {
            field5673 = null;
         }

         field5673 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5676[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method481(byte arg0) {
      try {
         if (arg0 != 35) {
            field5673 = null;
         }

         ++field5675;
         return this.field5666;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5676[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "e",
      descriptor = "(B)J"
   )
   public final long method480(byte arg0) {
      try {
         ++field5674;
         int var2 = -51 % ((arg0 - 65) / 49);
         return this.field5669;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5676[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method479(byte arg0) {
      try {
         if (arg0 > -74) {
            method2974(38);
         }

         ++field5663;
         return this.field5670;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5676[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2975(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2976(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
