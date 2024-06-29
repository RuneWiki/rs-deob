import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class235 extends class213 {
   @OriginalMember(
      owner = "client!bea",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2917 = new String[]{method1777(method1776(" \b\u0010M?j")), method1777(method1776(" \b\u0010M8j")), method1777(method1776(" \b\u0010M9j")), method1777(method1776(" \b\u0010M6j")), method1777(method1776(" \b\u0010M>j")), method1777(method1776(",\u0018\u001d\u000f")), method1777(method1776("9C_M\u0001")), method1777(method1776(" \b\u0010M@+\u0003\u0018\u0017Bj")), method1777(method1776(" \b\u0010M;j"))};
   @OriginalMember(
      owner = "client!bea",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field2907 = new int[5];
   @OriginalMember(
      owner = "client!bea",
      name = "G",
      descriptor = "Lbga;"
   )
   public static class378 field2916 = new class378(76, -1);
   @OriginalMember(
      owner = "client!bea",
      name = "D",
      descriptor = "I"
   )
   private int field2908;
   @OriginalMember(
      owner = "client!bea",
      name = "F",
      descriptor = "I"
   )
   public static int field2909;
   @OriginalMember(
      owner = "client!bea",
      name = "L",
      descriptor = "I"
   )
   private int field2910;
   @OriginalMember(
      owner = "client!bea",
      name = "M",
      descriptor = "I"
   )
   public static int field2911;
   @OriginalMember(
      owner = "client!bea",
      name = "I",
      descriptor = "I"
   )
   public static int field2912;
   @OriginalMember(
      owner = "client!bea",
      name = "J",
      descriptor = "I"
   )
   public static int field2913;
   @OriginalMember(
      owner = "client!bea",
      name = "K",
      descriptor = "I"
   )
   private int field2914;
   @OriginalMember(
      owner = "client!bea",
      name = "H",
      descriptor = "I"
   )
   public static int field2915;

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2912;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (super.field2644.field6719) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || ~var8 > ~class576.field7916) {
               do {
                  var5[var8] = this.field2910;
                  var6[var8] = this.field2908;
                  var7[var8] = this.field2914;
                  ++var8;
               } while(~var8 > ~class576.field7916);
            }
         }

         return arg1 < 26 ? null : var4;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field2917[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method1772(int arg0) {
      try {
         field2916 = null;
         field2907 = null;
         if (arg0 != 0) {
            method1772(10);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2917[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class235(int arg0) {
      super(0, false);

      try {
         this.method1775(16711680, arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2917[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field2909;
         int var4 = 113 / ((68 - arg1) / 48);
         if (arg2 == 0) {
            this.method1775(16711680, arg0.method4293(70));
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2917[8] + (arg0 != null ? field2917[6] : field2917[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method1773(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bea",
      name = "a",
      descriptor = "(Leb;IILha;B)V"
   )
   public static final void method1774(class657 param0, int param1, int param2, class65 param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bea",
      name = "<init>",
      descriptor = "()V"
   )
   public class235() {
      this(0);
   }

   @OriginalMember(
      owner = "client!bea",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method1775(int arg0, int arg1) {
      try {
         ++field2911;
         this.field2914 = arg1 << 4 & 4080;
         this.field2910 = (arg0 & arg1) >> 12;
         this.field2908 = (65280 & arg1) >> 4;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2917[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1776(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1777(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
