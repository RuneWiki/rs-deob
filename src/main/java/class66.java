import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class66 {
   @OriginalMember(
      owner = "client!ha",
      name = "n",
      descriptor = "Ld;"
   )
   public class162 field802;
   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "I"
   )
   public int field796;
   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field812 = new String[]{method616(method615("R+\"m\u001b\u0012")), method616(method615("o\u0007")), method616(method615("T?`F")), method616(method615("Ad\"\u0004-")), method616(method615("R+\"i\u001b\u0012")), method616(method615("R+\"a\u001b\u0012")), method616(method615("R+\"`\u001b\u0012")), method616(method615("R+\"n\u001b\u0012")), method616(method615("R+\"k\u001b\u0012")), method616(method615("R+\"h\u001b\u0012")), method616(method615("R+\"|\u001a\u0012")), method616(method615("R+\"c\u001b\u0012")), method616(method615("R+\"\u007f\u001a\u0012")), method616(method615("R+\"\u00169T#x\u0014x")), method616(method615("t\fXc")), method616(method615("R+\"b\u001b\u0012")), method616(method615("R+\"L9T+`C*_b")), method616(method615("R+\"}\u001a\u0012")), method616(method615("R+\"o\u001b\u0012")), method616(method615("R+\"l\u001b\u0012"))};
   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "Lada;"
   )
   public static class175 field801 = new class175();
   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "I"
   )
   public static int field795;
   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "I"
   )
   public static int field797;
   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "I"
   )
   public static int field798;
   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "I"
   )
   public static int field799;
   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "I"
   )
   public static int field800;
   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "I"
   )
   public static int field803;
   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "I"
   )
   public static int field804;
   @OriginalMember(
      owner = "client!ha",
      name = "p",
      descriptor = "I"
   )
   public static int field805;
   @OriginalMember(
      owner = "client!ha",
      name = "o",
      descriptor = "I"
   )
   public static int field806;
   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "I"
   )
   public static int field807;
   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "I"
   )
   public static int field808;
   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "I"
   )
   public static int field809;
   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "I"
   )
   public static int field810;
   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "I"
   )
   public static int field811;

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "(I)V",
      line = 11
   )
   public final void method497(int arg0) throws class525 {
      try {
         this.method560(0, 0);
         if (arg0 < -13) {
            ++field806;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field812[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(B)V",
      line = 26
   )
   public static void method501(byte arg0) {
      try {
         if (arg0 <= -25) {
            field801 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field812[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(BI[Ljava/awt/Rectangle;)V",
      line = 50
   )
   public final void method512(byte arg0, int arg1, Rectangle[] arg2) throws class525 {
      try {
         ++field811;
         this.method550(arg2, arg1, 0, 0);
         if (arg0 < 94) {
            this.method543(-82, 71);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field812[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field812[3] : field812[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ld;IIILkf;Ljava/awt/Canvas;II)Lha;",
      line = 74
   )
   public static final synchronized class66 method522(class162 arg0, int arg1, int arg2, int arg3, class266 arg4, Canvas arg5, int arg6, int arg7) {
      try {
         ++field810;
         int var8 = -61 % ((arg6 - 9) / 51);
         if (~arg7 == -1) {
            return class573.method4156(arg3, arg5, arg0, arg1, (byte)3);
         } else if (arg7 == 2) {
            return class266.method2048(arg5, arg0, arg3, (byte)126, arg1);
         } else if (~arg7 == -2) {
            return class402.method3034(arg5, arg0, true, arg2);
         } else if (arg7 == 5) {
            return class687.method5016(arg5, arg4, arg0, arg2, -7566);
         } else if (arg7 == 3) {
            return class166.method1371(arg5, arg0, arg4, arg2, false);
         } else {
            throw new IllegalArgumentException(field812[1]);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field812[0] + (arg0 != null ? field812[3] : field812[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field812[3] : field812[2]) + ',' + (arg5 != null ? field812[3] : field812[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIBI)V",
      line = 122
   )
   public final void method533(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
      try {
         if (arg4 < 28) {
            field801 = null;
         }

         this.method496(arg1, arg2, arg3, arg5, arg0, 1);
         ++field795;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field812[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[IIII)Lbg;",
      line = 157
   )
   public final class492 method548(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg0 != -19069) {
            this.field796 = -117;
         }

         ++field800;
         return this.method515(arg2, arg5, arg3, arg4, arg1, true);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field812[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field812[3] : field812[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIIZ)V",
      line = 180
   )
   public final void method559(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field797;
         if (!arg4) {
            this.method542(arg0, arg3, arg1, arg2, 1);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field812[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IBIIII)V",
      line = 198
   )
   public final void method566(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg1 >= -110) {
            this.field796 = 36;
         }

         ++field805;
         this.method608(arg2, arg0, arg3, arg5, arg4, 1);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field812[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(B)V",
      line = 210
   )
   public final void method567(byte arg0) {
      try {
         if (arg0 >= -61) {
            field801 = null;
         }

         class754.field11172[this.field796] = false;
         ++field803;
         this.method544();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field812[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(BIIIII)V",
      line = 222
   )
   public final void method568(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg0 != -6) {
            this.method582(-67, -1.1831269F, -0.20846777F, 0.10270716F, 0.4137927F, -1.4041518F);
         }

         this.method589(arg3, arg5, arg4, arg2, arg1, 1);
         ++field808;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field812[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Z)V",
      line = 244
   )
   public static final void method577(boolean arg0) {
      boolean var1 = client.field4360;

      try {
         int var2 = 0;
         int var3;
         class529 var4;
         class506 var5;
         if (arg0) {
            field801 = null;
            if (var1) {
               var3 = class352.field4728[var2];
               var4 = (class529)class328.field4479.method329((byte)-12, (long)var3);
               if (var4 != null) {
                  var5 = var4.field7559;
                  class336.method2473(-114, var5, var5.field7333.field10909);
               }

               ++var2;
            }
         }

         while(true) {
            int var10000;
            if (~var2 <= ~class475.field6836) {
               var10000 = field809 + 1;
               if (!var1) {
                  field809 = var10000;
                  return;
               }
            } else {
               var10000 = class352.field4728[var2];
            }

            var3 = var10000;
            var4 = (class529)class328.field4479.method329((byte)-12, (long)var3);
            if (var4 != null) {
               var5 = var4.field7559;
               class336.method2473(-114, var5, var5.field7333.field10909);
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field812[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "<init>",
      descriptor = "(Ld;)V",
      line = 274
   )
   public class66(class162 arg0) {
      boolean var2 = client.field4360;
      super();

      try {
         this.field802 = arg0;
         int var3 = -1;
         int var4 = 0;
         int var10000;
         if (var2) {
            var10000 = class754.field11172[var4];
         } else if (var4 >= 8) {
            var10000 = ~var3;
            if (!var2) {
               if (var10000 == 0) {
                  throw new IllegalStateException(field812[14]);
               }

               this.field796 = var3;
               return;
            }
         } else {
            var10000 = class754.field11172[var4];
         }

         do {
            while(true) {
               if (var10000 == 0) {
                  class754.field11172[var4] = true;
                  var3 = var4;
                  if (!var2) {
                     var10000 = ~var4;
                     break;
                  }

                  ++var4;
               } else {
                  ++var4;
               }

               if (var4 >= 8) {
                  var10000 = ~var3;
                  if (!var2) {
                     if (var10000 == 0) {
                        throw new IllegalStateException(field812[14]);
                     }

                     this.field796 = var3;
                     return;
                  }
               } else {
                  var10000 = class754.field11172[var4];
               }
            }
         } while(var2);

         if (var10000 == 0) {
            throw new IllegalStateException(field812[14]);
         } else {
            this.field796 = var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field812[13] + (arg0 != null ? field812[3] : field812[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIZII)V",
      line = 313
   )
   public final void method585(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field798;
         if (!arg2) {
            this.method574();
         }

         this.method520(arg1, arg0, arg3, arg4, 1);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field812[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lbg;B)V",
      line = 330
   )
   public final void method591(class492 arg0, byte arg1) {
      try {
         this.method556(this.method529(arg0, this.method498(arg0.method958(), arg0.method963())));
         if (arg1 == 113) {
            ++field807;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field812[18] + (arg0 != null ? field812[3] : field812[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIII)V",
      line = 359
   )
   public final void method603(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method576(arg3, arg4, arg0, arg1, arg2);
         ++field804;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field812[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "finalize",
      descriptor = "()V",
      line = 377
   )
   protected void finalize() {
      try {
         this.method567((byte)-96);
         ++field799;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field812[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public abstract void method492(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "C",
      descriptor = "(Z)V"
   )
   public abstract void method493(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public abstract int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "GA",
      descriptor = "(I)V"
   )
   public abstract void method495(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public abstract void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(II)Luu;"
   )
   public abstract class302 method498(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method499(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lmha;Z)Lbg;"
   )
   public abstract class492 method500(class439 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lru;[Lmha;Z)Lda;"
   )
   public abstract class67 method502(class206 arg0, class439[] arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "y",
      descriptor = "()Z"
   )
   public abstract boolean method503();

   @OriginalMember(
      owner = "client!ha",
      name = "XA",
      descriptor = "()I"
   )
   public abstract int method504();

   @OriginalMember(
      owner = "client!ha",
      name = "w",
      descriptor = "()Z"
   )
   public abstract boolean method505();

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(II)V"
   )
   public abstract void method506(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "()Z"
   )
   public abstract boolean method507();

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "()Z"
   )
   public abstract boolean method508();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIF)Lmn;"
   )
   public abstract class389 method509(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "()V"
   )
   public abstract void method510();

   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "()Z"
   )
   public abstract boolean method511();

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(II)Lst;"
   )
   public abstract class461 method513(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "x",
      descriptor = "()V"
   )
   public abstract void method514();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([IIIIIZ)Lbg;"
   )
   public abstract class492 method515(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method516(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public abstract int[] method517(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "pa",
      descriptor = "()V"
   )
   public abstract void method518();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public abstract void method520(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "F",
      descriptor = "(II)V"
   )
   public abstract void method521(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "ya",
      descriptor = "()V"
   )
   public abstract void method523();

   @OriginalMember(
      owner = "client!ha",
      name = "M",
      descriptor = "()I"
   )
   public abstract int method524();

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "(I)V"
   )
   public abstract void method525(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "()Z"
   )
   public abstract boolean method526();

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public abstract void method527(int arg0, class515 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "n",
      descriptor = "()Z"
   )
   public abstract boolean method528();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lst;Luu;)Lus;"
   )
   public abstract class1 method529(class461 arg0, class302 arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method530(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II)I"
   )
   public abstract int method531(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lew;)V"
   )
   public abstract void method532(class521 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "xa",
      descriptor = "(F)V"
   )
   public abstract void method534(float arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lrha;I)V"
   )
   public abstract void method535(class234 arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public abstract void method536(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "()V"
   )
   public abstract void method537();

   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "()Z"
   )
   public abstract boolean method538();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public abstract class295 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Llc;Llc;FLlc;)Llc;"
   )
   public abstract class676 method540(class676 arg0, class676 arg1, float arg2, class676 arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public abstract int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public abstract void method542(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "(II)I"
   )
   public abstract int method543(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method544();

   @OriginalMember(
      owner = "client!ha",
      name = "E",
      descriptor = "()I"
   )
   public abstract int method545();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method546(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "T",
      descriptor = "(IIII)V"
   )
   public abstract void method547(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "()V"
   )
   public abstract void method549();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public abstract void method550(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class525;

   @OriginalMember(
      owner = "client!ha",
      name = "H",
      descriptor = "(III[I)V"
   )
   public abstract void method551(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIZ)Lbg;"
   )
   public abstract class492 method552(int arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I[Lmn;)V"
   )
   public abstract void method553(int arg0, class389[] arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method554(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lio;IIII)Lka;"
   )
   public abstract class500 method555(class464 arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lus;)V"
   )
   public abstract void method556(class1 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public abstract void method557(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "Y",
      descriptor = "()[I"
   )
   public abstract int[] method558();

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(II)V"
   )
   public abstract void method560(int arg0, int arg1) throws class525;

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Llc;)V"
   )
   public abstract void method561(class676 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lrha;)V"
   )
   public abstract void method562(class234 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "I",
      descriptor = "()I"
   )
   public abstract int method563();

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "()Z"
   )
   public abstract boolean method564();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIZ)Lbg;"
   )
   public abstract class492 method565(int arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "u",
      descriptor = "()Z"
   )
   public abstract boolean method569();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method570(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "()Z"
   )
   public abstract boolean method571();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(FFF)V"
   )
   public abstract void method572(float arg0, float arg1, float arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "()Ljr;"
   )
   public abstract class122 method573();

   @OriginalMember(
      owner = "client!ha",
      name = "la",
      descriptor = "()V"
   )
   public abstract void method574();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method575(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public abstract void method576(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIII)Llc;"
   )
   public abstract class676 method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "()V"
   )
   public abstract void method579();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public abstract void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public abstract void method582(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "p",
      descriptor = "()Z"
   )
   public abstract boolean method583();

   @OriginalMember(
      owner = "client!ha",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public abstract void method584(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public abstract void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

   @OriginalMember(
      owner = "client!ha",
      name = "X",
      descriptor = "(I)V"
   )
   public abstract void method587(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method588(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public abstract void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "L",
      descriptor = "(III)V"
   )
   public abstract void method590(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public abstract void method592(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "()I"
   )
   public abstract int method593();

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(I)Lza;"
   )
   public abstract class438 method594(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "()I"
   )
   public abstract int method595();

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "()Lew;"
   )
   public abstract class521 method596();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method597(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "t",
      descriptor = "()Lew;"
   )
   public abstract class521 method598();

   @OriginalMember(
      owner = "client!ha",
      name = "da",
      descriptor = "(III[I)V"
   )
   public abstract void method599(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "o",
      descriptor = "()Lew;"
   )
   public abstract class521 method600();

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method601(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public abstract class515 method602(int arg0, int arg1, int[] arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method604(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "K",
      descriptor = "([I)V"
   )
   public abstract void method605(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "s",
      descriptor = "()Z"
   )
   public abstract boolean method606();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public abstract void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public abstract void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "()V"
   )
   public abstract void method609();

   @OriginalMember(
      owner = "client!ha",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public abstract void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(Z)V"
   )
   public abstract void method611(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public abstract void method612(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method613(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public abstract void method614(class438 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method615(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method616(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
