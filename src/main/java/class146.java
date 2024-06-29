import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class146 {
   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1839 = new String[]{method1211(method1210("\b\u0006")), method1211(method1210("\u0015\u0018%mi")), method1211(method1210("\u0015\u0018%ni"))};
   @OriginalMember(
      owner = "client!vr",
      name = "f",
      descriptor = "Z"
   )
   public static volatile boolean field1829 = true;
   @OriginalMember(
      owner = "client!vr",
      name = "d",
      descriptor = "I"
   )
   public static int field1830;
   @OriginalMember(
      owner = "client!vr",
      name = "h",
      descriptor = "I"
   )
   public int field1831;
   @OriginalMember(
      owner = "client!vr",
      name = "i",
      descriptor = "I"
   )
   public int field1832;
   @OriginalMember(
      owner = "client!vr",
      name = "c",
      descriptor = "I"
   )
   public int field1833;
   @OriginalMember(
      owner = "client!vr",
      name = "g",
      descriptor = "I"
   )
   public int field1834;
   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "I"
   )
   public int field1835;
   @OriginalMember(
      owner = "client!vr",
      name = "j",
      descriptor = "I"
   )
   public int field1836;
   @OriginalMember(
      owner = "client!vr",
      name = "e",
      descriptor = "I"
   )
   public static int field1837;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!vr",
      name = "b",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1838;

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(I)Lwba;"
   )
   public static final class55 method1207(int arg0) {
      try {
         if (arg0 != -9) {
            return null;
         } else {
            ++field1830;
            return class663.field9609;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1839[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(IIIIBIII)V"
   )
   public static final void method1208(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field1837;
         if (arg3 >= 0 && ~arg7 <= -1 && ~arg3 > ~(class323.field4603 - 1) && class178.field2197 + -1 > arg7) {
            label162: {
               if (class353.field5360 == null) {
                  return;
               }

               if (~arg6 != -1) {
                  if (~arg6 != -2) {
                     if (~arg6 == -3) {
                        class86 var9 = (class86)class660.method4742(arg2, arg3, arg7, field1838 != null ? field1838 : (field1838 = method1209(field1839[0])));
                        if (var9 == null) {
                           break label162;
                        }

                        if (~arg1 == -12) {
                           arg1 = 10;
                        }

                        if (var9 instanceof class451) {
                           ((class451)var9).field6849.method4203(arg0, -1);
                           if (var8 == 0) {
                              break label162;
                           }
                        }

                        class788.method5655(arg6, arg2, arg3, arg7, -2, arg5, arg1, arg0, var9.method350(25061));
                        if (var8 == 0) {
                           break label162;
                        }
                     }

                     if (~arg6 != -4) {
                        break label162;
                     }

                     class86 var10 = (class86)class97.method856(arg2, arg3, arg7);
                     if (var10 == null) {
                        break label162;
                     }

                     if (var10 instanceof class74) {
                        ((class74)var10).field948.method4203(arg0, -1);
                        if (var8 == 0) {
                           break label162;
                        }
                     }

                     class788.method5655(arg6, arg2, arg3, arg7, -2, arg5, arg1, arg0, var10.method350(25061));
                     if (var8 == 0) {
                        break label162;
                     }
                  }

                  class86 var11 = (class86)class746.method5435(arg2, arg3, arg7);
                  if (var11 == null) {
                     break label162;
                  }

                  if (var11 instanceof class718) {
                     ((class718)var11).field10671.method4203(arg0, -1);
                     if (var8 == 0) {
                        break label162;
                     }
                  }

                  int var12 = var11.method350(25061);
                  if (arg1 != 4 && ~arg1 != -6) {
                     if (~arg1 == -7) {
                        class788.method5655(arg6, arg2, arg3, arg7, -2, arg5 + 4, 4, arg0, var12);
                        if (var8 == 0) {
                           break label162;
                        }
                     }

                     if (arg1 != 7) {
                        if (~arg1 != -9) {
                           break label162;
                        }

                        class788.method5655(arg6, arg2, arg3, arg7, -2, arg5 + 4, 4, arg0, var12);
                        class788.method5655(arg6, arg2, arg3, arg7, -2, (3 & arg5 + 2) - -4, 4, arg0, var12);
                        if (var8 == 0) {
                           break label162;
                        }
                     }

                     class788.method5655(arg6, arg2, arg3, arg7, -2, (3 & arg5 - -2) + 4, 4, arg0, var12);
                     if (var8 == 0) {
                        break label162;
                     }
                  }

                  class788.method5655(arg6, arg2, arg3, arg7, -2, arg5, 4, arg0, var12);
                  if (var8 == 0) {
                     break label162;
                  }
               }

               class86 var13 = (class86)class29.method203(arg2, arg3, arg7);
               class86 var14 = (class86)class600.method4389(arg2, arg3, arg7);
               if (var13 != null && arg1 != 2) {
                  label161: {
                     if (!(var13 instanceof class365)) {
                        class788.method5655(arg6, arg2, arg3, arg7, -2, arg5, arg1, arg0, var13.method350(25061));
                        if (var8 == 0) {
                           break label161;
                        }
                     }

                     ((class365)var13).field5482.method4203(arg0, -1);
                  }
               }

               if (var14 != null) {
                  label93: {
                     if (var14 instanceof class365) {
                        ((class365)var14).field5482.method4203(arg0, -1);
                        if (var8 == 0) {
                           break label93;
                        }
                     }

                     class788.method5655(arg6, arg2, arg3, arg7, -2, arg5, arg1, arg0, var14.method350(25061));
                  }
               }
            }
         }

         if (arg4 >= -105) {
            method1208(-58, 96, -107, -50, (byte)20, 7, -89, -27);
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field1839[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1209(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
