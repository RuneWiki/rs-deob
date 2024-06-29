import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class323 {
   @OriginalMember(
      owner = "client!pq",
      name = "j",
      descriptor = "S"
   )
   public short field4811;
   @OriginalMember(
      owner = "client!pq",
      name = "i",
      descriptor = "S"
   )
   public short field4816;
   @OriginalMember(
      owner = "client!pq",
      name = "d",
      descriptor = "B"
   )
   public byte field4815;
   @OriginalMember(
      owner = "client!pq",
      name = "h",
      descriptor = "Z"
   )
   public boolean field4812;
   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "I"
   )
   public int field4813;
   @OriginalMember(
      owner = "client!pq",
      name = "f",
      descriptor = "I"
   )
   public int field4809;
   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "S"
   )
   public short field4817;
   @OriginalMember(
      owner = "client!pq",
      name = "g",
      descriptor = "B"
   )
   public byte field4814;
   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4818 = new String[]{method2603(method2602(";yG\"W")), method2603(method2602(";yG_\u0016%a\u001d]W"))};
   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "Lhf;"
   )
   public static class198 field4808 = new class198("", 13);
   @OriginalMember(
      owner = "client!pq",
      name = "e",
      descriptor = "I"
   )
   public static int field4810;

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2601(byte arg0) {
      try {
         if (arg0 >= -58) {
            method2601((byte)-100);
         }

         field4808 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4818[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "<init>",
      descriptor = "(IIIIIIIIIZI)V"
   )
   public class323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      try {
         this.field4811 = (short)arg6;
         this.field4816 = (short)arg4;
         this.field4815 = (byte)arg7;
         this.field4812 = arg9;
         this.field4813 = arg10;
         this.field4809 = arg0;
         this.field4817 = (short)arg5;
         this.field4814 = (byte)arg8;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field4818[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2602(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2603(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
