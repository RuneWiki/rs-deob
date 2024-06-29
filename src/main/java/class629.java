import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public abstract class class629 extends class673 {
   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9297 = new String[]{method4653(method4652("9$\u000eIIw")), method4653(method4652("9$\u000eIJw"))};
   @OriginalMember(
      owner = "client!fba",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field9292 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @OriginalMember(
      owner = "client!fba",
      name = "m",
      descriptor = "Lqb;"
   )
   public static class68 field9286 = new class68();
   @OriginalMember(
      owner = "client!fba",
      name = "l",
      descriptor = "I"
   )
   public static int field9295 = 7000;
   @OriginalMember(
      owner = "client!fba",
      name = "v",
      descriptor = "J"
   )
   public static long field9296 = 0L;
   @OriginalMember(
      owner = "client!fba",
      name = "o",
      descriptor = "I"
   )
   public static int field9293 = field9295;
   @OriginalMember(
      owner = "client!fba",
      name = "r",
      descriptor = "I"
   )
   public int field9287;
   @OriginalMember(
      owner = "client!fba",
      name = "s",
      descriptor = "I"
   )
   public int field9288;
   @OriginalMember(
      owner = "client!fba",
      name = "t",
      descriptor = "I"
   )
   public static int field9289;
   @OriginalMember(
      owner = "client!fba",
      name = "p",
      descriptor = "I"
   )
   public static int field9290;
   @OriginalMember(
      owner = "client!fba",
      name = "q",
      descriptor = "Lha;"
   )
   public static class479 field9294;
   @OriginalMember(
      owner = "client!fba",
      name = "n",
      descriptor = "[I"
   )
   public int[] field9291;

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4650(int arg0) {
      try {
         field9292 = null;
         field9294 = null;
         field9286 = null;
         if (arg0 > -80) {
            field9293 = -104;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9297[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(ZIIILjava/awt/Graphics;III)V"
   )
   public abstract void method382(boolean arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(IZILjava/awt/Canvas;)V"
   )
   public abstract void method381(int arg0, boolean arg1, int arg2, Canvas arg3);

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4651(int arg0, byte arg1) {
      boolean var2 = client.field1481;

      try {
         ++field9290;
         if (class755.field11063 == null) {
            class755.field11063 = new byte[4][class273.field3491][class211.field2689];
         }

         int var3 = arg0;
         if (var2 || arg0 < 4) {
            do {
               int var4 = 0;
               if (var2 || class273.field3491 > var4) {
                  do {
                     int var5 = 0;
                     if (var2) {
                        class755.field11063[var3][var4][var5] = arg1;
                        ++var5;
                     }

                     while(true) {
                        while(class211.field2689 > var5) {
                           class755.field11063[var3][var4][var5] = arg1;
                           ++var5;
                        }

                        if (!var2) {
                           ++var4;
                           break;
                        }

                        ++var5;
                     }
                  } while(class273.field3491 > var4);
               }

               ++var3;
            } while(var3 < 4);

         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field9297[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4652(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4653(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
