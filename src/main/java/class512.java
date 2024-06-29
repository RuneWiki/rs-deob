import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class512 extends class629 {
   @OriginalMember(
      owner = "client!kp",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7479 = new String[]{method3877(method3876("&a5S6")), method3877(method3876("&a5T6")), method3877(method3876("&a5P6"))};
   @OriginalMember(
      owner = "client!kp",
      name = "D",
      descriptor = "I"
   )
   public static int field7476;
   @OriginalMember(
      owner = "client!kp",
      name = "E",
      descriptor = "I"
   )
   public static int field7477;
   @OriginalMember(
      owner = "client!kp",
      name = "F",
      descriptor = "I"
   )
   public static int field7478;

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         int var11 = arg1 + 1;
         class18.method132(false, arg2, arg4, arg3, class448.field6542[arg1]);
         ++field7477;
         int var12 = arg5 - 1;
         class18.method132(false, arg2, arg4, arg3, class448.field6542[arg5]);
         int var6 = var11;
         if (arg0 == 12) {
            while(var12 >= var6) {
               int[] var7 = class448.field6542[var6];
               var7[arg2] = var7[arg4] = arg3;
               ++var6;
            }

         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field7479[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "<init>",
      descriptor = "()V"
   )
   public class512() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!kp",
      name = "c",
      descriptor = "(III)V"
   )
   public static final void method3875(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == -12099) {
            ++field7478;
            class536 var3 = class108.method1038((long)arg2, 118, 12);
            var3.method4017(24076);
            var3.field7800 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7479[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      try {
         ++field7476;
         return arg1 != 2048 ? null : class429.field6201;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7479[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3876(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3877(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
