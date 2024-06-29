import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class257 implements class261 {
   @OriginalMember(
      owner = "client!uha",
      name = "g",
      descriptor = "Lih;"
   )
   public class730 field3488;
   @OriginalMember(
      owner = "client!uha",
      name = "c",
      descriptor = "Lkf;"
   )
   private class266 field3489;
   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3493 = new String[]{method1965(method1964("{;<n\u0005&")), method1965(method1964("{;<n\u0000&")), method1965(method1964("u}sn9")), method1965(method1964("`&1,")), method1965(method1964("{;<n\u0007&")), method1965(method1964("{;<nxg=44z&")), method1965(method1964("{;<n\u0006&")), method1965(method1964("{;<n\f&"))};
   @OriginalMember(
      owner = "client!uha",
      name = "d",
      descriptor = "I"
   )
   public static int field3490 = 0;
   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field3487 = false;
   @OriginalMember(
      owner = "client!uha",
      name = "i",
      descriptor = "I"
   )
   public static int field3483;
   @OriginalMember(
      owner = "client!uha",
      name = "f",
      descriptor = "I"
   )
   public static int field3484;
   @OriginalMember(
      owner = "client!uha",
      name = "e",
      descriptor = "I"
   )
   public static int field3486;
   @OriginalMember(
      owner = "client!uha",
      name = "j",
      descriptor = "I"
   )
   public static int field3491;
   @OriginalMember(
      owner = "client!uha",
      name = "h",
      descriptor = "I"
   )
   public static int field3492;
   @OriginalMember(
      owner = "client!uha",
      name = "b",
      descriptor = "Lbg;"
   )
   public class492 field3485;

   @OriginalMember(
      owner = "client!uha",
      name = "b",
      descriptor = "(I)Z",
      line = 4
   )
   public final boolean method860(int arg0) {
      try {
         if (arg0 != 9201) {
            method1962(111, 49);
         }

         ++field3491;
         return this.field3489.method2051(this.field3488.field10683, (byte)60);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3493[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(BZ)V",
      line = 22
   )
   public void method861(byte arg0, boolean arg1) {
      try {
         int var3 = -94 % ((-31 - arg0) / 44);
         if (arg1) {
            int var4 = this.field3488.field10685.method1384(this.field3485.method960(), (byte)-126, class87.field1142) - -this.field3488.field10688;
            int var5 = this.field3488.field10684.method1414(this.field3485.method957(), -43, class60.field743) + this.field3488.field10689;
            this.field3485.method3575(var4, var5);
         }

         ++field3486;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3493[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(II)V",
      line = 42
   )
   public static final void method1962(int arg0, int arg1) {
      try {
         ++field3484;
         class755 var2 = class317.method2325((long)arg0, 113, arg1);
         var2.method5481(arg1 ^ -113);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3493[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "<init>",
      descriptor = "(Lkf;Lih;)V",
      line = 52
   )
   public class257(class266 arg0, class730 arg1) {
      try {
         this.field3488 = arg1;
         this.field3489 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3493[5] + (arg0 != null ? field3493[2] : field3493[3]) + ',' + (arg1 != null ? field3493[2] : field3493[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(I)V",
      line = 61
   )
   public final void method862(int arg0) {
      try {
         ++field3483;
         this.field3485 = class506.method3671((byte)46, this.field3488.field10683, this.field3489);
         if (arg0 != -23681) {
            method1963(73, -37, (byte[])null, (byte)-106, -72, 14, 106);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3493[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(II[BBIII)Z",
      line = 75
   )
   public static final boolean method1963(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         ++field3492;
         int var8 = arg0 % arg5;
         if (arg3 <= 79) {
            return true;
         } else {
            int var9;
            label46: {
               if (~var8 != -1) {
                  var9 = -var8 + arg5;
                  if (!var7) {
                     break label46;
                  }
               }

               var9 = 0;
            }

            int var10 = -((arg1 + arg5 + -1) / arg5);
            int var11 = -((arg0 + arg5 - 1) / arg5);
            int var12 = var10;
            int var10000;
            if (var7) {
               var10000 = var11;
            } else if (var10 >= 0) {
               var10000 = 0;
               if (!var7) {
                  return false;
               }
            } else {
               var10000 = var11;
            }

            while(true) {
               int var13 = var10000;
               if (var7) {
                  if (arg2[arg4] == 0) {
                     return true;
                  }

                  arg4 += arg5;
                  ++var13;
               }

               while(true) {
                  while(var13 < 0) {
                     if (arg2[arg4] == 0) {
                        return true;
                     }

                     arg4 += arg5;
                     ++var13;
                  }

                  arg4 -= var9;
                  var10000 = ~arg2[arg4 - 1];
                  if (!var7) {
                     if (var10000 == -1) {
                        return true;
                     }

                     arg4 += arg6;
                     ++var12;
                     if (var12 >= 0) {
                        var10000 = 0;
                        if (!var7) {
                           return false;
                        }
                     } else {
                        var10000 = var11;
                     }
                     break;
                  }

                  arg4 = var10000 + -1;
                  ++var13;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field3493[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3493[2] : field3493[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1964(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1965(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
