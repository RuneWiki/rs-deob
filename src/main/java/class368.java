import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class368 {
   @OriginalMember(
      owner = "client!ow",
      name = "j",
      descriptor = "J"
   )
   private long field5187 = -1L;
   @OriginalMember(
      owner = "client!ow",
      name = "i",
      descriptor = "Lod;"
   )
   private class536 field5182 = new class536();
   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5188 = new String[]{method2846(method2845("\nW'\u0015\u0005")), method2846(method2845("\nW'\u0014\u0005")), method2846(method2845("\u000bUe<")), method2846(method2845("\u001e\u000e'~P")), method2846(method2845("\nW'lD\u000bI}n\u0005")), method2846(method2845("\nW'\u0013\u0005")), method2846(method2845("\nW'\u0011\u0005")), method2846(method2845("&Lh>n\rAg>H\tdl<Y\u0004\u000eh ]\tY]?n\tAg\u0013E\u0004Ng5AM\t3pn\u0017Em5C\u0011Ih<^EDfpC\nT)=L\u0011Caq\r\u0006C'3A\u0004NA1^\r\u001a")), method2846(method2845("EUy4L\u0011EG%@_")), method2846(method2845("EDl<Y\u0004\u000ej<L\u000bhh#E_")), method2846(method2845("\nW'\u0012\u0005")), method2846(method2845("0N{5N\nGg9^\u0000D)\u0013A\u0004NJ8L\u000bNl<i\u0000L}1\r\u0011Yy5\r\fN)4H\u0006Om5\u0005L"))};
   @OriginalMember(
      owner = "client!ow",
      name = "h",
      descriptor = "I"
   )
   public static int field5179 = -1;
   @OriginalMember(
      owner = "client!ow",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field5186 = new int[32];
   @OriginalMember(
      owner = "client!ow",
      name = "f",
      descriptor = "I"
   )
   public static int field5181;
   @OriginalMember(
      owner = "client!ow",
      name = "g",
      descriptor = "I"
   )
   public static int field5183;
   @OriginalMember(
      owner = "client!ow",
      name = "c",
      descriptor = "I"
   )
   public static int field5184;
   @OriginalMember(
      owner = "client!ow",
      name = "d",
      descriptor = "I"
   )
   public static int field5185;
   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "J"
   )
   private long field5180;
   @OriginalMember(
      owner = "client!ow",
      name = "e",
      descriptor = "Ld;"
   )
   public static class160 field5178;

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(ZLob;)V"
   )
   public final void method2840(boolean param1, class772 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2841(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         ++field5181;
         if (class576.field7916 != arg0) {
            class534.field7301 = new int[arg0];
            int var4 = 0;
            if (var3) {
               class534.field7301[var4] = (var4 << 12) / arg0;
               ++var4;
            }

            while(true) {
               while(arg0 > var4) {
                  class534.field7301[var4] = (var4 << 12) / arg0;
                  ++var4;
               }

               class676.field9924 = arg0 - 1;
               class162.field2043 = arg0 * 32;
               if (!var3) {
                  class576.field7916 = arg0;
                  break;
               }

               ++var4;
            }
         }

         if (arg1 != 1159665196) {
            method2841(30, 86, -87);
         }

         if (~class392.field5515 != ~arg2) {
            label56: {
               if (class576.field7916 != arg2) {
                  class551.field7586 = new int[arg2];
                  int var5 = 0;
                  if (var3) {
                     class551.field7586[var5] = (var5 << 12) / arg2;
                     ++var5;
                  }

                  while(true) {
                     while(arg2 > var5) {
                        class551.field7586[var5] = (var5 << 12) / arg2;
                        ++var5;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label56;
                        }
                        break;
                     }

                     ++var5;
                  }
               }

               class551.field7586 = class534.field7301;
            }

            class40.field468 = arg2 - 1;
            class392.field5515 = arg2;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5188[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   private final void method2842(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      RuntimeException var10000;
      label63: {
         int var4;
         boolean var10001;
         try {
            ++field5184;
            this.field5180 = arg0.method4304((byte)-33);
            this.field5187 = arg0.method4304((byte)122);
            var4 = arg0.method4288((byte)72);
            if (arg1 != 1407) {
               return;
            }
         } catch (RuntimeException var10) {
            var10000 = var10;
            var10001 = false;
            break label63;
         }

         while(true) {
            class758 var5;
            label58: {
               label57: {
                  try {
                     if (var4 != 0) {
                        if (var4 != 1) {
                           if (~var4 == -5) {
                              var5 = new class582();
                              if (!var3) {
                                 break label58;
                              }
                           }

                           if (~var4 != -4) {
                              if (var4 != 2) {
                                 throw new RuntimeException(field5188[11]);
                              }

                              var5 = new class578();
                              if (!var3) {
                                 break label58;
                              }
                           }

                           var5 = new class321();
                           if (!var3) {
                              break label58;
                           }
                        }
                        break label57;
                     }
                  } catch (RuntimeException var9) {
                     var10000 = var9;
                     var10001 = false;
                     break;
                  }

                  if (!var3) {
                     return;
                  }
               }

               try {
                  var5 = new class166();
               } catch (RuntimeException var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }

            try {
               var5.method1313(arg0, (byte)-46);
               this.field5182.method3859(arg1 + -1405, var5);
               var4 = arg0.method4288((byte)68);
            } catch (RuntimeException var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var6 = var10000;
      throw class534.method3846(var6, field5188[10] + (arg0 != null ? field5188[3] : field5188[2]) + ',' + arg1 + ')');
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(IZIZIII)V"
   )
   public static final void method2843(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         if (arg4 > arg2) {
            int var8 = (arg2 - -arg4) / 2;
            int var9 = arg2;
            class78 var10 = class182.field2252[var8];
            class182.field2252[var8] = class182.field2252[arg4];
            class182.field2252[arg4] = var10;
            int var11 = arg2;
            class78 var12;
            if (var7) {
               if (~class150.method1249(arg6, (byte)-8, class182.field2252[arg2], var10, arg3, (boolean)arg1, arg0) >= -1) {
                  var12 = class182.field2252[arg2];
                  class182.field2252[arg2] = class182.field2252[arg2];
                  var9 = arg2 + 1;
                  class182.field2252[arg2] = var12;
               }

               var11 = arg2 + 1;
            }

            while(true) {
               int var10000;
               byte var10001;
               if (~var11 <= ~arg4) {
                  class182.field2252[arg4] = class182.field2252[var9];
                  class182.field2252[var9] = var10;
                  method2843(arg0, (boolean)arg1, arg2, arg3, var9 - 1, -32427, arg6);
                  var10000 = arg0;
                  var10001 = arg1;
                  if (!var7) {
                     method2843(arg0, (boolean)arg1, var9 + 1, arg3, arg4, -32427, arg6);
                     break;
                  }
               } else {
                  var10000 = ~class150.method1249(arg6, (byte)-8, class182.field2252[var11], var10, arg3, (boolean)arg1, arg0);
                  var10001 = -1;
               }

               if (var10000 >= var10001) {
                  var12 = class182.field2252[var11];
                  class182.field2252[var11] = class182.field2252[var9];
                  class182.field2252[var9++] = var12;
               }

               ++var11;
            }
         }

         if (arg5 == -32427) {
            ++field5183;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field5188[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2844(byte arg0) {
      try {
         int var1 = -108 / ((-10 - arg0) / 34);
         field5178 = null;
         field5186 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5188[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "<init>",
      descriptor = "(Lwm;)V"
   )
   public class368(class594 arg0) {
      try {
         this.method2842(arg0, 1407);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5188[4] + (arg0 != null ? field5188[3] : field5188[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2845(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2846(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
