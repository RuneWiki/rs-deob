import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class576 {
   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8142 = new String[]{method4265(method4264("'\u0006\u0012j\u0012b")), method4265(method4264("'\u0006\u0012j\u0011b"))};
   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field8139 = new int[16];
   @OriginalMember(
      owner = "client!mca",
      name = "c",
      descriptor = "I"
   )
   public static int field8138;
   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "I"
   )
   public static int field8140;
   @OriginalMember(
      owner = "client!mca",
      name = "d",
      descriptor = "I"
   )
   public static int field8141;

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4262(byte arg0) {
      try {
         if (arg0 >= -1) {
            method4263(74);
         }

         field8139 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8142[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4263(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4264(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4265(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
