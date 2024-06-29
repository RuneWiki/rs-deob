import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class318 extends class133 implements class758 {
   @OriginalMember(
      owner = "client!vt",
      name = "q",
      descriptor = "I"
   )
   private int field4545;
   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4557 = new String[]{method2419(method2418("E\u001bMM3")), method2419(method2418("E\u001bMF3")), method2419(method2418("E\u001bMB3")), method2419(method2418("]\u001a\u000fk")), method2419(method2418("HAM)f")), method2419(method2418("E\u001bM;r]\u0006\u001793")), method2419(method2418("E\u001bMN3")), method2419(method2418("E\u001bMA3")), method2419(method2418("E\u001bME3"))};
   @OriginalMember(
      owner = "client!vt",
      name = "i",
      descriptor = "I"
   )
   public static int field4549 = 50;
   @OriginalMember(
      owner = "client!vt",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field4547 = new int[field4549];
   @OriginalMember(
      owner = "client!vt",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field4543 = new int[field4549];
   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4548 = new String[field4549];
   @OriginalMember(
      owner = "client!vt",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field4544 = new int[field4549];
   @OriginalMember(
      owner = "client!vt",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field4550 = new int[field4549];
   @OriginalMember(
      owner = "client!vt",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field4542 = new int[field4549];
   @OriginalMember(
      owner = "client!vt",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field4546 = new int[field4549];
   @OriginalMember(
      owner = "client!vt",
      name = "h",
      descriptor = "I"
   )
   public static int field4551;
   @OriginalMember(
      owner = "client!vt",
      name = "o",
      descriptor = "I"
   )
   public static int field4553;
   @OriginalMember(
      owner = "client!vt",
      name = "j",
      descriptor = "I"
   )
   public static int field4554;
   @OriginalMember(
      owner = "client!vt",
      name = "k",
      descriptor = "I"
   )
   public static int field4555;
   @OriginalMember(
      owner = "client!vt",
      name = "m",
      descriptor = "I"
   )
   public static int field4556;
   @OriginalMember(
      owner = "client!vt",
      name = "d",
      descriptor = "Lsfa;"
   )
   public static class724 field4552;

   @OriginalMember(
      owner = "client!vt",
      name = "d",
      descriptor = "(I)V",
      line = 9
   )
   public static void method2416(int arg0) {
      try {
         field4543 = null;
         field4544 = null;
         field4552 = null;
         field4548 = null;
         int var1 = -93 / ((arg0 - -49) / 59);
         field4550 = null;
         field4547 = null;
         field4546 = null;
         field4542 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4557[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(IB)I",
      line = 28
   )
   public static final int method2417(int arg0, byte arg1) {
      try {
         if (arg1 >= -79) {
            method2417(-68, (byte)-15);
         }

         ++field4556;
         return arg0 & 1023;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4557[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(I[BBI)V",
      line = 47
   )
   public final void method998(int arg0, byte[] arg1, byte arg2, int arg3) {
      try {
         this.method1137(arg1, arg0);
         ++field4553;
         if (arg2 >= -81) {
            field4550 = null;
         }

         this.field4545 = arg3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4557[7] + arg0 + ',' + (arg1 != null ? field4557[4] : field4557[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(I)I",
      line = 65
   )
   public final int method996(int arg0) {
      try {
         ++field4551;
         return arg0 != 15234 ? -54 : this.field4545;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4557[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "(I)I",
      line = 76
   )
   public final int method991(int arg0) {
      try {
         ++field4554;
         if (arg0 != 1330) {
            field4546 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4557[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "(I)J",
      line = 96
   )
   public final long method992(int arg0) {
      try {
         if (arg0 != 30662) {
            return -30L;
         } else {
            ++field4555;
            return super.field1660.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4557[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "<init>",
      descriptor = "(Lck;I[BI)V",
      line = 108
   )
   public class318(class667 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field4545 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4557[5] + (arg0 != null ? field4557[4] : field4557[3]) + ',' + arg1 + ',' + (arg2 != null ? field4557[4] : field4557[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2418(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2419(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
