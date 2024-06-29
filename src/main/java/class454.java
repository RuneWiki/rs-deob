import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class454 {
   @OriginalMember(
      owner = "client!rba",
      name = "e",
      descriptor = "J"
   )
   public long field6633;
   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "[S"
   )
   public short[] field6637;
   @OriginalMember(
      owner = "client!rba",
      name = "c",
      descriptor = "[S"
   )
   public short[] field6634;
   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "[I"
   )
   public int[] field6635;
   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6638 = new String[]{method3418(method3417("\f7'\u001fcV")), method3418(method3417("\u0005{h\u001f_")), method3418(method3417("\f7'\u001f\u001e\u0017;/E\u001cV")), method3418(method3417("\u0010 *]"))};
   @OriginalMember(
      owner = "client!rba",
      name = "f",
      descriptor = "I"
   )
   public static int field6632;
   @OriginalMember(
      owner = "client!rba",
      name = "d",
      descriptor = "I"
   )
   public static int field6636;

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static final void method3416(int arg0) {
      try {
         class216.field3273 = null;
         class678.field9949 = null;
         class296.field4151 = null;
         class756.field10970 = null;
         class150.field2414 = null;
         class90.field1477 = null;
         if (arg0 <= 64) {
            method3416(-37);
         }

         class234.field3413 = null;
         class36.field885 = null;
         class118.field1931 = null;
         class193.field2920 = null;
         class601.field8679 = null;
         class259.field3671 = null;
         class497.field7269 = null;
         class426.field6175 = null;
         class163.field2586 = null;
         class448.field6547 = null;
         class345.field4917 = null;
         class157.field2515 = null;
         ++field6636;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6638[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "<init>",
      descriptor = "(J[I[S[S)V",
      line = 36
   )
   public class454(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field6633 = arg0;
         this.field6637 = arg2;
         this.field6634 = arg3;
         this.field6635 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6638[2] + arg0 + ',' + (arg1 != null ? field6638[1] : field6638[3]) + ',' + (arg2 != null ? field6638[1] : field6638[3]) + ',' + (arg3 != null ? field6638[1] : field6638[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "<init>",
      descriptor = "()V",
      line = 46
   )
   protected class454() {
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3417(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3418(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
