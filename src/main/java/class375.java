import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class375 {
   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5274 = method2905(method2904("\t\u001c\t<\u0002"));
   @OriginalMember(
      owner = "client!km",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field5271 = new class378(79, 0);
   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "B"
   )
   public static byte field5273;
   @OriginalMember(
      owner = "client!km",
      name = "c",
      descriptor = "Ld;"
   )
   public static class160 field5272;

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2902(int arg0) {
      try {
         field5272 = null;
         if (arg0 != 0) {
            field5272 = null;
         }

         field5271 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5274 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(Lu;ZZ)V"
   )
   public static final void method2903(class80 arg0, boolean arg1, boolean arg2) {
      arg0.field1008 = arg2;
      if (class100.field1284) {
         if (arg1) {
            class305.field4051[class305.field4051.length - 1].method5425((byte)-72, arg0);
         } else {
            int var3 = class340.method2695(arg0.field1006);
            int var4 = class600.field8378[2] * arg0.method773(-1) / arg0.field993;
            int var5 = class340.method2695(arg0.field1006 - var4);
            int var6 = class340.method2695(arg0.field1006 + var4);
            if (var5 == var6) {
               class305.field4051[var3].method5425((byte)75, arg0);
            } else if (var6 - var5 == 1) {
               class305.field4051[class756.field10968 + var5].method5425((byte)-118, arg0);
            } else {
               class305.field4051[class305.field4051.length - 1].method5425((byte)-91, arg0);
            }
         }
      } else {
         class349.method2756(arg0, class490.field6751);
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2904(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2905(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
