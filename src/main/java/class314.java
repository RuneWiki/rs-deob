import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class314 {
   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4357 = new String[]{method2497(method2496("NyNEn")), method2497(method2496("NyNDn")), method2497(method2496("NyNGn")), method2497(method2496("Db\u0010i0\u0012")), method2497(method2496("NyNr)px\u0012o(D$"))};
   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field4350 = new class418(111, -1);
   @OriginalMember(
      owner = "client!mu",
      name = "f",
      descriptor = "Ll;"
   )
   public static class292 field4352 = new class292("", 10);
   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "I"
   )
   public static int field4355 = 0;
   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "I"
   )
   public static int field4351;
   @OriginalMember(
      owner = "client!mu",
      name = "e",
      descriptor = "I"
   )
   public static int field4353;
   @OriginalMember(
      owner = "client!mu",
      name = "d",
      descriptor = "I"
   )
   public static int field4354;
   @OriginalMember(
      owner = "client!mu",
      name = "g",
      descriptor = "[[[J"
   )
   public static long[][][] field4356;

   @OriginalMember(
      owner = "client!mu",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4354;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4357[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2493(byte arg0) {
      try {
         ++field4351;
         if (arg0 != -91) {
            method2495(90);
         }

         return class437.field5959 == this | class493.field6882 == this;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4357[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2494(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2495(int arg0) {
      try {
         if (arg0 > -18) {
            field4352 = null;
         }

         field4352 = null;
         field4356 = null;
         field4350 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4357[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2496(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2497(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
