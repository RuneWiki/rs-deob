import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class218 extends class490 {
   @OriginalMember(
      owner = "client!sa",
      name = "u",
      descriptor = "I"
   )
   private int field3121;
   @OriginalMember(
      owner = "client!sa",
      name = "r",
      descriptor = "I"
   )
   private int field3112;
   @OriginalMember(
      owner = "client!sa",
      name = "n",
      descriptor = "I"
   )
   private int field3120;
   @OriginalMember(
      owner = "client!sa",
      name = "w",
      descriptor = "I"
   )
   private int field3123;
   @OriginalMember(
      owner = "client!sa",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3127 = new String[]{method1723(method1722("\rk\u0001\u000bK")), method1723(method1722("\u00180CI")), method1723(method1722("\u0005$\u0001m\u001e")), method1723(method1722("\u0005$\u0001l\u001e")), method1723(method1722("\u0005$\u0001a\u001e")), method1723(method1722("\u0005$\u0001n\u001e")), method1723(method1722("\u0005$\u0001b\u001e")), method1723(method1722("\u0005$\u0001\u0019_\u0018,[\u001b\u001e")), method1723(method1722("\u0005$\u0001o\u001e")), method1723(method1722("\u0005$\u0001f\u001e"))};
   @OriginalMember(
      owner = "client!sa",
      name = "p",
      descriptor = "Leg;"
   )
   public static class118 field3122 = new class118(92, -1);
   @OriginalMember(
      owner = "client!sa",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field3126 = false;
   @OriginalMember(
      owner = "client!sa",
      name = "x",
      descriptor = "Leg;"
   )
   public static class118 field3124 = new class118(131, -2);
   @OriginalMember(
      owner = "client!sa",
      name = "y",
      descriptor = "I"
   )
   public static int field3111;
   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "I"
   )
   public static int field3113;
   @OriginalMember(
      owner = "client!sa",
      name = "v",
      descriptor = "I"
   )
   public static int field3114;
   @OriginalMember(
      owner = "client!sa",
      name = "l",
      descriptor = "I"
   )
   public static int field3115;
   @OriginalMember(
      owner = "client!sa",
      name = "q",
      descriptor = "I"
   )
   public static int field3117;
   @OriginalMember(
      owner = "client!sa",
      name = "s",
      descriptor = "I"
   )
   public static int field3118;
   @OriginalMember(
      owner = "client!sa",
      name = "A",
      descriptor = "I"
   )
   public static int field3119;
   @OriginalMember(
      owner = "client!sa",
      name = "m",
      descriptor = "Lefa;"
   )
   public static class197 field3125;
   @OriginalMember(
      owner = "client!sa",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field3116;

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(BII)V",
      line = 3
   )
   public final void method1644(byte arg0, int arg1, int arg2) {
      try {
         ++field3118;
         int var4 = 101 % ((75 - arg0) / 40);
         int var5 = this.field3121 * arg1 >> 12;
         int var6 = this.field3123 * arg1 >> 12;
         int var7 = this.field3120 * arg2 >> 12;
         int var8 = this.field3112 * arg2 >> 12;
         class147.method1159(var8, super.field7012, var7, super.field7017, -29877, super.field7015, var6, var5);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field3127[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Ldja;I)Z",
      line = 21
   )
   public static final boolean method1718(class326 arg0, int arg1) {
      try {
         ++field3115;
         if (arg0 == null) {
            return false;
         } else if (!arg0.field4426) {
            return false;
         } else if (arg1 != 131) {
            return true;
         } else if (!arg0.method2418((byte)-66, class650.field9489)) {
            return false;
         } else if (class597.field8782.method329((byte)114, (long)arg0.field4421) != null) {
            return false;
         } else {
            return class629.field9235.method329((byte)102, (long)arg0.field4447) == null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3127[2] + (arg0 != null ? field3127[0] : field3127[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(II)Ljava/lang/String;",
      line = 55
   )
   public static final String method1719(int arg0, int arg1) {
      try {
         if (arg0 != -5820) {
            field3125 = null;
         }

         ++field3113;
         return (arg1 >> 24 & 255) + "." + (arg1 >> 16 & 255) + "." + ((arg1 & 65377) >> 8) + "." + (255 & arg1);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3127[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "(III)V",
      line = 68
   )
   public final void method1646(int arg0, int arg1, int arg2) {
      try {
         ++field3111;
         int var4 = this.field3121 * arg1 >> 12;
         int var5 = this.field3123 * arg1 >> 12;
         int var6 = this.field3120 * arg2 >> 12;
         if (arg0 == 30078) {
            int var7 = this.field3112 * arg2 >> 12;
            class130.method1034(var4, var7, var6, super.field7015, -11987, var5);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3127[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Z[S)[S",
      line = 89
   )
   public static final short[] method1720(boolean arg0, short[] arg1) {
      try {
         ++field3117;
         if (arg1 == null) {
            return null;
         } else {
            if (arg0) {
               method1718((class326)null, 109);
            }

            short[] var2 = new short[arg1.length];
            class242.method1851(arg1, 0, var2, 0, arg1.length);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3127[3] + arg0 + ',' + (arg1 != null ? field3127[0] : field3127[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "<init>",
      descriptor = "(IIIIIII)V",
      line = 111
   )
   public class218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field3121 = arg0;
         this.field3112 = arg3;
         this.field3120 = arg1;
         this.field3123 = arg2;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3127[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "c",
      descriptor = "(III)V",
      line = 124
   )
   public final void method1645(int arg0, int arg1, int arg2) {
      try {
         ++field3114;
         int var4 = this.field3121 * arg1 >> 12;
         int var5 = 98 / ((39 - arg2) / 45);
         int var6 = this.field3123 * arg1 >> 12;
         int var7 = this.field3120 * arg0 >> 12;
         int var8 = this.field3112 * arg0 >> 12;
         class666.method4854(var6, super.field7017, var8, super.field7012, -99, var4, var7);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field3127[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "(B)V",
      line = 144
   )
   public static void method1721(byte arg0) {
      try {
         field3125 = null;
         field3124 = null;
         field3122 = null;
         if (arg0 <= 111) {
            method1719(88, -24);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3127[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1722(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1723(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
