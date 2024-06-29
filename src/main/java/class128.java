import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class128 extends class213 {
   @OriginalMember(
      owner = "client!jj",
      name = "G",
      descriptor = "I"
   )
   private int field1613;
   @OriginalMember(
      owner = "client!jj",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1619 = new String[]{method1077(method1076("KD\u000f\u0017r")), method1077(method1076("^\u001fMU")), method1077(method1076("Z\u0000\u000f~'")), method1077(method1076("Z\u0000\u000fz'")), method1077(method1076("Z\u0000\u000fx'")), method1077(method1076("Z\u0000\u000f{'")), method1077(method1076("Z\u0000\u000f\u0005f^\u0003U\u0007'"))};
   @OriginalMember(
      owner = "client!jj",
      name = "F",
      descriptor = "Ldia;"
   )
   public static class245 field1610 = new class245(16);
   @OriginalMember(
      owner = "client!jj",
      name = "M",
      descriptor = "Lnw;"
   )
   public static class616 field1614 = new class616(87, 3);
   @OriginalMember(
      owner = "client!jj",
      name = "I",
      descriptor = "Lbga;"
   )
   public static class378 field1616 = new class378(112, 6);
   @OriginalMember(
      owner = "client!jj",
      name = "H",
      descriptor = "Ltga;"
   )
   public static class63 field1618 = new class63(1);
   @OriginalMember(
      owner = "client!jj",
      name = "D",
      descriptor = "I"
   )
   public static int field1611;
   @OriginalMember(
      owner = "client!jj",
      name = "K",
      descriptor = "I"
   )
   public static int field1612;
   @OriginalMember(
      owner = "client!jj",
      name = "J",
      descriptor = "I"
   )
   public static int field1615;
   @OriginalMember(
      owner = "client!jj",
      name = "L",
      descriptor = "I"
   )
   public static int field1617;

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      try {
         ++field1615;
         if (arg1 != 2064866508) {
            field1610 = null;
         }

         int[] var3 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            class714.method5196(var3, 0, class576.field7916, this.field1613);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1619[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class128(int arg0) {
      super(0, true);
      this.field1613 = 4096;

      try {
         this.field1613 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1619[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1074(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field1617;
         int var4 = -35 % ((68 - arg1) / 48);
         if (arg2 == 0) {
            this.field1613 = (arg0.method4288((byte)99) << 12) / 255;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1619[2] + (arg0 != null ? field1619[0] : field1619[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1075(int arg0) {
      try {
         field1610 = null;
         field1616 = null;
         field1614 = null;
         if (arg0 != 255) {
            field1614 = null;
         }

         field1618 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1619[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "<init>",
      descriptor = "()V"
   )
   public class128() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1076(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1077(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
