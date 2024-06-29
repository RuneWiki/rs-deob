import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public abstract class class624 extends class500 {
   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8719 = new String[]{method4537(method4536("O:\u0019U\f")), method4537(method4536("O:\u0019S\f")), method4537(method4536("O:\u0019V\f"))};
   @OriginalMember(
      owner = "client!et",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field8717 = true;
   @OriginalMember(
      owner = "client!et",
      name = "m",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field8714 = Calendar.getInstance();
   @OriginalMember(
      owner = "client!et",
      name = "n",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field8715 = Calendar.getInstance(TimeZone.getTimeZone(method4537(method4536("m\u0003c"))));
   @OriginalMember(
      owner = "client!et",
      name = "q",
      descriptor = "I"
   )
   public static int field8710;
   @OriginalMember(
      owner = "client!et",
      name = "l",
      descriptor = "I"
   )
   public int field8711;
   @OriginalMember(
      owner = "client!et",
      name = "o",
      descriptor = "I"
   )
   public static int field8713;
   @OriginalMember(
      owner = "client!et",
      name = "r",
      descriptor = "I"
   )
   public int field8716;
   @OriginalMember(
      owner = "client!et",
      name = "j",
      descriptor = "I"
   )
   public static int field8718;
   @OriginalMember(
      owner = "client!et",
      name = "k",
      descriptor = "[I"
   )
   public int[] field8712;

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IIZ)V"
   )
   public abstract void method1262(Canvas arg0, int arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4533(int arg0) {
      try {
         ++field8713;
         class446 var1 = class635.method4607(124, 0L, arg0);
         var1.method3312(-125);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8719[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIBI)V"
   )
   public abstract void method1263(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7);

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4534(byte arg0) {
      try {
         field8714 = null;
         if (arg0 != -108) {
            method4534((byte)-71);
         }

         field8715 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8719[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method4535(int arg0, int arg1, boolean arg2) {
      boolean var3 = client.field4273;

      try {
         if (~class449.field6210 != -1) {
            label40: {
               if (arg1 >= 0) {
                  class420.field5891[arg1] = arg0;
                  if (!var3) {
                     break label40;
                  }
               }

               int var4 = 0;
               if (var3) {
                  class420.field5891[var4] = arg0;
                  ++var4;
               }

               while(~var4 > -17) {
                  class420.field5891[var4] = arg0;
                  ++var4;
               }
            }
         }

         if (arg2) {
            field8714 = null;
         }

         ++field8718;
         class131.field1647.method682(arg1, true, arg0);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8719[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4536(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4537(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
