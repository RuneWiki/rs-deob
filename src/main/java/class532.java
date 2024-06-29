import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class532 extends class686 {
   @OriginalMember(
      owner = "client!wl",
      name = "t",
      descriptor = "I"
   )
   public int field7501 = 0;
   @OriginalMember(
      owner = "client!wl",
      name = "y",
      descriptor = "Z"
   )
   public boolean field7496 = false;
   @OriginalMember(
      owner = "client!wl",
      name = "u",
      descriptor = "Z"
   )
   private boolean field7503 = false;
   @OriginalMember(
      owner = "client!wl",
      name = "l",
      descriptor = "Lpf;"
   )
   private class424 field7499 = new class424();
   @OriginalMember(
      owner = "client!wl",
      name = "o",
      descriptor = "I"
   )
   private int field7505 = 0;
   @OriginalMember(
      owner = "client!wl",
      name = "A",
      descriptor = "Lsb;"
   )
   public class261 field7506 = new class261();
   @OriginalMember(
      owner = "client!wl",
      name = "m",
      descriptor = "Z"
   )
   public boolean field7508 = false;
   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "Z"
   )
   private boolean field7509 = false;
   @OriginalMember(
      owner = "client!wl",
      name = "s",
      descriptor = "I"
   )
   private int field7511 = 0;
   @OriginalMember(
      owner = "client!wl",
      name = "r",
      descriptor = "Luv;"
   )
   public class521 field7507 = new class521();
   @OriginalMember(
      owner = "client!wl",
      name = "n",
      descriptor = "[Lfga;"
   )
   public class154[] field7502 = new class154[8192];
   @OriginalMember(
      owner = "client!wl",
      name = "p",
      descriptor = "[Z"
   )
   private static boolean[] field7498 = new boolean[8];
   @OriginalMember(
      owner = "client!wl",
      name = "x",
      descriptor = "[Z"
   )
   private static boolean[] field7500 = new boolean[32];
   @OriginalMember(
      owner = "client!wl",
      name = "w",
      descriptor = "I"
   )
   public int field7510;
   @OriginalMember(
      owner = "client!wl",
      name = "q",
      descriptor = "J"
   )
   private long field7497;
   @OriginalMember(
      owner = "client!wl",
      name = "v",
      descriptor = "J"
   )
   private long field7504;

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "()Luv;"
   )
   public final class521 method3969() {
      this.field7507.field7334.method4836(8);

      for(int var1 = 0; var1 < this.field7502.length; ++var1) {
         if (this.field7502[var1] != null && this.field7502[var1].field2350 != null) {
            this.field7507.field7334.method4838(this.field7502[var1], true);
         }
      }

      return this.field7507;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(Lha;)V"
   )
   public final void method3970(class17 arg0) {
      this.field7507.field7334.method4836(8);

      for(class775 var2 = (class775)this.field7499.method3307(16976); var2 != null; var2 = (class775)this.field7499.method3309(true)) {
         var2.method5595(this.field7497, arg0, 64);
      }

   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method3971(int arg0, boolean arg1) {
      class453.field6595.method3310(0, this);
      this.field7504 = (long)arg0;
      this.field7497 = (long)arg0;
      this.field7509 = true;
      this.field7508 = arg1;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(Lha;J[Ldga;[Lhaa;Z)V"
   )
   public final void method3972(class17 arg0, long arg1, class712[] arg2, class3[] arg3, boolean arg4) {
      if (!this.field7496) {
         this.method3984(arg0, arg2, arg4);
         this.method3983(arg3, arg4);
         this.field7504 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method3973(long arg0) {
      this.field7504 = arg0;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(Lha;J)Z"
   )
   public final boolean method3974(class17 arg0, long arg1) {
      if (this.field7504 != this.field7497) {
         this.method3977();
      } else {
         this.method3975();
      }

      if (arg1 - this.field7504 > 750L) {
         this.method3976();
         return false;
      } else {
         int var4 = (int)(arg1 - this.field7497);
         if (this.field7509) {
            for(class775 var5 = (class775)this.field7499.method3307(16976); var5 != null; var5 = (class775)this.field7499.method3309(true)) {
               for(int var6 = 0; var6 < var5.field11305.field5184; ++var6) {
                  var5.method5597(!this.field7503, false, 1, arg1, arg0);
               }
            }

            this.field7509 = false;
         }

         for(class775 var7 = (class775)this.field7499.method3307(16976); var7 != null; var7 = (class775)this.field7499.method3309(true)) {
            var7.method5597(!this.field7503, false, var4, arg1, arg0);
         }

         this.field7497 = arg1;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "f",
      descriptor = "()V"
   )
   private final void method3975() {
      this.field7503 = false;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "g",
      descriptor = "()V"
   )
   public final void method3976() {
      this.field7496 = true;

      for(class1 var1 = (class1)this.field7506.method2245((byte)-94); var1 != null; var1 = (class1)this.field7506.method2239((byte)101)) {
         if (var1.field6.field507 == 1) {
            var1.method962(false);
         }
      }

      for(int var2 = 0; var2 < this.field7502.length; ++var2) {
         if (this.field7502[var2] != null) {
            this.field7502[var2].method1480();
            this.field7502[var2] = null;
         }
      }

      this.field7501 = 0;
      this.field7499 = new class424();
      this.field7505 = 0;
      this.field7506 = new class261();
      this.field7511 = 0;
      this.method4994((byte)-106);
      class183.field2690[class152.field2327] = this;
      class152.field2327 = class152.field2327 + 1 & class668.field9390[class679.field9837];
   }

   @OriginalMember(
      owner = "client!wl",
      name = "c",
      descriptor = "()V"
   )
   public final void method3977() {
      this.field7503 = true;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method3978(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.field7510 = arg0;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "()V"
   )
   public static void method3979() {
      field7500 = null;
      field7498 = null;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "d",
      descriptor = "()Luv;"
   )
   public final class521 method3980() {
      return this.field7507;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "(IZ)Lwl;"
   )
   public static final class532 method3981(int arg0, boolean arg1) {
      if (class670.field9408 != class152.field2327) {
         class532 var2 = class183.field2690[class670.field9408];
         class670.field9408 = class670.field9408 + 1 & class668.field9390[class679.field9837];
         var2.method3971(arg0, arg1);
         return var2;
      } else {
         return new class532(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "e",
      descriptor = "()V"
   )
   public final void method3982() {
      this.field7509 = true;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "([Lhaa;Z)V"
   )
   private final void method3983(class3[] arg0, boolean arg1) {
      for(int var3 = 0; var3 < 8; ++var3) {
         field7498[var3] = false;
      }

      label76:
      for(class1 var4 = (class1)this.field7506.method2245((byte)-94); var4 != null; var4 = (class1)this.field7506.method2239((byte)101)) {
         if (arg0 != null) {
            for(int var7 = 0; var7 < arg0.length; ++var7) {
               if (arg0[var7] == var4.field3 || arg0[var7].field29 == var4.field3) {
                  field7498[var7] = true;
                  var4.method1(0);
                  continue label76;
               }
            }
         }

         if (!arg1) {
            var4.method2140((byte)-101);
            --this.field7511;
            if (var4.method963((byte)-114)) {
               var4.method962(false);
               --class340.field5003;
            }
         }
      }

      if (arg0 != null) {
         for(int var5 = 0; var5 < arg0.length && var5 != 8 && this.field7511 != 8; ++var5) {
            if (!field7498[var5]) {
               class1 var6 = null;
               if (arg0[var5].method12((byte)-93).field507 == 1 && class340.field5003 < 32) {
                  var6 = new class1(arg0[var5], this);
                  class459.field6692.method4002(var6, (long)arg0[var5].field34, (byte)-124);
                  ++class340.field5003;
               }

               if (var6 == null) {
                  var6 = new class1(arg0[var5], this);
               }

               this.field7506.method2238(var6, 13);
               ++this.field7511;
               field7498[var5] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(Lha;[Ldga;Z)V"
   )
   private final void method3984(class17 arg0, class712[] arg1, boolean arg2) {
      for(int var4 = 0; var4 < 32; ++var4) {
         field7500[var4] = false;
      }

      label67:
      for(class775 var5 = (class775)this.field7499.method3307(16976); var5 != null; var5 = (class775)this.field7499.method3309(true)) {
         if (arg1 != null) {
            for(int var8 = 0; var8 < arg1.length; ++var8) {
               if (arg1[var8] == var5.field11300 || arg1[var8].field10229 == var5.field11300) {
                  field7500[var8] = true;
                  var5.method5596(false);
                  var5.field11298 = false;
                  continue label67;
               }
            }
         }

         if (!arg2) {
            if (var5.field11292 == 0) {
               var5.method4994((byte)-121);
               --this.field7505;
            } else {
               var5.field11298 = true;
            }
         }
      }

      if (arg1 != null) {
         for(int var6 = 0; var6 < arg1.length && var6 != 32 && this.field7505 != 32; ++var6) {
            if (!field7500[var6]) {
               class775 var7 = new class775(arg0, arg1[var6], this, this.field7504);
               this.field7499.method3310(0, var7);
               ++this.field7505;
               field7500[var6] = true;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!wl",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   private class532(int arg0, boolean arg1) {
      this.method3971(arg0, arg1);
   }
}
