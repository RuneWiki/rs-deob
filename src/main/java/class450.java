import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class450 {
   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6892 = new String[]{method3534(method3533("\u0017%\n*<")), method3534(method3533("\u0017%\n(<")), method3534(method3533("\u001b%H\u0007")), method3534(method3533("\u000e~\nEi")), method3534(method3533("\u0017%\n)<"))};
   @OriginalMember(
      owner = "client!bu",
      name = "d",
      descriptor = "I"
   )
   public static int field6886 = 0;
   @OriginalMember(
      owner = "client!bu",
      name = "f",
      descriptor = "I"
   )
   public static int field6887;
   @OriginalMember(
      owner = "client!bu",
      name = "c",
      descriptor = "I"
   )
   public static int field6889;
   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "I"
   )
   public static int field6890;
   @OriginalMember(
      owner = "client!bu",
      name = "e",
      descriptor = "Lha;"
   )
   public static class610 field6888;
   @OriginalMember(
      owner = "client!bu",
      name = "b",
      descriptor = "Lrr;"
   )
   public static class678 field6891;

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(IIJ)Ljava/lang/String;",
      line = 10
   )
   public static final String method3530(int arg0, int arg1, long arg2) {
      try {
         ++field6889;
         class552.method4193(27444, arg2);
         int var4 = class406.field6327.get(5);
         if (arg1 != 8) {
            field6886 = 115;
         }

         int var5 = 1 + class406.field6327.get(2);
         int var6 = class406.field6327.get(1);
         return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6892[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(BLmja;III)Z",
      line = 30
   )
   public static final boolean method3531(byte arg0, class269 arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6890;
         if (class439.field6716 && class665.field9966) {
            if (~class84.field1223 > -101) {
               return false;
            } else if (!client.method1174(arg3, arg2, arg4, 117)) {
               return false;
            } else {
               int var5 = arg4 << class394.field6180;
               if (arg0 != 50) {
                  field6888 = null;
               }

               int var6 = arg3 << class394.field6180;
               int var7 = -1 + class385.field6076[arg2].method2313(-115, arg4, arg3);
               int var8 = arg1.method230(arg0 + -48) + var7;
               if (~arg1.field4361 == -2) {
                  if (!class355.method2909(var7, var8, var8, var5, var6 - -class678.field10091, var6, var6, var5, var5, 0)) {
                     return false;
                  } else if (!class355.method2909(var7, var8, var7, var5, class678.field10091 + var6, var6 - -class678.field10091, var6, var5, var5, 0)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else if (arg1.field4361 == 2) {
                  if (!class355.method2909(var7, var8, var8, var5, var6 - -class678.field10091, var6 - -class678.field10091, class678.field10091 + var6, class678.field10091 + var5, var5, 0)) {
                     return false;
                  } else if (!class355.method2909(var7, var7, var8, var5 - -class678.field10091, class678.field10091 + var6, class678.field10091 + var6, class678.field10091 + var6, class678.field10091 + var5, var5, 0)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else if (~arg1.field4361 == -5) {
                  if (!class355.method2909(var7, var8, var8, class678.field10091 + var5, class678.field10091 + var6, var6, var6, class678.field10091 + var5, class678.field10091 + var5, arg0 + -50)) {
                     return false;
                  } else if (!class355.method2909(var7, var8, var7, class678.field10091 + var5, class678.field10091 + var6, var6 - -class678.field10091, var6, class678.field10091 + var5, var5 - -class678.field10091, 0)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else if (arg1.field4361 == 8) {
                  if (!class355.method2909(var7, var8, var8, var5, var6, var6, var6, class678.field10091 + var5, var5, 0)) {
                     return false;
                  } else if (!class355.method2909(var7, var7, var8, var5 - -class678.field10091, var6, var6, var6, var5 - -class678.field10091, var5, 0)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else if (~arg1.field4361 == -17) {
                  if (!class404.method3248(var8, class42.field564, var6 - -class42.field564, var5, arg0 ^ 50, var7, class42.field564)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else if (arg1.field4361 == 32) {
                  if (!class404.method3248(var8, class42.field564, class42.field564 + var6, class42.field564 + var5, 0, var7, class42.field564)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else if (~arg1.field4361 == -65) {
                  if (!class404.method3248(var8, class42.field564, var6, var5 - -class42.field564, arg0 + -50, var7, class42.field564)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else if (arg1.field4361 == 128) {
                  if (!class404.method3248(var8, class42.field564, var6, var5, arg0 + -50, var7, class42.field564)) {
                     return false;
                  } else {
                     ++class269.field4362;
                     return true;
                  }
               } else {
                  return true;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6892[4] + arg0 + ',' + (arg1 != null ? field6892[3] : field6892[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(I)V",
      line = 156
   )
   public static void method3532(int arg0) {
      try {
         field6888 = null;
         field6891 = null;
         int var1 = 9 % ((arg0 - -33) / 60);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6892[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3533(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3534(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
