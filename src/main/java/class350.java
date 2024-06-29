import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class350 {
   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4714 = new String[]{method2556(method2555("q(DB&")), method2556(method2555("q(D]&")), method2556(method2555("h?\u0006~")), method2556(method2555("}dD<s")), method2556(method2555("q(D@&")), method2556(method2555("q(DA&")), method2556(method2555("q(D\\&")), method2556(method2555("q(DC&"))};
   @OriginalMember(
      owner = "client!wb",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field4712 = new int[4096];
   @OriginalMember(
      owner = "client!wb",
      name = "e",
      descriptor = "I"
   )
   public static int field4707;
   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "I"
   )
   public static int field4708;
   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "I"
   )
   public static int field4709;
   @OriginalMember(
      owner = "client!wb",
      name = "d",
      descriptor = "I"
   )
   public static int field4710;
   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "I"
   )
   public static int field4711;
   @OriginalMember(
      owner = "client!wb",
      name = "f",
      descriptor = "Ld;"
   )
   public static class162 field4713;

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method2549(boolean arg0) {
      try {
         if (!arg0) {
            field4713 = null;
         }

         ++field4707;
         return this.method1665((byte)-109) || this.method1657(-3964) || this.method1663(0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4714[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method1663(int arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(Z)I"
   )
   public abstract int method1660(boolean arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1656(int arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "d",
      descriptor = "(I)Z"
   )
   public abstract boolean method1657(int arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(I)Lcea;"
   )
   public abstract class227 method1661(int arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(Lwf;B)Lbaa;"
   )
   public static final class551 method2550(class147 arg0, byte arg1) {
      try {
         ++field4708;
         class551 var2 = new class551();
         var2.field7896 = arg0.method1211(-26166);
         var2.field7897 = class433.field6211.method5548(0, var2.field7896);
         int var3 = -85 / ((67 - arg1) / 37);
         return var2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4714[4] + (arg0 != null ? field4714[3] : field4714[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "d",
      descriptor = "(B)I"
   )
   public abstract int method1659(byte arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(ID)V"
   )
   public static final void method2551(int arg0, double arg1) {
      try {
         if (arg0 != 11059) {
            field4712 = null;
         }

         class706.field10310.method1230(class269.field3721);
         ++field4710;
         class706.field10310.method1215(0, 0, (int)arg1);
         class50.field660.method532(class706.field10310);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4714[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method2552(boolean arg0, int arg1) {
      try {
         ++field4711;
         int var4 = arg1 - 1;
         int var5 = var4 | var4 >>> 1;
         int var6 = var5 | var5 >>> 2;
         int var7 = var6 | var6 >>> 4;
         int var8 = var7 | var7 >>> 8;
         if (arg0) {
            field4713 = null;
         }

         var4 = var8 | var8 >>> 16;
         return var4 - -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4714[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method1665(byte arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(IZI)V"
   )
   public static final void method2553(int arg0, boolean arg1, int arg2) {
      try {
         int var3 = 58 / ((-22 - arg0) / 58);
         ++field4709;
         class405 var4 = arg1 ? class196.field2771 : class65.field788;
         if (var4 != null && arg2 >= 0 && ~arg2 > ~var4.field5841) {
            class578 var5 = var4.field5854[arg2];
            if (~var5.field8530 == 0) {
               String var6 = var5.field8532;
               class10 var7 = class292.method2192(-9730);
               class447 var8 = class40.method350(class721.field10529, var7.field106, true);
               var8.field6359.method1186(class89.method783(1, var6) + 3, 0);
               var8.field6359.method1186(arg1 ? 1 : 0, 0);
               var8.field6359.method1185(arg2, true);
               var8.field6359.method1195((byte)33, var6);
               var7.method55(13256, var8);
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field4714[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method1667(byte arg0);

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2554(byte arg0) {
      try {
         field4712 = null;
         int var1 = 41 / ((arg0 - 49) / 63);
         field4713 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4714[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2555(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2556(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
