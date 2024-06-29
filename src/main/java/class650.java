import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public class class650 extends class463 {
   @OriginalMember(
      owner = "client!mka",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9125 = new String[]{method4713(method4712("LL01b\t")), method4713(method4712("LL01a\t")), method4713(method4712("LL01f\t")), method4713(method4712("LL01g\t")), method4713(method4712("LL01c\t")), method4713(method4712("LL01e\t")), method4713(method4712("OR=s")), method4713(method4712("LL01d\t")), method4713(method4712("Z\t\u007f1]"))};
   @OriginalMember(
      owner = "client!mka",
      name = "x",
      descriptor = "I"
   )
   public static int field9120 = 0;
   @OriginalMember(
      owner = "client!mka",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field9108 = new int[]{0, -1, 0, 1};
   @OriginalMember(
      owner = "client!mka",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field9124 = new int[1000];
   @OriginalMember(
      owner = "client!mka",
      name = "G",
      descriptor = "I"
   )
   public static int field9112;
   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "I"
   )
   public static int field9114;
   @OriginalMember(
      owner = "client!mka",
      name = "E",
      descriptor = "I"
   )
   public static int field9115;
   @OriginalMember(
      owner = "client!mka",
      name = "y",
      descriptor = "I"
   )
   public static int field9116;
   @OriginalMember(
      owner = "client!mka",
      name = "B",
      descriptor = "I"
   )
   public static int field9117;
   @OriginalMember(
      owner = "client!mka",
      name = "w",
      descriptor = "I"
   )
   public static int field9121;
   @OriginalMember(
      owner = "client!mka",
      name = "r",
      descriptor = "Lem;"
   )
   public static class237 field9122;
   @OriginalMember(
      owner = "client!mka",
      name = "u",
      descriptor = "Lkda;"
   )
   public static class411 field9113;
   @OriginalMember(
      owner = "client!mka",
      name = "v",
      descriptor = "Lbo;"
   )
   public class763 field9109;
   @OriginalMember(
      owner = "client!mka",
      name = "s",
      descriptor = "Lbo;"
   )
   private class763 field9110;
   @OriginalMember(
      owner = "client!mka",
      name = "D",
      descriptor = "Lbo;"
   )
   private class763 field9111;
   @OriginalMember(
      owner = "client!mka",
      name = "C",
      descriptor = "Lbo;"
   )
   private class763 field9118;
   @OriginalMember(
      owner = "client!mka",
      name = "t",
      descriptor = "Lbo;"
   )
   private class763 field9119;
   @OriginalMember(
      owner = "client!mka",
      name = "F",
      descriptor = "Lbo;"
   )
   private class763 field9123;

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public final void method1050(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field9116;
         if (arg1 != 29953) {
            this.method907(false);
         }

         if (arg3) {
            int[] var5 = new int[4];
            class338.field4832.method582(var5);
            class338.field4832.method577(arg2, arg0, arg2 - -super.field6345.field1299, arg0 - -super.field6345.field1311);
            int var6 = this.field9123.method2125();
            int var7 = this.field9123.method2129();
            int var8 = this.field9118.method2125();
            int var9 = this.field9118.method2129();
            this.field9123.method5482(arg2, (super.field6345.field1311 - var7) / 2 + arg0);
            this.field9118.method5482(-var8 + super.field6345.field1299 + arg2, arg0 - -((-var9 + super.field6345.field1311) / 2));
            class338.field4832.method577(arg2, arg0, super.field6345.field1299 + arg2, this.field9110.method2129() + arg0);
            this.field9110.method5484(arg2 + var6, arg0, -var8 + super.field6345.field1299 + -var6, super.field6345.field1311);
            int var10 = this.field9119.method2129();
            class338.field4832.method577(arg2, arg0 - (-super.field6345.field1311 - -var10), arg2 - -super.field6345.field1299, arg0 - -super.field6345.field1311);
            this.field9119.method5484(arg2 + var6, -var10 + super.field6345.field1311 + arg0, -var6 + super.field6345.field1299 + -var8, super.field6345.field1311);
            class338.field4832.method577(var5[0], var5[1], var5[2], var5[3]);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field9125[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(III[B)Ljava/lang/String;"
   )
   public static final String method4710(int arg0, int arg1, int arg2, byte[] arg3) {
      boolean var4 = client.field4273;

      try {
         ++field9117;
         char[] var5 = new char[arg1];
         if (arg2 != -26018) {
            method4710(-112, 117, -30, (byte[])null);
         }

         int var6 = 0;
         int var7 = 0;
         if (!var4 && ~var7 <= ~arg1) {
            return new String(var5, 0, var6);
         } else {
            do {
               int var8 = arg3[arg0 + var7] & 255;
               if (var8 != 0) {
                  if (var8 >= 128 && ~var8 > -161) {
                     char var9 = class79.field989[var8 - 128];
                     if (~var9 == -1) {
                        var9 = '?';
                     }

                     var8 = var9;
                  }

                  var5[var6++] = (char)var8;
               }

               ++var7;
            } while(~var7 > ~arg1);

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field9125[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9125[8] : field9125[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method905(int arg0) {
      try {
         super.method905(arg0);
         ++field9112;
         class498 var2 = (class498)super.field6345;
         this.field9109 = class583.method4187(super.field6340, var2.field6859, 96);
         this.field9111 = class583.method4187(super.field6340, var2.field6857, 78);
         this.field9123 = class583.method4187(super.field6340, var2.field6851, arg0 ^ -15322);
         this.field9118 = class583.method4187(super.field6340, var2.field6858, 102);
         this.field9110 = class583.method4187(super.field6340, var2.field6852, 101);
         this.field9119 = class583.method4187(super.field6340, var2.field6853, 63);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9125[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method907(boolean arg0) {
      try {
         ++field9121;
         if (!super.method907(arg0)) {
            return false;
         } else {
            class498 var2 = (class498)super.field6345;
            if (!super.field6340.method717(var2.field6859, (byte)-58)) {
               return false;
            } else if (!super.field6340.method717(var2.field6857, (byte)-58)) {
               return false;
            } else if (!super.field6340.method717(var2.field6851, (byte)-58)) {
               return false;
            } else if (!super.field6340.method717(var2.field6858, (byte)-58)) {
               return false;
            } else if (!super.field6340.method717(var2.field6852, (byte)-58)) {
               return false;
            } else {
               return super.field6340.method717(var2.field6853, (byte)-58);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9125[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public void method966(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field9109.method5484(arg2, arg4, arg3, arg0);
         if (arg1 == 3) {
            ++field9114;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9125[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "<init>",
      descriptor = "(Lqh;Lqh;Lvaa;)V"
   )
   public class650(class74 arg0, class74 arg1, class498 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(IZBI)V"
   )
   public final void method1047(int arg0, boolean arg1, byte arg2, int arg3) {
      try {
         ++field9115;
         int var5 = this.field9123.method2125() + arg3;
         int var6 = super.field6345.field1299 + arg3 - this.field9118.method2125();
         int var7 = this.field9110.method2129() + arg0;
         if (arg2 == -84) {
            int var8 = super.field6345.field1311 + (arg0 - this.field9119.method2129());
            int var9 = -var5 + var6;
            int var10 = -var7 + var8;
            int var11 = var9 * this.method3399(-25631) / 10000;
            int[] var12 = new int[4];
            class338.field4832.method582(var12);
            class338.field4832.method577(var5, var7, var5 + var11, var8);
            this.method966(var10, 3, var5, var9, var7);
            class338.field4832.method577(var5 + var11, var7, var6, var8);
            this.field9111.method5484(var5, var7, var9, var10);
            class338.field4832.method577(var12[0], var12[1], var12[2], var12[3]);
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field9125[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4711(int arg0) {
      try {
         field9124 = null;
         field9122 = null;
         field9113 = null;
         field9108 = null;
         if (arg0 != -1) {
            field9120 = -93;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9125[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4712(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4713(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
