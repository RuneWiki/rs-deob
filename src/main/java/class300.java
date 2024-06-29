import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public abstract class class300 extends class70 {
   @OriginalMember(
      owner = "client!uu",
      name = "A",
      descriptor = "I"
   )
   public int field4285;
   @OriginalMember(
      owner = "client!uu",
      name = "y",
      descriptor = "Lsf;"
   )
   public class549 field4284;
   @OriginalMember(
      owner = "client!uu",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4287 = new String[]{method2292(method2291("H\u0007[d\u0016S\u001b\u0001fW")), method2292(method2291("S\u0007\u00194")), method2292(method2291("F\\[v\u0002")), method2292(method2291("H\u0007[\u0013W"))};
   @OriginalMember(
      owner = "client!uu",
      name = "x",
      descriptor = "Lsd;"
   )
   public static class101 field4283 = new class101(63, 10);
   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "[C"
   )
   private static char[] field4286 = new char[64];

   @OriginalMember(
      owner = "client!uu",
      name = "g",
      descriptor = "(I)Z"
   )
   public abstract boolean method1374(int arg0);

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(Z)Ljava/lang/Object;"
   )
   public abstract Object method1376(boolean arg0);

   @OriginalMember(
      owner = "client!uu",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2290(int arg0) {
      try {
         if (arg0 == -22304) {
            field4286 = null;
            field4283 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4287[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "<init>",
      descriptor = "(Lsf;I)V"
   )
   public class300(class549 arg0, int arg1) {
      try {
         this.field4285 = arg1;
         this.field4284 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4287[0] + (arg0 != null ? field4287[2] : field4287[1]) + ',' + arg1 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -27; ++var0) {
         field4286[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field4286[var1] = (char)(var1 + -26 + 97);
      }

      for(int var2 = 52; ~var2 > -63; ++var2) {
         field4286[var2] = (char)(var2 + 48 + -52);
      }

      field4286[63] = '-';
      field4286[62] = '*';
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2291(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2292(char[] arg0) {
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
            var10005 = 114;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
