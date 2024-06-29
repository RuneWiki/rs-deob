import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class354 {
   @OriginalMember(
      owner = "client!b",
      name = "d",
      descriptor = "Ltv;"
   )
   private class590 field5052 = new class590(64);
   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "Lqh;"
   )
   private class74 field5050;
   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5059 = new String[]{method2787(method2786("\u007fQ(\u0012")), method2787(method2786("\u007fQ*\u0012")), method2787(method2786("\u007fQ+\u0012")), method2787(method2786("\u007fQ-\u0012")), method2787(method2786("\u007fQ,\u0012")), method2787(method2786("\u007fQ)\u0012")), method2787(method2786("fQA\u00144")), method2787(method2786("s\n\u0003V")), method2787(method2786("\u007fQSS't\u000bQ\u0012")), method2787(method2786("\u007fQ.\u0012"))};
   @OriginalMember(
      owner = "client!b",
      name = "g",
      descriptor = "[Lgaa;"
   )
   public static class315[] field5058 = new class315[100];
   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class378 field5055 = new class378(89, 0);
   @OriginalMember(
      owner = "client!b",
      name = "k",
      descriptor = "I"
   )
   public static int field5047;
   @OriginalMember(
      owner = "client!b",
      name = "e",
      descriptor = "I"
   )
   public static int field5048;
   @OriginalMember(
      owner = "client!b",
      name = "i",
      descriptor = "I"
   )
   public static int field5049;
   @OriginalMember(
      owner = "client!b",
      name = "l",
      descriptor = "I"
   )
   public static int field5053;
   @OriginalMember(
      owner = "client!b",
      name = "h",
      descriptor = "I"
   )
   public static int field5054;
   @OriginalMember(
      owner = "client!b",
      name = "j",
      descriptor = "I"
   )
   public static int field5056;
   @OriginalMember(
      owner = "client!b",
      name = "c",
      descriptor = "I"
   )
   public static int field5057;
   @OriginalMember(
      owner = "client!b",
      name = "f",
      descriptor = "Lqh;"
   )
   public static class74 field5051;

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2779(int arg0, int arg1) {
      try {
         class590 var3 = this.field5052;
         synchronized(this.field5052) {
            this.field5052.method4245(true);
            if (arg0 != 0) {
               this.method2779(-9, 54);
            }

            this.field5052 = new class590(arg1);
         }

         ++field5054;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5059[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2780(byte arg0) {
      try {
         if (arg0 == -22) {
            ++field5053;
            class457.field6267 = class20.method177(0, true, 35, 4, 8, 2048, 0.4F, 8);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5059[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2781(boolean arg0) {
      try {
         if (arg0) {
            this.method2779(11, -125);
         }

         class590 var2 = this.field5052;
         synchronized(this.field5052) {
            this.field5052.method4245(true);
         }

         ++field5049;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5059[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2782(byte arg0, int arg1) {
      try {
         ++field5047;
         if (arg0 != -30) {
            field5051 = null;
         }

         class590 var3 = this.field5052;
         synchronized(this.field5052) {
            this.field5052.method4234(2, arg1);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5059[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2783(byte arg0) {
      try {
         if (arg0 >= 15) {
            class590 var2 = this.field5052;
            synchronized(this.field5052) {
               this.field5052.method4244(true);
            }

            ++field5048;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5059[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(IB)Ljfa;"
   )
   public final class305 method2784(int arg0, byte arg1) {
      try {
         ++field5057;
         class590 var3 = this.field5052;
         class305 var4;
         synchronized(this.field5052) {
            var4 = (class305)this.field5052.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field5050;
            byte[] var6;
            synchronized(this.field5050) {
               var6 = this.field5050.method732(class288.method2182((byte)-124, arg0), class569.method4074(arg0, (byte)106), (byte)121);
            }

            class305 var7 = new class305();
            if (var6 != null) {
               var7.method2294(new class594(var6), arg1 ^ 64);
            }

            if (arg1 != 65) {
               this.method2784(106, (byte)-69);
            }

            class590 var8 = this.field5052;
            synchronized(this.field5052) {
               this.field5052.method4238(115, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field5059[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2785(int arg0) {
      try {
         if (arg0 <= 48) {
            field5058 = null;
         }

         field5055 = null;
         field5051 = null;
         field5058 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5059[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class354(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field5050 = arg2;
         if (this.field5050 != null) {
            int var4 = this.field5050.method719(true) - 1;
            this.field5050.method727(var4, -32767);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5059[8] + (arg0 != null ? field5059[6] : field5059[7]) + ',' + arg1 + ',' + (arg2 != null ? field5059[6] : field5059[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2786(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2787(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
