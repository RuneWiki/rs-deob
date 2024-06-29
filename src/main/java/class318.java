import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class318 extends class739 {
   @OriginalMember(
      owner = "client!fca",
      name = "p",
      descriptor = "I"
   )
   private int field4757 = 0;
   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4763 = new String[]{method2578(method2577("sE,yP=")), method2578(method2577("sE,yW=")), method2578(method2577("sE,yQ=")), method2578(method2577("sE,y\\="))};
   @OriginalMember(
      owner = "client!fca",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field4756 = false;
   @OriginalMember(
      owner = "client!fca",
      name = "n",
      descriptor = "Lhha;"
   )
   public static class724 field4760 = new class724(50, 3);
   @OriginalMember(
      owner = "client!fca",
      name = "o",
      descriptor = "I"
   )
   public static int field4758;
   @OriginalMember(
      owner = "client!fca",
      name = "q",
      descriptor = "I"
   )
   public static int field4759;
   @OriginalMember(
      owner = "client!fca",
      name = "k",
      descriptor = "I"
   )
   public static int field4762;
   @OriginalMember(
      owner = "client!fca",
      name = "l",
      descriptor = "Ld;"
   )
   public static class672 field4761;

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2574(int arg0, int arg1, int arg2) {
      try {
         ++field4762;
         if (arg2 != 3452) {
            field4756 = false;
         }

         return false;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4763[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2575(int arg0) {
      try {
         if (arg0 == 2) {
            field4761 = null;
            field4760 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4763[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method983(boolean arg0, int arg1) {
      try {
         if (arg1 < -55) {
            ++field4759;
            int var3 = super.field10549.field5512.method4636(class111.field1737, (byte)-118, super.field10555.method1351()) + super.field10549.field5511;
            int var4 = super.field10549.field5508.method5290(super.field10555.method1356(), class595.field8386, 107) - -super.field10549.field5513;
            super.field10555.method1445((float)(var3 + super.field10555.method1351() / 2), (float)(var4 - -(super.field10555.method1356() / 2)), 4096, this.field4757);
            this.field4757 += ((class13)super.field10549).field189;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4763[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "<init>",
      descriptor = "(Lsa;Lkv;)V"
   )
   public class318(class39 arg0, class13 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2576(int arg0, int arg1) {
      try {
         ++field4758;
         class111 var2 = class796.method5734(1, (long)arg1, (byte)-119);
         var2.method1083(-14);
         if (arg0 != -7209) {
            field4756 = true;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4763[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2577(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2578(char[] arg0) {
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
            var10005 = 38;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
