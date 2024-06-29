import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class497 extends class213 {
   @OriginalMember(
      owner = "client!vaa",
      name = "t",
      descriptor = "I"
   )
   private int field7204 = -1;
   @OriginalMember(
      owner = "client!vaa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7209 = new String[]{method3608(method3607("&+\u0005#")), method3608(method3607("3pGa:")), method3608(method3607(">?\ba\u0006`")), method3608(method3607(">?\ba\u0004`")), method3608(method3607(">?\ba\u0005`"))};
   @OriginalMember(
      owner = "client!vaa",
      name = "w",
      descriptor = "I"
   )
   public static int field7205 = -1;
   @OriginalMember(
      owner = "client!vaa",
      name = "u",
      descriptor = "Lek;"
   )
   public static class536 field7207 = new class536(27, 2);
   @OriginalMember(
      owner = "client!vaa",
      name = "A",
      descriptor = "F"
   )
   public static float field7200;
   @OriginalMember(
      owner = "client!vaa",
      name = "B",
      descriptor = "I"
   )
   public static int field7201;
   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "I"
   )
   private int field7202;
   @OriginalMember(
      owner = "client!vaa",
      name = "v",
      descriptor = "I"
   )
   private int field7203;
   @OriginalMember(
      owner = "client!vaa",
      name = "x",
      descriptor = "I"
   )
   public static int field7206;
   @OriginalMember(
      owner = "client!vaa",
      name = "y",
      descriptor = "I"
   )
   private int field7208;

   @OriginalMember(
      owner = "client!vaa",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3606(int arg0) {
      try {
         field7207 = null;
         if (arg0 != 28116) {
            method3606(124);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7209[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 20
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         this.field7204 = arg0.method1211(-26166);
         ++field7201;
         this.field7202 = arg0.method1164(19693);
         this.field7203 = arg0.method1143(-15465);
         this.field7208 = arg0.method1143(-15465);
         if (arg1 > -38) {
            this.method1347((class147)null, (byte)55);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7209[3] + (arg0 != null ? field7209[1] : field7209[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(Lqv;Z)V",
      line = 36
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         arg0.method3441(this.field7204, -93, this.field7202, this.field7203, this.field7208);
         if (!arg1) {
            field7205 = 83;
         }

         ++field7206;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7209[2] + (arg0 != null ? field7209[1] : field7209[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3608(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
