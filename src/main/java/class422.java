import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class422 {
   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "Z"
   )
   private static boolean field6136 = false;
   @OriginalMember(
      owner = "client!br",
      name = "c",
      descriptor = "I"
   )
   private static int field6138 = 0;
   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "Lsb;"
   )
   private static class261 field6137 = new class261();

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(I)V"
   )
   public static final synchronized void method3287(int arg0) {
      int var1 = 105 % ((arg0 - 11) / 39);

      while(true) {
         class554 var2 = (class554)field6137.method2235(-46);
         if (var2 == null) {
            return;
         }

         var2.field7887.method633(true);
         var2.method2140((byte)71);
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "(B)V"
   )
   public static final synchronized void method3288(byte arg0) {
      ++field6138;
      if (arg0 <= 95) {
         method3290(false, (byte)21);
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(BLe;)V"
   )
   public static final synchronized void method3289(byte arg0, class64 arg1) {
      if (!field6136) {
         if (field6138 <= 0) {
            arg1.method633(false);
         } else {
            class554 var2 = new class554();
            var2.field7887 = arg1;
            field6137.method2238(var2, 13);
         }

         if (arg0 != -31) {
            method3291((byte)33);
         }
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(ZB)V"
   )
   public static final synchronized void method3290(boolean arg0, byte arg1) {
      field6136 = arg0;
      if (arg1 != -63) {
         method3290(false, (byte)-114);
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(B)V"
   )
   public static final synchronized void method3291(byte arg0) {
      --field6138;
      if (arg0 > -44) {
         field6137 = null;
      }

      if (field6138 == 0) {
         method3287(-68);
      }
   }
}
