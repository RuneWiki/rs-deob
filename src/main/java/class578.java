import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class578 extends class310 {
   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8323 = new String[]{method4269(method4268("X>!6x")), method4269(method4268("X>!=x"))};
   @OriginalMember(
      owner = "client!jw",
      name = "t",
      descriptor = "I"
   )
   public static int field8320;
   @OriginalMember(
      owner = "client!jw",
      name = "r",
      descriptor = "I"
   )
   public static int field8321;
   @OriginalMember(
      owner = "client!jw",
      name = "s",
      descriptor = "I"
   )
   public static int field8322;

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(IZIZ)V"
   )
   public final void method2397(int arg0, boolean arg1, int arg2, boolean arg3) {
      try {
         ++field8322;
         int var5 = this.method2417(-80) * super.field4464.field6555 / 10000;
         if (arg1) {
            this.method2395(65, -124, true, (byte)-88);
         }

         class444.field6473.method295(arg2, arg0 + 2, var5, super.field4464.field6566 + -2, ((class250)super.field4464).field3585, 0);
         class444.field6473.method295(arg2 - -var5, arg0 - -2, super.field4464.field6555 - var5, super.field4464.field6566 + -2, 0, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8323[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "<init>",
      descriptor = "(Lhw;Lhw;Lrga;)V"
   )
   public class578(class141 arg0, class141 arg1, class250 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(IIZB)V"
   )
   public final void method2395(int arg0, int arg1, boolean arg2, byte arg3) {
      try {
         if (arg3 == 36) {
            ++field8321;
            class444.field6473.method403(arg1 - 2, arg0, super.field4464.field6555 + 4, super.field4464.field6566 + 2, ((class250)super.field4464).field3589, 0);
            class444.field6473.method403(arg1 + -1, arg0 - -1, super.field4464.field6555 + 2, super.field4464.field6566, 0, 0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8323[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4268(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4269(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
