import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class505 extends class606 {
   @OriginalMember(
      owner = "client!uk",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7192 = new String[]{method3811(method3810("7g0c7")), method3811(method3810("7g0e7")), method3811(method3810("7g0\u001cv,ej\u001e7")), method3811(method3810(",yrL")), method3811(method3810("7g0a7")), method3811(method3810("9\"0\u000eb")), method3811(method3810("7g0b7"))};
   @OriginalMember(
      owner = "client!uk",
      name = "G",
      descriptor = "[[[I"
   )
   public static int[][][] field7191 = new int[2][][];
   @OriginalMember(
      owner = "client!uk",
      name = "J",
      descriptor = "I"
   )
   public static int field7184;
   @OriginalMember(
      owner = "client!uk",
      name = "K",
      descriptor = "I"
   )
   private int field7185;
   @OriginalMember(
      owner = "client!uk",
      name = "L",
      descriptor = "I"
   )
   public static int field7186;
   @OriginalMember(
      owner = "client!uk",
      name = "E",
      descriptor = "I"
   )
   private int field7187;
   @OriginalMember(
      owner = "client!uk",
      name = "H",
      descriptor = "I"
   )
   private int field7188;
   @OriginalMember(
      owner = "client!uk",
      name = "D",
      descriptor = "I"
   )
   public static int field7190;
   @OriginalMember(
      owner = "client!uk",
      name = "I",
      descriptor = "Lrca;"
   )
   public static class725 field7189;

   @OriginalMember(
      owner = "client!uk",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class505(int arg0) {
      super(0, false);

      try {
         this.method3809(16711680, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7192[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3808(int arg0) {
      try {
         if (arg0 < -98) {
            field7189 = null;
            field7191 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7192[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "(II)V"
   )
   private final void method3809(int arg0, int arg1) {
      try {
         ++field7186;
         this.field7187 = (arg1 & arg0) >> 12;
         this.field7185 = (255 & arg1) << 4;
         this.field7188 = (65280 & arg1) >> 4;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7192[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "<init>",
      descriptor = "()V"
   )
   public class505() {
      this(0);
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         if (arg1 == 0) {
            this.method3809(16711680, arg0.method691((byte)-127));
         }

         ++field7184;
         if (arg2 >= -6) {
            field7191 = null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7192[4] + (arg0 != null ? field7192[5] : field7192[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field7190;
         if (arg0 != 373) {
            this.field7187 = 51;
         }

         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (super.field8649.field11043) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || var8 < class563.field8014) {
               do {
                  var5[var8] = this.field7187;
                  var6[var8] = this.field7188;
                  var7[var8] = this.field7185;
                  ++var8;
               } while(var8 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7192[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3810(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3811(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
