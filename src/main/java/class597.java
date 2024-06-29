import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class597 {
   @OriginalMember(
      owner = "client!fe",
      name = "k",
      descriptor = "Loi;"
   )
   private class80 field8773 = new class80(128);
   @OriginalMember(
      owner = "client!fe",
      name = "c",
      descriptor = "Lkf;"
   )
   private class266 field8781;
   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8784 = new String[]{method4342(method4341("T\bN(_\\\u0004\u0014*\u001e")), method4342(method4341("ICN:K")), method4342(method4341("\\\u0018\fx")), method4342(method4341("T\bNV\u001e")), method4342(method4341("T\bNW\u001e")), method4342(method4341("T\bNU\u001e")), method4342(method4341("T\bNP\u001e")), method4342(method4341("T\bNQ\u001e"))};
   @OriginalMember(
      owner = "client!fe",
      name = "i",
      descriptor = "I"
   )
   public static int field8778 = 1;
   @OriginalMember(
      owner = "client!fe",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field8779 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "Lwv;"
   )
   public static class37 field8782 = new class37(8);
   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "I"
   )
   public static int field8774;
   @OriginalMember(
      owner = "client!fe",
      name = "d",
      descriptor = "I"
   )
   public static int field8775;
   @OriginalMember(
      owner = "client!fe",
      name = "f",
      descriptor = "I"
   )
   public static int field8776;
   @OriginalMember(
      owner = "client!fe",
      name = "e",
      descriptor = "I"
   )
   public static int field8777;
   @OriginalMember(
      owner = "client!fe",
      name = "j",
      descriptor = "I"
   )
   public static int field8780;
   @OriginalMember(
      owner = "client!fe",
      name = "g",
      descriptor = "I"
   )
   public static int field8783;

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public final void method4336(byte arg0) {
      try {
         ++field8783;
         class80 var2 = this.field8773;
         synchronized(this.field8773) {
            if (arg0 != 28) {
               this.method4339((byte)-20, 100);
            }

            this.field8773.method715(true);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8784[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(B)V",
      line = 22
   )
   public final void method4337(byte arg0) {
      try {
         ++field8774;
         class80 var2 = this.field8773;
         synchronized(this.field8773) {
            this.field8773.method731(0);
            int var3 = 122 / ((-55 - arg0) / 55);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8784[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IZ)Lkba;",
      line = 37
   )
   public final class115 method4338(int arg0, boolean arg1) {
      try {
         ++field8776;
         class80 var3 = this.field8773;
         class115 var4;
         synchronized(this.field8773) {
            var4 = (class115)this.field8773.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field8781;
            byte[] var6;
            synchronized(this.field8781) {
               var6 = this.field8781.method2037(arg1, arg0, 1);
            }

            class115 var7 = new class115();
            if (var6 != null) {
               var7.method928(new class147(var6), -9776);
            }

            class80 var8 = this.field8773;
            synchronized(this.field8773) {
               this.field8773.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field8784[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(BI)V",
      line = 68
   )
   public final void method4339(byte arg0, int arg1) {
      try {
         class80 var3 = this.field8773;
         synchronized(this.field8773) {
            this.field8773.method726(arg1, 25324);
            int var4 = -113 / ((32 - arg0) / 53);
         }

         ++field8777;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8784[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "c",
      descriptor = "(B)V",
      line = 91
   )
   public static void method4340(byte arg0) {
      try {
         field8779 = null;
         field8782 = null;
         int var1 = 115 / ((arg0 - 26) / 54);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8784[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 105
   )
   public class597(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field8781 = arg2;
         this.field8781.method2060(2, 1);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8784[0] + (arg0 != null ? field8784[1] : field8784[2]) + ',' + arg1 + ',' + (arg2 != null ? field8784[1] : field8784[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4341(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4342(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
