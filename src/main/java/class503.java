import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class503 {
   @OriginalMember(
      owner = "client!eu",
      name = "i",
      descriptor = "Lgw;"
   )
   private class179 field7327 = new class179(64);
   @OriginalMember(
      owner = "client!eu",
      name = "m",
      descriptor = "Lgw;"
   )
   private class179 field7333 = new class179(100);
   @OriginalMember(
      owner = "client!eu",
      name = "k",
      descriptor = "Lhw;"
   )
   private class141 field7332;
   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7336 = new String[]{method3785(method3784("Pfw1!")), method3785(method3784("N=w]t")), method3785(method3784("PfwO`[z-M!")), method3785(method3784("[f5\u001f")), method3785(method3784("Pfw4!")), method3785(method3784("Pfw2!")), method3785(method3784("Pfw6!")), method3785(method3784("Pfw7!")), method3785(method3784("Pfw;!")), method3785(method3784("Pfw5!")), method3785(method3784("Pfw0!"))};
   @OriginalMember(
      owner = "client!eu",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field7323 = new float[16];
   @OriginalMember(
      owner = "client!eu",
      name = "l",
      descriptor = "Lgh;"
   )
   public static class572 field7331 = new class572(18, 8);
   @OriginalMember(
      owner = "client!eu",
      name = "h",
      descriptor = "Lfk;"
   )
   public static class678 field7334 = new class678();
   @OriginalMember(
      owner = "client!eu",
      name = "o",
      descriptor = "[Lkd;"
   )
   public static class295[] field7335 = new class295[14];
   @OriginalMember(
      owner = "client!eu",
      name = "f",
      descriptor = "I"
   )
   public static int field7321;
   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "I"
   )
   public static int field7322;
   @OriginalMember(
      owner = "client!eu",
      name = "d",
      descriptor = "I"
   )
   public static int field7325;
   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "I"
   )
   public static int field7326;
   @OriginalMember(
      owner = "client!eu",
      name = "g",
      descriptor = "I"
   )
   public static int field7328;
   @OriginalMember(
      owner = "client!eu",
      name = "n",
      descriptor = "I"
   )
   public static int field7329;
   @OriginalMember(
      owner = "client!eu",
      name = "j",
      descriptor = "I"
   )
   public static int field7330;
   @OriginalMember(
      owner = "client!eu",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field7324;

   @OriginalMember(
      owner = "client!eu",
      name = "c",
      descriptor = "(II)Lhca;",
      line = 7
   )
   public final class513 method3776(int arg0, int arg1) {
      try {
         ++field7328;
         if (arg1 != 18) {
            this.method3783(92, 94);
         }

         class179 var3 = this.field7333;
         synchronized(this.field7333) {
            class513 var4 = (class513)this.field7333.method1584((long)arg0, 1);
            if (var4 == null) {
               var4 = new class513(arg0);
               this.field7333.method1581((long)arg0, 0, var4);
            }

            return !var4.method3882(arg1 + -18) ? null : var4;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field7336[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "d",
      descriptor = "(II)V",
      line = 33
   )
   public static final void method3777(int arg0, int arg1) {
      try {
         if (arg1 != 32129) {
            method3778(14);
         }

         ++field7322;
         if (class352.method2708(78)) {
            if (class733.field10535 != arg0) {
               class154.field2452 = "";
            }

            class733.field10535 = arg0;
            if (class361.field5404 != null) {
               class361.field5404.method2045(907867169);
               class361.field5404 = null;
            }

            class645.method4735(5, -106);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7336[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(I)V",
      line = 57
   )
   public static void method3778(int arg0) {
      try {
         if (arg0 != 2) {
            field7331 = null;
         }

         field7331 = null;
         field7324 = null;
         field7334 = null;
         field7335 = null;
         field7323 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7336[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(B)V",
      line = 73
   )
   public final void method3779(byte arg0) {
      try {
         ++field7330;
         if (arg0 == -34) {
            class179 var2 = this.field7327;
            synchronized(this.field7327) {
               this.field7327.method1589((byte)115);
            }

            class179 var3 = this.field7333;
            synchronized(this.field7333) {
               this.field7333.method1589((byte)96);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7336[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "(I)V",
      line = 90
   )
   public final void method3780(int arg0) {
      try {
         ++field7321;
         class179 var2 = this.field7327;
         synchronized(this.field7327) {
            this.field7327.method1591((byte)58);
         }

         if (arg0 != 14) {
            this.method3783(-74, -59);
         }

         class179 var3 = this.field7333;
         synchronized(this.field7333) {
            this.field7333.method1591((byte)58);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7336[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "e",
      descriptor = "(II)Lkd;",
      line = 108
   )
   public final class295 method3781(int arg0, int arg1) {
      try {
         ++field7329;
         class179 var3 = this.field7327;
         class295 var4;
         synchronized(this.field7327) {
            var4 = (class295)this.field7327.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else if (arg0 != 5) {
            return null;
         } else {
            class141 var5 = this.field7332;
            byte[] var6;
            synchronized(this.field7332) {
               var6 = this.field7332.method1347((byte)127, class244.method1983(false, arg1), class147.method1381(arg1, 100));
            }

            class295 var7 = new class295();
            var7.field4130 = arg1;
            var7.field4110 = this;
            if (var6 != null) {
               var7.method2306(0, new class473(var6));
            }

            var7.method2302((byte)-80);
            class179 var8 = this.field7327;
            synchronized(this.field7327) {
               this.field7327.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field7336[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(II)V",
      line = 142
   )
   public static final void method3782(int arg0, int arg1) {
      try {
         ++field7325;
         class743.field10700 = 2;
         class475.field6939 = arg0;
         class672.method4915("", (byte)-119, class154.field2452.equals(""), true, class154.field2452);
         if (arg1 != 8) {
            field7331 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7336[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "(II)V",
      line = 159
   )
   public final void method3783(int arg0, int arg1) {
      try {
         class179 var3 = this.field7327;
         synchronized(this.field7327) {
            this.field7327.method1579(-84, arg0);
         }

         ++field7326;
         class179 var4 = this.field7333;
         synchronized(this.field7333) {
            if (arg1 != 18) {
               method3782(49, -39);
            }

            this.field7333.method1579(arg1 + 78, arg0);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7336[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lhw;Lhw;)V",
      line = 193
   )
   public class503(class320 arg0, int arg1, class141 arg2, class141 arg3, class141 arg4) {
      try {
         this.field7332 = arg2;
         if (this.field7332 != null) {
            int var6 = this.field7332.method1337((byte)122) + -1;
            this.field7332.method1346(var6, 0);
         }

         class48.method583(arg3, 2, 10542, arg4);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7336[2] + (arg0 != null ? field7336[1] : field7336[3]) + ',' + arg1 + ',' + (arg2 != null ? field7336[1] : field7336[3]) + ',' + (arg3 != null ? field7336[1] : field7336[3]) + ',' + (arg4 != null ? field7336[1] : field7336[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3784(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3785(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
