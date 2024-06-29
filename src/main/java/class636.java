import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class636 extends class345 {
   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9272 = new String[]{method4664(method4663("}/\u0014\u0010+")), method4664(method4663("htVR")), method4664(method4663("jd[\u0010\u0017.")), method4664(method4663("jd[\u0010\u001e.")), method4664(method4663("jd[\u0010\u0013.")), method4664(method4663("jd[\u0010\u0014.")), method4664(method4663("jd[\u0010\u0011.")), method4664(method4663("jd[\u0010\u0010.")), method4664(method4663("jd[\u0010\u0012.")), method4664(method4663("jd[\u0010\u001d.")), method4664(method4663("jd[\u0010\u0015."))};
   @OriginalMember(
      owner = "client!lea",
      name = "k",
      descriptor = "I"
   )
   public static int field9267 = 0;
   @OriginalMember(
      owner = "client!lea",
      name = "l",
      descriptor = "Lvg;"
   )
   public static class59 field9268 = null;
   @OriginalMember(
      owner = "client!lea",
      name = "m",
      descriptor = "[F"
   )
   public static float[] field9269 = new float[2];
   @OriginalMember(
      owner = "client!lea",
      name = "n",
      descriptor = "I"
   )
   public static int field9261;
   @OriginalMember(
      owner = "client!lea",
      name = "p",
      descriptor = "I"
   )
   public static int field9262;
   @OriginalMember(
      owner = "client!lea",
      name = "r",
      descriptor = "I"
   )
   public static int field9263;
   @OriginalMember(
      owner = "client!lea",
      name = "i",
      descriptor = "I"
   )
   public static int field9264;
   @OriginalMember(
      owner = "client!lea",
      name = "s",
      descriptor = "I"
   )
   public static int field9265;
   @OriginalMember(
      owner = "client!lea",
      name = "q",
      descriptor = "I"
   )
   public static int field9266;
   @OriginalMember(
      owner = "client!lea",
      name = "o",
      descriptor = "I"
   )
   public static int field9270;
   @OriginalMember(
      owner = "client!lea",
      name = "j",
      descriptor = "I"
   )
   public static int field9271;

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(IIIIIIIIILcf;II)Z",
      line = 5
   )
   public static final boolean method4658(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, class628 param9, int param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lea",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 440
   )
   public class636(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(BI)I",
      line = 443
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field9261;
         if (arg0 > -45) {
            method4661(83);
         }

         int var3 = super.field4914.method5554(-1).method1931((byte)66);
         if (var3 < 96) {
            return 3;
         } else if (arg1 > 1 && ~var3 > -129) {
            return 3;
         } else {
            return arg1 > 3 && var3 < 192 ? 3 : 1;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9272[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 468
   )
   public class636(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(B)Z",
      line = 472
   )
   public final boolean method4659(byte arg0) {
      try {
         ++field9270;
         int var2 = super.field4914.method5554(-1).method1931((byte)112);
         if (var2 < 96) {
            return false;
         } else {
            if (arg0 > -127) {
               this.method53(true);
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9272[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "b",
      descriptor = "(Z)I",
      line = 489
   )
   public final int method4660(boolean arg0) {
      try {
         ++field9271;
         if (arg0) {
            field9267 = -41;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9272[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "b",
      descriptor = "(I)V",
      line = 503
   )
   public final void method51(int arg0) {
      try {
         ++field9264;
         int var2 = super.field4914.method5554(arg0 + -1).method1931((byte)102);
         if (var2 < 96) {
            super.field4913 = 0;
         }

         if (~super.field4913 < -2 && ~var2 > -129) {
            super.field4913 = 1;
         }

         if (~super.field4913 < -3 && ~var2 > -193) {
            super.field4913 = 2;
         }

         if (arg0 > super.field4913 || super.field4913 > 3) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9272[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "c",
      descriptor = "(I)V",
      line = 527
   )
   public static void method4661(int arg0) {
      try {
         if (arg0 != 11176) {
            method4661(-115);
         }

         field9268 = null;
         field9269 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9272[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(IB)V",
      line = 542
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 < 99) {
            method4658(86, 0, 49, -107, 81, -75, -109, 93, -68, (class628)null, 120, -72);
         }

         super.field4913 = arg0;
         ++field9266;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9272[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(CB)Z",
      line = 554
   )
   public static final boolean method4662(char arg0, byte arg1) {
      try {
         if (arg1 != -95) {
            method4658(101, 53, 101, 4, -68, 20, 95, 44, 16, (class628)null, 96, -7);
         }

         ++field9265;
         return ~arg0 <= -49 && arg0 <= '9';
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9272[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(Z)I",
      line = 566
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return 7;
         } else {
            ++field9263;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9272[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4663(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4664(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
