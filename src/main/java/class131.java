import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class131 {
   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1683 = new String[]{method1116(method1115("\u0019\u0011U8\n")), method1116(method1115("\u0019\u0011U?\n")), method1116(method1115("\u0013\u0012\u0017\u0016")), method1116(method1115("\u0006IUT_")), method1116(method1115("\u0019\u0011U9\n")), method1116(method1115("\u0019\u0011U<\n")), method1116(method1115("\u0019\u0011U>\n")), method1116(method1115("\u0019\u0011U;\n"))};
   @OriginalMember(
      owner = "client!dv",
      name = "d",
      descriptor = "F"
   )
   public static float field1674;
   @OriginalMember(
      owner = "client!dv",
      name = "l",
      descriptor = "I"
   )
   public static int field1671;
   @OriginalMember(
      owner = "client!dv",
      name = "k",
      descriptor = "I"
   )
   public static int field1672;
   @OriginalMember(
      owner = "client!dv",
      name = "c",
      descriptor = "I"
   )
   public static int field1673;
   @OriginalMember(
      owner = "client!dv",
      name = "g",
      descriptor = "I"
   )
   public static int field1678;
   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "I"
   )
   public static int field1679;
   @OriginalMember(
      owner = "client!dv",
      name = "i",
      descriptor = "I"
   )
   public static int field1681;
   @OriginalMember(
      owner = "client!dv",
      name = "f",
      descriptor = "I"
   )
   public static int field1682;
   @OriginalMember(
      owner = "client!dv",
      name = "h",
      descriptor = "Ldv;"
   )
   public class131 field1670;
   @OriginalMember(
      owner = "client!dv",
      name = "j",
      descriptor = "Luc;"
   )
   public static class257 field1677;
   @OriginalMember(
      owner = "client!dv",
      name = "m",
      descriptor = "Lpia;"
   )
   public class680 field1676;
   @OriginalMember(
      owner = "client!dv",
      name = "e",
      descriptor = "Lit;"
   )
   public static class769 field1675;
   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "Lfj;"
   )
   public static class88 field1680;

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1109(boolean arg0) {
      try {
         field1675 = null;
         field1680 = null;
         if (arg0) {
            field1677 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1683[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1110(int arg0, int arg1) {
      try {
         ++field1672;
         class109.method976((byte)-35);
         int var2 = class496.field6922.method3524(arg1, true).field2648;
         if (~var2 != -1) {
            if (arg0 <= -24) {
               int var3 = class175.field2266.field11170[arg1];
               if (~var2 == -7) {
                  class586.field8654 = var3;
               }

               if (var2 == 5) {
                  class393.field5442 = var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1683[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method1111(boolean arg0) {
      try {
         ++field1673;
         if (!arg0) {
            method1109(false);
         }

         if (class125.field1629 < 500) {
            this.field1670 = class732.field10672;
            this.field1676 = null;
            class732.field10672 = this;
            ++class125.field1629;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1683[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(Lgea;I)Ldh;"
   )
   public static final class300 method1112(class66 arg0, int arg1) {
      try {
         if (arg1 <= 22) {
            method1110(28, 120);
         }

         ++field1671;
         int var2 = arg0.method610(-41);
         return new class300(var2);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1683[1] + (arg0 != null ? field1683[3] : field1683[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method1113(byte arg0) {
      try {
         ++field1679;
         if (~class533.field7825 != -1) {
            return true;
         } else {
            if (arg0 <= 83) {
               field1682 = 122;
            }

            return class98.field1305.method5139((byte)37);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1683[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method1114(byte arg0, class479 arg1) {
      try {
         if (arg0 != 125) {
            method1113((byte)-45);
         }

         ++field1681;
         if (class476.field6634) {
            class743.method5389((byte)98, arg1);
         } else {
            class725.method5248(arg1, arg0 + -126);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1683[6] + arg0 + ',' + (arg1 != null ? field1683[3] : field1683[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1115(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1116(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
