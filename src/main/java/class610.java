import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class610 extends class691 {
   @OriginalMember(
      owner = "client!kha",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8964 = new String[]{method4440(method4439("h\u001e:\u0015U+")), method4440(method4439("h\u001e:\u0015Q+")), method4440(method4439("h\u001e:\u0015S+")), method4440(method4439("h\u001e:\u0015[+")), method4440(method4439("h\u001e:\u0015V+"))};
   @OriginalMember(
      owner = "client!kha",
      name = "A",
      descriptor = "I"
   )
   public static int field8952 = 0;
   @OriginalMember(
      owner = "client!kha",
      name = "v",
      descriptor = "I"
   )
   public static int field8961 = 0;
   @OriginalMember(
      owner = "client!kha",
      name = "x",
      descriptor = "I"
   )
   public static int field8960 = 1406;
   @OriginalMember(
      owner = "client!kha",
      name = "q",
      descriptor = "I"
   )
   public static int field8949;
   @OriginalMember(
      owner = "client!kha",
      name = "w",
      descriptor = "I"
   )
   public static int field8951;
   @OriginalMember(
      owner = "client!kha",
      name = "B",
      descriptor = "I"
   )
   public static int field8954;
   @OriginalMember(
      owner = "client!kha",
      name = "r",
      descriptor = "I"
   )
   public static int field8956;
   @OriginalMember(
      owner = "client!kha",
      name = "o",
      descriptor = "I"
   )
   public static int field8957;
   @OriginalMember(
      owner = "client!kha",
      name = "D",
      descriptor = "I"
   )
   public static int field8958;
   @OriginalMember(
      owner = "client!kha",
      name = "u",
      descriptor = "I"
   )
   public static int field8963;
   @OriginalMember(
      owner = "client!kha",
      name = "y",
      descriptor = "Lbg;"
   )
   public class492 field8948;
   @OriginalMember(
      owner = "client!kha",
      name = "t",
      descriptor = "Lbg;"
   )
   private class492 field8950;
   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "Lbg;"
   )
   private class492 field8953;
   @OriginalMember(
      owner = "client!kha",
      name = "C",
      descriptor = "Lbg;"
   )
   private class492 field8955;
   @OriginalMember(
      owner = "client!kha",
      name = "s",
      descriptor = "Lbg;"
   )
   private class492 field8959;
   @OriginalMember(
      owner = "client!kha",
      name = "p",
      descriptor = "Lbg;"
   )
   private class492 field8962;

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public final void method67(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != 5178) {
            field8960 = 20;
         }

         ++field8949;
         if (arg0) {
            int[] var5 = new int[4];
            class383.field5543.method605(var5);
            class383.field5543.method592(arg1, arg2, super.field10175.field3731 + arg1, arg2 - -super.field10175.field3729);
            int var6 = this.field8953.method960();
            int var7 = this.field8953.method957();
            int var8 = this.field8955.method960();
            int var9 = this.field8955.method957();
            this.field8953.method3575(arg1, arg2 - -((super.field10175.field3729 - var7) / 2));
            this.field8955.method3575(-var8 + super.field10175.field3731 + arg1, (super.field10175.field3729 - var9) / 2 + arg2);
            class383.field5543.method592(arg1, arg2, super.field10175.field3731 + arg1, this.field8962.method957() + arg2);
            this.field8962.method3569(arg1 - -var6, arg2, -var6 + super.field10175.field3731 + -var8, super.field10175.field3729);
            int var10 = this.field8950.method957();
            class383.field5543.method592(arg1, -var10 + super.field10175.field3729 + arg2, super.field10175.field3731 + arg1, super.field10175.field3729 + arg2);
            this.field8950.method3569(arg1 + var6, -var10 + super.field10175.field3729 + arg2, -var6 + super.field10175.field3731 + -var8, super.field10175.field3729);
            class383.field5543.method592(var5[0], var5[1], var5[2], var5[3]);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field8964[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method860(int arg0) {
      try {
         ++field8954;
         if (!super.method860(arg0)) {
            return false;
         } else {
            class626 var2 = (class626)super.field10175;
            if (!super.field10173.method2051(var2.field9200, (byte)60)) {
               return false;
            } else if (!super.field10173.method2051(var2.field9195, (byte)60)) {
               return false;
            } else if (!super.field10173.method2051(var2.field9197, (byte)60)) {
               return false;
            } else if (!super.field10173.method2051(var2.field9196, (byte)60)) {
               return false;
            } else if (!super.field10173.method2051(var2.field9198, (byte)60)) {
               return false;
            } else {
               return super.field10173.method2051(var2.field9194, (byte)60);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8964[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "<init>",
      descriptor = "(Lkf;Lkf;Lai;)V"
   )
   public class610(class266 arg0, class266 arg1, class626 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method862(int arg0) {
      try {
         ++field8956;
         super.method862(arg0);
         class626 var2 = (class626)super.field10175;
         this.field8948 = class506.method3671((byte)46, var2.field9200, super.field10173);
         this.field8959 = class506.method3671((byte)46, var2.field9195, super.field10173);
         this.field8953 = class506.method3671((byte)46, var2.field9197, super.field10173);
         this.field8955 = class506.method3671((byte)46, var2.field9196, super.field10173);
         this.field8962 = class506.method3671((byte)46, var2.field9198, super.field10173);
         this.field8950 = class506.method3671((byte)46, var2.field9194, super.field10173);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8964[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(IZIB)V"
   )
   public final void method69(int arg0, boolean arg1, int arg2, byte arg3) {
      try {
         ++field8957;
         int var5 = this.field8953.method960() + arg2;
         int var6 = arg2 - (-super.field10175.field3731 + this.field8955.method960());
         int var7 = this.field8962.method957() + arg0;
         int var8 = super.field10175.field3729 + arg0 + -this.field8950.method957();
         int var9 = -var5 + var6;
         int var10 = var8 - var7;
         int var11 = this.method5041(-81) * var9 / 10000;
         int[] var12 = new int[4];
         class383.field5543.method605(var12);
         if (arg3 != 88) {
            field8958 = 73;
         }

         class383.field5543.method592(var5, var7, var5 + var11, var8);
         this.method4438((byte)-114, var7, var9, var10, var5);
         class383.field5543.method592(var5 + var11, var7, var6, var8);
         this.field8959.method3569(var5, var7, var9, var10);
         class383.field5543.method592(var12[0], var12[1], var12[2], var12[3]);
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field8964[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public void method4438(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 <= -88) {
            this.field8948.method3569(arg4, arg1, arg2, arg3);
            ++field8951;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8964[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4439(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4440(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
