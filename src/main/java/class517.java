import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class517 {
   @OriginalMember(
      owner = "client!ef",
      name = "k",
      descriptor = "Ltv;"
   )
   private class590 field7094 = new class590(128);
   @OriginalMember(
      owner = "client!ef",
      name = "g",
      descriptor = "Lqh;"
   )
   private class74 field7096;
   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7102 = new String[]{method3755(method3754("=a\u001f!s")), method3755(method3754("(:]c")), method3755(method3754("#)\u001f3g(&E1&")), method3755(method3754("#)\u001fK&")), method3755(method3754("#)\u001fJ&")), method3755(method3754("#)\u001fL&")), method3755(method3754("#)\u001fN&")), method3755(method3754("#)\u001fM&")), method3755(method3754("#)\u001fI&"))};
   @OriginalMember(
      owner = "client!ef",
      name = "d",
      descriptor = "Lnm;"
   )
   public static class502 field7092 = new class502();
   @OriginalMember(
      owner = "client!ef",
      name = "j",
      descriptor = "I"
   )
   public static int field7091;
   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "I"
   )
   public static int field7095;
   @OriginalMember(
      owner = "client!ef",
      name = "h",
      descriptor = "I"
   )
   public static int field7097;
   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "I"
   )
   public static int field7098;
   @OriginalMember(
      owner = "client!ef",
      name = "f",
      descriptor = "I"
   )
   public static int field7099;
   @OriginalMember(
      owner = "client!ef",
      name = "c",
      descriptor = "I"
   )
   public static int field7100;
   @OriginalMember(
      owner = "client!ef",
      name = "i",
      descriptor = "I"
   )
   public static int field7101;
   @OriginalMember(
      owner = "client!ef",
      name = "e",
      descriptor = "Lnn;"
   )
   public static class440 field7093;

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3748(int arg0) {
      try {
         field7093 = null;
         if (arg0 != 4096) {
            field7092 = null;
         }

         field7092 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7102[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3749(int arg0, int arg1) {
      try {
         ++field7098;
         class590 var3 = this.field7094;
         synchronized(this.field7094) {
            if (arg0 != 128) {
               field7091 = -80;
            }

            this.field7094.method4234(2, arg1);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7102[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(II)Ljaa;"
   )
   public final class645 method3750(int arg0, int arg1) {
      try {
         ++field7095;
         class590 var3 = this.field7094;
         class645 var4;
         synchronized(this.field7094) {
            var4 = (class645)this.field7094.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg1 < 61) {
               this.field7096 = null;
            }

            class74 var5 = this.field7096;
            byte[] var6;
            synchronized(this.field7096) {
               var6 = this.field7096.method732(arg0, 1, (byte)117);
            }

            class645 var7 = new class645();
            if (var6 != null) {
               var7.method4649(-89, new class594(var6));
            }

            class590 var8 = this.field7094;
            synchronized(this.field7094) {
               this.field7094.method4238(39, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field7102[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3751(int arg0) {
      try {
         ++field7099;
         int var2 = -81 / ((arg0 - 43) / 36);
         class590 var3 = this.field7094;
         synchronized(this.field7094) {
            this.field7094.method4245(true);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7102[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(IZIIFIIII)[[I"
   )
   public static final int[][] method3752(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4273;

      try {
         ++field7101;
         if (arg8 >= -74) {
            method3748(7);
         }

         int[][] var10 = new int[arg0][arg7];
         class276 var11 = new class276();
         var11.field3679 = arg6;
         var11.field3684 = arg1;
         var11.field3676 = arg2;
         var11.field3688 = arg5;
         var11.field3690 = (int)(arg4 * 4096.0F);
         var11.method1457(28274);
         class368.method2841(arg7, 1159665196, arg0);
         int var12 = 0;
         if (var9) {
            var11.method2101(var10[var12], var12, (byte)43);
            ++var12;
         }

         while(true) {
            while(arg0 > var12) {
               var11.method2101(var10[var12], var12, (byte)43);
               ++var12;
            }

            if (!var9) {
               return var10;
            }

            ++var12;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field7102[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class517(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field7096 = arg2;
         this.field7096.method727(1, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7102[2] + (arg0 != null ? field7102[0] : field7102[1]) + ',' + arg1 + ',' + (arg2 != null ? field7102[0] : field7102[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3753(byte arg0) {
      try {
         class590 var2 = this.field7094;
         synchronized(this.field7094) {
            this.field7094.method4244(true);
         }

         ++field7100;
         if (arg0 != -59) {
            this.field7094 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7102[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3754(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3755(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
