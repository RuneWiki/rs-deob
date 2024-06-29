import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class299 extends class500 {
   @OriginalMember(
      owner = "client!sm",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public String field3951;
   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3958 = new String[]{method2256(method2255("-\u001a:6T")), method2256(method2255("-\u001a:7T")), method2256(method2255("-\u001a:H\u00150\u001e`JT")), method2256(method2255("0\u0002x\u0018")), method2256(method2255("%Y:Z\u0001")), method2256(method2255("-\u001a:5T"))};
   @OriginalMember(
      owner = "client!sm",
      name = "n",
      descriptor = "I"
   )
   public static int field3955 = -1;
   @OriginalMember(
      owner = "client!sm",
      name = "l",
      descriptor = "Lgka;"
   )
   public static class394 field3953 = new class394("", 10);
   @OriginalMember(
      owner = "client!sm",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field3956 = true;
   @OriginalMember(
      owner = "client!sm",
      name = "o",
      descriptor = "I"
   )
   public static int field3952;
   @OriginalMember(
      owner = "client!sm",
      name = "j",
      descriptor = "I"
   )
   public static int field3954;
   @OriginalMember(
      owner = "client!sm",
      name = "m",
      descriptor = "I"
   )
   public static int field3957;

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2252(int arg0) {
      try {
         ++field3952;
         if (class172.field2150 != null) {
            class172.field2150.method559(-10565);
            class600.field8370 = null;
            class172.field2150 = null;
         }

         if (arg0 != -2386) {
            method2253(-50, false, 51);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3958[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(IZI)V"
   )
   public static final void method2253(int arg0, boolean arg1, int arg2) {
      try {
         class226.field2841 = -class618.field8644 + arg2;
         class575.field7911 = -class618.field8627 + arg0;
         if (!arg1) {
            method2252(-12);
         }

         ++field3954;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3958[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2254(int arg0) {
      try {
         if (arg0 != -1) {
            field3955 = -123;
         }

         field3953 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3958[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "<init>",
      descriptor = "()V"
   )
   public class299() {
   }

   @OriginalMember(
      owner = "client!sm",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class299(String arg0, int arg1) {
      try {
         this.field3951 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3958[2] + (arg0 != null ? field3958[4] : field3958[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2255(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2256(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
