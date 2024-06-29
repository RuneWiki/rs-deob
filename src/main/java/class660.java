import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class660 {
   @OriginalMember(
      owner = "client!sn",
      name = "g",
      descriptor = "Ltv;"
   )
   private class590 field9409 = new class590(128);
   @OriginalMember(
      owner = "client!sn",
      name = "m",
      descriptor = "Lqh;"
   )
   private class74 field9408;
   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9420 = new String[]{method4794(method4793("^?'.")), method4794(method4793("C$e~S^#?|\u0012")), method4794(method4793("KdelG")), method4794(method4793("C$e\u0000\u0012")), method4794(method4793("C$e\u0003\u0012")), method4794(method4793("C$e\u0007\u0012")), method4794(method4793("V#*")), method4794(method4793("C$e\u0001\u0012")), method4794(method4793("X8")), method4794(method4793("C$e\u0006\u0012"))};
   @OriginalMember(
      owner = "client!sn",
      name = "i",
      descriptor = "Lnw;"
   )
   public static class616 field9410 = new class616(16, 3);
   @OriginalMember(
      owner = "client!sn",
      name = "e",
      descriptor = "Lnw;"
   )
   public static class616 field9413 = new class616(19, -1);
   @OriginalMember(
      owner = "client!sn",
      name = "k",
      descriptor = "I"
   )
   public static int field9416 = 0;
   @OriginalMember(
      owner = "client!sn",
      name = "f",
      descriptor = "I"
   )
   public static int field9417 = -1;
   @OriginalMember(
      owner = "client!sn",
      name = "n",
      descriptor = "F"
   )
   public static float field9414;
   @OriginalMember(
      owner = "client!sn",
      name = "d",
      descriptor = "I"
   )
   public static int field9406;
   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "I"
   )
   public static int field9407;
   @OriginalMember(
      owner = "client!sn",
      name = "h",
      descriptor = "I"
   )
   public static int field9411;
   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "I"
   )
   public static int field9412;
   @OriginalMember(
      owner = "client!sn",
      name = "j",
      descriptor = "Lbj;"
   )
   public static class255 field9415;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!sn",
      name = "l",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9418;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9419;

   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method4787(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field9411;
         int var2 = 0;
         Field[] var3 = (field9418 != null ? field9418 : (field9418 = method4792(field9420[6]))).getDeclaredFields();
         Field[] var4 = var3;
         int var5 = -14 / ((arg0 - 60) / 39);
         int var6 = 0;
         if (!var1 && var6 >= var3.length) {
            return var2 + 1;
         } else {
            do {
               Field var7 = var4[var6];
               if ((field9419 != null ? field9419 : (field9419 = method4792(field9420[8]))).isAssignableFrom(var7.getType())) {
                  ++var2;
               }

               ++var6;
            } while(var6 < var4.length);

            return var2 + 1;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9420[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4788(int arg0, int arg1) {
      try {
         class706.field10249 = arg1;
         ++field9406;
         class590 var2 = class468.field6450;
         synchronized(class468.field6450) {
            class468.field6450.method4245(true);
         }

         class590 var3 = class305.field4046;
         synchronized(class305.field4046) {
            if (arg0 != -25055) {
               field9413 = null;
            }

            class305.field4046.method4245(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9420[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4789(byte arg0) {
      try {
         ++field9412;
         class243.field3036.method172(-111);
         if (arg0 != 1) {
            field9413 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9420[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(II)Lnha;"
   )
   public final class342 method4790(int arg0, int arg1) {
      try {
         ++field9407;
         class590 var3 = this.field9409;
         class342 var5;
         synchronized(this.field9409) {
            if (arg1 > -75) {
               return null;
            }

            var5 = (class342)this.field9409.method4239((long)arg0, 0);
         }

         if (var5 != null) {
            return var5;
         } else {
            byte[] var6 = this.field9408.method732(class396.method3010(109, arg0), class688.method5021(-18757, arg0), (byte)61);
            class342 var7 = new class342();
            if (var6 != null) {
               var7.method2709(new class594(var6), true);
            }

            class590 var8 = this.field9409;
            synchronized(this.field9409) {
               this.field9409.method4238(105, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field9420[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4791(int arg0) {
      try {
         field9413 = null;
         field9415 = null;
         if (arg0 <= 120) {
            method4789((byte)-123);
         }

         field9410 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9420[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class660(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field9408 = arg2;
         if (this.field9408 != null) {
            int var4 = -1 + this.field9408.method719(true);
            this.field9408.method727(var4, -32767);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9420[1] + (arg0 != null ? field9420[2] : field9420[0]) + ',' + arg1 + ',' + (arg2 != null ? field9420[2] : field9420[0]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4792(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
