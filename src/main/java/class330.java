import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class330 {
   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4498 = new String[]{method2444(method2443(":)8\u000f9")), method2444(method2443(":)8\u000e9")), method2444(method2443(":)8\t9")), method2444(method2443(":)8\f9"))};
   @OriginalMember(
      owner = "client!wt",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field4492 = new class118(90, 6);
   @OriginalMember(
      owner = "client!wt",
      name = "f",
      descriptor = "I"
   )
   public static int field4497 = 0;
   @OriginalMember(
      owner = "client!wt",
      name = "g",
      descriptor = "I"
   )
   public static int field4491;
   @OriginalMember(
      owner = "client!wt",
      name = "d",
      descriptor = "I"
   )
   public static int field4493;
   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "I"
   )
   public static int field4494;
   @OriginalMember(
      owner = "client!wt",
      name = "e",
      descriptor = "I"
   )
   public static int field4495;
   @OriginalMember(
      owner = "client!wt",
      name = "b",
      descriptor = "I"
   )
   public static int field4496;

   @OriginalMember(
      owner = "client!wt",
      name = "b",
      descriptor = "(II)I",
      line = 7
   )
   public static final int method2439(int arg0, int arg1) {
      try {
         int var2 = -34 / ((arg1 - -75) / 41);
         ++field4493;
         return arg0 >> 11 & 127;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4498[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(I)V",
      line = 44
   )
   public static void method2440(int arg0) {
      try {
         field4492 = null;
         if (arg0 >= -67) {
            method2440(-50);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4498[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(IIB)Z",
      line = 60
   )
   public static final boolean method2441(int arg0, int arg1, byte arg2) {
      try {
         ++field4491;
         if (arg2 < 66) {
            method2440(-56);
         }

         return ~(55 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4498[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(II)I",
      line = 75
   )
   public static final int method2442(int arg0, int arg1) {
      try {
         if (arg1 >= -52) {
            method2441(-62, -1, (byte)-92);
         }

         ++field4494;
         return ~arg0 == -16711936 ? -1 : class743.method5381(arg0, (byte)-127);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4498[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2443(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2444(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
