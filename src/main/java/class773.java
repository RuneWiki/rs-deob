import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class773 {
   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11366 = new String[]{method5589(method5588("\u0007PH\u0010M")), method5589(method5588("\u0002K\n9")), method5589(method5588("\u0017\u0010H{\u0018")), method5589(method5588("\u0007PH\u0017M")), method5589(method5588("\u0007PH\u0011M")), method5589(method5588("\u0007PH\u0016M")), method5589(method5588("\u0007PH\u0014M"))};
   @OriginalMember(
      owner = "client!kn",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field11363 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "Loi;"
   )
   public static class80 field11360 = new class80(30);
   @OriginalMember(
      owner = "client!kn",
      name = "e",
      descriptor = "F"
   )
   public static float field11364;
   @OriginalMember(
      owner = "client!kn",
      name = "b",
      descriptor = "I"
   )
   public static int field11357;
   @OriginalMember(
      owner = "client!kn",
      name = "i",
      descriptor = "I"
   )
   public static int field11358;
   @OriginalMember(
      owner = "client!kn",
      name = "f",
      descriptor = "I"
   )
   public static int field11359;
   @OriginalMember(
      owner = "client!kn",
      name = "d",
      descriptor = "I"
   )
   public static int field11361;
   @OriginalMember(
      owner = "client!kn",
      name = "h",
      descriptor = "I"
   )
   public static int field11365;
   @OriginalMember(
      owner = "client!kn",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11362;

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(IZI)I",
      line = 4
   )
   public static final int method5583(int arg0, boolean arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field11357;
         int var4 = 0;
         if (!arg1) {
            return 61;
         } else {
            while(true) {
               int var10000;
               if (~arg2 >= -1) {
                  var10000 = var4;
                  if (!var3) {
                     return var4;
                  }
               } else {
                  var4 = var4 << 1 | arg0 & 1;
                  var10000 = arg0 >>> 1;
               }

               arg0 = var10000;
               --arg2;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11366[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(I)V",
      line = 24
   )
   public static void method5584(int arg0) {
      try {
         field11362 = null;
         if (arg0 == -28862) {
            field11363 = null;
            field11360 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11366[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(IIIIILud;)V",
      line = 42
   )
   public static final void method5585(int arg0, int arg1, int arg2, int arg3, int arg4, class39 arg5) {
      try {
         if (arg4 > 123) {
            ++field11361;
            if (~arg0 <= -2 && arg3 >= 1 && ~arg0 >= ~(class644.field9403 - 2) && class337.field4594 + -2 >= arg3) {
               if (class663.field9659 == null) {
                  return;
               }

               class604 var6 = class101.field1294.method1932(arg1, arg0, arg2, -58, arg3);
               if (var6 != null) {
                  if (!(var6 instanceof class288)) {
                     if (var6 instanceof class238) {
                        ((class238)var6).method1830(arg5, (byte)45);
                        return;
                     }

                     if (!(var6 instanceof class617)) {
                        if (var6 instanceof class609) {
                           ((class609)var6).method4435(arg5, (byte)-46);
                           return;
                        }
                     } else {
                        ((class617)var6).method4484(arg5, false);
                     }

                     return;
                  }

                  ((class288)var6).method2177(arg5, 262144);
                  return;
               }
            }

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11366[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11366[2] : field11366[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(ILbl;II)V",
      line = 83
   )
   public static final void method5586(int arg0, class678 arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         label125: {
            if (arg1.field9918 != arg3) {
               if (~arg1.field9918 != -2) {
                  if (~arg1.field9918 == -3) {
                     arg1.field9879 = arg2 - arg1.field9904 + -arg1.field9986;
                     if (!var4) {
                        break label125;
                     }
                  }

                  if (~arg1.field9918 == -4) {
                     arg1.field9879 = arg1.field9986 * arg2 >> 14;
                     if (!var4) {
                        break label125;
                     }
                  }

                  if (arg1.field9918 != 4) {
                     arg1.field9879 = -(arg1.field9986 * arg2 >> 14) + -arg1.field9904 + arg2;
                     if (!var4) {
                        break label125;
                     }
                  }

                  arg1.field9879 = (arg1.field9986 * arg2 >> 14) + (-arg1.field9904 + arg2) / 2;
                  if (!var4) {
                     break label125;
                  }
               }

               arg1.field9879 = (-arg1.field9904 + arg2) / 2 + arg1.field9986;
               if (!var4) {
                  break label125;
               }
            }

            arg1.field9879 = arg1.field9986;
         }

         label131: {
            ++field11365;
            if (~arg1.field9970 == -1) {
               arg1.field9820 = arg1.field9878;
               if (!var4) {
                  break label131;
               }
            }

            if (arg1.field9970 == 1) {
               arg1.field9820 = (-arg1.field9980 + arg0) / 2 + arg1.field9878;
               if (!var4) {
                  break label131;
               }
            }

            if (~arg1.field9970 == -3) {
               arg1.field9820 = arg0 - arg1.field9980 + -arg1.field9878;
               if (!var4) {
                  break label131;
               }
            }

            if (~arg1.field9970 == -4) {
               arg1.field9820 = arg1.field9878 * arg0 >> 14;
               if (!var4) {
                  break label131;
               }
            }

            if (arg1.field9970 == 4) {
               arg1.field9820 = (arg1.field9878 * arg0 >> 14) + (-arg1.field9980 + arg0) / 2;
               if (!var4) {
                  break label131;
               }
            }

            arg1.field9820 = -arg1.field9980 + arg0 + -(arg1.field9878 * arg0 >> 14);
         }

         if (class661.field9629) {
            if (client.method2351(arg1).field3965 != 0 || ~arg1.field9992 == -1) {
               label81: {
                  if (~arg1.field9879 > -1) {
                     arg1.field9879 = 0;
                     if (!var4) {
                        break label81;
                     }
                  }

                  if (arg2 < arg1.field9879 - -arg1.field9904) {
                     arg1.field9879 = arg2 - arg1.field9904;
                  }
               }

               if (arg1.field9820 >= 0) {
                  if (~arg0 > ~(arg1.field9980 + arg1.field9820)) {
                     arg1.field9820 = -arg1.field9980 + arg0;
                     return;
                  }
               } else {
                  arg1.field9820 = 0;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11366[3] + arg0 + ',' + (arg1 != null ? field11366[2] : field11366[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(Z)V",
      line = 154
   )
   public static final void method5587(boolean arg0) {
      try {
         if (!arg0) {
            field11359 = -116;
         }

         class137.method1080(-128);
         ++field11358;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11366[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5588(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5589(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
