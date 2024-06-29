import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class669 {
   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10067 = new String[]{method4869(method4868("O\u0006:^\u0015")), method4869(method4868("D@:2@")), method4869(method4868("Z]x\u001c")), method4869(method4868("D@:1@")), method4869(method4868("D@:3@"))};
   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "I"
   )
   public static int field10062 = 0;
   @OriginalMember(
      owner = "client!ph",
      name = "c",
      descriptor = "I"
   )
   public static int field10063;
   @OriginalMember(
      owner = "client!ph",
      name = "d",
      descriptor = "I"
   )
   public static int field10064;
   @OriginalMember(
      owner = "client!ph",
      name = "e",
      descriptor = "I"
   )
   public static int field10065;
   @OriginalMember(
      owner = "client!ph",
      name = "b",
      descriptor = "Leaa;"
   )
   public static class526 field10066;

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4865(byte arg0) {
      try {
         field10066 = null;
         if (arg0 > -116) {
            field10064 = -80;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10067[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Lha;Lhv;IIII)V"
   )
   public static final void method4866(class66 arg0, class544 arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field10063;
         int var7 = 7;
         if (arg3 != 21988) {
            field10066 = null;
            if (var6 == 0 && ~var7 > -1) {
               return;
            }
         } else if (~var7 > -1) {
            return;
         }

         do {
            label63: {
               int var8 = 127;
               if (var6 != 0) {
                  class301.method2294(-7208, false, true);
               } else if (var8 < 0) {
                  if (var6 == 0) {
                     break label63;
                  }
               } else {
                  class301.method2294(-7208, false, true);
               }

               while(true) {
                  int var9 = var8 & 127 | (7 & var7) << 7 | (arg4 & 63) << 10;
                  int var10 = class628.field9131[var9];
                  class442.method3343(true, false, (byte)-106);
                  arg0.method645((arg1.field7986 * var8 >> 7) + arg5, ((-var7 + 7) * arg1.field7954 >> 3) + arg2, (arg1.field7986 >> 7) - -1, (arg1.field7954 >> 3) - -1, var10, 0);
                  --var8;
                  if (var8 < 0) {
                     if (var6 == 0) {
                        break;
                     }
                  } else {
                     class301.method2294(-7208, false, true);
                  }
               }
            }

            --var7;
         } while(~var7 <= -1);

      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10067[1] + (arg0 != null ? field10067[0] : field10067[2]) + ',' + (arg1 != null ? field10067[0] : field10067[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "([Ljava/lang/Object;I[JII)V"
   )
   public static final void method4867(Object[] param0, int param1, long[] param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4868(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4869(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
