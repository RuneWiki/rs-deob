import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class140 extends class345 {
   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2293 = new String[]{method1315(method1314("SP\u0016 W")), method1315(method1314("SP\u0016!W")), method1315(method1314("SP\u0016#W")), method1315(method1314("SP\u0016&W")), method1315(method1314("SP\u0016/W")), method1315(method1314("SP\u0016\"W")), method1315(method1314("SP\u0016$W")), method1315(method1314("SP\u0016,W")), method1315(method1314("SP\u0016%W"))};
   @OriginalMember(
      owner = "client!hh",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field2289 = new int[2];
   @OriginalMember(
      owner = "client!hh",
      name = "n",
      descriptor = "I"
   )
   public static int field2285 = -1;
   @OriginalMember(
      owner = "client!hh",
      name = "r",
      descriptor = "I"
   )
   public static int field2281 = 765;
   @OriginalMember(
      owner = "client!hh",
      name = "m",
      descriptor = "I"
   )
   public static int field2282;
   @OriginalMember(
      owner = "client!hh",
      name = "s",
      descriptor = "I"
   )
   public static int field2283;
   @OriginalMember(
      owner = "client!hh",
      name = "l",
      descriptor = "I"
   )
   public static int field2284;
   @OriginalMember(
      owner = "client!hh",
      name = "j",
      descriptor = "I"
   )
   public static int field2286;
   @OriginalMember(
      owner = "client!hh",
      name = "k",
      descriptor = "I"
   )
   public static int field2287;
   @OriginalMember(
      owner = "client!hh",
      name = "i",
      descriptor = "I"
   )
   public static int field2288;
   @OriginalMember(
      owner = "client!hh",
      name = "o",
      descriptor = "I"
   )
   public static int field2290;
   @OriginalMember(
      owner = "client!hh",
      name = "t",
      descriptor = "I"
   )
   public static int field2291;
   @OriginalMember(
      owner = "client!hh",
      name = "q",
      descriptor = "I"
   )
   public static int field2292;

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field2282;
         if (super.field4914.method5560(13750)) {
            return 3;
         } else if (~arg1 != -1 && ~super.field4914.field11175.method2967(false) != -2) {
            if (arg0 >= -45) {
               method1310(-69);
            }

            return 2;
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2293[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class140(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1309(int arg0, int arg1) {
      try {
         ++field2290;
         if (arg1 != 0) {
            field2285 = 22;
         }

         return 127 & arg0 >> 11;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2293[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1310(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1311(byte arg0) {
      try {
         ++field2288;
         if (super.field4914.method5560(13750)) {
            return false;
         } else {
            return arg0 < -127;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2293[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1312(byte arg0) {
      try {
         if (arg0 != 71) {
            field2292 = -103;
         }

         field2289 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2293[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            method1310(-102);
         }

         ++field2284;
         return 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2293[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         if (arg0 != 0) {
            field2289 = null;
         }

         if (super.field4914.method5560(13750)) {
            super.field4913 = 0;
         }

         ++field2286;
         if (~super.field4913 > -1 && super.field4913 > 2) {
            super.field4913 = this.method53(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2293[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 >= 99) {
            ++field2283;
            super.field4913 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2293[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class140(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method1313(boolean arg0) {
      try {
         ++field2291;
         if (arg0) {
            this.method54(-2, (byte)106);
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2293[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1314(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1315(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
