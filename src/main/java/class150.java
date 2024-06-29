import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class150 extends class690 {
   @OriginalMember(
      owner = "client!hc",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1965 = new String[]{method1253(method1252("\u00018&\u0016W")), method1253(method1252("\u0014cdT")), method1253(method1252("\u0012u&{\u0002")), method1253(method1252("\u0012u&}\u0002")), method1253(method1252("\u0012u&|\u0002")), method1253(method1252("\u0012u&~\u0002")), method1253(method1252("\u0012u&z\u0002")), method1253(method1252("\u0012u&y\u0002"))};
   @OriginalMember(
      owner = "client!hc",
      name = "s",
      descriptor = "I"
   )
   public static int field1954 = 1338;
   @OriginalMember(
      owner = "client!hc",
      name = "w",
      descriptor = "Lnw;"
   )
   public static class616 field1956 = new class616(88, 2);
   @OriginalMember(
      owner = "client!hc",
      name = "r",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1962 = new String[200];
   @OriginalMember(
      owner = "client!hc",
      name = "t",
      descriptor = "I"
   )
   public static int field1951;
   @OriginalMember(
      owner = "client!hc",
      name = "o",
      descriptor = "I"
   )
   private int field1952;
   @OriginalMember(
      owner = "client!hc",
      name = "p",
      descriptor = "I"
   )
   public static int field1953;
   @OriginalMember(
      owner = "client!hc",
      name = "v",
      descriptor = "I"
   )
   public static int field1955;
   @OriginalMember(
      owner = "client!hc",
      name = "y",
      descriptor = "I"
   )
   private int field1957;
   @OriginalMember(
      owner = "client!hc",
      name = "n",
      descriptor = "I"
   )
   public static int field1958;
   @OriginalMember(
      owner = "client!hc",
      name = "x",
      descriptor = "I"
   )
   public static int field1960;
   @OriginalMember(
      owner = "client!hc",
      name = "m",
      descriptor = "I"
   )
   private int field1963;
   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "I"
   )
   private int field1964;
   @OriginalMember(
      owner = "client!hc",
      name = "u",
      descriptor = "Lqh;"
   )
   public static class74 field1959;
   @OriginalMember(
      owner = "client!hc",
      name = "q",
      descriptor = "Lbo;"
   )
   public static class763 field1961;

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1248(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IBLnaa;Lnaa;ZZI)I"
   )
   public static final int method1249(int arg0, byte arg1, class78 arg2, class78 arg3, boolean arg4, boolean arg5, int arg6) {
      try {
         if (arg1 != -8) {
            method1248(-112);
         }

         ++field1951;
         int var7 = class412.method3123(arg3, (byte)-119, arg2, arg5, arg6);
         if (var7 != 0) {
            return !arg5 ? var7 : -var7;
         } else if (arg0 == -1) {
            return 0;
         } else {
            int var8 = class412.method3123(arg3, (byte)-120, arg2, arg4, arg0);
            return !arg4 ? var8 : -var8;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1965[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1965[0] : field1965[1]) + ',' + (arg3 != null ? field1965[0] : field1965[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1250(int arg0) {
      try {
         field1956 = null;
         field1961 = null;
         if (arg0 > -7) {
            method1250(89);
         }

         field1962 = null;
         field1959 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1965[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         ++field1953;
         this.field1963 = arg0.method4302(true);
         this.field1952 = arg0.method4302(true);
         this.field1957 = arg0.method4288((byte)91);
         if (arg1 > -19) {
            method1250(21);
         }

         this.field1964 = arg0.method4288((byte)65);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1965[4] + (arg0 != null ? field1965[0] : field1965[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Leb;ZII)V"
   )
   public static final void method1251(class657 arg0, boolean arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         if (!arg1) {
            field1954 = 101;
         }

         label126: {
            if (~arg0.field9336 != -1) {
               if (arg0.field9336 == 1) {
                  arg0.field9380 = (-arg0.field9360 + arg2) / 2 + arg0.field9273;
                  if (!var4) {
                     break label126;
                  }
               }

               if (~arg0.field9336 == -3) {
                  arg0.field9380 = -arg0.field9360 + -arg0.field9273 + arg2;
                  if (!var4) {
                     break label126;
                  }
               }

               if (arg0.field9336 != 3) {
                  if (arg0.field9336 != 4) {
                     arg0.field9380 = -(arg0.field9273 * arg2 >> 14) + -arg0.field9360 + arg2;
                     if (!var4) {
                        break label126;
                     }
                  }

                  arg0.field9380 = (arg0.field9273 * arg2 >> 14) + (arg2 - arg0.field9360) / 2;
                  if (!var4) {
                     break label126;
                  }
               }

               arg0.field9380 = arg0.field9273 * arg2 >> 14;
               if (!var4) {
                  break label126;
               }
            }

            arg0.field9380 = arg0.field9273;
         }

         label133: {
            if (arg0.field9299 == 0) {
               arg0.field9256 = arg0.field9276;
               if (!var4) {
                  break label133;
               }
            }

            if (arg0.field9299 == 1) {
               arg0.field9256 = (-arg0.field9379 + arg3) / 2 + arg0.field9276;
               if (!var4) {
                  break label133;
               }
            }

            if (~arg0.field9299 != -3) {
               if (~arg0.field9299 == -4) {
                  arg0.field9256 = arg0.field9276 * arg3 >> 14;
                  if (!var4) {
                     break label133;
                  }
               }

               if (arg0.field9299 != 4) {
                  arg0.field9256 = -arg0.field9379 + arg3 + -(arg0.field9276 * arg3 >> 14);
                  if (!var4) {
                     break label133;
                  }
               }

               arg0.field9256 = (arg0.field9276 * arg3 >> 14) + (-arg0.field9379 + arg3) / 2;
               if (!var4) {
                  break label133;
               }
            }

            arg0.field9256 = arg3 - arg0.field9379 + -arg0.field9276;
         }

         ++field1955;
         if (class92.field1233) {
            if (~client.method2396(arg0).field5875 != -1 || ~arg0.field9372 == -1) {
               label84: {
                  if (arg0.field9256 < 0) {
                     arg0.field9256 = 0;
                     if (!var4) {
                        break label84;
                     }
                  }

                  if (arg0.field9379 + arg0.field9256 > arg3) {
                     arg0.field9256 = arg3 - arg0.field9379;
                  }
               }

               if (arg0.field9380 >= 0) {
                  if (~(arg0.field9380 - -arg0.field9360) < ~arg2) {
                     arg0.field9380 = -arg0.field9360 + arg2;
                     return;
                  }
               } else {
                  arg0.field9380 = 0;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1965[6] + (arg0 != null ? field1965[0] : field1965[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         arg1.method1177(this.field1964, this.field1963, this.field1957, this.field1952, true);
         if (!arg0) {
            ++field1958;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1965[2] + arg0 + ',' + (arg1 != null ? field1965[0] : field1965[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1252(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1253(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
