import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class147 extends class207 {
   @OriginalMember(
      owner = "client!cg",
      name = "v",
      descriptor = "J"
   )
   private long field1844 = -1L;
   @OriginalMember(
      owner = "client!cg",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   private String field1841 = null;
   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1850 = new String[]{method1217(method1216("-'9|M")), method1217(method1216("8|{>")), method1217(method1216("5n9\u0014\u0018")), method1217(method1216("5n9\u0011\u0018")), method1217(method1216("vdr?R3{y3]33")), method1217(method1216("5n9\u0013\u0018")), method1217(method1216(";lz0U$av!Xl")), method1217(method1216("5n9\u0016\u0018")), method1217(method1216("5n9\u0017\u0018")), method1217(method1216("5n9\u0010\u0018"))};
   @OriginalMember(
      owner = "client!cg",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field1848 = new int[5];
   @OriginalMember(
      owner = "client!cg",
      name = "t",
      descriptor = "I"
   )
   public static int field1840;
   @OriginalMember(
      owner = "client!cg",
      name = "s",
      descriptor = "I"
   )
   public static int field1842;
   @OriginalMember(
      owner = "client!cg",
      name = "n",
      descriptor = "I"
   )
   public static int field1845;
   @OriginalMember(
      owner = "client!cg",
      name = "q",
      descriptor = "I"
   )
   public static int field1846;
   @OriginalMember(
      owner = "client!cg",
      name = "p",
      descriptor = "I"
   )
   public static int field1847;
   @OriginalMember(
      owner = "client!cg",
      name = "u",
      descriptor = "I"
   )
   public static int field1849;
   @OriginalMember(
      owner = "client!cg",
      name = "w",
      descriptor = "[Ls;"
   )
   public static class293[] field1843;

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)V"
   )
   public static final void method1212(int arg0, String arg1, boolean arg2, String arg3, int arg4) {
      try {
         ++field1842;
         if (arg4 > -3) {
            method1213(36, 12, 22, -80, (class667)null, -31);
         }

         class180 var5 = class370.method2879(-77);
         var5.field2211.method1085(class185.field2301.field11435, (byte)-11);
         var5.field2211.method1103(0, -95);
         int var6 = var5.field2211.field1590;
         var5.field2211.method1103(651, -34);
         int[] var7 = class481.method3570(var5, (byte)85);
         int var8 = var5.field2211.field1590;
         var5.field2211.method1101(arg3, -124);
         var5.field2211.method1103(class225.field2894, -112);
         var5.field2211.method1101(arg1, -91);
         var5.field2211.method1071(class768.field11265, -360854133);
         var5.field2211.method1085(class728.field10827, (byte)-11);
         var5.field2211.method1085(class489.field7224.field256, (byte)-11);
         class23.method151(var5.field2211, false);
         String var9 = class365.field5474;
         var5.field2211.method1085(var9 != null ? 1 : 0, (byte)-11);
         if (var9 != null) {
            var5.field2211.method1101(var9, -99);
         }

         var5.field2211.method1085(arg0, (byte)-11);
         var5.field2211.method1085(arg2 ? 1 : 0, (byte)-11);
         var5.field2211.field1590 += 7;
         var5.field2211.method1089(var8, (byte)79, var7, var5.field2211.field1590);
         var5.field2211.method1068(-var6 + var5.field2211.field1590, (byte)-126);
         class763.method5527(false, var5);
         class236.field2995 = -3;
         class489.field7223 = 0;
         class578.field8576 = 1;
         class330.field4725 = 0;
         if (~arg0 > -14) {
            class479.field7128 = true;
            class497.method3704((byte)19);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1850[2] + arg0 + ',' + (arg1 != null ? field1850[0] : field1850[1]) + ',' + arg2 + ',' + (arg3 != null ? field1850[0] : field1850[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(IIIILck;I)Lfe;"
   )
   public static final class596 method1213(int arg0, int arg1, int arg2, int arg3, class667 arg4, int arg5) {
      try {
         ++field1846;
         if (arg5 != -24018) {
            field1843 = null;
         }

         if (arg4.field10032 || class766.method5547(1008, arg0) && class766.method5547(1008, arg1)) {
            return new class596(arg4, 3553, arg2, arg3, arg0, arg1, true);
         } else {
            return !arg4.field9950 ? new class596(arg4, arg2, arg3, arg0, arg1, class7.method63(arg0, false), class7.method63(arg1, false), true) : new class596(arg4, 34037, arg2, arg3, arg0, arg1, true);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1850[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1850[0] : field1850[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         if (~arg0.method1104(255) != -256) {
            --arg0.field1590;
            this.field1844 = arg0.method1063(120);
         }

         ++field1847;
         this.field1841 = arg0.method1056(-20330);
         if (class196.field2435) {
            System.out.println(field1850[6] + this.field1844 + field1850[4] + this.field1841);
         }

         if (!arg1) {
            this.method791((class244)null, true);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1850[5] + (arg0 != null ? field1850[0] : field1850[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1214(int arg0) {
      try {
         field1848 = null;
         if (arg0 >= -113) {
            field1843 = null;
         }

         field1843 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1850[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1215(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(Lfa;Z)V"
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         ++field1849;
         if (arg1) {
            arg0.method1826(!arg1, this.field1844, this.field1841);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1850[9] + (arg0 != null ? field1850[0] : field1850[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1216(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1217(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
