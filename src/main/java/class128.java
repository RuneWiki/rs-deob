import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class128 extends class55 {
   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1643 = new String[]{method1021(method1020(";\u0019(\u0004")), method1021(method1020(".BjF\u0016")), method1021(method1020(" \r%F)}")), method1021(method1020(" \r%F(}")), method1021(method1020(" \r%F-}")), method1021(method1020(" \r%F#}")), method1021(method1020(" \r%F,}")), method1021(method1020(" \r%F.}")), method1021(method1020(" \r%F*}"))};
   @OriginalMember(
      owner = "client!uaa",
      name = "l",
      descriptor = "Leg;"
   )
   public static class118 field1638 = new class118(74, 17);
   @OriginalMember(
      owner = "client!uaa",
      name = "g",
      descriptor = "Leg;"
   )
   public static class118 field1639 = new class118(128, 6);
   @OriginalMember(
      owner = "client!uaa",
      name = "k",
      descriptor = "I"
   )
   public static int field1640 = 0;
   @OriginalMember(
      owner = "client!uaa",
      name = "h",
      descriptor = "I"
   )
   public static int field1641 = 0;
   @OriginalMember(
      owner = "client!uaa",
      name = "n",
      descriptor = "I"
   )
   public static int field1631;
   @OriginalMember(
      owner = "client!uaa",
      name = "o",
      descriptor = "I"
   )
   public static int field1632;
   @OriginalMember(
      owner = "client!uaa",
      name = "m",
      descriptor = "I"
   )
   public static int field1633;
   @OriginalMember(
      owner = "client!uaa",
      name = "e",
      descriptor = "I"
   )
   public static int field1634;
   @OriginalMember(
      owner = "client!uaa",
      name = "f",
      descriptor = "I"
   )
   public static int field1635;
   @OriginalMember(
      owner = "client!uaa",
      name = "i",
      descriptor = "I"
   )
   public static int field1636;
   @OriginalMember(
      owner = "client!uaa",
      name = "j",
      descriptor = "I"
   )
   public static int field1637;
   @OriginalMember(
      owner = "client!uaa",
      name = "p",
      descriptor = "I"
   )
   public static int field1642;

   @OriginalMember(
      owner = "client!uaa",
      name = "c",
      descriptor = "(I)I",
      line = 5
   )
   public final int method1017(int arg0) {
      try {
         int var2 = 110 % ((arg0 - 36) / 41);
         ++field1634;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1643[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 15
   )
   public class128(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "(I)I",
      line = 20
   )
   public final int method101(int arg0) {
      try {
         if (arg0 > -116) {
            field1642 = 16;
         }

         ++field1637;
         return super.field683.method3308(1) == class185.field2620 && super.field683.method3300((byte)-56) ? 0 : 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1643[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(B)V",
      line = 35
   )
   public static void method1018(byte arg0) {
      try {
         if (arg0 != -61) {
            method1018((byte)-8);
         }

         field1639 = null;
         field1638 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1643[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(I)V",
      line = 48
   )
   public final void method98(int arg0) {
      try {
         ++field1633;
         if (arg0 == 0) {
            super.field680 = this.method101(arg0 + -121);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1643[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 60
   )
   public class128(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(ZLcl;)V",
      line = 63
   )
   public static final void method1019(boolean arg0, class279 arg1) {
      try {
         label43: {
            if (!(arg1 instanceof class506)) {
               if (!(arg1 instanceof class121)) {
                  break label43;
               }

               class121 var2 = (class121)arg1;
               class262.method2003(class564.field8045.field10701 != var2.field10701, var2, 98);
               if (!client.field4360) {
                  break label43;
               }
            }

            class506 var3 = (class506)arg1;
            if (var3.field7333 != null) {
               class12.method70(var3, (byte)-104, ~class564.field8045.field10701 != ~var3.field10701);
            }
         }

         if (arg0) {
            ++field1635;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1643[2] + arg0 + ',' + (arg1 != null ? field1643[1] : field1643[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "b",
      descriptor = "(IB)V",
      line = 92
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field1632;
         int var3 = -43 % ((47 - arg1) / 46);
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1643[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "a",
      descriptor = "(IB)I",
      line = 102
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field1636;
         return arg1 != 105 ? -107 : 3;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1643[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1020(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1021(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
