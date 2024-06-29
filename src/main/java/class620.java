import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class620 {
   @OriginalMember(
      owner = "client!th",
      name = "i",
      descriptor = "Lgw;"
   )
   private class179 field9006 = new class179(64);
   @OriginalMember(
      owner = "client!th",
      name = "h",
      descriptor = "Lhw;"
   )
   private class141 field9002;
   @OriginalMember(
      owner = "client!th",
      name = "e",
      descriptor = "I"
   )
   public int field9011;
   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9012 = new String[]{method4537(method4536("T@6\u007f")), method4537(method4536("A\u001bt=q")), method4537(method4536("N]t/eT\\.-$")), method4537(method4536("N]tW$")), method4537(method4536("N]tR$")), method4537(method4536("N]tQ$")), method4537(method4536("NW(vjHP){")), method4537(method4536("N]tP$"))};
   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "Lgh;"
   )
   public static class572 field9001 = new class572(56, 6);
   @OriginalMember(
      owner = "client!th",
      name = "b",
      descriptor = "Lgh;"
   )
   public static class572 field9007 = new class572(106, -1);
   @OriginalMember(
      owner = "client!th",
      name = "j",
      descriptor = "I"
   )
   public static int field9008 = 0;
   @OriginalMember(
      owner = "client!th",
      name = "k",
      descriptor = "I"
   )
   public static int field9010 = 0;
   @OriginalMember(
      owner = "client!th",
      name = "d",
      descriptor = "I"
   )
   public static int field9003;
   @OriginalMember(
      owner = "client!th",
      name = "g",
      descriptor = "I"
   )
   public static int field9004;
   @OriginalMember(
      owner = "client!th",
      name = "c",
      descriptor = "I"
   )
   public static int field9005;
   @OriginalMember(
      owner = "client!th",
      name = "f",
      descriptor = "I"
   )
   public static int field9009;

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IB)Lgb;",
      line = 4
   )
   public final class224 method4532(int arg0, byte arg1) {
      try {
         ++field9003;
         class179 var3 = this.field9006;
         class224 var4;
         synchronized(this.field9006) {
            var4 = (class224)this.field9006.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field9002;
            byte[] var6;
            synchronized(this.field9002) {
               var6 = this.field9002.method1347((byte)127, 19, arg0);
            }

            class224 var7 = new class224();
            if (arg1 != -43) {
               this.method4532(97, (byte)-5);
            }

            if (var6 != null) {
               var7.method1877(17089, new class473(var6));
            }

            class179 var8 = this.field9006;
            synchronized(this.field9006) {
               this.field9006.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field9012[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IC)Z",
      line = 34
   )
   public static final boolean method4533(int arg0, char arg1) {
      try {
         ++field9005;
         if (arg0 <= 23) {
            method4533(-41, (char)65528);
         }

         return arg1 == 160 || ~arg1 == -33 || arg1 == '_' || ~arg1 == -46;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9012[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "b",
      descriptor = "(B)V",
      line = 48
   )
   public static final void method4534(byte arg0) {
      try {
         ++field9004;
         if (class409.field6010 != class402.field5938) {
            try {
               class575.method4254(class490.field7150, (byte)16, field9012[6]);
            } catch (Throwable var2) {
            }

            if (arg0 >= -6) {
               field9010 = -84;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9012[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(B)V",
      line = 76
   )
   public static void method4535(byte arg0) {
      try {
         if (arg0 != 1) {
            field9010 = 83;
         }

         field9007 = null;
         field9001 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9012[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V",
      line = 105
   )
   public class620(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field9002 = arg2;
         this.field9011 = this.field9002.method1346(19, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9012[2] + (arg0 != null ? field9012[1] : field9012[0]) + ',' + arg1 + ',' + (arg2 != null ? field9012[1] : field9012[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4536(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4537(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
