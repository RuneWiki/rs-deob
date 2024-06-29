import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class335 {
   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "I"
   )
   public int field4797;
   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4811 = new String[]{method2664(method2663("\u000f;$**")), method2664(method2663("\b9f\u0003")), method2664(method2663("\u000f;$-*")), method2664(method2663("\u001db$A\u007f")), method2664(method2663("\u000f;$Sk\b%~Q*")), method2664(method2663("\u000f;$\u001bm58x\u0006l\u0001d")), method2664(method2663("\u000f;$+*")), method2664(method2663("\u000f;$,*")), method2664(method2663("\u000f;$.*"))};
   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "Liw;"
   )
   public static class335 field4794 = new class335(1);
   @OriginalMember(
      owner = "client!iw",
      name = "q",
      descriptor = "Liw;"
   )
   public static class335 field4801 = new class335(2);
   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "Liw;"
   )
   public static class335 field4802 = new class335(4);
   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "Liw;"
   )
   public static class335 field4803 = new class335(1);
   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "Liw;"
   )
   public static class335 field4804 = new class335(2);
   @OriginalMember(
      owner = "client!iw",
      name = "p",
      descriptor = "Liw;"
   )
   public static class335 field4805 = new class335(4);
   @OriginalMember(
      owner = "client!iw",
      name = "i",
      descriptor = "Liw;"
   )
   public static class335 field4806 = new class335(2);
   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "Liw;"
   )
   public static class335 field4807 = new class335(4);
   @OriginalMember(
      owner = "client!iw",
      name = "k",
      descriptor = "Ldia;"
   )
   public static class245 field4808 = new class245(64);
   @OriginalMember(
      owner = "client!iw",
      name = "m",
      descriptor = "I"
   )
   public static int field4795;
   @OriginalMember(
      owner = "client!iw",
      name = "n",
      descriptor = "I"
   )
   public static int field4796;
   @OriginalMember(
      owner = "client!iw",
      name = "j",
      descriptor = "I"
   )
   public static int field4798;
   @OriginalMember(
      owner = "client!iw",
      name = "o",
      descriptor = "I"
   )
   public static int field4799;
   @OriginalMember(
      owner = "client!iw",
      name = "h",
      descriptor = "I"
   )
   public static int field4800;
   @OriginalMember(
      owner = "client!iw",
      name = "l",
      descriptor = "Lhh;"
   )
   public static class139 field4810;
   @OriginalMember(
      owner = "client!iw",
      name = "g",
      descriptor = "Lqh;"
   )
   public static class74 field4809;

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2658(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4800;
         class446 var5 = class635.method4607(124, (long)arg4, 10);
         if (arg2 != -8576) {
            method2661(false, (class404)null);
         }

         var5.method3311(true);
         var5.field6167 = arg3;
         var5.field6175 = arg0;
         var5.field6177 = arg1;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4811[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2659(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4799;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4811[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class335(int arg0) {
      try {
         this.field4797 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4811[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method2660(int arg0, boolean arg1, int arg2) {
      try {
         ++field4795;
         if (!arg1) {
            field4801 = null;
         }

         return class599.method4366(arg0, 50, arg2) & (~(8192 & arg2) != -1 | class222.method1690(112, arg0, arg2) | class56.method431(-26347, arg2, arg0));
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4811[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ZLaha;)V"
   )
   public static final void method2661(boolean arg0, class404 arg1) {
      try {
         ++field4796;
         if (!arg0) {
            method2661(true, (class404)null);
         }

         class775 var2 = (class775)class128.field1610.method1839(-125, (long)arg1.field7843);
         if (var2 != null) {
            var2.method5560((byte)102);
         } else {
            class30.method245(arg1.field7855[0], (class774)null, arg1.field1001, arg1, 0, arg1.field7853[0], (class680)null, true);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4811[2] + arg0 + ',' + (arg1 != null ? field4811[3] : field4811[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2662(int arg0) {
      try {
         int var1 = -112 % ((27 - arg0) / 51);
         field4805 = null;
         field4809 = null;
         field4802 = null;
         field4810 = null;
         field4804 = null;
         field4803 = null;
         field4801 = null;
         field4806 = null;
         field4808 = null;
         field4807 = null;
         field4794 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4811[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2663(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2664(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
