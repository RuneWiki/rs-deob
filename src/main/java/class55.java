import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class55 extends class294 {
   @OriginalMember(
      owner = "client!op",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public String field680;
   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field685 = new String[]{method413(method412("+VW\u0005/")), method413(method412("+VW}n*O\r\u007f/")), method413(method412("*S\u0015-")), method413(method412("?\bWoz")), method413(method412("+VW\u0000/")), method413(method412("+VW\u0002/")), method413(method412("+VW\u0003/"))};
   @OriginalMember(
      owner = "client!op",
      name = "o",
      descriptor = "I"
   )
   public static int field683 = 0;
   @OriginalMember(
      owner = "client!op",
      name = "s",
      descriptor = "F"
   )
   public static float field684;
   @OriginalMember(
      owner = "client!op",
      name = "n",
      descriptor = "I"
   )
   public static int field678;
   @OriginalMember(
      owner = "client!op",
      name = "m",
      descriptor = "I"
   )
   public static int field679;
   @OriginalMember(
      owner = "client!op",
      name = "q",
      descriptor = "I"
   )
   public static int field681;
   @OriginalMember(
      owner = "client!op",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public static String field682;

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(III)I",
      line = 3
   )
   public static final int method408(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field678;
         if (arg0 == -2) {
            return 12345678;
         } else {
            if (arg2 != 126) {
               field684 = -0.8379779F;
            }

            if (~arg0 == 0) {
               if (~arg1 <= -3) {
                  if (arg1 <= 126) {
                     return arg1;
                  }

                  arg1 = 126;
                  if (!var3) {
                     return arg1;
                  }
               }

               arg1 = 2;
               return arg1;
            } else {
               arg1 = (127 & arg0) * arg1 >> 7;
               if (~arg1 <= -3) {
                  if (~arg1 >= -127) {
                     return (65408 & arg0) + arg1;
                  }

                  arg1 = 126;
                  if (!var3) {
                     return (65408 & arg0) + arg1;
                  }
               }

               arg1 = 2;
               return (65408 & arg0) + arg1;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field685[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(Z)V",
      line = 40
   )
   public static void method409(boolean arg0) {
      try {
         if (arg0) {
            method410(43, 122, 58, -28, -50, -103, -120);
         }

         field682 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field685[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(IIIIIII)J",
      line = 53
   )
   public static final long method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field679;
         if (arg5 != -1) {
            method411(39, 38, (byte)-83);
         }

         class406.field6326.clear();
         class406.field6326.set(arg6, arg1, arg4, arg2, arg3, arg0);
         return class406.field6326.getTime().getTime();
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field685[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(IIB)Z",
      line = 66
   )
   public static final boolean method411(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 35) {
            field682 = null;
         }

         ++field681;
         return ~(arg1 & 2048) != -1 && (55 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field685[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "<init>",
      descriptor = "()V",
      line = 79
   )
   public class55() {
   }

   @OriginalMember(
      owner = "client!op",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 84
   )
   public class55(String arg0) {
      try {
         this.field680 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field685[1] + (arg0 != null ? field685[3] : field685[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method412(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method413(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
