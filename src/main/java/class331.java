import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class331 {
   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4932 = new String[]{method2657(method2656("H`vF\u000f")), method2657(method2656("H`vD\u000f"))};
   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "I"
   )
   public static int field4930;
   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "I"
   )
   public static int field4931;

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)Lwb;"
   )
   public static final class578 method2653(int arg0, int arg1, int arg2, Class arg3) {
      class312 var4 = class324.field4826[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         for(class84 var5 = var4.field4678; var5 != null; var5 = var5.field1305) {
            class578 var6 = var5.field1299;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8154 == arg1 && var6.field8160 == arg2) {
               return var6;
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method2654(boolean arg0, int arg1) {
      try {
         class110.field1710.method323(class712.field10231.method176());
         ++field4931;
         int[] var2 = class712.field10231.method147();
         class573.field8109 = var2[0];
         class236.field3652 = var2[1];
         class616.field8761 = var2[3];
         class524.field7419 = var2[2];
         if (arg1 != 6257) {
            method2655((byte)120);
         }

         if (arg0) {
            class712.field10231.method256(class647.field9139, class511.field7255, class231.field3597, class333.field4942);
            class232.method2063(class500.field7127, (byte)-75);
         } else {
            class712.field10231.method256(class233.field3610, class79.field1253, class690.field9936, class394.field5743);
            class232.method2063(class497.field7091, (byte)-25);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4932[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2655(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2656(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2657(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
