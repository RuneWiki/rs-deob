import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class613 {
   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "I"
   )
   private static int field8914 = 0;
   @OriginalMember(
      owner = "client!wea",
      name = "c",
      descriptor = "Z"
   )
   private static boolean field8915 = false;
   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "Lsn;"
   )
   private static class675 field8913 = new class675();

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final synchronized void method4515(boolean arg0, boolean arg1) {
      field8915 = arg1;
      if (arg0) {
         method4515(true, true);
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "(B)V"
   )
   public static final synchronized void method4516(byte arg0) {
      --field8914;
      if (arg0 < 81) {
         method4516((byte)-83);
      }

      if (field8914 == 0) {
         method4517((byte)-107);
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final synchronized void method4517(byte arg0) {
      if (arg0 == -107) {
         while(true) {
            class526 var1 = (class526)field8913.method4974(~arg0);
            if (var1 == null) {
               return;
            }

            var1.field8009.method625(true);
            var1.method2477(arg0 ^ -2003);
         }
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(Le;I)V"
   )
   public static final synchronized void method4518(class245 arg0, int arg1) {
      if (!field8915) {
         if (arg1 <= ~field8914) {
            arg0.method625(false);
         } else {
            class526 var2 = new class526();
            var2.field8009 = arg0;
            field8913.method4980(var2, 0);
         }
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(I)V"
   )
   public static final synchronized void method4519(int arg0) {
      ++field8914;
      if (arg0 < 21) {
         field8914 = 82;
      }
   }
}
