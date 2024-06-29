import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class426 {
   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "I"
   )
   public int field5957;
   @OriginalMember(
      owner = "client!ga",
      name = "f",
      descriptor = "I"
   )
   public int field5958;
   @OriginalMember(
      owner = "client!ga",
      name = "e",
      descriptor = "I"
   )
   public int field5959;
   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5962 = new String[]{method3207(method3206(" \u001ej\u000e/")), method3207(method3206(" \u001ejtn)\u00160v/"))};
   @OriginalMember(
      owner = "client!ga",
      name = "c",
      descriptor = "Lod;"
   )
   public static class536 field5956 = new class536();
   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "Luk;"
   )
   public static class273 field5960 = new class273();
   @OriginalMember(
      owner = "client!ga",
      name = "d",
      descriptor = "[[Z"
   )
   public static boolean[][] field5961;

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(BII)V"
   )
   public abstract void method2688(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3205(int arg0) {
      try {
         field5956 = null;
         field5960 = null;
         field5961 = null;
         if (arg0 != -17920) {
            method3205(-12);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5962[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2691(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ga",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class426(int arg0, int arg1, int arg2) {
      try {
         this.field5957 = arg1;
         this.field5958 = arg0;
         this.field5959 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5962[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(IIB)V"
   )
   public abstract void method2689(int arg0, int arg1, byte arg2);

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3206(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3207(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
