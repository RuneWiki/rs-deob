import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class529 extends class428 {
   @OriginalMember(
      owner = "client!eaa",
      name = "o",
      descriptor = "Llia;"
   )
   public class506 field7559;
   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7560 = new String[]{method3825(method3824("Y\u0002\u00147n\u0014")), method3825(method3824("R\u0016\u0019u")), method3825(method3824("GM[7Q")), method3825(method3824("Y\u0002\u00147\u0010U\r\u001cm\u0012\u0014")), method3825(method3824("Y\u0002\u00147m\u0014"))};
   @OriginalMember(
      owner = "client!eaa",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field7558 = new int[3];
   @OriginalMember(
      owner = "client!eaa",
      name = "m",
      descriptor = "[F"
   )
   public static float[] field7557 = new float[2];
   @OriginalMember(
      owner = "client!eaa",
      name = "p",
      descriptor = "I"
   )
   public static int field7555;
   @OriginalMember(
      owner = "client!eaa",
      name = "q",
      descriptor = "I"
   )
   public static int field7556;

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3822(byte arg0) {
      try {
         if (arg0 >= -3) {
            method3822((byte)35);
         }

         field7558 = null;
         field7557 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7560[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Lbl;I)V"
   )
   public static final void method3823(class678 arg0, int arg1) {
      try {
         ++field7555;
         if (class613.field9015) {
            ++class377.field5443;
            if (arg0.field9848 != null) {
               class678 var2 = class504.method3657(arg1 + -15809, class573.field8327, class535.field7636);
               if (var2 != null) {
                  class421 var3 = new class421();
                  var3.field6014 = arg0;
                  var3.field6017 = var2;
                  var3.field6010 = arg0.field9848;
                  class200.method1583(var3);
               }
            }

            class447 var4 = class40.method350(class652.field9554, class430.field6150.field106, true);
            var4.field6359.method1160(100, arg0.field9854);
            var4.field6359.method1172(-29898, class535.field7636);
            var4.field6359.method1163((byte)-95, arg0.field9965);
            var4.field6359.method1185(class573.field8327, true);
            var4.field6359.method1190(arg1 ^ -6292, class732.field10714);
            var4.field6359.method1190(-9720, arg0.field9912);
            if (arg1 == 15716) {
               class430.field6150.method55(arg1 ^ 3756, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7560[0] + (arg0 != null ? field7560[2] : field7560[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "<init>",
      descriptor = "(Llia;)V"
   )
   public class529(class506 arg0) {
      try {
         this.field7559 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7560[3] + (arg0 != null ? field7560[2] : field7560[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3824(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3825(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
