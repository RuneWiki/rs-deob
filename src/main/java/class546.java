import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class546 extends class297 {
   @OriginalMember(
      owner = "client!tda",
      name = "g",
      descriptor = "[Len;"
   )
   public class446[] field7777;
   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7782 = new String[]{method4095(method4094("\u001fL\u00016\u0015C")), method4095(method4094("\u001fL\u00016\u0014C")), method4095(method4094("\u0005]\ft")), method4095(method4094("\u0010\u0006N6*")), method4095(method4094("\u001fL\u00016k\u0002F\tliC"))};
   @OriginalMember(
      owner = "client!tda",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field7778 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!tda",
      name = "i",
      descriptor = "I"
   )
   public static int field7779;
   @OriginalMember(
      owner = "client!tda",
      name = "f",
      descriptor = "I"
   )
   public static int field7780;
   @OriginalMember(
      owner = "client!tda",
      name = "e",
      descriptor = "I"
   )
   public static int field7781;

   @OriginalMember(
      owner = "client!tda",
      name = "<init>",
      descriptor = "([Len;)V"
   )
   public class546(class446[] arg0) {
      try {
         this.field7777 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7782[4] + (arg0 != null ? field7782[3] : field7782[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4092(int arg0) {
      try {
         if (arg0 != 2) {
            method4092(-77);
         }

         field7778 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7782[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4093(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4094(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4095(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
