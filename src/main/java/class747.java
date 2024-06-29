import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class747 {
   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "I"
   )
   public int field10918 = 128;
   @OriginalMember(
      owner = "client!ac",
      name = "c",
      descriptor = "I"
   )
   public int field10926 = 128;
   @OriginalMember(
      owner = "client!ac",
      name = "h",
      descriptor = "I"
   )
   public int field10917;
   @OriginalMember(
      owner = "client!ac",
      name = "j",
      descriptor = "I"
   )
   public int field10924;
   @OriginalMember(
      owner = "client!ac",
      name = "d",
      descriptor = "I"
   )
   public int field10923;
   @OriginalMember(
      owner = "client!ac",
      name = "f",
      descriptor = "I"
   )
   public int field10925;
   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10927 = new String[]{method5415(method5414("^xG\u001ctQr\u001d\u001e5")), method5415(method5414("Qn\u0005L")), method5415(method5414("D5G\u000e`")), method5415(method5414("^xGa5")), method5415(method5414("^xGc5")), method5415(method5414("^xGb5"))};
   @OriginalMember(
      owner = "client!ac",
      name = "g",
      descriptor = "I"
   )
   public static int field10921 = 0;
   @OriginalMember(
      owner = "client!ac",
      name = "i",
      descriptor = "I"
   )
   public static int field10920;
   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "I"
   )
   public static int field10922;
   @OriginalMember(
      owner = "client!ac",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field10919;

   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "(B)Lac;"
   )
   public final class747 method5411(byte arg0) {
      try {
         if (arg0 >= -88) {
            this.field10925 = -105;
         }

         ++field10922;
         return new class747(this.field10917, this.field10918, this.field10926, this.field10925, this.field10924, this.field10923);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10927[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(Lac;B)V"
   )
   public final void method5412(class747 arg0, byte arg1) {
      try {
         ++field10920;
         this.field10925 = arg0.field10925;
         this.field10926 = arg0.field10926;
         this.field10923 = arg0.field10923;
         this.field10918 = arg0.field10918;
         this.field10917 = arg0.field10917;
         if (arg1 > -127) {
            this.method5411((byte)-44);
         }

         this.field10924 = arg0.field10924;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10927[3] + (arg0 != null ? field10927[2] : field10927[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5413(byte arg0) {
      try {
         field10919 = null;
         if (arg0 != -25) {
            method5413((byte)-124);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10927[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class747(int arg0) {
      try {
         this.field10917 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10927[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field10924 = arg4;
         this.field10923 = arg5;
         this.field10918 = arg1;
         this.field10926 = arg2;
         this.field10925 = arg3;
         this.field10917 = arg0;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10927[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5414(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5415(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
