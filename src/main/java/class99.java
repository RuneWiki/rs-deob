import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class99 extends class371 {
   @OriginalMember(
      owner = "client!wca",
      name = "k",
      descriptor = "[Ldr;"
   )
   public class570[] field1393;
   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1394 = new String[]{method971(method970("\u0005E}\u0019\u0006Z")), method971(method970("\t\b2\u0019>")), method971(method970("\u001cSp[")), method971(method970("\u0005E}\u0019\u007f\u001bHuC}Z")), method971(method970("\u0005E}\u0019\u0007Z")), method971(method970("\u0005E}\u0019\u0000Z"))};
   @OriginalMember(
      owner = "client!wca",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field1389 = false;
   @OriginalMember(
      owner = "client!wca",
      name = "l",
      descriptor = "I"
   )
   public static int field1391 = 0;
   @OriginalMember(
      owner = "client!wca",
      name = "h",
      descriptor = "I"
   )
   public static int field1388;
   @OriginalMember(
      owner = "client!wca",
      name = "g",
      descriptor = "I"
   )
   public static int field1390;
   @OriginalMember(
      owner = "client!wca",
      name = "j",
      descriptor = "I"
   )
   public static int field1392;

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "([II[I)V",
      line = 3
   )
   public static final void method967(int[] param0, int param1, int[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(ZILfq;I)V",
      line = 35
   )
   public static final void method968(boolean arg0, int arg1, class374 arg2, int arg3) {
      try {
         if (!arg0) {
            method968(true, 104, (class374)null, -51);
         }

         ++field1388;
         class332.field5030 = arg3;
         class355.field5470 = arg1;
         class509.field7792 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1394[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1394[1] : field1394[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "(B)I",
      line = 52
   )
   public static final int method969(byte arg0) {
      try {
         ++field1392;
         if ((double)class60.field748 == 3.0D) {
            return 37;
         } else if ((double)class60.field748 == 4.0D) {
            return 50;
         } else {
            if (arg0 != 66) {
               field1389 = true;
            }

            if ((double)class60.field748 == 6.0D) {
               return 75;
            } else {
               return (double)class60.field748 == 8.0D ? 100 : 200;
            }
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1394[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "<init>",
      descriptor = "([Ldr;)V",
      line = 84
   )
   public class99(class570[] arg0) {
      try {
         this.field1393 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1394[3] + (arg0 != null ? field1394[1] : field1394[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
