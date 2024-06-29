import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class509 extends class86 {
   @OriginalMember(
      owner = "client!eu",
      name = "B",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field7049;
   @OriginalMember(
      owner = "client!eu",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7054 = new String[]{method3700(method3699("C\u0012^'q")), method3700(method3699("C\u0012^$q")), method3700(method3699("C\u0012^#q")), method3700(method3699("]I^K$")), method3700(method3699("H\u0012\u001c\t")), method3700(method3699("C\u0012^Y0H\u000e\u0004[q")), method3700(method3699("J\u000e\u001e\u0010!")), method3700(method3699("S\t\u0019\u0013<T\u0014\u0011\tv")), method3700(method3699("K\u0014\u001a\u0004/GH")), method3700(method3699("OSHS")), method3700(method3699("K\u0006\u0013")), method3700(method3699("^_FJ")), method3700(method3699("^_F:o\u0012")), method3700(method3699("Q\u000e\u001e\u00016Q\u0014_")), method3700(method3699("C\u0012^ q")), method3700(method3699("V\u0017\u0013")), method3700(method3699("V\u0017\u0013J")), method3700(method3699("Q\u000e\u001e")), method3700(method3699("K\u0006\u0013\n*\t")), method3700(method3699("OTHS")), method3700(method3699("ORHS")), method3700(method3699("G\n\u0014Sm")), method3700(method3699("J\u000e\u001e\u0010!\t")), method3700(method3699("^_F")), method3700(method3699("^_F:o\u0012H"))};
   @OriginalMember(
      owner = "client!eu",
      name = "D",
      descriptor = "I"
   )
   public static int field7050;
   @OriginalMember(
      owner = "client!eu",
      name = "C",
      descriptor = "I"
   )
   public static int field7052;
   @OriginalMember(
      owner = "client!eu",
      name = "E",
      descriptor = "I"
   )
   public static int field7053;
   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "Ldha;"
   )
   public static class84 field7051;

   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method268(byte arg0) {
      try {
         int var2 = -47 / ((62 - arg0) / 55);
         ++field7053;
         return this.field7049;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7054[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(Lqh;Lbj;B)V"
   )
   public static final void method3697(class74 arg0, class255 arg1, byte arg2) {
      boolean var3 = client.field4273;

      try {
         label68: {
            class76.field958 = arg1;
            ++field7052;
            class156.field2008 = arg0;
            class10.field121 = "";
            if (!class364.field5148.startsWith(field7054[17])) {
               if (!class364.field5148.startsWith(field7054[6])) {
                  if (!class364.field5148.startsWith(field7054[10])) {
                     break label68;
                  }

                  class10.field121 = class10.field121 + field7054[18];
                  if (!var3) {
                     break label68;
                  }
               }

               class10.field121 = class10.field121 + field7054[22];
               if (!var3) {
                  break label68;
               }
            }

            class10.field121 = class10.field121 + field7054[13];
         }

         int var4 = 29 / ((-57 - arg2) / 60);
         if (class76.field958.field3265) {
            class10.field121 = class10.field121 + field7054[8];
         } else if (!class364.field5147.startsWith(field7054[21]) && !class364.field5147.startsWith(field7054[12])) {
            if (!class364.field5147.startsWith(field7054[19]) && !class364.field5147.startsWith(field7054[9]) && !class364.field5147.startsWith(field7054[20]) && !class364.field5147.startsWith(field7054[23])) {
               if (class364.field5147.startsWith(field7054[15])) {
                  class10.field121 = class10.field121 + field7054[16];
               } else {
                  class10.field121 = class10.field121 + field7054[7];
               }
            } else {
               class10.field121 = class10.field121 + field7054[11];
            }
         } else {
            class10.field121 = class10.field121 + field7054[24];
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7054[14] + (arg0 != null ? field7054[3] : field7054[4]) + ',' + (arg1 != null ? field7054[3] : field7054[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class509(Object arg0, int arg1) {
      super(arg1);

      try {
         this.field7049 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7054[5] + (arg0 != null ? field7054[3] : field7054[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method3698(byte arg0) {
      try {
         if (arg0 != 40) {
            field7051 = null;
         }

         field7051 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7054[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method269(int arg0) {
      try {
         ++field7050;
         if (arg0 != 134) {
            field7051 = null;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7054[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3699(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3700(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
