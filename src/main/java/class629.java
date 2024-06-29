import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class629 {
   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "Z"
   )
   private static boolean field8820 = false;
   @OriginalMember(
      owner = "client!ai",
      name = "b",
      descriptor = "I"
   )
   private static int field8818 = 0;
   @OriginalMember(
      owner = "client!ai",
      name = "c",
      descriptor = "Lod;"
   )
   private static class536 field8819 = new class536();

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(I)V"
   )
   public static final synchronized void method4572(int arg0) {
      --field8818;
      if (~field8818 == -1) {
         method4573(true);
      }

      if (arg0 > -72) {
         field8820 = false;
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final synchronized void method4573(boolean arg0) {
      if (arg0) {
         while(true) {
            class765 var1 = (class765)field8819.method3869((byte)55);
            if (var1 == null) {
               return;
            }

            var1.field11044.method167(true);
            var1.method3609(85);
         }
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final synchronized void method4574(int arg0, boolean arg1) {
      if (arg0 != -1) {
         field8819 = null;
      }

      field8820 = arg1;
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(B)V"
   )
   public static final synchronized void method4575(byte arg0) {
      ++field8818;
      if (arg0 != 126) {
         field8819 = null;
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(ILe;)V"
   )
   public static final synchronized void method4576(int arg0, class562 arg1) {
      if (!field8820) {
         if (field8818 <= 0) {
            arg1.method167(false);
         } else {
            class765 var2 = new class765();
            var2.field11044 = arg1;
            field8819.method3859(2, var2);
         }

         if (arg0 < 5) {
            field8819 = null;
         }
      }
   }
}
