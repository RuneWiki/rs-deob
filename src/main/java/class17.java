import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class17 {
   @OriginalMember(
      owner = "client!ha",
      name = "t",
      descriptor = "Ld;"
   )
   public class672 field240;
   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "I"
   )
   public int field241;
   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field247 = new String[]{method265(method264("Z\u0005I\n\u001b\u001a")), method265(method264("Z\u0005I\t\u001b\u001a")), method265(method264("Z\u0005I\u0005\u001b\u001a")), method265(method264("IJIl,")), method265(method264("Z\u0005I\u0012\u001b\u001a")), method265(method264("\\\u0011\u000b.")), method265(method264("g)")), method265(method264("Z\u0005I\b\u001b\u001a")), method265(method264("Z\u0005I~8\\\r\u0013|y")), method265(method264("|\"3\u000b")), method265(method264("Z\u0005I\u0011\u001b\u001a")), method265(method264("Z\u0005I\f\u001b\u001a")), method265(method264("Z\u0005I\u000e\u001b\u001a")), method265(method264("Z\u0005I\r\u001b\u001a")), method265(method264("Z\u0005I\u0013\u001b\u001a")), method265(method264("Z\u0005I$8\\\u0005\u000b++WL")), method265(method264("Z\u0005I\u000b\u001b\u001a")), method265(method264("Z\u0005I\u0004\u001b\u001a")), method265(method264("Z\u0005I\u0010\u001b\u001a")), method265(method264("Z\u0005I\u000f\u001b\u001a"))};
   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "I"
   )
   public static int field244 = 0;
   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "I"
   )
   public static int field227;
   @OriginalMember(
      owner = "client!ha",
      name = "s",
      descriptor = "I"
   )
   public static int field228;
   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "I"
   )
   public static int field229;
   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "I"
   )
   public static int field230;
   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "I"
   )
   public static int field231;
   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "I"
   )
   public static int field232;
   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "I"
   )
   public static int field233;
   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "I"
   )
   public static int field234;
   @OriginalMember(
      owner = "client!ha",
      name = "n",
      descriptor = "I"
   )
   public static int field235;
   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "I"
   )
   public static int field236;
   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "I"
   )
   public static int field237;
   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "I"
   )
   public static int field239;
   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "I"
   )
   public static int field242;
   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "I"
   )
   public static int field243;
   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "I"
   )
   public static int field245;
   @OriginalMember(
      owner = "client!ha",
      name = "p",
      descriptor = "I"
   )
   public static int field246;
   @OriginalMember(
      owner = "client!ha",
      name = "o",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field238;

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method140(byte arg0, int arg1) {
      try {
         ++field229;
         int var2 = -48 / ((59 - arg0) / 48);
         return arg1 >>> 8;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field247[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "()I"
   )
   public abstract int method141();

   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method142(int arg0) throws class37 {
      try {
         ++field242;
         this.method182(0, 0);
         if (arg0 < 44) {
            field244 = 74;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field247[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIII)Lns;"
   )
   public abstract class382 method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "ya",
      descriptor = "()V"
   )
   public abstract void method144();

   @OriginalMember(
      owner = "client!ha",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public abstract void method145(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method146(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "Y",
      descriptor = "()[I"
   )
   public abstract int[] method147();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method148(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "M",
      descriptor = "()I"
   )
   public abstract int method149();

   @OriginalMember(
      owner = "client!ha",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public abstract void method150(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "()V"
   )
   public abstract void method151();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lns;Lns;FLns;)Lns;"
   )
   public abstract class382 method152(class382 arg0, class382 arg1, float arg2, class382 arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method153(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public abstract void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method155(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "I",
      descriptor = "()I"
   )
   public abstract int method156();

   @OriginalMember(
      owner = "client!ha",
      name = "v",
      descriptor = "()Lam;"
   )
   public abstract class56 method157();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method158(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIZ)Lma;"
   )
   public abstract class148 method159(int arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "X",
      descriptor = "(I)V"
   )
   public abstract void method160(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "E",
      descriptor = "()I"
   )
   public abstract int method161();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public abstract void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method164(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lma;B)V"
   )
   public final void method165(class148 arg0, byte arg1) {
      try {
         ++field227;
         this.method251(this.method261(arg0, this.method236(arg0.method1350(), arg0.method1354())));
         if (arg1 >= -68) {
            this.method160(86);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field247[18] + (arg0 != null ? field247[3] : field247[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lns;)V"
   )
   public abstract void method166(class382 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "(I)Lza;"
   )
   public abstract class348 method167(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "()Z"
   )
   public abstract boolean method168();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Luv;I)V"
   )
   public abstract void method169(class521 arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lwm;[Liaa;Z)Lda;"
   )
   public abstract class216 method170(class440 arg0, class433[] arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "()V"
   )
   public abstract void method171();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;II)V"
   )
   public final void method172(Rectangle[] arg0, int arg1, int arg2) throws class37 {
      try {
         int var4 = -29 % ((arg1 - -7) / 33);
         this.method206(arg0, arg2, 0, 0);
         ++field239;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field247[13] + (arg0 != null ? field247[3] : field247[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public abstract void method173(int arg0, class684 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "(I)V"
   )
   public abstract void method174(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method175(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "()Lgga;"
   )
   public abstract class502 method176();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIB)V"
   )
   public final void method177(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      try {
         if (arg5 != 31) {
            this.method194((class521)null);
         }

         this.method196(arg2, arg0, arg1, arg4, arg3, 1);
         ++field233;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field247[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "n",
      descriptor = "()V"
   )
   public abstract void method178();

   @OriginalMember(
      owner = "client!ha",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public abstract void method179(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "B",
      descriptor = "()Z"
   )
   public abstract boolean method180();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method181(boolean arg0) {
      try {
         ++field246;
         class303.field4583[this.field241] = false;
         if (arg0) {
            this.method229();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field247[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(II)V"
   )
   public abstract void method182(int arg0, int arg1) throws class37;

   @OriginalMember(
      owner = "client!ha",
      name = "finalize",
      descriptor = "()V"
   )
   protected void finalize() {
      try {
         this.method181(true);
         ++field232;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field247[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "y",
      descriptor = "()Lgga;"
   )
   public abstract class502 method183();

   @OriginalMember(
      owner = "client!ha",
      name = "GA",
      descriptor = "(I)V"
   )
   public abstract void method184(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIBIII)V"
   )
   public final void method186(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
      try {
         this.method257(arg5, arg4, arg0, arg1, arg3, 1);
         ++field237;
         if (arg2 != -11) {
            this.field241 = -109;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field247[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Liaa;Z)Lma;"
   )
   public abstract class148 method187(class433 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "()Z"
   )
   public abstract boolean method188();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public abstract void method189(class348 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "()Z"
   )
   public abstract boolean method190();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method191(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "pa",
      descriptor = "()V"
   )
   public abstract void method192();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "()V"
   )
   public abstract void method193();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Luv;)V"
   )
   public abstract void method194(class521 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(FFF)V"
   )
   public abstract void method195(float arg0, float arg1, float arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public abstract void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "xa",
      descriptor = "(F)V"
   )
   public abstract void method197(float arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method198(int arg0) {
      try {
         if (arg0 != 10258) {
            method198(27);
         }

         field238 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field247[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I[Lpha;)V"
   )
   public abstract void method199(int arg0, class757[] arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method200();

   @OriginalMember(
      owner = "client!ha",
      name = "w",
      descriptor = "()Z"
   )
   public abstract boolean method201();

   @OriginalMember(
      owner = "client!ha",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public abstract int[] method202(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "()I"
   )
   public abstract int method203();

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "(I)V"
   )
   public abstract void method204(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "()Z"
   )
   public abstract boolean method205();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public abstract void method206(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class37;

   @OriginalMember(
      owner = "client!ha",
      name = "o",
      descriptor = "()V"
   )
   public abstract void method207();

   @OriginalMember(
      owner = "client!ha",
      name = "u",
      descriptor = "()Z"
   )
   public abstract boolean method208();

   @OriginalMember(
      owner = "client!ha",
      name = "T",
      descriptor = "(IIII)V"
   )
   public abstract void method209(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "x",
      descriptor = "()V"
   )
   public abstract void method210();

   @OriginalMember(
      owner = "client!ha",
      name = "K",
      descriptor = "([I)V"
   )
   public abstract void method211(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "XA",
      descriptor = "()I"
   )
   public abstract int method212();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II)I"
   )
   public abstract int method214(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[IIII)Lma;"
   )
   public final class148 method215(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
      try {
         ++field243;
         return arg5 != 1 ? null : this.method219(arg2, arg4, arg0, arg1, arg3, true);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field247[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field247[3] : field247[5]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "(II)Lni;"
   )
   public abstract class795 method216(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public abstract void method217(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public abstract void method218(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([IIIIIZ)Lma;"
   )
   public abstract class148 method219(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIF)Lpha;"
   )
   public abstract class757 method220(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "da",
      descriptor = "(III[I)V"
   )
   public abstract void method221(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ld;BLjava/awt/Canvas;Lsa;IIII)Lha;"
   )
   public static final synchronized class17 method222(class672 arg0, byte arg1, Canvas arg2, class39 arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg1 >= -45) {
            return null;
         } else {
            ++field230;
            if (arg6 == 0) {
               return class670.method4858(arg0, arg7, arg2, arg5, 0);
            } else if (~arg6 == -3) {
               return class512.method3858(arg7, arg2, arg0, 0, arg5);
            } else if (arg6 == 1) {
               return class90.method912(arg4, arg2, arg0, (byte)-120);
            } else if (arg6 == 5) {
               return class137.method1388(arg3, arg4, arg2, arg0, (byte)-45);
            } else if (arg6 == 3) {
               return class85.method895(21960, arg4, arg3, arg0, arg2);
            } else {
               throw new IllegalArgumentException(field247[6]);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field247[7] + (arg0 != null ? field247[3] : field247[5]) + ',' + arg1 + ',' + (arg2 != null ? field247[3] : field247[5]) + ',' + (arg3 != null ? field247[3] : field247[5]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public final void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field236;
         this.method226(arg3, arg0, arg1, arg5, arg4, arg2);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field247[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public abstract class684 method224(int arg0, int arg1, int[] arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method145(arg0, arg2, arg4, arg3, 1);
         ++field228;
         if (arg1 != -1732) {
            this.method158((Canvas)null);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field247[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public abstract void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "L",
      descriptor = "(III)V"
   )
   public abstract void method227(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(Z)V"
   )
   public abstract void method228(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "s",
      descriptor = "()V"
   )
   public abstract void method229();

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "()Z"
   )
   public abstract boolean method230();

   @OriginalMember(
      owner = "client!ha",
      name = "la",
      descriptor = "()V"
   )
   public abstract void method231();

   @OriginalMember(
      owner = "client!ha",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public abstract void method232(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIII)V"
   )
   public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 > -64) {
            field238 = null;
         }

         this.method179(arg3, arg4, arg2, arg1, 1);
         ++field231;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field247[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public abstract int method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "F",
      descriptor = "(II)V"
   )
   public abstract void method235(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(II)Ljj;"
   )
   public abstract class334 method236(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "()Z"
   )
   public abstract boolean method237();

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(II)V"
   )
   public abstract void method238(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method239(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Leca;IIII)Lka;"
   )
   public abstract class761 method240(class590 arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public abstract void method241(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "()Z"
   )
   public abstract boolean method242();

   @OriginalMember(
      owner = "client!ha",
      name = "t",
      descriptor = "()Z"
   )
   public abstract boolean method243();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public abstract void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public abstract class751 method245(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(II)I"
   )
   public abstract int method246(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIZ)Lma;"
   )
   public abstract class148 method247(int arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "H",
      descriptor = "(III[I)V"
   )
   public abstract void method248(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "<init>",
      descriptor = "(Ld;)V"
   )
   public class17(class672 arg0) {
      boolean var2 = client.field10022;
      super();

      try {
         this.field240 = arg0;
         int var3 = -1;
         int var4 = 0;
         int var10000;
         if (var2) {
            var10000 = class303.field4583[var4];
         } else if (~var4 <= -9) {
            var10000 = var3;
            if (!var2) {
               if (var3 == -1) {
                  throw new IllegalStateException(field247[9]);
               }

               this.field241 = var3;
               return;
            }
         } else {
            var10000 = class303.field4583[var4];
         }

         do {
            while(true) {
               if (var10000 == 0) {
                  var3 = var4;
                  class303.field4583[var4] = true;
                  if (!var2) {
                     var10000 = var4;
                     break;
                  }

                  ++var4;
               } else {
                  ++var4;
               }

               if (~var4 <= -9) {
                  var10000 = var3;
                  if (!var2) {
                     if (var3 == -1) {
                        throw new IllegalStateException(field247[9]);
                     }

                     this.field241 = var3;
                     return;
                  }
               } else {
                  var10000 = class303.field4583[var4];
               }
            }
         } while(var2);

         if (var4 == -1) {
            throw new IllegalStateException(field247[9]);
         } else {
            this.field241 = var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field247[8] + (arg0 != null ? field247[3] : field247[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "p",
      descriptor = "()Z"
   )
   public abstract boolean method249();

   @OriginalMember(
      owner = "client!ha",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public abstract void method250(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lbh;)V"
   )
   public abstract void method251(class758 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method252(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IBIII)V"
   )
   public final void method253(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         this.method218(arg0, arg3, arg4, arg2, 1);
         if (arg1 != -109) {
            this.method171();
         }

         ++field235;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field247[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "()Lgga;"
   )
   public abstract class502 method254();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public abstract void method255(class502 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public abstract void method256(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   public abstract void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public abstract void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public abstract int method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "()Z"
   )
   public abstract boolean method260();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lni;Ljj;)Lbh;"
   )
   public abstract class758 method261(class795 arg0, class334 arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "C",
      descriptor = "(Z)V"
   )
   public abstract void method262(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method263(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method264(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method265(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
