import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class44 extends class294 implements class132 {
   @OriginalMember(
      owner = "client!bg",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field590 = new String[]{method323(method322("\u0016`f\u0003|")), method323(method322("\u0016`f\r|")), method323(method322("\u0016`f\f|")), method323(method322("\u0016`f\b|")), method323(method322("\u0016`f\u000e|")), method323(method322("\u0016`f\u0002|")), method323(method322("\u0016`f\u000b|")), method323(method322("\u0016`f\t|")), method323(method322("\u001ar$&")), method323(method322("\u000f)fd)")), method323(method322("\u0016`f\u000f|"))};
   @OriginalMember(
      owner = "client!bg",
      name = "s",
      descriptor = "C"
   )
   public char field586;
   @OriginalMember(
      owner = "client!bg",
      name = "u",
      descriptor = "I"
   )
   public static int field576;
   @OriginalMember(
      owner = "client!bg",
      name = "r",
      descriptor = "I"
   )
   public int field577;
   @OriginalMember(
      owner = "client!bg",
      name = "v",
      descriptor = "I"
   )
   public int field578;
   @OriginalMember(
      owner = "client!bg",
      name = "q",
      descriptor = "I"
   )
   public static int field579;
   @OriginalMember(
      owner = "client!bg",
      name = "t",
      descriptor = "I"
   )
   public static int field580;
   @OriginalMember(
      owner = "client!bg",
      name = "o",
      descriptor = "I"
   )
   public static int field581;
   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "I"
   )
   public static int field582;
   @OriginalMember(
      owner = "client!bg",
      name = "m",
      descriptor = "I"
   )
   public static int field583;
   @OriginalMember(
      owner = "client!bg",
      name = "y",
      descriptor = "I"
   )
   public static int field585;
   @OriginalMember(
      owner = "client!bg",
      name = "n",
      descriptor = "I"
   )
   public static int field587;
   @OriginalMember(
      owner = "client!bg",
      name = "x",
      descriptor = "I"
   )
   public int field588;
   @OriginalMember(
      owner = "client!bg",
      name = "p",
      descriptor = "J"
   )
   public long field584;
   @OriginalMember(
      owner = "client!bg",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field589;

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method313(byte arg0) {
      try {
         if (arg0 != -27) {
            this.field588 = 63;
         }

         ++field582;
         return this.field584;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field590[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method314(int arg0) {
      try {
         ++field581;
         if (arg0 != -27114) {
            this.field584 = -120L;
         }

         return this.field588;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field590[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(I)C"
   )
   public final char method315(int arg0) {
      try {
         ++field585;
         if (arg0 != 31589) {
            this.field577 = 44;
         }

         return this.field586;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field590[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method316(int arg0) {
      try {
         if (arg0 == 0) {
            field589 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field590[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "h",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method317(int arg0) {
      try {
         ++field576;
         if (!class304.field4759 && class305.field4780 != null) {
            if (arg0 != 0) {
               field589 = null;
            }

            return class305.field4780.field2903;
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field590[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method318(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method319(int arg0) {
      try {
         ++field580;
         if (arg0 != 4618) {
            this.method319(102);
         }

         return this.field577;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field590[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method320(byte arg0) {
      try {
         ++field583;
         if (arg0 >= -32) {
            this.field578 = -25;
         }

         return this.field578;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field590[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIZIJILrr;)V"
   )
   public static final void method321(int arg0, int arg1, boolean arg2, int arg3, long arg4, int arg5, class678 arg6) {
      try {
         class117.method1078(arg2, arg3, -75, arg0, arg6, arg1, arg5, arg4);
         ++field579;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field590[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field590[9] : field590[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method322(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method323(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
