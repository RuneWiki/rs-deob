import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class140 extends class110 implements class293 {
   @OriginalMember(
      owner = "client!dn",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2244 = new String[]{method1408(method1407("z\"I\u0010\u000b")), method1408(method1407("ebI|^")), method1408(method1407("n<\u0004}")), method1408(method1407("s?\r3U\u007fc")), method1408(method1407("i%\t")), method1408(method1407("ftQ\r\u0015*c")), method1408(method1407("\u007f!\u0003d\u0017")), method1408(method1407("i%\t6Li?H")), method1408(method1407("wy_d")), method1408(method1407("s-\u0004")), method1408(method1407("s-\u0004=P1")), method1408(method1407("r%\t'[")), method1408(method1407("ftQ}")), method1408(method1407("r%\t'[1")), method1408(method1407("w\u007f_d")), method1408(method1407("wx_d")), method1408(method1407("ftQ")), method1408(method1407("ftQ\r\u0015*")), method1408(method1407("n<\u0004")), method1408(method1407("k\"\u000e$Fl?\u0006>\f")), method1408(method1407("p9\u000b>")), method1408(method1407("z\"I\u0013\u000b")), method1408(method1407("z\"InJp%\u0013l\u000b"))};
   @OriginalMember(
      owner = "client!dn",
      name = "x",
      descriptor = "Z"
   )
   public static boolean field2238 = false;
   @OriginalMember(
      owner = "client!dn",
      name = "B",
      descriptor = "Lhf;"
   )
   public static class198 field2239 = new class198("", 10);
   @OriginalMember(
      owner = "client!dn",
      name = "C",
      descriptor = "I"
   )
   public static int field2242 = -1;
   @OriginalMember(
      owner = "client!dn",
      name = "y",
      descriptor = "I"
   )
   public static int field2240;
   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "I"
   )
   public static int field2241;
   @OriginalMember(
      owner = "client!dn",
      name = "D",
      descriptor = "I"
   )
   public static int field2243;

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(ILsa;Lfea;)V"
   )
   public static final void method1405(int arg0, class39 arg1, class82 arg2) {
      boolean var3 = client.field10022;

      try {
         class266.field4063 = arg1;
         class745.field10601 = arg2;
         class205.field2917 = "";
         ++field2240;
         if (arg0 == 0) {
            label73: {
               if (!class238.field3676.startsWith(field2244[4])) {
                  if (!class238.field3676.startsWith(field2244[11])) {
                     if (!class238.field3676.startsWith(field2244[9])) {
                        break label73;
                     }

                     class205.field2917 = class205.field2917 + field2244[10];
                     if (!var3) {
                        break label73;
                     }
                  }

                  class205.field2917 = class205.field2917 + field2244[13];
                  if (!var3) {
                     break label73;
                  }
               }

               class205.field2917 = class205.field2917 + field2244[7];
            }

            if (!class745.field10601.field1291) {
               if (!class238.field3670.startsWith(field2244[6]) && !class238.field3670.startsWith(field2244[17])) {
                  if (!class238.field3670.startsWith(field2244[14]) && !class238.field3670.startsWith(field2244[15]) && !class238.field3670.startsWith(field2244[8]) && !class238.field3670.startsWith(field2244[16])) {
                     if (class238.field3670.startsWith(field2244[18])) {
                        class205.field2917 = class205.field2917 + field2244[2];
                     } else {
                        class205.field2917 = class205.field2917 + field2244[19];
                     }
                  } else {
                     class205.field2917 = class205.field2917 + field2244[12];
                  }
               } else {
                  class205.field2917 = class205.field2917 + field2244[5];
               }
            } else {
               class205.field2917 = class205.field2917 + field2244[3];
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2244[21] + arg0 + ',' + (arg1 != null ? field2244[1] : field2244[20]) + ',' + (arg2 != null ? field2244[1] : field2244[20]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "<init>",
      descriptor = "(Lqs;IZ[[I)V"
   )
   public class140(class771 param1, int param2, boolean param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dn",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method1406(int arg0) {
      try {
         if (arg0 == 0) {
            field2239 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2244[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1408(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
