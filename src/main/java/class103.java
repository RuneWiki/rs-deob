import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class103 extends class264 {
   @OriginalMember(
      owner = "client!sd",
      name = "K",
      descriptor = "I"
   )
   private int field1315;
   @OriginalMember(
      owner = "client!sd",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1321 = new String[]{method859(method858("\u0003A\u0016xP")), method859(method858("\u0003A\u0016\u0007\u0011\u001eLL\u0005P")), method859(method858("\u001ePTW")), method859(method858("\u0003A\u0016\u007fP")), method859(method858("\u000b\u000b\u0016\u0015\u0005")), method859(method858("\u0003A\u0016zP")), method859(method858("\u0003A\u0016yP")), method859(method858("\u0003A\u0016~P"))};
   @OriginalMember(
      owner = "client!sd",
      name = "F",
      descriptor = "I"
   )
   public static int field1316;
   @OriginalMember(
      owner = "client!sd",
      name = "G",
      descriptor = "I"
   )
   public static int field1318;
   @OriginalMember(
      owner = "client!sd",
      name = "J",
      descriptor = "I"
   )
   public static int field1319;
   @OriginalMember(
      owner = "client!sd",
      name = "I",
      descriptor = "I"
   )
   public static int field1320;
   @OriginalMember(
      owner = "client!sd",
      name = "H",
      descriptor = "Lbg;"
   )
   public static class492 field1317;

   @OriginalMember(
      owner = "client!sd",
      name = "d",
      descriptor = "(I)V",
      line = 5
   )
   public static void method855(int arg0) {
      try {
         if (arg0 != 4096) {
            field1317 = null;
         }

         field1317 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1321[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "<init>",
      descriptor = "(I)V",
      line = 16
   )
   public class103(int arg0) {
      super(0, true);
      this.field1315 = 4096;

      try {
         this.field1315 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1321[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 24
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (~arg0 == -1) {
            this.field1315 = (arg1.method1143(-15465) << 12) / 255;
         }

         if (arg2 < 49) {
            method856(-21);
         }

         ++field1319;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1321[5] + arg0 + ',' + (arg1 != null ? field1321[4] : field1321[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "g",
      descriptor = "(I)V",
      line = 54
   )
   public static final void method856(int arg0) {
      try {
         ++field1318;
         if (arg0 < 48) {
            field1317 = null;
         }

         class110.field1389 = 0;
         class209.field2975 = 0;
         class292.field4042 = 0;
         class136.field1729 = 0;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1321[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(BLdp;Ldp;)V",
      line = 68
   )
   public static final void method857(byte arg0, class3 arg1, class3 arg2) {
      try {
         if (arg2.field20 != null) {
            arg2.method12((byte)87);
         }

         ++field1316;
         arg2.field14 = arg1;
         int var3 = 114 % ((arg0 - -55) / 61);
         arg2.field20 = arg1.field20;
         arg2.field20.field14 = arg2;
         arg2.field14.field20 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1321[3] + arg0 + ',' + (arg1 != null ? field1321[4] : field1321[2]) + ',' + (arg2 != null ? field1321[4] : field1321[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "<init>",
      descriptor = "()V",
      line = 84
   )
   public class103() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(II)[I",
      line = 88
   )
   public final int[] method6(int arg0, int arg1) {
      try {
         ++field1320;
         int[] var3 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            class242.method1854(var3, 0, class430.field6152, this.field1315);
         }

         int var4 = 108 % ((24 - arg1) / 44);
         return var3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1321[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method858(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method859(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
