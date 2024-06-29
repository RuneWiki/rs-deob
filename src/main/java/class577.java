import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class577 extends class3 {
   @OriginalMember(
      owner = "client!cba",
      name = "s",
      descriptor = "Z"
   )
   private boolean field8519 = false;
   @OriginalMember(
      owner = "client!cba",
      name = "w",
      descriptor = "I"
   )
   public int field8520 = 0;
   @OriginalMember(
      owner = "client!cba",
      name = "l",
      descriptor = "Z"
   )
   public boolean field8521 = false;
   @OriginalMember(
      owner = "client!cba",
      name = "k",
      descriptor = "Lbo;"
   )
   private class762 field8513 = new class762();
   @OriginalMember(
      owner = "client!cba",
      name = "n",
      descriptor = "I"
   )
   private int field8523 = 0;
   @OriginalMember(
      owner = "client!cba",
      name = "t",
      descriptor = "Lll;"
   )
   public class387 field8522 = new class387();
   @OriginalMember(
      owner = "client!cba",
      name = "o",
      descriptor = "Z"
   )
   public boolean field8525 = false;
   @OriginalMember(
      owner = "client!cba",
      name = "p",
      descriptor = "Z"
   )
   private boolean field8524 = false;
   @OriginalMember(
      owner = "client!cba",
      name = "x",
      descriptor = "I"
   )
   private int field8528 = 0;
   @OriginalMember(
      owner = "client!cba",
      name = "y",
      descriptor = "Lrha;"
   )
   public class234 field8527 = new class234();
   @OriginalMember(
      owner = "client!cba",
      name = "j",
      descriptor = "[Lip;"
   )
   public class737[] field8516 = new class737[8192];
   @OriginalMember(
      owner = "client!cba",
      name = "q",
      descriptor = "[Z"
   )
   private static boolean[] field8514 = new boolean[32];
   @OriginalMember(
      owner = "client!cba",
      name = "u",
      descriptor = "[Z"
   )
   private static boolean[] field8518 = new boolean[8];
   @OriginalMember(
      owner = "client!cba",
      name = "m",
      descriptor = "I"
   )
   public int field8526;
   @OriginalMember(
      owner = "client!cba",
      name = "r",
      descriptor = "J"
   )
   private long field8515;
   @OriginalMember(
      owner = "client!cba",
      name = "v",
      descriptor = "J"
   )
   private long field8517;

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "([Lvga;Z)V"
   )
   private final void method4186(class94[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field8518[var3] = false;
      }

      label76:
      for(class382 var4 = (class382)this.field8522.method2933(2); var4 != null; var4 = (class382)this.field8522.method2940(false)) {
         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length; ++var7) {
               if (arg0[var7] == var4.field5508 || arg0[var7].field1217 == var4.field5508) {
                  field8518[var7] = true;
                  var4.method2884((byte)123);
                  continue label76;
               }
            }
         }

         if (!arg1) {
            var4.method3165(115);
            --this.field8528;
            if (var4.method694((byte)96)) {
               var4.method693((byte)-119);
               --class70.field865;
            }
         }
      }

      if (arg0 != null) {
         for(int var5 = 0; var5 < arg0.length && var5 != 8 && this.field8528 != 8; ++var5) {
            if (!field8518[var5]) {
               class382 var6 = null;
               if (arg0[var5].method808(47).field5432 == 1 && class70.field865 < 32) {
                  var6 = new class382(arg0[var5], this);
                  class17.field194.method3153(var6, 127, (long)arg0[var5].field1215);
                  ++class70.field865;
               }

               if (var6 == null) {
                  var6 = new class382(arg0[var5], this);
               }

               this.field8522.method2930((byte)-54, var6);
               ++this.field8528;
               field8518[var5] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method4187(long arg0) {
      this.field8515 = arg0;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "g",
      descriptor = "()V"
   )
   public final void method4188() {
      this.field8521 = true;

      for(class382 var1 = (class382)this.field8522.method2933(2); var1 != null; var1 = (class382)this.field8522.method2940(false)) {
         if (var1.field5498.field5432 == 1) {
            var1.method693((byte)-57);
         }
      }

      for(int var2 = 0; var2 < this.field8516.length; ++var2) {
         if (this.field8516[var2] != null) {
            this.field8516[var2].method5353();
            this.field8516[var2] = null;
         }
      }

      this.field8520 = 0;
      this.field8513 = new class762();
      this.field8523 = 0;
      this.field8522 = new class387();
      this.field8528 = 0;
      this.method12((byte)77);
      class785.field11517[class362.field4934] = this;
      class362.field4934 = class362.field4934 + 1 & class360.field4920[class2.field9];
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(Lha;J[Ltu;[Lvga;Z)V"
   )
   public final void method4189(class66 arg0, long arg1, class370[] arg2, class94[] arg3, boolean arg4) {
      if (!this.field8521) {
         this.method4197(arg0, arg2, arg4);
         this.method4186(arg3, arg4);
         this.field8515 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method4190(int arg0, boolean arg1) {
      class663.field9658.method5530(125, this);
      this.field8515 = (long)arg0;
      this.field8517 = (long)arg0;
      this.field8524 = true;
      this.field8525 = arg1;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "b",
      descriptor = "(IZ)Lcba;"
   )
   public static final class577 method4191(int arg0, boolean arg1) {
      if (class362.field4934 != class213.field3042) {
         class577 var2 = class785.field11517[class213.field3042];
         class213.field3042 = class213.field3042 + 1 & class360.field4920[class2.field9];
         var2.method4190(arg0, arg1);
         return var2;
      } else {
         return new class577(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "b",
      descriptor = "()Lrha;"
   )
   public final class234 method4192() {
      this.field8527.field3266.method4924((byte)-42);

      for(int var1 = 0; var1 < this.field8516.length; ++var1) {
         if (this.field8516[var1] != null && this.field8516[var1].field10764 != null) {
            this.field8527.field3266.method4922(15, this.field8516[var1]);
         }
      }

      return this.field8527;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "d",
      descriptor = "()V"
   )
   private final void method4193() {
      this.field8519 = false;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "c",
      descriptor = "()V"
   )
   public final void method4194() {
      this.field8524 = true;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(Lha;J)Z"
   )
   public final boolean method4195(class66 arg0, long arg1) {
      if (this.field8517 != this.field8515) {
         this.method4199();
      } else {
         this.method4193();
      }

      if (arg1 - this.field8515 > 750L) {
         this.method4188();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field8517);
         if (this.field8524) {
            for(class58 var5 = (class58)this.field8513.method5529((byte)-42); var5 != null; var5 = (class58)this.field8513.method5527((byte)45)) {
               for(int var6 = 0; var6 < var5.field726.field6573; ++var6) {
                  var5.method453((byte)-116, 1, arg0, arg1, !this.field8519);
               }
            }

            this.field8524 = false;
         }

         for(class58 var7 = (class58)this.field8513.method5529((byte)-42); var7 != null; var7 = (class58)this.field8513.method5527((byte)45)) {
            var7.method453((byte)-116, var4, arg0, arg1, !this.field8519);
         }

         this.field8517 = arg1;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "f",
      descriptor = "()Lrha;"
   )
   public final class234 method4196() {
      return this.field8527;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(Lha;[Ltu;Z)V"
   )
   private final void method4197(class66 arg0, class370[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field8514[var4] = false;
      }

      label67:
      for(class58 var5 = (class58)this.field8513.method5529((byte)-42); var5 != null; var5 = (class58)this.field8513.method5527((byte)45)) {
         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length; ++var8) {
               if (arg1[var8] == var5.field724 || arg1[var8].field5377 == var5.field724) {
                  field8514[var8] = true;
                  var5.method452(-32685);
                  var5.field714 = false;
                  continue label67;
               }
            }
         }

         if (!arg2) {
            if (var5.field713 == 0) {
               var5.method12((byte)-121);
               --this.field8523;
            } else {
               var5.field714 = true;
            }
         }
      }

      if (arg1 != null) {
         for(int var6 = 0; var6 < arg1.length && var6 != 32 && this.field8523 != 32; ++var6) {
            if (!field8514[var6]) {
               class58 var7 = new class58(arg0, arg1[var6], this, this.field8515);
               this.field8513.method5530(117, var7);
               ++this.field8523;
               field8514[var6] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method4198(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field8526 = arg0;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "()V"
   )
   public final void method4199() {
      this.field8519 = true;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(Lha;)V"
   )
   public final void method4200(class66 arg0) {
      this.field8527.field3266.method4924((byte)-81);

      for(class58 var2 = (class58)this.field8513.method5529((byte)-42); var2 != null; var2 = (class58)this.field8513.method5527((byte)45)) {
         var2.method456(arg0, this.field8517, -19447);
      }

   }

   @OriginalMember(
      owner = "client!cba",
      name = "e",
      descriptor = "()V"
   )
   public static void method4201() {
      field8514 = null;
      field8518 = null;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   private class577(int arg0, boolean arg1) {
      this.method4190(arg0, arg1);
   }
}
