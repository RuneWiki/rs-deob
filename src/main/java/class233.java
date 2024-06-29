import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class233 extends class438 {
   @OriginalMember(
      owner = "client!rha",
      name = "t",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field2885;
   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2893 = new String[]{method1764(method1763("A\u001578l\u001b")), method1764(method1763("A\u001578\u0015Z\u0013?b\u0017\u001b")), method1764(method1763("A\u001578o\u001b")), method1764(method1763("\u0013.l6")), method1764(method1763("A\u001578m\u001b"))};
   @OriginalMember(
      owner = "client!rha",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field2886 = new int[1];
   @OriginalMember(
      owner = "client!rha",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field2888 = true;
   @OriginalMember(
      owner = "client!rha",
      name = "r",
      descriptor = "I"
   )
   public static int field2887 = 0;
   @OriginalMember(
      owner = "client!rha",
      name = "o",
      descriptor = "I"
   )
   public static int field2889;
   @OriginalMember(
      owner = "client!rha",
      name = "s",
      descriptor = "I"
   )
   public static int field2890;
   @OriginalMember(
      owner = "client!rha",
      name = "q",
      descriptor = "Ltba;"
   )
   public static class172 field2892;
   @OriginalMember(
      owner = "client!rha",
      name = "n",
      descriptor = "[Loga;"
   )
   public static class503[] field2891;

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(II)Lgr;"
   )
   public static final class462 method1760(int arg0, int arg1) {
      try {
         ++field2889;
         class462 var2 = (class462)class243.field3036.method176(false, (long)arg0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class694.field10159.method732(0, arg0, (byte)97);
            if (var3 != null && var3.length > 1) {
               class462 var4;
               try {
                  var4 = class636.method4615((byte)78, var3);
                  if (arg1 < 54) {
                     method1760(-30, 69);
                  }
               } catch (Exception var7) {
                  throw new RuntimeException(var7.getMessage() + field2893[3] + arg0);
               }

               class243.field3036.method175(0, (long)arg0, var4);
               return var4;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2893[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1761(int arg0) {
      try {
         field2886 = null;
         field2891 = null;
         if (arg0 == 9342) {
            field2892 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2893[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class233(int arg0) {
      try {
         this.field2885 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2893[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method1762(boolean arg0) {
      try {
         this.field2885.method5100();
         ++field2890;
         if (arg0) {
            field2887 = 106;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2893[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1763(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1764(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
