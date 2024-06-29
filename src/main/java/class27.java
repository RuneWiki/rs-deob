import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 {
   @OriginalMember(
      owner = "client!fba",
      name = "g",
      descriptor = "Lgw;"
   )
   private class179 field406 = new class179(256);
   @OriginalMember(
      owner = "client!fba",
      name = "c",
      descriptor = "Lhw;"
   )
   private class141 field409;
   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field412 = new String[]{method196(method195("4\u001b\u001e\thz")), method196(method195("4\u001b\u001e\tnz")), method196(method195("4\u001b\u001e\tiz")), method196(method195("4\u001b\u001e\tlz")), method196(method195("4\u001b\u001e\tkz")), method196(method195("<\f\u0013K")), method196(method195("4\u001b\u001e\t\u0011;\u0017\u0016S\u0013z")), method196(method195(")WQ\tP")), method196(method195("4\u001b\u001e\toz"))};
   @OriginalMember(
      owner = "client!fba",
      name = "e",
      descriptor = "Luw;"
   )
   public static class435 field404 = new class435(39, 15);
   @OriginalMember(
      owner = "client!fba",
      name = "f",
      descriptor = "I"
   )
   public static int field405;
   @OriginalMember(
      owner = "client!fba",
      name = "b",
      descriptor = "I"
   )
   public static int field407;
   @OriginalMember(
      owner = "client!fba",
      name = "h",
      descriptor = "I"
   )
   public static int field408;
   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "I"
   )
   public static int field410;
   @OriginalMember(
      owner = "client!fba",
      name = "d",
      descriptor = "I"
   )
   public static int field411;

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method189(int arg0, int arg1) {
      try {
         ++field407;
         class179 var3 = this.field406;
         synchronized(this.field406) {
            if (arg0 <= 71) {
               this.method190(true);
            }

            this.field406.method1579(-103, arg1);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field412[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method190(boolean arg0) {
      try {
         class179 var2 = this.field406;
         synchronized(this.field406) {
            this.field406.method1591((byte)58);
         }

         ++field411;
         if (!arg0) {
            this.field409 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field412[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method191(int arg0, byte arg1, int arg2) {
      try {
         ++field408;
         if (arg1 > -109) {
            field404 = null;
         }

         return ~(arg0 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field412[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method192(byte arg0) {
      try {
         int var1 = 67 / ((arg0 - -42) / 63);
         field404 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field412[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "b",
      descriptor = "(II)Lpt;"
   )
   public final class554 method193(int arg0, int arg1) {
      try {
         ++field410;
         class179 var3 = this.field406;
         class554 var4;
         synchronized(this.field406) {
            var4 = (class554)this.field406.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg1 != 7073) {
               this.field409 = null;
            }

            class141 var5 = this.field409;
            byte[] var6;
            synchronized(this.field409) {
               var6 = this.field409.method1347((byte)122, 26, arg0);
            }

            class554 var7 = new class554();
            if (var6 != null) {
               var7.method4138(-17, new class473(var6));
            }

            class179 var8 = this.field406;
            synchronized(this.field406) {
               this.field406.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field412[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method194(byte arg0) {
      try {
         class179 var2 = this.field406;
         synchronized(this.field406) {
            if (arg0 != -73) {
               return;
            }

            this.field406.method1589((byte)98);
         }

         ++field405;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field412[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class27(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field409 = arg2;
         this.field409.method1346(26, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field412[6] + (arg0 != null ? field412[7] : field412[5]) + ',' + arg1 + ',' + (arg2 != null ? field412[7] : field412[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method195(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method196(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
