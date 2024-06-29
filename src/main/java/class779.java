import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class779 {
   @OriginalMember(
      owner = "client!ob",
      name = "j",
      descriptor = "I"
   )
   public int field11369;
   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11379 = new String[]{method5632(method5631("\u007f\u001alum~\u00116w,")), method5632(method5631("\u007f\u001al=kC\f0 jwP")), method5632(method5631("\u007f\u001al\u000b,")), method5632(method5631("\u007f\u001al\b,")), method5632(method5631("\u007f\u001al\n,")), method5632(method5631("\u007f\u001al\r,"))};
   @OriginalMember(
      owner = "client!ob",
      name = "f",
      descriptor = "Lob;"
   )
   public static class779 field11363 = new class779(1);
   @OriginalMember(
      owner = "client!ob",
      name = "g",
      descriptor = "Lob;"
   )
   public static class779 field11367 = new class779(2);
   @OriginalMember(
      owner = "client!ob",
      name = "c",
      descriptor = "Lob;"
   )
   public static class779 field11370 = new class779(4);
   @OriginalMember(
      owner = "client!ob",
      name = "n",
      descriptor = "Lob;"
   )
   public static class779 field11371 = new class779(1);
   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "Lob;"
   )
   public static class779 field11372 = new class779(2);
   @OriginalMember(
      owner = "client!ob",
      name = "o",
      descriptor = "Lob;"
   )
   public static class779 field11373 = new class779(4);
   @OriginalMember(
      owner = "client!ob",
      name = "e",
      descriptor = "Lob;"
   )
   public static class779 field11374 = new class779(2);
   @OriginalMember(
      owner = "client!ob",
      name = "h",
      descriptor = "Lob;"
   )
   public static class779 field11375 = new class779(4);
   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "I"
   )
   public static int field11364;
   @OriginalMember(
      owner = "client!ob",
      name = "i",
      descriptor = "I"
   )
   public static int field11365;
   @OriginalMember(
      owner = "client!ob",
      name = "m",
      descriptor = "I"
   )
   public static int field11366;
   @OriginalMember(
      owner = "client!ob",
      name = "p",
      descriptor = "I"
   )
   public static int field11368;
   @OriginalMember(
      owner = "client!ob",
      name = "d",
      descriptor = "I"
   )
   public static int field11378;
   @OriginalMember(
      owner = "client!ob",
      name = "k",
      descriptor = "Lap;"
   )
   public static class784 field11376;
   @OriginalMember(
      owner = "client!ob",
      name = "l",
      descriptor = "[[Ljga;"
   )
   public static class91[][] field11377;

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5627(int arg0) {
      try {
         ++field11368;
         class656.field9285.method3096(-120);
         int var1 = -36 / ((58 - arg0) / 61);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11379[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5628(int arg0) {
      boolean var1 = client.field10022;

      try {
         int var2 = 0;
         int var3 = 54 % ((53 - arg0) / 34);
         if (!var1 && ~class501.field7151 >= ~var2) {
            ++field11365;
         } else {
            do {
               class180 var4 = class24.field345[var2];
               if (var4.field2642 == 3) {
                  if (var4.field2648 == null) {
                     var4.field2646 = Integer.MIN_VALUE;
                     if (var1) {
                        class129.field2068.method557(var4.field2648);
                        ++var2;
                     } else {
                        ++var2;
                     }
                  } else {
                     class129.field2068.method557(var4.field2648);
                     ++var2;
                  }
               } else {
                  ++var2;
               }
            } while(~class501.field7151 < ~var2);

            ++field11365;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11379[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5629(byte arg0) {
      try {
         field11373 = null;
         field11372 = null;
         field11376 = null;
         field11375 = null;
         field11371 = null;
         field11367 = null;
         field11363 = null;
         field11374 = null;
         field11370 = null;
         field11377 = null;
         if (arg0 != -58) {
            field11363 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11379[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field11366;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11379[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5630(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ob",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class779(int arg0) {
      try {
         this.field11369 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11379[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5631(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5632(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
