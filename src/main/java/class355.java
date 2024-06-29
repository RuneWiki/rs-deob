import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class355 extends class14 {
   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4784 = new String[]{method2656(method2655("9#([\u001f")), method2656(method2655("9#(V\u001f")), method2656(method2655("9#(Q\u001f")), method2656(method2655("9#(P\u001f")), method2656(method2655("9#(T\u001f")), method2656(method2655("(b(=J")), method2656(method2655("=9j\u007f")), method2656(method2655("9#(R\u001f"))};
   @OriginalMember(
      owner = "client!jo",
      name = "m",
      descriptor = "I"
   )
   public static int field4783 = -2;
   @OriginalMember(
      owner = "client!jo",
      name = "r",
      descriptor = "I"
   )
   public static int field4777;
   @OriginalMember(
      owner = "client!jo",
      name = "n",
      descriptor = "I"
   )
   public static int field4778;
   @OriginalMember(
      owner = "client!jo",
      name = "p",
      descriptor = "I"
   )
   public static int field4779;
   @OriginalMember(
      owner = "client!jo",
      name = "o",
      descriptor = "I"
   )
   public static int field4780;
   @OriginalMember(
      owner = "client!jo",
      name = "s",
      descriptor = "I"
   )
   public static int field4781;
   @OriginalMember(
      owner = "client!jo",
      name = "q",
      descriptor = "I"
   )
   public static int field4782;

   @OriginalMember(
      owner = "client!jo",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 3
   )
   public class355(class573 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(III)V",
      line = 6
   )
   public final void method82(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 13880) {
            this.method85(79);
         }

         ++field4777;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4784[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(BLsl;I)V",
      line = 16
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         super.field157.method4107(44, arg1);
         ++field4780;
         if (arg0 < 75) {
            field4783 = 101;
         }

         super.field157.method4134(arg2, 2);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4784[4] + arg0 + ',' + (arg1 != null ? field4784[5] : field4784[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(ZI)V",
      line = 28
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         if (arg1 == 13254) {
            ++field4782;
            super.field157.method4102(true, (byte)90);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4784[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "(I)V",
      line = 39
   )
   public final void method85(int arg0) {
      try {
         if (arg0 != 17328) {
            field4783 = -80;
         }

         super.field157.method4102(false, (byte)-79);
         ++field4778;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4784[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(I)Z",
      line = 51
   )
   public final boolean method87(int arg0) {
      try {
         ++field4781;
         if (arg0 > -49) {
            this.method88(76, true);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4784[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(IZ)V",
      line = 64
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         if (arg0 == 16) {
            ++field4779;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4784[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2655(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2656(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
