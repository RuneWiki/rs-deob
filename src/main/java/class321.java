import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class321 extends class758 {
   @OriginalMember(
      owner = "client!vt",
      name = "n",
      descriptor = "I"
   )
   private int field4286 = -1;
   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4287 = new String[]{method2418(method2417("Fh)4")), method2418(method2417("S3kvW")), method2418(method2417("^ik\u001c\u0002")), method2418(method2417("^ik\u001a\u0002")), method2418(method2417("^ik\u001d\u0002")), method2418(method2417("^ik\u0019\u0002"))};
   @OriginalMember(
      owner = "client!vt",
      name = "r",
      descriptor = "I"
   )
   public static int field4283;
   @OriginalMember(
      owner = "client!vt",
      name = "q",
      descriptor = "I"
   )
   public static int field4284;
   @OriginalMember(
      owner = "client!vt",
      name = "o",
      descriptor = "I"
   )
   public static int field4285;
   @OriginalMember(
      owner = "client!vt",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field4282;

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Lob;B)V"
   )
   public final void method1311(class772 arg0, byte arg1) {
      try {
         ++field4285;
         int var3 = 72 / ((arg1 - 54) / 57);
         arg0.method5528(311, this.field4286);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4287[3] + (arg0 != null ? field4287[1] : field4287[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method1313(class594 arg0, byte arg1) {
      try {
         this.field4286 = arg0.method4280(-19104);
         if (arg1 < -18) {
            ++field4284;
            arg0.method4288((byte)89);
            if (arg0.method4288((byte)91) != 255) {
               --arg0.field8243;
               arg0.method4304((byte)114);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4287[5] + (arg0 != null ? field4287[1] : field4287[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Leb;II)I"
   )
   public static final int method2415(class657 arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1) {
            return 113;
         } else {
            ++field4283;
            if (!client.method2396(arg0).method3162((byte)118, arg1) && arg0.field9346 == null) {
               return -1;
            } else {
               return arg0.field9337 != null && arg0.field9337.length > arg1 ? arg0.field9337[arg1] : -1;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4287[2] + (arg0 != null ? field4287[1] : field4287[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2416(int arg0) {
      try {
         if (arg0 != -30843) {
            method2416(-2);
         }

         field4282 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4287[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2417(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2418(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
