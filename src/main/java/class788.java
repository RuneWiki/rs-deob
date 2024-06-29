import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class788 {
   @OriginalMember(
      owner = "client!rw",
      name = "k",
      descriptor = "Lsb;"
   )
   public class305 field11533 = new class305();
   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11536 = new String[]{method5683(method5682("ir1\"\u0004ulk E")), method5683(method5682("upsr")), method5683(method5682("ir1XE")), method5683(method5682("`+10\u0010")), method5683(method5682("ir1\\E")), method5683(method5682("ir1VE")), method5683(method5682("ir1[E")), method5683(method5682("ir1YE")), method5683(method5682("ir1]E")), method5683(method5682("ir1ZE")), method5683(method5682("ir1_E"))};
   @OriginalMember(
      owner = "client!rw",
      name = "l",
      descriptor = "Lgh;"
   )
   public static class572 field11524 = new class572(82, -1);
   @OriginalMember(
      owner = "client!rw",
      name = "e",
      descriptor = "I"
   )
   public static int field11525;
   @OriginalMember(
      owner = "client!rw",
      name = "j",
      descriptor = "I"
   )
   public static int field11526;
   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "I"
   )
   public static int field11527;
   @OriginalMember(
      owner = "client!rw",
      name = "h",
      descriptor = "I"
   )
   public static int field11528;
   @OriginalMember(
      owner = "client!rw",
      name = "i",
      descriptor = "I"
   )
   public static int field11529;
   @OriginalMember(
      owner = "client!rw",
      name = "f",
      descriptor = "I"
   )
   public static int field11530;
   @OriginalMember(
      owner = "client!rw",
      name = "g",
      descriptor = "I"
   )
   public static int field11531;
   @OriginalMember(
      owner = "client!rw",
      name = "d",
      descriptor = "I"
   )
   public static int field11532;
   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "I"
   )
   public static int field11534;
   @OriginalMember(
      owner = "client!rw",
      name = "c",
      descriptor = "Lsb;"
   )
   private class305 field11535;

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(I)I",
      line = 4
   )
   public final int method5674(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field11528;
         if (arg0 < 118) {
            return -31;
         } else {
            int var3 = 0;
            class305 var4 = this.field11533.field4412;
            if (var2) {
               var4 = var4.field4412;
               ++var3;
            }

            while(true) {
               while(this.field11533 != var4) {
                  var4 = var4.field4412;
                  ++var3;
               }

               if (!var2) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11536[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(B)V",
      line = 27
   )
   public final void method5675(byte arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 < 44) {
            this.method5676(69);
         }

         ++field11527;

         while(true) {
            class305 var3 = this.field11533.field4412;
            if (this.field11533 != var3) {
               var3.method2385(117);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field11535 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11536[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "(I)Lsb;",
      line = 54
   )
   public final class305 method5676(int arg0) {
      try {
         if (arg0 != -13612) {
            method5677(91);
         }

         ++field11525;
         class305 var2 = this.field11535;
         if (this.field11533 == var2) {
            this.field11535 = null;
            return null;
         } else {
            this.field11535 = var2.field4412;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11536[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "c",
      descriptor = "(I)V",
      line = 74
   )
   public static void method5677(int arg0) {
      try {
         field11524 = null;
         if (arg0 <= 77) {
            field11534 = 10;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11536[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(Lsm;Lha;ILct;IIIILsda;)V",
      line = 86
   )
   public static final void method5678(class297 arg0, class65 arg1, int arg2, class155 arg3, int arg4, int arg5, int arg6, int arg7, class269 arg8) {
      boolean var9 = client.field4564;

      try {
         ++field11532;
         int var10 = arg7 - arg5 / 2 - 5;
         int var11 = arg2 + arg6;
         if (arg3.field2491 != 0) {
            arg1.method693(arg6 + 10238, arg3.field2491, arg5 - -10, -var11 + (arg2 - -(arg4 * arg0.method2319())) - -1, var11, var10);
         }

         if (~arg3.field2465 != -1) {
            arg1.method691((byte)96, arg3.field2465, -var11 + arg2 + 1 + arg0.method2319() * arg4, var11, arg5 - -10, var10);
         }

         int var12 = arg3.field2499;
         if (arg8.field3802 && arg3.field2490 != -1) {
            var12 = arg3.field2490;
         }

         int var13 = 0;
         if (var9 || var13 < arg4) {
            do {
               String var14 = class344.field4910[var13];
               if (arg4 + -1 > var13) {
                  var14 = var14.substring(0, var14.length() - 4);
               }

               arg0.method2320(arg1, var14, arg7, arg2, var12, true);
               arg2 += arg0.method2319();
               ++var13;
            } while(var13 < arg4);

         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field11536[5] + (arg0 != null ? field11536[3] : field11536[1]) + ',' + (arg1 != null ? field11536[3] : field11536[1]) + ',' + arg2 + ',' + (arg3 != null ? field11536[3] : field11536[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field11536[3] : field11536[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "(B)Lsb;",
      line = 127
   )
   public final class305 method5679(byte arg0) {
      try {
         ++field11530;
         if (arg0 <= 19) {
            this.method5679((byte)71);
         }

         class305 var2 = this.field11533.field4412;
         if (this.field11533 == var2) {
            return null;
         } else {
            var2.method2385(117);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11536[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(Z)Lsb;",
      line = 145
   )
   public final class305 method5680(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field11531;
            class305 var2 = this.field11533.field4412;
            if (this.field11533 == var2) {
               this.field11535 = null;
               return null;
            } else {
               this.field11535 = var2.field4412;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11536[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(Lsb;B)V",
      line = 171
   )
   public final void method5681(class305 arg0, byte arg1) {
      try {
         if (arg0.field4408 != null) {
            arg0.method2385(117);
         }

         ++field11526;
         arg0.field4408 = this.field11533.field4408;
         if (arg1 >= -35) {
            this.field11535 = null;
         }

         arg0.field4412 = this.field11533;
         arg0.field4408.field4412 = arg0;
         arg0.field4412.field4408 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11536[2] + (arg0 != null ? field11536[3] : field11536[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "<init>",
      descriptor = "()V",
      line = 198
   )
   public class788() {
      try {
         this.field11533.field4412 = this.field11533;
         this.field11533.field4408 = this.field11533;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11536[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5682(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5683(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
