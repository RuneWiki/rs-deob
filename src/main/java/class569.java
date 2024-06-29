import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class569 extends class55 {
   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8122 = new String[]{method4082(method4081("\u00159e\u0010`")), method4082(method4081("\u00159e\u0016`")), method4082(method4081("\u00159e\u0011`")), method4082(method4081("\u00159e\u001b`")), method4082(method4081("\u00159e\u0014`")), method4082(method4081("\u00159e\u0015`"))};
   @OriginalMember(
      owner = "client!lb",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field8119 = new class118(55, 4);
   @OriginalMember(
      owner = "client!lb",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field8121 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
   @OriginalMember(
      owner = "client!lb",
      name = "g",
      descriptor = "I"
   )
   public static int field8115;
   @OriginalMember(
      owner = "client!lb",
      name = "k",
      descriptor = "I"
   )
   public static int field8116;
   @OriginalMember(
      owner = "client!lb",
      name = "h",
      descriptor = "I"
   )
   public static int field8117;
   @OriginalMember(
      owner = "client!lb",
      name = "i",
      descriptor = "I"
   )
   public static int field8118;
   @OriginalMember(
      owner = "client!lb",
      name = "j",
      descriptor = "I"
   )
   public static int field8120;

   @OriginalMember(
      owner = "client!lb",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public static void method4078(int arg0) {
      try {
         field8119 = null;
         field8121 = null;
         if (arg0 != -435) {
            method4079();
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8122[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "()V",
      line = 17
   )
   public static final void method4079() {
      for(int var0 = class215.field3081; var0 < class154.field2185; ++var0) {
         for(int var1 = 0; var1 < class457.field6539; ++var1) {
            for(int var2 = 0; var2 < class16.field190; ++var2) {
               class517 var3 = class663.field9659[var0][var1][var2];
               if (var3 != null) {
                  class688 var4 = var3.field7476;
                  class688 var5 = var3.field7469;
                  if (var4 != null && var4.method239(true)) {
                     class101.method844(var4, var0, var1, var2, 1, 1);
                     if (var5 != null && var5.method239(true)) {
                        class101.method844(var5, var0, var1, var2, 1, 1);
                        var5.method233(class80.field1038, false, var4, 0, 0, 0, -128);
                        var5.method241((byte)-48);
                     }

                     var4.method241((byte)-12);
                  }

                  for(class772 var6 = var3.field7468; var6 != null; var6 = var6.field11354) {
                     class627 var8 = var6.field11352;
                     if (var8 != null && var8.method239(true)) {
                        class101.method844(var8, var0, var1, var2, var8.field9211 - var8.field9207 + 1, var8.field9212 - var8.field9208 + 1);
                        var8.method241((byte)-31);
                     }
                  }

                  class226 var7 = var3.field7464;
                  if (var7 != null && var7.method239(true)) {
                     class708.method5146(var7, var0, var1, var2);
                     var7.method241((byte)-88);
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!lb",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 92
   )
   public class569(int arg0, class453 arg1) {
      super(arg1);
   }

   @OriginalMember(
      owner = "client!lb",
      name = "d",
      descriptor = "(I)I",
      line = 95
   )
   public final int method4080(int arg0) {
      try {
         ++field8120;
         int var2 = 12 % ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8122[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 110
   )
   public class569(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(IB)I",
      line = 113
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field8118;
         if (arg1 != 105) {
            this.method101(70);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8122[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(I)V",
      line = 124
   )
   public final void method98(int arg0) {
      try {
         ++field8117;
         if (~super.field680 != -2 && ~super.field680 != -1) {
            super.field680 = this.method101(arg0 ^ -124);
         }

         if (arg0 != 0) {
            field8121 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8122[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "(IB)V",
      line = 137
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 40 % ((47 - arg1) / 46);
         ++field8115;
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8122[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "(I)I",
      line = 148
   )
   public final int method101(int arg0) {
      try {
         ++field8116;
         return arg0 > -116 ? 12 : 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8122[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4081(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4082(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
