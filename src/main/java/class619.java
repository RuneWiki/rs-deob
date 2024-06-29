import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class619 extends class82 {
   @OriginalMember(
      owner = "client!uj",
      name = "o",
      descriptor = "Z"
   )
   private boolean field9106 = false;
   @OriginalMember(
      owner = "client!uj",
      name = "q",
      descriptor = "Z"
   )
   public boolean field9113 = false;
   @OriginalMember(
      owner = "client!uj",
      name = "j",
      descriptor = "I"
   )
   public int field9112 = 0;
   @OriginalMember(
      owner = "client!uj",
      name = "i",
      descriptor = "Lvia;"
   )
   private class627 field9114 = new class627();
   @OriginalMember(
      owner = "client!uj",
      name = "k",
      descriptor = "I"
   )
   private int field9116 = 0;
   @OriginalMember(
      owner = "client!uj",
      name = "s",
      descriptor = "Lrca;"
   )
   public class37 field9115 = new class37();
   @OriginalMember(
      owner = "client!uj",
      name = "h",
      descriptor = "I"
   )
   private int field9117 = 0;
   @OriginalMember(
      owner = "client!uj",
      name = "u",
      descriptor = "Z"
   )
   public boolean field9120 = false;
   @OriginalMember(
      owner = "client!uj",
      name = "m",
      descriptor = "Z"
   )
   private boolean field9118 = false;
   @OriginalMember(
      owner = "client!uj",
      name = "t",
      descriptor = "Lnh;"
   )
   public class554 field9119 = new class554();
   @OriginalMember(
      owner = "client!uj",
      name = "p",
      descriptor = "[Leia;"
   )
   public class788[] field9110 = new class788[8192];
   @OriginalMember(
      owner = "client!uj",
      name = "n",
      descriptor = "[Z"
   )
   private static boolean[] field9108 = new boolean[8];
   @OriginalMember(
      owner = "client!uj",
      name = "v",
      descriptor = "[Z"
   )
   private static boolean[] field9111 = new boolean[32];
   @OriginalMember(
      owner = "client!uj",
      name = "g",
      descriptor = "I"
   )
   public int field9121;
   @OriginalMember(
      owner = "client!uj",
      name = "l",
      descriptor = "J"
   )
   private long field9107;
   @OriginalMember(
      owner = "client!uj",
      name = "r",
      descriptor = "J"
   )
   private long field9109;

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(Lha;)V"
   )
   public final void method4555(class479 arg0) {
      this.field9119.field8138.method679(true);

      for(class435 var2 = (class435)this.field9114.method4639(-118); var2 != null; var2 = (class435)this.field9114.method4636((byte)73)) {
         var2.method3365(arg0, true, this.field9109);
      }

   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(Lha;J)Z"
   )
   public final boolean method4556(class479 arg0, long arg1) {
      if (this.field9109 != this.field9107) {
         this.method4563();
      } else {
         this.method4566();
      }

      if (arg1 - this.field9107 > 750L) {
         this.method4569();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field9109);
         if (this.field9118) {
            for(class435 var5 = (class435)this.field9114.method4639(-120); var5 != null; var5 = (class435)this.field9114.method4636((byte)29)) {
               for(int var6 = 0; var6 < var5.field5917.field628; ++var6) {
                  var5.method3363(1, arg0, arg1, (byte)98, !this.field9106);
               }
            }

            this.field9118 = false;
         }

         for(class435 var7 = (class435)this.field9114.method4639(-117); var7 != null; var7 = (class435)this.field9114.method4636((byte)37)) {
            var7.method3363(var4, arg0, arg1, (byte)94, !this.field9106);
         }

         this.field9109 = arg1;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(IZ)Luj;"
   )
   public static final class619 method4557(int arg0, boolean arg1) {
      if (class699.field10229 != class225.field2818) {
         class619 var2 = class598.field8836[class225.field2818];
         class225.field2818 = class225.field2818 + 1 & class392.field5433[class323.field4426];
         var2.method4567(arg0, arg1);
         return var2;
      } else {
         return new class619(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(Lha;J[Lmha;[Llba;Z)V"
   )
   public final void method4558(class479 arg0, long arg1, class426[] arg2, class224[] arg3, boolean arg4) {
      if (!this.field9113) {
         this.method4561(arg0, arg2, arg4);
         this.method4562(arg3, arg4);
         this.field9107 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "g",
      descriptor = "()Lnh;"
   )
   public final class554 method4559() {
      this.field9119.field8138.method679(true);

      for(int var1 = 0; var1 < this.field9110.length; ++var1) {
         if (this.field9110[var1] != null && this.field9110[var1].field11494 != null) {
            this.field9119.field8138.method678(this.field9110[var1], (byte)108);
         }
      }

      return this.field9119;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "b",
      descriptor = "()V"
   )
   public final void method4560() {
      this.field9118 = true;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(Lha;[Lmha;Z)V"
   )
   private final void method4561(class479 arg0, class426[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field9111[var4] = false;
      }

      label67:
      for(class435 var5 = (class435)this.field9114.method4639(-82); var5 != null; var5 = (class435)this.field9114.method4636((byte)61)) {
         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length; ++var8) {
               if (arg1[var8] == var5.field5929 || arg1[var8].field5790 == var5.field5929) {
                  field9111[var8] = true;
                  var5.method3364(-1);
                  var5.field5924 = false;
                  continue label67;
               }
            }
         }

         if (!arg2) {
            if (var5.field5931 == 0) {
               var5.method797((byte)126);
               --this.field9116;
            } else {
               var5.field5924 = true;
            }
         }
      }

      if (arg1 != null) {
         for(int var6 = 0; var6 < arg1.length && var6 != 32 && this.field9116 != 32; ++var6) {
            if (!field9111[var6]) {
               class435 var7 = new class435(arg0, arg1[var6], this, this.field9107);
               this.field9114.method4637(var7, (byte)95);
               ++this.field9116;
               field9111[var6] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "([Llba;Z)V"
   )
   private final void method4562(class224[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field9108[var3] = false;
      }

      label76:
      for(class686 var4 = (class686)this.field9115.method288(0); var4 != null; var4 = (class686)this.field9115.method290(17958)) {
         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length; ++var7) {
               if (arg0[var7] == var4.field10101 || arg0[var7].field2801 == var4.field10101) {
                  field9108[var7] = true;
                  var4.method5020(2);
                  continue label76;
               }
            }
         }

         if (!arg1) {
            var4.method4924(-2970);
            --this.field9117;
            if (var4.method126(23348)) {
               var4.method125(13582);
               --class209.field2658;
            }
         }
      }

      if (arg0 != null) {
         for(int var5 = 0; var5 < arg0.length && var5 != 8 && this.field9117 != 8; ++var5) {
            if (!field9108[var5]) {
               class686 var6 = null;
               if (arg0[var5].method1790(89).field3989 == 1 && class209.field2658 < 32) {
                  var6 = new class686(arg0[var5], this);
                  class705.field10316.method4384(var6, (long)arg0[var5].field2805, false);
                  ++class209.field2658;
               }

               if (var6 == null) {
                  var6 = new class686(arg0[var5], this);
               }

               this.field9115.method279(false, var6);
               ++this.field9117;
               field9108[var5] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!uj",
      name = "c",
      descriptor = "()V"
   )
   public final void method4563() {
      this.field9106 = true;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method4564(long arg0) {
      this.field9107 = arg0;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "d",
      descriptor = "()Lnh;"
   )
   public final class554 method4565() {
      return this.field9119;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "e",
      descriptor = "()V"
   )
   private final void method4566() {
      this.field9106 = false;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "b",
      descriptor = "(IZ)V"
   )
   private final void method4567(int arg0, boolean arg1) {
      class363.field5037.method4637(this, (byte)111);
      this.field9107 = (long)arg0;
      this.field9109 = (long)arg0;
      this.field9118 = true;
      this.field9120 = arg1;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method4568(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field9121 = arg0;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "()V"
   )
   public final void method4569() {
      this.field9113 = true;

      for(class686 var1 = (class686)this.field9115.method288(0); var1 != null; var1 = (class686)this.field9115.method290(17958)) {
         if (var1.field10107.field3989 == 1) {
            var1.method125(13582);
         }
      }

      for(int var2 = 0; var2 < this.field9110.length; ++var2) {
         if (this.field9110[var2] != null) {
            this.field9110[var2].method5675();
            this.field9110[var2] = null;
         }
      }

      this.field9112 = 0;
      this.field9114 = new class627();
      this.field9116 = 0;
      this.field9115 = new class37();
      this.field9117 = 0;
      this.method797((byte)126);
      class598.field8836[class699.field10229] = this;
      class699.field10229 = class699.field10229 + 1 & class392.field5433[class323.field4426];
   }

   @OriginalMember(
      owner = "client!uj",
      name = "f",
      descriptor = "()V"
   )
   public static void method4570() {
      field9111 = null;
      field9108 = null;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   private class619(int arg0, boolean arg1) {
      this.method4567(arg0, arg1);
   }
}
