import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class76 extends class428 {
   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field956 = new String[]{method697(method696("oUhz\u00034")), method697(method696("U\\\u007f5!uV)&,x[qn")), method697(method696("oUhz\u00004")), method697(method696("rGe8")), method697(method696("g\u001c'z0")), method697(method696("oUhz\u00064")), method697(method696("oUhz\u00014")), method697(method696("oUhz\u00044")), method697(method696("oUhz\u00074"))};
   @OriginalMember(
      owner = "client!sga",
      name = "m",
      descriptor = "I"
   )
   public static int field953 = 0;
   @OriginalMember(
      owner = "client!sga",
      name = "w",
      descriptor = "Lek;"
   )
   public static class536 field952 = new class536(8, 4);
   @OriginalMember(
      owner = "client!sga",
      name = "v",
      descriptor = "I"
   )
   public static int field943;
   @OriginalMember(
      owner = "client!sga",
      name = "y",
      descriptor = "I"
   )
   public static int field944;
   @OriginalMember(
      owner = "client!sga",
      name = "r",
      descriptor = "I"
   )
   public static int field945;
   @OriginalMember(
      owner = "client!sga",
      name = "n",
      descriptor = "I"
   )
   public static int field948;
   @OriginalMember(
      owner = "client!sga",
      name = "t",
      descriptor = "I"
   )
   public static int field949;
   @OriginalMember(
      owner = "client!sga",
      name = "x",
      descriptor = "I"
   )
   public static int field951;
   @OriginalMember(
      owner = "client!sga",
      name = "q",
      descriptor = "I"
   )
   public static int field954;
   @OriginalMember(
      owner = "client!sga",
      name = "s",
      descriptor = "I"
   )
   public static int field955;
   @OriginalMember(
      owner = "client!sga",
      name = "o",
      descriptor = "J"
   )
   public long field947;
   @OriginalMember(
      owner = "client!sga",
      name = "u",
      descriptor = "Lsga;"
   )
   public class76 field946;
   @OriginalMember(
      owner = "client!sga",
      name = "p",
      descriptor = "Lsga;"
   )
   public class76 field950;

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "([[BILrga;)V",
      line = 9
   )
   public static final void method690(byte[][] param0, int param1, class253 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(I)V",
      line = 126
   )
   public static void method691(int arg0) {
      try {
         field952 = null;
         int var1 = -13 / ((arg0 - 62) / 32);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field956[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(IIIZ)Ljava/lang/String;",
      line = 136
   )
   public static final String method692(int arg0, int arg1, int arg2, boolean arg3) {
      boolean var4 = client.field4360;

      try {
         ++field945;
         if (arg1 >= 2 && arg1 <= 36) {
            if (arg3 && ~arg0 <= -1) {
               if (arg2 != -10979) {
                  field955 = 79;
               }

               int var5 = 2;
               int var6 = arg0 / arg1;
               if (var4) {
                  ++var5;
                  var6 /= arg1;
               }

               while(true) {
                  if (var6 == 0) {
                     char[] var7 = new char[var5];
                     var7[0] = '+';
                     int var8 = var5 + -1;
                     if (!var4) {
                        if (!var4 && var8 <= 0) {
                           return new String(var7);
                        } else {
                           do {
                              int var9 = arg0;
                              arg0 /= arg1;
                              int var10 = -(arg0 * arg1) + var9;
                              if (~var10 > -11) {
                                 var7[var8] = (char)(var10 + 48);
                                 if (var4) {
                                    var7[var8] = (char)(var10 + 87);
                                    --var8;
                                 } else {
                                    --var8;
                                 }
                              } else {
                                 var7[var8] = (char)(var10 + 87);
                                 --var8;
                              }
                           } while(var8 > 0);

                           return new String(var7);
                        }
                     }
                  } else {
                     ++var5;
                  }

                  var6 /= arg1;
               }
            } else {
               return Integer.toString(arg0, arg1);
            }
         } else {
            throw new IllegalArgumentException(field956[1] + arg1);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field956[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "(B)V",
      line = 192
   )
   public final void method693(byte arg0) {
      try {
         ++field943;
         if (this.field946 != null) {
            if (arg0 > -12) {
               method690((byte[][])null, -90, (class253)null);
            }

            this.field946.field950 = this.field950;
            this.field950.field946 = this.field946;
            this.field946 = null;
            this.field950 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field956[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(B)Z",
      line = 210
   )
   public final boolean method694(byte arg0) {
      try {
         if (arg0 < 56) {
            return true;
         } else {
            ++field948;
            return this.field946 != null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field956[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(ILkf;IB)Lhn;",
      line = 233
   )
   public static final class753 method695(int arg0, class266 arg1, int arg2, byte arg3) {
      boolean var4 = client.field4360;

      try {
         ++field944;
         class147 var5 = new class147(arg1.method2037(false, arg2, arg0));
         class753 var6 = new class753(arg2, var5.method1204(2119550368), var5.method1204(arg3 ^ 2119550439), var5.method1164(19693), var5.method1164(19693), ~var5.method1143(-15465) == -2, var5.method1143(arg3 ^ -15408), var5.method1143(-15465));
         int var7 = var5.method1143(arg3 ^ -15408);
         int var8 = 0;
         if (var4) {
            var6.field11132.method2930((byte)-109, new class552(var5.method1143(arg3 ^ -15408), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(arg3 ^ -26227), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(-26166)));
            ++var8;
         }

         while(true) {
            while(~var7 < ~var8) {
               var6.field11132.method2930((byte)-109, new class552(var5.method1143(arg3 ^ -15408), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(arg3 ^ -26227), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(-26166), var5.method1211(-26166)));
               ++var8;
            }

            var6.method5463(-1173855007);
            if (!var4) {
               if (arg3 != 71) {
                  method695(-9, (class266)null, 53, (byte)-65);
               }

               return var6;
            }

            ++var8;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field956[7] + arg0 + ',' + (arg1 != null ? field956[4] : field956[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method696(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method697(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
