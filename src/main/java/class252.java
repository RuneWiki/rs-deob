import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class252 extends class465 {
   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3378 = new String[]{method1906(method1905("\u0010\u0005kBn]")), method1906(method1905("\u0010\u0005kBi]")), method1906(method1905("\u0010\u0005kB`]")), method1906(method1905("\u0010\u0005kBl]")), method1906(method1905("\u0010\u0005kBm]")), method1906(method1905("\u001b\u0019f\u0000")), method1906(method1905("\u001f\rm\u000bD")), method1906(method1905("\u0010\u0005kBo]")), method1906(method1905("\u000eB$BU")), method1906(method1905("\u0010\u0005kBj]")), method1906(method1905("\u0010\u0005kBk]"))};
   @OriginalMember(
      owner = "client!eia",
      name = "l",
      descriptor = "[Laca;"
   )
   public static class757[] field3369 = new class757[2048];
   @OriginalMember(
      owner = "client!eia",
      name = "g",
      descriptor = "I"
   )
   public static int field3376 = -1;
   @OriginalMember(
      owner = "client!eia",
      name = "i",
      descriptor = "I"
   )
   public static int field3370;
   @OriginalMember(
      owner = "client!eia",
      name = "f",
      descriptor = "I"
   )
   public static int field3371;
   @OriginalMember(
      owner = "client!eia",
      name = "j",
      descriptor = "I"
   )
   public static int field3372;
   @OriginalMember(
      owner = "client!eia",
      name = "n",
      descriptor = "I"
   )
   public static int field3373;
   @OriginalMember(
      owner = "client!eia",
      name = "k",
      descriptor = "I"
   )
   public static int field3374;
   @OriginalMember(
      owner = "client!eia",
      name = "h",
      descriptor = "I"
   )
   public static int field3375;
   @OriginalMember(
      owner = "client!eia",
      name = "m",
      descriptor = "I"
   )
   public static int field3377;

   @OriginalMember(
      owner = "client!eia",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1901(int arg0) {
      try {
         ++field3370;
         if (arg0 <= 81) {
            this.method78(11);
         }

         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3378[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            field3369 = null;
         }

         ++field3377;
         return super.field6980.method4680(-17721) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3378[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1902(int arg0) {
      try {
         field3369 = null;
         if (arg0 != 28024) {
            field3369 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3378[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         super.field6984 = this.method78(16726277);
         ++field3373;
         if (arg0) {
            method1904(-86, false, (class526)null, (class160)null, (Canvas)null);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3378[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class252(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         if (arg0 != -14812) {
            this.method69(false);
         }

         ++field3372;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3378[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class252(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1903(int arg0) {
      int var1 = client.field4530;

      try {
         ++field3375;
         class401.field6167.method1109((byte)97);
         int var2 = 0;
         if (var1 != 0) {
            class430.field6580[var2] = 0L;
            ++var2;
         }

         while(true) {
            while(var2 < 32) {
               class430.field6580[var2] = 0L;
               ++var2;
            }

            int var3 = 0;
            if (var1 == 0) {
               if (var1 != 0) {
                  class793.field11550[var3] = 0L;
                  ++var3;
               }

               while(true) {
                  while(var3 < 32) {
                     class793.field11550[var3] = 0L;
                     ++var3;
                  }

                  class45.field475 = 0;
                  if (var1 == 0) {
                     if (arg0 != 32) {
                        method1902(23);
                        return;
                     }

                     return;
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3378[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(IZLeaa;Ld;Ljava/awt/Canvas;)Lha;"
   )
   public static final class66 method1904(int arg0, boolean arg1, class526 arg2, class160 arg3, Canvas arg4) {
      try {
         ++field3374;
         if (!class589.method4337(!arg1)) {
            throw new RuntimeException("");
         } else {
            if (arg1) {
               field3376 = 60;
            }

            if (!class298.method2280(0, field3378[6])) {
               throw new RuntimeException("");
            } else {
               OpenGL var5 = new OpenGL();
               long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg0);
               if (var6 == 0L) {
                  throw new RuntimeException("");
               } else {
                  class379 var8 = new class379(var5, arg4, var6, arg3, arg2, arg0);
                  var8.method2668(102);
                  return var8;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3378[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3378[8] : field3378[5]) + ',' + (arg3 != null ? field3378[8] : field3378[5]) + ',' + (arg4 != null ? field3378[8] : field3378[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field3371;
         int var3 = 17 / ((-51 - arg1) / 60);
         return 3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3378[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1905(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1906(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
