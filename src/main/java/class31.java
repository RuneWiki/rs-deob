import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class31 {
   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field386 = new String[]{method226(method225("c\u0001AH,")), method226(method225("c\u0001AM,")), method226(method225("c\u0001AO,")), method226(method225("c\u0001AN,"))};
   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "I"
   )
   public static int field383;
   @OriginalMember(
      owner = "client!nj",
      name = "b",
      descriptor = "I"
   )
   public static int field384;
   @OriginalMember(
      owner = "client!nj",
      name = "d",
      descriptor = "I"
   )
   public static int field385;
   @OriginalMember(
      owner = "client!nj",
      name = "e",
      descriptor = "Led;"
   )
   public static class47 field381;
   @OriginalMember(
      owner = "client!nj",
      name = "c",
      descriptor = "[Ljia;"
   )
   public static class426[] field382;

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method217(byte arg0) {
      try {
         field381 = null;
         if (arg0 > -54) {
            field381 = null;
         }

         field382 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field386[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public static final void method218(int arg0, int arg1, byte arg2, int arg3) {
      try {
         if (arg2 > -82) {
            method223(-19, -80, (byte)-103);
         }

         int var7 = arg1 * class687.field10213.field543.method1774(480102311) >> 8;
         ++field385;
         if (var7 != 0 && arg0 != -1) {
            if (!class176.field2762 && class77.field1033 != -1 && class85.method826(3374) && !class753.method5523(13356)) {
               class261.field4290 = class370.method3028(-1594584884);
               class80 var4 = class562.method4238(class261.field4290, 42);
               class407.method3266(0, var4, true);
            }

            class228.method1975(class455.field6954, 0, 71, var7, false, arg0);
            class637.method4659(true, -1, 255);
            class176.field2762 = true;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field386[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(IB)Z"
   )
   public abstract boolean method219(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method220(int arg0, int arg1, int arg2) {
      try {
         ++field383;
         if (arg1 >= 1000 && ~arg2 > -1001) {
            return true;
         } else if (arg1 < arg0 && arg2 < 1000) {
            if (class721.method5331(arg2, (byte)50)) {
               return true;
            } else {
               return !class721.method5331(arg1, (byte)50);
            }
         } else {
            return ~arg1 <= -1001 && arg2 >= 1000;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field386[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "c",
      descriptor = "(B)V"
   )
   public abstract void method221(byte arg0);

   @OriginalMember(
      owner = "client!nj",
      name = "b",
      descriptor = "(B)Lkc;"
   )
   public abstract class132 method222(byte arg0);

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method223(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 61) {
            method217((byte)-20);
         }

         ++field384;
         return ~(arg0 & 16) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field386[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method224(boolean arg0);

   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method225(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method226(char[] arg0) {
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
            var10005 = 107;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
