import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class69 extends class512 {
   @OriginalMember(
      owner = "client!mia",
      name = "i",
      descriptor = "Loia;"
   )
   public class95 field870;
   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field874 = new String[]{method693(method692("@(P\u0002%D/XX'\u0005")), method693(method692("Vo\u001f\u0002d")), method693(method692("C4]@")), method693(method692("@(P\u0002Z\u0005")), method693(method692("@(P\u0002]\u0005")), method693(method692("@(P\u0002[\u0005"))};
   @OriginalMember(
      owner = "client!mia",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field866 = new int[500];
   @OriginalMember(
      owner = "client!mia",
      name = "e",
      descriptor = "Lsd;"
   )
   public static class101 field867 = new class101(29, 5);
   @OriginalMember(
      owner = "client!mia",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field869 = new int[1];
   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "Lsda;"
   )
   public static class269 field871 = new class269(30, -1);
   @OriginalMember(
      owner = "client!mia",
      name = "f",
      descriptor = "I"
   )
   public static int field873 = 0;
   @OriginalMember(
      owner = "client!mia",
      name = "d",
      descriptor = "I"
   )
   public static int field865;
   @OriginalMember(
      owner = "client!mia",
      name = "k",
      descriptor = "I"
   )
   public static int field868;
   @OriginalMember(
      owner = "client!mia",
      name = "h",
      descriptor = "Lsu;"
   )
   public static class220 field872;

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method689(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -5534) {
            method691(-118, 2, 48);
         }

         ++field865;
         return ~(arg1 & 384) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field874[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(B)V",
      line = 16
   )
   public static void method690(byte arg0) {
      try {
         field867 = null;
         field872 = null;
         field869 = null;
         field871 = null;
         if (arg0 >= -66) {
            method691(-124, -65, -76);
         }

         field866 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field874[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "(III)Z",
      line = 30
   )
   public static final boolean method691(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 30) {
            return true;
         } else {
            ++field868;
            return class321.method2430(50, arg0, arg1) & class139.method1178(arg1, arg2 + 92, arg0);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field874[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "<init>",
      descriptor = "(Ldh;II[B)V",
      line = 57
   )
   public class69(class338 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field870 = arg0.method2671(arg2, class740.field10984, 13197, arg1, false, arg3);
         this.field870.method502(113, false, false);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field874[0] + (arg0 != null ? field874[1] : field874[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field874[1] : field874[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "<init>",
      descriptor = "(Ldh;II[I)V",
      line = 69
   )
   public class69(class338 arg0, int arg1, int arg2, int[] arg3) {
      try {
         this.field870 = arg0.method2577(false, arg1, arg3, arg2, 2);
         this.field870.method502(91, false, false);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field874[0] + (arg0 != null ? field874[1] : field874[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field874[1] : field874[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method692(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method693(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
