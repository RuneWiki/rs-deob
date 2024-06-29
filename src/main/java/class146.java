import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class146 {
   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "Z"
   )
   public boolean field1930 = false;
   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1934 = new String[]{method1240(method1239("p{\u00042e")), method1240(method1239("e Fp")), method1240(method1239("}'\u0004X0")), method1240(method1239("}'\u0004Z0")), method1240(method1239("}'\u0004_0")), method1240(method1239("}'\u0004Y0")), method1240(method1239("}'\u0004]0")), method1240(method1239("}'\u0004^0"))};
   @OriginalMember(
      owner = "client!vr",
      name = "d",
      descriptor = "Ldg;"
   )
   public static class436 field1928 = new class436(method1240(method1239("\\\u0001{]")), method1240(method1239("d3Lu{n")), method1240(method1239("T$K")), 2);
   @OriginalMember(
      owner = "client!vr",
      name = "g",
      descriptor = "I"
   )
   public int field1924;
   @OriginalMember(
      owner = "client!vr",
      name = "c",
      descriptor = "I"
   )
   public static int field1926;
   @OriginalMember(
      owner = "client!vr",
      name = "f",
      descriptor = "I"
   )
   public static int field1927;
   @OriginalMember(
      owner = "client!vr",
      name = "b",
      descriptor = "I"
   )
   public static int field1929;
   @OriginalMember(
      owner = "client!vr",
      name = "j",
      descriptor = "I"
   )
   public int field1931;
   @OriginalMember(
      owner = "client!vr",
      name = "i",
      descriptor = "I"
   )
   public static int field1932;
   @OriginalMember(
      owner = "client!vr",
      name = "e",
      descriptor = "I"
   )
   public static int field1933;
   @OriginalMember(
      owner = "client!vr",
      name = "h",
      descriptor = "Lmu;"
   )
   public class318 field1925;

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method1233(byte arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         if (class737.field10749 == null) {
            class737.field10749 = new byte[4][class507.field7030][class215.field2667];
         }

         ++field1926;
         int var3 = arg1;
         if (var2 || arg1 < 4) {
            do {
               int var4 = 0;
               if (var2 || var4 < class507.field7030) {
                  do {
                     int var5 = 0;
                     if (var2) {
                        class737.field10749[var3][var4][var5] = arg0;
                        ++var5;
                     }

                     while(true) {
                        while(var5 < class215.field2667) {
                           class737.field10749[var3][var4][var5] = arg0;
                           ++var5;
                        }

                        if (!var2) {
                           ++var4;
                           break;
                        }

                        ++var5;
                     }
                  } while(var4 < class507.field7030);
               }

               ++var3;
            } while(var3 < 4);

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1934[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(ILha;IZ)Lbo;"
   )
   public final class763 method1234(int arg0, class65 arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4273;

      try {
         ++field1932;
         long var6 = (long)(arg1.field740 << 19 | arg2 << 16 | this.field1924 | (!arg3 ? 0 : 262144));
         class763 var8 = (class763)this.field1925.field4251.method4239(var6, 0);
         if (var8 != null) {
            return var8;
         } else if (!this.field1925.field4239.method717(this.field1924, (byte)-58)) {
            return null;
         } else {
            class267 var9 = class267.method2050(this.field1925.field4239, this.field1924, arg0);
            if (var9 != null) {
               var9.field3470 = var9.field3465 = var9.field3471 = var9.field3466 = 0;
               if (arg3) {
                  var9.method2051();
               }

               int var10 = 0;
               if (var5) {
                  var9.method2052();
                  ++var10;
               }

               while(var10 < arg2) {
                  var9.method2052();
                  ++var10;
               }
            }

            class763 var11 = arg1.method549(var9, true);
            if (var11 != null) {
               this.field1925.field4251.method4238(122, var11, var6);
            }

            return var11;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field1934[4] + arg0 + ',' + (arg1 != null ? field1934[0] : field1934[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1235(int arg0) {
      try {
         if (arg0 != -1333) {
            field1928 = null;
         }

         field1928 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1934[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(ILwm;Z)V"
   )
   private final void method1236(int arg0, class594 arg1, boolean arg2) {
      try {
         if (arg2) {
            this.field1930 = false;
         }

         ++field1927;
         if (arg0 != 1) {
            if (arg0 != 2) {
               if (arg0 != 3) {
                  if (~arg0 == -5) {
                     this.field1924 = -1;
                     return;
                  }
               } else {
                  this.field1930 = true;
               }

            } else {
               this.field1931 = arg1.method4293(67);
            }
         } else {
            this.field1924 = arg1.method4280(-19104);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1934[2] + arg0 + ',' + (arg1 != null ? field1934[0] : field1934[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public final void method1237(class594 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         label39: {
            class146 var10000;
            int var10001;
            while(true) {
               int var4 = arg0.method4288((byte)66);
               if (~var4 != -1) {
                  var10000 = this;
                  var10001 = var4;
                  if (var3) {
                     break;
                  }

                  this.method1236(var4, arg0, !arg1);
                  if (!var3) {
                     continue;
                  }
               }

               if (arg1) {
                  break label39;
               }

               var10000 = this;
               var10001 = 81;
               break;
            }

            var10000.field1924 = var10001;
         }

         ++field1929;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1934[5] + (arg0 != null ? field1934[0] : field1934[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1238(boolean arg0) {
      try {
         ++field1933;
         return arg0 ? false : this.field1925.field4239.method717(this.field1924, (byte)-58);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1934[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1239(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1240(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
