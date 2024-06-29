import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class274 {
   @OriginalMember(
      owner = "client!dm",
      name = "i",
      descriptor = "I"
   )
   public int field4180;
   @OriginalMember(
      owner = "client!dm",
      name = "h",
      descriptor = "Laea;"
   )
   private class678 field4171;
   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4183 = new String[]{method2323(method2322("\fPOpQ")), method2323(method2322("\fPOwQ")), method2323(method2322("\fPOvQ")), method2323(method2322("\fPOR\u0010\u0006\\\r]\u0003\r\u0015")), method2323(method2322("\u0006H\rX")), method2323(method2322("\u0013\u0013O\u001a\u0004")), method2323(method2322("\fPO\b\u0010\u0006T\u0015\nQ")), method2323(method2322("\fPOuQ")), method2323(method2322("\fPOqQ"))};
   @OriginalMember(
      owner = "client!dm",
      name = "c",
      descriptor = "Lhha;"
   )
   public static class724 field4178 = new class724(46, -2);
   @OriginalMember(
      owner = "client!dm",
      name = "l",
      descriptor = "Lat;"
   )
   public static class176 field4179 = new class176();
   @OriginalMember(
      owner = "client!dm",
      name = "b",
      descriptor = "I"
   )
   public static int field4182 = 0;
   @OriginalMember(
      owner = "client!dm",
      name = "k",
      descriptor = "I"
   )
   public static int field4172;
   @OriginalMember(
      owner = "client!dm",
      name = "e",
      descriptor = "I"
   )
   public static int field4174;
   @OriginalMember(
      owner = "client!dm",
      name = "j",
      descriptor = "I"
   )
   public static int field4175;
   @OriginalMember(
      owner = "client!dm",
      name = "g",
      descriptor = "I"
   )
   public static int field4177;
   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "I"
   )
   public static int field4181;
   @OriginalMember(
      owner = "client!dm",
      name = "f",
      descriptor = "Lua;"
   )
   public static class569 field4173;
   @OriginalMember(
      owner = "client!dm",
      name = "d",
      descriptor = "[Lsaa;"
   )
   public static class425[] field4176;

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(ZZB)V"
   )
   public static final void method2317(boolean arg0, boolean arg1, byte arg2) {
      try {
         if (arg1) {
            ++class405.field5957;
            class536.method3995((byte)-3);
         }

         if (arg2 == 24) {
            ++field4175;
            if (arg0) {
               ++class748.field10641;
               class729.method5285((byte)87);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4183[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method2318(int arg0, byte arg1) {
      try {
         ++field4181;
         int var2 = -68 % ((arg1 - 4) / 47);
         return ~arg0 == -8 || ~arg0 == -10;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4183[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method2319(int arg0, int arg1, int arg2, int arg3) {
      try {
         class366.field5422.method332(arg0, arg3, arg1, class322.field4806);
         ++field4174;
         if (arg2 != -10) {
            return false;
         } else {
            int var4 = class322.field4806[2];
            if (~var4 > -51) {
               return false;
            } else {
               class322.field4806[2] = var4;
               class322.field4806[1] = class322.field4806[1] * class156.field2385 / var4 + class175.field2600;
               class322.field4806[0] = class322.field4806[0] * class412.field6048 / var4 + class710.field10191;
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4183[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(B)[Lcv;"
   )
   public static final class249[] method2320(byte arg0) {
      try {
         if (arg0 != 27) {
            field4178 = null;
         }

         ++field4177;
         return new class249[]{class767.field11001, class211.field3018, class409.field5996};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4183[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field4172;
         this.field4171.method4929(-30912, this.field4180);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4183[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2321(int arg0) {
      try {
         if (arg0 != 0) {
            field4182 = 123;
         }

         field4173 = null;
         field4179 = null;
         field4176 = null;
         field4178 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4183[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "<init>",
      descriptor = "(Laea;II)V"
   )
   public class274(class678 arg0, int arg1, int arg2) {
      try {
         this.field4180 = arg2;
         this.field4171 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4183[6] + (arg0 != null ? field4183[5] : field4183[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2322(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2323(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
