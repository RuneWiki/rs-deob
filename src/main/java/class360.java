import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class360 extends class70 {
   @OriginalMember(
      owner = "client!kq",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5565 = new String[]{method2951(method2950("\u0007\f\u007f]\u0013")), method2951(method2950("\u0007\f\u007fZ\u0013")), method2951(method2950("\u0007\f\u007f_\u0013"))};
   @OriginalMember(
      owner = "client!kq",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field5561 = new int[13];
   @OriginalMember(
      owner = "client!kq",
      name = "H",
      descriptor = "Lnaa;"
   )
   public static class113 field5562 = new class113(32, -1);
   @OriginalMember(
      owner = "client!kq",
      name = "K",
      descriptor = "F"
   )
   public static float field5563;
   @OriginalMember(
      owner = "client!kq",
      name = "J",
      descriptor = "I"
   )
   public static int field5559;
   @OriginalMember(
      owner = "client!kq",
      name = "I",
      descriptor = "I"
   )
   public static int field5560;
   @OriginalMember(
      owner = "client!kq",
      name = "G",
      descriptor = "Ljq;"
   )
   public static class672 field5564;

   @OriginalMember(
      owner = "client!kq",
      name = "b",
      descriptor = "(III)I",
      line = 3
   )
   private final int method2948(int arg0, int arg1, int arg2) {
      try {
         ++field5559;
         if (arg0 != -1376312589) {
            this.method8((byte)47, -110);
         }

         int var4 = arg2 - -(arg1 * 57);
         int var5 = var4 ^ var4 << 1;
         return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144) + 4096;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5565[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "<init>",
      descriptor = "()V",
      line = 18
   )
   public class360() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(BI)[I",
      line = 21
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field5560;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int var5 = class204.field3113[arg1];
            int var6 = 0;
            if (var3 || class678.field10127 > var6) {
               do {
                  var4[var6] = this.method2948(-1376312589, var5, class199.field3060[var6]) % 4096;
                  ++var6;
               } while(class678.field10127 > var6);
            }
         }

         if (arg0 != 87) {
            field5562 = null;
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5565[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "b",
      descriptor = "(Z)V",
      line = 54
   )
   public static void method2949(boolean arg0) {
      try {
         field5562 = null;
         field5564 = null;
         if (!arg0) {
            field5562 = null;
         }

         field5561 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5565[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2950(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2951(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
