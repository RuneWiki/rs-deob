import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class409 extends class629 {
   @OriginalMember(
      owner = "client!lp",
      name = "E",
      descriptor = "I"
   )
   private int field6004 = 4096;
   @OriginalMember(
      owner = "client!lp",
      name = "H",
      descriptor = "I"
   )
   private int field6009 = 0;
   @OriginalMember(
      owner = "client!lp",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6011 = new String[]{method3136(method3135("JE d\u0006")), method3136(method3135("_\u001eb&")), method3136(method3135("]\u001b \u000fS")), method3136(method3135("]\u001b \u0000S")), method3136(method3135("]\u001b \u0007S"))};
   @OriginalMember(
      owner = "client!lp",
      name = "J",
      descriptor = "Luw;"
   )
   public static class435 field6003 = new class435(63, -1);
   @OriginalMember(
      owner = "client!lp",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field6005 = new int[3];
   @OriginalMember(
      owner = "client!lp",
      name = "I",
      descriptor = "I"
   )
   public static int field6008 = 0;
   @OriginalMember(
      owner = "client!lp",
      name = "K",
      descriptor = "I"
   )
   public static int field6006;
   @OriginalMember(
      owner = "client!lp",
      name = "G",
      descriptor = "I"
   )
   public static int field6007;
   @OriginalMember(
      owner = "client!lp",
      name = "F",
      descriptor = "Lpg;"
   )
   public static class762 field6010;

   @OriginalMember(
      owner = "client!lp",
      name = "g",
      descriptor = "(I)V",
      line = 5
   )
   public static void method3134(int arg0) {
      try {
         field6003 = null;
         if (arg0 > -90) {
            method3134(56);
         }

         field6010 = null;
         field6005 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6011[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 17
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label37: {
            label36: {
               if (~arg2 != -1) {
                  if (~arg2 != -2) {
                     break label37;
                  }

                  if (!var4) {
                     break label36;
                  }
               }

               this.field6009 = arg0.method3565(true);
               if (!var4) {
                  break label37;
               }
            }

            this.field6004 = arg0.method3565(true);
         }

         ++field6007;
         if (arg1 != 0) {
            this.field6009 = 19;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6011[2] + (arg0 != null ? field6011[0] : field6011[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "<init>",
      descriptor = "()V",
      line = 101
   )
   public class409() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!lp",
      name = "b",
      descriptor = "(II)[I",
      line = 65
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field6006;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            field6003 = null;
         }

         if (super.field9161.field7474) {
            int[] var5 = this.method4622((byte)127, 0, arg0);
            int var6 = 0;
            if (var3 || var6 < class66.field1214) {
               do {
                  int var7 = var5[var6];
                  var4[var6] = this.field6009 <= var7 ? (~var7 >= ~this.field6004 ? 4096 : 0) : 0;
                  ++var6;
               } while(var6 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6011[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3135(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3136(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
