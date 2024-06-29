import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class402 extends class257 {
   @OriginalMember(
      owner = "client!fha",
      name = "k",
      descriptor = "I"
   )
   private int field5816 = 0;
   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5819 = new String[]{method3037(method3036("\u00123\u001eF]\\")), method3037(method3036("\u00123\u001eF_\\")), method3037(method3036("\u00123\u001eFP\\")), method3037(method3036("\u001a.\u0013\u0004")), method3037(method3036("\u00123\u001eF^\\")), method3037(method3036("\u000fuQFe"))};
   @OriginalMember(
      owner = "client!fha",
      name = "m",
      descriptor = "Lll;"
   )
   public static class387 field5818 = new class387();
   @OriginalMember(
      owner = "client!fha",
      name = "n",
      descriptor = "I"
   )
   public static int field5814;
   @OriginalMember(
      owner = "client!fha",
      name = "o",
      descriptor = "I"
   )
   public static int field5815;
   @OriginalMember(
      owner = "client!fha",
      name = "l",
      descriptor = "I"
   )
   public static int field5817;

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3033(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ld;ZI)Lha;"
   )
   public static final class66 method3034(Canvas arg0, class162 arg1, boolean arg2, int arg3) {
      try {
         if (!arg2) {
            field5818 = null;
         }

         ++field5815;
         return new class573(arg0, arg1, arg3);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5819[4] + (arg0 != null ? field5819[5] : field5819[3]) + ',' + (arg1 != null ? field5819[5] : field5819[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "<init>",
      descriptor = "(Lkf;Lffa;)V"
   )
   public class402(class266 arg0, class199 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method861(byte arg0, boolean arg1) {
      try {
         ++field5817;
         int var3 = super.field3488.field10685.method1384(super.field3485.method960(), (byte)-128, class87.field1142) + super.field3488.field10688;
         int var4 = super.field3488.field10684.method1414(super.field3485.method957(), 115, class60.field743) - -super.field3488.field10689;
         int var5 = -80 % ((-31 - arg0) / 44);
         super.field3485.method3579((float)(var3 - -(super.field3485.method960() / 2)), (float)(var4 + super.field3485.method957() / 2), 4096, this.field5816);
         this.field5816 += ((class199)super.field3488).field2827;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5819[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method3035(boolean arg0) {
      try {
         if (arg0) {
            field5818 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5819[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3036(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3037(char[] arg0) {
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
            var10005 = 91;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
