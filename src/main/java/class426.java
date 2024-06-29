import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class426 {
   @OriginalMember(
      owner = "client!taa",
      name = "d",
      descriptor = "[Lkv;"
   )
   public class281[] field6174;
   @OriginalMember(
      owner = "client!taa",
      name = "b",
      descriptor = "Liia;"
   )
   public class95 field6171;
   @OriginalMember(
      owner = "client!taa",
      name = "e",
      descriptor = "[Lkv;"
   )
   public class281[] field6176;
   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "Liia;"
   )
   public class95 field6177;
   @OriginalMember(
      owner = "client!taa",
      name = "h",
      descriptor = "Liia;"
   )
   public class95 field6178;
   @OriginalMember(
      owner = "client!taa",
      name = "c",
      descriptor = "Z"
   )
   public boolean field6173;
   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6179 = new String[]{method3224(method3223("-\u001e?\u000bNq")), method3224(method3223("7\n2I")), method3224(method3223("-\u001e?\u000b30\u00117Q1q")), method3224(method3223("\"Qp\u000br"))};
   @OriginalMember(
      owner = "client!taa",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field6172 = new int[1];
   @OriginalMember(
      owner = "client!taa",
      name = "g",
      descriptor = "[Ltd;"
   )
   public static class476[] field6175;

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3222(byte arg0) {
      try {
         field6175 = null;
         field6172 = null;
         if (arg0 != -117) {
            method3222((byte)-34);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6179[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "<init>",
      descriptor = "(Lrk;)V"
   )
   public class426(class35 arg0) {
      boolean var2 = client.field4564;
      super();
      this.field6174 = null;
      this.field6171 = null;
      this.field6176 = null;
      this.field6177 = null;
      this.field6178 = null;

      try {
         this.field6173 = arg0.field811;
         class586.method4343(89, arg0);
         if (!this.field6173) {
            int var10000;
            label52: {
               this.field6174 = new class281[16];
               int var3 = 0;
               if (var2) {
                  var10000 = 32768;
               } else if (~var3 <= -17) {
                  this.field6176 = new class281[16];
                  var10000 = 0;
                  if (!var2) {
                     break label52;
                  }
               } else {
                  var10000 = 32768;
               }

               while(true) {
                  byte[] var4 = class208.method1773(var10000, -61, var3 * 2 * 16384, class453.field6630);
                  this.field6174[var3] = new class281(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
                  ++var3;
                  if (~var3 <= -17) {
                     this.field6176 = new class281[16];
                     var10000 = 0;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = 32768;
                  }
               }
            }

            int var5 = var10000;
            if (var2 || ~var5 > -17) {
               do {
                  byte[] var6 = class208.method1773(32768, 118, var5 * 128 * 256, class296.field4152);
                  this.field6176[var5] = new class281(arg0, 3553, 6410, 128, 128, true, var6, 6410, false);
                  ++var5;
               } while(~var5 > -17);

            }
         } else {
            byte[] var7 = class167.method1515((byte)99, class453.field6630, false);
            this.field6178 = new class95(arg0, 6410, 128, 128, 16, var7, 6410);
            byte[] var8 = class167.method1515((byte)99, class296.field4152, false);
            this.field6171 = new class95(arg0, 6410, 128, 128, 16, var8, 6410);
            class442 var9 = arg0.field729;
            if (var9.method3325(35632)) {
               class95 var11;
               label68: {
                  byte[] var10 = class167.method1515((byte)99, class492.field7166, false);
                  this.field6177 = new class95(arg0, 6408, 128, 128, 16);
                  var11 = new class95(arg0, 6409, 128, 128, 16, var10, 6409);
                  if (var9.method3329(2.0F, this.field6177, var11, 0)) {
                     this.field6177.method5133((byte)-126);
                     if (!var2) {
                        break label68;
                     }
                  }

                  this.field6177.method5126(10240);
                  this.field6177 = null;
               }

               var11.method5126(10240);
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field6179[2] + (arg0 != null ? field6179[3] : field6179[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3223(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3224(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
