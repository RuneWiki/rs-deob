import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class1 {
   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8 = new String[]{method5(method4("cQ/\b7)")), method5(method4("cQ/\b5)")), method5(method4("DE<I\u0004;\u0017")), method5(method4("$\u0007/"))};
   @OriginalMember(
      owner = "client!bfa",
      name = "g",
      descriptor = "Lhka;"
   )
   public static class377 field2 = new class377(11, 5);
   @OriginalMember(
      owner = "client!bfa",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field5 = new int[50];
   @OriginalMember(
      owner = "client!bfa",
      name = "d",
      descriptor = "I"
   )
   public static int field4 = -1;
   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "I"
   )
   public static int field6 = 1;
   @OriginalMember(
      owner = "client!bfa",
      name = "f",
      descriptor = "I"
   )
   public static int field1;
   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "I"
   )
   public static int field3;
   @OriginalMember(
      owner = "client!bfa",
      name = "e",
      descriptor = "I"
   )
   public static int field7;

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method1(int arg0, boolean arg1) {
      try {
         label35: {
            if (arg1 && class60.field737 != null) {
               class651.field9397 = class60.field737.field2981;
               if (!client.field1786) {
                  break label35;
               }
            }

            class651.field9397 = -1;
         }

         ++field3;
         class788.field11542 = null;
         class60.field737 = null;
         class334.field5138 = null;
         class598.field8777 = 0;
         class60.method461();
         class60.field747.method4981((byte)-79);
         class753.field11170 = null;
         class68.field901 = null;
         class706.field10632 = null;
         class92.field1322 = null;
         class60.field750 = null;
         class391.field6147 = null;
         class177.field2774 = -1;
         class722.field10804 = null;
         class230.field3525 = -1;
         class471.field7160 = null;
         class175.field2752 = null;
         class426.field6581 = null;
         if (class60.field744 != null) {
            class60.field744.method135(-89);
            class60.field744.method136(64, arg0 ^ 16182, 128);
         }

         if (arg0 == 26215) {
            if (class60.field745 != null) {
               class60.field745.method4011(64, arg0 ^ 23645, 64);
            }

            if (class60.field738 != null) {
               class60.field738.method1416(false, 64);
            }

            class228.field3467.method1031(126, 64);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2(boolean arg0) {
      try {
         if (arg0) {
            method3((String)null, (byte)31);
         }

         field2 = null;
         field5 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method3(String arg0, byte arg1) {
      if (arg1 != 33) {
         field4 = -7;
      }

      ++field1;
      System.out.println(field8[2] + class620.method4561(arg1 ^ 2988, "\n", field8[3], arg0));
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
