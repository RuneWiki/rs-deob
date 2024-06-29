import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class535 {
   @OriginalMember(
      owner = "client!jq",
      name = "h",
      descriptor = "J"
   )
   private long field7792;
   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "I"
   )
   private int field7795;
   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7797 = new String[]{method4012(method4011("vlrlx")), method4012(method4011("rh0G")), method4012(method4011("g3r\u0005-")), method4012(method4011("vlrix")), method4012(method4011("vlr\u00179rt(\u0015x")), method4012(method4011("vlrhx")), method4012(method4011("vlrnx")), method4012(method4011("vlrjx")), method4012(method4011("vlrox")), method4012(method4011("vlrmx"))};
   @OriginalMember(
      owner = "client!jq",
      name = "e",
      descriptor = "I"
   )
   public static int field7787 = 0;
   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field7794 = new int[8];
   @OriginalMember(
      owner = "client!jq",
      name = "c",
      descriptor = "I"
   )
   public static int field7786;
   @OriginalMember(
      owner = "client!jq",
      name = "i",
      descriptor = "I"
   )
   public static int field7788;
   @OriginalMember(
      owner = "client!jq",
      name = "k",
      descriptor = "I"
   )
   public static int field7790;
   @OriginalMember(
      owner = "client!jq",
      name = "j",
      descriptor = "I"
   )
   public static int field7791;
   @OriginalMember(
      owner = "client!jq",
      name = "g",
      descriptor = "I"
   )
   public static int field7793;
   @OriginalMember(
      owner = "client!jq",
      name = "d",
      descriptor = "I"
   )
   public static int field7796;
   @OriginalMember(
      owner = "client!jq",
      name = "f",
      descriptor = "Lfca;"
   )
   public static class92 field7789;

   @OriginalMember(
      owner = "client!jq",
      name = "c",
      descriptor = "(II)I"
   )
   public static final int method4004(int arg0, int arg1) {
      try {
         ++field7796;
         return arg0 <= 12 ? 116 : arg1 & 1023;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7797[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4005(int arg0) {
      try {
         int var1 = -95 % ((-6 - arg0) / 55);
         field7789 = null;
         field7794 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7797[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "(II)Loca;"
   )
   public final class274 method4006(int arg0, int arg1) {
      try {
         ++field7790;
         if (arg1 != 0) {
            field7789 = null;
         }

         return class274.method2159(this.method4009(arg0, 1023), -7);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7797[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(ILoca;)V"
   )
   private final void method4007(int arg0, class274 arg1) {
      try {
         ++field7788;
         this.field7792 |= (long)(arg1.field3882 << class274.field3890 * this.field7795++);
         if (arg0 < 119) {
            method4008(89);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7797[0] + arg0 + ',' + (arg1 != null ? field7797[2] : field7797[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4008(int arg0) {
      try {
         ++field7793;
         if (class277.field3907 != -1) {
            int var1 = class315.field4531.method1630(true);
            int var2 = class315.field4531.method1632(-110);
            class380 var3 = (class380)class489.field7140.method2579(-801);
            if (var3 != null) {
               var1 = var3.method1284((byte)64);
               var2 = var3.method1278(2);
            }

            int var4 = arg0;
            int var5 = 0;
            if (class262.field3734) {
               var4 = class124.method1174((byte)-30);
               var5 = class745.method5410(-94);
            }

            class727.method5253(class277.field3907, var2 + var5, var1, var4, class218.field3296 + var5, arg0 + 127, var2, var4, class720.field10406 + var4, var1 + var4, var5, var5);
            if (class30.field471 != null) {
               class317.method2481(true, var2 + var5, var1 + var4);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7797[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method4009(int arg0, int arg1) {
      try {
         ++field7791;
         if (arg1 != 1023) {
            this.field7792 = -4L;
         }

         return 15 & (int)(this.field7792 >> class274.field3890 * arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7797[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "<init>",
      descriptor = "(Loca;)V"
   )
   public class535(class274 arg0) {
      try {
         this.field7792 = (long)arg0.field3882;
         this.field7795 = 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7797[4] + (arg0 != null ? field7797[2] : field7797[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method4010(byte arg0) {
      try {
         if (arg0 != 7) {
            return 109;
         } else {
            ++field7786;
            return this.field7795;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7797[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "<init>",
      descriptor = "([Loca;)V"
   )
   public class535(class274[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4011(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4012(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
