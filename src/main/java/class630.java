import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class630 extends class345 {
   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9191 = new String[]{method4631(method4630("\u0000YyWF")), method4631(method4630("\u0000YySF")), method4631(method4630("\u0000YyQF")), method4631(method4630("\u0000YyTF")), method4631(method4630("\u0000YyUF")), method4631(method4630("\u0000YyRF")), method4631(method4630("\u0000Yy]F")), method4631(method4630("\u0000Yy^F")), method4631(method4630("\u0000YyPF"))};
   @OriginalMember(
      owner = "client!iq",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field9185 = true;
   @OriginalMember(
      owner = "client!iq",
      name = "r",
      descriptor = "Lgh;"
   )
   public static class572 field9180 = new class572(89, 7);
   @OriginalMember(
      owner = "client!iq",
      name = "n",
      descriptor = "Lgh;"
   )
   public static class572 field9190 = new class572(7, 4);
   @OriginalMember(
      owner = "client!iq",
      name = "i",
      descriptor = "I"
   )
   public static int field9181;
   @OriginalMember(
      owner = "client!iq",
      name = "q",
      descriptor = "I"
   )
   public static int field9182;
   @OriginalMember(
      owner = "client!iq",
      name = "j",
      descriptor = "I"
   )
   public static int field9183;
   @OriginalMember(
      owner = "client!iq",
      name = "k",
      descriptor = "I"
   )
   public static int field9184;
   @OriginalMember(
      owner = "client!iq",
      name = "o",
      descriptor = "I"
   )
   public static int field9186;
   @OriginalMember(
      owner = "client!iq",
      name = "p",
      descriptor = "I"
   )
   public static int field9187;
   @OriginalMember(
      owner = "client!iq",
      name = "s",
      descriptor = "I"
   )
   public static int field9188;
   @OriginalMember(
      owner = "client!iq",
      name = "l",
      descriptor = "I"
   )
   public static int field9189;

   @OriginalMember(
      owner = "client!iq",
      name = "b",
      descriptor = "(B)Z",
      line = 4
   )
   public final boolean method4625(byte arg0) {
      try {
         ++field9182;
         if (super.field4914.method5560(13750)) {
            return false;
         } else if (~super.field4914.field11166.method5470(false) == -1) {
            return false;
         } else {
            return arg0 <= -127;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9191[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(BI)I",
      line = 25
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field9189;
         if (super.field4914.method5560(13750)) {
            return 3;
         } else if (arg0 > -45) {
            return 102;
         } else {
            return ~super.field4914.field11166.method5470(false) == -1 ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9191[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "b",
      descriptor = "(I)V",
      line = 44
   )
   public final void method51(int arg0) {
      try {
         ++field9184;
         if (super.field4914.method5560(13750)) {
            super.field4913 = 0;
         }

         if (arg0 == super.field4914.field11166.method5470(false)) {
            super.field4913 = 0;
         }

         if (~super.field4913 > -1 || ~super.field4913 < -3) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9191[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(IB)V",
      line = 61
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 <= 99) {
            method4629(-61, 46, 64, -46, 46);
         }

         super.field4913 = arg0;
         ++field9186;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9191[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "b",
      descriptor = "(Z)I",
      line = 73
   )
   public final int method4626(boolean arg0) {
      try {
         if (arg0) {
            field9190 = null;
         }

         ++field9183;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9191[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(B)V",
      line = 85
   )
   public static void method4627(byte arg0) {
      try {
         if (arg0 > -108) {
            method4628(-6, 71);
         }

         field9190 = null;
         field9180 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9191[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(II)Z",
      line = 97
   )
   public static final boolean method4628(int arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field9181;
         if (arg1 != -20009) {
            return true;
         } else {
            class587 var3 = (class587)class685.field10080.method2579(-801);
            boolean var10000;
            if (var2) {
               var10000 = class433.method3259(-18, var3.field8485);
            } else if (var3 == null) {
               var10000 = false;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = class433.method3259(-18, var3.field8485);
            }

            while(!var10000 || ~((long)arg0) != ~var3.field8494) {
               var3 = (class587)class685.field10080.method2583(arg1 + 20010);
               if (var3 == null) {
                  var10000 = false;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = class433.method3259(-18, var3.field8485);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9191[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 123
   )
   public class630(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!iq",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 128
   )
   public class630(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(IIIII)V",
      line = 138
   )
   public static final void method4629(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9188;
         class536 var5 = class108.method1038((long)arg4, 13, 10);
         var5.method4017(24076);
         var5.field7800 = arg2;
         var5.field7805 = arg1;
         if (arg3 < -105) {
            var5.field7798 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9191[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(Z)I",
      line = 154
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return -123;
         } else {
            ++field9187;
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9191[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4630(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4631(char[] arg0) {
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
            var10005 = 87;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
