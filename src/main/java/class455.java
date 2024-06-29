import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class455 {
   @OriginalMember(
      owner = "client!st",
      name = "f",
      descriptor = "Lgw;"
   )
   private class179 field6648 = new class179(64);
   @OriginalMember(
      owner = "client!st",
      name = "i",
      descriptor = "Lgw;"
   )
   public class179 field6652 = new class179(60);
   @OriginalMember(
      owner = "client!st",
      name = "o",
      descriptor = "Lhw;"
   )
   public class141 field6643;
   @OriginalMember(
      owner = "client!st",
      name = "n",
      descriptor = "Lhw;"
   )
   private class141 field6644;
   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6654 = new String[]{method3427(method3426("\u001a\\)E\u0018")), method3427(method3426("\u001a\\)@\u0018")), method3427(method3426("\u001a\\)G\u0018")), method3427(method3426("\u001a\\)C\u0018")), method3427(method3426("\u001a\\)D\u0018")), method3427(method3426("\u001a\\)F\u0018")), method3427(method3426("\u001a\\)A\u0018")), method3427(method3426("\u001a\\)>Y\u0007As<\u0018")), method3427(method3426("\u0012\u0006),M")), method3427(method3426("\u0007]kn"))};
   @OriginalMember(
      owner = "client!st",
      name = "l",
      descriptor = "[Z"
   )
   public static boolean[] field6640 = new boolean[100];
   @OriginalMember(
      owner = "client!st",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field6650 = false;
   @OriginalMember(
      owner = "client!st",
      name = "k",
      descriptor = "I"
   )
   public static int field6639;
   @OriginalMember(
      owner = "client!st",
      name = "m",
      descriptor = "I"
   )
   public static int field6641;
   @OriginalMember(
      owner = "client!st",
      name = "h",
      descriptor = "I"
   )
   public static int field6642;
   @OriginalMember(
      owner = "client!st",
      name = "c",
      descriptor = "I"
   )
   public static int field6645;
   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "I"
   )
   public static int field6649;
   @OriginalMember(
      owner = "client!st",
      name = "e",
      descriptor = "I"
   )
   public static int field6651;
   @OriginalMember(
      owner = "client!st",
      name = "j",
      descriptor = "I"
   )
   public int field6653;
   @OriginalMember(
      owner = "client!st",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field6646;
   @OriginalMember(
      owner = "client!st",
      name = "b",
      descriptor = "[Ls;"
   )
   public static class293[] field6647;

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3419(byte arg0) {
      try {
         if (arg0 > 116) {
            ++field6651;
            class179 var2 = this.field6648;
            synchronized(this.field6648) {
               this.field6648.method1591((byte)58);
            }

            class179 var3 = this.field6652;
            synchronized(this.field6652) {
               this.field6652.method1591((byte)58);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6654[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3420(byte arg0) {
      try {
         int var2 = 99 % ((58 - arg0) / 45);
         ++field6642;
         class179 var3 = this.field6648;
         synchronized(this.field6648) {
            this.field6648.method1589((byte)117);
         }

         class179 var4 = this.field6652;
         synchronized(this.field6652) {
            this.field6652.method1589((byte)41);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6654[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3421(int arg0) {
      try {
         field6647 = null;
         if (arg0 == 45056) {
            field6640 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6654[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3422(int arg0, int arg1, int arg2) {
      try {
         if (arg0 < 61) {
            field6647 = null;
         }

         ++field6639;
         if (!class416.method3178(arg2, -1, arg1)) {
            return false;
         } else {
            return class90.method888(arg1, 42, arg2) | (arg1 & 45056) != 0 | class192.method1676(arg1, false, arg2) ? true : (class450.method3392((byte)-61, arg1, arg2) | class528.method3956(arg2, -26287, arg1)) & ~(arg2 & 55) == -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6654[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(IB)Ljga;"
   )
   public final class745 method3423(int arg0, byte arg1) {
      try {
         ++field6645;
         class179 var3 = this.field6648;
         class745 var4;
         synchronized(this.field6648) {
            if (arg1 >= -5) {
               method3422(90, 92, -23);
            }

            var4 = (class745)this.field6648.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field6644;
            byte[] var6;
            synchronized(this.field6644) {
               var6 = this.field6644.method1347((byte)125, class696.method5055(arg0, (byte)-42), class395.method3052(arg0, -7));
            }

            class745 var7 = new class745();
            var7.field10743 = this;
            var7.field10742 = arg0;
            if (var6 != null) {
               var7.method5412(new class473(var6), (byte)-44);
            }

            class179 var8 = this.field6648;
            synchronized(this.field6648) {
               this.field6648.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field6654[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method3424(boolean arg0, int arg1) {
      try {
         ++field6649;
         this.field6653 = arg1;
         class179 var3 = this.field6652;
         synchronized(this.field6652) {
            this.field6652.method1589((byte)80);
         }

         if (!arg0) {
            this.field6643 = null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6654[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3425(int arg0, int arg1) {
      try {
         ++field6641;
         if (arg1 != 0) {
            method3421(-14);
         }

         class179 var3 = this.field6648;
         synchronized(this.field6648) {
            this.field6648.method1579(87, arg0);
         }

         class179 var4 = this.field6652;
         synchronized(this.field6652) {
            this.field6652.method1579(125, arg0);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6654[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lhw;)V"
   )
   public class455(class320 arg0, int arg1, class141 arg2, class141 arg3) {
      try {
         this.field6643 = arg3;
         this.field6644 = arg2;
         int var5 = this.field6644.method1337((byte)108) - 1;
         this.field6644.method1346(var5, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6654[7] + (arg0 != null ? field6654[8] : field6654[9]) + ',' + arg1 + ',' + (arg2 != null ? field6654[8] : field6654[9]) + ',' + (arg3 != null ? field6654[8] : field6654[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3426(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3427(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
