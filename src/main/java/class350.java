import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class350 {
   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "Z"
   )
   private static boolean field4970 = false;
   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "I"
   )
   private static int field4971 = 0;
   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "Liw;"
   )
   private static class332 field4972 = new class332();

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(B)V"
   )
   public static final synchronized void method2700(byte arg0) {
      if (arg0 <= 26) {
         method2700((byte)-102);
      }

      ++field4971;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "(B)V"
   )
   public static final synchronized void method2701(byte arg0) {
      if (arg0 != 28) {
         method2700((byte)107);
      }

      while(true) {
         class199 var1 = (class199)field4972.method2577(true);
         if (var1 == null) {
            return;
         }

         var1.field2989.method139(true);
         var1.method154(52);
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BLe;)V"
   )
   public static final synchronized void method2702(byte arg0, class556 arg1) {
      int var2 = -61 % ((29 - arg0) / 63);
      if (!field4970) {
         if (~field4971 >= -1) {
            arg1.method139(false);
         } else {
            class199 var3 = new class199();
            var3.field2989 = arg1;
            field4972.method2585(var3, 106);
         }
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "(B)V"
   )
   public static final synchronized void method2703(byte arg0) {
      --field4971;
      if (arg0 != -7) {
         field4971 = -60;
      }

      if (field4971 == 0) {
         method2701((byte)28);
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final synchronized void method2704(boolean arg0, int arg1) {
      field4970 = arg0;
      if (arg1 >= -119) {
         field4971 = 1;
      }
   }
}
