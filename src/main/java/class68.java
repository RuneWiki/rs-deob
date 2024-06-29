import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class68 extends class331 {
   @OriginalMember(
      owner = "client!bd",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field864 = new String[]{method688(method687("o\f&ag")), method688(method687("o\f&bg")), method688(method687("c\u001ddF")), method688(method687("vF&\u00042")), method688(method687("o\f&cg")), method688(method687("o\f&hg")), method688(method687("o\f&gg")), method688(method687("o\f&lg")), method688(method687("o\f&`g")), method688(method687("o\f&dg")), method688(method687("o\f&eg"))};
   @OriginalMember(
      owner = "client!bd",
      name = "n",
      descriptor = "Lsd;"
   )
   public static class101 field851 = new class101(116, 6);
   @OriginalMember(
      owner = "client!bd",
      name = "C",
      descriptor = "Lcj;"
   )
   public static class721 field858 = new class721(11, 0, 1, 2);
   @OriginalMember(
      owner = "client!bd",
      name = "t",
      descriptor = "Lum;"
   )
   public static class550 field860 = new class550();
   @OriginalMember(
      owner = "client!bd",
      name = "B",
      descriptor = "J"
   )
   public static long field862 = -1L;
   @OriginalMember(
      owner = "client!bd",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field863 = false;
   @OriginalMember(
      owner = "client!bd",
      name = "x",
      descriptor = "I"
   )
   public static int field848;
   @OriginalMember(
      owner = "client!bd",
      name = "s",
      descriptor = "I"
   )
   public static int field849;
   @OriginalMember(
      owner = "client!bd",
      name = "p",
      descriptor = "I"
   )
   public static int field850;
   @OriginalMember(
      owner = "client!bd",
      name = "y",
      descriptor = "I"
   )
   public static int field852;
   @OriginalMember(
      owner = "client!bd",
      name = "q",
      descriptor = "I"
   )
   public static int field853;
   @OriginalMember(
      owner = "client!bd",
      name = "o",
      descriptor = "I"
   )
   public static int field854;
   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "I"
   )
   public static int field855;
   @OriginalMember(
      owner = "client!bd",
      name = "r",
      descriptor = "I"
   )
   public static int field856;
   @OriginalMember(
      owner = "client!bd",
      name = "u",
      descriptor = "I"
   )
   public static int field857;
   @OriginalMember(
      owner = "client!bd",
      name = "v",
      descriptor = "Lkf;"
   )
   public static class264 field859;
   @OriginalMember(
      owner = "client!bd",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field861;

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(IILuha;)V"
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      try {
         super.field4745.method2578(arg2, true);
         ++field856;
         super.field4745.method2649((byte)119, arg1);
         if (arg0 != 0) {
            field851 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field864[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field864[3] : field864[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method412(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 9950) {
            this.method407((byte)111);
         }

         ++field849;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field864[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method417(boolean arg0, byte arg1) {
      try {
         ++field850;
         if (arg1 != -102) {
            this.method410(47, false);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field864[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method410(int arg0, boolean arg1) {
      try {
         super.field4745.method2632((byte)-104, true);
         if (arg0 >= 3) {
            ++field857;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field864[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method684(int arg0) {
      try {
         field860 = null;
         field861 = null;
         field858 = null;
         field851 = null;
         if (arg0 == 16395) {
            field859 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field864[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "<init>",
      descriptor = "(Ldh;)V"
   )
   public class68(class338 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method685(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method411(int arg0) {
      try {
         ++field848;
         if (arg0 >= -21) {
            field863 = false;
         }

         super.field4745.method2632((byte)-77, false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field864[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method407(byte arg0) {
      try {
         ++field852;
         if (arg0 <= 16) {
            this.method412(-5, -25, 5);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field864[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method686(int arg0) {
      try {
         ++field854;
         if (~class198.field2452 != 0) {
            int var1 = class723.field10766.method368((byte)106);
            int var2 = class723.field10766.method366(true);
            class467 var3 = (class467)class356.field5394.method4071((byte)127);
            if (var3 != null) {
               var1 = var3.method3490(-80);
               var2 = var3.method3491(-5);
            }

            if (arg0 != 12662) {
               field862 = -16L;
            }

            int var4 = 0;
            int var5 = 0;
            if (class446.field6785) {
               var4 = class325.method2458(29461);
               var5 = class319.method2421(true);
            }

            class221.method1681(var4, var4 - -class207.field2647, var2 - -var5, var1 + var4, class198.field2452, var4, var5, (byte)-49, var1, var2, var5, class411.field6305 + var5);
            if (class468.field7009 != null) {
               class246.method1841((byte)34, var1 + var4, var2 + var5);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field864[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method687(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method688(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
