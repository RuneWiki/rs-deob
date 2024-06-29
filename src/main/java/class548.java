import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class548 implements class110 {
   @OriginalMember(
      owner = "client!up",
      name = "e",
      descriptor = "I"
   )
   public int field8070;
   @OriginalMember(
      owner = "client!up",
      name = "c",
      descriptor = "I"
   )
   public int field8077;
   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "I"
   )
   public int field8068;
   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "Lbu;"
   )
   public class596 field8074;
   @OriginalMember(
      owner = "client!up",
      name = "o",
      descriptor = "I"
   )
   public int field8067;
   @OriginalMember(
      owner = "client!up",
      name = "k",
      descriptor = "Liba;"
   )
   public class237 field8073;
   @OriginalMember(
      owner = "client!up",
      name = "h",
      descriptor = "I"
   )
   public int field8065;
   @OriginalMember(
      owner = "client!up",
      name = "j",
      descriptor = "I"
   )
   public int field8075;
   @OriginalMember(
      owner = "client!up",
      name = "g",
      descriptor = "Z"
   )
   public boolean field8076;
   @OriginalMember(
      owner = "client!up",
      name = "n",
      descriptor = "I"
   )
   public int field8072;
   @OriginalMember(
      owner = "client!up",
      name = "m",
      descriptor = "I"
   )
   public int field8069;
   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8081 = new String[]{method4151(method4150("\u0012$NlZ")), method4151(method4150("\u0012$NnZ")), method4151(method4150("\t!\fC")), method4151(method4150("\u001czN\u0001\u000f")), method4151(method4150("\u0012$N\u0013\u001b\t=\u0014\u0011Z")), method4151(method4150("\u0012$NmZ"))};
   @OriginalMember(
      owner = "client!up",
      name = "i",
      descriptor = "Laka;"
   )
   public static class418 field8071 = new class418(123, 6);
   @OriginalMember(
      owner = "client!up",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field8079 = new int[256];
   @OriginalMember(
      owner = "client!up",
      name = "p",
      descriptor = "I"
   )
   public static int field8066;
   @OriginalMember(
      owner = "client!up",
      name = "f",
      descriptor = "I"
   )
   public static int field8078;
   @OriginalMember(
      owner = "client!up",
      name = "d",
      descriptor = "[[[Lbq;"
   )
   public static class731[][][] field8080;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         int var2 = 45 % ((4 - arg0) / 37);
         ++field8066;
         return class495.field6912;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8081[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4148(byte arg0) {
      try {
         field8071 = null;
         if (arg0 == -12) {
            field8080 = null;
            field8079 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8081[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(ILgj;Lgea;I)V"
   )
   public static final void method4149(int param0, class736 param1, class66 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!up",
      name = "<init>",
      descriptor = "(ILiba;Lbu;IIIIIIIZ)V"
   )
   public class548(int arg0, class237 arg1, class596 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      try {
         this.field8070 = arg9;
         this.field8077 = arg7;
         this.field8068 = arg4;
         this.field8074 = arg2;
         this.field8067 = arg0;
         this.field8073 = arg1;
         this.field8065 = arg3;
         this.field8075 = arg5;
         this.field8076 = arg10;
         this.field8072 = arg6;
         this.field8069 = arg8;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field8081[4] + arg0 + ',' + (arg1 != null ? field8081[3] : field8081[2]) + ',' + (arg2 != null ? field8081[3] : field8081[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         int var1 = var0;

         for(int var2 = 0; ~var2 > -9; ++var2) {
            if (~(1 & var1) == -2) {
               var1 = var1 >>> 1 ^ -306674912;
            } else {
               var1 >>>= 1;
            }
         }

         field8079[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4150(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4151(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
