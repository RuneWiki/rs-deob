import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class108 extends class22 {
   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1782 = method1041(method1040("=\u00143\u0010g"));
   @OriginalMember(
      owner = "client!al",
      name = "m",
      descriptor = "I"
   )
   public static int field1776 = 0;
   @OriginalMember(
      owner = "client!al",
      name = "l",
      descriptor = "I"
   )
   public static int field1781 = 0;
   @OriginalMember(
      owner = "client!al",
      name = "o",
      descriptor = "I"
   )
   public static int field1777;
   @OriginalMember(
      owner = "client!al",
      name = "n",
      descriptor = "I"
   )
   public int field1779;
   @OriginalMember(
      owner = "client!al",
      name = "j",
      descriptor = "I"
   )
   public int field1780;
   @OriginalMember(
      owner = "client!al",
      name = "k",
      descriptor = "[I"
   )
   public int[] field1778;

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(JII)Luca;",
      line = 8
   )
   public static final class536 method1038(long arg0, int arg1, int arg2) {
      try {
         ++field1777;
         class536 var4 = (class536)class564.field8196.method1572((long)arg2 << 56 | arg0, -16289);
         if (var4 == null) {
            var4 = new class536(arg2, arg0);
            class564.field8196.method1566(var4, 24742, var4.field347);
         }

         if (arg1 < 6) {
            field1776 = 108;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1782 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IBI)V"
   )
   public abstract void method1037(Canvas arg0, int arg1, byte arg2, int arg3);

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIII)V"
   )
   public abstract void method1039(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1040(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1041(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
