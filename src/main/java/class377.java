import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public abstract class class377 {
   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5714 = new String[]{method2921(method2920("<\u001drN\u000e")), method2921(method2920("<\u001drP\u000e")), method2921(method2920("<\u001drQ\u000e")), method2921(method2920("<\u001drO\u000e"))};
   @OriginalMember(
      owner = "client!oq",
      name = "e",
      descriptor = "I"
   )
   public static int field5709;
   @OriginalMember(
      owner = "client!oq",
      name = "d",
      descriptor = "I"
   )
   public static int field5710;
   @OriginalMember(
      owner = "client!oq",
      name = "b",
      descriptor = "I"
   )
   public static int field5712;
   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5713;
   @OriginalMember(
      owner = "client!oq",
      name = "c",
      descriptor = "[Ls;"
   )
   public static class293[] field5711;

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(I)Laaa;"
   )
   public abstract class642 method2912(int arg0);

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2913(byte arg0) {
      try {
         field5711 = null;
         if (arg0 > -17) {
            method2918(false, false, -86, 0, 2, -54, -18);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5714[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(BI)[B"
   )
   public abstract byte[] method2914(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2915(int arg0, int arg1) {
      try {
         if (arg0 != 18266) {
            field5713 = false;
         }

         ++field5712;
         class403 var2 = class453.method3410((long)arg1, true, 14);
         var2.method3096((byte)90);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5714[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method2916(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oq",
      name = "b",
      descriptor = "(IB)I"
   )
   public abstract int method2917(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(ZZIIIII)V"
   )
   public static final void method2918(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method2919(int arg0, byte arg1) {
      try {
         if (arg1 != -16) {
            field5711 = null;
         }

         ++field5709;
         class63.field782 = 1000000000L / (long)arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5714[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2920(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2921(char[] arg0) {
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
            var10005 = 108;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
