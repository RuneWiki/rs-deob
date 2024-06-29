import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class130 extends class171 {
   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1669 = new String[]{method1108(method1107("8g\u001eD|")), method1108(method1107("8g\u001eG|")), method1108(method1107("8g\u001eF|")), method1108(method1107("7!\u001e+)")), method1108(method1107("\"z\\i")), method1108(method1107("8g\u001eA|"))};
   @OriginalMember(
      owner = "client!th",
      name = "u",
      descriptor = "I"
   )
   public static int field1664 = 0;
   @OriginalMember(
      owner = "client!th",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1666 = "";
   @OriginalMember(
      owner = "client!th",
      name = "r",
      descriptor = "B"
   )
   private byte field1661;
   @OriginalMember(
      owner = "client!th",
      name = "s",
      descriptor = "B"
   )
   private byte field1667;
   @OriginalMember(
      owner = "client!th",
      name = "w",
      descriptor = "I"
   )
   public static int field1662;
   @OriginalMember(
      owner = "client!th",
      name = "x",
      descriptor = "I"
   )
   public static int field1663;
   @OriginalMember(
      owner = "client!th",
      name = "v",
      descriptor = "I"
   )
   public static int field1668;
   @OriginalMember(
      owner = "client!th",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   private String field1665;

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1103(byte arg0) {
      try {
         if (arg0 != 40) {
            method1105(35);
         }

         ++field1668;
         if (class19.method141(6550)) {
            if (class644.field9659 == null) {
               class209.method1722(true);
            }

            class621.field9185 = 0;
            class704.field10289 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1669[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Lgea;B)V"
   )
   public final void method1104(class66 arg0, byte arg1) {
      try {
         if (arg1 != -111) {
            this.method1104((class66)null, (byte)-49);
         }

         ++field1663;
         this.field1665 = arg0.method654((byte)-118);
         if (this.field1665 != null) {
            arg0.method640(255);
            this.field1661 = arg0.method628((byte)-12);
            this.field1667 = arg0.method628((byte)-12);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1669[5] + (arg0 != null ? field1669[3] : field1669[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1105(int arg0) {
      try {
         if (arg0 == 0) {
            field1666 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1669[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Lfu;I)V"
   )
   public final void method1106(class80 arg0, int arg1) {
      try {
         ++field1662;
         arg0.field1112 = this.field1665;
         if (arg1 != -3244) {
            method1103((byte)-42);
         }

         if (this.field1665 != null) {
            arg0.field1105 = this.field1667;
            arg0.field1109 = this.field1661;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1669[2] + (arg0 != null ? field1669[3] : field1669[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1107(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1108(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
