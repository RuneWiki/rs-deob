import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class345 {
   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field75 = new String[]{method57(method56("@\u000b_\"*")), method57(method56("@\u000b_&*")), method57(method56("@\u000b_#*")), method57(method56("@\u000b_'*")), method57(method56("@\u000b_$*")), method57(method56("@\u000b_!*")), method57(method56("RI_K\u007f")), method57(method56("@\u000b_ *")), method57(method56("G\u0012\u001d\t"))};
   @OriginalMember(
      owner = "client!il",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field71 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @OriginalMember(
      owner = "client!il",
      name = "o",
      descriptor = "I"
   )
   public static int field66;
   @OriginalMember(
      owner = "client!il",
      name = "p",
      descriptor = "I"
   )
   public static int field67;
   @OriginalMember(
      owner = "client!il",
      name = "l",
      descriptor = "I"
   )
   public static int field68;
   @OriginalMember(
      owner = "client!il",
      name = "k",
      descriptor = "I"
   )
   public static int field69;
   @OriginalMember(
      owner = "client!il",
      name = "q",
      descriptor = "I"
   )
   public static int field70;
   @OriginalMember(
      owner = "client!il",
      name = "i",
      descriptor = "I"
   )
   public static int field72;
   @OriginalMember(
      owner = "client!il",
      name = "n",
      descriptor = "Lhw;"
   )
   public static class141 field73;
   @OriginalMember(
      owner = "client!il",
      name = "j",
      descriptor = "Loo;"
   )
   public static class651 field74;

   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method49(int arg0) {
      try {
         if (arg0 < -8) {
            field71 = null;
            field74 = null;
            field73 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field75[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Lha;IILjfa;I)V"
   )
   public static final void method50(class65 param0, int param1, int param2, class303 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         ++field68;
         if (arg0 != 0) {
            method50((class65)null, 97, -84, (class303)null, -70);
         }

         if (~super.field4913 != -2 && ~super.field4913 != -1) {
            super.field4913 = this.method53(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field75[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class7(int arg0, class768 arg1) {
      super(arg1);
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field69;
         return arg0 >= -45 ? 4 : 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field75[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         ++field70;
         return arg0 ? -21 : 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field75[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         super.field4913 = arg0;
         if (arg1 > 99) {
            ++field66;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field75[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class7(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method55(boolean arg0) {
      try {
         ++field72;
         return arg0 ? -28 : super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field75[1] + arg0 + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method56(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method57(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
