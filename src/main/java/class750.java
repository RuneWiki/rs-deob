import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class750 {
   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10818 = new String[]{method5442(method5441("`m\fF\u000e")), method5442(method5441("bbTf\bdbL`\b[wPnHo")), method5442(method5441("fvNk")), method5442(method5441("s-\f)[")), method5442(method5441("@fCwb}nR'CzqMu\u001c")), method5442(method5441("lvOwnmbR")), method5442(method5441("`m\fD\u000e")), method5442(method5441("klO)U}m\fjGfbEbKmmV)ngwqwI|GKfAflQsOkNzECim"))};
   @OriginalMember(
      owner = "client!hn",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field10813 = new int[13];
   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "Luw;"
   )
   public static class435 field10815 = new class435(19, 8);
   @OriginalMember(
      owner = "client!hn",
      name = "e",
      descriptor = "I"
   )
   public static int field10814;
   @OriginalMember(
      owner = "client!hn",
      name = "c",
      descriptor = "I"
   )
   public static int field10816;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!hn",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10817;
   @OriginalMember(
      owner = "client!hn",
      name = "b",
      descriptor = "[[Z"
   )
   public static boolean[][] field10812;

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5437(byte arg0) {
      try {
         field10815 = null;
         field10813 = null;
         field10812 = null;
         int var1 = 60 % ((arg0 - 68) / 58);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10818[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(ZLjava/io/File;B)V"
   )
   public static final void method5438(boolean arg0, File arg1, byte arg2) {
      try {
         ++field10814;
         if (class70.field1255 == null) {
            class504.method3787((byte)104);
         }

         try {
            if (arg2 != -52) {
               field10812 = null;
            }

            Class var3 = Class.forName(field10818[7]);
            Method var4 = var3.getDeclaredMethod(field10818[5], field10817 != null ? field10817 : (field10817 = method5440(field10818[1])), Boolean.TYPE);
            var4.invoke(class70.field1255, arg1.getAbsolutePath(), new Boolean(arg0));
         } catch (Exception var7) {
            System.out.println(field10818[4]);
            var7.printStackTrace();
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10818[6] + arg0 + ',' + (arg1 != null ? field10818[3] : field10818[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5439(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (class544.field7886 != null) {
         class544.field7886[arg0][arg1] = -16777216 | arg2;
      }

      if (class569.field8236 != null) {
         class569.field8236[arg0][arg1] = (short)arg3;
      }

      if (class634.field9246 != null) {
         class634.field9246[arg0][arg1] = (byte)arg4;
      }

   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5440(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5441(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5442(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
