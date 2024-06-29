import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class552 extends class428 {
   @OriginalMember(
      owner = "client!sf",
      name = "u",
      descriptor = "I"
   )
   private int field7914;
   @OriginalMember(
      owner = "client!sf",
      name = "x",
      descriptor = "I"
   )
   public int field7910;
   @OriginalMember(
      owner = "client!sf",
      name = "r",
      descriptor = "I"
   )
   public int field7920;
   @OriginalMember(
      owner = "client!sf",
      name = "y",
      descriptor = "I"
   )
   private int field7908;
   @OriginalMember(
      owner = "client!sf",
      name = "H",
      descriptor = "I"
   )
   public int field7919;
   @OriginalMember(
      owner = "client!sf",
      name = "A",
      descriptor = "I"
   )
   private int field7911;
   @OriginalMember(
      owner = "client!sf",
      name = "q",
      descriptor = "I"
   )
   private int field7907;
   @OriginalMember(
      owner = "client!sf",
      name = "w",
      descriptor = "I"
   )
   public int field7916;
   @OriginalMember(
      owner = "client!sf",
      name = "C",
      descriptor = "I"
   )
   private int field7904;
   @OriginalMember(
      owner = "client!sf",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7924 = new String[]{method3968(method3967("2~3?G")), method3968(method3967("2~39G")), method3968(method3967("/mq\u0014")), method3968(method3967(":63V\u0012")), method3968(method3967("2~3:G")), method3968(method3967("2~3D\u0006/qiFG")), method3968(method3967("2~3>G")), method3968(method3967("2~3=G")), method3968(method3967("2~3<G")), method3968(method3967("2~3;G")), method3968(method3967("2~30G"))};
   @OriginalMember(
      owner = "client!sf",
      name = "m",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7909 = new String[100];
   @OriginalMember(
      owner = "client!sf",
      name = "v",
      descriptor = "I"
   )
   public static int field7915 = 0;
   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "Loba;"
   )
   public static class274 field7905 = new class274();
   @OriginalMember(
      owner = "client!sf",
      name = "G",
      descriptor = "I"
   )
   public static int field7923 = 1409;
   @OriginalMember(
      owner = "client!sf",
      name = "t",
      descriptor = "Lll;"
   )
   public static class387 field7922 = new class387();
   @OriginalMember(
      owner = "client!sf",
      name = "D",
      descriptor = "I"
   )
   public static int field7902;
   @OriginalMember(
      owner = "client!sf",
      name = "n",
      descriptor = "I"
   )
   public static int field7903;
   @OriginalMember(
      owner = "client!sf",
      name = "s",
      descriptor = "I"
   )
   public static int field7906;
   @OriginalMember(
      owner = "client!sf",
      name = "o",
      descriptor = "I"
   )
   public static int field7912;
   @OriginalMember(
      owner = "client!sf",
      name = "F",
      descriptor = "I"
   )
   public static int field7913;
   @OriginalMember(
      owner = "client!sf",
      name = "E",
      descriptor = "I"
   )
   public static int field7917;
   @OriginalMember(
      owner = "client!sf",
      name = "B",
      descriptor = "I"
   )
   public static int field7918;
   @OriginalMember(
      owner = "client!sf",
      name = "p",
      descriptor = "Lkf;"
   )
   public static class266 field7921;

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "([IIII)V",
      line = 8
   )
   public final void method3959(int[] arg0, int arg1, int arg2, int arg3) {
      try {
         arg0[arg2] = 0;
         arg0[1] = -this.field7911 - (-this.field7910 - arg1);
         ++field7917;
         arg0[2] = arg3 - -this.field7920 + -this.field7914;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7924[4] + (arg0 != null ? field7924[3] : field7924[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(BII)Z",
      line = 18
   )
   public final boolean method3960(byte arg0, int arg1, int arg2) {
      try {
         ++field7903;
         if (arg0 != 6) {
            method3965((String)null, (char)65453, 69);
         }

         return this.field7911 <= arg1 && ~arg1 >= ~this.field7907 && ~this.field7914 >= ~arg2 && arg2 <= this.field7908;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7924[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIZ[I)V",
      line = 33
   )
   public final void method3961(int arg0, int arg1, boolean arg2, int[] arg3) {
      try {
         ++field7906;
         arg3[2] = this.field7914 - (this.field7920 - arg1);
         if (!arg2) {
            this.field7911 = 79;
         }

         arg3[1] = -this.field7910 + arg0 + this.field7911;
         arg3[0] = this.field7904;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7924[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7924[3] : field7924[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(ZII)Z",
      line = 47
   )
   public static final boolean method3962(boolean arg0, int arg1, int arg2) {
      try {
         ++field7918;
         if (arg0) {
            method3966((byte)-71);
         }

         return class792.method5712(-14258, arg2, arg1) || class326.method2410(false, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7924[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "(IBI)Z",
      line = 64
   )
   public final boolean method3963(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -124) {
            method3962(false, -10, -69);
         }

         ++field7902;
         return ~this.field7910 >= ~arg0 && ~this.field7919 <= ~arg0 && ~this.field7920 >= ~arg2 && this.field7916 >= arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7924[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIII)Z",
      line = 83
   )
   public final boolean method3964(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != 16755) {
            return true;
         } else {
            ++field7912;
            return ~this.field7904 == ~arg0 && ~this.field7911 >= ~arg1 && ~arg1 >= ~this.field7907 && arg2 >= this.field7914 && this.field7908 >= arg2;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7924[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(Ljava/lang/String;CI)I",
      line = 103
   )
   public static final int method3965(String arg0, char arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field7913;
         if (arg2 != -32261) {
            return 76;
         } else {
            int var4 = 0;
            int var5 = arg0.length();
            int var6 = 0;
            if (var3) {
               if (~arg1 == ~arg0.charAt(var6)) {
                  ++var4;
               }

               ++var6;
            }

            while(true) {
               int var10000;
               if (var5 <= var6) {
                  var10000 = var4;
                  if (!var3) {
                     return var4;
                  }
               } else {
                  var10000 = ~arg1;
               }

               if (var10000 == ~arg0.charAt(var6)) {
                  ++var4;
               }

               ++var6;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7924[6] + (arg0 != null ? field7924[3] : field7924[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "<init>",
      descriptor = "(IIIIIIIII)V",
      line = 137
   )
   public class552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field7914 = arg2;
         this.field7910 = arg5;
         this.field7920 = arg6;
         this.field7908 = arg4;
         this.field7919 = arg7;
         this.field7911 = arg1;
         this.field7907 = arg3;
         this.field7916 = arg8;
         this.field7904 = arg0;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field7924[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(B)V",
      line = 162
   )
   public static void method3966(byte arg0) {
      try {
         field7905 = null;
         field7909 = null;
         field7921 = null;
         field7922 = null;
         if (arg0 > -69) {
            method3966((byte)102);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7924[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3967(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3968(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
