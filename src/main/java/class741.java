import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class741 {
   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11027 = new String[]{method5446(method5445("q\u001b&O>")), method5446(method5445("\u007fV&\"k")), method5446(method5445("j\rd`")), method5446(method5445("q\u001b&M>")), method5446(method5445("q\u001b&N>"))};
   @OriginalMember(
      owner = "client!uc",
      name = "g",
      descriptor = "Luk;"
   )
   public static class498 field11025 = new class498(50, 2);
   @OriginalMember(
      owner = "client!uc",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field11026 = false;
   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "I"
   )
   public int field11019;
   @OriginalMember(
      owner = "client!uc",
      name = "e",
      descriptor = "I"
   )
   public int field11020;
   @OriginalMember(
      owner = "client!uc",
      name = "f",
      descriptor = "I"
   )
   public int field11021;
   @OriginalMember(
      owner = "client!uc",
      name = "d",
      descriptor = "I"
   )
   public static int field11022;
   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "I"
   )
   public int field11023;
   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "I"
   )
   public static int field11024;

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5442(boolean arg0) {
      try {
         if (arg0) {
            field11026 = false;
         }

         field11025 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11027[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(ILqca;ZZ)V"
   )
   public static final void method5443(int param0, class276 param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(ZLrr;)V"
   )
   public static final void method5444(boolean arg0, class678 arg1) {
      try {
         ++field11024;
         class425.field6568 = arg1;
         if (arg0) {
            method5442(false);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11027[0] + arg0 + ',' + (arg1 != null ? field11027[1] : field11027[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5445(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5446(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
