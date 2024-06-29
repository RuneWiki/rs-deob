import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class354 extends class428 {
   @OriginalMember(
      owner = "client!b",
      name = "v",
      descriptor = "Lea;"
   )
   public class573 field4768;
   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4776 = new String[]{method2654(method2653("J\u0004\u0017\u001c")), method2654(method2653("J\u0004\n\u001c")), method2654(method2653("J\u0004\u0015\u001c")), method2654(method2653("J\u0004\u000b\u001c")), method2654(method2653("S\u0004k\u001a;")), method2654(method2653("J\u0004y](A^{\u001c")), method2654(method2653("F_)X")), method2654(method2653("J\u0004\u0014\u001c")), method2654(method2653("J\u0004\u0000\u001c"))};
   @OriginalMember(
      owner = "client!b",
      name = "r",
      descriptor = "Leg;"
   )
   public static class118 field4769 = new class118(20, 3);
   @OriginalMember(
      owner = "client!b",
      name = "n",
      descriptor = "Lqea;"
   )
   public static class139 field4772 = new class139();
   @OriginalMember(
      owner = "client!b",
      name = "t",
      descriptor = "I"
   )
   public static int field4766;
   @OriginalMember(
      owner = "client!b",
      name = "q",
      descriptor = "I"
   )
   public static int field4767;
   @OriginalMember(
      owner = "client!b",
      name = "m",
      descriptor = "I"
   )
   public static int field4770;
   @OriginalMember(
      owner = "client!b",
      name = "u",
      descriptor = "I"
   )
   public static int field4771;
   @OriginalMember(
      owner = "client!b",
      name = "s",
      descriptor = "I"
   )
   public static int field4773;
   @OriginalMember(
      owner = "client!b",
      name = "o",
      descriptor = "I"
   )
   public static int field4775;
   @OriginalMember(
      owner = "client!b",
      name = "p",
      descriptor = "Z"
   )
   public boolean field4774;

   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "(B)Z",
      line = 4
   )
   public final boolean method2641(byte arg0) {
      try {
         ++field4770;
         if (arg0 < 80) {
            this.field4768 = null;
         }

         return this.field4774;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4776[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "d",
      descriptor = "(I)Z",
      line = 15
   )
   public final boolean method2642(int arg0) {
      try {
         if (arg0 != 12412) {
            this.method2641((byte)-33);
         }

         ++field4773;
         return false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4776[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "c",
      descriptor = "(I)Z",
      line = 34
   )
   public static final boolean method2645(int arg0) {
      try {
         ++field4767;
         return arg0 <= class622.field9156;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4776[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(I)I",
      line = 58
   )
   public final int method2650(int arg0) {
      try {
         ++field4771;
         return arg0 != 0 ? 91 : 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4776[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "h",
      descriptor = "(I)V",
      line = 70
   )
   public static void method2651(int arg0) {
      try {
         field4769 = null;
         field4772 = null;
         if (arg0 <= 46) {
            field4769 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4776[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "(I)I",
      line = 82
   )
   public int method2652(int arg0) {
      try {
         if (arg0 != -2467) {
            this.field4768 = null;
         }

         ++field4775;
         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4776[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 93
   )
   public class354(class573 arg0) {
      try {
         this.field4768 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4776[5] + (arg0 != null ? field4776[4] : field4776[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2643(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method2644(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method2646(byte arg0);

   @OriginalMember(
      owner = "client!b",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method2647(int arg0);

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(Z)Z"
   )
   public abstract boolean method2648(boolean arg0);

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(Lbha;ILbha;I)V"
   )
   public abstract void method2649(class601 arg0, int arg1, class601 arg2, int arg3);

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2653(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2654(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
