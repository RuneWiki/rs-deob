import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class353 extends class345 {
   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4997 = new String[]{method2717(method2716("V8C#\u0003")), method2717(method2716("V8C\"\u0003")), method2717(method2716("V8C'\u0003")), method2717(method2716("V8C&\u0003")), method2717(method2716("V8C/\u0003")), method2717(method2716("_rCJV")), method2717(method2716("J)\u0001\b")), method2717(method2716("V8C%\u0003")), method2717(method2716("V8C!\u0003")), method2717(method2716("V8C \u0003")), method2717(method2716("V8C,\u0003"))};
   @OriginalMember(
      owner = "client!rd",
      name = "m",
      descriptor = "Lgh;"
   )
   public static class572 field4995 = new class572(54, 6);
   @OriginalMember(
      owner = "client!rd",
      name = "l",
      descriptor = "F"
   )
   public static float field4996;
   @OriginalMember(
      owner = "client!rd",
      name = "p",
      descriptor = "I"
   )
   public static int field4986;
   @OriginalMember(
      owner = "client!rd",
      name = "q",
      descriptor = "I"
   )
   public static int field4987;
   @OriginalMember(
      owner = "client!rd",
      name = "i",
      descriptor = "I"
   )
   public static int field4988;
   @OriginalMember(
      owner = "client!rd",
      name = "s",
      descriptor = "I"
   )
   public static int field4989;
   @OriginalMember(
      owner = "client!rd",
      name = "k",
      descriptor = "I"
   )
   public static int field4990;
   @OriginalMember(
      owner = "client!rd",
      name = "r",
      descriptor = "I"
   )
   public static int field4991;
   @OriginalMember(
      owner = "client!rd",
      name = "j",
      descriptor = "I"
   )
   public static int field4992;
   @OriginalMember(
      owner = "client!rd",
      name = "o",
      descriptor = "I"
   )
   public static int field4993;
   @OriginalMember(
      owner = "client!rd",
      name = "n",
      descriptor = "I"
   )
   public static int field4994;

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(IB)V",
      line = 3
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 > 99) {
            ++field4992;
            super.field4913 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4997[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(Z)I",
      line = 14
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            field4993 = 93;
         }

         ++field4994;
         return 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4997[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 25
   )
   public class353(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(II)V",
      line = 31
   )
   public static final void method2711(int arg0, int arg1) {
      try {
         ++field4989;
         if (arg1 < 8) {
            method2712(-126);
         }

         class536 var2 = class108.method1038((long)arg0, 106, 14);
         var2.method4013((byte)126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4997[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(BI)I",
      line = 47
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field4990;
         if (super.field4914.method5560(13750)) {
            return 3;
         } else {
            if (arg0 > -45) {
               this.method52((byte)127, -101);
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4997[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "c",
      descriptor = "(I)V",
      line = 63
   )
   public static void method2712(int arg0) {
      try {
         if (arg0 != 30950) {
            field4995 = null;
         }

         field4995 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4997[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "b",
      descriptor = "(Z)I",
      line = 73
   )
   public final int method2713(boolean arg0) {
      try {
         ++field4986;
         if (arg0) {
            field4993 = -13;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4997[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "b",
      descriptor = "(I)V",
      line = 85
   )
   public final void method51(int arg0) {
      try {
         if (super.field4914.method5560(13750)) {
            super.field4913 = 0;
         }

         ++field4991;
         if (arg0 != 0) {
            this.method52((byte)74, 0);
         }

         if (~super.field4913 != -2 && ~super.field4913 != -1) {
            super.field4913 = this.method53(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4997[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(I[I[Ljava/lang/String;II)V",
      line = 103
   )
   public static final void method2714(int param0, int[] param1, String[] param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(B)Z",
      line = 159
   )
   public final boolean method2715(byte arg0) {
      try {
         ++field4988;
         if (arg0 > -127) {
            field4996 = 0.704935F;
         }

         return !super.field4914.method5560(13750);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4997[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 173
   )
   public class353(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2716(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2717(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
