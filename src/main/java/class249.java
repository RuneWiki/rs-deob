import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class class249 {
   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3433 = new String[]{method1924(method1923("86|\u0004\u0015y")), method1924(method1923("86|\u0004\u0016y")), method1924(method1923("86|\u0004\u0013y")), method1924(method1923("86|\u0004\u0014y"))};
   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "I"
   )
   public static int field3426;
   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "I"
   )
   public static int field3429;
   @OriginalMember(
      owner = "client!ida",
      name = "g",
      descriptor = "I"
   )
   public static int field3430;
   @OriginalMember(
      owner = "client!ida",
      name = "e",
      descriptor = "I"
   )
   public int field3431;
   @OriginalMember(
      owner = "client!ida",
      name = "c",
      descriptor = "J"
   )
   public static long field3428;
   @OriginalMember(
      owner = "client!ida",
      name = "f",
      descriptor = "Lkf;"
   )
   public static class266 field3427;
   @OriginalMember(
      owner = "client!ida",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field3432;

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;"
   )
   public final Socket method1919(byte arg0) throws IOException {
      try {
         if (arg0 != 48) {
            field3427 = null;
         }

         ++field3429;
         return new Socket(this.field3432, this.field3431);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3433[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(BJ)Ljava/lang/String;"
   )
   public static final String method1920(byte arg0, long arg1) {
      boolean var3 = client.field4360;

      try {
         ++field3430;
         if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (arg0 != -36) {
               field3427 = null;
            }

            if (arg1 % 37L == 0L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3) {
                  var5 = arg1 / 37L;
                  ++var4;
               }

               while(true) {
                  while(~var5 != -1L) {
                     var5 /= 37L;
                     ++var4;
                  }

                  StringBuffer var7 = new StringBuffer(var4);
                  if (!var3) {
                     if (!var3 && ~arg1 == -1L) {
                        var7.reverse();
                        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                        return var7.toString();
                     } else {
                        do {
                           long var8 = arg1;
                           arg1 /= 37L;
                           char var10 = class255.field3470[(int)(-(arg1 * 37L) + var8)];
                           if (~var10 == -96) {
                              int var11 = var7.length() + -1;
                              var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                              var10 = 160;
                           }

                           var7.append(var10);
                        } while(~arg1 != -1L);

                        var7.reverse();
                        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                        return var7.toString();
                     }
                  }

                  ++var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field3433[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1921(int arg0) {
      try {
         ++field3426;
         if (arg0 == class300.field4107.field6412.method1017(107) && ~class561.field8019 != ~class169.field2359) {
            class564.method4023(false, -1574872860, 12, class72.field877, class53.field676);
         } else {
            class733.method5332((byte)102, class383.field5543);
            if (~class561.field8019 != ~class14.field156) {
               class61.method467(-127);
            }
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3433[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1922(byte arg0) {
      try {
         field3427 = null;
         int var1 = -96 % ((-82 - arg0) / 36);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3433[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public abstract Socket method1122(int arg0) throws IOException;

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1923(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1924(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
