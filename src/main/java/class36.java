import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 {
   @OriginalMember(
      owner = "client!tfa",
      name = "m",
      descriptor = "Z"
   )
   public boolean field887;
   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field893 = new String[]{method453(method452("\u0002\u001e\u00009T^")), method453(method452("\u0002\u001e\u00009R^")), method453(method452("\u0018\r\r{")), method453(method452("\u0002\u001e\u00009S^")), method453(method452("\rVO9k")), method453(method452("\u0014\u0013\u0000")), method453(method452("\u0002\u001e\u00009*\u001f\u0016\bc(^")), method453(method452("\u0002\u001e\u00009W^")), method453(method452("\u0002\u001e\u00009U^"))};
   @OriginalMember(
      owner = "client!tfa",
      name = "l",
      descriptor = "[Z"
   )
   public static boolean[] field892 = new boolean[100];
   @OriginalMember(
      owner = "client!tfa",
      name = "h",
      descriptor = "I"
   )
   public static int field880;
   @OriginalMember(
      owner = "client!tfa",
      name = "e",
      descriptor = "I"
   )
   public static int field881;
   @OriginalMember(
      owner = "client!tfa",
      name = "j",
      descriptor = "I"
   )
   public static int field882;
   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "I"
   )
   public static int field883;
   @OriginalMember(
      owner = "client!tfa",
      name = "i",
      descriptor = "I"
   )
   public static int field888;
   @OriginalMember(
      owner = "client!tfa",
      name = "g",
      descriptor = "I"
   )
   public static int field889;
   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "I"
   )
   public static int field890;
   @OriginalMember(
      owner = "client!tfa",
      name = "f",
      descriptor = "Lrn;"
   )
   public class280 field884;
   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "Lrn;"
   )
   public class280 field891;
   @OriginalMember(
      owner = "client!tfa",
      name = "k",
      descriptor = "Z"
   )
   public boolean field886;
   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "[Ltd;"
   )
   public static class476[] field885;

   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method447(int arg0) {
      try {
         ++field881;
         if (arg0 != 100) {
            return false;
         } else {
            return this.field886 && !this.field887;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field893[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;IB)Lal;"
   )
   public static final class108 method448(int arg0, Canvas arg1, int arg2, byte arg3) {
      try {
         ++field880;

         try {
            Class var4 = Class.forName(field893[5]);
            if (arg3 != -117) {
               field885 = null;
            }

            class108 var5 = (class108)var4.newInstance();
            var5.method1037(arg1, arg0, (byte)-37, arg2);
            return var5;
         } catch (Throwable var8) {
            class145 var6 = new class145();
            var6.method1037(arg1, arg0, (byte)37, arg2);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field893[3] + arg0 + ',' + (arg1 != null ? field893[4] : field893[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method449(int arg0) {
      try {
         if (arg0 != -13501) {
            method450(-116);
         }

         field892 = null;
         field885 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field893[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method450(int arg0) {
      try {
         if (arg0 != 100) {
            field882 = -12;
         }

         ++field889;
         return class475.field6939;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field893[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method451(int arg0) {
      try {
         ++field890;
         if (arg0 >= 3) {
            if (this.field891 != null) {
               this.field891.method574(29079);
            }

            this.field886 = false;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field893[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class36(boolean arg0) {
      try {
         this.field887 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field893[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method452(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method453(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
