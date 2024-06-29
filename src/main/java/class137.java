import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class137 extends class775 {
   @OriginalMember(
      owner = "client!haa",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2004 = new String[]{method1273(method1272("i'2st)")), method1273(method1272("i'2sr)")), method1273(method1272("o3?1")), method1273(method1272("i'2su)")), method1273(method1272("zh}sK")), method1273(method1272("i'2sw)"))};
   @OriginalMember(
      owner = "client!haa",
      name = "A",
      descriptor = "Luk;"
   )
   public static class498 field1998 = new class498(134, 6);
   @OriginalMember(
      owner = "client!haa",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field2001 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @OriginalMember(
      owner = "client!haa",
      name = "u",
      descriptor = "I"
   )
   private int field1996;
   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "I"
   )
   public static int field1997;
   @OriginalMember(
      owner = "client!haa",
      name = "x",
      descriptor = "I"
   )
   public static int field1999;
   @OriginalMember(
      owner = "client!haa",
      name = "v",
      descriptor = "I"
   )
   public static int field2002;
   @OriginalMember(
      owner = "client!haa",
      name = "t",
      descriptor = "I"
   )
   private int field2003;
   @OriginalMember(
      owner = "client!haa",
      name = "y",
      descriptor = "Lrr;"
   )
   public static class678 field2000;

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         ++field1999;
         this.field1996 = arg0.method2894(118);
         int var3 = -114 % ((-84 - arg1) / 34);
         this.field2003 = arg0.method2894(110);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2004[3] + (arg0 != null ? field2004[4] : field2004[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(JI)I"
   )
   public static final int method1270(long arg0, int arg1) {
      try {
         if (arg1 != 8) {
            return 75;
         } else {
            class552.method4193(27444, arg0);
            ++field2002;
            return class406.field6327.get(1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2004[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1271(int arg0) {
      try {
         if (arg0 != 765) {
            method1270(3L, 111);
         }

         field2000 = null;
         field2001 = null;
         field1998 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2004[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(Lsda;I)V"
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         ++field1997;
         arg0.method1928(this.field1996, 4, this.field2003);
         int var3 = 0 % ((arg1 - -23) / 45);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2004[5] + (arg0 != null ? field2004[4] : field2004[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
