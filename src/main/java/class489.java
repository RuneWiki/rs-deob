import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class489 extends Canvas {
   @OriginalMember(
      owner = "client!nq",
      name = "c",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field6744;
   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6747 = new String[]{method3558(method3557("N$SO")), method3558(method3557("N \u0011\u001f\u0013N8K\u001dR")), method3558(method3557("[\u007f\u0011\r\u0007")), method3558(method3557("N \u0011`R")), method3558(method3557("\u0000m\\L\u0016\u001d7YE\u001cF7\u0001\u001d")), method3558(method3557("N \u0011bR")), method3558(method3557("N \u0011V\nD0KFR")), method3558(method3557("N \u0011S\u001bI?K\u000b")), method3558(method3557("N \u0011aR"))};
   @OriginalMember(
      owner = "client!nq",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6742 = null;
   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "Lnm;"
   )
   public static class502 field6745 = new class502();
   @OriginalMember(
      owner = "client!nq",
      name = "e",
      descriptor = "I"
   )
   public static int field6746 = -2;
   @OriginalMember(
      owner = "client!nq",
      name = "d",
      descriptor = "I"
   )
   public static int field6739;
   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "I"
   )
   public static int field6740;
   @OriginalMember(
      owner = "client!nq",
      name = "f",
      descriptor = "I"
   )
   public static int field6741;
   @OriginalMember(
      owner = "client!nq",
      name = "g",
      descriptor = "I"
   )
   public static int field6743;

   @OriginalMember(
      owner = "client!nq",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void paint(Graphics arg0) {
      try {
         ++field6743;
         this.field6744.paint(arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6747[7] + (arg0 != null ? field6747[2] : field6747[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(ILaka;)Ljava/lang/String;"
   )
   public static final String method3554(int arg0, class85 arg1) {
      try {
         ++field6740;
         int var2 = -53 / ((arg0 - -23) / 50);
         return arg1.field1101 + field6747[4];
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6747[3] + arg0 + ',' + (arg1 != null ? field6747[2] : field6747[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         ++field6739;
         this.field6744.update(arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6747[6] + (arg0 != null ? field6747[2] : field6747[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class489(Component arg0) {
      try {
         this.field6744 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6747[1] + (arg0 != null ? field6747[2] : field6747[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3555(int arg0) {
      try {
         if (arg0 != 4) {
            field6742 = null;
         }

         field6745 = null;
         field6742 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6747[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public static final void method3556(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         if (arg3 != -109) {
            field6742 = null;
         }

         ++field6741;
         class446 var5 = class635.method4607(109, (long)arg2, 4);
         var5.method3311(true);
         var5.field6177 = arg4;
         var5.field6175 = arg1;
         var5.field6167 = arg0;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6747[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3557(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3558(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
