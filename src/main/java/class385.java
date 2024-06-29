import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oka")
public class class385 implements class262 {
   @OriginalMember(
      owner = "client!oka",
      name = "b",
      descriptor = "I"
   )
   public int field5619;
   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5622 = new String[]{method3009(method3008("\u0006\u0016V\u001f\u007fA")), method3009(method3008("\u0006\u0016V\u001f\u0001\u0000\u0013^E\u0003A")), method3009(method3008("\u0006\u0016V\u001f|A"))};
   @OriginalMember(
      owner = "client!oka",
      name = "c",
      descriptor = "I"
   )
   public static int field5620;
   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "I"
   )
   public static int field5621;

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3007(int param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oka",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class385(int arg0) {
      try {
         this.field5619 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5622[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public final class577 method108(byte arg0) {
      try {
         ++field5620;
         if (arg0 > -70) {
            method3007(-20, -111, -92, 50, 115);
         }

         return class555.field7889;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5622[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3008(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3009(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
