import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class555 extends class297 {
   @OriginalMember(
      owner = "client!ra",
      name = "y",
      descriptor = "Z"
   )
   public volatile boolean field8287 = true;
   @OriginalMember(
      owner = "client!ra",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8293 = new String[]{method4213(method4212("Vs58c")), method4213(method4212("Vs59c"))};
   @OriginalMember(
      owner = "client!ra",
      name = "u",
      descriptor = "Lnaa;"
   )
   public static class113 field8289 = new class113(64, -1);
   @OriginalMember(
      owner = "client!ra",
      name = "x",
      descriptor = "Lsn;"
   )
   public static class675 field8292 = new class675();
   @OriginalMember(
      owner = "client!ra",
      name = "w",
      descriptor = "I"
   )
   public static int field8285;
   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "I"
   )
   public static int field8291;
   @OriginalMember(
      owner = "client!ra",
      name = "B",
      descriptor = "J"
   )
   public static long field8286;
   @OriginalMember(
      owner = "client!ra",
      name = "v",
      descriptor = "Z"
   )
   public boolean field8288;
   @OriginalMember(
      owner = "client!ra",
      name = "A",
      descriptor = "Z"
   )
   public boolean field8290;

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(IIIIIIIIIZII)V",
      line = 6
   )
   public static final void method4210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
      try {
         ++field8285;
         if (client.method1170(arg11, (byte)-119)) {
            if (arg9) {
               field8291 = -119;
            }

            if (class505.field7743[arg11] != null) {
               client.method1172(class505.field7743[arg11], -1, arg1, arg5, arg8, arg6, arg4, arg10, arg3, arg2, arg7, arg0);
            } else {
               client.method1172(class296.field4672[arg11], -1, arg1, arg5, arg8, arg6, arg4, arg10, arg3, arg2, arg7, arg0);
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field8293[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "c",
      descriptor = "(I)V",
      line = 27
   )
   public static void method4211(int arg0) {
      try {
         field8289 = null;
         if (arg0 != -1) {
            field8292 = null;
         }

         field8292 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8293[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "(Z)I"
   )
   public abstract int method2754(boolean arg0);

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Z)[B"
   )
   public abstract byte[] method2755(boolean arg0);

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4212(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4213(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
