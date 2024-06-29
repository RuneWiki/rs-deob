import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class183 extends class345 {
   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2799 = new String[]{method1618(method1617("\t5N\b{B")), method1618(method1617("\t5N\b}B")), method1618(method1617("\t5N\bzB")), method1618(method1617("\t5N\b~B")), method1618(method1617("\t5N\bqB")), method1618(method1617("\u00196@QP\u00049yO]\u000f1nB")), method1618(method1617("\t5N\bxB")), method1618(method1617("\t5N\b\u007fB")), method1618(method1617("\u0004+CJ")), method1618(method1617("\u0011p\u0001\bD")), method1618(method1617("\t5N\b|B"))};
   @OriginalMember(
      owner = "client!cka",
      name = "j",
      descriptor = "Luw;"
   )
   public static class435 field2790 = new class435(21, -1);
   @OriginalMember(
      owner = "client!cka",
      name = "o",
      descriptor = "Luw;"
   )
   public static class435 field2797 = new class435(55, 2);
   @OriginalMember(
      owner = "client!cka",
      name = "p",
      descriptor = "I"
   )
   public static int field2791;
   @OriginalMember(
      owner = "client!cka",
      name = "i",
      descriptor = "I"
   )
   public static int field2792;
   @OriginalMember(
      owner = "client!cka",
      name = "l",
      descriptor = "I"
   )
   public static int field2793;
   @OriginalMember(
      owner = "client!cka",
      name = "k",
      descriptor = "I"
   )
   public static int field2794;
   @OriginalMember(
      owner = "client!cka",
      name = "m",
      descriptor = "I"
   )
   public static int field2795;
   @OriginalMember(
      owner = "client!cka",
      name = "q",
      descriptor = "I"
   )
   public static int field2796;
   @OriginalMember(
      owner = "client!cka",
      name = "n",
      descriptor = "I"
   )
   public static int field2798;

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(IB)V",
      line = 4
   )
   public final void method54(int arg0, byte arg1) {
      try {
         super.field4913 = arg0;
         if (arg1 < 99) {
            field2797 = null;
         }

         ++field2792;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2799[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(Loha;BI)V",
      line = 18
   )
   public static final void method1613(class771 arg0, byte arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         int var4;
         int var5;
         label95: {
            ++field2791;
            var4 = -1;
            var5 = 0;
            if (class29.field458 < arg0.field11239) {
               class437.method3280(-6838, arg0);
               if (!var3) {
                  break label95;
               }
            }

            if (class29.field458 > arg0.field11274) {
               class504.method3786(false, arg0, false);
               var4 = class551.field7957;
               var5 = class363.field5420;
               if (!var3) {
                  break label95;
               }
            }

            class327.method2534(arg0, false);
         }

         if (arg0.field4101 < 512 || arg0.field4096 < 512 || class209.field3112 * 512 - 512 <= arg0.field4101 || class1.field3 * 512 + -512 <= arg0.field4096) {
            arg0.field11274 = 0;
            arg0.field11224 = -1;
            arg0.field11239 = 0;
            arg0.field11288 = null;
            var4 = -1;
            var5 = 0;
            arg0.field4101 = arg0.field11313[0] * 512 - -(256 * arg0.method3438(false));
            arg0.field4096 = arg0.field11322[0] * 512 - -(arg0.method3438(false) * 256);
            arg0.method5583(false);
            int var6 = 0;
            if (var3) {
               arg0.field11279[var6].field9854 = -1;
               ++var6;
            }

            while(~var6 > ~arg0.field11279.length) {
               arg0.field11279[var6].field9854 = -1;
               ++var6;
            }
         }

         if (class304.field4398 == arg0 && (~arg0.field4101 > -6145 || arg0.field4096 < 6144 || ~(class209.field3112 * 512 + -6144) >= ~arg0.field4101 || ~((class1.field3 + -12) * 512) >= ~arg0.field4096)) {
            arg0.field11239 = 0;
            arg0.field11274 = 0;
            var4 = -1;
            var5 = 0;
            arg0.field11288 = null;
            arg0.field11224 = -1;
            arg0.field4101 = arg0.field11313[0] * 512 + arg0.method3438(false) * 256;
            arg0.field4096 = arg0.field11322[0] * 512 + arg0.method3438(false) * 256;
            arg0.method5583(false);
            int var7 = 0;
            if (var3) {
               arg0.field11279[var7].field9854 = -1;
               ++var7;
            }

            while(~var7 > ~arg0.field11279.length) {
               arg0.field11279[var7].field9854 = -1;
               ++var7;
            }
         }

         if (arg1 == -3) {
            int var8 = class668.method4875((byte)101, arg0);
            class698.method5073(-1073741824, arg0);
            class65.method702(116, var4, var5, var8, arg0);
            class381.method2966(arg0, false, var4);
            class141.method1322((byte)-125, arg0);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2799[10] + (arg0 != null ? field2799[9] : field2799[8]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(Z)I",
      line = 100
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            this.method54(-60, (byte)96);
         }

         ++field2796;
         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2799[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "c",
      descriptor = "(I)Z",
      line = 113
   )
   public static final boolean method1614(int arg0) {
      try {
         ++field2795;
         if (class741.field10680) {
            try {
               if ((Boolean)class575.method4254(class514.field7493, (byte)16, field2799[5])) {
                  return false;
               }

               return true;
            } catch (Throwable var2) {
            }
         }

         if (arg0 != -1) {
            field2797 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2799[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 137
   )
   public class183(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cka",
      name = "b",
      descriptor = "(Z)I",
      line = 142
   )
   public final int method1615(boolean arg0) {
      try {
         if (arg0) {
            method1614(-74);
         }

         ++field2793;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2799[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "b",
      descriptor = "(I)V",
      line = 155
   )
   public final void method51(int arg0) {
      try {
         ++field2794;
         if (arg0 == 0) {
            if (super.field4913 != 1 && ~super.field4913 != -1) {
               super.field4913 = this.method53(false);
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2799[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(B)V",
      line = 169
   )
   public static void method1616(byte arg0) {
      try {
         if (arg0 == 66) {
            field2797 = null;
            field2790 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2799[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 180
   )
   public class183(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(BI)I",
      line = 184
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 > -45) {
            return 5;
         } else {
            ++field2798;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2799[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1617(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1618(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
