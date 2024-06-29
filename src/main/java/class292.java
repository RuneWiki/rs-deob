import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class292 implements class498 {
   @OriginalMember(
      owner = "client!l",
      name = "b",
      descriptor = "I"
   )
   public int field4021;
   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4023 = new String[]{method2355(method2354("Li\u001a*")), method2355(method2354("N24n")), method2355(method2354("[iv,=")), method2355(method2354("Lidk.I3f*")), method2355(method2354("Li,m\u0013T51l'\b")), method2355(method2354("Li\u0019*"))};
   @OriginalMember(
      owner = "client!l",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field4022 = false;
   @OriginalMember(
      owner = "client!l",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field4020 = false;
   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "[F"
   )
   public static float[] field4018 = new float[2];
   @OriginalMember(
      owner = "client!l",
      name = "d",
      descriptor = "I"
   )
   public static int field4017;
   @OriginalMember(
      owner = "client!l",
      name = "e",
      descriptor = "I"
   )
   public static int field4019;

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2352(byte arg0) {
      try {
         if (arg0 != -37) {
            method2353((byte)-24, -72);
         }

         field4018 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4023[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class292(String arg0, int arg1) {
      try {
         this.field4021 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4023[3] + (arg0 != null ? field4023[2] : field4023[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4019;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4023[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2353(byte arg0, int arg1) {
      try {
         if (arg0 != -104) {
            field4022 = true;
         }

         ++field4017;
         class487 var2 = class2.method12((long)arg1, 7, (byte)43);
         var2.method3696(-11118);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4023[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2354(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2355(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
