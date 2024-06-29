import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class393 extends class247 {
   @OriginalMember(
      owner = "client!aaa",
      name = "m",
      descriptor = "I"
   )
   public volatile int field5708 = -1;
   @OriginalMember(
      owner = "client!aaa",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public volatile String field5706;
   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5711 = new String[]{method3050(method3049("nP\u007fen'")), method3050(method3049("aDr'")), method3050(method3049("t\u001f0eQ")), method3050(method3049("nP\u007fe\u0010f_w?\u0012'")), method3050(method3049("nP\u007feo'")), method3050(method3049("nP\u007fem'")), method3050(method3049("cX"))};
   @OriginalMember(
      owner = "client!aaa",
      name = "n",
      descriptor = "Lfm;"
   )
   public static class164 field5709 = new class164(85, 2);
   @OriginalMember(
      owner = "client!aaa",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field5710 = new int[2];
   @OriginalMember(
      owner = "client!aaa",
      name = "o",
      descriptor = "I"
   )
   public static int field5705;
   @OriginalMember(
      owner = "client!aaa",
      name = "k",
      descriptor = "I"
   )
   public static int field5707;

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "([[[Lhs;IIZII)Z"
   )
   public static final boolean method3046(class312[][][] param0, int param1, int param2, boolean param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(IZ[B)Ljava/lang/Object;"
   )
   public static final Object method3047(int arg0, boolean arg1, byte[] arg2) {
      try {
         if (arg0 != 1) {
            method3047(-36, true, (byte[])null);
         }

         ++field5705;
         if (arg2 == null) {
            return null;
         } else {
            if (arg2.length > 136 && !class577.field8147) {
               try {
                  class86 var3 = (class86)Class.forName(field5711[6]).newInstance();
                  var3.method903(-29528, arg2);
                  return var3;
               } catch (Throwable var5) {
                  class577.field8147 = true;
               }
            }

            return !arg1 ? arg2 : class37.method420(arg2, arg0 ^ 124);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5711[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5711[2] : field5711[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3048(int arg0) {
      try {
         field5710 = null;
         if (arg0 <= -28) {
            field5709 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5711[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class393(String arg0) {
      try {
         this.field5706 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5711[3] + (arg0 != null ? field5711[2] : field5711[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3049(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3050(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
