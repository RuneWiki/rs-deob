import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class661 implements class680 {
   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "Lsa;"
   )
   private class39 field9308;
   @OriginalMember(
      owner = "client!vd",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   private String field9305;
   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9309 = new String[]{method4800(method4799("B#\u0004\u001fq")), method4800(method4799("Oi\u0004r$")), method4800(method4799("Z2F0")), method4800(method4799("B#\u0004`0Z.^bq")), method4800(method4799("B#\u0004\u001dq")), method4800(method4799("B#\u0004\u001eq"))};
   @OriginalMember(
      owner = "client!vd",
      name = "e",
      descriptor = "I"
   )
   public static int field9302 = 0;
   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "J"
   )
   public static long field9306 = 0L;
   @OriginalMember(
      owner = "client!vd",
      name = "g",
      descriptor = "I"
   )
   public static int field9303;
   @OriginalMember(
      owner = "client!vd",
      name = "d",
      descriptor = "I"
   )
   public static int field9304;
   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "I"
   )
   public static int field9307;

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(B)Leo;"
   )
   public final class344 method1760(byte arg0) {
      try {
         ++field9304;
         if (arg0 != 54) {
            field9302 = 41;
         }

         return class344.field5064;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9309[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1763(byte arg0) {
      try {
         if (arg0 >= -66) {
            return -12;
         } else {
            ++field9303;
            return this.field9308.method463((byte)-126, this.field9305) ? 100 : this.field9308.method464(this.field9305, (byte)-111);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9309[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method4798(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vd",
      name = "<init>",
      descriptor = "(Lsa;Ljava/lang/String;)V"
   )
   public class661(class39 arg0, String arg1) {
      try {
         this.field9308 = arg0;
         this.field9305 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9309[3] + (arg0 != null ? field9309[1] : field9309[2]) + ',' + (arg1 != null ? field9309[1] : field9309[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4799(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4800(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
