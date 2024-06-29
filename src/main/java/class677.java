import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class677 {
   @OriginalMember(
      owner = "client!og",
      name = "l",
      descriptor = "Lvk;"
   )
   public class390 field9801 = new class390();
   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9814 = new String[]{method4928(method4927("f9IfT")), method4928(method4927("f9I\u0013\u0015g7\u0013\u0011T")), method4928(method4927("rpI\u0001\u0001")), method4928(method4927("g+\u000bC")), method4928(method4927("f9ImT")), method4928(method4927("f9IlT")), method4928(method4927("f9IiT")), method4928(method4927("f9IkT")), method4928(method4927("f9IjT")), method4928(method4927("f9IgT")), method4928(method4927("f9IhT")), method4928(method4927("f9InT"))};
   @OriginalMember(
      owner = "client!og",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field9803 = false;
   @OriginalMember(
      owner = "client!og",
      name = "f",
      descriptor = "Lek;"
   )
   public static class536 field9812 = new class536(15, 2);
   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "I"
   )
   public static int field9799;
   @OriginalMember(
      owner = "client!og",
      name = "j",
      descriptor = "I"
   )
   public static int field9800;
   @OriginalMember(
      owner = "client!og",
      name = "c",
      descriptor = "I"
   )
   public static int field9802;
   @OriginalMember(
      owner = "client!og",
      name = "b",
      descriptor = "I"
   )
   public static int field9806;
   @OriginalMember(
      owner = "client!og",
      name = "o",
      descriptor = "I"
   )
   public static int field9807;
   @OriginalMember(
      owner = "client!og",
      name = "i",
      descriptor = "I"
   )
   public static int field9808;
   @OriginalMember(
      owner = "client!og",
      name = "k",
      descriptor = "I"
   )
   public static int field9809;
   @OriginalMember(
      owner = "client!og",
      name = "d",
      descriptor = "I"
   )
   public static int field9810;
   @OriginalMember(
      owner = "client!og",
      name = "n",
      descriptor = "I"
   )
   public static int field9811;
   @OriginalMember(
      owner = "client!og",
      name = "g",
      descriptor = "Lvk;"
   )
   private class390 field9805;
   @OriginalMember(
      owner = "client!og",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field9813;
   @OriginalMember(
      owner = "client!og",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9804;

   @OriginalMember(
      owner = "client!og",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public static void method4918(int arg0) {
      try {
         field9812 = null;
         field9813 = null;
         if (arg0 != 27784) {
            method4926((byte[])null, 23);
         }

         field9804 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9814[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "d",
      descriptor = "(I)I",
      line = 19
   )
   public final int method4919(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field9806;
         int var3 = 0;
         if (arg0 != -25971) {
            this.method4921(-44);
         }

         class390 var4 = this.field9801.field5653;
         if (var2) {
            var4 = var4.field5653;
            ++var3;
         }

         while(true) {
            while(this.field9801 != var4) {
               var4 = var4.field5653;
               ++var3;
            }

            if (!var2) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9814[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(IILgt;I)V",
      line = 42
   )
   public static final void method4920(int arg0, int arg1, class483 arg2, int arg3) {
      try {
         if (arg1 != 0) {
            field9803 = true;
         }

         ++field9800;
         class342.field4643[arg0][arg3] = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9814[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9814[2] : field9814[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "<init>",
      descriptor = "()V",
      line = 182
   )
   public class677() {
      try {
         this.field9801.field5658 = this.field9801;
         this.field9801.field5653 = this.field9801;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9814[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(I)Lvk;",
      line = 61
   )
   public final class390 method4921(int arg0) {
      try {
         ++field9808;
         if (arg0 != 0) {
            method4926((byte[])null, -92);
         }

         class390 var2 = this.field9801.field5653;
         if (this.field9801 == var2) {
            this.field9805 = null;
            return null;
         } else {
            this.field9805 = var2.field5653;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9814[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(ILvk;)V",
      line = 85
   )
   public final void method4922(int arg0, class390 arg1) {
      try {
         if (arg1.field5658 != null) {
            arg1.method2967(-92);
         }

         ++field9807;
         arg1.field5653 = this.field9801;
         arg1.field5658 = this.field9801.field5658;
         arg1.field5658.field5653 = arg1;
         if (arg0 != 15) {
            field9799 = 57;
         }

         arg1.field5653.field5658 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9814[7] + arg0 + ',' + (arg1 != null ? field9814[2] : field9814[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "b",
      descriptor = "(I)Lvk;",
      line = 106
   )
   public final class390 method4923(int arg0) {
      try {
         ++field9810;
         class390 var2 = this.field9805;
         if (this.field9801 == var2) {
            this.field9805 = null;
            return null;
         } else {
            this.field9805 = var2.field5653;
            if (arg0 != -23743) {
               field9813 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9814[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(B)V",
      line = 128
   )
   public final void method4924(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field9811;

         while(true) {
            class390 var3 = this.field9801.field5653;
            if (this.field9801 != var3) {
               var3.method2967(-123);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            if (arg0 >= -14) {
               return;
            }

            this.field9805 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9814[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(ZI)I",
      line = 150
   )
   public static final int method4925(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            method4920(-68, -94, (class483)null, 15);
         }

         ++field9809;
         return arg1 & 255;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9814[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "([BI)[B",
      line = 167
   )
   public static final byte[] method4926(byte[] arg0, int arg1) {
      try {
         ++field9802;
         if (arg1 < 83) {
            field9813 = null;
         }

         int var2 = arg0.length;
         byte[] var3 = new byte[var2];
         class242.method1848(arg0, 0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9814[4] + (arg0 != null ? field9814[2] : field9814[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4927(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4928(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
