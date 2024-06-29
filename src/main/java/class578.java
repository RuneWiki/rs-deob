import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class578 extends class758 {
   @OriginalMember(
      owner = "client!gh",
      name = "u",
      descriptor = "I"
   )
   private int field7928 = -1;
   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7936 = new String[]{method4156(method4155("Jkl0J")), method4156(method4155("_0.r")), method4156(method4155("V-l[\u001f")), method4156(method4155("V-l_\u001f")), method4156(method4155("V-lZ\u001f")), method4156(method4155("V-l\\\u001f")), method4156(method4155("V-lX\u001f"))};
   @OriginalMember(
      owner = "client!gh",
      name = "x",
      descriptor = "I"
   )
   public static int field7925 = -1;
   @OriginalMember(
      owner = "client!gh",
      name = "s",
      descriptor = "I"
   )
   public static int field7932 = 0;
   @OriginalMember(
      owner = "client!gh",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field7934 = new int[]{32, 39, 44, 47};
   @OriginalMember(
      owner = "client!gh",
      name = "t",
      descriptor = "B"
   )
   private byte field7933;
   @OriginalMember(
      owner = "client!gh",
      name = "p",
      descriptor = "I"
   )
   public static int field7926;
   @OriginalMember(
      owner = "client!gh",
      name = "w",
      descriptor = "I"
   )
   public static int field7927;
   @OriginalMember(
      owner = "client!gh",
      name = "r",
      descriptor = "I"
   )
   private int field7929;
   @OriginalMember(
      owner = "client!gh",
      name = "n",
      descriptor = "I"
   )
   public static int field7930;
   @OriginalMember(
      owner = "client!gh",
      name = "q",
      descriptor = "I"
   )
   public static int field7931;
   @OriginalMember(
      owner = "client!gh",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   private String field7935;

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4152(int arg0) {
      try {
         int var1 = -104 / ((3 - arg0) / 62);
         field7934 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7936[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method4153(int arg0, boolean arg1) {
      try {
         ++field7926;
         if (arg1) {
            class341.method2699((byte)-125);
            int var2 = class517.field7093.method3268(8, arg0).field10005;
            if (~var2 != -1) {
               int var3 = class259.field3320.field5636[arg0];
               if (~var2 == -6) {
                  class196.field2377 = var3;
               }

               if (~var2 == -7) {
                  class507.field7036 = var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7936[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(Lob;B)V"
   )
   public final void method1311(class772 arg0, byte arg1) {
      try {
         ++field7931;
         class696 var3 = arg0.field11132[this.field7928];
         var3.field10165 = this.field7929;
         var3.field10170 = this.field7933;
         int var4 = -109 / ((54 - arg1) / 57);
         var3.field10164 = this.field7935;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7936[5] + (arg0 != null ? field7936[0] : field7936[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method1313(class594 arg0, byte arg1) {
      try {
         ++field7927;
         this.field7928 = arg0.method4280(-19104);
         this.field7933 = arg0.method4340(409855200);
         if (arg1 >= -18) {
            this.method1311((class772)null, (byte)17);
         }

         this.field7929 = arg0.method4280(-19104);
         arg0.method4304((byte)127);
         this.field7935 = arg0.method4291(-57);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7936[3] + (arg0 != null ? field7936[0] : field7936[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "a",
      descriptor = "(ILeb;IB)V"
   )
   public static final void method4154(int arg0, class657 arg1, int arg2, byte arg3) {
      try {
         class155.field2004 = arg1;
         class174.field2174 = arg2;
         ++field7930;
         class623.field8694 = arg0;
         if (arg3 >= -70) {
            field7934 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7936[2] + arg0 + ',' + (arg1 != null ? field7936[0] : field7936[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4155(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4156(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
