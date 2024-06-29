import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class94 {
   @OriginalMember(
      owner = "client!vga",
      name = "d",
      descriptor = "I"
   )
   public int field1215;
   @OriginalMember(
      owner = "client!vga",
      name = "e",
      descriptor = "I"
   )
   public int field1214;
   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1225 = new String[]{method814(method813("zHGJ")), method814(method813("o\u0013\u0005\bN")), method814(method813("bZJ\br<")), method814(method813("bZJ\bw<")), method814(method813("bZJ\b\u000f}SBR\r<")), method814(method813("bZJ\bv<")), method814(method813("bZJ\bp<")), method814(method813("bZJ\bq<"))};
   @OriginalMember(
      owner = "client!vga",
      name = "l",
      descriptor = "Leg;"
   )
   public static class118 field1219 = new class118(32, 10);
   @OriginalMember(
      owner = "client!vga",
      name = "b",
      descriptor = "Lwu;"
   )
   public static class395 field1221 = new class395(6, 0, 4, 2);
   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "Lek;"
   )
   public static class536 field1222 = new class536(47, 3);
   @OriginalMember(
      owner = "client!vga",
      name = "m",
      descriptor = "I"
   )
   public static int field1223 = 1400;
   @OriginalMember(
      owner = "client!vga",
      name = "i",
      descriptor = "I"
   )
   public static int field1209;
   @OriginalMember(
      owner = "client!vga",
      name = "n",
      descriptor = "I"
   )
   public static int field1210;
   @OriginalMember(
      owner = "client!vga",
      name = "p",
      descriptor = "I"
   )
   public int field1211;
   @OriginalMember(
      owner = "client!vga",
      name = "j",
      descriptor = "I"
   )
   public int field1212;
   @OriginalMember(
      owner = "client!vga",
      name = "h",
      descriptor = "I"
   )
   public static int field1216;
   @OriginalMember(
      owner = "client!vga",
      name = "o",
      descriptor = "I"
   )
   public int field1218;
   @OriginalMember(
      owner = "client!vga",
      name = "c",
      descriptor = "I"
   )
   public static int field1220;
   @OriginalMember(
      owner = "client!vga",
      name = "f",
      descriptor = "I"
   )
   public static int field1224;
   @OriginalMember(
      owner = "client!vga",
      name = "k",
      descriptor = "Lew;"
   )
   public class521 field1213;
   @OriginalMember(
      owner = "client!vga",
      name = "g",
      descriptor = "Lvga;"
   )
   public class94 field1217;

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(I)Ldu;",
      line = 3
   )
   public final class377 method808(int arg0) {
      try {
         if (arg0 != 47) {
            this.field1217 = null;
         }

         ++field1210;
         return class216.method1706(this.field1215, 1);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1225[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(IB)Lvga;",
      line = 15
   )
   public final class94 method809(int arg0, byte arg1) {
      try {
         ++field1209;
         if (arg1 != 102) {
            this.field1214 = 105;
         }

         return new class94(this.field1215, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1225[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "b",
      descriptor = "(I)V",
      line = 27
   )
   public static final void method810(int arg0) {
      try {
         if (arg0 >= -82) {
            method811(-76, (class66)null);
         }

         ++field1216;
         ++class3.field17;
         class447 var1 = class40.method350(class743.field10829, class430.field6150.field106, true);
         var1.field6359.method1160(127, class370.field5384);
         class430.field6150.method55(13256, var1);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1225[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(ILha;)V",
      line = 43
   )
   public static final void method811(int arg0, class66 arg1) {
      try {
         label27: {
            ++field1220;
            if (!class743.field10822) {
               class794.method5720(arg1, 27406);
               if (!client.field4360) {
                  break label27;
               }
            }

            class466.method3389(arg1, (byte)93);
         }

         if (arg0 != 3) {
            method812((byte)-49);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1225[2] + arg0 + ',' + (arg1 != null ? field1225[1] : field1225[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(B)V",
      line = 64
   )
   public static void method812(byte arg0) {
      try {
         field1221 = null;
         if (arg0 > 66) {
            field1219 = null;
            field1222 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1225[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "<init>",
      descriptor = "(II)V",
      line = 82
   )
   public class94(int arg0, int arg1) {
      try {
         this.field1215 = arg0;
         this.field1214 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1225[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method813(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method814(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
