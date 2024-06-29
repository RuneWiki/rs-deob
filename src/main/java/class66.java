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
   public class160 field813;
   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "I"
   )
   public int field815;
   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field820 = new String[]{method662(method661("d\u001f00Rb\u001fr?AiV")), method662(method661("d\u001f0\u0018q$")), method662(method661("wP0xF")), method662(method661("b\u000br:")), method662(method661("d\u001f0\u0006q$")), method662(method661("d\u001f0\u0005q$")), method662(method661("d\u001f0\u0004q$")), method662(method661("B8J\u001f")), method662(method661("d\u001f0jRb\u0017jh\u0013")), method662(method661("d\u001f0\u001dq$")), method662(method661("d\u001f0\u0007q$")), method662(method661("d\u001f0\u0002q$")), method662(method661("d\u001f0\u001aq$")), method662(method661("d\u001f0\u001bq$")), method662(method661("d\u001f0\u0019q$")), method662(method661("d\u001f0\u0000q$")), method662(method661("d\u001f0\u0001q$")), method662(method661("Y3")), method662(method661("d\u001f0\u0003q$"))};
   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "Lsd;"
   )
   public static class101 field808 = new class101(91, -2);
   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "Lpn;"
   )
   public static class776 field817 = new class776();
   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "I"
   )
   public static int field802;
   @OriginalMember(
      owner = "client!ha",
      name = "p",
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
      name = "e",
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
      name = "a",
      descriptor = "I"
   )
   public static int field807;
   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "I"
   )
   public static int field809;
   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "I"
   )
   public static int field810;
   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "I"
   )
   public static int field811;
   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "I"
   )
   public static int field812;
   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "I"
   )
   public static int field814;
   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "I"
   )
   public static int field816;
   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "I"
   )
   public static int field818;
   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "[Lida;"
   )
   public static class246[] field819;

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lat;B)V",
      line = 39
   )
   public final void method564(class396 arg0, byte arg1) {
      try {
         ++field804;
         if (arg1 != -59) {
            this.method631();
         }

         this.method566(this.method541(arg0, this.method578(arg0.method1965(), arg0.method1967())));
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field820[5] + (arg0 != null ? field820[2] : field820[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIIII)V",
      line = 65
   )
   public final void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field816;
         this.method588(arg4, arg0, arg5, arg2, arg3, arg1);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field820[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;IIIILeaa;Ld;)Lha;",
      line = 76
   )
   public static final synchronized class66 method579(int arg0, Canvas arg1, int arg2, int arg3, int arg4, int arg5, class526 arg6, class160 arg7) {
      try {
         ++field814;
         if (arg5 == 0) {
            return class154.method1273(arg2, arg1, -106, arg0, arg7);
         } else {
            if (arg3 != -25321) {
               field817 = null;
            }

            if (~arg5 == -3) {
               return class17.method121(arg7, arg2, 7596, arg0, arg1);
            } else if (~arg5 == -2) {
               return class635.method4576(arg7, (byte)82, arg1, arg4);
            } else if (arg5 == 5) {
               return class252.method1904(arg4, false, arg6, arg7, arg1);
            } else if (~arg5 == -4) {
               return class316.method2406(arg7, arg6, arg4, -223, arg1);
            } else {
               throw new IllegalArgumentException(field820[17]);
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field820[16] + arg0 + ',' + (arg1 != null ? field820[2] : field820[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field820[2] : field820[3]) + ',' + (arg7 != null ? field820[2] : field820[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(III[III)Lat;",
      line = 125
   )
   public final class396 method589(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      try {
         ++field810;
         if (arg1 != 0) {
            field808 = null;
         }

         return this.method603(arg3, arg2, arg0, arg4, arg5, true);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field820[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field820[2] : field820[3]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "(IIIIII)V",
      line = 160
   )
   public final void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.method645(arg2, arg4, arg3, arg1, arg5, arg0);
         ++field818;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field820[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(B)V",
      line = 176
   )
   public final void method617(byte arg0) throws class280 {
      try {
         ++field809;
         this.method627(0, 0);
         if (arg0 < 10) {
            this.method557(59, -17, 11, -25, 16, 114, 86);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field820[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;II)V",
      line = 189
   )
   public final void method619(Rectangle[] arg0, int arg1, int arg2) throws class280 {
      try {
         this.method605(arg0, arg2, 0, 0);
         if (arg1 > -76) {
            this.method569(124, -20, -65, 71);
         }

         ++field805;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field820[4] + (arg0 != null ? field820[2] : field820[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(IIIII)V",
      line = 208
   )
   public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method615(arg1, arg4, arg3, arg2, 1);
         if (arg0 < 66) {
            this.method655(102, -107, -69, 67, -100);
         }

         ++field802;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field820[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 237
   )
   public final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.method553(arg0, arg3, arg1, arg5, arg2, arg4);
         ++field807;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field820[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "finalize",
      descriptor = "()V",
      line = 247
   )
   protected void finalize() {
      try {
         ++field803;
         this.method653(-119);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field820[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIII)V",
      line = 257
   )
   public final void method642(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method652(arg4, arg1, arg0, arg3, arg2);
         ++field806;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field820[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(B)V",
      line = 277
   )
   public static void method650(byte arg0) {
      try {
         field817 = null;
         if (arg0 >= -5) {
            field817 = null;
         }

         field819 = null;
         field808 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field820[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(I)V",
      line = 297
   )
   public final void method653(int arg0) {
      try {
         ++field811;
         if (arg0 >= -116) {
            this.method647();
         }

         class410.field6252[this.field815] = false;
         this.method624();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field820[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIII)V",
      line = 312
   )
   public final void method655(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg2 <= -51) {
            this.method539(arg4, arg3, arg1, arg0, 1);
            ++field812;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field820[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "<init>",
      descriptor = "(Ld;)V",
      line = 331
   )
   public class66(class160 arg0) {
      int var2 = client.field4530;
      super();

      try {
         this.field813 = arg0;
         int var3 = -1;
         int var4 = 0;
         int var10000;
         if (var2 != 0) {
            var10000 = class410.field6252[var4];
         } else if (~var4 <= -9) {
            var10000 = var3;
            if (var2 == 0) {
               if (var3 == -1) {
                  throw new IllegalStateException(field820[7]);
               }

               this.field815 = var3;
               return;
            }
         } else {
            var10000 = class410.field6252[var4];
         }

         do {
            while(true) {
               if (var10000 == 0) {
                  var3 = var4;
                  class410.field6252[var4] = true;
                  if (var2 == 0) {
                     var10000 = var4;
                     break;
                  }

                  ++var4;
               } else {
                  ++var4;
               }

               if (~var4 <= -9) {
                  var10000 = var3;
                  if (var2 == 0) {
                     if (var3 == -1) {
                        throw new IllegalStateException(field820[7]);
                     }

                     this.field815 = var3;
                     return;
                  }
               } else {
                  var10000 = class410.field6252[var4];
               }
            }
         } while(var2 != 0);

         if (var4 == -1) {
            throw new IllegalStateException(field820[7]);
         } else {
            this.field815 = var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field820[8] + (arg0 != null ? field820[2] : field820[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public abstract void method539(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "L",
      descriptor = "(III)V"
   )
   public abstract void method540(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lps;Llba;)Lsea;"
   )
   public abstract class725 method541(class103 arg0, class575 arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "()Z"
   )
   public abstract boolean method542();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Z)V"
   )
   public abstract void method543(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "()Z"
   )
   public abstract boolean method544();

   @OriginalMember(
      owner = "client!ha",
      name = "s",
      descriptor = "()Z"
   )
   public abstract boolean method545();

   @OriginalMember(
      owner = "client!ha",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public abstract void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lut;IIII)Lka;"
   )
   public abstract class497 method547(class134 arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "o",
      descriptor = "()V"
   )
   public abstract void method548();

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "()V"
   )
   public abstract void method549();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public abstract void method550(class540 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(FFF)V"
   )
   public abstract void method551(float arg0, float arg1, float arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public abstract void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public abstract void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public abstract void method554(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method555(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "M",
      descriptor = "()I"
   )
   public abstract int method556();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public abstract void method558(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "()Lgq;"
   )
   public abstract class540 method559();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(II)I"
   )
   public abstract int method560(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "ya",
      descriptor = "()V"
   )
   public abstract void method561();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Loda;)V"
   )
   public abstract void method562(class127 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method563(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "E",
      descriptor = "()I"
   )
   public abstract int method565();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lsea;)V"
   )
   public abstract void method566(class725 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "t",
      descriptor = "()Z"
   )
   public abstract boolean method567();

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "(II)Lps;"
   )
   public abstract class103 method568(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public abstract int[] method569(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lpg;[Lnia;Z)Lda;"
   )
   public abstract class67 method570(class763 arg0, class671[] arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method571(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public abstract class512 method572(int arg0, int arg1, int[] arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "()Z"
   )
   public abstract boolean method573();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method574(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "Y",
      descriptor = "()[I"
   )
   public abstract int[] method576();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lnia;Z)Lat;"
   )
   public abstract class396 method577(class671 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II)Llba;"
   )
   public abstract class575 method578(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIZ)Lat;"
   )
   public abstract class396 method580(int arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "()V"
   )
   public abstract void method581();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method582(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Luaa;)V"
   )
   public abstract void method583(class126 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method584(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "()Z"
   )
   public abstract boolean method585();

   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "()I"
   )
   public abstract int method586();

   @OriginalMember(
      owner = "client!ha",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public abstract void method587(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   public abstract void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public abstract int method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "u",
      descriptor = "()Z"
   )
   public abstract boolean method591();

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "(I)Lza;"
   )
   public abstract class434 method592(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(IIIIII)Luaa;"
   )
   public abstract class126 method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "()Lqha;"
   )
   public abstract class110 method595();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public abstract void method596(class434 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "GA",
      descriptor = "(I)V"
   )
   public abstract void method597(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "T",
      descriptor = "(IIII)V"
   )
   public abstract void method598(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I[Llja;)V"
   )
   public abstract void method599(int arg0, class744[] arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public abstract void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method601(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIZ)Lat;"
   )
   public abstract class396 method602(int arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([IIIIIZ)Lat;"
   )
   public abstract class396 method603(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "()Z"
   )
   public abstract boolean method604();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public abstract void method605(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class280;

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public abstract void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "la",
      descriptor = "()V"
   )
   public abstract void method607();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Luaa;Luaa;FLuaa;)Luaa;"
   )
   public abstract class126 method608(class126 arg0, class126 arg1, float arg2, class126 arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method610(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIF)Llja;"
   )
   public abstract class744 method611(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public abstract int method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method613(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "p",
      descriptor = "()V"
   )
   public abstract void method614();

   @OriginalMember(
      owner = "client!ha",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public abstract void method615(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "()V"
   )
   public abstract void method616();

   @OriginalMember(
      owner = "client!ha",
      name = "K",
      descriptor = "([I)V"
   )
   public abstract void method618(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method620(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "H",
      descriptor = "(III[I)V"
   )
   public abstract void method621(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "C",
      descriptor = "(Z)V"
   )
   public abstract void method622(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Loda;I)V"
   )
   public abstract void method623(class127 arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method624();

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(II)V"
   )
   public abstract void method625(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(II)V"
   )
   public abstract void method627(int arg0, int arg1) throws class280;

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method628(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "da",
      descriptor = "(III[I)V"
   )
   public abstract void method629(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public abstract void method630(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "I",
      descriptor = "()I"
   )
   public abstract int method631();

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(II)I"
   )
   public abstract int method632(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method633(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "y",
      descriptor = "()Z"
   )
   public abstract boolean method634();

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "()I"
   )
   public abstract int method635();

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public abstract void method636(int arg0, class512 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "F",
      descriptor = "(II)V"
   )
   public abstract void method638(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "XA",
      descriptor = "()I"
   )
   public abstract int method639();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public abstract void method640(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public abstract void method641(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "(I)V"
   )
   public abstract void method643(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "n",
      descriptor = "()Z"
   )
   public abstract boolean method644();

   @OriginalMember(
      owner = "client!ha",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public abstract void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "X",
      descriptor = "(I)V"
   )
   public abstract void method646(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "w",
      descriptor = "()V"
   )
   public abstract void method647();

   @OriginalMember(
      owner = "client!ha",
      name = "pa",
      descriptor = "()V"
   )
   public abstract void method648();

   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "()Z"
   )
   public abstract boolean method649();

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "()Z"
   )
   public abstract boolean method651();

   @OriginalMember(
      owner = "client!ha",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public abstract void method652(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "xa",
      descriptor = "(F)V"
   )
   public abstract void method654(float arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "()Lgq;"
   )
   public abstract class540 method656();

   @OriginalMember(
      owner = "client!ha",
      name = "x",
      descriptor = "()Z"
   )
   public abstract boolean method657();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public abstract class293 method658(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "()Lgq;"
   )
   public abstract class540 method659();

   @OriginalMember(
      owner = "client!ha",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public abstract void method660(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method661(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method662(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
