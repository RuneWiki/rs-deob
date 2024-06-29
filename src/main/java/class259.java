import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class259 {
   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4271 = new String[]{method2262(method2261("7S_:t")), method2262(method2261("7S_9t"))};
   @OriginalMember(
      owner = "client!bk",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4269 = new String[5];
   @OriginalMember(
      owner = "client!bk",
      name = "b",
      descriptor = "I"
   )
   public static int field4268;
   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "Lti;"
   )
   public static class80 field4270;

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(BIIIII)V",
      line = 3
   )
   public static final void method2259(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field4268;
         if (arg0 <= 73) {
            field4270 = null;
         }

         if (class84.field1212 >= arg3 && class368.field5724 <= arg5) {
            boolean var7;
            label146: {
               if (~arg4 > ~class443.field6806) {
                  arg4 = class443.field6806;
                  var7 = false;
                  if (!var6) {
                     break label146;
                  }
               }

               if (arg4 <= class182.field2833) {
                  var7 = true;
                  if (!var6) {
                     break label146;
                  }
               }

               var7 = false;
               arg4 = class182.field2833;
            }

            boolean var8;
            label127: {
               if (~arg1 <= ~class443.field6806) {
                  if (class182.field2833 >= arg1) {
                     var8 = true;
                     if (!var6) {
                        break label127;
                     }
                  }

                  var8 = false;
                  arg1 = class182.field2833;
                  if (!var6) {
                     break label127;
                  }
               }

               arg1 = class443.field6806;
               var8 = false;
            }

            label119: {
               if (~class368.field5724 >= ~arg3) {
                  class689.method5076(arg1, arg4, (byte)57, class512.field7820[arg3++], arg2);
                  if (!var6) {
                     break label119;
                  }
               }

               arg3 = class368.field5724;
            }

            label114: {
               if (~class84.field1212 <= ~arg5) {
                  class689.method5076(arg1, arg4, (byte)57, class512.field7820[arg5--], arg2);
                  if (!var6) {
                     break label114;
                  }
               }

               arg5 = class84.field1212;
            }

            if (var7 && var8) {
               int var9 = arg3;
               if (var6 || ~arg3 >= ~arg5) {
                  do {
                     int[] var10 = class512.field7820[var9];
                     var10[arg4] = var10[arg1] = arg2;
                     ++var9;
                  } while(~var9 >= ~arg5);

               }
            } else {
               if (!var7) {
                  if (var8) {
                     int var11 = arg3;
                     if (var6) {
                        class512.field7820[arg3][arg1] = arg2;
                        var11 = arg3 + 1;
                     }

                     while(true) {
                        while(~arg5 <= ~var11) {
                           class512.field7820[var11][arg1] = arg2;
                           ++var11;
                        }

                        if (!var6) {
                           return;
                        }

                        ++var11;
                     }
                  }
               } else {
                  int var12 = arg3;
                  if (var6 || arg3 <= arg5) {
                     do {
                        class512.field7820[var12][arg4] = arg2;
                        ++var12;
                     } while(var12 <= arg5);
                  }
               }

            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4271[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(I)V",
      line = 115
   )
   public static void method2260(int arg0) {
      try {
         if (arg0 == -1) {
            field4269 = null;
            field4270 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4271[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2261(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2262(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
