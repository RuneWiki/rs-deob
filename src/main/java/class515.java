import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class515 {
   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7446 = new String[]{method3754(method3753("Zj\u007fN")), method3754(method3753("O1=\f\u0002")), method3754(method3753("U~=nW")), method3754(method3753("U~=iW")), method3754(method3753("U~=dW")), method3754(method3753("Pj~O\u0006")), method3754(method3753("U~=oW")), method3754(method3753("U~=eW")), method3754(method3753("U~=jW")), method3754(method3753("U~=gW")), method3754(method3753("U~=kW")), method3754(method3753("U~=hW"))};
   @OriginalMember(
      owner = "client!aa",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field7445 = new int[4096];
   @OriginalMember(
      owner = "client!aa",
      name = "c",
      descriptor = "I"
   )
   public static int field7435;
   @OriginalMember(
      owner = "client!aa",
      name = "j",
      descriptor = "I"
   )
   public static int field7436;
   @OriginalMember(
      owner = "client!aa",
      name = "k",
      descriptor = "I"
   )
   public static int field7438;
   @OriginalMember(
      owner = "client!aa",
      name = "i",
      descriptor = "I"
   )
   public static int field7439;
   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "I"
   )
   public static int field7440;
   @OriginalMember(
      owner = "client!aa",
      name = "d",
      descriptor = "I"
   )
   public static int field7441;
   @OriginalMember(
      owner = "client!aa",
      name = "g",
      descriptor = "I"
   )
   public static int field7442;
   @OriginalMember(
      owner = "client!aa",
      name = "f",
      descriptor = "I"
   )
   public static int field7443;
   @OriginalMember(
      owner = "client!aa",
      name = "e",
      descriptor = "Lkf;"
   )
   public static class266 field7437;
   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field7444;

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(Lnu;Ljava/lang/Object;I)V",
      line = 4
   )
   public static final void method3744(class619 arg0, Object arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field7441;
         if (arg0.field9132 != null) {
            int var4 = arg2;
            if (var3) {
               class661.method4825(arg2, 1L);
               var4 = arg2 + 1;
            }

            Object var10000;
            boolean var10001;
            while(true) {
               if (~var4 <= -51) {
                  try {
                     var10000 = arg1;
                     break;
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }
               }

               var10000 = arg0.field9132.peekEvent();
               if (var3) {
                  break;
               }

               if (var10000 == null) {
                  try {
                     var10000 = arg1;
                     break;
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }
               }

               class661.method4825(arg2, 1L);
               ++var4;
            }

            try {
               if (var10000 != null) {
                  arg0.field9132.postEvent(new ActionEvent(arg1, 1001, field7446[5]));
               }
            } catch (Exception var6) {
               var10001 = false;
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field7446[4] + (arg0 != null ? field7446[1] : field7446[0]) + ',' + (arg1 != null ? field7446[1] : field7446[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(I[Ljava/lang/Object;II[I)V",
      line = 32
   )
   public static final void method3745(int param0, Object[] param1, int param2, int param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(IB[SI[Ljava/lang/String;)V",
      line = 88
   )
   public static final void method3746(int param0, byte param1, short[] param2, int param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "(I)[Lkt;",
      line = 142
   )
   public static final class169[] method3747(int arg0) {
      try {
         ++field7439;
         return arg0 != -30483 ? null : new class169[]{class713.field10396, class136.field1730, class254.field3461};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7446[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(Lcl;I)V",
      line = 153
   )
   public static final void method3748(class279 arg0, int arg1) {
      try {
         ++field7443;
         int var2 = -class96.field1234 + arg0.field3795;
         int var3 = arg0.field3873 * 512 + 256 * arg0.method972(-1);
         int var4 = arg0.field3835 * 512 - -(arg0.method972(arg1 + 3) * 256);
         arg0.field10694 += (-arg0.field10694 + var3) / var2;
         arg0.field3887 = 0;
         arg0.field10693 += (-arg0.field10693 + var4) / var2;
         if (~arg0.field3848 == -1) {
            arg0.method2114(-12281, 8192);
         }

         if (~arg0.field3848 == -2) {
            arg0.method2114(-12281, 12288);
         }

         if (~arg0.field3848 == -3) {
            arg0.method2114(-12281, 0);
         }

         if (~arg0.field3848 == arg1) {
            arg0.method2114(-12281, 4096);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7446[3] + (arg0 != null ? field7446[1] : field7446[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(ZZLmm;)V",
      line = 186
   )
   public static final void method3749(boolean arg0, boolean arg1, class294 arg2) {
      boolean var3 = client.field4360;

      try {
         if (!arg1) {
            method3750(26, -4, true);
         }

         ++field7442;
         if (arg2.field4060) {
            if (~arg2.field4048 > -1 || class503.method3651(arg2.field4058, arg2.field4048, -83)) {
               label72: {
                  if (!arg0) {
                     class357.method2662(arg2.field4051, -1, arg2.field4049, arg2.field4058, arg2.field4048, arg2.field4056, arg2.field4052, arg2.field4050, -115);
                     if (!var3) {
                        break label72;
                     }
                  }

                  class773.method5585(arg2.field4051, arg2.field4052, arg2.field4049, arg2.field4056, 127, (class39)null);
               }

               arg2.method3165(125);
            }

         } else {
            if (arg2.field4054 && ~arg2.field4051 <= -2 && arg2.field4056 >= 1 && ~(class644.field9403 + -2) <= ~arg2.field4051 && ~arg2.field4056 >= ~(class337.field4594 + -2)) {
               if (~arg2.field4044 <= -1 && !class503.method3651(arg2.field4057, arg2.field4044, 52)) {
                  return;
               }

               label92: {
                  if (arg0) {
                     class773.method5585(arg2.field4051, arg2.field4052, arg2.field4049, arg2.field4056, 127, arg2.field4059);
                     if (!var3) {
                        break label92;
                     }
                  }

                  class357.method2662(arg2.field4051, -1, arg2.field4049, arg2.field4057, arg2.field4044, arg2.field4056, arg2.field4052, arg2.field4053, -100);
               }

               arg2.field4054 = false;
               if (!arg0 && arg2.field4048 == arg2.field4044 && ~arg2.field4048 == 0) {
                  arg2.method3165(122);
                  return;
               }

               if (!arg0 && arg2.field4048 == arg2.field4044 && arg2.field4053 == arg2.field4050 && arg2.field4058 == arg2.field4057) {
                  arg2.method3165(108);
                  return;
               }
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7446[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7446[1] : field7446[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(IIZ)V",
      line = 243
   )
   public static final void method3750(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            field7437 = null;
         }

         ++field7436;
         if (class635.method4596(arg0, 28505)) {
            class451.method3292(arg1, -90, class547.field7851[arg0]);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7446[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(II)V",
      line = 260
   )
   public static final void method3751(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         label54: {
            if (~arg0 == -38) {
               class650.field9497 = 3.0F;
               if (!var2) {
                  break label54;
               }
            }

            if (arg0 == 50) {
               class650.field9497 = 4.0F;
               if (!var2) {
                  break label54;
               }
            }

            if (~arg0 == -76) {
               class650.field9497 = 6.0F;
               if (!var2) {
                  break label54;
               }
            }

            if (~arg0 != -101) {
               if (~arg0 != -201) {
                  break label54;
               }

               class650.field9497 = 16.0F;
               if (!var2) {
                  break label54;
               }
            }

            class650.field9497 = 8.0F;
         }

         if (arg1 == 2) {
            ++field7440;
            class74.field908 = -1;
            class74.field908 = -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7446[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(I)V",
      line = 292
   )
   public static void method3752(int arg0) {
      try {
         if (arg0 != 8192) {
            method3744((class619)null, (Object)null, -108);
         }

         field7437 = null;
         field7444 = null;
         field7445 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7446[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3753(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3754(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
