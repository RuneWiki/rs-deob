import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class672 extends class770 {
   @OriginalMember(
      owner = "client!rg",
      name = "o",
      descriptor = "Z"
   )
   public boolean field9876 = false;
   @OriginalMember(
      owner = "client!rg",
      name = "l",
      descriptor = "I"
   )
   public int field9880 = 0;
   @OriginalMember(
      owner = "client!rg",
      name = "f",
      descriptor = "Z"
   )
   private boolean field9881 = false;
   @OriginalMember(
      owner = "client!rg",
      name = "t",
      descriptor = "Lkda;"
   )
   private class411 field9883 = new class411();
   @OriginalMember(
      owner = "client!rg",
      name = "n",
      descriptor = "I"
   )
   private int field9884 = 0;
   @OriginalMember(
      owner = "client!rg",
      name = "h",
      descriptor = "Lod;"
   )
   public class536 field9885 = new class536();
   @OriginalMember(
      owner = "client!rg",
      name = "u",
      descriptor = "Z"
   )
   public boolean field9887 = false;
   @OriginalMember(
      owner = "client!rg",
      name = "r",
      descriptor = "Z"
   )
   private boolean field9886 = false;
   @OriginalMember(
      owner = "client!rg",
      name = "q",
      descriptor = "I"
   )
   private int field9890 = 0;
   @OriginalMember(
      owner = "client!rg",
      name = "p",
      descriptor = "Ljea;"
   )
   public class478 field9888 = new class478();
   @OriginalMember(
      owner = "client!rg",
      name = "k",
      descriptor = "[Lun;"
   )
   public class448[] field9879 = new class448[8192];
   @OriginalMember(
      owner = "client!rg",
      name = "j",
      descriptor = "[Z"
   )
   private static boolean[] field9875 = new boolean[8];
   @OriginalMember(
      owner = "client!rg",
      name = "i",
      descriptor = "[Z"
   )
   private static boolean[] field9878 = new boolean[32];
   @OriginalMember(
      owner = "client!rg",
      name = "g",
      descriptor = "I"
   )
   public int field9889;
   @OriginalMember(
      owner = "client!rg",
      name = "s",
      descriptor = "J"
   )
   private long field9877;
   @OriginalMember(
      owner = "client!rg",
      name = "m",
      descriptor = "J"
   )
   private long field9882;

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "([Luo;Z)V"
   )
   private final void method4923(class606[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field9875[var3] = false;
      }

      label76:
      for(class458 var4 = (class458)this.field9885.method3855(117); var4 != null; var4 = (class458)this.field9885.method3866((byte)117)) {
         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length; ++var7) {
               if (arg0[var7] == var4.field6269 || arg0[var7].field8482 == var4.field6269) {
                  field9875[var7] = true;
                  var4.method3366(-122);
                  continue label76;
               }
            }
         }

         if (!arg1) {
            var4.method3609(119);
            --this.field9890;
            if (var4.method3941(false)) {
               var4.method3943(-4);
               --class578.field7932;
            }
         }
      }

      if (arg0 != null) {
         for(int var5 = 0; var5 < arg0.length && var5 != 8 && this.field9890 != 8; ++var5) {
            if (!field9875[var5]) {
               class458 var6 = null;
               if (arg0[var5].method4425(-1).field4089 == 1 && class578.field7932 < 32) {
                  var6 = new class458(arg0[var5], this);
                  class569.field7809.method4600((long)arg0[var5].field8487, (byte)118, var6);
                  ++class578.field7932;
               }

               if (var6 == null) {
                  var6 = new class458(arg0[var5], this);
               }

               this.field9885.method3859(2, var6);
               ++this.field9890;
               field9875[var5] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method4924(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field9889 = arg0;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(Lha;J[Lub;[Luo;Z)V"
   )
   public final void method4925(class65 arg0, long arg1, class22[] arg2, class606[] arg3, boolean arg4) {
      if (!this.field9876) {
         this.method4931(arg0, arg2, arg4);
         this.method4923(arg3, arg4);
         this.field9882 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "d",
      descriptor = "()V"
   )
   public static void method4926() {
      field9878 = null;
      field9875 = null;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "f",
      descriptor = "()Ljea;"
   )
   public final class478 method4927() {
      this.field9888.field6608.method1835((byte)-16);

      for(int var1 = 0; var1 < this.field9879.length; ++var1) {
         if (this.field9879[var1] != null && this.field9879[var1].field6191 != null) {
            this.field9888.field6608.method1834(-5531, this.field9879[var1]);
         }
      }

      return this.field9888;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "g",
      descriptor = "()V"
   )
   public final void method4928() {
      this.field9876 = true;

      for(class458 var1 = (class458)this.field9885.method3855(114); var1 != null; var1 = (class458)this.field9885.method3866((byte)113)) {
         if (var1.field6276.field4089 == 1) {
            var1.method3943(-4);
         }
      }

      for(int var2 = 0; var2 < this.field9879.length; ++var2) {
         if (this.field9879[var2] != null) {
            this.field9879[var2].method3325();
            this.field9879[var2] = null;
         }
      }

      this.field9880 = 0;
      this.field9883 = new class411();
      this.field9884 = 0;
      this.field9885 = new class536();
      this.field9890 = 0;
      this.method5512((byte)86);
      class656.field9177[class456.field6252] = this;
      class456.field6252 = class456.field6252 + 1 & class39.field455[class366.field5166];
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(Lha;)V"
   )
   public final void method4929(class65 arg0) {
      this.field9888.field6608.method1835((byte)-99);

      for(class406 var2 = (class406)this.field9883.method3110(-109); var2 != null; var2 = (class406)this.field9883.method3114(2)) {
         var2.method3080(this.field9877, 57, arg0);
      }

   }

   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "(IZ)Lrg;"
   )
   public static final class672 method4930(int arg0, boolean arg1) {
      if (class519.field7116 != class456.field6252) {
         class672 var2 = class656.field9177[class519.field7116];
         class519.field7116 = class519.field7116 + 1 & class39.field455[class366.field5166];
         var2.method4933(arg0, arg1);
         return var2;
      } else {
         return new class672(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(Lha;[Lub;Z)V"
   )
   private final void method4931(class65 arg0, class22[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field9878[var4] = false;
      }

      label67:
      for(class406 var5 = (class406)this.field9883.method3110(-118); var5 != null; var5 = (class406)this.field9883.method3114(2)) {
         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length; ++var8) {
               if (arg1[var8] == var5.field5722 || arg1[var8].field279 == var5.field5722) {
                  field9878[var8] = true;
                  var5.method3081(-6781);
                  var5.field5729 = false;
                  continue label67;
               }
            }
         }

         if (!arg2) {
            if (var5.field5723 == 0) {
               var5.method5512((byte)48);
               --this.field9884;
            } else {
               var5.field5729 = true;
            }
         }
      }

      if (arg1 != null) {
         for(int var6 = 0; var6 < arg1.length && var6 != 32 && this.field9884 != 32; ++var6) {
            if (!field9878[var6]) {
               class406 var7 = new class406(arg0, arg1[var6], this, this.field9882);
               this.field9883.method3116(var7, -118);
               ++this.field9884;
               field9878[var6] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!rg",
      name = "c",
      descriptor = "()Ljea;"
   )
   public final class478 method4932() {
      return this.field9888;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method4933(int arg0, boolean arg1) {
      class650.field9113.method3116(this, 28);
      this.field9882 = (long)arg0;
      this.field9877 = (long)arg0;
      this.field9886 = true;
      this.field9887 = arg1;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(Lha;J)Z"
   )
   public final boolean method4934(class65 arg0, long arg1) {
      if (this.field9882 != this.field9877) {
         this.method4938();
      } else {
         this.method4937();
      }

      if (arg1 - this.field9882 > 750L) {
         this.method4928();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field9877);
         if (this.field9886) {
            for(class406 var5 = (class406)this.field9883.method3110(-108); var5 != null; var5 = (class406)this.field9883.method3114(2)) {
               for(int var6 = 0; var6 < var5.field5733.field1201; ++var6) {
                  var5.method3082(arg1, 1, arg0, 100, !this.field9881);
               }
            }

            this.field9886 = false;
         }

         for(class406 var7 = (class406)this.field9883.method3110(-128); var7 != null; var7 = (class406)this.field9883.method3114(2)) {
            var7.method3082(arg1, var4, arg0, 97, !this.field9881);
         }

         this.field9877 = arg1;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method4935(long arg0) {
      this.field9882 = arg0;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "()V"
   )
   public final void method4936() {
      this.field9886 = true;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "e",
      descriptor = "()V"
   )
   private final void method4937() {
      this.field9881 = false;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "()V"
   )
   public final void method4938() {
      this.field9881 = true;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   private class672(int arg0, boolean arg1) {
      this.method4933(arg0, arg1);
   }
}
