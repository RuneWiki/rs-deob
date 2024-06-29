import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class62 extends class790 {
   @OriginalMember(
      owner = "client!fw",
      name = "m",
      descriptor = "I"
   )
   public int field1157;
   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1163 = new String[]{method678(method677("\u000ek}\r2")), method678(method677("\u000ek}\f2")), method678(method677("\u00132}eg")), method678(method677("\u0006i?'")), method678(method677("\u000ek}ws\u0006u'u2")), method678(method677("\u000ek}\n2")), method678(method677("\u000ek}\u000f2"))};
   @OriginalMember(
      owner = "client!fw",
      name = "k",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field1161 = Calendar.getInstance();
   @OriginalMember(
      owner = "client!fw",
      name = "q",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field1158 = Calendar.getInstance(TimeZone.getTimeZone(method678(method677("/Q\u0007"))));
   @OriginalMember(
      owner = "client!fw",
      name = "n",
      descriptor = "I"
   )
   public static int field1156;
   @OriginalMember(
      owner = "client!fw",
      name = "o",
      descriptor = "I"
   )
   public static int field1159;
   @OriginalMember(
      owner = "client!fw",
      name = "p",
      descriptor = "I"
   )
   public static int field1160;
   @OriginalMember(
      owner = "client!fw",
      name = "l",
      descriptor = "I"
   )
   public static int field1162;

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(B)Lqg;"
   )
   public final class485 method672(byte arg0) {
      try {
         if (arg0 != 83) {
            method673(-109L, (byte)-120);
         }

         ++field1159;
         return class601.field8675;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1163[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(JB)V"
   )
   public static final void method673(long arg0, byte arg1) {
      try {
         field1161.setTime(new Date(arg0));
         if (arg1 <= 10) {
            field1162 = 20;
         }

         ++field1156;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1163[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method674(int arg0) {
      try {
         field1158 = null;
         if (arg0 != -25778) {
            method675((class144)null, true);
         }

         field1161 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1163[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(Lmc;Z)V"
   )
   public static final void method675(class144 arg0, boolean arg1) {
      for(int var2 = arg0.field2354; var2 <= arg0.field2356; ++var2) {
         for(int var3 = arg0.field2347; var3 <= arg0.field2348; ++var3) {
            class600 var4 = class90.field1473[arg0.field4090][var2][var3];
            if (var4 != null) {
               class533 var5 = var4.field8653;
               class533 var6 = null;

               while(var5 != null) {
                  if (var5.field7766 == arg0) {
                     if (var6 != null) {
                        var6.field7763 = var5.field7763;
                     } else {
                        var4.field8653 = var5.field7763;
                     }

                     var5.method3994(5);
                     break;
                  }

                  var6 = var5;
                  var5 = var5.field7763;
               }
            }
         }
      }

      if (!arg1) {
         class428.method3232(arg0);
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(IBII)V"
   )
   public static final void method676(int arg0, byte arg1, int arg2, int arg3) {
      try {
         class608.field8732 = new byte[arg2][arg0][arg3];
         if (arg1 >= -10) {
            field1158 = null;
         }

         ++field1160;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1163[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "<init>",
      descriptor = "(ILfk;Lqda;III)V"
   )
   public class62(int arg0, class678 arg1, class112 arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field1157 = arg5;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1163[4] + arg0 + ',' + (arg1 != null ? field1163[2] : field1163[3]) + ',' + (arg2 != null ? field1163[2] : field1163[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method677(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method678(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
