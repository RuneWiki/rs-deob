import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class153 extends class96 {
   @OriginalMember(
      owner = "client!wf",
      name = "i",
      descriptor = "Lbc;"
   )
   public class282 field2289;
   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2292 = new String[]{method1394(method1393(".\u001f[B\u0005")), method1394(method1393(".\u001f[?D7\u0010\u0001=\u0005")), method1394(method1393("7\f\u0019o")), method1394(method1393("\"W[-P")), method1394(method1393(".\u001f[A\u0005")), method1394(method1393(".\u001f[@\u0005"))};
   @OriginalMember(
      owner = "client!wf",
      name = "l",
      descriptor = "Llj;"
   )
   public static class304 field2290 = new class304(8);
   @OriginalMember(
      owner = "client!wf",
      name = "h",
      descriptor = "I"
   )
   public static int field2287;
   @OriginalMember(
      owner = "client!wf",
      name = "j",
      descriptor = "I"
   )
   public static int field2288;
   @OriginalMember(
      owner = "client!wf",
      name = "k",
      descriptor = "I"
   )
   public static int field2291;

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(BZ)I"
   )
   public static final int method1390(byte arg0, boolean arg1) {
      try {
         if (arg0 != 91) {
            method1392(true);
         }

         ++field2287;
         int var2 = class67.field883;
         if (var2 != 0) {
            if (var2 == 1) {
               return class177.field2773;
            }

            if (var2 != 2) {
               return 0;
            }

            if (!client.field1786) {
               return 0;
            }
         }

         return arg1 ? 0 : class177.field2773;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2292[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(ILln;ILln;Z)I"
   )
   public static final int method1391(int arg0, class433 arg1, int arg2, class433 arg3, boolean arg4) {
      try {
         ++field2288;
         if (~arg0 == -2) {
            int var5 = arg1.field9096;
            int var6 = arg3.field9096;
            if (!arg4) {
               if (~var6 == 0) {
                  var6 = 2001;
               }

               if (var5 == -1) {
                  var5 = 2001;
               }
            }

            return -var6 + var5;
         } else if (~arg0 == -3) {
            return class369.method3020(true, arg1.method3419(-1).field6583, arg3.method3419(-1).field6583, class493.field7455);
         } else {
            if (arg2 >= -44) {
               field2290 = null;
            }

            if (arg0 == 3) {
               if (arg1.field6658.equals("-")) {
                  if (arg3.field6658.equals("-")) {
                     return 0;
                  } else {
                     return arg4 ? -1 : 1;
                  }
               } else if (arg3.field6658.equals("-")) {
                  return arg4 ? 1 : -1;
               } else {
                  return class369.method3020(true, arg1.field6658, arg3.field6658, class493.field7455);
               }
            } else if (~arg0 == -5) {
               if (arg1.method4604(-1)) {
                  return !arg3.method4604(-1) ? 1 : 0;
               } else {
                  return !arg3.method4604(-1) ? 0 : -1;
               }
            } else if (~arg0 == -6) {
               if (arg1.method4605(2)) {
                  return arg3.method4605(2) ? 0 : 1;
               } else {
                  return arg3.method4605(2) ? -1 : 0;
               }
            } else if (arg0 == 6) {
               if (!arg1.method4606((byte)126)) {
                  return arg3.method4606((byte)123) ? -1 : 0;
               } else {
                  return arg3.method4606((byte)-14) ? 0 : 1;
               }
            } else if (~arg0 == -8) {
               if (!arg1.method4602(8380)) {
                  return arg3.method4602(8380) ? -1 : 0;
               } else {
                  return arg3.method4602(8380) ? 0 : 1;
               }
            } else if (arg0 != 8) {
               return -arg3.field6662 + arg1.field6662;
            } else {
               int var7 = arg1.field6660;
               int var8 = arg3.field6660;
               if (!arg4) {
                  if (var7 == -1) {
                     var7 = 1000;
                  }

                  if (~var8 != 0) {
                     return var7 - var8;
                  }

                  var8 = 1000;
                  if (!client.field1786) {
                     return var7 - var8;
                  }
               }

               if (~var8 == -1001) {
                  var8 = -1;
               }

               if (var7 == 1000) {
                  var7 = -1;
               }

               return var7 - var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2292[4] + arg0 + ',' + (arg1 != null ? field2292[3] : field2292[2]) + ',' + arg2 + ',' + (arg3 != null ? field2292[3] : field2292[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1392(boolean arg0) {
      try {
         if (arg0) {
            field2291 = 72;
         }

         field2290 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2292[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "<init>",
      descriptor = "(Lmu;II[B)V"
   )
   public class153(class258 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field2289 = arg0.method2214(arg1, false, arg2, class342.field5203, (byte)75, arg3);
         this.field2289.method2358(-3545, false, false);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2292[1] + (arg0 != null ? field2292[3] : field2292[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2292[3] : field2292[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "<init>",
      descriptor = "(Lmu;II[I)V"
   )
   public class153(class258 arg0, int arg1, int arg2, int[] arg3) {
      try {
         this.field2289 = arg0.method2177(false, -1, arg1, arg3, arg2);
         this.field2289.method2358(-3545, false, false);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2292[1] + (arg0 != null ? field2292[3] : field2292[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2292[3] : field2292[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1393(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1394(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
