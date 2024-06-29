import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public abstract class class55 {
   @OriginalMember(
      owner = "client!wba",
      name = "b",
      descriptor = "Lifa;"
   )
   public class453 field683;
   @OriginalMember(
      owner = "client!wba",
      name = "c",
      descriptor = "I"
   )
   public int field680;
   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field684 = new String[]{method433(method432("S\u00031]")), method433(method432("J\u0014<\u001faT\u00184Ec\u0015")), method433(method432("FXs\u001f ")), method433(method432("J\u0014<\u001f\u0011\u0015")), method433(method432("J\u0014<\u001f\u0010\u0015"))};
   @OriginalMember(
      owner = "client!wba",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field681 = new class536(92, 3);
   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "I"
   )
   public static int field682;

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public static void method430(boolean arg0) {
      try {
         field681 = null;
         if (arg0) {
            method430(false);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field684[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(BI)V",
      line = 22
   )
   public final void method431(byte arg0, int arg1) {
      try {
         if (~this.method97(arg1, (byte)105) != -4) {
            this.method96(arg1, (byte)-107);
         }

         if (arg0 > 89) {
            ++field682;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field684[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 46
   )
   public class55(class453 arg0) {
      try {
         this.field683 = arg0;
         this.field680 = this.method101(-120);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field684[1] + (arg0 != null ? field684[2] : field684[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 54
   )
   public class55(int arg0, class453 arg1) {
      try {
         this.field683 = arg1;
         this.field680 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field684[1] + arg0 + ',' + (arg1 != null ? field684[2] : field684[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method101(int arg0);

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method98(int arg0);

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(IB)I"
   )
   public abstract int method97(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!wba",
      name = "b",
      descriptor = "(IB)V"
   )
   public abstract void method96(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method432(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method433(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
