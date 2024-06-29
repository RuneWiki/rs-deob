import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class343 {
   @OriginalMember(
      owner = "client!hs",
      name = "i",
      descriptor = "I"
   )
   private int field4865 = 0;
   @OriginalMember(
      owner = "client!hs",
      name = "w",
      descriptor = "I"
   )
   private int field4869 = 1;
   @OriginalMember(
      owner = "client!hs",
      name = "m",
      descriptor = "I"
   )
   private int field4879 = 1;
   @OriginalMember(
      owner = "client!hs",
      name = "u",
      descriptor = "I"
   )
   private int field4877 = 0;
   @OriginalMember(
      owner = "client!hs",
      name = "v",
      descriptor = "Liw;"
   )
   private class332 field4866 = new class332();
   @OriginalMember(
      owner = "client!hs",
      name = "C",
      descriptor = "Z"
   )
   private boolean field4881 = true;
   @OriginalMember(
      owner = "client!hs",
      name = "r",
      descriptor = "I"
   )
   private int field4882 = -1;
   @OriginalMember(
      owner = "client!hs",
      name = "F",
      descriptor = "Z"
   )
   private boolean field4888 = true;
   @OriginalMember(
      owner = "client!hs",
      name = "j",
      descriptor = "I"
   )
   private int field4887 = 0;
   @OriginalMember(
      owner = "client!hs",
      name = "f",
      descriptor = "Z"
   )
   private boolean field4886 = true;
   @OriginalMember(
      owner = "client!hs",
      name = "q",
      descriptor = "[Lkv;"
   )
   private class281[] field4890 = new class281[2];
   @OriginalMember(
      owner = "client!hs",
      name = "A",
      descriptor = "Z"
   )
   private boolean field4889 = false;
   @OriginalMember(
      owner = "client!hs",
      name = "B",
      descriptor = "Z"
   )
   private boolean field4891 = true;
   @OriginalMember(
      owner = "client!hs",
      name = "l",
      descriptor = "Lrk;"
   )
   private class35 field4870;
   @OriginalMember(
      owner = "client!hs",
      name = "t",
      descriptor = "Lin;"
   )
   private class98 field4862;
   @OriginalMember(
      owner = "client!hs",
      name = "E",
      descriptor = "Lin;"
   )
   private class98 field4868;
   @OriginalMember(
      owner = "client!hs",
      name = "d",
      descriptor = "Lin;"
   )
   private class98 field4861;
   @OriginalMember(
      owner = "client!hs",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4892 = new String[]{method2655(method2654("\\\rF$B")), method2655(method2654("OPFK\u0017")), method2655(method2654("IV\u0004f")), method2655(method2654("OPFM\u0017")), method2655(method2654("OPFL\u0017")), method2655(method2654("OPFI\u0017")), method2655(method2654("OPFN\u0017")), method2655(method2654("OPFB\u0017")), method2655(method2654("OPFH\u0017")), method2655(method2654("OPFO\u0017")), method2655(method2654("OPF@\u0017")), method2655(method2654("OPF6VIJ\u001c4\u0017")), method2655(method2654("OPFC\u0017"))};
   @OriginalMember(
      owner = "client!hs",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4878 = null;
   @OriginalMember(
      owner = "client!hs",
      name = "s",
      descriptor = "I"
   )
   public static int field4860;
   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "I"
   )
   public static int field4863;
   @OriginalMember(
      owner = "client!hs",
      name = "x",
      descriptor = "I"
   )
   public static int field4864;
   @OriginalMember(
      owner = "client!hs",
      name = "g",
      descriptor = "I"
   )
   public static int field4867;
   @OriginalMember(
      owner = "client!hs",
      name = "p",
      descriptor = "I"
   )
   public static int field4871;
   @OriginalMember(
      owner = "client!hs",
      name = "c",
      descriptor = "I"
   )
   public static int field4872;
   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "I"
   )
   public static int field4873;
   @OriginalMember(
      owner = "client!hs",
      name = "n",
      descriptor = "I"
   )
   public static int field4874;
   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "I"
   )
   public static int field4875;
   @OriginalMember(
      owner = "client!hs",
      name = "e",
      descriptor = "I"
   )
   public static int field4876;
   @OriginalMember(
      owner = "client!hs",
      name = "h",
      descriptor = "Lkv;"
   )
   private class281 field4883;
   @OriginalMember(
      owner = "client!hs",
      name = "y",
      descriptor = "Lns;"
   )
   private class421 field4884;
   @OriginalMember(
      owner = "client!hs",
      name = "D",
      descriptor = "Lns;"
   )
   private class421 field4885;
   @OriginalMember(
      owner = "client!hs",
      name = "o",
      descriptor = "Z"
   )
   private boolean field4880;

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(I)Z",
      line = 5
   )
   public final boolean method2644(int arg0) {
      try {
         ++field4864;
         if (arg0 != 6402) {
            this.field4891 = false;
         }

         return this.field4868 != null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4892[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "d",
      descriptor = "(I)V",
      line = 18
   )
   public final void method2645(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field4874;
         if (this.field4880) {
            if (this.field4861 != null) {
               this.field4870.method418((byte)2, this.field4861);
               int var3 = 16384;
               this.field4870.method298(1024, this.field4862);
               this.field4861.method939(-79, 0);
               this.field4862.method947(0, -14599);
               if (this.field4889) {
                  var3 |= 256;
               }

               OpenGL.glBlitFramebufferEXT(0, 0, this.field4869, this.field4879, 0, 0, this.field4869, this.field4879, var3, 9728);
               this.field4870.method419(8192, this.field4861);
               this.field4870.method382(arg0 + 1921177385, this.field4862);
            }

            this.field4870.method430(2);
            this.field4870.method288(-3, 0);
            this.field4870.method322(-70, 1);
            this.field4870.method349();
            int var4 = 0;
            int var5 = 1;
            class405 var6 = (class405)this.field4866.method2579(-801);
            if (!var2 && var6 == null) {
               if (arg0 != 20271) {
                  this.field4879 = 122;
               }

               this.field4880 = false;
            } else {
               do {
                  class405 var10000;
                  label79: {
                     class405 var7 = (class405)this.field4866.method2583(1);
                     int var8 = var6.method3117(false);
                     int var9 = 0;
                     if (var2) {
                        var6.method3113(this.field4883, var9, this.field4890[var4], arg0 ^ -20311);
                        var10000 = var7;
                     } else if (var9 >= var8) {
                        var10000 = var7;
                        if (!var2) {
                           break label79;
                        }
                     } else {
                        var6.method3113(this.field4883, var9, this.field4890[var4], arg0 ^ -20311);
                        var10000 = var7;
                     }

                     while(true) {
                        label90: {
                           if (var10000 == null && var8 - 1 == var9) {
                              this.field4870.method400(this.field4862, 20547);
                              this.field4870.method292(0, 0, (byte)-21);
                              OpenGL.glBegin(7);
                              OpenGL.glTexCoord2f(0.0F, (float)this.field4879);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                              OpenGL.glVertex2i(this.field4877, this.field4865);
                              OpenGL.glTexCoord2f(0.0F, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                              OpenGL.glVertex2i(this.field4877, this.field4879 + this.field4865);
                              OpenGL.glTexCoord2f((float)this.field4869, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                              OpenGL.glVertex2i(this.field4877 + this.field4869, this.field4879 + this.field4865);
                              OpenGL.glTexCoord2f((float)this.field4869, (float)this.field4879);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                              OpenGL.glVertex2i(this.field4877 + this.field4869, this.field4865);
                              OpenGL.glEnd();
                              if (!var2) {
                                 var6.method3114(-122, var9);
                                 var5 = 1 & var5 + 1;
                                 var4 = 1 & var4 + 1;
                                 ++var9;
                                 break label90;
                              }
                           }

                           this.field4862.method947(var5, arg0 ^ -30250);
                           OpenGL.glBegin(7);
                           OpenGL.glTexCoord2f(0.0F, (float)this.field4879);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                           OpenGL.glVertex2i(0, 0);
                           OpenGL.glTexCoord2f(0.0F, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                           OpenGL.glVertex2i(0, this.field4879);
                           OpenGL.glTexCoord2f((float)this.field4869, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                           OpenGL.glVertex2i(this.field4869, this.field4879);
                           OpenGL.glTexCoord2f((float)this.field4869, (float)this.field4879);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                           OpenGL.glVertex2i(this.field4869, 0);
                           OpenGL.glEnd();
                           var6.method3114(-122, var9);
                           var5 = 1 & var5 + 1;
                           var4 = 1 & var4 + 1;
                           ++var9;
                        }

                        if (var9 >= var8) {
                           var10000 = var7;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var6.method3113(this.field4883, var9, this.field4890[var4], arg0 ^ -20311);
                           var10000 = var7;
                        }
                     }
                  }

                  var6 = var10000;
               } while(var6 != null);

               if (arg0 != 20271) {
                  this.field4879 = 122;
               }

               this.field4880 = false;
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field4892[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "<init>",
      descriptor = "(Lrk;)V",
      line = 526
   )
   public class343(class35 arg0) {
      try {
         this.field4870 = arg0;
         if (this.field4870.field771 && this.field4870.field802) {
            this.field4868 = this.field4862 = new class98(this.field4870);
            if (~this.field4870.field712 < -2 && this.field4870.field775 && this.field4870.field847) {
               this.field4868 = this.field4861 = new class98(this.field4870);
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4892[11] + (arg0 != null ? field4892[0] : field4892[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "(B)V",
      line = 131
   )
   private final void method2646(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field4873;
         boolean var3 = false;
         int var4 = 0;
         int var5 = 0;
         if (arg0 != 4) {
            this.field4884 = null;
         }

         class405 var6 = (class405)this.field4866.method2579(-801);
         int var7;
         if (var2) {
            var7 = var6.method3112(1);
            var5 += var6.method3117(false);
            if (~var7 < ~var4) {
               var4 = var7;
            }

            var3 |= var6.method3123((byte)-93);
            var6 = (class405)this.field4866.method2583(1);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = var4;
               if (!var2) {
                  int var8;
                  label62: {
                     if (var4 != 2) {
                        if (~var4 == -2) {
                           var8 = 34842;
                           if (!var2) {
                              break label62;
                           }
                        }

                        var8 = 6408;
                        if (!var2) {
                           break label62;
                        }
                     }

                     var8 = 34836;
                  }

                  if (this.field4882 != var8) {
                     this.field4891 = true;
                     this.field4882 = var8;
                  }

                  int var9 = ~this.field4887 < -3 ? 2 : this.field4887;
                  int var10 = ~var5 >= -3 ? var5 : 2;
                  if (!var3 == this.field4889) {
                     this.field4889 = var3;
                     this.field4881 = true;
                  }

                  this.field4887 = var5;
                  if (~var9 != ~var10) {
                     this.field4886 = this.field4891 = true;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var6.method3112(1);
            }

            var7 = var10000;
            var5 += var6.method3117(false);
            if (~var7 < ~var4) {
               var4 = var7;
            }

            var3 |= var6.method3123((byte)-93);
            var6 = (class405)this.field4866.method2583(1);
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field4892[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(FI)F",
      line = 200
   )
   public static final float method2647(float arg0, int arg1) {
      try {
         ++field4867;
         int var2 = 122 % ((arg1 - -57) / 33);
         return arg0 * arg0 * arg0 * ((arg0 * 6.0F + -15.0F) * arg0 + 10.0F);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4892[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(B)V",
      line = 211
   )
   public final void method2648(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field4860;
         this.field4890 = null;
         this.field4883 = null;
         this.field4868 = this.field4861 = this.field4862 = null;
         this.field4885 = null;
         this.field4884 = null;
         if (!this.field4866.method2574(-103)) {
            class22 var3 = this.field4866.method2579(-801);
            if (var2 || this.field4866.field4749 != var3) {
               do {
                  ((class405)var3).method3121(-111);
                  var3 = var3.field346;
               } while(this.field4866.field4749 != var3);
            }
         }

         if (arg0 < -84) {
            this.field4869 = this.field4879 = 1;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4892[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(IIIIZ)Z",
      line = 241
   )
   public final boolean method2649(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      boolean var6 = client.field4564;

      try {
         ++field4871;
         if (this.field4868 != null && !this.field4866.method2574(-89)) {
            if (~this.field4869 != ~arg3 || this.field4879 != arg1) {
               this.field4879 = arg1;
               this.field4869 = arg3;
               class22 var7 = this.field4866.method2579(-801);
               if (var6) {
                  ((class405)var7).method3116(this.field4869, this.field4879, 32319);
                  var7 = var7.field346;
               }

               while(true) {
                  while(this.field4866.field4749 != var7) {
                     ((class405)var7).method3116(this.field4869, this.field4879, 32319);
                     var7 = var7.field346;
                  }

                  this.field4881 = true;
                  this.field4886 = true;
                  if (!var6) {
                     this.field4891 = true;
                     break;
                  }

                  var7 = var7.field346;
               }
            }

            if (this.method2650(10427)) {
               this.field4865 = arg2;
               this.field4880 = true;
               this.field4877 = arg0;
               this.field4870.method428(this.field4868, (byte)-125);
               this.field4868.method947(0, -14599);
               this.field4870.method292(-this.field4877, this.field4879 - (-this.field4865 + this.field4870.field546), (byte)-21);
               return true;
            } else {
               if (!arg4) {
                  method2651(83);
               }

               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field4892[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "(I)Z",
      line = 286
   )
   private final boolean method2650(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (this.field4881) {
            if (this.field4885 != null) {
               this.field4885.method3199(-4349);
               this.field4885 = null;
            }

            if (this.field4883 != null) {
               this.field4883.method5126(10240);
               this.field4883 = null;
            }

            if (this.field4861 != null) {
               this.field4885 = new class421(this.field4870, 6402, this.field4869, this.field4879, this.field4870.field712);
            }

            label111: {
               if (!this.field4889) {
                  if (this.field4885 != null) {
                     break label111;
                  }

                  this.field4885 = new class421(this.field4870, 6402, this.field4869, this.field4879);
                  if (!var2) {
                     break label111;
                  }
               }

               this.field4883 = new class281(this.field4870, 34037, 6402, this.field4869, this.field4879);
            }

            this.field4888 = true;
            this.field4886 = true;
            this.field4881 = false;
         }

         ++field4875;
         if (arg0 != 10427) {
            return false;
         } else {
            if (this.field4891) {
               if (this.field4884 != null) {
                  this.field4884.method3199(arg0 ^ -14408);
                  this.field4884 = null;
               }

               if (this.field4890[0] != null) {
                  this.field4890[0].method5126(10240);
                  this.field4890[0] = null;
               }

               if (this.field4890[1] != null) {
                  this.field4890[1].method5126(arg0 + -187);
                  this.field4890[1] = null;
               }

               if (this.field4861 != null) {
                  this.field4884 = new class421(this.field4870, this.field4882, this.field4869, this.field4879, this.field4870.field712);
               }

               this.field4890[0] = new class281(this.field4870, 34037, this.field4882, this.field4869, this.field4879);
               this.field4890[1] = this.field4887 <= 1 ? null : new class281(this.field4870, 34037, this.field4882, this.field4869, this.field4879);
               this.field4888 = true;
               this.field4891 = false;
               this.field4886 = true;
            }

            if (this.field4886) {
               label124: {
                  if (this.field4861 == null) {
                     this.field4870.method428(this.field4862, (byte)-112);
                     this.field4862.method931(0, arg0 + -10426);
                     this.field4862.method931(1, arg0 + -10426);
                     this.field4862.method931(8, 1);
                     this.field4862.method943(0, arg0 ^ 10400, this.field4890[0]);
                     if (this.field4887 > 1) {
                        this.field4862.method943(1, arg0 ^ 10384, this.field4890[1]);
                     }

                     label95: {
                        if (this.field4889) {
                           this.field4862.method943(8, 119, this.field4883);
                           if (!var2) {
                              break label95;
                           }
                        }

                        this.field4862.method941((byte)-122, this.field4885, 8);
                     }

                     this.field4870.method400(this.field4862, arg0 ^ 30968);
                     if (!var2) {
                        break label124;
                     }
                  }

                  this.field4870.method428(this.field4862, (byte)-119);
                  this.field4862.method931(0, 1);
                  this.field4862.method931(1, arg0 + -10426);
                  this.field4862.method931(8, 1);
                  this.field4862.method943(0, 30, this.field4890[0]);
                  if (this.field4887 > 1) {
                     this.field4862.method943(1, 30, this.field4890[1]);
                  }

                  if (this.field4889) {
                     this.field4862.method943(8, arg0 + -10320, this.field4883);
                  }

                  this.field4870.method400(this.field4862, arg0 + 10120);
                  this.field4870.method428(this.field4861, (byte)-127);
                  this.field4861.method931(0, 1);
                  this.field4861.method931(8, 1);
                  this.field4861.method941((byte)43, this.field4884, 0);
                  this.field4861.method941((byte)24, this.field4885, 8);
                  this.field4870.method400(this.field4861, 20547);
               }

               this.field4886 = false;
               this.field4888 = true;
            }

            if (this.field4888) {
               this.field4870.method428(this.field4868, (byte)-115);
               this.field4888 = !this.field4868.method950(arg0 + -10431);
               this.field4870.method400(this.field4868, 20547);
            }

            return !this.field4888;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4892[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "c",
      descriptor = "(I)V",
      line = 416
   )
   public static void method2651(int arg0) {
      try {
         if (arg0 < 62) {
            field4876 = -98;
         }

         field4878 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4892[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "(Lml;I)Z",
      line = 432
   )
   public final boolean method2652(class405 arg0, int arg1) {
      try {
         ++field4872;
         if (arg1 != -6701) {
            this.field4868 = null;
         }

         if (this.field4868 != null) {
            if (arg0.method3122((byte)-69) || arg0.method3118(arg1 + 6788)) {
               this.field4866.method2585(arg0, 45);
               this.method2646((byte)4);
               if (this.method2650(10427)) {
                  if (~this.field4869 != 0 && ~this.field4879 != 0) {
                     arg0.method3116(this.field4869, this.field4879, 32319);
                  }

                  arg0.field5972 = true;
                  return true;
               }
            }

            this.method2653(arg0, arg1 ^ -6701);
         }

         return false;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4892[12] + (arg0 != null ? field4892[0] : field4892[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(Lml;I)V",
      line = 491
   )
   public final void method2653(class405 arg0, int arg1) {
      try {
         arg0.field5972 = false;
         ++field4863;
         arg0.method3121(-88);
         arg0.method154(29);
         this.method2646((byte)4);
         if (arg1 != 0) {
            this.method2649(-107, -95, 101, 111, false);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4892[1] + (arg0 != null ? field4892[0] : field4892[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2654(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2655(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
