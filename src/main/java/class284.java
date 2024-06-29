import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class284 extends class294 {
   @OriginalMember(
      owner = "client!ia",
      name = "m",
      descriptor = "Lc;"
   )
   public class652 field4491;
   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4492 = new String[]{method2379(method2378("~euw1")), method2379(method2378("~euq1")), method2379(method2378("~euy1")), method2379(method2378("~eur1")), method2379(method2378("~euz1")), method2379(method2378("~eu\fpym/\u000e1")), method2379(method2378("yq7\\")), method2379(method2378("l*u\u001ed"))};
   @OriginalMember(
      owner = "client!ia",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field4489 = new int[50];
   @OriginalMember(
      owner = "client!ia",
      name = "q",
      descriptor = "I"
   )
   public static int field4484;
   @OriginalMember(
      owner = "client!ia",
      name = "t",
      descriptor = "I"
   )
   public static int field4487;
   @OriginalMember(
      owner = "client!ia",
      name = "n",
      descriptor = "I"
   )
   public static int field4488;
   @OriginalMember(
      owner = "client!ia",
      name = "s",
      descriptor = "I"
   )
   public static int field4490;
   @OriginalMember(
      owner = "client!ia",
      name = "p",
      descriptor = "Z"
   )
   public boolean field4486;
   @OriginalMember(
      owner = "client!ia",
      name = "o",
      descriptor = "[[I"
   )
   public static int[][] field4485;

   @OriginalMember(
      owner = "client!ia",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2367(int arg0) {
      try {
         field4485 = null;
         if (arg0 != 28456) {
            method2367(-104);
         }

         field4489 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4492[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2368(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(Z)Z"
   )
   public abstract boolean method2369(boolean arg0);

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method2370(int arg0);

   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method2371(byte arg0);

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(ZLbka;ILbka;)V"
   )
   public abstract void method2372(boolean arg0, class396 arg1, int arg2, class396 arg3);

   @OriginalMember(
      owner = "client!ia",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method2373(int arg0) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field4484;
            return this.field4486;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4492[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method2374(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ia",
      name = "h",
      descriptor = "(I)I"
   )
   public int method2375(int arg0) {
      try {
         if (arg0 < 113) {
            this.field4491 = null;
         }

         ++field4487;
         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4492[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2376(byte arg0) {
      try {
         int var2 = 7 % ((-55 - arg0) / 61);
         ++field4490;
         return false;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4492[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2377(int arg0) {
      try {
         ++field4488;
         return arg0 != 3077 ? -86 : 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4492[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "<init>",
      descriptor = "(Lc;)V"
   )
   public class284(class652 arg0) {
      try {
         this.field4491 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4492[5] + (arg0 != null ? field4492[7] : field4492[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2378(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2379(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
