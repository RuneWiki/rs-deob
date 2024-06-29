import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class723 extends class416 {
   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10825 = new String[]{method5347(method5346("\\64d\u001dB01b")), method5347(method5346("U(yUZ")), method5347(method5346("U(yRZ")), method5347(method5346("U(ySZ")), method5347(method5346("_*;z")), method5347(method5346("Jqy8\u000f")), method5347(method5346("U(yPZ")), method5347(method5346("U(y_Z")), method5347(method5346("U(yWZ")), method5347(method5346("U(y\\Z")), method5347(method5346("U(yQZ")), method5347(method5346("U(y^Z")), method5347(method5346("U(yTZ"))};
   @OriginalMember(
      owner = "client!dw",
      name = "e",
      descriptor = "Lfq;"
   )
   public static class374 field10824 = null;
   @OriginalMember(
      owner = "client!dw",
      name = "d",
      descriptor = "I"
   )
   public static int field10815;
   @OriginalMember(
      owner = "client!dw",
      name = "k",
      descriptor = "I"
   )
   public static int field10816;
   @OriginalMember(
      owner = "client!dw",
      name = "h",
      descriptor = "I"
   )
   public static int field10817;
   @OriginalMember(
      owner = "client!dw",
      name = "m",
      descriptor = "I"
   )
   public static int field10818;
   @OriginalMember(
      owner = "client!dw",
      name = "j",
      descriptor = "I"
   )
   public static int field10819;
   @OriginalMember(
      owner = "client!dw",
      name = "f",
      descriptor = "I"
   )
   public static int field10820;
   @OriginalMember(
      owner = "client!dw",
      name = "i",
      descriptor = "I"
   )
   public static int field10821;
   @OriginalMember(
      owner = "client!dw",
      name = "g",
      descriptor = "I"
   )
   public static int field10822;
   @OriginalMember(
      owner = "client!dw",
      name = "l",
      descriptor = "I"
   )
   public static int field10823;

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(IIIIILc;)Lqk;",
      line = 4
   )
   public static final class419 method5342(int arg0, int arg1, int arg2, int arg3, int arg4, class652 arg5) {
      try {
         if (arg2 > -82) {
            method5343(false);
         }

         ++field10817;
         if (arg5.field9652 || class140.method1285(arg0, -11925) && class140.method1285(arg4, -11925)) {
            return new class419(arg5, 3553, arg3, arg1, arg0, arg4, true);
         } else {
            return arg5.field9700 ? new class419(arg5, 34037, arg3, arg1, arg0, arg4, true) : new class419(arg5, arg3, arg1, arg0, arg4, class510.method3964(arg0, (byte)101), class510.method3964(arg4, (byte)126), true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10825[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10825[5] : field10825[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "(B)Z",
      line = 26
   )
   public final boolean method1830(byte arg0) {
      try {
         ++field10821;
         int var2 = 67 % ((arg0 - -8) / 57);
         return true;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10825[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "<init>",
      descriptor = "(Lc;)V",
      line = 38
   )
   public class723(class652 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Z)V",
      line = 41
   )
   public static void method5343(boolean arg0) {
      try {
         field10824 = null;
         if (arg0) {
            method5342(118, -98, -116, -118, -101, (class652)null);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10825[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(II)V",
      line = 52
   )
   public static final void method5344(int arg0, int arg1) {
      try {
         class83.field1199 = arg1;
         ++field10818;
         class304 var2 = class594.field8740;
         synchronized(class594.field8740) {
            class594.field8740.method2551(true);
         }

         if (arg0 >= -95) {
            method5344(80, -71);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10825[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(ZZ)V",
      line = 66
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         ++field10815;
         if (arg0) {
            field10824 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10825[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "d",
      descriptor = "(B)V",
      line = 76
   )
   public static final void method5345(byte arg0) {
      boolean var1 = client.field1786;

      try {
         label26: {
            if (~class289.field4545.toLowerCase().indexOf(field10825[0]) == 0) {
               label23: {
                  class586.field8662[44] = 71;
                  class586.field8662[92] = 74;
                  if (class289.field4561 == null) {
                     class586.field8662[192] = 58;
                     class586.field8662[222] = 59;
                     if (!var1) {
                        break label23;
                     }
                  }

                  class586.field8662[192] = 28;
                  class586.field8662[222] = 58;
                  class586.field8662[520] = 59;
               }

               class586.field8662[93] = 43;
               class586.field8662[59] = 57;
               class586.field8662[61] = 27;
               class586.field8662[46] = 72;
               class586.field8662[47] = 73;
               class586.field8662[91] = 42;
               class586.field8662[45] = 26;
               if (!var1) {
                  break label26;
               }
            }

            class586.field8662[189] = 26;
            class586.field8662[221] = 43;
            class586.field8662[188] = 71;
            class586.field8662[186] = 57;
            class586.field8662[190] = 72;
            class586.field8662[222] = 59;
            class586.field8662[220] = 74;
            class586.field8662[192] = 58;
            class586.field8662[191] = 73;
            class586.field8662[187] = 27;
            class586.field8662[219] = 42;
            class586.field8662[223] = 28;
         }

         ++field10820;
         int var2 = -90 % ((-38 - arg0) / 45);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10825[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "c",
      descriptor = "(B)V",
      line = 126
   )
   public final void method1827(byte arg0) {
      try {
         ++field10822;
         super.field6445.method4801(false, true);
         if (arg0 != 77) {
            field10824 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10825[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Lvda;IB)V",
      line = 137
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         ++field10816;
         if (arg2 >= -29) {
            method5344(-68, -34);
         }

         super.field6445.method4792(-26367, arg0);
         super.field6445.method4765(arg1, (byte)-3);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10825[6] + (arg0 != null ? field10825[5] : field10825[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(ZI)V",
      line = 151
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         ++field10819;
         super.field6445.method4801(true, true);
         if (arg1 != 3211) {
            field10824 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10825[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(III)V",
      line = 162
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      try {
         ++field10823;
         if (arg1 >= -90) {
            field10824 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10825[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5346(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5347(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
