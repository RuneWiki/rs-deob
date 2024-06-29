import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class501 extends class67 {
   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7668 = new String[]{method3887(method3886("N\u0013\u001bV-\u0010")), method3887(method3886("N\u0013\u001bV,\u0010")), method3887(method3886("N\u0013\u001bV)\u0010")), method3887(method3886("N\u0013\u001bV&\u0010")), method3887(method3886("N\u0013\u001bV/\u0010")), method3887(method3886("N\u0013\u001bV+\u0010"))};
   @OriginalMember(
      owner = "client!vga",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field7664 = new class498(5, -2);
   @OriginalMember(
      owner = "client!vga",
      name = "p",
      descriptor = "I"
   )
   public static int field7667 = -1;
   @OriginalMember(
      owner = "client!vga",
      name = "o",
      descriptor = "Let;"
   )
   public static class389 field7665 = new class389(64);
   @OriginalMember(
      owner = "client!vga",
      name = "r",
      descriptor = "I"
   )
   public static int field7660;
   @OriginalMember(
      owner = "client!vga",
      name = "k",
      descriptor = "I"
   )
   public static int field7661;
   @OriginalMember(
      owner = "client!vga",
      name = "n",
      descriptor = "I"
   )
   public static int field7662;
   @OriginalMember(
      owner = "client!vga",
      name = "l",
      descriptor = "I"
   )
   public static int field7663;
   @OriginalMember(
      owner = "client!vga",
      name = "q",
      descriptor = "I"
   )
   public static int field7666;

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         ++field7666;
         if (!arg1) {
            field7667 = -103;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7668[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field7660;
         if (arg0 != 0) {
            return -29;
         } else {
            return super.field881.method298(96) ? 1 : 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7668[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class501(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3884(boolean arg0) {
      try {
         field7664 = null;
         if (!arg0) {
            method3884(false);
         }

         field7665 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7668[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3885(int arg0) {
      try {
         ++field7662;
         return arg0 != 480102311 ? -78 : super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7668[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         ++field7661;
         super.field877 = this.method162(0);
         if (arg0 != -69) {
            field7664 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7668[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class501(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field7663;
         if (arg1 >= -74) {
            this.method158((byte)59);
         }

         return 3;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7668[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3886(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3887(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
