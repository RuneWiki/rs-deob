import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class548 {
   @OriginalMember(
      owner = "client!baa",
      name = "g",
      descriptor = "[S"
   )
   public short[] field8123;
   @OriginalMember(
      owner = "client!baa",
      name = "h",
      descriptor = "J"
   )
   public long field8121;
   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "[I"
   )
   public int[] field8125;
   @OriginalMember(
      owner = "client!baa",
      name = "d",
      descriptor = "[S"
   )
   public short[] field8124;
   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8128 = new String[]{method4058(method4057("NA\u001f)?EN\u0017s=\u0004")), method4058(method4057("W\u000eP)~")), method4058(method4057("BU\u0012k")), method4058(method4057("NA\u001f)A\u0004")), method4058(method4057("NA\u001f)@\u0004")), method4058(method4057("FA\bf-MW\n)@CM\u000ehmIN\n")), method4058(method4057("NA\u001f)B\u0004")), method4058(method4057("^P"))};
   @OriginalMember(
      owner = "client!baa",
      name = "f",
      descriptor = "I"
   )
   public static int field8120;
   @OriginalMember(
      owner = "client!baa",
      name = "e",
      descriptor = "I"
   )
   public static int field8122;
   @OriginalMember(
      owner = "client!baa",
      name = "c",
      descriptor = "I"
   )
   public static int field8126;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8127;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method4056(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "<init>",
      descriptor = "(J[I[S[S)V",
      line = 9
   )
   public class548(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field8123 = arg3;
         this.field8121 = arg0;
         this.field8125 = arg1;
         this.field8124 = arg2;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8128[0] + arg0 + ',' + (arg1 != null ? field8128[1] : field8128[2]) + ',' + (arg2 != null ? field8128[1] : field8128[2]) + ',' + (arg3 != null ? field8128[1] : field8128[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(Ljava/awt/Component;ZZ)Lgja;",
      line = 20
   )
   public static final class54 method4053(Component arg0, boolean arg1, boolean arg2) {
      try {
         ++field8126;

         try {
            if (!arg2) {
               method4054(107, (class66)null, (class246)null, (byte)-90);
            }

            Constructor var3 = Class.forName(field8128[7]).getDeclaredConstructor(field8127 != null ? field8127 : (field8127 = method4056(field8128[5])), Boolean.TYPE);
            return (class54)var3.newInstance(arg0, new Boolean(arg1));
         } catch (Throwable var5) {
            return new class47(arg0, arg1);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8128[6] + (arg0 != null ? field8128[1] : field8128[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(ILha;Lida;B)V",
      line = 38
   )
   public static final void method4054(int param0, class66 param1, class246 param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(CZ)Z",
      line = 367
   )
   public static final boolean method4055(char arg0, boolean arg1) {
      try {
         ++field8122;
         if (arg1) {
            return true;
         } else {
            return arg0 == 160 || ~arg0 == -33 || arg0 == '_' || arg0 == '-';
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8128[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "<init>",
      descriptor = "()V",
      line = 377
   )
   protected class548() {
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4057(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4058(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
