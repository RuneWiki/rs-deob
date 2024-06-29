import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class447 extends class428 {
   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6360 = new String[]{method3283(method3282("\u001e\"je\u001c")), method3283(method3282("\ffj\tI")), method3283(method3282("\u0019=(K")), method3283(method3282("\u001e\"jf\u001c")), method3283(method3282("\u001e\"jd\u001c"))};
   @OriginalMember(
      owner = "client!ij",
      name = "n",
      descriptor = "F"
   )
   public static float field6353;
   @OriginalMember(
      owner = "client!ij",
      name = "q",
      descriptor = "I"
   )
   public static int field6351;
   @OriginalMember(
      owner = "client!ij",
      name = "u",
      descriptor = "I"
   )
   public int field6352;
   @OriginalMember(
      owner = "client!ij",
      name = "s",
      descriptor = "I"
   )
   public int field6354;
   @OriginalMember(
      owner = "client!ij",
      name = "o",
      descriptor = "I"
   )
   public static int field6355;
   @OriginalMember(
      owner = "client!ij",
      name = "m",
      descriptor = "I"
   )
   public static int field6356;
   @OriginalMember(
      owner = "client!ij",
      name = "t",
      descriptor = "I"
   )
   public static int field6357;
   @OriginalMember(
      owner = "client!ij",
      name = "r",
      descriptor = "Lbda;"
   )
   public class534 field6359;
   @OriginalMember(
      owner = "client!ij",
      name = "p",
      descriptor = "Lek;"
   )
   public class536 field6358;

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(Lrv;I[II)V"
   )
   public static final void method3279(class121 arg0, int arg1, int[] arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         ++field6356;
         if (arg0.field3816 != null) {
            int var10000;
            label94: {
               byte var5 = 1;
               int var6 = 0;
               if (var4) {
                  var10000 = ~arg0.field3816[var6];
               } else if (var6 >= arg0.field3816.length) {
                  var10000 = var5;
                  if (!var4) {
                     break label94;
                  }
               } else {
                  var10000 = ~arg0.field3816[var6];
               }

               label93:
               do {
                  while(true) {
                     if (var10000 != ~arg2[var6]) {
                        var5 = 0;
                        if (!var4) {
                           var10000 = var5;
                           break;
                        }

                        ++var6;
                     } else {
                        ++var6;
                     }

                     if (var6 >= arg0.field3816.length) {
                        var10000 = var5;
                        if (!var4) {
                           break label93;
                        }
                     } else {
                        var10000 = ~arg0.field3816[var6];
                     }
                  }
               } while(var4);
            }

            if (var10000 != 0 && ~arg0.field3866 != 0) {
               class85 var7 = class190.field2702.method4411(arg0.field3866, arg3 + 106);
               int var8 = var7.field1106;
               if (var8 == 1) {
                  arg0.field3804 = 0;
                  arg0.field3874 = 0;
                  arg0.field3827 = 0;
                  arg0.field3813 = arg1;
                  arg0.field3821 = 1;
                  if (!arg0.field3801) {
                     class478.method3485(arg0.field3804, var7, 734475305, arg0);
                  }
               }

               if (~var8 == -3) {
                  arg0.field3827 = 0;
               }
            }
         }

         boolean var9 = true;
         int var10 = arg3;
         if (var4) {
            if (~arg2[arg3] != 0) {
               var9 = false;
            }
         } else if (arg3 >= arg2.length) {
            if (!var4) {
               if (var9) {
                  arg0.field3813 = arg1;
                  arg0.field3816 = arg2;
                  return;
               }

               return;
            }

            if (var9) {
               var9 = false;
            }
         } else if (~arg2[arg3] != 0) {
            var9 = false;
         }

         while(true) {
            while(true) {
               if (arg0.field3816 != null && arg0.field3816[var10] != -1 && class190.field2702.method4411(arg2[var10], 120).field1107 < class190.field2702.method4411(arg0.field3816[var10], 125).field1107) {
                  ++var10;
                  break;
               }

               arg0.field3813 = arg1;
               arg0.field3816 = arg2;
               if (var4) {
                  ++var10;
                  break;
               }

               if (!var4) {
                  if (var9) {
                     arg0.field3813 = arg1;
                     arg0.field3816 = arg2;
                     return;
                  }

                  return;
               }

               if (var9) {
                  var9 = false;
               }
            }

            if (var10 >= arg2.length) {
               if (!var4) {
                  if (var9) {
                     arg0.field3813 = arg1;
                     arg0.field3816 = arg2;
                     return;
                  }

                  return;
               }

               if (var9) {
                  var9 = false;
               }
            } else if (~arg2[var10] != 0) {
               var9 = false;
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field6360[0] + (arg0 != null ? field6360[1] : field6360[2]) + ',' + arg1 + ',' + (arg2 != null ? field6360[1] : field6360[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(IIIBIII)Llc;"
   )
   public static final class676 method3280(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
      try {
         ++field6357;
         long var7 = (long)arg5 * 76724863L ^ (long)arg2 * 475427L ^ (long)arg4 * 97549L ^ (long)arg1 * 67481L ^ (long)arg6 * 986053L ^ (long)arg0 * 32147369L;
         class676 var9 = (class676)class67.field826.method725(0, var7);
         if (var9 != null) {
            return var9;
         } else {
            class676 var10 = class274.field3758.method578(arg1, arg4, arg2, arg6, arg0, arg5);
            if (arg3 != -5) {
               method3279((class121)null, 71, (int[])null, 108);
            }

            class67.field826.method723(arg3 ^ -5, var7, var10);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field6360[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3281(byte arg0) {
      try {
         if (arg0 <= -11) {
            ++field6355;
            if (class43.field598.length > class259.field3600) {
               class43.field598[class259.field3600++] = this;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6360[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3282(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3283(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
