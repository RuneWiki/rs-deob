import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class546 {
   @OriginalMember(
      owner = "client!baa",
      name = "c",
      descriptor = "Lgw;"
   )
   private class179 field7899 = new class179(128);
   @OriginalMember(
      owner = "client!baa",
      name = "e",
      descriptor = "Lhw;"
   )
   private class141 field7901;
   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7905 = new String[]{method4083(method4082("uuA![?")), method4083(method4082("l:\u000e!d")), method4083(method4082("yaLc")), method4083(method4082("uuA!Z?")), method4083(method4082("uuA!]?")), method4083(method4082("uuA!%~zI{'?")), method4083(method4082("uuA!\\?")), method4083(method4082("uuA!X?"))};
   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7902 = new String[100];
   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "I"
   )
   public static int field7897;
   @OriginalMember(
      owner = "client!baa",
      name = "d",
      descriptor = "I"
   )
   public static int field7898;
   @OriginalMember(
      owner = "client!baa",
      name = "h",
      descriptor = "I"
   )
   public static int field7900;
   @OriginalMember(
      owner = "client!baa",
      name = "f",
      descriptor = "I"
   )
   public static int field7903;
   @OriginalMember(
      owner = "client!baa",
      name = "g",
      descriptor = "I"
   )
   public static int field7904;

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(II)Lgv;"
   )
   public final class89 method4077(int arg0, int arg1) {
      try {
         ++field7898;
         class179 var3 = this.field7899;
         class89 var4;
         synchronized(this.field7899) {
            var4 = (class89)this.field7899.method1584((long)arg0, 1);
         }

         if (arg1 != -2) {
            method4078(122, (class65)null, 51, 66, -40, -112, (class59)null, 77, 13, (byte)102, 66, -85);
         }

         if (var4 != null) {
            return var4;
         } else {
            byte[] var5 = this.field7901.method1347((byte)123, class75.method784(arg0, arg1 ^ 106), class334.method2597(arg0, 255));
            class89 var6 = new class89();
            if (var5 != null) {
               var6.method865(false, new class473(var5));
            }

            class179 var7 = this.field7899;
            synchronized(this.field7899) {
               this.field7899.method1581((long)arg0, 0, var6);
               return var6;
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field7905[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(ILha;IIIILvg;IIBII)V"
   )
   public static final void method4078(int arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, class59 arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
      try {
         if (arg5 < arg8 && ~arg8 > ~(arg5 - -arg7) && arg3 > arg4 - 13 && ~(arg4 + 3) < ~arg3) {
            arg2 = arg11;
         }

         ++field7903;
         String var12 = class115.method1090(false, arg6);
         if (arg9 >= -25) {
            field7902 = null;
         }

         class296.field4151.method710(0, class138.field2244, arg5 - -3, 0, class207.field3090, arg4, arg2, var12);
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7905[3] + arg0 + ',' + (arg1 != null ? field7905[1] : field7905[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7905[1] : field7905[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4079(int arg0) {
      try {
         field7902 = null;
         if (arg0 > -18) {
            field7900 = 75;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7905[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4080(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(Luda;I)V"
   )
   public static final void method4081(class473 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field7897;
         if (arg0.field6889.length + -arg0.field6907 >= 1) {
            int var3 = arg0.method3564((byte)-61);
            if (var3 >= arg1 && ~var3 >= -2) {
               if (~(arg0.field6889.length + -arg0.field6907) <= -3) {
                  int var4 = arg0.method3565(true);
                  if (~(var4 * 6) >= ~(arg0.field6889.length + -arg0.field6907)) {
                     int var5 = 0;
                     if (var2 || var4 > var5) {
                        do {
                           int var6 = arg0.method3565(true);
                           int var7 = arg0.method3567(31871);
                           if (class421.field6133.length > var6) {
                              if (!class39.field937[var6] && !var2) {
                                 ++var5;
                              } else if (~class482.field7011.method4532(var6, (byte)-43).field3336 == -50) {
                                 if (~var7 <= 0) {
                                    if (~var7 < -2) {
                                       if (var2) {
                                          class421.field6133[var6] = var7;
                                          ++var5;
                                       } else {
                                          ++var5;
                                       }
                                    } else {
                                       class421.field6133[var6] = var7;
                                       ++var5;
                                    }
                                 } else {
                                    ++var5;
                                 }
                              } else {
                                 class421.field6133[var6] = var7;
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } while(var4 > var5);

                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field7905[7] + (arg0 != null ? field7905[1] : field7905[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class546(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field7901 = arg2;
         if (this.field7901 != null) {
            int var4 = -1 + this.field7901.method1337((byte)104);
            this.field7901.method1346(var4, 0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7905[5] + (arg0 != null ? field7905[1] : field7905[2]) + ',' + arg1 + ',' + (arg2 != null ? field7905[1] : field7905[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4082(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4083(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
