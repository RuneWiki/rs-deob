import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public abstract class class567 {
   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "Lce;"
   )
   public class327 field7728;
   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7739 = new String[]{method4065(method4064("\u0004\u001f)\u0000v")), method4065(method4064("\u0004\u001f)\u001bv")), method4065(method4064("\u001f\u0018k#")), method4065(method4064("\u0004\u001f)\u001av")), method4065(method4064("\nC)a#")), method4065(method4064("\u0004\u001f)\u0003v")), method4065(method4064("\u0004\u001f)s7\u001f\u0004sqv")), method4065(method4064("\u0004\u001f)\u001dv")), method4065(method4064("\u0004\u001f)\u0001v")), method4065(method4064("\u0004\u001f)\u001fv")), method4065(method4064("\u0004\u001f)\u001ev")), method4065(method4064("\u0004\u001f)\u0004v"))};
   @OriginalMember(
      owner = "client!ur",
      name = "j",
      descriptor = "I"
   )
   public static int field7735 = 0;
   @OriginalMember(
      owner = "client!ur",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field7736 = new int[]{104, 120, 136, 168};
   @OriginalMember(
      owner = "client!ur",
      name = "h",
      descriptor = "Ltga;"
   )
   public static class63 field7729 = new class63(1);
   @OriginalMember(
      owner = "client!ur",
      name = "c",
      descriptor = "I"
   )
   public static int field7725;
   @OriginalMember(
      owner = "client!ur",
      name = "g",
      descriptor = "I"
   )
   public static int field7726;
   @OriginalMember(
      owner = "client!ur",
      name = "m",
      descriptor = "I"
   )
   public static int field7727;
   @OriginalMember(
      owner = "client!ur",
      name = "n",
      descriptor = "I"
   )
   public static int field7730;
   @OriginalMember(
      owner = "client!ur",
      name = "e",
      descriptor = "I"
   )
   public static int field7731;
   @OriginalMember(
      owner = "client!ur",
      name = "f",
      descriptor = "I"
   )
   public static int field7732;
   @OriginalMember(
      owner = "client!ur",
      name = "l",
      descriptor = "I"
   )
   public static int field7733;
   @OriginalMember(
      owner = "client!ur",
      name = "d",
      descriptor = "I"
   )
   public static int field7734;
   @OriginalMember(
      owner = "client!ur",
      name = "k",
      descriptor = "I"
   )
   public static int field7738;
   @OriginalMember(
      owner = "client!ur",
      name = "i",
      descriptor = "Lqh;"
   )
   public static class74 field7737;

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(Z[[[BIBIIZ)V"
   )
   public static final void method4060(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
      int var7 = arg0 ? 1 : 0;
      class766.field11052 = 0;
      class552.field7595 = 0;
      ++class728.field10667;
      if ((arg5 & 2) == 0) {
         for(class80 var8 = class8.field111[var7]; var8 != null; var8 = var8.field1004) {
            if (!class627.method4558(var8, arg0, arg1, arg2, arg3)) {
               class635.method4611(var8);
               if (var8.field993 != -1) {
                  class257.field3289[class766.field11052++] = var8;
               }
            }
         }
      }

      if ((arg5 & 1) == 0) {
         for(class80 var9 = class735.field10736[var7]; var9 != null; var9 = var9.field1004) {
            if (!class627.method4558(var9, arg0, arg1, arg2, arg3)) {
               class635.method4611(var9);
               if (var9.field993 != -1) {
                  class24.field308[class552.field7595++] = var9;
               }
            }
         }

         for(class80 var10 = class234.field2900[var7]; var10 != null; var10 = var10.field1004) {
            if (!class627.method4558(var10, arg0, arg1, arg2, arg3)) {
               if (var10.method775(0)) {
                  class635.method4611(var10);
                  if (var10.field993 != -1) {
                     class24.field308[class552.field7595++] = var10;
                  }
               } else {
                  class635.method4611(var10);
                  if (var10.field993 != -1) {
                     class257.field3289[class766.field11052++] = var10;
                  }
               }
            }
         }

         if (!arg0) {
            for(int var11 = 0; var11 < class450.field6222; ++var11) {
               if (!class627.method4558(class422.field5939[var11], arg0, arg1, arg2, arg3)) {
                  class635.method4611(class422.field5939[var11]);
                  if (class422.field5939[var11].field993 != -1) {
                     if (class422.field5939[var11].method775(0)) {
                        class24.field308[class552.field7595++] = class422.field5939[var11];
                     } else {
                        class257.field3289[class766.field11052++] = class422.field5939[var11];
                     }
                  }
               }
            }
         }
      }

      if (class766.field11052 > 0) {
         class95.method889(class257.field3289, 0, class766.field11052 - 1);

         for(int var12 = 0; var12 < class766.field11052; ++var12) {
            class375.method2903(class257.field3289[var12], true, arg6);
         }
      }

      if (class518.field7112) {
         class292.field3851.method601(0, (class127[])null);
      }

      if ((arg5 & 2) == 0) {
         for(int var13 = class575.field7913; var13 < class398.field5594; ++var13) {
            if (var13 >= arg2 && arg1 != null) {
               int var14 = class426.field5961.length;
               if (class426.field5961.length + class173.field2157 > class635.field8973) {
                  var14 -= class426.field5961.length + class173.field2157 - class635.field8973;
               }

               int var15 = class426.field5961[0].length;
               if (class426.field5961[0].length + class377.field5286 > class304.field4042) {
                  var15 -= class426.field5961[0].length + class377.field5286 - class304.field4042;
               }

               boolean[][] var16 = class370.field5212;
               if (class476.field6583) {
                  if (class100.field1284) {
                     var16 = class505.field6922[var13];
                  }

                  for(int var17 = class665.field9466; var17 < var14; ++var17) {
                     int var18 = class173.field2157 + var17 - class665.field9466;

                     for(int var19 = class259.field3322; var19 < var15; ++var19) {
                        var16[var17][var19] = false;
                        if (class426.field5961[var17][var19]) {
                           int var20 = class377.field5286 + var19 - class259.field3322;

                           for(int var21 = var13; var21 >= 0; --var21) {
                              if (class111.field1404[var21][var18][var20] != null && class111.field1404[var21][var18][var20].field2825 == var13) {
                                 if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class486.method3534(var18, var20, -17319, var13)) {
                                    var16[var17][var19] = true;
                                    break;
                                 }

                                 var16[var17][var19] = false;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               if (class100.field1284) {
                  if (arg4 >= 0) {
                     class93.field1241[var13].method1682(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class93.field1241[var13].method1684(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var22 = 0; var22 < class46.field533; ++var22) {
                     class305.field4051[var22].method5420(new class614(var13 + 1), true);
                  }
               } else if (arg4 >= 0) {
                  class93.field1241[var13].method1682(class367.field5174, class406.field5720, class224.field2812, class370.field5212, false, arg4, arg5);
               } else {
                  class93.field1241[var13].method1684(class367.field5174, class406.field5720, class224.field2812, class370.field5212, false, arg5);
               }
            } else {
               int var23 = class426.field5961.length;
               if (class426.field5961.length + class173.field2157 > class635.field8973) {
                  var23 -= class426.field5961.length + class173.field2157 - class635.field8973;
               }

               int var24 = class426.field5961[0].length;
               if (class426.field5961[0].length + class377.field5286 > class304.field4042) {
                  var24 -= class426.field5961[0].length + class377.field5286 - class304.field4042;
               }

               boolean[][] var25 = class370.field5212;
               if (class476.field6583) {
                  if (class100.field1284) {
                     var25 = class505.field6922[var13];
                  }

                  for(int var26 = class665.field9466; var26 < var23; ++var26) {
                     int var27 = class173.field2157 + var26 - class665.field9466;

                     for(int var28 = class259.field3322; var28 < var24; ++var28) {
                        if (class426.field5961[var26][var28] && !class486.method3534(var27, class377.field5286 + var28 - class259.field3322, -17319, var13)) {
                           var25[var26][var28] = true;
                        } else {
                           var25[var26][var28] = false;
                        }
                     }
                  }
               }

               if (class100.field1284) {
                  if (arg4 >= 0) {
                     class93.field1241[var13].method1682(0, 0, 0, (boolean[][])null, false, arg4, arg5);
                  } else {
                     class93.field1241[var13].method1684(0, 0, 0, (boolean[][])null, false, arg5);
                  }

                  for(int var29 = 0; var29 < class46.field533; ++var29) {
                     class305.field4051[var29].method5420(new class614(var13 + 1), true);
                  }
               } else if (arg4 >= 0) {
                  class93.field1241[var13].method1682(class367.field5174, class406.field5720, class224.field2812, class370.field5212, true, arg4, arg5);
               } else {
                  class93.field1241[var13].method1684(class367.field5174, class406.field5720, class224.field2812, class370.field5212, true, arg5);
               }
            }
         }
      }

      if (class552.field7595 > 0) {
         class632.method4588(class24.field308, 0, class552.field7595 - 1);

         for(int var30 = 0; var30 < class552.field7595; ++var30) {
            class375.method2903(class24.field308[var30], true, arg6);
         }
      }

   }

   @OriginalMember(
      owner = "client!ur",
      name = "c",
      descriptor = "(I)V"
   )
   public void method5(int arg0) {
      try {
         ++field7726;
         if (arg0 >= -38) {
            field7737 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "b",
      descriptor = "(B)V"
   )
   public void method467(byte arg0) {
      try {
         if (arg0 > -44) {
            field7737 = null;
         }

         ++field7733;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method3(int arg0);

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method7(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!ur",
      name = "e",
      descriptor = "(I)V"
   )
   public void method2(int arg0) {
      try {
         if (arg0 != 7938) {
            field7738 = 55;
         }

         ++field7730;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4061(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 > -11) {
            return 67;
         } else {
            ++field7725;
            int var7 = (-16711936 & (16711935 & arg1) * arg3 | 16711680 & (65280 & arg1) * arg3) >>> 8;
            int var4 = -arg3 + 255;
            return ((-16711936 & (16711935 & arg2) * var4 | (65280 & arg2) * var4 & 16711680) >>> 8) + var7;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7739[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method1(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ur",
      name = "d",
      descriptor = "(I)V"
   )
   public void method10(int arg0) {
      try {
         if (arg0 != -16711936) {
            field7729 = null;
         }

         ++field7732;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method9(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ur",
      name = "f",
      descriptor = "(I)V"
   )
   public void method6(int arg0) {
      try {
         if (arg0 <= 103) {
            field7737 = null;
         }

         ++field7727;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(ILria;)V"
   )
   public static final void method4062(int arg0, class301 arg1) {
      try {
         if (arg0 > -115) {
            field7735 = -44;
         }

         ++field7734;
         arg1.field3968 = null;
         if (~class605.field8476 > -21) {
            class542.field7394.method3116(arg1, 47);
            ++class605.field8476;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[3] + arg0 + ',' + (arg1 != null ? field7739[4] : field7739[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method11(byte arg0);

   @OriginalMember(
      owner = "client!ur",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4063(int arg0) {
      try {
         int var1 = 35 % ((arg0 - -30) / 43);
         field7729 = null;
         field7736 = null;
         field7737 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(I)V"
   )
   public void method4(int arg0) {
      try {
         int var2 = 108 % ((62 - arg0) / 45);
         ++field7731;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7739[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "(Lce;)V"
   )
   public class567(class327 arg0) {
      try {
         this.field7728 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7739[6] + (arg0 != null ? field7739[4] : field7739[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public abstract void method8(boolean arg0, class159 arg1, int arg2);

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4064(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4065(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
