import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class473 implements class99 {
   @OriginalMember(
      owner = "client!qv",
      name = "f",
      descriptor = "Lge;"
   )
   private class740 field6563;
   @OriginalMember(
      owner = "client!qv",
      name = "h",
      descriptor = "Lir;"
   )
   private class28 field6560;
   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6567 = new String[]{method3469(method3468(",U9Bn")), method3469(method3468("&\r9(;")), method3469(method3468(",U9Cn")), method3469(method3468("3V{j")), method3469(method3468(",U9:/3Jc8n")), method3469(method3468(",U9Gn")), method3469(method3468(",U9On")), method3469(method3468(",U9Dn")), method3469(method3468(",U9En"))};
   @OriginalMember(
      owner = "client!qv",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6565 = new int[4];
   @OriginalMember(
      owner = "client!qv",
      name = "d",
      descriptor = "I"
   )
   public static int field6558;
   @OriginalMember(
      owner = "client!qv",
      name = "i",
      descriptor = "I"
   )
   public static int field6559;
   @OriginalMember(
      owner = "client!qv",
      name = "c",
      descriptor = "I"
   )
   public static int field6561;
   @OriginalMember(
      owner = "client!qv",
      name = "b",
      descriptor = "I"
   )
   public static int field6562;
   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "I"
   )
   public static int field6564;
   @OriginalMember(
      owner = "client!qv",
      name = "g",
      descriptor = "I"
   )
   public static int field6566;

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method905(int arg0) {
      try {
         ++field6566;
         if (arg0 != -15238) {
            this.method3465(-21, 60, (String)null, 22, 119, (class66)null);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6567[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(IILjava/lang/String;IILda;)I"
   )
   private final int method3465(int arg0, int arg1, String arg2, int arg3, int arg4, class66 arg5) {
      try {
         if (arg1 < 2) {
            this.field6563 = null;
         }

         ++field6558;
         return arg5.method628((class763[])null, 0, arg4 - -arg0, -(arg0 * 2) + this.field6563.field10783, (byte)113, (int[])null, 0, (class516)null, 0, this.field6563.field10775, this.field6563.field10776, arg0 + arg3, 0, arg2, -(arg0 * 2) + this.field6563.field10784, 0);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6567[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6567[1] : field6567[3]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6567[1] : field6567[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method907(boolean arg0) {
      try {
         if (!arg0) {
            this.field6560 = null;
         }

         ++field6559;
         return this.field6560.method232(59);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6567[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(Lrca;FI[BIFFFIIIFI)V"
   )
   public static final void method3466(class483 param0, float param1, int param2, byte[] param3, int param4, float param5, float param6, float param7, int param8, int param9, int param10, float param11, int param12) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qv",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3467(int arg0) {
      try {
         field6565 = null;
         if (arg0 != 8) {
            field6565 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6567[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method906(int arg0, boolean arg1) {
      try {
         ++field6562;
         class114 var3 = this.field6560.method235(this.field6563.field10782, false);
         if (var3 != null) {
            int var4 = this.field6563.field10781.method1433(this.field6563.field10783, class698.field10190, 1) + this.field6563.field10774;
            int var5 = this.field6563.field10778.method1325(this.field6563.field10784, class420.field5892, 8599) + this.field6563.field10779;
            if (this.field6563.field10772) {
               class338.field4832.method523(var4, var5, this.field6563.field10783, this.field6563.field10784, this.field6563.field10773, 0);
            }

            int var6 = var5 + 12 * this.method3465(5, 45, var3.field1417, var4, var5, class101.field1310);
            int var11 = var6 + 8;
            if (this.field6563.field10772) {
               class338.field4832.method497(var4, var11, this.field6563.field10783 + -1 + var4, var11, this.field6563.field10773, 0);
            }

            var6 = var11 + 1;
            int var7 = var6 + this.method3465(5, 77, var3.field1419, var4, var6, class101.field1310) * 12;
            int var12 = var7 + 5;
            int var10000 = var12 + this.method3465(5, 29, var3.field1412, var4, var12, class101.field1310) * 12;
         }

         if (arg0 != 29560) {
            field6565 = null;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6567[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "<init>",
      descriptor = "(Lir;Lge;)V"
   )
   public class473(class28 arg0, class740 arg1) {
      try {
         this.field6563 = arg1;
         this.field6560 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6567[4] + (arg0 != null ? field6567[1] : field6567[3]) + ',' + (arg1 != null ? field6567[1] : field6567[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
