import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class64 extends class345 {
   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1179 = new String[]{method688(method687("5#}'\u0006")), method688(method687("5#}!\u0006")), method688(method687("5#}&\u0006")), method688(method687("5#}\"\u0006")), method688(method687("5#}$\u0006")), method688(method687("5#} \u0006")), method688(method687("5#}%\u0006"))};
   @OriginalMember(
      owner = "client!nr",
      name = "i",
      descriptor = "Ldp;"
   )
   public static class3 field1176 = new class3();
   @OriginalMember(
      owner = "client!nr",
      name = "o",
      descriptor = "Lld;"
   )
   public static class178 field1178 = new class178(4);
   @OriginalMember(
      owner = "client!nr",
      name = "j",
      descriptor = "I"
   )
   public static int field1170;
   @OriginalMember(
      owner = "client!nr",
      name = "r",
      descriptor = "I"
   )
   public static int field1172;
   @OriginalMember(
      owner = "client!nr",
      name = "q",
      descriptor = "I"
   )
   public static int field1173;
   @OriginalMember(
      owner = "client!nr",
      name = "m",
      descriptor = "I"
   )
   public static int field1174;
   @OriginalMember(
      owner = "client!nr",
      name = "p",
      descriptor = "I"
   )
   public static int field1175;
   @OriginalMember(
      owner = "client!nr",
      name = "l",
      descriptor = "I"
   )
   public static int field1177;
   @OriginalMember(
      owner = "client!nr",
      name = "n",
      descriptor = "Ld;"
   )
   public static class160 field1169;
   @OriginalMember(
      owner = "client!nr",
      name = "k",
      descriptor = "[[B"
   )
   public static byte[][] field1171;

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(Z)I",
      line = 4
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            this.method684(true);
         }

         ++field1177;
         return 127;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1179[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 15
   )
   public class64(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "(Z)I",
      line = 22
   )
   public final int method684(boolean arg0) {
      try {
         if (arg0) {
            return 12;
         } else {
            ++field1170;
            return super.field4913;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1179[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(B)V",
      line = 39
   )
   public static final void method685(byte arg0) {
      try {
         class530.field7719 = new class743[2000];
         class614.field8921 = 0;
         class727.field10461 = class57.field1124;
         class778.field11382 = 0;
         ++field1172;
         class256.field3636 = new class743[1000];
         class203.field3041 = 0;
         class759.field11020 = false;
         class38.field912 = 0;
         class128.field2141 = new class743[500];
         if (arg0 >= -25) {
            method685((byte)-105);
         }

         class665.field9667 = new int[class323.field4655][class479.field6989 + 1][class357.field5100 + 1];
         class245.field3527 = new class743[500];
         class761.field11038 = class57.field1124;
         if (class49.field1047 instanceof class721) {
            class11.field119 = false;
         } else {
            class11.field119 = true;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1179[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "(B)V",
      line = 71
   )
   public static void method686(byte arg0) {
      try {
         field1176 = null;
         field1178 = null;
         if (arg0 != -22) {
            field1176 = null;
         }

         field1171 = null;
         field1169 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1179[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "(I)V",
      line = 84
   )
   public final void method51(int arg0) {
      try {
         ++field1173;
         if (arg0 > super.field4913 && ~super.field4913 < -128) {
            super.field4913 = this.method53(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1179[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 95
   )
   public class64(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(IB)V",
      line = 99
   )
   public final void method54(int arg0, byte arg1) {
      try {
         super.field4913 = arg0;
         ++field1175;
         if (arg1 < 99) {
            field1178 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1179[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(BI)I",
      line = 113
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 >= -45) {
            field1169 = null;
         }

         ++field1174;
         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1179[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method687(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method688(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
