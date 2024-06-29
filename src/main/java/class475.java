import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class475 {
   @OriginalMember(
      owner = "client!sf",
      name = "i",
      descriptor = "Ltha;"
   )
   public class297 field7220 = new class297();
   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7233 = new String[]{method3698(method3697("u9}d'")), method3698(method3697("u9}n'")), method3698(method3697("u9}\u001bfh6'\u0019'")), method3698(method3697("u9}o'")), method3698(method3697("u9}a'")), method3698(method3697("u9}c'")), method3698(method3697("u9}m'")), method3698(method3697("h*?K")), method3698(method3697("}q}\tr")), method3698(method3697("u9}e'")), method3698(method3697("u9}b'")), method3698(method3697("u9}`'")), method3698(method3697("u9}f'"))};
   @OriginalMember(
      owner = "client!sf",
      name = "c",
      descriptor = "Lnaa;"
   )
   public static class113 field7222 = new class113(20, 5);
   @OriginalMember(
      owner = "client!sf",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field7224 = false;
   @OriginalMember(
      owner = "client!sf",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field7227 = new int[13];
   @OriginalMember(
      owner = "client!sf",
      name = "k",
      descriptor = "I"
   )
   public static int field7230 = 104;
   @OriginalMember(
      owner = "client!sf",
      name = "r",
      descriptor = "Llj;"
   )
   public static class304 field7226 = new class304(4);
   @OriginalMember(
      owner = "client!sf",
      name = "h",
      descriptor = "I"
   )
   public static int field7215;
   @OriginalMember(
      owner = "client!sf",
      name = "g",
      descriptor = "I"
   )
   public static int field7216;
   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "I"
   )
   public static int field7217;
   @OriginalMember(
      owner = "client!sf",
      name = "n",
      descriptor = "I"
   )
   public static int field7218;
   @OriginalMember(
      owner = "client!sf",
      name = "j",
      descriptor = "I"
   )
   public static int field7219;
   @OriginalMember(
      owner = "client!sf",
      name = "l",
      descriptor = "I"
   )
   public static int field7221;
   @OriginalMember(
      owner = "client!sf",
      name = "o",
      descriptor = "I"
   )
   public static int field7228;
   @OriginalMember(
      owner = "client!sf",
      name = "d",
      descriptor = "I"
   )
   public static int field7229;
   @OriginalMember(
      owner = "client!sf",
      name = "f",
      descriptor = "I"
   )
   public static int field7231;
   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "I"
   )
   public static int field7232;
   @OriginalMember(
      owner = "client!sf",
      name = "q",
      descriptor = "Ltha;"
   )
   private class297 field7223;
   @OriginalMember(
      owner = "client!sf",
      name = "m",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field7225;

   @OriginalMember(
      owner = "client!sf",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method3687(byte arg0) {
      try {
         ++field7218;
         class670 var1 = (class670)class748.field11087.method4972((byte)-84);
         boolean var2 = class358.field5551 != null || class396.field6216 > 0;
         if (arg0 < 17) {
            field7222 = null;
         }

         int var3 = var1.method3790(8);
         int var4 = var1.method3793(1);
         if (var2) {
            class452.field6916 = 1;
         }

         if (!var2) {
            class356.method2912(var4, var3, -123, class305.field4780);
         } else {
            class329.field4991 = class305.field4780;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7233[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(Z)Ltha;"
   )
   public final class297 method3688(boolean arg0) {
      try {
         ++field7232;
         class297 var2 = this.field7220.field4682;
         if (this.field7220 == var2) {
            this.field7223 = null;
            return null;
         } else {
            this.field7223 = var2.field4682;
            if (!arg0) {
               this.field7220 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7233[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method3689(byte arg0, int arg1) {
      try {
         if (arg0 <= 25) {
            field7224 = true;
         }

         ++field7221;
         return arg1 >= 4 && arg1 <= 8;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7233[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method3690(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field7219;
         int var3 = -19 / ((-19 - arg0) / 50);
         int var4 = 0;
         class297 var5 = this.field7220.field4682;
         if (var2) {
            ++var4;
            var5 = var5.field4682;
         }

         while(true) {
            if (this.field7220 == var5) {
               if (!var2) {
                  return var4;
               }
            } else {
               ++var4;
            }

            var5 = var5.field4682;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7233[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(I)Ltha;"
   )
   public final class297 method3691(int arg0) {
      try {
         ++field7228;
         class297 var2 = this.field7223;
         if (this.field7220 == var2) {
            this.field7223 = null;
            return null;
         } else {
            this.field7223 = var2.field4682;
            if (arg0 != 20) {
               this.field7223 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7233[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(B)Ltha;"
   )
   public final class297 method3692(byte arg0) {
      try {
         ++field7217;
         class297 var2 = this.field7220.field4682;
         if (arg0 != 46) {
            return null;
         } else if (this.field7220 == var2) {
            return null;
         } else {
            var2.method2495(arg0 + -24180);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7233[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(Ltha;Z)V"
   )
   public final void method3693(class297 arg0, boolean arg1) {
      try {
         ++field7229;
         if (arg0.field4679 != null) {
            arg0.method2495(-24134);
         }

         arg0.field4679 = this.field7220.field4679;
         arg0.field4682 = this.field7220;
         arg0.field4679.field4682 = arg0;
         arg0.field4682.field4679 = arg0;
         if (!arg1) {
            field7227 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7233[9] + (arg0 != null ? field7233[8] : field7233[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3694(byte arg0) {
      try {
         field7222 = null;
         field7227 = null;
         if (arg0 != -53) {
            field7226 = null;
         }

         field7225 = null;
         field7226 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7233[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method3695(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sf",
      name = "<init>",
      descriptor = "()V"
   )
   public class475() {
      try {
         this.field7220.field4679 = this.field7220;
         this.field7220.field4682 = this.field7220;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7233[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3696(int arg0) {
      boolean var2 = client.field1786;

      try {
         int var3 = -73 / ((arg0 - -40) / 37);

         while(true) {
            class297 var4 = this.field7220.field4682;
            if (this.field7220 != var4) {
               var4.method2495(-24134);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ++field7216;
            this.field7223 = null;
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7233[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3697(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3698(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
