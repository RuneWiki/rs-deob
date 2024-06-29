import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class629 extends class731 {
   @OriginalMember(
      owner = "client!kfa",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9240 = new String[]{method4563(method4562("<_e[")), method4563(method4562(")\u0004'\u0019\r")), method4563(method4562("9Lh\u00198z")), method4563(method4562("9Lh\u0019:z")), method4563(method4562("9Lh\u0019L;D`CNz")), method4563(method4562("9Lh\u00197z")), method4563(method4562("9Lh\u00195z")), method4563(method4562("9Lh\u00199z")), method4563(method4562("9Lh\u0019;z")), method4563(method4562("9Lh\u0019 z")), method4563(method4562("9Lh\u00193z"))};
   @OriginalMember(
      owner = "client!kfa",
      name = "E",
      descriptor = "I"
   )
   public static int field9234 = 0;
   @OriginalMember(
      owner = "client!kfa",
      name = "C",
      descriptor = "Lwv;"
   )
   public static class37 field9235 = new class37(8);
   @OriginalMember(
      owner = "client!kfa",
      name = "G",
      descriptor = "I"
   )
   public static int field9231;
   @OriginalMember(
      owner = "client!kfa",
      name = "A",
      descriptor = "I"
   )
   public static int field9232;
   @OriginalMember(
      owner = "client!kfa",
      name = "F",
      descriptor = "I"
   )
   public static int field9233;
   @OriginalMember(
      owner = "client!kfa",
      name = "I",
      descriptor = "I"
   )
   public static int field9236;
   @OriginalMember(
      owner = "client!kfa",
      name = "D",
      descriptor = "I"
   )
   public static int field9237;
   @OriginalMember(
      owner = "client!kfa",
      name = "H",
      descriptor = "I"
   )
   public static int field9238;
   @OriginalMember(
      owner = "client!kfa",
      name = "B",
      descriptor = "I"
   )
   public static int field9239;

   @OriginalMember(
      owner = "client!kfa",
      name = "<init>",
      descriptor = "(IIIII)V",
      line = 2
   )
   public class629(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         super.field10693 = arg2;
         super.field10694 = arg0;
         super.field10701 = (byte)arg3;
         super.field10702 = (byte)arg4;
         super.field10697 = arg1;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9240[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "b",
      descriptor = "(III)Z",
      line = 14
   )
   public static final boolean method4560(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -29441) {
            method4560(-73, 56, 53);
         }

         ++field9238;
         return (arg0 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9240[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(Lha;ZLgn;IIII)V",
      line = 26
   )
   public final void method233(class66 arg0, boolean arg1, class731 arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg6 > -125) {
            field9234 = -73;
         }

         ++field9231;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field9240[2] + (arg0 != null ? field9240[1] : field9240[0]) + ',' + arg1 + ',' + (arg2 != null ? field9240[1] : field9240[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "([Lmn;Z)I",
      line = 38
   )
   public final int method1763(class389[] arg0, boolean arg1) {
      try {
         ++field9237;
         if (!arg1) {
            this.method1764((byte)-92);
         }

         return this.method5323(super.field10694 >> class773.field11359, -60, super.field10693 >> class773.field11359, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9240[5] + (arg0 != null ? field9240[1] : field9240[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(ZLha;)Z",
      line = 54
   )
   public final boolean method1762(boolean arg0, class66 arg1) {
      try {
         ++field9233;
         class772 var3 = class589.method4287(super.field10701, super.field10694 >> class773.field11359, super.field10693 >> class773.field11359);
         if (arg0) {
            field9235 = null;
         }

         return var3 != null && var3.field11352.field9210 ? class228.method1775(-1, super.field10701, super.field10694 >> class773.field11359, super.field10693 >> class773.field11359, var3.field11352.method232(-111) + this.method232(-99)) : class50.method405(super.field10694 >> class773.field11359, 126, super.field10693 >> class773.field11359, super.field10701);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9240[6] + arg0 + ',' + (arg1 != null ? field9240[1] : field9240[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "e",
      descriptor = "(B)V",
      line = 73
   )
   public final void method241(byte arg0) {
      try {
         ++field9232;
         if (arg0 > -9) {
            this.method1762(true, (class66)null);
         }

         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9240[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "i",
      descriptor = "(B)Z",
      line = 85
   )
   public final boolean method1764(byte arg0) {
      try {
         if (arg0 != -78) {
            this.method239(false);
         }

         ++field9239;
         return class506.field7334[(super.field10694 >> class773.field11359) + -class712.field10385 + class106.field1335][(super.field10693 >> class773.field11359) - (-class106.field1335 + class377.field5453)];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9240[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(I)V",
      line = 96
   )
   public static void method4561(int arg0) {
      try {
         field9235 = null;
         if (arg0 <= 2) {
            field9234 = -76;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9240[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(Z)Z",
      line = 113
   )
   public final boolean method239(boolean arg0) {
      try {
         ++field9236;
         if (!arg0) {
            field9235 = null;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9240[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4562(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4563(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
