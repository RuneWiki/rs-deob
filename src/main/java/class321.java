import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class321 {
   @OriginalMember(
      owner = "client!fl",
      name = "e",
      descriptor = "I"
   )
   public int field4916;
   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4920 = new String[]{method2640(method2639("\u0010|R91")), method2640(method2639("\u001a\u007f\u001b\u001f|\u0012\u007f\t\f")), method2640(method2639("\u0010|R:1")), method2640(method2639("\u0010|R\fv%d\u000e\u0011w\u00118")), method2640(method2639("\u0010|RDp\u0018y\bF1"))};
   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4917 = new int[8];
   @OriginalMember(
      owner = "client!fl",
      name = "d",
      descriptor = "I"
   )
   public static int field4915;
   @OriginalMember(
      owner = "client!fl",
      name = "c",
      descriptor = "I"
   )
   public static int field4918;
   @OriginalMember(
      owner = "client!fl",
      name = "b",
      descriptor = "I"
   )
   public static int field4919;
   @OriginalMember(
      owner = "client!fl",
      name = "f",
      descriptor = "Lgj;"
   )
   public static class761 field4914;

   @OriginalMember(
      owner = "client!fl",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4915;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4920[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2637(boolean arg0) {
      try {
         field4917 = null;
         field4914 = null;
         if (arg0) {
            method2638(-65, false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4920[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method2638(int arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         ++field4918;
         class29[] var3 = class510.field7803;
         int var4 = 0;
         if (var2 || var3.length > var4) {
            do {
               class29 var5 = var3[var4];
               var5.method204((byte)117);
               ++var4;
            } while(var3.length > var4);
         }

         class186.method1672(true);
         class600.method4442(-27112);
         class367.method3010();
         int var6 = 0;
         if (var2) {
            class221.field3326[var6].method3744(-127);
            ++var6;
         }

         while(true) {
            while(var6 < 4) {
               class221.field3326[var6].method3744(-127);
               ++var6;
            }

            class1.method1(26215, false);
            System.gc();
            class607.method4475((byte)-115, arg0);
            class77.field1033 = -1;
            class176.field2762 = false;
            class147.method1348(6819);
            class498.method3867((byte)-123, true);
            class628.method4599(-117);
            class493.method3815(false);
            class387.method3129(true);
            if (!var2) {
               if (!arg1) {
                  class69.method532(1, 3);

                  try {
                     class676.method4989(class684.field10176, field4920[1], -23226);
                     return;
                  } catch (Throwable var8) {
                     return;
                  }
               }

               class69.method532(1, 13);
               return;
            }

            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4920[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class321(int arg0, int arg1) {
      try {
         this.field4916 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4920[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2639(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2640(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
