import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class628 extends Canvas {
   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field9092;
   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9094 = new String[]{method4601(method4600("/^\u0000t")), method4601(method4600("\"BB$K/B\u0018&\n")), method4601(method4600(":\u0005B6_")), method4601(method4600("\"BBhC(E\u00180")), method4601(method4600("\"BBmR%J\u0018}\n")), method4601(method4600("\"BBY\n"))};
   @OriginalMember(
      owner = "client!ci",
      name = "c",
      descriptor = "I"
   )
   public static int field9089;
   @OriginalMember(
      owner = "client!ci",
      name = "d",
      descriptor = "I"
   )
   public static int field9090;
   @OriginalMember(
      owner = "client!ci",
      name = "b",
      descriptor = "I"
   )
   public static int field9091;
   @OriginalMember(
      owner = "client!ci",
      name = "e",
      descriptor = "I"
   )
   public static int field9093;

   @OriginalMember(
      owner = "client!ci",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 3
   )
   public final void paint(Graphics arg0) {
      try {
         ++field9093;
         this.field9092.paint(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9094[3] + (arg0 != null ? field9094[2] : field9094[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V",
      line = 16
   )
   public final void update(Graphics arg0) {
      try {
         this.field9092.update(arg0);
         ++field9090;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9094[4] + (arg0 != null ? field9094[2] : field9094[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V",
      line = 24
   )
   public class628(Component arg0) {
      try {
         this.field9092 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9094[1] + (arg0 != null ? field9094[2] : field9094[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(I)V",
      line = 32
   )
   public static final void method4599(int arg0) {
      try {
         if (arg0 >= -47) {
            field9091 = -96;
         }

         class1.method1(26215, false);
         ++field9089;
         if (~class230.field3519 <= -1 && class230.field3519 != 0) {
            class473.method3678(2744, class230.field3519, false);
            class230.field3519 = -1;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9094[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4600(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4601(char[] arg0) {
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
            var10005 = 43;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
