import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class62 {
   @OriginalMember(
      owner = "client!mk",
      name = "j",
      descriptor = "I"
   )
   private int field762;
   @OriginalMember(
      owner = "client!mk",
      name = "l",
      descriptor = "I"
   )
   private int field758;
   @OriginalMember(
      owner = "client!mk",
      name = "g",
      descriptor = "I"
   )
   private int field753;
   @OriginalMember(
      owner = "client!mk",
      name = "h",
      descriptor = "I"
   )
   private int field760;
   @OriginalMember(
      owner = "client!mk",
      name = "o",
      descriptor = "I"
   )
   public int field763;
   @OriginalMember(
      owner = "client!mk",
      name = "d",
      descriptor = "I"
   )
   public int field759;
   @OriginalMember(
      owner = "client!mk",
      name = "f",
      descriptor = "I"
   )
   public int field755;
   @OriginalMember(
      owner = "client!mk",
      name = "e",
      descriptor = "I"
   )
   public int field756;
   @OriginalMember(
      owner = "client!mk",
      name = "c",
      descriptor = "I"
   )
   public int field751;
   @OriginalMember(
      owner = "client!mk",
      name = "m",
      descriptor = "I"
   )
   public int field752;
   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field765 = new String[]{method477(method476(":J$n29H~ls")), method477(method476(":J$\u0013s")), method477(method476(":J$\u0016s")), method477(method476(":J$\u0010s")), method477(method476(":J$\u0011s"))};
   @OriginalMember(
      owner = "client!mk",
      name = "k",
      descriptor = "Llg;"
   )
   public static class437 field761 = new class437();
   @OriginalMember(
      owner = "client!mk",
      name = "n",
      descriptor = "Leg;"
   )
   public static class118 field764 = new class118(19, 16);
   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "I"
   )
   public static int field750;
   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "I"
   )
   public static int field754;
   @OriginalMember(
      owner = "client!mk",
      name = "i",
      descriptor = "I"
   )
   public static int field757;

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method472(int arg0) {
      try {
         field764 = null;
         if (arg0 < -26) {
            field761 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field765[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method473(byte arg0) {
      boolean var1 = client.field4360;

      try {
         label37: {
            ++field754;
            int var2 = -97 / ((-13 - arg0) / 42);
            if (!class787.method5675(class622.field9156, -51) && !class426.method3155(true, class622.field9156)) {
               int var3 = class564.field8045.field3888[0] >> 3;
               int var4 = class564.field8045.field3884[0] >> 3;
               if (var3 < 0 || ~(class644.field9403 >> 3) >= ~var3 || ~var4 > -1 || var4 >= class337.field4594 >> 3) {
                  class589.method4288(class644.field9403 >> 4, 0, (byte)1, class337.field4594 >> 4);
                  if (!var1) {
                     break label37;
                  }
               }

               class589.method4288(var3, 5000, (byte)54, var4);
               if (!var1) {
                  break label37;
               }
            }

            class589.method4288(class224.field3188 >> 12, 5000, (byte)102, class782.field11465 >> 12);
         }

         class397.method2998((byte)-115);
         class229.method1785((byte)46);
         class318.method2331((byte)83);
         class401.method3029(-99);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field765[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(IIIIIIIIIII)V"
   )
   public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      try {
         int var12 = -117 / ((43 - arg9) / 46);
         this.field758 = arg7 * arg7;
         this.field760 = arg8;
         this.field753 = arg1;
         this.field762 = arg2;
         ++field750;
         this.field756 = this.field762 + arg10;
         this.field759 = this.field760 + arg6;
         this.field763 = this.field753 + arg3;
         this.field755 = this.field760 + arg5;
         this.field751 = this.field753 + arg4;
         this.field752 = this.field762 - -arg0;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field765[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method475(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field757;
         if (~this.field751 >= ~arg2 && arg2 <= this.field763) {
            if (arg0 >= this.field755 && this.field759 >= arg0) {
               if (arg1 != -900129020) {
                  this.method474(-13, 70, -54, 97, 81, -56, -16, -111, -44, 98, -20);
               }

               if (~this.field752 >= ~arg3 && ~this.field756 <= ~arg3) {
                  int var5 = -this.field753 + arg2;
                  int var6 = -this.field762 + arg3;
                  return this.field758 > var5 * var5 - -(var6 * var6);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field765[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         this.field762 = arg2;
         this.field758 = arg3 * arg3;
         this.field753 = arg0;
         this.field760 = arg1;
         this.field763 = this.field753 + arg5;
         this.field759 = this.field760 + arg7;
         this.field755 = this.field760 - -arg6;
         this.field756 = this.field762 - -arg9;
         this.field751 = this.field753 + arg4;
         this.field752 = this.field762 + arg8;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field765[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method476(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method477(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
