import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class208 {
   @OriginalMember(
      owner = "client!tia",
      name = "f",
      descriptor = "Lpha;"
   )
   private class391 field3174 = new class391();
   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3180 = new String[]{method1822(method1821("vQLI2*")), method1822(method1821("vQLI1*")), method1822(method1821("vQLI6*")), method1822(method1821("vQLILkVD\u0013N*")), method1822(method1821("vQLI8*")), method1822(method1821("vQLI9*")), method1822(method1821("vQLI5*")), method1822(method1821("vQLI7*")), method1822(method1821("vQLI3*")), method1822(method1821("y\u0016\u0003I\r")), method1822(method1821("vQLI4*")), method1822(method1821("lMA\u000b"))};
   @OriginalMember(
      owner = "client!tia",
      name = "c",
      descriptor = "Lsl;"
   )
   public static class242 field3170 = new class242(1);
   @OriginalMember(
      owner = "client!tia",
      name = "i",
      descriptor = "I"
   )
   public static int field3167;
   @OriginalMember(
      owner = "client!tia",
      name = "h",
      descriptor = "I"
   )
   public static int field3168;
   @OriginalMember(
      owner = "client!tia",
      name = "k",
      descriptor = "I"
   )
   public static int field3169;
   @OriginalMember(
      owner = "client!tia",
      name = "d",
      descriptor = "I"
   )
   public static int field3171;
   @OriginalMember(
      owner = "client!tia",
      name = "e",
      descriptor = "I"
   )
   public static int field3172;
   @OriginalMember(
      owner = "client!tia",
      name = "j",
      descriptor = "I"
   )
   public static int field3173;
   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "I"
   )
   public static int field3176;
   @OriginalMember(
      owner = "client!tia",
      name = "g",
      descriptor = "I"
   )
   public static int field3178;
   @OriginalMember(
      owner = "client!tia",
      name = "m",
      descriptor = "I"
   )
   public static int field3179;
   @OriginalMember(
      owner = "client!tia",
      name = "l",
      descriptor = "Lpha;"
   )
   private class391 field3177;
   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "Lrr;"
   )
   public static class678 field3175;

   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "(I)Lpha;",
      line = 5
   )
   public final class391 method1812(int arg0) {
      try {
         ++field3168;
         if (arg0 != 0) {
            this.field3174 = null;
         }

         class391 var2 = this.field3174.field6144;
         if (this.field3174 == var2) {
            return null;
         } else {
            var2.method3159(true);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3180[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(Lpha;I)V",
      line = 29
   )
   public final void method1813(class391 arg0, int arg1) {
      try {
         ++field3167;
         if (arg0.field6140 != null) {
            arg0.method3159(true);
         }

         arg0.field6144 = this.field3174;
         arg0.field6140 = this.field3174.field6140;
         if (arg1 != 0) {
            this.method1813((class391)null, -58);
         }

         arg0.field6140.field6144 = arg0;
         arg0.field6144.field6140 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3180[10] + (arg0 != null ? field3180[9] : field3180[11]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "(B)V",
      line = 49
   )
   public final void method1814(byte arg0) {
      boolean var2 = client.field1786;

      try {
         if (arg0 <= 69) {
            this.field3177 = null;
         }

         ++field3173;

         while(true) {
            class391 var3 = this.field3174.field6144;
            if (this.field3174 != var3) {
               var3.method3159(true);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field3177 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3180[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "c",
      descriptor = "(I)Lpha;",
      line = 71
   )
   public final class391 method1815(int arg0) {
      try {
         if (arg0 != 1) {
            this.method1818((byte)42);
         }

         ++field3178;
         class391 var2 = this.field3174.field6144;
         if (this.field3174 == var2) {
            this.field3177 = null;
            return null;
         } else {
            this.field3177 = var2.field6144;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3180[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(I)V",
      line = 92
   )
   public static void method1816(int arg0) {
      try {
         field3175 = null;
         if (arg0 != -10506) {
            field3176 = -5;
         }

         field3170 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3180[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "d",
      descriptor = "(I)Lpha;",
      line = 108
   )
   public final class391 method1817(int arg0) {
      try {
         ++field3169;
         if (arg0 != 0) {
            this.field3177 = null;
         }

         class391 var2 = this.field3177;
         if (this.field3174 == var2) {
            this.field3177 = null;
            return null;
         } else {
            this.field3177 = var2.field6144;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3180[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "c",
      descriptor = "(B)Lpha;",
      line = 128
   )
   public final class391 method1818(byte arg0) {
      try {
         int var2 = 120 % ((arg0 - -43) / 62);
         ++field3171;
         class391 var3 = this.field3174.field6140;
         if (this.field3174 == var3) {
            this.field3177 = null;
            return null;
         } else {
            this.field3177 = var3.field6140;
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3180[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "e",
      descriptor = "(I)I",
      line = 152
   )
   public final int method1819(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field3172;
         int var3 = arg0;
         class391 var4 = this.field3174.field6144;
         if (var2) {
            var4 = var4.field6144;
            var3 = arg0 + 1;
         }

         while(true) {
            while(this.field3174 != var4) {
               var4 = var4.field6144;
               ++var3;
            }

            if (!var2) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3180[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "<init>",
      descriptor = "()V",
      line = 191
   )
   public class208() {
      try {
         this.field3174.field6140 = this.field3174;
         this.field3174.field6144 = this.field3174;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3180[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(B)Z",
      line = 179
   )
   public final boolean method1820(byte arg0) {
      try {
         if (arg0 < 12) {
            return false;
         } else {
            ++field3179;
            return this.field3174.field6144 == this.field3174;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3180[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1821(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1822(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
