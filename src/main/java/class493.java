import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public abstract class class493 {
   @OriginalMember(
      owner = "client!wda",
      name = "c",
      descriptor = "I"
   )
   public int field6887;
   @OriginalMember(
      owner = "client!wda",
      name = "d",
      descriptor = "I"
   )
   public int field6884;
   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "I"
   )
   public int field6886;
   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6888 = new String[]{method3753(method3752(";yXim")), method3753(method3752(".\"\u001a+")), method3753(method3752("73\u0017iTh")), method3753(method3752("73\u0017iRh")), method3753(method3752("73\u0017i,)9\u001f3.h"))};
   @OriginalMember(
      owner = "client!wda",
      name = "b",
      descriptor = "I"
   )
   public static int field6885 = 0;
   @OriginalMember(
      owner = "client!wda",
      name = "f",
      descriptor = "Lmu;"
   )
   public static class314 field6882 = new class314();
   @OriginalMember(
      owner = "client!wda",
      name = "e",
      descriptor = "I"
   )
   public static int field6883;

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(Lgea;Z)V"
   )
   public static final void method3750(class66 arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         ++field6883;
         if (~(arg0.field859.length + -arg0.field864) <= -2) {
            int var3 = arg0.method640(255);
            if (~var3 <= -1 && ~var3 >= -2) {
               if (arg0.field859.length + -arg0.field864 >= 2) {
                  int var4 = arg0.method603(-2);
                  if (arg0.field859.length - arg0.field864 >= var4 * 6) {
                     if (arg1) {
                        int var5 = 0;
                        if (var2 || var5 < var4) {
                           do {
                              int var6 = arg0.method603(-2);
                              int var7 = arg0.method610(-104);
                              if (class402.field5522.length > var6) {
                                 if (!class749.field10938[var6] && !var2) {
                                    ++var5;
                                 } else if (~class750.field10955.method4863((byte)-100, var6).field9808 == -50) {
                                    if (var7 >= -1) {
                                       if (~var7 < -2) {
                                          if (var2) {
                                             class402.field5522[var6] = var7;
                                             ++var5;
                                          } else {
                                             ++var5;
                                          }
                                       } else {
                                          class402.field5522[var6] = var7;
                                          ++var5;
                                       }
                                    } else {
                                       ++var5;
                                    }
                                 } else {
                                    class402.field5522[var6] = var7;
                                    ++var5;
                                 }
                              } else {
                                 ++var5;
                              }
                           } while(var5 < var4);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field6888[2] + (arg0 != null ? field6888[0] : field6888[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public abstract void method2673(int arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3751(int arg0) {
      try {
         if (arg0 == 11321) {
            field6882 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6888[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2671(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(IZI)V"
   )
   public abstract void method2668(int arg0, boolean arg1, int arg2);

   @OriginalMember(
      owner = "client!wda",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class493(int arg0, int arg1, int arg2) {
      try {
         this.field6887 = arg1;
         this.field6884 = arg2;
         this.field6886 = arg0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6888[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3752(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3753(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
