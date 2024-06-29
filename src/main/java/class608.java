import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class608 extends class428 {
   @OriginalMember(
      owner = "client!ht",
      name = "m",
      descriptor = "I"
   )
   public int field8916;
   @OriginalMember(
      owner = "client!ht",
      name = "s",
      descriptor = "I"
   )
   public int field8913;
   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8923 = new String[]{method4432(method4431("k\u0005MLh")), method4432(method4431("k\u0005MKh")), method4432(method4431("k\u0005M5)m\u0018\u00177h")), method4432(method4431("k\u0005MHh")), method4432(method4431("k\u0005MJh")), method4432(method4431("k\u0005MMh"))};
   @OriginalMember(
      owner = "client!ht",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field8918 = new int[1000];
   @OriginalMember(
      owner = "client!ht",
      name = "r",
      descriptor = "Lic;"
   )
   public static class729 field8917 = new class729(method4432(method4431("O85L")), 0);
   @OriginalMember(
      owner = "client!ht",
      name = "o",
      descriptor = "I"
   )
   public static int field8920 = 0;
   @OriginalMember(
      owner = "client!ht",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field8921 = false;
   @OriginalMember(
      owner = "client!ht",
      name = "p",
      descriptor = "Lek;"
   )
   public static class536 field8922 = new class536(72, 4);
   @OriginalMember(
      owner = "client!ht",
      name = "w",
      descriptor = "I"
   )
   public static int field8912;
   @OriginalMember(
      owner = "client!ht",
      name = "u",
      descriptor = "I"
   )
   public static int field8914;
   @OriginalMember(
      owner = "client!ht",
      name = "n",
      descriptor = "I"
   )
   public static int field8915;
   @OriginalMember(
      owner = "client!ht",
      name = "t",
      descriptor = "I"
   )
   public static int field8919;

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(IF)F",
      line = 5
   )
   public static final float method4426(int arg0, float arg1) {
      try {
         ++field8914;
         int var2 = -49 / ((arg0 - -46) / 49);
         return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8923[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "b",
      descriptor = "(I)V",
      line = 17
   )
   public static void method4427(int arg0) {
      try {
         field8917 = null;
         field8922 = null;
         field8918 = null;
         if (arg0 != -10001) {
            method4426(-52, -0.8952556F);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8923[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "c",
      descriptor = "(I)I",
      line = 30
   )
   public static final int method4428(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field8912;
         class66 var2 = class383.field5543;
         boolean var3 = false;
         if (class300.field4107.field6419.method391(-56) != 0) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class182.method1445(0, 0, (class266)null, (class162)null, var4, true);
            var3 = true;
         }

         long var5 = class133.method1054(-29025);
         int var7 = 0;
         if (var1) {
            var2.method607(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            ++var7;
         }

         while(true) {
            while(~var7 > -10001) {
               var2.method607(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
               ++var7;
            }

            int var8 = (int)(-var5 + class133.method1054(-29025));
            var2.method533(-16777216, 0, 0, arg0, (byte)127, 100);
            if (!var1) {
               if (var3) {
                  var2.method567((byte)-90);
               }

               return var8;
            }

            ++var7;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8923[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(II)I",
      line = 70
   )
   public static final int method4429(int arg0, int arg1) {
      try {
         if (arg0 != 1057691847) {
            method4426(-79, 0.17338662F);
         }

         ++field8915;
         return arg1 >>> 7;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8923[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "<init>",
      descriptor = "(II)V",
      line = 85
   )
   public class608(int arg0, int arg1) {
      try {
         this.field8916 = arg0;
         this.field8913 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8923[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(I)V",
      line = 95
   )
   public static final void method4430(int arg0) {
      try {
         class136.field1737 = class430.field6143;
         if (arg0 >= 104) {
            class686.field10122 = -1;
            ++field8919;
            class235.field3273 = 1;
            class506.method3675(class43.field597.equals(""), true, "", class43.field597, 0);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8923[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4431(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4432(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
