import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class322 extends class345 {
   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4642 = new String[]{method2515(method2514("9\u001dG\r\u0016")), method2515(method2514("9\u001dG\u0004\u0016")), method2515(method2514("9\u001dG\u0006\u0016")), method2515(method2514("9\u001dG\u0003\u0016")), method2515(method2514("9\u001dG\u0001\u0016")), method2515(method2514("9\u001dG\u0007\u0016")), method2515(method2514("9\u001dG\u000e\u0016")), method2515(method2514("9\u001dG\u0002\u0016")), method2515(method2514(";\r\u0005)")), method2515(method2514(".VGkC")), method2515(method2514("9\u001dG\u0000\u0016"))};
   @OriginalMember(
      owner = "client!le",
      name = "l",
      descriptor = "[Led;"
   )
   public static class732[] field4634 = new class732[16];
   @OriginalMember(
      owner = "client!le",
      name = "p",
      descriptor = "I"
   )
   public static int field4632;
   @OriginalMember(
      owner = "client!le",
      name = "o",
      descriptor = "I"
   )
   public static int field4633;
   @OriginalMember(
      owner = "client!le",
      name = "n",
      descriptor = "I"
   )
   public static int field4635;
   @OriginalMember(
      owner = "client!le",
      name = "i",
      descriptor = "I"
   )
   public static int field4636;
   @OriginalMember(
      owner = "client!le",
      name = "q",
      descriptor = "I"
   )
   public static int field4637;
   @OriginalMember(
      owner = "client!le",
      name = "m",
      descriptor = "I"
   )
   public static int field4638;
   @OriginalMember(
      owner = "client!le",
      name = "j",
      descriptor = "I"
   )
   public static int field4639;
   @OriginalMember(
      owner = "client!le",
      name = "k",
      descriptor = "I"
   )
   public static int field4640;
   @OriginalMember(
      owner = "client!le",
      name = "r",
      descriptor = "I"
   )
   public static int field4641;

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            field4641 = 87;
         }

         ++field4639;
         if (!super.field4914.method5560(13750)) {
            return super.field4914.field11145.method2093((byte)-127) && class98.method934(super.field4914.field11145.method2098(false), 0) ? 1 : 0;
         } else {
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4642[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class322(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!le",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method2509(boolean arg0) {
      try {
         ++field4632;
         if (arg0) {
            field4641 = -75;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4642[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2510(byte arg0) {
      try {
         if (arg0 > -127) {
            this.method2509(true);
         }

         ++field4638;
         return !super.field4914.method5560(13750);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4642[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2511(int arg0) {
      try {
         if (arg0 != 22891) {
            method2512(72, (class303)null);
         }

         field4634 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4642[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(ILjfa;)V"
   )
   public static final void method2512(int arg0, class303 arg1) {
      try {
         if (arg0 != 16) {
            field4641 = 122;
         }

         ++field4633;
         if (class133.field2195 == arg1.field4358) {
            class178.field2749[arg1.field4316] = true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4642[10] + arg0 + ',' + (arg1 != null ? field4642[9] : field4642[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         ++field4635;
         if (arg0 != 0) {
            this.method52((byte)-27, -64);
         }

         if (super.field4914.method5560(13750)) {
            super.field4913 = 2;
         }

         if (~super.field4913 > -1 || ~super.field4913 < -3) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4642[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field4636;
         super.field4913 = arg0;
         if (arg1 < 99) {
            method2511(100);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4642[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method2513(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field4640;
         class536 var5 = class108.method1038((long)arg1, arg2 ^ -97, 8);
         var5.method4017(24076);
         if (arg2 != -74) {
            field4634 = null;
         }

         var5.field7805 = arg0;
         var5.field7798 = arg4;
         var5.field7800 = arg3;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4642[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class322(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field4637;
         if (super.field4914.method5560(13750)) {
            return 3;
         } else {
            return arg0 >= -45 ? -2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4642[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2514(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2515(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
