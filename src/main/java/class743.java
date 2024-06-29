import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class743 extends class391 {
   @OriginalMember(
      owner = "client!aaa",
      name = "m",
      descriptor = "Z"
   )
   private boolean field11037 = false;
   @OriginalMember(
      owner = "client!aaa",
      name = "n",
      descriptor = "Z"
   )
   public boolean field11042 = false;
   @OriginalMember(
      owner = "client!aaa",
      name = "r",
      descriptor = "I"
   )
   public int field11041 = 0;
   @OriginalMember(
      owner = "client!aaa",
      name = "v",
      descriptor = "Ltia;"
   )
   private class208 field11038 = new class208();
   @OriginalMember(
      owner = "client!aaa",
      name = "o",
      descriptor = "I"
   )
   private int field11045 = 0;
   @OriginalMember(
      owner = "client!aaa",
      name = "w",
      descriptor = "Lsn;"
   )
   public class675 field11044 = new class675();
   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "Z"
   )
   public boolean field11046 = false;
   @OriginalMember(
      owner = "client!aaa",
      name = "x",
      descriptor = "I"
   )
   private int field11050 = 0;
   @OriginalMember(
      owner = "client!aaa",
      name = "y",
      descriptor = "Z"
   )
   private boolean field11049 = false;
   @OriginalMember(
      owner = "client!aaa",
      name = "l",
      descriptor = "Lfca;"
   )
   public class43 field11047 = new class43();
   @OriginalMember(
      owner = "client!aaa",
      name = "t",
      descriptor = "[Lrc;"
   )
   public class587[] field11039 = new class587[8192];
   @OriginalMember(
      owner = "client!aaa",
      name = "s",
      descriptor = "[Z"
   )
   private static boolean[] field11035 = new boolean[8];
   @OriginalMember(
      owner = "client!aaa",
      name = "p",
      descriptor = "[Z"
   )
   private static boolean[] field11043 = new boolean[32];
   @OriginalMember(
      owner = "client!aaa",
      name = "k",
      descriptor = "I"
   )
   public int field11048;
   @OriginalMember(
      owner = "client!aaa",
      name = "q",
      descriptor = "J"
   )
   private long field11036;
   @OriginalMember(
      owner = "client!aaa",
      name = "u",
      descriptor = "J"
   )
   private long field11040;

   @OriginalMember(
      owner = "client!aaa",
      name = "c",
      descriptor = "()Lfca;",
      line = 3
   )
   public final class43 method5450() {
      this.field11047.field571.method122(-8107);

      for(int var1 = 0; var1 < this.field11039.length; ++var1) {
         if (this.field11039[var1] != null && this.field11039[var1].field8667 != null) {
            this.field11047.field571.method123(this.field11039[var1], -69);
         }
      }

      return this.field11047;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "g",
      descriptor = "()V",
      line = 20
   )
   public final void method5451() {
      this.field11037 = true;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "<init>",
      descriptor = "(IZ)V",
      line = 394
   )
   private class743(int arg0, boolean arg1) {
      this.method5454(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(Lha;J)Z",
      line = 27
   )
   public final boolean method5452(class610 arg0, long arg1) {
      if (this.field11040 != this.field11036) {
         this.method5451();
      } else {
         this.method5455();
      }

      if (arg1 - this.field11040 > 750L) {
         this.method5464();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field11036);
         if (this.field11049) {
            for(class523 var5 = (class523)this.field11038.method1815(1); var5 != null; var5 = (class523)this.field11038.method1817(0)) {
               for(int var6 = 0; var6 < var5.field7972.field3895; ++var6) {
                  var5.method4037(arg1, (byte)-87, !this.field11037, 1, arg0);
               }
            }

            this.field11049 = false;
         }

         for(class523 var7 = (class523)this.field11038.method1815(1); var7 != null; var7 = (class523)this.field11038.method1817(0)) {
            var7.method4037(arg1, (byte)-116, !this.field11037, var4, arg0);
         }

         this.field11036 = arg1;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "([Lqw;Z)V",
      line = 77
   )
   private final void method5453(class253[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field11035[var3] = false;
      }

      label76:
      for(class734 var4 = (class734)this.field11044.method4972((byte)-84); var4 != null; var4 = (class734)this.field11044.method4975((byte)110)) {
         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length; ++var7) {
               if (arg0[var7] == var4.field10936 || arg0[var7].field3812 == var4.field10936) {
                  field11035[var7] = true;
                  var4.method5402((byte)-127);
                  continue label76;
               }
            }
         }

         if (!arg1) {
            var4.method2477(1976);
            --this.field11050;
            if (var4.method2494(0)) {
               var4.method2495(-24134);
               --client.field1763;
            }
         }
      }

      if (arg0 != null) {
         for(int var5 = 0; var5 < arg0.length && var5 != 8 && this.field11050 != 8; ++var5) {
            if (!field11035[var5]) {
               class734 var6 = null;
               if (arg0[var5].method2133(true).field7307 == 1 && client.field1763 < 32) {
                  var6 = new class734(arg0[var5], this);
                  class278.field4453.method4819(26, (long)arg0[var5].field3820, var6);
                  ++client.field1763;
               }

               if (var6 == null) {
                  var6 = new class734(arg0[var5], this);
               }

               this.field11044.method4980(var6, 0);
               ++this.field11050;
               field11035[var5] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(IZ)V",
      line = 167
   )
   private final void method5454(int arg0, boolean arg1) {
      class580.field8572.method1813(this, 0);
      this.field11040 = (long)arg0;
      this.field11036 = (long)arg0;
      this.field11049 = true;
      this.field11046 = arg1;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "f",
      descriptor = "()V",
      line = 174
   )
   private final void method5455() {
      this.field11037 = false;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "e",
      descriptor = "()V",
      line = 177
   )
   public static void method5456() {
      field11043 = null;
      field11035 = null;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(Lha;)V",
      line = 181
   )
   public final void method5457(class610 arg0) {
      this.field11047.field571.method122(-8107);

      for(class523 var2 = (class523)this.field11038.method1815(1); var2 != null; var2 = (class523)this.field11038.method1817(0)) {
         var2.method4034(this.field11036, 64, arg0);
      }

   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(IZ)Laaa;",
      line = 194
   )
   public static final class743 method5458(int arg0, boolean arg1) {
      if (class683.field10167 != class393.field6164) {
         class743 var2 = class33.field413[class683.field10167];
         class683.field10167 = class683.field10167 + 1 & class799.field11623[class539.field8133];
         var2.method5454(arg0, arg1);
         return var2;
      } else {
         return new class743(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "()Lfca;",
      line = 207
   )
   public final class43 method5459() {
      return this.field11047;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "()V",
      line = 210
   )
   public final void method5460() {
      this.field11049 = true;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(Lha;J[Lgl;[Lqw;Z)V",
      line = 215
   )
   public final void method5461(class610 arg0, long arg1, class574[] arg2, class253[] arg3, boolean arg4) {
      if (!this.field11042) {
         this.method5462(arg0, arg2, arg4);
         this.method5453(arg3, arg4);
         this.field11040 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(Lha;[Lgl;Z)V",
      line = 228
   )
   private final void method5462(class610 arg0, class574[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field11043[var4] = false;
      }

      label67:
      for(class523 var5 = (class523)this.field11038.method1815(1); var5 != null; var5 = (class523)this.field11038.method1817(0)) {
         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length; ++var8) {
               if (arg1[var8] == var5.field7968 || arg1[var8].field8499 == var5.field7968) {
                  field11043[var8] = true;
                  var5.method4042(0);
                  var5.field7974 = false;
                  continue label67;
               }
            }
         }

         if (!arg2) {
            if (var5.field7963 == 0) {
               var5.method3159(true);
               --this.field11045;
            } else {
               var5.field7974 = true;
            }
         }
      }

      if (arg1 != null) {
         for(int var6 = 0; var6 < arg1.length && var6 != 32 && this.field11045 != 32; ++var6) {
            if (!field11043[var6]) {
               class523 var7 = new class523(arg0, arg1[var6], this, this.field11040);
               this.field11038.method1813(var7, 0);
               ++this.field11045;
               field11043[var6] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(J)V",
      line = 303
   )
   public final void method5463(long arg0) {
      this.field11040 = arg0;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "d",
      descriptor = "()V",
      line = 306
   )
   public final void method5464() {
      this.field11042 = true;

      for(class734 var1 = (class734)this.field11044.method4972((byte)-84); var1 != null; var1 = (class734)this.field11044.method4975((byte)115)) {
         if (var1.field10938.field7307 == 1) {
            var1.method2495(-24134);
         }
      }

      for(int var2 = 0; var2 < this.field11039.length; ++var2) {
         if (this.field11039[var2] != null) {
            this.field11039[var2].method4389();
            this.field11039[var2] = null;
         }
      }

      this.field11041 = 0;
      this.field11038 = new class208();
      this.field11045 = 0;
      this.field11044 = new class675();
      this.field11050 = 0;
      this.method3159(true);
      class33.field413[class393.field6164] = this;
      class393.field6164 = class393.field6164 + 1 & class799.field11623[class539.field8133];
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(IIIII)V",
      line = 343
   )
   public final void method5465(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field11048 = arg0;
   }
}
