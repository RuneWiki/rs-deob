import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class192 extends class305 {
   @OriginalMember(
      owner = "client!r",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2900 = new String[]{method1679(method1678("sn~\u000b")), method1679(method1678("!0IJBdz")), method1679(method1678("sn{\u000b")), method1679(method1678("f.J\u0017\u0018t+\u0000")), method1679(method1678("f.J\u0011\u0018q/I\u0019")), method1679(method1678("!3SY];")), method1679(method1678("f.J\u0012\u0018q/I\u0019")), method1679(method1678("f.J\u0010\u0018l)I\u0019")), method1679(method1678("zn\u0014\rE")), method1679(method1678("o5VO")), method1679(method1678("sny\u000b")), method1679(method1678("snx\u000b")), method1679(method1678("sn\u007f\u000b"))};
   @OriginalMember(
      owner = "client!r",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field2897 = new int[25];
   @OriginalMember(
      owner = "client!r",
      name = "y",
      descriptor = "I"
   )
   public static int field2895;
   @OriginalMember(
      owner = "client!r",
      name = "x",
      descriptor = "I"
   )
   public static int field2896;
   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "I"
   )
   public static int field2898;
   @OriginalMember(
      owner = "client!r",
      name = "v",
      descriptor = "I"
   )
   public static int field2899;

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(Laf;II[I)V"
   )
   public static final void method1673(class457 arg0, int arg1, int arg2, int[] arg3) {
      boolean var4 = client.field4564;

      try {
         if (arg0.field11288 != null) {
            int var10000;
            label94: {
               byte var5 = 1;
               int var6 = 0;
               if (var4) {
                  var10000 = arg0.field11288[var6];
               } else if (~var6 <= ~arg0.field11288.length) {
                  var10000 = var5;
                  if (!var4) {
                     break label94;
                  }
               } else {
                  var10000 = arg0.field11288[var6];
               }

               label93:
               do {
                  while(true) {
                     if (var10000 != arg3[var6]) {
                        var5 = 0;
                        if (!var4) {
                           var10000 = var5;
                           break;
                        }

                        ++var6;
                     } else {
                        ++var6;
                     }

                     if (~var6 <= ~arg0.field11288.length) {
                        var10000 = var5;
                        if (!var4) {
                           break label93;
                        }
                     } else {
                        var10000 = arg0.field11288[var6];
                     }
                  }
               } while(var4);
            }

            if (var10000 != 0 && ~arg0.field11224 != 0) {
               class295 var7 = class588.field8496.method3781(arg2 ^ 5, arg0.field11224);
               int var8 = var7.field4114;
               if (~var8 == -2) {
                  arg0.field11234 = 0;
                  arg0.field11295 = arg1;
                  arg0.field11250 = 0;
                  arg0.field11231 = 1;
                  arg0.field11267 = 0;
                  if (!arg0.field11222) {
                     class720.method5205(0, arg0, arg0.field11267, var7);
                  }
               }

               if (~var8 == -3) {
                  arg0.field11234 = 0;
               }
            }
         }

         ++field2898;
         boolean var9 = true;
         int var10 = arg2;
         if (var4) {
            if (~arg3[arg2] != 0) {
               var9 = false;
            }
         } else if (arg2 >= arg3.length) {
            if (!var4) {
               if (var9) {
                  arg0.field11288 = arg3;
                  arg0.field11295 = arg1;
                  return;
               }

               return;
            }

            if (var9) {
               var9 = false;
            }
         } else if (~arg3[arg2] != 0) {
            var9 = false;
         }

         while(true) {
            while(true) {
               if (arg0.field11288 != null && ~arg0.field11288[var10] != 0 && class588.field8496.method3781(5, arg3[var10]).field4108 < class588.field8496.method3781(5, arg0.field11288[var10]).field4108) {
                  ++var10;
                  break;
               }

               arg0.field11288 = arg3;
               arg0.field11295 = arg1;
               if (var4) {
                  ++var10;
                  break;
               }

               if (!var4) {
                  if (var9) {
                     arg0.field11288 = arg3;
                     arg0.field11295 = arg1;
                     return;
                  }

                  return;
               }

               if (var9) {
                  var9 = false;
               }
            }

            if (var10 >= arg3.length) {
               if (!var4) {
                  if (var9) {
                     arg0.field11288 = arg3;
                     arg0.field11295 = arg1;
                     return;
                  }

                  return;
               }

               if (var9) {
                  var9 = false;
               }
            } else if (~arg3[var10] != 0) {
               var9 = false;
            }
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field2900[10] + (arg0 != null ? field2900[8] : field2900[9]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2900[8] : field2900[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(IIIIIIBII)V"
   )
   public static final void method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
      try {
         ++field2895;
         if (arg6 < 26) {
            field2897 = null;
         }

         class417.method3184(arg4, arg0, -22719, arg1, arg5, 0, arg3, arg7, arg8, arg2);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2900[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method1675(int arg0) {
      try {
         field2897 = null;
         if (arg0 <= 30) {
            field2897 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2900[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method1676(int arg0, boolean arg1, int arg2) {
      try {
         ++field2896;
         if (arg1) {
            field2897 = null;
         }

         return (arg0 & 1048832) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2900[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1677(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1678(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1679(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
