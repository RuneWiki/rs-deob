import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class605 {
   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8841 = new String[]{method4470(method4469("Xi\u0004eP\u0019")), method4470(method4469("Xi\u0004eS\u0019")), method4470(method4469("Xi\u0004eQ\u0019"))};
   @OriginalMember(
      owner = "client!ija",
      name = "d",
      descriptor = "I"
   )
   public static int field8834 = 1;
   @OriginalMember(
      owner = "client!ija",
      name = "e",
      descriptor = "F"
   )
   public static float field8837;
   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "I"
   )
   public static int field8835;
   @OriginalMember(
      owner = "client!ija",
      name = "g",
      descriptor = "I"
   )
   public static int field8836;
   @OriginalMember(
      owner = "client!ija",
      name = "b",
      descriptor = "I"
   )
   public static int field8838;
   @OriginalMember(
      owner = "client!ija",
      name = "c",
      descriptor = "Lija;"
   )
   public class605 field8840;
   @OriginalMember(
      owner = "client!ija",
      name = "f",
      descriptor = "Ldn;"
   )
   public class78 field8839;

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4466(int arg0, byte arg1, int arg2) {
      try {
         ++field8836;
         if (arg1 > -53) {
            method4467(101, (byte)-31);
         }

         return class31.method223(arg0, arg2, (byte)61) & class645.method4692(arg0, 0, arg2);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8841[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method4467(int arg0, byte arg1) {
      try {
         ++field8838;
         if (arg1 < 16) {
            return 96;
         } else if (~arg0 != -6408 && arg0 != 34843 && arg0 != 34837) {
            if (arg0 != 6408 && ~arg0 != -34843 && arg0 != 34836) {
               if (~arg0 != -6407 && ~arg0 != -34845) {
                  if (~arg0 != -6410 && arg0 != 34846) {
                     if (arg0 != 6410 && ~arg0 != -34848) {
                        if (~arg0 == -6403) {
                           return 6402;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6410;
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6406;
               }
            } else {
               return 6408;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8841[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4468(byte arg0) {
      try {
         ++field8835;
         if (arg0 != 83) {
            field8834 = -121;
         }

         if (class99.field1391 < 500) {
            this.field8840 = class583.field8607;
            this.field8839 = null;
            ++class99.field1391;
            class583.field8607 = this;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8841[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4469(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4470(char[] arg0) {
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
            var10005 = 3;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
