import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class291 {
   @OriginalMember(
      owner = "client!rw",
      name = "m",
      descriptor = "I"
   )
   public int field4591;
   @OriginalMember(
      owner = "client!rw",
      name = "c",
      descriptor = "B"
   )
   public byte field4590;
   @OriginalMember(
      owner = "client!rw",
      name = "f",
      descriptor = "S"
   )
   public short field4587;
   @OriginalMember(
      owner = "client!rw",
      name = "k",
      descriptor = "I"
   )
   public int field4593;
   @OriginalMember(
      owner = "client!rw",
      name = "i",
      descriptor = "I"
   )
   public int field4586;
   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "Z"
   )
   public boolean field4585;
   @OriginalMember(
      owner = "client!rw",
      name = "d",
      descriptor = "I"
   )
   public int field4594;
   @OriginalMember(
      owner = "client!rw",
      name = "j",
      descriptor = "I"
   )
   public int field4592;
   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "S"
   )
   public short field4588;
   @OriginalMember(
      owner = "client!rw",
      name = "h",
      descriptor = "S"
   )
   public short field4584;
   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4595 = new String[]{method2456(method2455("n!gC\u0017r?=AV")), method2456(method2455("n!g>V")), method2456(method2455("n!g=V"))};
   @OriginalMember(
      owner = "client!rw",
      name = "g",
      descriptor = "Luk;"
   )
   public static class498 field4582 = new class498(65, 7);
   @OriginalMember(
      owner = "client!rw",
      name = "e",
      descriptor = "I"
   )
   public static int field4583;
   @OriginalMember(
      owner = "client!rw",
      name = "l",
      descriptor = "Ljq;"
   )
   public static class672 field4589;

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2453(int arg0) {
      try {
         field4589 = null;
         field4582 = null;
         if (arg0 != 0) {
            method2453(-123);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4595[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(ZBI)Lfk;"
   )
   public static final class503 method2454(boolean arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -26) {
            return null;
         } else {
            ++field4583;
            long var3 = (long)(arg2 | (arg0 ? Integer.MIN_VALUE : 0));
            return (class503)class263.field4321.method3141(var3, true);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4595[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field4591 = arg1;
         this.field4590 = (byte)arg8;
         this.field4587 = (short)arg4;
         this.field4593 = arg0;
         this.field4586 = arg3;
         this.field4585 = arg10;
         this.field4594 = arg11;
         this.field4592 = arg2;
         this.field4588 = (short)arg6;
         this.field4584 = (short)arg5;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4595[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2455(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2456(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
