import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class288 extends class708 implements class96 {
   @OriginalMember(
      owner = "client!wd",
      name = "x",
      descriptor = "Liw;"
   )
   private class335 field3815;
   @OriginalMember(
      owner = "client!wd",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3824 = new String[]{method2185(method2184("z.T%$")), method2185(method2184("z.T/$")), method2185(method2184("z.T\"$")), method2185(method2184("vdTHq")), method2185(method2184("z.TZec#\u000eX$")), method2185(method2184("c?\u0016\n")), method2185(method2184("z.T,$")), method2185(method2184("z.T#$")), method2185(method2184("z.T $")), method2185(method2184("z.T$$")), method2185(method2184("z.T.$")), method2185(method2184("z.T'$")), method2185(method2184("z.T!$"))};
   @OriginalMember(
      owner = "client!wd",
      name = "H",
      descriptor = "Lbga;"
   )
   public static class378 field3811 = new class378(118, 3);
   @OriginalMember(
      owner = "client!wd",
      name = "J",
      descriptor = "Lbga;"
   )
   public static class378 field3823 = new class378(139, 2);
   @OriginalMember(
      owner = "client!wd",
      name = "y",
      descriptor = "F"
   )
   public static float field3822;
   @OriginalMember(
      owner = "client!wd",
      name = "C",
      descriptor = "I"
   )
   public static int field3809;
   @OriginalMember(
      owner = "client!wd",
      name = "B",
      descriptor = "I"
   )
   public static int field3810;
   @OriginalMember(
      owner = "client!wd",
      name = "A",
      descriptor = "I"
   )
   public static int field3812;
   @OriginalMember(
      owner = "client!wd",
      name = "I",
      descriptor = "I"
   )
   public static int field3814;
   @OriginalMember(
      owner = "client!wd",
      name = "L",
      descriptor = "I"
   )
   public static int field3816;
   @OriginalMember(
      owner = "client!wd",
      name = "D",
      descriptor = "I"
   )
   public static int field3817;
   @OriginalMember(
      owner = "client!wd",
      name = "E",
      descriptor = "I"
   )
   public static int field3818;
   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "I"
   )
   public static int field3819;
   @OriginalMember(
      owner = "client!wd",
      name = "G",
      descriptor = "I"
   )
   public static int field3820;
   @OriginalMember(
      owner = "client!wd",
      name = "M",
      descriptor = "I"
   )
   public static int field3821;
   @OriginalMember(
      owner = "client!wd",
      name = "K",
      descriptor = "[Lto;"
   )
   public static class8[] field3813;

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method794(int arg0) {
      try {
         ++field3818;
         if (arg0 != 1143968105) {
            method2181((byte)-112);
         }

         return super.method794(1143968105);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3824[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "<init>",
      descriptor = "(Lkfa;Liw;Z)V"
   )
   public class288(class632 arg0, class335 arg1, boolean arg2) {
      super(arg0, 34963, arg2);

      try {
         this.field3815 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3824[4] + (arg0 != null ? field3824[3] : field3824[5]) + ',' + (arg1 != null ? field3824[3] : field3824[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2180(int arg0, int arg1) {
      try {
         if (arg1 != -6) {
            return false;
         } else {
            ++field3814;
            return arg0 == 1 || arg0 == 3 || ~arg0 == -6;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3824[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method2181(byte arg0) {
      try {
         field3813 = null;
         field3811 = null;
         if (arg0 != -47) {
            field3811 = null;
         }

         field3823 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3824[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method898(byte arg0) {
      try {
         ++field3817;
         if (arg0 != 56) {
            field3822 = -0.08794169F;
         }

         return super.method5154(0, super.field10281.field8938);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3824[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "(B)Liw;"
   )
   public final class335 method897(byte arg0) {
      try {
         if (arg0 != -71) {
            return null;
         } else {
            ++field3821;
            return this.field3815;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3824[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "(BI)I"
   )
   public static final int method2182(byte arg0, int arg1) {
      try {
         ++field3809;
         return arg0 > -83 ? 114 : arg1 & 1023;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3824[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   public final Buffer method896(boolean arg0, int arg1) {
      try {
         if (arg1 != -24730) {
            method2183(-88, false);
         }

         ++field3812;
         return super.method5153(-101, super.field10281.field8938, arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3824[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method788(byte arg0) {
      try {
         super.method788((byte)41);
         if (arg0 < 21) {
            this.method794(-64);
         }

         ++field3816;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3824[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method895(byte arg0, int arg1) {
      try {
         super.method895((byte)119, this.field3815.field4797 * arg1);
         if (arg0 >= 91) {
            ++field3819;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3824[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(IZ)Lgaa;"
   )
   public static final class315 method2183(int arg0, boolean arg1) {
      try {
         ++field3810;
         if (arg1) {
            return null;
         } else {
            return ~arg0 <= -1 && arg0 < 100 ? class354.field5058[arg0] : null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3824[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2184(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2185(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
