import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class377 implements class262 {
   @OriginalMember(
      owner = "client!pt",
      name = "d",
      descriptor = "Leu;"
   )
   public class634 field5512;
   @OriginalMember(
      owner = "client!pt",
      name = "h",
      descriptor = "Lmj;"
   )
   public class730 field5508;
   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "I"
   )
   public int field5513;
   @OriginalMember(
      owner = "client!pt",
      name = "i",
      descriptor = "I"
   )
   public int field5511;
   @OriginalMember(
      owner = "client!pt",
      name = "c",
      descriptor = "I"
   )
   public int field5516;
   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5517 = new String[]{method2945(method2944("ewh\u000e\u0013")), method2945(method2944("ewh\t\u0013")), method2945(method2944("ewh\f\u0013")), method2945(method2944("ewh\u000f\u0013")), method2945(method2944("n-hcF")), method2945(method2944("{v*!")), method2945(method2944("ewhqR{j2s\u0013"))};
   @OriginalMember(
      owner = "client!pt",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field5507 = new int[4];
   @OriginalMember(
      owner = "client!pt",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field5509 = false;
   @OriginalMember(
      owner = "client!pt",
      name = "g",
      descriptor = "I"
   )
   public static int field5510;
   @OriginalMember(
      owner = "client!pt",
      name = "b",
      descriptor = "I"
   )
   public static int field5514;
   @OriginalMember(
      owner = "client!pt",
      name = "f",
      descriptor = "I"
   )
   public static int field5515;

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public class577 method108(byte arg0) {
      try {
         if (arg0 > -70) {
            return null;
         } else {
            ++field5510;
            return class220.field3142;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5517[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2941(byte param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2942(int arg0) {
      try {
         if (arg0 != -1700870800) {
            field5509 = false;
         }

         field5507 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5517[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method2943(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            return true;
         } else {
            ++field5515;
            return class318.method2574(arg0, arg2, 3452) & class226.method1959(arg0, arg2, -6007);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5517[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "<init>",
      descriptor = "(ILeu;Lmj;II)V"
   )
   public class377(int arg0, class634 arg1, class730 arg2, int arg3, int arg4) {
      try {
         this.field5512 = arg1;
         this.field5508 = arg2;
         this.field5513 = arg4;
         this.field5511 = arg3;
         this.field5516 = arg0;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5517[6] + arg0 + ',' + (arg1 != null ? field5517[4] : field5517[5]) + ',' + (arg2 != null ? field5517[4] : field5517[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2944(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2945(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
