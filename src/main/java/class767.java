import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class767 extends class458 implements class349 {
   @OriginalMember(
      owner = "client!fm",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11311 = new String[]{method5554(method5553("v\u0000M\u000f")), method5554(method5553("c[\u000fM(")), method5554(method5553("~\u0018\u000f_<v\u001cU]}")), method5554(method5553("~\u0018\u000f!}")), method5554(method5553("~\u0018\u000f\"}"))};
   @OriginalMember(
      owner = "client!fm",
      name = "x",
      descriptor = "Leg;"
   )
   public static class118 field11305 = new class118(93, 4);
   @OriginalMember(
      owner = "client!fm",
      name = "w",
      descriptor = "J"
   )
   public static long field11308 = -1L;
   @OriginalMember(
      owner = "client!fm",
      name = "v",
      descriptor = "Leg;"
   )
   public static class118 field11307 = new class118(104, 8);
   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "[Luo;"
   )
   public static class603[] field11309 = new class603[4];
   @OriginalMember(
      owner = "client!fm",
      name = "A",
      descriptor = "Z"
   )
   public static boolean field11310 = false;
   @OriginalMember(
      owner = "client!fm",
      name = "y",
      descriptor = "I"
   )
   public static int field11306;

   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5551(int arg0) {
      try {
         ++field11306;
         if (class491.field7031 != null) {
            class491.field7031 = null;
            class525.method3800((byte)-122, class535.field7631, class100.field1286, class380.field5479, class25.field405);
            if (arg0 != 13522) {
               method5552(31);
            }
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11311[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5552(int arg0) {
      try {
         field11305 = null;
         field11307 = null;
         if (arg0 != 0) {
            method5552(-125);
         }

         field11309 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11311[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "<init>",
      descriptor = "(Lwi;IZ[[I)V"
   )
   public class767(class494 param1, int param2, boolean param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5553(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5554(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
