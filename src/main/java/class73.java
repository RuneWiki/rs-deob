import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class73 {
   @OriginalMember(
      owner = "client!hia",
      name = "c",
      descriptor = "Loi;"
   )
   private class80 field894 = new class80(16);
   @OriginalMember(
      owner = "client!hia",
      name = "k",
      descriptor = "Lkf;"
   )
   private class266 field893;
   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field907 = new String[]{method676(method675(",[\u0016\u000e\u0003-\\\u001eT\u0001l")), method676(method675("*G\u001bL")), method676(method675("?\u001cY\u000eB")), method676(method675(",[\u0016\u000e|l")), method676(method675(",[\u0016\u000ewl")), method676(method675(",[\u0016\u000e}l")), method676(method675(",[\u0016\u000eyl")), method676(method675(",[\u0016\u000e{l")), method676(method675(",[\u0016\u000e~l")), method676(method675(",[\u0016\u000ezl")), method676(method675(",[\u0016\u000exl"))};
   @OriginalMember(
      owner = "client!hia",
      name = "b",
      descriptor = "Lll;"
   )
   public static class387 field897 = new class387();
   @OriginalMember(
      owner = "client!hia",
      name = "o",
      descriptor = "Lek;"
   )
   public static class536 field900 = new class536(46, 8);
   @OriginalMember(
      owner = "client!hia",
      name = "g",
      descriptor = "I"
   )
   public static int field904 = 0;
   @OriginalMember(
      owner = "client!hia",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field905 = false;
   @OriginalMember(
      owner = "client!hia",
      name = "j",
      descriptor = "I"
   )
   public static int field892;
   @OriginalMember(
      owner = "client!hia",
      name = "d",
      descriptor = "I"
   )
   public static int field895;
   @OriginalMember(
      owner = "client!hia",
      name = "l",
      descriptor = "I"
   )
   public static int field896;
   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "I"
   )
   public static int field898;
   @OriginalMember(
      owner = "client!hia",
      name = "f",
      descriptor = "I"
   )
   public static int field899;
   @OriginalMember(
      owner = "client!hia",
      name = "e",
      descriptor = "I"
   )
   public static int field901;
   @OriginalMember(
      owner = "client!hia",
      name = "h",
      descriptor = "I"
   )
   public static int field902;
   @OriginalMember(
      owner = "client!hia",
      name = "n",
      descriptor = "I"
   )
   public static int field903;
   @OriginalMember(
      owner = "client!hia",
      name = "i",
      descriptor = "I"
   )
   public static int field906;

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(IIIIIII)I",
      line = 4
   )
   public static final int method667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg0 != -29913) {
            field906 = 43;
         }

         if ((arg4 & 1) == 1) {
            int var7 = arg6;
            arg6 = arg2;
            arg2 = var7;
         }

         ++field902;
         int var10 = arg5 & 3;
         if (~var10 == -1) {
            return arg1;
         } else if (~var10 == -2) {
            return arg3;
         } else {
            return var10 == 2 ? 1 - (arg6 - 7 + arg1) : -arg3 + 7 - (arg2 + -1);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field907[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "b",
      descriptor = "(B)V",
      line = 36
   )
   public final void method668(byte arg0) {
      try {
         ++field901;
         class80 var2 = this.field894;
         synchronized(this.field894) {
            this.field894.method715(true);
            if (arg0 != -119) {
               this.field893 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field907[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(IB)V",
      line = 58
   )
   public final void method669(int arg0, byte arg1) {
      try {
         ++field895;
         class80 var3 = this.field894;
         synchronized(this.field894) {
            this.field894.method726(arg0, 25324);
         }

         if (arg1 != -71) {
            this.method668((byte)59);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field907[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(I)V",
      line = 81
   )
   public final void method670(int arg0) {
      try {
         ++field899;
         class80 var2 = this.field894;
         synchronized(this.field894) {
            this.field894.method731(arg0 + 2);
            if (arg0 != -2) {
               this.method669(90, (byte)-98);
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field907[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(IIIBLce;I)Ljq;",
      line = 95
   )
   public final class540 method671(int arg0, int arg1, int arg2, byte arg3, class327 arg4, int arg5) {
      boolean var7 = client.field4360;

      try {
         ++field898;
         class5[] var8 = null;
         class690 var9 = this.method673((byte)33, arg5);
         if (arg3 != 112) {
            return null;
         } else {
            if (var9.field10157 != null) {
               var8 = new class5[var9.field10157.length];
               int var10 = 0;
               if (var7 || var10 < var8.length) {
                  do {
                     class397 var11 = arg4.method2428((byte)-24, var9.field10157[var10]);
                     var8[var10] = new class5(var11.field5729, var11.field5722, var11.field5733, var11.field5726, var11.field5720, var11.field5721, var11.field5730, var11.field5723);
                     ++var10;
                  } while(var10 < var8.length);
               }
            }

            return new class540(var9.field10161, var8, var9.field10153, arg0, arg2, arg1);
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field907[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field907[2] : field907[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(B)V",
      line = 129
   )
   public static void method672(byte arg0) {
      try {
         if (arg0 <= 90) {
            field900 = null;
         }

         field897 = null;
         field900 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field907[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(BI)Ljka;",
      line = 142
   )
   private final class690 method673(byte arg0, int arg1) {
      try {
         ++field896;
         class80 var3 = this.field894;
         class690 var4;
         synchronized(this.field894) {
            var4 = (class690)this.field894.method725(0, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field893;
            byte[] var6;
            synchronized(this.field893) {
               var6 = this.field893.method2037(false, arg1, 29);
            }

            class690 var7 = new class690();
            if (var6 != null) {
               var7.method5035(5521, new class147(var6));
            }

            class80 var8 = this.field894;
            synchronized(this.field894) {
               if (arg0 != 33) {
                  this.method671(-96, 105, -128, (byte)-64, (class327)null, 115);
               }

               this.field894.method723(0, (long)arg1, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field907[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "a",
      descriptor = "(ILkf;B)Lru;",
      line = 171
   )
   public static final class206 method674(int arg0, class266 arg1, byte arg2) {
      try {
         ++field892;
         int var3 = 97 / ((arg2 - 46) / 47);
         byte[] var4 = arg1.method2061((byte)85, arg0);
         return var4 == null ? null : new class206(var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field907[4] + arg0 + ',' + (arg1 != null ? field907[2] : field907[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 192
   )
   public class73(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field893 = arg2;
         this.field893.method2060(2, 29);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field907[0] + (arg0 != null ? field907[2] : field907[1]) + ',' + arg1 + ',' + (arg2 != null ? field907[2] : field907[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method675(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method676(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
