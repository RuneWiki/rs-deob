import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class259 {
   @OriginalMember(
      owner = "client!qa",
      name = "b",
      descriptor = "Ldw;"
   )
   private class748 field3500 = new class748(16);
   @OriginalMember(
      owner = "client!qa",
      name = "f",
      descriptor = "Leaa;"
   )
   private class526 field3508;
   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3512 = new String[]{method1964(method1963("\u000f/T<p")), method1964(method1963("\u000f/T:p")), method1964(method1963("\u000f/T?p")), method1964(method1963("\u000f/T=p")), method1964(method1963("\u0010;\u0016\u0012")), method1964(method1963("\u0005`TP%")), method1964(method1963("\u000f/T;p")), method1964(method1963("\u000f/TB1\u0010'\u000e@p")), method1964(method1963("\u000f/T9p")), method1964(method1963("\u000f/T8p"))};
   @OriginalMember(
      owner = "client!qa",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field3505 = false;
   @OriginalMember(
      owner = "client!qa",
      name = "g",
      descriptor = "Lwia;"
   )
   public static class791 field3509 = new class791(64);
   @OriginalMember(
      owner = "client!qa",
      name = "j",
      descriptor = "I"
   )
   public static int field3501;
   @OriginalMember(
      owner = "client!qa",
      name = "k",
      descriptor = "I"
   )
   public static int field3502;
   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "I"
   )
   public static int field3503;
   @OriginalMember(
      owner = "client!qa",
      name = "l",
      descriptor = "I"
   )
   public static int field3504;
   @OriginalMember(
      owner = "client!qa",
      name = "h",
      descriptor = "I"
   )
   public static int field3506;
   @OriginalMember(
      owner = "client!qa",
      name = "c",
      descriptor = "I"
   )
   public static int field3507;
   @OriginalMember(
      owner = "client!qa",
      name = "d",
      descriptor = "I"
   )
   public static int field3510;
   @OriginalMember(
      owner = "client!qa",
      name = "e",
      descriptor = "Lhha;"
   )
   public static class545 field3511;

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(IIIIILos;)Lvk;",
      line = 8
   )
   public final class386 method1956(int arg0, int arg1, int arg2, int arg3, int arg4, class466 arg5) {
      int var7 = client.field4530;

      try {
         if (arg1 != 2) {
            return null;
         } else {
            ++field3501;
            class414[] var8 = null;
            class431 var9 = this.method1957(arg4, 84);
            if (var9.field6587 != null) {
               var8 = new class414[var9.field6587.length];
               int var10 = 0;
               if (var7 != 0 || var10 < var8.length) {
                  do {
                     class401 var11 = arg5.method3483(var9.field6587[var10], arg1 ^ 106);
                     var8[var10] = new class414(var11.field6160, var11.field6164, var11.field6154, var11.field6166, var11.field6157, var11.field6159, var11.field6155, var11.field6168);
                     ++var10;
                  } while(var10 < var8.length);
               }
            }

            return new class386(var9.field6591, var8, var9.field6586, arg3, arg0, arg2);
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field3512[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3512[5] : field3512[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "b",
      descriptor = "(II)Lfr;",
      line = 44
   )
   private final class431 method1957(int arg0, int arg1) {
      try {
         ++field3503;
         class748 var3 = this.field3500;
         class431 var4;
         synchronized(this.field3500) {
            var4 = (class431)this.field3500.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field3508;
            byte[] var6;
            synchronized(this.field3508) {
               var6 = this.field3508.method3899(-67, arg0, 29);
            }

            if (arg1 < 36) {
               this.method1962(87, -44);
            }

            class431 var7 = new class431();
            if (var6 != null) {
               var7.method3285(new class128(var6), 122);
            }

            class748 var8 = this.field3500;
            synchronized(this.field3500) {
               this.field3500.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field3512[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(Z)V",
      line = 75
   )
   public final void method1958(boolean arg0) {
      try {
         if (arg0) {
            ++field3504;
            class748 var2 = this.field3500;
            synchronized(this.field3500) {
               this.field3500.method5451(26);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3512[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(I)V",
      line = 90
   )
   public final void method1959(int arg0) {
      try {
         ++field3507;
         if (arg0 <= 61) {
            field3505 = true;
         }

         class748 var2 = this.field3500;
         synchronized(this.field3500) {
            this.field3500.method5445(697465426);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3512[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "b",
      descriptor = "(I)V",
      line = 109
   )
   public static void method1960(int arg0) {
      try {
         field3509 = null;
         if (arg0 > -10) {
            field3510 = -125;
         }

         field3511 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3512[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V",
      line = 123
   )
   public static final void method1961(int arg0, String arg1, int arg2) {
      try {
         ++field3506;
         class403 var3 = class453.method3410((long)arg2, true, 2);
         var3.method3093(22144);
         if (arg0 < 74) {
            field3509 = null;
         }

         var3.field6184 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3512[6] + arg0 + ',' + (arg1 != null ? field3512[5] : field3512[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 142
   )
   public class259(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field3508 = arg2;
         this.field3508.method3875(0, 29);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3512[7] + (arg0 != null ? field3512[5] : field3512[4]) + ',' + arg1 + ',' + (arg2 != null ? field3512[5] : field3512[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(II)V",
      line = 157
   )
   public final void method1962(int arg0, int arg1) {
      try {
         class748 var3 = this.field3500;
         synchronized(this.field3500) {
            if (arg0 != 22575) {
               return;
            }

            this.field3500.method5453(arg1, false);
         }

         ++field3502;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field3512[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
