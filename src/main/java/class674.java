import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class674 extends class294 {
   @OriginalMember(
      owner = "client!kw",
      name = "x",
      descriptor = "I"
   )
   public int field10023;
   @OriginalMember(
      owner = "client!kw",
      name = "p",
      descriptor = "I"
   )
   public int field10033;
   @OriginalMember(
      owner = "client!kw",
      name = "t",
      descriptor = "I"
   )
   public int field10026;
   @OriginalMember(
      owner = "client!kw",
      name = "o",
      descriptor = "I"
   )
   public int field10027;
   @OriginalMember(
      owner = "client!kw",
      name = "u",
      descriptor = "Z"
   )
   public boolean field10024;
   @OriginalMember(
      owner = "client!kw",
      name = "v",
      descriptor = "I"
   )
   public int field10028;
   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10035 = new String[]{method4969(method4968(",\u0017P\\<")), method4969(method4968("<NP1i")), method4969(method4968(")\u0015\u0012s")), method4969(method4968(",\u0017P#})\t\n!<")), method4969(method4968(",\u0017P^<")), method4969(method4968(",\u0017P]<"))};
   @OriginalMember(
      owner = "client!kw",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field10025 = new class498(138, 12);
   @OriginalMember(
      owner = "client!kw",
      name = "s",
      descriptor = "I"
   )
   public static int field10029;
   @OriginalMember(
      owner = "client!kw",
      name = "n",
      descriptor = "I"
   )
   public static int field10030;
   @OriginalMember(
      owner = "client!kw",
      name = "r",
      descriptor = "I"
   )
   public static int field10031;
   @OriginalMember(
      owner = "client!kw",
      name = "q",
      descriptor = "I"
   )
   public static int field10032;
   @OriginalMember(
      owner = "client!kw",
      name = "w",
      descriptor = "I"
   )
   public static int field10034;

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(Lrr;B)V",
      line = 5
   )
   public static final void method4965(class678 arg0, byte arg1) {
      try {
         if (arg1 != 90) {
            field10031 = -48;
         }

         ++field10034;
         class754.field11181 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10035[4] + (arg0 != null ? field10035[1] : field10035[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(IBLrr;Lrr;)V",
      line = 19
   )
   public static final void method4966(int arg0, byte arg1, class678 arg2, class678 arg3) {
      try {
         class404.field6317 = arg2;
         class137.field2000 = arg3;
         if (arg1 != 92) {
            method4965((class678)null, (byte)-21);
         }

         ++field10032;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10035[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10035[1] : field10035[2]) + ',' + (arg3 != null ? field10035[1] : field10035[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(B)V",
      line = 45
   )
   public static void method4967(byte arg0) {
      try {
         field10025 = null;
         if (arg0 != -50) {
            method4966(54, (byte)110, (class678)null, (class678)null);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10035[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "<init>",
      descriptor = "(IIIIIZ)V",
      line = 57
   )
   public class674(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         this.field10023 = arg3;
         this.field10033 = arg4;
         this.field10026 = arg1;
         this.field10027 = arg2;
         this.field10024 = arg5;
         this.field10028 = arg0;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field10035[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4968(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4969(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
