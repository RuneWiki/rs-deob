import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class206 {
   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "Z"
   )
   private static boolean field2641 = false;
   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "I"
   )
   private static int field2643 = 0;
   @OriginalMember(
      owner = "client!vb",
      name = "c",
      descriptor = "Lum;"
   )
   private static class550 field2642 = new class550();

   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "(Z)V",
      line = 5
   )
   public static final synchronized void method1574(boolean arg0) {
      if (!arg0) {
         field2643 = 65;
      }

      ++field2643;
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(I)V",
      line = 15
   )
   public static final synchronized void method1575(int arg0) {
      if (arg0 != -21484) {
         method1577(true, true);
      }

      --field2643;
      if (~field2643 == -1) {
         method1576(false);
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(Z)V",
      line = 31
   )
   public static final synchronized void method1576(boolean arg0) {
      while(true) {
         class363 var1 = (class363)field2642.method4063(-5);
         if (var1 == null) {
            if (arg0) {
               field2642 = null;
               return;
            }

            return;
         }

         var1.field5460.method134(true);
         var1.method2720(0);
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(ZZ)V",
      line = 52
   )
   public static final synchronized void method1577(boolean arg0, boolean arg1) {
      field2641 = arg1;
      if (arg0) {
         method1575(-117);
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(ILe;)V",
      line = 65
   )
   public static final synchronized void method1578(int arg0, class558 arg1) {
      if (!field2641) {
         if (field2643 > arg0) {
            class363 var2 = new class363();
            var2.field5460 = arg1;
            field2642.method4060(23, var2);
         } else {
            arg1.method134(false);
         }
      }
   }
}
