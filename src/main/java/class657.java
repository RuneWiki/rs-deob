import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class657 extends class213 {
   @OriginalMember(
      owner = "client!tq",
      name = "A",
      descriptor = "J"
   )
   private long field9603 = -1L;
   @OriginalMember(
      owner = "client!tq",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   private String field9602 = null;
   @OriginalMember(
      owner = "client!tq",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9607 = new String[]{method4809(method4808("7\u007f\u001d\u007fj(r\u0011ng`")), method4809(method4808("4o\u001cq")), method4809(method4808("!4^3r")), method4809(method4808("zw\u0015pm?h\u001e|b? ")), method4809(method4808(".k^^'")), method4809(method4808(".k^X'")), method4809(method4808(".k^_'")), method4809(method4808(".k^Y'")), method4809(method4808(".k^\\'"))};
   @OriginalMember(
      owner = "client!tq",
      name = "x",
      descriptor = "Lkda;"
   )
   public static class412 field9600 = new class412(method4809(method4808("\rN9")), method4809(method4808("5|\u0016tl?")), method4809(method4808("\u0005m\u0004t")), 5);
   @OriginalMember(
      owner = "client!tq",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field9606 = new int[32];
   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "I"
   )
   public static int field9598;
   @OriginalMember(
      owner = "client!tq",
      name = "u",
      descriptor = "I"
   )
   public static int field9599;
   @OriginalMember(
      owner = "client!tq",
      name = "y",
      descriptor = "I"
   )
   public static int field9601;
   @OriginalMember(
      owner = "client!tq",
      name = "v",
      descriptor = "I"
   )
   public static int field9604;
   @OriginalMember(
      owner = "client!tq",
      name = "w",
      descriptor = "Lgm;"
   )
   public static class135 field9605;

   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public static void method4805(int arg0) {
      try {
         field9600 = null;
         field9606 = null;
         if (arg0 == -8229) {
            field9605 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9607[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(ILjava/awt/Component;)Ljf;",
      line = 22
   )
   public static final class228 method4806(int arg0, Component arg1) {
      try {
         if (arg0 != -28904) {
            return null;
         } else {
            ++field9601;
            return new class728(arg1);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9607[5] + arg0 + ',' + (arg1 != null ? field9607[2] : field9607[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 37
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         if (arg0.method1143(-15465) != 255) {
            --arg0.field1856;
            this.field9603 = arg0.method1207(false);
         }

         ++field9598;
         this.field9602 = arg0.method1175(6781);
         if (arg1 > -38) {
            this.method1343((class472)null, true);
         }

         if (class39.field557) {
            System.out.println(field9607[0] + this.field9603 + field9607[3] + this.field9602);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9607[4] + (arg0 != null ? field9607[2] : field9607[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(IZ)V",
      line = 57
   )
   public static final void method4807(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field9606 = null;
         }

         class220.field3138 = arg0;
         ++field9604;
         class478.field6866 = -1;
         class74.field908 = -1;
         class707.method5142(0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9607[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(Lqv;Z)V",
      line = 82
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         ++field9599;
         arg0.method3436(false, this.field9603, this.field9602);
         if (!arg1) {
            field9605 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9607[8] + (arg0 != null ? field9607[2] : field9607[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4808(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4809(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
