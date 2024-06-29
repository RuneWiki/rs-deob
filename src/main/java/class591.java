import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class591 {
   @OriginalMember(
      owner = "client!al",
      name = "e",
      descriptor = "I"
   )
   public int field8707 = -1;
   @OriginalMember(
      owner = "client!al",
      name = "d",
      descriptor = "Lqu;"
   )
   public class366 field8705;
   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8711 = new String[]{method4405(method4404("\u0000\n^:_")), method4405(method4404("\u0000\n^G\u001e\u000f\u000f\u0004E_")), method4405(method4404("\u000f\u0013\u001c\u0017")), method4405(method4404("\u001aH^U\n"))};
   @OriginalMember(
      owner = "client!al",
      name = "c",
      descriptor = "I"
   )
   public static int field8708 = 7000;
   @OriginalMember(
      owner = "client!al",
      name = "h",
      descriptor = "I"
   )
   public static int field8709 = field8708;
   @OriginalMember(
      owner = "client!al",
      name = "f",
      descriptor = "I"
   )
   public static int field8703;
   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "I"
   )
   public int field8704;
   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "I"
   )
   public int field8706;
   @OriginalMember(
      owner = "client!al",
      name = "g",
      descriptor = "I"
   )
   public int field8710;

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4403(boolean arg0) {
      try {
         ++field8703;
         if (class718.field10761 != null) {
            class443.field6804 = new class147();
            class443.field6804.method1347(class718.field10761.field11468.method3875(class493.field7455, 121), arg0, class503.field7679, class718.field10761, class718.field10761.field11473);
            if (arg0) {
               class90.field1302 = new Thread(class443.field6804, "");
               class90.field1302.start();
            }
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8711[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "<init>",
      descriptor = "(Luaa;)V"
   )
   public class591(class119 arg0) {
      try {
         this.field8705 = new class485(arg0, false);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8711[1] + (arg0 != null ? field8711[3] : field8711[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4404(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4405(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
