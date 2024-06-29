import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class58 extends class3 {
   @OriginalMember(
      owner = "client!dm",
      name = "F",
      descriptor = "Z"
   )
   public boolean field714 = false;
   @OriginalMember(
      owner = "client!dm",
      name = "m",
      descriptor = "I"
   )
   private int field717 = 0;
   @OriginalMember(
      owner = "client!dm",
      name = "q",
      descriptor = "Lnia;"
   )
   public class674 field719 = new class674();
   @OriginalMember(
      owner = "client!dm",
      name = "p",
      descriptor = "Lnia;"
   )
   private class674 field727 = new class674();
   @OriginalMember(
      owner = "client!dm",
      name = "k",
      descriptor = "Z"
   )
   private boolean field728 = false;
   @OriginalMember(
      owner = "client!dm",
      name = "w",
      descriptor = "J"
   )
   private long field716;
   @OriginalMember(
      owner = "client!dm",
      name = "n",
      descriptor = "Ltu;"
   )
   public class370 field724;
   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "Lcba;"
   )
   public class577 field723;
   @OriginalMember(
      owner = "client!dm",
      name = "v",
      descriptor = "Luba;"
   )
   public class457 field726;
   @OriginalMember(
      owner = "client!dm",
      name = "j",
      descriptor = "Lbo;"
   )
   public class762 field725;
   @OriginalMember(
      owner = "client!dm",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field736 = new String[]{method458(method457("!q?jv+ueh7")), method458(method457(">2?xb")), method458(method457("+i}:")), method458(method457("!q?\u00137")), method458(method457("!q?\u00177")), method458(method457("!q?\u00157")), method458(method457("!q?\u00127")), method458(method457("!q?\u00147"))};
   @OriginalMember(
      owner = "client!dm",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public static String field715 = null;
   @OriginalMember(
      owner = "client!dm",
      name = "x",
      descriptor = "I"
   )
   public int field713;
   @OriginalMember(
      owner = "client!dm",
      name = "A",
      descriptor = "I"
   )
   public static int field718;
   @OriginalMember(
      owner = "client!dm",
      name = "o",
      descriptor = "I"
   )
   public static int field720;
   @OriginalMember(
      owner = "client!dm",
      name = "E",
      descriptor = "I"
   )
   public static int field721;
   @OriginalMember(
      owner = "client!dm",
      name = "u",
      descriptor = "I"
   )
   public static int field722;
   @OriginalMember(
      owner = "client!dm",
      name = "D",
      descriptor = "I"
   )
   private int field729;
   @OriginalMember(
      owner = "client!dm",
      name = "s",
      descriptor = "I"
   )
   private int field730;
   @OriginalMember(
      owner = "client!dm",
      name = "B",
      descriptor = "I"
   )
   private int field731;
   @OriginalMember(
      owner = "client!dm",
      name = "r",
      descriptor = "I"
   )
   private int field732;
   @OriginalMember(
      owner = "client!dm",
      name = "t",
      descriptor = "I"
   )
   private int field733;
   @OriginalMember(
      owner = "client!dm",
      name = "l",
      descriptor = "I"
   )
   private int field734;
   @OriginalMember(
      owner = "client!dm",
      name = "y",
      descriptor = "I"
   )
   private int field735;

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method452(int arg0) {
      try {
         this.field719.field9771 = this.field724.field5373;
         this.field719.field9760 = this.field724.field5383;
         this.field719.field9757 = this.field724.field5371;
         this.field719.field9761 = this.field724.field5380;
         if (arg0 != -32685) {
            method455(17, -26);
         }

         this.field719.field9759 = this.field724.field5369;
         this.field719.field9769 = this.field724.field5381;
         this.field719.field9768 = this.field724.field5376;
         this.field719.field9758 = this.field724.field5382;
         ++field718;
         this.field719.field9770 = this.field724.field5375;
         if (this.field719.field9760 == this.field719.field9759 && ~this.field719.field9769 == ~this.field719.field9759 && this.field719.field9761 == this.field719.field9757 && ~this.field719.field9768 == ~this.field719.field9761 && this.field719.field9771 == this.field719.field9758 && ~this.field719.field9771 == ~this.field719.field9770) {
            this.field728 = true;
         } else if (this.field728) {
            this.field727.field9759 = this.field719.field9759;
            this.field727.field9769 = this.field719.field9769;
            this.field727.field9770 = this.field719.field9770;
            this.field727.field9758 = this.field719.field9758;
            this.field727.field9760 = this.field719.field9760;
            this.field727.field9768 = this.field719.field9768;
            this.field728 = false;
            this.field727.field9761 = this.field719.field9761;
            this.field727.field9771 = this.field719.field9771;
            this.field727.field9757 = this.field719.field9757;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field736[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(BILha;JZ)V"
   )
   public final void method453(byte param1, int param2, class66 param3, long param4, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method454(byte arg0) {
      try {
         if (arg0 < 91) {
            method455(18, 47);
         }

         field715 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field736[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method455(int arg0, int arg1) {
      try {
         if (arg1 != 2897) {
            return false;
         } else {
            ++field720;
            return arg0 == 48 || ~arg0 == -3 || arg0 == 1006 || arg0 == 15 || arg0 == 25;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field736[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(Lha;JI)V"
   )
   public final void method456(class66 param1, long param2, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dm",
      name = "<init>",
      descriptor = "(Lha;Ltu;Lcba;J)V"
   )
   public class58(class66 arg0, class370 arg1, class577 arg2, long arg3) {
      try {
         this.field716 = arg3;
         this.field724 = arg1;
         this.field723 = arg2;
         this.field726 = this.field724.method2829(0);
         if (!arg0.method571() && ~this.field726.field6532 != 0) {
            this.field726 = class236.method1819(12473, this.field726.field6532);
         }

         this.field725 = new class762();
         this.field717 = (int)((double)this.field717 + Math.random() * 64.0D);
         this.method452(-32685);
         this.field727.field9759 = this.field719.field9759;
         this.field727.field9760 = this.field719.field9760;
         this.field727.field9761 = this.field719.field9761;
         this.field727.field9757 = this.field719.field9757;
         this.field727.field9771 = this.field719.field9771;
         this.field727.field9768 = this.field719.field9768;
         this.field727.field9770 = this.field719.field9770;
         this.field727.field9758 = this.field719.field9758;
         this.field727.field9769 = this.field719.field9769;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field736[0] + (arg0 != null ? field736[1] : field736[2]) + ',' + (arg1 != null ? field736[1] : field736[2]) + ',' + (arg2 != null ? field736[1] : field736[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method457(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method458(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
