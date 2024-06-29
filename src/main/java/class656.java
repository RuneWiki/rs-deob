import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class656 extends class641 {
   @OriginalMember(
      owner = "client!sn",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9532 = new String[]{method4720(method4719("\u0005)E\u0011)")), method4720(method4719("\u00182\u00075")), method4720(method4719("\riEw|")), method4720(method4719("\u0005)E\u001f)")), method4720(method4719("\u0005)E\u001d)")), method4720(method4719("\u0005)E\u001e)")), method4720(method4719("\u0005)E\u0013)"))};
   @OriginalMember(
      owner = "client!sn",
      name = "E",
      descriptor = "Lsd;"
   )
   public static class101 field9525 = new class101(113, 6);
   @OriginalMember(
      owner = "client!sn",
      name = "G",
      descriptor = "Lsda;"
   )
   public static class269 field9530 = new class269(43, 3);
   @OriginalMember(
      owner = "client!sn",
      name = "D",
      descriptor = "Lsda;"
   )
   public static class269 field9531 = new class269(72, -1);
   @OriginalMember(
      owner = "client!sn",
      name = "J",
      descriptor = "I"
   )
   public static int field9526;
   @OriginalMember(
      owner = "client!sn",
      name = "F",
      descriptor = "I"
   )
   public static int field9527;
   @OriginalMember(
      owner = "client!sn",
      name = "H",
      descriptor = "I"
   )
   public static int field9528;
   @OriginalMember(
      owner = "client!sn",
      name = "I",
      descriptor = "I"
   )
   public static int field9529;

   @OriginalMember(
      owner = "client!sn",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method4715(byte arg0) {
      try {
         ++field9528;
         int var1 = 105 / ((arg0 - 35) / 46);
         class544.field8074.method5608(0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9532[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method4716(byte arg0) {
      try {
         if (arg0 != -52) {
            method4717(125);
         }

         class310.field4409.method5451(-120);
         ++field9527;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9532[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4717(int arg0) {
      try {
         field9525 = null;
         int var1 = 108 / ((-63 - arg0) / 45);
         field9531 = null;
         field9530 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9532[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "([BB)[B"
   )
   public static final byte[] method4718(byte[] arg0, byte arg1) {
      try {
         ++field9526;
         class128 var2 = new class128(arg0);
         int var3 = var2.method1104(255);
         if (arg1 > -30) {
            method4717(8);
         }

         int var4 = var2.method1041(4758);
         if (~var4 > -1 || ~class551.field8147 != -1 && var4 > class551.field8147) {
            throw new RuntimeException();
         } else if (~var3 == -1) {
            byte[] var8 = new byte[var4];
            var2.method1102(var4, var8, 0, (byte)-128);
            return var8;
         } else {
            int var5 = var2.method1041(4758);
            if (var5 < 0 || class551.field8147 != 0 && var5 > class551.field8147) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (~var3 != -2) {
                  class392 var7 = class537.field7851;
                  synchronized(class537.field7851) {
                     class537.field7851.method2996(var2, 102, var6);
                  }
               } else {
                  class608.method4430(var6, var5, arg0, var4, 9);
               }

               return var6;
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field9532[3] + (arg0 != null ? field9532[2] : field9532[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method4610(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9529;
         if (arg3 != -1) {
            method4718((byte[])null, (byte)-26);
         }

         int var6 = super.field9341.method1971();
         int var7 = ((class607)super.field263).field8919 * class578.method4266((byte)-71) / 10 % var6;
         super.field9341.method3032(arg4 + var7 - var6, arg0, var6 - var7 + arg2, arg1);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9532[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "<init>",
      descriptor = "(Leaa;Leaa;Lht;)V"
   )
   public class656(class526 arg0, class526 arg1, class607 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4719(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4720(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
