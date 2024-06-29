import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class266 {
   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field4343;
   @OriginalMember(
      owner = "client!ap",
      name = "f",
      descriptor = "J"
   )
   public long field4346;
   @OriginalMember(
      owner = "client!ap",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field4345;
   @OriginalMember(
      owner = "client!ap",
      name = "g",
      descriptor = "I"
   )
   public int field4347;
   @OriginalMember(
      owner = "client!ap",
      name = "e",
      descriptor = "I"
   )
   public int field4341;
   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4348 = new String[]{method2295(method2294("tj\\+X")), method2295(method2294("{o\u001e\u0006")), method2295(method2294("tj\\V\u0019{s\u0006TX")), method2295(method2294("n4\\D\r"))};
   @OriginalMember(
      owner = "client!ap",
      name = "b",
      descriptor = "I"
   )
   public static int field4342;
   @OriginalMember(
      owner = "client!ap",
      name = "d",
      descriptor = "I"
   )
   public static int field4344;

   @OriginalMember(
      owner = "client!ap",
      name = "a",
      descriptor = "(IB)V",
      line = 11
   )
   public static final void method2293(int arg0, byte arg1) {
      try {
         label20: {
            if (class326.field4957 == 0) {
               class259.field4270.method766(arg0, arg1 ^ 64);
               if (!client.field1786) {
                  break label20;
               }
            }

            class61.field788 = arg0;
         }

         ++field4342;
         if (arg1 != -65) {
            method2293(-126, (byte)-47);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4348[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "<init>",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V",
      line = 28
   )
   public class266(int arg0, String arg1, int arg2, String arg3, long arg4) {
      try {
         this.field4343 = arg3;
         this.field4346 = arg4;
         this.field4345 = arg1;
         this.field4347 = arg0;
         this.field4341 = arg2;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4348[2] + arg0 + ',' + (arg1 != null ? field4348[3] : field4348[1]) + ',' + arg2 + ',' + (arg3 != null ? field4348[3] : field4348[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2294(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ap",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2295(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
