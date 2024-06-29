import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class733 extends class294 {
   @OriginalMember(
      owner = "client!hg",
      name = "r",
      descriptor = "I"
   )
   public int field10925;
   @OriginalMember(
      owner = "client!hg",
      name = "q",
      descriptor = "I"
   )
   public int field10929;
   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10931 = new String[]{method5401(method5400("-\u00007I\u000f")), method5401(method5400("-\u000077N+\u000em5\u000f")), method5401(method5400("-\u00007J\u000f"))};
   @OriginalMember(
      owner = "client!hg",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field10927 = new class498(139, 0);
   @OriginalMember(
      owner = "client!hg",
      name = "n",
      descriptor = "I"
   )
   public static int field10926;
   @OriginalMember(
      owner = "client!hg",
      name = "p",
      descriptor = "I"
   )
   public static int field10928;
   @OriginalMember(
      owner = "client!hg",
      name = "o",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field10930;

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public static void method5398(int arg0) {
      try {
         int var1 = 81 / ((arg0 - 28) / 40);
         field10930 = null;
         field10927 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10931[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(I)V",
      line = 16
   )
   public static final void method5399(int arg0) {
      try {
         ++field10926;
         if (class443.field6804 != null) {
            class443.field6804.method1341(100);
         }

         if (arg0 == 0) {
            if (class90.field1302 != null) {
               while(true) {
                  try {
                     class90.field1302.join();
                     return;
                  } catch (InterruptedException var2) {
                  }
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10931[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "<init>",
      descriptor = "(II)V",
      line = 44
   )
   public class733(int arg0, int arg1) {
      try {
         this.field10925 = arg1;
         this.field10929 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10931[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5400(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5401(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
