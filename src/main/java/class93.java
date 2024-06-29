import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class93 extends class264 {
   @OriginalMember(
      owner = "client!fca",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1208 = new String[]{method807(method806("_\u0017q]Z\u0011")), method807(method806("S\u0015f\u00126X\u0003d][V\u0019`\u001cv\\\u001ad")), method807(method806("BZ>]e")), method807(method806("N\u0003")), method807(method806("_\u0017q][\u0011")), method807(method806("W\u0001|\u001f")), method807(method806("_\u0017q]\\\u0011"))};
   @OriginalMember(
      owner = "client!fca",
      name = "K",
      descriptor = "I"
   )
   public static int field1205 = 1407;
   @OriginalMember(
      owner = "client!fca",
      name = "F",
      descriptor = "Llg;"
   )
   public static class437 field1202 = new class437();
   @OriginalMember(
      owner = "client!fca",
      name = "H",
      descriptor = "I"
   )
   public static int field1203;
   @OriginalMember(
      owner = "client!fca",
      name = "I",
      descriptor = "I"
   )
   public static int field1204;
   @OriginalMember(
      owner = "client!fca",
      name = "J",
      descriptor = "I"
   )
   public static int field1206;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fca",
      name = "G",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1207;

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      try {
         int var3 = -44 / ((24 - arg1) / 44);
         ++field1203;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            class242.method1854(var4, 0, class430.field6152, class666.field9668[arg0]);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1208[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "<init>",
      descriptor = "()V"
   )
   public class93() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!fca",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method803(int arg0) {
      try {
         field1202 = null;
         if (arg0 != 1407) {
            field1202 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1208[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(ZZLjava/awt/Component;)Lwb;"
   )
   public static final class350 method804(boolean arg0, boolean arg1, Component arg2) {
      try {
         ++field1204;

         try {
            Constructor var3 = Class.forName(field1208[3]).getDeclaredConstructor(field1207 != null ? field1207 : (field1207 = method805(field1208[1])), Boolean.TYPE);
            if (arg1) {
               field1205 = 121;
            }

            return (class350)var3.newInstance(arg2, new Boolean(arg0));
         } catch (Throwable var5) {
            return new class210(arg2, arg0);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1208[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1208[2] : field1208[5]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method805(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method806(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method807(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
