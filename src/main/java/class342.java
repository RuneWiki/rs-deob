import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class342 {
   @OriginalMember(
      owner = "client!rm",
      name = "d",
      descriptor = "I"
   )
   public int field5031 = 128;
   @OriginalMember(
      owner = "client!rm",
      name = "h",
      descriptor = "I"
   )
   public int field5042 = 128;
   @OriginalMember(
      owner = "client!rm",
      name = "g",
      descriptor = "I"
   )
   public int field5039;
   @OriginalMember(
      owner = "client!rm",
      name = "l",
      descriptor = "I"
   )
   public int field5041;
   @OriginalMember(
      owner = "client!rm",
      name = "m",
      descriptor = "I"
   )
   public int field5032;
   @OriginalMember(
      owner = "client!rm",
      name = "i",
      descriptor = "I"
   )
   public int field5037;
   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5044 = new String[]{method2726(method2725("k# d`w'zf!")), method2726(method2725("k# \u0019!")), method2726(method2725("w;b4")), method2726(method2725("b` vt")), method2726(method2725("k# \u001a!"))};
   @OriginalMember(
      owner = "client!rm",
      name = "e",
      descriptor = "I"
   )
   public static int field5033;
   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "I"
   )
   public int field5034;
   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "I"
   )
   public int field5035;
   @OriginalMember(
      owner = "client!rm",
      name = "j",
      descriptor = "I"
   )
   public int field5036;
   @OriginalMember(
      owner = "client!rm",
      name = "f",
      descriptor = "I"
   )
   public int field5038;
   @OriginalMember(
      owner = "client!rm",
      name = "c",
      descriptor = "I"
   )
   public int field5040;
   @OriginalMember(
      owner = "client!rm",
      name = "k",
      descriptor = "I"
   )
   public static int field5043;

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(I)Lrm;"
   )
   public final class342 method2723(int arg0) {
      try {
         if (arg0 != 128) {
            return null;
         } else {
            ++field5033;
            return new class342(this.field5039, this.field5031, this.field5042, this.field5037, this.field5041, this.field5032);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5044[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(ILrm;)V"
   )
   public final void method2724(int arg0, class342 arg1) {
      try {
         this.field5042 = arg1.field5042;
         this.field5037 = arg1.field5037;
         if (arg0 != 128) {
            this.method2723(-118);
         }

         ++field5043;
         this.field5031 = arg1.field5031;
         this.field5032 = arg1.field5032;
         this.field5039 = arg1.field5039;
         this.field5041 = arg1.field5041;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5044[4] + arg0 + ',' + (arg1 != null ? field5044[3] : field5044[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class342(int arg0) {
      try {
         this.field5039 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5044[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field5041 = arg4;
         this.field5039 = arg0;
         this.field5042 = arg2;
         this.field5032 = arg5;
         this.field5037 = arg3;
         this.field5031 = arg1;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5044[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2725(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2726(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
