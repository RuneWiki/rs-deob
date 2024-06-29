import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 {
   @OriginalMember(
      owner = "client!ud",
      name = "e",
      descriptor = "Ljca;"
   )
   private class712 field409;
   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field414 = new String[]{method273(method272("gM t ")), method273(method272("|\\b[")), method273(method272("i\u0007 \u0019u")), method273(method272("gM r ")), method273(method272("gM u ")), method273(method272("gM \u000ba|@z\t ")), method273(method272("gM v ")), method273(method272("bAo"))};
   @OriginalMember(
      owner = "client!ud",
      name = "d",
      descriptor = "S"
   )
   public static short field408 = 1;
   @OriginalMember(
      owner = "client!ud",
      name = "f",
      descriptor = "I"
   )
   public static int field410;
   @OriginalMember(
      owner = "client!ud",
      name = "c",
      descriptor = "I"
   )
   public static int field411;
   @OriginalMember(
      owner = "client!ud",
      name = "b",
      descriptor = "I"
   )
   public static int field412;
   @OriginalMember(
      owner = "client!ud",
      name = "g",
      descriptor = "I"
   )
   public static int field413;
   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "Ldl;"
   )
   private class70 field407;

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(B)Ldl;"
   )
   public final class70 method267(byte arg0) {
      try {
         ++field413;
         if (arg0 != 35) {
            this.method267((byte)-15);
         }

         class70 var2 = this.field409.field10622.field881;
         if (this.field409.field10622 == var2) {
            this.field407 = null;
            return null;
         } else {
            this.field407 = var2.field881;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field414[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(ILs;)V"
   )
   public static final void method268(int arg0, class293 arg1) {
      class377.field5711[arg0] = arg1;
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(BLcka;)Z"
   )
   public static final boolean method269(byte arg0, class185 arg1) {
      try {
         if (arg0 != 44) {
            return true;
         } else {
            ++field412;
            return arg1 == null ? false : class783.method5629(arg1.field2295, 2, arg1.field2282, arg1.field2293 - arg1.field2282, -arg1.field2295 + arg1.field2285, arg1.field2291, -arg1.field2291 + arg1.field2292);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field414[3] + arg0 + ',' + (arg1 != null ? field414[2] : field414[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "b",
      descriptor = "(I)Lea;"
   )
   public static final class572 method270(int arg0) {
      try {
         ++field410;

         try {
            return new class142();
         } catch (Throwable var3) {
            if (arg0 < 72) {
               field408 = -116;
            }

            try {
               return (class572)Class.forName(field414[7]).newInstance();
            } catch (Throwable var2) {
               return new class129();
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field414[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "<init>",
      descriptor = "()V"
   )
   public class39() {
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(I)Ldl;"
   )
   public final class70 method271(int arg0) {
      try {
         ++field411;
         class70 var2 = this.field407;
         if (arg0 != 1) {
            return null;
         } else if (this.field409.field10622 == var2) {
            this.field407 = null;
            return null;
         } else {
            this.field407 = var2.field881;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field414[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "<init>",
      descriptor = "(Ljca;)V"
   )
   public class39(class712 arg0) {
      try {
         this.field409 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field414[5] + (arg0 != null ? field414[2] : field414[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
