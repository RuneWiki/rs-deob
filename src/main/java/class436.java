import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class436 extends class345 {
   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6301 = new String[]{method3279(method3278("\u0001@lKJ")), method3279(method3278("\u0001@lNJ")), method3279(method3278("\u0001@lJJ")), method3279(method3278("\u0001@lIJ")), method3279(method3278("\u0001@lLJ")), method3279(method3278("\u0001@lOJ"))};
   @OriginalMember(
      owner = "client!nv",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field6294 = false;
   @OriginalMember(
      owner = "client!nv",
      name = "n",
      descriptor = "I"
   )
   public static int field6295;
   @OriginalMember(
      owner = "client!nv",
      name = "j",
      descriptor = "I"
   )
   public static int field6296;
   @OriginalMember(
      owner = "client!nv",
      name = "o",
      descriptor = "I"
   )
   public static int field6298;
   @OriginalMember(
      owner = "client!nv",
      name = "i",
      descriptor = "I"
   )
   public static int field6299;
   @OriginalMember(
      owner = "client!nv",
      name = "m",
      descriptor = "I"
   )
   public static int field6300;
   @OriginalMember(
      owner = "client!nv",
      name = "k",
      descriptor = "Lnf;"
   )
   public static class601 field6297;

   @OriginalMember(
      owner = "client!nv",
      name = "c",
      descriptor = "(I)V",
      line = 8
   )
   public static void method3276(int arg0) {
      try {
         if (arg0 != -3) {
            field6294 = false;
         }

         field6297 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6301[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(Z)I",
      line = 19
   )
   public final int method3277(boolean arg0) {
      try {
         if (arg0) {
            this.method54(14, (byte)-40);
         }

         ++field6295;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6301[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Z)I",
      line = 30
   )
   public final int method53(boolean arg0) {
      try {
         ++field6300;
         if (arg0) {
            this.method52((byte)-7, 90);
         }

         return 2;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6301[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(BI)I",
      line = 41
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 > -45) {
            this.method53(false);
         }

         ++field6296;
         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6301[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 53
   )
   public class436(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nv",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 57
   )
   public class436(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(I)V",
      line = 60
   )
   public final void method51(int arg0) {
      try {
         ++field6298;
         if (super.field4914.field11167.method3445(false) && super.field4913 == 2) {
            super.field4913 = 1;
         }

         if (super.field4913 < arg0 || ~super.field4913 < -3) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6301[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(IB)V",
      line = 76
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 < 99) {
            field6294 = false;
         }

         ++field6299;
         super.field4913 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6301[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3278(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3279(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
