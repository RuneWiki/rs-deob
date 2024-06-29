import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class256 {
   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3482 = new String[]{method1961(method1960("\u000b\u0016or\u0004")), method1961(method1960("\u0012Ro\u001fQ")), method1961(method1960("\u0007\t-]")), method1961(method1960("\u000b\u0016ow\u0004")), method1961(method1960("\u000b\u0016ou\u0004"))};
   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "I"
   )
   public static int field3479 = 0;
   @OriginalMember(
      owner = "client!bj",
      name = "d",
      descriptor = "I"
   )
   public static int field3478;
   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "I"
   )
   public static int field3480;
   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "I"
   )
   public static int field3481;

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1956(byte arg0) {
      try {
         ++field3481;
         class493.field7038.method731(arg0 ^ -128);
         class409.field5909.method731(0);
         class198.field2811.method731(0);
         class155.field2212.method731(0);
         if (arg0 != -128) {
            method1957((byte)-22, (String)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3482[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(JI)I"
   )
   public abstract int method1741(long arg0, int arg1);

   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method1740(byte arg0);

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(I)J"
   )
   public abstract long method1739(int arg0);

   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "(B)J"
   )
   public abstract long method1742(byte arg0);

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method1957(byte arg0, String arg1) {
      try {
         ++field3478;
         if (class408.field5907 != null) {
            ++class744.field10840;
            class10 var2 = class292.method2192(-9730);
            if (arg0 != -105) {
               field3479 = 15;
            }

            class447 var3 = class40.method350(class745.field10904, var2.field106, true);
            var3.field6359.method1186(class89.method783(1, arg1), 0);
            var3.field6359.method1195((byte)120, arg1);
            var2.method55(13256, var3);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3482[0] + arg0 + ',' + (arg1 != null ? field3482[1] : field3482[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IJ)I"
   )
   public final int method1958(int arg0, long arg1) {
      try {
         ++field3480;
         long var4 = this.method1739(0);
         if (arg0 != -27577) {
            field3479 = -90;
         }

         if (~var4 < -1L) {
            class661.method4825(0, var4);
         }

         return this.method1741(arg1, arg0 ^ -27642);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3482[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IIILol;Lol;)V"
   )
   public static final void method1959(int arg0, int arg1, int arg2, class300 arg3, class300 arg4) {
      class517 var5 = class179.method1431(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field7474 = arg3;
         var5.field7475 = arg4;
         int var6 = class757.field11220 == class731.field10698 ? 1 : 0;
         if (arg3.method253((byte)117)) {
            if (arg3.method238((byte)105)) {
               arg3.field10695 = class392.field5677[var6];
               class392.field5677[var6] = arg3;
            } else {
               arg3.field10695 = class591.field8705[var6];
               class591.field8705[var6] = arg3;
               class171.field2384 = true;
            }
         } else {
            arg3.field10695 = class756.field11204[var6];
            class756.field11204[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method253((byte)-124)) {
               if (arg4.method238((byte)96)) {
                  arg4.field10695 = class392.field5677[var6];
                  class392.field5677[var6] = arg4;
                  return;
               }

               arg4.field10695 = class591.field8705[var6];
               class591.field8705[var6] = arg4;
               class171.field2384 = true;
               return;
            }

            arg4.field10695 = class756.field11204[var6];
            class756.field11204[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1960(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1961(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
