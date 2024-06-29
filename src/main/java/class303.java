import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class303 {
   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4131 = new String[]{method2254(method2253("T$\u007f\u0013H")), method2254(method2253("X\"2#\u000fF$7%")), method2254(method2253("T$\u007f\u0015H")), method2254(method2253("T$\u007f\u0012H")), method2254(method2253("T$\u007f\u0010H")), method2254(method2253("[>==")), method2254(method2253("Ne\u007f\u007f\u001d"))};
   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field4129 = false;
   @OriginalMember(
      owner = "client!ao",
      name = "b",
      descriptor = "I"
   )
   public static int field4126;
   @OriginalMember(
      owner = "client!ao",
      name = "e",
      descriptor = "I"
   )
   public static int field4127;
   @OriginalMember(
      owner = "client!ao",
      name = "d",
      descriptor = "I"
   )
   public static int field4128;
   @OriginalMember(
      owner = "client!ao",
      name = "c",
      descriptor = "I"
   )
   public static int field4130;

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method2249(int arg0) {
      try {
         if (arg0 != 5041) {
            method2249(59);
         }

         class5.method26();
         ++field4128;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4131[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 20
   )
   public static final void method2250(boolean arg0, String arg1) {
      try {
         if (!arg0) {
            method2249(45);
         }

         ++field4130;
         class96.field1242 = arg1;
         class168.field2346 = class96.field1242.length();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4131[4] + arg0 + ',' + (arg1 != null ? field4131[6] : field4131[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(II)V",
      line = 36
   )
   public static final void method2251(int arg0, int arg1) {
      try {
         if (arg1 != 222) {
            method2251(127, -31);
         }

         class592.field8717 = 3;
         class612.field8977 = arg0;
         class697.field10218 = 100;
         class504.field7317 = -1;
         ++field4127;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4131[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "b",
      descriptor = "(I)V",
      line = 50
   )
   public static final void method2252(int arg0) {
      try {
         ++field4126;
         if (arg0 != class619.field9136.toLowerCase().indexOf(field4131[1])) {
            class788.field11567[186] = 57;
            class788.field11567[223] = 28;
            class788.field11567[221] = 43;
            class788.field11567[188] = 71;
            class788.field11567[220] = 74;
            class788.field11567[187] = 27;
            class788.field11567[222] = 59;
            class788.field11567[190] = 72;
            class788.field11567[191] = 73;
            class788.field11567[219] = 42;
            class788.field11567[189] = 26;
            class788.field11567[192] = 58;
         } else {
            label20: {
               class788.field11567[59] = 57;
               class788.field11567[44] = 71;
               class788.field11567[61] = 27;
               class788.field11567[92] = 74;
               class788.field11567[47] = 73;
               class788.field11567[91] = 42;
               class788.field11567[45] = 26;
               class788.field11567[46] = 72;
               if (class619.field9122 != null) {
                  class788.field11567[222] = 58;
                  class788.field11567[192] = 28;
                  class788.field11567[520] = 59;
                  if (!client.field4360) {
                     break label20;
                  }
               }

               class788.field11567[192] = 58;
               class788.field11567[222] = 59;
            }

            class788.field11567[93] = 43;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4131[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2253(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2254(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
