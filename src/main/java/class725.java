import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class725 extends class603 {
   @OriginalMember(
      owner = "client!pg",
      name = "q",
      descriptor = "I"
   )
   public int field10847;
   @OriginalMember(
      owner = "client!pg",
      name = "o",
      descriptor = "I"
   )
   public int field10849;
   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10851 = new String[]{method5361(method5360("!I,\u0003c")), method5361(method5360("!I,\u0004c")), method5361(method5360("!I,\u0000c")), method5361(method5360("*\u0000,o6")), method5361(method5360("?[n-")), method5361(method5360("!I,}\"?Gv\u007fc"))};
   @OriginalMember(
      owner = "client!pg",
      name = "s",
      descriptor = "[J"
   )
   public static long[] field10846 = new long[10];
   @OriginalMember(
      owner = "client!pg",
      name = "r",
      descriptor = "I"
   )
   public static int field10848;
   @OriginalMember(
      owner = "client!pg",
      name = "p",
      descriptor = "I"
   )
   public static int field10850;

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(I)Lbda;",
      line = 5
   )
   public final class783 method193(int arg0) {
      try {
         if (arg0 != -1) {
            this.field10847 = -98;
         }

         ++field10850;
         return class751.field11145;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10851[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(III)Z",
      line = 16
   )
   public static final boolean method5358(int arg0, int arg1, int arg2) {
      try {
         ++field10848;
         if (arg2 != -1) {
            return false;
         } else {
            return ~(50560 & arg1) != -1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10851[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "<init>",
      descriptor = "(Lrga;Lgea;IIIIIIIII)V",
      line = 30
   )
   public class725(class694 arg0, class750 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field10847 = arg10;
         this.field10849 = arg9;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10851[5] + (arg0 != null ? field10851[3] : field10851[4]) + ',' + (arg1 != null ? field10851[3] : field10851[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "c",
      descriptor = "(I)V",
      line = 45
   )
   public static void method5359(int arg0) {
      try {
         field10846 = null;
         if (arg0 != -1) {
            field10846 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10851[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5360(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5361(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
