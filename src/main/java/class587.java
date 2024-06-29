import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class587 extends class305 {
   @OriginalMember(
      owner = "client!via",
      name = "N",
      descriptor = "J"
   )
   public long field8492;
   @OriginalMember(
      owner = "client!via",
      name = "L",
      descriptor = "Ljava/lang/String;"
   )
   public String field8486;
   @OriginalMember(
      owner = "client!via",
      name = "M",
      descriptor = "J"
   )
   public long field8494;
   @OriginalMember(
      owner = "client!via",
      name = "x",
      descriptor = "Z"
   )
   public boolean field8490;
   @OriginalMember(
      owner = "client!via",
      name = "y",
      descriptor = "I"
   )
   public int field8482;
   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "Z"
   )
   public boolean field8476;
   @OriginalMember(
      owner = "client!via",
      name = "Q",
      descriptor = "Z"
   )
   public boolean field8479;
   @OriginalMember(
      owner = "client!via",
      name = "F",
      descriptor = "I"
   )
   public int field8491;
   @OriginalMember(
      owner = "client!via",
      name = "w",
      descriptor = "I"
   )
   public int field8483;
   @OriginalMember(
      owner = "client!via",
      name = "D",
      descriptor = "Ljava/lang/String;"
   )
   public String field8477;
   @OriginalMember(
      owner = "client!via",
      name = "K",
      descriptor = "I"
   )
   public int field8485;
   @OriginalMember(
      owner = "client!via",
      name = "A",
      descriptor = "I"
   )
   public int field8489;
   @OriginalMember(
      owner = "client!via",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8495 = new String[]{method4353(method4352("\u00074\u00021")), method4353(method4352("\u001f(\u000fs=\u0000/\u0007)?A")), method4353(method4352("\u0012o@s|")), method4353(method4352("\u001f(\u000fsBA")), method4353(method4352("\u001f(\u000fsCA")), method4353(method4352("\u001f(\u000fs@A"))};
   @OriginalMember(
      owner = "client!via",
      name = "I",
      descriptor = "[[F"
   )
   public static float[][] field8478 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   @OriginalMember(
      owner = "client!via",
      name = "J",
      descriptor = "Lqda;"
   )
   public static class112 field8481 = new class112();
   @OriginalMember(
      owner = "client!via",
      name = "C",
      descriptor = "I"
   )
   public static int field8484;
   @OriginalMember(
      owner = "client!via",
      name = "H",
      descriptor = "I"
   )
   public static int field8487;
   @OriginalMember(
      owner = "client!via",
      name = "v",
      descriptor = "I"
   )
   public static int field8488;
   @OriginalMember(
      owner = "client!via",
      name = "G",
      descriptor = "Ltd;"
   )
   public static class476 field8493;
   @OriginalMember(
      owner = "client!via",
      name = "P",
      descriptor = "Ljava/lang/String;"
   )
   public String field8480;

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4349(byte arg0) {
      try {
         field8493 = null;
         field8481 = null;
         field8478 = null;
         if (arg0 > -92) {
            method4350(28);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8495[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "h",
      descriptor = "(I)I"
   )
   public static final int method4350(int arg0) {
      try {
         if (arg0 != 100) {
            return -52;
         } else {
            ++field8487;
            int var1 = class195.field2948.method3251(19);
            if (class262.field3735.length + -1 > var1) {
               class195.field2948 = class262.field3735[var1 + 1];
            }

            return 100;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8495[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(I)Lsda;"
   )
   public static final class269 method4351(int arg0) {
      try {
         ++field8488;
         if (class370.field5489 != null && class98.field1551 != null) {
            class98.field1551.method4997(class370.field5489, (byte)-25);
            class269 var1 = (class269)class98.field1551.method5000((byte)98);
            if (var1 == null) {
               return null;
            } else {
               if (arg0 != 1) {
                  field8484 = -91;
               }

               class155 var2 = class370.field5480.method3207(var1.field3806, 36);
               return var2 != null && var2.field2476 && var2.method1433(class370.field5483, -21) ? var1 : class790.method5685(-1);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8495[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V"
   )
   public class587(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      try {
         this.field8492 = arg10;
         this.field8486 = arg0;
         this.field8494 = arg5;
         this.field8490 = arg8;
         this.field8482 = arg2;
         this.field8476 = arg11;
         this.field8479 = arg9;
         this.field8491 = arg4;
         this.field8483 = arg7;
         this.field8477 = arg1;
         this.field8485 = arg3;
         this.field8489 = arg6;
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field8495[1] + (arg0 != null ? field8495[2] : field8495[0]) + ',' + (arg1 != null ? field8495[2] : field8495[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
