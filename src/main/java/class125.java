import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class125 {
   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1623 = new String[]{method1007(method1006("!lRoNe`E`W,hIkX?#iLS*cwkD=hVMY%cAmB\"bJ")), method1007(method1006("%hS^Z*yBaD&@|LS*ct|Y3t")), method1007(method1006(")oE wc")), method1007(method1006("(bI E>c\ncW%lCk[.cP ~$yw~Y?IMoQ%bWz_(@|LS*c")), method1007(method1006("!lRo\u0018'lJi\u0018\u0018yVgX,")), method1007(method1006("!lRo\u0018'lJi\u0018&lJoQ.`A`Be@E`W,hIkX?KEmB$\u007f]")), method1007(method1006("\u0003hE~r>`T.E.yQ~\u0016.\u007fVaDq")), method1007(method1006(",hP^Z*yBaD&@fkW%^A|@.\u007f")), method1007(method1006("!lRo\u0018'lJi\u0018\baE}E")), method1007(method1006("(bI E>c\ncW%lCk[.cP4B2}A3~$yw~Y?IMoQ%bWz_(")), method1007(method1006(")oE tc"))};
   @OriginalMember(
      owner = "client!bba",
      name = "d",
      descriptor = "Lek;"
   )
   public static class536 field1619 = new class536(51, 2);
   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field1620 = new class118(67, 8);
   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "I"
   )
   public static int field1618;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1621;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bba",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1622;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method1005(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method1003(int arg0) {
      try {
         field1619 = null;
         field1620 = null;
         if (arg0 != 2) {
            method1003(-57);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1623[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(I)V",
      line = 23
   )
   public static final synchronized void method1004(int arg0) {
      try {
         ++field1618;
         if (class486.field6936 == null) {
            try {
               Class var1 = Class.forName(field1623[5]);
               Method var2 = var1.getDeclaredMethod(field1623[7], (Class[])null);
               Object var3 = var2.invoke((Object)null, (Object[])null);
               Method var4 = var1.getMethod(field1623[1], Class.forName(field1623[0]), field1621 != null ? field1621 : (field1621 = method1005(field1623[4])), field1622 != null ? field1622 : (field1622 = method1005(field1623[8])));
               class486.field6936 = var4.invoke((Object)null, var3, field1623[9], Class.forName(field1623[3]));
               if (arg0 > -51) {
                  field1619 = null;
               }
            } catch (Exception var7) {
               System.out.println(field1623[6]);
               var7.printStackTrace();
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1623[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1006(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1007(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
