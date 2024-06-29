import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class611 {
   @OriginalMember(
      owner = "client!sga",
      name = "c",
      descriptor = "I"
   )
   private static int field9010 = 0;
   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "Z"
   )
   private static boolean field9009 = false;
   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "Lrca;"
   )
   private static class37 field9011 = new class37();

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(I)V"
   )
   public static final synchronized void method4506(int arg0) {
      while(true) {
         class343 var1 = (class343)field9011.method281(true);
         if (var1 == null) {
            if (arg0 < 28) {
               field9011 = null;
               return;
            }

            return;
         }

         var1.field4714.method477(true);
         var1.method4924(-2970);
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(B)V"
   )
   public static final synchronized void method4507(byte arg0) {
      ++field9010;
      if (arg0 != 35) {
         method4510(92);
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final synchronized void method4508(boolean arg0, int arg1) {
      field9009 = arg0;
      if (arg1 != -1) {
         method4509(-81, (class787)null);
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(ILe;)V"
   )
   public static final synchronized void method4509(int arg0, class787 arg1) {
      if (!field9009) {
         if (arg0 == -7155) {
            if (~field9010 >= -1) {
               arg1.method477(false);
            } else {
               class343 var2 = new class343();
               var2.field4714 = arg1;
               field9011.method279(false, var2);
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(I)V"
   )
   public static final synchronized void method4510(int arg0) {
      --field9010;
      if (arg0 != -31081) {
         method4506(-77);
      }

      if (~field9010 == -1) {
         method4506(39);
      }
   }
}
