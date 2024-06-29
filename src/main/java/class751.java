import java.awt.Color;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class751 extends class650 {
   @OriginalMember(
      owner = "client!jn",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11118 = new String[]{method5453(method5452("U\u0010GAq\u0017")), method5453(method5452("U\u0010G@q\u0017")), method5453(method5452("DPG-M")), method5453(method5452("Q\u000b\u0005o"))};
   @OriginalMember(
      owner = "client!jn",
      name = "P",
      descriptor = "I"
   )
   public static int field11114;
   @OriginalMember(
      owner = "client!jn",
      name = "Q",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field11113;
   @OriginalMember(
      owner = "client!jn",
      name = "R",
      descriptor = "F"
   )
   public static float field11117;
   @OriginalMember(
      owner = "client!jn",
      name = "S",
      descriptor = "I"
   )
   public static int field11115;
   @OriginalMember(
      owner = "client!jn",
      name = "T",
      descriptor = "I"
   )
   public static int field11116;

   static {
      new BitSet(65536);
      field11114 = -1;
      field11113 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   }

   @OriginalMember(
      owner = "client!jn",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public static void method5450(int arg0) {
      try {
         field11113 = null;
         if (arg0 != 0) {
            method5451(61, (class66)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11118[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(ILha;)V",
      line = 20
   )
   public static final void method5451(int arg0, class66 arg1) {
      boolean var2 = client.field4360;

      try {
         ++field11115;
         class379.field5462 = new class281[class707.field10328.length];
         if (arg0 >= -116) {
            method5450(37);
         }

         int var3 = 0;
         if (var2 || var3 < class707.field10328.length) {
            do {
               int var4 = class707.field10328[var3];
               class206 var5 = class73.method674(var4, class49.field638, (byte)112);
               class67 var6 = arg1.method502(var5, class439.method3232(class161.field2300, var4), true);
               class379.field5462[var3] = new class281(var6, var5);
               ++var3;
            } while(var3 < class707.field10328.length);

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11118[1] + arg0 + ',' + (arg1 != null ? field11118[2] : field11118[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5452(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5453(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
