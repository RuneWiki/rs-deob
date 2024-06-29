import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class118 {
   @OriginalMember(
      owner = "client!eg",
      name = "b",
      descriptor = "I"
   )
   private int field1470;
   @OriginalMember(
      owner = "client!eg",
      name = "f",
      descriptor = "I"
   )
   public int field1473;
   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1475 = new String[]{method947(method946("vNb\u001c>")), method947(method946("vNb*y@]>7xt\u0001")), method947(method946("vNbb\u007f}@8`>")), method947(method946("vNb\u001f>"))};
   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "Ljava/util/zip/CRC32;"
   )
   public static CRC32 field1472 = new CRC32();
   @OriginalMember(
      owner = "client!eg",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field1474 = new int[1];
   @OriginalMember(
      owner = "client!eg",
      name = "c",
      descriptor = "I"
   )
   public static int field1469;
   @OriginalMember(
      owner = "client!eg",
      name = "e",
      descriptor = "I"
   )
   public static int field1471;

   @OriginalMember(
      owner = "client!eg",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 7
   )
   public final String toString() {
      try {
         ++field1471;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1475[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "b",
      descriptor = "(I)I",
      line = 17
   )
   public final int method944(int arg0) {
      try {
         ++field1469;
         if (arg0 != -7851) {
            this.toString();
         }

         return this.field1470;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1475[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public static void method945(int arg0) {
      try {
         field1472 = null;
         if (arg0 != 1) {
            method945(-5);
         }

         field1474 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1475[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "<init>",
      descriptor = "(II)V",
      line = 40
   )
   public class118(int arg0, int arg1) {
      try {
         this.field1470 = arg0;
         this.field1473 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1475[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method946(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method947(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
