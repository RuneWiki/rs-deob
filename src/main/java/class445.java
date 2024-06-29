import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class445 {
   @OriginalMember(
      owner = "client!hea",
      name = "k",
      descriptor = "Ldw;"
   )
   private class748 field6760 = new class748(64);
   @OriginalMember(
      owner = "client!hea",
      name = "b",
      descriptor = "Ldw;"
   )
   public class748 field6770 = new class748(50);
   @OriginalMember(
      owner = "client!hea",
      name = "h",
      descriptor = "Ldw;"
   )
   public class748 field6774 = new class748(5);
   @OriginalMember(
      owner = "client!hea",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field6768;
   @OriginalMember(
      owner = "client!hea",
      name = "e",
      descriptor = "Lqo;"
   )
   public class24 field6765;
   @OriginalMember(
      owner = "client!hea",
      name = "l",
      descriptor = "Leaa;"
   )
   public class526 field6758;
   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "Z"
   )
   public boolean field6762;
   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6776 = new String[]{method3368(method3367("Zmp\u0013d\u001a")), method3368(method3367("Zmp\u0013f\u001a")), method3368(method3367("Zmp\u0013c\u001a")), method3368(method3367("Zmp\u0013e\u001a")), method3368(method3367("Zmp\u0013a\u001a")), method3368(method3367("Zmp\u0013`\u001a")), method3368(method3367("\\}}Q")), method3368(method3367("I&?\u0013_")), method3368(method3367("Zmp\u0013\u001e[fxI\u001c\u001a")), method3368(method3367("Zmp\u0013g\u001a"))};
   @OriginalMember(
      owner = "client!hea",
      name = "j",
      descriptor = "I"
   )
   public static int field6759 = -1;
   @OriginalMember(
      owner = "client!hea",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field6769 = false;
   @OriginalMember(
      owner = "client!hea",
      name = "p",
      descriptor = "I"
   )
   public static int field6773 = 0;
   @OriginalMember(
      owner = "client!hea",
      name = "n",
      descriptor = "I"
   )
   public static int field6761;
   @OriginalMember(
      owner = "client!hea",
      name = "f",
      descriptor = "I"
   )
   public static int field6763;
   @OriginalMember(
      owner = "client!hea",
      name = "c",
      descriptor = "I"
   )
   public static int field6764;
   @OriginalMember(
      owner = "client!hea",
      name = "o",
      descriptor = "I"
   )
   public static int field6766;
   @OriginalMember(
      owner = "client!hea",
      name = "d",
      descriptor = "I"
   )
   public static int field6767;
   @OriginalMember(
      owner = "client!hea",
      name = "m",
      descriptor = "I"
   )
   public static int field6771;
   @OriginalMember(
      owner = "client!hea",
      name = "r",
      descriptor = "I"
   )
   public static int field6772;
   @OriginalMember(
      owner = "client!hea",
      name = "q",
      descriptor = "I"
   )
   public int field6775;

   @OriginalMember(
      owner = "client!hea",
      name = "b",
      descriptor = "(I)V",
      line = 5
   )
   public final void method3360(int arg0) {
      try {
         ++field6771;
         class748 var2 = this.field6760;
         synchronized(this.field6760) {
            this.field6760.method5445(arg0 + 697439700);
         }

         if (arg0 != 25726) {
            field6759 = -46;
         }

         class748 var3 = this.field6770;
         synchronized(this.field6770) {
            this.field6770.method5445(697465426);
         }

         class748 var4 = this.field6774;
         synchronized(this.field6774) {
            this.field6774.method5445(697465426);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6776[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(I)V",
      line = 31
   )
   public final void method3361(int arg0) {
      try {
         ++field6763;
         class748 var2 = this.field6760;
         synchronized(this.field6760) {
            this.field6760.method5451(-115);
         }

         class748 var3 = this.field6770;
         synchronized(this.field6770) {
            this.field6770.method5451(arg0 + 52);
            if (arg0 != 64) {
               this.field6762 = false;
            }
         }

         class748 var4 = this.field6774;
         synchronized(this.field6774) {
            this.field6774.method5451(56);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6776[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(II)V",
      line = 50
   )
   public final void method3362(int arg0, int arg1) {
      try {
         if (arg1 == 29221) {
            this.field6775 = arg0;
            ++field6766;
            class748 var3 = this.field6770;
            synchronized(this.field6770) {
               this.field6770.method5451(arg1 ^ -29277);
            }

            class748 var4 = this.field6774;
            synchronized(this.field6774) {
               this.field6774.method5451(arg1 ^ -29274);
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6776[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(IZ)Lrq;",
      line = 67
   )
   public final class369 method3363(int arg0, boolean arg1) {
      try {
         if (arg1) {
            this.method3362(-42, 83);
         }

         ++field6767;
         class748 var3 = this.field6760;
         class369 var4;
         synchronized(this.field6760) {
            var4 = (class369)this.field6760.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field6768;
            byte[] var6;
            synchronized(this.field6768) {
               var6 = this.field6768.method3899(-60, class788.method5657(arg0, 20274), class102.method889(arg0, (byte)55));
            }

            class369 var7 = new class369();
            var7.field5594 = arg0;
            var7.field5611 = this;
            if (var6 != null) {
               var7.method2866(new class128(var6), 24776);
            }

            var7.method2867(-1);
            class748 var8 = this.field6760;
            synchronized(this.field6760) {
               this.field6760.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6776[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(B)V",
      line = 110
   )
   public final void method3364(byte arg0) {
      try {
         ++field6761;
         class748 var2 = this.field6770;
         synchronized(this.field6770) {
            this.field6770.method5451(25);
         }

         class748 var3 = this.field6774;
         synchronized(this.field6774) {
            if (arg0 != 83) {
               this.field6768 = null;
            }

            this.field6774.method5451(-118);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6776[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "<init>",
      descriptor = "(Lqo;IZLeaa;Leaa;)V",
      line = 181
   )
   public class445(class24 arg0, int arg1, boolean arg2, class526 arg3, class526 arg4) {
      try {
         this.field6768 = arg3;
         this.field6765 = arg0;
         this.field6758 = arg4;
         this.field6762 = arg2;
         if (this.field6768 != null) {
            int var6 = this.field6768.method3903((byte)124) + -1;
            this.field6768.method3875(0, var6);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6776[8] + (arg0 != null ? field6776[7] : field6776[6]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6776[7] : field6776[6]) + ',' + (arg4 != null ? field6776[7] : field6776[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(IB)V",
      line = 136
   )
   public final void method3365(int arg0, byte arg1) {
      try {
         if (arg1 > -27) {
            this.method3366(true, 103);
         }

         class748 var3 = this.field6760;
         synchronized(this.field6760) {
            this.field6760.method5453(arg0, false);
         }

         ++field6764;
         class748 var4 = this.field6770;
         synchronized(this.field6770) {
            this.field6770.method5453(arg0, false);
         }

         class748 var5 = this.field6774;
         synchronized(this.field6774) {
            this.field6774.method5453(arg0, false);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field6776[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(ZI)V",
      line = 156
   )
   public final void method3366(boolean arg0, int arg1) {
      try {
         ++field6772;
         if (!arg0 == this.field6762) {
            this.field6762 = arg0;
            if (arg1 != 5) {
               this.method3363(45, true);
            }

            this.method3361(64);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6776[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3367(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3368(char[] arg0) {
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
            var10005 = 8;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
