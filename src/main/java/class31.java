import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class31 extends class70 {
   @OriginalMember(
      owner = "client!o",
      name = "A",
      descriptor = "Z"
   )
   public volatile boolean field341 = true;
   @OriginalMember(
      owner = "client!o",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field348 = new String[]{method224(method223("_\u00174\u0001")), method224(method223("^L\u0016E")), method224(method223("K\u0017T\u0007\u0018")), method224(method223("_\u00175\u0001"))};
   @OriginalMember(
      owner = "client!o",
      name = "x",
      descriptor = "I"
   )
   public static int field339 = 0;
   @OriginalMember(
      owner = "client!o",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field343 = new int[2];
   @OriginalMember(
      owner = "client!o",
      name = "B",
      descriptor = "Lsda;"
   )
   public static class269 field346 = new class269(55, -1);
   @OriginalMember(
      owner = "client!o",
      name = "F",
      descriptor = "I"
   )
   public static int field342;
   @OriginalMember(
      owner = "client!o",
      name = "D",
      descriptor = "I"
   )
   public static int field347;
   @OriginalMember(
      owner = "client!o",
      name = "y",
      descriptor = "Leaa;"
   )
   public static class526 field345;
   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "Z"
   )
   public boolean field340;
   @OriginalMember(
      owner = "client!o",
      name = "C",
      descriptor = "Z"
   )
   public boolean field344;

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "([Ljava/lang/Object;[IIII)V",
      line = 8
   )
   public static final void method219(Object[] param0, int[] param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!o",
      name = "f",
      descriptor = "(I)V",
      line = 74
   )
   public static void method221(int arg0) {
      try {
         field345 = null;
         if (arg0 == 1) {
            field346 = null;
            field343 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field348[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method220(boolean arg0);

   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "(Z)[B"
   )
   public abstract byte[] method222(boolean arg0);

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method223(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method224(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
