import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class343 {
   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4662 = new String[]{method2521(method2520("`K\\t\u0012")), method2521(method2520("j\\\u001eZ")), method2521(method2520("MG\u0004WVmMRq`MyR^_eM\u0017D\u001b")), method2521(method2520("\u007f\u0007\\\u0018G")), method2521(method2520("MG\u0004WVmMRq`MyRUUiY\u0000SIwL\u0016\u0016^e]\u0013\u0017")), method2521(method2520("`K\\u\u0012")), method2521(method2520("`K\\w\u0012")), method2521(method2520("`K\\r\u0012"))};
   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "I"
   )
   public static int field4654 = 0;
   @OriginalMember(
      owner = "client!db",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field4656 = new class118(33, 4);
   @OriginalMember(
      owner = "client!db",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field4660 = new class118(7, 7);
   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "I"
   )
   public static int field4655;
   @OriginalMember(
      owner = "client!db",
      name = "g",
      descriptor = "I"
   )
   public static int field4658;
   @OriginalMember(
      owner = "client!db",
      name = "h",
      descriptor = "I"
   )
   public static int field4659;
   @OriginalMember(
      owner = "client!db",
      name = "d",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field4657;
   @OriginalMember(
      owner = "client!db",
      name = "e",
      descriptor = "[Lqu;"
   )
   public static class106[] field4661;

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(B[B)[B"
   )
   public final byte[] method2516(byte arg0, byte[] arg1) {
      try {
         ++field4658;
         class147 var3 = new class147(arg1);
         var3.field1856 = arg1.length - 4;
         int var4 = var3.method1153(32);
         byte[] var5 = new byte[var4];
         var3.field1856 = 0;
         if (arg0 != -99) {
            this.method2517((class147)null, (byte)3, (byte[])null);
         }

         this.method2517(var3, (byte)110, var5);
         return var5;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4662[7] + arg0 + ',' + (arg1 != null ? field4662[3] : field4662[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(Lwf;B[B)V"
   )
   public final void method2517(class147 arg0, byte arg1, byte[] arg2) {
      try {
         if (arg1 != 110) {
            this.method2517((class147)null, (byte)-110, (byte[])null);
         }

         ++field4659;
         if (~arg0.field1889[arg0.field1856] == -32 && arg0.field1889[arg0.field1856 + 1] == -117) {
            if (this.field4657 == null) {
               this.field4657 = new Inflater(true);
            }

            try {
               this.field4657.setInput(arg0.field1889, arg0.field1856 + 10, arg0.field1889.length - 10 - (arg0.field1856 + 8));
               this.field4657.inflate(arg2);
            } catch (Exception var5) {
               this.field4657.reset();
               throw new RuntimeException(field4662[4]);
            }

            this.field4657.reset();
         } else {
            throw new RuntimeException(field4662[2]);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4662[5] + (arg0 != null ? field4662[3] : field4662[1]) + ',' + arg1 + ',' + (arg2 != null ? field4662[3] : field4662[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "()V"
   )
   public class343() {
      this(-1, 1000000, 1000000);
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method2518(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            field4656 = null;
         }

         ++field4655;
         return (50560 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4662[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2519(boolean arg0) {
      try {
         field4661 = null;
         if (!arg0) {
            field4660 = null;
            field4656 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4662[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "(III)V"
   )
   private class343(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2520(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2521(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
