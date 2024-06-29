import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class487 extends class195 implements class485 {
   @OriginalMember(
      owner = "client!sj",
      name = "u",
      descriptor = "I"
   )
   private int field6951;
   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6960 = new String[]{method3538(method3537("\u00178\u0002;^")), method3538(method3537("\u00178\u00026^")), method3538(method3537("\u001f|\u0002\\\u000b")), method3538(method3537("\u00178\u0002N\u001f\n;XL^")), method3538(method3537("\n'@\u001e")), method3538(method3537("\u00178\u00028^")), method3538(method3537("\u00178\u00029^")), method3538(method3537("\u00178\u00021^")), method3538(method3537("\u00178\u0002>^")), method3538(method3537("\u00178\u00023^")), method3538(method3537("\u00178\u00027^")), method3538(method3537("\u00178\u00020^"))};
   @OriginalMember(
      owner = "client!sj",
      name = "q",
      descriptor = "I"
   )
   public static int field6950;
   @OriginalMember(
      owner = "client!sj",
      name = "p",
      descriptor = "I"
   )
   public static int field6952;
   @OriginalMember(
      owner = "client!sj",
      name = "r",
      descriptor = "I"
   )
   public static int field6953;
   @OriginalMember(
      owner = "client!sj",
      name = "s",
      descriptor = "I"
   )
   public static int field6955;
   @OriginalMember(
      owner = "client!sj",
      name = "n",
      descriptor = "I"
   )
   public static int field6956;
   @OriginalMember(
      owner = "client!sj",
      name = "v",
      descriptor = "I"
   )
   public static int field6957;
   @OriginalMember(
      owner = "client!sj",
      name = "o",
      descriptor = "I"
   )
   public static int field6958;
   @OriginalMember(
      owner = "client!sj",
      name = "m",
      descriptor = "I"
   )
   public static int field6959;
   @OriginalMember(
      owner = "client!sj",
      name = "t",
      descriptor = "Lkf;"
   )
   public static class266 field6954;

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method3517(boolean arg0) {
      try {
         if (!arg0) {
            this.method1529((byte)56);
         }

         ++field6959;
         return this.field6951;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6960[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method3516(int arg0) {
      try {
         ++field6952;
         if (arg0 <= 71) {
            this.field6951 = -18;
         }

         return 0L;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6960[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1529(byte arg0) {
      try {
         int var2 = -70 % ((-43 - arg0) / 57);
         super.field2762.method4097(this, (byte)61);
         ++field6956;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6960[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3533(byte arg0) {
      try {
         if (arg0 != 21) {
            method3536(-30);
         }

         ++field6957;
         if (~class594.field8738 == -2 || class594.field8738 == 3 || class594.field8738 != class26.field413 && (~class594.field8738 == -1 || ~class26.field413 == -1)) {
            class213.field3041 = 0;
            class475.field6836 = 0;
            class328.field4479.method334((byte)127);
         }

         class26.field413 = class594.field8738;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6960[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Lka;IIII)Lmk;"
   )
   public static final class62 method3534(class500 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6955;
         if (arg0 == null) {
            return null;
         } else {
            if (arg2 != -1) {
               field6954 = null;
            }

            return new class62(arg1, arg3, arg4, arg0.method174(), arg0.method199(), arg0.method220(), arg0.method226(), arg0.method201(), arg0.method197(), arg0.method162());
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6960[9] + (arg0 != null ? field6960[2] : field6960[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "<init>",
      descriptor = "(Lea;ILjaclib/memory/Buffer;IZ)V"
   )
   public class487(class573 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field6951 = arg1;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6960[3] + (arg0 != null ? field6960[2] : field6960[4]) + ',' + arg1 + ',' + (arg2 != null ? field6960[2] : field6960[4]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3535(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         label35: {
            if (class457.field6528 > -arg2 + arg0 || arg0 + arg2 > class348.field4702 || ~class245.field3374 < ~(arg1 - arg2) || class699.field10237 < arg1 + arg2) {
               class172.method1399(-23905, arg1, arg2, arg0, arg4);
               if (!client.field4360) {
                  break label35;
               }
            }

            class147.method1212(arg2, -120, arg1, arg4, arg0);
         }

         ++field6953;
         if (arg3 != 1493) {
            method3533((byte)-31);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6960[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3536(int arg0) {
      try {
         if (arg0 != -29729) {
            field6954 = null;
         }

         field6954 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6960[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "<init>",
      descriptor = "(Lea;I[BIZ)V"
   )
   public class487(class573 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field6951 = arg1;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6960[3] + (arg0 != null ? field6960[2] : field6960[4]) + ',' + arg1 + ',' + (arg2 != null ? field6960[2] : field6960[4]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(II[BZ)V"
   )
   public final void method3519(int arg0, int arg1, byte[] arg2, boolean arg3) {
      try {
         this.method1531(arg0, arg2, arg3);
         ++field6950;
         this.field6951 = arg1;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6960[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6960[2] : field6960[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3518(int arg0) {
      try {
         int var2 = -124 / ((arg0 - -28) / 38);
         ++field6958;
         return super.field2763;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6960[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3537(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3538(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
