import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class541 {
   @OriginalMember(
      owner = "client!laa",
      name = "n",
      descriptor = "I"
   )
   public int field8154 = 443;
   @OriginalMember(
      owner = "client!laa",
      name = "f",
      descriptor = "I"
   )
   public int field8155 = 43594;
   @OriginalMember(
      owner = "client!laa",
      name = "l",
      descriptor = "Z"
   )
   private boolean field8158 = true;
   @OriginalMember(
      owner = "client!laa",
      name = "j",
      descriptor = "Z"
   )
   private boolean field8159 = false;
   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8162 = new String[]{method4140(method4139("u\u007f\u0000!N1")), method4140(method4139("u\u007f\u0000!O1")), method4140(method4139("b0O!w")), method4140(method4139("wk\rc")), method4140(method4139("u\u007f\u0000!I1")), method4140(method4139("u\u007f\u0000!H1")), method4140(method4139("u\u007f\u0000!K1"))};
   @OriginalMember(
      owner = "client!laa",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field8157 = new int[1000];
   @OriginalMember(
      owner = "client!laa",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field8149 = false;
   @OriginalMember(
      owner = "client!laa",
      name = "c",
      descriptor = "Ldha;"
   )
   public static class642 field8148 = new class642("", 21);
   @OriginalMember(
      owner = "client!laa",
      name = "d",
      descriptor = "I"
   )
   public int field8150;
   @OriginalMember(
      owner = "client!laa",
      name = "h",
      descriptor = "I"
   )
   public static int field8151;
   @OriginalMember(
      owner = "client!laa",
      name = "k",
      descriptor = "I"
   )
   public static int field8153;
   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "I"
   )
   public static int field8156;
   @OriginalMember(
      owner = "client!laa",
      name = "m",
      descriptor = "I"
   )
   public static int field8160;
   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "I"
   )
   public static int field8161;
   @OriginalMember(
      owner = "client!laa",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field8152;

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Z)V",
      line = 8
   )
   public static void method4134(boolean arg0) {
      try {
         if (!arg0) {
            field8148 = null;
            field8157 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8162[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Llaa;B)Z",
      line = 23
   )
   public final boolean method4135(class541 arg0, byte arg1) {
      try {
         if (arg1 <= 6) {
            this.field8159 = true;
         }

         ++field8153;
         if (arg0 == null) {
            return false;
         } else {
            return ~this.field8150 == ~arg0.field8150 && this.field8152.equals(arg0.field8152);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8162[6] + (arg0 != null ? field8162[2] : field8162[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(I)V",
      line = 40
   )
   public final void method4136(int arg0) {
      boolean var2 = client.field1786;

      try {
         label34: {
            ++field8161;
            if (!this.field8158) {
               this.field8158 = true;
               this.field8159 = true;
               if (!var2) {
                  break label34;
               }
            }

            if (this.field8159) {
               this.field8159 = false;
               if (!var2) {
                  break label34;
               }
            }

            this.field8158 = false;
         }

         if (arg0 != 43594) {
            this.field8150 = -38;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8162[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(ILsu;)Lbja;",
      line = 74
   )
   public final class275 method4137(int arg0, class289 arg1) {
      try {
         if (arg0 != 443) {
            this.field8150 = 88;
         }

         ++field8151;
         return arg1.method2430((byte)-6, !this.field8158 ? this.field8155 : this.field8154, this.field8159, this.field8152);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8162[4] + arg0 + ',' + (arg1 != null ? field8162[2] : field8162[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "(I)V",
      line = 89
   )
   public static final void method4138(int arg0) {
      try {
         class465.field7069 = 0;
         class207.field3159 = new class760[50];
         ++field8156;
         if (arg0 != 1000) {
            field8149 = true;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8162[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4139(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4140(char[] arg0) {
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
            var10005 = 30;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
