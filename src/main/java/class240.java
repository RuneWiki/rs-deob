import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class240 {
   @OriginalMember(
      owner = "client!jd",
      name = "h",
      descriptor = "Z"
   )
   public boolean field3478;
   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3482 = new String[]{method1966(method1965("\u007f\u007f`0J")), method1966(method1965("\u007f\u007f`N\u000b{r:LJ")), method1966(method1965("\u007f\u007f`7J")), method1966(method1965("{n\"\u001e")), method1966(method1965("n5`\\\u001f")), method1966(method1965("\u007f\u007f`1J")), method1966(method1965("\u007f\u007f`6J")), method1966(method1965("\u007f\u007f`3J"))};
   @OriginalMember(
      owner = "client!jd",
      name = "f",
      descriptor = "Luw;"
   )
   public static class435 field3481 = new class435(91, -1);
   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "I"
   )
   public static int field3474;
   @OriginalMember(
      owner = "client!jd",
      name = "c",
      descriptor = "I"
   )
   public static int field3475;
   @OriginalMember(
      owner = "client!jd",
      name = "i",
      descriptor = "I"
   )
   public static int field3476;
   @OriginalMember(
      owner = "client!jd",
      name = "d",
      descriptor = "I"
   )
   public static int field3477;
   @OriginalMember(
      owner = "client!jd",
      name = "g",
      descriptor = "Lsd;"
   )
   public class102 field3473;
   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "Lsd;"
   )
   public class102 field3480;
   @OriginalMember(
      owner = "client!jd",
      name = "e",
      descriptor = "Z"
   )
   public boolean field3479;

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(II)Lou;",
      line = 6
   )
   public static final class629 method1960(int arg0, int arg1) {
      try {
         ++field3475;
         if (arg1 != -31) {
            field3481 = null;
         }

         if (arg0 != 0) {
            if (~arg0 == -2) {
               return new class34();
            }

            if (~arg0 == -3) {
               return new class512();
            }

            if (~arg0 == -4) {
               return new class260();
            }

            if (~arg0 == -5) {
               return new class93();
            }

            if (~arg0 == -6) {
               return new class33();
            }

            if (arg0 == 6) {
               return new class355();
            }

            if (~arg0 == -8) {
               return new class395();
            }

            if (~arg0 == -9) {
               return new class114();
            }

            if (~arg0 == -10) {
               return new class220();
            }

            if (arg0 == 10) {
               return new class267();
            }

            if (~arg0 == -12) {
               return new class138();
            }

            if (~arg0 == -13) {
               return new class685();
            }

            if (~arg0 == -14) {
               return new class6();
            }

            if (arg0 == 14) {
               return new class128();
            }

            if (arg0 == 15) {
               return new class475();
            }

            if (~arg0 == -17) {
               return new class334();
            }

            if (~arg0 == -18) {
               return new class493();
            }

            if (~arg0 == -19) {
               return new class735();
            }

            if (arg0 == 19) {
               return new class770();
            }

            if (arg0 == 20) {
               return new class45();
            }

            if (arg0 == 21) {
               return new class188();
            }

            if (arg0 == 22) {
               return new class463();
            }

            if (arg0 == 23) {
               return new class611();
            }

            if (arg0 == 24) {
               return new class68();
            }

            if (arg0 == 25) {
               return new class197();
            }

            if (~arg0 == -27) {
               return new class409();
            }

            if (~arg0 == -28) {
               return new class577();
            }

            if (~arg0 == -29) {
               return new class273();
            }

            if (~arg0 == -30) {
               return new class692();
            }

            if (~arg0 == -31) {
               return new class245();
            }

            if (~arg0 == -32) {
               return new class585();
            }

            if (arg0 == 32) {
               return new class505();
            }

            if (~arg0 == -34) {
               return new class524();
            }

            if (~arg0 == -35) {
               return new class573();
            }

            if (arg0 == 35) {
               return new class164();
            }

            if (~arg0 == -37) {
               return new class464();
            }

            if (arg0 == 37) {
               return new class597();
            }

            if (~arg0 == -39) {
               return new class96();
            }

            if (arg0 != 39) {
               return null;
            }

            if (!client.field4564) {
               return new class238();
            }
         }

         return new class361();
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3482[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "(B)V",
      line = 328
   )
   public static void method1961(byte arg0) {
      try {
         field3481 = null;
         if (arg0 != 127) {
            field3481 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3482[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(B)V",
      line = 338
   )
   public final void method1962(byte arg0) {
      try {
         if (this.field3473 != null) {
            this.field3473.method574(arg0 ^ -29150);
         }

         ++field3474;
         this.field3479 = false;
         if (arg0 != -75) {
            this.method1964(true);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3482[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(BLjava/awt/Canvas;)V",
      line = 357
   )
   public static final void method1963(byte arg0, Canvas arg1) {
      try {
         if (arg0 >= -97) {
            method1961((byte)19);
         }

         ++field3476;
         Dimension var2 = arg1.getSize();
         class213.method1813(var2.width, var2.height, 32493);
         if (class402.field5939 != 1) {
            class393.field5787.method336(arg1, class82.field1382, class634.field9251);
         } else {
            class393.field5787.method336(arg1, class220.field3311, class31.field473);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3482[2] + arg0 + ',' + (arg1 != null ? field3482[4] : field3482[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(Z)Z",
      line = 376
   )
   public final boolean method1964(boolean arg0) {
      try {
         if (arg0) {
            this.field3480 = null;
         }

         ++field3477;
         return this.field3479 && !this.field3478;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3482[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "<init>",
      descriptor = "(Z)V",
      line = 388
   )
   public class240(boolean arg0) {
      try {
         this.field3478 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3482[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1965(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1966(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
