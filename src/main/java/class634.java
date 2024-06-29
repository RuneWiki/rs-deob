import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class634 {
   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8993 = new String[]{method4640(method4639("eO`pS")), method4640(method4639("p\u0014\"2")), method4640(method4639("{\u0014`\u001d\u0006")), method4640(method4639("{\u0014`*AM\u0015<7@yI")), method4640(method4639("{\u0014`\u001a\u0006")), method4640(method4639("{\u0014`\u001c\u0006")), method4640(method4639("{\u0014`\u001f\u0006"))};
   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "I"
   )
   public static int field8987;
   @OriginalMember(
      owner = "client!eu",
      name = "c",
      descriptor = "I"
   )
   public static int field8988;
   @OriginalMember(
      owner = "client!eu",
      name = "f",
      descriptor = "I"
   )
   public static int field8990;
   @OriginalMember(
      owner = "client!eu",
      name = "d",
      descriptor = "I"
   )
   public static int field8991;
   @OriginalMember(
      owner = "client!eu",
      name = "e",
      descriptor = "I"
   )
   public static int field8992;
   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "[Ls;"
   )
   public static class751[] field8989;

   @OriginalMember(
      owner = "client!eu",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8990;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8993[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4635(int arg0) {
      try {
         if (arg0 != 0) {
            field8991 = -30;
         }

         field8989 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8993[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(IBI)I"
   )
   public final int method4636(int arg0, byte arg1, int arg2) {
      try {
         ++field8992;
         int var4 = arg0 < class557.field7909 ? class557.field7909 : arg0;
         if (class453.field6594 == this) {
            return 0;
         } else if (class530.field7480 == this) {
            return -arg2 + var4;
         } else if (class368.field5439 == this) {
            return (-arg2 + var4) / 2;
         } else {
            return arg1 > -35 ? -51 : 0;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8993[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(ILdaa;[I[IBI)Lhga;"
   )
   public static final class49 method4637(int arg0, class226 arg1, int[] arg2, int[] arg3, byte arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field8988;
         if (arg4 != -1) {
            method4637(-34, (class226)null, (int[])null, (int[])null, (byte)38, 122);
         }

         if (arg1.method1229(0, class106.field1654, class779.field11371)) {
            byte[] var11 = new byte[arg0 * arg5];
            int var12 = 0;
            if (!var6 && arg5 <= var12) {
               return new class49(arg1, arg0, arg5, var11);
            } else {
               do {
                  int var13 = arg0 * var12 + arg3[var12];
                  int var14 = 0;
                  if (var6) {
                     var11[var13++] = -1;
                     ++var14;
                  }

                  while(true) {
                     while(~var14 > ~arg2[var12]) {
                        var11[var13++] = -1;
                        ++var14;
                     }

                     if (!var6) {
                        ++var12;
                        break;
                     }

                     ++var14;
                  }
               } while(arg5 > var12);

               return new class49(arg1, arg0, arg5, var11);
            }
         } else {
            int[] var7 = new int[arg0 * arg5];
            int var8 = 0;
            if (!var6 && var8 >= arg5) {
               return new class49(arg1, arg0, arg5, var7);
            } else {
               do {
                  int var9 = arg0 * var8 + arg3[var8];
                  int var10 = 0;
                  if (var6) {
                     var7[var9++] = -16777216;
                     ++var10;
                  }

                  while(true) {
                     while(~arg2[var8] < ~var10) {
                        var7[var9++] = -16777216;
                        ++var10;
                     }

                     if (!var6) {
                        ++var8;
                        break;
                     }

                     ++var10;
                  }
               } while(var8 < arg5);

               return new class49(arg1, arg0, arg5, var7);
            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field8993[2] + arg0 + ',' + (arg1 != null ? field8993[0] : field8993[1]) + ',' + (arg2 != null ? field8993[0] : field8993[1]) + ',' + (arg3 != null ? field8993[0] : field8993[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method4638(boolean arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field8987;
         ++class313.field4697;
         class381 var3 = class801.method5775(class463.field6734, 0, class745.field10605.field3718);
         class745.field10605.method2111(14024, var3);
         int var4 = -69 / ((-89 - arg1) / 37);
         class733 var5 = (class733)class139.field2228.method3102(88);
         if (var2) {
            if (!var5.method2143(29962)) {
               var5 = (class733)class139.field2228.method3102(-95);
               if (var5 == null && !var2 && !var2) {
                  if (class463.field6743 != null) {
                     class566.method4205(1727005542, class463.field6743);
                     class463.field6743 = null;
                     return;
                  }

                  return;
               }
            }

            if (var5.field10421 == 0) {
               class519.method3879(true, var5, (byte)-68, arg0);
            }

            var5 = (class733)class139.field2228.method3095((byte)-118);
         }

         while(true) {
            while(var5 != null) {
               if (!var5.method2143(29962)) {
                  var5 = (class733)class139.field2228.method3102(-95);
                  if (var5 == null && !var2 && !var2) {
                     if (class463.field6743 != null) {
                        class566.method4205(1727005542, class463.field6743);
                        class463.field6743 = null;
                        return;
                     }

                     return;
                  }
               }

               if (var5.field10421 == 0) {
                  class519.method3879(true, var5, (byte)-68, arg0);
               }

               var5 = (class733)class139.field2228.method3095((byte)-118);
            }

            if (!var2) {
               if (class463.field6743 != null) {
                  class566.method4205(1727005542, class463.field6743);
                  class463.field6743 = null;
                  return;
               }

               return;
            }

            if (var5.field10421 == 0) {
               class519.method3879(true, var5, (byte)-68, arg0);
            }

            var5 = (class733)class139.field2228.method3095((byte)-118);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8993[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4639(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4640(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
