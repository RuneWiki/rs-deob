import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class68 {
   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field912 = new String[]{method675(method674("\nME\u001d\\([\u0019\u0000]\u001c\u0007")), method675(method674("\nME(\u001b")), method675(method674("\nME+\u001b"))};
   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "Lkb;"
   )
   public static class500 field910 = new class500(method675(method674("\u001cN\u0006\f\u0007")), method675(method674("<N\u0006\f\u0013O")), 3);
   @OriginalMember(
      owner = "client!qb",
      name = "d",
      descriptor = "I"
   )
   public static int field908;
   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "I"
   )
   public static int field909;
   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "I"
   )
   public static int field911;

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method672(int arg0) {
      try {
         if (arg0 > 72) {
            field910 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field912[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method673(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field911;
         if (arg0 >= -101) {
            method673((byte)-24);
         }

         if (class532.field7802) {
            do {
               while(~class76.field1007 > ~class426.field5795.length) {
                  class111 var2 = class426.field5795[class76.field1007];
                  if (var2 == null || ~var2.field1483 != 0) {
                     ++class76.field1007;
                     if (!var1) {
                        continue;
                     }
                  }

                  if (class281.field3683 == null) {
                     class281.field3683 = class5.field70.method2753((byte)118, var2.field1485);
                  }

                  int var3 = class281.field3683.field9915;
                  if (var3 == -1) {
                     return;
                  }

                  var2.field1483 = var3;
                  ++class76.field1007;
                  class281.field3683 = null;
               }
            } while(var1);

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field912[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field909;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field912[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method674(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method675(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
