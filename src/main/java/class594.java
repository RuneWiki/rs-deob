import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class594 {
   @OriginalMember(
      owner = "client!qi",
      name = "l",
      descriptor = "[I"
   )
   private int[] field8725;
   @OriginalMember(
      owner = "client!qi",
      name = "g",
      descriptor = "[I"
   )
   private int[] field8735;
   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8739 = new String[]{method4317(method4316("\u0010\u0017e41")), method4317(method4316("\u001aPe\\d")), method4317(method4316("\u0005L'v")), method4317(method4316("\u001aPeYd")), method4317(method4316("\u001aPe&%\u0005P?$d")), method4317(method4316("\u001aPe_d")), method4317(method4316("\u001aPe]d")), method4317(method4316("\u001aPeXd")), method4317(method4316("\u001aPe[d")), method4317(method4316("\u001aPe^d"))};
   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "Leg;"
   )
   public static class118 field8736 = new class118(59, 2);
   @OriginalMember(
      owner = "client!qi",
      name = "d",
      descriptor = "Leg;"
   )
   public static class118 field8737 = new class118(109, -1);
   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "I"
   )
   public static int field8738 = 0;
   @OriginalMember(
      owner = "client!qi",
      name = "h",
      descriptor = "I"
   )
   public static int field8724;
   @OriginalMember(
      owner = "client!qi",
      name = "k",
      descriptor = "I"
   )
   public static int field8726;
   @OriginalMember(
      owner = "client!qi",
      name = "i",
      descriptor = "I"
   )
   public static int field8727;
   @OriginalMember(
      owner = "client!qi",
      name = "n",
      descriptor = "I"
   )
   public static int field8728;
   @OriginalMember(
      owner = "client!qi",
      name = "j",
      descriptor = "I"
   )
   private int field8729;
   @OriginalMember(
      owner = "client!qi",
      name = "m",
      descriptor = "I"
   )
   public static int field8730;
   @OriginalMember(
      owner = "client!qi",
      name = "o",
      descriptor = "I"
   )
   public static int field8731;
   @OriginalMember(
      owner = "client!qi",
      name = "c",
      descriptor = "I"
   )
   private int field8732;
   @OriginalMember(
      owner = "client!qi",
      name = "e",
      descriptor = "I"
   )
   private int field8733;
   @OriginalMember(
      owner = "client!qi",
      name = "f",
      descriptor = "I"
   )
   private int field8734;

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(B)V",
      line = 7
   )
   private final void method4309(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(I)V",
      line = 159
   )
   private final void method4310(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field8730;
         if (arg0 != 1212360518) {
            this.field8725 = null;
         }

         this.field8729 += ++this.field8732;
         int var3 = 0;
         if (var2 || ~var3 > -257) {
            do {
               int var4;
               label55: {
                  var4 = this.field8735[var3];
                  if ((var3 & 2) == 0) {
                     if ((1 & var3) != 0) {
                        this.field8733 >>>= 6;
                        if (!var2) {
                           break label55;
                        }
                     }

                     this.field8733 <<= 13;
                     if (!var2) {
                        break label55;
                     }
                  }

                  if (~(1 & var3) != -1) {
                     this.field8733 >>>= 16;
                     if (!var2) {
                        break label55;
                     }
                  }

                  this.field8733 <<= 2;
               }

               this.field8733 += this.field8735[255 & var3 + 128];
               int var5;
               this.field8735[var3] = var5 = this.field8733 + this.field8735[class556.method3988(1020, var4) >> 2] - -this.field8729;
               this.field8725[var3] = this.field8729 = this.field8735[class556.method3988(1020, var5 >> 8) >> 2] + var4;
               ++var3;
            } while(~var3 > -257);

         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8739[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(Z)I",
      line = 201
   )
   public final int method4311(boolean arg0) {
      try {
         if (~this.field8734 == -1) {
            this.method4310(1212360518);
            this.field8734 = 256;
         }

         ++field8728;
         if (!arg0) {
            this.field8734 = -89;
         }

         return this.field8725[this.field8734 + -1];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8739[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(I)V",
      line = 218
   )
   public static void method4312(int arg0) {
      try {
         field8737 = null;
         if (arg0 != 293386218) {
            field8737 = null;
         }

         field8736 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8739[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(IIIIILha;II)V",
      line = 231
   )
   public static final void method4313(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, int arg6, int arg7) {
      try {
         ++field8727;
         class50.field660 = arg5;
         class269.field3721 = class50.field660.method596();
         class706.field10310 = class50.field660.method596();
         class603.field8876 = class50.field660.method596();
         class616.field9073 = arg7;
         class88.field1146 = arg1;
         class614.field9025 = 1;
         class360.field4901 = 0;
         class347.field4686 = arg4;
         class106.field1344 = null;
         if (arg2 != -9489) {
            field8738 = -128;
         }

         class503.field7302 = 0;
         class377.field5452 = arg0;
         class395.method2991(arg6, arg3, arg2 + 9489);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field8739[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8739[0] : field8739[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(B)I",
      line = 258
   )
   public final int method4314(byte arg0) {
      try {
         if (~this.field8734 == -1) {
            this.method4310(1212360518);
            this.field8734 = 256;
         }

         if (arg0 != 57) {
            this.method4309((byte)120);
         }

         ++field8726;
         return this.field8725[--this.field8734];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8739[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "<init>",
      descriptor = "()V",
      line = 276
   )
   private class594() {
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "([Lbl;II)V",
      line = 280
   )
   public static final void method4315(class678[] param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qi",
      name = "<init>",
      descriptor = "([I)V",
      line = 379
   )
   public class594(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4317(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
