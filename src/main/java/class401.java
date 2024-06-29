import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class401 {
   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6290 = new String[]{method3242(method3241("C\u0007C}\u0015")), method3242(method3241("V\\\u0001?")), method3242(method3241("SOC\u0012*\u0010")), method3242(method3241("SOC\u0004)\u0010"))};
   @OriginalMember(
      owner = "client!kf",
      name = "c",
      descriptor = "Lhka;"
   )
   public static class377 field6287 = new class377(9, 7);
   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "I"
   )
   public static int field6286;
   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "I"
   )
   public static int field6288;
   @OriginalMember(
      owner = "client!kf",
      name = "d",
      descriptor = "Loo;"
   )
   public static class508 field6289;

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(Lkf;)V"
   )
   public abstract void method1549(class401 arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1555(int arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(III[I)V"
   )
   public abstract void method1553(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "(III[I)V"
   )
   public abstract void method1545(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "()Lkf;"
   )
   public abstract class401 method1548();

   @OriginalMember(
      owner = "client!kf",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method1547(int arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method1554(int arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(IIIIIILfr;BIIII)Z"
   )
   public static final boolean method3239(int param0, int param1, int param2, int param3, int param4, int param5, class482 param6, byte param7, int param8, int param9, int param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kf",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method1560(int arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "c",
      descriptor = "(III[I)V"
   )
   public abstract void method1550(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method1541(int[] arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "()V"
   )
   public abstract void method1551();

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "(III)V"
   )
   public abstract void method1546(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!kf",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method1552(int arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1542(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3240(int arg0) {
      try {
         field6289 = null;
         if (arg0 != 1) {
            method3239(-75, -123, -116, 66, -30, -33, (class482)null, (byte)-100, 88, -80, -36, 87);
         }

         field6287 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6290[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method1540(int arg0);

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3241(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3242(char[] arg0) {
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
            var10005 = 41;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
