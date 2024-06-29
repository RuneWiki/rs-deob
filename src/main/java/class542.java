import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class542 extends class775 {
   @OriginalMember(
      owner = "client!qf",
      name = "x",
      descriptor = "I"
   )
   private int field8164 = 0;
   @OriginalMember(
      owner = "client!qf",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   private String field8166 = null;
   @OriginalMember(
      owner = "client!qf",
      name = "A",
      descriptor = "J"
   )
   private long field8170 = -1L;
   @OriginalMember(
      owner = "client!qf",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8174 = new String[]{method4144(method4143("#l,\\\u000e")), method4144(method4143(")$,1[")), method4144(method4143("?oo}C bclNh")), method4144(method4143("<\u007fns")), method4144(method4143("rggrD7xl~K70")), method4144(method4143("#l,]\u000e")), method4144(method4143("#l,[\u000e")), method4144(method4143("#l,^\u000e"))};
   @OriginalMember(
      owner = "client!qf",
      name = "u",
      descriptor = "Luk;"
   )
   public static class498 field8167 = new class498(31, -1);
   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "Lnaa;"
   )
   public static class113 field8168 = new class113(75, -1);
   @OriginalMember(
      owner = "client!qf",
      name = "C",
      descriptor = "Luk;"
   )
   public static class498 field8172 = new class498(58, -2);
   @OriginalMember(
      owner = "client!qf",
      name = "t",
      descriptor = "I"
   )
   public static int field8163;
   @OriginalMember(
      owner = "client!qf",
      name = "v",
      descriptor = "I"
   )
   public static int field8165;
   @OriginalMember(
      owner = "client!qf",
      name = "B",
      descriptor = "I"
   )
   public static int field8169;
   @OriginalMember(
      owner = "client!qf",
      name = "D",
      descriptor = "Lrr;"
   )
   public static class678 field8171;
   @OriginalMember(
      owner = "client!qf",
      name = "y",
      descriptor = "Lrr;"
   )
   public static class678 field8173;

   @OriginalMember(
      owner = "client!qf",
      name = "b",
      descriptor = "(B)V",
      line = 3
   )
   public static void method4141(byte arg0) {
      try {
         field8168 = null;
         field8173 = null;
         field8171 = null;
         if (arg0 == 108) {
            field8172 = null;
            field8167 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8174[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 19
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         ++field8169;
         int var3 = 107 / ((-84 - arg1) / 34);
         if (~arg0.method2855(-31007) != -256) {
            --arg0.field5436;
            this.field8170 = arg0.method2898(32109);
         }

         this.field8166 = arg0.method2876(72);
         this.field8164 = arg0.method2848(-94);
         if (class40.field491) {
            System.out.println(field8174[2] + this.field8170 + field8174[4] + this.field8166);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8174[0] + (arg0 != null ? field8174[1] : field8174[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 39
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         ++field8163;
         arg0.method1929(this.field8164, this.field8166, this.field8170, -1);
         int var3 = 105 / ((arg1 - -23) / 45);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8174[7] + (arg0 != null ? field8174[1] : field8174[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(ZII)Z",
      line = 51
   )
   public static final boolean method4142(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            field8168 = null;
         }

         ++field8165;
         return ~(32768 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8174[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4143(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4144(char[] arg0) {
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
            var10005 = 10;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
