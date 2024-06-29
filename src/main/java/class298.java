import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class298 extends class76 {
   @OriginalMember(
      owner = "client!wha",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4091 = new String[]{method2231(method2230("W?@y%\b")), method2231(method2230("N\"M;")), method2231(method2230("[y\u000fy\u001c")), method2231(method2230("W?@y'\b")), method2231(method2230("W?@y\"\b")), method2231(method2230("W?@y$\b")), method2231(method2230("W?@y#\b")), method2231(method2230("W?@y \b"))};
   @OriginalMember(
      owner = "client!wha",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field4085 = new int[4];
   @OriginalMember(
      owner = "client!wha",
      name = "B",
      descriptor = "I"
   )
   public static int field4090 = 7000;
   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "I"
   )
   public static int field4088 = field4090;
   @OriginalMember(
      owner = "client!wha",
      name = "H",
      descriptor = "I"
   )
   public static int field4082;
   @OriginalMember(
      owner = "client!wha",
      name = "F",
      descriptor = "I"
   )
   public static int field4083;
   @OriginalMember(
      owner = "client!wha",
      name = "A",
      descriptor = "I"
   )
   public static int field4086;
   @OriginalMember(
      owner = "client!wha",
      name = "E",
      descriptor = "I"
   )
   public static int field4087;
   @OriginalMember(
      owner = "client!wha",
      name = "C",
      descriptor = "I"
   )
   public static int field4089;
   @OriginalMember(
      owner = "client!wha",
      name = "I",
      descriptor = "Lwv;"
   )
   private class37 field4084;

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method2224(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != -250) {
            return -36;
         } else {
            ++field4086;
            if (arg0 >= arg1) {
               return arg0 > arg2 ? arg2 : arg0;
            } else {
               return arg1;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4091[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(BLjava/lang/String;I)Ljava/lang/String;"
   )
   public final String method2225(byte arg0, String arg1, int arg2) {
      try {
         if (arg0 != 36) {
            field4090 = 45;
         }

         ++field4089;
         if (this.field4084 == null) {
            return arg1;
         } else {
            class181 var4 = (class181)this.field4084.method329((byte)-107, (long)arg2);
            return var4 == null ? arg1 : var4.field2546;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4091[3] + arg0 + ',' + (arg1 != null ? field4091[2] : field4091[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(Lwf;BI)V"
   )
   private final void method2226(class147 arg0, byte arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (~arg2 == -250) {
            int var5 = arg0.method1143(arg1 ^ 15471);
            if (this.field4084 == null) {
               int var6 = class350.method2552(false, var5);
               this.field4084 = new class37(var6);
            }

            int var7 = 0;
            if (var4 || var7 < var5) {
               do {
                  int var9;
                  class428 var10;
                  label47: {
                     boolean var8 = ~arg0.method1143(-15465) == -2;
                     var9 = arg0.method1166((byte)-46);
                     if (var8) {
                        var10 = new class181(arg0.method1204(arg1 ^ -2119550376));
                        if (!var4) {
                           break label47;
                        }
                     }

                     var10 = new class713(arg0.method1164(19693));
                  }

                  this.field4084.method336(-1, (long)var9, var10);
                  ++var7;
               } while(var7 < var5);
            }
         }

         ++field4082;
         if (arg1 != -8) {
            this.field4084 = null;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field4091[7] + (arg0 != null ? field4091[2] : field4091[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public final int method2227(int arg0, int arg1, boolean arg2) {
      try {
         ++field4087;
         if (this.field4084 == null) {
            return arg1;
         } else {
            class713 var4 = (class713)this.field4084.method329((byte)-84, (long)arg0);
            if (var4 == null) {
               return arg1;
            } else {
               return !arg2 ? -121 : var4.field10388;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4091[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public final void method2228(int arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 == 7000) {
            while(true) {
               int var4 = arg1.method1143(-15465);
               if (var4 != 0) {
                  this.method2226(arg1, (byte)-8, var4);
                  if (var3) {
                     break;
                  }

                  if (!var3) {
                     continue;
                  }
               }

               ++field4083;
               break;
            }

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4091[4] + arg0 + ',' + (arg1 != null ? field4091[2] : field4091[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2229(int arg0) {
      try {
         if (arg0 != 7000) {
            field4090 = 106;
         }

         field4085 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4091[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2230(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2231(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
