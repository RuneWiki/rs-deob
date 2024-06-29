import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class340 {
   @OriginalMember(
      owner = "client!vea",
      name = "k",
      descriptor = "Z"
   )
   public boolean field4678;
   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4689 = new String[]{method2722(method2721("=`\t\u0016ec")), method2722(method2721("=`\t\u0016dc")), method2722(method2721("=`\t\u0016bc")), method2722(method2721("=`\t\u0016\u001c\"k\u0001L\u001ec")), method2722(method2721("=`\t\u0016ac")), method2722(method2721("?b\t")), method2722(method2721("=`\t\u0016cc"))};
   @OriginalMember(
      owner = "client!vea",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field4680 = true;
   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4687 = null;
   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "I"
   )
   public static int field4679;
   @OriginalMember(
      owner = "client!vea",
      name = "c",
      descriptor = "I"
   )
   public static int field4681;
   @OriginalMember(
      owner = "client!vea",
      name = "j",
      descriptor = "I"
   )
   public static int field4684;
   @OriginalMember(
      owner = "client!vea",
      name = "d",
      descriptor = "I"
   )
   public static int field4686;
   @OriginalMember(
      owner = "client!vea",
      name = "g",
      descriptor = "Lbc;"
   )
   public class11 field4682;
   @OriginalMember(
      owner = "client!vea",
      name = "h",
      descriptor = "Lbc;"
   )
   public class11 field4683;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!vea",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4688;
   @OriginalMember(
      owner = "client!vea",
      name = "e",
      descriptor = "Z"
   )
   public boolean field4685;

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2715(byte arg0) {
      try {
         field4687 = null;
         if (arg0 != 33) {
            field4680 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4689[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2716(byte arg0) {
      try {
         ++field4679;
         if (this.field4683 != null) {
            this.field4683.method105(-112);
         }

         this.field4685 = false;
         if (arg0 >= -36) {
            this.field4682 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4689[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(JB)V"
   )
   public static final void method2717(long arg0, byte arg1) {
      try {
         ++field4686;
         if (~arg0 < -1L) {
            if (arg1 != -119) {
               method2719(40, -15, 61, -64, 113, 113, (byte)79, 67);
            }

            if (~(arg0 % 10L) == -1L) {
               class465.method3541(arg0 + -1L, 0);
               class465.method3541(1L, 0);
            } else {
               class465.method3541(arg0, arg1 ^ -119);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4689[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method2718(int arg0) {
      try {
         if (arg0 != 3169) {
            this.field4678 = true;
         }

         ++field4681;
         return this.field4685 && !this.field4678;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4689[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IIIIIIBI)V"
   )
   public static final void method2719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
      try {
         if (arg6 != -9) {
            field4680 = true;
         }

         ++field4684;
         if (arg3 >= 0 && ~arg0 <= -1 && ~arg3 > ~(class273.field3491 + -1) && arg0 < class211.field2689 + -1) {
            if (class548.field8080 != null) {
               if (~arg1 != -1) {
                  if (~arg1 == -2) {
                     class660 var8 = (class660)class623.method4610(arg7, arg3, arg0);
                     if (var8 != null) {
                        if (!(var8 instanceof class623)) {
                           int var9 = var8.method175((byte)9);
                           if (arg4 == 4 || ~arg4 == -6) {
                              class509.method3846(arg5, 4, arg2, var9, arg3, arg1, true, arg0, arg7);
                              return;
                           }

                           if (~arg4 == -7) {
                              class509.method3846(arg5 + 4, 4, arg2, var9, arg3, arg1, true, arg0, arg7);
                              return;
                           }

                           if (arg4 == 7) {
                              class509.method3846((arg5 - -2 & 3) + 4, 4, arg2, var9, arg3, arg1, true, arg0, arg7);
                              return;
                           }

                           if (arg4 == 8) {
                              class509.method3846(arg5 + 4, 4, arg2, var9, arg3, arg1, true, arg0, arg7);
                              class509.method3846((3 & arg5 + 2) + 4, 4, arg2, var9, arg3, arg1, true, arg0, arg7);
                              return;
                           }
                        } else {
                           ((class623)var8).field9211.method1852(false, arg2);
                        }

                        return;
                     }

                     return;
                  }

                  if (arg1 == 2) {
                     class660 var10 = (class660)class338.method2672(arg7, arg3, arg0, field4688 != null ? field4688 : (field4688 = method2720(field4689[5])));
                     if (var10 != null) {
                        if (arg4 == 11) {
                           arg4 = 10;
                        }

                        if (!(var10 instanceof class641)) {
                           class509.method3846(arg5, arg4, arg2, var10.method175((byte)9), arg3, arg1, true, arg0, arg7);
                           return;
                        }

                        ((class641)var10).field9442.method1852(false, arg2);
                        return;
                     }

                     return;
                  }

                  if (~arg1 == -4) {
                     class660 var11 = (class660)class688.method5028(arg7, arg3, arg0);
                     if (var11 != null) {
                        if (!(var11 instanceof class359)) {
                           class509.method3846(arg5, arg4, arg2, var11.method175((byte)9), arg3, arg1, true, arg0, arg7);
                           return;
                        }

                        ((class359)var11).field4992.method1852(false, arg2);
                        return;
                     }
                  }
               } else {
                  class660 var12 = (class660)class776.method5607(arg7, arg3, arg0);
                  class660 var13 = (class660)class112.method1012(arg7, arg3, arg0);
                  if (var12 != null && ~arg4 != -3) {
                     label114: {
                        if (var12 instanceof class485) {
                           ((class485)var12).field6749.method1852(false, arg2);
                           if (!client.field1481) {
                              break label114;
                           }
                        }

                        class509.method3846(arg5, arg4, arg2, var12.method175((byte)9), arg3, arg1, true, arg0, arg7);
                     }
                  }

                  if (var13 == null) {
                     return;
                  }

                  if (!(var13 instanceof class485)) {
                     class509.method3846(arg5, arg4, arg2, var13.method175((byte)9), arg3, arg1, true, arg0, arg7);
                     return;
                  }

                  ((class485)var13).field6749.method1852(false, arg2);
               }

            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field4689[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class340(boolean arg0) {
      try {
         this.field4678 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4689[3] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2720(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
