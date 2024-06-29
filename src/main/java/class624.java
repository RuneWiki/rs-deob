import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class624 implements class726 {
   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "Lhw;"
   )
   private class141 field9086;
   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9091 = new String[]{method4573(method4572("\u0000(H")), method4573(method4572("\u0001 E\u0003~")), method4573(method4572("\u0001 I")), method4573(method4572("\n%\u00051.")), method4573(method4572("\u0016g\u0005X{")), method4573(method4572("C-R\u001ao\u000f")), method4573(method4572("\u0003<G\u001a")), method4573(method4572("\u001a E")), method4573(method4572("C-G\u001a")), method4573(method4572("C:D")), method4573(method4572("\n%\u00054.")), method4573(method4572("\n%\u0005Jo\u0003 _H.")), method4573(method4572("\n%\u00057.")), method4573(method4572("\n%\u00050.")), method4573(method4572("\n%\u00055.")), method4573(method4572("\n%\u00053.")), method4573(method4572("\n%\u00052."))};
   @OriginalMember(
      owner = "client!gl",
      name = "i",
      descriptor = "I"
   )
   public static int field9083 = 0;
   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field9089 = new class435(77, -1);
   @OriginalMember(
      owner = "client!gl",
      name = "g",
      descriptor = "Liw;"
   )
   public static class332 field9090 = new class332();
   @OriginalMember(
      owner = "client!gl",
      name = "j",
      descriptor = "I"
   )
   public static int field9081;
   @OriginalMember(
      owner = "client!gl",
      name = "d",
      descriptor = "I"
   )
   public static int field9082;
   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "I"
   )
   public static int field9084;
   @OriginalMember(
      owner = "client!gl",
      name = "e",
      descriptor = "I"
   )
   public static int field9085;
   @OriginalMember(
      owner = "client!gl",
      name = "f",
      descriptor = "I"
   )
   public static int field9087;
   @OriginalMember(
      owner = "client!gl",
      name = "h",
      descriptor = "I"
   )
   public static int field9088;

   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4567(byte arg0) {
      try {
         field9089 = null;
         if (arg0 >= -109) {
            field9083 = 115;
         }

         field9090 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9091[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(IIBLjfa;)V"
   )
   public static final void method4568(int arg0, int arg1, byte arg2, class303 arg3) {
      try {
         class547.field7908 = arg1;
         class25.field375 = arg0;
         ++field9087;
         class12.field123 = arg3;
         if (arg2 != -60) {
            field9083 = -81;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9091[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9091[4] : field9091[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(BJ)V"
   )
   public static final void method4569(byte arg0, long arg1) {
      try {
         if (arg0 == 98) {
            ++field9082;
            if (~arg1 < -1L) {
               if (arg1 % 10L == 0L) {
                  class401.method3087(1, arg1 + -1L);
                  class401.method3087(1, 1L);
               } else {
                  class401.method3087(arg0 ^ 99, arg1);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9091[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;"
   )
   public static final String method4570(String arg0, byte arg1) {
      try {
         if (arg1 <= 28) {
            return null;
         } else {
            ++field9088;
            if (class614.field8919.startsWith(field9091[7])) {
               return arg0 + field9091[8];
            } else if (!class614.field8919.startsWith(field9091[1])) {
               return class614.field8919.startsWith(field9091[0]) ? field9091[2] + arg0 + field9091[5] : null;
            } else {
               return field9091[2] + arg0 + field9091[9];
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9091[3] + (arg0 != null ? field9091[4] : field9091[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1379(byte arg0) {
      try {
         ++field9081;
         if (arg0 < 52) {
            field9089 = null;
         }

         return this.field9086.method1353(-127) ? 100 : this.field9086.method1349(105);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9091[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(B)Lpu;"
   )
   public final class586 method1382(byte arg0) {
      try {
         if (arg0 != 79) {
            method4569((byte)-85, -103L);
         }

         ++field9085;
         return class586.field8468;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9091[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4571(int arg0, int arg1, int arg2) {
      try {
         ++field9084;
         if (arg2 > -7) {
            method4570((String)null, (byte)40);
         }

         return (class670.method4906(arg1, 17464, arg0) | class413.method3155(arg0, arg1, -1) | class340.method2634(arg1, arg0, -46)) & class641.method4697(arg1, arg0, -1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9091[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "<init>",
      descriptor = "(Lhw;)V"
   )
   public class624(class141 arg0) {
      try {
         this.field9086 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9091[11] + (arg0 != null ? field9091[4] : field9091[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4573(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
