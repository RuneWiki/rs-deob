import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public abstract class class557 {
   @OriginalMember(
      owner = "client!gba",
      name = "g",
      descriptor = "Loea;"
   )
   public class647 field7906;
   @OriginalMember(
      owner = "client!gba",
      name = "f",
      descriptor = "I"
   )
   public int field7905;
   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7910 = new String[]{method4150(method4149("s\u0004\u0015\n~<")), method4150(method4149("s\u0004\u0015\n}<")), method4150(method4149("z\u0013\u0018H")), method4150(method4149("s\u0004\u0015\n\f}\b\u001dP\u000e<")), method4150(method4149("oHZ\nM"))};
   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field7907 = new int[32];
   @OriginalMember(
      owner = "client!gba",
      name = "d",
      descriptor = "Lhha;"
   )
   public static class724 field7908;
   @OriginalMember(
      owner = "client!gba",
      name = "c",
      descriptor = "F"
   )
   public static float field7903;
   @OriginalMember(
      owner = "client!gba",
      name = "e",
      descriptor = "I"
   )
   public static int field7904;
   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "I"
   )
   public static int field7909;

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method98(byte arg0);

   @OriginalMember(
      owner = "client!gba",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method97(int arg0);

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method4147(int arg0, byte arg1) {
      try {
         ++field7904;
         if (~this.method92(1, arg0) != -4) {
            this.method99(arg0, true);
         }

         if (arg1 != -7) {
            this.field7906 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7910[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method99(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(II)I"
   )
   public abstract int method92(int arg0, int arg1);

   @OriginalMember(
      owner = "client!gba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4148(int arg0) {
      try {
         if (arg0 != 61) {
            method4148(-27);
         }

         field7908 = null;
         field7907 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7910[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class557(class647 arg0) {
      try {
         this.field7906 = arg0;
         this.field7905 = this.method97(0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7910[3] + (arg0 != null ? field7910[4] : field7910[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gba",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class557(int arg0, class647 arg1) {
      try {
         this.field7905 = arg0;
         this.field7906 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7910[3] + arg0 + ',' + (arg1 != null ? field7910[4] : field7910[2]) + ')');
      }
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field7907[var1] = var0 + -1;
         var0 += var0;
      }

      field7908 = new class724(61, -1);
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4149(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4150(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
