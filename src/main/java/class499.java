import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class499 {
   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "I"
   )
   private static int field7241 = 0;
   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "Z"
   )
   private static boolean field7242 = false;
   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "Lll;"
   )
   private static class387 field7240 = new class387();

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Le;I)V",
      line = 3
   )
   public static final synchronized void method3617(class560 arg0, int arg1) {
      if (!field7242) {
         if (arg1 >= field7241) {
            arg0.method113(false);
         } else {
            class633 var2 = new class633();
            var2.field9257 = arg0;
            field7240.method2930((byte)-101, var2);
         }
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(I)V",
      line = 27
   )
   public static final synchronized void method3618(int arg0) {
      --field7241;
      if (field7241 == arg0) {
         method3619(-14705);
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "(I)V",
      line = 39
   )
   public static final synchronized void method3619(int arg0) {
      while(true) {
         class633 var1 = (class633)field7240.method2941(-14002);
         if (var1 == null) {
            if (arg0 != -14705) {
               method3619(-62);
               return;
            }

            return;
         }

         var1.field9257.method113(true);
         var1.method3165(109);
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(BZ)V",
      line = 63
   )
   public static final synchronized void method3620(byte arg0, boolean arg1) {
      field7242 = arg1;
      int var2 = -55 % ((arg0 - -48) / 52);
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(B)V",
      line = 75
   )
   public static final synchronized void method3621(byte arg0) {
      if (arg0 <= 20) {
         field7240 = null;
      }

      ++field7241;
   }
}
