import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class785 {
   @OriginalMember(
      owner = "client!nca",
      name = "e",
      descriptor = "I"
   )
   public int field11435;
   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11437 = new String[]{method5643(method5642("\u000f|\u0013g9I")), method5643(method5642("\u000f|\u0013gG\bq\u001b=EI")), method5643(method5642("\u000f|\u0013g:I")), method5643(method5642("\u000f|\u0013g\u000f\u000eL\u0006;\u0012\u000fxZ"))};
   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field11436 = new class101(36, 17);
   @OriginalMember(
      owner = "client!nca",
      name = "d",
      descriptor = "I"
   )
   public static int field11432;
   @OriginalMember(
      owner = "client!nca",
      name = "c",
      descriptor = "I"
   )
   public static int field11434;
   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "Lhg;"
   )
   public static class719 field11433;

   @OriginalMember(
      owner = "client!nca",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field11434;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11437[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method5640(int arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field11432;
         if (class616.field9011 != null) {
            label60: {
               int var4 = class312.field4444;
               int var5 = class690.field10400;
               class789.method5661(arg0, (byte)124, arg2);
               if (~class4.field85 == -1) {
                  class232.field2956 = null;
                  class232.field2956 = class616.field9011.method541(class616.field9011.method568(class680.field10222, class379.field5808), class616.field9011.method578(class680.field10222, class379.field5808));
                  if (var3 == 0) {
                     break label60;
                  }
               }

               if (~class4.field85 == -2 && (class178.field2201 == null || class312.field4444 != var4 || ~class690.field10400 != ~var5)) {
                  class178.field2201 = new class725[class690.field10400 * class312.field4444];
                  int var6 = 0;
                  if (var3 != 0) {
                     class178.field2201[var6] = class616.field9011.method541(class616.field9011.method568(class186.field2315, class519.field7557), class616.field9011.method578(class186.field2315, class519.field7557));
                     ++var6;
                  }

                  while(true) {
                     while(class178.field2201.length > var6) {
                        class178.field2201[var6] = class616.field9011.method541(class616.field9011.method568(class186.field2315, class519.field7557), class616.field9011.method578(class186.field2315, class519.field7557));
                        ++var6;
                     }

                     class433.field6607 = 1;
                     if (var3 == 0) {
                        class102.field1254 = new int[class690.field10400 * class312.field4444];
                        break;
                     }

                     ++var6;
                  }
               }
            }

            int var7 = 12 / ((-60 - arg1) / 34);
            class321.field4583 = true;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11437[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5641(int arg0) {
      try {
         field11433 = null;
         field11436 = null;
         if (arg0 != -2) {
            field11433 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11437[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class785(int arg0, int arg1) {
      try {
         this.field11435 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11437[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
